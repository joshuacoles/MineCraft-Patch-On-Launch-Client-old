import java.util.Random;

public class C_100439_all extends C_100451_alf {

   protected C_100439_all(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109021_w);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4) & 7;
      return var5 >= 3?C_100412_amr.func_107892_a().func_107844_a((double)var2 + this.field_106156_ct, (double)var3 + this.field_106155_cu, (double)var4 + this.field_106154_cv, (double)var2 + this.field_106153_cw, (double)((float)var3 + 0.5F), (double)var4 + this.field_106151_cy):null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4) & 7;
      float var6 = (float)(2 * (1 + var5)) / 16.0F;
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, var6, 1.0F);
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3 - 1, var4);
      return var5 != 0 && (var5 == C_100451_alf.field_106080_N.field_106162_cm || C_100451_alf.field_106118_p[var5].func_105994_c())?var1.func_109350_f(var2, var3 - 1, var4).func_108992_c():false;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this.func_106433_n(var1, var2, var3, var4);
   }

   private boolean func_106433_n(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106023_b(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      int var7 = C_100992_tt.field_110916_aD.field_110891_cf;
      this.func_106042_a(var1, var3, var4, var5, new C_100994_tv(var7, 1, 0));
      var1.func_109422_e(var3, var4, var5, 0);
      var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110916_aD.field_110891_cf;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var1.func_109375_b(C_100847_xq.field_110166_b, var2, var3, var4) > 11) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 == 1?true:super.func_105976_a(var1, var2, var3, var4, var5);
   }
}
