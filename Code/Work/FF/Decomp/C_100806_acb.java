import java.util.List;
import java.util.Random;

public class C_100806_acb extends C_100787_acl {

   public C_100806_acb(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108515_a((C_100779_acp)var1, var2, var3, 1, 3, false);
   }

   public static C_100806_acb func_108535_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100806_acb(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 0, 3, 0, 4, 4, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 5, 0, 3, 7, 18, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 5, 0, 0, 5, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 5, 0, 4, 5, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 0, 4, 2, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 13, 4, 2, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 0, 4, 1, 3, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 15, 4, 1, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 2; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, 18 - var5, var3);
         }
      }

      this.func_108384_a(var1, var3, 0, 1, 1, 0, 4, 1, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 4, 0, 4, 4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 14, 0, 4, 14, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 17, 0, 4, 17, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 1, 1, 4, 4, 1, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 3, 4, 4, 4, 4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 3, 14, 4, 4, 14, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 1, 17, 4, 4, 17, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      return true;
   }
}
