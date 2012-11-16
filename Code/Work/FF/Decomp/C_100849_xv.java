
public class C_100849_xv {

   private int field_110204_a;
   private int field_110202_b;
   private int field_110203_c;
   private int field_110200_d;
   private int field_110201_e;
   private int field_110199_f;


   public C_100849_xv(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_110204_a = var1;
      this.field_110202_b = var2;
      this.field_110203_c = var3;
      this.field_110201_e = var5;
      this.field_110199_f = var6;
      this.field_110200_d = var4;
   }

   public int func_110196_a() {
      return this.field_110204_a;
   }

   public int func_110198_b() {
      return this.field_110202_b;
   }

   public int func_110197_c() {
      return this.field_110203_c;
   }

   public int func_110195_d() {
      return this.field_110201_e;
   }

   public int func_110194_e() {
      return this.field_110199_f;
   }

   public int func_110193_f() {
      return this.field_110200_d;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100849_xv)) {
         return false;
      } else {
         C_100849_xv var2 = (C_100849_xv)var1;
         return this.field_110204_a == var2.field_110204_a && this.field_110202_b == var2.field_110202_b && this.field_110203_c == var2.field_110203_c && this.field_110201_e == var2.field_110201_e && this.field_110199_f == var2.field_110199_f && this.field_110200_d == var2.field_110200_d;
      }
   }
}
