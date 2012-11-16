import java.util.List;
import java.util.Random;

public class C_100713_aek extends C_100701_aeq {

   private int field_108459_a = -1;
   private final boolean field_108457_b;
   private final int field_108458_c;


   public C_100713_aek(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
      this.field_108457_b = var3.nextBoolean();
      this.field_108458_c = var3.nextInt(3);
   }

   public static C_100713_aek func_108456_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
      return func_108414_a(var8) && C_100767_adx.func_108401_a(var1, var8) == null?new C_100713_aek(var0, var7, var2, var8, var6):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108459_a < 0) {
         this.field_108459_a = this.func_108412_b(var1, var3);
         if(this.field_108459_a < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108459_a - this.field_108404_e.field_108338_e + 6 - 1, 0);
      }

      this.func_108384_a(var1, var3, 1, 1, 1, 3, 5, 4, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 0, 0, 3, 0, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 0, 1, 2, 0, 3, C_100451_alf.field_106120_y.field_106162_cm, C_100451_alf.field_106120_y.field_106162_cm, false);
      if(this.field_108457_b) {
         this.func_108384_a(var1, var3, 1, 4, 1, 2, 4, 3, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      } else {
         this.func_108384_a(var1, var3, 1, 5, 1, 2, 5, 3, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      }

      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 1, 4, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 2, 4, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 1, 4, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 2, 4, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 0, 4, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 0, 4, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 0, 4, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 3, 4, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 3, 4, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 3, 4, 3, var3);
      this.func_108384_a(var1, var3, 0, 1, 0, 0, 3, 0, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 1, 0, 3, 3, 0, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 4, 0, 3, 4, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 1, 4, 3, 3, 4, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 1, 0, 3, 3, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 1, 1, 3, 3, 3, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 0, 2, 3, 0, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 4, 2, 3, 4, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 3, 2, 2, var3);
      if(this.field_108458_c > 0) {
         this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, this.field_108458_c, 1, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106192_aP.field_106162_cm, 0, this.field_108458_c, 2, 3, var3);
      }

      this.func_108400_a(var1, 0, 0, 1, 1, 0, var3);
      this.func_108400_a(var1, 0, 0, 1, 2, 0, var3);
      this.func_108386_a(var1, var3, var2, 1, 1, 0, this.func_108380_c(C_100451_alf.field_106200_aH.field_106162_cm, 1));
      if(this.func_108378_a(var1, 1, 0, -1, var3) == 0 && this.func_108378_a(var1, 1, -1, -1, var3) != 0) {
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 1, 0, -1, var3);
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 4; ++var5) {
            this.func_108392_b(var1, var5, 6, var4, var3);
            this.func_108383_b(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var5, -1, var4, var3);
         }
      }

      this.func_108411_a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
