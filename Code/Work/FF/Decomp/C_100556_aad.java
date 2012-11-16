import java.util.List;
import java.util.Random;

public class C_100556_aad implements C_101331_yx {

   private Random field_108684_i;
   private C_100731_aex field_108681_j;
   private C_100731_aex field_108682_k;
   private C_100731_aex field_108679_l;
   public C_100731_aex field_108676_a;
   public C_100731_aex field_108674_b;
   private C_100873_xe field_108680_m;
   private double[] field_108677_n;
   private C_101324_xz[] field_108678_o;
   double[] field_108675_c;
   double[] field_108672_d;
   double[] field_108673_e;
   double[] field_108670_f;
   double[] field_108671_g;
   int[][] field_108683_h = new int[32][32];


   public C_100556_aad(C_100873_xe var1, long var2) {
      this.field_108680_m = var1;
      this.field_108684_i = new Random(var2);
      this.field_108681_j = new C_100731_aex(this.field_108684_i, 16);
      this.field_108682_k = new C_100731_aex(this.field_108684_i, 16);
      this.field_108679_l = new C_100731_aex(this.field_108684_i, 8);
      this.field_108676_a = new C_100731_aex(this.field_108684_i, 10);
      this.field_108674_b = new C_100731_aex(this.field_108684_i, 16);
   }

