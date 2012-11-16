import org.lwjgl.opengl.GL11;

public class C_100839_azl extends C_100846_azx {

   public void func_105523_a(C_101089_qi var1, double var2, double var4, double var6, float var8, float var9) {
      this.func_105351_a("/item/arrows.png");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var1.field_103178_B + (var1.field_103236_z - var1.field_103178_B) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var1.field_103179_C + (var1.field_103177_A - var1.field_103179_C) * var9, 0.0F, 0.0F, 1.0F);
      C_100872_azb var10 = C_100872_azb.field_110346_a;
      byte var11 = 0;
      float var12 = 0.0F;
      float var13 = 0.5F;
      float var14 = (float)(0 + var11 * 10) / 32.0F;
      float var15 = (float)(5 + var11 * 10) / 32.0F;
      float var16 = 0.0F;
      float var17 = 0.15625F;
      float var18 = (float)(5 + var11 * 10) / 32.0F;
      float var19 = (float)(10 + var11 * 10) / 32.0F;
      float var20 = 0.05625F;
      GL11.glEnable('\u803a');
      float var21 = (float)var1.field_104674_b - var9;
      if(var21 > 0.0F) {
         float var22 = -C_100650_jv.func_108924_a(var21 * 3.0F) * var21;
         GL11.glRotatef(var22, 0.0F, 0.0F, 1.0F);
      }

      GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(var20, var20, var20);
      GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
      GL11.glNormal3f(var20, 0.0F, 0.0F);
      var10.func_110330_b();
      var10.func_110322_a(-7.0D, -2.0D, -2.0D, (double)var16, (double)var18);
      var10.func_110322_a(-7.0D, -2.0D, 2.0D, (double)var17, (double)var18);
      var10.func_110322_a(-7.0D, 2.0D, 2.0D, (double)var17, (double)var19);
      var10.func_110322_a(-7.0D, 2.0D, -2.0D, (double)var16, (double)var19);
      var10.func_110329_a();
      GL11.glNormal3f(-var20, 0.0F, 0.0F);
      var10.func_110330_b();
      var10.func_110322_a(-7.0D, 2.0D, -2.0D, (double)var16, (double)var18);
      var10.func_110322_a(-7.0D, 2.0D, 2.0D, (double)var17, (double)var18);
      var10.func_110322_a(-7.0D, -2.0D, 2.0D, (double)var17, (double)var19);
      var10.func_110322_a(-7.0D, -2.0D, -2.0D, (double)var16, (double)var19);
      var10.func_110329_a();

      for(int var23 = 0; var23 < 4; ++var23) {
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glNormal3f(0.0F, 0.0F, var20);
         var10.func_110330_b();
         var10.func_110322_a(-8.0D, -2.0D, 0.0D, (double)var12, (double)var14);
         var10.func_110322_a(8.0D, -2.0D, 0.0D, (double)var13, (double)var14);
         var10.func_110322_a(8.0D, 2.0D, 0.0D, (double)var13, (double)var15);
         var10.func_110322_a(-8.0D, 2.0D, 0.0D, (double)var12, (double)var15);
         var10.func_110329_a();
      }

      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }
}
