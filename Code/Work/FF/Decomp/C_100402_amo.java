import java.util.List;
import java.util.Random;

public class C_100402_amo extends C_100451_alf {

   private int field_106392_a = -1;


   public C_100402_amo(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_108996_F);
      this.func_106014_a(field_106109_h);
      this.func_106006_c(0.5F);
   }

   public void func_106390_e(int var1) {
      this.field_106392_a = var1;
   }

   public void func_106391_p() {
      this.field_106392_a = -1;
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      super.func_106041_a(var1, var2, var3, var4, var5, var6);
      int var7 = C_100012_j.field_105266_a[func_106389_f(var6)];
      var2 += C_100012_j.field_105264_b[var7];
      var3 += C_100012_j.field_105265_c[var7];
      var4 += C_100012_j.field_105262_d[var7];
      int var8 = var1.func_109349_a(var2, var3, var4);
      if(var8 == C_100451_alf.field_106240_ac.field_106162_cm || var8 == C_100451_alf.field_106094_Y.field_106162_cm) {
         var6 = var1.func_109357_g(var2, var3, var4);
         if(C_100404_amn.func_106398_f(var6)) {
            C_100451_alf.field_106118_p[var8].func_106035_c(var1, var2, var3, var4, var6, 0);
            var1.func_109422_e(var2, var3, var4, 0);
         }
      }

   }

   public int func_106029_a(int var1, int var2) {
      int var3 = func_106389_f(var2);
      return var1 == var3?(this.field_106392_a >= 0?this.field_106392_a:((var2 & 8) != 0?this.field_106165_cl - 1:this.field_106165_cl)):(var3 < 6 && var1 == C_100012_j.field_105266_a[var3]?107:108);
   }

   public int func_106013_d() {
      return 17;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      int var8 = var1.func_109357_g(var2, var3, var4);
      switch(func_106389_f(var8)) {
      case 0:
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         this.func_106008_a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 1:
         this.func_106008_a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         this.func_106008_a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 2:
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         this.func_106008_a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 3:
         this.func_106008_a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         this.func_106008_a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 4:
         this.func_106008_a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         this.func_106008_a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         break;
      case 5:
         this.func_106008_a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
         this.func_106008_a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      switch(func_106389_f(var5)) {
      case 0:
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         break;
      case 1:
         this.func_106008_a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         break;
      case 2:
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         break;
      case 3:
         this.func_106008_a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         break;
      case 4:
         this.func_106008_a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         break;
      case 5:
         this.func_106008_a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = func_106389_f(var1.func_109357_g(var2, var3, var4));
      int var7 = var1.func_109349_a(var2 - C_100012_j.field_105264_b[var6], var3 - C_100012_j.field_105265_c[var6], var4 - C_100012_j.field_105262_d[var6]);
      if(var7 != C_100451_alf.field_106240_ac.field_106162_cm && var7 != C_100451_alf.field_106094_Y.field_106162_cm) {
         var1.func_109422_e(var2, var3, var4, 0);
      } else {
         C_100451_alf.field_106118_p[var7].func_106017_a(var1, var2 - C_100012_j.field_105264_b[var6], var3 - C_100012_j.field_105265_c[var6], var4 - C_100012_j.field_105262_d[var6], var5);
      }

   }

   public static int func_106389_f(int var0) {
      return var0 & 7;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return 0;
   }
}
