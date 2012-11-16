import org.lwjgl.opengl.GL11;

public class C_101155_asd {

   protected float field_103883_j = 0.0F;


   protected void func_103878_a(int var1, int var2, int var3, int var4) {
      if(var2 < var1) {
         int var5 = var1;
         var1 = var2;
         var2 = var5;
      }

      func_103882_a(var1, var3, var2 + 1, var3 + 1, var4);
   }

   protected void func_103876_b(int var1, int var2, int var3, int var4) {
      if(var3 < var2) {
         int var5 = var2;
         var2 = var3;
         var3 = var5;
      }

      func_103882_a(var1, var2 + 1, var1 + 1, var3, var4);
   }

   public static void func_103882_a(int var0, int var1, int var2, int var3, int var4) {
      int var5;
      if(var0 < var2) {
         var5 = var0;
         var0 = var2;
         var2 = var5;
      }

      if(var1 < var3) {
         var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      float var10 = (float)(var4 >> 24 & 255) / 255.0F;
      float var6 = (float)(var4 >> 16 & 255) / 255.0F;
      float var7 = (float)(var4 >> 8 & 255) / 255.0F;
      float var8 = (float)(var4 & 255) / 255.0F;
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(var6, var7, var8, var10);
      var9.func_110330_b();
      var9.func_110325_a((double)var0, (double)var3, 0.0D);
      var9.func_110325_a((double)var2, (double)var3, 0.0D);
      var9.func_110325_a((double)var2, (double)var1, 0.0D);
      var9.func_110325_a((double)var0, (double)var1, 0.0D);
      var9.func_110329_a();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   protected void func_103881_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 255) / 255.0F;
      float var8 = (float)(var5 >> 16 & 255) / 255.0F;
      float var9 = (float)(var5 >> 8 & 255) / 255.0F;
      float var10 = (float)(var5 & 255) / 255.0F;
      float var11 = (float)(var6 >> 24 & 255) / 255.0F;
      float var12 = (float)(var6 >> 16 & 255) / 255.0F;
      float var13 = (float)(var6 >> 8 & 255) / 255.0F;
      float var14 = (float)(var6 & 255) / 255.0F;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      C_100872_azb var15 = C_100872_azb.field_110346_a;
      var15.func_110330_b();
      var15.func_110317_a(var8, var9, var10, var7);
      var15.func_110325_a((double)var3, (double)var2, (double)this.field_103883_j);
      var15.func_110325_a((double)var1, (double)var2, (double)this.field_103883_j);
      var15.func_110317_a(var12, var13, var14, var11);
      var15.func_110325_a((double)var1, (double)var4, (double)this.field_103883_j);
      var15.func_110325_a((double)var3, (double)var4, (double)this.field_103883_j);
      var15.func_110329_a();
      GL11.glShadeModel(7424);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(3553);
   }

   public void func_103879_a(C_101153_asb var1, String var2, int var3, int var4, int var5) {
      var1.func_111783_a(var2, var3 - var1.func_111778_a(var2) / 2, var4, var5);
   }

   public void func_103880_b(C_101153_asb var1, String var2, int var3, int var4, int var5) {
      var1.func_111783_a(var2, var3, var4, var5);
   }

   public void func_103877_b(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      var9.func_110330_b();
      var9.func_110322_a((double)(var1 + 0), (double)(var2 + var6), (double)this.field_103883_j, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.func_110322_a((double)(var1 + var5), (double)(var2 + var6), (double)this.field_103883_j, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.func_110322_a((double)(var1 + var5), (double)(var2 + 0), (double)this.field_103883_j, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.func_110322_a((double)(var1 + 0), (double)(var2 + 0), (double)this.field_103883_j, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.func_110329_a();
   }
}
