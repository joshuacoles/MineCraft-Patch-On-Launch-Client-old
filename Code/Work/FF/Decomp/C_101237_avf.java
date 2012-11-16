
public class C_101237_avf extends C_101235_avh {

   public boolean field_112104_a = false;
   public boolean field_112103_b = false;


   public C_101237_avf() {
      super(0.0F, -14.0F, 64, 32);
      float var1 = -14.0F;
      float var2 = 0.0F;
      this.field_112092_d = new C_101254_awp(this, 0, 16);
      this.field_112092_d.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.field_112092_d.func_112209_a(0.0F, 0.0F + var1, 0.0F);
      this.field_112093_e = new C_101254_awp(this, 32, 16);
      this.field_112093_e.func_112203_a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var2);
      this.field_112093_e.func_112209_a(0.0F, 0.0F + var1, 0.0F);
      this.field_112090_f = new C_101254_awp(this, 56, 0);
      this.field_112090_f.func_112203_a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.field_112090_f.func_112209_a(-3.0F, 2.0F + var1, 0.0F);
      this.field_112091_g = new C_101254_awp(this, 56, 0);
      this.field_112091_g.field_112225_i = true;
      this.field_112091_g.func_112203_a(-1.0F, -2.0F, -1.0F, 2, 30, 2, var2);
      this.field_112091_g.func_112209_a(5.0F, 2.0F + var1, 0.0F);
      this.field_112101_h = new C_101254_awp(this, 56, 0);
      this.field_112101_h.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.field_112101_h.func_112209_a(-2.0F, 12.0F + var1, 0.0F);
      this.field_112102_i = new C_101254_awp(this, 56, 0);
      this.field_112102_i.field_112225_i = true;
      this.field_112102_i.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 30, 2, var2);
      this.field_112102_i.func_112209_a(2.0F, 12.0F + var1, 0.0F);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      this.field_112094_c.field_112222_j = true;
      float var8 = -14.0F;
      this.field_112093_e.field_112211_f = 0.0F;
      this.field_112093_e.field_112213_d = var8;
      this.field_112093_e.field_112214_e = -0.0F;
      this.field_112101_h.field_112211_f -= 0.0F;
      this.field_112102_i.field_112211_f -= 0.0F;
      this.field_112090_f.field_112211_f = (float)((double)this.field_112090_f.field_112211_f * 0.5D);
      this.field_112091_g.field_112211_f = (float)((double)this.field_112091_g.field_112211_f * 0.5D);
      this.field_112101_h.field_112211_f = (float)((double)this.field_112101_h.field_112211_f * 0.5D);
      this.field_112102_i.field_112211_f = (float)((double)this.field_112102_i.field_112211_f * 0.5D);
      float var9 = 0.4F;
      if(this.field_112090_f.field_112211_f > var9) {
         this.field_112090_f.field_112211_f = var9;
      }

      if(this.field_112091_g.field_112211_f > var9) {
         this.field_112091_g.field_112211_f = var9;
      }

      if(this.field_112090_f.field_112211_f < -var9) {
         this.field_112090_f.field_112211_f = -var9;
      }

      if(this.field_112091_g.field_112211_f < -var9) {
         this.field_112091_g.field_112211_f = -var9;
      }

      if(this.field_112101_h.field_112211_f > var9) {
         this.field_112101_h.field_112211_f = var9;
      }

      if(this.field_112102_i.field_112211_f > var9) {
         this.field_112102_i.field_112211_f = var9;
      }

      if(this.field_112101_h.field_112211_f < -var9) {
         this.field_112101_h.field_112211_f = -var9;
      }

      if(this.field_112102_i.field_112211_f < -var9) {
         this.field_112102_i.field_112211_f = -var9;
      }

      if(this.field_112104_a) {
         this.field_112090_f.field_112211_f = -0.5F;
         this.field_112091_g.field_112211_f = -0.5F;
         this.field_112090_f.field_112224_h = 0.05F;
         this.field_112091_g.field_112224_h = -0.05F;
      }

      this.field_112090_f.field_112214_e = 0.0F;
      this.field_112091_g.field_112214_e = 0.0F;
      this.field_112101_h.field_112214_e = 0.0F;
      this.field_112102_i.field_112214_e = 0.0F;
      this.field_112101_h.field_112213_d = 9.0F + var8;
      this.field_112102_i.field_112213_d = 9.0F + var8;
      this.field_112094_c.field_112214_e = -0.0F;
      this.field_112094_c.field_112213_d = var8 + 1.0F;
      this.field_112092_d.field_112216_c = this.field_112094_c.field_112216_c;
      this.field_112092_d.field_112213_d = this.field_112094_c.field_112213_d;
      this.field_112092_d.field_112214_e = this.field_112094_c.field_112214_e;
      this.field_112092_d.field_112211_f = this.field_112094_c.field_112211_f;
      this.field_112092_d.field_112212_g = this.field_112094_c.field_112212_g;
      this.field_112092_d.field_112224_h = this.field_112094_c.field_112224_h;
      if(this.field_112103_b) {
         float var10 = 1.0F;
         this.field_112094_c.field_112213_d -= var10 * 5.0F;
      }

   }
}
