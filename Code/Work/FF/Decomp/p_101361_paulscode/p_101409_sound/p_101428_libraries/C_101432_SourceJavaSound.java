package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101410_Vector3D;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101419_ListenerData;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101434_ChannelJavaSound;

public class C_101432_SourceJavaSound extends C_101423_Source {

   protected C_101434_ChannelJavaSound field_102379_channelJavaSound;
   public C_101419_ListenerData field_102378_listener;
   private float field_102380_pan;


   public C_101432_SourceJavaSound(C_101419_ListenerData var1, boolean var2, boolean var3, boolean var4, String var5, C_101414_FilenameURL var6, C_101422_SoundBuffer var7, float var8, float var9, float var10, int var11, float var12, boolean var13) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      this.field_102379_channelJavaSound = (C_101434_ChannelJavaSound)this.field_102359_channel;
      this.field_102380_pan = 0.0F;
      this.field_102350_libraryType = C_101431_LibraryJavaSound.class;
      this.field_102378_listener = var1;
      this.func_102291_positionChanged();
   }

   public C_101432_SourceJavaSound(C_101419_ListenerData var1, C_101423_Source var2, C_101422_SoundBuffer var3) {
      super(var2, var3);
      this.field_102379_channelJavaSound = (C_101434_ChannelJavaSound)this.field_102359_channel;
      this.field_102380_pan = 0.0F;
      this.field_102350_libraryType = C_101431_LibraryJavaSound.class;
      this.field_102378_listener = var1;
      this.func_102291_positionChanged();
   }

   public C_101432_SourceJavaSound(C_101419_ListenerData var1, AudioFormat var2, boolean var3, String var4, float var5, float var6, float var7, int var8, float var9) {
      super(var2, var3, var4, var5, var6, var7, var8, var9);
      this.field_102379_channelJavaSound = (C_101434_ChannelJavaSound)this.field_102359_channel;
      this.field_102380_pan = 0.0F;
      this.field_102350_libraryType = C_101431_LibraryJavaSound.class;
      this.field_102378_listener = var1;
      this.func_102291_positionChanged();
   }

   public void func_102314_cleanup() {
      super.func_102314_cleanup();
   }

   public void func_102316_changeSource(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, C_101422_SoundBuffer var6, float var7, float var8, float var9, int var10, float var11, boolean var12) {
      super.func_102316_changeSource(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      if(this.field_102379_channelJavaSound != null) {
         this.field_102379_channelJavaSound.func_102410_setLooping(var3);
      }

      this.func_102291_positionChanged();
   }

   public void func_102304_listenerMoved() {
      this.func_102291_positionChanged();
   }

   public void func_102322_setVelocity(float var1, float var2, float var3) {
      super.func_102322_setVelocity(var1, var2, var3);
      this.func_102291_positionChanged();
   }

   public void func_102319_setPosition(float var1, float var2, float var3) {
      super.func_102319_setPosition(var1, var2, var3);
      this.func_102291_positionChanged();
   }

   public void func_102291_positionChanged() {
      this.func_102375_calculateGain();
      this.func_102377_calculatePan();
      this.func_102374_calculatePitch();
   }

   public void func_102317_setPitch(float var1) {
      super.func_102317_setPitch(var1);
      this.func_102374_calculatePitch();
   }

   public void func_102305_setAttenuation(int var1) {
      super.func_102305_setAttenuation(var1);
      this.func_102375_calculateGain();
   }

   public void func_102282_setDistOrRoll(float var1) {
      super.func_102282_setDistOrRoll(var1);
      this.func_102375_calculateGain();
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
         boolean var4 = this.func_102303_stopped();
         super.func_102307_play(var1);
         this.field_102379_channelJavaSound = (C_101434_ChannelJavaSound)this.field_102359_channel;
         if(var2) {
            if(this.field_102379_channelJavaSound != null) {
               this.field_102379_channelJavaSound.func_102410_setLooping(this.field_102349_toLoop);
            }

            if(!this.field_102335_toStream) {
               if(this.field_102362_soundBuffer == null) {
                  this.func_102306_errorMessage("No sound buffer to play");
                  return;
               }

               this.field_102379_channelJavaSound.func_102414_attachBuffer(this.field_102362_soundBuffer);
            }
         }

         this.func_102291_positionChanged();
         if(var4 || !this.func_102299_playing()) {
            if(this.field_102335_toStream && !var3) {
               this.field_102327_preLoad = true;
            }

            this.field_102359_channel.func_102391_play();
         }

      }
   }

   public boolean func_102310_preLoad() {
      if(this.field_102332_codec == null) {
         return false;
      } else {
         boolean var1 = false;
         Object var2 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102336_nextBuffers == null || this.field_102336_nextBuffers.isEmpty()) {
               var1 = true;
            }
         }

         LinkedList var7 = new LinkedList();
         if(this.field_102343_nextCodec != null && !var1) {
            this.field_102332_codec = this.field_102343_nextCodec;
            this.field_102343_nextCodec = null;
            Object var8 = this.field_102334_soundSequenceLock;
            synchronized(this.field_102334_soundSequenceLock) {
               while(!this.field_102336_nextBuffers.isEmpty()) {
                  this.field_102362_soundBuffer = (C_101422_SoundBuffer)this.field_102336_nextBuffers.remove(0);
                  if(this.field_102362_soundBuffer != null && this.field_102362_soundBuffer.field_102656_audioData != null) {
                     var7.add(this.field_102362_soundBuffer.field_102656_audioData);
                  }
               }
            }
         } else {
            this.field_102332_codec.func_102439_initialize(this.field_102347_filenameURL.func_102508_getURL());

            for(int var3 = 0; var3 < C_101416_SoundSystemConfig.func_102574_getNumberStreamingBuffers(); ++var3) {
               this.field_102362_soundBuffer = this.field_102332_codec.func_102441_read();
               if(this.field_102362_soundBuffer == null || this.field_102362_soundBuffer.field_102656_audioData == null) {
                  break;
               }

               var7.add(this.field_102362_soundBuffer.field_102656_audioData);
            }

            this.field_102379_channelJavaSound.func_102409_resetStream(this.field_102332_codec.func_102443_getAudioFormat());
         }

         this.func_102291_positionChanged();
         this.field_102359_channel.func_102398_preLoadBuffers(var7);
         this.field_102327_preLoad = false;
         return true;
      }
   }

   public void func_102375_calculateGain() {
      float var1 = this.field_102325_position.field_102507_x - this.field_102378_listener.field_102643_position.field_102507_x;
      float var2 = this.field_102325_position.field_102506_y - this.field_102378_listener.field_102643_position.field_102506_y;
      float var3 = this.field_102325_position.field_102505_z - this.field_102378_listener.field_102643_position.field_102505_z;
      this.field_102351_distanceFromListener = (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
      switch(this.field_102328_attModel) {
      case 1:
         if(this.field_102351_distanceFromListener <= 0.0F) {
            this.field_102352_gain = 1.0F;
         } else {
            float var4 = 5.0E-4F;
            float var5 = this.field_102360_distOrRoll * this.field_102351_distanceFromListener * this.field_102351_distanceFromListener * var4;
            if(var5 < 0.0F) {
               var5 = 0.0F;
            }

            this.field_102352_gain = 1.0F / (1.0F + var5);
         }
         break;
      case 2:
         if(this.field_102351_distanceFromListener <= 0.0F) {
            this.field_102352_gain = 1.0F;
         } else if(this.field_102351_distanceFromListener >= this.field_102360_distOrRoll) {
            this.field_102352_gain = 0.0F;
         } else {
            this.field_102352_gain = 1.0F - this.field_102351_distanceFromListener / this.field_102360_distOrRoll;
         }
         break;
      default:
         this.field_102352_gain = 1.0F;
      }

      if(this.field_102352_gain > 1.0F) {
         this.field_102352_gain = 1.0F;
      }

      if(this.field_102352_gain < 0.0F) {
         this.field_102352_gain = 0.0F;
      }

      this.field_102352_gain *= this.field_102339_sourceVolume * C_101416_SoundSystemConfig.func_102597_getMasterGain() * Math.abs(this.field_102345_fadeOutGain) * this.field_102344_fadeInGain;
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102379_channelJavaSound != null) {
         this.field_102379_channelJavaSound.func_102412_setGain(this.field_102352_gain);
      }

   }

   public void func_102377_calculatePan() {
      C_101410_Vector3D var1 = this.field_102378_listener.field_102647_up.func_102494_cross(this.field_102378_listener.field_102644_lookAt);
      var1.func_102497_normalize();
      float var2 = this.field_102325_position.func_102495_dot(this.field_102325_position.func_102503_subtract(this.field_102378_listener.field_102643_position), var1);
      float var3 = this.field_102325_position.func_102495_dot(this.field_102325_position.func_102503_subtract(this.field_102378_listener.field_102643_position), this.field_102378_listener.field_102644_lookAt);
      var1 = null;
      float var4 = (float)Math.atan2((double)var2, (double)var3);
      this.field_102380_pan = (float)(-Math.sin((double)var4));
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102379_channelJavaSound != null) {
         if(this.field_102328_attModel == 0) {
            this.field_102379_channelJavaSound.func_102411_setPan(0.0F);
         } else {
            this.field_102379_channelJavaSound.func_102411_setPan(this.field_102380_pan);
         }
      }

   }

   public void func_102374_calculatePitch() {
      if(this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this && this.field_102379_channelJavaSound != null) {
         if(C_101416_SoundSystemConfig.func_102582_getDopplerFactor() == 0.0F) {
            this.field_102379_channelJavaSound.func_102413_setPitch(this.field_102358_pitch);
         } else {
            float var1 = 343.3F;
            C_101410_Vector3D var2 = this.field_102341_velocity;
            C_101410_Vector3D var3 = this.field_102378_listener.field_102645_velocity;
            float var4 = C_101416_SoundSystemConfig.func_102563_getDopplerVelocity();
            float var5 = C_101416_SoundSystemConfig.func_102582_getDopplerFactor();
            C_101410_Vector3D var6 = this.field_102378_listener.field_102643_position.func_102503_subtract(this.field_102325_position);
            float var7 = var6.func_102502_dot(var3) / var6.func_102504_length();
            float var8 = var6.func_102502_dot(var2) / var6.func_102504_length();
            var8 = this.func_102376_min(var8, var1 / var5);
            var7 = this.func_102376_min(var7, var1 / var5);
            float var9 = this.field_102358_pitch * (var1 * var4 - var5 * var7) / (var1 * var4 - var5 * var8);
            if(var9 < 0.5F) {
               var9 = 0.5F;
            } else if(var9 > 2.0F) {
               var9 = 2.0F;
            }

            this.field_102379_channelJavaSound.func_102413_setPitch(var9);
         }
      }

   }

   public float func_102376_min(float var1, float var2) {
      return var1 < var2?var1:var2;
   }
}
