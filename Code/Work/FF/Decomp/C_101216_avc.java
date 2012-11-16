import org.lwjgl.opengl.GL11;

public class C_101216_avc extends C_101231_avl {

   public C_101254_awp field_112041_a;
   public C_101254_awp field_112039_b;
   public C_101254_awp field_112040_c;
   public C_101254_awp field_112037_d;
   public C_101254_awp field_112038_e;
   public C_101254_awp field_112035_f;
   public C_101254_awp field_112036_g;
   public C_101254_awp field_112042_h;


   public C_101216_avc() {
      byte var1 = 16;
      this.field_112041_a = new C_101254_awp(this, 0, 0);
      this.field_112041_a.func_112203_a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.field_112041_a.func_112209_a(0.0F, (float)(-1 + var1), -4.0F);
      this.field_112036_g = new C_101254_awp(this, 14, 0);
      this.field_112036_g.func_112203_a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.field_112036_g.func_112209_a(0.0F, (float)(-1 + var1), -4.0F);
      this.field_112042_h = new C_101254_awp(this, 14, 4);
      this.field_112042_h.func_112203_a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.field_112042_h.func_112209_a(0.0F, (float)(-1 + var1), -4.0F);
      this.field_112039_b = new C_101254_awp(this, 0, 9);
      this.field_112039_b.func_112203_a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.field_112039_b.func_112209_a(0.0F, (float)var1, 0.0F);
      this.field_112040_c = new C_101254_awp(this, 26, 0);
      this.field_112040_c.func_112205_a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.field_112040_c.func_112209_a(-2.0F, (float)(3 + var1), 1.0F);
      this.field_112037_d = new C_101254_awp(this, 26, 0);
      this.field_112037_d.func_112205_a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.field_112037_d.func_112209_a(1.0F, (float)(3 + var1), 1.0F);
      this.field_112038_e = new C_101254_awp(this, 24, 13);
      this.field_112038_e.func_112205_a(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.field_112038_e.func_112209_a(-4.0F, (float)(-3 + var1), 0.0F);
      this.field_112035_f = new C_101254_awp(this, 24, 13);
      this.field_112035_f.func_112205_a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.field_112035_f.func_112209_a(4.0F, (float)(-3 + var1), 0.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      if(this.field_112030_s) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 5.0F * var7, 2.0F * var7);
         this.field_112041_a.func_112201_a(var7);
         this.field_112036_g.func_112201_a(var7);
         this.field_112042_h.func_112201_a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.field_112039_b.func_112201_a(var7);
         this.field_112040_c.func_112201_a(var7);
         this.field_112037_d.func_112201_a(var7);
         this.field_112038_e.func_112201_a(var7);
         this.field_112035_f.func_112201_a(var7);
         GL11.glPopMatrix();
      } else {
         this.field_112041_a.func_112201_a(var7);
         this.field_112036_g.func_112201_a(var7);
         this.field_112042_h.func_112201_a(var7);
         this.field_112039_b.func_112201_a(var7);
         this.field_112040_c.func_112201_a(var7);
         this.field_112037_d.func_112201_a(var7);
         this.field_112038_e.func_112201_a(var7);
         this.field_112035_f.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112041_a.field_112211_f = -(var5 / 57.295776F);
      this.field_112041_a.field_112212_g = var4 / 57.295776F;
      this.field_112036_g.field_112211_f = this.field_112041_a.field_112211_f;
      this.field_112036_g.field_112212_g = this.field_112041_a.field_112212_g;
      this.field_112042_h.field_112211_f = this.field_112041_a.field_112211_f;
      this.field_112042_h.field_112212_g = this.field_112041_a.field_112212_g;
      this.field_112039_b.field_112211_f = 1.5707964F;
      this.field_112040_c.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2;
      this.field_112037_d.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_112038_e.field_112224_h = var3;
      this.field_112035_f.field_112224_h = -var3;
   }
}
