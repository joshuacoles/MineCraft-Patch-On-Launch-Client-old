import java.util.Random;
import org.lwjgl.opengl.GL11;

public class C_100844_azu extends C_100056_bal {

   private static int field_105485_f = 0;
   protected C_101261_awi field_105486_a;


   public C_100844_azu() {
      super(new C_101261_awi(0.0F), 0.5F);
      this.field_105486_a = (C_101261_awi)this.field_105380_i;
      this.func_105363_a(this.field_105380_i);
   }

   protected void func_105482_a(C_100568_oy var1, float var2, float var3, float var4) {
      float var5 = (float)var1.func_103652_a(7, var4)[0];
      float var6 = (float)(var1.func_103652_a(5, var4)[1] - var1.func_103652_a(10, var4)[1]);
      GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var6 * 10.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 1.0F);
      if(var1.field_103433_aX > 0) {
         float var7 = ((float)var1.field_103433_aX + var4 - 1.0F) / 20.0F * 1.6F;
         var7 = C_100650_jv.func_108913_c(var7);
         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         GL11.glRotatef(var7 * this.func_105376_a(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected void func_105481_a(C_100568_oy var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if(var1.field_103666_bR > 0) {
         float var8 = (float)var1.field_103666_bR / 200.0F;
         GL11.glDepthFunc(515);
         GL11.glEnable(3008);
         GL11.glAlphaFunc(516, var8);
         this.func_105349_a(var1.field_103172_cw, "/mob/enderdragon/shuffle.png");
         this.field_105380_i.func_112027_a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glAlphaFunc(516, 0.1F);
         GL11.glDepthFunc(514);
      }

      this.func_105349_a(var1.field_103172_cw, var1.func_103129_O());
      this.field_105380_i.func_112027_a(var1, var2, var3, var4, var5, var6, var7);
      if(var1.field_103432_aU > 0) {
         GL11.glDepthFunc(514);
         GL11.glDisable(3553);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
         this.field_105380_i.func_112027_a(var1, var2, var3, var4, var5, var6, var7);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDepthFunc(515);
      }

   }

   public void func_105480_a(C_100568_oy var1, double var2, double var4, double var6, float var8, float var9) {
      C_100962_ayo.func_111153_a(var1, false);
      if(field_105485_f != 4) {
         this.field_105380_i = new C_101261_awi(0.0F);
         field_105485_f = 4;
      }

      super.func_105378_a(var1, var2, var4, var6, var8, var9);
      if(var1.field_103665_bS != null) {
         float var10 = (float)var1.field_103665_bS.field_103242_a + var9;
         float var11 = C_100650_jv.func_108924_a(var10 * 0.2F) / 2.0F + 0.5F;
         var11 = (var11 * var11 + var11) * 0.2F;
         float var12 = (float)(var1.field_103665_bS.field_103221_t - var1.field_103221_t - (var1.field_103227_q - var1.field_103221_t) * (double)(1.0F - var9));
         float var13 = (float)((double)var11 + var1.field_103665_bS.field_103219_u - 1.0D - var1.field_103219_u - (var1.field_103225_r - var1.field_103219_u) * (double)(1.0F - var9));
         float var14 = (float)(var1.field_103665_bS.field_103217_v - var1.field_103217_v - (var1.field_103223_s - var1.field_103217_v) * (double)(1.0F - var9));
         float var15 = C_100650_jv.func_108913_c(var12 * var12 + var14 * var14);
         float var16 = C_100650_jv.func_108913_c(var12 * var12 + var13 * var13 + var14 * var14);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4 + 2.0F, (float)var6);
         GL11.glRotatef((float)(-Math.atan2((double)var14, (double)var12)) * 180.0F / 3.1415927F - 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)(-Math.atan2((double)var15, (double)var13)) * 180.0F / 3.1415927F - 90.0F, 1.0F, 0.0F, 0.0F);
         C_100872_azb var17 = C_100872_azb.field_110346_a;
         C_101210_aqj.func_112010_a();
         GL11.glDisable(2884);
         this.func_105351_a("/mob/enderdragon/beam.png");
         GL11.glShadeModel(7425);
         float var18 = 0.0F - ((float)var1.field_103233_ab + var9) * 0.01F;
         float var19 = C_100650_jv.func_108913_c(var12 * var12 + var13 * var13 + var14 * var14) / 32.0F - ((float)var1.field_103233_ab + var9) * 0.01F;
         var17.func_110319_b(5);
         byte var20 = 8;

         for(int var21 = 0; var21 <= var20; ++var21) {
            float var22 = C_100650_jv.func_108924_a((float)(var21 % var20) * 3.1415927F * 2.0F / (float)var20) * 0.75F;
            float var23 = C_100650_jv.func_108928_b((float)(var21 % var20) * 3.1415927F * 2.0F / (float)var20) * 0.75F;
            float var24 = (float)(var21 % var20) * 1.0F / (float)var20;
            var17.func_110326_d(0);
            var17.func_110322_a((double)(var22 * 0.2F), (double)(var23 * 0.2F), 0.0D, (double)var24, (double)var19);
            var17.func_110326_d(16777215);
            var17.func_110322_a((double)var22, (double)var23, (double)var16, (double)var24, (double)var18);
         }

         var17.func_110329_a();
         GL11.glEnable(2884);
         GL11.glShadeModel(7424);
         C_101210_aqj.func_112011_b();
         GL11.glPopMatrix();
      }

   }

   protected void func_105484_a(C_100568_oy var1, float var2) {
      super.func_105372_c(var1, var2);
      C_100872_azb var3 = C_100872_azb.field_110346_a;
      if(var1.field_103666_bR > 0) {
         C_101210_aqj.func_112010_a();
         float var4 = ((float)var1.field_103666_bR + var2) / 200.0F;
         float var5 = 0.0F;
         if(var4 > 0.8F) {
            var5 = (var4 - 0.8F) / 0.2F;
         }

         Random var6 = new Random(432L);
         GL11.glDisable(3553);
         GL11.glShadeModel(7425);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 1);
         GL11.glDisable(3008);
         GL11.glEnable(2884);
         GL11.glDepthMask(false);
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -1.0F, -2.0F);

         for(int var7 = 0; (float)var7 < (var4 + var4 * var4) / 2.0F * 60.0F; ++var7) {
            GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var6.nextFloat() * 360.0F + var4 * 90.0F, 0.0F, 0.0F, 1.0F);
            var3.func_110319_b(6);
            float var8 = var6.nextFloat() * 20.0F + 5.0F + var5 * 10.0F;
            float var9 = var6.nextFloat() * 2.0F + 1.0F + var5 * 2.0F;
            var3.func_110332_a(16777215, (int)(255.0F * (1.0F - var5)));
            var3.func_110325_a(0.0D, 0.0D, 0.0D);
            var3.func_110332_a(16711935, 0);
            var3.func_110325_a(-0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.func_110325_a(0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.func_110325_a(0.0D, (double)var8, (double)(1.0F * var9));
            var3.func_110325_a(-0.866D * (double)var9, (double)var8, (double)(-0.5F * var9));
            var3.func_110329_a();
         }

         GL11.glPopMatrix();
         GL11.glDepthMask(true);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glShadeModel(7424);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
         C_101210_aqj.func_112011_b();
      }

   }

   protected int func_105483_a(C_100568_oy var1, int var2, float var3) {
      if(var2 == 1) {
         GL11.glDepthFunc(515);
      }

      if(var2 != 0) {
         return -1;
      } else {
         this.func_105351_a("/mob/enderdragon/ender_eyes.png");
         float var4 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         GL11.glDepthFunc(514);
         char var5 = '\uf0f0';
         int var6 = var5 % 65536;
         int var7 = var5 / 65536;
         C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var6 / 1.0F, (float)var7 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
         return 1;
      }
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105484_a((C_100568_oy)var1, var2);
   }

}
