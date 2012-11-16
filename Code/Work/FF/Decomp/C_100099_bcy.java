import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C_100099_bcy {

   private Random field_105798_c = new Random();
   private Map field_105795_d = new HashMap();
   private List field_105796_e = new ArrayList();
   public int field_105799_a = 0;
   public boolean field_105797_b = true;


   public C_100106_bcw func_105793_a(String var1, File var2) {
      try {
         String var3 = var1;
         var1 = var1.substring(0, var1.indexOf("."));
         if(this.field_105797_b) {
            while(Character.isDigit(var1.charAt(var1.length() - 1))) {
               var1 = var1.substring(0, var1.length() - 1);
            }
         }

         var1 = var1.replaceAll("/", ".");
         if(!this.field_105795_d.containsKey(var1)) {
            this.field_105795_d.put(var1, new ArrayList());
         }

         C_100106_bcw var4 = new C_100106_bcw(var3, var2.toURI().toURL());
         ((List)this.field_105795_d.get(var1)).add(var4);
         this.field_105796_e.add(var4);
         ++this.field_105799_a;
         return var4;
      } catch (MalformedURLException var5) {
         var5.printStackTrace();
         throw new RuntimeException(var5);
      }
   }

   public C_100106_bcw func_105794_a(String var1) {
      List var2 = (List)this.field_105795_d.get(var1);
      return var2 == null?null:(C_100106_bcw)var2.get(this.field_105798_c.nextInt(var2.size()));
   }

   public C_100106_bcw func_105792_a() {
      return this.field_105796_e.isEmpty()?null:(C_100106_bcw)this.field_105796_e.get(this.field_105798_c.nextInt(this.field_105796_e.size()));
   }
}
