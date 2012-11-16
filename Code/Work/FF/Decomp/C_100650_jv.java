import java.util.Random;

public class C_100650_jv {

   private static float[] field_108935_a = new float[65536];


   public static final float func_108924_a(float var0) {
      return field_108935_a[(int)(var0 * 10430.378F) & '\uffff'];
   }

   public static final float func_108928_b(float var0) {
      return field_108935_a[(int)(var0 * 10430.378F + 16384.0F) & '\uffff'];
   }

   public static final float func_108913_c(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   public static final float func_108915_a(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static int func_108933_d(float var0) {
      int var1 = (int)var0;
      return var0 < (float)var1?var1 - 1:var1;
   }

   public static int func_108932_b(double var0) {
      return (int)(var0 + 1024.0D) - 1024;
   }

   public static int func_108910_c(double var0) {
      int var2 = (int)var0;
      return var0 < (double)var2?var2 - 1:var2;
   }

   public static long func_108922_d(double var0) {
      long var2 = (long)var0;
      return var0 < (double)var2?var2 - 1L:var2;
   }

   public static float func_108927_e(float var0) {
      return var0 >= 0.0F?var0:-var0;
   }

   public static int func_108912_a(int var0) {
      return var0 >= 0?var0:-var0;
   }

   public static int func_108921_f(float var0) {
      int var1 = (int)var0;
      return var0 > (float)var1?var1 + 1:var1;
   }

   public static int func_108934_f(double var0) {
      int var2 = (int)var0;
      return var0 > (double)var2?var2 + 1:var2;
   }

   public static int func_108923_a(int var0, int var1, int var2) {
      return var0 < var1?var1:(var0 > var2?var2:var0);
   }

   public static float func_108914_a(float var0, float var1, float var2) {
      return var0 < var1?var1:(var0 > var2?var2:var0);
   }

   public static double func_108925_a(double var0, double var2) {
      if(var0 < 0.0D) {
         var0 = -var0;
      }

      if(var2 < 0.0D) {
         var2 = -var2;
      }

      return var0 > var2?var0:var2;
   }

   public static int func_108917_a(int var0, int var1) {
      return var0 < 0?-((-var0 - 1) / var1) - 1:var0 / var1;
   }

   public static boolean func_108930_a(String var0) {
      return var0 == null || var0.length() == 0;
   }

   public static int func_108929_a(Random var0, int var1, int var2) {
      return var1 >= var2?var1:var0.nextInt(var2 - var1 + 1) + var1;
   }

   public static double func_108931_a(Random var0, double var1, double var3) {
      return var1 >= var3?var1:var0.nextDouble() * (var3 - var1) + var1;
   }

   public static double func_108909_a(long[] var0) {
      long var1 = 0L;
      long[] var3 = var0;
      int var4 = var0.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         long var6 = var3[var5];
         var1 += var6;
      }

      return (double)var1 / (double)var0.length;
   }

   public static float func_108920_g(float var0) {
      var0 %= 360.0F;
      if(var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if(var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static double func_108918_g(double var0) {
      var0 %= 360.0D;
      if(var0 >= 180.0D) {
         var0 -= 360.0D;
      }

      if(var0 < -180.0D) {
         var0 += 360.0D;
      }

      return var0;
   }

   public static int func_108926_a(String var0, int var1) {
      int var2 = var1;

      try {
         var2 = Integer.parseInt(var0);
      } catch (Throwable var4) {
         ;
      }

      return var2;
   }

   public static int func_108919_a(String var0, int var1, int var2) {
      int var3 = var1;

      try {
         var3 = Integer.parseInt(var0);
      } catch (Throwable var5) {
         ;
      }

      if(var3 < var2) {
         var3 = var2;
      }

      return var3;
   }

   public static double func_108911_a(String var0, double var1) {
      double var3 = var1;

      try {
         var3 = Double.parseDouble(var0);
      } catch (Throwable var6) {
         ;
      }

      return var3;
   }

   public static double func_108916_a(String var0, double var1, double var3) {
      double var5 = var1;

      try {
         var5 = Double.parseDouble(var0);
      } catch (Throwable var8) {
         ;
      }

      if(var5 < var3) {
         var5 = var3;
      }

      return var5;
   }

   static {
      for(int var0 = 0; var0 < 65536; ++var0) {
         field_108935_a[var0] = (float)Math.sin((double)var0 * 3.141592653589793D * 2.0D / 65536.0D);
      }

   }
}
