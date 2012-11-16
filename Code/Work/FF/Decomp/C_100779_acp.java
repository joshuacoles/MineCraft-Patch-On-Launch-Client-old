import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C_100779_acp extends C_100534_abz {

   public C_100785_acm field_108520_a;
   public List field_108518_b = new ArrayList();
   public List field_108519_c;
   public ArrayList field_108517_d = new ArrayList();


   public C_100779_acp(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      C_100785_acm[] var4 = C_100536_aby.func_108650_a();
      int var5 = var4.length;

      int var6;
      C_100785_acm var7;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.field_109906_c = 0;
         this.field_108518_b.add(var7);
      }

      this.field_108519_c = new ArrayList();
      var4 = C_100536_aby.func_108649_b();
      var5 = var4.length;

      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.field_109906_c = 0;
         this.field_108519_c.add(var7);
      }

   }
}
