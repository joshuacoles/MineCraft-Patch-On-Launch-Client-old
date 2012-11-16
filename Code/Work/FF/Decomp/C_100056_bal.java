import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100056_bal extends C_100846_azx {

   protected C_101231_avl field_105380_i;
   protected C_101231_avl field_105379_j;


   public C_100056_bal(C_101231_avl var1, float var2) {
      this.field_105380_i = var1;
      this.field_105355_d = var2;
   }

   public void func_105363_a(C_101231_avl var1) {
      this.field_105379_j = var1;
   }

   private float func_105368_a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void func_105378_a(C_100595_ln var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glDisable(2884);
      this.field_105380_i.field_112034_p = this.func_105366_d(var1, var9);
      if(this.field_105379_j != null) {
         this.field_105379_j.field_112034_p = this.field_105380_i.field_112034_p;
      }

      this.field_105380_i.field_112032_q = var1.func_103108_ag();
      if(this.field_105379_j != null) {
         this.field_105379_j.field_112032_q = this.field_105380_i.field_112032_q;
      }

      this.field_105380_i.field_112030_s = var1.func_103357_h_();
      if(this.field_105379_j != null) {
         this.field_105379_j.field_112030_s = this.field_105380_i.field_112030_s;
      }

      try {
         float var10 = this.func_105368_a(var1.field_103467_ax, var1.field_103469_aw, var9);
         float var11 = this.func_105368_a(var1.field_103454_az, var1.field_103455_ay, var9);
         float var12 = var1.field_103179_C + (var1.field_103177_A - var1.field_103179_C) * var9;
         this.func_105373_a(var1, var2, var4, var6);
         float var13 = this.func_105374_b(var1, var9);
         this.func_105365_a(var1, var13, var10, var9);
         float var14 = 0.0625F;
         GL11.glEnable('\u803a');
         GL11.glScalef(-1.0F, -1.0F, 1.0F);
         this.func_105367_a(var1, var9);
         GL11.glTranslatef(0.0F, -24.0F * var14 - 0.0078125F, 0.0F);
         float var15 = var1.field_103416_bf + (var1.field_103417_bg - var1.field_103416_bf) * var9;
         float var16 = var1.field_103418_bh - var1.field_103417_bg * (1.0F - var9);
         if(var1.func_103357_h_()) {
            var16 *= 3.0F;
         }

         if(var15 > 1.0F) {
            var15 = 1.0F;
         }

         GL11.glEnable(3008);
         this.field_105380_i.func_112025_a(var1, var16, var15, var9);
         this.func_105377_a(var1, var16, var15, var13, var11 - var10, var12, var14);

         float var19;
         int var18;
         float var20;
         float var22;
         for(int var17 = 0; var17 < 4; ++var17) {
            var18 = this.func_105375_a(var1, var17, var9);
            if(var18 > 0) {
               this.field_105379_j.func_112025_a(var1, var16, var15, var9);
               this.field_105379_j.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);
               if((var18 & 240) == 16) {
                  this.func_105371_c(var1, var17, var9);
                  this.field_105379_j.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);
               }

               if((var18 & 15) == 15) {
                  var19 = (float)var1.field_103233_ab + var9;
                  this.func_105351_a("%blur%/misc/glint.png");
                  GL11.glEnable(3042);
                  var20 = 0.5F;
                  GL11.glColor4f(var20, var20, var20, 1.0F);
                  GL11.glDepthFunc(514);
                  GL11.glDepthMask(false);

                  for(int var21 = 0; var21 < 2; ++var21) {
                     GL11.glDisable(2896);
                     var22 = 0.76F;
                     GL11.glColor4f(0.5F * var22, 0.25F * var22, 0.8F * var22, 1.0F);
                     GL11.glBlendFunc(768, 1);
                     GL11.glMatrixMode(5890);
                     GL11.glLoadIdentity();
                     float var23 = var19 * (0.0010F + (float)var21 * 0.0030F) * 20.0F;
                     float var24 = 0.33333334F;
                     GL11.glScalef(var24, var24, var24);
                     GL11.glRotatef(30.0F - (float)var21 * 60.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glTranslatef(0.0F, var23, 0.0F);
                     GL11.glMatrixMode(5888);
                     this.field_105379_j.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }

                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glMatrixMode(5890);
                  GL11.glDepthMask(true);
                  GL11.glLoadIdentity();
                  GL11.glMatrixMode(5888);
                  GL11.glEnable(2896);
                  GL11.glDisable(3042);
                  GL11.glDepthFunc(515);
               }

               GL11.glDisable(3042);
               GL11.glEnable(3008);
            }
         }

         GL11.glDepthMask(true);
         this.func_105372_c(var1, var9);
         float var26 = var1.func_103057_c(var9);
         var18 = this.func_105370_a(var1, var26, var9);
         C_100082_bdf.func_105620_a(C_100082_bdf.field_105623_b);
         GL11.glDisable(3553);
         C_100082_bdf.func_105620_a(C_100082_bdf.field_105625_a);
         if((var18 >> 24 & 255) > 0 || var1.field_103432_aU > 0 || var1.field_103433_aX > 0) {
            GL11.glDisable(3553);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthFunc(514);
            if(var1.field_103432_aU > 0 || var1.field_103433_aX > 0) {
               GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
               this.field_105380_i.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);

               for(int var27 = 0; var27 < 4; ++var27) {
                  if(this.func_105369_b(var1, var27, var9) >= 0) {
                     GL11.glColor4f(var26, 0.0F, 0.0F, 0.4F);
                     this.field_105379_j.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            if((var18 >> 24 & 255) > 0) {
               var19 = (float)(var18 >> 16 & 255) / 255.0F;
               var20 = (float)(var18 >> 8 & 255) / 255.0F;
               float var29 = (float)(var18 & 255) / 255.0F;
               var22 = (float)(var18 >> 24 & 255) / 255.0F;
               GL11.glColor4f(var19, var20, var29, var22);
               this.field_105380_i.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);

               for(int var28 = 0; var28 < 4; ++var28) {
                  if(this.func_105369_b(var1, var28, var9) >= 0) {
                     GL11.glColor4f(var19, var20, var29, var22);
                     this.field_105379_j.func_112027_a(var1, var16, var15, var13, var11 - var10, var12, var14);
                  }
               }
            }

            GL11.glDepthFunc(515);
            GL11.glDisable(3042);
            GL11.glEnable(3008);
            GL11.glEnable(3553);
         }

         GL11.glDisable('\u803a');
      } catch (Exception var25) {
         var25.printStackTrace();
      }

      C_100082_bdf.func_105620_a(C_100082_bdf.field_105623_b);
      GL11.glEnable(3553);
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105625_a);
      GL11.glEnable(2884);
      GL11.glPopMatrix();
      this.func_105362_b(var1, var2, var4, var6);
   }

   protected void func_105377_a(C_100595_ln var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if(!var1.func_103164_aj()) {
         this.func_105349_a(var1.field_103172_cw, var1.func_103129_O());
         this.field_105380_i.func_112027_a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   protected void func_105373_a(C_100595_ln var1, double var2, double var4, double var6) {
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
   }

   protected void func_105365_a(C_100595_ln var1, float var2, float var3, float var4) {
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      if(var1.field_103433_aX > 0) {
         float var5 = ((float)var1.field_103433_aX + var4 - 1.0F) / 20.0F * 1.6F;
         var5 = C_100650_jv.func_108913_c(var5);
         if(var5 > 1.0F) {
            var5 = 1.0F;
         }

         GL11.glRotatef(var5 * this.func_105376_a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected float func_105366_d(C_100595_ln var1, float var2) {
      return var1.func_103381_g(var2);
   }

   protected float func_105374_b(C_100595_ln var1, float var2) {
      return (float)var1.field_103233_ab + var2;
   }

   protected void func_105372_c(C_100595_ln var1, float var2) {}

   protected int func_105369_b(C_100595_ln var1, int var2, float var3) {
      return this.func_105375_a(var1, var2, var3);
   }

   protected int func_105375_a(C_100595_ln var1, int var2, float var3) {
      return -1;
   }

   protected void func_105371_c(C_100595_ln var1, int var2, float var3) {}

   protected float func_105376_a(C_100595_ln var1) {
      return 90.0F;
   }

   protected int func_105370_a(C_100595_ln var1, float var2, float var3) {
      return 0;
   }

   protected void func_105367_a(C_100595_ln var1, float var2) {}

   protected void func_105362_b(C_100595_ln var1, double var2, double var4, double var6) {
      if(Minecraft.func_105046_v()) {
         ;
      }

   }

   protected void func_105364_a(C_100595_ln var1, String var2, double var3, double var5, double var7, int var9) {
      double var10 = var1.func_103082_e(this.field_105357_b.field_110190_h);
      if(var10 <= (double)(var9 * var9)) {
         C_101153_asb var12 = this.func_105352_a();
         float var13 = 1.6F;
         float var14 = 0.016666668F * var13;
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var3 + 0.0F, (float)var5 + 2.3F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.field_105357_b.field_110188_j, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-var14, -var14, var14);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         C_100872_azb var15 = C_100872_azb.field_110346_a;
         byte var16 = 0;
         if(var2.equals("deadmau5")) {
            var16 = -10;
         }

         GL11.glDisable(3553);
         var15.func_110330_b();
         int var17 = var12.func_111778_a(var2) / 2;
         var15.func_110317_a(0.0F, 0.0F, 0.0F, 0.25F);
         var15.func_110325_a((double)(-var17 - 1), (double)(-1 + var16), 0.0D);
         var15.func_110325_a((double)(-var17 - 1), (double)(8 + var16), 0.0D);
         var15.func_110325_a((double)(var17 + 1), (double)(8 + var16), 0.0D);
         var15.func_110325_a((double)(var17 + 1), (double)(-1 + var16), 0.0D);
         var15.func_110329_a();
         GL11.glEnable(3553);
         var12.func_111798_b(var2, -var12.func_111778_a(var2) / 2, var16, 553648127);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         var12.func_111798_b(var2, -var12.func_111778_a(var2) / 2, var16, -1);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
      }
   }
}
