import org.lwjgl.opengl.GL11;

public class C_100051_bbs extends C_100044_bbz {

   private C_101217_avb field_105577_a = new C_101217_avb();


   public void func_105576_a(C_100418_amf var1, double var2, double var4, double var6, float var8) {
      int var9 = 0;
      if(var1.func_102914_o()) {
         var9 = var1.func_102919_p();
      }

      this.func_105558_a("/item/enderchest.png");
      GL11.glPushMatrix();
      GL11.glEnable('\u803a');
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
      GL11.glScalef(1.0F, -1.0F, -1.0F);
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      short var10 = 0;
      if(var9 == 2) {
         var10 = 180;
      }

      if(var9 == 3) {
         var10 = 0;
      }

      if(var9 == 4) {
         var10 = 90;
      }

      if(var9 == 5) {
         var10 = -90;
      }

      GL11.glRotatef((float)var10, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
      float var11 = var1.field_102998_b + (var1.field_103000_a - var1.field_102998_b) * var8;
      var11 = 1.0F - var11;
      var11 = 1.0F - var11 * var11 * var11;
      this.field_105577_a.field_112046_a.field_112211_f = -(var11 * 3.1415927F / 2.0F);
      this.field_105577_a.func_112043_a();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