   public void func_108667_a(int var1, int var2, byte[] var3, C_101324_xz[] var4) {
      byte var5 = 2;
      int var6 = var5 + 1;
      byte var7 = 33;
      int var8 = var5 + 1;
      this.field_108677_n = this.func_108668_a(this.field_108677_n, var1 * var5, 0, var2 * var5, var6, var7, var8);

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            for(int var11 = 0; var11 < 32; ++var11) {
               double var12 = 0.25D;
               double var14 = this.field_108677_n[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.field_108677_n[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.field_108677_n[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.field_108677_n[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.field_108677_n[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.field_108677_n[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.field_108677_n[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.field_108677_n[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 4; ++var30) {
                  double var31 = 0.125D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 8; ++var41) {
                     int var42 = var41 + var9 * 8 << 11 | 0 + var10 * 8 << 7 | var11 * 4 + var30;
                     short var43 = 128;
                     double var44 = 0.125D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 8; ++var50) {
                        int var51 = 0;
                        if(var46 > 0.0D) {
                           var51 = C_100451_alf.field_106225_bM.field_106162_cm;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void func_108669_b(int var1, int var2, byte[] var3, C_101324_xz[] var4) {
      for(int var5 = 0; var5 < 16; ++var5) {
         for(int var6 = 0; var6 < 16; ++var6) {
            byte var7 = 1;
            int var8 = -1;
            byte var9 = (byte)C_100451_alf.field_106225_bM.field_106162_cm;
            byte var10 = (byte)C_100451_alf.field_106225_bM.field_106162_cm;

            for(int var11 = 127; var11 >= 0; --var11) {
               int var12 = (var6 * 16 + var5) * 128 + var11;
               byte var13 = var3[var12];
               if(var13 == 0) {
                  var8 = -1;
               } else if(var13 == C_100451_alf.field_106111_w.field_106162_cm) {
                  if(var8 == -1) {
                     if(var7 <= 0) {
                        var9 = 0;
                        var10 = (byte)C_100451_alf.field_106225_bM.field_106162_cm;
                     }

                     var8 = var7;
                     if(var11 >= 0) {
                        var3[var12] = var9;
                     } else {
                        var3[var12] = var10;
                     }
                  } else if(var8 > 0) {
                     --var8;
                     var3[var12] = var10;
                  }
               }
            }
         }
      }

   }

   public C_101272_za func_108660_c(int var1, int var2) {
      return this.func_108657_d(var1, var2);
   }

   public C_101272_za func_108657_d(int var1, int var2) {
      this.field_108684_i.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      this.field_108678_o = this.field_108680_m.func_109465_s().func_112526_b(this.field_108678_o, var1 * 16, var2 * 16, 16, 16);
      this.func_108667_a(var1, var2, var3, this.field_108678_o);
      this.func_108669_b(var1, var2, var3, this.field_108678_o);
      C_101272_za var4 = new C_101272_za(this.field_108680_m, var3, var1, var2);
      byte[] var5 = var4.func_112306_m();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)this.field_108678_o[var6].field_112478_N;
      }

      var4.func_112305_b();
      return var4;
   }

   private double[] func_108668_a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 684.412D;
      this.field_108670_f = this.field_108676_a.func_109294_a(this.field_108670_f, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.field_108671_g = this.field_108674_b.func_109294_a(this.field_108671_g, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      var8 *= 2.0D;
      this.field_108675_c = this.field_108679_l.func_109293_a(this.field_108675_c, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 160.0D, var8 / 80.0D);
      this.field_108672_d = this.field_108681_j.func_109293_a(this.field_108672_d, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.field_108673_e = this.field_108682_k.func_109293_a(this.field_108673_e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            double var16 = (this.field_108670_f[var13] + 256.0D) / 512.0D;
            if(var16 > 1.0D) {
               var16 = 1.0D;
            }

            double var18 = this.field_108671_g[var13] / 8000.0D;
            if(var18 < 0.0D) {
               var18 = -var18 * 0.3D;
            }

            var18 = var18 * 3.0D - 2.0D;
            float var20 = (float)(var14 + var2 - 0) / 1.0F;
            float var21 = (float)(var15 + var4 - 0) / 1.0F;
            float var22 = 100.0F - C_100650_jv.func_108913_c(var20 * var20 + var21 * var21) * 8.0F;
            if(var22 > 80.0F) {
               var22 = 80.0F;
            }

            if(var22 < -100.0F) {
               var22 = -100.0F;
            }

            if(var18 > 1.0D) {
               var18 = 1.0D;
            }

            var18 /= 8.0D;
            var18 = 0.0D;
            if(var16 < 0.0D) {
               var16 = 0.0D;
            }

            var16 += 0.5D;
            var18 = var18 * (double)var6 / 16.0D;
            ++var13;
            double var23 = (double)var6 / 2.0D;

            for(int var25 = 0; var25 < var6; ++var25) {
               double var26 = 0.0D;
               double var28 = ((double)var25 - var23) * 8.0D / var16;
               if(var28 < 0.0D) {
                  var28 *= -1.0D;
               }

               double var30 = this.field_108672_d[var12] / 512.0D;
               double var32 = this.field_108673_e[var12] / 512.0D;
               double var34 = (this.field_108675_c[var12] / 10.0D + 1.0D) / 2.0D;
               if(var34 < 0.0D) {
                  var26 = var30;
               } else if(var34 > 1.0D) {
                  var26 = var32;
               } else {
                  var26 = var30 + (var32 - var30) * var34;
               }

               var26 -= 8.0D;
               var26 += (double)var22;
               byte var36 = 2;
               double var37;
               if(var25 > var6 / 2 - var36) {
                  var37 = (double)((float)(var25 - (var6 / 2 - var36)) / 64.0F);
                  if(var37 < 0.0D) {
                     var37 = 0.0D;
                  }

                  if(var37 > 1.0D) {
                     var37 = 1.0D;
                  }

                  var26 = var26 * (1.0D - var37) + -3000.0D * var37;
               }

               var36 = 8;
               if(var25 < var36) {
                  var37 = (double)((float)(var36 - var25) / ((float)var36 - 1.0F));
                  var26 = var26 * (1.0D - var37) + -30.0D * var37;
               }

               var1[var12] = var26;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean func_108656_a(int var1, int var2) {
      return true;
   }

   public void func_108666_a(C_101331_yx var1, int var2, int var3) {
      C_100173_ajc.field_106298_c = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      C_101324_xz var6 = this.field_108680_m.func_109362_a(var4 + 16, var5 + 16);
      var6.func_112456_a(this.field_108680_m, this.field_108680_m.field_109577_u, var4, var5);
      C_100173_ajc.field_106298_c = false;
   }

   public boolean func_108661_a(boolean var1, C_100683_ka var2) {
      return true;
   }

   public boolean func_108664_b() {
      return false;
   }

   public boolean func_108665_c() {
      return true;
   }

   public String func_108655_d() {
      return "RandomLevelSource";
   }

   public List func_108659_a(C_100594_lo var1, int var2, int var3, int var4) {
      C_101324_xz var5 = this.field_108680_m.func_109362_a(var2, var4);
      return var5 == null?null:var5.func_112460_a(var1);
   }

   public C_100851_xw func_108663_a(C_100873_xe var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public int func_108658_e() {
      return 0;
   }

   public void func_108662_e(int var1, int var2) {}
}
