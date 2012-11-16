
public class C_101038_so extends C_100945_uu {

   private final C_100451_alf field_110989_a;
   private String[] field_110988_b;


   public C_101038_so(int var1, boolean var2) {
      super(var1);
      this.field_110989_a = C_100451_alf.field_106118_p[this.func_110979_g()];
      if(var2) {
         this.func_110804_e(0);
         this.func_110800_a(true);
      }

   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      return this.field_110989_a.func_106025_g_(var1.func_111367_j());
   }

   public int func_110787_b(int var1) {
      return this.field_110989_a.func_106029_a(0, var1);
   }

   public int func_110748_a(int var1) {
      return var1;
   }

   public C_101038_so func_110987_a(String[] var1) {
      this.field_110988_b = var1;
      return this;
   }

   public String func_110791_c_(C_100994_tv var1) {
      if(this.field_110988_b == null) {
         return super.func_110791_c_(var1);
      } else {
         int var2 = var1.func_111367_j();
         return var2 >= 0 && var2 < this.field_110988_b.length?super.func_110791_c_(var1) + "." + this.field_110988_b[var2]:super.func_110791_c_(var1);
      }
   }
}
