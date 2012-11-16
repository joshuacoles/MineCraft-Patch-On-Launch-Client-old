
public class C_101014_tg extends C_100992_tt {

   public C_101014_tg(int var1) {
      super(var1);
      this.field_110888_cg = 16;
      this.func_110802_a(C_101040_sq.field_111422_l);
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(!var3.field_103869_cf.field_111597_d) {
         --var1.field_111398_a;
      }

      var2.func_109412_a(var3, "random.bow", 0.5F, 0.4F / (field_110833_d.nextFloat() * 0.4F + 0.8F));
      if(!var2.field_109557_J) {
         var2.func_109513_d(new C_101083_qr(var2, var3));
      }

      return var1;
   }
}
