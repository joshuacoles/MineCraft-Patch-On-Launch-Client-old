import java.util.Random;

public class C_100586_aay extends C_100562_aan {

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      int var10;
      int var11;
      int var12;
      for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               C_100664_afg var13 = var1.func_109350_f(var10, var11, var12);
               if(var11 == var4 - 1 && !var13.func_108983_a()) {
                  return false;
               }

               if(var11 == var4 + var6 + 1 && !var13.func_108983_a()) {
                  return false;
               }

               if((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.func_109352_c(var10, var11, var12) && var1.func_109352_c(var10, var11 + 1, var12)) {
                  ++var9;
               }
            }
         }
      }

      if(var9 >= 1 && var9 <= 5) {
         for(var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
            for(var11 = var4 + var6; var11 >= var4 - 1; --var11) {
               for(var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
                  if(var10 != var3 - var7 - 1 && var11 != var4 - 1 && var12 != var5 - var8 - 1 && var10 != var3 + var7 + 1 && var11 != var4 + var6 + 1 && var12 != var5 + var8 + 1) {
                     var1.func_109422_e(var10, var11, var12, 0);
                  } else if(var11 >= 0 && !var1.func_109350_f(var10, var11 - 1, var12).func_108983_a()) {
                     var1.func_109422_e(var10, var11, var12, 0);
                  } else if(var1.func_109350_f(var10, var11, var12).func_108983_a()) {
                     if(var11 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.func_109422_e(var10, var11, var12, C_100451_alf.field_106212_ar.field_106162_cm);
                     } else {
                        var1.func_109422_e(var10, var11, var12, C_100451_alf.field_106119_z.field_106162_cm);
                     }
                  }
               }
            }
         }

         var10 = 0;

         while(var10 < 2) {
            var11 = 0;

            while(true) {
               if(var11 < 3) {
                  label210: {
                     var12 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
                     int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
                     if(var1.func_109352_c(var12, var4, var14)) {
                        int var15 = 0;
                        if(var1.func_109350_f(var12 - 1, var4, var14).func_108983_a()) {
                           ++var15;
                        }

                        if(var1.func_109350_f(var12 + 1, var4, var14).func_108983_a()) {
                           ++var15;
                        }

                        if(var1.func_109350_f(var12, var4, var14 - 1).func_108983_a()) {
                           ++var15;
                        }

                        if(var1.func_109350_f(var12, var4, var14 + 1).func_108983_a()) {
                           ++var15;
                        }

                        if(var15 == 1) {
                           var1.func_109422_e(var12, var4, var14, C_100451_alf.field_106216_ax.field_106162_cm);
                           C_100422_amb var16 = (C_100422_amb)var1.func_109353_p(var12, var4, var14);
                           if(var16 != null) {
                              for(int var17 = 0; var17 < 8; ++var17) {
                                 C_100994_tv var18 = this.func_108024_a(var2);
                                 if(var18 != null) {
                                    var16.func_103006_a(var2.nextInt(var16.func_103003_k_()), var18);
                                 }
                              }
                           }
                           break label210;
                        }
                     }

                     ++var11;
                     continue;
                  }
               }

               ++var10;
               break;
            }
         }

         var1.func_109422_e(var3, var4, var5, C_100451_alf.field_106220_av.field_106162_cm);
         C_100416_amh var19 = (C_100416_amh)var1.func_109353_p(var3, var4, var5);
         if(var19 != null) {
            var19.func_102976_a(this.func_108023_b(var2));
         } else {
            System.err.println("Failed to fetch mob spawner entity at (" + var3 + ", " + var4 + ", " + var5 + ")");
         }

         return true;
      } else {
         return false;
      }
   }

   private C_100994_tv func_108024_a(Random var1) {
      int var2 = var1.nextInt(11);
      return var2 == 0?new C_100994_tv(C_100992_tt.field_110913_aA):(var2 == 1?new C_100994_tv(C_100992_tt.field_110839_o, var1.nextInt(4) + 1):(var2 == 2?new C_100994_tv(C_100992_tt.field_110820_U):(var2 == 3?new C_100994_tv(C_100992_tt.field_110821_T, var1.nextInt(4) + 1):(var2 == 4?new C_100994_tv(C_100992_tt.field_110813_M, var1.nextInt(4) + 1):(var2 == 5?new C_100994_tv(C_100992_tt.field_110819_K, var1.nextInt(4) + 1):(var2 == 6?new C_100994_tv(C_100992_tt.field_110936_aw):(var2 == 7 && var1.nextInt(100) == 0?new C_100994_tv(C_100992_tt.field_110926_at):(var2 == 8 && var1.nextInt(2) == 0?new C_100994_tv(C_100992_tt.field_110915_aC, var1.nextInt(4) + 1):(var2 == 9 && var1.nextInt(10) == 0?new C_100994_tv(C_100992_tt.field_110834_e[C_100992_tt.field_110925_bU.field_110891_cf + var1.nextInt(2)]):(var2 == 10?new C_100994_tv(C_100992_tt.field_110904_aW, 1, 3):null))))))))));
   }

   private String func_108023_b(Random var1) {
      int var2 = var1.nextInt(4);
      return var2 == 0?"Skeleton":(var2 == 1?"Zombie":(var2 == 2?"Zombie":(var2 == 3?"Spider":"")));
   }
}
