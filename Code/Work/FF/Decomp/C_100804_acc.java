import java.util.List;
import java.util.Random;

public class C_100804_acc extends C_100787_acl {

   public C_100804_acc(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108515_a((C_100779_acp)var1, var2, var3, 1, 0, true);
   }

   public static C_100804_acc func_108534_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100804_acc(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      int var4 = this.func_108380_c(C_100451_alf.field_106251_bF.field_106162_cm, 2);

      for(int var5 = 0; var5 <= 9; ++var5) {
         int var6 = Math.max(1, 7 - var5);
         int var7 = Math.min(Math.max(var6 + 5, 14 - var5), 13);
         int var8 = var5;
         this.func_108384_a(var1, var3, 0, 0, var5, 4, var6, var5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
         this.func_108384_a(var1, var3, 1, var6 + 1, var5, 3, var7 - 1, var5, 0, 0, false);
         if(var5 <= 6) {
            this.func_108400_a(var1, C_100451_alf.field_106251_bF.field_106162_cm, var4, 1, var6 + 1, var5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106251_bF.field_106162_cm, var4, 2, var6 + 1, var5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106251_bF.field_106162_cm, var4, 3, var6 + 1, var5, var3);
         }

         this.func_108384_a(var1, var3, 0, var7, var5, 4, var7, var5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
         this.func_108384_a(var1, var3, 0, var6 + 1, var5, 0, var7 - 1, var5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
         this.func_108384_a(var1, var3, 4, var6 + 1, var5, 4, var7 - 1, var5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
         if((var5 & 1) == 0) {
            this.func_108384_a(var1, var3, 0, var6 + 2, var5, 0, var6 + 3, var5, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
            this.func_108384_a(var1, var3, 4, var6 + 2, var5, 4, var6 + 3, var5, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
         }

         for(int var9 = 0; var9 <= 4; ++var9) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var9, -1, var8, var3);
         }
      }

      return true;
   }
}
