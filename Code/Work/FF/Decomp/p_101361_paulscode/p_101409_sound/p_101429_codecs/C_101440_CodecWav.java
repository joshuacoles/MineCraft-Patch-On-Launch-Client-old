package p_101361_paulscode.p_101409_sound.p_101429_codecs;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;

public class C_101440_CodecWav implements C_101412_ICodec {

   private static final boolean field_102453_GET = false;
   private static final boolean field_102452_SET = true;
   private static final boolean field_102451_XXX = false;
   private boolean field_102454_endOfStream = false;
   private boolean field_102456_initialized = false;
   private AudioInputStream field_102457_myAudioInputStream = null;
   private C_101420_SoundSystemLogger field_102455_logger = C_101416_SoundSystemConfig.func_102576_getLogger();


   public void func_102436_reverseByteOrder(boolean var1) {}

   public boolean func_102439_initialize(URL var1) {
      this.func_102444_initialized(true, false);
      this.func_102437_cleanup();
      if(var1 == null) {
         this.func_102448_errorMessage("url null in method \'initialize\'");
         this.func_102437_cleanup();
         return false;
      } else {
         try {
            this.field_102457_myAudioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(var1.openStream()));
         } catch (UnsupportedAudioFileException var3) {
            this.func_102448_errorMessage("Unsupported audio format in method \'initialize\'");
            this.func_102450_printStackTrace(var3);
            return false;
         } catch (IOException var4) {
            this.func_102448_errorMessage("Error setting up audio input stream in method \'initialize\'");
            this.func_102450_printStackTrace(var4);
            return false;
         }

         this.func_102447_endOfStream(true, false);
         this.func_102444_initialized(true, true);
         return true;
      }
   }

   public boolean func_102442_initialized() {
      return this.func_102444_initialized(false, false);
   }

   public C_101422_SoundBuffer func_102441_read() {
      if(this.field_102457_myAudioInputStream == null) {
         return null;
      } else {
         AudioFormat var1 = this.field_102457_myAudioInputStream.getFormat();
         if(var1 == null) {
            this.func_102448_errorMessage("Audio Format null in method \'read\'");
            return null;
         } else {
            int var2 = 0;
            boolean var3 = false;
            byte[] var4 = new byte[C_101416_SoundSystemConfig.func_102566_getStreamingBufferSize()];

            try {
               while(!this.func_102447_endOfStream(false, false) && var2 < var4.length) {
                  int var8;
                  if((var8 = this.field_102457_myAudioInputStream.read(var4, var2, var4.length - var2)) <= 0) {
                     this.func_102447_endOfStream(true, true);
                     break;
                  }

                  var2 += var8;
               }
            } catch (IOException var7) {
               this.func_102447_endOfStream(true, true);
               return null;
            }

            if(var2 <= 0) {
               return null;
            } else {
               if(var2 < var4.length) {
                  var4 = func_102445_trimArray(var4, var2);
               }

               byte[] var5 = func_102449_convertAudioBytes(var4, var1.getSampleSizeInBits() == 16);
               C_101422_SoundBuffer var6 = new C_101422_SoundBuffer(var5, var1);
               return var6;
            }
         }
      }
   }

   public C_101422_SoundBuffer func_102440_readAll() {
      if(this.field_102457_myAudioInputStream == null) {
         this.func_102448_errorMessage("Audio input stream null in method \'readAll\'");
         return null;
      } else {
         AudioFormat var1 = this.field_102457_myAudioInputStream.getFormat();
         if(var1 == null) {
            this.func_102448_errorMessage("Audio Format null in method \'readAll\'");
            return null;
         } else {
            byte[] var2 = null;
            int var3 = var1.getChannels() * (int)this.field_102457_myAudioInputStream.getFrameLength() * var1.getSampleSizeInBits() / 8;
            int var5;
            int var12;
            if(var3 > 0) {
               var2 = new byte[var1.getChannels() * (int)this.field_102457_myAudioInputStream.getFrameLength() * var1.getSampleSizeInBits() / 8];
               boolean var4 = false;
               var5 = 0;

               try {
                  while((var12 = this.field_102457_myAudioInputStream.read(var2, var5, var2.length - var5)) != -1 && var5 < var2.length) {
                     var5 += var12;
                  }
               } catch (IOException var11) {
                  this.func_102448_errorMessage("Exception thrown while reading from the AudioInputStream (location #1).");
                  this.func_102450_printStackTrace(var11);
                  return null;
               }
            } else {
               var12 = 0;
               boolean var14 = false;
               boolean var6 = false;
               Object var7 = null;

               for(byte[] var17 = new byte[C_101416_SoundSystemConfig.func_102585_getFileChunkSize()]; !this.func_102447_endOfStream(false, false) && var12 < C_101416_SoundSystemConfig.func_102554_getMaxFileSize(); var2 = func_102446_appendByteArrays(var2, var17, var5)) {
                  var5 = 0;
                  var6 = false;

                  try {
                     while(var5 < var17.length) {
                        int var16;
                        if((var16 = this.field_102457_myAudioInputStream.read(var17, var5, var17.length - var5)) <= 0) {
                           this.func_102447_endOfStream(true, true);
                           break;
                        }

                        var5 += var16;
                     }
                  } catch (IOException var10) {
                     this.func_102448_errorMessage("Exception thrown while reading from the AudioInputStream (location #2).");
                     this.func_102450_printStackTrace(var10);
                     return null;
                  }

                  var12 += var5;
               }
            }

            byte[] var13 = func_102449_convertAudioBytes(var2, var1.getSampleSizeInBits() == 16);
            C_101422_SoundBuffer var15 = new C_101422_SoundBuffer(var13, var1);

            try {
               this.field_102457_myAudioInputStream.close();
            } catch (IOException var9) {
               ;
            }

            return var15;
         }
      }
   }

   public boolean func_102438_endOfStream() {
      return this.func_102447_endOfStream(false, false);
   }

   public void func_102437_cleanup() {
      if(this.field_102457_myAudioInputStream != null) {
         try {
            this.field_102457_myAudioInputStream.close();
         } catch (Exception var2) {
            ;
         }
      }

      this.field_102457_myAudioInputStream = null;
   }

   public AudioFormat func_102443_getAudioFormat() {
      return this.field_102457_myAudioInputStream == null?null:this.field_102457_myAudioInputStream.getFormat();
   }

   private synchronized boolean func_102444_initialized(boolean var1, boolean var2) {
      if(var1) {
         this.field_102456_initialized = var2;
      }

      return this.field_102456_initialized;
   }

   private synchronized boolean func_102447_endOfStream(boolean var1, boolean var2) {
      if(var1) {
         this.field_102454_endOfStream = var2;
      }

      return this.field_102454_endOfStream;
   }

   private static byte[] func_102445_trimArray(byte[] var0, int var1) {
      byte[] var2 = null;
      if(var0 != null && var0.length > var1) {
         var2 = new byte[var1];
         System.arraycopy(var0, 0, var2, 0, var1);
      }

      return var2;
   }

   private static byte[] func_102449_convertAudioBytes(byte[] var0, boolean var1) {
      ByteBuffer var2 = ByteBuffer.allocateDirect(var0.length);
      var2.order(ByteOrder.nativeOrder());
      ByteBuffer var3 = ByteBuffer.wrap(var0);
      var3.order(ByteOrder.LITTLE_ENDIAN);
      if(var1) {
         ShortBuffer var4 = var2.asShortBuffer();
         ShortBuffer var5 = var3.asShortBuffer();

         while(var5.hasRemaining()) {
            var4.put(var5.get());
         }
      } else {
         while(var3.hasRemaining()) {
            var2.put(var3.get());
         }
      }

      var2.rewind();
      if(!var2.hasArray()) {
         byte[] var6 = new byte[var2.capacity()];
         var2.get(var6);
         var2.clear();
         return var6;
      } else {
         return var2.array();
      }
   }

   private static byte[] func_102446_appendByteArrays(byte[] var0, byte[] var1, int var2) {
      if(var0 == null && var1 == null) {
         return null;
      } else {
         byte[] var3;
         Object var5;
         if(var0 == null) {
            var3 = new byte[var2];
            System.arraycopy(var1, 0, var3, 0, var2);
            var5 = null;
         } else {
            Object var4;
            if(var1 == null) {
               var3 = new byte[var0.length];
               System.arraycopy(var0, 0, var3, 0, var0.length);
               var4 = null;
            } else {
               var3 = new byte[var0.length + var2];
               System.arraycopy(var0, 0, var3, 0, var0.length);
               System.arraycopy(var1, 0, var3, var0.length, var2);
               var4 = null;
               var5 = null;
            }
         }

         return var3;
      }
   }

   private void func_102448_errorMessage(String var1) {
      this.field_102455_logger.func_102649_errorMessage("CodecWav", var1, 0);
   }

   private void func_102450_printStackTrace(Exception var1) {
      this.field_102455_logger.func_102650_printStackTrace(var1, 1);
   }
}
