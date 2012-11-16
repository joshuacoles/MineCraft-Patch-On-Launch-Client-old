import java.util.List;
import java.util.Random;

public class C_100740_adn extends C_100748_adi {

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      if(this.field_108402_f != 2 && this.field_108402_f != 3) {
         this.func_108465_b((C_100734_adr)var1, var2, var3, 1, 1);
      } else {
         this.func_108469_c((C_100734_adr)var1, var2, var3, 1, 1);
      }

   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108498_a, 1, 1, 0);
         if(this.field_108402_f != 2 && this.field_108402_f != 3) {
            this.func_108384_a(var1, var3, 0, 1, 1, 0, 3, 3, 0, 0, false);
         } else {
            this.func_108384_a(var1, var3, 4, 1, 1, 4, 3, 3, 0, 0, false);
         }

         return true;
      }
   }
}
