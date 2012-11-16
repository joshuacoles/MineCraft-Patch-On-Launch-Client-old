import java.util.Random;

public class C_100552_aaf extends C_100562_aan {

   static final byte[] field_108001_a = new byte[]{(byte)2, (byte)0, (byte)0, (byte)1, (byte)2, (byte)1};
   Random field_107999_b = new Random();
   C_100873_xe field_108000_c;
   int[] field_107997_d = new int[]{0, 0, 0};
   int field_107998_e = 0;
   int field_107995_f;
   double field_107996_g = 0.618D;
   double field_108008_h = 1.0D;
   double field_108009_i = 0.381D;
   double field_108006_j = 1.0D;
   double field_108007_k = 1.0D;
   int field_108004_l = 1;
   int field_108005_m = 12;
   int field_108002_n = 4;
   int[][] field_108003_o;


   public C_100552_aaf(boolean var1) {
      super(var1);
   }

   void func_107983_a() {
      this.field_107995_f = (int)((double)this.field_107998_e * this.field_107996_g);
      if(this.field_107995_f >= this.field_107998_e) {
         this.field_107995_f = this.field_107998_e - 1;
      }

      int var1 = (int)(1.382D + Math.pow(this.field_108007_k * (double)this.field_107998_e / 13.0D, 2.0D));
      if(var1 < 1) {
         var1 = 1;
      }

      int[][] var2 = new int[var1 * this.field_107998_e][4];
      int var3 = this.field_107997_d[1] + this.field_107998_e - this.field_108002_n;
      int var4 = 1;
      int var5 = this.field_107997_d[1] + this.field_107995_f;
      int var6 = var3 - this.field_107997_d[1];
      var2[0][0] = this.field_107997_d[0];
      var2[0][1] = var3;
      var2[0][2] = this.field_107997_d[2];
      var2[0][3] = var5;
      --var3;

      while(var6 >= 0) {
         int var7 = 0;
         float var8 = this.func_107984_a(var6);
         if(var8 < 0.0F) {
            --var3;
            --var6;
         } else {
            for(double var9 = 0.5D; var7 < var1; ++var7) {
               double var11 = this.field_108006_j * (double)var8 * ((double)this.field_107999_b.nextFloat() + 0.328D);
               double var13 = (double)this.field_107999_b.nextFloat() * 2.0D * 3.14159D;
               int var15 = C_100650_jv.func_108910_c(var11 * Math.sin(var13) + (double)this.field_107997_d[0] + var9);
               int var16 = C_100650_jv.func_108910_c(var11 * Math.cos(var13) + (double)this.field_107997_d[2] + var9);
               int[] var17 = new int[]{var15, var3, var16};
               int[] var18 = new int[]{var15, var3 + this.field_108002_n, var16};
               if(this.func_107990_a(var17, var18) == -1) {
                  int[] var19 = new int[]{this.field_107997_d[0], this.field_107997_d[1], this.field_107997_d[2]};
                  double var20 = Math.sqrt(Math.pow((double)Math.abs(this.field_107997_d[0] - var17[0]), 2.0D) + Math.pow((double)Math.abs(this.field_107997_d[2] - var17[2]), 2.0D));
                  double var22 = var20 * this.field_108009_i;
                  if((double)var17[1] - var22 > (double)var5) {
                     var19[1] = var5;
                  } else {
                     var19[1] = (int)((double)var17[1] - var22);
                  }

                  if(this.func_107990_a(var19, var17) == -1) {
                     var2[var4][0] = var15;
                     var2[var4][1] = var3;
                     var2[var4][2] = var16;
                     var2[var4][3] = var19[1];
                     ++var4;
                  }
               }
            }

            --var3;
            --var6;
         }
      }

      this.field_108003_o = new int[var4][4];
      System.arraycopy(var2, 0, this.field_108003_o, 0, var4);
   }

   void func_107986_a(int var1, int var2, int var3, float var4, byte var5, int var6) {
      int var7 = (int)((double)var4 + 0.618D);
      byte var8 = field_108001_a[var5];
      byte var9 = field_108001_a[var5 + 3];
      int[] var10 = new int[]{var1, var2, var3};
      int[] var11 = new int[]{0, 0, 0};
      int var12 = -var7;
      int var13 = -var7;

      for(var11[var5] = var10[var5]; var12 <= var7; ++var12) {
         var11[var8] = var10[var8] + var12;
         var13 = -var7;

         while(var13 <= var7) {
            double var15 = Math.pow((double)Math.abs(var12) + 0.5D, 2.0D) + Math.pow((double)Math.abs(var13) + 0.5D, 2.0D);
            if(var15 > (double)(var4 * var4)) {
               ++var13;
            } else {
               var11[var9] = var10[var9] + var13;
               int var14 = this.field_108000_c.func_109349_a(var11[0], var11[1], var11[2]);
               if(var14 != 0 && var14 != C_100451_alf.field_106080_N.field_106162_cm) {
                  ++var13;
               } else {
                  this.func_107966_a(this.field_108000_c, var11[0], var11[1], var11[2], var6, 0);
                  ++var13;
               }
            }
         }
      }

   }

