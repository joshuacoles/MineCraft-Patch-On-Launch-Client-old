package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101430_LibraryLWJGLOpenAL;

public class C_101433_ChannelLWJGLOpenAL extends C_101413_Channel {

   public IntBuffer field_102435_ALSource;
   public int field_102433_ALformat;
   public int field_102432_sampleRate;
   public float field_102434_millisPreviouslyPlayed = 0.0F;


   public C_101433_ChannelLWJGLOpenAL(int var1, IntBuffer var2) {
      super(var1);
      this.field_102405_libraryType = C_101430_LibraryLWJGLOpenAL.class;
      this.field_102435_ALSource = var2;
   }

   public void func_102384_cleanup() {
      if(this.field_102435_ALSource != null) {
         try {
            AL10.alSourceStop(this.field_102435_ALSource);
            AL10.alGetError();
         } catch (Exception var3) {
            ;
         }

         try {
            AL10.alDeleteSources(this.field_102435_ALSource);
            AL10.alGetError();
         } catch (Exception var2) {
            ;
         }

         this.field_102435_ALSource.clear();
      }

      this.field_102435_ALSource = null;
      super.func_102384_cleanup();
   }

   public boolean func_102430_attachBuffer(IntBuffer var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 0, "Sound buffers may only be attached to normal sources.")) {
         return false;
      } else {
         AL10.alSourcei(this.field_102435_ALSource.get(0), 4105, var1.get(0));
         if(this.field_102406_attachedSource != null && this.field_102406_attachedSource.field_102362_soundBuffer != null && this.field_102406_attachedSource.field_102362_soundBuffer.field_102657_audioFormat != null) {
            this.func_102382_setAudioFormat(this.field_102406_attachedSource.field_102362_soundBuffer.field_102657_audioFormat);
         }

         return this.func_102429_checkALError();
      }
   }

   public void func_102382_setAudioFormat(AudioFormat var1) {
      boolean var2 = false;
      short var3;
      if(var1.getChannels() == 1) {
         if(var1.getSampleSizeInBits() == 8) {
            var3 = 4352;
         } else {
            if(var1.getSampleSizeInBits() != 16) {
               this.func_102397_errorMessage("Illegal sample size in method \'setAudioFormat\'");
               return;
            }

            var3 = 4353;
         }
      } else {
         if(var1.getChannels() != 2) {
            this.func_102397_errorMessage("Audio data neither mono nor stereo in method \'setAudioFormat\'");
            return;
         }

         if(var1.getSampleSizeInBits() == 8) {
            var3 = 4354;
         } else {
            if(var1.getSampleSizeInBits() != 16) {
               this.func_102397_errorMessage("Illegal sample size in method \'setAudioFormat\'");
               return;
            }

            var3 = 4355;
         }
      }

      this.field_102433_ALformat = var3;
      this.field_102432_sampleRate = (int)var1.getSampleRate();
   }

   public void func_102431_setFormat(int var1, int var2) {
      this.field_102433_ALformat = var1;
      this.field_102432_sampleRate = var2;
   }

   public boolean func_102398_preLoadBuffers(LinkedList var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Buffers may only be queued for streaming sources.")) {
         return false;
      } else if(this.func_102386_errorCheck(var1 == null, "Buffer List null in method \'preLoadBuffers\'")) {
         return false;
      } else {
         boolean var3 = this.func_102392_playing();
         if(var3) {
            AL10.alSourceStop(this.field_102435_ALSource.get(0));
            this.func_102429_checkALError();
         }

         int var4 = AL10.alGetSourcei(this.field_102435_ALSource.get(0), 4118);
         IntBuffer var2;
         if(var4 > 0) {
            var2 = BufferUtils.createIntBuffer(var4);
            AL10.alGenBuffers(var2);
            if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error clearing stream buffers in method \'preLoadBuffers\'")) {
               return false;
            }

            AL10.alSourceUnqueueBuffers(this.field_102435_ALSource.get(0), var2);
            if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error unqueuing stream buffers in method \'preLoadBuffers\'")) {
               return false;
            }
         }

         if(var3) {
            AL10.alSourcePlay(this.field_102435_ALSource.get(0));
            this.func_102429_checkALError();
         }

         var2 = BufferUtils.createIntBuffer(var1.size());
         AL10.alGenBuffers(var2);
         if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error generating stream buffers in method \'preLoadBuffers\'")) {
            return false;
         } else {
            ByteBuffer var5 = null;

            for(int var6 = 0; var6 < var1.size(); ++var6) {
               var5 = (ByteBuffer)BufferUtils.createByteBuffer(((byte[])var1.get(var6)).length).put((byte[])var1.get(var6)).flip();

               try {
                  AL10.alBufferData(var2.get(var6), this.field_102433_ALformat, var5, this.field_102432_sampleRate);
               } catch (Exception var9) {
                  this.func_102397_errorMessage("Error creating buffers in method \'preLoadBuffers\'");
                  this.func_102399_printStackTrace(var9);
                  return false;
               }

               if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error creating buffers in method \'preLoadBuffers\'")) {
                  return false;
               }
            }

            try {
               AL10.alSourceQueueBuffers(this.field_102435_ALSource.get(0), var2);
            } catch (Exception var8) {
               this.func_102397_errorMessage("Error queuing buffers in method \'preLoadBuffers\'");
               this.func_102399_printStackTrace(var8);
               return false;
            }

            if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error queuing buffers in method \'preLoadBuffers\'")) {
               return false;
            } else {
               AL10.alSourcePlay(this.field_102435_ALSource.get(0));
               return !this.func_102386_errorCheck(this.func_102429_checkALError(), "Error playing source in method \'preLoadBuffers\'");
            }
         }
      }
   }

   public boolean func_102381_queueBuffer(byte[] var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Buffers may only be queued for streaming sources.")) {
         return false;
      } else {
         ByteBuffer var2 = (ByteBuffer)BufferUtils.createByteBuffer(var1.length).put(var1).flip();
         IntBuffer var3 = BufferUtils.createIntBuffer(1);
         AL10.alSourceUnqueueBuffers(this.field_102435_ALSource.get(0), var3);
         if(this.func_102429_checkALError()) {
            return false;
         } else {
            if(AL10.alIsBuffer(var3.get(0))) {
               this.field_102434_millisPreviouslyPlayed += this.func_102428_millisInBuffer(var3.get(0));
            }

            this.func_102429_checkALError();
            AL10.alBufferData(var3.get(0), this.field_102433_ALformat, var2, this.field_102432_sampleRate);
            if(this.func_102429_checkALError()) {
               return false;
            } else {
               AL10.alSourceQueueBuffers(this.field_102435_ALSource.get(0), var3);
               return !this.func_102429_checkALError();
            }
         }
      }
   }

   public int func_102385_feedRawAudioData(byte[] var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Raw audio data can only be fed to streaming sources.")) {
         return -1;
      } else {
         ByteBuffer var2 = (ByteBuffer)BufferUtils.createByteBuffer(var1.length).put(var1).flip();
         int var4 = AL10.alGetSourcei(this.field_102435_ALSource.get(0), 4118);
         IntBuffer var3;
         if(var4 > 0) {
            var3 = BufferUtils.createIntBuffer(var4);
            AL10.alGenBuffers(var3);
            if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error clearing stream buffers in method \'feedRawAudioData\'")) {
               return -1;
            }

            AL10.alSourceUnqueueBuffers(this.field_102435_ALSource.get(0), var3);
            if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error unqueuing stream buffers in method \'feedRawAudioData\'")) {
               return -1;
            }

            if(AL10.alIsBuffer(var3.get(0))) {
               this.field_102434_millisPreviouslyPlayed += this.func_102428_millisInBuffer(var3.get(0));
            }

            this.func_102429_checkALError();
         } else {
            var3 = BufferUtils.createIntBuffer(1);
            AL10.alGenBuffers(var3);
            if(this.func_102386_errorCheck(this.func_102429_checkALError(), "Error generating stream buffers in method \'preLoadBuffers\'")) {
               return -1;
            }
         }

         AL10.alBufferData(var3.get(0), this.field_102433_ALformat, var2, this.field_102432_sampleRate);
         if(this.func_102429_checkALError()) {
            return -1;
         } else {
            AL10.alSourceQueueBuffers(this.field_102435_ALSource.get(0), var3);
            if(this.func_102429_checkALError()) {
               return -1;
            } else {
               if(this.field_102406_attachedSource != null && this.field_102406_attachedSource.field_102359_channel == this && this.field_102406_attachedSource.func_102309_active() && !this.func_102392_playing()) {
                  AL10.alSourcePlay(this.field_102435_ALSource.get(0));
                  this.func_102429_checkALError();
               }

               return var4;
            }
         }
      }
   }

   public float func_102428_millisInBuffer(int var1) {
      return (float)AL10.alGetBufferi(var1, 8196) / (float)AL10.alGetBufferi(var1, 8195) / ((float)AL10.alGetBufferi(var1, 8194) / 8.0F) / (float)this.field_102432_sampleRate * 1000.0F;
   }

   public float func_102394_millisecondsPlayed() {
      float var1 = (float)AL10.alGetSourcei(this.field_102435_ALSource.get(0), 4134);
      float var2 = 1.0F;
      switch(this.field_102433_ALformat) {
      case 4352:
         var2 = 1.0F;
         break;
      case 4353:
         var2 = 2.0F;
         break;
      case 4354:
         var2 = 2.0F;
         break;
      case 4355:
         var2 = 4.0F;
      }

      var1 = var1 / var2 / (float)this.field_102432_sampleRate * 1000.0F;
      if(this.field_102403_channelType == 1) {
         var1 += this.field_102434_millisPreviouslyPlayed;
      }

      return var1;
   }

   public int func_102401_buffersProcessed() {
      if(this.field_102403_channelType != 1) {
         return 0;
      } else {
         int var1 = AL10.alGetSourcei(this.field_102435_ALSource.get(0), 4118);
         return this.func_102429_checkALError()?0:var1;
      }
   }

   public void func_102388_flush() {
      if(this.field_102403_channelType == 1) {
         int var1 = AL10.alGetSourcei(this.field_102435_ALSource.get(0), 4117);
         if(!this.func_102429_checkALError()) {
            for(IntBuffer var2 = BufferUtils.createIntBuffer(1); var1 > 0; --var1) {
               try {
                  AL10.alSourceUnqueueBuffers(this.field_102435_ALSource.get(0), var2);
               } catch (Exception var4) {
                  return;
               }

               if(this.func_102429_checkALError()) {
                  return;
               }
            }

            this.field_102434_millisPreviouslyPlayed = 0.0F;
         }
      }
   }

   public void func_102395_close() {
      try {
         AL10.alSourceStop(this.field_102435_ALSource.get(0));
         AL10.alGetError();
      } catch (Exception var2) {
         ;
      }

      if(this.field_102403_channelType == 1) {
         this.func_102388_flush();
      }

   }

   public void func_102391_play() {
      AL10.alSourcePlay(this.field_102435_ALSource.get(0));
      this.func_102429_checkALError();
   }

   public void func_102400_pause() {
      AL10.alSourcePause(this.field_102435_ALSource.get(0));
      this.func_102429_checkALError();
   }

   public void func_102390_stop() {
      AL10.alSourceStop(this.field_102435_ALSource.get(0));
      if(!this.func_102429_checkALError()) {
         this.field_102434_millisPreviouslyPlayed = 0.0F;
      }

   }

   public void func_102383_rewind() {
      if(this.field_102403_channelType != 1) {
         AL10.alSourceRewind(this.field_102435_ALSource.get(0));
         if(!this.func_102429_checkALError()) {
            this.field_102434_millisPreviouslyPlayed = 0.0F;
         }

      }
   }

   public boolean func_102392_playing() {
      int var1 = AL10.alGetSourcei(this.field_102435_ALSource.get(0), 4112);
      return this.func_102429_checkALError()?false:var1 == 4114;
   }

   private boolean func_102429_checkALError() {
      switch(AL10.alGetError()) {
      case 0:
         return false;
      case '\ua001':
         this.func_102397_errorMessage("Invalid name parameter.");
         return true;
      case '\ua002':
         this.func_102397_errorMessage("Invalid parameter.");
         return true;
      case '\ua003':
         this.func_102397_errorMessage("Invalid enumerated parameter value.");
         return true;
      case '\ua004':
         this.func_102397_errorMessage("Illegal call.");
         return true;
      case '\ua005':
         this.func_102397_errorMessage("Unable to allocate memory.");
         return true;
      default:
         this.func_102397_errorMessage("An unrecognized error occurred.");
         return true;
      }
   }
}
