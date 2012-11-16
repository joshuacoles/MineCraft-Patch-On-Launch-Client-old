import java.util.List;
import java.util.Random;

public class C_100742_adh extends C_100775_adu {

   protected final C_100776_adv field_108489_a;
   private boolean field_108487_b;
   private boolean field_108488_c;
   private boolean field_108486_d;
   private boolean field_108490_h;


   public C_100742_adh(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108489_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
      this.field_108487_b = var2.nextBoolean();
      this.field_108488_c = var2.nextBoolean();
      this.field_108486_d = var2.nextBoolean();
      this.field_108490_h = var2.nextInt(3) > 0;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      int var4 = 3;
      int var5 = 5;
      if(this.field_108402_f == 1 || this.field_108402_f == 2) {
         var4 = 8 - var4;
         var5 = 8 - var5;
      }

      this.func_108468_a((C_100734_adr)var1, var2, var3, 5, 1);
      if(this.field_108487_b) {
         this.func_108465_b((C_100734_adr)var1, var2, var3, var4, 1);
      }

      if(this.field_108488_c) {
         this.func_108465_b((C_100734_adr)var1, var2, var3, var5, 7);
      }

      if(this.field_108486_d) {
         this.func_108469_c((C_100734_adr)var1, var2, var3, var4, 1);
      }

      if(this.field_108490_h) {
         this.func_108469_c((C_100734_adr)var1, var2, var3, var5, 7);
      }

   }

   public static C_100742_adh func_108485_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100742_adh(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 9, 8, 10, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108489_a, 4, 3, 0);
         if(this.field_108487_b) {
            this.func_108384_a(var1, var3, 0, 3, 1, 0, 5, 3, 0, 0, false);
         }

         if(this.field_108486_d) {
            this.func_108384_a(var1, var3, 9, 3, 1, 9, 5, 3, 0, 0, false);
         }

         if(this.field_108488_c) {
            this.func_108384_a(var1, var3, 0, 5, 7, 0, 7, 9, 0, 0, false);
         }

         if(this.field_108490_h) {
            this.func_108384_a(var1, var3, 9, 5, 7, 9, 7, 9, 0, 0, false);
         }

         this.func_108384_a(var1, var3, 5, 1, 10, 7, 3, 10, 0, 0, false);
         this.func_108377_a(var1, var3, 1, 2, 1, 8, 2, 6, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 4, 1, 5, 4, 4, 9, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 8, 1, 5, 8, 4, 9, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 1, 4, 7, 3, 4, 9, false, var2, C_100810_adb.func_109988_b());
         this.func_108377_a(var1, var3, 1, 3, 5, 3, 3, 6, false, var2, C_100810_adb.func_109988_b());
         this.func_108384_a(var1, var3, 1, 3, 4, 3, 3, 4, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
         this.func_108384_a(var1, var3, 1, 4, 6, 3, 4, 6, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
         this.func_108377_a(var1, var3, 5, 1, 7, 7, 1, 8, false, var2, C_100810_adb.func_109988_b());
         this.func_108384_a(var1, var3, 5, 1, 9, 7, 1, 9, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
         this.func_108384_a(var1, var3, 5, 2, 7, 7, 2, 7, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
         this.func_108384_a(var1, var3, 4, 5, 7, 4, 5, 9, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
         this.func_108384_a(var1, var3, 8, 5, 7, 8, 5, 9, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
         this.func_108384_a(var1, var3, 5, 5, 7, 7, 5, 9, C_100451_alf.field_106236_am.field_106162_cm, C_100451_alf.field_106236_am.field_106162_cm, false);
         this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 6, 5, 6, var3);
         return true;
      }
   }
}
