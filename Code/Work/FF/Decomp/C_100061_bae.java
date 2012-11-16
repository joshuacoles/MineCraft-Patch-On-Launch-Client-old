import org.lwjgl.opengl.GL11;

public class C_100061_bae extends C_100056_bal {

   protected C_101235_avh field_105412_a;
   protected float field_105410_f;
   protected C_101235_avh field_105411_g;
   protected C_101235_avh field_105414_h;
   private static final String[] field_105413_k = new String[]{"cloth", "chain", "iron", "diamond", "gold"};


   public C_100061_bae(C_101235_avh var1, float var2) {
      this(var1, var2, 1.0F);
   }

   public C_100061_bae(C_101235_avh var1, float var2, float var3) {
      super(var1, var2);
      this.field_105412_a = var1;
      this.field_105410_f = var3;
      this.func_105408_b();
   }

   protected void func_105408_b() {
      this.field_105411_g = new C_101235_avh(1.0F);
      this.field_105414_h = new C_101235_avh(0.5F);
   }

   protected int func_105375_a(C_100595_ln var1, int var2, float var3) {
      C_100994_tv var4 = var1.func_103346_q(3 - var2);
      if(var4 != null) {
         C_100992_tt var5 = var4.func_111365_b();
         if(var5 instanceof C_101042_sc) {
            C_101042_sc var6 = (C_101042_sc)var5;
            this.func_105351_a("/armor/" + field_105413_k[var6.field_111051_c] + "_" + (var2 == 2?2:1) + ".png");
            C_101235_avh var7 = var2 == 2?this.field_105414_h:this.field_105411_g;
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

   protected void func_105371_c(C_100595_ln var1, int var2, float var3) {
      C_100994_tv var4 = var1.func_103346_q(3 - var2);
      if(var4 != null) {
         C_100992_tt var5 = var4.func_111365_b();
         if(var5 instanceof C_101042_sc) {
            C_101042_sc var6 = (C_101042_sc)var5;
            this.func_105351_a("/armor/" + field_105413_k[var6.field_111051_c] + "_" + (var2 == 2?2:1) + "_b.png");
            float var7 = 1.0F;
            GL11.glColor3f(var7, var7, var7);
         }
      }

   }

   public void func_105378_a(C_100595_ln var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 1.0F;
      GL11.glColor3f(var10, var10, var10);
      C_100994_tv var11 = var1.func_103328_bA();
      this.func_105407_a(var1, var11);
      double var12 = var4 - (double)var1.field_103181_M;
      if(var1.func_103168_ah() && !(var1 instanceof C_100966_aym)) {
         var12 -= 0.125D;
      }

      super.func_105378_a(var1, var2, var12, var6, var8, var9);
      this.field_105411_g.field_112096_o = this.field_105414_h.field_112096_o = this.field_105412_a.field_112096_o = false;
      this.field_105411_g.field_112095_n = this.field_105414_h.field_112095_n = this.field_105412_a.field_112095_n = false;
      this.field_105411_g.field_112098_m = this.field_105414_h.field_112098_m = this.field_105412_a.field_112098_m = 0;
   }

   protected void func_105407_a(C_100595_ln var1, C_100994_tv var2) {
      this.field_105411_g.field_112098_m = this.field_105414_h.field_112098_m = this.field_105412_a.field_112098_m = var2 != null?1:0;
      this.field_105411_g.field_112095_n = this.field_105414_h.field_112095_n = this.field_105412_a.field_112095_n = var1.func_103168_ah();
   }

   protected void func_105372_c(C_100595_ln var1, float var2) {
      float var3 = 1.0F;
      GL11.glColor3f(var3, var3, var3);
      super.func_105372_c(var1, var2);
      C_100994_tv var4 = var1.func_103328_bA();
      C_100994_tv var5 = var1.func_103346_q(3);
      float var6;
      if(var5 != null) {
         GL11.glPushMatrix();
         this.field_105412_a.field_112094_c.func_112210_c(0.0625F);
         if(var5.func_111365_b().field_110891_cf < 256) {
            if(C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var5.field_111397_c].func_106013_d())) {
               var6 = 0.625F;
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var6, -var6, -var6);
            }

            this.field_105357_b.field_110177_f.func_110254_a(var1, var5, 0);
         } else if(var5.func_111365_b().field_110891_cf == C_100992_tt.field_110951_bQ.field_110891_cf) {
            var6 = 1.0625F;
            GL11.glScalef(var6, -var6, -var6);
            String var7 = "";
            if(var5.func_111339_o() && var5.func_111352_p().func_107516_b("SkullOwner")) {
               var7 = var5.func_111352_p().func_107534_i("SkullOwner");
            }

            C_100047_bbw.field_105569_a.func_105565_a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var5.func_111367_j(), var7);
         }

         GL11.glPopMatrix();
      }

      if(var4 != null) {
         GL11.glPushMatrix();
         if(this.field_105380_i.field_112030_s) {
            var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.625F, 0.0F);
            GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
            GL11.glScalef(var6, var6, var6);
         }

         this.field_105412_a.field_112090_f.func_112210_c(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if(var4.field_111397_c < 256 && C_100876_azd.func_110435_b(C_100451_alf.field_106118_p[var4.field_111397_c].func_106013_d())) {
            var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var6 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
         } else if(var4.field_111397_c == C_100992_tt.field_110843_k.field_110891_cf) {
            var6 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if(C_100992_tt.field_110834_e[var4.field_111397_c].func_110763_n_()) {
            var6 = 0.625F;
            if(C_100992_tt.field_110834_e[var4.field_111397_c].func_110797_o_()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            this.func_105409_c();
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var6 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var6, var6, var6);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.field_105357_b.field_110177_f.func_110254_a(var1, var4, 0);
         if(var4.func_111365_b().func_110758_b()) {
            this.field_105357_b.field_110177_f.func_110254_a(var1, var4, 1);
         }

         GL11.glPopMatrix();
      }

   }

   protected void func_105409_c() {
      GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
   }

}
