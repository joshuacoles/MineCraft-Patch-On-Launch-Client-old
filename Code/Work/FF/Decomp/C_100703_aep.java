import java.util.List;
import java.util.Random;

public class C_100703_aep extends C_100701_aeq {

   private int field_108439_a = -1;


   public C_100703_aep(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
   }

   public static C_100703_aep func_108438_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 9, 7, 12, var6);
      return func_108414_a(var8) && C_100767_adx.func_108401_a(var1, var8) == null?new C_100703_aep(var0, var7, var2, var8, var6):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108439_a < 0) {
         this.field_108439_a = this.func_108412_b(var1, var3);
         if(this.field_108439_a < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108439_a - this.field_108404_e.field_108338_e + 7 - 1, 0);
      }

      this.func_108384_a(var1, var3, 1, 1, 1, 7, 4, 4, 0, 0, false);
      this.func_108384_a(var1, var3, 2, 1, 6, 8, 4, 10, 0, 0, false);
      this.func_108384_a(var1, var3, 2, 0, 5, 8, 0, 10, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 0, 1, 7, 0, 4, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 0, 0, 3, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 0, 0, 8, 3, 10, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 0, 0, 7, 2, 0, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 0, 5, 2, 1, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 2, 0, 6, 2, 3, 10, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 0, 10, 7, 3, 10, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 0, 7, 3, 0, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 5, 2, 3, 5, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 4, 1, 8, 4, 1, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 4, 4, 3, 4, 4, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 2, 8, 5, 3, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 0, 4, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 0, 4, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 8, 4, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 8, 4, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 8, 4, 4, var3);
      int var4 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 3);
      int var5 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var4, var7, 4 + var6, var6, var3);
            if((var6 > -1 || var7 <= 1) && (var6 > 0 || var7 <= 3) && (var6 > 1 || var7 <= 4 || var7 >= 6)) {
               this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var5, var7, 4 + var6, 5 - var6, var3);
            }
         }
      }

      this.func_108384_a(var1, var3, 3, 4, 5, 3, 4, 10, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 4, 2, 7, 4, 10, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 5, 4, 4, 5, 10, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 5, 4, 6, 5, 10, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 6, 3, 5, 6, 10, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      var6 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 0);

      int var8;
      for(var7 = 4; var7 >= 1; --var7) {
         this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, var7, 2 + var7, 7 - var7, var3);

         for(var8 = 8 - var7; var8 <= 10; ++var8) {
            this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var6, var7, 2 + var7, var8, var3);
         }
      }

      var7 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 1);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 6, 6, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 7, 5, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var7, 6, 6, 4, var3);

      int var9;
      for(var8 = 6; var8 <= 8; ++var8) {
         for(var9 = 5; var9 <= 10; ++var9) {
            this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var7, var8, 12 - var8, var9, var3);
         }
      }

      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 0, 2, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 0, 2, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 4, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 5, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 6, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 8, 2, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 8, 2, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 8, 2, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 8, 2, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 2, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 2, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 8, 2, 9, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 2, 2, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 2, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 2, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 2, 2, 9, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 4, 4, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 5, 4, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106079_M.field_106162_cm, 0, 6, 4, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 5, 5, 10, var3);
      this.func_108400_a(var1, 0, 0, 2, 1, 0, var3);
      this.func_108400_a(var1, 0, 0, 2, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 2, 3, 1, var3);
      this.func_108386_a(var1, var3, var2, 2, 1, 0, this.func_108380_c(C_100451_alf.field_106200_aH.field_106162_cm, 1));
      this.func_108384_a(var1, var3, 1, 0, -1, 3, 2, -1, 0, 0, false);
      if(this.func_108378_a(var1, 2, 0, -1, var3) == 0 && this.func_108378_a(var1, 2, -1, -1, var3) != 0) {
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 2, 0, -1, var3);
      }

      for(var8 = 0; var8 < 5; ++var8) {
         for(var9 = 0; var9 < 9; ++var9) {
            this.func_108392_b(var1, var9, 7, var8, var3);
            this.func_108383_b(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var9, -1, var8, var3);
         }
      }

      for(var8 = 5; var8 < 11; ++var8) {
         for(var9 = 2; var9 < 9; ++var9) {
            this.func_108392_b(var1, var9, 7, var8, var3);
            this.func_108383_b(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var9, -1, var8, var3);
         }
      }

      this.func_108411_a(var1, var3, 4, 1, 2, 2);
      return true;
   }
}
