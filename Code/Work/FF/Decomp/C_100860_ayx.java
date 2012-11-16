import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100860_ayx {

   private Minecraft field_110260_b;
   private C_100994_tv field_110261_c = null;
   private float field_110258_d = 0.0F;
   private float field_110259_e = 0.0F;
   private C_100876_azd field_110256_f = new C_100876_azd();
   public final C_101157_asn field_110262_a;
   private int field_110257_g = -1;


   public C_100860_ayx(Minecraft var1) {
      this.field_110260_b = var1;
      this.field_110262_a = new C_101157_asn(var1.field_105148_p, var1.field_105156_y, var1.field_105127_o);
   }

   public void func_110254_a(C_100595_ln var1, C_100994_tv var2, int var3) {
      GL11.glPushMatrix();
      C_100451_alf var4 = C_100451_alf.field_106118_p[var2.field_111397_c];
      if(var4 != null && C_100876_azd.func_110435_b(var4.func_106013_d())) {
         GL11.glBindTexture(3553, this.field_110260_b.field_105127_o.func_110367_b("/terrain.png"));
         this.field_110256_f.func_110400_a(var4, var2.func_111367_j(), 1.0F);
      } else {
         if(var4 != null) {
            GL11.glBindTexture(3553, this.field_110260_b.field_105127_o.func_110367_b("/terrain.png"));
         } else {
            GL11.glBindTexture(3553, this.field_110260_b.field_105127_o.func_110367_b("/gui/items.png"));
         }

         C_100872_azb var5 = C_100872_azb.field_110346_a;
         int var6 = var1.func_103324_b(var2, var3);
         float var7 = ((float)(var6 % 16 * 16) + 0.0F) / 256.0F;
         float var8 = ((float)(var6 % 16 * 16) + 15.99F) / 256.0F;
         float var9 = ((float)(var6 / 16 * 16) + 0.0F) / 256.0F;
         float var10 = ((float)(var6 / 16 * 16) + 15.99F) / 256.0F;
         float var11 = 0.0F;
         float var12 = 0.3F;
         GL11.glEnable('\u803a');
         GL11.glTranslatef(-var11, -var12, 0.0F);
         float var13 = 1.5F;
         GL11.glScalef(var13, var13, var13);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         this.func_110246_a(var5, var8, var9, var7, var10);
         if(var2 != null && var2.func_111356_t() && var3 == 0) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            this.field_110260_b.field_105127_o.func_110368_b(this.field_110260_b.field_105127_o.func_110367_b("%blur%/misc/glint.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            float var14 = 0.76F;
            GL11.glColor4f(0.5F * var14, 0.25F * var14, 0.8F * var14, 1.0F);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            float var15 = 0.125F;
            GL11.glScalef(var15, var15, var15);
            float var16 = (float)(Minecraft.func_105063_F() % 3000L) / 3000.0F * 8.0F;
            GL11.glTranslatef(var16, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            this.func_110246_a(var5, 0.0F, 0.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(var15, var15, var15);
            var16 = (float)(Minecraft.func_105063_F() % 4873L) / 4873.0F * 8.0F;
            GL11.glTranslatef(-var16, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
            this.func_110246_a(var5, 0.0F, 0.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

         GL11.glDisable('\u803a');
      }

      GL11.glPopMatrix();
   }

   private void func_110246_a(C_100872_azb var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F;
      float var7 = 0.0625F;
      var1.func_110330_b();
      var1.func_110323_b(0.0F, 0.0F, 1.0F);
      var1.func_110322_a(0.0D, 0.0D, 0.0D, (double)var2, (double)var5);
      var1.func_110322_a((double)var6, 0.0D, 0.0D, (double)var4, (double)var5);
      var1.func_110322_a((double)var6, 1.0D, 0.0D, (double)var4, (double)var3);
      var1.func_110322_a(0.0D, 1.0D, 0.0D, (double)var2, (double)var3);
      var1.func_110329_a();
      var1.func_110330_b();
      var1.func_110323_b(0.0F, 0.0F, -1.0F);
      var1.func_110322_a(0.0D, 1.0D, (double)(0.0F - var7), (double)var2, (double)var3);
      var1.func_110322_a((double)var6, 1.0D, (double)(0.0F - var7), (double)var4, (double)var3);
      var1.func_110322_a((double)var6, 0.0D, (double)(0.0F - var7), (double)var4, (double)var5);
      var1.func_110322_a(0.0D, 0.0D, (double)(0.0F - var7), (double)var2, (double)var5);
      var1.func_110329_a();
      var1.func_110330_b();
      var1.func_110323_b(-1.0F, 0.0F, 0.0F);

      int var8;
      float var9;
      float var10;
      float var11;
      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var2 + (var4 - var2) * var9 - 0.001953125F;
         var11 = var6 * var9;
         var1.func_110322_a((double)var11, 0.0D, (double)(0.0F - var7), (double)var10, (double)var5);
         var1.func_110322_a((double)var11, 0.0D, 0.0D, (double)var10, (double)var5);
         var1.func_110322_a((double)var11, 1.0D, 0.0D, (double)var10, (double)var3);
         var1.func_110322_a((double)var11, 1.0D, (double)(0.0F - var7), (double)var10, (double)var3);
      }

      var1.func_110329_a();
      var1.func_110330_b();
      var1.func_110323_b(1.0F, 0.0F, 0.0F);

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var2 + (var4 - var2) * var9 - 0.001953125F;
         var11 = var6 * var9 + 0.0625F;
         var1.func_110322_a((double)var11, 1.0D, (double)(0.0F - var7), (double)var10, (double)var3);
         var1.func_110322_a((double)var11, 1.0D, 0.0D, (double)var10, (double)var3);
         var1.func_110322_a((double)var11, 0.0D, 0.0D, (double)var10, (double)var5);
         var1.func_110322_a((double)var11, 0.0D, (double)(0.0F - var7), (double)var10, (double)var5);
      }

      var1.func_110329_a();
      var1.func_110330_b();
      var1.func_110323_b(0.0F, 1.0F, 0.0F);

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var5 + (var3 - var5) * var9 - 0.001953125F;
         var11 = var6 * var9 + 0.0625F;
         var1.func_110322_a(0.0D, (double)var11, 0.0D, (double)var2, (double)var10);
         var1.func_110322_a((double)var6, (double)var11, 0.0D, (double)var4, (double)var10);
         var1.func_110322_a((double)var6, (double)var11, (double)(0.0F - var7), (double)var4, (double)var10);
         var1.func_110322_a(0.0D, (double)var11, (double)(0.0F - var7), (double)var2, (double)var10);
      }

      var1.func_110329_a();
      var1.func_110330_b();
      var1.func_110323_b(0.0F, -1.0F, 0.0F);

      for(var8 = 0; var8 < 16; ++var8) {
         var9 = (float)var8 / 16.0F;
         var10 = var5 + (var3 - var5) * var9 - 0.001953125F;
         var11 = var6 * var9;
         var1.func_110322_a((double)var6, (double)var11, 0.0D, (double)var4, (double)var10);
         var1.func_110322_a(0.0D, (double)var11, 0.0D, (double)var2, (double)var10);
         var1.func_110322_a(0.0D, (double)var11, (double)(0.0F - var7), (double)var2, (double)var10);
         var1.func_110322_a((double)var6, (double)var11, (double)(0.0F - var7), (double)var4, (double)var10);
      }

      var1.func_110329_a();
   }

   public void func_110247_a(float var1) {
      float var2 = this.field_110259_e + (this.field_110258_d - this.field_110259_e) * var1;
      C_100950_axc var3 = this.field_110260_b.field_105120_g;
      float var4 = var3.field_103179_C + (var3.field_103177_A - var3.field_103179_C) * var1;
      GL11.glPushMatrix();
      GL11.glRotatef(var4, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.field_103178_B + (var3.field_103236_z - var3.field_103178_B) * var1, 0.0F, 1.0F, 0.0F);
      C_101210_aqj.func_112011_b();
      GL11.glPopMatrix();
      float var6;
      float var7;
      if(var3 instanceof C_100966_aym) {
         C_100966_aym var5 = (C_100966_aym)var3;
         var6 = var5.field_104551_i + (var5.field_104544_g - var5.field_104551_i) * var1;
         var7 = var5.field_104550_h + (var5.field_104543_f - var5.field_104550_h) * var1;
         GL11.glRotatef((var3.field_103177_A - var6) * 0.1F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef((var3.field_103236_z - var7) * 0.1F, 0.0F, 1.0F, 0.0F);
      }

      C_100994_tv var17 = this.field_110261_c;
      var6 = this.field_110260_b.field_105122_e.func_109354_o(C_100650_jv.func_108910_c(var3.field_103221_t), C_100650_jv.func_108910_c(var3.field_103219_u), C_100650_jv.func_108910_c(var3.field_103217_v));
      var6 = 1.0F;
      int var18 = this.field_110260_b.field_105122_e.func_109355_i(C_100650_jv.func_108910_c(var3.field_103221_t), C_100650_jv.func_108910_c(var3.field_103219_u), C_100650_jv.func_108910_c(var3.field_103217_v), 0);
      int var8 = var18 % 65536;
      int var9 = var18 / 65536;
      C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var8 / 1.0F, (float)var9 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var10;
      float var21;
      float var20;
      if(var17 != null) {
         var18 = C_100992_tt.field_110834_e[var17.field_111397_c].func_110774_a(var17, 0);
         var20 = (float)(var18 >> 16 & 255) / 255.0F;
         var21 = (float)(var18 >> 8 & 255) / 255.0F;
         var10 = (float)(var18 & 255) / 255.0F;
         GL11.glColor4f(var6 * var20, var6 * var21, var6 * var10, 1.0F);
      } else {
         GL11.glColor4f(var6, var6, var6, 1.0F);
      }

      float var11;
      float var12;
      float var13;
      C_100846_azx var24;
      C_100076_baq var26;
      if(var17 != null && var17.field_111397_c == C_100992_tt.field_110882_bd.field_110891_cf) {
         GL11.glPushMatrix();
         var7 = 0.8F;
         var20 = var3.func_103381_g(var1);
         var21 = C_100650_jv.func_108924_a(var20 * 3.1415927F);
         var10 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F);
         GL11.glTranslatef(-var10 * 0.4F, C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F * 2.0F) * 0.2F, -var21 * 0.2F);
         var20 = 1.0F - var4 / 45.0F + 0.1F;
         if(var20 < 0.0F) {
            var20 = 0.0F;
         }

         if(var20 > 1.0F) {
            var20 = 1.0F;
         }

         var20 = -C_100650_jv.func_108928_b(var20 * 3.1415927F) * 0.5F + 0.5F;
         GL11.glTranslatef(0.0F, 0.0F * var7 - (1.0F - var2) * 1.2F - var20 * 0.5F + 0.04F, -0.9F * var7);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var20 * -85.0F, 0.0F, 0.0F, 1.0F);
         GL11.glEnable('\u803a');
         GL11.glBindTexture(3553, this.field_110260_b.field_105127_o.func_110378_a(this.field_110260_b.field_105120_g.field_103172_cw, this.field_110260_b.field_105120_g.func_103129_O()));

         for(var9 = 0; var9 < 2; ++var9) {
            int var22 = var9 * 2 - 1;
            GL11.glPushMatrix();
            GL11.glTranslatef(-0.0F, -0.6F, 1.1F * (float)var22);
            GL11.glRotatef((float)(-45 * var22), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef((float)(-65 * var22), 0.0F, 1.0F, 0.0F);
            var24 = C_100848_azw.field_110183_a.func_110172_a(this.field_110260_b.field_105120_g);
            var26 = (C_100076_baq)var24;
            var13 = 1.0F;
            GL11.glScalef(var13, var13, var13);
            var26.func_105455_a(this.field_110260_b.field_105120_g);
            GL11.glPopMatrix();
         }

         var21 = var3.func_103381_g(var1);
         var10 = C_100650_jv.func_108924_a(var21 * var21 * 3.1415927F);
         var11 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var21) * 3.1415927F);
         GL11.glRotatef(-var10 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var11 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var11 * 80.0F, 1.0F, 0.0F, 0.0F);
         var12 = 0.38F;
         GL11.glScalef(var12, var12, var12);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
         var13 = 0.015625F;
         GL11.glScalef(var13, var13, var13);
         this.field_110260_b.field_105127_o.func_110368_b(this.field_110260_b.field_105127_o.func_110367_b("/misc/mapbg.png"));
         C_100872_azb var28 = C_100872_azb.field_110346_a;
         GL11.glNormal3f(0.0F, 0.0F, -1.0F);
         var28.func_110330_b();
         byte var27 = 7;
         var28.func_110322_a((double)(0 - var27), (double)(128 + var27), 0.0D, 0.0D, 1.0D);
         var28.func_110322_a((double)(128 + var27), (double)(128 + var27), 0.0D, 1.0D, 1.0D);
         var28.func_110322_a((double)(128 + var27), (double)(0 - var27), 0.0D, 1.0D, 0.0D);
         var28.func_110322_a((double)(0 - var27), (double)(0 - var27), 0.0D, 0.0D, 0.0D);
         var28.func_110329_a();
         C_100282_agl var16 = C_100992_tt.field_110882_bd.func_111042_a(var17, this.field_110260_b.field_105122_e);
         if(var16 != null) {
            this.field_110262_a.func_111840_a(this.field_110260_b.field_105120_g, this.field_110260_b.field_105127_o, var16);
         }

         GL11.glPopMatrix();
      } else if(var17 != null) {
         GL11.glPushMatrix();
         var7 = 0.8F;
         if(var3.func_103803_bH() > 0) {
            C_100943_uw var19 = var17.func_111348_n();
            if(var19 == C_100943_uw.field_111099_b || var19 == C_100943_uw.field_111100_c) {
               var21 = (float)var3.func_103803_bH() - var1 + 1.0F;
               var10 = 1.0F - var21 / (float)var17.func_111391_m();
               var11 = 1.0F - var10;
               var11 = var11 * var11 * var11;
               var11 = var11 * var11 * var11;
               var11 = var11 * var11 * var11;
               var12 = 1.0F - var11;
               GL11.glTranslatef(0.0F, C_100650_jv.func_108927_e(C_100650_jv.func_108928_b(var21 / 4.0F * 3.1415927F) * 0.1F) * (float)((double)var10 > 0.2D?1:0), 0.0F);
               GL11.glTranslatef(var12 * 0.6F, -var12 * 0.5F, 0.0F);
               GL11.glRotatef(var12 * 90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(var12 * 10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(var12 * 30.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            var20 = var3.func_103381_g(var1);
            var21 = C_100650_jv.func_108924_a(var20 * 3.1415927F);
            var10 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F);
            GL11.glTranslatef(-var10 * 0.4F, C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F * 2.0F) * 0.2F, -var21 * 0.2F);
         }

         GL11.glTranslatef(0.7F * var7, -0.65F * var7 - (1.0F - var2) * 0.6F, -0.9F * var7);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var20 = var3.func_103381_g(var1);
         var21 = C_100650_jv.func_108924_a(var20 * var20 * 3.1415927F);
         var10 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F);
         GL11.glRotatef(-var21 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var10 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var10 * 80.0F, 1.0F, 0.0F, 0.0F);
         var11 = 0.4F;
         GL11.glScalef(var11, var11, var11);
         float var14;
         float var15;
         if(var3.func_103803_bH() > 0) {
            C_100943_uw var23 = var17.func_111348_n();
            if(var23 == C_100943_uw.field_111097_d) {
               GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
               GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
            } else if(var23 == C_100943_uw.field_111098_e) {
               GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
               GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
               var13 = (float)var17.func_111391_m() - ((float)var3.func_103803_bH() - var1 + 1.0F);
               var14 = var13 / 20.0F;
               var14 = (var14 * var14 + var14 * 2.0F) / 3.0F;
               if(var14 > 1.0F) {
                  var14 = 1.0F;
               }

               if(var14 > 0.1F) {
                  GL11.glTranslatef(0.0F, C_100650_jv.func_108924_a((var13 - 0.1F) * 1.3F) * 0.01F * (var14 - 0.1F), 0.0F);
               }

               GL11.glTranslatef(0.0F, 0.0F, var14 * 0.1F);
               GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glTranslatef(0.0F, 0.5F, 0.0F);
               var15 = 1.0F + var14 * 0.2F;
               GL11.glScalef(1.0F, 1.0F, var15);
               GL11.glTranslatef(0.0F, -0.5F, 0.0F);
               GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         if(var17.func_111365_b().func_110797_o_()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var17.func_111365_b().func_110758_b()) {
            this.func_110254_a(var3, var17, 0);
            int var25 = C_100992_tt.field_110834_e[var17.field_111397_c].func_110774_a(var17, 1);
            var13 = (float)(var25 >> 16 & 255) / 255.0F;
            var14 = (float)(var25 >> 8 & 255) / 255.0F;
            var15 = (float)(var25 & 255) / 255.0F;
            GL11.glColor4f(var6 * var13, var6 * var14, var6 * var15, 1.0F);
            this.func_110254_a(var3, var17, 1);
         } else {
            this.func_110254_a(var3, var17, 0);
         }

         GL11.glPopMatrix();
      } else if(!var3.func_103164_aj()) {
         GL11.glPushMatrix();
         var7 = 0.8F;
         var20 = var3.func_103381_g(var1);
         var21 = C_100650_jv.func_108924_a(var20 * 3.1415927F);
         var10 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F);
         GL11.glTranslatef(-var10 * 0.3F, C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F * 2.0F) * 0.4F, -var21 * 0.4F);
         GL11.glTranslatef(0.8F * var7, -0.75F * var7 - (1.0F - var2) * 0.6F, -0.9F * var7);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var20 = var3.func_103381_g(var1);
         var21 = C_100650_jv.func_108924_a(var20 * var20 * 3.1415927F);
         var10 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F);
         GL11.glRotatef(var10 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var21 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.field_110260_b.field_105127_o.func_110378_a(this.field_110260_b.field_105120_g.field_103172_cw, this.field_110260_b.field_105120_g.func_103129_O()));
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         var24 = C_100848_azw.field_110183_a.func_110172_a(this.field_110260_b.field_105120_g);
         var26 = (C_100076_baq)var24;
         var13 = 1.0F;
         GL11.glScalef(var13, var13, var13);
         var26.func_105455_a(this.field_110260_b.field_105120_g);
         GL11.glPopMatrix();
      }

      GL11.glDisable('\u803a');
      C_101210_aqj.func_112010_a();
   }

   public void func_110253_b(float var1) {
      GL11.glDisable(3008);
      int var2;
      if(this.field_110260_b.field_105120_g.func_103149_af()) {
         var2 = this.field_110260_b.field_105127_o.func_110367_b("/terrain.png");
         GL11.glBindTexture(3553, var2);
         this.func_110249_d(var1);
      }

      if(this.field_110260_b.field_105120_g.func_103150_T()) {
         var2 = C_100650_jv.func_108910_c(this.field_110260_b.field_105120_g.field_103221_t);
         int var3 = C_100650_jv.func_108910_c(this.field_110260_b.field_105120_g.field_103219_u);
         int var4 = C_100650_jv.func_108910_c(this.field_110260_b.field_105120_g.field_103217_v);
         int var5 = this.field_110260_b.field_105127_o.func_110367_b("/terrain.png");
         GL11.glBindTexture(3553, var5);
         int var6 = this.field_110260_b.field_105122_e.func_109349_a(var2, var3, var4);
         if(this.field_110260_b.field_105122_e.func_109360_s(var2, var3, var4)) {
            this.func_110252_a(var1, C_100451_alf.field_106118_p[var6].func_106024_a(2));
         } else {
            for(int var7 = 0; var7 < 8; ++var7) {
               float var8 = ((float)((var7 >> 0) % 2) - 0.5F) * this.field_110260_b.field_105120_g.field_103182_N * 0.9F;
               float var9 = ((float)((var7 >> 1) % 2) - 0.5F) * this.field_110260_b.field_105120_g.field_103183_O * 0.2F;
               float var10 = ((float)((var7 >> 2) % 2) - 0.5F) * this.field_110260_b.field_105120_g.field_103182_N * 0.9F;
               int var11 = C_100650_jv.func_108933_d((float)var2 + var8);
               int var12 = C_100650_jv.func_108933_d((float)var3 + var9);
               int var13 = C_100650_jv.func_108933_d((float)var4 + var10);
               if(this.field_110260_b.field_105122_e.func_109360_s(var11, var12, var13)) {
                  var6 = this.field_110260_b.field_105122_e.func_109349_a(var11, var12, var13);
               }
            }
         }

         if(C_100451_alf.field_106118_p[var6] != null) {
            this.func_110252_a(var1, C_100451_alf.field_106118_p[var6].func_106024_a(2));
         }
      }

      if(this.field_110260_b.field_105120_g.func_103132_a(C_100664_afg.field_109019_h)) {
         var2 = this.field_110260_b.field_105127_o.func_110367_b("/misc/water.png");
         GL11.glBindTexture(3553, var2);
         this.func_110255_c(var1);
      }

      GL11.glEnable(3008);
   }

   private void func_110252_a(float var1, int var2) {
      C_100872_azb var3 = C_100872_azb.field_110346_a;
      this.field_110260_b.field_105120_g.func_103057_c(var1);
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = (float)(var2 % 16) / 256.0F - var10;
      float var12 = ((float)(var2 % 16) + 15.99F) / 256.0F + var10;
      float var13 = (float)(var2 / 16) / 256.0F - var10;
      float var14 = ((float)(var2 / 16) + 15.99F) / 256.0F + var10;
      var3.func_110330_b();
      var3.func_110322_a((double)var5, (double)var7, (double)var9, (double)var12, (double)var14);
      var3.func_110322_a((double)var6, (double)var7, (double)var9, (double)var11, (double)var14);
      var3.func_110322_a((double)var6, (double)var8, (double)var9, (double)var11, (double)var13);
      var3.func_110322_a((double)var5, (double)var8, (double)var9, (double)var12, (double)var13);
      var3.func_110329_a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void func_110255_c(float var1) {
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      float var3 = this.field_110260_b.field_105120_g.func_103057_c(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.field_110260_b.field_105120_g.field_103236_z / 64.0F;
      float var11 = this.field_110260_b.field_105120_g.field_103177_A / 64.0F;
      var2.func_110330_b();
      var2.func_110322_a((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.func_110322_a((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.func_110322_a((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.func_110322_a((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.func_110329_a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void func_110249_d(float var1) {
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for(int var4 = 0; var4 < 2; ++var4) {
         GL11.glPushMatrix();
         int var5 = C_100451_alf.field_106222_au.field_106165_cl + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 240;
         float var8 = (float)var6 / 256.0F;
         float var9 = ((float)var6 + 15.99F) / 256.0F;
         float var10 = (float)var7 / 256.0F;
         float var11 = ((float)var7 + 15.99F) / 256.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef((float)(-(var4 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((float)(var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.func_110330_b();
         var2.func_110322_a((double)var12, (double)var14, (double)var16, (double)var9, (double)var11);
         var2.func_110322_a((double)var13, (double)var14, (double)var16, (double)var8, (double)var11);
         var2.func_110322_a((double)var13, (double)var15, (double)var16, (double)var8, (double)var10);
         var2.func_110322_a((double)var12, (double)var15, (double)var16, (double)var9, (double)var10);
         var2.func_110329_a();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void func_110248_a() {
      this.field_110259_e = this.field_110258_d;
      C_100950_axc var1 = this.field_110260_b.field_105120_g;
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      boolean var3 = this.field_110257_g == var1.field_103857_bK.field_104831_c && var2 == this.field_110261_c;
      if(this.field_110261_c == null && var2 == null) {
         var3 = true;
      }

      if(var2 != null && this.field_110261_c != null && var2 != this.field_110261_c && var2.field_111397_c == this.field_110261_c.field_111397_c && var2.func_111367_j() == this.field_110261_c.func_111367_j()) {
         this.field_110261_c = var2;
         var3 = true;
      }

      float var4 = 0.4F;
      float var5 = var3?1.0F:0.0F;
      float var6 = var5 - this.field_110258_d;
      if(var6 < -var4) {
         var6 = -var4;
      }

      if(var6 > var4) {
         var6 = var4;
      }

      this.field_110258_d += var6;
      if(this.field_110258_d < 0.1F) {
         this.field_110261_c = var2;
         this.field_110257_g = var1.field_103857_bK.field_104831_c;
      }

   }

   public void func_110250_b() {
      this.field_110258_d = 0.0F;
   }

   public void func_110251_c() {
      this.field_110258_d = 0.0F;
   }
}
