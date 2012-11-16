import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C_100817_ji {

   public static C_100817_ji field_110003_a = new C_100817_ji();
   private Map field_110002_b = new HashMap();


   private C_100817_ji() {
      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(C_100817_ji.class.getResourceAsStream("/achievement/map.txt")));

         String var2;
         while((var2 = var1.readLine()) != null) {
            String[] var3 = var2.split(",");
            int var4 = Integer.parseInt(var3[0]);
            this.field_110002_b.put(Integer.valueOf(var4), var3[1]);
         }

         var1.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static String func_110001_a(int var0) {
      return (String)field_110003_a.field_110002_b.get(Integer.valueOf(var0));
   }

}
