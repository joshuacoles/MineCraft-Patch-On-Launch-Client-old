
public class C_101221_aux extends C_101231_avl {

   private C_101254_awp field_112064_a;
   private C_101254_awp field_112062_b;
   private C_101254_awp field_112063_c;
   private C_101254_awp field_112060_d;
   private C_101254_awp field_112061_e;
   private C_101254_awp field_112059_f;


   public C_101221_aux() {
      this.field_112029_t = 64;
      this.field_112028_u = 64;
      this.field_112064_a = new C_101254_awp(this, 0, 0);
      this.field_112064_a.func_112205_a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
      C_101254_awp var1 = new C_101254_awp(this, 24, 0);
      var1.func_112205_a(-4.0F, -6.0F, -2.0F, 3, 4, 1);
      this.field_112064_a.func_112207_a(var1);
      C_101254_awp var2 = new C_101254_awp(this, 24, 0);
      var2.field_112225_i = true;
      var2.func_112205_a(1.0F, -6.0F, -2.0F, 3, 4, 1);
      this.field_112064_a.func_112207_a(var2);
      this.field_112062_b = new C_101254_awp(this, 0, 16);
      this.field_112062_b.func_112205_a(-3.0F, 4.0F, -3.0F, 6, 12, 6);
      this.field_112062_b.func_112200_a(0, 34).func_112205_a(-5.0F, 16.0F, 0.0F, 10, 6, 1);
      this.field_112063_c = new C_101254_awp(this, 42, 0);
      this.field_112063_c.func_112205_a(-12.0F, 1.0F, 1.5F, 10, 16, 1);
      this.field_112061_e = new C_101254_awp(this, 24, 16);
      this.field_112061_e.func_112209_a(-12.0F, 1.0F, 1.5F);
      this.field_112061_e.func_112205_a(-8.0F, 1.0F, 0.0F, 8, 12, 1);
      this.field_112060_d = new C_101254_awp(this, 42, 0);
      this.field_112060_d.field_112225_i = true;
      this.field_112060_d.func_112205_a(2.0F, 1.0F, 1.5F, 10, 16, 1);
      this.field_112059_f = new C_101254_awp(this, 24, 16);
      this.field_112059_f.field_112225_i = true;
      this.field_112059_f.func_112209_a(12.0F, 1.0F, 1.5F);
      this.field_112059_f.func_112205_a(0.0F, 1.0F, 0.0F, 8, 12, 1);
      this.field_112062_b.func_112207_a(this.field_112063_c);
      this.field_112062_b.func_112207_a(this.field_112060_d);
      this.field_112063_c.func_112207_a(this.field_112061_e);
      this.field_112060_d.func_112207_a(this.field_112059_f);
   }

   public int func_112058_a() {
      return 36;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      C_100543_og var8 = (C_100543_og)var1;
      if(var8.func_103757_h()) {
         this.field_112064_a.field_112211_f = var6 / 57.295776F;
         this.field_112064_a.field_112212_g = 3.1415927F - var5 / 57.295776F;
         this.field_112064_a.field_112224_h = 3.1415927F;
         this.field_112064_a.func_112209_a(0.0F, -2.0F, 0.0F);
         this.field_112063_c.func_112209_a(-3.0F, 0.0F, 3.0F);
         this.field_112060_d.func_112209_a(3.0F, 0.0F, 3.0F);
         this.field_112062_b.field_112211_f = 3.1415927F;
         this.field_112063_c.field_112211_f = -0.15707964F;
         this.field_112063_c.field_112212_g = -1.2566371F;
         this.field_112061_e.field_112212_g = -1.7278761F;
         this.field_112060_d.field_112211_f = this.field_112063_c.field_112211_f;
         this.field_112060_d.field_112212_g = -this.field_112063_c.field_112212_g;
         this.field_112059_f.field_112212_g = -this.field_112061_e.field_112212_g;
      } else {
         this.field_112064_a.field_112211_f = var6 / 57.295776F;
         this.field_112064_a.field_112212_g = var5 / 57.295776F;
         this.field_112064_a.field_112224_h = 0.0F;
         this.field_112064_a.func_112209_a(0.0F, 0.0F, 0.0F);
         this.field_112063_c.func_112209_a(0.0F, 0.0F, 0.0F);
         this.field_112060_d.func_112209_a(0.0F, 0.0F, 0.0F);
         this.field_112062_b.field_112211_f = 0.7853982F + C_100650_jv.func_108928_b(var4 * 0.1F) * 0.15F;
         this.field_112062_b.field_112212_g = 0.0F;
         this.field_112063_c.field_112212_g = C_100650_jv.func_108928_b(var4 * 1.3F) * 3.1415927F * 0.25F;
         this.field_112060_d.field_112212_g = -this.field_112063_c.field_112212_g;
         this.field_112061_e.field_112212_g = this.field_112063_c.field_112212_g * 0.5F;
         this.field_112059_f.field_112212_g = -this.field_112063_c.field_112212_g * 0.5F;
      }

      this.field_112064_a.func_112201_a(var7);
      this.field_112062_b.func_112201_a(var7);
   }
}
