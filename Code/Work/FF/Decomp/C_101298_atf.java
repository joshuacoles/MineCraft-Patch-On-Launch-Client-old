
class C_101298_atf extends C_101275_asy {

   // $FF: synthetic field
   final C_101296_ate field_105890_a;


   public C_101298_atf(C_101296_ate var1) {
      super(var1.field_104046_e, var1.field_104044_f, var1.field_104045_g, 80, var1.field_104045_g - 40, var1.field_104049_k.field_111811_b + 1);
      this.field_105890_a = var1;
   }

   protected int func_105830_a() {
      return C_101296_ate.func_104327_a(this.field_105890_a).size();
   }

   protected void func_105827_a(int var1, boolean var2) {}

   protected boolean func_105831_a(int var1) {
      return false;
   }

   protected void func_105833_b() {}

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      this.field_105890_a.field_104049_k.func_111798_b((String)C_101296_ate.func_104327_a(this.field_105890_a).get(var1), 10, var3, 16777215);
      this.field_105890_a.field_104049_k.func_111798_b((String)C_101296_ate.func_104326_b(this.field_105890_a).get(var1), 230, var3, 16777215);
   }

   protected int func_105825_c() {
      return this.field_105890_a.field_104044_f - 10;
   }
}
