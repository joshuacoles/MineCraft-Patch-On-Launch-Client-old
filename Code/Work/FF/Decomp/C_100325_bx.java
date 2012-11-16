import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;

public class C_100325_bx implements C_100323_bv {

   public static AtomicInteger field_107447_a = new AtomicInteger();
   public static AtomicInteger field_107445_b = new AtomicInteger();
   private Object field_107454_h;
   private Socket field_107455_i;
   private final SocketAddress field_107452_j;
   private volatile DataInputStream field_107453_k;
   private volatile DataOutputStream field_107450_l;
   private volatile boolean field_107451_m;
   private volatile boolean field_107448_n;
   private List field_107449_o;
   private List field_107463_p;
   private List field_107462_q;
   private C_100221_dy field_107461_r;
   private boolean field_107460_s;
   private Thread field_107459_t;
   private Thread field_107458_u;
   private String field_107457_v;
   private Object[] field_107456_w;
   private int field_107466_x;
   private int field_107465_y;
   public static int[] field_107446_c = new int[256];
   public static int[] field_107443_d = new int[256];
   public int field_107444_e;
   boolean field_107441_f;
   boolean field_107442_g;
   private SecretKey field_107464_z;
   private PrivateKey field_107439_A;
   private int field_107440_B;


   public C_100325_bx(Socket var1, String var2, C_100221_dy var3) {
      this(var1, var2, var3, (PrivateKey)null);
   }

   public C_100325_bx(Socket var1, String var2, C_100221_dy var3, PrivateKey var4) {
      this.field_107454_h = new Object();
      this.field_107451_m = true;
      this.field_107448_n = false;
      this.field_107449_o = Collections.synchronizedList(new ArrayList());
      this.field_107463_p = Collections.synchronizedList(new ArrayList());
      this.field_107462_q = Collections.synchronizedList(new ArrayList());
      this.field_107460_s = false;
      this.field_107457_v = "";
      this.field_107466_x = 0;
      this.field_107465_y = 0;
      this.field_107444_e = 0;
      this.field_107441_f = false;
      this.field_107442_g = false;
      this.field_107464_z = null;
      this.field_107439_A = null;
      this.field_107440_B = 50;
      this.field_107439_A = var4;
      this.field_107455_i = var1;
      this.field_107452_j = var1.getRemoteSocketAddress();
      this.field_107461_r = var3;

      try {
         var1.setSoTimeout(30000);
         var1.setTrafficClass(24);
      } catch (SocketException var6) {
         System.err.println(var6.getMessage());
      }

      this.field_107453_k = new DataInputStream(var1.getInputStream());
      this.field_107450_l = new DataOutputStream(new BufferedOutputStream(var1.getOutputStream(), 5120));
      this.field_107458_u = new C_100324_by(this, var2 + " read thread");
      this.field_107459_t = new C_100318_bz(this, var2 + " write thread");
      this.field_107458_u.start();
      this.field_107459_t.start();
   }

   public void func_107421_f() {
      this.func_107417_a();
      this.field_107459_t = null;
      this.field_107458_u = null;
   }

   public void func_107418_a(C_100221_dy var1) {
      this.field_107461_r = var1;
   }

   public void func_107413_a(C_100219_dx var1) {
      if(!this.field_107460_s) {
         Object var2 = this.field_107454_h;
         synchronized(this.field_107454_h) {
            this.field_107465_y += var1.func_106552_a() + 1;
            if(var1.field_106557_r) {
               this.field_107462_q.add(var1);
            } else {
               this.field_107463_p.add(var1);
            }

         }
      }
   }

   private boolean func_107434_h() {
      boolean var1 = false;

      try {
         C_100219_dx var2;
         int var10001;
         int[] var10000;
         if(this.field_107444_e == 0 || System.currentTimeMillis() - ((C_100219_dx)this.field_107463_p.get(0)).field_106565_m >= (long)this.field_107444_e) {
            var2 = this.func_107438_a(false);
            if(var2 != null) {
               C_100219_dx.func_106538_a(var2, this.field_107450_l);
               if(var2 instanceof C_100303_et && !this.field_107442_g) {
                  if(!this.field_107461_r.func_106958_a()) {
                     this.field_107464_z = ((C_100303_et)var2).func_106768_d();
                  }

                  this.func_107423_k();
               }

               var10000 = field_107443_d;
               var10001 = var2.func_106550_k();
               var10000[var10001] += var2.func_106552_a() + 1;
               var1 = true;
            }
         }

         if(this.field_107440_B-- <= 0 && (this.field_107444_e == 0 || System.currentTimeMillis() - ((C_100219_dx)this.field_107462_q.get(0)).field_106565_m >= (long)this.field_107444_e)) {
            var2 = this.func_107438_a(true);
            if(var2 != null) {
               C_100219_dx.func_106538_a(var2, this.field_107450_l);
               var10000 = field_107443_d;
               var10001 = var2.func_106550_k();
               var10000[var10001] += var2.func_106552_a() + 1;
               this.field_107440_B = 0;
               var1 = true;
            }
         }

         return var1;
      } catch (Exception var3) {
         if(!this.field_107448_n) {
            this.func_107432_a(var3);
         }

         return false;
      }
   }

   private C_100219_dx func_107438_a(boolean var1) {
      C_100219_dx var2 = null;
      List var3 = var1?this.field_107462_q:this.field_107463_p;
      Object var4 = this.field_107454_h;
      synchronized(this.field_107454_h) {
         while(!var3.isEmpty() && var2 == null) {
            var2 = (C_100219_dx)var3.remove(0);
            this.field_107465_y -= var2.func_106552_a() + 1;
            if(this.func_107424_a(var2, var1)) {
               var2 = null;
            }
         }

         return var2;
      }
   }

