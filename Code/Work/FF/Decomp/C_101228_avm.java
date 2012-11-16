import org.lwjgl.opengl.GL11;

public class C_101228_avm extends C_101231_avl {

   C_101254_awp field_112079_a;
   C_101254_awp field_112077_b;
   C_101254_awp field_112078_c;
   C_101254_awp field_112075_d;
   C_101254_awp field_112076_e;
   C_101254_awp field_112073_f;
   C_101254_awp field_112074_g;
   C_101254_awp field_112080_h;
   int field_112081_i = 1;


   public C_101228_avm() {
      this.func_112023_a("head.main", 0, 0);
      this.func_112023_a("head.nose", 0, 24);
      this.func_112023_a("head.ear1", 0, 10);
      this.func_112023_a("head.ear2", 6, 10);
      this.field_112074_g = new C_101254_awp(this, "head");
      this.field_112074_g.func_112206_a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
      this.field_112074_g.func_112206_a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
      this.field_112074_g.func_112206_a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
      this.field_112074_g.func_112206_a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
      this.field_112074_g.func_112209_a(0.0F, 15.0F, -9.0F);
      this.field_112080_h = new C_101254_awp(this, 20, 0);
      this.field_112080_h.func_112203_a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
      this.field_112080_h.func_112209_a(0.0F, 12.0F, -10.0F);
      this.field_112076_e = new C_101254_awp(this, 0, 15);
      this.field_112076_e.func_112205_a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.field_112076_e.field_112211_f = 0.9F;
      this.field_112076_e.func_112209_a(0.0F, 15.0F, 8.0F);
      this.field_112073_f = new C_101254_awp(this, 4, 15);
      this.field_112073_f.func_112205_a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.field_112073_f.func_112209_a(0.0F, 20.0F, 14.0F);
      this.field_112079_a = new C_101254_awp(this, 8, 13);
      this.field_112079_a.func_112205_a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.field_112079_a.func_112209_a(1.1F, 18.0F, 5.0F);
      this.field_112077_b = new C_101254_awp(this, 8, 13);
      this.field_112077_b.func_112205_a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.field_112077_b.func_112209_a(-1.1F, 18.0F, 5.0F);
      this.field_112078_c = new C_101254_awp(this, 40, 0);
      this.field_112078_c.func_112205_a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.field_112078_c.func_112209_a(1.2F, 13.8F, -5.0F);
      this.field_112075_d = new C_101254_awp(this, 40, 0);
      this.field_112075_d.func_112205_a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.field_112075_d.func_112209_a(-1.2F, 13.8F, -5.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      if(this.field_112030_s) {
         float var8 = 2.0F;
         GL11.glPushMatrix();
         GL11.glScalef(1.5F / var8, 1.5F / var8, 1.5F / var8);
         GL11.glTranslatef(0.0F, 10.0F * var7, 4.0F * var7);
         this.field_112074_g.func_112201_a(var7);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
         GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
         this.field_112080_h.func_112201_a(var7);
         this.field_112079_a.func_112201_a(var7);
         this.field_112077_b.func_112201_a(var7);
         this.field_112078_c.func_112201_a(var7);
         this.field_112075_d.func_112201_a(var7);
         this.field_112076_e.func_112201_a(var7);
         this.field_112073_f.func_112201_a(var7);
         GL11.glPopMatrix();
      } else {
         this.field_112074_g.func_112201_a(var7);
         this.field_112080_h.func_112201_a(var7);
         this.field_112076_e.func_112201_a(var7);
         this.field_112073_f.func_112201_a(var7);
         this.field_112079_a.func_112201_a(var7);
         this.field_112077_b.func_112201_a(var7);
         this.field_112078_c.func_112201_a(var7);
         this.field_112075_d.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      this.field_112074_g.field_112211_f = var5 / 57.295776F;
      this.field_112074_g.field_112212_g = var4 / 57.295776F;
      if(this.field_112081_i != 3) {
         this.field_112080_h.field_112211_f = 1.5707964F;
         if(this.field_112081_i == 2) {
            this.field_112079_a.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.0F * var2;
            this.field_112077_b.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 0.3F) * 1.0F * var2;
            this.field_112078_c.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F + 0.3F) * 1.0F * var2;
            this.field_112075_d.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.field_112073_f.field_112211_f = 1.7278761F + 0.31415927F * C_100650_jv.func_108928_b(var1) * var2;
         } else {
            this.field_112079_a.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.0F * var2;
            this.field_112077_b.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.field_112078_c.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F + 3.1415927F) * 1.0F * var2;
            this.field_112075_d.field_112211_f = C_100650_jv.func_108928_b(var1 * 0.6662F) * 1.0F * var2;
            if(this.field_112081_i == 1) {
               this.field_112073_f.field_112211_f = 1.7278761F + 0.7853982F * C_100650_jv.func_108928_b(var1) * var2;
            } else {
               this.field_112073_f.field_112211_f = 1.7278761F + 0.47123894F * C_100650_jv.func_108928_b(var1) * var2;
            }
         }
      }

   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      C_100535_om var5 = (C_100535_om)var1;
      this.field_112080_h.field_112213_d = 12.0F;
      this.field_112080_h.field_112214_e = -10.0F;
      this.field_112074_g.field_112213_d = 15.0F;
      this.field_112074_g.field_112214_e = -9.0F;
      this.field_112076_e.field_112213_d = 15.0F;
      this.field_112076_e.field_112214_e = 8.0F;
      this.field_112073_f.field_112213_d = 20.0F;
      this.field_112073_f.field_112214_e = 14.0F;
      this.field_112078_c.field_112213_d = this.field_112075_d.field_112213_d = 13.8F;
      this.field_112078_c.field_112214_e = this.field_112075_d.field_112214_e = -5.0F;
      this.field_112079_a.field_112213_d = this.field_112077_b.field_112213_d = 18.0F;
      this.field_112079_a.field_112214_e = this.field_112077_b.field_112214_e = 5.0F;
      this.field_112076_e.field_112211_f = 0.9F;
      if(var5.func_103168_ah()) {
         ++this.field_112080_h.field_112213_d;
         this.field_112074_g.field_112213_d += 2.0F;
         ++this.field_112076_e.field_112213_d;
         this.field_112073_f.field_112213_d += -4.0F;
         this.field_112073_f.field_112214_e += 2.0F;
         this.field_112076_e.field_112211_f = 1.5707964F;
         this.field_112073_f.field_112211_f = 1.5707964F;
         this.field_112081_i = 0;
      } else if(var5.func_103147_ai()) {
         this.field_112073_f.field_112213_d = this.field_112076_e.field_112213_d;
         this.field_112073_f.field_112214_e += 2.0F;
         this.field_112076_e.field_112211_f = 1.5707964F;
         this.field_112073_f.field_112211_f = 1.5707964F;
         this.field_112081_i = 2;
      } else if(var5.func_103553_n()) {
         this.field_112080_h.field_112211_f = 0.7853982F;
         this.field_112080_h.field_112213_d += -4.0F;
         this.field_112080_h.field_112214_e += 5.0F;
         this.field_112074_g.field_112213_d += -3.3F;
         ++this.field_112074_g.field_112214_e;
         this.field_112076_e.field_112213_d += 8.0F;
         this.field_112076_e.field_112214_e += -2.0F;
         this.field_112073_f.field_112213_d += 2.0F;
         this.field_112073_f.field_112214_e += -0.8F;
         this.field_112076_e.field_112211_f = 1.7278761F;
         this.field_112073_f.field_112211_f = 2.670354F;
         this.field_112078_c.field_112211_f = this.field_112075_d.field_112211_f = -0.15707964F;
         this.field_112078_c.field_112213_d = this.field_112075_d.field_112213_d = 15.8F;
         this.field_112078_c.field_112214_e = this.field_112075_d.field_112214_e = -7.0F;
         this.field_112079_a.field_112211_f = this.field_112077_b.field_112211_f = -1.5707964F;
         this.field_112079_a.field_112213_d = this.field_112077_b.field_112213_d = 21.0F;
         this.field_112079_a.field_112214_e = this.field_112077_b.field_112214_e = 1.0F;
         this.field_112081_i = 3;
      } else {
         this.field_112081_i = 1;
      }

   }
}
