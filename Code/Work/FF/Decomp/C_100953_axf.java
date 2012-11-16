import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class C_100953_axf {

   private final String field_111146_a;
   private final int field_111145_b;


   private C_100953_axf(String var1, int var2) {
      this.field_111146_a = var1;
      this.field_111145_b = var2;
   }

   public String func_111140_a() {
      return this.field_111146_a;
   }

   public int func_111144_b() {
      return this.field_111145_b;
   }

   public static C_100953_axf func_111142_a(String var0) {
      if(var0 == null) {
         return null;
      } else {
         String[] var1 = var0.split(":");
         if(var0.startsWith("[")) {
            int var2 = var0.indexOf("]");
            if(var2 > 0) {
               String var3 = var0.substring(1, var2);
               String var4 = var0.substring(var2 + 1).trim();
               if(var4.startsWith(":") && var4.length() > 0) {
                  var4 = var4.substring(1);
                  var1 = new String[]{var3, var4};
               } else {
                  var1 = new String[]{var3};
               }
            }
         }

         if(var1.length > 2) {
            var1 = new String[]{var0};
         }

         String var5 = var1[0];
         int var6 = var1.length > 1?func_111141_a(var1[1], 25565):25565;
         if(var6 == 25565) {
            String[] var7 = func_111143_b(var5);
            var5 = var7[0];
            var6 = func_111141_a(var7[1], 25565);
         }

         return new C_100953_axf(var5, var6);
      }
   }

   private static String[] func_111143_b(String var0) {
      try {
         Hashtable var1 = new Hashtable();
         var1.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         var1.put("java.naming.provider.url", "dns:");
         InitialDirContext var2 = new InitialDirContext(var1);
         Attributes var3 = var2.getAttributes("_minecraft._tcp." + var0, new String[]{"SRV"});
         String[] var4 = var3.get("srv").get().toString().split(" ", 4);
         return new String[]{var4[3], var4[2]};
      } catch (Throwable var5) {
         return new String[]{var0, Integer.toString(25565)};
      }
   }

   private static int func_111141_a(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }
}
