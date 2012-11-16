import java.util.List;

public class C_101015_tf extends C_100992_tt {

   public static final String[] field_111027_a = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
   public static final int[] field_111026_b = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 2651799, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};


   public C_101015_tf(int var1) {
      super(var1);
      this.func_110800_a(true);
      this.func_110804_e(0);
      this.func_110802_a(C_101040_sq.field_111422_l);
   }

   public int func_110787_b(int var1) {
      int var2 = C_100650_jv.func_108923_a(var1, 0, 15);
      return this.field_110889_ch + var2 % 8 * 16 + var2 / 8;
   }

   public String func_110791_c_(C_100994_tv var1) {
      int var2 = C_100650_jv.func_108923_a(var1.func_111367_j(), 0, 15);
      return super.func_110793_a() + "." + field_111027_a[var2];
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11;
         int var12;
         if(var1.func_111367_j() == 15) {
            var11 = var3.func_109349_a(var4, var5, var6);
            if(var11 == C_100451_alf.field_106076_B.field_106162_cm) {
               if(!var3.field_109557_J) {
                  ((C_100482_akp)C_100451_alf.field_106076_B).func_106386_c(var3, var4, var5, var6, var3.field_109577_u);
                  --var1.field_111398_a;
               }

               return true;
            }

            if(var11 == C_100451_alf.field_106228_ai.field_106162_cm || var11 == C_100451_alf.field_106230_aj.field_106162_cm) {
               if(!var3.field_109557_J && ((C_100147_ajt)C_100451_alf.field_106118_p[var11]).func_106377_c(var3, var4, var5, var6, var3.field_109577_u)) {
                  --var1.field_111398_a;
               }

               return true;
            }

            if(var11 == C_100451_alf.field_106125_bw.field_106162_cm || var11 == C_100451_alf.field_106126_bv.field_106162_cm) {
               if(var3.func_109357_g(var4, var5, var6) == 7) {
                  return false;
               }

               if(!var3.field_109557_J) {
                  ((C_100468_akx)C_100451_alf.field_106118_p[var11]).func_106383_l(var3, var4, var5, var6);
                  --var1.field_111398_a;
               }

               return true;
            }

            if(var11 > 0 && C_100451_alf.field_106118_p[var11] instanceof C_100226_aif) {
               if(var3.func_109357_g(var4, var5, var6) == 7) {
                  return false;
               }

               if(!var3.field_109557_J) {
                  ((C_100226_aif)C_100451_alf.field_106118_p[var11]).func_106378_c_(var3, var4, var5, var6);
                  --var1.field_111398_a;
               }

               return true;
            }

            if(var11 == C_100451_alf.field_106211_bS.field_106162_cm) {
               if(!var3.field_109557_J) {
                  var3.func_109488_c(var4, var5, var6, 8 | C_100186_aij.func_106302_e(var3.func_109357_g(var4, var5, var6)));
                  --var1.field_111398_a;
               }

               return true;
            }

            if(var11 == C_100451_alf.field_106121_x.field_106162_cm) {
               if(!var3.field_109557_J) {
                  --var1.field_111398_a;

                  label137:
                  for(var12 = 0; var12 < 128; ++var12) {
                     int var13 = var4;
                     int var14 = var5 + 1;
                     int var15 = var6;

                     for(int var16 = 0; var16 < var12 / 16; ++var16) {
                        var13 += field_110833_d.nextInt(3) - 1;
                        var14 += (field_110833_d.nextInt(3) - 1) * field_110833_d.nextInt(3) / 2;
                        var15 += field_110833_d.nextInt(3) - 1;
                        if(var3.func_109349_a(var13, var14 - 1, var15) != C_100451_alf.field_106121_x.field_106162_cm || var3.func_109360_s(var13, var14, var15)) {
                           continue label137;
                        }
                     }

                     if(var3.func_109349_a(var13, var14, var15) == 0) {
                        if(field_110833_d.nextInt(10) != 0) {
                           if(C_100451_alf.field_106244_aa.func_106001_d(var3, var13, var14, var15)) {
                              var3.func_109394_d(var13, var14, var15, C_100451_alf.field_106244_aa.field_106162_cm, 1);
                           }
                        } else if(field_110833_d.nextInt(3) != 0) {
                           if(C_100451_alf.field_106248_ag.func_106001_d(var3, var13, var14, var15)) {
                              var3.func_109422_e(var13, var14, var15, C_100451_alf.field_106248_ag.field_106162_cm);
                           }
                        } else if(C_100451_alf.field_106250_ah.func_106001_d(var3, var13, var14, var15)) {
                           var3.func_109422_e(var13, var14, var15, C_100451_alf.field_106250_ah.field_106162_cm);
                        }
                     }
                  }
               }

               return true;
            }
         } else if(var1.func_111367_j() == 3) {
            var11 = var3.func_109349_a(var4, var5, var6);
            var12 = var3.func_109357_g(var4, var5, var6);
            if(var11 == C_100451_alf.field_106079_M.field_106162_cm && C_100435_alp.func_106415_e(var12) == 3) {
               if(var7 == 0) {
                  return false;
               }

               if(var7 == 1) {
                  return false;
               }

               if(var7 == 2) {
                  --var6;
               }

               if(var7 == 3) {
                  ++var6;
               }

               if(var7 == 4) {
                  --var4;
               }

               if(var7 == 5) {
                  ++var4;
               }

               if(var3.func_109352_c(var4, var5, var6)) {
                  var3.func_109422_e(var4, var5, var6, C_100451_alf.field_106211_bS.field_106162_cm);
                  if(var3.func_109349_a(var4, var5, var6) == C_100451_alf.field_106211_bS.field_106162_cm) {
                     C_100451_alf.field_106118_p[C_100451_alf.field_106211_bS.field_106162_cm].func_106065_a(var3, var4, var5, var6, var7, var8, var9, var10);
                  }

                  if(!var2.field_103869_cf.field_111597_d) {
                     --var1.field_111398_a;
                  }
               }

               return true;
            }
         }

         return false;
      }
   }

   public boolean func_110798_a(C_100994_tv var1, C_100595_ln var2) {
      if(var2 instanceof C_100555_oo) {
         C_100555_oo var3 = (C_100555_oo)var2;
         int var4 = C_100230_aib.func_106367_e_(var1.func_111367_j());
         if(!var3.func_103543_n() && var3.func_103546_m() != var4) {
            var3.func_103544_r(var4);
            --var1.field_111398_a;
         }

         return true;
      } else {
         return false;
      }
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      for(int var4 = 0; var4 < 16; ++var4) {
         var3.add(new C_100994_tv(var1, 1, var4));
      }

   }

}
