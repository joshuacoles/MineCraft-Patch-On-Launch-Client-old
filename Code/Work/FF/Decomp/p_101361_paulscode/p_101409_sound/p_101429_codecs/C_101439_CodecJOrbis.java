package p_101361_paulscode.p_101409_sound.p_101429_codecs;

import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101377_Comment;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101404_StreamState;
import com.jcraft.p_101362_jogg.C_101405_Page;
import com.jcraft.p_101362_jogg.C_101406_Packet;
import com.jcraft.p_101362_jogg.C_101407_SyncState;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;

public class C_101439_CodecJOrbis implements C_101412_ICodec {

   private static final boolean field_102490_GET = false;
   private static final boolean field_102478_SET = true;
   private static final boolean field_102489_XXX = false;
   protected URL field_102488_url;
   protected URLConnection field_102480_urlConnection = null;
   private InputStream field_102479_inputStream;
   private AudioFormat field_102475_audioFormat;
   private boolean field_102486_endOfStream = false;
   private boolean field_102472_initialized = false;
   private byte[] field_102477_buffer = null;
   private int field_102476_bufferSize;
   private int field_102468_count = 0;
   private int field_102485_index = 0;
   private int field_102473_convertedBufferSize;
   private byte[] field_102492_convertedBuffer = null;
   private float[][][] field_102491_pcmInfo;
   private int[] field_102483_pcmIndex;
   private C_101406_Packet field_102474_joggPacket = new C_101406_Packet();
   private C_101405_Page field_102493_joggPage = new C_101405_Page();
   private C_101404_StreamState field_102487_joggStreamState = new C_101404_StreamState();
   private C_101407_SyncState field_102470_joggSyncState = new C_101407_SyncState();
   private C_101372_DspState field_102469_jorbisDspState = new C_101372_DspState();
   private C_101375_Block field_102471_jorbisBlock;
   private C_101377_Comment field_102481_jorbisComment;
   private C_101390_Info field_102484_jorbisInfo;
   private C_101420_SoundSystemLogger field_102482_logger;


   public C_101439_CodecJOrbis() {
      this.field_102471_jorbisBlock = new C_101375_Block(this.field_102469_jorbisDspState);
      this.field_102481_jorbisComment = new C_101377_Comment();
      this.field_102484_jorbisInfo = new C_101390_Info();
      this.field_102482_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   }

   public void func_102436_reverseByteOrder(boolean var1) {}

   public boolean func_102439_initialize(URL var1) {
      this.func_102458_initialized(true, false);
      if(this.field_102487_joggStreamState != null) {
         this.field_102487_joggStreamState.func_102001_clear();
      }

      if(this.field_102471_jorbisBlock != null) {
         this.field_102471_jorbisBlock.func_101715_clear();
      }

      if(this.field_102469_jorbisDspState != null) {
         this.field_102469_jorbisDspState.func_101551_clear();
      }

      if(this.field_102484_jorbisInfo != null) {
         this.field_102484_jorbisInfo.func_101956_clear();
      }

      if(this.field_102470_joggSyncState != null) {
         this.field_102470_joggSyncState.func_102061_clear();
      }

      if(this.field_102479_inputStream != null) {
         try {
            this.field_102479_inputStream.close();
         } catch (IOException var7) {
            ;
         }
      }

      this.field_102488_url = var1;
      this.field_102476_bufferSize = 8192;
      this.field_102477_buffer = null;
      this.field_102468_count = 0;
      this.field_102485_index = 0;
      this.field_102487_joggStreamState = new C_101404_StreamState();
      this.field_102471_jorbisBlock = new C_101375_Block(this.field_102469_jorbisDspState);
      this.field_102469_jorbisDspState = new C_101372_DspState();
      this.field_102484_jorbisInfo = new C_101390_Info();
      this.field_102470_joggSyncState = new C_101407_SyncState();

      try {
         this.field_102480_urlConnection = var1.openConnection();
      } catch (UnknownServiceException var5) {
         this.func_102465_errorMessage("Unable to create a UrlConnection in method \'initialize\'.");
         this.func_102466_printStackTrace(var5);
         this.func_102437_cleanup();
         return false;
      } catch (IOException var6) {
         this.func_102465_errorMessage("Unable to create a UrlConnection in method \'initialize\'.");
         this.func_102466_printStackTrace(var6);
         this.func_102437_cleanup();
         return false;
      }

      if(this.field_102480_urlConnection != null) {
         try {
            this.field_102479_inputStream = this.func_102459_openInputStream();
         } catch (IOException var4) {
            this.func_102465_errorMessage("Unable to acquire inputstream in method \'initialize\'.");
            this.func_102466_printStackTrace(var4);
            this.func_102437_cleanup();
            return false;
         }
      }

      this.func_102463_endOfStream(true, false);
      this.field_102470_joggSyncState.func_102055_init();
      this.field_102470_joggSyncState.func_102056_buffer(this.field_102476_bufferSize);
      this.field_102477_buffer = this.field_102470_joggSyncState.field_102066_data;

      try {
         if(!this.func_102467_readHeader()) {
            this.func_102465_errorMessage("Error reading the header");
            return false;
         }
      } catch (IOException var8) {
         this.func_102465_errorMessage("Error reading the header");
         return false;
      }

      this.field_102473_convertedBufferSize = this.field_102476_bufferSize * 2;
      this.field_102469_jorbisDspState.func_101556_synthesis_init(this.field_102484_jorbisInfo);
      this.field_102471_jorbisBlock.func_101714_init(this.field_102469_jorbisDspState);
      int var2 = this.field_102484_jorbisInfo.field_101988_channels;
      int var3 = this.field_102484_jorbisInfo.field_101970_rate;
      this.field_102475_audioFormat = new AudioFormat((float)var3, 16, var2, true, false);
      this.field_102491_pcmInfo = new float[1][][];
      this.field_102483_pcmIndex = new int[this.field_102484_jorbisInfo.field_101988_channels];
      this.func_102458_initialized(true, true);
      return true;
   }

