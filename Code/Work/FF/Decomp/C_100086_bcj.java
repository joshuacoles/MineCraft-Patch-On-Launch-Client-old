import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100086_bcj extends Thread {

   private static Logger field_105659_a = Logger.getLogger("Minecraft");
   private final String field_105657_b;
   private final DatagramSocket field_105658_c;
   private boolean field_105655_d = true;
   private final String field_105656_e;


   public C_100086_bcj(String var1, String var2) {
      super("LanServerPinger");
      this.field_105657_b = var1;
      this.field_105656_e = var2;
      this.setDaemon(true);
      this.field_105658_c = new DatagramSocket();
   }

   public void run() {
      String var1 = func_105654_a(this.field_105657_b, this.field_105656_e);
      byte[] var2 = var1.getBytes();

      while(!this.isInterrupted() && this.field_105655_d) {
         try {
            InetAddress var3 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, 4445);
            this.field_105658_c.send(var4);
         } catch (IOException var6) {
            field_105659_a.log(Level.WARNING, "LanServerPinger: " + var6.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var5) {
            ;
         }
      }

   }

   public void interrupt() {
      super.interrupt();
      this.field_105655_d = false;
   }

   public static String func_105654_a(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String func_105653_a(String var0) {
      int var1 = var0.indexOf("[MOTD]");
      if(var1 < 0) {
         return "missing no";
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[MOTD]".length());
         return var2 < var1?"missing no":var0.substring(var1 + "[MOTD]".length(), var2);
      }
   }

   public static String func_105652_b(String var0) {
      int var1 = var0.indexOf("[/MOTD]");
      if(var1 < 0) {
         return null;
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[/MOTD]".length());
         if(var2 >= 0) {
            return null;
         } else {
            int var3 = var0.indexOf("[AD]", var1 + "[/MOTD]".length());
            if(var3 < 0) {
               return null;
            } else {
               int var4 = var0.indexOf("[/AD]", var3 + "[AD]".length());
               return var4 < var3?null:var0.substring(var3 + "[AD]".length(), var4);
            }
         }
      }
   }

}
