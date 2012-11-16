import java.util.List;

public class C_100986_tx extends C_101037_sp {

   protected C_100986_tx(int var1) {
      super(var1);
      this.func_110800_a(true);
   }

   public static C_100282_agl func_111041_a(short var0, C_100873_xe var1) {
      String var2 = "map_" + var0;
      C_100282_agl var3 = (C_100282_agl)var1.func_109520_a(C_100282_agl.class, var2);
      if(var3 == null) {
         var3 = new C_100282_agl(var2);
         var1.func_109468_a(var2, var3);
      }

      return var3;
   }

   public C_100282_agl func_111042_a(C_100994_tv var1, C_100873_xe var2) {
      String var3 = "map_" + var1.func_111367_j();
      C_100282_agl var4 = (C_100282_agl)var2.func_109520_a(C_100282_agl.class, var3);
      if(var4 == null && !var2.field_109557_J) {
         var1.func_111371_b(var2.func_109400_b("map"));
         var3 = "map_" + var1.func_111367_j();
         var4 = new C_100282_agl(var3);
         var4.field_107294_d = 3;
         int var5 = 128 * (1 << var4.field_107294_d);
         var4.field_107298_a = Math.round((float)var2.func_109429_J().func_107152_c() / (float)var5) * var5;
         var4.field_107296_b = Math.round((float)(var2.func_109429_J().func_107146_e() / var5)) * var5;
         var4.field_107297_c = (byte)var2.field_109576_v.field_112401_h;
         var4.func_107264_c();
         var2.func_109468_a(var3, var4);
      }

      return var4;
   }

   public void func_111043_a(C_100873_xe var1, C_100730_lb var2, C_100282_agl var3) {
      if(var1.field_109576_v.field_112401_h == var3.field_107297_c && var2 instanceof C_101095_qg) {
         short var4 = 128;
         short var5 = 128;
         int var6 = 1 << var3.field_107294_d;
         int var7 = var3.field_107298_a;
         int var8 = var3.field_107296_b;
         int var9 = C_100650_jv.func_108910_c(var2.field_103221_t - (double)var7) / var6 + var4 / 2;
         int var10 = C_100650_jv.func_108910_c(var2.field_103217_v - (double)var8) / var6 + var5 / 2;
         int var11 = 128 / var6;
         if(var1.field_109576_v.field_112394_f) {
            var11 /= 2;
         }

         C_100284_agm var12 = var3.func_107286_a((C_101095_qg)var2);
         ++var12.field_107303_d;

         for(int var13 = var9 - var11 + 1; var13 < var9 + var11; ++var13) {
            if((var13 & 15) == (var12.field_107303_d & 15)) {
               int var14 = 255;
               int var15 = 0;
               double var16 = 0.0D;

               for(int var18 = var10 - var11 - 1; var18 < var10 + var11; ++var18) {
                  if(var13 >= 0 && var18 >= -1 && var13 < var4 && var18 < var5) {
                     int var19 = var13 - var9;
                     int var20 = var18 - var10;
                     boolean var21 = var19 * var19 + var20 * var20 > (var11 - 2) * (var11 - 2);
                     int var22 = (var7 / var6 + var13 - var4 / 2) * var6;
                     int var23 = (var8 / var6 + var18 - var5 / 2) * var6;
                     int[] var24 = new int[256];
                     C_101272_za var25 = var1.func_109377_d(var22, var23);
                     if(!var25.func_112320_g()) {
                        int var26 = var22 & 15;
                        int var27 = var23 & 15;
                        int var28 = 0;
                        double var29 = 0.0D;
                        int var31;
                        int var32;
                        int var33;
                        int var36;
                        if(var1.field_109576_v.field_112394_f) {
                           var31 = var22 + var23 * 231871;
                           var31 = var31 * var31 * 31287121 + var31 * 11;
                           if((var31 >> 20 & 1) == 0) {
                              var24[C_100451_alf.field_106120_y.field_106162_cm] += 10;
                           } else {
                              var24[C_100451_alf.field_106111_w.field_106162_cm] += 10;
                           }

                           var29 = 100.0D;
                        } else {
                           for(var31 = 0; var31 < var6; ++var31) {
                              for(var32 = 0; var32 < var6; ++var32) {
                                 var33 = var25.func_112313_b(var31 + var26, var32 + var27) + 1;
                                 int var34 = 0;
                                 if(var33 > 1) {
                                    boolean var35;
                                    do {
                                       var35 = true;
                                       var34 = var25.func_112312_a(var31 + var26, var33 - 1, var32 + var27);
                                       if(var34 == 0) {
                                          var35 = false;
                                       } else if(var33 > 0 && var34 > 0 && C_100451_alf.field_106118_p[var34].field_106204_cB.field_108997_G == C_100668_afi.field_109066_b) {
                                          var35 = false;
                                       }

                                       if(!var35) {
                                          --var33;
                                          if(var33 <= 0) {
                                             break;
                                          }

                                          var34 = var25.func_112312_a(var31 + var26, var33 - 1, var32 + var27);
                                       }
                                    } while(var33 > 0 && !var35);

                                    if(var33 > 0 && var34 != 0 && C_100451_alf.field_106118_p[var34].field_106204_cB.func_108986_d()) {
                                       var36 = var33 - 1;
                                       boolean var37 = false;

                                       int var43;
                                       do {
                                          var43 = var25.func_112312_a(var31 + var26, var36--, var32 + var27);
                                          ++var28;
                                       } while(var36 > 0 && var43 != 0 && C_100451_alf.field_106118_p[var43].field_106204_cB.func_108986_d());
                                    }
                                 }

                                 var29 += (double)var33 / (double)(var6 * var6);
                                 ++var24[var34];
                              }
                           }
                        }

                        var28 /= var6 * var6;
                        var31 = 0;
                        var32 = 0;

                        for(var33 = 0; var33 < 256; ++var33) {
                           if(var24[var33] > var31) {
                              var32 = var33;
                              var31 = var24[var33];
                           }
                        }

                        double var40 = (var29 - var16) * 4.0D / (double)(var6 + 4) + ((double)(var13 + var18 & 1) - 0.5D) * 0.4D;
                        byte var39 = 1;
                        if(var40 > 0.6D) {
                           var39 = 2;
                        }

                        if(var40 < -0.6D) {
                           var39 = 0;
                        }

                        var36 = 0;
                        if(var32 > 0) {
                           C_100668_afi var42 = C_100451_alf.field_106118_p[var32].field_106204_cB.field_108997_G;
                           if(var42 == C_100668_afi.field_109069_n) {
                              var40 = (double)var28 * 0.1D + (double)(var13 + var18 & 1) * 0.2D;
                              var39 = 1;
                              if(var40 < 0.5D) {
                                 var39 = 2;
                              }

                              if(var40 > 0.9D) {
                                 var39 = 0;
                              }
                           }

                           var36 = var42.field_109077_q;
                        }

                        var16 = var29;
                        if(var18 >= 0 && var19 * var19 + var20 * var20 < var11 * var11 && (!var21 || (var13 + var18 & 1) != 0)) {
                           byte var41 = var3.field_107295_e[var13 + var18 * var4];
                           byte var38 = (byte)(var36 * 4 + var39);
                           if(var41 != var38) {
                              if(var14 > var18) {
                                 var14 = var18;
                              }

                              if(var15 < var18) {
                                 var15 = var18;
                              }

                              var3.field_107295_e[var13 + var18 * var4] = var38;
                           }
                        }
                     }
                  }
               }

               if(var14 <= var15) {
                  var3.func_107291_a(var13, var14, var15);
               }
            }
         }

      }
   }

