package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101419_ListenerData;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.C_101426_Library;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101430_LibraryLWJGLOpenAL$C_101436_Exception;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101433_ChannelLWJGLOpenAL;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101435_SourceLWJGLOpenAL;

public class C_101430_LibraryLWJGLOpenAL extends C_101426_Library {

   private static final boolean field_102249_GET = false;
   private static final boolean field_102248_SET = true;
   private static final boolean field_102247_XXX = false;
   private FloatBuffer field_102252_listenerPositionAL = null;
   private FloatBuffer field_102250_listenerOrientation = null;
   private FloatBuffer field_102246_listenerVelocity = null;
   private HashMap field_102251_ALBufferMap = null;
   private static boolean field_102245_alPitchSupported = true;


   public C_101430_LibraryLWJGLOpenAL() {
      this.field_102251_ALBufferMap = new HashMap();
      this.field_102198_reverseByteOrder = true;
   }

   public void func_102118_init() {
      boolean var1 = false;

      try {
         AL.create();
         var1 = this.func_102241_checkALError();
      } catch (LWJGLException var5) {
         this.func_102165_errorMessage("Unable to initialize OpenAL.  Probable cause: OpenAL not supported.");
         this.func_102152_printStackTrace(var5);
         throw new C_101430_LibraryLWJGLOpenAL$C_101436_Exception(var5.getMessage(), 101);
      }

      if(var1) {
         this.func_102125_importantMessage("OpenAL did not initialize properly!");
      } else {
         this.func_102123_message("OpenAL initialized.");
      }

      this.field_102252_listenerPositionAL = BufferUtils.createFloatBuffer(3).put(new float[]{this.field_102196_listener.field_102643_position.field_102507_x, this.field_102196_listener.field_102643_position.field_102506_y, this.field_102196_listener.field_102643_position.field_102505_z});
      this.field_102250_listenerOrientation = BufferUtils.createFloatBuffer(6).put(new float[]{this.field_102196_listener.field_102644_lookAt.field_102507_x, this.field_102196_listener.field_102644_lookAt.field_102506_y, this.field_102196_listener.field_102644_lookAt.field_102505_z, this.field_102196_listener.field_102647_up.field_102507_x, this.field_102196_listener.field_102647_up.field_102506_y, this.field_102196_listener.field_102647_up.field_102505_z});
      this.field_102246_listenerVelocity = BufferUtils.createFloatBuffer(3).put(new float[]{0.0F, 0.0F, 0.0F});
      this.field_102252_listenerPositionAL.flip();
      this.field_102250_listenerOrientation.flip();
      this.field_102246_listenerVelocity.flip();
      AL10.alListener(4100, this.field_102252_listenerPositionAL);
      var1 = this.func_102241_checkALError() || var1;
      AL10.alListener(4111, this.field_102250_listenerOrientation);
      var1 = this.func_102241_checkALError() || var1;
      AL10.alListener(4102, this.field_102246_listenerVelocity);
      var1 = this.func_102241_checkALError() || var1;
      AL10.alDopplerFactor(C_101416_SoundSystemConfig.func_102582_getDopplerFactor());
      var1 = this.func_102241_checkALError() || var1;
      AL10.alDopplerVelocity(C_101416_SoundSystemConfig.func_102563_getDopplerVelocity());
      var1 = this.func_102241_checkALError() || var1;
      if(var1) {
         this.func_102125_importantMessage("OpenAL did not initialize properly!");
         throw new C_101430_LibraryLWJGLOpenAL$C_101436_Exception("Problem encountered while loading OpenAL or creating the listener.  Probable cause:  OpenAL not supported", 101);
      } else {
         super.func_102118_init();
         C_101433_ChannelLWJGLOpenAL var2 = (C_101433_ChannelLWJGLOpenAL)this.field_102192_normalChannels.get(1);

         try {
            AL10.alSourcef(var2.field_102435_ALSource.get(0), 4099, 1.0F);
            if(this.func_102241_checkALError()) {
               func_102243_alPitchSupported(true, false);
               throw new C_101430_LibraryLWJGLOpenAL$C_101436_Exception("OpenAL: AL_PITCH not supported.", 108);
            } else {
               func_102243_alPitchSupported(true, true);
            }
         } catch (Exception var4) {
            func_102243_alPitchSupported(true, false);
            throw new C_101430_LibraryLWJGLOpenAL$C_101436_Exception("OpenAL: AL_PITCH not supported.", 108);
         }
      }
   }

