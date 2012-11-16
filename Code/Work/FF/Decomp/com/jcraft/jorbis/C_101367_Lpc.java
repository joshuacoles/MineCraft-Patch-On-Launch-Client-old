package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101369_Drft;

class C_101367_Lpc {

   C_101369_Drft field_101499_fft = new C_101369_Drft();
   int field_101498_ln;
   int field_101500_m;


   static float func_101494_lpc_from_data(float[] var0, float[] var1, int var2, int var3) {
      float[] var4 = new float[var3 + 1];

      int var6;
      int var7;
      float var8;
      for(var7 = var3 + 1; var7-- != 0; var4[var7] = var8) {
         var8 = 0.0F;

         for(var6 = var7; var6 < var2; ++var6) {
            var8 += var0[var6] * var0[var6 - var7];
         }
      }

      float var5 = var4[0];

      for(var6 = 0; var6 < var3; ++var6) {
         var8 = -var4[var6 + 1];
         if(var5 == 0.0F) {
            for(int var10 = 0; var10 < var3; ++var10) {
               var1[var10] = 0.0F;
            }

            return 0.0F;
         }

         for(var7 = 0; var7 < var6; ++var7) {
            var8 -= var1[var7] * var4[var6 - var7];
         }

         var8 /= var5;
         var1[var6] = var8;

         for(var7 = 0; var7 < var6 / 2; ++var7) {
            float var9 = var1[var7];
            var1[var7] += var8 * var1[var6 - 1 - var7];
            var1[var6 - 1 - var7] += var8 * var9;
         }

         if(var6 % 2 != 0) {
            var1[var7] += var1[var7] * var8;
         }

         var5 = (float)((double)var5 * (1.0D - (double)(var8 * var8)));
      }

      return var5;
   }

   float func_101492_lpc_from_curve(float[] var1, float[] var2) {
      int var3 = this.field_101498_ln;
      float[] var4 = new float[var3 + var3];
      float var5 = (float)(0.5D / (double)var3);

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         var4[var6 * 2] = var1[var6] * var5;
         var4[var6 * 2 + 1] = 0.0F;
      }

      var4[var3 * 2 - 1] = var1[var3 - 1] * var5;
      var3 *= 2;
      this.field_101499_fft.func_101513_backward(var4);
      var6 = 0;

      float var8;
      for(int var7 = var3 / 2; var6 < var3 / 2; var4[var7++] = var8) {
         var8 = var4[var6];
         var4[var6++] = var4[var7];
      }

      return func_101494_lpc_from_data(var4, var2, var3, this.field_101500_m);
   }

   void func_101493_init(int var1, int var2) {
      this.field_101498_ln = var1;
      this.field_101500_m = var2;
      this.field_101499_fft.func_101523_init(var1 * 2);
   }

   void func_101496_clear() {
      this.field_101499_fft.func_101514_clear();
   }

   static float func_101497_FAST_HYPOT(float var0, float var1) {
      return (float)Math.sqrt((double)(var0 * var0 + var1 * var1));
   }

   void func_101495_lpc_to_curve(float[] var1, float[] var2, float var3) {
      int var4;
      for(var4 = 0; var4 < this.field_101498_ln * 2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(var3 != 0.0F) {
         for(var4 = 0; var4 < this.field_101500_m; ++var4) {
            var1[var4 * 2 + 1] = var2[var4] / (4.0F * var3);
            var1[var4 * 2 + 2] = -var2[var4] / (4.0F * var3);
         }

         this.field_101499_fft.func_101513_backward(var1);
         var4 = this.field_101498_ln * 2;
         float var5 = (float)(1.0D / (double)var3);
         var1[0] = (float)(1.0D / (double)(var1[0] * 2.0F + var5));

         for(int var6 = 1; var6 < this.field_101498_ln; ++var6) {
            float var7 = var1[var6] + var1[var4 - var6];
            float var8 = var1[var6] - var1[var4 - var6];
            float var9 = var7 + var5;
            var1[var6] = (float)(1.0D / (double)func_101497_FAST_HYPOT(var9, var8));
         }

      }
   }
}
