package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101430_LibraryLWJGLOpenAL;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101433_ChannelLWJGLOpenAL;

public class C_101435_SourceLWJGLOpenAL extends C_101423_Source {

   private C_101433_ChannelLWJGLOpenAL field_102369_channelOpenAL;
   private IntBuffer field_102372_myBuffer;
   private FloatBuffer field_102373_listenerPosition;
   private FloatBuffer field_102371_sourcePosition;
   private FloatBuffer field_102370_sourceVelocity;


   public C_101435_SourceLWJGLOpenAL(FloatBuffer var1, IntBuffer var2, boolean var3, boolean var4, boolean var5, String var6, C_101414_FilenameURL var7, C_101422_SoundBuffer var8, float var9, float var10, float var11, int var12, float var13, boolean var14) {
      super(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field_102369_channelOpenAL = (C_101433_ChannelLWJGLOpenAL)this.field_102359_channel;
      if(this.field_102332_codec != null) {
         this.field_102332_codec.func_102436_reverseByteOrder(true);
      }

      this.field_102373_listenerPosition = var1;
      this.field_102372_myBuffer = var2;
      this.field_102350_libraryType = C_101430_LibraryLWJGLOpenAL.class;
      this.field_102358_pitch = 1.0F;
      this.func_102364_resetALInformation();
   }

   public C_101435_SourceLWJGLOpenAL(FloatBuffer var1, IntBuffer var2, C_101423_Source var3, C_101422_SoundBuffer var4) {
      super(var3, var4);
      this.field_102369_channelOpenAL = (C_101433_ChannelLWJGLOpenAL)this.field_102359_channel;
      if(this.field_102332_codec != null) {
         this.field_102332_codec.func_102436_reverseByteOrder(true);
      }

      this.field_102373_listenerPosition = var1;
      this.field_102372_myBuffer = var2;
      this.field_102350_libraryType = C_101430_LibraryLWJGLOpenAL.class;
      this.field_102358_pitch = 1.0F;
      this.func_102364_resetALInformation();
   }

   public C_101435_SourceLWJGLOpenAL(FloatBuffer var1, AudioFormat var2, boolean var3, String var4, float var5, float var6, float var7, int var8, float var9) {
      super(var2, var3, var4, var5, var6, var7, var8, var9);
      this.field_102369_channelOpenAL = (C_101433_ChannelLWJGLOpenAL)this.field_102359_channel;
      this.field_102373_listenerPosition = var1;
      this.field_102350_libraryType = C_101430_LibraryLWJGLOpenAL.class;
      this.field_102358_pitch = 1.0F;
      this.func_102364_resetALInformation();
   }

   public void func_102314_cleanup() {
      super.func_102314_cleanup();
   }

   public void func_102365_changeSource(FloatBuffer var1, IntBuffer var2, boolean var3, boolean var4, boolean var5, String var6, C_101414_FilenameURL var7, C_101422_SoundBuffer var8, float var9, float var10, float var11, int var12, float var13, boolean var14) {
      super.func_102316_changeSource(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field_102373_listenerPosition = var1;
      this.field_102372_myBuffer = var2;
      this.field_102358_pitch = 1.0F;
      this.func_102364_resetALInformation();
   }

   public boolean func_102318_incrementSoundSequence() {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'incrementSoundSequence\' may only be used for streaming sources.");
         return false;
      } else {
         Object var1 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue != null && this.field_102329_soundSequenceQueue.size() > 0) {
               this.field_102347_filenameURL = (C_101414_FilenameURL)this.field_102329_soundSequenceQueue.remove(0);
               if(this.field_102332_codec != null) {
                  this.field_102332_codec.func_102437_cleanup();
               }

               this.field_102332_codec = C_101416_SoundSystemConfig.func_102578_getCodec(this.field_102347_filenameURL.func_102509_getFilename());
               if(this.field_102332_codec != null) {
                  this.field_102332_codec.func_102436_reverseByteOrder(true);
                  if(this.field_102332_codec.func_102443_getAudioFormat() == null) {
                     this.field_102332_codec.func_102439_initialize(this.field_102347_filenameURL.func_102508_getURL());
                  }

                  AudioFormat var2 = this.field_102332_codec.func_102443_getAudioFormat();
                  if(var2 == null) {
                     this.func_102306_errorMessage("Audio Format null in method \'incrementSoundSequence\'");
                     return false;
                  }

                  boolean var3 = false;
                  short var6;
                  if(var2.getChannels() == 1) {
                     if(var2.getSampleSizeInBits() == 8) {
                        var6 = 4352;
                     } else {
                        if(var2.getSampleSizeInBits() != 16) {
                           this.func_102306_errorMessage("Illegal sample size in method \'incrementSoundSequence\'");
                           return false;
                        }

                        var6 = 4353;
                     }
                  } else {
                     if(var2.getChannels() != 2) {
                        this.func_102306_errorMessage("Audio data neither mono nor stereo in method \'incrementSoundSequence\'");
                        return false;
                     }

                     if(var2.getSampleSizeInBits() == 8) {
                        var6 = 4354;
                     } else {
                        if(var2.getSampleSizeInBits() != 16) {
                           this.func_102306_errorMessage("Illegal sample size in method \'incrementSoundSequence\'");
                           return false;
                        }

                        var6 = 4355;
                     }
                  }

                  this.field_102369_channelOpenAL.func_102431_setFormat(var6, (int)var2.getSampleRate());
                  this.field_102327_preLoad = true;
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }

   public void func_102304_listenerMoved() {
      this.func_102291_positionChanged();
   }

   public void func_102319_setPosition(float var1, float var2, float var3) {
      super.func_102319_setPosition(var1, var2, var3);
      if(this.field_102371_sourcePosition == null) {
         this.func_102364_resetALInformation();
      } else {
         this.func_102291_positionChanged();
      }

      this.field_102371_sourcePosition.put(0, var1);
      this.field_102371_sourcePosition.put(1, var2);
      this.field_102371_sourcePosition.put(2, var3);
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         AL10.alSource(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4100, this.field_102371_sourcePosition);
         this.func_102366_checkALError();
      }

   }

   public void func_102291_positionChanged() {
      this.func_102368_calculateDistance();
      this.func_102363_calculateGain();
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4106, this.field_102352_gain * this.field_102339_sourceVolume * Math.abs(this.field_102345_fadeOutGain) * this.field_102344_fadeInGain);
         this.func_102366_checkALError();
      }

      this.func_102367_checkPitch();
   }

