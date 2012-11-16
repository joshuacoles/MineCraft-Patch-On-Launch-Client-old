
class C_101323_atu extends C_101322_atv {

   private final int field_103930_l;
   private final int field_103931_m;
   // $FF: synthetic field
   final C_101290_atr field_103932_k;


   public C_101323_atu(C_101290_atr var1, int var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, "/gui/inventory.png", 0 + C_100690_kw.field_109169_a[var5].func_109134_e() % 8 * 18, 198 + C_100690_kw.field_109169_a[var5].func_109134_e() / 8 * 18);
      this.field_103932_k = var1;
      this.field_103930_l = var5;
      this.field_103931_m = var6;
   }

   public void func_103901_b(int var1, int var2) {
      String var3 = C_100359_bd.func_107638_a(C_100690_kw.field_109169_a[this.field_103930_l].func_109135_a());
      if(this.field_103931_m >= 3 && this.field_103930_l != C_100690_kw.field_109172_l.field_109159_H) {
         var3 = var3 + " II";
      }

      this.field_103932_k.func_104435_a(var3, var1, var2);
   }
}
