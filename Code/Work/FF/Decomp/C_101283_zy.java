import java.util.List;
import java.util.Random;

public class C_101283_zy implements C_101331_yx {

   private Random field_108720_i;
   private C_100731_aex field_108717_j;
   private C_100731_aex field_108718_k;
   private C_100731_aex field_108715_l;
   private C_100731_aex field_108716_m;
   private C_100731_aex field_108713_n;
   public C_100731_aex field_108712_a;
   public C_100731_aex field_108710_b;
   private C_100873_xe field_108714_o;
   private double[] field_108725_p;
   public C_100533_abw field_108711_c = new C_100533_abw();
   private double[] field_108724_q = new double[256];
   private double[] field_108723_r = new double[256];
   private double[] field_108722_s = new double[256];
   private C_100550_aaa field_108721_t = new C_100545_aab();
   double[] field_108708_d;
   double[] field_108709_e;
   double[] field_108706_f;
   double[] field_108707_g;
   double[] field_108719_h;


   public C_101283_zy(C_100873_xe var1, long var2) {
      this.field_108714_o = var1;
      this.field_108720_i = new Random(var2);
      this.field_108717_j = new C_100731_aex(this.field_108720_i, 16);
      this.field_108718_k = new C_100731_aex(this.field_108720_i, 16);
      this.field_108715_l = new C_100731_aex(this.field_108720_i, 8);
      this.field_108716_m = new C_100731_aex(this.field_108720_i, 4);
      this.field_108713_n = new C_100731_aex(this.field_108720_i, 4);
      this.field_108712_a = new C_100731_aex(this.field_108720_i, 10);
      this.field_108710_b = new C_100731_aex(this.field_108720_i, 16);
   }

