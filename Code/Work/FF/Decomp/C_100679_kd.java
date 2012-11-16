import java.util.regex.Pattern;

public class C_100679_kd {

   private static final Pattern field_109123_a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");


   public static String func_109121_a(int var0) {
      int var1 = var0 / 20;
      int var2 = var1 / 60;
      var1 %= 60;
      return var1 < 10?var2 + ":0" + var1:var2 + ":" + var1;
   }

   public static String func_109122_a(String var0) {
      return field_109123_a.matcher(var0).replaceAll("");
   }

}
