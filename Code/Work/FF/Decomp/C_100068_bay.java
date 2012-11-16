import org.lwjgl.opengl.GL11;

public class C_100068_bay extends C_100846_azx {

   private C_100876_azd field_105517_a = new C_100876_azd();


   public C_100068_bay() {
      this.field_105355_d = 0.5F;
   }

   public void func_105516_a(C_100591_pi var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var10;
      if((float)var1.field_103284_a - var9 + 1.0F < 10.0F) {
         var10 = 1.0F - ((float)var1.field_103284_a - var9 + 1.0F) / 10.0F;
         if(var10 < 0.0F) {
            var10 = 0.0F;
         }

         if(var10 > 1.0F) {
            var10 = 1.0F;
         }

         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         GL11.glScalef(var11, var11, var11);
      }

      var10 = (1.0F - ((float)var1.field_103284_a - var9 + 1.0F) / 100.0F) * 0.8F;
      this.func_105351_a("/terrain.png");
      this.field_105517_a.func_110400_a(C_100451_alf.field_106234_ap, 0, var1.func_103057_c(var9));
      if(var1.field_103284_a / 5 % 2 == 0) {
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 772);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var10);
         this.field_105517_a.func_110400_a(C_100451_alf.field_106234_ap, 0, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

      GL11.glPopMatrix();
   }
}
