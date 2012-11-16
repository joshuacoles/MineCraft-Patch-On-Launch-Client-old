
public class C_100855_xu implements Comparable {

   private static long field_110212_g = 0L;
   public int field_110217_a;
   public int field_110215_b;
   public int field_110216_c;
   public int field_110213_d;
   public long field_110214_e;
   public int field_110211_f;
   private long field_110218_h;


   public C_100855_xu(int var1, int var2, int var3, int var4) {
      this.field_110218_h = (long)(field_110212_g++);
      this.field_110217_a = var1;
      this.field_110215_b = var2;
      this.field_110216_c = var3;
      this.field_110213_d = var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100855_xu)) {
         return false;
      } else {
         C_100855_xu var2 = (C_100855_xu)var1;
         return this.field_110217_a == var2.field_110217_a && this.field_110215_b == var2.field_110215_b && this.field_110216_c == var2.field_110216_c && this.field_110213_d == var2.field_110213_d;
      }
   }

   public int hashCode() {
      return (this.field_110217_a * 1024 * 1024 + this.field_110216_c * 1024 + this.field_110215_b) * 256 + this.field_110213_d;
   }

   public C_100855_xu func_110209_a(long var1) {
      this.field_110214_e = var1;
      return this;
   }

   public void func_110210_a(int var1) {
      this.field_110211_f = var1;
   }

   public int func_110208_a(C_100855_xu var1) {
      return this.field_110214_e < var1.field_110214_e?-1:(this.field_110214_e > var1.field_110214_e?1:(this.field_110211_f != var1.field_110211_f?this.field_110211_f - var1.field_110211_f:(this.field_110218_h < var1.field_110218_h?-1:(this.field_110218_h > var1.field_110218_h?1:0))));
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.func_110208_a((C_100855_xu)var1);
   }

}
