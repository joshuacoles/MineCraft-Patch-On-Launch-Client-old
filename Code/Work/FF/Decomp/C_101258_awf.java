
public class C_101258_awf extends C_101231_avl {

   private C_101254_awp[] field_112158_a;
   private C_101254_awp[] field_112157_b;


   public C_101258_awf() {
      this.field_112029_t = 64;
      this.field_112028_u = 64;
      this.field_112158_a = new C_101254_awp[3];
      this.field_112158_a[0] = new C_101254_awp(this, 0, 16);
      this.field_112158_a[0].func_112205_a(-10.0F, 3.9F, -0.5F, 20, 3, 3);
      this.field_112158_a[1] = (new C_101254_awp(this)).func_112204_b(this.field_112029_t, this.field_112028_u);
      this.field_112158_a[1].func_112209_a(-2.0F, 6.9F, -0.5F);
      this.field_112158_a[1].func_112200_a(0, 22).func_112205_a(0.0F, 0.0F, 0.0F, 3, 10, 3);
      this.field_112158_a[1].func_112200_a(24, 22).func_112205_a(-4.0F, 1.5F, 0.5F, 11, 2, 2);
      this.field_112158_a[1].func_112200_a(24, 22).func_112205_a(-4.0F, 4.0F, 0.5F, 11, 2, 2);
      this.field_112158_a[1].func_112200_a(24, 22).func_112205_a(-4.0F, 6.5F, 0.5F, 11, 2, 2);
      this.field_112158_a[2] = new C_101254_awp(this, 12, 22);
      this.field_112158_a[2].func_112205_a(0.0F, 0.0F, 0.0F, 3, 6, 3);
      this.field_112157_b = new C_101254_awp[3];
      this.field_112157_b[0] = new C_101254_awp(this, 0, 0);
      this.field_112157_b[0].func_112205_a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.field_112157_b[1] = new C_101254_awp(this, 32, 0);
      this.field_112157_b[1].func_112205_a(-4.0F, -4.0F, -4.0F, 6, 6, 6);
      this.field_112157_b[1].field_112216_c = -8.0F;
      this.field_112157_b[1].field_112213_d = 4.0F;
      this.field_112157_b[2] = new C_101254_awp(this, 32, 0);
      this.field_112157_b[2].func_112205_a(-4.0F, -4.0F, -4.0F, 6, 6, 6);
      this.field_112157_b[2].field_112216_c = 10.0F;
      this.field_112157_b[2].field_112213_d = 4.0F;
   }

   public int func_112156_a() {
      return 32;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      C_101254_awp[] var8 = this.field_112157_b;
      int var9 = var8.length;

      int var10;
      C_101254_awp var11;
      for(var10 = 0; var10 < var9; ++var10) {
         var11 = var8[var10];
         var11.func_112201_a(var7);
      }

      var8 = this.field_112158_a;
      var9 = var8.length;

      for(var10 = 0; var10 < var9; ++var10) {
         var11 = var8[var10];
         var11.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      float var8 = C_100650_jv.func_108928_b(var3 * 0.1F);
      this.field_112158_a[1].field_112211_f = (0.065F + 0.05F * var8) * 3.1415927F;
      this.field_112158_a[2].func_112209_a(-2.0F, 6.9F + C_100650_jv.func_108928_b(this.field_112158_a[1].field_112211_f) * 10.0F, -0.5F + C_100650_jv.func_108924_a(this.field_112158_a[1].field_112211_f) * 10.0F);
      this.field_112158_a[2].field_112211_f = (0.265F + 0.1F * var8) * 3.1415927F;
      this.field_112157_b[0].field_112212_g = var4 / 57.295776F;
      this.field_112157_b[0].field_112211_f = var5 / 57.295776F;
   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      C_100579_pa var5 = (C_100579_pa)var1;

      for(int var6 = 1; var6 < 3; ++var6) {
         this.field_112157_b[var6].field_112212_g = (var5.func_103698_a(var6 - 1) - var1.field_103469_aw) / 57.295776F;
         this.field_112157_b[var6].field_112211_f = var5.func_103701_r(var6 - 1) / 57.295776F;
      }

   }
}
