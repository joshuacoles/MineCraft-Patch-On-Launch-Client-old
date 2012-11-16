import java.util.ArrayList;
import java.util.Random;

class C_100532_abx extends C_100771_adz {

   public C_100532_abx(C_100873_xe var1, Random var2, int var3, int var4) {
      C_100779_acp var5 = new C_100779_acp(var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.field_108585_a.add(var5);
      var5.func_108391_a(var5, this.field_108585_a, var2);
      ArrayList var6 = var5.field_108517_d;

      while(!var6.isEmpty()) {
         int var7 = var2.nextInt(var6.size());
         C_100767_adx var8 = (C_100767_adx)var6.remove(var7);
         var8.func_108391_a(var5, this.field_108585_a, var2);
      }

      this.func_108581_c();
      this.func_108577_a(var1, var2, 48, 70);
   }
}
