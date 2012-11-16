package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.FloatControl.Type;
import javax.sound.sampled.Mixer.Info;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound$C_101437_Exception;

public class C_101431_LibraryJavaSound$C_101438_MixerRanking {

   public static final int field_102260_HIGH = 1;
   public static final int field_102258_MEDIUM = 2;
   public static final int field_102272_LOW = 3;
   public static final int field_102265_NONE = 4;
   public static int field_102276_MIXER_EXISTS_PRIORITY = 1;
   public static int field_102257_MIN_SAMPLE_RATE_PRIORITY = 1;
   public static int field_102264_MAX_SAMPLE_RATE_PRIORITY = 1;
   public static int field_102266_LINE_COUNT_PRIORITY = 1;
   public static int field_102255_GAIN_CONTROL_PRIORITY = 2;
   public static int field_102277_PAN_CONTROL_PRIORITY = 2;
   public static int field_102259_SAMPLE_RATE_CONTROL_PRIORITY = 3;
   public Info field_102270_mixerInfo = null;
   public int field_102267_rank = 0;
   public boolean field_102263_mixerExists = false;
   public boolean field_102269_minSampleRateOK = false;
   public boolean field_102275_maxSampleRateOK = false;
   public boolean field_102271_lineCountOK = false;
   public boolean field_102274_gainControlOK = false;
   public boolean field_102273_panControlOK = false;
   public boolean field_102256_sampleRateControlOK = false;
   public int field_102261_minSampleRatePossible = -1;
   public int field_102268_maxSampleRatePossible = -1;
   public int field_102262_maxLinesPossible = 0;


   public C_101431_LibraryJavaSound$C_101438_MixerRanking() {}

   public C_101431_LibraryJavaSound$C_101438_MixerRanking(Info var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this.field_102270_mixerInfo = var1;
      this.field_102267_rank = var2;
      this.field_102263_mixerExists = var3;
      this.field_102269_minSampleRateOK = var4;
      this.field_102275_maxSampleRateOK = var5;
      this.field_102271_lineCountOK = var6;
      this.field_102274_gainControlOK = var7;
      this.field_102273_panControlOK = var8;
      this.field_102256_sampleRateControlOK = var9;
   }

