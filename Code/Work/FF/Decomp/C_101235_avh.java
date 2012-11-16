import org.lwjgl.opengl.GL11;

public class C_101235_avh extends C_101231_avl {

   public C_101254_awp field_112094_c;
   public C_101254_awp field_112092_d;
   public C_101254_awp field_112093_e;
   public C_101254_awp field_112090_f;
   public C_101254_awp field_112091_g;
   public C_101254_awp field_112101_h;
   public C_101254_awp field_112102_i;
   public C_101254_awp field_112099_j;
   public C_101254_awp field_112100_k;
   public int field_112097_l;
   public int field_112098_m;
   public boolean field_112095_n;
   public boolean field_112096_o;


   public C_101235_avh() {
      this(0.0F);
   }

   public C_101235_avh(float var1) {
      this(var1, 0.0F, 64, 32);
   }

   public C_101235_avh(float var1, float var2, int var3, int var4) {
      this.field_112097_l = 0;
      this.field_112098_m = 0;
      this.field_112095_n = false;
      this.field_112096_o = false;
      this.field_112029_t = var3;
      this.field_112028_u = var4;
      this.field_112100_k = new C_101254_awp(this, 0, 0);
      this.field_112100_k.func_112203_a(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      this.field_112099_j = new C_101254_awp(this, 24, 0);
      this.field_112099_j.func_112203_a(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      this.field_112094_c = new C_101254_awp(this, 0, 0);
      this.field_112094_c.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.field_112094_c.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      this.field_112092_d = new C_101254_awp(this, 32, 0);
      this.field_112092_d.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.field_112092_d.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      this.field_112093_e = new C_101254_awp(this, 16, 16);
      this.field_112093_e.func_112203_a(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.field_112093_e.func_112209_a(0.0F, 0.0F + var2, 0.0F);
      this.field_112090_f = new C_101254_awp(this, 40, 16);
      this.field_112090_f.func_112203_a(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.field_112090_f.func_112209_a(-5.0F, 2.0F + var2, 0.0F);
      this.field_112091_g = new C_101254_awp(this, 40, 16);
      this.field_112091_g.field_112225_i = true;
      this.field_112091_g.func_112203_a(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.field_112091_g.func_112209_a(5.0F, 2.0F + var2, 0.0F);
      this.field_112101_h = new C_101254_awp(this, 0, 16);
      this.field_112101_h.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_112101_h.func_112209_a(-1.9F, 12.0F + var2, 0.0F);
      this.field_112102_i = new C_101254_awp(this, 0, 16);
      this.field_112102_i.field_112225_i = true;
      this.field_112102_i.func_112203_a(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.field_112102_i.func_112209_a(1.9F, 12.0F + var2, 0.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      if(this.field_112030_s) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glScalef(1.5F / var8, 1.5F / var8, 1.5F / var8);
         GL11.glTranslatef(0.0F, 16.0F * var7, 0.0F);
         this.field_112094_c.func_112201_a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.field_112093_e.func_112201_a(var7);
         this.field_112090_f.func_112201_a(var7);
         this.field_112091_g.func_112201_a(var7);
         this.field_112101_h.func_112201_a(var7);
         this.field_112102_i.func_112201_a(var7);
         this.field_112092_d.func_112201_a(var7);
         GL11.glPopMatrix();
      } else {
         this.field_112094_c.func_112201_a(var7);
         this.field_112093_e.func_112201_a(var7);
         this.field_112090_f.func_112201_a(var7);
         this.field_112091_g.func_112201_a(var7);
         this.field_112101_h.func_112201_a(var7);
         this.field_112102_i.func_112201_a(var7);
         this.field_112092_d.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112094_c.field_112212_g = var4 / 57.295776F;
      this.field_112094_c.field_112211_f = var5 / 57.295776F;
      this.field_112092_d.field_112212_g = this.field_112094_c.field_112212_g;
      this.field_112092_d.field_112211_f = this.field_112094_c.field_112211_f;
      this.field_112090_f.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F;
      this.field_112091_g.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.field_112090_f.field_112224_h = 0.0F;
      this.field_112091_g.field_112224_h = 0.0F;
      this.field_112101_h.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2;
      this.field_112102_i.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_112101_h.field_112212_g = 0.0F;
      this.field_112102_i.field_112212_g = 0.0F;
      if(this.field_112032_q) {
         this.field_112090_f.field_112211_f += -0.62831855F;
         this.field_112091_g.field_112211_f += -0.62831855F;
         this.field_112101_h.field_112211_f = -1.2566371F;
         this.field_112102_i.field_112211_f = -1.2566371F;
         this.field_112101_h.field_112212_g = 0.31415927F;
         this.field_112102_i.field_112212_g = -0.31415927F;
      }

      if(this.field_112097_l != 0) {
         this.field_112091_g.field_112211_f = this.field_112091_g.field_112211_f * 0.5F - 0.31415927F * (float)this.field_112097_l;
      }

      if(this.field_112098_m != 0) {
         this.field_112090_f.field_112211_f = this.field_112090_f.field_112211_f * 0.5F - 0.31415927F * (float)this.field_112098_m;
      }

      this.field_112090_f.field_112212_g = 0.0F;
      this.field_112091_g.field_112212_g = 0.0F;
      float var8;
      float var9;
      if(this.field_112034_p > -9990.0F) {
         var8 = this.field_112034_p;
         this.field_112093_e.field_112212_g = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var8) * 3.1415927F * 2.0F) * 0.2F;
         this.field_112090_f.field_112214_e = C_100650_jv.func_108924_a(this.field_112093_e.field_112212_g) * 5.0F;
         this.field_112090_f.field_112216_c = -C_100650_jv.func_108928_b(this.field_112093_e.field_112212_g) * 5.0F;
         this.field_112091_g.field_112214_e = -C_100650_jv.func_108924_a(this.field_112093_e.field_112212_g) * 5.0F;
         this.field_112091_g.field_112216_c = C_100650_jv.func_108928_b(this.field_112093_e.field_112212_g) * 5.0F;
         this.field_112090_f.field_112212_g += this.field_112093_e.field_112212_g;
         this.field_112091_g.field_112212_g += this.field_112093_e.field_112212_g;
         this.field_112091_g.field_112211_f += this.field_112093_e.field_112212_g;
         var8 = 1.0F - this.field_112034_p;
         var8 *= var8;
         var8 *= var8;
         var8 = 1.0F - var8;
         var9 = C_100650_jv.func_108924_a(var8 * 3.1415927F);
         float var10 = C_100650_jv.func_108924_a(this.field_112034_p * 3.1415927F) * -(this.field_112094_c.field_112211_f - 0.7F) * 0.75F;
         this.field_112090_f.field_112211_f = (float)((double)this.field_112090_f.field_112211_f - ((double)var9 * 1.2D + (double)var10));
         this.field_112090_f.field_112212_g += this.field_112093_e.field_112212_g * 2.0F;
         this.field_112090_f.field_112224_h = C_100650_jv.func_108924_a(this.field_112034_p * 3.1415927F) * -0.4F;
      }

      if(this.field_112095_n) {
         this.field_112093_e.field_112211_f = 0.5F;
         this.field_112090_f.field_112211_f += 0.4F;
         this.field_112091_g.field_112211_f += 0.4F;
         this.field_112101_h.field_112214_e = 4.0F;
         this.field_112102_i.field_112214_e = 4.0F;
         this.field_112101_h.field_112213_d = 9.0F;
         this.field_112102_i.field_112213_d = 9.0F;
         this.field_112094_c.field_112213_d = 1.0F;
         this.field_112092_d.field_112213_d = 1.0F;
      } else {
         this.field_112093_e.field_112211_f = 0.0F;
         this.field_112101_h.field_112214_e = 0.1F;
         this.field_112102_i.field_112214_e = 0.1F;
         this.field_112101_h.field_112213_d = 12.0F;
         this.field_112102_i.field_112213_d = 12.0F;
         this.field_112094_c.field_112213_d = 0.0F;
         this.field_112092_d.field_112213_d = 0.0F;
      }

      this.field_112090_f.field_112224_h += C_100650_jv.func_108928_b(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_112091_g.field_112224_h -= C_100650_jv.func_108928_b(var3 * 0.09F) * 0.05F + 0.05F;
      this.field_112090_f.field_112211_f += C_100650_jv.func_108924_a(var3 * 0.067F) * 0.05F;
      this.field_112091_g.field_112211_f -= C_100650_jv.func_108924_a(var3 * 0.067F) * 0.05F;
      if(this.field_112096_o) {
         var8 = 0.0F;
         var9 = 0.0F;
         this.field_112090_f.field_112224_h = 0.0F;
         this.field_112091_g.field_112224_h = 0.0F;
         this.field_112090_f.field_112212_g = -(0.1F - var8 * 0.6F) + this.field_112094_c.field_112212_g;
         this.field_112091_g.field_112212_g = 0.1F - var8 * 0.6F + this.field_112094_c.field_112212_g + 0.4F;
         this.field_112090_f.field_112211_f = -1.5707964F + this.field_112094_c.field_112211_f;
         this.field_112091_g.field_112211_f = -1.5707964F + this.field_112094_c.field_112211_f;
         this.field_112090_f.field_112211_f -= var8 * 1.2F - var9 * 0.4F;
         this.field_112091_g.field_112211_f -= var8 * 1.2F - var9 * 0.4F;
         this.field_112090_f.field_112224_h += C_100650_jv.func_108928_b(var3 * 0.09F) * 0.05F + 0.05F;
         this.field_112091_g.field_112224_h -= C_100650_jv.func_108928_b(var3 * 0.09F) * 0.05F + 0.05F;
         this.field_112090_f.field_112211_f += C_100650_jv.func_108924_a(var3 * 0.067F) * 0.05F;
         this.field_112091_g.field_112211_f -= C_100650_jv.func_108924_a(var3 * 0.067F) * 0.05F;
      }

   }

   public void func_112088_b(float var1) {
      this.field_112099_j.field_112212_g = this.field_112094_c.field_112212_g;
      this.field_112099_j.field_112211_f = this.field_112094_c.field_112211_f;
      this.field_112099_j.field_112216_c = 0.0F;
      this.field_112099_j.field_112213_d = 0.0F;
      this.field_112099_j.func_112201_a(var1);
   }

   public void func_112089_c(float var1) {
      this.field_112100_k.func_112201_a(var1);
   }
}
