import org.lwjgl.opengl.GL11;

public class C_100052_bbr extends C_100044_bbz {

   private C_101218_ava field_105579_a = new C_101218_ava();


   public void func_105578_a(C_100421_ame var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F, (float)var6 + 0.5F);
      float var9 = (float)var1.field_104851_a + var8;
      GL11.glTranslatef(0.0F, 0.1F + C_100650_jv.func_108924_a(var9 * 0.1F) * 0.01F, 0.0F);

      float var10;
      for(var10 = var1.field_104853_h - var1.field_104854_i; var10 >= 3.1415927F; var10 -= 6.2831855F) {
         ;
      }

      while(var10 < -3.1415927F) {
         var10 += 6.2831855F;
      }

      float var11 = var1.field_104854_i + var10 * var8;
      GL11.glRotatef(-var11 * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
      this.func_105558_a("/item/book.png");
      float var12 = var1.field_104850_c + (var1.field_104848_b - var1.field_104850_c) * var8 + 0.25F;
      float var13 = var1.field_104850_c + (var1.field_104848_b - var1.field_104850_c) * var8 + 0.75F;
      var12 = (var12 - (float)C_100650_jv.func_108932_b((double)var12)) * 1.6F - 0.3F;
      var13 = (var13 - (float)C_100650_jv.func_108932_b((double)var13)) * 1.6F - 0.3F;
      if(var12 < 0.0F) {
         var12 = 0.0F;
      }

      if(var13 < 0.0F) {
         var13 = 0.0F;
      }

      if(var12 > 1.0F) {
         var12 = 1.0F;
      }

      if(var13 > 1.0F) {
         var13 = 1.0F;
      }

      float var14 = var1.field_104845_g + (var1.field_104844_f - var1.field_104845_g) * var8;
      GL11.glEnable(2884);
      this.field_105579_a.func_112027_a((C_100730_lb)null, var9, var12, var13, var14, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
