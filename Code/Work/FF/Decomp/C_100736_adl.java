import java.util.List;
import java.util.Random;

public class C_100736_adl extends C_100775_adu {

   private boolean field_108482_a;


   public C_100736_adl(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      if(var1 != null) {
         ((C_100734_adr)var1).field_108478_b = this;
      }

   }

   public static C_100736_adl func_108481_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100736_adl(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108377_a(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, C_100810_adb.func_109988_b());
      this.func_108470_a(var1, var2, var3, C_100776_adv.field_109829_c, 4, 1, 0);
      byte var4 = 6;
      this.func_108377_a(var1, var3, 1, var4, 1, 1, var4, 14, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 9, var4, 1, 9, var4, 14, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 2, var4, 1, 8, var4, 2, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 2, var4, 14, 8, var4, 14, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, C_100810_adb.func_109988_b());
      this.func_108384_a(var1, var3, 1, 1, 1, 1, 1, 3, C_100451_alf.field_106073_F.field_106162_cm, C_100451_alf.field_106073_F.field_106162_cm, false);
      this.func_108384_a(var1, var3, 9, 1, 1, 9, 1, 3, C_100451_alf.field_106073_F.field_106162_cm, C_100451_alf.field_106073_F.field_106162_cm, false);
      this.func_108377_a(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, C_100810_adb.func_109988_b());
      this.func_108384_a(var1, var3, 4, 1, 9, 6, 1, 11, C_100451_alf.field_106073_F.field_106162_cm, C_100451_alf.field_106073_F.field_106162_cm, false);

      int var5;
      for(var5 = 3; var5 < 14; var5 += 2) {
         this.func_108384_a(var1, var3, 0, 3, var5, 0, 4, var5, C_100451_alf.field_106129_bs.field_106162_cm, C_100451_alf.field_106129_bs.field_106162_cm, false);
         this.func_108384_a(var1, var3, 10, 3, var5, 10, 4, var5, C_100451_alf.field_106129_bs.field_106162_cm, C_100451_alf.field_106129_bs.field_106162_cm, false);
      }

      for(var5 = 2; var5 < 9; var5 += 2) {
         this.func_108384_a(var1, var3, var5, 3, 15, var5, 4, 15, C_100451_alf.field_106129_bs.field_106162_cm, C_100451_alf.field_106129_bs.field_106162_cm, false);
      }

      var5 = this.func_108380_c(C_100451_alf.field_106176_bA.field_106162_cm, 3);
      this.func_108377_a(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, C_100810_adb.func_109988_b());
      this.func_108377_a(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, C_100810_adb.func_109988_b());

      for(int var6 = 4; var6 <= 6; ++var6) {
         this.func_108400_a(var1, C_100451_alf.field_106176_bA.field_106162_cm, var5, var6, 1, 4, var3);
         this.func_108400_a(var1, C_100451_alf.field_106176_bA.field_106162_cm, var5, var6, 2, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106176_bA.field_106162_cm, var5, var6, 3, 6, var3);
      }

      byte var14 = 2;
      byte var7 = 0;
      byte var8 = 3;
      byte var9 = 1;
      switch(this.field_108402_f) {
      case 0:
         var14 = 0;
         var7 = 2;
         break;
      case 1:
         var14 = 1;
         var7 = 3;
         var8 = 0;
         var9 = 2;
      case 2:
      default:
         break;
      case 3:
         var14 = 3;
         var7 = 1;
         var8 = 0;
         var9 = 2;
      }

      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var14 + (var2.nextFloat() > 0.9F?4:0), 4, 3, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var14 + (var2.nextFloat() > 0.9F?4:0), 5, 3, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var14 + (var2.nextFloat() > 0.9F?4:0), 6, 3, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var7 + (var2.nextFloat() > 0.9F?4:0), 4, 3, 12, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var7 + (var2.nextFloat() > 0.9F?4:0), 5, 3, 12, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var7 + (var2.nextFloat() > 0.9F?4:0), 6, 3, 12, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 9, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 11, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 9, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106223_bL.field_106162_cm, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 11, var3);
      if(!this.field_108482_a) {
         int var13 = this.func_108379_a(3);
         int var10 = this.func_108382_a(5, 6);
         int var11 = this.func_108389_b(5, 6);
         if(var3.func_108334_b(var10, var13, var11)) {
            this.field_108482_a = true;
            var1.func_109422_e(var10, var13, var11, C_100451_alf.field_106220_av.field_106162_cm);
            C_100416_amh var12 = (C_100416_amh)var1.func_109353_p(var10, var13, var11);
            if(var12 != null) {
               var12.func_102976_a("Silverfish");
            }
         }
      }

      return true;
   }
}