   float func_107984_a(int var1) {
      if((double)var1 < (double)((float)this.field_107998_e) * 0.3D) {
         return -1.618F;
      } else {
         float var2 = (float)this.field_107998_e / 2.0F;
         float var3 = (float)this.field_107998_e / 2.0F - (float)var1;
         float var4;
         if(var3 == 0.0F) {
            var4 = var2;
         } else if(Math.abs(var3) >= var2) {
            var4 = 0.0F;
         } else {
            var4 = (float)Math.sqrt(Math.pow((double)Math.abs(var2), 2.0D) - Math.pow((double)Math.abs(var3), 2.0D));
         }

         var4 *= 0.5F;
         return var4;
      }
   }

   float func_107989_b(int var1) {
      return var1 >= 0 && var1 < this.field_108002_n?(var1 != 0 && var1 != this.field_108002_n - 1?3.0F:2.0F):-1.0F;
   }

   void func_107985_a(int var1, int var2, int var3) {
      int var4 = var2;

      for(int var5 = var2 + this.field_108002_n; var4 < var5; ++var4) {
         float var6 = this.func_107989_b(var4 - var2);
         this.func_107986_a(var1, var4, var3, var6, (byte)1, C_100451_alf.field_106080_N.field_106162_cm);
      }

   }

   void func_107994_a(int[] var1, int[] var2, int var3) {
      int[] var4 = new int[]{0, 0, 0};
      byte var5 = 0;

      byte var6;
      for(var6 = 0; var5 < 3; ++var5) {
         var4[var5] = var2[var5] - var1[var5];
         if(Math.abs(var4[var5]) > Math.abs(var4[var6])) {
            var6 = var5;
         }
      }

      if(var4[var6] != 0) {
         byte var7 = field_108001_a[var6];
         byte var8 = field_108001_a[var6 + 3];
         byte var9;
         if(var4[var6] > 0) {
            var9 = 1;
         } else {
            var9 = -1;
         }

         double var10 = (double)var4[var7] / (double)var4[var6];
         double var12 = (double)var4[var8] / (double)var4[var6];
         int[] var14 = new int[]{0, 0, 0};
         int var15 = 0;

         for(int var16 = var4[var6] + var9; var15 != var16; var15 += var9) {
            var14[var6] = C_100650_jv.func_108910_c((double)(var1[var6] + var15) + 0.5D);
            var14[var7] = C_100650_jv.func_108910_c((double)var1[var7] + (double)var15 * var10 + 0.5D);
            var14[var8] = C_100650_jv.func_108910_c((double)var1[var8] + (double)var15 * var12 + 0.5D);
            byte var17 = 0;
            int var18 = Math.abs(var14[0] - var1[0]);
            int var19 = Math.abs(var14[2] - var1[2]);
            int var20 = Math.max(var18, var19);
            if(var20 > 0) {
               if(var18 == var20) {
                  var17 = 4;
               } else if(var19 == var20) {
                  var17 = 8;
               }
            }

            this.func_107966_a(this.field_108000_c, var14[0], var14[1], var14[2], var3, var17);
         }

      }
   }

   void func_107992_b() {
      int var1 = 0;

      for(int var2 = this.field_108003_o.length; var1 < var2; ++var1) {
         int var3 = this.field_108003_o[var1][0];
         int var4 = this.field_108003_o[var1][1];
         int var5 = this.field_108003_o[var1][2];
         this.func_107985_a(var3, var4, var5);
      }

   }

   boolean func_107987_c(int var1) {
      return (double)var1 >= (double)this.field_107998_e * 0.2D;
   }

