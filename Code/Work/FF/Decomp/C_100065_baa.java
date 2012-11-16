import org.lwjgl.opengl.GL11;

public class C_100065_baa extends C_100846_azx {

   private float field_105514_a;


   public C_100065_baa(float var1) {
      this.field_105514_a = var1;
   }

   public void func_105513_a(C_101091_qk var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      float var10 = this.field_105514_a;
      GL11.glScalef(var10 / 1.0F, var10 / 1.0F, var10 / 1.0F);
      byte var11 = 46;
      this.func_105351_a("/gui/items.png");
      C_100872_azb var12 = C_100872_azb.field_110346_a;
      float var13 = (float)(var11 % 16 * 16 + 0) / 256.0F;
      float var14 = (float)(var11 % 16 * 16 + 16) / 256.0F;
      float var15 = (float)(var11 / 16 * 16 + 0) / 256.0F;
      float var16 = (float)(var11 / 16 * 16 + 16) / 256.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.25F;
      GL11.glRotatef(180.0F - this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_105357_b.field_110188_j, 1.0F, 0.0F, 0.0F);
      var12.func_110330_b();
      var12.func_110323_b(0.0F, 1.0F, 0.0F);
      var12.func_110322_a((double)(0.0F - var18), (double)(0.0F - var19), 0.0D, (double)var13, (double)var16);
      var12.func_110322_a((double)(var17 - var18), (double)(0.0F - var19), 0.0D, (double)var14, (double)var16);
      var12.func_110322_a((double)(var17 - var18), (double)(1.0F - var19), 0.0D, (double)var14, (double)var15);
      var12.func_110322_a((double)(0.0F - var18), (double)(1.0F - var19), 0.0D, (double)var13, (double)var15);
      var12.func_110329_a();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }
}
