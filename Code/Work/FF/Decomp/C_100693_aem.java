import java.util.List;
import java.util.Random;

public class C_100693_aem extends C_100701_aeq {

   private static final C_100673_kh[] field_108423_a = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110838_n.field_110891_cf, 0, 1, 3, 3), new C_100673_kh(C_100992_tt.field_110839_o.field_110891_cf, 0, 1, 5, 10), new C_100673_kh(C_100992_tt.field_110853_p.field_110891_cf, 0, 1, 3, 5), new C_100673_kh(C_100992_tt.field_110820_U.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110842_j.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110832_g.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110852_q.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110970_ae.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110960_ad.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110972_af.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110966_ag.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100451_alf.field_106210_as.field_106162_cm, 0, 3, 7, 5), new C_100673_kh(C_100451_alf.field_106076_B.field_106162_cm, 0, 3, 7, 5)};
   private int field_108421_b = -1;
   private boolean field_108422_c;


   public C_100693_aem(C_100691_aen var1, int var2, Random var3, C_100516_abo var4, int var5) {
      super(var1, var2);
      this.field_108402_f = var5;
      this.field_108404_e = var4;
   }

   public static C_100693_aem func_108420_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      C_100516_abo var8 = C_100516_abo.func_108324_a(var3, var4, var5, 0, 0, 0, 10, 6, 7, var6);
      return func_108414_a(var8) && C_100767_adx.func_108401_a(var1, var8) == null?new C_100693_aem(var0, var7, var2, var8, var6):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.field_108421_b < 0) {
         this.field_108421_b = this.func_108412_b(var1, var3);
         if(this.field_108421_b < 0) {
            return true;
         }

         this.field_108404_e.func_108331_a(0, this.field_108421_b - this.field_108404_e.field_108338_e + 6 - 1, 0);
      }

      this.func_108384_a(var1, var3, 0, 1, 0, 9, 4, 6, 0, 0, false);
      this.func_108384_a(var1, var3, 0, 0, 0, 9, 0, 6, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 4, 0, 9, 4, 6, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 5, 0, 9, 5, 6, C_100451_alf.field_106238_an.field_106162_cm, C_100451_alf.field_106238_an.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 5, 1, 8, 5, 5, 0, 0, false);
      this.func_108384_a(var1, var3, 1, 1, 0, 2, 3, 0, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 0, 0, 4, 0, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 1, 0, 3, 4, 0, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 6, 0, 4, 6, C_100451_alf.field_106079_M.field_106162_cm, C_100451_alf.field_106079_M.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 3, 3, 1, var3);
      this.func_108384_a(var1, var3, 3, 1, 2, 3, 3, 2, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 4, 1, 3, 5, 3, 3, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 0, 1, 1, 0, 3, 5, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 1, 1, 6, 5, 3, 6, C_100451_alf.field_106075_A.field_106162_cm, C_100451_alf.field_106075_A.field_106162_cm, false);
      this.func_108384_a(var1, var3, 5, 1, 0, 5, 3, 0, C_100451_alf.field_106147_bc.field_106162_cm, C_100451_alf.field_106147_bc.field_106162_cm, false);
      this.func_108384_a(var1, var3, 9, 1, 0, 9, 3, 0, C_100451_alf.field_106147_bc.field_106162_cm, C_100451_alf.field_106147_bc.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 1, 4, 9, 4, 6, C_100451_alf.field_106119_z.field_106162_cm, C_100451_alf.field_106119_z.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106073_F.field_106162_cm, 0, 7, 1, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106073_F.field_106162_cm, 0, 8, 1, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, 9, 2, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106129_bs.field_106162_cm, 0, 9, 2, 4, var3);
      this.func_108384_a(var1, var3, 7, 2, 4, 8, 2, 5, 0, 0, false);
      this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 6, 1, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106197_aE.field_106162_cm, 0, 6, 2, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106197_aE.field_106162_cm, 0, 6, 3, 3, var3);
      this.func_108400_a(var1, C_100451_alf.field_106236_am.field_106162_cm, 0, 8, 1, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 0, 2, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 2, 2, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106132_bt.field_106162_cm, 0, 4, 2, 6, var3);
      this.func_108400_a(var1, C_100451_alf.field_106147_bc.field_106162_cm, 0, 2, 1, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106192_aP.field_106162_cm, 0, 2, 2, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 1, 1, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 3), 2, 1, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106218_aw.field_106162_cm, this.func_108380_c(C_100451_alf.field_106218_aw.field_106162_cm, 1), 1, 1, 4, var3);
      int var4;
      int var5;
      if(!this.field_108422_c) {
         var4 = this.func_108379_a(1);
         var5 = this.func_108382_a(5, 5);
         int var6 = this.func_108389_b(5, 5);
         if(var3.func_108334_b(var5, var4, var6)) {
            this.field_108422_c = true;
            this.func_108393_a(var1, var3, var2, 5, 1, 5, field_108423_a, 3 + var2.nextInt(6));
         }
      }

      for(var4 = 6; var4 <= 8; ++var4) {
         if(this.func_108378_a(var1, var4, 0, -1, var3) == 0 && this.func_108378_a(var1, var4, -1, -1, var3) != 0) {
            this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3), var4, 0, -1, var3);
         }
      }

      for(var4 = 0; var4 < 7; ++var4) {
         for(var5 = 0; var5 < 10; ++var5) {
            this.func_108392_b(var1, var5, 6, var4, var3);
            this.func_108383_b(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var5, -1, var4, var3);
         }
      }

      this.func_108411_a(var1, var3, 7, 1, 1, 1);
      return true;
   }

   protected int func_108410_b(int var1) {
      return 3;
   }

}
