import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C_101305_zm {

   private static final Map field_112442_a = new HashMap();


   public static synchronized C_101301_zk func_112438_a(File var0, int var1, int var2) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      Reference var5 = (Reference)field_112442_a.get(var4);
      C_101301_zk var6;
      if(var5 != null) {
         var6 = (C_101301_zk)var5.get();
         if(var6 != null) {
            return var6;
         }
      }

      if(!var3.exists()) {
         var3.mkdirs();
      }

      if(field_112442_a.size() >= 256) {
         func_112440_a();
      }

      var6 = new C_101301_zk(var4);
      field_112442_a.put(var4, new SoftReference(var6));
      return var6;
   }

   public static synchronized void func_112440_a() {
      Iterator var0 = field_112442_a.values().iterator();

      while(var0.hasNext()) {
         Reference var1 = (Reference)var0.next();

         try {
            C_101301_zk var2 = (C_101301_zk)var1.get();
            if(var2 != null) {
               var2.func_112412_c();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      field_112442_a.clear();
   }

   public static DataInputStream func_112439_c(File var0, int var1, int var2) {
      C_101301_zk var3 = func_112438_a(var0, var1, var2);
      return var3.func_112408_a(var1 & 31, var2 & 31);
   }

   public static DataOutputStream func_112441_d(File var0, int var1, int var2) {
      C_101301_zk var3 = func_112438_a(var0, var1, var2);
      return var3.func_112414_b(var1 & 31, var2 & 31);
   }

}
