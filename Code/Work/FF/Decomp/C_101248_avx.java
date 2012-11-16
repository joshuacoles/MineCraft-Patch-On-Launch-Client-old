
public class C_101248_avx extends C_101231_avl {

   public C_101254_awp field_112148_a;
   public C_101254_awp field_112146_b;
   public C_101254_awp field_112147_c;
   public C_101254_awp field_112144_d;
   public C_101254_awp field_112145_e;


   public C_101248_avx() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.field_112147_c = (new C_101254_awp(this, 0, 0)).func_112204_b(64, 64);
      this.field_112147_c.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.field_112147_c.func_112209_a(0.0F, 0.0F + var1, 0.0F);
      this.field_112144_d = (new C_101254_awp(this, 32, 0)).func_112204_b(64, 64);
      this.field_112144_d.func_112203_a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.field_112144_d.func_112209_a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.field_112145_e = (new C_101254_awp(this, 32, 0)).func_112204_b(64, 64);
      this.field_112145_e.func_112203_a(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.field_112145_e.func_112209_a(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.field_112148_a = (new C_101254_awp(this, 0, 16)).func_112204_b(64, 64);
      this.field_112148_a.func_112203_a(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.field_112148_a.func_112209_a(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.field_112146_b = (new C_101254_awp(this, 0, 36)).func_112204_b(64, 64);
      this.field_112146_b.func_112203_a(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.field_112146_b.func_112209_a(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      this.field_112147_c.field_112212_g = var4 / 57.295776F;
      this.field_112147_c.field_112211_f = var5 / 57.295776F;
      this.field_112148_a.field_112212_g = var4 / 57.295776F * 0.25F;
      float var8 = C_100650_jv.func_108924_a(this.field_112148_a.field_112212_g);
      float var9 = C_100650_jv.func_108928_b(this.field_112148_a.field_112212_g);
      this.field_112144_d.field_112224_h = 1.0F;
      this.field_112145_e.field_112224_h = -1.0F;
      this.field_112144_d.field_112212_g = 0.0F + this.field_112148_a.field_112212_g;
      this.field_112145_e.field_112212_g = 3.1415927F + this.field_112148_a.field_112212_g;
      this.field_112144_d.field_112216_c = var9 * 5.0F;
      this.field_112144_d.field_112214_e = -var8 * 5.0F;
      this.field_112145_e.field_112216_c = -var9 * 5.0F;
      this.field_112145_e.field_112214_e = var8 * 5.0F;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112148_a.func_112201_a(var7);
      this.field_112146_b.func_112201_a(var7);
      this.field_112147_c.func_112201_a(var7);
      this.field_112144_d.func_112201_a(var7);
      this.field_112145_e.func_112201_a(var7);
   }
}
