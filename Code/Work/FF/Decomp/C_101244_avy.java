
public class C_101244_avy extends C_101231_avl {

   public C_101254_awp field_112138_a;
   public C_101254_awp field_112136_b;
   public C_101254_awp field_112137_c;
   public C_101254_awp field_112134_d;
   public C_101254_awp field_112135_e;
   public C_101254_awp field_112132_f;
   public C_101254_awp field_112133_g;
   public C_101254_awp field_112141_h;
   public C_101254_awp field_112142_i;
   public C_101254_awp field_112139_j;
   public C_101254_awp field_112140_k;


   public C_101244_avy() {
      float var1 = 0.0F;
      byte var2 = 15;
      this.field_112138_a = new C_101254_awp(this, 32, 4);
      this.field_112138_a.func_112203_a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var1);
      this.field_112138_a.func_112209_a(0.0F, (float)var2, -3.0F);
      this.field_112136_b = new C_101254_awp(this, 0, 0);
      this.field_112136_b.func_112203_a(-3.0F, -3.0F, -3.0F, 6, 6, 6, var1);
      this.field_112136_b.func_112209_a(0.0F, (float)var2, 0.0F);
      this.field_112137_c = new C_101254_awp(this, 0, 12);
      this.field_112137_c.func_112203_a(-5.0F, -4.0F, -6.0F, 10, 8, 12, var1);
      this.field_112137_c.func_112209_a(0.0F, (float)var2, 9.0F);
      this.field_112134_d = new C_101254_awp(this, 18, 0);
      this.field_112134_d.func_112203_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112134_d.func_112209_a(-4.0F, (float)var2, 2.0F);
      this.field_112135_e = new C_101254_awp(this, 18, 0);
      this.field_112135_e.func_112203_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112135_e.func_112209_a(4.0F, (float)var2, 2.0F);
      this.field_112132_f = new C_101254_awp(this, 18, 0);
      this.field_112132_f.func_112203_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112132_f.func_112209_a(-4.0F, (float)var2, 1.0F);
      this.field_112133_g = new C_101254_awp(this, 18, 0);
      this.field_112133_g.func_112203_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112133_g.func_112209_a(4.0F, (float)var2, 1.0F);
      this.field_112141_h = new C_101254_awp(this, 18, 0);
      this.field_112141_h.func_112203_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112141_h.func_112209_a(-4.0F, (float)var2, 0.0F);
      this.field_112142_i = new C_101254_awp(this, 18, 0);
      this.field_112142_i.func_112203_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112142_i.func_112209_a(4.0F, (float)var2, 0.0F);
      this.field_112139_j = new C_101254_awp(this, 18, 0);
      this.field_112139_j.func_112203_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112139_j.func_112209_a(-4.0F, (float)var2, -1.0F);
      this.field_112140_k = new C_101254_awp(this, 18, 0);
      this.field_112140_k.func_112203_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, var1);
      this.field_112140_k.func_112209_a(4.0F, (float)var2, -1.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112138_a.func_112201_a(var7);
      this.field_112136_b.func_112201_a(var7);
      this.field_112137_c.func_112201_a(var7);
      this.field_112134_d.func_112201_a(var7);
      this.field_112135_e.func_112201_a(var7);
      this.field_112132_f.func_112201_a(var7);
      this.field_112133_g.func_112201_a(var7);
      this.field_112141_h.func_112201_a(var7);
      this.field_112142_i.func_112201_a(var7);
      this.field_112139_j.func_112201_a(var7);
      this.field_112140_k.func_112201_a(var7);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112138_a.field_112212_g = var4 / 57.295776F;
      this.field_112138_a.field_112211_f = var5 / 57.295776F;
      float var8 = 0.7853982F;
      this.field_112134_d.field_112224_h = -var8;
      this.field_112135_e.field_112224_h = var8;
      this.field_112132_f.field_112224_h = -var8 * 0.74F;
      this.field_112133_g.field_112224_h = var8 * 0.74F;
      this.field_112141_h.field_112224_h = -var8 * 0.74F;
      this.field_112142_i.field_112224_h = var8 * 0.74F;
      this.field_112139_j.field_112224_h = -var8;
      this.field_112140_k.field_112224_h = var8;
      float var9 = -0.0F;
      float var10 = 0.3926991F;
      this.field_112134_d.field_112212_g = var10 * 2.0F + var9;
      this.field_112135_e.field_112212_g = -var10 * 2.0F - var9;
      this.field_112132_f.field_112212_g = var10 * 1.0F + var9;
      this.field_112133_g.field_112212_g = -var10 * 1.0F - var9;
      this.field_112141_h.field_112212_g = -var10 * 1.0F + var9;
      this.field_112142_i.field_112212_g = var10 * 1.0F - var9;
      this.field_112139_j.field_112212_g = -var10 * 2.0F + var9;
      this.field_112140_k.field_112212_g = var10 * 2.0F - var9;
      float var11 = -(C_100650_jv.func_108928_b(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var12 = -(C_100650_jv.func_108928_b(var1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * var2;
      float var13 = -(C_100650_jv.func_108928_b(var1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * var2;
      float var14 = -(C_100650_jv.func_108928_b(var1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * var2;
      float var15 = Math.abs(C_100650_jv.func_108924_a(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var16 = Math.abs(C_100650_jv.func_108924_a(var1 * 0.6662F + 3.1415927F) * 0.4F) * var2;
      float var17 = Math.abs(C_100650_jv.func_108924_a(var1 * 0.6662F + 1.5707964F) * 0.4F) * var2;
      float var18 = Math.abs(C_100650_jv.func_108924_a(var1 * 0.6662F + 4.712389F) * 0.4F) * var2;
      this.field_112134_d.field_112212_g += var11;
      this.field_112135_e.field_112212_g += -var11;
      this.field_112132_f.field_112212_g += var12;
      this.field_112133_g.field_112212_g += -var12;
      this.field_112141_h.field_112212_g += var13;
      this.field_112142_i.field_112212_g += -var13;
      this.field_112139_j.field_112212_g += var14;
      this.field_112140_k.field_112212_g += -var14;
      this.field_112134_d.field_112224_h += var15;
      this.field_112135_e.field_112224_h += -var15;
      this.field_112132_f.field_112224_h += var16;
      this.field_112133_g.field_112224_h += -var16;
      this.field_112141_h.field_112224_h += var17;
      this.field_112142_i.field_112224_h += -var17;
      this.field_112139_j.field_112224_h += var18;
      this.field_112140_k.field_112224_h += -var18;
   }
}
