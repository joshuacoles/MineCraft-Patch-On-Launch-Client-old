
public class C_101291_zu extends C_101289_zr {

   public void func_112392_b() {
      this.field_112396_d = new C_101310_yh(C_101324_xz.field_112501_k, 0.5F, 0.0F);
      this.field_112401_h = 1;
      this.field_112394_f = true;
   }

   public C_101331_yx func_112393_c() {
      return new C_100556_aad(this.field_112400_a, this.field_112400_a.func_109374_D());
   }

   public float func_112382_a(long var1, float var3) {
      return 0.0F;
   }

   public float[] func_112378_a(float var1, float var2) {
      return null;
   }

   public C_100387_amw func_112379_b(float var1, float var2) {
      int var3 = 10518688;
      float var4 = C_100650_jv.func_108928_b(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      float var5 = (float)(var3 >> 16 & 255) / 255.0F;
      float var6 = (float)(var3 >> 8 & 255) / 255.0F;
      float var7 = (float)(var3 & 255) / 255.0F;
      var5 *= var4 * 0.0F + 0.15F;
      var6 *= var4 * 0.0F + 0.15F;
      var7 *= var4 * 0.0F + 0.15F;
      return this.field_112400_a.func_109363_R().func_107878_a((double)var5, (double)var6, (double)var7);
   }

   public boolean func_112380_g() {
      return false;
   }

   public boolean func_112388_e() {
      return false;
   }

   public boolean func_112390_d() {
      return false;
   }

   public float func_112391_f() {
      return 8.0F;
   }

   public boolean func_112386_a(int var1, int var2) {
      int var3 = this.field_112400_a.func_109489_b(var1, var2);
      return var3 == 0?false:C_100451_alf.field_106118_p[var3].field_106204_cB.func_108992_c();
   }

   public C_100013_k func_112374_h() {
      return new C_100013_k(100, 50, 0);
   }

   public int func_112376_i() {
      return 50;
   }

   public boolean func_112389_b(int var1, int var2) {
      return true;
   }

   public String func_112387_l() {
      return "The End";
   }
}
