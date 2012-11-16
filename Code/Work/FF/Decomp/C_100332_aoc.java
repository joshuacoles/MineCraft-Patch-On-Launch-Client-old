
public final class C_100332_aoc {

   public static String func_107558_a(String var0) {
      boolean var1 = false;
      char[] var2 = var0.toCharArray();

      for(int var3 = 0; var3 != var2.length; ++var3) {
         char var4 = var2[var3];
         if(65 <= var4 && 90 >= var4) {
            var1 = true;
            var2[var3] = (char)(var4 - 65 + 97);
         }
      }

      if(var1) {
         return new String(var2);
      } else {
         return var0;
      }
   }
}
