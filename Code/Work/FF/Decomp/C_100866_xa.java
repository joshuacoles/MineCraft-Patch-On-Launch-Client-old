
public class C_100866_xa {

   private static int[] field_110298_a = new int[65536];


   public static void func_110294_a(int[] var0) {
      field_110298_a = var0;
   }

   public static int func_110297_a(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return field_110298_a[var5 << 8 | var4];
   }

   public static int func_110293_a() {
      return 6396257;
   }

   public static int func_110296_b() {
      return 8431445;
   }

   public static int func_110295_c() {
      return 4764952;
   }

}
