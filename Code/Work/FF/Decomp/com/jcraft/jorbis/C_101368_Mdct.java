package com.jcraft.jorbis;


class C_101368_Mdct {

   int field_101511_n;
   int field_101510_log2n;
   float[] field_101509_trig;
   int[] field_101512_bitrev;
   float field_101508_scale;
   float[] field_101507__x = new float[1024];
   float[] field_101506__w = new float[1024];


   void func_101503_init(int var1) {
      this.field_101512_bitrev = new int[var1 / 4];
      this.field_101509_trig = new float[var1 + var1 / 4];
      this.field_101510_log2n = (int)Math.rint(Math.log((double)var1) / Math.log(2.0D));
      this.field_101511_n = var1;
      byte var2 = 0;
      byte var3 = 1;
      int var4 = var2 + var1 / 2;
      int var5 = var4 + 1;
      int var6 = var4 + var1 / 2;
      int var7 = var6 + 1;

      int var8;
      for(var8 = 0; var8 < var1 / 4; ++var8) {
         this.field_101509_trig[var2 + var8 * 2] = (float)Math.cos(3.141592653589793D / (double)var1 * (double)(4 * var8));
         this.field_101509_trig[var3 + var8 * 2] = (float)(-Math.sin(3.141592653589793D / (double)var1 * (double)(4 * var8)));
         this.field_101509_trig[var4 + var8 * 2] = (float)Math.cos(3.141592653589793D / (double)(2 * var1) * (double)(2 * var8 + 1));
         this.field_101509_trig[var5 + var8 * 2] = (float)Math.sin(3.141592653589793D / (double)(2 * var1) * (double)(2 * var8 + 1));
      }

      for(var8 = 0; var8 < var1 / 8; ++var8) {
         this.field_101509_trig[var6 + var8 * 2] = (float)Math.cos(3.141592653589793D / (double)var1 * (double)(4 * var8 + 2));
         this.field_101509_trig[var7 + var8 * 2] = (float)(-Math.sin(3.141592653589793D / (double)var1 * (double)(4 * var8 + 2)));
      }

      var8 = (1 << this.field_101510_log2n - 1) - 1;
      int var9 = 1 << this.field_101510_log2n - 2;

      for(int var10 = 0; var10 < var1 / 8; ++var10) {
         int var11 = 0;

         for(int var12 = 0; var9 >>> var12 != 0; ++var12) {
            if((var9 >>> var12 & var10) != 0) {
               var11 |= 1 << var12;
            }
         }

         this.field_101512_bitrev[var10 * 2] = ~var11 & var8;
         this.field_101512_bitrev[var10 * 2 + 1] = var11;
      }

      this.field_101508_scale = 4.0F / (float)var1;
   }

   void func_101501_clear() {}

   void func_101505_forward(float[] var1, float[] var2) {}

   synchronized void func_101502_backward(float[] var1, float[] var2) {
      if(this.field_101507__x.length < this.field_101511_n / 2) {
         this.field_101507__x = new float[this.field_101511_n / 2];
      }

      if(this.field_101506__w.length < this.field_101511_n / 2) {
         this.field_101506__w = new float[this.field_101511_n / 2];
      }

      float[] var3 = this.field_101507__x;
      float[] var4 = this.field_101506__w;
      int var5 = this.field_101511_n >>> 1;
      int var6 = this.field_101511_n >>> 2;
      int var7 = this.field_101511_n >>> 3;
      int var8 = 1;
      int var9 = 0;
      int var10 = var5;

      int var11;
      for(var11 = 0; var11 < var7; ++var11) {
         var10 -= 2;
         var3[var9++] = -var1[var8 + 2] * this.field_101509_trig[var10 + 1] - var1[var8] * this.field_101509_trig[var10];
         var3[var9++] = var1[var8] * this.field_101509_trig[var10 + 1] - var1[var8 + 2] * this.field_101509_trig[var10];
         var8 += 4;
      }

      var8 = var5 - 4;

      for(var11 = 0; var11 < var7; ++var11) {
         var10 -= 2;
         var3[var9++] = var1[var8] * this.field_101509_trig[var10 + 1] + var1[var8 + 2] * this.field_101509_trig[var10];
         var3[var9++] = var1[var8] * this.field_101509_trig[var10] - var1[var8 + 2] * this.field_101509_trig[var10 + 1];
         var8 -= 4;
      }

      float[] var18 = this.func_101504_mdct_kernel(var3, var4, this.field_101511_n, var5, var6, var7);
      var9 = 0;
      var10 = var5;
      var11 = var6;
      int var12 = var6 - 1;
      int var13 = var6 + var5;
      int var14 = var13 - 1;

      for(int var15 = 0; var15 < var6; ++var15) {
         float var16 = var18[var9] * this.field_101509_trig[var10 + 1] - var18[var9 + 1] * this.field_101509_trig[var10];
         float var17 = -(var18[var9] * this.field_101509_trig[var10] + var18[var9 + 1] * this.field_101509_trig[var10 + 1]);
         var2[var11] = -var16;
         var2[var12] = var16;
         var2[var13] = var17;
         var2[var14] = var17;
         ++var11;
         --var12;
         ++var13;
         --var14;
         var9 += 2;
         var10 += 2;
      }

   }

