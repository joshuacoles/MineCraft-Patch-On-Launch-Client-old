import java.util.List;
import java.util.Random;

public class C_100746_adj extends C_100775_adu {

   private static final C_100673_kh[] field_108494_b = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110908_aL.field_110891_cf, 0, 1, 3, 20), new C_100673_kh(C_100992_tt.field_110907_aK.field_110891_cf, 0, 2, 7, 20), new C_100673_kh(C_100992_tt.field_110955_bO.field_110891_cf, 0, 1, 1, 1), new C_100673_kh(C_100992_tt.field_110898_aQ.field_110891_cf, 0, 1, 1, 1)};
   protected final C_100776_adv field_108496_a;
   private final boolean field_108495_c;


   public C_100746_adj(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108496_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
      this.field_108495_c = var3.func_108328_c() > 6;
   }

   public static C_100746_adj func_108493_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if(!func_108466_a(var7) || C_100767_adx.func_108401_a(var0, var7) != null) {
         var7 = C_100516_abo.func_108324_a(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if(!func_108466_a(var7) || C_100767_adx.func_108401_a(var0, var7) != null) {
            return null;
         }
      }

      return new C_100746_adj(var6, var1, var7, var5);
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         byte var4 = 11;
         if(!this.field_108495_c) {
            var4 = 6;
         }

         this.func_108377_a(var1, var3, 0, 0, 0, 13, var4 - 1, 14, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108496_a, 4, 1, 0);
         this.func_108396_a(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, C_100451_alf.field_106096_Z.field_106162_cm, C_100451_alf.field_106096_Z.field_106162_cm, false);

         int var7;
         for(var7 = 1; var7 <= 13; ++var7) {
            if((var7 - 1) % 4 == 0) {
               this.func_108384_a(var1, var3, 1, 1, var7, 1, 4, var7, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
               this.func_108384_a(var1, var3, 12, 1, var7, 12, 4, var7, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
               this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 2, 3, var7, var3);
               this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 11, 3, var7, var3);
               if(this.field_108495_c) {
                  this.func_108384_a(var1, var3, 1, 6, var7, 1, 9, var7, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
                  this.func_108384_a(var1, var3, 12, 6, var7, 12, 9, var7, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
               }
            } else {
               this.func_108384_a(var1, var3, 1, 1, var7, 1, 4, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
               this.func_108384_a(var1, var3, 12, 1, var7, 12, 4, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
               if(this.field_108495_c) {
                  this.func_108384_a(var1, var3, 1, 6, var7, 1, 9, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
                  this.func_108384_a(var1, var3, 12, 6, var7, 12, 9, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
               }
            }
         }

         for(var7 = 3; var7 < 12; var7 += 2) {
            this.func_108384_a(var1, var3, 3, 1, var7, 4, 3, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
            this.func_108384_a(var1, var3, 6, 1, var7, 7, 3, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
            this.func_108384_a(var1, var3, 9, 1, var7, 10, 3, var7, C_100451_alf.field_106214_aq.field_106162_cm, C_100451_alf.field_106214_aq.field_106162_cm, false);
         }

         if(this.field_108495_c) {
            this.func_108384_a(var1, var3, 1, 5, 1, 3, 5, 13, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
            this.func_108384_a(var1, var3, 10, 5, 1, 12, 5, 13, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
            this.func_108384_a(var1, var3, 4, 5, 1, 9, 5, 2, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
            this.func_108384_a(var1, var3, 4, 5, 12, 9, 5, 13, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
            this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 9, 5, 11, var3);
            this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 8, 5, 11, var3);
            this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 9, 5, 10, var3);
            this.func_108384_a(var1, var3, 3, 6, 2, 3, 6, 12, C_100451_alf.field_106147_bc.field_106162_cm, C_100451_alf.field_106147_bc.field_106162_cm, false);
            this.func_108384_a(var1, var3, 10, 6, 2, 10, 6, 10, C_100451_alf.field_106147_bc.field_106162_cm, C_100451_alf.field_106147_bc.field_106162_cm, false);
            this.func_108384_a(var1, var3, 4, 6, 2, 9, 6, 2, C_100451_alf.field_106147_bc.field_106162_cm, C_100451_alf.field_106147_bc.field_106162_cm, false);
            this.func_108384_a(var1, var3, 4, 6, 12, 8, 6, 12, C_100451_alf.field_106147_bc.field_106162_cm, C_100451_alf.field_106147_bc.field_106162_cm, false);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 9, 6, 11, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 8, 6, 11, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 9, 6, 10, var3);
            var7 = this.func_108380_c(C_100451_alf.field_106185_aI.field_106162_cm, 3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 1, 13, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 2, 13, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 3, 13, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 4, 13, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 5, 13, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 6, 13, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, var7, 10, 7, 13, var3);
            byte var8 = 7;
            byte var9 = 7;
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 - 1, 9, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8, 9, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 - 1, 8, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8, 8, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 - 1, 7, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8, 7, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 - 2, 7, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 + 1, 7, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 - 1, 7, var9 - 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8 - 1, 7, var9 + 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8, 7, var9 - 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, var8, 7, var9 + 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, var8 - 2, 8, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, var8 + 1, 8, var9, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, var8 - 1, 8, var9 - 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, var8 - 1, 8, var9 + 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, var8, 8, var9 - 1, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, var8, 8, var9 + 1, var3);
         }

         this.func_108393_a(var1, var3, var2, 3, 3, 5, field_108494_b, 1 + var2.nextInt(4));
         if(this.field_108495_c) {
            this.func_108400_a(var1, 0, 0, 12, 9, 1, var3);
            this.func_108393_a(var1, var3, var2, 12, 8, 1, field_108494_b, 1 + var2.nextInt(4));
         }

         return true;
      }
   }

}
