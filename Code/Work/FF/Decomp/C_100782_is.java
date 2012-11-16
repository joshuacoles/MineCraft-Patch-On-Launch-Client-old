import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class C_100782_is extends C_100780_ir {

   private long field_109859_g;
   private int field_109866_h;
   private int field_109867_i;
   private int field_109864_j;
   private String field_109865_k;
   private String field_109862_l;
   private DatagramSocket field_109863_m = null;
   private byte[] field_109860_n = new byte[1460];
   private DatagramPacket field_109861_o = null;
   private Map field_109874_p;
   private String field_109873_q;
   private String field_109872_r;
   private Map field_109871_s;
   private long field_109870_t;
   private C_100805_io field_109869_u;
   private long field_109868_v;


   public C_100782_is(C_100124_gf var1) {
      super(var1);
      this.field_109866_h = var1.func_105016_a("query.port", 0);
      this.field_109872_r = var1.func_104868_u();
      this.field_109867_i = var1.func_104957_v();
      this.field_109865_k = var1.func_104927_w();
      this.field_109864_j = var1.func_104885_z();
      this.field_109862_l = var1.func_104904_J();
      this.field_109868_v = 0L;
      this.field_109873_q = "0.0.0.0";
      if(0 != this.field_109872_r.length() && !this.field_109873_q.equals(this.field_109872_r)) {
         this.field_109873_q = this.field_109872_r;
      } else {
         this.field_109872_r = "0.0.0.0";

         try {
            InetAddress var2 = InetAddress.getLocalHost();
            this.field_109873_q = var2.getHostAddress();
         } catch (UnknownHostException var3) {
            this.func_109836_c("Unable to determine local host IP, please set server-ip in \'" + var1.func_105018_b_() + "\' : " + var3.getMessage());
         }
      }

      if(0 == this.field_109866_h) {
         this.field_109866_h = this.field_109867_i;
         this.func_109839_b("Setting default query port to " + this.field_109866_h);
         var1.func_105017_a("query.port", Integer.valueOf(this.field_109866_h));
         var1.func_105017_a("debug", Boolean.valueOf(false));
         var1.func_105015_a();
      }

      this.field_109874_p = new HashMap();
      this.field_109869_u = new C_100805_io(1460);
      this.field_109871_s = new HashMap();
      this.field_109870_t = (new Date()).getTime();
   }

   private void func_109850_a(byte[] var1, DatagramPacket var2) {
      this.field_109863_m.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private boolean func_109851_a(DatagramPacket var1) {
      byte[] var2 = var1.getData();
      int var3 = var1.getLength();
      SocketAddress var4 = var1.getSocketAddress();
      this.func_109837_a("Packet len " + var3 + " [" + var4 + "]");
      if(3 <= var3 && -2 == var2[0] && -3 == var2[1]) {
         this.func_109837_a("Packet \'" + C_100807_ip.func_109983_a(var2[2]) + "\' [" + var4 + "]");
         switch(var2[2]) {
         case 0:
            if(!this.func_109857_c(var1).booleanValue()) {
               this.func_109837_a("Invalid challenge [" + var4 + "]");
               return false;
            } else if(15 == var3) {
               this.func_109850_a(this.func_109854_b(var1), var1);
               this.func_109837_a("Rules [" + var4 + "]");
            } else {
               C_100805_io var5 = new C_100805_io(1460);
               var5.func_109973_a(0);
               var5.func_109976_a(this.func_109855_a(var1.getSocketAddress()));
               var5.func_109977_a(this.field_109865_k);
               var5.func_109977_a("SMP");
               var5.func_109977_a(this.field_109862_l);
               var5.func_109977_a(Integer.toString(this.func_109833_d()));
               var5.func_109977_a(Integer.toString(this.field_109864_j));
               var5.func_109974_a((short)this.field_109867_i);
               var5.func_109977_a(this.field_109873_q);
               this.func_109850_a(var5.func_109978_a(), var1);
               this.func_109837_a("Status [" + var4 + "]");
            }
         case 9:
            this.func_109852_d(var1);
            this.func_109837_a("Challenge [" + var4 + "]");
            return true;
         default:
            return true;
         }
      } else {
         this.func_109837_a("Invalid packet [" + var4 + "]");
         return false;
      }
   }

   private byte[] func_109854_b(DatagramPacket var1) {
      long var2 = System.currentTimeMillis();
      if(var2 < this.field_109868_v + 5000L) {
         byte[] var7 = this.field_109869_u.func_109978_a();
         byte[] var8 = this.func_109855_a(var1.getSocketAddress());
         var7[1] = var8[0];
         var7[2] = var8[1];
         var7[3] = var8[2];
         var7[4] = var8[3];
         return var7;
      } else {
         this.field_109868_v = var2;
         this.field_109869_u.func_109975_b();
         this.field_109869_u.func_109973_a(0);
         this.field_109869_u.func_109976_a(this.func_109855_a(var1.getSocketAddress()));
         this.field_109869_u.func_109977_a("splitnum");
         this.field_109869_u.func_109973_a(128);
         this.field_109869_u.func_109973_a(0);
         this.field_109869_u.func_109977_a("hostname");
         this.field_109869_u.func_109977_a(this.field_109865_k);
         this.field_109869_u.func_109977_a("gametype");
         this.field_109869_u.func_109977_a("SMP");
         this.field_109869_u.func_109977_a("game_id");
         this.field_109869_u.func_109977_a("MINECRAFT");
         this.field_109869_u.func_109977_a("version");
         this.field_109869_u.func_109977_a(this.field_109847_b.func_104895_x());
         this.field_109869_u.func_109977_a("plugins");
         this.field_109869_u.func_109977_a(this.field_109847_b.func_104892_B());
         this.field_109869_u.func_109977_a("map");
         this.field_109869_u.func_109977_a(this.field_109862_l);
         this.field_109869_u.func_109977_a("numplayers");
         this.field_109869_u.func_109977_a("" + this.func_109833_d());
         this.field_109869_u.func_109977_a("maxplayers");
         this.field_109869_u.func_109977_a("" + this.field_109864_j);
         this.field_109869_u.func_109977_a("hostport");
         this.field_109869_u.func_109977_a("" + this.field_109867_i);
         this.field_109869_u.func_109977_a("hostip");
         this.field_109869_u.func_109977_a(this.field_109873_q);
         this.field_109869_u.func_109973_a(0);
         this.field_109869_u.func_109973_a(1);
         this.field_109869_u.func_109977_a("player_");
         this.field_109869_u.func_109973_a(0);
         String[] var4 = this.field_109847_b.func_104890_A();
         byte var5 = (byte)var4.length;

         for(byte var6 = (byte)(var5 - 1); var6 >= 0; --var6) {
            this.field_109869_u.func_109977_a(var4[var6]);
         }

         this.field_109869_u.func_109973_a(0);
         return this.field_109869_u.func_109978_a();
      }
   }

   private byte[] func_109855_a(SocketAddress var1) {
      return ((C_100784_it)this.field_109871_s.get(var1)).func_109891_c();
   }

   private Boolean func_109857_c(DatagramPacket var1) {
      SocketAddress var2 = var1.getSocketAddress();
      if(!this.field_109871_s.containsKey(var2)) {
         return Boolean.valueOf(false);
      } else {
         byte[] var3 = var1.getData();
         return ((C_100784_it)this.field_109871_s.get(var2)).func_109892_a() != C_100807_ip.func_109984_c(var3, 7, var1.getLength())?Boolean.valueOf(false):Boolean.valueOf(true);
      }
   }

   private void func_109852_d(DatagramPacket var1) {
      C_100784_it var2 = new C_100784_it(this, var1);
      this.field_109871_s.put(var1.getSocketAddress(), var2);
      this.func_109850_a(var2.func_109894_b(), var1);
   }

   private void func_109858_f() {
      if(this.field_109849_a) {
         long var1 = System.currentTimeMillis();
         if(var1 >= this.field_109859_g + 30000L) {
            this.field_109859_g = var1;
            Iterator var3 = this.field_109871_s.entrySet().iterator();

            while(var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               if(((C_100784_it)var4.getValue()).func_109893_a(var1).booleanValue()) {
                  var3.remove();
               }
            }

         }
      }
   }

   public void run() {
      this.func_109839_b("Query running on " + this.field_109872_r + ":" + this.field_109866_h);
      this.field_109859_g = System.currentTimeMillis();
      this.field_109861_o = new DatagramPacket(this.field_109860_n, this.field_109860_n.length);

      try {
         while(this.field_109849_a) {
            try {
               this.field_109863_m.receive(this.field_109861_o);
               this.func_109858_f();
               this.func_109851_a(this.field_109861_o);
            } catch (SocketTimeoutException var7) {
               this.func_109858_f();
            } catch (PortUnreachableException var8) {
               ;
            } catch (IOException var9) {
               this.func_109853_a(var9);
            }
         }
      } finally {
         this.func_109841_e();
      }

   }

   public void func_109832_a() {
      if(!this.field_109849_a) {
         if(0 < this.field_109866_h && '\uffff' >= this.field_109866_h) {
            if(this.func_109856_g()) {
               super.func_109832_a();
            }

         } else {
            this.func_109836_c("Invalid query port " + this.field_109866_h + " found in \'" + this.field_109847_b.func_105018_b_() + "\' (queries disabled)");
         }
      }
   }

   private void func_109853_a(Exception var1) {
      if(this.field_109849_a) {
         this.func_109836_c("Unexpected exception, buggy JRE? (" + var1.toString() + ")");
         if(!this.func_109856_g()) {
            this.func_109840_d("Failed to recover from buggy JRE, shutting down!");
            this.field_109849_a = false;
         }

      }
   }

   private boolean func_109856_g() {
      try {
         this.field_109863_m = new DatagramSocket(this.field_109866_h, InetAddress.getByName(this.field_109872_r));
         this.func_109831_a(this.field_109863_m);
         this.field_109863_m.setSoTimeout(500);
         return true;
      } catch (SocketException var2) {
         this.func_109836_c("Unable to initialise query system on " + this.field_109872_r + ":" + this.field_109866_h + " (Socket): " + var2.getMessage());
      } catch (UnknownHostException var3) {
         this.func_109836_c("Unable to initialise query system on " + this.field_109872_r + ":" + this.field_109866_h + " (Unknown Host): " + var3.getMessage());
      } catch (Exception var4) {
         this.func_109836_c("Unable to initialise query system on " + this.field_109872_r + ":" + this.field_109866_h + " (E): " + var4.getMessage());
      }

      return false;
   }
}
