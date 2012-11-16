import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class C_100789_iw extends C_100780_ir {

   private int field_109885_g;
   private int field_109889_h;
   private String field_109890_i;
   private ServerSocket field_109887_j = null;
   private String field_109888_k;
   private Map field_109886_l;


   public C_100789_iw(C_100124_gf var1) {
      super(var1);
      this.field_109885_g = var1.func_105016_a("rcon.port", 0);
      this.field_109888_k = var1.func_105019_a("rcon.password", "");
      this.field_109890_i = var1.func_104868_u();
      this.field_109889_h = var1.func_104957_v();
      if(0 == this.field_109885_g) {
         this.field_109885_g = this.field_109889_h + 10;
         this.func_109839_b("Setting default rcon port to " + this.field_109885_g);
         var1.func_105017_a("rcon.port", Integer.valueOf(this.field_109885_g));
         if(0 == this.field_109888_k.length()) {
            var1.func_105017_a("rcon.password", "");
         }

         var1.func_105015_a();
      }

      if(0 == this.field_109890_i.length()) {
         this.field_109890_i = "0.0.0.0";
      }

      this.func_109884_f();
      this.field_109887_j = null;
   }

   private void func_109884_f() {
      this.field_109886_l = new HashMap();
   }

   private void func_109883_g() {
      Iterator var1 = this.field_109886_l.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if(!((C_100786_iu)var2.getValue()).func_109843_c()) {
            var1.remove();
         }
      }

   }

   public void run() {
      this.func_109839_b("RCON running on " + this.field_109890_i + ":" + this.field_109885_g);

      try {
         while(this.field_109849_a) {
            try {
               Socket var1 = this.field_109887_j.accept();
               var1.setSoTimeout(500);
               C_100786_iu var2 = new C_100786_iu(this.field_109847_b, var1);
               var2.func_109832_a();
               this.field_109886_l.put(var1.getRemoteSocketAddress(), var2);
               this.func_109883_g();
            } catch (SocketTimeoutException var7) {
               this.func_109883_g();
            } catch (IOException var8) {
               if(this.field_109849_a) {
                  this.func_109839_b("IO: " + var8.getMessage());
               }
            }
         }
      } finally {
         this.func_109838_b(this.field_109887_j);
      }

   }

   public void func_109832_a() {
      if(0 == this.field_109888_k.length()) {
         this.func_109836_c("No rcon password set in \'" + this.field_109847_b.func_105018_b_() + "\', rcon disabled!");
      } else if(0 < this.field_109885_g && '\uffff' >= this.field_109885_g) {
         if(!this.field_109849_a) {
            try {
               this.field_109887_j = new ServerSocket(this.field_109885_g, 0, InetAddress.getByName(this.field_109890_i));
               this.field_109887_j.setSoTimeout(500);
               super.func_109832_a();
            } catch (IOException var2) {
               this.func_109836_c("Unable to initialise rcon on " + this.field_109890_i + ":" + this.field_109885_g + " : " + var2.getMessage());
            }

         }
      } else {
         this.func_109836_c("Invalid rcon port " + this.field_109885_g + " found in \'" + this.field_109847_b.func_105018_b_() + "\', rcon disabled!");
      }
   }
}
