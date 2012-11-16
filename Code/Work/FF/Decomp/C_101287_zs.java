
public class C_101287_zs extends C_101289_zr {

   public void func_112392_b() {
      this.field_112396_d = new C_101310_yh(C_101324_xz.field_112500_j, 1.0F, 0.0F);
      this.field_112397_e = true;
      this.field_112394_f = true;
      this.field_112401_h = -1;
   }

   public C_100387_amw func_112379_b(float var1, float var2) {
      return this.field_112400_a.func_109363_R().func_107878_a(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
   }

   protected void func_112375_a() {
      float var1 = 0.1F;

      for(int var2 = 0; var2 <= 15; ++var2) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.field_112395_g[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
      }

   }

   public C_101331_yx func_112393_c() {
      return new C_101283_zy(this.field_112400_a, this.field_112400_a.func_109374_D());
   }

   public boolean func_112390_d() {
      return false;
   }

   public boolean func_112386_a(int var1, int var2) {
      return false;
   }

   public float func_112382_a(long var1, float var3) {
      return 0.5F;
   }

   public boolean func_112388_e() {
      return false;
   }

   public boolean func_112389_b(int var1, int var2) {
      return true;
   }

   public String func_112387_l() {
      return "Nether";
   }
}
