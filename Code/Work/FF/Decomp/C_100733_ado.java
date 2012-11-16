import java.util.List;
import java.util.Random;

public class C_100733_ado extends C_100775_adu {

   private static final C_100673_kh[] field_108473_c = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110839_o.field_110891_cf, 0, 1, 5, 10), new C_100673_kh(C_100992_tt.field_110853_p.field_110891_cf, 0, 1, 3, 5), new C_100673_kh(C_100992_tt.field_110915_aC.field_110891_cf, 0, 4, 9, 5), new C_100673_kh(C_100992_tt.field_110841_m.field_110891_cf, 0, 3, 8, 10), new C_100673_kh(C_100992_tt.field_110820_U.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110842_j.field_110891_cf, 0, 1, 3, 15), new C_100673_kh(C_100992_tt.field_110832_g.field_110891_cf, 0, 1, 1, 1)};
   protected final C_100776_adv field_108474_a;
   protected final int field_108472_b;


   public C_100733_ado(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108474_a = this.func_108467_a(var2);
      this.field_108404_e = var3;
      this.field_108472_b = var2.nextInt(5);
   }

   public void func_108391_a(C_100767_adx var1, List var2, Random var3) {
      this.func_108468_a((C_100734_adr)var1, var2, var3, 4, 1);
      this.func_108465_b((C_100734_adr)var1, var2, var3, 1, 4);
      this.func_108469_c((C_100734_adr)var1, var2, var3, 1, 4);
   }

   public static C_100733_ado func_108471_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return func_108466_a(var7) && C_100767_adx.func_108401_a(var0, var7) == null?new C_100733_ado(var6, var1, var7, var5):null;
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         this.func_108377_a(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, C_100810_adb.func_109988_b());
         this.func_108470_a(var1, var2, var3, this.field_108474_a, 4, 1, 0);
         this.func_108384_a(var1, var3, 4, 1, 10, 6, 3, 10, 0, 0, false);
         this.func_108384_a(var1, var3, 0, 1, 4, 0, 3, 6, 0, 0, false);
         this.func_108384_a(var1, var3, 10, 1, 4, 10, 3, 6, 0, 0, false);
         int var4;
         switch(this.field_108472_b) {
         case 0:
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 5, 1, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 5, 2, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 5, 3, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 4, 3, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 6, 3, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 5, 3, 4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 5, 3, 6, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 4, 1, 4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 4, 1, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 4, 1, 6, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 6, 1, 4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 6, 1, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 6, 1, 6, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 5, 1, 4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 0, 5, 1, 6, var3);
            break;
         case 1:
            for(var4 = 0; var4 < 5; ++var4) {
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 1, 3 + var4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 7, 1, 3 + var4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3 + var4, 1, 3, var3);
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3 + var4, 1, 7, var3);
            }

            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 5, 1, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 5, 2, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 5, 3, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106071_D.field_106162_cm, 0, 5, 4, 5, var3);
            break;
         case 2:
            for(var4 = 1; var4 <= 9; ++var4) {
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 1, 3, var4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 9, 3, var4, var3);
            }

            for(var4 = 1; var4 <= 9; ++var4) {
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var4, 3, 1, var3);
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, var4, 3, 9, var3);
            }

            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 5, 1, 4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 5, 1, 6, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 5, 3, 4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 5, 3, 6, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 4, 1, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 6, 1, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 4, 3, 5, var3);
            this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 6, 3, 5, var3);

            for(var4 = 1; var4 <= 3; ++var4) {
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 4, var4, 4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 6, var4, 4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 4, var4, 6, var3);
               this.func_108400_a(var1, C_100451_alf.field_106119_z.field_106162_cm, 0, 6, var4, 6, var3);
            }

            this.func_108400_a(var1, C_100451_alf.field_106208_at.field_106162_cm, 0, 5, 3, 5, var3);

            for(var4 = 2; var4 <= 8; ++var4) {
               this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 2, 3, var4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 3, 3, var4, var3);
               if(var4 <= 3 || var4 >= 7) {
                  this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 4, 3, var4, var3);
                  this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 5, 3, var4, var3);
                  this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 6, 3, var4, var3);
               }

               this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 7, 3, var4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106075_A.field_106162_cm, 0, 8, 3, var4, var3);
            }

            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, this.func_108380_c(C_100451_alf.field_106185_aI.field_106162_cm, 4), 9, 1, 3, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, this.func_108380_c(C_100451_alf.field_106185_aI.field_106162_cm, 4), 9, 2, 3, var3);
            this.func_108400_a(var1, C_100451_alf.field_106185_aI.field_106162_cm, this.func_108380_c(C_100451_alf.field_106185_aI.field_106162_cm, 4), 9, 3, 3, var3);
            this.func_108393_a(var1, var3, var2, 3, 4, 8, field_108473_c, 1 + var2.nextInt(4));
         }

         return true;
      }
   }

}
