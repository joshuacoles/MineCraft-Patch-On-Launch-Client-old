
public class C_101266_atb extends C_101278_asw {

   private final C_101278_asw field_104287_a;
   private C_101133_arl field_104285_b;
   private C_101133_arl field_104286_c;
   private String field_104284_d = "survival";
   private boolean field_104288_m = false;


   public C_101266_atb(C_101278_asw var1) {
      this.field_104287_a = var1;
   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(101, this.field_104044_f / 2 - 155, this.field_104045_g - 28, 150, 20, C_100359_bd.func_107638_a("lanServer.start")));
      this.field_104050_h.add(new C_101133_arl(102, this.field_104044_f / 2 + 5, this.field_104045_g - 28, 150, 20, C_100359_bd.func_107638_a("gui.cancel")));
      this.field_104050_h.add(this.field_104286_c = new C_101133_arl(104, this.field_104044_f / 2 - 155, 100, 150, 20, C_100359_bd.func_107638_a("selectWorld.gameMode")));
      this.field_104050_h.add(this.field_104285_b = new C_101133_arl(103, this.field_104044_f / 2 + 5, 100, 150, 20, C_100359_bd.func_107638_a("selectWorld.allowCommands")));
      this.func_104283_g();
   }

   private void func_104283_g() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104286_c.field_103911_e = var1.func_107651_b("selectWorld.gameMode") + " " + var1.func_107651_b("selectWorld.gameMode." + this.field_104284_d);
      this.field_104285_b.field_103911_e = var1.func_107651_b("selectWorld.allowCommands") + " ";
      if(this.field_104288_m) {
         this.field_104285_b.field_103911_e = this.field_104285_b.field_103911_e + var1.func_107651_b("options.on");
      } else {
         this.field_104285_b.field_103911_e = this.field_104285_b.field_103911_e + var1.func_107651_b("options.off");
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 102) {
         this.field_104046_e.func_105053_a(this.field_104287_a);
      } else if(var1.field_103908_f == 104) {
         if(this.field_104284_d.equals("survival")) {
            this.field_104284_d = "creative";
         } else if(this.field_104284_d.equals("creative")) {
            this.field_104284_d = "adventure";
         } else {
            this.field_104284_d = "survival";
         }

         this.func_104283_g();
      } else if(var1.field_103908_f == 103) {
         this.field_104288_m = !this.field_104288_m;
         this.func_104283_g();
      } else if(var1.field_103908_f == 101) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         String var2 = this.field_104046_e.func_105043_C().func_104911_a(C_100836_xn.func_110085_a(this.field_104284_d), this.field_104288_m);
         String var3 = "";
         if(var2 != null) {
            var3 = this.field_104046_e.field_105120_g.func_102908_a("commands.publish.started", new Object[]{var2});
         } else {
            var3 = this.field_104046_e.field_105120_g.func_102908_a("commands.publish.failed", new Object[0]);
         }

         this.field_104046_e.field_105137_v.func_103991_b().func_103894_a(var3);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("lanServer.title"), this.field_104044_f / 2, 50, 16777215);
      this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("lanServer.otherPlayers"), this.field_104044_f / 2, 82, 16777215);
      super.func_104027_a(var1, var2, var3);
   }
}
