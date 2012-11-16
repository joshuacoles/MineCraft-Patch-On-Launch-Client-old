import org.lwjgl.opengl.GL11;

public class C_100046_bbt extends C_100044_bbz {

   public void func_105564_a(C_100416_amh var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      C_100730_lb var9 = var1.func_102975_c();
      if(var9 != null) {
         var9.func_103094_a(var1.func_102928_n());
         float var10 = 0.4375F;
         GL11.glTranslatef(0.0F, 0.4F, 0.0F);
         GL11.glRotatef((float)(var1.field_102985_c + (var1.field_102983_b - var1.field_102985_c) * (double)var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.4F, 0.0F);
         GL11.glScalef(var10, var10, var10);
         var9.func_103055_b(var2, var4, var6, 0.0F, 0.0F);
         C_100848_azw.field_110183_a.func_110173_a(var9, 0.0D, 0.0D, 0.0D, 0.0F, var8);
      }

      GL11.glPopMatrix();
   }
}
