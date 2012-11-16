
public class C_101218_ava extends C_101231_avl {

   public C_101254_awp field_112053_a = (new C_101254_awp(this)).func_112200_a(0, 0).func_112205_a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
   public C_101254_awp field_112051_b = (new C_101254_awp(this)).func_112200_a(16, 0).func_112205_a(0.0F, -5.0F, 0.0F, 6, 10, 0);
   public C_101254_awp field_112052_c = (new C_101254_awp(this)).func_112200_a(0, 10).func_112205_a(0.0F, -4.0F, -0.99F, 5, 8, 1);
   public C_101254_awp field_112049_d = (new C_101254_awp(this)).func_112200_a(12, 10).func_112205_a(0.0F, -4.0F, -0.01F, 5, 8, 1);
   public C_101254_awp field_112050_e = (new C_101254_awp(this)).func_112200_a(24, 10).func_112205_a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public C_101254_awp field_112047_f = (new C_101254_awp(this)).func_112200_a(24, 10).func_112205_a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public C_101254_awp field_112048_g = (new C_101254_awp(this)).func_112200_a(12, 0).func_112205_a(-1.0F, -5.0F, 0.0F, 2, 10, 0);


   public C_101218_ava() {
      this.field_112053_a.func_112209_a(0.0F, 0.0F, -1.0F);
      this.field_112051_b.func_112209_a(0.0F, 0.0F, 1.0F);
      this.field_112048_g.field_112212_g = 1.5707964F;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112053_a.func_112201_a(var7);
      this.field_112051_b.func_112201_a(var7);
      this.field_112048_g.func_112201_a(var7);
      this.field_112052_c.func_112201_a(var7);
      this.field_112049_d.func_112201_a(var7);
      this.field_112050_e.func_112201_a(var7);
      this.field_112047_f.func_112201_a(var7);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      float var8 = (C_100650_jv.func_108924_a(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.field_112053_a.field_112212_g = 3.1415927F + var8;
      this.field_112051_b.field_112212_g = -var8;
      this.field_112052_c.field_112212_g = var8;
      this.field_112049_d.field_112212_g = -var8;
      this.field_112050_e.field_112212_g = var8 - var8 * 2.0F * var2;
      this.field_112047_f.field_112212_g = var8 - var8 * 2.0F * var3;
      this.field_112052_c.field_112216_c = C_100650_jv.func_108924_a(var8);
      this.field_112049_d.field_112216_c = C_100650_jv.func_108924_a(var8);
      this.field_112050_e.field_112216_c = C_100650_jv.func_108924_a(var8);
      this.field_112047_f.field_112216_c = C_100650_jv.func_108924_a(var8);
   }
}