   protected InputStream func_102459_openInputStream() {
      return this.field_102480_urlConnection.getInputStream();
   }

   public boolean func_102442_initialized() {
      return this.func_102458_initialized(false, false);
   }

   public C_101422_SoundBuffer func_102441_read() {
      byte[] var1 = null;

      while(!this.func_102463_endOfStream(false, false) && (var1 == null || var1.length < C_101416_SoundSystemConfig.func_102566_getStreamingBufferSize())) {
         if(var1 == null) {
            var1 = this.func_102464_readBytes();
         } else {
            var1 = func_102460_appendByteArrays(var1, this.func_102464_readBytes());
         }
      }

      return var1 == null?null:new C_101422_SoundBuffer(var1, this.field_102475_audioFormat);
   }

   public C_101422_SoundBuffer func_102440_readAll() {
      byte[] var1 = null;

      while(!this.func_102463_endOfStream(false, false)) {
         if(var1 == null) {
            var1 = this.func_102464_readBytes();
         } else {
            var1 = func_102460_appendByteArrays(var1, this.func_102464_readBytes());
         }
      }

      if(var1 == null) {
         return null;
      } else {
         return new C_101422_SoundBuffer(var1, this.field_102475_audioFormat);
      }
   }

   public boolean func_102438_endOfStream() {
      return this.func_102463_endOfStream(false, false);
   }

   public void func_102437_cleanup() {
      this.field_102487_joggStreamState.func_102001_clear();
      this.field_102471_jorbisBlock.func_101715_clear();
      this.field_102469_jorbisDspState.func_101551_clear();
      this.field_102484_jorbisInfo.func_101956_clear();
      this.field_102470_joggSyncState.func_102061_clear();
      if(this.field_102479_inputStream != null) {
         try {
            this.field_102479_inputStream.close();
         } catch (IOException var2) {
            ;
         }
      }

      this.field_102487_joggStreamState = null;
      this.field_102471_jorbisBlock = null;
      this.field_102469_jorbisDspState = null;
      this.field_102484_jorbisInfo = null;
      this.field_102470_joggSyncState = null;
      this.field_102479_inputStream = null;
   }

   public AudioFormat func_102443_getAudioFormat() {
      return this.field_102475_audioFormat;
   }

