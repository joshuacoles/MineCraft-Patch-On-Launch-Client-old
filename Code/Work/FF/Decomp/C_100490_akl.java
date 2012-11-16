import java.util.Random;

public class C_100490_akl extends C_100451_alf {

   private boolean field_106468_a;


   public C_100490_akl(int var1, int var2, boolean var3) {
      super(var1, var2, C_100664_afg.field_109009_e);
      if(var3) {
         this.func_105972_b(true);
      }

      this.field_106468_a = var3;
   }

   public int func_106000_r_() {
      return 30;
   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {
      this.func_106467_l(var1, var2, var3, var4);
      super.func_105993_a(var1, var2, var3, var4, var5);
   }

   public void func_105990_b(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      this.func_106467_l(var1, var2, var3, var4);
      super.func_105990_b(var1, var2, var3, var4, var5);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      this.func_106467_l(var1, var2, var3, var4);
      return super.func_106070_a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private void func_106467_l(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106466_n(var1, var2, var3, var4);
      if(this.field_106162_cm == C_100451_alf.field_106178_aQ.field_106162_cm) {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106177_aR.field_106162_cm);
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(this.field_106162_cm == C_100451_alf.field_106177_aR.field_106162_cm) {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106178_aQ.field_106162_cm);
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110915_aC.field_110891_cf;
   }

   public int func_106012_a(int var1, Random var2) {
      return this.func_106063_a(var2) + var2.nextInt(var1 + 1);
   }

   public int func_106063_a(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.func_105998_a(var1, var2, var3, var4, var5, var6, var7);
      if(this.func_106043_a(var5, var1.field_109577_u, var7) != this.field_106162_cm) {
         int var8 = 1 + var1.field_109577_u.nextInt(5);
         this.func_106005_f(var1, var2, var3, var4, var8);
      }

   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(this.field_106468_a) {
         this.func_106466_n(var1, var2, var3, var4);
      }

   }

   private void func_106466_n(C_100873_xe var1, int var2, int var3, int var4) {
      Random var5 = var1.field_109577_u;
      double var6 = 0.0625D;

      for(int var8 = 0; var8 < 6; ++var8) {
         double var9 = (double)((float)var2 + var5.nextFloat());
         double var11 = (double)((float)var3 + var5.nextFloat());
         double var13 = (double)((float)var4 + var5.nextFloat());
         if(var8 == 0 && !var1.func_109356_r(var2, var3 + 1, var4)) {
            var11 = (double)(var3 + 1) + var6;
         }

         if(var8 == 1 && !var1.func_109356_r(var2, var3 - 1, var4)) {
            var11 = (double)(var3 + 0) - var6;
         }

         if(var8 == 2 && !var1.func_109356_r(var2, var3, var4 + 1)) {
            var13 = (double)(var4 + 1) + var6;
         }

         if(var8 == 3 && !var1.func_109356_r(var2, var3, var4 - 1)) {
            var13 = (double)(var4 + 0) - var6;
         }

         if(var8 == 4 && !var1.func_109356_r(var2 + 1, var3, var4)) {
            var9 = (double)(var2 + 1) + var6;
         }

         if(var8 == 5 && !var1.func_109356_r(var2 - 1, var3, var4)) {
            var9 = (double)(var2 + 0) - var6;
         }

         if(var9 < (double)var2 || var9 > (double)(var2 + 1) || var11 < 0.0D || var11 > (double)(var3 + 1) || var13 < (double)var4 || var13 > (double)(var4 + 1)) {
            var1.func_109428_a("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   protected C_100994_tv func_106044_f_(int var1) {
      return new C_100994_tv(C_100451_alf.field_106178_aQ);
   }
}
