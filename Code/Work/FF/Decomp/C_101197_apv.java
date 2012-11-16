
public final class C_101197_apv extends Exception {

   private final int field_111929_a;
   private final int field_111928_b;


   C_101197_apv(String var1, C_101201_apz var2) {
      super("At line " + var2.func_111930_c() + ", column " + var2.func_111931_b() + ":  " + var1);
      this.field_111929_a = var2.func_111931_b();
      this.field_111928_b = var2.func_111930_c();
   }

   C_101197_apv(String var1, Throwable var2, C_101201_apz var3) {
      super("At line " + var3.func_111930_c() + ", column " + var3.func_111931_b() + ":  " + var1, var2);
      this.field_111929_a = var3.func_111931_b();
      this.field_111928_b = var3.func_111930_c();
   }
}
