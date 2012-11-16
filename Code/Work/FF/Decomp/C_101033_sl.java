
public class C_101033_sl extends C_100992_tt {

   public C_101033_sl(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111416_e);
      this.func_110753_d(1);
      this.func_110804_e(25);
   }

   public boolean func_110763_n_() {
      return true;
   }

   public boolean func_110797_o_() {
      return true;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(var3.func_103108_ag() && var3.field_103207_o instanceof C_100537_on) {
         C_100537_on var4 = (C_100537_on)var3.field_103207_o;
         if(var4.func_103529_n().func_108092_h() && var1.func_111364_k() - var1.func_111367_j() >= 7) {
            var4.func_103529_n().func_108091_g();
            var1.func_111363_a(7, var3);
            if(var1.field_111398_a == 0) {
               return new C_100994_tv(C_100992_tt.field_110897_aR);
            }
         }
      }

      return var1;
   }
}
