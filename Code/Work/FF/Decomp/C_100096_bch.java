import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class C_100096_bch extends Thread {

   private final C_100085_bci field_105771_a;
   private final InetAddress field_105769_b;
   private final MulticastSocket field_105770_c;


   public C_100096_bch(C_100085_bci var1) {
      super("LanServerDetector");
      this.field_105771_a = var1;
      this.setDaemon(true);
      this.field_105770_c = new MulticastSocket(4445);
      this.field_105769_b = InetAddress.getByName("224.0.2.60");
      this.field_105770_c.setSoTimeout(5000);
      this.field_105770_c.joinGroup(this.field_105769_b);
   }

   public void run() {
      byte[] var2 = new byte[1024];

      while(!this.isInterrupted()) {
         DatagramPacket var1 = new DatagramPacket(var2, var2.length);

         try {
            this.field_105770_c.receive(var1);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            var6.printStackTrace();
            break;
         }

         String var3 = new String(var1.getData(), var1.getOffset(), var1.getLength());
         System.out.println(var1.getAddress() + ": " + var3);
         this.field_105771_a.func_105646_a(var3, var1.getAddress());
      }

      try {
         this.field_105770_c.leaveGroup(this.field_105769_b);
      } catch (IOException var4) {
         ;
      }

      this.field_105770_c.close();
   }
}
