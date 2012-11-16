import org.lwjgl.opengl.GL11;

class C_101270_ast extends C_101275_asy {

   public int field_105875_a;
   // $FF: synthetic field
   final C_101273_asr field_105874_b;


   public C_101270_ast(C_101273_asr var1) {
      super(var1.field_104046_e, var1.field_104044_f, var1.field_104045_g, 80, var1.field_104045_g - 37, 24);
      this.field_105874_b = var1;
      this.field_105875_a = -1;
   }

   private void func_105873_a(int var1, int var2, int var3) {
      this.func_105872_d(var1 + 1, var2 + 1);
      GL11.glEnable('\u803a');
      C_101210_aqj.func_112012_c();
      C_101273_asr.func_104313_h().func_105499_a(this.field_105874_b.field_104049_k, this.field_105874_b.field_104046_e.field_105127_o, new C_100994_tv(var3, 1, 0), var1 + 2, var2 + 2);
      C_101210_aqj.func_112010_a();
      GL11.glDisable('\u803a');
   }

   private void func_105872_d(int var1, int var2) {
      this.func_105871_b(var1, var2, 0, 0);
   }

   private void func_105871_b(int var1, int var2, int var3, int var4) {
      int var5 = this.field_105874_b.field_104046_e.field_105127_o.func_110367_b("/gui/slot.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_105874_b.field_104046_e.field_105127_o.func_110368_b(var5);
      C_100872_azb var10 = C_100872_azb.field_110346_a;
      var10.func_110330_b();
      var10.func_110322_a((double)(var1 + 0), (double)(var2 + 18), (double)this.field_105874_b.field_103883_j, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 18), (double)(var2 + 18), (double)this.field_105874_b.field_103883_j, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 18), (double)(var2 + 0), (double)this.field_105874_b.field_103883_j, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 0), (double)(var2 + 0), (double)this.field_105874_b.field_103883_j, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.func_110329_a();
   }

   protected int func_105830_a() {
      return C_101273_asr.func_104310_i().size();
   }

   protected void func_105827_a(int var1, boolean var2) {
      this.field_105875_a = var1;
      this.field_105874_b.func_104311_g();
      C_101273_asr.func_104308_b(this.field_105874_b).func_103940_a(((C_101271_ass)C_101273_asr.func_104310_i().get(C_101273_asr.func_104306_a(this.field_105874_b).field_105875_a)).field_112285_c);
   }

   protected boolean func_105831_a(int var1) {
      return var1 == this.field_105875_a;
   }

   protected void func_105833_b() {}

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_101271_ass var6 = (C_101271_ass)C_101273_asr.func_104310_i().get(var1);
      this.func_105873_a(var2, var3, var6.field_112286_a);
      this.field_105874_b.field_104049_k.func_111798_b(var6.field_112284_b, var2 + 18 + 5, var3 + 6, 16777215);
   }
}
