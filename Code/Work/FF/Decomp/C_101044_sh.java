
public class C_101044_sh extends C_100992_tt {

   public C_101044_sh(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111425_k);
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      C_100383_amu var4 = this.func_110773_a(var2, var3, true);
      if(var4 == null) {
         return var1;
      } else {
         if(var4.field_107840_a == C_100389_amv.field_107877_a) {
            int var5 = var4.field_107838_b;
            int var6 = var4.field_107839_c;
            int var7 = var4.field_107836_d;
            if(!var2.func_109542_a(var3, var5, var6, var7)) {
               return var1;
            }

            if(!var3.func_103799_a(var5, var6, var7, var4.field_107837_e, var1)) {
               return var1;
            }

            if(var2.func_109350_f(var5, var6, var7) == C_100664_afg.field_109019_h) {
               --var1.field_111398_a;
               if(var1.field_111398_a <= 0) {
                  return new C_100994_tv(C_100992_tt.field_110864_bs);
               }

               if(!var3.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110864_bs))) {
                  var3.func_103767_c(new C_100994_tv(C_100992_tt.field_110864_bs.field_110891_cf, 1, 0));
               }
            }
         }

         return var1;
      }
   }
}
