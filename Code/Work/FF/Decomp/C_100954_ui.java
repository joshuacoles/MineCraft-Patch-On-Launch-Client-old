
public class C_100954_ui extends C_100992_tt {

   public C_100954_ui(int var1) {
      super(var1);
      this.field_110888_cg = 1;
      this.func_110802_a(C_101040_sq.field_111416_e);
   }

   public boolean func_110798_a(C_100994_tv var1, C_100595_ln var2) {
      if(var2 instanceof C_100537_on) {
         C_100537_on var3 = (C_100537_on)var2;
         if(!var3.func_103531_m() && !var3.func_103357_h_()) {
            var3.func_103530_f(true);
            --var1.field_111398_a;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean func_110779_a(C_100994_tv var1, C_100595_ln var2, C_100595_ln var3) {
      this.func_110798_a(var1, var2);
      return true;
   }
}
