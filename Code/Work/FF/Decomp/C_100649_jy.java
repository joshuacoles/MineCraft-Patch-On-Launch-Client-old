import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C_100649_jy {

   private final List field_108906_b = new ArrayList();
   private final List field_108907_c = new ArrayList();
   public boolean field_108908_a = false;
   private String field_108904_d = "";
   private final Map field_108905_e = new HashMap();


   public void func_108898_a() {
      this.field_108905_e.clear();
      this.field_108904_d = "";
      this.field_108906_b.clear();
   }

   public void func_108901_a(String var1) {
      if(this.field_108908_a) {
         if(this.field_108904_d.length() > 0) {
            this.field_108904_d = this.field_108904_d + ".";
         }

         this.field_108904_d = this.field_108904_d + var1;
         this.field_108906_b.add(this.field_108904_d);
         this.field_108907_c.add(Long.valueOf(System.nanoTime()));
      }
   }

   public void func_108900_b() {
      if(this.field_108908_a) {
         long var1 = System.nanoTime();
         long var3 = ((Long)this.field_108907_c.remove(this.field_108907_c.size() - 1)).longValue();
         this.field_108906_b.remove(this.field_108906_b.size() - 1);
         long var5 = var1 - var3;
         if(this.field_108905_e.containsKey(this.field_108904_d)) {
            this.field_108905_e.put(this.field_108904_d, Long.valueOf(((Long)this.field_108905_e.get(this.field_108904_d)).longValue() + var5));
         } else {
            this.field_108905_e.put(this.field_108904_d, Long.valueOf(var5));
         }

         if(var5 > 100000000L) {
            System.out.println("Something\'s taking too long! \'" + this.field_108904_d + "\' took aprox " + (double)var5 / 1000000.0D + " ms");
         }

         this.field_108904_d = !this.field_108906_b.isEmpty()?(String)this.field_108906_b.get(this.field_108906_b.size() - 1):"";
      }
   }

   public List func_108902_b(String var1) {
      if(!this.field_108908_a) {
         return null;
      } else {
         long var3 = this.field_108905_e.containsKey("root")?((Long)this.field_108905_e.get("root")).longValue():0L;
         long var5 = this.field_108905_e.containsKey(var1)?((Long)this.field_108905_e.get(var1)).longValue():-1L;
         ArrayList var7 = new ArrayList();
         if(var1.length() > 0) {
            var1 = var1 + ".";
         }

         long var8 = 0L;
         Iterator var10 = this.field_108905_e.keySet().iterator();

         while(var10.hasNext()) {
            String var11 = (String)var10.next();
            if(var11.length() > var1.length() && var11.startsWith(var1) && var11.indexOf(".", var1.length() + 1) < 0) {
               var8 += ((Long)this.field_108905_e.get(var11)).longValue();
            }
         }

         float var21 = (float)var8;
         if(var8 < var5) {
            var8 = var5;
         }

         if(var3 < var8) {
            var3 = var8;
         }

         Iterator var20 = this.field_108905_e.keySet().iterator();

         String var12;
         while(var20.hasNext()) {
            var12 = (String)var20.next();
            if(var12.length() > var1.length() && var12.startsWith(var1) && var12.indexOf(".", var1.length() + 1) < 0) {
               long var13 = ((Long)this.field_108905_e.get(var12)).longValue();
               double var15 = (double)var13 * 100.0D / (double)var8;
               double var17 = (double)var13 * 100.0D / (double)var3;
               String var19 = var12.substring(var1.length());
               var7.add(new C_100688_jz(var19, var15, var17));
            }
         }

         var20 = this.field_108905_e.keySet().iterator();

         while(var20.hasNext()) {
            var12 = (String)var20.next();
            this.field_108905_e.put(var12, Long.valueOf(((Long)this.field_108905_e.get(var12)).longValue() * 999L / 1000L));
         }

         if((float)var8 > var21) {
            var7.add(new C_100688_jz("unspecified", (double)((float)var8 - var21) * 100.0D / (double)var8, (double)((float)var8 - var21) * 100.0D / (double)var3));
         }

         Collections.sort(var7);
         var7.add(0, new C_100688_jz(var1, 100.0D, (double)var8 * 100.0D / (double)var3));
         return var7;
      }
   }

   public void func_108899_c(String var1) {
      this.func_108900_b();
      this.func_108901_a(var1);
   }

   public String func_108903_c() {
      return this.field_108906_b.size() == 0?"[UNKNOWN]":(String)this.field_108906_b.get(this.field_108906_b.size() - 1);
   }
}