   private boolean func_107424_a(C_100219_dx var1, boolean var2) {
      if(!var1.func_106548_e()) {
         return false;
      } else {
         List var3 = var2?this.field_107462_q:this.field_107463_p;
         Iterator var4 = var3.iterator();

         C_100219_dx var5;
         do {
            if(!var4.hasNext()) {
               return false;
            }

            var5 = (C_100219_dx)var4.next();
         } while(var5.func_106550_k() != var1.func_106550_k());

         return var1.func_106542_a(var5);
      }
   }

   public void func_107417_a() {
      if(this.field_107458_u != null) {
         this.field_107458_u.interrupt();
      }

      if(this.field_107459_t != null) {
         this.field_107459_t.interrupt();
      }

   }

   private boolean func_107425_i() {
      boolean var1 = false;

      try {
         C_100219_dx var2 = C_100219_dx.func_106541_a(this.field_107453_k, this.field_107461_r.func_106958_a(), this.field_107455_i);
         if(var2 != null) {
            if(var2 instanceof C_100303_et && !this.field_107441_f) {
               if(this.field_107461_r.func_106958_a()) {
                  this.field_107464_z = ((C_100303_et)var2).func_106767_a(this.field_107439_A);
               }

               this.func_107426_j();
            }

            int[] var10000 = field_107446_c;
            int var10001 = var2.func_106550_k();
            var10000[var10001] += var2.func_106552_a() + 1;
            if(!this.field_107460_s) {
               if(var2.func_106547_a_() && this.field_107461_r.func_106933_b()) {
                  this.field_107466_x = 0;
                  var2.func_106539_a(this.field_107461_r);
               } else {
                  this.field_107449_o.add(var2);
               }
            }

            var1 = true;
         } else {
            this.func_107415_a("disconnect.endOfStream", new Object[0]);
         }

         return var1;
      } catch (Exception var3) {
         if(!this.field_107448_n) {
            this.func_107432_a(var3);
         }

         return false;
      }
   }

   private void func_107432_a(Exception var1) {
      var1.printStackTrace();
      this.func_107415_a("disconnect.genericReason", new Object[]{"Internal exception: " + var1.toString()});
   }

   public void func_107415_a(String var1, Object ... var2) {
      if(this.field_107451_m) {
         this.field_107448_n = true;
         this.field_107457_v = var1;
         this.field_107456_w = var2;
         this.field_107451_m = false;
         (new C_100315_ca(this)).start();

         try {
            this.field_107453_k.close();
            this.field_107453_k = null;
            this.field_107450_l.close();
            this.field_107450_l = null;
            this.field_107455_i.close();
            this.field_107455_i = null;
         } catch (Throwable var4) {
            ;
         }

      }
   }

   public void func_107419_b() {
      if(this.field_107465_y > 2097152) {
         this.func_107415_a("disconnect.overflow", new Object[0]);
      }

      if(this.field_107449_o.isEmpty()) {
         if(this.field_107466_x++ == 1200) {
            this.func_107415_a("disconnect.timeout", new Object[0]);
         }
      } else {
         this.field_107466_x = 0;
      }

      int var1 = 1000;

      while(!this.field_107449_o.isEmpty() && var1-- >= 0) {
         C_100219_dx var2 = (C_100219_dx)this.field_107449_o.remove(0);
         var2.func_106539_a(this.field_107461_r);
      }

      this.func_107417_a();
      if(this.field_107448_n && this.field_107449_o.isEmpty()) {
         this.field_107461_r.func_106986_a(this.field_107457_v, this.field_107456_w);
      }

   }

   public SocketAddress func_107420_c() {
      return this.field_107452_j;
   }

   public void func_107414_d() {
      if(!this.field_107460_s) {
         this.func_107417_a();
         this.field_107460_s = true;
         this.field_107458_u.interrupt();
         (new C_100313_cb(this)).start();
      }
   }

   private void func_107426_j() {
      this.field_107441_f = true;
      this.field_107453_k = new DataInputStream(C_100672_jk.func_109088_a(this.field_107464_z, this.field_107455_i.getInputStream()));
   }

   private void func_107423_k() {
      this.field_107450_l.flush();
      this.field_107442_g = true;
      this.field_107450_l = new DataOutputStream(new BufferedOutputStream(C_100672_jk.func_109097_a(this.field_107464_z, this.field_107455_i.getOutputStream()), 5120));
   }

   public int func_107416_e() {
      return this.field_107462_q.size();
   }

   public Socket func_107430_g() {
      return this.field_107455_i;
   }

   // $FF: synthetic method
   static boolean func_107436_a(C_100325_bx var0) {
      return var0.field_107451_m;
   }

   // $FF: synthetic method
   static boolean func_107427_b(C_100325_bx var0) {
      return var0.field_107460_s;
   }

   // $FF: synthetic method
   static boolean func_107431_c(C_100325_bx var0) {
      return var0.func_107425_i();
   }

   // $FF: synthetic method
   static boolean func_107428_d(C_100325_bx var0) {
      return var0.func_107434_h();
   }

   // $FF: synthetic method
   static DataOutputStream func_107422_e(C_100325_bx var0) {
      return var0.field_107450_l;
   }

   // $FF: synthetic method
   static boolean func_107433_f(C_100325_bx var0) {
      return var0.field_107448_n;
   }

   // $FF: synthetic method
   static void func_107429_a(C_100325_bx var0, Exception var1) {
      var0.func_107432_a(var1);
   }

   // $FF: synthetic method
   static Thread func_107435_g(C_100325_bx var0) {
      return var0.field_107458_u;
   }

   // $FF: synthetic method
   static Thread func_107437_h(C_100325_bx var0) {
      return var0.field_107459_t;
   }

}
