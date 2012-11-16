import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.IllegalFormatException;
import java.util.Properties;
import java.util.TreeMap;

public class C_100361_be {

   private static C_100361_be field_107663_a = new C_100361_be("en_US");
   private Properties field_107661_b = new Properties();
   private TreeMap field_107662_c;
   private String field_107659_d;
   private boolean field_107660_e;


   public C_100361_be(String var1) {
      this.func_107653_e();
      this.func_107656_a(var1);
   }

   public static C_100361_be func_107654_a() {
      return field_107663_a;
   }

   private void func_107653_e() {
      TreeMap var1 = new TreeMap();

      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(C_100361_be.class.getResourceAsStream("/lang/languages.txt"), "UTF-8"));

         for(String var3 = var2.readLine(); var3 != null; var3 = var2.readLine()) {
            String[] var4 = var3.split("=");
            if(var4 != null && var4.length == 2) {
               var1.put(var4[0], var4[1]);
            }
         }
      } catch (IOException var5) {
         var5.printStackTrace();
         return;
      }

      this.field_107662_c = var1;
      this.field_107662_c.put("en_US", "English (US)");
   }

   public TreeMap func_107652_b() {
      return this.field_107662_c;
   }

   private void func_107658_a(Properties var1, String var2) {
      BufferedReader var3 = new BufferedReader(new InputStreamReader(C_100361_be.class.getResourceAsStream("/lang/" + var2 + ".lang"), "UTF-8"));

      for(String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
         var4 = var4.trim();
         if(!var4.startsWith("#")) {
            String[] var5 = var4.split("=");
            if(var5 != null && var5.length == 2) {
               var1.setProperty(var5[0], var5[1]);
            }
         }
      }

   }

   public void func_107656_a(String var1) {
      if(!var1.equals(this.field_107659_d)) {
         Properties var2 = new Properties();

         try {
            this.func_107658_a(var2, "en_US");
         } catch (IOException var8) {
            ;
         }

         this.field_107660_e = false;
         if(!"en_US".equals(var1)) {
            try {
               this.func_107658_a(var2, var1);
               Enumeration var3 = var2.propertyNames();

               while(var3.hasMoreElements() && !this.field_107660_e) {
                  Object var4 = var3.nextElement();
                  Object var5 = var2.get(var4);
                  if(var5 != null) {
                     String var6 = var5.toString();

                     for(int var7 = 0; var7 < var6.length(); ++var7) {
                        if(var6.charAt(var7) >= 256) {
                           this.field_107660_e = true;
                           break;
                        }
                     }
                  }
               }
            } catch (IOException var9) {
               var9.printStackTrace();
               return;
            }
         }

         this.field_107659_d = var1;
         this.field_107661_b = var2;
      }
   }

   public String func_107657_c() {
      return this.field_107659_d;
   }

   public boolean func_107650_d() {
      return this.field_107660_e;
   }

   public String func_107651_b(String var1) {
      return this.field_107661_b.getProperty(var1, var1);
   }

   public String func_107649_a(String var1, Object ... var2) {
      String var3 = this.field_107661_b.getProperty(var1, var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   public String func_107655_c(String var1) {
      return this.field_107661_b.getProperty(var1 + ".name", "");
   }

   public static boolean func_107648_e(String var0) {
      return "ar_SA".equals(var0) || "he_IL".equals(var0);
   }

}
