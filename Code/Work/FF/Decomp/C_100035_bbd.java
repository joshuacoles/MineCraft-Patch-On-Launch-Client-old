import org.lwjgl.opengl.GL11;

public class C_100035_bbd extends C_100846_azx {

   C_101247_avu field_105532_a = new C_101247_avu();


   private float func_105530_a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void func_105531_a(C_101079_qv var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      float var10 = this.func_105530_a(var1.field_103178_B, var1.field_103236_z, var9);
      float var11 = var1.field_103179_C + (var1.field_103177_A - var1.field_103179_C) * var9;
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var12 = 0.0625F;
      GL11.glEnable('\u803a');
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      if(var1.func_104741_d()) {
         this.func_105349_a((String)null, "/mob/wither_invul.png");
      } else {
         this.func_105349_a((String)null, "/mob/wither.png");
      }

      this.field_105532_a.func_112027_a(var1, 0.0F, 0.0F, 0.0F, var10, var11, var12);
      GL11.glPopMatrix();
   }
}
