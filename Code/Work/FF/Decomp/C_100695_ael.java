import java.util.List;
import java.util.Random;

public class C_100695_ael extends C_100701_aeq {

   private int field_108425_a = -1;


   public C_100695_ael(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
   }

   public static C_100695_ael func_108424_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 5, 12, 9, var6);
      return func_108414_a(var8) && C_100767_adx.func_108401_a(var1, var8) == null?new C_100695_ael(var0, var7, var2, var8, var6):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108425_a < 0) {
         this.field_108425_a = this.func_108412_b(var1, var3);
         if(this.field_108425_a < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108425_a - this.field_108404_e.field_108338_e + 12 - 1, 0);
      }

      this.func_108384_a(var1, var3, 1, 1, 1, 3, 3, 7, 0, 0, false);
      this.func_108384_a(var1, var3, 1, 5, 1, 3, 9, 3, 0, 0, false);
      this.func_108384_a(var1, var3, 1, 0, 0, 3, 0, 8, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 0, 3, 10, 0, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 1, 0, 10, 3, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 1, 1, 4, 10, 3, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 4, 0, 4, 7, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 0, 4, 4, 4, 7, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 8, 3, 4, 8, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 5, 4, 3, 10, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 5, 5, 3, 5, 7, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 9, 0, 4, 9, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 4, 0, 4, 4, 4, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 0, 11, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 4, 11, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 2, 11, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 2, 11, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 1, 1, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 1, 1, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 2, 1, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 3, 1, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 3, 1, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 1, 1, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 2, 1, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 3, 1, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 1), 1, 2, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 0), 3, 2, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 3, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 3, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 6, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 7, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 6, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 7, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 6, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 7, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 6, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 7, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 3, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 3, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 3, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 2, 4, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 1, 4, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 3, 4, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 2, 4, 5, var3);
      int var4 = this.func_108380_c(C_100451_alf.field_106185_aI.field_106162_cm, 4);

      int var5;
      for(var5 = 1; var5 <= 9; ++var5) {
         this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var4, 3, var5, 3, var3);
      }

      this.func_108400_a(var1, 0, 0, 2, 1, 0, var3);
      this.func_108400_a(var1, 0, 0, 2, 2, 0, var3);
      this.func_108386_a(var1, var3, var2, 2, 1, 0, this.func_108380_c(C_100451_alf.field_106200_aH.field_106162_cm, 1));
      if(this.func_108378_a(var1, 2, 0, -1, var3) == 0 && this.func_108378_a(var1, 2, -1, -1, var3) != 0) {
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), 2, 0, -1, var3);
      }

      for(var5 = 0; var5 < 9; ++var5) {
         for(int var6 = 0; var6 < 5; ++var6) {
            this.func_108392_b(var1, var6, 12, var5, var3);
            this.func_108383_b(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var6, -1, var5, var3);
         }
      }

      this.func_108411_a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int func_108410_b(int var1) {
      return 2;
   }
}
