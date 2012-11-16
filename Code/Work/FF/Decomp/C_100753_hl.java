import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100753_hl extends Thread {

   private static Logger field_109652_a = Logger.getLogger("Minecraft");
   private final List field_109650_b = Collections.synchronizedList(new ArrayList());
   private final HashMap field_109651_c = new HashMap();
   private int field_109648_d = 0;
   private final ServerSocket field_109649_e;
   private C_100803_in field_109646_f;
   private final InetAddress field_109647_g;
   private final int field_109653_h;


   public C_100753_hl(C_100803_in var1, InetAddress var2, int var3) {
      super("Listen thread");
      this.field_109646_f = var1;
      this.field_109647_g = var2;
      this.field_109653_h = var3;
      this.field_109649_e = new ServerSocket(var3, 0, var2);
      this.field_109649_e.setPerformancePreferences(0, 2, 1);
   }

   public void func_109641_a() {
      List var1 = this.field_109650_b;
      synchronized(this.field_109650_b) {
         for(int var2 = 0; var2 < this.field_109650_b.size(); ++var2) {
            C_100797_ik var3 = (C_100797_ik)this.field_109650_b.get(var2);

            try {
               var3.func_106996_c();
            } catch (Exception var6) {
               var3.func_106991_a("Internal server error");
               field_109652_a.log(Level.WARNING, "Failed to handle packet: " + var6, var6);
            }

            if(var3.field_107003_c) {
               this.field_109650_b.remove(var2--);
            }

            var3.field_107002_b.func_107417_a();
         }

      }
   }

   public void run() {
      while(this.field_109646_f.field_105777_b) {
         try {
            Socket var1 = this.field_109649_e.accept();
            InetAddress var2 = var1.getInetAddress();
            long var3 = System.currentTimeMillis();
            HashMap var5 = this.field_109651_c;
            synchronized(this.field_109651_c) {
               if(this.field_109651_c.containsKey(var2) && !func_109645_b(var2) && var3 - ((Long)this.field_109651_c.get(var2)).longValue() < 4000L) {
                  this.field_109651_c.put(var2, Long.valueOf(var3));
                  var1.close();
                  continue;
               }

               this.field_109651_c.put(var2, Long.valueOf(var3));
            }

            C_100797_ik var9 = new C_100797_ik(this.field_109646_f.func_105774_d(), var1, "Connection #" + this.field_109648_d++);
            this.func_109639_a(var9);
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      System.out.println("Closing listening thread");
   }

   private void func_109639_a(C_100797_ik var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Got null pendingconnection!");
      } else {
         List var2 = this.field_109650_b;
         synchronized(this.field_109650_b) {
            this.field_109650_b.add(var1);
         }
      }
   }

   private static boolean func_109645_b(InetAddress var0) {
      return "127.0.0.1".equals(var0.getHostAddress());
   }

   public void func_109644_a(InetAddress var1) {
      if(var1 != null) {
         HashMap var2 = this.field_109651_c;
         synchronized(this.field_109651_c) {
            this.field_109651_c.remove(var1);
         }
      }

   }

   public void func_109643_b() {
      try {
         this.field_109649_e.close();
      } catch (Throwable var2) {
         ;
      }

   }

   public InetAddress func_109642_c() {
      return this.field_109647_g;
   }

   public int func_109640_d() {
      return this.field_109653_h;
   }

}
