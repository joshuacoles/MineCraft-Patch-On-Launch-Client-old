
public class C_100513_abm {

   private int field_108278_a;
   private int field_108276_b;
   private int field_108277_c;
   private int field_108275_d;


   public C_100513_abm(int var1, int var2) {
      this.field_108278_a = 1;
      this.field_108276_b = 0;
      this.field_108277_c = 0;
      this.field_108275_d = 0;
      this.field_108278_a = var1;
      this.field_108276_b = var2;
   }

   public C_100513_abm(int var1, int var2, int var3) {
      this(var1, var2);
      this.field_108277_c = var3;
   }

   public int func_108271_a() {
      return this.field_108278_a;
   }

   public int func_108273_b() {
      return this.field_108276_b;
   }

   public int func_108272_c() {
      return this.field_108277_c;
   }

   public int func_108270_d() {
      return this.field_108275_d;
   }

   public void func_108274_d(int var1) {
      this.field_108275_d = var1;
   }

   public String toString() {
      String var1 = Integer.toString(this.field_108276_b);
      if(this.field_108278_a > 1) {
         var1 = this.field_108278_a + "x" + var1;
      }

      if(this.field_108277_c > 0) {
         var1 = var1 + ":" + this.field_108277_c;
      }

      return var1;
   }
}
