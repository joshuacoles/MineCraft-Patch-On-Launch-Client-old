import java.util.List;
import java.util.Random;

public class C_100705_aeg extends C_100701_aeq {

   private int field_108441_a = -1;


   public C_100705_aeg(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
   }

   public static C_100516_abo func_108440_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 3, 4, 2, var6);
      return C_100767_adx.func_108401_a(var1, var7) != null?null:var7;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108441_a < 0) {
         this.field_108441_a = this.func_108412_b(var1, var3);
         if(this.field_108441_a < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108441_a - this.field_108404_e.field_108338_e + 4 - 1, 0);
      }

      this.func_108384_a(var1, var3, 0, 0, 0, 2, 3, 1, 0, 0, false);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 0, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 1, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, 15, 1, 3, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 15, 0, 3, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 15, 1, 3, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 15, 2, 3, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 15, 1, 3, -1, var3);
      return true;
   }
}