   public void func_108704_a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 32;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.field_108725_p = this.func_108703_a(this.field_108725_p, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = 0.125D;
               double var14 = this.field_108725_p[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.field_108725_p[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.field_108725_p[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.field_108725_p[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.field_108725_p[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.field_108725_p[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.field_108725_p[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.field_108725_p[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = 0.25D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = 0.25D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if(var11 * 8 + var30 < var5) {
                           var51 = C_100451_alf.field_106074_G.field_106162_cm;
                        }

                        if(var46 > 0.0D) {
                           var51 = C_100451_alf.field_106149_be.field_106162_cm;
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

   public void func_108705_b(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = 0.03125D;
      this.field_108724_q = this.field_108716_m.func_109293_a(this.field_108724_q, var1 * 16, var2 * 16, 0, 16, 16, 1, var5, var5, 1.0D);
      this.field_108723_r = this.field_108716_m.func_109293_a(this.field_108723_r, var1 * 16, 109, var2 * 16, 16, 1, 16, var5, 1.0D, var5);
      this.field_108722_s = this.field_108713_n.func_109293_a(this.field_108722_s, var1 * 16, var2 * 16, 0, 16, 16, 1, var5 * 2.0D, var5 * 2.0D, var5 * 2.0D);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.field_108724_q[var7 + var8 * 16] + this.field_108720_i.nextDouble() * 0.2D > 0.0D;
            boolean var10 = this.field_108723_r[var7 + var8 * 16] + this.field_108720_i.nextDouble() * 0.2D > 0.0D;
            int var11 = (int)(this.field_108722_s[var7 + var8 * 16] / 3.0D + 3.0D + this.field_108720_i.nextDouble() * 0.25D);
            int var12 = -1;
            byte var13 = (byte)C_100451_alf.field_106149_be.field_106162_cm;
            byte var14 = (byte)C_100451_alf.field_106149_be.field_106162_cm;

            for(int var15 = 127; var15 >= 0; --var15) {
               int var16 = (var8 * 16 + var7) * 128 + var15;
               if(var15 < 127 - this.field_108720_i.nextInt(5) && var15 > 0 + this.field_108720_i.nextInt(5)) {
                  byte var17 = var3[var16];
                  if(var17 == 0) {
                     var12 = -1;
                  } else if(var17 == C_100451_alf.field_106149_be.field_106162_cm) {
                     if(var12 == -1) {
                        if(var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)C_100451_alf.field_106149_be.field_106162_cm;
                        } else if(var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)C_100451_alf.field_106149_be.field_106162_cm;
                           var14 = (byte)C_100451_alf.field_106149_be.field_106162_cm;
                           if(var10) {
                              var13 = (byte)C_100451_alf.field_106083_I.field_106162_cm;
                           }

                           if(var10) {
                              var14 = (byte)C_100451_alf.field_106149_be.field_106162_cm;
                           }

                           if(var9) {
                              var13 = (byte)C_100451_alf.field_106141_bf.field_106162_cm;
                           }

                           if(var9) {
                              var14 = (byte)C_100451_alf.field_106141_bf.field_106162_cm;
                           }
                        }

                        if(var15 < var4 && var13 == 0) {
                           var13 = (byte)C_100451_alf.field_106074_G.field_106162_cm;
                        }

                        var12 = var11;
                        if(var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if(var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
                  }
               } else {
                  var3[var16] = (byte)C_100451_alf.field_106077_C.field_106162_cm;
               }
            }
         }
      }

   }

   public C_101272_za func_108660_c(int var1, int var2) {
      return this.func_108657_d(var1, var2);
   }

   public C_101272_za func_108657_d(int var1, int var2) {
      this.field_108720_i.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      this.func_108704_a(var1, var2, var3);
      this.func_108705_b(var1, var2, var3);
      this.field_108721_t.func_108342_a(this, this.field_108714_o, var1, var2, var3);
      this.field_108711_c.func_108342_a(this, this.field_108714_o, var1, var2, var3);
      C_101272_za var4 = new C_101272_za(this.field_108714_o, var3, var1, var2);
      C_101324_xz[] var5 = this.field_108714_o.func_109465_s().func_112526_b((C_101324_xz[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var4.func_112306_m();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)var5[var7].field_112478_N;
      }

      var4.func_112314_n();
      return var4;
   }

   private double[] func_108703_a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 2053.236D;
      this.field_108707_g = this.field_108712_a.func_109293_a(this.field_108707_g, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.field_108719_h = this.field_108710_b.func_109293_a(this.field_108719_h, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.field_108708_d = this.field_108715_l.func_109293_a(this.field_108708_d, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var10 / 60.0D, var8 / 80.0D);
      this.field_108709_e = this.field_108717_j.func_109293_a(this.field_108709_e, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      this.field_108706_f = this.field_108718_k.func_109293_a(this.field_108706_f, var2, var3, var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;
      double[] var14 = new double[var6];

      int var15;
      for(var15 = 0; var15 < var6; ++var15) {
         var14[var15] = Math.cos((double)var15 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
         double var16 = (double)var15;
         if(var15 > var6 / 2) {
            var16 = (double)(var6 - 1 - var15);
         }

         if(var16 < 4.0D) {
            var16 = 4.0D - var16;
            var14[var15] -= var16 * var16 * var16 * 10.0D;
         }
      }

      for(var15 = 0; var15 < var5; ++var15) {
         for(int var36 = 0; var36 < var7; ++var36) {
            double var17 = (this.field_108707_g[var13] + 256.0D) / 512.0D;
            if(var17 > 1.0D) {
               var17 = 1.0D;
            }

            double var19 = 0.0D;
            double var21 = this.field_108719_h[var13] / 8000.0D;
            if(var21 < 0.0D) {
               var21 = -var21;
            }

            var21 = var21 * 3.0D - 3.0D;
            if(var21 < 0.0D) {
               var21 /= 2.0D;
               if(var21 < -1.0D) {
                  var21 = -1.0D;
               }

               var21 /= 1.4D;
               var21 /= 2.0D;
               var17 = 0.0D;
            } else {
               if(var21 > 1.0D) {
                  var21 = 1.0D;
               }

               var21 /= 6.0D;
            }

            var17 += 0.5D;
            var21 = var21 * (double)var6 / 16.0D;
            ++var13;

            for(int var23 = 0; var23 < var6; ++var23) {
               double var24 = 0.0D;
               double var26 = var14[var23];
               double var28 = this.field_108709_e[var12] / 512.0D;
               double var30 = this.field_108706_f[var12] / 512.0D;
               double var32 = (this.field_108708_d[var12] / 10.0D + 1.0D) / 2.0D;
               if(var32 < 0.0D) {
                  var24 = var28;
               } else if(var32 > 1.0D) {
                  var24 = var30;
               } else {
                  var24 = var28 + (var30 - var28) * var32;
               }

               var24 -= var26;
               double var34;
               if(var23 > var6 - 4) {
                  var34 = (double)((float)(var23 - (var6 - 4)) / 3.0F);
                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               if((double)var23 < var19) {
                  var34 = (var19 - (double)var23) / 4.0D;
                  if(var34 < 0.0D) {
                     var34 = 0.0D;
                  }

                  if(var34 > 1.0D) {
                     var34 = 1.0D;
                  }

                  var24 = var24 * (1.0D - var34) + -10.0D * var34;
               }

               var1[var12] = var24;
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
      this.field_108711_c.func_108356_a(this.field_108714_o, this.field_108720_i, var2, var3);

      int var6;
      int var7;
      int var8;
      int var9;
      for(var6 = 0; var6 < 8; ++var6) {
         var7 = var4 + this.field_108720_i.nextInt(16) + 8;
         var8 = this.field_108720_i.nextInt(120) + 4;
         var9 = var5 + this.field_108720_i.nextInt(16) + 8;
         (new C_100569_aas(C_100451_alf.field_106073_F.field_106162_cm)).func_107965_a(this.field_108714_o, this.field_108720_i, var7, var8, var9);
      }

      var6 = this.field_108720_i.nextInt(this.field_108720_i.nextInt(10) + 1) + 1;

      int var10;
      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.field_108720_i.nextInt(16) + 8;
         var9 = this.field_108720_i.nextInt(120) + 4;
         var10 = var5 + this.field_108720_i.nextInt(16) + 8;
         (new C_100573_aaq()).func_107965_a(this.field_108714_o, this.field_108720_i, var8, var9, var10);
      }

      var6 = this.field_108720_i.nextInt(this.field_108720_i.nextInt(10) + 1);

      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var4 + this.field_108720_i.nextInt(16) + 8;
         var9 = this.field_108720_i.nextInt(120) + 4;
         var10 = var5 + this.field_108720_i.nextInt(16) + 8;
         (new C_100577_aaw()).func_107965_a(this.field_108714_o, this.field_108720_i, var8, var9, var10);
      }

      for(var7 = 0; var7 < 10; ++var7) {
         var8 = var4 + this.field_108720_i.nextInt(16) + 8;
         var9 = this.field_108720_i.nextInt(128);
         var10 = var5 + this.field_108720_i.nextInt(16) + 8;
         (new C_100571_aar()).func_107965_a(this.field_108714_o, this.field_108720_i, var8, var9, var10);
      }

      if(this.field_108720_i.nextInt(1) == 0) {
         var7 = var4 + this.field_108720_i.nextInt(16) + 8;
         var8 = this.field_108720_i.nextInt(128);
         var9 = var5 + this.field_108720_i.nextInt(16) + 8;
         (new C_100564_aao(C_100451_alf.field_106228_ai.field_106162_cm)).func_107965_a(this.field_108714_o, this.field_108720_i, var7, var8, var9);
      }

      if(this.field_108720_i.nextInt(1) == 0) {
         var7 = var4 + this.field_108720_i.nextInt(16) + 8;
         var8 = this.field_108720_i.nextInt(128);
         var9 = var5 + this.field_108720_i.nextInt(16) + 8;
         (new C_100564_aao(C_100451_alf.field_106230_aj.field_106162_cm)).func_107965_a(this.field_108714_o, this.field_108720_i, var7, var8, var9);
      }

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
      return "HellRandomLevelSource";
   }

   public List func_108659_a(C_100594_lo var1, int var2, int var3, int var4) {
      if(var1 == C_100594_lo.field_108778_a && this.field_108711_c.func_108355_a(var2, var3, var4)) {
         return this.field_108711_c.func_108360_a();
      } else {
         C_101324_xz var5 = this.field_108714_o.func_109362_a(var2, var4);
         return var5 == null?null:var5.func_112460_a(var1);
      }
   }

   public C_100851_xw func_108663_a(C_100873_xe var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public int func_108658_e() {
      return 0;
   }

   public void func_108662_e(int var1, int var2) {
      this.field_108711_c.func_108342_a(this, this.field_108714_o, var1, var2, (byte[])null);
   }
}
