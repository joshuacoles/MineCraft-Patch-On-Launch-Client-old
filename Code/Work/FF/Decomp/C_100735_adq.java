import java.util.List;
import java.util.Random;

public class C_100735_adq extends C_100775_adu {

   private final boolean field_108477_a;
   private final C_100776_adv field_108476_b;


   public C_100735_adq(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.field_108477_a = true;
      this.field_108402_f = var2.nextInt(4);
      this.field_108476_b = C_100776_adv.field_109830_a;
      switch(this.field_108402_f) {
      case 0:
      case 2:
         this.field_108404_e = new C_100516_abo(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
         break;
      default:
         this.field_108404_e = new C_100516_abo(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      }

   }

   public C_100735_adq(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108477_a = false;
      this.field_108402_f = var4;
      this.field_108476_b = this.func_108467_a(var2);
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      if(this.field_108477_a) {
         C_100810_adb.func_109991_a(C_100742_adh.class);
      }

      this.func_108468_a((C_100734_adr)var1, var2, var3, 1, 1);
   }

   public static C_100735_adq func_108475_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100735_adq(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108476_b, 1, 7, 0);
         this.func_108470_a(var1, var2, var3, C_100776_adv.field_109830_a, 1, 1, 4);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 2, 6, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 5, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 1, 6, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 5, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 4, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 1, 5, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 2, 4, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 3, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 3, 4, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 3, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 2, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 3, 3, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 2, 2, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 1, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 1, 2, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 1, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 1, 1, 3, var3);
         return true;
      }
   }
}
