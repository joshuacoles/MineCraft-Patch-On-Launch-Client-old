import java.util.Random;

public class C_100843_xs {

   private Random field_110143_a = new Random();


   public void func_110142_a(C_100873_xe var1, C_100730_lb var2, double var3, double var5, double var7, float var9) {
      if(var1.field_109576_v.field_112401_h != 1) {
         if(!this.func_110141_b(var1, var2, var3, var5, var7, var9)) {
            this.func_110140_a(var1, var2);
            this.func_110141_b(var1, var2, var3, var5, var7, var9);
         }
      } else {
         int var10 = C_100650_jv.func_108910_c(var2.field_103221_t);
         int var11 = C_100650_jv.func_108910_c(var2.field_103219_u) - 1;
         int var12 = C_100650_jv.func_108910_c(var2.field_103217_v);
         byte var13 = 1;
         byte var14 = 0;

         for(int var15 = -2; var15 <= 2; ++var15) {
            for(int var16 = -2; var16 <= 2; ++var16) {
               for(int var17 = -1; var17 < 3; ++var17) {
                  int var18 = var10 + var16 * var13 + var15 * var14;
                  int var19 = var11 + var17;
                  int var20 = var12 + var16 * var14 - var15 * var13;
                  boolean var21 = var17 < 0;
                  var1.func_109422_e(var18, var19, var20, var21?C_100451_alf.field_106210_as.field_106162_cm:0);
               }
            }
         }

         var2.func_103055_b((double)var10, (double)var11, (double)var12, var2.field_103236_z, 0.0F);
         var2.field_103215_w = var2.field_103240_x = var2.field_103238_y = 0.0D;
      }
   }

   public boolean func_110141_b(C_100873_xe var1, C_100730_lb var2, double var3, double var5, double var7, float var9) {
      short var10 = 128;
      double var11 = -1.0D;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = C_100650_jv.func_108910_c(var2.field_103221_t);
      int var17 = C_100650_jv.func_108910_c(var2.field_103217_v);

      int var18;
      double var25;
      for(var18 = var16 - var10; var18 <= var16 + var10; ++var18) {
         double var19 = (double)var18 + 0.5D - var2.field_103221_t;

         for(int var21 = var17 - var10; var21 <= var17 + var10; ++var21) {
            double var22 = (double)var21 + 0.5D - var2.field_103217_v;

            for(int var24 = var1.func_109475_O() - 1; var24 >= 0; --var24) {
               if(var1.func_109349_a(var18, var24, var21) == C_100451_alf.field_106143_bh.field_106162_cm) {
                  while(var1.func_109349_a(var18, var24 - 1, var21) == C_100451_alf.field_106143_bh.field_106162_cm) {
                     --var24;
                  }

                  var25 = (double)var24 + 0.5D - var2.field_103219_u;
                  double var27 = var19 * var19 + var25 * var25 + var22 * var22;
                  if(var11 < 0.0D || var27 < var11) {
                     var11 = var27;
                     var13 = var18;
                     var14 = var24;
                     var15 = var21;
                  }
               }
            }
         }
      }

      if(var11 < 0.0D) {
         return false;
      } else {
         double var46 = (double)var13 + 0.5D;
         double var23 = (double)var14 + 0.5D;
         var25 = (double)var15 + 0.5D;
         int var47 = -1;
         if(var1.func_109349_a(var13 - 1, var14, var15) == C_100451_alf.field_106143_bh.field_106162_cm) {
            var47 = 2;
         }

         if(var1.func_109349_a(var13 + 1, var14, var15) == C_100451_alf.field_106143_bh.field_106162_cm) {
            var47 = 0;
         }

         if(var1.func_109349_a(var13, var14, var15 - 1) == C_100451_alf.field_106143_bh.field_106162_cm) {
            var47 = 3;
         }

         if(var1.func_109349_a(var13, var14, var15 + 1) == C_100451_alf.field_106143_bh.field_106162_cm) {
            var47 = 1;
         }

         int var28 = var2.func_103106_at();
         if(var47 > -1) {
            int var29 = C_100015_i.field_105284_h[var47];
            int var30 = C_100015_i.field_105283_a[var47];
            int var31 = C_100015_i.field_105281_b[var47];
            int var32 = C_100015_i.field_105283_a[var29];
            int var33 = C_100015_i.field_105281_b[var29];
            boolean var34 = !var1.func_109352_c(var13 + var30 + var32, var14, var15 + var31 + var33) || !var1.func_109352_c(var13 + var30 + var32, var14 + 1, var15 + var31 + var33);
            boolean var35 = !var1.func_109352_c(var13 + var30, var14, var15 + var31) || !var1.func_109352_c(var13 + var30, var14 + 1, var15 + var31);
            if(var34 && var35) {
               var47 = C_100015_i.field_105277_f[var47];
               var29 = C_100015_i.field_105277_f[var29];
               var30 = C_100015_i.field_105283_a[var47];
               var31 = C_100015_i.field_105281_b[var47];
               var32 = C_100015_i.field_105283_a[var29];
               var33 = C_100015_i.field_105281_b[var29];
               var18 = var13 - var32;
               var46 -= (double)var32;
               int var20 = var15 - var33;
               var25 -= (double)var33;
               var34 = !var1.func_109352_c(var18 + var30 + var32, var14, var20 + var31 + var33) || !var1.func_109352_c(var18 + var30 + var32, var14 + 1, var20 + var31 + var33);
               var35 = !var1.func_109352_c(var18 + var30, var14, var20 + var31) || !var1.func_109352_c(var18 + var30, var14 + 1, var20 + var31);
            }

            float var36 = 0.5F;
            float var37 = 0.5F;
            if(!var34 && var35) {
               var36 = 1.0F;
            } else if(var34 && !var35) {
               var36 = 0.0F;
            } else if(var34 && var35) {
               var37 = 0.0F;
            }

            var46 += (double)((float)var32 * var36 + var37 * (float)var30);
            var25 += (double)((float)var33 * var36 + var37 * (float)var31);
            float var38 = 0.0F;
            float var39 = 0.0F;
            float var40 = 0.0F;
            float var41 = 0.0F;
            if(var47 == var28) {
               var38 = 1.0F;
               var39 = 1.0F;
            } else if(var47 == C_100015_i.field_105277_f[var28]) {
               var38 = -1.0F;
               var39 = -1.0F;
            } else if(var47 == C_100015_i.field_105278_g[var28]) {
               var40 = 1.0F;
               var41 = -1.0F;
            } else {
               var40 = -1.0F;
               var41 = 1.0F;
            }

            double var42 = var2.field_103215_w;
            double var44 = var2.field_103238_y;
            var2.field_103215_w = var42 * (double)var38 + var44 * (double)var41;
            var2.field_103238_y = var42 * (double)var40 + var44 * (double)var39;
            var2.field_103236_z = var9 - (float)(var28 * 90) + (float)(var47 * 90);
         } else {
            var2.field_103215_w = var2.field_103240_x = var2.field_103238_y = 0.0D;
         }

         var2.func_103055_b(var46, var23, var25, var2.field_103236_z, var2.field_103177_A);
         return true;
      }
   }

