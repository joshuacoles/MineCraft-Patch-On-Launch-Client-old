import org.lwjgl.input.Keyboard;

public class C_101140_arx extends C_101278_asw {

   private static String field_104146_a = "";
   private final C_101278_asw field_104144_b;
   private final C_100909_axg field_104145_c;
   private C_101146_ary field_104143_d;


   public C_101140_arx(C_101278_asw var1, C_100909_axg var2) {
      this.field_104144_b = var1;
      this.field_104145_c = var2;
   }

   public void func_104039_c() {
      this.field_104143_d.func_103938_a();
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96 + 12, var1.func_107651_b("selectServer.select")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.cancel")));
      this.field_104143_d = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 100, 116, 200, 20);
      this.field_104143_d.func_103963_f(128);
      this.field_104143_d.func_103955_b(true);
      this.field_104143_d.func_103940_a(field_104146_a);
      ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104143_d.func_103939_b().length() > 0 && this.field_104143_d.func_103939_b().split(":").length > 0;
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
      field_104146_a = this.field_104143_d.func_103939_b();
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 1) {
            this.field_104144_b.func_104042_a(false, 0);
         } else if(var1.field_103908_f == 0) {
            this.field_104145_c.field_110709_b = this.field_104143_d.func_103939_b();
            this.field_104144_b.func_104042_a(true, 0);
         }

      }
   }

   protected void func_104032_a(char var1, int var2) {
      if(this.field_104143_d.func_103961_a(var1, var2)) {
         ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104143_d.func_103939_b().length() > 0 && this.field_104143_d.func_103939_b().split(":").length > 0;
      } else if(var2 == 28) {
         this.func_104040_a((C_101133_arl)this.field_104050_h.get(0));
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      this.field_104143_d.func_103952_a(var1, var2, var3);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("selectServer.direct"), this.field_104044_f / 2, this.field_104045_g / 4 - 60 + 20, 16777215);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("addServer.enterIp"), this.field_104044_f / 2 - 100, 100, 10526880);
      this.field_104143_d.func_103954_f();
      super.func_104027_a(var1, var2, var3);
   }

}
