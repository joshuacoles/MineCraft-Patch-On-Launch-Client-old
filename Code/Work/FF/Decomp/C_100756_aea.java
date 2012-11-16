import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class C_100756_aea extends C_100766_adw {

   public static final List field_108364_e = Arrays.asList(new C_101324_xz[]{C_101324_xz.field_112494_c, C_101324_xz.field_112491_d});
   private int field_108362_f;
   private int field_108363_g;
   private int field_108365_h;


   public C_100756_aea() {
      this.field_108362_f = 0;
      this.field_108363_g = 32;
      this.field_108365_h = 8;
   }

   public C_100756_aea(Map var1) {
      this();
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("size")) {
            this.field_108362_f = C_100650_jv.func_108919_a((String)var3.getValue(), this.field_108362_f, 0);
         } else if(((String)var3.getKey()).equals("distance")) {
            this.field_108363_g = C_100650_jv.func_108919_a((String)var3.getValue(), this.field_108363_g, this.field_108365_h + 1);
         }
      }

   }

   protected boolean func_108354_a(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if(var1 < 0) {
         var1 -= this.field_108363_g - 1;
      }

      if(var2 < 0) {
         var2 -= this.field_108363_g - 1;
      }

      int var5 = var1 / this.field_108363_g;
      int var6 = var2 / this.field_108363_g;
      Random var7 = this.field_108345_c.func_109401_D(var5, var6, 10387312);
      var5 *= this.field_108363_g;
      var6 *= this.field_108363_g;
      var5 += var7.nextInt(this.field_108363_g - this.field_108365_h);
      var6 += var7.nextInt(this.field_108363_g - this.field_108365_h);
      if(var3 == var5 && var4 == var6) {
         boolean var8 = this.field_108345_c.func_109465_s().func_112525_a(var3 * 16 + 8, var4 * 16 + 8, 0, field_108364_e);
         if(var8) {
            return true;
         }
      }

      return false;
   }

   protected C_100771_adz func_108357_b(int var1, int var2) {
      return new C_100758_aeb(this.field_108345_c, this.field_108344_b, var1, var2, this.field_108362_f);
   }

}