   void func_107993_c() {
      int var1 = this.field_107997_d[0];
      int var2 = this.field_107997_d[1];
      int var3 = this.field_107997_d[1] + this.field_107995_f;
      int var4 = this.field_107997_d[2];
      int[] var5 = new int[]{var1, var2, var4};
      int[] var6 = new int[]{var1, var3, var4};
      this.func_107994_a(var5, var6, C_100451_alf.field_106079_M.field_106162_cm);
      if(this.field_108004_l == 2) {
         ++var5[0];
         ++var6[0];
         this.func_107994_a(var5, var6, C_100451_alf.field_106079_M.field_106162_cm);
         ++var5[2];
         ++var6[2];
         this.func_107994_a(var5, var6, C_100451_alf.field_106079_M.field_106162_cm);
         var5[0] += -1;
         var6[0] += -1;
         this.func_107994_a(var5, var6, C_100451_alf.field_106079_M.field_106162_cm);
      }

   }

   void func_107988_d() {
      int var1 = 0;
      int var2 = this.field_108003_o.length;

      for(int[] var3 = new int[]{this.field_107997_d[0], this.field_107997_d[1], this.field_107997_d[2]}; var1 < var2; ++var1) {
         int[] var4 = this.field_108003_o[var1];
         int[] var5 = new int[]{var4[0], var4[1], var4[2]};
         var3[1] = var4[3];
         int var6 = var3[1] - this.field_107997_d[1];
         if(this.func_107987_c(var6)) {
            this.func_107994_a(var3, var5, (byte)C_100451_alf.field_106079_M.field_106162_cm);
         }
      }

   }

   int func_107990_a(int[] var1, int[] var2) {
      int[] var3 = new int[]{0, 0, 0};
      byte var4 = 0;

      byte var5;
      for(var5 = 0; var4 < 3; ++var4) {
         var3[var4] = var2[var4] - var1[var4];
         if(Math.abs(var3[var4]) > Math.abs(var3[var5])) {
            var5 = var4;
         }
      }

      if(var3[var5] == 0) {
         return -1;
      } else {
         byte var6 = field_108001_a[var5];
         byte var7 = field_108001_a[var5 + 3];
         byte var8;
         if(var3[var5] > 0) {
            var8 = 1;
         } else {
            var8 = -1;
         }

         double var9 = (double)var3[var6] / (double)var3[var5];
         double var11 = (double)var3[var7] / (double)var3[var5];
         int[] var13 = new int[]{0, 0, 0};
         int var14 = 0;

         int var15;
         for(var15 = var3[var5] + var8; var14 != var15; var14 += var8) {
            var13[var5] = var1[var5] + var14;
            var13[var6] = C_100650_jv.func_108910_c((double)var1[var6] + (double)var14 * var9);
            var13[var7] = C_100650_jv.func_108910_c((double)var1[var7] + (double)var14 * var11);
            int var16 = this.field_108000_c.func_109349_a(var13[0], var13[1], var13[2]);
            if(var16 != 0 && var16 != C_100451_alf.field_106080_N.field_106162_cm) {
               break;
            }
         }

         return var14 == var15?-1:Math.abs(var14);
      }
   }

   boolean func_107991_e() {
      int[] var1 = new int[]{this.field_107997_d[0], this.field_107997_d[1], this.field_107997_d[2]};
      int[] var2 = new int[]{this.field_107997_d[0], this.field_107997_d[1] + this.field_107998_e - 1, this.field_107997_d[2]};
      int var3 = this.field_108000_c.func_109349_a(this.field_107997_d[0], this.field_107997_d[1] - 1, this.field_107997_d[2]);
      if(var3 != 2 && var3 != 3) {
         return false;
      } else {
         int var4 = this.func_107990_a(var1, var2);
         if(var4 == -1) {
            return true;
         } else if(var4 < 6) {
            return false;
         } else {
            this.field_107998_e = var4;
            return true;
         }
      }
   }

   public void func_107968_a(double var1, double var3, double var5) {
      this.field_108005_m = (int)(var1 * 12.0D);
      if(var1 > 0.5D) {
         this.field_108002_n = 5;
      }

      this.field_108006_j = var3;
      this.field_108007_k = var5;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      this.field_108000_c = var1;
      long var6 = var2.nextLong();
      this.field_107999_b.setSeed(var6);
      this.field_107997_d[0] = var3;
      this.field_107997_d[1] = var4;
      this.field_107997_d[2] = var5;
      if(this.field_107998_e == 0) {
         this.field_107998_e = 5 + this.field_107999_b.nextInt(this.field_108005_m);
      }

      if(!this.func_107991_e()) {
         return false;
      } else {
         this.func_107983_a();
         this.func_107992_b();
         this.func_107993_c();
         this.func_107988_d();
         return true;
      }
   }

}
