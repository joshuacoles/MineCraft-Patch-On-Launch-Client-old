
public class C_101236_ave extends C_101231_avl {

   public C_101254_awp field_112112_a;
   public C_101254_awp field_112110_b;
   public C_101254_awp field_112111_c;
   public C_101254_awp field_112108_d;
   public C_101254_awp field_112109_e;
   public C_101254_awp field_112106_f;
   public C_101254_awp field_112107_g;


   public C_101236_ave() {
      this(0.0F);
   }

   public C_101236_ave(float var1) {
      byte var2 = 4;
      this.field_112112_a = new C_101254_awp(this, 0, 0);
      this.field_112112_a.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.field_112112_a.func_112209_a(0.0F, (float)var2, 0.0F);
      this.field_112110_b = new C_101254_awp(this, 32, 0);
      this.field_112110_b.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.field_112110_b.func_112209_a(0.0F, (float)var2, 0.0F);
      this.field_112111_c = new C_101254_awp(this, 16, 16);
      this.field_112111_c.func_112203_a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.field_112111_c.func_112209_a(0.0F, (float)var2, 0.0F);
      this.field_112108_d = new C_101254_awp(this, 0, 16);
      this.field_112108_d.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_112108_d.func_112209_a(-2.0F, (float)(12 + var2), 4.0F);
      this.field_112109_e = new C_101254_awp(this, 0, 16);
      this.field_112109_e.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_112109_e.func_112209_a(2.0F, (float)(12 + var2), 4.0F);
      this.field_112106_f = new C_101254_awp(this, 0, 16);
      this.field_112106_f.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_112106_f.func_112209_a(-2.0F, (float)(12 + var2), -4.0F);
      this.field_112107_g = new C_101254_awp(this, 0, 16);
      this.field_112107_g.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_112107_g.func_112209_a(2.0F, (float)(12 + var2), -4.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112112_a.func_112201_a(var7);
      this.field_112111_c.func_112201_a(var7);
      this.field_112108_d.func_112201_a(var7);
      this.field_112109_e.func_112201_a(var7);
      this.field_112106_f.func_112201_a(var7);
      this.field_112107_g.func_112201_a(var7);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112112_a.field_112212_g = var4 / 57.295776F;
      this.field_112112_a.field_112211_f = var5 / 57.295776F;
      this.field_112108_d.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2;
      this.field_112109_e.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_112106_f.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_112107_g.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2;
   }
}
