
public class C_100931_vn implements C_100925_vs {

   public boolean func_110720_a(C_101068_rg var1, C_100873_xe var2) {
      int var3 = 0;
      C_100994_tv var4 = null;

      for(int var5 = 0; var5 < var1.func_103003_k_(); ++var5) {
         C_100994_tv var6 = var1.func_103007_a(var5);
         if(var6 != null) {
            if(var6.field_111397_c == C_100992_tt.field_110882_bd.field_110891_cf) {
               if(var4 != null) {
                  return false;
               }

               var4 = var6;
            } else {
               if(var6.field_111397_c != C_100992_tt.field_110955_bO.field_110891_cf) {
                  return false;
               }

               ++var3;
            }
         }
      }

      return var4 != null && var3 > 0;
   }

   public C_100994_tv func_110721_a(C_101068_rg var1) {
      int var2 = 0;
      C_100994_tv var3 = null;

      for(int var4 = 0; var4 < var1.func_103003_k_(); ++var4) {
         C_100994_tv var5 = var1.func_103007_a(var4);
         if(var5 != null) {
            if(var5.field_111397_c == C_100992_tt.field_110882_bd.field_110891_cf) {
               if(var3 != null) {
                  return null;
               }

               var3 = var5;
            } else {
               if(var5.field_111397_c != C_100992_tt.field_110955_bO.field_110891_cf) {
                  return null;
               }

               ++var2;
            }
         }
      }

      if(var3 != null && var2 >= 1) {
         return new C_100994_tv(C_100992_tt.field_110882_bd, var2 + 1, var3.func_111367_j());
      } else {
         return null;
      }
   }

   public int func_110722_a() {
      return 9;
   }

   public C_100994_tv func_110723_b() {
      return null;
   }
}
