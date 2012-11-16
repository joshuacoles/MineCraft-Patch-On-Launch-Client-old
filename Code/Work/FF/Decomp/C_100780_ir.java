import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class C_100780_ir implements Runnable {

   protected boolean field_109849_a = false;
   protected C_100124_gf field_109847_b;
   protected Thread field_109848_c;
   protected int field_109845_d = 5;
   protected List field_109846_e = new ArrayList();
   protected List field_109844_f = new ArrayList();


   C_100780_ir(C_100124_gf var1) {
      this.field_109847_b = var1;
      if(this.field_109847_b.func_104926_C()) {
         this.func_109836_c("Debugging is enabled, performance maybe reduced!");
      }

   }

   public synchronized void func_109832_a() {
      this.field_109848_c = new Thread(this);
      this.field_109848_c.start();
      this.field_109849_a = true;
   }

   public boolean func_109843_c() {
      return this.field_109849_a;
   }

   protected void func_109837_a(String var1) {
      this.field_109847_b.func_104878_j(var1);
   }

   protected void func_109839_b(String var1) {
      this.field_109847_b.func_104940_f(var1);
   }

   protected void func_109836_c(String var1) {
      this.field_109847_b.func_104922_g(var1);
   }

   protected void func_109840_d(String var1) {
      this.field_109847_b.func_104928_i(var1);
   }

   protected int func_109833_d() {
      return this.field_109847_b.func_104960_y();
   }

   protected void func_109831_a(DatagramSocket var1) {
      this.func_109837_a("registerSocket: " + var1);
      this.field_109846_e.add(var1);
   }

   protected boolean func_109834_a(DatagramSocket var1, boolean var2) {
      this.func_109837_a("closeSocket: " + var1);
      if(null == var1) {
         return false;
      } else {
         boolean var3 = false;
         if(!var1.isClosed()) {
            var1.close();
            var3 = true;
         }

         if(var2) {
            this.field_109846_e.remove(var1);
         }

         return var3;
      }
   }

   protected boolean func_109838_b(ServerSocket var1) {
      return this.func_109835_a(var1, true);
   }

   protected boolean func_109835_a(ServerSocket var1, boolean var2) {
      this.func_109837_a("closeSocket: " + var1);
      if(null == var1) {
         return false;
      } else {
         boolean var3 = false;

         try {
            if(!var1.isClosed()) {
               var1.close();
               var3 = true;
            }
         } catch (IOException var5) {
            this.func_109836_c("IO: " + var5.getMessage());
         }

         if(var2) {
            this.field_109844_f.remove(var1);
         }

         return var3;
      }
   }

   protected void func_109841_e() {
      this.func_109842_a(false);
   }

   protected void func_109842_a(boolean var1) {
      int var2 = 0;
      Iterator var3 = this.field_109846_e.iterator();

      while(var3.hasNext()) {
         DatagramSocket var4 = (DatagramSocket)var3.next();
         if(this.func_109834_a(var4, false)) {
            ++var2;
         }
      }

      this.field_109846_e.clear();
      var3 = this.field_109844_f.iterator();

      while(var3.hasNext()) {
         ServerSocket var5 = (ServerSocket)var3.next();
         if(this.func_109835_a(var5, false)) {
            ++var2;
         }
      }

      this.field_109844_f.clear();
      if(var1 && 0 < var2) {
         this.func_109836_c("Force closed " + var2 + " sockets");
      }

   }
}
