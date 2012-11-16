import java.util.List;
import java.util.Random;

public class C_100530_abu extends C_100767_adx {

   public C_100530_abu(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
   }

   public static C_100516_abo func_108409_a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      C_100516_abo var6 = new C_100516_abo(var2, var3 - 5, var4, var2, var3 + 2, var4);
      switch(var5) {
      case 0:
         var6.field_108337_d = var2 + 2;
         var6.field_108336_f = var4 + 8;
         break;
      case 1:
         var6.field_108341_a = var2 - 8;
         var6.field_108336_f = var4 + 2;
         break;
      case 2:
         var6.field_108337_d = var2 + 2;
         var6.field_108340_c = var4 - 8;
         break;
      case 3:
         var6.field_108337_d = var2 + 8;
         var6.field_108336_f = var4 + 2;
      }

      return C_100767_adx.func_108401_a(var0, var6) != null?null:var6;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      int var4 = this.func_108394_c();
      switch(this.field_108402_f) {
      case 0:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108336_f + 1, 0, var4);
         break;
      case 1:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, 1, var4);
         break;
      case 2:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108341_a, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c - 1, 2, var4);
         break;
      case 3:
         C_100522_abq.func_108558_a(var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108339_b, this.field_108404_e.field_108340_c, 3, var4);
      }

   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108384_a(var1, var3, 0, 5, 0, 2, 7, 1, 0, 0, false);
         this.func_108384_a(var1, var3, 0, 0, 7, 2, 2, 8, 0, 0, false);

         for(int var4 = 0; var4 < 5; ++var4) {
            this.func_108384_a(var1, var3, 0, 5 - var4 - (var4 < 4?1:0), 2 + var4, 2, 7 - var4, 2 + var4, 0, 0, false);
         }

         return true;
      }
   }
}
