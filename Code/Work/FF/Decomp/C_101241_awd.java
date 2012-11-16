
public class C_101241_awd extends C_101235_avh {

   public C_101241_awd() {
      this(0.0F, 0.0F, false);
   }

   public C_101241_awd(float var1, float var2, boolean var3) {
      super(var1, 0.0F, 64, var3?32:64);
      if(var3) {
         this.field_112094_c = new C_101254_awp(this, 0, 0);
         this.field_112094_c.func_112203_a(-4.0F, -10.0F, -4.0F, 8, 6, 8, var1);
         this.field_112094_c.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      } else {
         this.field_112094_c = new C_101254_awp(this);
         this.field_112094_c.func_112209_a(0.0F, 0.0F + var2, 0.0F);
         this.field_112094_c.func_112200_a(0, 32).func_112203_a(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
         this.field_112094_c.func_112200_a(24, 32).func_112203_a(-1.0F, -3.0F, -6.0F, 2, 4, 2, var1);
      }

   }

   public int func_112105_a() {
      return 10;
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = C_100650_jv.func_108924_a(this.field_112034_p * 3.1415927F);
      float var9 = C_100650_jv.func_108924_a((1.0F - (1.0F - this.field_112034_p) * (1.0F - this.field_112034_p)) * 3.1415927F);
      this.field_112090_f.field_112224_h = 0.0F;
      this.field_112091_g.field_112224_h = 0.0F;
      this.field_112090_f.field_112212_g = -(0.1F - var8 * 0.6F);
      this.field_112091_g.field_112212_g = 0.1F - var8 * 0.6F;
      this.field_112090_f.field_112211_f = -1.5707964F;
      this.field_112091_g.field_112211_f = -1.5707964F;
      this.field_112090_f.field_112211_f -= var8 * 1.2F - var9 * 0.4F;
      this.field_112091_g.field_112211_f -= var8 * 1.2F - var9 * 0.4F;
      this.field_112090_f.field_112224_h += C_100650_jv.func_108928_b(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_112091_g.field_112224_h -= C_100650_jv.func_108928_b(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_112090_f.field_112211_f += C_100650_jv.func_108924_a(var3 * 0.067F) * 0.05F;
      this.field_112091_g.field_112211_f -= C_100650_jv.func_108924_a(var3 * 0.067F) * 0.05F;
   }
}
