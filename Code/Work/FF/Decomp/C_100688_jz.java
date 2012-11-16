
public final class C_100688_jz implements Comparable {

   public double field_109132_a;
   public double field_109130_b;
   public String field_109131_c;


   public C_100688_jz(String var1, double var2, double var4) {
      this.field_109131_c = var1;
      this.field_109132_a = var2;
      this.field_109130_b = var4;
   }

   public int func_109129_a(C_100688_jz var1) {
      return var1.field_109132_a < this.field_109132_a?-1:(var1.field_109132_a > this.field_109132_a?1:var1.field_109131_c.compareTo(this.field_109131_c));
   }

   public int func_109128_a() {
      return (this.field_109131_c.hashCode() & 11184810) + 4473924;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.func_109129_a((C_100688_jz)var1);
   }
}
