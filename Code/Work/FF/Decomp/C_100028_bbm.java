import java.util.Random;

public class C_100028_bbm extends C_100032_bbi {

   private int field_105310_a = 0;
   private byte[][] field_105309_b = new byte[32][1024];


   public C_100028_bbm() {
      super(C_100451_alf.field_106143_bh.field_106165_cl);
      Random var1 = new Random(100L);

      for(int var2 = 0; var2 < 32; ++var2) {
         for(int var3 = 0; var3 < 16; ++var3) {
            for(int var4 = 0; var4 < 16; ++var4) {
               float var5 = 0.0F;

               int var6;
               for(var6 = 0; var6 < 2; ++var6) {
                  float var7 = (float)(var6 * 16) * 0.5F;
                  float var8 = (float)(var6 * 16) * 0.5F;
                  float var9 = ((float)var3 - var7) / 16.0F * 2.0F;
                  float var10 = ((float)var4 - var8) / 16.0F * 2.0F;
                  if(var9 < -1.0F) {
                     var9 += 2.0F;
                  }

                  if(var9 >= 1.0F) {
                     var9 -= 2.0F;
                  }

                  if(var10 < -1.0F) {
                     var10 += 2.0F;
                  }

                  if(var10 >= 1.0F) {
                     var10 -= 2.0F;
                  }

                  float var11 = var9 * var9 + var10 * var10;
                  float var12 = (float)Math.atan2((double)var10, (double)var9) + ((float)var2 / 32.0F * 3.1415927F * 2.0F - var11 * 10.0F + (float)(var6 * 2)) * (float)(var6 * 2 - 1);
                  var12 = (C_100650_jv.func_108924_a(var12) + 1.0F) / 2.0F;
                  var12 /= var11 + 1.0F;
                  var5 += var12 * 0.5F;
               }

               var5 += var1.nextFloat() * 0.1F;
               var6 = (int)(var5 * 100.0F + 155.0F);
               int var13 = (int)(var5 * var5 * 200.0F + 55.0F);
               int var14 = (int)(var5 * var5 * var5 * var5 * 255.0F);
               int var15 = (int)(var5 * 100.0F + 155.0F);
               int var16 = var4 * 16 + var3;
               this.field_105309_b[var2][var16 * 4 + 0] = (byte)var13;
               this.field_105309_b[var2][var16 * 4 + 1] = (byte)var14;
               this.field_105309_b[var2][var16 * 4 + 2] = (byte)var6;
               this.field_105309_b[var2][var16 * 4 + 3] = (byte)var15;
            }
         }
      }

   }

   public void func_105301_a() {
      ++this.field_105310_a;
      byte[] var1 = this.field_105309_b[this.field_105310_a & 31];

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = var1[var2 * 4 + 0] & 255;
         int var4 = var1[var2 * 4 + 1] & 255;
         int var5 = var1[var2 * 4 + 2] & 255;
         int var6 = var1[var2 * 4 + 3] & 255;
         if(this.field_105303_f) {
            int var7 = (var3 * 30 + var4 * 59 + var5 * 11) / 100;
            int var8 = (var3 * 30 + var4 * 70) / 100;
            int var9 = (var3 * 30 + var5 * 70) / 100;
            var3 = var7;
            var4 = var8;
            var5 = var9;
         }

         this.field_105305_d[var2 * 4 + 0] = (byte)var3;
         this.field_105305_d[var2 * 4 + 1] = (byte)var4;
         this.field_105305_d[var2 * 4 + 2] = (byte)var5;
         this.field_105305_d[var2 * 4 + 3] = (byte)var6;
      }

   }
}
