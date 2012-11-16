import org.lwjgl.opengl.GL11;

public class C_100050_bbp extends C_100044_bbz {

   public void func_105575_a(C_100425_alz var1, double var2, double var4, double var6, float var8) {
      float var9 = var1.func_103037_v_();
      if(var9 > 0.0F) {
         C_100872_azb var10 = C_100872_azb.field_110346_a;
         this.func_105558_a("/misc/beam.png");
         GL11.glTexParameterf(3553, 10242, 10497.0F);
         GL11.glTexParameterf(3553, 10243, 10497.0F);
         GL11.glDisable(2896);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glDepthMask(true);
         GL11.glBlendFunc(770, 1);
         float var11 = (float)var1.func_102928_n().func_109463_E() + var8;
         float var12 = -var11 * 0.2F - (float)C_100650_jv.func_108933_d(-var11 * 0.1F);
         byte var13 = 1;
         double var14 = (double)var11 * 0.025D * (1.0D - (double)(var13 & 1) * 2.5D);
         var10.func_110330_b();
         var10.func_110318_a(255, 255, 255, 32);
         double var16 = (double)var13 * 0.2D;
         double var18 = 0.5D + Math.cos(var14 + 2.356194490192345D) * var16;
         double var20 = 0.5D + Math.sin(var14 + 2.356194490192345D) * var16;
         double var22 = 0.5D + Math.cos(var14 + 0.7853981633974483D) * var16;
         double var24 = 0.5D + Math.sin(var14 + 0.7853981633974483D) * var16;
         double var26 = 0.5D + Math.cos(var14 + 3.9269908169872414D) * var16;
         double var28 = 0.5D + Math.sin(var14 + 3.9269908169872414D) * var16;
         double var30 = 0.5D + Math.cos(var14 + 5.497787143782138D) * var16;
         double var32 = 0.5D + Math.sin(var14 + 5.497787143782138D) * var16;
         double var34 = (double)(256.0F * var9);
         double var36 = 0.0D;
         double var38 = 1.0D;
         double var40 = (double)(-1.0F + var12);
         double var42 = (double)(256.0F * var9) * (0.5D / var16) + var40;
         var10.func_110322_a(var2 + var18, var4 + var34, var6 + var20, var38, var42);
         var10.func_110322_a(var2 + var18, var4, var6 + var20, var38, var40);
         var10.func_110322_a(var2 + var22, var4, var6 + var24, var36, var40);
         var10.func_110322_a(var2 + var22, var4 + var34, var6 + var24, var36, var42);
         var10.func_110322_a(var2 + var30, var4 + var34, var6 + var32, var38, var42);
         var10.func_110322_a(var2 + var30, var4, var6 + var32, var38, var40);
         var10.func_110322_a(var2 + var26, var4, var6 + var28, var36, var40);
         var10.func_110322_a(var2 + var26, var4 + var34, var6 + var28, var36, var42);
         var10.func_110322_a(var2 + var22, var4 + var34, var6 + var24, var38, var42);
         var10.func_110322_a(var2 + var22, var4, var6 + var24, var38, var40);
         var10.func_110322_a(var2 + var30, var4, var6 + var32, var36, var40);
         var10.func_110322_a(var2 + var30, var4 + var34, var6 + var32, var36, var42);
         var10.func_110322_a(var2 + var26, var4 + var34, var6 + var28, var38, var42);
         var10.func_110322_a(var2 + var26, var4, var6 + var28, var38, var40);
         var10.func_110322_a(var2 + var18, var4, var6 + var20, var36, var40);
         var10.func_110322_a(var2 + var18, var4 + var34, var6 + var20, var36, var42);
         var10.func_110329_a();
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glDepthMask(false);
         var10.func_110330_b();
         var10.func_110318_a(255, 255, 255, 32);
         double var44 = 0.2D;
         double var15 = 0.2D;
         double var17 = 0.8D;
         double var19 = 0.2D;
         double var21 = 0.2D;
         double var23 = 0.8D;
         double var25 = 0.8D;
         double var27 = 0.8D;
         double var29 = (double)(256.0F * var9);
         double var31 = 0.0D;
         double var33 = 1.0D;
         double var35 = (double)(-1.0F + var12);
         double var37 = (double)(256.0F * var9) + var35;
         var10.func_110322_a(var2 + var44, var4 + var29, var6 + var15, var33, var37);
         var10.func_110322_a(var2 + var44, var4, var6 + var15, var33, var35);
         var10.func_110322_a(var2 + var17, var4, var6 + var19, var31, var35);
         var10.func_110322_a(var2 + var17, var4 + var29, var6 + var19, var31, var37);
         var10.func_110322_a(var2 + var25, var4 + var29, var6 + var27, var33, var37);
         var10.func_110322_a(var2 + var25, var4, var6 + var27, var33, var35);
         var10.func_110322_a(var2 + var21, var4, var6 + var23, var31, var35);
         var10.func_110322_a(var2 + var21, var4 + var29, var6 + var23, var31, var37);
         var10.func_110322_a(var2 + var17, var4 + var29, var6 + var19, var33, var37);
         var10.func_110322_a(var2 + var17, var4, var6 + var19, var33, var35);
         var10.func_110322_a(var2 + var25, var4, var6 + var27, var31, var35);
         var10.func_110322_a(var2 + var25, var4 + var29, var6 + var27, var31, var37);
         var10.func_110322_a(var2 + var21, var4 + var29, var6 + var23, var33, var37);
         var10.func_110322_a(var2 + var21, var4, var6 + var23, var33, var35);
         var10.func_110322_a(var2 + var44, var4, var6 + var15, var31, var35);
         var10.func_110322_a(var2 + var44, var4 + var29, var6 + var15, var31, var37);
         var10.func_110329_a();
         GL11.glEnable(2896);
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }

   }
}