   public static boolean func_102239_libraryCompatible() {
      if(AL.isCreated()) {
         return true;
      } else {
         try {
            AL.create();
         } catch (Exception var2) {
            return false;
         }

         try {
            AL.destroy();
         } catch (Exception var1) {
            ;
         }

         return true;
      }
   }

   protected C_101413_Channel func_102120_createChannel(int var1) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);

      try {
         AL10.alGenSources(var3);
      } catch (Exception var5) {
         AL10.alGetError();
         return null;
      }

      if(AL10.alGetError() != 0) {
         return null;
      } else {
         C_101433_ChannelLWJGLOpenAL var2 = new C_101433_ChannelLWJGLOpenAL(var1, var3);
         return var2;
      }
   }

   public void func_102138_cleanup() {
      super.func_102138_cleanup();
      Set var1 = this.field_102194_bufferMap.keySet();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         IntBuffer var4 = (IntBuffer)this.field_102251_ALBufferMap.get(var3);
         if(var4 != null) {
            AL10.alDeleteBuffers(var4);
            this.func_102241_checkALError();
            var4.clear();
         }
      }

      this.field_102194_bufferMap.clear();
      AL.destroy();
      this.field_102194_bufferMap = null;
      this.field_102252_listenerPositionAL = null;
      this.field_102250_listenerOrientation = null;
      this.field_102246_listenerVelocity = null;
   }

   public boolean func_102185_loadSound(C_101414_FilenameURL var1) {
      if(this.field_102194_bufferMap == null) {
         this.field_102194_bufferMap = new HashMap();
         this.func_102125_importantMessage("Buffer Map was null in method \'loadSound\'");
      }

      if(this.field_102251_ALBufferMap == null) {
         this.field_102251_ALBufferMap = new HashMap();
         this.func_102125_importantMessage("Open AL Buffer Map was null in method\'loadSound\'");
      }

      if(this.func_102160_errorCheck(var1 == null, "Filename/URL not specified in method \'loadSound\'")) {
         return false;
      } else if(this.field_102194_bufferMap.get(var1.func_102509_getFilename()) != null) {
         return true;
      } else {
         C_101412_ICodec var2 = C_101416_SoundSystemConfig.func_102578_getCodec(var1.func_102509_getFilename());
         if(this.func_102160_errorCheck(var2 == null, "No codec found for file \'" + var1.func_102509_getFilename() + "\' in method \'loadSound\'")) {
            return false;
         } else {
            var2.func_102436_reverseByteOrder(true);
            URL var3 = var1.func_102508_getURL();
            if(this.func_102160_errorCheck(var3 == null, "Unable to open file \'" + var1.func_102509_getFilename() + "\' in method \'loadSound\'")) {
               return false;
            } else {
               var2.func_102439_initialize(var3);
               C_101422_SoundBuffer var4 = var2.func_102440_readAll();
               var2.func_102437_cleanup();
               var2 = null;
               if(this.func_102160_errorCheck(var4 == null, "Sound buffer null in method \'loadSound\'")) {
                  return false;
               } else {
                  this.field_102194_bufferMap.put(var1.func_102509_getFilename(), var4);
                  AudioFormat var5 = var4.field_102657_audioFormat;
                  boolean var6 = false;
                  short var8;
                  if(var5.getChannels() == 1) {
                     if(var5.getSampleSizeInBits() == 8) {
                        var8 = 4352;
                     } else {
                        if(var5.getSampleSizeInBits() != 16) {
                           this.func_102165_errorMessage("Illegal sample size in method \'loadSound\'");
                           return false;
                        }

                        var8 = 4353;
                     }
                  } else {
                     if(var5.getChannels() != 2) {
                        this.func_102165_errorMessage("File neither mono nor stereo in method \'loadSound\'");
                        return false;
                     }

                     if(var5.getSampleSizeInBits() == 8) {
                        var8 = 4354;
                     } else {
                        if(var5.getSampleSizeInBits() != 16) {
                           this.func_102165_errorMessage("Illegal sample size in method \'loadSound\'");
                           return false;
                        }

                        var8 = 4355;
                     }
                  }

                  IntBuffer var7 = BufferUtils.createIntBuffer(1);
                  AL10.alGenBuffers(var7);
                  if(this.func_102160_errorCheck(AL10.alGetError() != 0, "alGenBuffers error when loading " + var1.func_102509_getFilename())) {
                     return false;
                  } else {
                     AL10.alBufferData(var7.get(0), var8, (ByteBuffer)BufferUtils.createByteBuffer(var4.field_102656_audioData.length).put(var4.field_102656_audioData).flip(), (int)var5.getSampleRate());
                     if(this.func_102160_errorCheck(AL10.alGetError() != 0, "alBufferData error when loading " + var1.func_102509_getFilename()) && this.func_102160_errorCheck(var7 == null, "Sound buffer was not created for " + var1.func_102509_getFilename())) {
                        return false;
                     } else {
                        this.field_102251_ALBufferMap.put(var1.func_102509_getFilename(), var7);
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   public boolean func_102155_loadSound(C_101422_SoundBuffer var1, String var2) {
      if(this.field_102194_bufferMap == null) {
         this.field_102194_bufferMap = new HashMap();
         this.func_102125_importantMessage("Buffer Map was null in method \'loadSound\'");
      }

      if(this.field_102251_ALBufferMap == null) {
         this.field_102251_ALBufferMap = new HashMap();
         this.func_102125_importantMessage("Open AL Buffer Map was null in method\'loadSound\'");
      }

      if(this.func_102160_errorCheck(var2 == null, "Identifier not specified in method \'loadSound\'")) {
         return false;
      } else if(this.field_102194_bufferMap.get(var2) != null) {
         return true;
      } else if(this.func_102160_errorCheck(var1 == null, "Sound buffer null in method \'loadSound\'")) {
         return false;
      } else {
         this.field_102194_bufferMap.put(var2, var1);
         AudioFormat var3 = var1.field_102657_audioFormat;
         boolean var4 = false;
         short var6;
         if(var3.getChannels() == 1) {
            if(var3.getSampleSizeInBits() == 8) {
               var6 = 4352;
            } else {
               if(var3.getSampleSizeInBits() != 16) {
                  this.func_102165_errorMessage("Illegal sample size in method \'loadSound\'");
                  return false;
               }

               var6 = 4353;
            }
         } else {
            if(var3.getChannels() != 2) {
               this.func_102165_errorMessage("File neither mono nor stereo in method \'loadSound\'");
               return false;
            }

            if(var3.getSampleSizeInBits() == 8) {
               var6 = 4354;
            } else {
               if(var3.getSampleSizeInBits() != 16) {
                  this.func_102165_errorMessage("Illegal sample size in method \'loadSound\'");
                  return false;
               }

               var6 = 4355;
            }
         }

         IntBuffer var5 = BufferUtils.createIntBuffer(1);
         AL10.alGenBuffers(var5);
         if(this.func_102160_errorCheck(AL10.alGetError() != 0, "alGenBuffers error when saving " + var2)) {
            return false;
         } else {
            AL10.alBufferData(var5.get(0), var6, (ByteBuffer)BufferUtils.createByteBuffer(var1.field_102656_audioData.length).put(var1.field_102656_audioData).flip(), (int)var3.getSampleRate());
            if(this.func_102160_errorCheck(AL10.alGetError() != 0, "alBufferData error when saving " + var2) && this.func_102160_errorCheck(var5 == null, "Sound buffer was not created for " + var2)) {
               return false;
            } else {
               this.field_102251_ALBufferMap.put(var2, var5);
               return true;
            }
         }
      }
   }

   public void func_102171_unloadSound(String var1) {
      this.field_102251_ALBufferMap.remove(var1);
      super.func_102171_unloadSound(var1);
   }

   public void func_102147_setMasterVolume(float var1) {
      super.func_102147_setMasterVolume(var1);
      AL10.alListenerf(4106, var1);
      this.func_102241_checkALError();
   }

   public void func_102124_newSource(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10) {
      IntBuffer var11 = null;
      if(!var2) {
         var11 = (IntBuffer)this.field_102251_ALBufferMap.get(var5.func_102509_getFilename());
         if(var11 == null && !this.func_102185_loadSound(var5)) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.func_102509_getFilename());
            return;
         }

         var11 = (IntBuffer)this.field_102251_ALBufferMap.get(var5.func_102509_getFilename());
         if(var11 == null) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because a sound buffer was not found for " + var5.func_102509_getFilename());
            return;
         }
      }

      C_101422_SoundBuffer var12 = null;
      if(!var2) {
         var12 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var12 == null && !this.func_102185_loadSound(var5)) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.func_102509_getFilename());
            return;
         }

         var12 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var12 == null) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.func_102509_getFilename());
            return;
         }
      }

      this.field_102197_sourceMap.put(var4, new C_101435_SourceLWJGLOpenAL(this.field_102252_listenerPositionAL, var11, var1, var2, var3, var4, var5, var12, var6, var7, var8, var9, var10, false));
   }

   public void func_102146_rawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.field_102197_sourceMap.put(var3, new C_101435_SourceLWJGLOpenAL(this.field_102252_listenerPositionAL, var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void func_102149_quickPlay(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10, boolean var11) {
      IntBuffer var12 = null;
      if(!var2) {
         var12 = (IntBuffer)this.field_102251_ALBufferMap.get(var5.func_102509_getFilename());
         if(var12 == null) {
            this.func_102185_loadSound(var5);
         }

         var12 = (IntBuffer)this.field_102251_ALBufferMap.get(var5.func_102509_getFilename());
         if(var12 == null) {
            this.func_102165_errorMessage("Sound buffer was not created for " + var5.func_102509_getFilename());
            return;
         }
      }

      C_101422_SoundBuffer var13 = null;
      if(!var2) {
         var13 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var13 == null && !this.func_102185_loadSound(var5)) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.func_102509_getFilename());
            return;
         }

         var13 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var13 == null) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.func_102509_getFilename());
            return;
         }
      }

      C_101435_SourceLWJGLOpenAL var14 = new C_101435_SourceLWJGLOpenAL(this.field_102252_listenerPositionAL, var12, var1, var2, var3, var4, var5, var13, var6, var7, var8, var9, var10, false);
      this.field_102197_sourceMap.put(var4, var14);
      this.func_102166_play(var14);
      if(var11) {
         var14.func_102287_setTemporary(true);
      }

   }

   public void func_102186_copySources(HashMap var1) {
      if(var1 != null) {
         Set var2 = var1.keySet();
         Iterator var3 = var2.iterator();
         if(this.field_102194_bufferMap == null) {
            this.field_102194_bufferMap = new HashMap();
            this.func_102125_importantMessage("Buffer Map was null in method \'copySources\'");
         }

         if(this.field_102251_ALBufferMap == null) {
            this.field_102251_ALBufferMap = new HashMap();
            this.func_102125_importantMessage("Open AL Buffer Map was null in method\'copySources\'");
         }

         this.field_102197_sourceMap.clear();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            C_101423_Source var5 = (C_101423_Source)var1.get(var4);
            if(var5 != null) {
               C_101422_SoundBuffer var6 = null;
               if(!var5.field_102335_toStream) {
                  this.func_102185_loadSound(var5.field_102347_filenameURL);
                  var6 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.field_102347_filenameURL.func_102509_getFilename());
               }

               if(var5.field_102335_toStream || var6 != null) {
                  this.field_102197_sourceMap.put(var4, new C_101435_SourceLWJGLOpenAL(this.field_102252_listenerPositionAL, (IntBuffer)this.field_102251_ALBufferMap.get(var5.field_102347_filenameURL.func_102509_getFilename()), var5, var6));
               }
            }
         }

      }
   }

   public void func_102139_setListenerPosition(float var1, float var2, float var3) {
      super.func_102139_setListenerPosition(var1, var2, var3);
      this.field_102252_listenerPositionAL.put(0, var1);
      this.field_102252_listenerPositionAL.put(1, var2);
      this.field_102252_listenerPositionAL.put(2, var3);
      AL10.alListener(4100, this.field_102252_listenerPositionAL);
      this.func_102241_checkALError();
   }

   public void func_102117_setListenerAngle(float var1) {
      super.func_102117_setListenerAngle(var1);
      this.field_102250_listenerOrientation.put(0, this.field_102196_listener.field_102644_lookAt.field_102507_x);
      this.field_102250_listenerOrientation.put(2, this.field_102196_listener.field_102644_lookAt.field_102505_z);
      AL10.alListener(4111, this.field_102250_listenerOrientation);
      this.func_102241_checkALError();
   }

   public void func_102177_setListenerOrientation(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.func_102177_setListenerOrientation(var1, var2, var3, var4, var5, var6);
      this.field_102250_listenerOrientation.put(0, var1);
      this.field_102250_listenerOrientation.put(1, var2);
      this.field_102250_listenerOrientation.put(2, var3);
      this.field_102250_listenerOrientation.put(3, var4);
      this.field_102250_listenerOrientation.put(4, var5);
      this.field_102250_listenerOrientation.put(5, var6);
      AL10.alListener(4111, this.field_102250_listenerOrientation);
      this.func_102241_checkALError();
   }

   public void func_102150_setListenerData(C_101419_ListenerData var1) {
      super.func_102150_setListenerData(var1);
      this.field_102252_listenerPositionAL.put(0, var1.field_102643_position.field_102507_x);
      this.field_102252_listenerPositionAL.put(1, var1.field_102643_position.field_102506_y);
      this.field_102252_listenerPositionAL.put(2, var1.field_102643_position.field_102505_z);
      AL10.alListener(4100, this.field_102252_listenerPositionAL);
      this.func_102241_checkALError();
      this.field_102250_listenerOrientation.put(0, var1.field_102644_lookAt.field_102507_x);
      this.field_102250_listenerOrientation.put(1, var1.field_102644_lookAt.field_102506_y);
      this.field_102250_listenerOrientation.put(2, var1.field_102644_lookAt.field_102505_z);
      this.field_102250_listenerOrientation.put(3, var1.field_102647_up.field_102507_x);
      this.field_102250_listenerOrientation.put(4, var1.field_102647_up.field_102506_y);
      this.field_102250_listenerOrientation.put(5, var1.field_102647_up.field_102505_z);
      AL10.alListener(4111, this.field_102250_listenerOrientation);
      this.func_102241_checkALError();
      this.field_102246_listenerVelocity.put(0, var1.field_102645_velocity.field_102507_x);
      this.field_102246_listenerVelocity.put(1, var1.field_102645_velocity.field_102506_y);
      this.field_102246_listenerVelocity.put(2, var1.field_102645_velocity.field_102505_z);
      AL10.alListener(4102, this.field_102246_listenerVelocity);
      this.func_102241_checkALError();
   }

   public void func_102161_setListenerVelocity(float var1, float var2, float var3) {
      super.func_102161_setListenerVelocity(var1, var2, var3);
      this.field_102246_listenerVelocity.put(0, this.field_102196_listener.field_102645_velocity.field_102507_x);
      this.field_102246_listenerVelocity.put(1, this.field_102196_listener.field_102645_velocity.field_102506_y);
      this.field_102246_listenerVelocity.put(2, this.field_102196_listener.field_102645_velocity.field_102505_z);
      AL10.alListener(4102, this.field_102246_listenerVelocity);
   }

   public void func_102156_dopplerChanged() {
      super.func_102156_dopplerChanged();
      AL10.alDopplerFactor(C_101416_SoundSystemConfig.func_102582_getDopplerFactor());
      this.func_102241_checkALError();
      AL10.alDopplerVelocity(C_101416_SoundSystemConfig.func_102563_getDopplerVelocity());
      this.func_102241_checkALError();
   }

   private boolean func_102241_checkALError() {
      switch(AL10.alGetError()) {
      case 0:
         return false;
      case '\ua001':
         this.func_102165_errorMessage("Invalid name parameter.");
         return true;
      case '\ua002':
         this.func_102165_errorMessage("Invalid parameter.");
         return true;
      case '\ua003':
         this.func_102165_errorMessage("Invalid enumerated parameter value.");
         return true;
      case '\ua004':
         this.func_102165_errorMessage("Illegal call.");
         return true;
      case '\ua005':
         this.func_102165_errorMessage("Unable to allocate memory.");
         return true;
      default:
         this.func_102165_errorMessage("An unrecognized error occurred.");
         return true;
      }
   }

   public static boolean func_102242_alPitchSupported() {
      return func_102243_alPitchSupported(false, false);
   }

   private static synchronized boolean func_102243_alPitchSupported(boolean var0, boolean var1) {
      if(var0) {
         field_102245_alPitchSupported = var1;
      }

      return field_102245_alPitchSupported;
   }

   public static String func_102244_getTitle() {
      return "LWJGL OpenAL";
   }

   public static String func_102240_getDescription() {
      return "The LWJGL binding of OpenAL.  For more information, see http://www.lwjgl.org";
   }

   public String func_102180_getClassName() {
      return "LibraryLWJGLOpenAL";
   }

}
