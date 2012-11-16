import java.util.List;
import java.util.Random;

public class C_100697_aes extends C_100701_aeq {

   private final boolean field_108427_a = true;
   private int field_108426_b = -1;


   public C_100697_aes(C_100691_aen var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var3.nextInt(4);
      switch(this.field_108402_f) {
      case 0:
      case 2:
         this.field_108404_e = new C_100516_abo(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
         break;
      default:
         this.field_108404_e = new C_100516_abo(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
      }

   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a - 1, this.field_108404_e.field_108338_e - 4, this.field_108404_e.field_108340_c + 1, 1, this.func_108394_c());
      C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108337_d + 1, this.field_108404_e.field_108338_e - 4, this.field_108404_e.field_108340_c + 1, 3, this.func_108394_c());
      C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108338_e - 4, this.field_108404_e.field_108340_c - 1, 2, this.func_108394_c());
      C_100760_aec.func_109695_b((C_100691_aen)var1, var2, var3, this.field_108404_e.field_108341_a + 1, this.field_108404_e.field_108338_e - 4, this.field_108404_e.field_108336_f + 1, 0, this.func_108394_c());
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108426_b < 0) {
         this.field_108426_b = this.func_108412_b(var1, var3);
         if(this.field_108426_b < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108426_b - this.field_108404_e.field_108338_e + 3, 0);
      }

      this.func_108384_a(var1, var3, 1, 0, 1, 4, 12, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106071_D.field_106162_cm, false);
      this.func_108400_a(var1, 0, 0, 2, 12, 2, var3);
      this.func_108400_a(var1, 0, 0, 3, 12, 2, var3);
      this.func_108400_a(var1, 0, 0, 2, 12, 3, var3);
      this.func_108400_a(var1, 0, 0, 3, 12, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 13, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 14, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 4, 13, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 4, 14, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 13, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 1, 14, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 4, 13, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 4, 14, 4, var3);
      this.func_108384_a(var1, var3, 1, 15, 1, 4, 15, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);

      for(int var4 = 0; var4 <= 5; ++var4) {
         for(int var5 = 0; var5 <= 5; ++var5) {
            if(var5 == 0 || var5 == 5 || var4 == 0 || var4 == 5) {
               this.func_108400_a(var1, C_100451_alf.field_106083_I.field_106162_cm, 0, var5, 11, var4, var3);
               this.func_108392_b(var1, var5, 12, var4, var3);
            }
         }
      }

      return true;
   }
}
