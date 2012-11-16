import java.util.List;
import java.util.Random;

public class C_100792_aci extends C_100787_acl {

   public C_100792_aci(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108509_c((C_100779_acp)var1, var2, var3, 0, 1, true);
   }

   public static C_100792_aci func_108528_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100792_aci(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 0, 0, 0, 4, 1, 4, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 0, 4, 5, 4, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 2, 0, 0, 5, 4, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 1, 0, 4, 1, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 3, 0, 4, 3, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 2, 0, 4, 5, 0, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 4, 4, 5, 4, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 3, 4, 1, 4, 4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 3, 4, 3, 4, 4, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 6, 0, 4, 6, 4, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);

      for(int var4 = 0; var4 <= 4; ++var4) {
         for(int var5 = 0; var5 <= 4; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
