
public class C_100858_wx {

   public final int field_110239_a;
   public final int field_110238_b;


   public C_100858_wx(int var1, int var2) {
      this.field_110239_a = var1;
      this.field_110238_b = var2;
   }

   public static long func_110234_a(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public int hashCode() {
      long var1 = func_110234_a(this.field_110239_a, this.field_110238_b);
      int var3 = (int)var1;
      int var4 = (int)(var1 >> 32);
      return var3 ^ var4;
   }

   public boolean equals(Object var1) {
      C_100858_wx var2 = (C_100858_wx)var1;
      return var2.field_110239_a == this.field_110239_a && var2.field_110238_b == this.field_110238_b;
   }

   public int func_110235_a() {
      return (this.field_110239_a << 4) + 8;
   }

   public int func_110237_b() {
      return (this.field_110238_b << 4) + 8;
   }

   public C_100851_xw func_110236_a(int var1) {
      return new C_100851_xw(this.func_110235_a(), var1, this.func_110237_b());
   }

   public String toString() {
      return "[" + this.field_110239_a + ", " + this.field_110238_b + "]";
   }
}
