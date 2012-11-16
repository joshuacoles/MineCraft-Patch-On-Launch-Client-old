import java.util.Random;

public class C_100823_acv extends C_100819_acx {

   private boolean field_108547_h;
   private boolean field_108548_i;
   private boolean field_108545_j;
   private boolean field_108546_k;
   private static final C_100673_kh[] field_108543_l = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110838_n.field_110891_cf, 0, 1, 3, 3), new C_100673_kh(C_100992_tt.field_110839_o.field_110891_cf, 0, 1, 5, 10), new C_100673_kh(C_100992_tt.field_110853_p.field_110891_cf, 0, 2, 7, 15), new C_100673_kh(C_100992_tt.field_110965_bH.field_110891_cf, 0, 1, 3, 2), new C_100673_kh(C_100992_tt.field_110903_aX.field_110891_cf, 0, 4, 6, 20), new C_100673_kh(C_100992_tt.field_110875_bm.field_110891_cf, 0, 3, 7, 16)};
   private static final C_100673_kh[] field_108544_m = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110840_l.field_110891_cf, 0, 2, 7, 30)};
   private static C_100824_acw field_108542_n = new C_100824_acw((C_100825_act)null);


   public C_100823_acv(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 12, 10, 15);
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(!this.func_108536_a(var1, var3, 0)) {
         return false;
      } else {
         int var4 = this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 3);
         int var5 = this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 2);
         int var6 = this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 0);
         int var7 = this.func_108380_c(C_100451_alf.field_106187_aK.field_106162_cm, 1);
         this.func_108377_a(var1, var3, 0, -4, 0, this.field_108540_a - 1, 0, this.field_108539_c - 1, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 2, 1, 2, 9, 2, 2, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 2, 1, 12, 9, 2, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 2, 1, 3, 2, 2, 11, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 9, 1, 3, 9, 2, 11, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 1, 3, 1, 10, 6, 1, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 1, 3, 13, 10, 6, 13, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 1, 3, 2, 1, 6, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 10, 3, 2, 10, 6, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 2, 3, 2, 9, 3, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 2, 6, 2, 9, 6, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 3, 7, 3, 8, 7, 11, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 4, 8, 4, 7, 8, 10, false, var2, field_108542_n);
         this.func_108397_a(var1, var3, 3, 1, 3, 8, 2, 11);
         this.func_108397_a(var1, var3, 4, 3, 6, 7, 3, 9);
         this.func_108397_a(var1, var3, 2, 4, 2, 9, 5, 12);
         this.func_108397_a(var1, var3, 4, 6, 5, 7, 6, 9);
         this.func_108397_a(var1, var3, 5, 7, 6, 6, 7, 8);
         this.func_108397_a(var1, var3, 5, 1, 2, 6, 2, 2);
         this.func_108397_a(var1, var3, 5, 2, 12, 6, 2, 12);
         this.func_108397_a(var1, var3, 5, 5, 1, 6, 5, 1);
         this.func_108397_a(var1, var3, 5, 5, 13, 6, 5, 13);
         this.func_108400_a(var1, 0, 0, 1, 5, 5, var3);
         this.func_108400_a(var1, 0, 0, 10, 5, 5, var3);
         this.func_108400_a(var1, 0, 0, 1, 5, 9, var3);
         this.func_108400_a(var1, 0, 0, 10, 5, 9, var3);

         int var8;
         for(var8 = 0; var8 <= 14; var8 += 14) {
            this.func_108377_a(var1, var3, 2, 4, var8, 2, 5, var8, false, var2, field_108542_n);
            this.func_108377_a(var1, var3, 4, 4, var8, 4, 5, var8, false, var2, field_108542_n);
            this.func_108377_a(var1, var3, 7, 4, var8, 7, 5, var8, false, var2, field_108542_n);
            this.func_108377_a(var1, var3, 9, 4, var8, 9, 5, var8, false, var2, field_108542_n);
         }

         this.func_108377_a(var1, var3, 5, 6, 0, 6, 6, 0, false, var2, field_108542_n);

         for(var8 = 0; var8 <= 11; var8 += 11) {
            for(int var9 = 2; var9 <= 12; var9 += 2) {
               this.func_108377_a(var1, var3, var8, 4, var9, var8, 5, var9, false, var2, field_108542_n);
            }

            this.func_108377_a(var1, var3, var8, 6, 5, var8, 6, 5, false, var2, field_108542_n);
            this.func_108377_a(var1, var3, var8, 6, 9, var8, 6, 9, false, var2, field_108542_n);
         }

         this.func_108377_a(var1, var3, 2, 7, 2, 2, 9, 2, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 9, 7, 2, 9, 9, 2, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 2, 7, 12, 2, 9, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 9, 7, 12, 9, 9, 12, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 4, 9, 4, 4, 9, 4, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 7, 9, 4, 7, 9, 4, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 4, 9, 10, 4, 9, 10, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 7, 9, 10, 7, 9, 10, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 5, 9, 7, 6, 9, 7, false, var2, field_108542_n);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 5, 9, 6, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 6, 9, 6, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var5, 5, 9, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var5, 6, 9, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 4, 0, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 5, 0, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 6, 0, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 7, 0, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 4, 1, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 4, 2, 9, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 4, 3, 10, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 7, 1, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 7, 2, 9, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var4, 7, 3, 10, var3);
         this.func_108377_a(var1, var3, 4, 1, 9, 4, 1, 9, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 7, 1, 9, 7, 1, 9, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 4, 1, 10, 7, 2, 10, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 5, 4, 5, 6, 4, 5, false, var2, field_108542_n);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var6, 4, 4, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var7, 7, 4, 5, var3);

         for(var8 = 0; var8 < 4; ++var8) {
            this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var5, 5, 0 - var8, 6 + var8, var3);
            this.func_108400_a(var1, C_100451_alf.field_106187_aK.field_106162_cm, var5, 6, 0 - var8, 6 + var8, var3);
            this.func_108397_a(var1, var3, 5, 0 - var8, 7 + var8, 6, 0 - var8, 9 + var8);
         }

         this.func_108397_a(var1, var3, 1, -3, 12, 10, -1, 13);
         this.func_108397_a(var1, var3, 1, -3, 1, 3, -1, 13);
         this.func_108397_a(var1, var3, 1, -3, 1, 9, -1, 5);

         for(var8 = 1; var8 <= 13; var8 += 2) {
            this.func_108377_a(var1, var3, 1, -3, var8, 1, -2, var8, false, var2, field_108542_n);
         }

         for(var8 = 2; var8 <= 12; var8 += 2) {
            this.func_108377_a(var1, var3, 1, -1, var8, 3, -1, var8, false, var2, field_108542_n);
         }

         this.func_108377_a(var1, var3, 2, -2, 1, 5, -2, 1, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 7, -2, 1, 9, -2, 1, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 6, -3, 1, 6, -3, 1, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 6, -1, 1, 6, -1, 1, false, var2, field_108542_n);
         this.func_108400_a(var1, C_100451_alf.field_106219_bW.field_106162_cm, this.func_108380_c(C_100451_alf.field_106219_bW.field_106162_cm, 3) | 4, 1, -3, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106219_bW.field_106162_cm, this.func_108380_c(C_100451_alf.field_106219_bW.field_106162_cm, 1) | 4, 4, -3, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106217_bX.field_106162_cm, 4, 2, -3, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106217_bX.field_106162_cm, 4, 3, -3, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 7, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 6, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 4, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 5, -3, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 4, -3, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 3, -3, 1, var3);
         if(!this.field_108545_j) {
            this.field_108545_j = this.func_108385_a(var1, var3, var2, 3, -2, 1, 2, field_108544_m, 2);
         }

         this.func_108400_a(var1, C_100451_alf.field_106128_bx.field_106162_cm, 15, 3, -2, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106219_bW.field_106162_cm, this.func_108380_c(C_100451_alf.field_106219_bW.field_106162_cm, 2) | 4, 7, -3, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106219_bW.field_106162_cm, this.func_108380_c(C_100451_alf.field_106219_bW.field_106162_cm, 0) | 4, 7, -3, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106217_bX.field_106162_cm, 4, 7, -3, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106217_bX.field_106162_cm, 4, 7, -3, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106217_bX.field_106162_cm, 4, 7, -3, 4, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 8, -3, 6, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 9, -3, 6, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 9, -3, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 9, -3, 4, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 9, -2, 4, var3);
         if(!this.field_108546_k) {
            this.field_108546_k = this.func_108385_a(var1, var3, var2, 9, -2, 3, 4, field_108544_m, 2);
         }

         this.func_108400_a(var1, C_100451_alf.field_106128_bx.field_106162_cm, 15, 8, -1, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106128_bx.field_106162_cm, 15, 8, -2, 3, var3);
         if(!this.field_108547_h) {
            this.field_108547_h = this.func_108393_a(var1, var3, var2, 8, -3, 3, field_108543_l, 2 + var2.nextInt(5));
         }

         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 9, -3, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 8, -3, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 4, -3, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 5, -2, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 5, -1, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 6, -3, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 7, -2, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 7, -1, 5, var3);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 8, -3, 5, var3);
         this.func_108377_a(var1, var3, 9, -1, 1, 9, -1, 5, false, var2, field_108542_n);
         this.func_108397_a(var1, var3, 8, -3, 8, 10, -1, 10);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 3, 8, -2, 11, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 3, 9, -2, 11, var3);
         this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 3, 10, -2, 11, var3);
         this.func_108400_a(var1, C_100451_alf.field_106189_aM.field_106162_cm, C_100131_ajk.func_106267_d(this.func_108380_c(C_100451_alf.field_106189_aM.field_106162_cm, 2)), 8, -2, 12, var3);
         this.func_108400_a(var1, C_100451_alf.field_106189_aM.field_106162_cm, C_100131_ajk.func_106267_d(this.func_108380_c(C_100451_alf.field_106189_aM.field_106162_cm, 2)), 9, -2, 12, var3);
         this.func_108400_a(var1, C_100451_alf.field_106189_aM.field_106162_cm, C_100131_ajk.func_106267_d(this.func_108380_c(C_100451_alf.field_106189_aM.field_106162_cm, 2)), 10, -2, 12, var3);
         this.func_108377_a(var1, var3, 8, -3, 8, 8, -3, 10, false, var2, field_108542_n);
         this.func_108377_a(var1, var3, 10, -3, 8, 10, -3, 10, false, var2, field_108542_n);
         this.func_108400_a(var1, C_100451_alf.field_106212_ar.field_106162_cm, 0, 10, -2, 9, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 8, -2, 9, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 8, -2, 10, var3);
         this.func_108400_a(var1, C_100451_alf.field_106203_ay.field_106162_cm, 0, 10, -1, 9, var3);
         this.func_108400_a(var1, C_100451_alf.field_106094_Y.field_106162_cm, 1, 9, -2, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106094_Y.field_106162_cm, this.func_108380_c(C_100451_alf.field_106094_Y.field_106162_cm, 4), 10, -2, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106094_Y.field_106162_cm, this.func_108380_c(C_100451_alf.field_106094_Y.field_106162_cm, 4), 10, -1, 8, var3);
         this.func_108400_a(var1, C_100451_alf.field_106138_bk.field_106162_cm, this.func_108380_c(C_100451_alf.field_106138_bk.field_106162_cm, 2), 10, -2, 10, var3);
         if(!this.field_108548_i) {
            this.field_108548_i = this.func_108393_a(var1, var3, var2, 9, -3, 10, field_108543_l, 2 + var2.nextInt(5));
         }

         return true;
      }
   }

}
