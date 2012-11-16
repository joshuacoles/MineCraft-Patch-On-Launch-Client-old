
public class C_101238_awc extends C_101231_avl {

   public C_101254_awp field_112118_a;
   public C_101254_awp field_112116_b;
   public C_101254_awp field_112117_c;
   public C_101254_awp field_112114_d;
   public C_101254_awp field_112115_e;
   public C_101254_awp field_112113_f;


   public C_101238_awc(float var1) {
      this(var1, 0.0F, 64, 64);
   }

   public C_101238_awc(float var1, float var2, int var3, int var4) {
      this.field_112118_a = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112118_a.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      this.field_112118_a.func_112200_a(0, 0).func_112203_a(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.field_112113_f = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112113_f.func_112209_a(0.0F, var2 - 2.0F, 0.0F);
      this.field_112113_f.func_112200_a(24, 0).func_112203_a(-1.0F, -1.0F, -6.0F, 2, 4, 2, var1);
      this.field_112118_a.func_112207_a(this.field_112113_f);
      this.field_112116_b = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112116_b.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      this.field_112116_b.func_112200_a(16, 20).func_112203_a(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.field_112116_b.func_112200_a(0, 38).func_112203_a(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      this.field_112117_c = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112117_c.func_112209_a(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.field_112117_c.func_112200_a(44, 22).func_112203_a(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.field_112117_c.func_112200_a(44, 22).func_112203_a(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.field_112117_c.func_112200_a(40, 38).func_112203_a(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      this.field_112114_d = (new C_101254_awp(this, 0, 22)).func_112204_b(var3, var4);
      this.field_112114_d.func_112209_a(-2.0F, 12.0F + var2, 0.0F);
      this.field_112114_d.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_112115_e = (new C_101254_awp(this, 0, 22)).func_112204_b(var3, var4);
      this.field_112115_e.field_112225_i = true;
      this.field_112115_e.func_112209_a(2.0F, 12.0F + var2, 0.0F);
      this.field_112115_e.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112118_a.func_112201_a(var7);
      this.field_112116_b.func_112201_a(var7);
      this.field_112114_d.func_112201_a(var7);
      this.field_112115_e.func_112201_a(var7);
      this.field_112117_c.func_112201_a(var7);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112118_a.field_112212_g = var4 / 57.295776F;
      this.field_112118_a.field_112211_f = var5 / 57.295776F;
      this.field_112117_c.field_112213_d = 3.0F;
      this.field_112117_c.field_112214_e = -1.0F;
      this.field_112117_c.field_112211_f = -0.75F;
      this.field_112114_d.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.field_112115_e.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2 * 0.5F;
      this.field_112114_d.field_112212_g = 0.0F;
      this.field_112115_e.field_112212_g = 0.0F;
   }
}
