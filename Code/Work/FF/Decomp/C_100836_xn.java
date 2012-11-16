
public enum C_100836_xn {

   field_110100_a("NOT_SET", 0, -1, ""),
   field_110098_b("SURVIVAL", 1, 0, "survival"),
   field_110099_c("CREATIVE", 2, 1, "creative"),
   field_110096_d("ADVENTURE", 3, 2, "adventure");
   int field_110097_e;
   String field_110094_f;
   // $FF: synthetic field
   private static final C_100836_xn[] field_110095_g = new C_100836_xn[]{field_110100_a, field_110098_b, field_110099_c, field_110096_d};


   public static C_100836_xn[] func_110088_values() {
      return (C_100836_xn[])field_110095_g.clone();
   }

   private C_100836_xn(String var1, int var2, int var3, String var4) {
      this.field_110097_e = var3;
      this.field_110094_f = var4;
   }

   public int func_110090_a() {
      return this.field_110097_e;
   }

   public String func_110091_b() {
      return this.field_110094_f;
   }

   public void func_110092_a(C_101093_qe var1) {
      if(this == field_110099_c) {
         var1.field_111600_c = true;
         var1.field_111597_d = true;
         var1.field_111601_a = true;
      } else {
         var1.field_111600_c = false;
         var1.field_111597_d = false;
         var1.field_111601_a = false;
         var1.field_111599_b = false;
      }

      var1.field_111598_e = !this.func_110093_c();
   }

   public boolean func_110093_c() {
      return this == field_110096_d;
   }

   public boolean func_110089_d() {
      return this == field_110099_c;
   }

   public boolean func_110087_e() {
      return this == field_110098_b || this == field_110096_d;
   }

   public static C_100836_xn func_110086_a(int var0) {
      C_100836_xn[] var1 = func_110088_values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         C_100836_xn var4 = var1[var3];
         if(var4.field_110097_e == var0) {
            return var4;
         }
      }

      return field_110098_b;
   }

   public static C_100836_xn func_110085_a(String var0) {
      C_100836_xn[] var1 = func_110088_values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         C_100836_xn var4 = var1[var3];
         if(var4.field_110094_f.equals(var0)) {
            return var4;
         }
      }

      return field_110098_b;
   }

}
