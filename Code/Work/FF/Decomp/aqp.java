import java.applet.Applet;
import java.applet.AppletStub;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class aqp extends Applet implements AppletStub {

   // $FF: synthetic field
   final Map field_111618_a;


   public aqp(Map var1) {
      this.field_111618_a = var1;
   }

   public void appletResize(int var1, int var2) {}

   public boolean isActive() {
      return true;
   }

   public URL getDocumentBase() {
      try {
         return new URL("http://www.minecraft.net/game/");
      } catch (MalformedURLException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public String getParameter(String var1) {
      if(this.field_111618_a.containsKey(var1)) {
         return (String)this.field_111618_a.get(var1);
      } else {
         System.err.println("Client asked for parameter: " + var1);
         return null;
      }
   }
}
