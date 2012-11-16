
public class C_101246_avv extends C_101260_awh {

   public C_101246_avv() {
      this(0.0F);
   }

   public C_101246_avv(float var1) {
      super(var1, 0.0F, 64, 32);
      this.field_112090_f = new C_101254_awp(this, 40, 16);
      this.field_112090_f.func_112203_a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.field_112090_f.func_112209_a(-5.0F, 2.0F, 0.0F);
      this.field_112091_g = new C_101254_awp(this, 40, 16);
      this.field_112091_g.field_112225_i = true;
      this.field_112091_g.func_112203_a(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.field_112091_g.func_112209_a(5.0F, 2.0F, 0.0F);
      this.field_112101_h = new C_101254_awp(this, 0, 16);
      this.field_112101_h.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.field_112101_h.func_112209_a(-2.0F, 12.0F, 0.0F);
      this.field_112102_i = new C_101254_awp(this, 0, 16);
      this.field_112102_i.field_112225_i = true;
      this.field_112102_i.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.field_112102_i.func_112209_a(2.0F, 12.0F, 0.0F);
   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      this.field_112096_o = ((C_101106_pw)var1).func_103693_m() == 1;
      super.func_112025_a(var1, var2, var3, var4);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
   }
}