   private boolean func_102467_readHeader() {
      this.field_102485_index = this.field_102470_joggSyncState.func_102056_buffer(this.field_102476_bufferSize);
      int var1 = this.field_102479_inputStream.read(this.field_102470_joggSyncState.field_102066_data, this.field_102485_index, this.field_102476_bufferSize);
      if(var1 < 0) {
         var1 = 0;
      }

      this.field_102470_joggSyncState.func_102060_wrote(var1);
      if(this.field_102470_joggSyncState.func_102058_pageout(this.field_102493_joggPage) != 1) {
         if(var1 < this.field_102476_bufferSize) {
            return true;
         } else {
            this.func_102465_errorMessage("Ogg header not recognized in method \'readHeader\'.");
            return false;
         }
      } else {
         this.field_102487_joggStreamState.func_102006_init(this.field_102493_joggPage.func_102033_serialno());
         this.field_102484_jorbisInfo.func_101954_init();
         this.field_102481_jorbisComment.func_101788_init();
         if(this.field_102487_joggStreamState.func_102009_pagein(this.field_102493_joggPage) < 0) {
            this.func_102465_errorMessage("Problem with first Ogg header page in method \'readHeader\'.");
            return false;
         } else if(this.field_102487_joggStreamState.func_102003_packetout(this.field_102474_joggPacket) != 1) {
            this.func_102465_errorMessage("Problem with first Ogg header packet in method \'readHeader\'.");
            return false;
         } else if(this.field_102484_jorbisInfo.func_101953_synthesis_headerin(this.field_102481_jorbisComment, this.field_102474_joggPacket) < 0) {
            this.func_102465_errorMessage("File does not contain Vorbis header in method \'readHeader\'.");
            return false;
         } else {
            int var2 = 0;

            while(var2 < 2) {
               label69:
               while(true) {
                  if(var2 < 2) {
                     int var3 = this.field_102470_joggSyncState.func_102058_pageout(this.field_102493_joggPage);
                     if(var3 != 0) {
                        if(var3 == 1) {
                           this.field_102487_joggStreamState.func_102009_pagein(this.field_102493_joggPage);

                           while(var2 < 2) {
                              var3 = this.field_102487_joggStreamState.func_102003_packetout(this.field_102474_joggPacket);
                              if(var3 == 0) {
                                 continue label69;
                              }

                              if(var3 == -1) {
                                 this.func_102465_errorMessage("Secondary Ogg header corrupt in method \'readHeader\'.");
                                 return false;
                              }

                              this.field_102484_jorbisInfo.func_101953_synthesis_headerin(this.field_102481_jorbisComment, this.field_102474_joggPacket);
                              ++var2;
                           }
                        }
                        continue;
                     }
                  }

                  this.field_102485_index = this.field_102470_joggSyncState.func_102056_buffer(this.field_102476_bufferSize);
                  var1 = this.field_102479_inputStream.read(this.field_102470_joggSyncState.field_102066_data, this.field_102485_index, this.field_102476_bufferSize);
                  if(var1 < 0) {
                     var1 = 0;
                  }

                  if(var1 == 0 && var2 < 2) {
                     this.func_102465_errorMessage("End of file reached before finished readingOgg header in method \'readHeader\'");
                     return false;
                  }

                  this.field_102470_joggSyncState.func_102060_wrote(var1);
                  break;
               }
            }

            this.field_102485_index = this.field_102470_joggSyncState.func_102056_buffer(this.field_102476_bufferSize);
            this.field_102477_buffer = this.field_102470_joggSyncState.field_102066_data;
            return true;
         }
      }
   }

   private byte[] func_102464_readBytes() {
      if(!this.func_102458_initialized(false, false)) {
         return null;
      } else if(this.func_102463_endOfStream(false, false)) {
         return null;
      } else {
         if(this.field_102492_convertedBuffer == null) {
            this.field_102492_convertedBuffer = new byte[this.field_102473_convertedBufferSize];
         }

         byte[] var1 = null;
         switch(this.field_102470_joggSyncState.func_102058_pageout(this.field_102493_joggPage)) {
         default:
            this.field_102487_joggStreamState.func_102009_pagein(this.field_102493_joggPage);
            if(this.field_102493_joggPage.func_102029_granulepos() == 0L) {
               this.func_102463_endOfStream(true, true);
               return null;
            } else {
               label91:
               while(true) {
                  switch(this.field_102487_joggStreamState.func_102003_packetout(this.field_102474_joggPacket)) {
                  case -1:
                     continue;
                  case 0:
                     if(this.field_102493_joggPage.func_102036_eos() != 0) {
                        this.func_102463_endOfStream(true, true);
                     }
                     break label91;
                  default:
                     if(this.field_102471_jorbisBlock.func_101713_synthesis(this.field_102474_joggPacket) == 0) {
                        this.field_102469_jorbisDspState.func_101553_synthesis_blockin(this.field_102471_jorbisBlock);
                     }
                  }

                  int var3;
                  while((var3 = this.field_102469_jorbisDspState.func_101554_synthesis_pcmout(this.field_102491_pcmInfo, this.field_102483_pcmIndex)) > 0) {
                     float[][] var2 = this.field_102491_pcmInfo[0];
                     int var4 = var3 < this.field_102473_convertedBufferSize?var3:this.field_102473_convertedBufferSize;

                     for(int var8 = 0; var8 < this.field_102484_jorbisInfo.field_101988_channels; ++var8) {
                        int var5 = var8 * 2;
                        int var6 = this.field_102483_pcmIndex[var8];

                        for(int var9 = 0; var9 < var4; ++var9) {
                           int var7 = (int)((double)var2[var8][var6 + var9] * 32767.0D);
                           if(var7 > 32767) {
                              var7 = 32767;
                           }

                           if(var7 < -32768) {
                              var7 = -32768;
                           }

                           if(var7 < 0) {
                              var7 |= '\u8000';
                           }

                           this.field_102492_convertedBuffer[var5] = (byte)var7;
                           this.field_102492_convertedBuffer[var5 + 1] = (byte)(var7 >>> 8);
                           var5 += 2 * this.field_102484_jorbisInfo.field_101988_channels;
                        }
                     }

                     this.field_102469_jorbisDspState.func_101552_synthesis_read(var4);
                     var1 = func_102461_appendByteArrays(var1, this.field_102492_convertedBuffer, 2 * this.field_102484_jorbisInfo.field_101988_channels * var4);
                  }
               }
            }
         case -1:
         case 0:
            if(!this.func_102463_endOfStream(false, false)) {
               this.field_102485_index = this.field_102470_joggSyncState.func_102056_buffer(this.field_102476_bufferSize);
               this.field_102477_buffer = this.field_102470_joggSyncState.field_102066_data;

               try {
                  this.field_102468_count = this.field_102479_inputStream.read(this.field_102477_buffer, this.field_102485_index, this.field_102476_bufferSize);
               } catch (Exception var11) {
                  this.func_102466_printStackTrace(var11);
                  return null;
               }

               if(this.field_102468_count == -1) {
                  return var1;
               }

               this.field_102470_joggSyncState.func_102060_wrote(this.field_102468_count);
               if(this.field_102468_count == 0) {
                  this.func_102463_endOfStream(true, true);
               }
            }

            return var1;
         }
      }
   }

