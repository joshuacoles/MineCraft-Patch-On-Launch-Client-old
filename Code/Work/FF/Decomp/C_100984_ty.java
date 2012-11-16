
public class C_100984_ty extends C_100992_tt {

   public C_100984_ty(int var1) {
      super(var1);
      this.func_110753_d(1);
      this.func_110802_a(C_101040_sq.field_111413_f);
   }

   public C_100994_tv func_110792_b(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(!var3.field_103869_cf.field_111597_d) {
         --var1.field_111398_a;
      }

      if(!var2.field_109557_J) {
         var3.func_103391_bv();
      }

      return var1.field_111398_a <= 0?new C_100994_tv(C_100992_tt.field_110936_aw):var1;
   }

   public int func_110769_a(C_100994_tv var1) {
      return 32;
   }

   public C_100943_uw func_110777_d_(C_100994_tv var1) {
      return C_100943_uw.field_111100_c;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      var3.func_103784_a(var1, this.func_110769_a(var1));
      return var1;
   }
}
