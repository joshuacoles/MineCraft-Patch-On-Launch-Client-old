
public class C_101158_asq extends C_101278_asw {

   private int field_104230_a = 0;
   private int field_104229_b = 0;


   public void func_104037_A_() {
      this.field_104230_a = 0;
      this.field_104050_h.clear();
      byte var1 = -16;
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + var1, C_100359_bd.func_107638_a("menu.returnToMenu")));
      if(!this.field_104046_e.func_105064_A()) {
         ((C_101133_arl)this.field_104050_h.get(0)).field_103911_e = C_100359_bd.func_107638_a("menu.disconnect");
      }

      this.field_104050_h.add(new C_101133_arl(4, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 24 + var1, C_100359_bd.func_107638_a("menu.returnToGame")));
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96 + var1, 98, 20, C_100359_bd.func_107638_a("menu.options")));
      C_101133_arl var3;
      this.field_104050_h.add(var3 = new C_101133_arl(7, this.field_104044_f / 2 + 2, this.field_104045_g / 4 + 96 + var1, 98, 20, C_100359_bd.func_107638_a("menu.shareToLan")));
      this.field_104050_h.add(new C_101133_arl(5, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 48 + var1, 98, 20, C_100359_bd.func_107638_a("gui.achievements")));
      this.field_104050_h.add(new C_101133_arl(6, this.field_104044_f / 2 + 2, this.field_104045_g / 4 + 48 + var1, 98, 20, C_100359_bd.func_107638_a("gui.stats")));
      var3.field_103909_g = this.field_104046_e.func_105035_B() && !this.field_104046_e.func_105043_C().func_105007_al();
   }

   protected void func_104040_a(C_101133_arl var1) {
      switch(var1.field_103908_f) {
      case 0:
         this.field_104046_e.func_105053_a(new C_101156_aso(this, this.field_104046_e.field_105156_y));
         break;
      case 1:
         var1.field_103909_g = false;
         this.field_104046_e.field_105094_E.func_105801_a(C_100818_jh.field_110033_j, 1);
         this.field_104046_e.field_105122_e.func_109472_B();
         this.field_104046_e.func_105083_a((C_100942_awz)null);
         this.field_104046_e.func_105053_a(new C_100098_bcz());
      case 2:
      case 3:
      default:
         break;
      case 4:
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         this.field_104046_e.func_105057_h();
         this.field_104046_e.field_105097_A.func_105902_f();
         break;
      case 5:
         this.field_104046_e.func_105053_a(new C_101302_ati(this.field_104046_e.field_105094_E));
         break;
      case 6:
         this.field_104046_e.func_105053_a(new C_101304_atj(this, this.field_104046_e.field_105094_E));
         break;
      case 7:
         this.field_104046_e.func_105053_a(new C_101266_atb(this));
      }

   }

   public void func_104039_c() {
      super.func_104039_c();
      ++this.field_104229_b;
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, "Game menu", this.field_104044_f / 2, 40, 16777215);
      super.func_104027_a(var1, var2, var3);
   }
}
