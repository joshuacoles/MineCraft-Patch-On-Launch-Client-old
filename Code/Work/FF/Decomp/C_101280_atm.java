
class C_101280_atm extends C_101275_asy {

   // $FF: synthetic field
   final C_101304_atj field_105876_a;


   public C_101280_atm(C_101304_atj var1) {
      super(C_101304_atj.func_104358_a(var1), var1.field_104044_f, var1.field_104045_g, 32, var1.field_104045_g - 64, 10);
      this.field_105876_a = var1;
      this.func_105829_a(false);
   }

   protected int func_105830_a() {
      return C_100818_jh.field_110027_c.size();
   }

   protected void func_105827_a(int var1, boolean var2) {}

   protected boolean func_105831_a(int var1) {
      return false;
   }

   protected int func_105822_d() {
      return this.func_105830_a() * 10;
   }

   protected void func_105833_b() {
      this.field_105876_a.func_104035_z_();
   }

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100809_jc var6 = (C_100809_jc)C_100818_jh.field_110027_c.get(var1);
      this.field_105876_a.func_103880_b(C_101304_atj.func_104355_b(this.field_105876_a), C_100359_bd.func_107638_a(var6.func_109913_i()), var2 + 2, var3 + 1, var1 % 2 == 0?16777215:9474192);
      String var7 = var6.func_109911_a(C_101304_atj.func_104360_c(this.field_105876_a).func_105810_a(var6));
      this.field_105876_a.func_103880_b(C_101304_atj.func_104376_d(this.field_105876_a), var7, var2 + 2 + 213 - C_101304_atj.func_104371_e(this.field_105876_a).func_111778_a(var7), var3 + 1, var1 % 2 == 0?16777215:9474192);
   }
}
