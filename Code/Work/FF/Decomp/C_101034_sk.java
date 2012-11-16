
public class C_101034_sk extends C_100992_tt {

   private int field_111039_a;


   public C_101034_sk(int var1, int var2) {
      super(var1);
      this.field_110888_cg = 1;
      this.field_111039_a = var2;
      this.func_110802_a(C_101040_sq.field_111413_f);
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      float var4 = 1.0F;
      double var5 = var3.field_103227_q + (var3.field_103221_t - var3.field_103227_q) * (double)var4;
      double var7 = var3.field_103225_r + (var3.field_103219_u - var3.field_103225_r) * (double)var4 + 1.62D - (double)var3.field_103181_M;
      double var9 = var3.field_103223_s + (var3.field_103217_v - var3.field_103223_s) * (double)var4;
      boolean var11 = this.field_111039_a == 0;
      C_100383_amu var12 = this.func_110773_a(var2, var3, var11);
      if(var12 == null) {
         return var1;
      } else {
         if(var12.field_107840_a == C_100389_amv.field_107877_a) {
            int var13 = var12.field_107838_b;
            int var14 = var12.field_107839_c;
            int var15 = var12.field_107836_d;
            if(!var2.func_109542_a(var3, var13, var14, var15)) {
               return var1;
            }

            if(this.field_111039_a == 0) {
               if(!var3.func_103799_a(var13, var14, var15, var12.field_107837_e, var1)) {
                  return var1;
               }

               if(var2.func_109350_f(var13, var14, var15) == C_100664_afg.field_109019_h && var2.func_109357_g(var13, var14, var15) == 0) {
                  var2.func_109422_e(var13, var14, var15, 0);
                  if(var3.field_103869_cf.field_111597_d) {
                     return var1;
                  }

                  if(--var1.field_111398_a <= 0) {
                     return new C_100994_tv(C_100992_tt.field_110934_ax);
                  }

                  if(!var3.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110934_ax))) {
                     var3.func_103767_c(new C_100994_tv(C_100992_tt.field_110934_ax.field_110891_cf, 1, 0));
                  }

                  return var1;
               }

               if(var2.func_109350_f(var13, var14, var15) == C_100664_afg.field_109020_i && var2.func_109357_g(var13, var14, var15) == 0) {
                  var2.func_109422_e(var13, var14, var15, 0);
                  if(var3.field_103869_cf.field_111597_d) {
                     return var1;
                  }

                  if(--var1.field_111398_a <= 0) {
                     return new C_100994_tv(C_100992_tt.field_110923_ay);
                  }

                  if(!var3.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110923_ay))) {
                     var3.func_103767_c(new C_100994_tv(C_100992_tt.field_110923_ay.field_110891_cf, 1, 0));
                  }

                  return var1;
               }
            } else {
               if(this.field_111039_a < 0) {
                  return new C_100994_tv(C_100992_tt.field_110936_aw);
               }

               if(var12.field_107837_e == 0) {
                  --var14;
               }

               if(var12.field_107837_e == 1) {
                  ++var14;
               }

               if(var12.field_107837_e == 2) {
                  --var15;
               }

               if(var12.field_107837_e == 3) {
                  ++var15;
               }

               if(var12.field_107837_e == 4) {
                  --var13;
               }

               if(var12.field_107837_e == 5) {
                  ++var13;
               }

               if(!var3.func_103799_a(var13, var14, var15, var12.field_107837_e, var1)) {
                  return var1;
               }

               if(this.func_111038_a(var2, var5, var7, var9, var13, var14, var15) && !var3.field_103869_cf.field_111597_d) {
                  return new C_100994_tv(C_100992_tt.field_110936_aw);
               }
            }
         } else if(this.field_111039_a == 0 && var12.field_107835_g instanceof C_100541_oj) {
            return new C_100994_tv(C_100992_tt.field_110919_aG);
         }

         return var1;
      }
   }

   public boolean func_111038_a(C_100873_xe var1, double var2, double var4, double var6, int var8, int var9, int var10) {
      if(this.field_111039_a <= 0) {
         return false;
      } else if(!var1.func_109352_c(var8, var9, var10) && var1.func_109350_f(var8, var9, var10).func_108983_a()) {
         return false;
      } else {
         if(var1.field_109576_v.field_112397_e && this.field_111039_a == C_100451_alf.field_106071_D.field_106162_cm) {
            var1.func_109476_a(var2 + 0.5D, var4 + 0.5D, var6 + 0.5D, "random.fizz", 0.5F, 2.6F + (var1.field_109577_u.nextFloat() - var1.field_109577_u.nextFloat()) * 0.8F);

            for(int var11 = 0; var11 < 8; ++var11) {
               var1.func_109428_a("largesmoke", (double)var8 + Math.random(), (double)var9 + Math.random(), (double)var10 + Math.random(), 0.0D, 0.0D, 0.0D);
            }
         } else {
            var1.func_109394_d(var8, var9, var10, this.field_111039_a, 0);
         }

         return true;
      }
   }
}