   public void func_102254_rank(Info var1) {
      if(var1 == null) {
         throw new C_101431_LibraryJavaSound$C_101437_Exception("No Mixer info specified in method \'MixerRanking.rank\'", this);
      } else {
         this.field_102270_mixerInfo = var1;

         Mixer var2;
         try {
            var2 = AudioSystem.getMixer(this.field_102270_mixerInfo);
         } catch (Exception var17) {
            throw new C_101431_LibraryJavaSound$C_101437_Exception("Unable to acquire the specified Mixer in method \'MixerRanking.rank\'", this);
         }

         if(var2 == null) {
            throw new C_101431_LibraryJavaSound$C_101437_Exception("Unable to acquire the specified Mixer in method \'MixerRanking.rank\'", this);
         } else {
            this.field_102263_mixerExists = true;

            AudioFormat var3;
            javax.sound.sampled.DataLine.Info var4;
            try {
               var3 = new AudioFormat((float)C_101431_LibraryJavaSound.func_102202_access$000(false, 0), 16, 2, true, false);
               var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
            } catch (Exception var16) {
               throw new C_101431_LibraryJavaSound$C_101437_Exception("Invalid minimum sample-rate specified in method \'MixerRanking.rank\'", this);
            }

            if(!AudioSystem.isLineSupported(var4)) {
               if(field_102257_MIN_SAMPLE_RATE_PRIORITY == 1) {
                  throw new C_101431_LibraryJavaSound$C_101437_Exception("Specified minimum sample-rate not possible for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
               }
            } else {
               this.field_102269_minSampleRateOK = true;
            }

            try {
               var3 = new AudioFormat((float)C_101431_LibraryJavaSound.func_102209_access$100(false, 0), 16, 2, true, false);
               var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
            } catch (Exception var15) {
               throw new C_101431_LibraryJavaSound$C_101437_Exception("Invalid maximum sample-rate specified in method \'MixerRanking.rank\'", this);
            }

            if(!AudioSystem.isLineSupported(var4)) {
               if(field_102264_MAX_SAMPLE_RATE_PRIORITY == 1) {
                  throw new C_101431_LibraryJavaSound$C_101437_Exception("Specified maximum sample-rate not possible for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
               }
            } else {
               this.field_102275_maxSampleRateOK = true;
            }

            int var5;
            int var6;
            int var7;
            if(this.field_102269_minSampleRateOK) {
               this.field_102261_minSampleRatePossible = C_101431_LibraryJavaSound.func_102202_access$000(false, 0);
            } else {
               var5 = C_101431_LibraryJavaSound.func_102202_access$000(false, 0);
               var6 = C_101431_LibraryJavaSound.func_102209_access$100(false, 0);

               while(var6 - var5 > 1) {
                  var7 = var5 + (var6 - var5) / 2;
                  var3 = new AudioFormat((float)var7, 16, 2, true, false);
                  var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                  if(AudioSystem.isLineSupported(var4)) {
                     this.field_102261_minSampleRatePossible = var7;
                     var6 = var7;
                  } else {
                     var5 = var7;
                  }
               }
            }

            if(this.field_102275_maxSampleRateOK) {
               this.field_102268_maxSampleRatePossible = C_101431_LibraryJavaSound.func_102209_access$100(false, 0);
            } else if(this.field_102261_minSampleRatePossible != -1) {
               var6 = C_101431_LibraryJavaSound.func_102209_access$100(false, 0);
               var5 = this.field_102261_minSampleRatePossible;

               while(var6 - var5 > 1) {
                  var7 = var5 + (var6 - var5) / 2;
                  var3 = new AudioFormat((float)var7, 16, 2, true, false);
                  var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                  if(AudioSystem.isLineSupported(var4)) {
                     this.field_102268_maxSampleRatePossible = var7;
                     var5 = var7;
                  } else {
                     var6 = var7;
                  }
               }
            }

            if(this.field_102261_minSampleRatePossible != -1 && this.field_102268_maxSampleRatePossible != -1) {
               var3 = new AudioFormat((float)this.field_102261_minSampleRatePossible, 16, 2, true, false);
               Clip var8 = null;

               javax.sound.sampled.DataLine.Info var9;
               try {
                  var9 = new javax.sound.sampled.DataLine.Info(Clip.class, var3);
                  var8 = (Clip)var2.getLine(var9);
                  byte[] var10 = new byte[10];
                  var8.open(var3, var10, 0, var10.length);
               } catch (Exception var14) {
                  throw new C_101431_LibraryJavaSound$C_101437_Exception("Unable to attach an actual audio buffer to an actual Clip... Mixer \'" + this.field_102270_mixerInfo.getName() + "\' is unuseable.", this);
               }

               this.field_102262_maxLinesPossible = 1;
               var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
               SourceDataLine[] var19 = new SourceDataLine[C_101431_LibraryJavaSound.func_102217_access$200(false, 0) - 1];
               boolean var20 = false;

               for(int var11 = 1; var11 < var19.length + 1; ++var11) {
                  try {
                     var19[var11 - 1] = (SourceDataLine)var2.getLine(var4);
                  } catch (Exception var18) {
                     if(var11 == 0) {
                        throw new C_101431_LibraryJavaSound$C_101437_Exception("No output lines possible for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
                     }

                     if(field_102266_LINE_COUNT_PRIORITY == 1) {
                        throw new C_101431_LibraryJavaSound$C_101437_Exception("Specified maximum number of lines not possible for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
                     }
                     break;
                  }

                  this.field_102262_maxLinesPossible = var11 + 1;
               }

               try {
                  var8.close();
               } catch (Exception var13) {
                  ;
               }

               var8 = null;
               if(this.field_102262_maxLinesPossible == C_101431_LibraryJavaSound.func_102217_access$200(false, 0)) {
                  this.field_102271_lineCountOK = true;
               }

               if(!C_101431_LibraryJavaSound.func_102220_access$300(false, false)) {
                  field_102255_GAIN_CONTROL_PRIORITY = 4;
               } else if(!var19[0].isControlSupported(Type.MASTER_GAIN)) {
                  if(field_102255_GAIN_CONTROL_PRIORITY == 1) {
                     throw new C_101431_LibraryJavaSound$C_101437_Exception("Gain control not available for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
                  }
               } else {
                  this.field_102274_gainControlOK = true;
               }

               if(!C_101431_LibraryJavaSound.func_102205_access$400(false, false)) {
                  field_102277_PAN_CONTROL_PRIORITY = 4;
               } else if(!var19[0].isControlSupported(Type.PAN)) {
                  if(field_102277_PAN_CONTROL_PRIORITY == 1) {
                     throw new C_101431_LibraryJavaSound$C_101437_Exception("Pan control not available for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
                  }
               } else {
                  this.field_102273_panControlOK = true;
               }

               if(!C_101431_LibraryJavaSound.func_102204_access$500(false, false)) {
                  field_102259_SAMPLE_RATE_CONTROL_PRIORITY = 4;
               } else if(!var19[0].isControlSupported(Type.SAMPLE_RATE)) {
                  if(field_102259_SAMPLE_RATE_CONTROL_PRIORITY == 1) {
                     throw new C_101431_LibraryJavaSound$C_101437_Exception("Sample-rate control not available for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
                  }
               } else {
                  this.field_102256_sampleRateControlOK = true;
               }

               this.field_102267_rank += this.func_102253_getRankValue(this.field_102263_mixerExists, field_102276_MIXER_EXISTS_PRIORITY);
               this.field_102267_rank += this.func_102253_getRankValue(this.field_102269_minSampleRateOK, field_102257_MIN_SAMPLE_RATE_PRIORITY);
               this.field_102267_rank += this.func_102253_getRankValue(this.field_102275_maxSampleRateOK, field_102264_MAX_SAMPLE_RATE_PRIORITY);
               this.field_102267_rank += this.func_102253_getRankValue(this.field_102271_lineCountOK, field_102266_LINE_COUNT_PRIORITY);
               this.field_102267_rank += this.func_102253_getRankValue(this.field_102274_gainControlOK, field_102255_GAIN_CONTROL_PRIORITY);
               this.field_102267_rank += this.func_102253_getRankValue(this.field_102273_panControlOK, field_102277_PAN_CONTROL_PRIORITY);
               this.field_102267_rank += this.func_102253_getRankValue(this.field_102256_sampleRateControlOK, field_102259_SAMPLE_RATE_CONTROL_PRIORITY);
               var2 = null;
               var3 = null;
               var4 = null;
               var9 = null;
            } else {
               throw new C_101431_LibraryJavaSound$C_101437_Exception("No possible sample-rate found for Mixer \'" + this.field_102270_mixerInfo.getName() + "\'", this);
            }
         }
      }
   }

   private int func_102253_getRankValue(boolean var1, int var2) {
      return var1?2:(var2 == 4?2:(var2 == 3?1:0));
   }

}
