
class C_100785_acm {

   public Class field_109907_a;
   public final int field_109905_b;
   public int field_109906_c;
   public int field_109903_d;
   public boolean field_109904_e;


   public C_100785_acm(Class var1, int var2, int var3, boolean var4) {
      this.field_109907_a = var1;
      this.field_109905_b = var2;
      this.field_109903_d = var3;
      this.field_109904_e = var4;
   }

   public C_100785_acm(Class var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public boolean func_109901_a(int var1) {
      return this.field_109903_d == 0 || this.field_109906_c < this.field_109903_d;
   }

   public boolean func_109902_a() {
      return this.field_109903_d == 0 || this.field_109906_c < this.field_109903_d;
   }
}
