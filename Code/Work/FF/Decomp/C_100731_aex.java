import java.util.Random;

public class C_100731_aex extends C_100723_afc {

   private C_100728_aew[] field_109296_a;
   private int field_109295_b;


   public C_100731_aex(Random var1, int var2) {
      this.field_109295_b = var2;
      this.field_109296_a = new C_100728_aew[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field_109296_a[var3] = new C_100728_aew(var1);
      }

   }

   public double[] func_109293_a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, double var10, double var12) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      } else {
         for(int var14 = 0; var14 < var1.length; ++var14) {
            var1[var14] = 0.0D;
         }
      }

      double var27 = 1.0D;

      for(int var16 = 0; var16 < this.field_109295_b; ++var16) {
         double var17 = (double)var2 * var27 * var8;
         double var19 = (double)var3 * var27 * var10;
         double var21 = (double)var4 * var27 * var12;
         long var23 = C_100650_jv.func_108922_d(var17);
         long var25 = C_100650_jv.func_108922_d(var21);
         var17 -= (double)var23;
         var21 -= (double)var25;
         var23 %= 16777216L;
         var25 %= 16777216L;
         var17 += (double)var23;
         var21 += (double)var25;
         this.field_109296_a[var16].func_109285_a(var1, var17, var19, var21, var5, var6, var7, var8 * var27, var10 * var27, var12 * var27, var27);
         var27 /= 2.0D;
      }

      return var1;
   }

   public double[] func_109294_a(double[] var1, int var2, int var3, int var4, int var5, double var6, double var8, double var10) {
      return this.func_109293_a(var1, var2, 10, var3, var4, 1, var5, var6, 1.0D, var8);
   }
}
