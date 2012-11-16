import java.util.Date;

class C_101268_ata extends C_101275_asy {

   // $FF: synthetic field
   final C_101264_asz field_105870_a;


   public C_101268_ata(C_101264_asz var1) {
      super(var1.field_104046_e, var1.field_104044_f, var1.field_104045_g, 32, var1.field_104045_g - 64, 36);
      this.field_105870_a = var1;
   }

   protected int func_105830_a() {
      return C_101264_asz.func_104266_a(this.field_105870_a).size();
   }

   protected void func_105827_a(int var1, boolean var2) {
      C_101264_asz.func_104253_a(this.field_105870_a, var1);
      boolean var3 = C_101264_asz.func_104264_b(this.field_105870_a) >= 0 && C_101264_asz.func_104264_b(this.field_105870_a) < this.func_105830_a();
      C_101264_asz.func_104262_c(this.field_105870_a).field_103909_g = var3;
      C_101264_asz.func_104254_d(this.field_105870_a).field_103909_g = var3;
      C_101264_asz.func_104265_e(this.field_105870_a).field_103909_g = var3;
      C_101264_asz.func_104252_f(this.field_105870_a).field_103909_g = var3;
      if(var2 && var3) {
         this.field_105870_a.func_104256_e(var1);
      }

   }

   protected boolean func_105831_a(int var1) {
      return var1 == C_101264_asz.func_104264_b(this.field_105870_a);
   }

   protected int func_105822_d() {
      return C_101264_asz.func_104266_a(this.field_105870_a).size() * 36;
   }

   protected void func_105833_b() {
      this.field_105870_a.func_104035_z_();
   }

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100264_agz var6 = (C_100264_agz)C_101264_asz.func_104266_a(this.field_105870_a).get(var1);
      String var7 = var6.func_107117_b();
      if(var7 == null || C_100650_jv.func_108930_a(var7)) {
         var7 = C_101264_asz.func_104257_g(this.field_105870_a) + " " + (var1 + 1);
      }

      String var8 = var6.func_107115_a();
      var8 = var8 + " (" + C_101264_asz.func_104251_h(this.field_105870_a).format(new Date(var6.func_107113_e()));
      var8 = var8 + ")";
      String var9 = "";
      if(var6.func_107114_d()) {
         var9 = C_101264_asz.func_104261_i(this.field_105870_a) + " " + var9;
      } else {
         var9 = C_101264_asz.func_104259_j(this.field_105870_a)[var6.func_107112_f().func_110090_a()];
         if(var6.func_107118_g()) {
            var9 = "§4" + C_100359_bd.func_107638_a("gameMode.hardcore") + "§r";
         }

         if(var6.func_107111_h()) {
            var9 = var9 + ", " + C_100359_bd.func_107638_a("selectWorld.cheats");
         }
      }

      this.field_105870_a.func_103880_b(this.field_105870_a.field_104049_k, var7, var2 + 2, var3 + 1, 16777215);
      this.field_105870_a.func_103880_b(this.field_105870_a.field_104049_k, var8, var2 + 2, var3 + 12, 8421504);
      this.field_105870_a.func_103880_b(this.field_105870_a.field_104049_k, var9, var2 + 2, var3 + 12 + 10, 8421504);
   }
}
