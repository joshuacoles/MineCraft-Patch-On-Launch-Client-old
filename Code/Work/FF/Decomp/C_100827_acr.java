import java.util.Random;

public class C_100827_acr extends C_100771_adz {

   public C_100827_acr(C_100873_xe var1, Random var2, int var3, int var4) {
      C_101324_xz var5 = var1.func_109362_a(var3 * 16 + 8, var4 * 16 + 8);
      if(var5 != C_101324_xz.field_112504_w && var5 != C_101324_xz.field_112514_x) {
         if(var5 == C_101324_xz.field_112502_h) {
            C_100821_acy var8 = new C_100821_acy(var2, var3 * 16, var4 * 16);
            this.field_108585_a.add(var8);
         } else {
            C_100826_acu var7 = new C_100826_acu(var2, var3 * 16, var4 * 16);
            this.field_108585_a.add(var7);
         }
      } else {
         C_100823_acv var6 = new C_100823_acv(var2, var3 * 16, var4 * 16);
         this.field_108585_a.add(var6);
      }

      this.func_108581_c();
   }
}
