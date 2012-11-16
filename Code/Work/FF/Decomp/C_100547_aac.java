import java.util.List;
import java.util.Random;

public class C_100547_aac implements C_101331_yx {

   private Random field_108751_k;
   private C_100731_aex field_108748_l;
   private C_100731_aex field_108749_m;
   private C_100731_aex field_108746_n;
   private C_100731_aex field_108747_o;
   public C_100731_aex field_108745_a;
   public C_100731_aex field_108743_b;
   public C_100731_aex field_108744_c;
   private C_100873_xe field_108761_p;
   private final boolean field_108760_q;
   private double[] field_108759_r;
   private double[] field_108758_s = new double[256];
   private C_100550_aaa field_108757_t = new C_101245_zz();
   private C_100816_acz field_108756_u = new C_100816_acz();
   private C_100756_aea field_108755_v = new C_100756_aea();
   private C_100518_abp field_108754_w = new C_100518_abp();
   private C_100777_acq field_108764_x = new C_100777_acq();
   private C_100550_aaa field_108763_y = new C_101281_zv();
   private C_101324_xz[] field_108762_z;
   double[] field_108741_d;
   double[] field_108742_e;
   double[] field_108739_f;
   double[] field_108740_g;
   double[] field_108752_h;
   float[] field_108753_i;
   int[][] field_108750_j = new int[32][32];


   public C_100547_aac(C_100873_xe var1, long var2, boolean var4) {
      this.field_108761_p = var1;
      this.field_108760_q = var4;
      this.field_108751_k = new Random(var2);
      this.field_108748_l = new C_100731_aex(this.field_108751_k, 16);
      this.field_108749_m = new C_100731_aex(this.field_108751_k, 16);
      this.field_108746_n = new C_100731_aex(this.field_108751_k, 8);
      this.field_108747_o = new C_100731_aex(this.field_108751_k, 4);
      this.field_108745_a = new C_100731_aex(this.field_108751_k, 10);
      this.field_108743_b = new C_100731_aex(this.field_108751_k, 16);
      this.field_108744_c = new C_100731_aex(this.field_108751_k, 8);
   }

   public void func_108738_a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 16;
      byte var6 = 63;
      int var7 = var4 + 1;
      byte var8 = 17;
      int var9 = var4 + 1;
      this.field_108762_z = this.field_108761_p.func_109465_s().func_112522_a(this.field_108762_z, var1 * 4 - 2, var2 * 4 - 2, var7 + 5, var9 + 5);
      this.field_108759_r = this.func_108737_a(this.field_108759_r, var1 * var4, 0, var2 * var4, var7, var8, var9);