   public boolean func_110140_a(C_100873_xe var1, C_100730_lb var2) {
      byte var3 = 16;
      double var4 = -1.0D;
      int var6 = C_100650_jv.func_108910_c(var2.field_103221_t);
      int var7 = C_100650_jv.func_108910_c(var2.field_103219_u);
      int var8 = C_100650_jv.func_108910_c(var2.field_103217_v);
      int var9 = var6;
      int var10 = var7;
      int var11 = var8;
      int var12 = 0;
      int var13 = this.field_110143_a.nextInt(4);

      int var14;
      double var15;
      int var17;
      double var18;
      int var21;
      int var20;
      int var23;
      int var22;
      int var25;
      int var24;
      int var27;
      int var26;
      int var28;
      double var34;
      double var32;
      for(var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
         var15 = (double)var14 + 0.5D - var2.field_103221_t;

         for(var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
            var18 = (double)var17 + 0.5D - var2.field_103217_v;

            label274:
            for(var20 = var1.func_109475_O() - 1; var20 >= 0; --var20) {
               if(var1.func_109352_c(var14, var20, var17)) {
                  while(var20 > 0 && var1.func_109352_c(var14, var20 - 1, var17)) {
                     --var20;
                  }

                  for(var21 = var13; var21 < var13 + 4; ++var21) {
                     var22 = var21 % 2;
                     var23 = 1 - var22;
                     if(var21 % 4 >= 2) {
                        var22 = -var22;
                        var23 = -var23;
                     }

                     for(var24 = 0; var24 < 3; ++var24) {
                        for(var25 = 0; var25 < 4; ++var25) {
                           for(var26 = -1; var26 < 4; ++var26) {
                              var27 = var14 + (var25 - 1) * var22 + var24 * var23;
                              var28 = var20 + var26;
                              int var29 = var17 + (var25 - 1) * var23 - var24 * var22;
                              if(var26 < 0 && !var1.func_109350_f(var27, var28, var29).func_108983_a() || var26 >= 0 && !var1.func_109352_c(var27, var28, var29)) {
                                 continue label274;
                              }
                           }
                        }
                     }

                     var32 = (double)var20 + 0.5D - var2.field_103219_u;
                     var34 = var15 * var15 + var32 * var32 + var18 * var18;
                     if(var4 < 0.0D || var34 < var4) {
                        var4 = var34;
                        var9 = var14;
                        var10 = var20;
                        var11 = var17;
                        var12 = var21 % 4;
                     }
                  }
               }
            }
         }
      }

      if(var4 < 0.0D) {
         for(var14 = var6 - var3; var14 <= var6 + var3; ++var14) {
            var15 = (double)var14 + 0.5D - var2.field_103221_t;

            for(var17 = var8 - var3; var17 <= var8 + var3; ++var17) {
               var18 = (double)var17 + 0.5D - var2.field_103217_v;

               label222:
               for(var20 = var1.func_109475_O() - 1; var20 >= 0; --var20) {
                  if(var1.func_109352_c(var14, var20, var17)) {
                     while(var20 > 0 && var1.func_109352_c(var14, var20 - 1, var17)) {
                        --var20;
                     }

                     for(var21 = var13; var21 < var13 + 2; ++var21) {
                        var22 = var21 % 2;
                        var23 = 1 - var22;

                        for(var24 = 0; var24 < 4; ++var24) {
                           for(var25 = -1; var25 < 4; ++var25) {
                              var26 = var14 + (var24 - 1) * var22;
                              var27 = var20 + var25;
                              var28 = var17 + (var24 - 1) * var23;
                              if(var25 < 0 && !var1.func_109350_f(var26, var27, var28).func_108983_a() || var25 >= 0 && !var1.func_109352_c(var26, var27, var28)) {
                                 continue label222;
                              }
                           }
                        }

                        var32 = (double)var20 + 0.5D - var2.field_103219_u;
                        var34 = var15 * var15 + var32 * var32 + var18 * var18;
                        if(var4 < 0.0D || var34 < var4) {
                           var4 = var34;
                           var9 = var14;
                           var10 = var20;
                           var11 = var17;
                           var12 = var21 % 2;
                        }
                     }
                  }
               }
            }
         }
      }

      int var30 = var9;
      int var16 = var10;
      var17 = var11;
      int var31 = var12 % 2;
      int var19 = 1 - var31;
      if(var12 % 4 >= 2) {
         var31 = -var31;
         var19 = -var19;
      }

      boolean var33;
      if(var4 < 0.0D) {
         if(var10 < 70) {
            var10 = 70;
         }

         if(var10 > var1.func_109475_O() - 10) {
            var10 = var1.func_109475_O() - 10;
         }

         var16 = var10;

         for(var20 = -1; var20 <= 1; ++var20) {
            for(var21 = 1; var21 < 3; ++var21) {
               for(var22 = -1; var22 < 3; ++var22) {
                  var23 = var30 + (var21 - 1) * var31 + var20 * var19;
                  var24 = var16 + var22;
                  var25 = var17 + (var21 - 1) * var19 - var20 * var31;
                  var33 = var22 < 0;
                  var1.func_109422_e(var23, var24, var25, var33?C_100451_alf.field_106210_as.field_106162_cm:0);
               }
            }
         }
      }

      for(var20 = 0; var20 < 4; ++var20) {
         var1.field_109579_s = true;

         for(var21 = 0; var21 < 4; ++var21) {
            for(var22 = -1; var22 < 4; ++var22) {
               var23 = var30 + (var21 - 1) * var31;
               var24 = var16 + var22;
               var25 = var17 + (var21 - 1) * var19;
               var33 = var21 == 0 || var21 == 3 || var22 == -1 || var22 == 3;
               var1.func_109422_e(var23, var24, var25, var33?C_100451_alf.field_106210_as.field_106162_cm:C_100451_alf.field_106143_bh.field_106162_cm);
            }
         }

         var1.field_109579_s = false;

         for(var21 = 0; var21 < 4; ++var21) {
            for(var22 = -1; var22 < 4; ++var22) {
               var23 = var30 + (var21 - 1) * var31;
               var24 = var16 + var22;
               var25 = var17 + (var21 - 1) * var19;
               var1.func_109460_h(var23, var24, var25, var1.func_109349_a(var23, var24, var25));
            }
         }
      }

      return true;
   }
}
