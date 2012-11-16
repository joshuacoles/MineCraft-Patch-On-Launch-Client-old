
public class C_101149_asf extends C_101130_aro {

   public void func_104037_A_() {
      super.func_104037_A_();
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g - 40, var1.func_107651_b("multiplayer.stopSleeping")));
   }

   protected void func_104032_a(char var1, int var2) {
      if(var2 == 1) {
         this.func_104102_g();
      } else if(var2 == 28) {
         String var3 = this.field_104097_a.func_103939_b().trim();
         if(var3.length() > 0) {
            this.field_104046_e.field_105120_g.func_104556_c(var3);
         }

         this.field_104097_a.func_103940_a("");
         this.field_104046_e.field_105137_v.func_103991_b().func_103893_c();
      } else {
         super.func_104032_a(var1, var2);
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 1) {
         this.func_104102_g();
      } else {
         super.func_104040_a(var1);
      }

   }

   private void func_104102_g() {
      C_101250_awr var1 = this.field_104046_e.field_105120_g.field_104564_a;
      var1.func_107034_c(new C_100231_eb(this.field_104046_e.field_105120_g, 3));
   }
}
