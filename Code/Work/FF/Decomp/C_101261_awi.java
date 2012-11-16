import org.lwjgl.opengl.GL11;

public class C_101261_awi extends C_101231_avl {

   private C_101254_awp field_112174_a;
   private C_101254_awp field_112172_b;
   private C_101254_awp field_112173_c;
   private C_101254_awp field_112170_d;
   private C_101254_awp field_112171_e;
   private C_101254_awp field_112168_f;
   private C_101254_awp field_112169_g;
   private C_101254_awp field_112179_h;
   private C_101254_awp field_112180_i;
   private C_101254_awp field_112177_j;
   private C_101254_awp field_112178_k;
   private C_101254_awp field_112175_l;
   private float field_112176_m;


   public C_101261_awi(float var1) {
      this.field_112029_t = 256;
      this.field_112028_u = 256;
      this.func_112023_a("body.body", 0, 0);
      this.func_112023_a("wing.skin", -56, 88);
      this.func_112023_a("wingtip.skin", -56, 144);
      this.func_112023_a("rearleg.main", 0, 0);
      this.func_112023_a("rearfoot.main", 112, 0);
      this.func_112023_a("rearlegtip.main", 196, 0);
      this.func_112023_a("head.upperhead", 112, 30);
      this.func_112023_a("wing.bone", 112, 88);
      this.func_112023_a("head.upperlip", 176, 44);
      this.func_112023_a("jaw.jaw", 176, 65);
      this.func_112023_a("frontleg.main", 112, 104);
      this.func_112023_a("wingtip.bone", 112, 136);
      this.func_112023_a("frontfoot.main", 144, 104);
      this.func_112023_a("neck.box", 192, 104);
      this.func_112023_a("frontlegtip.main", 226, 138);
      this.func_112023_a("body.scale", 220, 53);
      this.func_112023_a("head.scale", 0, 0);
      this.func_112023_a("neck.scale", 48, 0);
      this.func_112023_a("head.nostril", 112, 0);
      float var2 = -16.0F;
      this.field_112174_a = new C_101254_awp(this, "head");
      this.field_112174_a.func_112206_a("upperlip", -6.0F, -1.0F, -8.0F + var2, 12, 5, 16);
      this.field_112174_a.func_112206_a("upperhead", -8.0F, -8.0F, 6.0F + var2, 16, 16, 16);
      this.field_112174_a.field_112225_i = true;
      this.field_112174_a.func_112206_a("scale", -5.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.field_112174_a.func_112206_a("nostril", -5.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.field_112174_a.field_112225_i = false;
      this.field_112174_a.func_112206_a("scale", 3.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.field_112174_a.func_112206_a("nostril", 3.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.field_112173_c = new C_101254_awp(this, "jaw");
      this.field_112173_c.func_112209_a(0.0F, 4.0F, 8.0F + var2);
      this.field_112173_c.func_112206_a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.field_112174_a.func_112207_a(this.field_112173_c);
      this.field_112172_b = new C_101254_awp(this, "neck");
      this.field_112172_b.func_112206_a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.field_112172_b.func_112206_a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.field_112170_d = new C_101254_awp(this, "body");
      this.field_112170_d.func_112209_a(0.0F, 4.0F, 8.0F);
      this.field_112170_d.func_112206_a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.field_112170_d.func_112206_a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.field_112170_d.func_112206_a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.field_112170_d.func_112206_a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.field_112178_k = new C_101254_awp(this, "wing");
      this.field_112178_k.func_112209_a(-12.0F, 5.0F, 2.0F);
      this.field_112178_k.func_112206_a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.field_112178_k.func_112206_a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.field_112175_l = new C_101254_awp(this, "wingtip");
      this.field_112175_l.func_112209_a(-56.0F, 0.0F, 0.0F);
      this.field_112175_l.func_112206_a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.field_112175_l.func_112206_a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.field_112178_k.func_112207_a(this.field_112175_l);
      this.field_112168_f = new C_101254_awp(this, "frontleg");
      this.field_112168_f.func_112209_a(-12.0F, 20.0F, 2.0F);
      this.field_112168_f.func_112206_a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.field_112179_h = new C_101254_awp(this, "frontlegtip");
      this.field_112179_h.func_112209_a(0.0F, 20.0F, -1.0F);
      this.field_112179_h.func_112206_a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.field_112168_f.func_112207_a(this.field_112179_h);
      this.field_112177_j = new C_101254_awp(this, "frontfoot");
      this.field_112177_j.func_112209_a(0.0F, 23.0F, 0.0F);
      this.field_112177_j.func_112206_a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.field_112179_h.func_112207_a(this.field_112177_j);
      this.field_112171_e = new C_101254_awp(this, "rearleg");
      this.field_112171_e.func_112209_a(-16.0F, 16.0F, 42.0F);
      this.field_112171_e.func_112206_a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.field_112169_g = new C_101254_awp(this, "rearlegtip");
      this.field_112169_g.func_112209_a(0.0F, 32.0F, -4.0F);
      this.field_112169_g.func_112206_a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.field_112171_e.func_112207_a(this.field_112169_g);
      this.field_112180_i = new C_101254_awp(this, "rearfoot");
      this.field_112180_i.func_112209_a(0.0F, 31.0F, 4.0F);
      this.field_112180_i.func_112206_a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.field_112169_g.func_112207_a(this.field_112180_i);
   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      this.field_112176_m = var4;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      C_100568_oy var8 = (C_100568_oy)var1;
      float var9 = var8.field_103675_bN + (var8.field_103676_bO - var8.field_103675_bN) * this.field_112176_m;
      this.field_112173_c.field_112211_f = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F)) + 1.0D) * 0.2F;
      float var10 = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F - 1.0F)) + 1.0D);
      var10 = (var10 * var10 * 1.0F + var10 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, var10 - 2.0F, -3.0F);
      GL11.glRotatef(var10 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var11 = -30.0F;
      float var13 = 0.0F;
      float var14 = 1.5F;
      double[] var15 = var8.func_103652_a(6, this.field_112176_m);
      float var16 = this.func_112167_a(var8.func_103652_a(5, this.field_112176_m)[0] - var8.func_103652_a(10, this.field_112176_m)[0]);
      float var17 = this.func_112167_a(var8.func_103652_a(5, this.field_112176_m)[0] + (double)(var16 / 2.0F));
      var11 += 2.0F;
      float var18 = var9 * 3.1415927F * 2.0F;
      var11 = 20.0F;
      float var12 = -12.0F;

      float var21;
      for(int var19 = 0; var19 < 5; ++var19) {
         double[] var20 = var8.func_103652_a(5 - var19, this.field_112176_m);
         var21 = (float)Math.cos((double)((float)var19 * 0.45F + var18)) * 0.15F;
         this.field_112172_b.field_112212_g = this.func_112167_a(var20[0] - var15[0]) * 3.1415927F / 180.0F * var14;
         this.field_112172_b.field_112211_f = var21 + (float)(var20[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
         this.field_112172_b.field_112224_h = -this.func_112167_a(var20[0] - (double)var17) * 3.1415927F / 180.0F * var14;
         this.field_112172_b.field_112213_d = var11;
         this.field_112172_b.field_112214_e = var12;
         this.field_112172_b.field_112216_c = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.field_112172_b.field_112211_f) * 10.0D);
         var12 = (float)((double)var12 - Math.cos((double)this.field_112172_b.field_112212_g) * Math.cos((double)this.field_112172_b.field_112211_f) * 10.0D);
         var13 = (float)((double)var13 - Math.sin((double)this.field_112172_b.field_112212_g) * Math.cos((double)this.field_112172_b.field_112211_f) * 10.0D);
         this.field_112172_b.func_112201_a(var7);
      }

      this.field_112174_a.field_112213_d = var11;
      this.field_112174_a.field_112214_e = var12;
      this.field_112174_a.field_112216_c = var13;
      double[] var23 = var8.func_103652_a(0, this.field_112176_m);
      this.field_112174_a.field_112212_g = this.func_112167_a(var23[0] - var15[0]) * 3.1415927F / 180.0F * 1.0F;
      this.field_112174_a.field_112224_h = -this.func_112167_a(var23[0] - (double)var17) * 3.1415927F / 180.0F * 1.0F;
      this.field_112174_a.func_112201_a(var7);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var16 * var14 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.field_112170_d.field_112224_h = 0.0F;
      this.field_112170_d.func_112201_a(var7);

      for(int var22 = 0; var22 < 2; ++var22) {
         GL11.glEnable(2884);
         var21 = var9 * 3.1415927F * 2.0F;
         this.field_112178_k.field_112211_f = 0.125F - (float)Math.cos((double)var21) * 0.2F;
         this.field_112178_k.field_112212_g = 0.25F;
         this.field_112178_k.field_112224_h = (float)(Math.sin((double)var21) + 0.125D) * 0.8F;
         this.field_112175_l.field_112224_h = -((float)(Math.sin((double)(var21 + 2.0F)) + 0.5D)) * 0.75F;
         this.field_112171_e.field_112211_f = 1.0F + var10 * 0.1F;
         this.field_112169_g.field_112211_f = 0.5F + var10 * 0.1F;
         this.field_112180_i.field_112211_f = 0.75F + var10 * 0.1F;
         this.field_112168_f.field_112211_f = 1.3F + var10 * 0.1F;
         this.field_112179_h.field_112211_f = -0.5F - var10 * 0.1F;
         this.field_112177_j.field_112211_f = 0.75F + var10 * 0.1F;
         this.field_112178_k.func_112201_a(var7);
         this.field_112168_f.func_112201_a(var7);
         this.field_112171_e.func_112201_a(var7);
         GL11.glScalef(-1.0F, 1.0F, 1.0F);
         if(var22 == 0) {
            GL11.glCullFace(1028);
         }
      }

      GL11.glPopMatrix();
      GL11.glCullFace(1029);
      GL11.glDisable(2884);
      float var24 = -((float)Math.sin((double)(var9 * 3.1415927F * 2.0F))) * 0.0F;
      var18 = var9 * 3.1415927F * 2.0F;
      var11 = 10.0F;
      var12 = 60.0F;
      var13 = 0.0F;
      var15 = var8.func_103652_a(11, this.field_112176_m);

      for(int var25 = 0; var25 < 12; ++var25) {
         var23 = var8.func_103652_a(12 + var25, this.field_112176_m);
         var24 = (float)((double)var24 + Math.sin((double)((float)var25 * 0.45F + var18)) * 0.05000000074505806D);
         this.field_112172_b.field_112212_g = (this.func_112167_a(var23[0] - var15[0]) * var14 + 180.0F) * 3.1415927F / 180.0F;
         this.field_112172_b.field_112211_f = var24 + (float)(var23[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
         this.field_112172_b.field_112224_h = this.func_112167_a(var23[0] - (double)var17) * 3.1415927F / 180.0F * var14;
         this.field_112172_b.field_112213_d = var11;
         this.field_112172_b.field_112214_e = var12;
         this.field_112172_b.field_112216_c = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.field_112172_b.field_112211_f) * 10.0D);
         var12 = (float)((double)var12 - Math.cos((double)this.field_112172_b.field_112212_g) * Math.cos((double)this.field_112172_b.field_112211_f) * 10.0D);
         var13 = (float)((double)var13 - Math.sin((double)this.field_112172_b.field_112212_g) * Math.cos((double)this.field_112172_b.field_112211_f) * 10.0D);
         this.field_112172_b.func_112201_a(var7);
      }

      GL11.glPopMatrix();
   }

   private float func_112167_a(double var1) {
      while(var1 >= 180.0D) {
         var1 -= 360.0D;
      }

      while(var1 < -180.0D) {
         var1 += 360.0D;
      }

      return (float)var1;
   }
}
