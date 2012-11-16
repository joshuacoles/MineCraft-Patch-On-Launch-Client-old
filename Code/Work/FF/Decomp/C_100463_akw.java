import java.util.List;
import java.util.Random;

public class C_100463_akw extends C_100451_alf {

   private static final int[][] field_106446_a = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
   private static final int[] field_106444_b = new int[]{1, -1, 0, 0};
   private static final int[] field_106445_c = new int[]{0, 0, 1, -1};
   private final C_100451_alf field_106448_cD;
   private final int field_106449_cE;
   private boolean field_106450_cF = false;
   private int field_106447_cG = 0;


   protected C_100463_akw(int var1, C_100451_alf var2, int var3) {
      super(var1, var2.field_106165_cl, var2.field_106204_cB);
      this.field_106448_cD = var2;
      this.field_106449_cE = var3;
      this.func_106006_c(var2.field_106163_cn);
      this.func_106064_b(var2.field_106160_co / 3.0F);
      this.func_106014_a(var2.field_106150_cz);
      this.func_106048_h(255);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      if(this.field_106450_cF) {
         this.func_106008_a(0.5F * (float)(this.field_106447_cG % 2), 0.5F * (float)(this.field_106447_cG / 2 % 2), 0.5F * (float)(this.field_106447_cG / 4 % 2), 0.5F + 0.5F * (float)(this.field_106447_cG % 2), 0.5F + 0.5F * (float)(this.field_106447_cG / 2 % 2), 0.5F + 0.5F * (float)(this.field_106447_cG / 4 % 2));
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 10;
   }

   public void func_106440_d(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      if((var5 & 4) != 0) {
         this.func_106008_a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public static boolean func_106442_e(int var0) {
      return var0 > 0 && C_100451_alf.field_106118_p[var0] instanceof C_100463_akw;
   }

   private boolean func_106443_f(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109349_a(var2, var3, var4);
      return func_106442_e(var6) && var1.func_109357_g(var2, var3, var4) == var5;
   }

   public boolean func_106441_g(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.5F;
      float var8 = 1.0F;
      if((var5 & 4) != 0) {
         var7 = 0.0F;
         var8 = 0.5F;
      }

      float var9 = 0.0F;
      float var10 = 1.0F;
      float var11 = 0.0F;
      float var12 = 0.5F;
      boolean var13 = true;
      int var14;
      int var15;
      int var16;
      if(var6 == 0) {
         var9 = 0.5F;
         var12 = 1.0F;
         var14 = var1.func_109349_a(var2 + 1, var3, var4);
         var15 = var1.func_109357_g(var2 + 1, var3, var4);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 3 && !this.func_106443_f(var1, var2, var3, var4 + 1, var5)) {
               var12 = 0.5F;
               var13 = false;
            } else if(var16 == 2 && !this.func_106443_f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.5F;
               var13 = false;
            }
         }
      } else if(var6 == 1) {
         var10 = 0.5F;
         var12 = 1.0F;
         var14 = var1.func_109349_a(var2 - 1, var3, var4);
         var15 = var1.func_109357_g(var2 - 1, var3, var4);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 3 && !this.func_106443_f(var1, var2, var3, var4 + 1, var5)) {
               var12 = 0.5F;
               var13 = false;
            } else if(var16 == 2 && !this.func_106443_f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.5F;
               var13 = false;
            }
         }
      } else if(var6 == 2) {
         var11 = 0.5F;
         var12 = 1.0F;
         var14 = var1.func_109349_a(var2, var3, var4 + 1);
         var15 = var1.func_109357_g(var2, var3, var4 + 1);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 1 && !this.func_106443_f(var1, var2 + 1, var3, var4, var5)) {
               var10 = 0.5F;
               var13 = false;
            } else if(var16 == 0 && !this.func_106443_f(var1, var2 - 1, var3, var4, var5)) {
               var9 = 0.5F;
               var13 = false;
            }
         }
      } else if(var6 == 3) {
         var14 = var1.func_109349_a(var2, var3, var4 - 1);
         var15 = var1.func_109357_g(var2, var3, var4 - 1);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 1 && !this.func_106443_f(var1, var2 + 1, var3, var4, var5)) {
               var10 = 0.5F;
               var13 = false;
            } else if(var16 == 0 && !this.func_106443_f(var1, var2 - 1, var3, var4, var5)) {
               var9 = 0.5F;
               var13 = false;
            }
         }
      }

      this.func_106008_a(var9, var7, var11, var10, var8, var12);
      return var13;
   }

   public boolean func_106439_h(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      int var6 = var5 & 3;
      float var7 = 0.5F;
      float var8 = 1.0F;
      if((var5 & 4) != 0) {
         var7 = 0.0F;
         var8 = 0.5F;
      }

      float var9 = 0.0F;
      float var10 = 0.5F;
      float var11 = 0.5F;
      float var12 = 1.0F;
      boolean var13 = false;
      int var14;
      int var15;
      int var16;
      if(var6 == 0) {
         var14 = var1.func_109349_a(var2 - 1, var3, var4);
         var15 = var1.func_109357_g(var2 - 1, var3, var4);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 3 && !this.func_106443_f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.0F;
               var12 = 0.5F;
               var13 = true;
            } else if(var16 == 2 && !this.func_106443_f(var1, var2, var3, var4 + 1, var5)) {
               var11 = 0.5F;
               var12 = 1.0F;
               var13 = true;
            }
         }
      } else if(var6 == 1) {
         var14 = var1.func_109349_a(var2 + 1, var3, var4);
         var15 = var1.func_109357_g(var2 + 1, var3, var4);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var9 = 0.5F;
            var10 = 1.0F;
            var16 = var15 & 3;
            if(var16 == 3 && !this.func_106443_f(var1, var2, var3, var4 - 1, var5)) {
               var11 = 0.0F;
               var12 = 0.5F;
               var13 = true;
            } else if(var16 == 2 && !this.func_106443_f(var1, var2, var3, var4 + 1, var5)) {
               var11 = 0.5F;
               var12 = 1.0F;
               var13 = true;
            }
         }
      } else if(var6 == 2) {
         var14 = var1.func_109349_a(var2, var3, var4 - 1);
         var15 = var1.func_109357_g(var2, var3, var4 - 1);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var11 = 0.0F;
            var12 = 0.5F;
            var16 = var15 & 3;
            if(var16 == 1 && !this.func_106443_f(var1, var2 - 1, var3, var4, var5)) {
               var13 = true;
            } else if(var16 == 0 && !this.func_106443_f(var1, var2 + 1, var3, var4, var5)) {
               var9 = 0.5F;
               var10 = 1.0F;
               var13 = true;
            }
         }
      } else if(var6 == 3) {
         var14 = var1.func_109349_a(var2, var3, var4 + 1);
         var15 = var1.func_109357_g(var2, var3, var4 + 1);
         if(func_106442_e(var14) && (var5 & 4) == (var15 & 4)) {
            var16 = var15 & 3;
            if(var16 == 1 && !this.func_106443_f(var1, var2 - 1, var3, var4, var5)) {
               var13 = true;
            } else if(var16 == 0 && !this.func_106443_f(var1, var2 + 1, var3, var4, var5)) {
               var9 = 0.5F;
               var10 = 1.0F;
               var13 = true;
            }
         }
      }

      if(var13) {
         this.func_106008_a(var9, var7, var11, var10, var8, var12);
      }

      return var13;
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      this.func_106440_d(var1, var2, var3, var4);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      boolean var8 = this.func_106441_g(var1, var2, var3, var4);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      if(var8 && this.func_106439_h(var1, var2, var3, var4)) {
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      this.field_106448_cD.func_105974_a(var1, var2, var3, var4, var5);
   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {
      this.field_106448_cD.func_105993_a(var1, var2, var3, var4, var5);
   }

   public void func_106020_c(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this.field_106448_cD.func_106020_c(var1, var2, var3, var4, var5);
   }

   public int func_106050_e(C_100837_xo var1, int var2, int var3, int var4) {
      return this.field_106448_cD.func_106050_e(var1, var2, var3, var4);
   }

   public float func_106052_f(C_100837_xo var1, int var2, int var3, int var4) {
      return this.field_106448_cD.func_106052_f(var1, var2, var3, var4);
   }

   public float func_105981_a(C_100730_lb var1) {
      return this.field_106448_cD.func_105981_a(var1);
   }

   public int func_106055_n() {
      return this.field_106448_cD.func_106055_n();
   }

   public int func_106029_a(int var1, int var2) {
      return this.field_106448_cD.func_106029_a(var1, this.field_106449_cE);
   }

   public int func_106024_a(int var1) {
      return this.field_106448_cD.func_106029_a(var1, this.field_106449_cE);
   }

   public int func_106000_r_() {
      return this.field_106448_cD.func_106000_r_();
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      return this.field_106448_cD.func_106031_b_(var1, var2, var3, var4);
   }

   public void func_106051_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5, C_100387_amw var6) {
      this.field_106448_cD.func_106051_a(var1, var2, var3, var4, var5, var6);
   }

   public boolean func_106049_m() {
      return this.field_106448_cD.func_106049_m();
   }

   public boolean func_106010_a(int var1, boolean var2) {
      return this.field_106448_cD.func_106010_a(var1, var2);
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return this.field_106448_cD.func_106023_b(var1, var2, var3, var4);
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106017_a(var1, var2, var3, var4, 0);
      this.field_106448_cD.func_106054_g(var1, var2, var3, var4);
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_106448_cD.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_105990_b(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      this.field_106448_cD.func_105990_b(var1, var2, var3, var4, var5);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      this.field_106448_cD.func_105996_b(var1, var2, var3, var4, var5);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      return this.field_106448_cD.func_106070_a(var1, var2, var3, var4, var5, 0, 0.0F, 0.0F, 0.0F);
   }

   public void func_105999_k(C_100873_xe var1, int var2, int var3, int var4) {
      this.field_106448_cD.func_105999_k(var1, var2, var3, var4);
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
      int var7 = var1.func_109357_g(var2, var3, var4) & 4;
      if(var6 == 0) {
         var1.func_109488_c(var2, var3, var4, 2 | var7);
      }

      if(var6 == 1) {
         var1.func_109488_c(var2, var3, var4, 1 | var7);
      }

      if(var6 == 2) {
         var1.func_109488_c(var2, var3, var4, 3 | var7);
      }

      if(var6 == 3) {
         var1.func_109488_c(var2, var3, var4, 0 | var7);
      }

   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      if(var5 == 0 || var5 != 1 && (double)var7 > 0.5D) {
         int var9 = var1.func_109357_g(var2, var3, var4);
         var1.func_109488_c(var2, var3, var4, var9 | 4);
      }

   }

   public C_100383_amu func_105992_a(C_100873_xe var1, int var2, int var3, int var4, C_100387_amw var5, C_100387_amw var6) {
      C_100383_amu[] var7 = new C_100383_amu[8];
      int var8 = var1.func_109357_g(var2, var3, var4);
      int var9 = var8 & 3;
      boolean var10 = (var8 & 4) == 4;
      int[] var11 = field_106446_a[var9 + (var10?4:0)];
      this.field_106450_cF = true;

      int var14;
      int var15;
      int var16;
      for(int var12 = 0; var12 < 8; ++var12) {
         this.field_106447_cG = var12;
         int[] var13 = var11;
         var14 = var11.length;

         for(var15 = 0; var15 < var14; ++var15) {
            var16 = var13[var15];
            if(var16 == var12) {
               ;
            }
         }

         var7[var12] = super.func_105992_a(var1, var2, var3, var4, var5, var6);
      }

      int[] var21 = var11;
      int var24 = var11.length;

      for(var14 = 0; var14 < var24; ++var14) {
         var15 = var21[var14];
         var7[var15] = null;
      }

      C_100383_amu var23 = null;
      double var22 = 0.0D;
      C_100383_amu[] var25 = var7;
      var16 = var7.length;

      for(int var17 = 0; var17 < var16; ++var17) {
         C_100383_amu var18 = var25[var17];
         if(var18 != null) {
            double var19 = var18.field_107834_f.func_107860_e(var6);
            if(var19 > var22) {
               var23 = var18;
               var22 = var19;
            }
         }
      }

      return var23;
   }

}
