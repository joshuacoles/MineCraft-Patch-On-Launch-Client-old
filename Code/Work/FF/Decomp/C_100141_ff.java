import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100141_ff {

   private final C_100659_jp field_106514_a = new C_100659_jp();
   private final File field_106512_b;
   private boolean field_106513_c = true;


   public C_100141_ff(File var1) {
      this.field_106512_b = var1;
   }

   public boolean func_106509_b() {
      return this.field_106513_c;
   }

   public void func_106507_a(boolean var1) {
      this.field_106513_c = var1;
   }

   public Map func_106511_c() {
      this.func_106505_d();
      return this.field_106514_a;
   }

   public boolean func_106504_a(String var1) {
      if(!this.func_106509_b()) {
         return false;
      } else {
         this.func_106505_d();
         return this.field_106514_a.containsKey(var1);
      }
   }

   public void func_106503_a(C_100275_fe var1) {
      this.field_106514_a.func_109032_a(var1.func_107214_a(), var1);
      this.func_106510_f();
   }

   public void func_106508_b(String var1) {
      this.field_106514_a.remove(var1);
      this.func_106510_f();
   }

   public void func_106505_d() {
      Iterator var1 = this.field_106514_a.values().iterator();

      while(var1.hasNext()) {
         C_100275_fe var2 = (C_100275_fe)var1.next();
         if(var2.func_107211_e()) {
            var1.remove();
         }
      }

   }

   public void func_106506_e() {
      if(this.field_106512_b.isFile()) {
         BufferedReader var1;
         try {
            var1 = new BufferedReader(new FileReader(this.field_106512_b));
         } catch (FileNotFoundException var4) {
            throw new Error();
         }

         String var2;
         try {
            while((var2 = var1.readLine()) != null) {
               if(!var2.startsWith("#")) {
                  C_100275_fe var3 = C_100275_fe.func_107213_c(var2);
                  if(var3 != null) {
                     this.field_106514_a.func_109032_a(var3.func_107214_a(), var3);
                  }
               }
            }
         } catch (IOException var5) {
            Logger.getLogger("Minecraft").log(Level.SEVERE, "Could not load ban list", var5);
         }

      }
   }

   public void func_106510_f() {
      this.func_106502_b(true);
   }

   public void func_106502_b(boolean var1) {
      this.func_106505_d();

      try {
         PrintWriter var2 = new PrintWriter(new FileWriter(this.field_106512_b, false));
         if(var1) {
            var2.println("# Updated " + (new SimpleDateFormat()).format(new Date()) + " by Minecraft " + "1.4.2");
            var2.println("# victim name | ban date | banned by | banned until | reason");
            var2.println();
         }

         Iterator var3 = this.field_106514_a.values().iterator();

         while(var3.hasNext()) {
            C_100275_fe var4 = (C_100275_fe)var3.next();
            var2.println(var4.func_107215_g());
         }

         var2.close();
      } catch (IOException var5) {
         Logger.getLogger("Minecraft").log(Level.SEVERE, "Could not save ban list", var5);
      }

   }
}
