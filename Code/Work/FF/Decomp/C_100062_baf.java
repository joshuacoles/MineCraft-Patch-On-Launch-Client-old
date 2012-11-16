import org.lwjgl.opengl.GL11;

public class C_100062_baf extends C_100846_azx {

   private final C_100876_azd field_105512_a = new C_100876_azd();


   public void func_105509_a(C_100596_lm var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      float var10 = (float)(var1.field_103221_t - var2) - 0.5F;
      float var11 = (float)(var1.field_103219_u - var4) - 0.5F;
      float var12 = (float)(var1.field_103217_v - var6) - 0.5F;
      int var13 = var1.field_104579_b + C_100015_i.field_105283_a[var1.field_104581_a];
      int var14 = var1.field_104580_c;
      int var15 = var1.field_104577_d + C_100015_i.field_105281_b[var1.field_104581_a];
      GL11.glTranslatef((float)var13 - var10, (float)var14 - var11, (float)var15 - var12);
      this.func_105510_a(var1);
      this.func_105511_b(var1);
      GL11.glPopMatrix();
   }

   private void func_105510_a(C_100596_lm var1) {
      GL11.glPushMatrix();
      GL11.glBindTexture(3553, this.field_105357_b.field_110180_e.func_110367_b("/terrain.png"));
      GL11.glRotatef(var1.field_103236_z, 0.0F, 1.0F, 0.0F);
      C_100451_alf var2 = C_100451_alf.field_106075_A;
      float var3 = 0.0625F;
      float var4 = 0.75F;
      float var5 = var4 / 2.0F;
      GL11.glPushMatrix();
      this.field_105512_a.func_110432_b(0.0D, (double)(0.5F - var5 + 0.0625F), (double)(0.5F - var5 + 0.0625F), (double)(var3 * 0.5F), (double)(0.5F + var5 - 0.0625F), (double)(0.5F + var5 - 0.0625F));
      this.field_105512_a.func_110403_a(185);
      this.field_105512_a.func_110400_a(var2, 0, 1.0F);
      this.field_105512_a.func_110434_a();
      this.field_105512_a.func_110414_b();
      GL11.glPopMatrix();
      this.field_105512_a.func_110403_a(214);
      GL11.glPushMatrix();
      this.field_105512_a.func_110432_b(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(var3 + 0.5F - var5), (double)(0.5F + var5));
      this.field_105512_a.func_110400_a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_105512_a.func_110432_b(0.0D, (double)(0.5F + var5 - var3), (double)(0.5F - var5), (double)(var3 + 1.0E-4F), (double)(0.5F + var5), (double)(0.5F + var5));
      this.field_105512_a.func_110400_a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_105512_a.func_110432_b(0.0D, (double)(0.5F - var5), (double)(0.5F - var5), (double)var3, (double)(0.5F + var5), (double)(var3 + 0.5F - var5));
      this.field_105512_a.func_110400_a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.field_105512_a.func_110432_b(0.0D, (double)(0.5F - var5), (double)(0.5F + var5 - var3), (double)var3, (double)(0.5F + var5), (double)(0.5F + var5));
      this.field_105512_a.func_110400_a(var2, 0, 1.0F);
      GL11.glPopMatrix();
      this.field_105512_a.func_110414_b();
      this.field_105512_a.func_110434_a();
      GL11.glPopMatrix();
   }

   private void func_105511_b(C_100596_lm var1) {
      C_100994_tv var2 = var1.func_104582_i();
      if(var2 != null) {
         C_100576_pg var3 = new C_100576_pg(var1.field_103229_p, 0.0D, 0.0D, 0.0D, var2);
         var3.field_103279_a.field_111398_a = 1;
         var3.field_103275_d = 0.0F;
         GL11.glPushMatrix();
         GL11.glTranslatef(-0.453125F * (float)C_100015_i.field_105283_a[var1.field_104581_a], -0.18F, -0.453125F * (float)C_100015_i.field_105281_b[var1.field_104581_a]);
         GL11.glRotatef(180.0F + var1.field_103236_z, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)(-90 * var1.func_104583_j()), 0.0F, 0.0F, 1.0F);
         switch(var1.func_104583_j()) {
         case 1:
            GL11.glTranslatef(-0.16F, -0.16F, 0.0F);
            break;
         case 2:
            GL11.glTranslatef(0.0F, -0.32F, 0.0F);
            break;
         case 3:
            GL11.glTranslatef(0.16F, -0.16F, 0.0F);
         }

         if(var3.field_103279_a.func_111365_b() == C_100992_tt.field_110882_bd) {
            this.field_105357_b.field_110180_e.func_110368_b(this.field_105357_b.field_110180_e.func_110367_b("/misc/mapbg.png"));
            C_100872_azb var4 = C_100872_azb.field_110346_a;
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
            GL11.glScalef(0.00390625F, 0.00390625F, 0.00390625F);
            GL11.glTranslatef(-65.0F, -107.0F, -1.0F);
            GL11.glNormal3f(0.0F, 0.0F, -1.0F);
            var4.func_110330_b();
            byte var5 = 7;
            var4.func_110322_a((double)(0 - var5), (double)(128 + var5), 0.0D, 0.0D, 1.0D);
            var4.func_110322_a((double)(128 + var5), (double)(128 + var5), 0.0D, 1.0D, 1.0D);
            var4.func_110322_a((double)(128 + var5), (double)(0 - var5), 0.0D, 1.0D, 0.0D);
            var4.func_110322_a((double)(0 - var5), (double)(0 - var5), 0.0D, 0.0D, 0.0D);
            var4.func_110329_a();
            C_100282_agl var6 = C_100992_tt.field_110882_bd.func_111042_a(var3.field_103279_a, var1.field_103229_p);
            if(var6 != null) {
               this.field_105357_b.field_110177_f.field_110262_a.func_111840_a((C_101095_qg)null, this.field_105357_b.field_110180_e, var6);
            }
         } else {
            if(var3.field_103279_a.func_111365_b() == C_100992_tt.field_110898_aQ) {
               double var8 = C_100031_bbh.field_105323_c.field_105324_a;
               double var10 = C_100031_bbh.field_105323_c.field_105322_b;
               C_100031_bbh.field_105323_c.field_105324_a = 0.0D;
               C_100031_bbh.field_105323_c.field_105322_b = 0.0D;
               C_100031_bbh.func_105321_a(var1.field_103221_t, var1.field_103217_v, (double)C_100650_jv.func_108920_g((float)(180 + var1.field_104581_a * 90)), false, true);
               C_100031_bbh.field_105323_c.field_105324_a = var8;
               C_100031_bbh.field_105323_c.field_105322_b = var10;
               this.field_105357_b.field_110180_e.func_110382_a(C_100031_bbh.field_105323_c, -1);
            }

            float var9 = this.field_105357_b.field_110191_i;
            this.field_105357_b.field_110191_i = 180.0F;
            C_100059_bag.field_105503_g = true;
            C_100848_azw.field_110183_a.func_110173_a(var3, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
            C_100059_bag.field_105503_g = false;
            this.field_105357_b.field_110191_i = var9;
            GL11.glEnable(2896);
            if(var3.field_103279_a.func_111365_b() == C_100992_tt.field_110898_aQ) {
               C_100031_bbh.field_105323_c.func_105301_a();
               this.field_105357_b.field_110180_e.func_110382_a(C_100031_bbh.field_105323_c, -1);
            }
         }

         GL11.glPopMatrix();
      }
   }
}
