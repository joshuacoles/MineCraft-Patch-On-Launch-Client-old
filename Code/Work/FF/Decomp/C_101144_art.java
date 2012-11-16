import org.lwjgl.opengl.GL11;

class C_101144_art extends C_101275_asy {

   public int field_105862_a;
   // $FF: synthetic field
   final C_101143_ars field_105861_b;


   public C_101144_art(C_101143_ars var1) {
      super(var1.field_104046_e, var1.field_104044_f, var1.field_104045_g, 43, var1.field_104045_g - 60, 24);
      this.field_105861_b = var1;
      this.field_105862_a = -1;
   }

   private void func_105860_a(int var1, int var2, C_100994_tv var3) {
      this.func_105859_d(var1 + 1, var2 + 1);
      GL11.glEnable('\u803a');
      if(var3 != null) {
         C_101210_aqj.func_112012_c();
         C_101143_ars.func_104166_h().func_105499_a(this.field_105861_b.field_104049_k, this.field_105861_b.field_104046_e.field_105127_o, var3, var1 + 2, var2 + 2);
         C_101210_aqj.func_112010_a();
      }

      GL11.glDisable('\u803a');
   }

   private void func_105859_d(int var1, int var2) {
      this.func_105858_b(var1, var2, 0, 0);
   }

   private void func_105858_b(int var1, int var2, int var3, int var4) {
      int var5 = this.field_105861_b.field_104046_e.field_105127_o.func_110367_b("/gui/slot.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_105861_b.field_104046_e.field_105127_o.func_110368_b(var5);
      C_100872_azb var10 = C_100872_azb.field_110346_a;
      var10.func_110330_b();
      var10.func_110322_a((double)(var1 + 0), (double)(var2 + 18), (double)this.field_105861_b.field_103883_j, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 18), (double)(var2 + 18), (double)this.field_105861_b.field_103883_j, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 18), (double)(var2 + 0), (double)this.field_105861_b.field_103883_j, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 0), (double)(var2 + 0), (double)this.field_105861_b.field_103883_j, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.func_110329_a();
   }

   protected int func_105830_a() {
      return C_101143_ars.func_104168_a(this.field_105861_b).func_108259_c().size();
   }

   protected void func_105827_a(int var1, boolean var2) {
      this.field_105862_a = var1;
      this.field_105861_b.func_104163_g();
   }

   protected boolean func_105831_a(int var1) {
      return var1 == this.field_105862_a;
   }

   protected void func_105833_b() {}

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100513_abm var6 = (C_100513_abm)C_101143_ars.func_104168_a(this.field_105861_b).func_108259_c().get(C_101143_ars.func_104168_a(this.field_105861_b).func_108259_c().size() - var1 - 1);
      C_100994_tv var7 = var6.func_108273_b() == 0?null:new C_100994_tv(var6.func_108273_b(), 1, var6.func_108272_c());
      String var8 = var7 == null?"Air":C_100992_tt.field_110834_e[var6.func_108273_b()].func_110788_i(var7);
      this.func_105860_a(var2, var3, var7);
      this.field_105861_b.field_104049_k.func_111798_b(var8, var2 + 18 + 5, var3 + 3, 16777215);
      String var9;
      if(var1 == 0) {
         var9 = C_100359_bd.func_107637_a("createWorld.customize.flat.layer.top", new Object[]{Integer.valueOf(var6.func_108271_a())});
      } else if(var1 == C_101143_ars.func_104168_a(this.field_105861_b).func_108259_c().size() - 1) {
         var9 = C_100359_bd.func_107637_a("createWorld.customize.flat.layer.bottom", new Object[]{Integer.valueOf(var6.func_108271_a())});
      } else {
         var9 = C_100359_bd.func_107637_a("createWorld.customize.flat.layer", new Object[]{Integer.valueOf(var6.func_108271_a())});
      }

      this.field_105861_b.field_104049_k.func_111798_b(var9, var2 + 2 + 213 - this.field_105861_b.field_104049_k.func_111778_a(var9), var3 + 3, 16777215);
   }

   protected int func_105825_c() {
      return this.field_105861_b.field_104044_f - 70;
   }
}