   private void func_102367_checkPitch() {
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && C_101430_LibraryLWJGLOpenAL.func_102242_alPitchSupported() && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4099, this.field_102358_pitch);
         this.func_102366_checkALError();
      }

   }

   public void func_102311_setLooping(boolean var1) {
      super.func_102311_setLooping(var1);
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         if(var1) {
            AL10.alSourcei(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4103, 1);
         } else {
            AL10.alSourcei(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4103, 0);
         }

         this.func_102366_checkALError();
      }

   }

   public void func_102305_setAttenuation(int var1) {
      super.func_102305_setAttenuation(var1);
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         if(var1 == 1) {
            AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4129, this.field_102360_distOrRoll);
         } else {
            AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4129, 0.0F);
         }

         this.func_102366_checkALError();
      }

   }

   public void func_102282_setDistOrRoll(float var1) {
      super.func_102282_setDistOrRoll(var1);
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         if(this.field_102328_attModel == 1) {
            AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4129, var1);
         } else {
            AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4129, 0.0F);
         }

         this.func_102366_checkALError();
      }

   }

   public void func_102322_setVelocity(float var1, float var2, float var3) {
      super.func_102322_setVelocity(var1, var2, var3);
      this.field_102370_sourceVelocity = BufferUtils.createFloatBuffer(3).put(new float[]{var1, var2, var3});
      this.field_102370_sourceVelocity.flip();
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
         AL10.alSource(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4102, this.field_102370_sourceVelocity);
         this.func_102366_checkALError();
      }

   }

   public void func_102317_setPitch(float var1) {
      super.func_102317_setPitch(var1);
      this.func_102367_checkPitch();
   }

   public void func_102307_play(C_101413_Channel var1) {
      if(!this.func_102309_active()) {
         if(this.field_102349_toLoop) {
            this.field_102342_toPlay = true;
         }

      } else if(var1 == null) {
         this.func_102306_errorMessage("Unable to play source, because channel was null");
      } else {
         boolean var2 = this.field_102359_channel != var1;
         if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource != this) {
            var2 = true;
         }

         boolean var3 = this.func_102321_paused();
         super.func_102307_play(var1);
         this.field_102369_channelOpenAL = (C_101433_ChannelLWJGLOpenAL)this.field_102359_channel;
         if(var2) {
            this.func_102319_setPosition(this.field_102325_position.field_102507_x, this.field_102325_position.field_102506_y, this.field_102325_position.field_102505_z);
            this.func_102367_checkPitch();
            if(this.field_102369_channelOpenAL != null && this.field_102369_channelOpenAL.field_102435_ALSource != null) {
               if(C_101430_LibraryLWJGLOpenAL.func_102242_alPitchSupported()) {
                  AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4099, this.field_102358_pitch);
                  this.func_102366_checkALError();
               }

               AL10.alSource(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4100, this.field_102371_sourcePosition);
               this.func_102366_checkALError();
               AL10.alSource(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4102, this.field_102370_sourceVelocity);
               this.func_102366_checkALError();
               if(this.field_102328_attModel == 1) {
                  AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4129, this.field_102360_distOrRoll);
               } else {
                  AL10.alSourcef(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4129, 0.0F);
               }

               this.func_102366_checkALError();
               if(this.field_102349_toLoop && !this.field_102335_toStream) {
                  AL10.alSourcei(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4103, 1);
               } else {
                  AL10.alSourcei(this.field_102369_channelOpenAL.field_102435_ALSource.get(0), 4103, 0);
               }

               this.func_102366_checkALError();
            }

            if(!this.field_102335_toStream) {
               if(this.field_102372_myBuffer == null) {
                  this.func_102306_errorMessage("No sound buffer to play");
                  return;
               }

               this.field_102369_channelOpenAL.func_102430_attachBuffer(this.field_102372_myBuffer);
            }
         }

         if(!this.func_102299_playing()) {
            if(this.field_102335_toStream && !var3) {
               if(this.field_102332_codec == null) {
                  this.func_102306_errorMessage("Decoder null in method \'play\'");
                  return;
               }

               if(this.field_102332_codec.func_102443_getAudioFormat() == null) {
                  this.field_102332_codec.func_102439_initialize(this.field_102347_filenameURL.func_102508_getURL());
               }

               AudioFormat var4 = this.field_102332_codec.func_102443_getAudioFormat();
               if(var4 == null) {
                  this.func_102306_errorMessage("Audio Format null in method \'play\'");
                  return;
               }

               boolean var5 = false;
               short var6;
               if(var4.getChannels() == 1) {
                  if(var4.getSampleSizeInBits() == 8) {
                     var6 = 4352;
                  } else {
                     if(var4.getSampleSizeInBits() != 16) {
                        this.func_102306_errorMessage("Illegal sample size in method \'play\'");
                        return;
                     }

                     var6 = 4353;
                  }
               } else {
                  if(var4.getChannels() != 2) {
                     this.func_102306_errorMessage("Audio data neither mono nor stereo in method \'play\'");
                     return;
                  }

                  if(var4.getSampleSizeInBits() == 8) {
                     var6 = 4354;
                  } else {
                     if(var4.getSampleSizeInBits() != 16) {
                        this.func_102306_errorMessage("Illegal sample size in method \'play\'");
                        return;
                     }

                     var6 = 4355;
                  }
               }

               this.field_102369_channelOpenAL.func_102431_setFormat(var6, (int)var4.getSampleRate());
               this.field_102327_preLoad = true;
            }

            this.field_102359_channel.func_102391_play();
            if(this.field_102358_pitch != 1.0F) {
               this.func_102367_checkPitch();
            }
         }

      }
   }

   public boolean func_102310_preLoad() {
      if(this.field_102332_codec == null) {
         return false;
      } else {
         this.field_102332_codec.func_102439_initialize(this.field_102347_filenameURL.func_102508_getURL());
         LinkedList var1 = new LinkedList();

         for(int var2 = 0; var2 < C_101416_SoundSystemConfig.func_102574_getNumberStreamingBuffers(); ++var2) {
            this.field_102362_soundBuffer = this.field_102332_codec.func_102441_read();
            if(this.field_102362_soundBuffer == null || this.field_102362_soundBuffer.field_102656_audioData == null) {
               break;
            }

            var1.add(this.field_102362_soundBuffer.field_102656_audioData);
         }

         this.func_102291_positionChanged();
         this.field_102359_channel.func_102398_preLoadBuffers(var1);
         this.field_102327_preLoad = false;
         return true;
      }
   }

   private void func_102364_resetALInformation() {
      this.field_102371_sourcePosition = BufferUtils.createFloatBuffer(3).put(new float[]{this.field_102325_position.field_102507_x, this.field_102325_position.field_102506_y, this.field_102325_position.field_102505_z});
      this.field_102370_sourceVelocity = BufferUtils.createFloatBuffer(3).put(new float[]{this.field_102341_velocity.field_102507_x, this.field_102341_velocity.field_102506_y, this.field_102341_velocity.field_102505_z});
      this.field_102371_sourcePosition.flip();
      this.field_102370_sourceVelocity.flip();
      this.func_102291_positionChanged();
   }

   private void func_102368_calculateDistance() {
      if(this.field_102373_listenerPosition != null) {
         double var1 = (double)(this.field_102325_position.field_102507_x - this.field_102373_listenerPosition.get(0));
         double var3 = (double)(this.field_102325_position.field_102506_y - this.field_102373_listenerPosition.get(1));
         double var5 = (double)(this.field_102325_position.field_102505_z - this.field_102373_listenerPosition.get(2));
         this.field_102351_distanceFromListener = (float)Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5);
      }

   }

   private void func_102363_calculateGain() {
      if(this.field_102328_attModel == 2) {
         if(this.field_102351_distanceFromListener <= 0.0F) {
            this.field_102352_gain = 1.0F;
         } else if(this.field_102351_distanceFromListener >= this.field_102360_distOrRoll) {
            this.field_102352_gain = 0.0F;
         } else {
            this.field_102352_gain = 1.0F - this.field_102351_distanceFromListener / this.field_102360_distOrRoll;
         }

         if(this.field_102352_gain > 1.0F) {
            this.field_102352_gain = 1.0F;
         }

         if(this.field_102352_gain < 0.0F) {
            this.field_102352_gain = 0.0F;
         }
      } else {
         this.field_102352_gain = 1.0F;
      }

   }

   private boolean func_102366_checkALError() {
      switch(AL10.alGetError()) {
      case 0:
         return false;
      case '\ua001':
         this.func_102306_errorMessage("Invalid name parameter.");
         return true;
      case '\ua002':
         this.func_102306_errorMessage("Invalid parameter.");
         return true;
      case '\ua003':
         this.func_102306_errorMessage("Invalid enumerated parameter value.");
         return true;
      case '\ua004':
         this.func_102306_errorMessage("Illegal call.");
         return true;
      case '\ua005':
         this.func_102306_errorMessage("Unable to allocate memory.");
         return true;
      default:
         this.func_102306_errorMessage("An unrecognized error occurred.");
         return true;
      }
   }
}
