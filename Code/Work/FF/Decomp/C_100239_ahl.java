import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C_100239_ahl implements Runnable {

   public static final C_100239_ahl field_107086_a = new C_100239_ahl();
   private List field_107084_b = Collections.synchronizedList(new ArrayList());
   private volatile long field_107085_c = 0L;
   private volatile long field_107082_d = 0L;
   private volatile boolean field_107083_e = false;


   private C_100239_ahl() {
      Thread var1 = new Thread(this, "File IO Thread");
      var1.setPriority(1);
      var1.start();
   }

   public void run() {
      this.func_107081_b();
   }

   private void func_107081_b() {
      for(int var1 = 0; var1 < this.field_107084_b.size(); ++var1) {
         C_100234_ahm var2 = (C_100234_ahm)this.field_107084_b.get(var1);
         boolean var3 = var2.func_107054_c();
         if(!var3) {
            this.field_107084_b.remove(var1--);
            ++this.field_107082_d;
         }

         try {
            Thread.sleep(this.field_107083_e?0L:10L);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }
      }

      if(this.field_107084_b.isEmpty()) {
         try {
            Thread.sleep(25L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void func_107079_a(C_100234_ahm var1) {
      if(!this.field_107084_b.contains(var1)) {
         ++this.field_107085_c;
         this.field_107084_b.add(var1);
      }
   }

   public void func_107080_a() {
      this.field_107083_e = true;

      while(this.field_107085_c != this.field_107082_d) {
         Thread.sleep(10L);
      }

      this.field_107083_e = false;
   }

}
