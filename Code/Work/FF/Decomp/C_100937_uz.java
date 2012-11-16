
public class C_100937_uz extends C_100992_tt {

   public C_100937_uz(int var1) {
      super(var1);
      this.func_110753_d(1);
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      var3.func_103800_d(var1);
      return var1;
   }

   public boolean func_110746_q() {
      return true;
   }

   public static boolean func_111055_a(C_100353_bh var0) {
      if(var0 == null) {
         return false;
      } else if(!var0.func_107516_b("pages")) {
         return false;
      } else {
         C_100339_bp var1 = (C_100339_bp)var0.func_107518_a("pages");

         for(int var2 = 0; var2 < var1.func_107501_c(); ++var2) {
            C_100333_bt var3 = (C_100333_bt)var1.func_107498_b(var2);
            if(var3.field_107495_a == null) {
               return false;
            }

            if(var3.field_107495_a.length() > 256) {
               return false;
            }
         }

         return true;
      }
   }
}
