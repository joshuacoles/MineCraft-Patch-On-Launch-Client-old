import java.util.List;
import java.util.Random;

public class C_100752_adf extends C_100775_adu {

   private static final C_100673_kh[] field_108502_a = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110868_bn.field_110891_cf, 0, 1, 1, 10), new C_100673_kh(C_100992_tt.field_110838_n.field_110891_cf, 0, 1, 3, 3), new C_100673_kh(C_100992_tt.field_110839_o.field_110891_cf, 0, 1, 5, 10), new C_100673_kh(C_100992_tt.field_110853_p.field_110891_cf, 0, 1, 3, 5), new C_100673_kh(C_100992_tt.field_110915_aC.field_110891_cf, 0, 4, 9, 5), new C_100673_kh(C_100992_tt.field_110820_U.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110842_j.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110832_g.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110852_q.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110970_ae.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110960_ad.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110972_af.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110966_ag.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110926_at.field_110891_cf, 0, 1, 1, 1)};
   private final C_100776_adv field_108500_b;
   private boolean field_108501_c;


   public C_100752_adf(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108500_b = this.func_108467_a(var2);
      this.field_108404_e = var3;
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108468_a((C_100734_adr)var1, var2, var3, 1, 1);
   }

   public static C_100752_adf func_108499_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100752_adf(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108500_b, 1, 1, 0);
         this.func_108470_a(var1, var2, var3, C_100776_adv.field_109830_a, 1, 1, 6);
         this.func_108384_a(var1, var3, 3, 1, 2, 3, 1, 4, C_100451_alf.field_106135_bp.field_106162_cm, C_100451_alf.field_106135_bp.field_106162_cm, false);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 5, 3, 1, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 5, 3, 1, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 5, 3, 2, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 5, 3, 2, 4, var3);

         int var4;
         for(var4 = 2; var4 <= 4; ++var4) {
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 5, 2, 1, var4, var3);
         }

         if(!this.field_108501_c) {
            var4 = this.func_108379_a(2);
            int var5 = this.func_108382_a(3, 3);
            int var6 = this.func_108389_b(3, 3);
            if(var3.func_108334_b(var5, var4, var6)) {
               this.field_108501_c = true;
               this.func_108393_a(var1, var3, var2, 3, 2, 3, field_108502_a, 2 + var2.nextInt(2));
            }
         }

         return true;
      }
   }

}
