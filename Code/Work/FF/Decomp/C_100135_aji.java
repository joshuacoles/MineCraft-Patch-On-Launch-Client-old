import java.util.List;
import java.util.Random;

public class C_100135_aji extends C_100437_aln {

   private int field_106426_cD;
   public static final String[] field_106425_a = new String[]{"oak", "spruce", "birch", "jungle"};
   int[] field_106424_b;


   protected C_100135_aji(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109017_j, false);
      this.field_106426_cD = var2;
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public int func_106039_o() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return C_100866_xa.func_110297_a(var1, var3);
   }

   public int func_106025_g_(int var1) {
      return (var1 & 3) == 1?C_100866_xa.func_110293_a():((var1 & 3) == 2?C_100866_xa.func_110296_b():C_100866_xa.func_110295_c());
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      if((var5 & 3) == 1) {
         return C_100866_xa.func_110293_a();
      } else if((var5 & 3) == 2) {
         return C_100866_xa.func_110296_b();
      } else {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;

         for(int var9 = -1; var9 <= 1; ++var9) {
            for(int var10 = -1; var10 <= 1; ++var10) {
               int var11 = var1.func_109362_a(var2 + var10, var4 + var9).func_112446_l();
               var6 += (var11 & 16711680) >> 16;
               var7 += (var11 & '\uff00') >> 8;
               var8 += var11 & 255;
            }
         }

         return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
      }
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7 = 1;
      int var8 = var7 + 1;
      if(var1.func_109480_d(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  int var12 = var1.func_109349_a(var2 + var9, var3 + var10, var4 + var11);
                  if(var12 == C_100451_alf.field_106080_N.field_106162_cm) {
                     int var13 = var1.func_109357_g(var2 + var9, var3 + var10, var4 + var11);
                     var1.func_109441_d(var2 + var9, var3 + var10, var4 + var11, var13 | 8);
                  }
               }
            }
         }
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         if((var6 & 8) != 0 && (var6 & 4) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if(this.field_106424_b == null) {
               this.field_106424_b = new int[var9 * var9 * var9];
            }

            int var12;
            if(var1.func_109480_d(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
               int var13;
               int var14;
               int var15;
               for(var12 = -var7; var12 <= var7; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        var15 = var1.func_109349_a(var2 + var12, var3 + var13, var4 + var14);
                        if(var15 == C_100451_alf.field_106079_M.field_106162_cm) {
                           this.field_106424_b[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        } else if(var15 == C_100451_alf.field_106080_N.field_106162_cm) {
                           this.field_106424_b[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                        } else {
                           this.field_106424_b[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                        }
                     }
                  }
               }

               for(var12 = 1; var12 <= 4; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        for(var15 = -var7; var15 <= var7; ++var15) {
                           if(this.field_106424_b[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1) {
                              if(this.field_106424_b[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                 this.field_106424_b[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                              }

                              if(this.field_106424_b[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                 this.field_106424_b[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                              }

                              if(this.field_106424_b[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] == -2) {
                                 this.field_106424_b[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] = var12;
                              }

                              if(this.field_106424_b[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] == -2) {
                                 this.field_106424_b[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] = var12;
                              }

                              if(this.field_106424_b[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] == -2) {
                                 this.field_106424_b[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] = var12;
                              }

                              if(this.field_106424_b[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] == -2) {
                                 this.field_106424_b[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] = var12;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.field_106424_b[var11 * var10 + var11 * var9 + var11];
            if(var12 >= 0) {
               var1.func_109441_d(var2, var3, var4, var6 & -9);
            } else {
               this.func_106422_l(var1, var2, var3, var4);
            }
         }

      }
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var1.func_109515_B(var2, var3 + 1, var4) && !var1.func_109348_t(var2, var3 - 1, var4) && var5.nextInt(15) == 1) {
         double var6 = (double)((float)var2 + var5.nextFloat());
         double var8 = (double)var3 - 0.05D;
         double var10 = (double)((float)var4 + var5.nextFloat());
         var1.func_109428_a("dripWater", var6, var8, var10, 0.0D, 0.0D, 0.0D);
      }

   }

   private void func_106422_l(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
      var1.func_109422_e(var2, var3, var4, 0);
   }

   public int func_106063_a(Random var1) {
      return var1.nextInt(20) == 0?1:0;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106076_B.field_106162_cm;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_109557_J) {
         byte var8 = 20;
         if((var5 & 3) == 3) {
            var8 = 40;
         }

         if(var1.field_109577_u.nextInt(var8) == 0) {
            int var9 = this.func_106043_a(var5, var1.field_109577_u, var7);
            this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(var9, 1, this.func_106004_b(var5)));
         }

         if((var5 & 3) == 0 && var1.field_109577_u.nextInt(200) == 0) {
            this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(C_100992_tt.field_110842_j, 1, 0));
         }
      }

   }

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      if(!var1.field_109557_J && var2.func_103780_bP() != null && var2.func_103780_bP().field_111397_c == C_100992_tt.field_110883_be.field_110891_cf) {
         var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
         this.func_106042_a(var1, var3, var4, var5, new C_100994_tv(C_100451_alf.field_106080_N.field_106162_cm, 1, var6 & 3));
      } else {
         super.func_106026_a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int func_106004_b(int var1) {
      return var1 & 3;
   }

   public boolean func_105994_c() {
      return !this.field_106421_c;
   }

   public int func_106029_a(int var1, int var2) {
      return (var2 & 3) == 1?this.field_106165_cl + 80:((var2 & 3) == 3?this.field_106165_cl + 144:this.field_106165_cl);
   }

   public void func_106423_a(boolean var1) {
      this.field_106421_c = var1;
      this.field_106165_cl = this.field_106426_cD + (var1?0:1);
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
      var3.add(new C_100994_tv(var1, 1, 2));
      var3.add(new C_100994_tv(var1, 1, 3));
   }

}
