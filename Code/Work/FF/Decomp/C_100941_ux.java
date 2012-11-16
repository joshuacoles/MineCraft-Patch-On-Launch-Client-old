
public class C_100941_ux extends C_101038_so {

   public C_100941_ux(int var1) {
      super(var1, false);
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

            if(var2.func_109350_f(var5, var6, var7) == C_100664_afg.field_109019_h && var2.func_109357_g(var5, var6, var7) == 0 && var2.func_109352_c(var5, var6 + 1, var7)) {
               var2.func_109422_e(var5, var6 + 1, var7, C_100451_alf.field_106245_bC.field_106162_cm);
               if(!var3.field_103869_cf.field_111597_d) {
                  --var1.field_111398_a;
               }
            }
         }

         return var1;
      }
   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      return C_100451_alf.field_106245_bC.func_106025_g_(var1.func_111367_j());
   }
}
