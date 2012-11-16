import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100076_baq extends C_100056_bal {

   private C_101235_avh field_105462_a;
   private C_101235_avh field_105460_f;
   private C_101235_avh field_105461_g;
   private static final String[] field_105463_h = new String[]{"cloth", "chain", "iron", "diamond", "gold"};


   public C_100076_baq() {
      super(new C_101235_avh(0.0F), 0.5F);
      this.field_105462_a = (C_101235_avh)this.field_105380_i;
      this.field_105460_f = new C_101235_avh(1.0F);
      this.field_105461_g = new C_101235_avh(0.5F);
   }

   protected int func_105454_a(C_101095_qg var1, int var2, float var3) {
      C_100994_tv var4 = var1.field_103857_bK.func_104798_f(3 - var2);
      if(var4 != null) {
         C_100992_tt var5 = var4.func_111365_b();
         if(var5 instanceof C_101042_sc) {
            C_101042_sc var6 = (C_101042_sc)var5;
            this.func_105351_a("/armor/" + field_105463_h[var6.field_111051_c] + "_" + (var2 == 2?2:1) + ".png");
            C_101235_avh var7 = var2 == 2?this.field_105461_g:this.field_105460_f;
            var7.field_112094_c.field_112222_j = var2 == 0;
            var7.field_112092_d.field_112222_j = var2 == 0;
            var7.field_112093_e.field_112222_j = var2 == 1 || var2 == 2;
            var7.field_112090_f.field_112222_j = var2 == 1;
            var7.field_112091_g.field_112222_j = var2 == 1;
            var7.field_112101_h.field_112222_j = var2 == 2 || var2 == 3;
            var7.field_112102_i.field_112222_j = var2 == 2 || var2 == 3;
            this.func_105363_a(var7);
            if(var7 != null) {
               var7.field_112034_p = this.field_105380_i.field_112034_p;
            }

            if(var7 != null) {
               var7.field_112032_q = this.field_105380_i.field_112032_q;
            }

            if(var7 != null) {
               var7.field_112030_s = this.field_105380_i.field_112030_s;
            }

            float var8 = 1.0F;
            if(var6.func_111046_d() == C_101041_sd.field_111442_a) {
               int var9 = var6.func_111049_b(var4);
               float var10 = (float)(var9 >> 16 & 255) / 255.0F;
               float var11 = (float)(var9 >> 8 & 255) / 255.0F;
               float var12 = (float)(var9 & 255) / 255.0F;
               GL11.glColor3f(var8 * var10, var8 * var11, var8 * var12);
               if(var4.func_111358_w()) {
                  return 31;
               }

               return 16;
            }

            GL11.glColor3f(var8, var8, var8);
            if(var4.func_111358_w()) {
               return 15;
            }

            return 1;
         }
      }

      return -1;
   }

   protected void func_105451_b(C_101095_qg var1, int var2, float var3) {
      C_100994_tv var4 = var1.field_103857_bK.func_104798_f(3 - var2);
      if(var4 != null) {
         C_100992_tt var5 = var4.func_111365_b();
         if(var5 instanceof C_101042_sc) {
            C_101042_sc var6 = (C_101042_sc)var5;
            this.func_105351_a("/armor/" + field_105463_h[var6.field_111051_c] + "_" + (var2 == 2?2:1) + "_b.png");
            float var7 = 1.0F;
            GL11.glColor3f(var7, var7, var7);
         }
      }

   }

   public void func_105450_a(C_101095_qg var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 1.0F;
      GL11.glColor3f(var10, var10, var10);
      C_100994_tv var11 = var1.field_103857_bK.func_104808_g();
      this.field_105460_f.field_112098_m = this.field_105461_g.field_112098_m = this.field_105462_a.field_112098_m = var11 != null?1:0;
      if(var11 != null && var1.func_103803_bH() > 0) {
         C_100943_uw var12 = var11.func_111348_n();
         if(var12 == C_100943_uw.field_111097_d) {
            this.field_105460_f.field_112098_m = this.field_105461_g.field_112098_m = this.field_105462_a.field_112098_m = 3;
         } else if(var12 == C_100943_uw.field_111098_e) {
            this.field_105460_f.field_112096_o = this.field_105461_g.field_112096_o = this.field_105462_a.field_112096_o = true;
         }
      }

      this.field_105460_f.field_112095_n = this.field_105461_g.field_112095_n = this.field_105462_a.field_112095_n = var1.func_103168_ah();
      double var14 = var4 - (double)var1.field_103181_M;
      if(var1.func_103168_ah() && !(var1 instanceof C_100966_aym)) {
         var14 -= 0.125D;
      }

      super.func_105378_a(var1, var2, var14, var6, var8, var9);
      this.field_105460_f.field_112096_o = this.field_105461_g.field_112096_o = this.field_105462_a.field_112096_o = false;
      this.field_105460_f.field_112095_n = this.field_105461_g.field_112095_n = this.field_105462_a.field_112095_n = false;
      this.field_105460_f.field_112098_m = this.field_105461_g.field_112098_m = this.field_105462_a.field_112098_m = 0;
   }

   protected void func_105452_a(C_101095_qg var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if(!var1.func_103164_aj()) {
         super.func_105377_a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   protected void func_105458_a(C_101095_qg var1, double var2, double var4, double var6) {
      if(Minecraft.func_105058_s() && var1 != this.field_105357_b.field_110190_h && !var1.func_103164_aj()) {
         float var8 = 1.6F;
         float var9 = 0.016666668F * var8;
         double var10 = var1.func_103082_e(this.field_105357_b.field_110190_h);
         float var12 = var1.func_103168_ah()?32.0F:64.0F;
         if(var10 < (double)(var12 * var12)) {
            String var13 = var1.field_103847_bT;
            if(var1.func_103168_ah()) {
               C_101153_asb var14 = this.func_105352_a();
               GL11.glPushMatrix();
               GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
               GL11.glNormal3f(0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.field_105357_b.field_110188_j, 1.0F, 0.0F, 0.0F);
               GL11.glScalef(-var9, -var9, var9);
               GL11.glDisable(2896);
               GL11.glTranslatef(0.0F, 0.25F / var9, 0.0F);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               GL11.glBlendFunc(770, 771);
               C_100872_azb var15 = C_100872_azb.field_110346_a;
               GL11.glDisable(3553);
               var15.func_110330_b();
               int var16 = var14.func_111778_a(var13) / 2;
               var15.func_110317_a(0.0F, 0.0F, 0.0F, 0.25F);
               var15.func_110325_a((double)(-var16 - 1), -1.0D, 0.0D);
               var15.func_110325_a((double)(-var16 - 1), 8.0D, 0.0D);
               var15.func_110325_a((double)(var16 + 1), 8.0D, 0.0D);
               var15.func_110325_a((double)(var16 + 1), -1.0D, 0.0D);
               var15.func_110329_a();
               GL11.glEnable(3553);
               GL11.glDepthMask(true);
               var14.func_111798_b(var13, -var14.func_111778_a(var13) / 2, 0, 553648127);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
            } else if(var1.func_103369_bt()) {
               this.func_105364_a(var1, var13, var2, var4 - 1.5D, var6, 64);
            } else {
               this.func_105364_a(var1, var13, var2, var4, var6, 64);
            }
         }
      }

   }

   protected void func_105459_a(C_101095_qg var1, float var2) {
      float var3 = 1.0F;
      GL11.glColor3f(var3, var3, var3);
      super.func_105372_c(var1, var2);
      C_100994_tv var4 = var1.field_103857_bK.func_104798_f(3);
      if(var4 != null) {
         GL11.glPushMatrix();
         this.field_105462_a.field_112094_c.func_112210_c(0.0625F);
         float var5;
         if(var4.func_111365_b().field_110891_cf < 256) {
            if(C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var4.field_111397_c].func_106013_d())) {
               var5 = 0.625F;
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var5, -var5, -var5);
            }

            this.field_105357_b.field_110177_f.func_110254_a(var1, var4, 0);
         } else if(var4.func_111365_b().field_110891_cf == C_100992_tt.field_110951_bQ.field_110891_cf) {
            var5 = 1.0625F;
            GL11.glScalef(var5, -var5, -var5);
            String var6 = "";
            if(var4.func_111339_o() && var4.func_111352_p().func_107516_b("SkullOwner")) {
               var6 = var4.func_111352_p().func_107534_i("SkullOwner");
            }

            C_100047_bbw.field_105569_a.func_105565_a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var4.func_111367_j(), var6);
         }

         GL11.glPopMatrix();
      }

      float var7;
      if(var1.field_103847_bT.equals("deadmau5") && this.func_105349_a(var1.field_103172_cw, (String)null)) {
         for(int var20 = 0; var20 < 2; ++var20) {
            float var25 = var1.field_103178_B + (var1.field_103236_z - var1.field_103178_B) * var2 - (var1.field_103467_ax + (var1.field_103469_aw - var1.field_103467_ax) * var2);
            var7 = var1.field_103179_C + (var1.field_103177_A - var1.field_103179_C) * var2;
            GL11.glPushMatrix();
            GL11.glRotatef(var25, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var7, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.375F * (float)(var20 * 2 - 1), 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.375F, 0.0F);
            GL11.glRotatef(-var7, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-var25, 0.0F, 1.0F, 0.0F);
            float var8 = 1.3333334F;
            GL11.glScalef(var8, var8, var8);
            this.field_105462_a.func_112088_b(0.0625F);
            GL11.glPopMatrix();
         }
      }

      float var11;
      if(this.func_105349_a(var1.field_103842_cB, (String)null) && !var1.func_103164_aj() && !var1.func_103764_cc()) {
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 0.0F, 0.125F);
         double var22 = var1.field_103854_bV + (var1.field_103850_bY - var1.field_103854_bV) * (double)var2 - (var1.field_103227_q + (var1.field_103221_t - var1.field_103227_q) * (double)var2);
         double var24 = var1.field_103853_bW + (var1.field_103841_bZ - var1.field_103853_bW) * (double)var2 - (var1.field_103225_r + (var1.field_103219_u - var1.field_103225_r) * (double)var2);
         double var9 = var1.field_103851_bX + (var1.field_103835_ca - var1.field_103851_bX) * (double)var2 - (var1.field_103223_s + (var1.field_103217_v - var1.field_103223_s) * (double)var2);
         var11 = var1.field_103467_ax + (var1.field_103469_aw - var1.field_103467_ax) * var2;
         double var12 = (double)C_100650_jv.func_108924_a(var11 * 3.1415927F / 180.0F);
         double var14 = (double)(-C_100650_jv.func_108928_b(var11 * 3.1415927F / 180.0F));
         float var16 = (float)var24 * 10.0F;
         if(var16 < -6.0F) {
            var16 = -6.0F;
         }

         if(var16 > 32.0F) {
            var16 = 32.0F;
         }

         float var17 = (float)(var22 * var12 + var9 * var14) * 100.0F;
         float var18 = (float)(var22 * var14 - var9 * var12) * 100.0F;
         if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var19 = var1.field_103849_bR + (var1.field_103848_bS - var1.field_103849_bR) * var2;
         var16 += C_100650_jv.func_108924_a((var1.field_103193_P + (var1.field_103192_Q - var1.field_103193_P) * var2) * 6.0F) * 32.0F * var19;
         if(var1.func_103168_ah()) {
            var16 += 25.0F;
         }

         GL11.glRotatef(6.0F + var17 / 2.0F + var16, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var18 / 2.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var18 / 2.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         this.field_105462_a.func_112089_c(0.0625F);
         GL11.glPopMatrix();
      }

      C_100994_tv var21 = var1.field_103857_bK.func_104808_g();
      if(var21 != null) {
         GL11.glPushMatrix();
         this.field_105462_a.field_112090_f.func_112210_c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if(var1.field_103862_cl != null) {
            var21 = new C_100994_tv(C_100992_tt.field_110805_D);
         }

         C_100943_uw var23 = null;
         if(var1.func_103803_bH() > 0) {
            var23 = var21.func_111348_n();
         }

         if(var21.field_111397_c < 256 && C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var21.field_111397_c].func_106013_d())) {
            var7 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var7 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var7, -var7, var7);
         } else if(var21.field_111397_c == C_100992_tt.field_110843_k.field_110891_cf) {
            var7 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var7, -var7, var7);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if(C_100992_tt.field_110834_e[var21.field_111397_c].func_110763_n_()) {
            var7 = 0.625F;
            if(C_100992_tt.field_110834_e[var21.field_111397_c].func_110797_o_()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            if(var1.func_103803_bH() > 0 && var23 == C_100943_uw.field_111097_d) {
               GL11.glTranslatef(0.05F, 0.0F, -0.1F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var7, -var7, var7);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var7 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var7, var7, var7);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         if(var21.func_111365_b().func_110758_b()) {
            for(int var27 = 0; var27 <= 1; ++var27) {
               int var26 = var21.func_111365_b().func_110774_a(var21, var27);
               float var28 = (float)(var26 >> 16 & 255) / 255.0F;
               float var10 = (float)(var26 >> 8 & 255) / 255.0F;
               var11 = (float)(var26 & 255) / 255.0F;
               GL11.glColor4f(var28, var10, var11, 1.0F);
               this.field_105357_b.field_110177_f.func_110254_a(var1, var21, var27);
            }
         } else {
            this.field_105357_b.field_110177_f.func_110254_a(var1, var21, 0);
         }

         GL11.glPopMatrix();
      }

   }

   protected void func_105453_b(C_101095_qg var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void func_105455_a(C_101095_qg var1) {
      float var2 = 1.0F;
      GL11.glColor3f(var2, var2, var2);
      this.field_105462_a.field_112034_p = 0.0F;
      this.field_105462_a.func_112024_a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      this.field_105462_a.field_112090_f.func_112201_a(0.0625F);
   }

   protected void func_105456_b(C_101095_qg var1, double var2, double var4, double var6) {
      if(var1.func_103143_S() && var1.func_103369_bt()) {
         super.func_105373_a(var1, var2 + (double)var1.field_103871_cd, var4 + (double)var1.field_103836_cC, var6 + (double)var1.field_103868_ce);
      } else {
         super.func_105373_a(var1, var2, var4, var6);
      }

   }

   protected void func_105457_a(C_101095_qg var1, float var2, float var3, float var4) {
      if(var1.func_103143_S() && var1.func_103369_bt()) {
         GL11.glRotatef(var1.func_103772_bT(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.func_105376_a(var1), 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
      } else {
         super.func_105365_a(var1, var2, var3, var4);
      }

   }

   // $FF: synthetic method
   protected void func_105362_b(C_100595_ln var1, double var2, double var4, double var6) {
      this.func_105458_a((C_101095_qg)var1, var2, var4, var6);
   }

   // $FF: synthetic method
   protected void func_105367_a(C_100595_ln var1, float var2) {
      this.func_105453_b((C_101095_qg)var1, var2);
   }

   // $FF: synthetic method
   protected void func_105371_c(C_100595_ln var1, int var2, float var3) {
      this.func_105451_b((C_101095_qg)var1, var2, var3);
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105459_a((C_101095_qg)var1, var2);
   }

   // $FF: synthetic method
   protected void func_105373_a(C_100595_ln var1, double var2, double var4, double var6) {
      this.func_105456_b((C_101095_qg)var1, var2, var4, var6);
   }

}