      for(int var10 = 0; var10 < var4; ++var10) {
         for(int var11 = 0; var11 < var4; ++var11) {
            for(int var12 = 0; var12 < var5; ++var12) {
               double var13 = 0.125D;
               double var15 = this.field_108759_r[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
               double var17 = this.field_108759_r[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
               double var19 = this.field_108759_r[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
               double var21 = this.field_108759_r[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
               double var23 = (this.field_108759_r[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
               double var25 = (this.field_108759_r[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
               double var27 = (this.field_108759_r[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
               double var29 = (this.field_108759_r[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

               for(int var31 = 0; var31 < 8; ++var31) {
                  double var32 = 0.25D;
                  double var34 = var15;
                  double var36 = var17;
                  double var38 = (var19 - var15) * var32;
                  double var40 = (var21 - var17) * var32;

                  for(int var42 = 0; var42 < 4; ++var42) {
                     int var43 = var42 + var10 * 4 << 11 | 0 + var11 * 4 << 7 | var12 * 8 + var31;
                     short var44 = 128;
                     var43 -= var44;
                     double var45 = 0.25D;
                     double var49 = (var36 - var34) * var45;
                     double var47 = var34 - var49;

                     for(int var51 = 0; var51 < 4; ++var51) {
                        if((var47 += var49) > 0.0D) {
                           var3[var43 += var44] = (byte)C_100451_alf.field_106111_w.field_106162_cm;
                        } else if(var12 * 8 + var31 < var6) {
                           var3[var43 += var44] = (byte)C_100451_alf.field_106072_E.field_106162_cm;
                        } else {
                           var3[var43 += var44] = 0;
                        }
                     }

                     var34 += var38;
                     var36 += var40;
                  }

                  var15 += var23;
                  var17 += var25;
                  var19 += var27;
                  var21 += var29;
               }
            }
         }
      }

   }

   public void func_108736_a(int var1, int var2, byte[] var3, C_101324_xz[] var4) {
      byte var5 = 63;
      double var6 = 0.03125D;
      this.field_108758_s = this.field_108747_o.func_109293_a(this.field_108758_s, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

      for(int var8 = 0; var8 < 16; ++var8) {
         for(int var9 = 0; var9 < 16; ++var9) {
            C_101324_xz var10 = var4[var9 + var8 * 16];
            float var11 = var10.func_112465_j();
            int var12 = (int)(this.field_108758_s[var8 + var9 * 16] / 3.0D + 3.0D + this.field_108751_k.nextDouble() * 0.25D);
            int var13 = -1;
            byte var14 = var10.field_112473_A;
            byte var15 = var10.field_112474_B;

            for(int var16 = 127; var16 >= 0; --var16) {
               int var17 = (var9 * 16 + var8) * 128 + var16;
               if(var16 <= 0 + this.field_108751_k.nextInt(5)) {
                  var3[var17] = (byte)C_100451_alf.field_106077_C.field_106162_cm;
               } else {
                  byte var18 = var3[var17];
                  if(var18 == 0) {
                     var13 = -1;
                  } else if(var18 == C_100451_alf.field_106111_w.field_106162_cm) {
                     if(var13 == -1) {
                        if(var12 <= 0) {
                           var14 = 0;
                           var15 = (byte)C_100451_alf.field_106111_w.field_106162_cm;
                        } else if(var16 >= var5 - 4 && var16 <= var5 + 1) {
                           var14 = var10.field_112473_A;
                           var15 = var10.field_112474_B;
                        }

                        if(var16 < var5 && var14 == 0) {
                           if(var11 < 0.15F) {
                              var14 = (byte)C_100451_alf.field_106184_aW.field_106162_cm;
                           } else {
                              var14 = (byte)C_100451_alf.field_106072_E.field_106162_cm;
                           }
                        }

                        var13 = var12;
                        if(var16 >= var5 - 1) {
                           var3[var17] = var14;
                        } else {
                           var3[var17] = var15;
                        }
                     } else if(var13 > 0) {
                        --var13;
                        var3[var17] = var15;
                        if(var13 == 0 && var15 == C_100451_alf.field_106082_H.field_106162_cm) {
                           var13 = this.field_108751_k.nextInt(4);
                           var15 = (byte)C_100451_alf.field_106087_T.field_106162_cm;
                        }
                     }
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
      this.field_108751_k.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      this.func_108738_a(var1, var2, var3);
      this.field_108762_z = this.field_108761_p.func_109465_s().func_112526_b(this.field_108762_z, var1 * 16, var2 * 16, 16, 16);
      this.func_108736_a(var1, var2, var3, this.field_108762_z);
      this.field_108757_t.func_108342_a(this, this.field_108761_p, var1, var2, var3);
      this.field_108763_y.func_108342_a(this, this.field_108761_p, var1, var2, var3);
      if(this.field_108760_q) {
         this.field_108754_w.func_108342_a(this, this.field_108761_p, var1, var2, var3);
         this.field_108755_v.func_108342_a(this, this.field_108761_p, var1, var2, var3);
         this.field_108756_u.func_108342_a(this, this.field_108761_p, var1, var2, var3);
         this.field_108764_x.func_108342_a(this, this.field_108761_p, var1, var2, var3);
      }

      C_101272_za var4 = new C_101272_za(this.field_108761_p, var3, var1, var2);
      byte[] var5 = var4.func_112306_m();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)this.field_108762_z[var6].field_112478_N;
      }

      var4.func_112305_b();
      return var4;
   }

   private double[] func_108737_a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      if(this.field_108753_i == null) {
         this.field_108753_i = new float[25];

         for(int var8 = -2; var8 <= 2; ++var8) {
            for(int var9 = -2; var9 <= 2; ++var9) {
               float var10 = 10.0F / C_100650_jv.func_108913_c((float)(var8 * var8 + var9 * var9) + 0.2F);
               this.field_108753_i[var8 + 2 + (var9 + 2) * 5] = var10;
            }
         }
      }

      double var44 = 684.412D;
      double var45 = 684.412D;
      this.field_108740_g = this.field_108745_a.func_109294_a(this.field_108740_g, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
      this.field_108752_h = this.field_108743_b.func_109294_a(this.field_108752_h, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
      this.field_108741_d = this.field_108746_n.func_109293_a(this.field_108741_d, var2, var3, var4, var5, var6, var7, var44 / 80.0D, var45 / 160.0D, var44 / 80.0D);
      this.field_108742_e = this.field_108748_l.func_109293_a(this.field_108742_e, var2, var3, var4, var5, var6, var7, var44, var45, var44);
      this.field_108739_f = this.field_108749_m.func_109293_a(this.field_108739_f, var2, var3, var4, var5, var6, var7, var44, var45, var44);
      boolean var43 = false;
      boolean var42 = false;
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            byte var19 = 2;
            C_101324_xz var20 = this.field_108762_z[var14 + 2 + (var15 + 2) * (var5 + 5)];

            for(int var21 = -var19; var21 <= var19; ++var21) {
               for(int var22 = -var19; var22 <= var19; ++var22) {
                  C_101324_xz var23 = this.field_108762_z[var14 + var21 + 2 + (var15 + var22 + 2) * (var5 + 5)];
                  float var24 = this.field_108753_i[var21 + 2 + (var22 + 2) * 5] / (var23.field_112469_D + 2.0F);
                  if(var23.field_112469_D > var20.field_112469_D) {
                     var24 /= 2.0F;
                  }

                  var16 += var23.field_112470_E * var24;
                  var17 += var23.field_112469_D * var24;
                  var18 += var24;
               }
            }

            var16 /= var18;
            var17 /= var18;
            var16 = var16 * 0.9F + 0.1F;
            var17 = (var17 * 4.0F - 1.0F) / 8.0F;
            double var47 = this.field_108752_h[var13] / 8000.0D;
            if(var47 < 0.0D) {
               var47 = -var47 * 0.3D;
            }

            var47 = var47 * 3.0D - 2.0D;
            if(var47 < 0.0D) {
               var47 /= 2.0D;
               if(var47 < -1.0D) {
                  var47 = -1.0D;
               }

               var47 /= 1.4D;
               var47 /= 2.0D;
            } else {
               if(var47 > 1.0D) {
                  var47 = 1.0D;
               }

               var47 /= 8.0D;
            }

            ++var13;

            for(int var46 = 0; var46 < var6; ++var46) {
               double var48 = (double)var17;
               double var26 = (double)var16;
               var48 += var47 * 0.2D;
               var48 = var48 * (double)var6 / 16.0D;
               double var28 = (double)var6 / 2.0D + var48 * 4.0D;
               double var30 = 0.0D;
               double var32 = ((double)var46 - var28) * 12.0D * 128.0D / 128.0D / var26;
               if(var32 < 0.0D) {
                  var32 *= 4.0D;
               }

               double var34 = this.field_108742_e[var12] / 512.0D;
               double var36 = this.field_108739_f[var12] / 512.0D;
               double var38 = (this.field_108741_d[var12] / 10.0D + 1.0D) / 2.0D;
               if(var38 < 0.0D) {
                  var30 = var34;
               } else if(var38 > 1.0D) {
                  var30 = var36;
               } else {
                  var30 = var34 + (var36 - var34) * var38;
               }

               var30 -= var32;
               if(var46 > var6 - 4) {
                  double var40 = (double)((float)(var46 - (var6 - 4)) / 3.0F);
                  var30 = var30 * (1.0D - var40) + -10.0D * var40;
               }

               var1[var12] = var30;
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
      C_101324_xz var6 = this.field_108761_p.func_109362_a(var4 + 16, var5 + 16);
      this.field_108751_k.setSeed(this.field_108761_p.func_109374_D());
      long var7 = this.field_108751_k.nextLong() / 2L * 2L + 1L;
      long var9 = this.field_108751_k.nextLong() / 2L * 2L + 1L;
      this.field_108751_k.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.field_108761_p.func_109374_D());
      boolean var11 = false;
      if(this.field_108760_q) {
         this.field_108754_w.func_108356_a(this.field_108761_p, this.field_108751_k, var2, var3);
         var11 = this.field_108755_v.func_108356_a(this.field_108761_p, this.field_108751_k, var2, var3);
         this.field_108756_u.func_108356_a(this.field_108761_p, this.field_108751_k, var2, var3);
         this.field_108764_x.func_108356_a(this.field_108761_p, this.field_108751_k, var2, var3);
      }

      int var12;
      int var13;
      int var14;
      if(!var11 && this.field_108751_k.nextInt(4) == 0) {
         var12 = var4 + this.field_108751_k.nextInt(16) + 8;
         var13 = this.field_108751_k.nextInt(128);
         var14 = var5 + this.field_108751_k.nextInt(16) + 8;
         (new C_100578_aav(C_100451_alf.field_106072_E.field_106162_cm)).func_107965_a(this.field_108761_p, this.field_108751_k, var12, var13, var14);
      }

      if(!var11 && this.field_108751_k.nextInt(8) == 0) {
         var12 = var4 + this.field_108751_k.nextInt(16) + 8;
         var13 = this.field_108751_k.nextInt(this.field_108751_k.nextInt(120) + 8);
         var14 = var5 + this.field_108751_k.nextInt(16) + 8;
         if(var13 < 63 || this.field_108751_k.nextInt(10) == 0) {
            (new C_100578_aav(C_100451_alf.field_106074_G.field_106162_cm)).func_107965_a(this.field_108761_p, this.field_108751_k, var12, var13, var14);
         }
      }

      for(var12 = 0; var12 < 8; ++var12) {
         var13 = var4 + this.field_108751_k.nextInt(16) + 8;
         var14 = this.field_108751_k.nextInt(128);
         int var15 = var5 + this.field_108751_k.nextInt(16) + 8;
         if((new C_100586_aay()).func_107965_a(this.field_108761_p, this.field_108751_k, var13, var14, var15)) {
            ;
         }
      }

      var6.func_112456_a(this.field_108761_p, this.field_108751_k, var4, var5);
      C_100841_xr.func_110134_a(this.field_108761_p, var6, var4 + 8, var5 + 8, 16, 16, this.field_108751_k);
      var4 += 8;
      var5 += 8;

      for(var12 = 0; var12 < 16; ++var12) {
         for(var13 = 0; var13 < 16; ++var13) {
            var14 = this.field_108761_p.func_109380_h(var4 + var12, var5 + var13);
            if(this.field_108761_p.func_109446_u(var12 + var4, var14 - 1, var13 + var5)) {
               this.field_108761_p.func_109422_e(var12 + var4, var14 - 1, var13 + var5, C_100451_alf.field_106184_aW.field_106162_cm);
            }

            if(this.field_108761_p.func_109421_w(var12 + var4, var14, var13 + var5)) {
               this.field_108761_p.func_109422_e(var12 + var4, var14, var13 + var5, C_100451_alf.field_106181_aV.field_106162_cm);
            }
         }
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
      return "RandomLevelSource";
   }

   public List func_108659_a(C_100594_lo var1, int var2, int var3, int var4) {
      C_101324_xz var5 = this.field_108761_p.func_109362_a(var2, var4);
      return var5 == null?null:(var5 == C_101324_xz.field_112502_h && var1 == C_100594_lo.field_108778_a && this.field_108764_x.func_108355_a(var2, var3, var4)?this.field_108764_x.func_108366_a():var5.func_112460_a(var1));
   }

   public C_100851_xw func_108663_a(C_100873_xe var1, String var2, int var3, int var4, int var5) {
      return "Stronghold".equals(var2) && this.field_108756_u != null?this.field_108756_u.func_108358_a(var1, var3, var4, var5):null;
   }

   public int func_108658_e() {
      return 0;
   }

   public void func_108662_e(int var1, int var2) {
      if(this.field_108760_q) {
         this.field_108754_w.func_108342_a(this, this.field_108761_p, var1, var2, (byte[])null);
         this.field_108755_v.func_108342_a(this, this.field_108761_p, var1, var2, (byte[])null);
         this.field_108756_u.func_108342_a(this, this.field_108761_p, var1, var2, (byte[])null);
         this.field_108764_x.func_108342_a(this, this.field_108761_p, var1, var2, (byte[])null);
      }

   }
}
