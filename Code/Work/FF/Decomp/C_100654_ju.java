
class C_100654_ju {

   final long field_108965_a;
   Object field_108963_b;
   C_100654_ju field_108964_c;
   final int field_108962_d;


   C_100654_ju(int var1, long var2, Object var4, C_100654_ju var5) {
      this.field_108963_b = var4;
      this.field_108964_c = var5;
      this.field_108965_a = var2;
      this.field_108962_d = var1;
   }

   public final long func_108961_a() {
      return this.field_108965_a;
   }

   public final Object func_108960_b() {
      return this.field_108963_b;
   }

   public final boolean equals(Object var1) {
      if(!(var1 instanceof C_100654_ju)) {
         return false;
      } else {
         C_100654_ju var2 = (C_100654_ju)var1;
         Long var3 = Long.valueOf(this.func_108961_a());
         Long var4 = Long.valueOf(var2.func_108961_a());
         if(var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.func_108960_b();
            Object var6 = var2.func_108960_b();
            if(var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int hashCode() {
      return C_100653_jt.func_108941_f(this.field_108965_a);
   }

   public final String toString() {
      return this.func_108961_a() + "=" + this.func_108960_b();
   }
}
