import org.lwjgl.opengl.GL11;

public class C_101227_avp extends C_101231_avl {

   public C_101254_awp field_112187_a = new C_101254_awp(this, 0, 0);
   public C_101254_awp field_112185_b;
   public C_101254_awp field_112186_c;
   public C_101254_awp field_112183_d;
   public C_101254_awp field_112184_e;
   public C_101254_awp field_112181_f;
   protected float field_112182_g = 8.0F;
   protected float field_112188_h = 4.0F;


   public C_101227_avp(int var1, float var2) {
      this.field_112187_a.func_112203_a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.field_112187_a.func_112209_a(0.0F, (float)(18 - var1), -6.0F);
      this.field_112185_b = new C_101254_awp(this, 28, 8);
      this.field_112185_b.func_112203_a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.field_112185_b.func_112209_a(0.0F, (float)(17 - var1), 2.0F);
      this.field_112186_c = new C_101254_awp(this, 0, 16);
      this.field_112186_c.func_112203_a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_112186_c.func_112209_a(-3.0F, (float)(24 - var1), 7.0F);
      this.field_112183_d = new C_101254_awp(this, 0, 16);
      this.field_112183_d.func_112203_a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_112183_d.func_112209_a(3.0F, (float)(24 - var1), 7.0F);
      this.field_112184_e = new C_101254_awp(this, 0, 16);
      this.field_112184_e.func_112203_a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_112184_e.func_112209_a(-3.0F, (float)(24 - var1), -5.0F);
      this.field_112181_f = new C_101254_awp(this, 0, 16);
      this.field_112181_f.func_112203_a(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.field_112181_f.func_112209_a(3.0F, (float)(24 - var1), -5.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      if(this.field_112030_s) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, this.field_112182_g * var7, this.field_112188_h * var7);
         this.field_112187_a.func_112201_a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.field_112185_b.func_112201_a(var7);
         this.field_112186_c.func_112201_a(var7);
         this.field_112183_d.func_112201_a(var7);
         this.field_112184_e.func_112201_a(var7);
         this.field_112181_f.func_112201_a(var7);
         GL11.glPopMatrix();
      } else {
         this.field_112187_a.func_112201_a(var7);
         this.field_112185_b.func_112201_a(var7);
         this.field_112186_c.func_112201_a(var7);
         this.field_112183_d.func_112201_a(var7);
         this.field_112184_e.func_112201_a(var7);
         this.field_112181_f.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112187_a.field_112211_f = var5 / 57.295776F;
      this.field_112187_a.field_112212_g = var4 / 57.295776F;
      this.field_112185_b.field_112211_f = 1.5707964F;
      this.field_112186_c.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2;
      this.field_112183_d.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_112184_e.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_112181_f.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.4F * var2;
   }
}
