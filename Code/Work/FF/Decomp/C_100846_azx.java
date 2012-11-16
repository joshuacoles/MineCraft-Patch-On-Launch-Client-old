import org.lwjgl.opengl.GL11;

public abstract class C_100846_azx {

   protected C_100848_azw field_105357_b;
   private C_101231_avl field_105359_a = new C_101235_avh();
   protected C_100876_azd field_105358_c = new C_100876_azd();
   protected float field_105355_d = 0.0F;
   protected float field_105356_e = 1.0F;


   public abstract void func_105350_a(C_100730_lb var1, double var2, double var4, double var6, float var8, float var9);

   protected void func_105351_a(String var1) {
      C_100874_azc var2 = this.field_105357_b.field_110180_e;
      var2.func_110368_b(var2.func_110367_b(var1));
   }

   protected boolean func_105349_a(String var1, String var2) {
      C_100874_azc var3 = this.field_105357_b.field_110180_e;
      int var4 = var3.func_110378_a(var1, var2);
      if(var4 >= 0) {
         var3.func_110368_b(var4);
         return true;
      } else {
         return false;
      }
   }

   private void func_105347_a(C_100730_lb var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      int var9 = C_100451_alf.field_106222_au.field_106165_cl;
      int var10 = (var9 & 15) << 4;
      int var11 = var9 & 240;
      float var12 = (float)var10 / 256.0F;
      float var13 = ((float)var10 + 15.99F) / 256.0F;
      float var14 = (float)var11 / 256.0F;
      float var15 = ((float)var11 + 15.99F) / 256.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var16 = var1.field_103182_N * 1.4F;
      GL11.glScalef(var16, var16, var16);
      this.func_105351_a("/terrain.png");
      C_100872_azb var17 = C_100872_azb.field_110346_a;
      float var18 = 0.5F;
      float var19 = 0.0F;
      float var20 = var1.field_103183_O / var16;
      float var21 = (float)(var1.field_103219_u - var1.field_103173_D.field_107915_b);
      GL11.glRotatef(-this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, -0.3F + (float)((int)var20) * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var22 = 0.0F;
      int var23 = 0;
      var17.func_110330_b();

      while(var20 > 0.0F) {
         if(var23 % 2 == 0) {
            var12 = (float)var10 / 256.0F;
            var13 = ((float)var10 + 15.99F) / 256.0F;
            var14 = (float)var11 / 256.0F;
            var15 = ((float)var11 + 15.99F) / 256.0F;
         } else {
            var12 = (float)var10 / 256.0F;
            var13 = ((float)var10 + 15.99F) / 256.0F;
            var14 = (float)(var11 + 16) / 256.0F;
            var15 = ((float)(var11 + 16) + 15.99F) / 256.0F;
         }

         if(var23 / 2 % 2 == 0) {
            float var24 = var13;
            var13 = var12;
            var12 = var24;
         }

         var17.func_110322_a((double)(var18 - var19), (double)(0.0F - var21), (double)var22, (double)var13, (double)var15);
         var17.func_110322_a((double)(-var18 - var19), (double)(0.0F - var21), (double)var22, (double)var12, (double)var15);
         var17.func_110322_a((double)(-var18 - var19), (double)(1.4F - var21), (double)var22, (double)var12, (double)var14);
         var17.func_110322_a((double)(var18 - var19), (double)(1.4F - var21), (double)var22, (double)var13, (double)var14);
         var20 -= 0.45F;
         var21 -= 0.45F;
         var18 *= 0.9F;
         var22 += 0.03F;
         ++var23;
      }

      var17.func_110329_a();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void func_105348_c(C_100730_lb var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      C_100874_azc var10 = this.field_105357_b.field_110180_e;
      var10.func_110368_b(var10.func_110367_b("%clamp%/misc/shadow.png"));
      C_100873_xe var11 = this.func_105345_b();
      GL11.glDepthMask(false);
      float var12 = this.field_105355_d;
      if(var1 instanceof C_100595_ln) {
         C_100595_ln var13 = (C_100595_ln)var1;
         var12 *= var13.func_103309_bq();
         if(var13.func_103357_h_()) {
            var12 *= 0.5F;
         }
      }

      double var36 = var1.field_103189_T + (var1.field_103221_t - var1.field_103189_T) * (double)var9;
      double var15 = var1.field_103188_U + (var1.field_103219_u - var1.field_103188_U) * (double)var9 + (double)var1.func_103109_R();
      double var17 = var1.field_103191_V + (var1.field_103217_v - var1.field_103191_V) * (double)var9;
      int var19 = C_100650_jv.func_108910_c(var36 - (double)var12);
      int var20 = C_100650_jv.func_108910_c(var36 + (double)var12);
      int var21 = C_100650_jv.func_108910_c(var15 - (double)var12);
      int var22 = C_100650_jv.func_108910_c(var15);
      int var23 = C_100650_jv.func_108910_c(var17 - (double)var12);
      int var24 = C_100650_jv.func_108910_c(var17 + (double)var12);
      double var25 = var2 - var36;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      C_100872_azb var31 = C_100872_azb.field_110346_a;
      var31.func_110330_b();

      for(int var32 = var19; var32 <= var20; ++var32) {
         for(int var33 = var21; var33 <= var22; ++var33) {
            for(int var34 = var23; var34 <= var24; ++var34) {
               int var35 = var11.func_109349_a(var32, var33 - 1, var34);
               if(var35 > 0 && var11.func_109523_l(var32, var33, var34) > 3) {
                  this.func_105353_a(C_100451_alf.field_106118_p[var35], var2, var4 + (double)var1.func_103109_R(), var6, var32, var33, var34, var8, var12, var25, var27 + (double)var1.func_103109_R(), var29);
               }
            }
         }
      }

      var31.func_110329_a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private C_100873_xe func_105345_b() {
      return this.field_105357_b.field_110178_g;
   }

   private void func_105353_a(C_100451_alf var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17) {
      C_100872_azb var19 = C_100872_azb.field_110346_a;
      if(var1.func_105977_b()) {
         double var20 = ((double)var11 - (var4 - ((double)var9 + var15)) / 2.0D) * 0.5D * (double)this.func_105345_b().func_109354_o(var8, var9, var10);
         if(var20 >= 0.0D) {
            if(var20 > 1.0D) {
               var20 = 1.0D;
            }

            var19.func_110317_a(1.0F, 1.0F, 1.0F, (float)var20);
            double var22 = (double)var8 + var1.func_106062_v() + var13;
            double var24 = (double)var8 + var1.func_106027_w() + var13;
            double var26 = (double)var9 + var1.func_106032_x() + var15 + 0.015625D;
            double var28 = (double)var10 + var1.func_105995_z() + var17;
            double var30 = (double)var10 + var1.func_106002_A() + var17;
            float var32 = (float)((var2 - var22) / 2.0D / (double)var12 + 0.5D);
            float var33 = (float)((var2 - var24) / 2.0D / (double)var12 + 0.5D);
            float var34 = (float)((var6 - var28) / 2.0D / (double)var12 + 0.5D);
            float var35 = (float)((var6 - var30) / 2.0D / (double)var12 + 0.5D);
            var19.func_110322_a(var22, var26, var28, (double)var32, (double)var34);
            var19.func_110322_a(var22, var26, var30, (double)var32, (double)var35);
            var19.func_110322_a(var24, var26, var30, (double)var33, (double)var35);
            var19.func_110322_a(var24, var26, var28, (double)var33, (double)var34);
         }
      }
   }

   public static void func_105354_a(C_100412_amr var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      C_100872_azb var7 = C_100872_azb.field_110346_a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.func_110330_b();
      var7.func_110321_b(var1, var3, var5);
      var7.func_110323_b(0.0F, 0.0F, -1.0F);
      var7.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107916_c);
      var7.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107916_c);
      var7.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107916_c);
      var7.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107916_c);
      var7.func_110323_b(0.0F, 0.0F, 1.0F);
      var7.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107911_f);
      var7.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107911_f);
      var7.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107911_f);
      var7.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107911_f);
      var7.func_110323_b(0.0F, -1.0F, 0.0F);
      var7.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107916_c);
      var7.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107916_c);
      var7.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107911_f);
      var7.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107911_f);
      var7.func_110323_b(0.0F, 1.0F, 0.0F);
      var7.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107911_f);
      var7.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107911_f);
      var7.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107916_c);
      var7.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107916_c);
      var7.func_110323_b(-1.0F, 0.0F, 0.0F);
      var7.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107911_f);
      var7.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107911_f);
      var7.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107916_c);
      var7.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107916_c);
      var7.func_110323_b(1.0F, 0.0F, 0.0F);
      var7.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107916_c);
      var7.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107916_c);
      var7.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107911_f);
      var7.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107911_f);
      var7.func_110321_b(0.0D, 0.0D, 0.0D);
      var7.func_110329_a();
      GL11.glEnable(3553);
   }

   public static void func_105343_a(C_100412_amr var0) {
      C_100872_azb var1 = C_100872_azb.field_110346_a;
      var1.func_110330_b();
      var1.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107916_c);
      var1.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107916_c);
      var1.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107911_f);
      var1.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107911_f);
      var1.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107911_f);
      var1.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107911_f);
      var1.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107911_f);
      var1.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107911_f);
      var1.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107911_f);
      var1.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107911_f);
      var1.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107916_c);
      var1.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107916_c);
      var1.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107911_f);
      var1.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107911_f);
      var1.func_110325_a(var0.field_107917_a, var0.field_107914_e, var0.field_107916_c);
      var1.func_110325_a(var0.field_107917_a, var0.field_107915_b, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107916_c);
      var1.func_110325_a(var0.field_107913_d, var0.field_107914_e, var0.field_107911_f);
      var1.func_110325_a(var0.field_107913_d, var0.field_107915_b, var0.field_107911_f);
      var1.func_110329_a();
   }

   public void func_105344_a(C_100848_azw var1) {
      this.field_105357_b = var1;
   }

   public void func_105346_b(C_100730_lb var1, double var2, double var4, double var6, float var8, float var9) {
      if(this.field_105357_b.field_110189_k.field_111726_j && this.field_105355_d > 0.0F && !var1.func_103164_aj()) {
         double var10 = this.field_105357_b.func_110171_a(var1.field_103221_t, var1.field_103219_u, var1.field_103217_v);
         float var12 = (float)((1.0D - var10 / 256.0D) * (double)this.field_105356_e);
         if(var12 > 0.0F) {
            this.func_105348_c(var1, var2, var4, var6, var12, var9);
         }
      }

      if(var1.func_103149_af()) {
         this.func_105347_a(var1, var2, var4, var6, var9);
      }

   }

   public C_101153_asb func_105352_a() {
      return this.field_105357_b.func_110175_a();
   }
}
