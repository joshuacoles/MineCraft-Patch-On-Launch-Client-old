
public class C_101240_awe extends C_101238_awc {

   public boolean field_112120_g = false;
   private C_101254_awp field_112121_h = (new C_101254_awp(this)).func_112204_b(64, 128);
   private C_101254_awp field_112122_i;


   public C_101240_awe(float var1) {
      super(var1, 0.0F, 64, 128);
      this.field_112121_h.func_112209_a(0.0F, -2.0F, 0.0F);
      this.field_112121_h.func_112200_a(0, 0).func_112203_a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
      this.field_112113_f.func_112207_a(this.field_112121_h);
      this.field_112122_i = (new C_101254_awp(this)).func_112204_b(64, 128);
      this.field_112122_i.func_112209_a(-5.0F, -10.03125F, -5.0F);
      this.field_112122_i.func_112200_a(0, 64).func_112205_a(0.0F, 0.0F, 0.0F, 10, 2, 10);
      this.field_112118_a.func_112207_a(this.field_112122_i);
      C_101254_awp var2 = (new C_101254_awp(this)).func_112204_b(64, 128);
      var2.func_112209_a(1.75F, -4.0F, 2.0F);
      var2.func_112200_a(0, 76).func_112205_a(0.0F, 0.0F, 0.0F, 7, 4, 7);
      var2.field_112211_f = -0.05235988F;
      var2.field_112224_h = 0.02617994F;
      this.field_112122_i.func_112207_a(var2);
      C_101254_awp var3 = (new C_101254_awp(this)).func_112204_b(64, 128);
      var3.func_112209_a(1.75F, -4.0F, 2.0F);
      var3.func_112200_a(0, 87).func_112205_a(0.0F, 0.0F, 0.0F, 4, 4, 4);
      var3.field_112211_f = -0.10471976F;
      var3.field_112224_h = 0.05235988F;
      var2.func_112207_a(var3);
      C_101254_awp var4 = (new C_101254_awp(this)).func_112204_b(64, 128);
      var4.func_112209_a(1.75F, -2.0F, 2.0F);
      var4.func_112200_a(0, 95).func_112203_a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
      var4.field_112211_f = -0.20943952F;
      var4.field_112224_h = 0.10471976F;
      var3.func_112207_a(var4);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      this.field_112113_f.field_112219_o = this.field_112113_f.field_112232_p = this.field_112113_f.field_112231_q = 0.0F;
      float var8 = 0.01F * (float)(var7.field_103212_k % 10);
      this.field_112113_f.field_112211_f = C_100650_jv.func_108924_a((float)var7.field_103233_ab * var8) * 4.5F * 3.1415927F / 180.0F;
      this.field_112113_f.field_112212_g = 0.0F;
      this.field_112113_f.field_112224_h = C_100650_jv.func_108928_b((float)var7.field_103233_ab * var8) * 2.5F * 3.1415927F / 180.0F;
      if(this.field_112120_g) {
         this.field_112113_f.field_112211_f = -0.9F;
         this.field_112113_f.field_112231_q = -0.09375F;
         this.field_112113_f.field_112232_p = 0.1875F;
      }

   }

   public int func_112119_a() {
      return 0;
   }
}
