import java.util.List;
import java.util.Random;

public class C_100774_adt extends C_100775_adu {

   private final C_100776_adv field_108508_a;


   public C_100774_adt(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108508_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108468_a((C_100734_adr)var1, var2, var3, 1, 1);
   }

   public static C_100774_adt func_108507_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100774_adt(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108508_a, 1, 7, 0);
         this.func_108470_a(var1, var2, var3, C_100776_adv.field_109830_a, 1, 1, 7);
         int var4 = this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 2);

         for(int var5 = 0; var5 < 6; ++var5) {
            this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 1, 6 - var5, 1 + var5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 2, 6 - var5, 1 + var5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 3, 6 - var5, 1 + var5, var3);
            if(var5 < 5) {
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 5 - var5, 1 + var5, var3);
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 2, 5 - var5, 1 + var5, var3);
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 5 - var5, 1 + var5, var3);
            }
         }

         return true;
      }
   }
}
