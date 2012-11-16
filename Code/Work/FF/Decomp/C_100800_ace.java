import java.util.List;
import java.util.Random;

public class C_100800_ace extends C_100787_acl {

   public C_100800_ace(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108515_a((C_100779_acp)var1, var2, var3, 5, 3, true);
   }

   public static C_100800_ace func_108532_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100800_ace(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 0, 3, 0, 12, 4, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 0, 12, 13, 12, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 5, 0, 1, 12, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 11, 5, 0, 12, 12, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 2, 5, 11, 4, 12, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 5, 11, 10, 12, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 9, 11, 7, 12, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 2, 5, 0, 4, 12, 1, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 5, 0, 10, 12, 1, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 9, 0, 7, 12, 1, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 2, 11, 2, 10, 12, 10, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 8, 0, 7, 8, 0, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);

      int var4;
      for(var4 = 1; var4 <= 11; var4 += 2) {
         this.func_108384_a(var1, var3, var4, 10, 0, var4, 11, 0, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
         this.func_108384_a(var1, var3, var4, 10, 12, var4, 11, 12, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
         this.func_108384_a(var1, var3, 0, 10, var4, 0, 11, var4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
         this.func_108384_a(var1, var3, 12, 10, var4, 12, 11, var4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
         this.func_108400_a(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, 13, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, 13, 12, var3);
         this.func_108400_a(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, 0, 13, var4, var3);
         this.func_108400_a(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, 12, 13, var4, var3);
         this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, var4 + 1, 13, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, var4 + 1, 13, 12, var3);
         this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 0, 13, var4 + 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 12, 13, var4 + 1, var3);
      }

      this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 0, 13, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 0, 13, 12, var3);
      this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 0, 13, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 12, 13, 0, var3);

      for(var4 = 3; var4 <= 9; var4 += 2) {
         this.func_108384_a(var1, var3, 1, 7, var4, 1, 8, var4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
         this.func_108384_a(var1, var3, 11, 7, var4, 11, 8, var4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      }

      this.func_108384_a(var1, var3, 4, 2, 0, 8, 2, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 4, 12, 2, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 0, 0, 8, 1, 3, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 0, 9, 8, 1, 12, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 4, 3, 1, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 9, 0, 4, 12, 1, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);

      int var5;
      for(var4 = 4; var4 <= 8; ++var4) {
         for(var5 = 0; var5 <= 2; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, 12 - var5, var3);
         }
      }

      for(var4 = 0; var4 <= 2; ++var4) {
         for(var5 = 4; var5 <= 8; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, 12 - var4, -1, var5, var3);
         }
      }

      this.func_108384_a(var1, var3, 5, 5, 5, 7, 5, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 1, 6, 6, 4, 6, 0, 0, false);
      this.func_108400_a(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, 6, 0, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106073_F.field_106162_cm, 0, 6, 5, 6, var3);
      var4 = this.func_108382_a(6, 6);
      var5 = this.func_108379_a(5);
      int var6 = this.func_108389_b(6, 6);
      if(var3.func_108334_b(var4, var5, var6)) {
         var1.field_109562_d = true;
         C_100451_alf.field_106118_p[C_100451_alf.field_106073_F.field_106162_cm].func_105996_b(var1, var4, var5, var6, var2);
         var1.field_109562_d = false;
      }

      return true;
   }
}
