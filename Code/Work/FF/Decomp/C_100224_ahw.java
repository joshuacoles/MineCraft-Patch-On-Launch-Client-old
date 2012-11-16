import java.util.Random;

public class C_100224_ahw extends C_100451_alf {

   protected C_100224_ahw(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_108994_D);
      this.func_105972_b(true);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      this.func_106008_a(var7, 0.0F, var6, 1.0F - var6, var8, 1.0F - var6);
   }

   public void func_106059_f() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.func_106008_a(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8 - var6), (double)((float)(var4 + 1) - var6));
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      float var6 = 0.0625F;
      float var7 = (float)(1 + var5 * 2) / 16.0F;
      float var8 = 0.5F;
      return C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var6), (double)((float)(var2 + 1) - var6), (double)((float)var3 + var8), (double)((float)(var4 + 1) - var6));
   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 1?this.field_106165_cl:(var1 == 0?this.field_106165_cl + 3:(var2 > 0 && var1 == 4?this.field_106165_cl + 2:this.field_106165_cl + 1));
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl:(var1 == 0?this.field_106165_cl + 3:this.field_106165_cl + 1);
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      this.func_106366_b(var1, var2, var3, var4, var5);
      return true;
   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {
      this.func_106366_b(var1, var2, var3, var4, var5);
   }

   private void func_106366_b(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {
      if(var5.func_103821_f(false)) {
         var5.func_103819_bZ().func_111583_a(2, 0.1F);
         int var6 = var1.func_109357_g(var2, var3, var4) + 1;
         if(var6 >= 6) {
            var1.func_109422_e(var2, var3, var4, 0);
         } else {
            var1.func_109488_c(var2, var3, var4, var6);
            var1.func_109423_i(var2, var3, var4);
         }
      }

   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return !super.func_106023_b(var1, var2, var3, var4)?false:this.func_106001_d(var1, var2, var3, var4);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109350_f(var2, var3 - 1, var4).func_108983_a();
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return 0;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110894_aZ.field_110891_cf;
   }
}
