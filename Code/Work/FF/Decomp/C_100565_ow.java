
public class C_100565_ow extends C_100730_lb {

   public final C_100549_ov field_103244_a;
   public final String field_103243_b;


   public C_100565_ow(C_100549_ov var1, String var2, float var3, float var4) {
      super(var1.func_103647_d());
      this.func_103161_a(var3, var4);
      this.field_103244_a = var1;
      this.field_103243_b = var2;
   }

   protected void func_103141_a() {}

   protected void func_103110_a(C_100353_bh var1) {}

   protected void func_103078_b(C_100353_bh var1) {}

   public boolean func_103123_L() {
      return true;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      return this.field_103244_a.func_103646_a(this, var1, var2);
   }

   public boolean func_103113_i(C_100730_lb var1) {
      return this == var1 || this.field_103244_a == var1;
   }
}
