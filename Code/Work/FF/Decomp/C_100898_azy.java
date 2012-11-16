import org.lwjgl.opengl.GL11;

public class C_100898_azy extends C_100846_azx {

   public C_100898_azy() {
      this.field_105355_d = 0.15F;
      this.field_105356_e = 0.75F;
   }

   public void func_105527_a(C_100722_lj var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      int var10 = var1.func_104588_d();
      this.func_105351_a("/item/xporb.png");
      C_100872_azb var11 = C_100872_azb.field_110346_a;
      float var12 = (float)(var10 % 4 * 16 + 0) / 64.0F;
      float var13 = (float)(var10 % 4 * 16 + 16) / 64.0F;
      float var14 = (float)(var10 / 4 * 16 + 0) / 64.0F;
      float var15 = (float)(var10 / 4 * 16 + 16) / 64.0F;
      float var16 = 1.0F;
      float var17 = 0.5F;
      float var18 = 0.25F;
      int var19 = var1.func_103125_b(var9);
      int var20 = var19 % 65536;
      int var21 = var19 / 65536;
      C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var20 / 1.0F, (float)var21 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var26 = 255.0F;
      float var27 = ((float)var1.field_104597_a + var9) / 2.0F;
      var21 = (int)((C_100650_jv.func_108924_a(var27 + 0.0F) + 1.0F) * 0.5F * var26);
      int var22 = (int)var26;
      int var23 = (int)((C_100650_jv.func_108924_a(var27 + 4.1887903F) + 1.0F) * 0.1F * var26);
      int var24 = var21 << 16 | var22 << 8 | var23;
      GL11.glRotatef(180.0F - this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_105357_b.field_110188_j, 1.0F, 0.0F, 0.0F);
      float var25 = 0.3F;
      GL11.glScalef(var25, var25, var25);
      var11.func_110330_b();
      var11.func_110332_a(var24, 128);
      var11.func_110323_b(0.0F, 1.0F, 0.0F);
      var11.func_110322_a((double)(0.0F - var17), (double)(0.0F - var18), 0.0D, (double)var12, (double)var15);
      var11.func_110322_a((double)(var16 - var17), (double)(0.0F - var18), 0.0D, (double)var13, (double)var15);
      var11.func_110322_a((double)(var16 - var17), (double)(1.0F - var18), 0.0D, (double)var13, (double)var14);
      var11.func_110322_a((double)(0.0F - var17), (double)(1.0F - var18), 0.0D, (double)var12, (double)var14);
      var11.func_110329_a();
      GL11.glDisable(3042);
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }
}
