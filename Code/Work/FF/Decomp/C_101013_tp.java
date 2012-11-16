import java.util.List;

public class C_101013_tp extends C_101006_to {

   public C_101013_tp(int var1, int var2, float var3, boolean var4) {
      super(var1, var2, var3, var4);
      this.func_110800_a(true);
   }

   public boolean func_110747_d(C_100994_tv var1) {
      return var1.func_111367_j() > 0;
   }

   public C_100963_uf func_110794_e(C_100994_tv var1) {
      return var1.func_111367_j() == 0?C_100963_uf.field_111164_c:C_100963_uf.field_111161_d;
   }

   protected void func_111008_c(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(var1.func_111367_j() > 0) {
         if(!var2.field_109557_J) {
            var3.func_103389_d(new C_100692_kx(C_100690_kw.field_109172_l.field_109159_H, 600, 3));
            var3.func_103389_d(new C_100692_kx(C_100690_kw.field_109173_m.field_109159_H, 6000, 0));
            var3.func_103389_d(new C_100692_kx(C_100690_kw.field_109170_n.field_109159_H, 6000, 0));
         }
      } else {
         super.func_111008_c(var1, var2, var3);
      }

   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
   }
}
