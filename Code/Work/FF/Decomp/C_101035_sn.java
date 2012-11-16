import java.util.List;

public class C_101035_sn extends C_100992_tt {

   public C_101035_sn(int var1) {
      super(var1);
      this.func_110800_a(true);
      this.func_110804_e(0);
      this.func_110802_a(C_101040_sq.field_111422_l);
   }

   public String func_110791_c_(C_100994_tv var1) {
      return var1.func_111367_j() == 1?"item.charcoal":"item.coal";
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
   }
}
