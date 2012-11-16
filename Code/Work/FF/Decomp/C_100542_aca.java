import java.util.List;
import java.util.Random;

public class C_100542_aca extends C_100787_acl {

   private int field_108522_a;


   public C_100542_aca(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
      this.field_108522_a = var2.nextInt();
   }

   public static C_100542_aca func_108521_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return func_108513_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100542_aca(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      Random var4 = new Random((long)this.field_108522_a);

      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 3; var6 <= 4; ++var6) {
            var7 = var4.nextInt(8);
            this.func_108384_a(var1, var3, var5, var6, 0, var5, var6, var7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
         }
      }

      var5 = var4.nextInt(8);
      this.func_108384_a(var1, var3, 0, 5, 0, 0, 5, var5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      var5 = var4.nextInt(8);
      this.func_108384_a(var1, var3, 4, 5, 0, 4, 5, var5, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);

      for(var5 = 0; var5 <= 4; ++var5) {
         var6 = var4.nextInt(5);
         this.func_108384_a(var1, var3, var5, 2, 0, var5, 2, var6, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
      }

      for(var5 = 0; var5 <= 4; ++var5) {
         for(var6 = 0; var6 <= 1; ++var6) {
            var7 = var4.nextInt(3);
            this.func_108384_a(var1, var3, var5, var6, 0, var5, var6, var7, C_100451_alf.field_106239_bD.field_106162_cm, C_100451_alf.field_106239_bD.field_106162_cm, false);
         }
      }

      return true;
   }
}
