
class C_100863_xc {

   private String field_110276_a;
   private boolean field_110274_b;
   private int field_110275_c;
   private double field_110273_d;


   public C_100863_xc(String var1) {
      this.func_110271_a(var1);
   }

   public void func_110271_a(String var1) {
      this.field_110276_a = var1;
      this.field_110274_b = Boolean.parseBoolean(var1);

      try {
         this.field_110275_c = Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
         ;
      }

      try {
         this.field_110273_d = Double.parseDouble(var1);
      } catch (NumberFormatException var3) {
         ;
      }

   }

   public String func_110270_a() {
      return this.field_110276_a;
   }

   public boolean func_110272_b() {
      return this.field_110274_b;
   }
}
