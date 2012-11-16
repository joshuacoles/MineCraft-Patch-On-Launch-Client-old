import org.lwjgl.input.Keyboard;

public class C_101279_asv extends C_101278_asw {

   private C_101278_asw field_104325_a;
   private C_101146_ary field_104323_b;
   private final String field_104324_c;


   public C_101279_asv(C_101278_asw var1, String var2) {
      this.field_104325_a = var1;
      this.field_104324_c = var2;
   }

   public void func_104039_c() {
      this.field_104323_b.func_103938_a();
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96 + 12, var1.func_107651_b("selectWorld.renameButton")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.cancel")));
      C_100270_agy var2 = this.field_104046_e.func_105080_d();
      C_100269_agv var3 = var2.func_107194_c(this.field_104324_c);
      String var4 = var3.func_107131_k();
      this.field_104323_b = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 100, 60, 200, 20);
      this.field_104323_b.func_103955_b(true);
      this.field_104323_b.func_103940_a(var4);
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 1) {
            this.field_104046_e.func_105053_a(this.field_104325_a);
         } else if(var1.field_103908_f == 0) {
            C_100270_agy var2 = this.field_104046_e.func_105080_d();
            var2.func_107201_a(this.field_104324_c, this.field_104323_b.func_103939_b().trim());
            this.field_104046_e.func_105053_a(this.field_104325_a);
         }

      }
   }

   protected void func_104032_a(char var1, int var2) {
      this.field_104323_b.func_103961_a(var1, var2);
      ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104323_b.func_103939_b().trim().length() > 0;
      if(var1 == 13) {
         this.func_104040_a((C_101133_arl)this.field_104050_h.get(0));
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      this.field_104323_b.func_103952_a(var1, var2, var3);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("selectWorld.renameTitle"), this.field_104044_f / 2, this.field_104045_g / 4 - 60 + 20, 16777215);
      this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.enterName"), this.field_104044_f / 2 - 100, 47, 10526880);
      this.field_104323_b.func_103954_f();
      super.func_104027_a(var1, var2, var3);
   }
}
