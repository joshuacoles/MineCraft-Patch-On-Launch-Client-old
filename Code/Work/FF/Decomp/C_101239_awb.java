
public class C_101239_awb extends C_101231_avl {

   public C_101254_awp field_112129_a;
   public C_101254_awp field_112127_b;
   public C_101254_awp field_112128_c;
   public C_101254_awp field_112125_d;
   public C_101254_awp field_112126_e;
   public C_101254_awp field_112124_f;


   public C_101239_awb() {
      this(0.0F);
   }

   public C_101239_awb(float var1) {
      this(var1, -7.0F);
   }

   public C_101239_awb(float var1, float var2) {
      short var3 = 128;
      short var4 = 128;
      this.field_112129_a = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112129_a.func_112209_a(0.0F, 0.0F + var2, -2.0F);
      this.field_112129_a.func_112200_a(0, 0).func_112203_a(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.field_112129_a.func_112200_a(24, 0).func_112203_a(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      this.field_112127_b = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112127_b.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      this.field_112127_b.func_112200_a(0, 40).func_112203_a(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.field_112127_b.func_112200_a(0, 70).func_112203_a(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      this.field_112128_c = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112128_c.func_112209_a(0.0F, -7.0F, 0.0F);
      this.field_112128_c.func_112200_a(60, 21).func_112203_a(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.field_112125_d = (new C_101254_awp(this)).func_112204_b(var3, var4);
      this.field_112125_d.func_112209_a(0.0F, -7.0F, 0.0F);
      this.field_112125_d.func_112200_a(60, 58).func_112203_a(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.field_112126_e = (new C_101254_awp(this, 0, 22)).func_112204_b(var3, var4);
      this.field_112126_e.func_112209_a(-4.0F, 18.0F + var2, 0.0F);
      this.field_112126_e.func_112200_a(37, 0).func_112203_a(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      this.field_112124_f = (new C_101254_awp(this, 0, 22)).func_112204_b(var3, var4);
      this.field_112124_f.field_112225_i = true;
      this.field_112124_f.func_112200_a(60, 0).func_112209_a(5.0F, 18.0F + var2, 0.0F);
      this.field_112124_f.func_112203_a(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112129_a.func_112201_a(var7);
      this.field_112127_b.func_112201_a(var7);
      this.field_112126_e.func_112201_a(var7);
      this.field_112124_f.func_112201_a(var7);
      this.field_112128_c.func_112201_a(var7);
      this.field_112125_d.func_112201_a(var7);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112129_a.field_112212_g = var4 / 57.295776F;
      this.field_112129_a.field_112211_f = var5 / 57.295776F;
      this.field_112126_e.field_112211_f = -1.5F * this.func_112123_a(var1, 13.0F) * var2;
      this.field_112124_f.field_112211_f = 1.5F * this.func_112123_a(var1, 13.0F) * var2;
      this.field_112126_e.field_112212_g = 0.0F;
      this.field_112124_f.field_112212_g = 0.0F;
   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      C_100557_or var5 = (C_100557_or)var1;
      int var6 = var5.func_103683_n();
      if(var6 > 0) {
         this.field_112128_c.field_112211_f = -2.0F + 1.5F * this.func_112123_a((float)var6 - var4, 10.0F);
         this.field_112125_d.field_112211_f = -2.0F + 1.5F * this.func_112123_a((float)var6 - var4, 10.0F);
      } else {
         int var7 = var5.func_103680_o();
         if(var7 > 0) {
            this.field_112128_c.field_112211_f = -0.8F + 0.025F * this.func_112123_a((float)var7, 70.0F);
            this.field_112125_d.field_112211_f = 0.0F;
         } else {
            this.field_112128_c.field_112211_f = (-0.2F + 1.5F * this.func_112123_a(var2, 13.0F)) * var3;
            this.field_112125_d.field_112211_f = (-0.2F - 1.5F * this.func_112123_a(var2, 13.0F)) * var3;
         }
      }

   }

   private float func_112123_a(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }
}
