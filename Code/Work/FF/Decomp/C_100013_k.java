
public class C_100013_k implements Comparable {

   public int field_105273_a;
   public int field_105271_b;
   public int field_105272_c;


   public C_100013_k() {}

   public C_100013_k(int var1, int var2, int var3) {
      this.field_105273_a = var1;
      this.field_105271_b = var2;
      this.field_105272_c = var3;
   }

   public C_100013_k(C_100013_k var1) {
      this.field_105273_a = var1.field_105273_a;
      this.field_105271_b = var1.field_105271_b;
      this.field_105272_c = var1.field_105272_c;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100013_k)) {
         return false;
      } else {
         C_100013_k var2 = (C_100013_k)var1;
         return this.field_105273_a == var2.field_105273_a && this.field_105271_b == var2.field_105271_b && this.field_105272_c == var2.field_105272_c;
      }
   }

   public int hashCode() {
      return this.field_105273_a + this.field_105272_c << 8 + this.field_105271_b << 16;
   }

   public int func_105267_a(C_100013_k var1) {
      return this.field_105271_b == var1.field_105271_b?(this.field_105272_c == var1.field_105272_c?this.field_105273_a - var1.field_105273_a:this.field_105272_c - var1.field_105272_c):this.field_105271_b - var1.field_105271_b;
   }

   public void func_105270_b(int var1, int var2, int var3) {
      this.field_105273_a = var1;
      this.field_105271_b = var2;
      this.field_105272_c = var3;
   }

   public float func_105268_e(int var1, int var2, int var3) {
      int var4 = this.field_105273_a - var1;
      int var5 = this.field_105271_b - var2;
      int var6 = this.field_105272_c - var3;
      return (float)(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public float func_105269_e(C_100013_k var1) {
      return this.func_105268_e(var1.field_105273_a, var1.field_105271_b, var1.field_105272_c);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.func_105267_a((C_100013_k)var1);
   }
}
