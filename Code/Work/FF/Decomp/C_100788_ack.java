import java.util.List;
import java.util.Random;

public class C_100788_ack extends C_100787_acl {

   private boolean field_108526_a;


   public C_100788_ack(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public static C_100788_ack func_108525_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100788_ack(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 0, 2, 0, 6, 7, 7, 0, 0, false);
      this.func_108384_a(var1, var3, 1, 0, 0, 5, 1, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 1, 5, 2, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 3, 2, 5, 3, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 4, 3, 5, 4, 7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 0, 1, 4, 2, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 2, 0, 5, 4, 2, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 5, 2, 1, 5, 3, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 5, 2, 5, 5, 3, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 3, 0, 5, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 5, 3, 6, 5, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 5, 8, 5, 5, 8, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 1, 6, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106241_bE.field_106162_cm, 0, 5, 6, 3, var3);
      this.func_108384_a(var1, var3, 0, 6, 3, 0, 6, 8, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 6, 3, 6, 6, 8, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 6, 8, 5, 7, 8, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      this.func_108384_a(var1, var3, 2, 8, 8, 4, 8, 8, C_100451_alf.field_106241_bE.field_106162_cm, C_100451_alf.field_106241_bE.field_106162_cm, false);
      int var4;
      int var5;
      if(!this.field_108526_a) {
         var4 = this.func_108379_a(5);
         var5 = this.func_108382_a(3, 5);
         int var6 = this.func_108389_b(3, 5);
         if(var3.func_108334_b(var5, var4, var6)) {
            this.field_108526_a = true;
            var1.func_109422_e(var5, var4, var6, C_100451_alf.field_106220_av.field_106162_cm);
            C_100416_amh var7 = (C_100416_amh)var1.func_109353_p(var5, var4, var6);
            if(var7 != null) {
               var7.func_102976_a("Blaze");
            }
         }
      }

      for(var4 = 0; var4 <= 6; ++var4) {
         for(var5 = 0; var5 <= 6; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106239_bD.field_106162_cm, 0, var4, -1, var5, var3);
         }
      }

      return true;
   }
}
