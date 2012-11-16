package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import java.util.LinkedList;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound;

public class C_101434_ChannelJavaSound extends C_101413_Channel {

   public Clip field_102415_clip = null;
   C_101422_SoundBuffer field_102426_soundBuffer;
   public SourceDataLine field_102424_sourceDataLine = null;
   private List field_102427_streamBuffers;
   private int field_102421_processed = 0;
   private Mixer field_102416_myMixer = null;
   private AudioFormat field_102425_myFormat = null;
   private FloatControl field_102418_gainControl = null;
   private FloatControl field_102422_panControl = null;
   private FloatControl field_102420_sampleRateControl = null;
   private float field_102423_initialGain = 0.0F;
   private float field_102417_initialSampleRate = 0.0F;
   private boolean field_102419_toLoop = false;


   public C_101434_ChannelJavaSound(int var1, Mixer var2) {
      super(var1);
      this.field_102405_libraryType = C_101431_LibraryJavaSound.class;
      this.field_102416_myMixer = var2;
      this.field_102415_clip = null;
      this.field_102424_sourceDataLine = null;
      this.field_102427_streamBuffers = new LinkedList();
   }

   public void func_102384_cleanup() {
      if(this.field_102427_streamBuffers != null) {
         for(C_101422_SoundBuffer var1 = null; !this.field_102427_streamBuffers.isEmpty(); var1 = null) {
            var1 = (C_101422_SoundBuffer)this.field_102427_streamBuffers.remove(0);
            var1.func_102655_cleanup();
         }

         this.field_102427_streamBuffers.clear();
      }

      this.field_102415_clip = null;
      this.field_102426_soundBuffer = null;
      this.field_102424_sourceDataLine = null;
      this.field_102427_streamBuffers.clear();
      this.field_102416_myMixer = null;
      this.field_102425_myFormat = null;
      this.field_102427_streamBuffers = null;
      super.func_102384_cleanup();
   }

   public void func_102407_newMixer(Mixer var1) {
      if(this.field_102416_myMixer != var1) {
         try {
            if(this.field_102415_clip != null) {
               this.field_102415_clip.close();
            } else if(this.field_102424_sourceDataLine != null) {
               this.field_102424_sourceDataLine.close();
            }
         } catch (SecurityException var3) {
            ;
         }

         this.field_102416_myMixer = var1;
         if(this.field_102406_attachedSource != null) {
            if(this.field_102403_channelType == 0 && this.field_102426_soundBuffer != null) {
               this.func_102414_attachBuffer(this.field_102426_soundBuffer);
            } else if(this.field_102425_myFormat != null) {
               this.func_102409_resetStream(this.field_102425_myFormat);
            }
         }
      }

   }