   public void func_110780_a(C_100994_tv var1, C_100873_xe var2, C_100730_lb var3, int var4, boolean var5) {
      if(!var2.field_109557_J) {
         C_100282_agl var6 = this.func_111042_a(var1, var2);
         if(var3 instanceof C_101095_qg) {
            C_101095_qg var7 = (C_101095_qg)var3;
            var6.func_107288_a(var7, var1);
         }

         if(var5) {
            this.func_111043_a(var2, var3, var6);
         }

      }
   }

   public C_100219_dx func_111040_c(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      byte[] var4 = this.func_111042_a(var1, var2).func_107289_a(var1, var2, var3);
      return var4 == null?null:new C_100386_cr((short)C_100992_tt.field_110882_bd.field_110891_cf, (short)var1.func_111367_j(), var4);
   }

   public void func_110762_d(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(var1.func_111339_o() && var1.func_111352_p().func_107519_n("map_is_scaling")) {
         C_100282_agl var4 = C_100992_tt.field_110882_bd.func_111042_a(var1, var2);
         var1.func_111371_b(var2.func_109400_b("map"));
         C_100282_agl var5 = new C_100282_agl("map_" + var1.func_111367_j());
         var5.field_107294_d = (byte)(var4.field_107294_d + 1);
         if(var5.field_107294_d > 4) {
            var5.field_107294_d = 4;
         }

         var5.field_107298_a = var4.field_107298_a;
         var5.field_107296_b = var4.field_107296_b;
         var5.field_107297_c = var4.field_107297_c;
         var5.func_107264_c();
         var2.func_109468_a("map_" + var1.func_111367_j(), var5);
      }

   }

   public void func_110784_a(C_100994_tv var1, C_101095_qg var2, List var3, boolean var4) {
      C_100282_agl var5 = this.func_111042_a(var1, var2.field_103229_p);
      if(var4) {
         if(var5 == null) {
            var3.add("Unknown map");
         } else {
            var3.add("Scaling at 1:" + (1 << var5.field_107294_d));
            var3.add("(Level " + var5.field_107294_d + "/" + 4 + ")");
         }
      }

   }
}