   private synchronized boolean func_102458_initialized(boolean var1, boolean var2) {
      if(var1) {
         this.field_102472_initialized = var2;
      }

      return this.field_102472_initialized;
   }

   private synchronized boolean func_102463_endOfStream(boolean var1, boolean var2) {
      if(var1) {
         this.field_102486_endOfStream = var2;
      }

      return this.field_102486_endOfStream;
   }

   private static byte[] func_102462_trimArray(byte[] var0, int var1) {
      byte[] var2 = null;
      if(var0 != null && var0.length > var1) {
         var2 = new byte[var1];
         System.arraycopy(var0, 0, var2, 0, var1);
      }

      return var2;
   }

   private static byte[] func_102461_appendByteArrays(byte[] var0, byte[] var1, int var2) {
      int var4 = var2;
      if(var1 != null && var1.length != 0) {
         if(var1.length < var2) {
            var4 = var1.length;
         }
      } else {
         var4 = 0;
      }

      if(var0 == null && (var1 == null || var4 <= 0)) {
         return null;
      } else {
         byte[] var3;
         Object var6;
         if(var0 == null) {
            var3 = new byte[var4];
            System.arraycopy(var1, 0, var3, 0, var4);
            var6 = null;
         } else {
            Object var5;
            if(var1 != null && var4 > 0) {
               var3 = new byte[var0.length + var4];
               System.arraycopy(var0, 0, var3, 0, var0.length);
               System.arraycopy(var1, 0, var3, var0.length, var4);
               var5 = null;
               var6 = null;
            } else {
               var3 = new byte[var0.length];
               System.arraycopy(var0, 0, var3, 0, var0.length);
               var5 = null;
            }
         }

         return var3;
      }
   }

   private static byte[] func_102460_appendByteArrays(byte[] var0, byte[] var1) {
      if(var0 == null && var1 == null) {
         return null;
      } else {
         byte[] var2;
         Object var4;
         if(var0 == null) {
            var2 = new byte[var1.length];
            System.arraycopy(var1, 0, var2, 0, var1.length);
            var4 = null;
         } else {
            Object var3;
            if(var1 == null) {
               var2 = new byte[var0.length];
               System.arraycopy(var0, 0, var2, 0, var0.length);
               var3 = null;
            } else {
               var2 = new byte[var0.length + var1.length];
               System.arraycopy(var0, 0, var2, 0, var0.length);
               System.arraycopy(var1, 0, var2, var0.length, var1.length);
               var3 = null;
               var4 = null;
            }
         }

         return var2;
      }
   }

   private void func_102465_errorMessage(String var1) {
      this.field_102482_logger.func_102649_errorMessage("CodecJOrbis", var1, 0);
   }

   private void func_102466_printStackTrace(Exception var1) {
      this.field_102482_logger.func_102650_printStackTrace(var1, 1);
   }
}
