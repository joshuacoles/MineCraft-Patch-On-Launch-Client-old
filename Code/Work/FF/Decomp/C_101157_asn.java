import java.awt.image.BufferedImage;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class C_101157_asn {

   private int[] field_111844_a = new int[16384];
   private int field_111842_b;
   private C_101125_ard field_111843_c;
   private C_101153_asb field_111841_d;


   public C_101157_asn(C_101153_asb var1, C_101125_ard var2, C_100874_azc var3) {
      this.field_111843_c = var2;
      this.field_111841_d = var1;
      this.field_111842_b = var3.func_110383_a(new BufferedImage(128, 128, 2));

      for(int var4 = 0; var4 < 16384; ++var4) {
         this.field_111844_a[var4] = 0;
      }

   }

   public void func_111840_a(C_101095_qg var1, C_100874_azc var2, C_100282_agl var3) {
      for(int var4 = 0; var4 < 16384; ++var4) {
         byte var5 = var3.field_107295_e[var4];
         if(var5 / 4 == 0) {
            this.field_111844_a[var4] = (var4 + var4 / 128 & 1) * 8 + 16 << 24;
         } else {
            int var6 = C_100668_afi.field_109068_a[var5 / 4].field_109078_p;
            int var7 = var5 & 3;
            short var8 = 220;
            if(var7 == 2) {
               var8 = 255;
            }

            if(var7 == 0) {
               var8 = 180;
            }

            int var9 = (var6 >> 16 & 255) * var8 / 255;
            int var10 = (var6 >> 8 & 255) * var8 / 255;
            int var11 = (var6 & 255) * var8 / 255;
            if(this.field_111843_c.field_111716_g) {
               int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
               int var13 = (var9 * 30 + var10 * 70) / 100;
               int var14 = (var9 * 30 + var11 * 70) / 100;
               var9 = var12;
               var10 = var13;
               var11 = var14;
            }

            this.field_111844_a[var4] = -16777216 | var9 << 16 | var10 << 8 | var11;
         }
      }

      var2.func_110376_a(this.field_111844_a, 128, 128, this.field_111842_b);
      byte var15 = 0;
      byte var16 = 0;
      C_100872_azb var17 = C_100872_azb.field_110346_a;
      float var18 = 0.0F;
      GL11.glBindTexture(3553, this.field_111842_b);
      GL11.glEnable(3042);
      GL11.glBlendFunc(1, 771);
      GL11.glDisable(3008);
      var17.func_110330_b();
      var17.func_110322_a((double)((float)(var15 + 0) + var18), (double)((float)(var16 + 128) - var18), -0.009999999776482582D, 0.0D, 1.0D);
      var17.func_110322_a((double)((float)(var15 + 128) - var18), (double)((float)(var16 + 128) - var18), -0.009999999776482582D, 1.0D, 1.0D);
      var17.func_110322_a((double)((float)(var15 + 128) - var18), (double)((float)(var16 + 0) + var18), -0.009999999776482582D, 1.0D, 0.0D);
      var17.func_110322_a((double)((float)(var15 + 0) + var18), (double)((float)(var16 + 0) + var18), -0.009999999776482582D, 0.0D, 0.0D);
      var17.func_110329_a();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
      var2.func_110368_b(var2.func_110367_b("/misc/mapicons.png"));
      int var19 = 0;

      for(Iterator var20 = var3.field_107293_g.values().iterator(); var20.hasNext(); ++var19) {
         C_100302_agn var21 = (C_100302_agn)var20.next();
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var15 + (float)var21.field_107353_b / 2.0F + 64.0F, (float)var16 + (float)var21.field_107354_c / 2.0F + 64.0F, -0.02F);
         GL11.glRotatef((float)(var21.field_107351_d * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
         GL11.glScalef(4.0F, 4.0F, 3.0F);
         GL11.glTranslatef(-0.125F, 0.125F, 0.0F);
         float var23 = (float)(var21.field_107355_a % 4 + 0) / 4.0F;
         float var22 = (float)(var21.field_107355_a / 4 + 0) / 4.0F;
         float var24 = (float)(var21.field_107355_a % 4 + 1) / 4.0F;
         float var25 = (float)(var21.field_107355_a / 4 + 1) / 4.0F;
         var17.func_110330_b();
         var17.func_110322_a(-1.0D, 1.0D, (double)((float)var19 * 0.0010F), (double)var23, (double)var22);
         var17.func_110322_a(1.0D, 1.0D, (double)((float)var19 * 0.0010F), (double)var24, (double)var22);
         var17.func_110322_a(1.0D, -1.0D, (double)((float)var19 * 0.0010F), (double)var24, (double)var25);
         var17.func_110322_a(-1.0D, -1.0D, (double)((float)var19 * 0.0010F), (double)var23, (double)var25);
         var17.func_110329_a();
         GL11.glPopMatrix();
      }

      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -0.04F);
      GL11.glScalef(1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }
}
