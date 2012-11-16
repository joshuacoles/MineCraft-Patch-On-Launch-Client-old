import org.lwjgl.input.Keyboard;

public class C_101147_arz extends C_101278_asw {

   private C_101278_asw field_104184_a;
   private C_101146_ary field_104182_b;
   private C_101146_ary field_104183_c;
   private C_100909_axg field_104181_d;


   public C_101147_arz(C_101278_asw var1, C_100909_axg var2) {
      this.field_104184_a = var1;
      this.field_104181_d = var2;
   }

   public void func_104039_c() {
      this.field_104183_c.func_103938_a();
      this.field_104182_b.func_103938_a();
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96 + 12, var1.func_107651_b("addServer.add")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.cancel")));
      this.field_104050_h.add(new C_101133_arl(2, this.field_104044_f / 2 - 100, 142, var1.func_107651_b("addServer.hideAddress") + ": " + (this.field_104181_d.func_110700_d()?var1.func_107651_b("gui.yes"):var1.func_107651_b("gui.no"))));
      this.field_104183_c = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 100, 66, 200, 20);
      this.field_104183_c.func_103955_b(true);
      this.field_104183_c.func_103940_a(this.field_104181_d.field_110711_a);
      this.field_104182_b = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 100, 106, 200, 20);
      this.field_104182_b.func_103963_f(128);
      this.field_104182_b.func_103940_a(this.field_104181_d.field_110709_b);
      ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104182_b.func_103939_b().length() > 0 && this.field_104182_b.func_103939_b().split(":").length > 0 && this.field_104183_c.func_103939_b().length() > 0;
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 1) {
            this.field_104184_a.func_104042_a(false, 0);
         } else if(var1.field_103908_f == 0) {
            this.field_104181_d.field_110711_a = this.field_104183_c.func_103939_b();
            this.field_104181_d.field_110709_b = this.field_104182_b.func_103939_b();
            this.field_104184_a.func_104042_a(true, 0);
         } else if(var1.field_103908_f == 2) {
            C_100361_be var2 = C_100361_be.func_107654_a();
            this.field_104181_d.func_110698_b(!this.field_104181_d.func_110700_d());
            ((C_101133_arl)this.field_104050_h.get(2)).field_103911_e = var2.func_107651_b("addServer.hideAddress") + ": " + (this.field_104181_d.func_110700_d()?var2.func_107651_b("gui.yes"):var2.func_107651_b("gui.no"));
         }

      }
   }

   protected void func_104032_a(char var1, int var2) {
      this.field_104183_c.func_103961_a(var1, var2);
      this.field_104182_b.func_103961_a(var1, var2);
      if(var1 == 9) {
         if(this.field_104183_c.func_103966_l()) {
            this.field_104183_c.func_103955_b(false);
            this.field_104182_b.func_103955_b(true);
         } else {
            this.field_104183_c.func_103955_b(true);
            this.field_104182_b.func_103955_b(false);
         }
      }

      if(var1 == 13) {
         this.func_104040_a((C_101133_arl)this.field_104050_h.get(0));
      }

      ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104182_b.func_103939_b().length() > 0 && this.field_104182_b.func_103939_b().split(":").length > 0 && this.field_104183_c.func_103939_b().length() > 0;
      if(((C_101133_arl)this.field_104050_h.get(0)).field_103909_g) {
         String var3 = this.field_104182_b.func_103939_b().trim();
         String[] var4 = var3.split(":");
         if(var4.length > 2) {
            ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = false;
         }
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      this.field_104182_b.func_103952_a(var1, var2, var3);
      this.field_104183_c.func_103952_a(var1, var2, var3);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("addServer.title"), this.field_104044_f / 2, 17, 16777215);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("addServer.enterName"), this.field_104044_f / 2 - 100, 53, 10526880);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("addServer.enterIp"), this.field_104044_f / 2 - 100, 94, 10526880);
      this.field_104183_c.func_103954_f();
      this.field_104182_b.func_103954_f();
      super.func_104027_a(var1, var2, var3);
   }
}
