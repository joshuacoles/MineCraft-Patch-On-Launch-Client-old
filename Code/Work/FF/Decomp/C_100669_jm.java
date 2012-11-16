import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100669_jm {

   public static String func_109080_a(Map var0) {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = var0.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(var1.length() > 0) {
            var1.append('&');
         }

         try {
            var1.append(URLEncoder.encode((String)var3.getKey(), "UTF-8"));
         } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
         }

         if(var3.getValue() != null) {
            var1.append('=');

            try {
               var1.append(URLEncoder.encode(var3.getValue().toString(), "UTF-8"));
            } catch (UnsupportedEncodingException var5) {
               var5.printStackTrace();
            }
         }
      }

      return var1.toString();
   }

   public static String func_109084_a(URL var0, Map var1, boolean var2) {
      return func_109081_a(var0, func_109080_a(var1), var2);
   }

   public static String func_109081_a(URL var0, String var1, boolean var2) {
      try {
         HttpURLConnection var3 = (HttpURLConnection)var0.openConnection();
         var3.setRequestMethod("POST");
         var3.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         var3.setRequestProperty("Content-Length", "" + var1.getBytes().length);
         var3.setRequestProperty("Content-Language", "en-US");
         var3.setUseCaches(false);
         var3.setDoInput(true);
         var3.setDoOutput(true);
         DataOutputStream var4 = new DataOutputStream(var3.getOutputStream());
         var4.writeBytes(var1);
         var4.flush();
         var4.close();
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
         StringBuffer var7 = new StringBuffer();

         String var6;
         while((var6 = var5.readLine()) != null) {
            var7.append(var6);
            var7.append('\r');
         }

         var5.close();
         return var7.toString();
      } catch (Exception var8) {
         if(!var2) {
            Logger.getLogger("Minecraft").log(Level.SEVERE, "Could not post to " + var0, var8);
         }

         return "";
      }
   }

   public static void func_109079_a(File var0, String var1, C_100665_jo var2, Map var3, int var4, C_100683_ka var5) {
      Thread var6 = new Thread(new C_100663_jn(var5, var1, var3, var0, var2, var4));
      var6.setDaemon(true);
      var6.start();
   }

   public static int func_109082_a() {
      ServerSocket var0 = null;
      boolean var1 = true;

      int var10;
      try {
         var0 = new ServerSocket(0);
         var10 = var0.getLocalPort();
      } finally {
         try {
            if(var0 != null) {
               var0.close();
            }
         } catch (IOException var8) {
            ;
         }

      }

      return var10;
   }

   public static String[] func_109083_a(String var0, String var1) {
      HashMap var2 = new HashMap();
      var2.put("user", var0);
      var2.put("password", var1);
      var2.put("version", Integer.valueOf(13));

      String var3;
      try {
         var3 = func_109084_a(new URL("http://login.minecraft.net/"), var2, false);
      } catch (MalformedURLException var5) {
         var5.printStackTrace();
         return null;
      }

      if(var3 != null && var3.length() != 0) {
         if(!var3.contains(":")) {
            if(var3.trim().equals("Bad login")) {
               System.out.println("Login failed");
            } else if(var3.trim().equals("Old version")) {
               System.out.println("Outdated launcher");
            } else if(var3.trim().equals("User not premium")) {
               System.out.println(var3);
            } else {
               System.out.println(var3);
            }

            return null;
         } else {
            String[] var4 = var3.split(":");
            return new String[]{var4[2], var4[3]};
         }
      } else {
         System.out.println("Can\'t connect to minecraft.net");
         return null;
      }
   }
}
