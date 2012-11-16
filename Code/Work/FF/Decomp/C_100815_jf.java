
final class C_100815_jf implements C_100814_jg {

   public String func_110000_a(int var1) {
      double var2 = (double)var1 / 100.0D;
      double var4 = var2 / 1000.0D;
      return var4 > 0.5D?C_100809_jc.func_109912_k().format(var4) + " km":(var2 > 0.5D?C_100809_jc.func_109912_k().format(var2) + " m":var1 + " cm");
   }
}
