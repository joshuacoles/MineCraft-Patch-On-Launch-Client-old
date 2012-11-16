import org.lwjgl.opengl.GL11;

public class C_100049_bbq extends C_100044_bbz {

   private C_101217_avb field_105574_a = new C_101217_avb();
   private C_101217_avb field_105573_c = new C_101232_avi();


   public void func_105572_a(C_100422_amb var1, double var2, double var4, double var6, float var8) {
      int var9;
      if(!var1.func_102914_o()) {
         var9 = 0;
      } else {
         C_100451_alf var10 = var1.func_102916_q();
         var9 = var1.func_102919_p();
         if(var10 != null && var9 == 0) {
            ((C_100218_ahz)var10).func_106340_d_(var1.func_102928_n(), var1.field_102938_l, var1.field_102939_m, var1.field_102936_n);
            var9 = var1.func_102919_p();
         }

         var1.func_103015_i();
      }

      if(var1.field_103020_b == null && var1.field_103018_d == null) {
         C_101217_avb var14;
         if(var1.field_103021_c == null && var1.field_103019_e == null) {
            var14 = this.field_105574_a;
            this.func_105558_a("/item/chest.png");
         } else {
            var14 = this.field_105573_c;
            this.func_105558_a("/item/largechest.png");
         }

         GL11.glPushMatrix();
         GL11.glEnable('\u803a');
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short var11 = 0;
         if(var9 == 2) {
            var11 = 180;
         }

         if(var9 == 3) {
            var11 = 0;
         }

         if(var9 == 4) {
            var11 = 90;
         }

         if(var9 == 5) {
            var11 = -90;
         }

         if(var9 == 2 && var1.field_103021_c != null) {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
         }

         if(var9 == 5 && var1.field_103019_e != null) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
         }

         GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var12 = var1.field_103017_g + (var1.field_103016_f - var1.field_103017_g) * var8;
         float var13;
         if(var1.field_103020_b != null) {
            var13 = var1.field_103020_b.field_103017_g + (var1.field_103020_b.field_103016_f - var1.field_103020_b.field_103017_g) * var8;
            if(var13 > var12) {
               var12 = var13;
            }
         }

         if(var1.field_103018_d != null) {
            var13 = var1.field_103018_d.field_103017_g + (var1.field_103018_d.field_103016_f - var1.field_103018_d.field_103017_g) * var8;
            if(var13 > var12) {
               var12 = var13;
            }
         }

         var12 = 1.0F - var12;
         var12 = 1.0F - var12 * var12 * var12;
         var14.field_112046_a.field_112211_f = -(var12 * 3.1415927F / 2.0F);
         var14.func_112043_a();
         GL11.glDisable('\u803a');
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
