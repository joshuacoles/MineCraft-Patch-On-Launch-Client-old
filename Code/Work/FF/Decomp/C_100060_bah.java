import org.lwjgl.opengl.GL11;

public class C_100060_bah extends C_100846_azx {

   private int field_105508_a;


   public C_100060_bah(int var1) {
      this.field_105508_a = var1;
   }

   public void func_105350_a(C_100730_lb var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      this.func_105351_a("/gui/items.png");
      C_100872_azb var10 = C_100872_azb.field_110346_a;
      if(this.field_105508_a == 154) {
         int var11 = C_100947_vb.func_111116_a(((C_101078_qu)var1).func_104696_h(), false);
         float var12 = (float)(var11 >> 16 & 255) / 255.0F;
         float var13 = (float)(var11 >> 8 & 255) / 255.0F;
         float var14 = (float)(var11 & 255) / 255.0F;
         GL11.glColor3f(var12, var13, var14);
         GL11.glPushMatrix();
         this.func_105507_a(var10, 141);
         GL11.glPopMatrix();
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
      }

      this.func_105507_a(var10, this.field_105508_a);
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   private void func_105507_a(C_100872_azb var1, int var2) {
      float var3 = (float)(var2 % 16 * 16 + 0) / 256.0F;
      float var4 = (float)(var2 % 16 * 16 + 16) / 256.0F;
      float var5 = (float)(var2 / 16 * 16 + 0) / 256.0F;
      float var6 = (float)(var2 / 16 * 16 + 16) / 256.0F;
      float var7 = 1.0F;
      float var8 = 0.5F;
      float var9 = 0.25F;
      GL11.glRotatef(180.0F - this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_105357_b.field_110188_j, 1.0F, 0.0F, 0.0F);
      var1.func_110330_b();
      var1.func_110323_b(0.0F, 1.0F, 0.0F);
      var1.func_110322_a((double)(0.0F - var8), (double)(0.0F - var9), 0.0D, (double)var3, (double)var6);
      var1.func_110322_a((double)(var7 - var8), (double)(0.0F - var9), 0.0D, (double)var4, (double)var6);
      var1.func_110322_a((double)(var7 - var8), (double)(var7 - var9), 0.0D, (double)var4, (double)var5);
      var1.func_110322_a((double)(0.0F - var8), (double)(var7 - var9), 0.0D, (double)var3, (double)var5);
      var1.func_110329_a();
   }
}
