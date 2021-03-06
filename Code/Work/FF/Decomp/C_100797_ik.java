import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100797_ik extends C_100221_dy {

   private byte[] field_107000_d;
   public static Logger field_107004_a = Logger.getLogger("Minecraft");
   private static Random field_107001_e = new Random();
   public C_100325_bx field_107002_b;
   public boolean field_107003_c = false;
   private C_101445_MinecraftServer field_106998_f;
   private int field_106999_g = 0;
   private String field_107007_h = null;
   private volatile boolean field_107008_i = false;
   private String field_107005_j = "";
   private SecretKey field_107006_k = null;


   public C_100797_ik(C_101445_MinecraftServer var1, Socket var2, String var3) {
      this.field_106998_f = var1;
      this.field_107002_b = new C_100325_bx(var2, var3, this, var1.func_104899_F().getPrivate());
      this.field_107002_b.field_107444_e = 0;
   }

   public void func_106996_c() {
      if(this.field_107008_i) {
         this.func_106994_d();
      }

      if(this.field_106999_g++ == 600) {
         this.func_106991_a("Took too long to log in");
      } else {
         this.field_107002_b.func_107419_b();
      }

   }

   public void func_106991_a(String var1) {
      try {
         field_107004_a.info("Disconnecting " + this.func_106992_e() + ": " + var1);
         this.field_107002_b.func_107413_a(new C_100365_db(var1));
         this.field_107002_b.func_107414_d();
         this.field_107003_c = true;
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void func_106923_a(C_100384_cq var1) {
      this.field_107007_h = var1.func_106813_f();
      if(!this.field_107007_h.equals(C_100679_kd.func_109122_a(this.field_107007_h))) {
         this.func_106991_a("Invalid username!");
      } else {
         PublicKey var2 = this.field_106998_f.func_104899_F().getPublic();
         if(var1.func_106812_d() != 47) {
            if(var1.func_106812_d() > 47) {
               this.func_106991_a("Outdated server!");
            } else {
               this.func_106991_a("Outdated client!");
            }

         } else {
            this.field_107005_j = this.field_106998_f.func_104950_U()?Long.toString(field_107001_e.nextLong(), 16):"-";
            this.field_107000_d = new byte[4];
            field_107001_e.nextBytes(this.field_107000_d);
            this.field_107002_b.func_107413_a(new C_100293_ei(this.field_107005_j, var2, this.field_107000_d));
         }
      }
   }

   public void func_106956_a(C_100303_et var1) {
      PrivateKey var2 = this.field_106998_f.func_104899_F().getPrivate();
      this.field_107006_k = var1.func_106767_a(var2);
      if(!Arrays.equals(this.field_107000_d, var1.func_106766_b(var2))) {
         this.func_106991_a("Invalid client reply");
      }

      this.field_107002_b.func_107413_a(new C_100303_et());
   }

   public void func_106925_a(C_100388_co var1) {
      if(var1.field_106821_a == 0) {
         if(this.field_106998_f.func_104950_U()) {
            (new C_100799_il(this)).start();
         } else {
            this.field_107008_i = true;
         }
      }

   }

   public void func_106928_a(C_100252_do var1) {}

   public void func_106994_d() {
      String var1 = this.field_106998_f.func_104931_ad().func_105718_a(this.field_107002_b.func_107420_c(), this.field_107007_h);
      if(var1 != null) {
         this.func_106991_a(var1);
      } else {
         C_100762_ih var2 = this.field_106998_f.func_104931_ad().func_105707_a(this.field_107007_h);
         if(var2 != null) {
            this.field_106998_f.func_104931_ad().func_105738_a(this.field_107002_b, var2);
         }
      }

      this.field_107003_c = true;
   }

   public void func_106986_a(String var1, Object[] var2) {
      field_107004_a.info(this.func_106992_e() + " lost connection");
      this.field_107003_c = true;
   }

   public void func_106946_a(C_100238_dg var1) {
      try {
         C_100122_ge var2 = this.field_106998_f.func_104931_ad();
         String var3 = null;
         if(var1.field_106607_a == 1) {
            List var4 = Arrays.asList(new Serializable[]{Integer.valueOf(1), Integer.valueOf(47), this.field_106998_f.func_104895_x(), this.field_106998_f.func_104901_aa(), Integer.valueOf(var2.func_105714_k()), Integer.valueOf(var2.func_105691_l())});

            Object var6;
            for(Iterator var5 = var4.iterator(); var5.hasNext(); var3 = var3 + var6.toString().replaceAll(" ", "")) {
               var6 = var5.next();
               if(var3 == null) {
                  var3 = "§";
               } else {
                  var3 = var3 + " ";
               }
            }
         } else {
            var3 = this.field_106998_f.func_104901_aa() + "§" + var2.func_105714_k() + "§" + var2.func_105691_l();
         }

         InetAddress var8 = null;
         if(this.field_107002_b.func_107430_g() != null) {
            var8 = this.field_107002_b.func_107430_g().getInetAddress();
         }

         this.field_107002_b.func_107413_a(new C_100365_db(var3));
         this.field_107002_b.func_107414_d();
         if(var8 != null && this.field_106998_f.func_104898_ae() instanceof C_100745_hk) {
            ((C_100745_hk)this.field_106998_f.func_104898_ae()).func_105780_a(var8);
         }

         this.field_107003_c = true;
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public void func_106985_a(C_100219_dx var1) {
      this.func_106991_a("Protocol error");
   }

   public String func_106992_e() {
      return this.field_107007_h != null?this.field_107007_h + " [" + this.field_107002_b.func_107420_c().toString() + "]":this.field_107002_b.func_107420_c().toString();
   }

   public boolean func_106958_a() {
      return true;
   }

   // $FF: synthetic method
   static String func_106990_a(C_100797_ik var0) {
      return var0.field_107005_j;
   }

   // $FF: synthetic method
   static C_101445_MinecraftServer func_106995_b(C_100797_ik var0) {
      return var0.field_106998_f;
   }

   // $FF: synthetic method
   static SecretKey func_106993_c(C_100797_ik var0) {
      return var0.field_107006_k;
   }

   // $FF: synthetic method
   static String func_106997_d(C_100797_ik var0) {
      return var0.field_107007_h;
   }

   // $FF: synthetic method
   static boolean func_106989_a(C_100797_ik var0, boolean var1) {
      return var0.field_107008_i = var1;
   }

}
