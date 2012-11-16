
public class C_100952_axe extends C_101278_asw {

   private C_101250_awr field_104087_a;
   private int field_104086_b = 0;


   public C_100952_axe(C_101250_awr var1) {
      this.field_104087_a = var1;
   }

   protected void func_104032_a(char var1, int var2) {}

   public void func_104037_A_() {
      this.field_104050_h.clear();
   }

   public void func_104039_c() {
      ++this.field_104086_b;
      if(this.field_104086_b % 20 == 0) {
         this.field_104087_a.func_107034_c(new C_100242_di());
      }

      if(this.field_104087_a != null) {
         this.field_104087_a.func_107041_d();
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104034_c(0);
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("multiplayer.downloadingTerrain"), this.field_104044_f / 2, this.field_104045_g / 2 - 50, 16777215);
      super.func_104027_a(var1, var2, var3);
   }
}
