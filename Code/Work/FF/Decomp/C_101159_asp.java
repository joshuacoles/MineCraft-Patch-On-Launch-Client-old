
public class C_101159_asp extends C_101278_asw {

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101300_atd(0, this.field_104044_f / 2 - 155, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.toMenu")));
      this.field_104050_h.add(new C_101300_atd(1, this.field_104044_f / 2 - 155 + 160, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("menu.quit")));
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0) {
         this.field_104046_e.func_105053_a(new C_100098_bcz());
      } else if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105079_g();
      }

   }

   protected void func_104032_a(char var1, int var2) {}

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, "Out of memory!", this.field_104044_f / 2, this.field_104045_g / 4 - 60 + 20, 16777215);
      this.func_103880_b(this.field_104049_k, "Minecraft has run out of memory.", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 0, 10526880);
      this.func_103880_b(this.field_104049_k, "This could be caused by a bug in the game or by the", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 18, 10526880);
      this.func_103880_b(this.field_104049_k, "Java Virtual Machine not being allocated enough", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 27, 10526880);
      this.func_103880_b(this.field_104049_k, "memory. If you are playing in a web browser, try", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 36, 10526880);
      this.func_103880_b(this.field_104049_k, "downloading the game and playing it offline.", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 45, 10526880);
      this.func_103880_b(this.field_104049_k, "To prevent level corruption, the current game has quit.", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 63, 10526880);
      this.func_103880_b(this.field_104049_k, "We\'ve tried to free up enough memory to let you go back to", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 81, 10526880);
      this.func_103880_b(this.field_104049_k, "the main menu and back to playing, but this may not have worked.", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 90, 10526880);
      this.func_103880_b(this.field_104049_k, "Please restart the game if you see this message again.", this.field_104044_f / 2 - 140, this.field_104045_g / 4 - 60 + 60 + 99, 10526880);
      super.func_104027_a(var1, var2, var3);
   }
}
