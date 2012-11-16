
public class C_101143_ars extends C_101278_asw {

   private static C_100059_bag field_104175_a = new C_100059_bag();
   private final C_101137_aru field_104170_b;
   private C_100511_abl field_104172_c = C_100511_abl.func_108255_e();
   private String field_104169_d;
   private String field_104178_m;
   private String field_104176_n;
   private C_101144_art field_104177_o;
   private C_101133_arl field_104174_p;
   private C_101133_arl field_104173_q;
   private C_101133_arl field_104171_r;


   public C_101143_ars(C_101137_aru var1, String var2) {
      this.field_104170_b = var1;
      this.func_104165_a(var2);
   }

   public String func_104167_e() {
      return this.field_104172_c.toString();
   }

   public void func_104165_a(String var1) {
      this.field_104172_c = C_100511_abl.func_108261_a(var1);
   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      this.field_104169_d = C_100359_bd.func_107638_a("createWorld.customize.flat.title");
      this.field_104178_m = C_100359_bd.func_107638_a("createWorld.customize.flat.tile");
      this.field_104176_n = C_100359_bd.func_107638_a("createWorld.customize.flat.height");
      this.field_104177_o = new C_101144_art(this);
      this.field_104050_h.add(this.field_104174_p = new C_101133_arl(2, this.field_104044_f / 2 - 154, this.field_104045_g - 52, 100, 20, C_100359_bd.func_107638_a("createWorld.customize.flat.addLayer") + " (NYI)"));
      this.field_104050_h.add(this.field_104173_q = new C_101133_arl(3, this.field_104044_f / 2 - 50, this.field_104045_g - 52, 100, 20, C_100359_bd.func_107638_a("createWorld.customize.flat.editLayer") + " (NYI)"));
      this.field_104050_h.add(this.field_104171_r = new C_101133_arl(4, this.field_104044_f / 2 - 155, this.field_104045_g - 52, 150, 20, C_100359_bd.func_107638_a("createWorld.customize.flat.removeLayer")));
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 155, this.field_104045_g - 28, 150, 20, C_100359_bd.func_107638_a("gui.done")));
      this.field_104050_h.add(new C_101133_arl(5, this.field_104044_f / 2 + 5, this.field_104045_g - 52, 150, 20, C_100359_bd.func_107638_a("createWorld.customize.presets")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 + 5, this.field_104045_g - 28, 150, 20, C_100359_bd.func_107638_a("gui.cancel")));
      this.field_104174_p.field_103915_h = this.field_104173_q.field_103915_h = false;
      this.field_104172_c.func_108254_d();
      this.func_104163_g();
   }

   protected void func_104040_a(C_101133_arl var1) {
      int var2 = this.field_104172_c.func_108259_c().size() - this.field_104177_o.field_105862_a - 1;
      if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105053_a(this.field_104170_b);
      } else if(var1.field_103908_f == 0) {
         this.field_104170_b.field_104127_a = this.func_104167_e();
         this.field_104046_e.func_105053_a(this.field_104170_b);
      } else if(var1.field_103908_f == 5) {
         this.field_104046_e.func_105053_a(new C_101273_asr(this));
      } else if(var1.field_103908_f == 4 && this.func_104164_i()) {
         this.field_104172_c.func_108259_c().remove(var2);
         this.field_104177_o.field_105862_a = Math.min(this.field_104177_o.field_105862_a, this.field_104172_c.func_108259_c().size() - 1);
      }

      this.field_104172_c.func_108254_d();
      this.func_104163_g();
   }

   public void func_104163_g() {
      boolean var1 = this.func_104164_i();
      this.field_104171_r.field_103909_g = var1;
      this.field_104173_q.field_103909_g = var1;
      this.field_104173_q.field_103909_g = false;
      this.field_104174_p.field_103909_g = false;
   }

   private boolean func_104164_i() {
      return this.field_104177_o.field_105862_a > -1 && this.field_104177_o.field_105862_a < this.field_104172_c.func_108259_c().size();
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.field_104177_o.func_105826_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, this.field_104169_d, this.field_104044_f / 2, 8, 16777215);
      int var4 = this.field_104044_f / 2 - 92 - 16;
      this.func_103880_b(this.field_104049_k, this.field_104178_m, var4, 32, 16777215);
      this.func_103880_b(this.field_104049_k, this.field_104176_n, var4 + 2 + 213 - this.field_104049_k.func_111778_a(this.field_104176_n), 32, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

   // $FF: synthetic method
   static C_100059_bag func_104166_h() {
      return field_104175_a;
   }

   // $FF: synthetic method
   static C_100511_abl func_104168_a(C_101143_ars var0) {
      return var0.field_104172_c;
   }

}
