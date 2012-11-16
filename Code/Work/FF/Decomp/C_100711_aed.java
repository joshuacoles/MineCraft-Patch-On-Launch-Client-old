import java.util.List;
import java.util.Random;

public class C_100711_aed extends C_100701_aeq {

   private int field_108455_a = -1;


   public C_100711_aed(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
   }

   public static C_100711_aed func_108454_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 9, 9, 6, var6);
      return func_108414_a(var8) && C_100767_adx.func_108401_a(var1, var8) == null?new C_100711_aed(var0, var7, var2, var8, var6):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108455_a < 0) {
         this.field_108455_a = this.func_108412_b(var1, var3);
         if(this.field_108455_a < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108455_a - this.field_108404_e.field_108338_e + 9 - 1, 0);
      }

      this.func_108384_a(var1, var3, 1, 1, 1, 7, 5, 4, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 0, 0, 8, 0, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 0, 8, 5, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 6, 1, 8, 6, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 7, 2, 8, 7, 3, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      int var4 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 3);
      int var5 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var4, var7, 6 + var6, var6, var3);
            this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var5, var7, 6 + var6, 5 - var6, var3);
         }
      }

      this.func_108384_a(var1, var3, 0, 1, 0, 0, 1, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 5, 8, 1, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 1, 0, 8, 1, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 2, 1, 0, 7, 1, 0, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 0, 0, 4, 0, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 5, 0, 4, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 2, 5, 8, 4, 5, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 2, 0, 8, 4, 0, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 2, 1, 0, 4, 4, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 5, 7, 4, 5, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 8, 2, 1, 8, 4, 4, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 2, 0, 7, 4, 0, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 5, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 6, 2, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 3, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 5, 3, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 6, 3, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 3, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 3, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 3, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 8, 3, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 2, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 3, 2, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 5, 2, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 6, 2, 5, var3);
      this.func_108384_a(var1, var3, 1, 4, 1, 7, 4, 1, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 4, 4, 7, 4, 4, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 3, 4, 7, 3, 4, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 7, 1, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 0), 7, 1, 3, var3);
      var6 = this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var6, 6, 1, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var6, 5, 1, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var6, 4, 1, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, var6, 3, 1, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 6, 1, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106192_aP.field_106162_cm, 0, 6, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 4, 1, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106192_aP.field_106162_cm, 0, 4, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106194_aB.field_106162_cm, 0, 7, 1, 1, var3);
      this.func_108400_a(var1, 0, 0, 1, 1, 0, var3);
      this.func_108400_a(var1, 0, 0, 1, 2, 0, var3);
      this.func_108386_a(var1, var3, var2, 1, 1, 0, this.func_108380_c(C_100451_alf.field_106200_aH.field_106162_cm, 1));
      if(this.func_108378_a(var1, 1, 0, -1, var3) == 0 && this.func_108378_a(var1, 1, -1, -1, var3) != 0) {
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 1, 0, -1, var3);
      }

      for(var7 = 0; var7 < 6; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.func_108392_b(var1, var8, 9, var7, var3);
            this.func_108383_b(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var8, -1, var7, var3);
         }
      }

      this.func_108411_a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int func_108410_b(int var1) {
      return 1;
   }
}
