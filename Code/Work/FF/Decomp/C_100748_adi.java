import java.util.List;
import java.util.Random;

public class C_100748_adi extends C_100775_adu {

   protected final C_100776_adv field_108498_a;


   public C_100748_adi(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108498_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      if(this.field_108402_f != 2 && this.field_108402_f != 3) {
         this.func_108469_c((C_100734_adr)var1, var2, var3, 1, 1);
      } else {
         this.func_108465_b((C_100734_adr)var1, var2, var3, 1, 1);
      }

   }

   public static C_100748_adi func_108497_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100748_adi(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108498_a, 1, 1, 0);
         if(this.field_108402_f != 2 && this.field_108402_f != 3) {
            this.func_108384_a(var1, var3, 4, 1, 1, 4, 3, 3, 0, 0, false);
         } else {
            this.func_108384_a(var1, var3, 0, 1, 1, 0, 3, 3, 0, 0, false);
         }

         return true;
      }
   }
}
