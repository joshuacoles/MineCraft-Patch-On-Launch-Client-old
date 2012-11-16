import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100059_bag extends C_100846_azx {

   private C_100876_azd field_105505_h = new C_100876_azd();
   private Random field_105506_i = new Random();
   public boolean field_105504_a = true;
   public float field_105502_f = 0.0F;
   public static boolean field_105503_g = false;


   public C_100059_bag() {
      this.field_105355_d = 0.15F;
      this.field_105356_e = 0.75F;
   }

   public void func_105494_a(C_100576_pg var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_105506_i.setSeed(187L);
      C_100994_tv var10 = var1.field_103279_a;
      GL11.glPushMatrix();
      float var11 = C_100650_jv.func_108924_a(((float)var1.field_103277_b + var9) / 10.0F + var1.field_103275_d) * 0.1F + 0.1F;
      float var12 = (((float)var1.field_103277_b + var9) / 20.0F + var1.field_103275_d) * 57.295776F;
      byte var13 = 1;
      if(var1.field_103279_a.field_111398_a > 1) {
         var13 = 2;
      }

      if(var1.field_103279_a.field_111398_a > 5) {
         var13 = 3;
      }

      if(var1.field_103279_a.field_111398_a > 20) {
         var13 = 4;
      }

      GL11.glTranslatef((float)var2, (float)var4 + var11, (float)var6);
      GL11.glEnable('\u803a');
      C_100451_alf var14 = C_100451_alf.field_106118_p[var10.field_111397_c];
      int var16;
      float var19;
      float var20;
      float var24;
      if(var14 != null && C_100876_azd.func_110435_b(var14.func_106013_d())) {
         GL11.glRotatef(var12, 0.0F, 1.0F, 0.0F);
         if(field_105503_g) {
            GL11.glScalef(1.25F, 1.25F, 1.25F);
            GL11.glTranslatef(0.0F, 0.05F, 0.0F);
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         }

         this.func_105351_a("/terrain.png");
         float var22 = 0.25F;
         var16 = var14.func_106013_d();
         if(var16 == 1 || var16 == 19 || var16 == 12 || var16 == 2) {
            var22 = 0.5F;
         }

         GL11.glScalef(var22, var22, var22);

         for(int var23 = 0; var23 < var13; ++var23) {
            GL11.glPushMatrix();
            if(var23 > 0) {
               var24 = (this.field_105506_i.nextFloat() * 2.0F - 1.0F) * 0.2F / var22;
               var19 = (this.field_105506_i.nextFloat() * 2.0F - 1.0F) * 0.2F / var22;
               var20 = (this.field_105506_i.nextFloat() * 2.0F - 1.0F) * 0.2F / var22;
               GL11.glTranslatef(var24, var19, var20);
            }

            var24 = 1.0F;
            this.field_105505_h.func_110400_a(var14, var10.func_111367_j(), var24);
            GL11.glPopMatrix();
         }
      } else {
         int var15;
         float var17;
         if(var10.func_111365_b().func_110758_b()) {
            if(field_105503_g) {
               GL11.glScalef(0.5128205F, 0.5128205F, 0.5128205F);
               GL11.glTranslatef(0.0F, -0.05F, 0.0F);
               GL11.glDisable(2896);
            } else {
               GL11.glScalef(0.5F, 0.5F, 0.5F);
            }

            this.func_105351_a("/gui/items.png");

            for(var15 = 0; var15 <= 1; ++var15) {
               var16 = var10.func_111365_b().func_110751_a(var10.func_111367_j(), var15);
               var17 = 1.0F;
               if(this.field_105504_a) {
                  int var18 = C_100992_tt.field_110834_e[var10.field_111397_c].func_110774_a(var10, var15);
                  var19 = (float)(var18 >> 16 & 255) / 255.0F;
                  var20 = (float)(var18 >> 8 & 255) / 255.0F;
                  float var21 = (float)(var18 & 255) / 255.0F;
                  GL11.glColor4f(var19 * var17, var20 * var17, var21 * var17, 1.0F);
               }

               this.func_105500_a(var16, var13);
            }
         } else {
            if(field_105503_g) {
               GL11.glScalef(0.5128205F, 0.5128205F, 0.5128205F);
               GL11.glTranslatef(0.0F, -0.05F, 0.0F);
               GL11.glDisable(2896);
            } else {
               GL11.glScalef(0.5F, 0.5F, 0.5F);
            }

            var15 = var10.func_111362_c();
            if(var14 != null) {
               this.func_105351_a("/terrain.png");
            } else {
               this.func_105351_a("/gui/items.png");
            }

            if(this.field_105504_a) {
               var16 = C_100992_tt.field_110834_e[var10.field_111397_c].func_110774_a(var10, 0);
               var17 = (float)(var16 >> 16 & 255) / 255.0F;
               var24 = (float)(var16 >> 8 & 255) / 255.0F;
               var19 = (float)(var16 & 255) / 255.0F;
               var20 = 1.0F;
               GL11.glColor4f(var17 * var20, var24 * var20, var19 * var20, 1.0F);
            }

            this.func_105500_a(var15, var13);
         }
      }

      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   private void func_105500_a(int var1, int var2) {
      C_100872_azb var3 = C_100872_azb.field_110346_a;
      float var4 = (float)(var1 % 16 * 16 + 0) / 256.0F;
      float var5 = (float)(var1 % 16 * 16 + 16) / 256.0F;
      float var6 = (float)(var1 / 16 * 16 + 0) / 256.0F;
      float var7 = (float)(var1 / 16 * 16 + 16) / 256.0F;
      float var8 = 1.0F;
      float var9 = 0.5F;
      float var10 = 0.25F;

      for(int var11 = 0; var11 < var2; ++var11) {
         GL11.glPushMatrix();
         if(var11 > 0) {
            float var12 = (this.field_105506_i.nextFloat() * 2.0F - 1.0F) * 0.3F;
            float var13 = (this.field_105506_i.nextFloat() * 2.0F - 1.0F) * 0.3F;
            float var14 = (this.field_105506_i.nextFloat() * 2.0F - 1.0F) * 0.3F;
            GL11.glTranslatef(var12, var13, var14);
         }

         GL11.glRotatef(180.0F - this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
         var3.func_110330_b();
         var3.func_110323_b(0.0F, 1.0F, 0.0F);
         var3.func_110322_a((double)(0.0F - var9), (double)(0.0F - var10), 0.0D, (double)var4, (double)var7);
         var3.func_110322_a((double)(var8 - var9), (double)(0.0F - var10), 0.0D, (double)var5, (double)var7);
         var3.func_110322_a((double)(var8 - var9), (double)(1.0F - var10), 0.0D, (double)var5, (double)var6);
         var3.func_110322_a((double)(0.0F - var9), (double)(1.0F - var10), 0.0D, (double)var4, (double)var6);
         var3.func_110329_a();
         GL11.glPopMatrix();
      }

   }

   public void func_105499_a(C_101153_asb var1, C_100874_azc var2, C_100994_tv var3, int var4, int var5) {
      int var6 = var3.field_111397_c;
      int var7 = var3.func_111367_j();
      int var8 = var3.func_111362_c();
      int var10;
      float var12;
      float var13;
      float var16;
      if(var6 < 256 && C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var6].func_106013_d())) {
         var2.func_110368_b(var2.func_110367_b("/terrain.png"));
         C_100451_alf var15 = C_100451_alf.field_106118_p[var6];
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var4 - 2), (float)(var5 + 3), -3.0F + this.field_105502_f);
         GL11.glScalef(10.0F, 10.0F, 10.0F);
         GL11.glTranslatef(1.0F, 0.5F, 1.0F);
         GL11.glScalef(1.0F, 1.0F, -1.0F);
         GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         var10 = C_100992_tt.field_110834_e[var6].func_110774_a(var3, 0);
         var16 = (float)(var10 >> 16 & 255) / 255.0F;
         var12 = (float)(var10 >> 8 & 255) / 255.0F;
         var13 = (float)(var10 & 255) / 255.0F;
         if(this.field_105504_a) {
            GL11.glColor4f(var16, var12, var13, 1.0F);
         }

         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         this.field_105505_h.field_110521_c = this.field_105504_a;
         this.field_105505_h.func_110400_a(var15, var7, 1.0F);
         this.field_105505_h.field_110521_c = true;
         GL11.glPopMatrix();
      } else {
         int var9;
         if(C_100992_tt.field_110834_e[var6].func_110758_b()) {
            GL11.glDisable(2896);
            var2.func_110368_b(var2.func_110367_b("/gui/items.png"));

            for(var9 = 0; var9 <= 1; ++var9) {
               var10 = C_100992_tt.field_110834_e[var6].func_110751_a(var7, var9);
               int var11 = C_100992_tt.field_110834_e[var6].func_110774_a(var3, var9);
               var12 = (float)(var11 >> 16 & 255) / 255.0F;
               var13 = (float)(var11 >> 8 & 255) / 255.0F;
               float var14 = (float)(var11 & 255) / 255.0F;
               if(this.field_105504_a) {
                  GL11.glColor4f(var12, var13, var14, 1.0F);
               }

               this.func_105497_a(var4, var5, var10 % 16 * 16, var10 / 16 * 16, 16, 16);
            }

            GL11.glEnable(2896);
         } else if(var8 >= 0) {
            GL11.glDisable(2896);
            if(var6 < 256) {
               var2.func_110368_b(var2.func_110367_b("/terrain.png"));
            } else {
               var2.func_110368_b(var2.func_110367_b("/gui/items.png"));
            }

            var9 = C_100992_tt.field_110834_e[var6].func_110774_a(var3, 0);
            float var17 = (float)(var9 >> 16 & 255) / 255.0F;
            var16 = (float)(var9 >> 8 & 255) / 255.0F;
            var12 = (float)(var9 & 255) / 255.0F;
            if(this.field_105504_a) {
               GL11.glColor4f(var17, var16, var12, 1.0F);
            }

            this.func_105497_a(var4, var5, var8 % 16 * 16, var8 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
         }
      }

      GL11.glEnable(2884);
   }

   public void func_105501_b(C_101153_asb var1, C_100874_azc var2, C_100994_tv var3, int var4, int var5) {
      if(var3 != null) {
         this.func_105499_a(var1, var2, var3, var4, var5);
         if(var3 != null && var3.func_111356_t()) {
            GL11.glDepthFunc(516);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            var2.func_110368_b(var2.func_110367_b("%blur%/misc/glint.png"));
            this.field_105502_f -= 50.0F;
            GL11.glEnable(3042);
            GL11.glBlendFunc(774, 774);
            GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
            this.func_105498_a(var4 * 431278612 + var5 * 32178161, var4 - 2, var5 - 2, 20, 20);
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            this.field_105502_f += 50.0F;
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

      }
   }

   private void func_105498_a(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 2; ++var6) {
         if(var6 == 0) {
            GL11.glBlendFunc(768, 1);
         }

         if(var6 == 1) {
            GL11.glBlendFunc(768, 1);
         }

         float var7 = 0.00390625F;
         float var8 = 0.00390625F;
         float var9 = (float)(Minecraft.func_105063_F() % (long)(3000 + var6 * 1873)) / (3000.0F + (float)(var6 * 1873)) * 256.0F;
         float var10 = 0.0F;
         C_100872_azb var11 = C_100872_azb.field_110346_a;
         float var12 = 4.0F;
         if(var6 == 1) {
            var12 = -1.0F;
         }

         var11.func_110330_b();
         var11.func_110322_a((double)(var2 + 0), (double)(var3 + var5), (double)this.field_105502_f, (double)((var9 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.func_110322_a((double)(var2 + var4), (double)(var3 + var5), (double)this.field_105502_f, (double)((var9 + (float)var4 + (float)var5 * var12) * var7), (double)((var10 + (float)var5) * var8));
         var11.func_110322_a((double)(var2 + var4), (double)(var3 + 0), (double)this.field_105502_f, (double)((var9 + (float)var4) * var7), (double)((var10 + 0.0F) * var8));
         var11.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)this.field_105502_f, (double)((var9 + 0.0F) * var7), (double)((var10 + 0.0F) * var8));
         var11.func_110329_a();
      }

   }

   public void func_105496_c(C_101153_asb var1, C_100874_azc var2, C_100994_tv var3, int var4, int var5) {
      if(var3 != null) {
         if(var3.field_111398_a > 1) {
            String var6 = "" + var3.field_111398_a;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            var1.func_111783_a(var6, var4 + 19 - 2 - var1.func_111778_a(var6), var5 + 6 + 3, 16777215);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }

         if(var3.func_111353_h()) {
            int var11 = (int)Math.round(13.0D - (double)var3.func_111357_i() * 13.0D / (double)var3.func_111364_k());
            int var7 = (int)Math.round(255.0D - (double)var3.func_111357_i() * 255.0D / (double)var3.func_111364_k());
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            C_100872_azb var8 = C_100872_azb.field_110346_a;
            int var9 = 255 - var7 << 16 | var7 << 8;
            int var10 = (255 - var7) / 4 << 16 | 16128;
            this.func_105495_a(var8, var4 + 2, var5 + 13, 13, 2, 0);
            this.func_105495_a(var8, var4 + 2, var5 + 13, 12, 1, var10);
            this.func_105495_a(var8, var4 + 2, var5 + 13, var11, 1, var9);
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   private void func_105495_a(C_100872_azb var1, int var2, int var3, int var4, int var5, int var6) {
      var1.func_110330_b();
      var1.func_110326_d(var6);
      var1.func_110325_a((double)(var2 + 0), (double)(var3 + 0), 0.0D);
      var1.func_110325_a((double)(var2 + 0), (double)(var3 + var5), 0.0D);
      var1.func_110325_a((double)(var2 + var4), (double)(var3 + var5), 0.0D);
      var1.func_110325_a((double)(var2 + var4), (double)(var3 + 0), 0.0D);
      var1.func_110329_a();
   }

   public void func_105497_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      var9.func_110330_b();
      var9.func_110322_a((double)(var1 + 0), (double)(var2 + var6), (double)this.field_105502_f, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.func_110322_a((double)(var1 + var5), (double)(var2 + var6), (double)this.field_105502_f, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.func_110322_a((double)(var1 + var5), (double)(var2 + 0), (double)this.field_105502_f, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.func_110322_a((double)(var1 + 0), (double)(var2 + 0), (double)this.field_105502_f, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.func_110329_a();
   }

}
