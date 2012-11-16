import org.lwjgl.opengl.GL11;

public class C_101259_awg extends C_101231_avl {

   public C_101254_awp field_112165_a;
   public C_101254_awp field_112163_b;
   public C_101254_awp field_112164_c;
   public C_101254_awp field_112161_d;
   public C_101254_awp field_112162_e;
   public C_101254_awp field_112159_f;
   C_101254_awp field_112160_g;
   C_101254_awp field_112166_h;


   public C_101259_awg() {
      float var1 = 0.0F;
      float var2 = 13.5F;
      this.field_112165_a = new C_101254_awp(this, 0, 0);
      this.field_112165_a.func_112203_a(-3.0F, -3.0F, -2.0F, 6, 6, 4, var1);
      this.field_112165_a.func_112209_a(-1.0F, var2, -7.0F);
      this.field_112163_b = new C_101254_awp(this, 18, 14);
      this.field_112163_b.func_112203_a(-4.0F, -2.0F, -3.0F, 6, 9, 6, var1);
      this.field_112163_b.func_112209_a(0.0F, 14.0F, 2.0F);
      this.field_112166_h = new C_101254_awp(this, 21, 0);
      this.field_112166_h.func_112203_a(-4.0F, -3.0F, -3.0F, 8, 6, 7, var1);
      this.field_112166_h.func_112209_a(-1.0F, 14.0F, 2.0F);
      this.field_112164_c = new C_101254_awp(this, 0, 18);
      this.field_112164_c.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_112164_c.func_112209_a(-2.5F, 16.0F, 7.0F);
      this.field_112161_d = new C_101254_awp(this, 0, 18);
      this.field_112161_d.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_112161_d.func_112209_a(0.5F, 16.0F, 7.0F);
      this.field_112162_e = new C_101254_awp(this, 0, 18);
      this.field_112162_e.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_112162_e.func_112209_a(-2.5F, 16.0F, -4.0F);
      this.field_112159_f = new C_101254_awp(this, 0, 18);
      this.field_112159_f.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_112159_f.func_112209_a(0.5F, 16.0F, -4.0F);
      this.field_112160_g = new C_101254_awp(this, 9, 18);
      this.field_112160_g.func_112203_a(-1.0F, 0.0F, -1.0F, 2, 8, 2, var1);
      this.field_112160_g.func_112209_a(-1.0F, 12.0F, 8.0F);
      this.field_112165_a.func_112200_a(16, 14).func_112203_a(-3.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.field_112165_a.func_112200_a(16, 14).func_112203_a(1.0F, -5.0F, 0.0F, 2, 2, 1, var1);
      this.field_112165_a.func_112200_a(0, 10).func_112203_a(-1.5F, 0.0F, -5.0F, 3, 3, 4, var1);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.func_112027_a(var1, var2, var3, var4, var5, var6, var7);
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      if(this.field_112030_s) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.field_112165_a.func_112208_b(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.field_112163_b.func_112201_a(var7);
         this.field_112164_c.func_112201_a(var7);
         this.field_112161_d.func_112201_a(var7);
         this.field_112162_e.func_112201_a(var7);
         this.field_112159_f.func_112201_a(var7);
         this.field_112160_g.func_112208_b(var7);
         this.field_112166_h.func_112201_a(var7);
         GL11.glPopMatrix();
      } else {
         this.field_112165_a.func_112208_b(var7);
         this.field_112163_b.func_112201_a(var7);
         this.field_112164_c.func_112201_a(var7);
         this.field_112161_d.func_112201_a(var7);
         this.field_112162_e.func_112201_a(var7);
         this.field_112159_f.func_112201_a(var7);
         this.field_112160_g.func_112208_b(var7);
         this.field_112166_h.func_112201_a(var7);
      }

   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      C_100546_ot var5 = (C_100546_ot)var1;
      if(var5.func_103565_bG()) {
         this.field_112160_g.field_112212_g = 0.0F;
      } else {
         this.field_112160_g.field_112212_g = C_100650_jv.func_108928_b(var2 * 0.6662F) * 1.4F * var3;
      }

      if(var5.func_103553_n()) {
         this.field_112166_h.func_112209_a(-1.0F, 16.0F, -3.0F);
         this.field_112166_h.field_112211_f = 1.2566371F;
         this.field_112166_h.field_112212_g = 0.0F;
         this.field_112163_b.func_112209_a(0.0F, 18.0F, 0.0F);
         this.field_112163_b.field_112211_f = 0.7853982F;
         this.field_112160_g.func_112209_a(-1.0F, 21.0F, 6.0F);
         this.field_112164_c.func_112209_a(-2.5F, 22.0F, 2.0F);
         this.field_112164_c.field_112211_f = 4.712389F;
         this.field_112161_d.func_112209_a(0.5F, 22.0F, 2.0F);
         this.field_112161_d.field_112211_f = 4.712389F;
         this.field_112162_e.field_112211_f = 5.811947F;
         this.field_112162_e.func_112209_a(-2.49F, 17.0F, -4.0F);
         this.field_112159_f.field_112211_f = 5.811947F;
         this.field_112159_f.func_112209_a(0.51F, 17.0F, -4.0F);
      } else {
         this.field_112163_b.func_112209_a(0.0F, 14.0F, 2.0F);
         this.field_112163_b.field_112211_f = 1.5707964F;
         this.field_112166_h.func_112209_a(-1.0F, 14.0F, -3.0F);
         this.field_112166_h.field_112211_f = this.field_112163_b.field_112211_f;
         this.field_112160_g.func_112209_a(-1.0F, 12.0F, 8.0F);
         this.field_112164_c.func_112209_a(-2.5F, 16.0F, 7.0F);
         this.field_112161_d.func_112209_a(0.5F, 16.0F, 7.0F);
         this.field_112162_e.func_112209_a(-2.5F, 16.0F, -4.0F);
         this.field_112159_f.func_112209_a(0.5F, 16.0F, -4.0F);
         this.field_112164_c.field_112211_f = C_100650_jv.func_108928_b(var2 * 0.6662F) * 1.4F * var3;
         this.field_112161_d.field_112211_f = C_100650_jv.func_108928_b(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.field_112162_e.field_112211_f = C_100650_jv.func_108928_b(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
         this.field_112159_f.field_112211_f = C_100650_jv.func_108928_b(var2 * 0.6662F) * 1.4F * var3;
      }

      this.field_112165_a.field_112224_h = var5.func_103566_k(var4) + var5.func_103572_f(var4, 0.0F);
      this.field_112166_h.field_112224_h = var5.func_103572_f(var4, -0.08F);
      this.field_112163_b.field_112224_h = var5.func_103572_f(var4, -0.16F);
      this.field_112160_g.field_112224_h = var5.func_103572_f(var4, -0.2F);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      this.field_112165_a.field_112211_f = var5 / 57.295776F;
      this.field_112165_a.field_112212_g = var4 / 57.295776F;
      this.field_112160_g.field_112211_f = var3;
   }
}
