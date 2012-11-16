import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class C_100518_abp extends C_100766_adw {

   private double field_108376_e = 0.01D;


   public C_100518_abp() {}

   public C_100518_abp(Map var1) {
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("chance")) {
            this.field_108376_e = C_100650_jv.func_108911_a((String)var3.getValue(), this.field_108376_e);
         }
      }

   }

   protected boolean func_108354_a(int var1, int var2) {
      return this.field_108344_b.nextDouble() < this.field_108376_e && this.field_108344_b.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   protected C_100771_adz func_108357_b(int var1, int var2) {
      return new C_100528_abv(this.field_108345_c, this.field_108344_b, var1, var2);
   }
}
