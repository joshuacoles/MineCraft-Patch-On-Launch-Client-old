import org.lwjgl.opengl.GL11;

public class C_100048_bbv extends C_100044_bbz {

   private C_101222_avs field_105571_a = new C_101222_avs();


   public void func_105570_a(C_100414_amj var1, double var2, double var4, double var6, float var8) {
      C_100451_alf var9 = var1.func_102916_q();
      GL11.glPushMatrix();
      float var10 = 0.6666667F;
      float var12;
      if(var9 == C_100451_alf.field_106199_aG) {
         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         float var11 = (float)(var1.func_102919_p() * 360) / 16.0F;
         GL11.glRotatef(-var11, 0.0F, 1.0F, 0.0F);
         this.field_105571_a.field_112066_b.field_112222_j = true;
      } else {
         int var16 = var1.func_102919_p();
         var12 = 0.0F;
         if(var16 == 2) {
            var12 = 180.0F;
         }

         if(var16 == 4) {
            var12 = 90.0F;
         }

         if(var16 == 5) {
            var12 = -90.0F;
         }

         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var10, (float)var6 + 0.5F);
         GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
         this.field_105571_a.field_112066_b.field_112222_j = false;
      }

      this.func_105558_a("/item/sign.png");
      GL11.glPushMatrix();
      GL11.glScalef(var10, -var10, -var10);
      this.field_105571_a.func_112065_a();
      GL11.glPopMatrix();
      C_101153_asb var17 = this.func_105557_b();
      var12 = 0.016666668F * var10;
      GL11.glTranslatef(0.0F, 0.5F * var10, 0.07F * var10);
      GL11.glScalef(var12, -var12, var12);
      GL11.glNormal3f(0.0F, 0.0F, -1.0F * var12);
      GL11.glDepthMask(false);
      byte var13 = 0;

      for(int var14 = 0; var14 < var1.field_102963_a.length; ++var14) {
         String var15 = var1.field_102963_a[var14];
         if(var14 == var1.field_102961_b) {
            var15 = "> " + var15 + " <";
            var17.func_111798_b(var15, -var17.func_111778_a(var15) / 2, var14 * 10 - var1.field_102963_a.length * 5, var13);
         } else {
            var17.func_111798_b(var15, -var17.func_111778_a(var15) / 2, var14 * 10 - var1.field_102963_a.length * 5, var13);
         }
      }

      GL11.glDepthMask(true);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }
}
