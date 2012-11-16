import org.lwjgl.opengl.GL11;

public class C_100835_azo extends C_100846_azx {

   protected C_101231_avl field_105522_a;


   public C_100835_azo() {
      this.field_105355_d = 0.5F;
      this.field_105522_a = new C_101219_auz();
   }

   public void func_105521_a(C_100572_pe var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      float var10 = (float)var1.func_103251_g() - var9;
      float var11 = (float)var1.func_103245_d() - var9;
      if(var11 < 0.0F) {
         var11 = 0.0F;
      }

      if(var10 > 0.0F) {
         GL11.glRotatef(C_100650_jv.func_108924_a(var10) * var10 * var11 / 10.0F * (float)var1.func_103249_h(), 1.0F, 0.0F, 0.0F);
      }

      this.func_105351_a("/terrain.png");
      float var12 = 0.75F;
      GL11.glScalef(var12, var12, var12);
      GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
      this.func_105351_a("/item/boat.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.field_105522_a.func_112027_a(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
