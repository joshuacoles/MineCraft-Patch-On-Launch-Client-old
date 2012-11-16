import java.util.List;
import java.util.Random;

public class C_100773_ads extends C_100775_adu {

   private final C_100776_adv field_108506_a;
   private final boolean field_108504_b;
   private final boolean field_108505_c;


   public C_100773_ads(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108506_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
      this.field_108504_b = var2.nextInt(2) == 0;
      this.field_108505_c = var2.nextInt(2) == 0;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108468_a((C_100734_adr)var1, var2, var3, 1, 1);
      if(this.field_108504_b) {
         this.func_108465_b((C_100734_adr)var1, var2, var3, 1, 2);
      }

      if(this.field_108505_c) {
         this.func_108469_c((C_100734_adr)var1, var2, var3, 1, 2);
      }

   }

   public static C_100773_ads func_108503_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100773_ads(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108506_a, 1, 1, 0);
         this.func_108470_a(var1, var2, var3, C_100776_adv.field_109830_a, 1, 1, 6);
         this.func_108395_a(var1, var3, var2, 0.1F, 1, 2, 1, C_100451_alf.field_106208_at.field_106162_cm, 0);
         this.func_108395_a(var1, var3, var2, 0.1F, 3, 2, 1, C_100451_alf.field_106208_at.field_106162_cm, 0);
         this.func_108395_a(var1, var3, var2, 0.1F, 1, 2, 5, C_100451_alf.field_106208_at.field_106162_cm, 0);
         this.func_108395_a(var1, var3, var2, 0.1F, 3, 2, 5, C_100451_alf.field_106208_at.field_106162_cm, 0);
         if(this.field_108504_b) {
            this.func_108384_a(var1, var3, 0, 1, 2, 0, 3, 4, 0, 0, false);
         }

         if(this.field_108505_c) {
            this.func_108384_a(var1, var3, 4, 1, 2, 4, 3, 4, 0, 0, false);
         }

         return true;
      }
   }
}
