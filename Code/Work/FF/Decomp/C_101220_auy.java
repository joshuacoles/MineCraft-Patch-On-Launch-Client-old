
public class C_101220_auy extends C_101231_avl {

   private C_101254_awp[] field_112057_a = new C_101254_awp[12];
   private C_101254_awp field_112056_b;


   public C_101220_auy() {
      for(int var1 = 0; var1 < this.field_112057_a.length; ++var1) {
         this.field_112057_a[var1] = new C_101254_awp(this, 0, 16);
         this.field_112057_a[var1].func_112205_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      this.field_112056_b = new C_101254_awp(this, 0, 0);
      this.field_112056_b.func_112205_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   public int func_112055_a() {
      return 8;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112056_b.func_112201_a(var7);
      C_101254_awp[] var8 = this.field_112057_a;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         C_101254_awp var11 = var8[var10];
         var11.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      float var8 = var3 * 3.1415927F * -0.1F;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         this.field_112057_a[var9].field_112213_d = -2.0F + C_100650_jv.func_108928_b(((float)(var9 * 2) + var3) * 0.25F);
         this.field_112057_a[var9].field_112216_c = C_100650_jv.func_108928_b(var8) * 9.0F;
         this.field_112057_a[var9].field_112214_e = C_100650_jv.func_108924_a(var8) * 9.0F;
         ++var8;
      }

      var8 = 0.7853982F + var3 * 3.1415927F * 0.03F;

      for(var9 = 4; var9 < 8; ++var9) {
         this.field_112057_a[var9].field_112213_d = 2.0F + C_100650_jv.func_108928_b(((float)(var9 * 2) + var3) * 0.25F);
         this.field_112057_a[var9].field_112216_c = C_100650_jv.func_108928_b(var8) * 7.0F;
         this.field_112057_a[var9].field_112214_e = C_100650_jv.func_108924_a(var8) * 7.0F;
         ++var8;
      }

      var8 = 0.47123894F + var3 * 3.1415927F * -0.05F;

      for(var9 = 8; var9 < 12; ++var9) {
         this.field_112057_a[var9].field_112213_d = 11.0F + C_100650_jv.func_108928_b(((float)var9 * 1.5F + var3) * 0.5F);
         this.field_112057_a[var9].field_112216_c = C_100650_jv.func_108928_b(var8) * 5.0F;
         this.field_112057_a[var9].field_112214_e = C_100650_jv.func_108924_a(var8) * 5.0F;
         ++var8;
      }

      this.field_112056_b.field_112212_g = var4 / 57.295776F;
      this.field_112056_b.field_112211_f = var5 / 57.295776F;
   }
}
