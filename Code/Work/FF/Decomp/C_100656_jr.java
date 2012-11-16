
class C_100656_jr {

   final int field_108971_a;
   Object field_108969_b;
   C_100656_jr field_108970_c;
   final int field_108968_d;


   C_100656_jr(int var1, int var2, Object var3, C_100656_jr var4) {
      this.field_108969_b = var3;
      this.field_108970_c = var4;
      this.field_108971_a = var2;
      this.field_108968_d = var1;
   }

   public final int func_108967_a() {
      return this.field_108971_a;
   }

   public final Object func_108966_b() {
      return this.field_108969_b;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof C_100656_jr)) {
         return false;
      } else {
         C_100656_jr var2 = (C_100656_jr)var1;
         Integer var3 = Integer.valueOf(this.func_108967_a());
         Integer var4 = Integer.valueOf(var2.func_108967_a());
         if(var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.func_108966_b();
            Object var6 = var2.func_108966_b();
            if(var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return C_100661_jq.func_109039_f(this.field_108971_a);
   }

   public final String toString() {
      return this.func_108967_a() + "=" + this.func_108966_b();
   }
}
