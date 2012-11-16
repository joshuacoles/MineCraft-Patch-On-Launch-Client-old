import java.util.HashMap;
import java.util.Map;

public class C_100651_jw {

   public static boolean field_108940_a = true;
   private static final Map field_108938_b = new HashMap();
   private static final Map field_108939_c = new HashMap();
   private static final Object field_108937_d = new Object();


   public static void func_108936_a(int var0, long var1) {
      if(field_108940_a) {
         Object var3 = field_108937_d;
         synchronized(field_108937_d) {
            if(field_108938_b.containsKey(Integer.valueOf(var0))) {
               field_108938_b.put(Integer.valueOf(var0), Long.valueOf(((Long)field_108938_b.get(Integer.valueOf(var0))).longValue() + 1L));
               field_108939_c.put(Integer.valueOf(var0), Long.valueOf(((Long)field_108939_c.get(Integer.valueOf(var0))).longValue() + var1));
            } else {
               field_108938_b.put(Integer.valueOf(var0), Long.valueOf(1L));
               field_108939_c.put(Integer.valueOf(var0), Long.valueOf(var1));
            }

         }
      }
   }

}