   private float[] func_101504_mdct_kernel(float[] var1, float[] var2, int var3, int var4, int var5, int var6) {
      int var7 = var5;
      int var8 = 0;
      int var9 = var5;
      int var10 = var4;

      int var11;
      for(var11 = 0; var11 < var5; ++var11) {
         float var12 = var1[var7] - var1[var8];
         var2[var9 + var11] = var1[var7++] + var1[var8++];
         float var13 = var1[var7] - var1[var8];
         var10 -= 4;
         var2[var11++] = var12 * this.field_101509_trig[var10] + var13 * this.field_101509_trig[var10 + 1];
         var2[var11] = var13 * this.field_101509_trig[var10] - var12 * this.field_101509_trig[var10 + 1];
         var2[var9 + var11] = var1[var7++] + var1[var8++];
      }

      int var14;
      int var17;
      int var16;
      float var19;
      float var18;
      float var21;
      float var20;
      int var27;
      int var28;
      for(var11 = 0; var11 < this.field_101510_log2n - 3; ++var11) {
         var27 = var3 >>> var11 + 2;
         var28 = 1 << var11 + 3;
         var14 = var4 - 2;
         var10 = 0;

         for(var16 = 0; var16 < var27 >>> 2; ++var16) {
            var17 = var14;
            var9 = var14 - (var27 >> 1);
            var18 = this.field_101509_trig[var10];
            var20 = this.field_101509_trig[var10 + 1];
            var14 -= 2;
            ++var27;

            for(int var22 = 0; var22 < 2 << var11; ++var22) {
               var21 = var2[var17] - var2[var9];
               var1[var17] = var2[var17] + var2[var9];
               ++var17;
               float var10000 = var2[var17];
               ++var9;
               var19 = var10000 - var2[var9];
               var1[var17] = var2[var17] + var2[var9];
               var1[var9] = var19 * var18 - var21 * var20;
               var1[var9 - 1] = var21 * var18 + var19 * var20;
               var17 -= var27;
               var9 -= var27;
            }

            --var27;
            var10 += var28;
         }

         float[] var15 = var2;
         var2 = var1;
         var1 = var15;
      }

      var11 = var3;
      var27 = 0;
      var28 = 0;
      var14 = var4 - 1;

      for(int var29 = 0; var29 < var6; ++var29) {
         var16 = this.field_101512_bitrev[var27++];
         var17 = this.field_101512_bitrev[var27++];
         var18 = var2[var16] - var2[var17 + 1];
         var19 = var2[var16 - 1] + var2[var17];
         var20 = var2[var16] + var2[var17 + 1];
         var21 = var2[var16 - 1] - var2[var17];
         float var30 = var18 * this.field_101509_trig[var11];
         float var23 = var19 * this.field_101509_trig[var11++];
         float var24 = var18 * this.field_101509_trig[var11];
         float var25 = var19 * this.field_101509_trig[var11++];
         var1[var28++] = (var20 + var24 + var23) * 0.5F;
         var1[var14--] = (-var21 + var25 - var30) * 0.5F;
         var1[var28++] = (var21 + var25 - var30) * 0.5F;
         var1[var14--] = (var20 - var24 - var23) * 0.5F;
      }

      return var1;
   }
}
