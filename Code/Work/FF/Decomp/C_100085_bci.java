import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C_100085_bci {

   private ArrayList field_105650_b = new ArrayList();
   boolean field_105651_a;


   public synchronized boolean func_105648_a() {
      return this.field_105651_a;
   }

   public synchronized void func_105647_b() {
      this.field_105651_a = false;
   }

   public synchronized List func_105649_c() {
      return Collections.unmodifiableList(this.field_105650_b);
   }

   public synchronized void func_105646_a(String var1, InetAddress var2) {
      String var3 = C_100086_bcj.func_105653_a(var1);
      String var4 = C_100086_bcj.func_105652_b(var1);
      if(var4 != null) {
         boolean var5 = false;
         Iterator var6 = this.field_105650_b.iterator();

         while(var6.hasNext()) {
            C_100095_bcg var7 = (C_100095_bcg)var6.next();
            if(var7.func_105764_b().equals(var4)) {
               var7.func_105765_c();
               var5 = true;
               break;
            }
         }

         if(!var5) {
            this.field_105650_b.add(new C_100095_bcg(var3, var4));
            this.field_105651_a = true;
         }

      }
   }
}
