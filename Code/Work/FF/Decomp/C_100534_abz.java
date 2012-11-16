import java.util.List;
import java.util.Random;

public class C_100534_abz extends C_100787_acl {

   public C_100534_abz(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   protected C_100534_abz(Random var1, int var2, int var3) {
      super(0);
      this.field_108402_f = var1.nextInt(4);
      switch(this.field_108402_f) {
      case 0:
      case 2:
         this.field_108404_e = new C_100516_abo(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
         break;
      default:
         this.field_108404_e = new C_100516_abo(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      }

   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108515_a((C_100779_acp)var1, var2, var3, 8, 3, false);
      this.func_108514_b((C_100779_acp)var1, var2, var3, 3, 8, false);
      this.func_108509_c((C_100779_acp)var1, var2, var3, 3, 8, false);
   }

   public static C_100534_abz func_108516_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -8, -3, 0, 19, 10, 19, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100534_abz(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 7, 3, 0, 11, 4, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 3, 7, 18, 4, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 5, 0, 10, 7, 18, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 5, 8, 18, 7, 10, 0, 0, false);
      this.func_108384_a(var1, var3, 7, 5, 0, 7, 5, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 5, 11, 7, 5, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 11, 5, 0, 11, 5, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 11, 5, 11, 11, 5, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 7, 7, 5, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 11, 5, 7, 18, 5, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 11, 7, 5, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 11, 5, 11, 18, 5, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 2, 0, 11, 2, 5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 2, 13, 11, 2, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 0, 0, 11, 1, 3, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 0, 15, 11, 1, 18, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);

      int var4;
      int var5;
      for(var4 = 7; var4 <= 11; ++var4) {
         for(var5 = 0; var5 <= 2; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, 18 - var5, var3);
         }
      }

      this.func_108384_a(var1, var3, 0, 2, 7, 5, 2, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 13, 2, 7, 18, 2, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 7, 3, 1, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 15, 0, 7, 18, 1, 11, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);

      for(var4 = 0; var4 <= 2; ++var4) {
         for(var5 = 7; var5 <= 11; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, 18 - var4, -1, var5, var3);
         }
      }

      return true;
   }
}