   public boolean func_102414_attachBuffer(C_101422_SoundBuffer var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 0, "Buffers may only be attached to non-streaming sources")) {
         return false;
      } else if(this.func_102386_errorCheck(this.field_102416_myMixer == null, "Mixer null in method \'attachBuffer\'")) {
         return false;
      } else if(this.func_102386_errorCheck(var1 == null, "Buffer null in method \'attachBuffer\'")) {
         return false;
      } else if(this.func_102386_errorCheck(var1.field_102656_audioData == null, "Buffer missing audio data in method \'attachBuffer\'")) {
         return false;
      } else if(this.func_102386_errorCheck(var1.field_102657_audioFormat == null, "Buffer missing format information in method \'attachBuffer\'")) {
         return false;
      } else {
         Info var2 = new Info(Clip.class, var1.field_102657_audioFormat);
         if(this.func_102386_errorCheck(!AudioSystem.isLineSupported(var2), "Line not supported in method \'attachBuffer\'")) {
            return false;
         } else {
            Clip var3 = null;

            try {
               var3 = (Clip)this.field_102416_myMixer.getLine(var2);
            } catch (Exception var6) {
               this.func_102397_errorMessage("Unable to create clip in method \'attachBuffer\'");
               this.func_102399_printStackTrace(var6);
               return false;
            }

            if(this.func_102386_errorCheck(var3 == null, "New clip null in method \'attachBuffer\'")) {
               return false;
            } else {
               if(this.field_102415_clip != null) {
                  this.field_102415_clip.stop();
                  this.field_102415_clip.flush();
                  this.field_102415_clip.close();
               }

               this.field_102415_clip = var3;
               this.field_102426_soundBuffer = var1;
               this.field_102425_myFormat = var1.field_102657_audioFormat;
               var3 = null;

               try {
                  this.field_102415_clip.open(this.field_102425_myFormat, var1.field_102656_audioData, 0, var1.field_102656_audioData.length);
               } catch (Exception var5) {
                  this.func_102397_errorMessage("Unable to attach buffer to clip in method \'attachBuffer\'");
                  this.func_102399_printStackTrace(var5);
                  return false;
               }

               this.func_102408_resetControls();
               return true;
            }
         }
      }
   }

   public void func_102382_setAudioFormat(AudioFormat var1) {
      this.func_102409_resetStream(var1);
      if(this.field_102406_attachedSource != null && this.field_102406_attachedSource.field_102333_rawDataStream && this.field_102406_attachedSource.func_102309_active() && this.field_102424_sourceDataLine != null) {
         this.field_102424_sourceDataLine.start();
      }

   }

   public boolean func_102409_resetStream(AudioFormat var1) {
      if(this.func_102386_errorCheck(this.field_102416_myMixer == null, "Mixer null in method \'resetStream\'")) {
         return false;
      } else if(this.func_102386_errorCheck(var1 == null, "AudioFormat null in method \'resetStream\'")) {
         return false;
      } else {
         Info var2 = new Info(SourceDataLine.class, var1);
         if(this.func_102386_errorCheck(!AudioSystem.isLineSupported(var2), "Line not supported in method \'resetStream\'")) {
            return false;
         } else {
            SourceDataLine var3 = null;

            try {
               var3 = (SourceDataLine)this.field_102416_myMixer.getLine(var2);
            } catch (Exception var6) {
               this.func_102397_errorMessage("Unable to create a SourceDataLine in method \'resetStream\'");
               this.func_102399_printStackTrace(var6);
               return false;
            }

            if(this.func_102386_errorCheck(var3 == null, "New SourceDataLine null in method \'resetStream\'")) {
               return false;
            } else {
               this.field_102427_streamBuffers.clear();
               this.field_102421_processed = 0;
               if(this.field_102424_sourceDataLine != null) {
                  this.field_102424_sourceDataLine.stop();
                  this.field_102424_sourceDataLine.flush();
                  this.field_102424_sourceDataLine.close();
               }

               this.field_102424_sourceDataLine = var3;
               this.field_102425_myFormat = var1;
               var3 = null;

               try {
                  this.field_102424_sourceDataLine.open(this.field_102425_myFormat);
               } catch (Exception var5) {
                  this.func_102397_errorMessage("Unable to open the new SourceDataLine in method \'resetStream\'");
                  this.func_102399_printStackTrace(var5);
                  return false;
               }

               this.func_102408_resetControls();
               return true;
            }
         }
      }
   }

   private void func_102408_resetControls() {
      switch(this.field_102403_channelType) {
      case 0:
         try {
            if(!this.field_102415_clip.isControlSupported(Type.PAN)) {
               this.field_102422_panControl = null;
            } else {
               this.field_102422_panControl = (FloatControl)this.field_102415_clip.getControl(Type.PAN);
            }
         } catch (IllegalArgumentException var7) {
            this.field_102422_panControl = null;
         }

         try {
            if(!this.field_102415_clip.isControlSupported(Type.MASTER_GAIN)) {
               this.field_102418_gainControl = null;
               this.field_102423_initialGain = 0.0F;
            } else {
               this.field_102418_gainControl = (FloatControl)this.field_102415_clip.getControl(Type.MASTER_GAIN);
               this.field_102423_initialGain = this.field_102418_gainControl.getValue();
            }
         } catch (IllegalArgumentException var6) {
            this.field_102418_gainControl = null;
            this.field_102423_initialGain = 0.0F;
         }

         try {
            if(!this.field_102415_clip.isControlSupported(Type.SAMPLE_RATE)) {
               this.field_102420_sampleRateControl = null;
               this.field_102417_initialSampleRate = 0.0F;
            } else {
               this.field_102420_sampleRateControl = (FloatControl)this.field_102415_clip.getControl(Type.SAMPLE_RATE);
               this.field_102417_initialSampleRate = this.field_102420_sampleRateControl.getValue();
            }
         } catch (IllegalArgumentException var5) {
            this.field_102420_sampleRateControl = null;
            this.field_102417_initialSampleRate = 0.0F;
         }
         break;
      case 1:
         try {
            if(!this.field_102424_sourceDataLine.isControlSupported(Type.PAN)) {
               this.field_102422_panControl = null;
            } else {
               this.field_102422_panControl = (FloatControl)this.field_102424_sourceDataLine.getControl(Type.PAN);
            }
         } catch (IllegalArgumentException var4) {
            this.field_102422_panControl = null;
         }

         try {
            if(!this.field_102424_sourceDataLine.isControlSupported(Type.MASTER_GAIN)) {
               this.field_102418_gainControl = null;
               this.field_102423_initialGain = 0.0F;
            } else {
               this.field_102418_gainControl = (FloatControl)this.field_102424_sourceDataLine.getControl(Type.MASTER_GAIN);
               this.field_102423_initialGain = this.field_102418_gainControl.getValue();
            }
         } catch (IllegalArgumentException var3) {
            this.field_102418_gainControl = null;
            this.field_102423_initialGain = 0.0F;
         }

         try {
            if(!this.field_102424_sourceDataLine.isControlSupported(Type.SAMPLE_RATE)) {
               this.field_102420_sampleRateControl = null;
               this.field_102417_initialSampleRate = 0.0F;
            } else {
               this.field_102420_sampleRateControl = (FloatControl)this.field_102424_sourceDataLine.getControl(Type.SAMPLE_RATE);
               this.field_102417_initialSampleRate = this.field_102420_sampleRateControl.getValue();
            }
         } catch (IllegalArgumentException var2) {
            this.field_102420_sampleRateControl = null;
            this.field_102417_initialSampleRate = 0.0F;
         }
         break;
      default:
         this.func_102397_errorMessage("Unrecognized channel type in method \'resetControls\'");
         this.field_102422_panControl = null;
         this.field_102418_gainControl = null;
         this.field_102420_sampleRateControl = null;
      }

   }

   public void func_102410_setLooping(boolean var1) {
      this.field_102419_toLoop = var1;
   }

   public void func_102411_setPan(float var1) {
      if(this.field_102422_panControl != null) {
         float var2 = var1;
         if(var1 < -1.0F) {
            var2 = -1.0F;
         }

         if(var2 > 1.0F) {
            var2 = 1.0F;
         }

         this.field_102422_panControl.setValue(var2);
      }
   }

   public void func_102412_setGain(float var1) {
      if(this.field_102418_gainControl != null) {
         float var2 = var1;
         if(var1 < 0.0F) {
            var2 = 0.0F;
         }

         if(var2 > 1.0F) {
            var2 = 1.0F;
         }

         double var3 = (double)this.field_102418_gainControl.getMinimum();
         double var5 = (double)this.field_102423_initialGain;
         double var7 = 0.5D * var5 - var3;
         double var9 = Math.log(10.0D) / 20.0D;
         float var11 = (float)(var3 + 1.0D / var9 * Math.log(1.0D + (Math.exp(var9 * var7) - 1.0D) * (double)var2));
         this.field_102418_gainControl.setValue(var11);
      }
   }

   public void func_102413_setPitch(float var1) {
      if(this.field_102420_sampleRateControl != null) {
         float var2 = var1;
         if(var1 < 0.5F) {
            var2 = 0.5F;
         }

         if(var2 > 2.0F) {
            var2 = 2.0F;
         }

         var2 *= this.field_102417_initialSampleRate;
         this.field_102420_sampleRateControl.setValue(var2);
      }
   }

   public boolean func_102398_preLoadBuffers(LinkedList var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Buffers may only be queued for streaming sources.")) {
         return false;
      } else if(this.func_102386_errorCheck(this.field_102424_sourceDataLine == null, "SourceDataLine null in method \'preLoadBuffers\'.")) {
         return false;
      } else {
         this.field_102424_sourceDataLine.start();
         if(var1.isEmpty()) {
            return true;
         } else {
            byte[] var2 = (byte[])var1.remove(0);
            if(this.func_102386_errorCheck(var2 == null, "Missing sound-bytes in method \'preLoadBuffers\'.")) {
               return false;
            } else {
               while(!var1.isEmpty()) {
                  this.field_102427_streamBuffers.add(new C_101422_SoundBuffer((byte[])var1.remove(0), this.field_102425_myFormat));
               }

               this.field_102424_sourceDataLine.write(var2, 0, var2.length);
               this.field_102421_processed = 0;
               return true;
            }
         }
      }
   }

   public boolean func_102381_queueBuffer(byte[] var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Buffers may only be queued for streaming sources.")) {
         return false;
      } else if(this.func_102386_errorCheck(this.field_102424_sourceDataLine == null, "SourceDataLine null in method \'queueBuffer\'.")) {
         return false;
      } else if(this.func_102386_errorCheck(this.field_102425_myFormat == null, "AudioFormat null in method \'queueBuffer\'")) {
         return false;
      } else {
         this.field_102427_streamBuffers.add(new C_101422_SoundBuffer(var1, this.field_102425_myFormat));
         this.func_102396_processBuffer();
         this.field_102421_processed = 0;
         return true;
      }
   }

   public boolean func_102396_processBuffer() {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Buffers are only processed for streaming sources.")) {
         return false;
      } else if(this.func_102386_errorCheck(this.field_102424_sourceDataLine == null, "SourceDataLine null in method \'processBuffer\'.")) {
         return false;
      } else if(this.field_102427_streamBuffers != null && !this.field_102427_streamBuffers.isEmpty()) {
         C_101422_SoundBuffer var1 = (C_101422_SoundBuffer)this.field_102427_streamBuffers.remove(0);
         this.field_102424_sourceDataLine.write(var1.field_102656_audioData, 0, var1.field_102656_audioData.length);
         if(!this.field_102424_sourceDataLine.isActive()) {
            this.field_102424_sourceDataLine.start();
         }

         var1.func_102655_cleanup();
         var1 = null;
         return true;
      } else {
         return false;
      }
   }

   public int func_102385_feedRawAudioData(byte[] var1) {
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Raw audio data can only be processed by streaming sources.")) {
         return -1;
      } else if(this.func_102386_errorCheck(this.field_102427_streamBuffers == null, "StreamBuffers queue null in method \'feedRawAudioData\'.")) {
         return -1;
      } else {
         this.field_102427_streamBuffers.add(new C_101422_SoundBuffer(var1, this.field_102425_myFormat));
         return this.func_102401_buffersProcessed();
      }
   }

   public int func_102401_buffersProcessed() {
      this.field_102421_processed = 0;
      if(this.func_102386_errorCheck(this.field_102403_channelType != 1, "Buffers may only be queued for streaming sources.")) {
         if(this.field_102427_streamBuffers != null) {
            this.field_102427_streamBuffers.clear();
         }

         return 0;
      } else if(this.field_102424_sourceDataLine == null) {
         if(this.field_102427_streamBuffers != null) {
            this.field_102427_streamBuffers.clear();
         }

         return 0;
      } else {
         if(this.field_102424_sourceDataLine.available() > 0) {
            this.field_102421_processed = 1;
         }

         return this.field_102421_processed;
      }
   }

   public void func_102388_flush() {
      if(this.field_102403_channelType == 1) {
         if(!this.func_102386_errorCheck(this.field_102424_sourceDataLine == null, "SourceDataLine null in method \'flush\'.")) {
            this.field_102424_sourceDataLine.stop();
            this.field_102424_sourceDataLine.flush();
            this.field_102424_sourceDataLine.drain();
            this.field_102427_streamBuffers.clear();
            this.field_102421_processed = 0;
         }
      }
   }

   public void func_102395_close() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip != null) {
            this.field_102415_clip.stop();
            this.field_102415_clip.flush();
            this.field_102415_clip.close();
         }
         break;
      case 1:
         if(this.field_102424_sourceDataLine != null) {
            this.func_102388_flush();
            this.field_102424_sourceDataLine.close();
         }
      }

   }

   public void func_102391_play() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip != null) {
            if(this.field_102419_toLoop) {
               this.field_102415_clip.stop();
               this.field_102415_clip.loop(-1);
            } else {
               this.field_102415_clip.stop();
               this.field_102415_clip.start();
            }
         }
         break;
      case 1:
         if(this.field_102424_sourceDataLine != null) {
            this.field_102424_sourceDataLine.start();
         }
      }

   }

   public void func_102400_pause() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip != null) {
            this.field_102415_clip.stop();
         }
         break;
      case 1:
         if(this.field_102424_sourceDataLine != null) {
            this.field_102424_sourceDataLine.stop();
         }
      }

   }

   public void func_102390_stop() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip != null) {
            this.field_102415_clip.stop();
            this.field_102415_clip.setFramePosition(0);
         }
         break;
      case 1:
         if(this.field_102424_sourceDataLine != null) {
            this.field_102424_sourceDataLine.stop();
         }
      }

   }

   public void func_102383_rewind() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip != null) {
            boolean var1 = this.field_102415_clip.isRunning();
            this.field_102415_clip.stop();
            this.field_102415_clip.setFramePosition(0);
            if(var1) {
               if(this.field_102419_toLoop) {
                  this.field_102415_clip.loop(-1);
               } else {
                  this.field_102415_clip.start();
               }
            }
         }
      case 1:
      default:
      }
   }

   public float func_102394_millisecondsPlayed() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip == null) {
            return -1.0F;
         }

         return (float)this.field_102415_clip.getMicrosecondPosition() / 1000.0F;
      case 1:
         if(this.field_102424_sourceDataLine == null) {
            return -1.0F;
         }

         return (float)this.field_102424_sourceDataLine.getMicrosecondPosition() / 1000.0F;
      default:
         return -1.0F;
      }
   }

   public boolean func_102392_playing() {
      switch(this.field_102403_channelType) {
      case 0:
         if(this.field_102415_clip == null) {
            return false;
         }

         return this.field_102415_clip.isActive();
      case 1:
         if(this.field_102424_sourceDataLine == null) {
            return false;
         }

         return this.field_102424_sourceDataLine.isActive();
      default:
         return false;
      }
   }
}
