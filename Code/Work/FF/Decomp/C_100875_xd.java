
public class C_100875_xd {

   private static int[] field_110399_a = new int[65536];


   public static void func_110397_a(int[] var0) {
      field_110399_a = var0;
   }

   public static int func_110398_a(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return field_110399_a[var5 << 8 | var4];
   }

}
