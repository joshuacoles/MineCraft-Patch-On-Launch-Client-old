import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100143_fi {

   public static Logger field_106516_a = Logger.getLogger("Minecraft");


   public static void func_106515_a() {
      C_100134_fj var0 = new C_100134_fj();
      field_106516_a.setUseParentHandlers(false);
      ConsoleHandler var1 = new ConsoleHandler();
      var1.setFormatter(var0);
      field_106516_a.addHandler(var1);

      try {
         FileHandler var2 = new FileHandler("server.log", true);
         var2.setFormatter(var0);
         field_106516_a.addHandler(var2);
      } catch (Exception var3) {
         field_106516_a.log(Level.WARNING, "Failed to log to server.log", var3);
      }

   }

}
