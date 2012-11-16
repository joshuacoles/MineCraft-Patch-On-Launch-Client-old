import java.util.Random;

public class C_100184_aii extends C_100186_aij {

   public static final double[] field_106310_a = new double[]{-0.0625D, 0.0625D, 0.1875D, 0.3125D};
   private static final int[] field_106308_b = new int[]{1, 2, 3, 4};
   private final boolean field_106309_c;


   protected C_100184_aii(int var1, boolean var2) {
      super(var1, 6, C_100664_afg.field_109027_q);
      this.field_106309_c = var2;
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return !var1.func_109348_t(var2, var3 - 1, var4)?false:super.func_106023_b(var1, var2, var3, var4);
   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return !var1.func_109348_t(var2, var3 - 1, var4)?false:super.func_106001_d(var1, var2, var3, var4);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      boolean var7 = this.func_106304_e(var1, var2, var3, var4, var6);
      if(!var7) {
         boolean var8 = this.func_106306_h(var1, var2, var3, var4, var6);
         if(this.field_106309_c && !var8) {
            var1.func_109394_d(var2, var3, var4, C_100451_alf.field_106138_bk.field_106162_cm, var6);
         } else if(!this.field_106309_c) {
            var1.func_109394_d(var2, var3, var4, C_100451_alf.field_106139_bl.field_106162_cm, var6);
            if(!var8) {
               int var9 = (var6 & 12) >> 2;
               var1.func_109398_a(var2, var3, var4, C_100451_alf.field_106139_bl.field_106162_cm, field_106308_b[var9] * 2);
            }
         }
      }

   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 0?(this.field_106309_c?99:115):(var1 == 1?(this.field_106309_c?147:131):5);
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var5 != 1;
   }

   public int func_106013_d() {
      return 15;
   }

   public int func_106024_a(int var1) {
      return this.func_106029_a(var1, 0);
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return this.func_106030_b(var1, var2, var3, var4, var5);
   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(!this.field_106309_c) {
         return false;
      } else {
         int var6 = func_106302_e(var1.func_109357_g(var2, var3, var4));
         return var6 == 0 && var5 == 3?true:(var6 == 1 && var5 == 4?true:(var6 == 2 && var5 == 2?true:var6 == 3 && var5 == 5));
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
      } else {
         int var6 = var1.func_109357_g(var2, var3, var4);
         boolean var7 = this.func_106304_e(var1, var2, var3, var4, var6);
         if(!var7) {
            boolean var8 = this.func_106306_h(var1, var2, var3, var4, var6);
            int var9 = (var6 & 12) >> 2;
            if(this.field_106309_c && !var8 || !this.field_106309_c && var8) {
               byte var10 = 0;
               if(this.func_106307_d(var1, var2, var3, var4, var6)) {
                  var10 = -1;
               }

               var1.func_109525_a(var2, var3, var4, this.field_106162_cm, field_106308_b[var9] * 2, var10);
            }
         }

      }
   }

   private boolean func_106306_h(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = func_106302_e(var5);
      switch(var6) {
      case 0:
         return var1.func_109437_l(var2, var3, var4 + 1, 3) || var1.func_109349_a(var2, var3, var4 + 1) == C_100451_alf.field_106203_ay.field_106162_cm && var1.func_109357_g(var2, var3, var4 + 1) > 0;
      case 1:
         return var1.func_109437_l(var2 - 1, var3, var4, 4) || var1.func_109349_a(var2 - 1, var3, var4) == C_100451_alf.field_106203_ay.field_106162_cm && var1.func_109357_g(var2 - 1, var3, var4) > 0;
      case 2:
         return var1.func_109437_l(var2, var3, var4 - 1, 2) || var1.func_109349_a(var2, var3, var4 - 1) == C_100451_alf.field_106203_ay.field_106162_cm && var1.func_109357_g(var2, var3, var4 - 1) > 0;
      case 3:
         return var1.func_109437_l(var2 + 1, var3, var4, 5) || var1.func_109349_a(var2 + 1, var3, var4) == C_100451_alf.field_106203_ay.field_106162_cm && var1.func_109357_g(var2 + 1, var3, var4) > 0;
      default:
         return false;
      }
   }

   public boolean func_106304_e(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      int var6 = func_106302_e(var5);
      switch(var6) {
      case 0:
      case 2:
         return var1.func_109359_k(var2 - 1, var3, var4, 4) && func_106305_c(var1.func_109349_a(var2 - 1, var3, var4)) || var1.func_109359_k(var2 + 1, var3, var4, 5) && func_106305_c(var1.func_109349_a(var2 + 1, var3, var4));
      case 1:
      case 3:
         return var1.func_109359_k(var2, var3, var4 + 1, 3) && func_106305_c(var1.func_109349_a(var2, var3, var4 + 1)) || var1.func_109359_k(var2, var3, var4 - 1, 2) && func_106305_c(var1.func_109349_a(var2, var3, var4 - 1));
      default:
         return false;
      }
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.func_109357_g(var2, var3, var4);
      int var11 = (var10 & 12) >> 2;
      var11 = var11 + 1 << 2 & 12;
      var1.func_109488_c(var2, var3, var4, var11 | var10 & 3);
      return true;
   }

   public boolean func_106028_i() {
      return true;
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = ((C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.func_109488_c(var2, var3, var4, var6);
      boolean var7 = this.func_106306_h(var1, var2, var3, var4, var6);
      if(var7) {
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, 1);
      }

   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
      var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
      var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
      var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
      var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
      var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
   }

   public void func_106020_c(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(this.field_106309_c) {
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
      }

      super.func_106020_c(var1, var2, var3, var4, var5);
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110880_bb.field_110891_cf;
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(this.field_106309_c) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         int var7 = func_106302_e(var6);
         double var8 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var10 = (double)((float)var3 + 0.4F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var12 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var14 = 0.0D;
         double var16 = 0.0D;
         if(var5.nextInt(2) == 0) {
            switch(var7) {
            case 0:
               var16 = -0.3125D;
               break;
            case 1:
               var14 = 0.3125D;
               break;
            case 2:
               var16 = 0.3125D;
               break;
            case 3:
               var14 = -0.3125D;
            }
         } else {
            int var18 = (var6 & 12) >> 2;
            switch(var7) {
            case 0:
               var16 = field_106310_a[var18];
               break;
            case 1:
               var14 = -field_106310_a[var18];
               break;
            case 2:
               var16 = -field_106310_a[var18];
               break;
            case 3:
               var14 = field_106310_a[var18];
            }
         }

         var1.func_109428_a("reddust", var8 + var14, var10, var12 + var16, 0.0D, 0.0D, 0.0D);
      }
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110880_bb.field_110891_cf;
   }

   public static boolean func_106305_c(int var0) {
      return var0 == C_100451_alf.field_106139_bl.field_106162_cm || var0 == C_100451_alf.field_106138_bk.field_106162_cm;
   }

   public boolean func_106307_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = func_106302_e(var5);
      if(func_106305_c(var1.func_109349_a(var2 - C_100015_i.field_105283_a[var6], var3, var4 - C_100015_i.field_105281_b[var6]))) {
         int var7 = var1.func_109357_g(var2 - C_100015_i.field_105283_a[var6], var3, var4 - C_100015_i.field_105281_b[var6]);
         int var8 = func_106302_e(var7);
         return var8 != var6;
      } else {
         return false;
      }
   }

}
