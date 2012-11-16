import java.util.List;
import java.util.Random;

public class C_100741_adm extends C_100775_adu {

   protected final C_100776_adv field_108484_a;


   public C_100741_adm(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108484_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108468_a((C_100734_adr)var1, var2, var3, 1, 1);
   }

   public static C_100741_adm func_108483_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100741_adm(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 8, 4, 10, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108484_a, 1, 1, 0);
         this.func_108384_a(var1, var3, 1, 1, 10, 3, 3, 10, 0, 0, false);
         this.func_108377_a(var1, var3, 4, 1, 1, 4, 3, 1, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 4, 1, 3, 4, 3, 3, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 4, 1, 7, 4, 3, 7, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 4, 1, 9, 4, 3, 9, false, var2, C_100810_adb.func_109988_b());
         this.func_108384_a(var1, var3, 4, 1, 4, 4, 3, 6, C_100451_alf.field_106129_bs.field_106162_cm, C_100451_alf.field_106129_bs.field_106162_cm, false);
         this.func_108384_a(var1, var3, 5, 1, 5, 7, 3, 5, C_100451_alf.field_106129_bs.field_106162_cm, C_100451_alf.field_106129_bs.field_106162_cm, false);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, 4, 3, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, 4, 3, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106191_aO.field_106162_cm, this.func_108380_c(C_100451_alf.field_106191_aO.field_106162_cm, 3), 4, 1, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106191_aO.field_106162_cm, this.func_108380_c(C_100451_alf.field_106191_aO.field_106162_cm, 3) + 8, 4, 2, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106191_aO.field_106162_cm, this.func_108380_c(C_100451_alf.field_106191_aO.field_106162_cm, 3), 4, 1, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106191_aO.field_106162_cm, this.func_108380_c(C_100451_alf.field_106191_aO.field_106162_cm, 3) + 8, 4, 2, 8, var3);
         return true;
      }
   }
}
