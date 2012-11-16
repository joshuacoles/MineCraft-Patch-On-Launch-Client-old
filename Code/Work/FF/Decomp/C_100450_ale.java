import java.util.List;
import java.util.Random;

public class C_100450_ale extends C_100451_alf {

   private int field_106438_a;
   private final boolean field_106437_b;


   protected C_100450_ale(int var1, int var2, int var3, C_100664_afg var4, boolean var5) {
      super(var1, var2, var4);
      this.field_106438_a = var3;
      this.field_106437_b = var5;
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return !this.field_106437_b?0:super.func_106043_a(var1, var2, var3);
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 18;
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109349_a(var2, var3, var4);
      return var6 == this.field_106162_cm?false:super.func_105976_a(var1, var2, var3, var4, var5);
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      boolean var8 = this.func_106436_e(var1.func_109349_a(var2, var3, var4 - 1));
      boolean var9 = this.func_106436_e(var1.func_109349_a(var2, var3, var4 + 1));
      boolean var10 = this.func_106436_e(var1.func_109349_a(var2 - 1, var3, var4));
      boolean var11 = this.func_106436_e(var1.func_109349_a(var2 + 1, var3, var4));
      if((!var10 || !var11) && (var10 || var11 || var8 || var9)) {
         if(var10 && !var11) {
            this.func_106008_a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
            super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         } else if(!var10 && var11) {
            this.func_106008_a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      }

      if((!var8 || !var9) && (var10 || var11 || var8 || var9)) {
         if(var8 && !var9) {
            this.func_106008_a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
            super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         } else if(!var8 && var9) {
            this.func_106008_a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
            super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         this.func_106008_a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public void func_106059_f() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      float var5 = 0.4375F;
      float var6 = 0.5625F;
      float var7 = 0.4375F;
      float var8 = 0.5625F;
      boolean var9 = this.func_106436_e(var1.func_109349_a(var2, var3, var4 - 1));
      boolean var10 = this.func_106436_e(var1.func_109349_a(var2, var3, var4 + 1));
      boolean var11 = this.func_106436_e(var1.func_109349_a(var2 - 1, var3, var4));
      boolean var12 = this.func_106436_e(var1.func_109349_a(var2 + 1, var3, var4));
      if((!var11 || !var12) && (var11 || var12 || var9 || var10)) {
         if(var11 && !var12) {
            var5 = 0.0F;
         } else if(!var11 && var12) {
            var6 = 1.0F;
         }
      } else {
         var5 = 0.0F;
         var6 = 1.0F;
      }

      if((!var9 || !var10) && (var11 || var12 || var9 || var10)) {
         if(var9 && !var10) {
            var7 = 0.0F;
         } else if(!var9 && var10) {
            var8 = 1.0F;
         }
      } else {
         var7 = 0.0F;
         var8 = 1.0F;
      }

      this.func_106008_a(var5, 0.0F, var7, var6, 1.0F, var8);
   }

   public int func_106435_p() {
      return this.field_106438_a;
   }

   public final boolean func_106436_e(int var1) {
      return C_100451_alf.field_106117_q[var1] || var1 == this.field_106162_cm || var1 == C_100451_alf.field_106091_P.field_106162_cm;
   }

   protected boolean func_106045_s_() {
      return true;
   }

   protected C_100994_tv func_106044_f_(int var1) {
      return new C_100994_tv(this.field_106162_cm, 1, var1);
   }
}
