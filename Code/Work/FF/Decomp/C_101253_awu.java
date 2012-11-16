import net.minecraft.client.Minecraft;

public class C_101253_awu extends C_101278_asw {

   private C_101250_awr field_104250_a;
   private boolean field_104249_b = false;


   public C_101253_awu(Minecraft var1, C_100909_axg var2) {
      this.field_104046_e = var1;
      C_100953_axf var3 = C_100953_axf.func_111142_a(var2.field_110709_b);
      var1.func_105083_a((C_100942_awz)null);
      var1.func_105073_a(var2);
      this.func_104246_a(var3.func_111140_a(), var3.func_111144_b());
   }

   public C_101253_awu(Minecraft var1, String var2, int var3) {
      this.field_104046_e = var1;
      var1.func_105083_a((C_100942_awz)null);
      this.func_104246_a(var2, var3);
   }

   private void func_104246_a(String var1, int var2) {
      System.out.println("Connecting to " + var1 + ", " + var2);
      (new C_100935_awv(this, var1, var2)).start();
   }

   public void func_104039_c() {
      if(this.field_104250_a != null) {
         this.field_104250_a.func_107041_d();
      }

   }

   protected void func_104032_a(char var1, int var2) {}

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.cancel")));
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0) {
         this.field_104249_b = true;
         if(this.field_104250_a != null) {
            this.field_104250_a.func_107042_e();
         }

         this.field_104046_e.func_105053_a(new C_100098_bcz());
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      C_100361_be var4 = C_100361_be.func_107654_a();
      if(this.field_104250_a == null) {
         this.func_103879_a(this.field_104049_k, var4.func_107651_b("connect.connecting"), this.field_104044_f / 2, this.field_104045_g / 2 - 50, 16777215);
         this.func_103879_a(this.field_104049_k, "", this.field_104044_f / 2, this.field_104045_g / 2 - 10, 16777215);
      } else {
         this.func_103879_a(this.field_104049_k, var4.func_107651_b("connect.authorizing"), this.field_104044_f / 2, this.field_104045_g / 2 - 50, 16777215);
         this.func_103879_a(this.field_104049_k, this.field_104250_a.field_107049_a, this.field_104044_f / 2, this.field_104045_g / 2 - 10, 16777215);
      }

      super.func_104027_a(var1, var2, var3);
   }

   // $FF: synthetic method
   static C_101250_awr func_104248_a(C_101253_awu var0, C_101250_awr var1) {
      return var0.field_104250_a = var1;
   }

   // $FF: synthetic method
   static Minecraft func_104240_a(C_101253_awu var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static boolean func_104241_b(C_101253_awu var0) {
      return var0.field_104249_b;
   }

   // $FF: synthetic method
   static Minecraft func_104243_c(C_101253_awu var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static C_101250_awr func_104242_d(C_101253_awu var0) {
      return var0.field_104250_a;
   }

   // $FF: synthetic method
   static Minecraft func_104247_e(C_101253_awu var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104244_f(C_101253_awu var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104245_g(C_101253_awu var0) {
      return var0.field_104046_e;
   }
}
