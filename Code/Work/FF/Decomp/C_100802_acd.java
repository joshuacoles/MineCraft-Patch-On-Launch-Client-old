import java.util.List;
import java.util.Random;

public class C_100802_acd extends C_100787_acl {

   public C_100802_acd(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      byte var4 = 1;
      if(this.field_108402_f == 1 || this.field_108402_f == 2) {
         var4 = 5;
      }

      this.func_108514_b((C_100779_acp)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
      this.func_108509_c((C_100779_acp)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
   }

   public static C_100802_acd func_108533_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -3, 0, 0, 9, 7, 9, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100802_acd(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 0, 0, 0, 8, 1, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 0, 8, 5, 8, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 6, 0, 8, 6, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 0, 2, 5, 0, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 2, 0, 8, 5, 0, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 3, 0, 1, 4, 0, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 3, 0, 7, 4, 0, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 4, 8, 2, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 4, 2, 2, 4, 0, 0, false);
      this.func_108384_a(var1, var3, 6, 1, 4, 7, 2, 4, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 3, 8, 8, 3, 8, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 6, 0, 3, 7, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 3, 6, 8, 3, 7, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 4, 0, 5, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 3, 4, 8, 5, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 3, 5, 2, 5, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 3, 5, 7, 5, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 4, 5, 1, 5, 5, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 4, 5, 7, 5, 5, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 8; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
