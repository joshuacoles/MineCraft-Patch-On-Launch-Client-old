
public class C_101020_ti extends C_100992_tt {

   public C_101020_ti(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111413_f);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.func_109349_a(var4, var5, var6);
      int var12 = var3.func_109357_g(var4, var5, var6);
      if(var2.func_103799_a(var4, var5, var6, var7, var1) && var11 == C_100451_alf.field_106223_bL.field_106162_cm && !C_100449_ald.func_106434_e(var12)) {
         if(var3.field_109557_J) {
            return true;
         } else {
            var3.func_109488_c(var4, var5, var6, var12 + 4);
            --var1.field_111398_a;

            int var13;
            for(var13 = 0; var13 < 16; ++var13) {
               double var14 = (double)((float)var4 + (5.0F + field_110833_d.nextFloat() * 6.0F) / 16.0F);
               double var16 = (double)((float)var5 + 0.8125F);
               double var18 = (double)((float)var6 + (5.0F + field_110833_d.nextFloat() * 6.0F) / 16.0F);
               double var20 = 0.0D;
               double var22 = 0.0D;
               double var24 = 0.0D;
               var3.func_109428_a("smoke", var14, var16, var18, var20, var22, var24);
            }

            var13 = var12 & 3;
            int var26 = 0;
            int var15 = 0;
            boolean var27 = false;
            boolean var17 = true;
            int var28 = C_100015_i.field_105278_g[var13];

            int var19;
            int var21;
            int var23;
            int var29;
            int var30;
            for(var19 = -2; var19 <= 2; ++var19) {
               var29 = var4 + C_100015_i.field_105283_a[var28] * var19;
               var21 = var6 + C_100015_i.field_105281_b[var28] * var19;
               var30 = var3.func_109349_a(var29, var5, var21);
               if(var30 == C_100451_alf.field_106223_bL.field_106162_cm) {
                  var23 = var3.func_109357_g(var29, var5, var21);
                  if(!C_100449_ald.func_106434_e(var23)) {
                     var17 = false;
                     break;
                  }

                  var15 = var19;
                  if(!var27) {
                     var26 = var19;
                     var27 = true;
                  }
               }
            }

            if(var17 && var15 == var26 + 2) {
               for(var19 = var26; var19 <= var15; ++var19) {
                  var29 = var4 + C_100015_i.field_105283_a[var28] * var19;
                  var21 = var6 + C_100015_i.field_105281_b[var28] * var19;
                  var29 += C_100015_i.field_105283_a[var13] * 4;
                  var21 += C_100015_i.field_105281_b[var13] * 4;
                  var30 = var3.func_109349_a(var29, var5, var21);
                  var23 = var3.func_109357_g(var29, var5, var21);
                  if(var30 != C_100451_alf.field_106223_bL.field_106162_cm || !C_100449_ald.func_106434_e(var23)) {
                     var17 = false;
                     break;
                  }
               }

               for(var19 = var26 - 1; var19 <= var15 + 1; var19 += 4) {
                  for(var29 = 1; var29 <= 3; ++var29) {
                     var21 = var4 + C_100015_i.field_105283_a[var28] * var19;
                     var30 = var6 + C_100015_i.field_105281_b[var28] * var19;
                     var21 += C_100015_i.field_105283_a[var13] * var29;
                     var30 += C_100015_i.field_105281_b[var13] * var29;
                     var23 = var3.func_109349_a(var21, var5, var30);
                     int var31 = var3.func_109357_g(var21, var5, var30);
                     if(var23 != C_100451_alf.field_106223_bL.field_106162_cm || !C_100449_ald.func_106434_e(var31)) {
                        var17 = false;
                        break;
                     }
                  }
               }

               if(var17) {
                  for(var19 = var26; var19 <= var15; ++var19) {
                     for(var29 = 1; var29 <= 3; ++var29) {
                        var21 = var4 + C_100015_i.field_105283_a[var28] * var19;
                        var30 = var6 + C_100015_i.field_105281_b[var28] * var19;
                        var21 += C_100015_i.field_105283_a[var13] * var29;
                        var30 += C_100015_i.field_105281_b[var13] * var29;
                        var3.func_109422_e(var21, var5, var30, C_100451_alf.field_106229_bK.field_106162_cm);
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      C_100383_amu var4 = this.func_110773_a(var2, var3, false);
      if(var4 != null && var4.field_107840_a == C_100389_amv.field_107877_a) {
         int var5 = var2.func_109349_a(var4.field_107838_b, var4.field_107839_c, var4.field_107836_d);
         if(var5 == C_100451_alf.field_106223_bL.field_106162_cm) {
            return var1;
         }
      }

      if(!var2.field_109557_J) {
         C_100851_xw var7 = var2.func_109517_b("Stronghold", (int)var3.field_103221_t, (int)var3.field_103219_u, (int)var3.field_103217_v);
         if(var7 != null) {
            C_101088_qj var6 = new C_101088_qj(var2, var3.field_103221_t, var3.field_103219_u + 1.62D - (double)var3.field_103181_M, var3.field_103217_v);
            var6.func_104699_a((double)var7.field_110207_a, var7.field_110205_b, (double)var7.field_110206_c);
            var2.func_109513_d(var6);
            var2.func_109412_a(var3, "random.bow", 0.5F, 0.4F / (field_110833_d.nextFloat() * 0.4F + 0.8F));
            var2.func_109492_a((C_101095_qg)null, 1002, (int)var3.field_103221_t, (int)var3.field_103219_u, (int)var3.field_103217_v, 0);
            if(!var3.field_103869_cf.field_111597_d) {
               --var1.field_111398_a;
            }
         }
      }

      return var1;
   }
}
