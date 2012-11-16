import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class C_100777_acq extends C_100766_adw {

   private static List field_108369_e = Arrays.asList(new C_101324_xz[]{C_101324_xz.field_112491_d, C_101324_xz.field_112508_s, C_101324_xz.field_112504_w, C_101324_xz.field_112514_x, C_101324_xz.field_112502_h});
   private List field_108367_f;
   private int field_108368_g;
   private int field_108370_h;


   public C_100777_acq() {
      this.field_108367_f = new ArrayList();
      this.field_108368_g = 32;
      this.field_108370_h = 8;
      this.field_108367_f.add(new C_101316_ya(C_101102_pz.class, 1, 1, 1));
   }

   public C_100777_acq(Map var1) {
      this();
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("distance")) {
            this.field_108368_g = C_100650_jv.func_108919_a((String)var3.getValue(), this.field_108368_g, this.field_108370_h + 1);
         }
      }

   }

   protected boolean func_108354_a(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if(var1 < 0) {
         var1 -= this.field_108368_g - 1;
      }

      if(var2 < 0) {
         var2 -= this.field_108368_g - 1;
      }

      int var5 = var1 / this.field_108368_g;
      int var6 = var2 / this.field_108368_g;
      Random var7 = this.field_108345_c.func_109401_D(var5, var6, 14357617);
      var5 *= this.field_108368_g;
      var6 *= this.field_108368_g;
      var5 += var7.nextInt(this.field_108368_g - this.field_108370_h);
      var6 += var7.nextInt(this.field_108368_g - this.field_108370_h);
      if(var3 == var5 && var4 == var6) {
         boolean var8 = this.field_108345_c.func_109465_s().func_112525_a(var3 * 16 + 8, var4 * 16 + 8, 0, field_108369_e);
         if(var8) {
            return true;
         }
      }

      return false;
   }

   protected C_100771_adz func_108357_b(int var1, int var2) {
      return new C_100827_acr(this.field_108345_c, this.field_108344_b, var1, var2);
   }

   public List func_108366_a() {
      return this.field_108367_f;
   }

}
