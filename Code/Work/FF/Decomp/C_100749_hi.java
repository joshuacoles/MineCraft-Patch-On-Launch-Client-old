import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C_100749_hi extends Thread {

   // $FF: synthetic field
   final C_100170_hg field_109638_a;


   C_100749_hi(C_100170_hg var1) {
      this.field_109638_a = var1;
   }

   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));

      String var2;
      try {
         while(!this.field_109638_a.func_104915_ac() && this.field_109638_a.func_104941_m() && (var2 = var1.readLine()) != null) {
            this.field_109638_a.func_105022_a(var2, this.field_109638_a);
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
