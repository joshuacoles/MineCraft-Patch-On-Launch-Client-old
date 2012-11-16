import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100066_bab extends C_100846_azx {

   public void func_105515_a(C_101090_ql var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glEnable('\u803a');
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      byte var10 = 1;
      byte var11 = 2;
      this.func_105351_a("/particles.png");
      C_100872_azb var12 = C_100872_azb.field_110346_a;
      float var13 = (float)(var10 * 8 + 0) / 128.0F;
      float var14 = (float)(var10 * 8 + 8) / 128.0F;
      float var15 = (float)(var11 * 8 + 0) / 128.0F;
      float var16 = (float)(var11 * 8 + 8) / 128.0F;
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.5F;
      GL11.glRotatef(180.0F - this.field_105357_b.field_110191_i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_105357_b.field_110188_j, 1.0F, 0.0F, 0.0F);
      var12.func_110330_b();
      var12.func_110323_b(0.0F, 1.0F, 0.0F);
      var12.func_110322_a((double)(0.0F - var18), (double)(0.0F - var19), 0.0D, (double)var13, (double)var16);
      var12.func_110322_a((double)(var17 - var18), (double)(0.0F - var19), 0.0D, (double)var14, (double)var16);
      var12.func_110322_a((double)(var17 - var18), (double)(1.0F - var19), 0.0D, (double)var14, (double)var15);
      var12.func_110322_a((double)(0.0F - var18), (double)(1.0F - var19), 0.0D, (double)var13, (double)var15);
      var12.func_110329_a();
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
      if(var1.field_104714_b != null) {
         float var20 = var1.field_104714_b.func_103381_g(var9);
         float var21 = C_100650_jv.func_108924_a(C_100650_jv.func_108913_c(var20) * 3.1415927F);
         C_100387_amw var22 = var1.field_103229_p.func_109363_R().func_107878_a(-0.5D, 0.03D, 0.8D);
         var22.func_107859_a(-(var1.field_104714_b.field_103179_C + (var1.field_104714_b.field_103177_A - var1.field_104714_b.field_103179_C) * var9) * 3.1415927F / 180.0F);
         var22.func_107863_b(-(var1.field_104714_b.field_103178_B + (var1.field_104714_b.field_103236_z - var1.field_104714_b.field_103178_B) * var9) * 3.1415927F / 180.0F);
         var22.func_107863_b(var21 * 0.5F);
         var22.func_107859_a(-var21 * 0.7F);
         double var23 = var1.field_104714_b.field_103227_q + (var1.field_104714_b.field_103221_t - var1.field_104714_b.field_103227_q) * (double)var9 + var22.field_107872_c;
         double var25 = var1.field_104714_b.field_103225_r + (var1.field_104714_b.field_103219_u - var1.field_104714_b.field_103225_r) * (double)var9 + var22.field_107869_d;
         double var27 = var1.field_104714_b.field_103223_s + (var1.field_104714_b.field_103217_v - var1.field_104714_b.field_103223_s) * (double)var9 + var22.field_107870_e;
         double var29 = var1.field_104714_b != Minecraft.func_105091_x().field_105120_g?(double)var1.field_104714_b.func_103102_e():0.0D;
         if(this.field_105357_b.field_110189_k.field_111710_S > 0 || var1.field_104714_b != Minecraft.func_105091_x().field_105120_g) {
            float var31 = (var1.field_104714_b.field_103467_ax + (var1.field_104714_b.field_103469_aw - var1.field_104714_b.field_103467_ax) * var9) * 3.1415927F / 180.0F;
            double var32 = (double)C_100650_jv.func_108924_a(var31);
            double var34 = (double)C_100650_jv.func_108928_b(var31);
            var23 = var1.field_104714_b.field_103227_q + (var1.field_104714_b.field_103221_t - var1.field_104714_b.field_103227_q) * (double)var9 - var34 * 0.35D - var32 * 0.85D;
            var25 = var1.field_104714_b.field_103225_r + var29 + (var1.field_104714_b.field_103219_u - var1.field_104714_b.field_103225_r) * (double)var9 - 0.45D;
            var27 = var1.field_104714_b.field_103223_s + (var1.field_104714_b.field_103217_v - var1.field_104714_b.field_103223_s) * (double)var9 - var32 * 0.35D + var34 * 0.85D;
         }

         double var46 = var1.field_103227_q + (var1.field_103221_t - var1.field_103227_q) * (double)var9;
         double var33 = var1.field_103225_r + (var1.field_103219_u - var1.field_103225_r) * (double)var9 + 0.25D;
         double var35 = var1.field_103223_s + (var1.field_103217_v - var1.field_103223_s) * (double)var9;
         double var37 = (double)((float)(var23 - var46));
         double var39 = (double)((float)(var25 - var33));
         double var41 = (double)((float)(var27 - var35));
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         var12.func_110319_b(3);
         var12.func_110326_d(0);
         byte var43 = 16;

         for(int var44 = 0; var44 <= var43; ++var44) {
            float var45 = (float)var44 / (float)var43;
            var12.func_110325_a(var2 + var37 * (double)var45, var4 + var39 * (double)(var45 * var45 + var45) * 0.5D + 0.25D, var6 + var41 * (double)var45);
         }

         var12.func_110329_a();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
      }

   }
}
