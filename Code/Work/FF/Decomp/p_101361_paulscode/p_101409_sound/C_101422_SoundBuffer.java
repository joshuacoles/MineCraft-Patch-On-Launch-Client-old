package p_101361_paulscode.p_101409_sound;

import javax.sound.sampled.AudioFormat;

public class C_101422_SoundBuffer {

   public byte[] field_102656_audioData;
   public AudioFormat field_102657_audioFormat;


   public C_101422_SoundBuffer(byte[] var1, AudioFormat var2) {
      this.field_102656_audioData = var1;
      this.field_102657_audioFormat = var2;
   }

   public void func_102655_cleanup() {
      this.field_102656_audioData = null;
      this.field_102657_audioFormat = null;
   }

   public void func_102654_trimData(int var1) {
      if(this.field_102656_audioData != null && var1 != 0) {
         if(this.field_102656_audioData.length > var1) {
            byte[] var2 = new byte[var1];
            System.arraycopy(this.field_102656_audioData, 0, var2, 0, var1);
            this.field_102656_audioData = var2;
         }
      } else {
         this.field_102656_audioData = null;
      }

   }
}
