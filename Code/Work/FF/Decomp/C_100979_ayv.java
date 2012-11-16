import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class C_100979_ayv extends Thread {

   // $FF: synthetic field
   final String field_111218_a;
   // $FF: synthetic field
   final C_100977_ayw field_111216_b;
   // $FF: synthetic field
   final C_100981_ayu field_111217_c;


   C_100979_ayv(C_100981_ayu var1, String var2, C_100977_ayw var3) {
      this.field_111217_c = var1;
      this.field_111218_a = var2;
      this.field_111216_b = var3;
   }

   public void run() {
      HttpURLConnection var1 = null;

      try {
         URL var2 = new URL(this.field_111218_a);
         var1 = (HttpURLConnection)var2.openConnection();
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();
         if(var1.getResponseCode() / 100 == 4) {
            return;
         }

         if(this.field_111216_b == null) {
            this.field_111217_c.field_111222_a = ImageIO.read(var1.getInputStream());
         } else {
            this.field_111217_c.field_111222_a = this.field_111216_b.func_110263_a(ImageIO.read(var1.getInputStream()));
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.disconnect();
      }

   }
}
