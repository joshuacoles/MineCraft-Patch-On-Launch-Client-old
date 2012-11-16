import org.lwjgl.opengl.GL11;

public class C_100055_bak extends C_100846_azx {

   protected C_101231_avl field_105361_a;


   public C_100055_bak() {
      this.field_105355_d = 0.5F;
      this.field_105361_a = new C_101230_avk();
   }

   public void func_105360_a(C_100590_ph var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      long var10 = (long)var1.field_103212_k * 493286711L;
      var10 = var10 * var10 * 4392167121L + var10 * 98761L;
      float var12 = (((float)(var10 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.0040F;
      float var13 = (((float)(var10 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.0040F;
      float var14 = (((float)(var10 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.0040F;
      GL11.glTranslatef(var12, var13, var14);
      double var15 = var1.field_103189_T + (var1.field_103221_t - var1.field_103189_T) * (double)var9;
      double var17 = var1.field_103188_U + (var1.field_103219_u - var1.field_103188_U) * (double)var9;
      double var19 = var1.field_103191_V + (var1.field_103217_v - var1.field_103191_V) * (double)var9;
      double var21 = 0.30000001192092896D;
      C_100387_amw var23 = var1.func_104743_a(var15, var17, var19);
      float var24 = var1.field_103179_C + (var1.field_103177_A - var1.field_103179_C) * var9;
      if(var23 != null) {
         C_100387_amw var25 = var1.func_104752_a(var15, var17, var19, var21);
         C_100387_amw var26 = var1.func_104752_a(var15, var17, var19, -var21);
         if(var25 == null) {
            var25 = var23;
         }

         if(var26 == null) {
            var26 = var23;
         }

         var2 += var23.field_107872_c - var15;
         var4 += (var25.field_107869_d + var26.field_107869_d) / 2.0D - var17;
         var6 += var23.field_107870_e - var19;
         C_100387_amw var27 = var26.func_107856_c(-var25.field_107872_c, -var25.field_107869_d, -var25.field_107870_e);
         if(var27.func_107855_b() != 0.0D) {
            var27 = var27.func_107865_a();
            var8 = (float)(Math.atan2(var27.field_107870_e, var27.field_107872_c) * 180.0D / 3.141592653589793D);
            var24 = (float)(Math.atan(var27.field_107869_d) * 73.0D);
         }
      }

      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var24, 0.0F, 0.0F, 1.0F);
      float var28 = (float)var1.func_104750_j() - var9;
      float var30 = (float)var1.func_104745_i() - var9;
      if(var30 < 0.0F) {
         var30 = 0.0F;
      }

      if(var28 > 0.0F) {
         GL11.glRotatef(C_100650_jv.func_108924_a(var28) * var28 * var30 / 10.0F * (float)var1.func_104748_k(), 1.0F, 0.0F, 0.0F);
      }

      if(var1.field_104761_a != 0) {
         this.func_105351_a("/terrain.png");
         float var29 = 0.75F;
         GL11.glScalef(var29, var29, var29);
         if(var1.field_104761_a == 1) {
            GL11.glTranslatef(0.0F, 0.5F, 0.0F);
            (new C_100876_azd()).func_110400_a(C_100451_alf.field_106216_ax, 0, var1.func_103057_c(var9));
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.5F, 0.0F, -0.5F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         } else if(var1.field_104761_a == 2) {
            GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
            (new C_100876_azd()).func_110400_a(C_100451_alf.field_106197_aE, 0, var1.func_103057_c(var9));
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

         GL11.glScalef(1.0F / var29, 1.0F / var29, 1.0F / var29);
      }

      this.func_105351_a("/item/cart.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.field_105361_a.func_112027_a(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
