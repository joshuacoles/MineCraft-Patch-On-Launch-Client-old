import java.util.List;
import java.util.Random;

public class C_100709_aee extends C_100701_aeq {

   private int field_108452_a = -1;
   private int field_108450_b;
   private int field_108451_c;
   private int field_108449_d;
   private int field_108453_h;


   public C_100709_aee(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
      this.field_108450_b = this.func_108447_a(var3);
      this.field_108451_c = this.func_108447_a(var3);
      this.field_108449_d = this.func_108447_a(var3);
      this.field_108453_h = this.func_108447_a(var3);
   }

   private int func_108447_a(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return C_100451_alf.field_106168_cg.field_106162_cm;
      case 1:
         return C_100451_alf.field_106169_ch.field_106162_cm;
      default:
         return C_100451_alf.field_106195_aC.field_106162_cm;
      }
   }

   public static C_100709_aee func_108448_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
      return func_108414_a(var8) && C_100767_adx.func_108401_a(var1, var8) == null?new C_100709_aee(var0, var7, var2, var8, var6):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108452_a < 0) {
         this.field_108452_a = this.func_108412_b(var1, var3);
         if(this.field_108452_a < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108452_a - this.field_108404_e.field_108338_e + 4 - 1, 0);
      }

      this.func_108384_a(var1, var3, 0, 1, 0, 12, 4, 8, 0, 0, false);
      this.func_108384_a(var1, var3, 1, 0, 1, 2, 0, 7, C_100451_alf.field_106196_aD.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 0, 1, 5, 0, 7, C_100451_alf.field_106196_aD.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 7, 0, 1, 8, 0, 7, C_100451_alf.field_106196_aD.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 10, 0, 1, 11, 0, 7, C_100451_alf.field_106196_aD.field_106162_cm, C_100451_alf.field_106196_aD.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 0, 0, 0, 0, 8, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 0, 0, 6, 0, 8, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 12, 0, 0, 12, 0, 8, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 0, 0, 11, 0, 0, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 0, 8, 11, 0, 8, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 0, 1, 3, 0, 7, C_100451_alf.field_106071_D.field_106162_cm, C_100451_alf.field_106071_D.field_106162_cm, false);
      this.func_108384_a(var1, var3, 9, 0, 1, 9, 0, 7, C_100451_alf.field_106071_D.field_106162_cm, C_100451_alf.field_106071_D.field_106162_cm, false);

      int var4;
      for(var4 = 1; var4 <= 7; ++var4) {
         this.func_108400_a(var1, this.field_108450_b, C_100650_jv.func_108929_a(var2, 2, 7), 1, 1, var4, var3);
         this.func_108400_a(var1, this.field_108450_b, C_100650_jv.func_108929_a(var2, 2, 7), 2, 1, var4, var3);
         this.func_108400_a(var1, this.field_108451_c, C_100650_jv.func_108929_a(var2, 2, 7), 4, 1, var4, var3);
         this.func_108400_a(var1, this.field_108451_c, C_100650_jv.func_108929_a(var2, 2, 7), 5, 1, var4, var3);
         this.func_108400_a(var1, this.field_108449_d, C_100650_jv.func_108929_a(var2, 2, 7), 7, 1, var4, var3);
         this.func_108400_a(var1, this.field_108449_d, C_100650_jv.func_108929_a(var2, 2, 7), 8, 1, var4, var3);
         this.func_108400_a(var1, this.field_108453_h, C_100650_jv.func_108929_a(var2, 2, 7), 10, 1, var4, var3);
         this.func_108400_a(var1, this.field_108453_h, C_100650_jv.func_108929_a(var2, 2, 7), 11, 1, var4, var3);
      }

      for(var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 13; ++var5) {
            this.func_108392_b(var1, var5, 4, var4, var3);
            this.func_108383_b(var1, C_100451_alf.field_106120_y.field_106162_cm, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
