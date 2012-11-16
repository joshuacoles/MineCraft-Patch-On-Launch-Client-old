import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;

class C_100799_il extends Thread {

   // $FF: synthetic field
   final C_100797_ik field_109972_a;


   C_100799_il(C_100797_ik var1) {
      this.field_109972_a = var1;
   }

   public void run() {
      try {
         String var1 = (new BigInteger(C_100672_jk.func_109095_a(C_100797_ik.func_106990_a(this.field_109972_a), C_100797_ik.func_106995_b(this.field_109972_a).func_104899_F().getPublic(), C_100797_ik.func_106993_c(this.field_109972_a)))).toString(16);
         URL var2 = new URL("http://session.minecraft.net/game/checkserver.jsp?user=" + URLEncoder.encode(C_100797_ik.func_106997_d(this.field_109972_a), "UTF-8") + "&serverId=" + URLEncoder.encode(var1, "UTF-8"));
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String var4 = var3.readLine();
         var3.close();
         if(!"YES".equals(var4)) {
            this.field_109972_a.func_106991_a("Failed to verify username!");
            return;
         }

         C_100797_ik.func_106989_a(this.field_109972_a, true);
      } catch (Exception var5) {
         this.field_109972_a.func_106991_a("Failed to verify username! [internal error " + var5 + "]");
         var5.printStackTrace();
      }

   }
}
