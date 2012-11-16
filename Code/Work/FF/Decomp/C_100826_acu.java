import java.util.Random;

public class C_100826_acu extends C_100819_acx {

   private boolean[] field_108549_h = new boolean[4];
   private static final C_100673_kh[] field_108550_i = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110838_n.field_110891_cf, 0, 1, 3, 3), new C_100673_kh(C_100992_tt.field_110839_o.field_110891_cf, 0, 1, 5, 10), new C_100673_kh(C_100992_tt.field_110853_p.field_110891_cf, 0, 2, 7, 15), new C_100673_kh(C_100992_tt.field_110965_bH.field_110891_cf, 0, 1, 3, 2), new C_100673_kh(C_100992_tt.field_110903_aX.field_110891_cf, 0, 4, 6, 20), new C_100673_kh(C_100992_tt.field_110875_bm.field_110891_cf, 0, 3, 7, 16)};


   public C_100826_acu(Random var1, int var2, int var3) {
      super(var1, var2, 64, var3, 21, 15, 21);
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      this.func_108384_a(var1, var3, 0, -4, 0, this.field_108540_a - 1, 0, this.field_108539_c - 1, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);

      int var4;
      for(var4 = 1; var4 <= 9; ++var4) {
         this.func_108384_a(var1, var3, var4, var4, var4, this.field_108540_a - 1 - var4, var4, this.field_108539_c - 1 - var4, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
         this.func_108384_a(var1, var3, var4 + 1, var4, var4 + 1, this.field_108540_a - 2 - var4, var4, this.field_108539_c - 2 - var4, 0, 0, false);
      }

      int var5;
      for(var4 = 0; var4 < this.field_108540_a; ++var4) {
         for(var5 = 0; var5 < this.field_108539_c; ++var5) {
            this.func_108383_b(var1, C_100451_alf.field_106087_T.field_106162_cm, 0, var4, -5, var5, var3);
         }
      }

      var4 = this.func_108380_c(C_100451_alf.field_106209_bT.field_106162_cm, 3);
      var5 = this.func_108380_c(C_100451_alf.field_106209_bT.field_106162_cm, 2);
      int var6 = this.func_108380_c(C_100451_alf.field_106209_bT.field_106162_cm, 0);
      int var7 = this.func_108380_c(C_100451_alf.field_106209_bT.field_106162_cm, 1);
      byte var8 = 1;
      byte var9 = 11;
      this.func_108384_a(var1, var3, 0, 0, 0, 4, 9, 4, C_100451_alf.field_106087_T.field_106162_cm, 0, false);
      this.func_108384_a(var1, var3, 1, 10, 1, 3, 10, 3, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var4, 2, 10, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var5, 2, 10, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var6, 0, 10, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var7, 4, 10, 2, var3);
      this.func_108384_a(var1, var3, this.field_108540_a - 5, 0, 0, this.field_108540_a - 1, 9, 4, C_100451_alf.field_106087_T.field_106162_cm, 0, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 4, 10, 1, this.field_108540_a - 2, 10, 3, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var4, this.field_108540_a - 3, 10, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var5, this.field_108540_a - 3, 10, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var6, this.field_108540_a - 5, 10, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var7, this.field_108540_a - 1, 10, 2, var3);
      this.func_108384_a(var1, var3, 8, 0, 0, 12, 4, 4, C_100451_alf.field_106087_T.field_106162_cm, 0, false);
      this.func_108384_a(var1, var3, 9, 1, 0, 11, 3, 4, 0, 0, false);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 9, 1, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 9, 2, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 9, 3, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 10, 3, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 11, 3, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 11, 2, 1, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 11, 1, 1, var3);
      this.func_108384_a(var1, var3, 4, 1, 1, 8, 3, 3, C_100451_alf.field_106087_T.field_106162_cm, 0, false);
      this.func_108384_a(var1, var3, 4, 1, 2, 8, 2, 2, 0, 0, false);
      this.func_108384_a(var1, var3, 12, 1, 1, 16, 3, 3, C_100451_alf.field_106087_T.field_106162_cm, 0, false);
      this.func_108384_a(var1, var3, 12, 1, 2, 16, 2, 2, 0, 0, false);
      this.func_108384_a(var1, var3, 5, 4, 5, this.field_108540_a - 6, 4, this.field_108539_c - 6, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, 9, 4, 9, 11, 4, 11, 0, 0, false);
      this.func_108388_a(var1, var3, 8, 1, 8, 8, 3, 8, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108388_a(var1, var3, 12, 1, 8, 12, 3, 8, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108388_a(var1, var3, 8, 1, 12, 8, 3, 12, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108388_a(var1, var3, 12, 1, 12, 12, 3, 12, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108384_a(var1, var3, 1, 1, 5, 4, 4, 11, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 5, 1, 5, this.field_108540_a - 2, 4, 11, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, 6, 7, 9, 6, 7, 11, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 7, 7, 9, this.field_108540_a - 7, 7, 11, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108388_a(var1, var3, 5, 5, 9, 5, 7, 11, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108388_a(var1, var3, this.field_108540_a - 6, 5, 9, this.field_108540_a - 6, 7, 11, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108400_a(var1, 0, 0, 5, 5, 10, var3);
      this.func_108400_a(var1, 0, 0, 5, 6, 10, var3);
      this.func_108400_a(var1, 0, 0, 6, 6, 10, var3);
      this.func_108400_a(var1, 0, 0, this.field_108540_a - 6, 5, 10, var3);
      this.func_108400_a(var1, 0, 0, this.field_108540_a - 6, 6, 10, var3);
      this.func_108400_a(var1, 0, 0, this.field_108540_a - 7, 6, 10, var3);
      this.func_108384_a(var1, var3, 2, 4, 4, 2, 6, 4, 0, 0, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 3, 4, 4, this.field_108540_a - 3, 6, 4, 0, 0, false);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var4, 2, 4, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var4, 2, 3, 4, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var4, this.field_108540_a - 3, 4, 5, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var4, this.field_108540_a - 3, 3, 4, var3);
      this.func_108384_a(var1, var3, 1, 1, 3, 2, 2, 3, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 3, 1, 3, this.field_108540_a - 2, 2, 3, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, 0, 1, 1, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, 0, this.field_108540_a - 2, 1, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 1, 1, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106238_an.field_106162_cm, 1, this.field_108540_a - 2, 2, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var7, 2, 1, 2, var3);
      this.func_108400_a(var1, C_100451_alf.field_106209_bT.field_106162_cm, var6, this.field_108540_a - 3, 1, 2, var3);
      this.func_108384_a(var1, var3, 4, 3, 5, 4, 3, 18, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 5, 3, 5, this.field_108540_a - 5, 3, 17, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, 3, 1, 5, 4, 2, 16, 0, 0, false);
      this.func_108384_a(var1, var3, this.field_108540_a - 6, 1, 5, this.field_108540_a - 5, 2, 16, 0, 0, false);

      int var10;
      for(var10 = 5; var10 <= 17; var10 += 2) {
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 4, 1, var10, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, 4, 2, var10, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, this.field_108540_a - 5, 1, var10, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, this.field_108540_a - 5, 2, var10, var3);
      }

      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 10, 0, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 10, 0, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 9, 0, 9, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 11, 0, 9, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 8, 0, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 12, 0, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 7, 0, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 13, 0, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 9, 0, 11, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 11, 0, 11, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 10, 0, 12, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 10, 0, 13, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var9, 10, 0, 10, var3);

      for(var10 = 0; var10 <= this.field_108540_a - 1; var10 += this.field_108540_a - 1) {
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 2, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 2, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 2, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 3, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 3, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 3, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 4, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, var10, 4, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 4, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 5, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 5, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 5, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 6, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, var10, 6, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 6, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 7, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 7, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 7, 3, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 8, 1, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 8, 2, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 8, 3, var3);
      }

      for(var10 = 2; var10 <= this.field_108540_a - 3; var10 += this.field_108540_a - 3 - 2) {
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 - 1, 2, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 2, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 + 1, 2, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 - 1, 3, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 3, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 + 1, 3, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10 - 1, 4, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, var10, 4, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10 + 1, 4, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 - 1, 5, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 5, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 + 1, 5, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10 - 1, 6, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, var10, 6, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10 + 1, 6, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10 - 1, 7, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10, 7, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, var10 + 1, 7, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 - 1, 8, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10, 8, 0, var3);
         this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, var10 + 1, 8, 0, var3);
      }

      this.func_108388_a(var1, var3, 8, 4, 0, 12, 6, 0, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108400_a(var1, 0, 0, 8, 6, 0, var3);
      this.func_108400_a(var1, 0, 0, 12, 6, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 9, 5, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, 10, 5, 0, var3);
      this.func_108400_a(var1, C_100451_alf.field_106252_ae.field_106162_cm, var8, 11, 5, 0, var3);
      this.func_108388_a(var1, var3, 8, -14, 8, 12, -11, 12, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108388_a(var1, var3, 8, -10, 8, 12, -10, 12, C_100451_alf.field_106087_T.field_106162_cm, 1, C_100451_alf.field_106087_T.field_106162_cm, 1, false);
      this.func_108388_a(var1, var3, 8, -9, 8, 12, -9, 12, C_100451_alf.field_106087_T.field_106162_cm, 2, C_100451_alf.field_106087_T.field_106162_cm, 2, false);
      this.func_108384_a(var1, var3, 8, -8, 8, 12, -1, 12, C_100451_alf.field_106087_T.field_106162_cm, C_100451_alf.field_106087_T.field_106162_cm, false);
      this.func_108384_a(var1, var3, 9, -11, 9, 11, -1, 11, 0, 0, false);
      this.func_108400_a(var1, C_100451_alf.field_106190_aN.field_106162_cm, 0, 10, -11, 10, var3);
      this.func_108384_a(var1, var3, 9, -13, 9, 11, -13, 11, C_100451_alf.field_106234_ap.field_106162_cm, 0, false);
      this.func_108400_a(var1, 0, 0, 8, -11, 10, var3);
      this.func_108400_a(var1, 0, 0, 8, -10, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, 7, -10, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 7, -11, 10, var3);
      this.func_108400_a(var1, 0, 0, 12, -11, 10, var3);
      this.func_108400_a(var1, 0, 0, 12, -10, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, 13, -10, 10, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 13, -11, 10, var3);
      this.func_108400_a(var1, 0, 0, 10, -11, 8, var3);
      this.func_108400_a(var1, 0, 0, 10, -10, 8, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, 10, -10, 7, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 10, -11, 7, var3);
      this.func_108400_a(var1, 0, 0, 10, -11, 12, var3);
      this.func_108400_a(var1, 0, 0, 10, -10, 12, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 1, 10, -10, 13, var3);
      this.func_108400_a(var1, C_100451_alf.field_106087_T.field_106162_cm, 2, 10, -11, 13, var3);

      for(var10 = 0; var10 < 4; ++var10) {
         if(!this.field_108549_h[var10]) {
            int var11 = C_100015_i.field_105283_a[var10] * 2;
            int var12 = C_100015_i.field_105281_b[var10] * 2;
            this.field_108549_h[var10] = this.func_108393_a(var1, var3, var2, 10 + var11, -11, 10 + var12, field_108550_i, 2 + var2.nextInt(5));
         }
      }

      return true;
   }

}
