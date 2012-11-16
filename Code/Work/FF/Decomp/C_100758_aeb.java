import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class C_100758_aeb extends C_100771_adz {

   private boolean field_108586_c = false;


   public C_100758_aeb(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      ArrayList var6 = C_100760_aec.func_109696_a(var2, var5);
      C_100691_aen var7 = new C_100691_aen(var1.func_109465_s(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var6, var5);
      this.field_108585_a.add(var7);
      var7.func_108391_a(var7, this.field_108585_a, var2);
      ArrayList var8 = var7.field_108433_j;
      ArrayList var9 = var7.field_108435_i;

      int var10;
      while(!var8.isEmpty() || !var9.isEmpty()) {
         C_100767_adx var11;
         if(var8.isEmpty()) {
            var10 = var2.nextInt(var9.size());
            var11 = (C_100767_adx)var9.remove(var10);
            var11.func_108391_a(var7, this.field_108585_a, var2);
         } else {
            var10 = var2.nextInt(var8.size());
            var11 = (C_100767_adx)var8.remove(var10);
            var11.func_108391_a(var7, this.field_108585_a, var2);
         }
      }

      this.func_108581_c();
      var10 = 0;
      Iterator var13 = this.field_108585_a.iterator();

      while(var13.hasNext()) {
         C_100767_adx var12 = (C_100767_adx)var13.next();
         if(!(var12 instanceof C_100699_aer)) {
            ++var10;
         }
      }

      this.field_108586_c = var10 > 2;
   }

   public boolean func_108580_d() {
      return this.field_108586_c;
   }
}
