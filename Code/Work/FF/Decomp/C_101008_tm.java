
public class C_101008_tm extends C_100992_tt {

   public C_101008_tm(int var1) {
      super(var1);
      this.func_110804_e(64);
      this.func_110753_d(1);
      this.func_110802_a(C_101040_sq.field_111427_i);
   }

   public boolean func_110763_n_() {
      return true;
   }

   public boolean func_110797_o_() {
      return true;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(var3.field_103862_cl != null) {
         int var4 = var3.field_103862_cl.func_104706_c();
         var1.func_111363_a(var4, var3);
         var3.func_103301_bE();
      } else {
         var2.func_109412_a(var3, "random.bow", 0.5F, 0.4F / (field_110833_d.nextFloat() * 0.4F + 0.8F));
         if(!var2.field_109557_J) {
            var2.func_109513_d(new C_101090_ql(var2, var3));
         }

         var3.func_103301_bE();
      }

      return var1;
   }
}
