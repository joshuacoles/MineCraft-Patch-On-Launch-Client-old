import org.lwjgl.opengl.GL11;

public class C_100078_bao extends C_100846_azx {

   public void func_105518_a(C_100600_lq var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
      GL11.glEnable('\u803a');
      this.func_105351_a("/art/kz.png");
      C_100599_lr var10 = var1.field_104587_e;
      float var11 = 0.0625F;
      GL11.glScalef(var11, var11, var11);
      this.func_105520_a(var1, var10.field_108789_C, var10.field_108783_D, var10.field_108784_E, var10.field_108785_F);
      GL11.glDisable('\u803a');
      GL11.glPopMatrix();
   }

   private void func_105520_a(C_100600_lq var1, int var2, int var3, int var4, int var5) {
      float var6 = (float)(-var2) / 2.0F;
      float var7 = (float)(-var3) / 2.0F;
      float var8 = 0.5F;
      float var9 = 0.75F;
      float var10 = 0.8125F;
      float var11 = 0.0F;
      float var12 = 0.0625F;
      float var13 = 0.75F;
      float var14 = 0.8125F;
      float var15 = 0.001953125F;
      float var16 = 0.001953125F;
      float var17 = 0.7519531F;
      float var18 = 0.7519531F;
      float var19 = 0.0F;
      float var20 = 0.0625F;

      for(int var21 = 0; var21 < var2 / 16; ++var21) {
         for(int var22 = 0; var22 < var3 / 16; ++var22) {
            float var23 = var6 + (float)((var21 + 1) * 16);
            float var24 = var6 + (float)(var21 * 16);
            float var25 = var7 + (float)((var22 + 1) * 16);
            float var26 = var7 + (float)(var22 * 16);
            this.func_105519_a(var1, (var23 + var24) / 2.0F, (var25 + var26) / 2.0F);
            float var27 = (float)(var4 + var2 - var21 * 16) / 256.0F;
            float var28 = (float)(var4 + var2 - (var21 + 1) * 16) / 256.0F;
            float var29 = (float)(var5 + var3 - var22 * 16) / 256.0F;
            float var30 = (float)(var5 + var3 - (var22 + 1) * 16) / 256.0F;
            C_100872_azb var31 = C_100872_azb.field_110346_a;
            var31.func_110330_b();
            var31.func_110323_b(0.0F, 0.0F, -1.0F);
            var31.func_110322_a((double)var23, (double)var26, (double)(-var8), (double)var28, (double)var29);
            var31.func_110322_a((double)var24, (double)var26, (double)(-var8), (double)var27, (double)var29);
            var31.func_110322_a((double)var24, (double)var25, (double)(-var8), (double)var27, (double)var30);
            var31.func_110322_a((double)var23, (double)var25, (double)(-var8), (double)var28, (double)var30);
            var31.func_110323_b(0.0F, 0.0F, 1.0F);
            var31.func_110322_a((double)var23, (double)var25, (double)var8, (double)var9, (double)var11);
            var31.func_110322_a((double)var24, (double)var25, (double)var8, (double)var10, (double)var11);
            var31.func_110322_a((double)var24, (double)var26, (double)var8, (double)var10, (double)var12);
            var31.func_110322_a((double)var23, (double)var26, (double)var8, (double)var9, (double)var12);
            var31.func_110323_b(0.0F, 1.0F, 0.0F);
            var31.func_110322_a((double)var23, (double)var25, (double)(-var8), (double)var13, (double)var15);
            var31.func_110322_a((double)var24, (double)var25, (double)(-var8), (double)var14, (double)var15);
            var31.func_110322_a((double)var24, (double)var25, (double)var8, (double)var14, (double)var16);
            var31.func_110322_a((double)var23, (double)var25, (double)var8, (double)var13, (double)var16);
            var31.func_110323_b(0.0F, -1.0F, 0.0F);
            var31.func_110322_a((double)var23, (double)var26, (double)var8, (double)var13, (double)var15);
            var31.func_110322_a((double)var24, (double)var26, (double)var8, (double)var14, (double)var15);
            var31.func_110322_a((double)var24, (double)var26, (double)(-var8), (double)var14, (double)var16);
            var31.func_110322_a((double)var23, (double)var26, (double)(-var8), (double)var13, (double)var16);
            var31.func_110323_b(-1.0F, 0.0F, 0.0F);
            var31.func_110322_a((double)var23, (double)var25, (double)var8, (double)var18, (double)var19);
            var31.func_110322_a((double)var23, (double)var26, (double)var8, (double)var18, (double)var20);
            var31.func_110322_a((double)var23, (double)var26, (double)(-var8), (double)var17, (double)var20);
            var31.func_110322_a((double)var23, (double)var25, (double)(-var8), (double)var17, (double)var19);
            var31.func_110323_b(1.0F, 0.0F, 0.0F);
            var31.func_110322_a((double)var24, (double)var25, (double)(-var8), (double)var18, (double)var19);
            var31.func_110322_a((double)var24, (double)var26, (double)(-var8), (double)var18, (double)var20);
            var31.func_110322_a((double)var24, (double)var26, (double)var8, (double)var17, (double)var20);
            var31.func_110322_a((double)var24, (double)var25, (double)var8, (double)var17, (double)var19);
            var31.func_110329_a();
         }
      }

   }

   private void func_105519_a(C_100600_lq var1, float var2, float var3) {
      int var4 = C_100650_jv.func_108910_c(var1.field_103221_t);
      int var5 = C_100650_jv.func_108910_c(var1.field_103219_u + (double)(var3 / 16.0F));
      int var6 = C_100650_jv.func_108910_c(var1.field_103217_v);
      if(var1.field_104581_a == 2) {
         var4 = C_100650_jv.func_108910_c(var1.field_103221_t + (double)(var2 / 16.0F));
      }

      if(var1.field_104581_a == 1) {
         var6 = C_100650_jv.func_108910_c(var1.field_103217_v - (double)(var2 / 16.0F));
      }

      if(var1.field_104581_a == 0) {
         var4 = C_100650_jv.func_108910_c(var1.field_103221_t - (double)(var2 / 16.0F));
      }

      if(var1.field_104581_a == 3) {
         var6 = C_100650_jv.func_108910_c(var1.field_103217_v + (double)(var2 / 16.0F));
      }

      int var7 = this.field_105357_b.field_110178_g.func_109355_i(var4, var5, var6, 0);
      int var8 = var7 % 65536;
      int var9 = var7 / 65536;
      C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var8, (float)var9);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
   }
}
