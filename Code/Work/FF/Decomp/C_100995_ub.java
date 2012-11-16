
public class C_100995_ub extends C_100945_uu {

   private final C_100451_alf field_110986_a;
   private final String[] field_110985_b;


   public C_100995_ub(int var1, C_100451_alf var2, String[] var3) {
      super(var1);
      this.field_110986_a = var2;
      this.field_110985_b = var3;
      this.func_110804_e(0);
      this.func_110800_a(true);
   }

   public int func_110787_b(int var1) {
      return this.field_110986_a.func_106029_a(2, var1);
   }

   public int func_110748_a(int var1) {
      return var1;
   }

   public String func_110791_c_(C_100994_tv var1) {
      int var2 = var1.func_111367_j();
      if(var2 < 0 || var2 >= this.field_110985_b.length) {
         var2 = 0;
      }

      return super.func_110793_a() + "." + this.field_110985_b[var2];
   }
}
