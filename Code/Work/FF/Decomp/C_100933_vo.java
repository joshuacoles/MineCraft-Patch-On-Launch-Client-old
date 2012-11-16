
public class C_100933_vo extends C_100919_vt {

   public C_100933_vo() {
      super(3, 3, new C_100994_tv[]{new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110882_bd, 0, -1), new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110907_aK), new C_100994_tv(C_100992_tt.field_110907_aK)}, new C_100994_tv(C_100992_tt.field_110955_bO, 0, 0));
   }

   public boolean func_110720_a(C_101068_rg var1, C_100873_xe var2) {
      if(!super.func_110720_a(var1, var2)) {
         return false;
      } else {
         C_100994_tv var3 = null;

         for(int var4 = 0; var4 < var1.func_103003_k_() && var3 == null; ++var4) {
            C_100994_tv var5 = var1.func_103007_a(var4);
            if(var5 != null && var5.field_111397_c == C_100992_tt.field_110882_bd.field_110891_cf) {
               var3 = var5;
            }
         }

         if(var3 == null) {
            return false;
         } else {
            C_100282_agl var6 = C_100992_tt.field_110882_bd.func_111042_a(var3, var2);
            return var6 == null?false:var6.field_107294_d < 4;
         }
      }
   }

   public C_100994_tv func_110721_a(C_101068_rg var1) {
      C_100994_tv var2 = null;

      for(int var3 = 0; var3 < var1.func_103003_k_() && var2 == null; ++var3) {
         C_100994_tv var4 = var1.func_103007_a(var3);
         if(var4 != null && var4.field_111397_c == C_100992_tt.field_110882_bd.field_110891_cf) {
            var2 = var4;
         }
      }

      var2 = var2.func_111360_l();
      var2.field_111398_a = 1;
      if(var2.func_111352_p() == null) {
         var2.func_111349_d(new C_100353_bh());
      }

      var2.func_111352_p().func_107509_a("map_is_scaling", true);
      return var2;
   }
}
