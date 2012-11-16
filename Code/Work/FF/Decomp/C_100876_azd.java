import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_100876_azd {

   public C_100837_xo field_110522_a;
   private int field_110517_d = -1;
   private boolean field_110519_e = false;
   private boolean field_110514_f = false;
   public static boolean field_110520_b = true;
   public boolean field_110521_c = true;
   private double field_110515_g;
   private double field_110536_h;
   private double field_110538_i;
   private double field_110532_j;
   private double field_110534_k;
   private double field_110528_l;
   private boolean field_110530_m = false;
   private int field_110524_n = 0;
   private int field_110526_o = 0;
   private int field_110554_p = 0;
   private int field_110552_q = 0;
   private int field_110550_r = 0;
   private int field_110548_s = 0;
   private boolean field_110546_t;
   private float field_110544_u;
   private float field_110542_v;
   private float field_110540_w;
   private float field_110565_x;
   private float field_110563_y;
   private float field_110561_z;
   private float field_110474_A;
   private float field_110475_B;
   private float field_110476_C;
   private float field_110470_D;
   private float field_110471_E;
   private float field_110472_F;
   private float field_110473_G;
   private float field_110486_H;
   private float field_110488_I;
   private float field_110489_J;
   private float field_110490_K;
   private float field_110478_L;
   private float field_110480_M;
   private float field_110482_N;
   private float field_110484_O;
   private float field_110500_P;
   private float field_110498_Q;
   private float field_110504_R;
   private float field_110502_S;
   private float field_110494_T;
   private float field_110492_U;
   private int field_110513_Z;
   private int field_110557_aa;
   private int field_110558_ab;
   private int field_110555_ac;
   private int field_110556_ad;
   private int field_110562_ae;
   private int field_110564_af;
   private int field_110559_ag;
   private int field_110560_ah;
   private int field_110543_ai;
   private int field_110545_aj;
   private int field_110539_ak;
   private int field_110541_al;
   private int field_110551_am;
   private int field_110553_an;
   private int field_110547_ao;
   private int field_110549_ap;
   private int field_110529_aq;
   private int field_110527_ar;
   private int field_110525_as;
   private int field_110523_at = 1;
   private int field_110537_au;
   private int field_110535_av;
   private int field_110533_aw;
   private int field_110531_ax;
   private float field_110518_ay;
   private float field_110516_az;
   private float field_110505_aA;
   private float field_110506_aB;
   private float field_110507_aC;
   private float field_110508_aD;
   private float field_110509_aE;
   private float field_110510_aF;
   private float field_110511_aG;
   private float field_110512_aH;
   private float field_110491_aI;
   private float field_110493_aJ;
   private boolean field_110495_aK;
   private boolean field_110496_aL;
   private boolean field_110497_aM;
   private boolean field_110499_aN;
   private boolean field_110501_aO;
   private boolean field_110503_aP;
   private boolean field_110479_aQ;
   private boolean field_110477_aR;
   private boolean field_110483_aS;
   private boolean field_110481_aT;
   private boolean field_110487_aU;
   private boolean field_110485_aV;


   public C_100876_azd(C_100837_xo var1) {
      this.field_110522_a = var1;
   }

   public C_100876_azd() {}

   public void func_110403_a(int var1) {
      this.field_110517_d = var1;
   }

   public void func_110434_a() {
      this.field_110517_d = -1;
   }

   public void func_110442_a(double var1, double var3, double var5, double var7, double var9, double var11) {
      if(!this.field_110530_m) {
         this.field_110515_g = var1;
         this.field_110536_h = var7;
         this.field_110538_i = var3;
         this.field_110532_j = var9;
         this.field_110534_k = var5;
         this.field_110528_l = var11;
      }

   }

   public void func_110421_a(C_100451_alf var1) {
      if(!this.field_110530_m) {
         this.field_110515_g = var1.func_106062_v();
         this.field_110536_h = var1.func_106027_w();
         this.field_110538_i = var1.func_106032_x();
         this.field_110532_j = var1.func_106068_y();
         this.field_110534_k = var1.func_105995_z();
         this.field_110528_l = var1.func_106002_A();
      }

   }

   public void func_110432_b(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_110515_g = var1;
      this.field_110536_h = var7;
      this.field_110538_i = var3;
      this.field_110532_j = var9;
      this.field_110534_k = var5;
      this.field_110528_l = var11;
      this.field_110530_m = true;
   }

   public void func_110414_b() {
      this.field_110530_m = false;
   }

   public void func_110468_a(C_100451_alf var1, int var2, int var3, int var4, int var5) {
      this.field_110517_d = var5;
      this.func_110436_b(var1, var2, var3, var4);
      this.field_110517_d = -1;
   }

   public void func_110424_a(C_100451_alf var1, int var2, int var3, int var4) {
      this.field_110514_f = true;
      this.func_110436_b(var1, var2, var3, var4);
      this.field_110514_f = false;
   }

   public boolean func_110436_b(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = var1.func_106013_d();
      var1.func_106007_a(this.field_110522_a, var2, var3, var4);
      this.func_110421_a(var1);
      return var5 == 0?this.func_110426_q(var1, var2, var3, var4):(var5 == 31?this.func_110427_r(var1, var2, var3, var4):(var5 == 4?this.func_110452_p(var1, var2, var3, var4):(var5 == 13?this.func_110456_s(var1, var2, var3, var4):(var5 == 1?this.func_110449_l(var1, var2, var3, var4):(var5 == 19?this.func_110463_m(var1, var2, var3, var4):(var5 == 23?this.func_110467_o(var1, var2, var3, var4):(var5 == 6?this.func_110408_n(var1, var2, var3, var4):(var5 == 2?this.func_110429_c(var1, var2, var3, var4):(var5 == 3?this.func_110405_h(var1, var2, var3, var4):(var5 == 5?this.func_110444_i(var1, var2, var3, var4):(var5 == 8?this.func_110446_j(var1, var2, var3, var4):(var5 == 7?this.func_110416_t(var1, var2, var3, var4):(var5 == 9?this.func_110401_a((C_100127_akg)var1, var2, var3, var4):(var5 == 10?this.func_110460_a((C_100463_akw)var1, var2, var3, var4):(var5 == 27?this.func_110411_a((C_100194_ain)var1, var2, var3, var4):(var5 == 11?this.func_110465_a((C_100206_ait)var1, var2, var3, var4):(var5 == 32?this.func_110410_a((C_100431_alt)var1, var2, var3, var4):(var5 == 12?this.func_110419_e(var1, var2, var3, var4):(var5 == 29?this.func_110423_f(var1, var2, var3, var4):(var5 == 30?this.func_110438_g(var1, var2, var3, var4):(var5 == 14?this.func_110407_v(var1, var2, var3, var4):(var5 == 15?this.func_110447_w(var1, var2, var3, var4):(var5 == 16?this.func_110451_b(var1, var2, var3, var4, false):(var5 == 17?this.func_110448_c(var1, var2, var3, var4, true):(var5 == 18?this.func_110469_a((C_100450_ale)var1, var2, var3, var4):(var5 == 20?this.func_110431_k(var1, var2, var3, var4):(var5 == 21?this.func_110422_a((C_100204_ais)var1, var2, var3, var4):(var5 == 24?this.func_110409_a((C_100220_ahy)var1, var2, var3, var4):(var5 == 33?this.func_110418_a((C_100210_aiv)var1, var2, var3, var4):(var5 == 35?this.func_110441_a((C_100259_aho)var1, var2, var3, var4):(var5 == 25?this.func_110453_a((C_100251_ahs)var1, var2, var3, var4):(var5 == 26?this.func_110458_u(var1, var2, var3, var4):(var5 == 28?this.func_110413_a((C_100228_aic)var1, var2, var3, var4):(var5 == 34?this.func_110430_a((C_100261_ahp)var1, var2, var3, var4):false))))))))))))))))))))))))))))))))));
   }

   private boolean func_110458_u(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var6 = var5 & 3;
      if(var6 == 0) {
         this.field_110550_r = 3;
      } else if(var6 == 3) {
         this.field_110550_r = 1;
      } else if(var6 == 1) {
         this.field_110550_r = 2;
      }

      if(!C_100449_ald.func_106434_e(var5)) {
         this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.field_110550_r = 0;
         return true;
      } else {
         this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.field_110517_d = 174;
         this.func_110442_a(0.25D, 0.8125D, 0.25D, 0.75D, 1.0D, 0.75D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110434_a();
         this.field_110550_r = 0;
         return true;
      }
   }

   private boolean func_110407_v(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var7 = C_100255_ahq.func_106302_e(var6);
      boolean var8 = C_100255_ahq.func_106313_b_(var6);
      float var9 = 0.5F;
      float var10 = 1.0F;
      float var11 = 0.8F;
      float var12 = 0.6F;
      int var25 = var1.func_106050_e(this.field_110522_a, var2, var3, var4);
      var5.func_110328_c(var25);
      var5.func_110334_a(var9, var9, var9);
      int var27 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 0);
      int var28 = (var27 & 15) << 4;
      int var29 = var27 & 240;
      double var30 = (double)((float)var28 / 256.0F);
      double var32 = ((double)(var28 + 16) - 0.01D) / 256.0D;
      double var34 = (double)((float)var29 / 256.0F);
      double var36 = ((double)(var29 + 16) - 0.01D) / 256.0D;
      double var38 = (double)var2 + this.field_110515_g;
      double var40 = (double)var2 + this.field_110536_h;
      double var42 = (double)var3 + this.field_110538_i + 0.1875D;
      double var44 = (double)var4 + this.field_110534_k;
      double var46 = (double)var4 + this.field_110528_l;
      var5.func_110322_a(var38, var42, var46, var30, var36);
      var5.func_110322_a(var38, var42, var44, var30, var34);
      var5.func_110322_a(var40, var42, var44, var32, var34);
      var5.func_110322_a(var40, var42, var46, var32, var36);
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4));
      var5.func_110334_a(var10, var10, var10);
      var27 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 1);
      var28 = (var27 & 15) << 4;
      var29 = var27 & 240;
      var30 = (double)((float)var28 / 256.0F);
      var32 = ((double)(var28 + 16) - 0.01D) / 256.0D;
      var34 = (double)((float)var29 / 256.0F);
      var36 = ((double)(var29 + 16) - 0.01D) / 256.0D;
      var38 = var30;
      var40 = var32;
      var42 = var34;
      var44 = var34;
      var46 = var30;
      double var48 = var32;
      double var50 = var36;
      double var52 = var36;
      if(var7 == 0) {
         var40 = var30;
         var42 = var36;
         var46 = var32;
         var52 = var34;
      } else if(var7 == 2) {
         var38 = var32;
         var44 = var36;
         var48 = var30;
         var50 = var34;
      } else if(var7 == 3) {
         var38 = var32;
         var44 = var36;
         var48 = var30;
         var50 = var34;
         var40 = var30;
         var42 = var36;
         var46 = var32;
         var52 = var34;
      }

      double var54 = (double)var2 + this.field_110515_g;
      double var56 = (double)var2 + this.field_110536_h;
      double var58 = (double)var3 + this.field_110532_j;
      double var60 = (double)var4 + this.field_110534_k;
      double var62 = (double)var4 + this.field_110528_l;
      var5.func_110322_a(var56, var58, var62, var46, var50);
      var5.func_110322_a(var56, var58, var60, var38, var42);
      var5.func_110322_a(var54, var58, var60, var40, var44);
      var5.func_110322_a(var54, var58, var62, var48, var52);
      int var64 = C_100015_i.field_105279_d[var7];
      if(var8) {
         var64 = C_100015_i.field_105279_d[C_100015_i.field_105277_f[var7]];
      }

      byte var65 = 4;
      switch(var7) {
      case 0:
         var65 = 5;
         break;
      case 1:
         var65 = 3;
      case 2:
      default:
         break;
      case 3:
         var65 = 2;
      }

      if(var64 != 2 && (this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 - 1, 2))) {
         var5.func_110328_c(this.field_110534_k > 0.0D?var25:var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1));
         var5.func_110334_a(var11, var11, var11);
         this.field_110519_e = var65 == 2;
         this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 2));
      }

      if(var64 != 3 && (this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 + 1, 3))) {
         var5.func_110328_c(this.field_110528_l < 1.0D?var25:var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1));
         var5.func_110334_a(var11, var11, var11);
         this.field_110519_e = var65 == 3;
         this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 3));
      }

      if(var64 != 4 && (this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 - 1, var3, var4, 4))) {
         var5.func_110328_c(this.field_110534_k > 0.0D?var25:var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4));
         var5.func_110334_a(var12, var12, var12);
         this.field_110519_e = var65 == 4;
         this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 4));
      }

      if(var64 != 5 && (this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 + 1, var3, var4, 5))) {
         var5.func_110328_c(this.field_110528_l < 1.0D?var25:var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4));
         var5.func_110334_a(var12, var12, var12);
         this.field_110519_e = var65 == 5;
         this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 5));
      }

      this.field_110519_e = false;
      return true;
   }

   private boolean func_110453_a(C_100251_ahs var1, int var2, int var3, int var4) {
      this.func_110442_a(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.875D, 0.5625D);
      this.func_110426_q(var1, var2, var3, var4);
      this.field_110517_d = 156;
      this.func_110442_a(0.5625D, 0.0D, 0.3125D, 0.9375D, 0.125D, 0.6875D);
      this.func_110426_q(var1, var2, var3, var4);
      this.func_110442_a(0.125D, 0.0D, 0.0625D, 0.5D, 0.125D, 0.4375D);
      this.func_110426_q(var1, var2, var3, var4);
      this.func_110442_a(0.125D, 0.0D, 0.5625D, 0.5D, 0.125D, 0.9375D);
      this.func_110426_q(var1, var2, var3, var4);
      this.func_110434_a();
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.func_110334_a(var6 * var8, var6 * var9, var6 * var10);
      int var34 = var1.func_106029_a(0, 0);
      if(this.field_110517_d >= 0) {
         var34 = this.field_110517_d;
      }

      int var35 = (var34 & 15) << 4;
      int var36 = var34 & 240;
      double var14 = (double)((float)var36 / 256.0F);
      double var16 = (double)(((float)var36 + 15.99F) / 256.0F);
      int var18 = this.field_110522_a.func_109357_g(var2, var3, var4);

      for(int var19 = 0; var19 < 3; ++var19) {
         double var20 = (double)var19 * 3.141592653589793D * 2.0D / 3.0D + 1.5707963267948966D;
         double var22 = (double)(((float)var35 + 8.0F) / 256.0F);
         double var24 = (double)(((float)var35 + 15.99F) / 256.0F);
         if((var18 & 1 << var19) != 0) {
            var22 = (double)(((float)var35 + 7.99F) / 256.0F);
            var24 = (double)(((float)var35 + 0.0F) / 256.0F);
         }

         double var26 = (double)var2 + 0.5D;
         double var28 = (double)var2 + 0.5D + Math.sin(var20) * 8.0D / 16.0D;
         double var30 = (double)var4 + 0.5D;
         double var32 = (double)var4 + 0.5D + Math.cos(var20) * 8.0D / 16.0D;
         var5.func_110322_a(var26, (double)(var3 + 1), var30, var22, var14);
         var5.func_110322_a(var26, (double)(var3 + 0), var30, var22, var16);
         var5.func_110322_a(var28, (double)(var3 + 0), var32, var24, var16);
         var5.func_110322_a(var28, (double)(var3 + 1), var32, var24, var14);
         var5.func_110322_a(var28, (double)(var3 + 1), var32, var24, var14);
         var5.func_110322_a(var28, (double)(var3 + 0), var32, var24, var16);
         var5.func_110322_a(var26, (double)(var3 + 0), var30, var22, var16);
         var5.func_110322_a(var26, (double)(var3 + 1), var30, var22, var14);
      }

      var1.func_106059_f();
      return true;
   }

   private boolean func_110409_a(C_100220_ahy var1, int var2, int var3, int var4) {
      this.func_110426_q(var1, var2, var3, var4);
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      float var12;
      if(C_100983_ayt.field_111279_a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.func_110334_a(var6 * var8, var6 * var9, var6 * var10);
      short var16 = 154;
      var12 = 0.125F;
      this.func_110454_f(var1, (double)((float)var2 - 1.0F + var12), (double)var3, (double)var4, var16);
      this.func_110462_e(var1, (double)((float)var2 + 1.0F - var12), (double)var3, (double)var4, var16);
      this.func_110404_d(var1, (double)var2, (double)var3, (double)((float)var4 - 1.0F + var12), var16);
      this.func_110464_c(var1, (double)var2, (double)var3, (double)((float)var4 + 1.0F - var12), var16);
      short var17 = 139;
      this.func_110425_b(var1, (double)var2, (double)((float)var3 - 1.0F + 0.25F), (double)var4, var17);
      this.func_110437_a(var1, (double)var2, (double)((float)var3 + 1.0F - 0.75F), (double)var4, var17);
      int var14 = this.field_110522_a.func_109357_g(var2, var3, var4);
      if(var14 > 0) {
         short var15 = 205;
         if(var14 > 3) {
            var14 = 3;
         }

         this.func_110425_b(var1, (double)var2, (double)((float)var3 - 1.0F + (6.0F + (float)var14 * 3.0F) / 16.0F), (double)var4, var15);
      }

      return true;
   }

   private boolean func_110418_a(C_100210_aiv var1, int var2, int var3, int var4) {
      this.func_110426_q(var1, var2, var3, var4);
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      int var8 = var1.func_106024_a(0);
      float var9 = (float)(var7 >> 16 & 255) / 255.0F;
      float var10 = (float)(var7 >> 8 & 255) / 255.0F;
      float var11 = (float)(var7 & 255) / 255.0F;
      float var12;
      float var14;
      if(C_100983_ayt.field_111279_a) {
         var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var5.func_110334_a(var6 * var9, var6 * var10, var6 * var11);
      var12 = 0.1865F;
      this.func_110454_f(var1, (double)((float)var2 - 0.5F + var12), (double)var3, (double)var4, var8);
      this.func_110462_e(var1, (double)((float)var2 + 0.5F - var12), (double)var3, (double)var4, var8);
      this.func_110404_d(var1, (double)var2, (double)var3, (double)((float)var4 - 0.5F + var12), var8);
      this.func_110464_c(var1, (double)var2, (double)var3, (double)((float)var4 + 0.5F - var12), var8);
      this.func_110425_b(var1, (double)var2, (double)((float)var3 - 0.5F + var12 + 0.1875F), (double)var4, C_100451_alf.field_106120_y.field_106165_cl);
      int var19 = this.field_110522_a.func_109357_g(var2, var3, var4);
      if(var19 != 0) {
         var14 = 0.0F;
         float var15 = 4.0F;
         float var16 = 0.0F;
         C_100253_aht var17 = null;
         switch(var19) {
         case 1:
            var17 = C_100451_alf.field_106250_ah;
            break;
         case 2:
            var17 = C_100451_alf.field_106248_ag;
         case 3:
         case 4:
         case 5:
         case 6:
         default:
            break;
         case 7:
            var17 = C_100451_alf.field_106230_aj;
            break;
         case 8:
            var17 = C_100451_alf.field_106228_ai;
         }

         var5.func_110320_c(var14 / 16.0F, var15 / 16.0F, var16 / 16.0F);
         if(var17 != null) {
            this.func_110436_b(var17, var2, var3, var4);
         } else if(var19 == 9) {
            float var18 = 0.125F;
            this.func_110442_a((double)(0.5F - var18), 0.0D, (double)(0.5F - var18), (double)(0.5F + var18), 0.25D, (double)(0.5F + var18));
            this.func_110426_q(C_100451_alf.field_106175_aY, var2, var3, var4);
            this.func_110442_a((double)(0.5F - var18), 0.25D, (double)(0.5F - var18), (double)(0.5F + var18), 0.5D, (double)(0.5F + var18));
            this.func_110426_q(C_100451_alf.field_106175_aY, var2, var3, var4);
            this.func_110442_a((double)(0.5F - var18), 0.5D, (double)(0.5F - var18), (double)(0.5F + var18), 0.75D, (double)(0.5F + var18));
            this.func_110426_q(C_100451_alf.field_106175_aY, var2, var3, var4);
            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if(var19 == 3) {
            this.func_110450_a(C_100451_alf.field_106076_B, 0, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if(var19 == 5) {
            this.func_110450_a(C_100451_alf.field_106076_B, 2, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if(var19 == 4) {
            this.func_110450_a(C_100451_alf.field_106076_B, 1, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if(var19 == 6) {
            this.func_110450_a(C_100451_alf.field_106076_B, 3, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if(var19 == 11) {
            var7 = C_100451_alf.field_106244_aa.func_106069_b(this.field_110522_a, var2, var3, var4);
            var9 = (float)(var7 >> 16 & 255) / 255.0F;
            var10 = (float)(var7 >> 8 & 255) / 255.0F;
            var11 = (float)(var7 & 255) / 255.0F;
            var5.func_110334_a(var6 * var9, var6 * var10, var6 * var11);
            this.func_110450_a(C_100451_alf.field_106244_aa, 2, (double)var2, (double)var3, (double)var4, 0.75F);
         } else if(var19 == 10) {
            this.func_110450_a(C_100451_alf.field_106246_ab, 2, (double)var2, (double)var3, (double)var4, 0.75F);
         }

         var5.func_110320_c(-var14 / 16.0F, -var15 / 16.0F, -var16 / 16.0F);
      }

      return true;
   }

   private boolean func_110441_a(C_100259_aho var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.func_110334_a(var6 * var8, var6 * var9, var6 * var10);
      return this.func_110466_a(var1, var2, var3, var4, this.field_110522_a.func_109357_g(var2, var3, var4), false);
   }

   private boolean func_110466_a(C_100259_aho var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = var6?0:var5 & 3;
      boolean var8 = false;
      float var9 = 0.0F;
      switch(var7) {
      case 0:
         this.field_110554_p = 2;
         this.field_110552_q = 1;
         this.field_110550_r = 3;
         this.field_110548_s = 3;
         break;
      case 1:
         this.field_110524_n = 1;
         this.field_110526_o = 2;
         this.field_110550_r = 2;
         this.field_110548_s = 1;
         var8 = true;
         break;
      case 2:
         this.field_110554_p = 1;
         this.field_110552_q = 2;
         break;
      case 3:
         this.field_110524_n = 2;
         this.field_110526_o = 1;
         this.field_110550_r = 1;
         this.field_110548_s = 2;
         var8 = true;
      }

      var9 = this.func_110402_a(var1, var2, var3, var4, 0, var9, 0.75F, 0.25F, 0.75F, var8, var6, var5);
      var9 = this.func_110402_a(var1, var2, var3, var4, 1, var9, 0.5F, 0.0625F, 0.625F, var8, var6, var5);
      var9 = this.func_110402_a(var1, var2, var3, var4, 2, var9, 0.25F, 0.3125F, 0.5F, var8, var6, var5);
      this.func_110402_a(var1, var2, var3, var4, 3, var9, 0.625F, 0.375F, 1.0F, var8, var6, var5);
      this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      this.field_110524_n = 0;
      this.field_110526_o = 0;
      this.field_110554_p = 0;
      this.field_110552_q = 0;
      this.field_110550_r = 0;
      this.field_110548_s = 0;
      return true;
   }

   private float func_110402_a(C_100259_aho var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, boolean var10, boolean var11, int var12) {
      if(var10) {
         float var13 = var7;
         var7 = var9;
         var9 = var13;
      }

      var7 /= 2.0F;
      var9 /= 2.0F;
      var1.field_106299_b = var5;
      this.func_110442_a((double)(0.5F - var7), (double)var6, (double)(0.5F - var9), (double)(0.5F + var7), (double)(var6 + var8), (double)(0.5F + var9));
      if(var11) {
         C_100872_azb var14 = C_100872_azb.field_110346_a;
         var14.func_110330_b();
         var14.func_110323_b(0.0F, 1.0F, 0.0F);
         this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(1, var12));
         var14.func_110329_a();
         var14.func_110330_b();
         var14.func_110323_b(0.0F, 0.0F, -1.0F);
         this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(2, var12));
         var14.func_110329_a();
         var14.func_110330_b();
         var14.func_110323_b(0.0F, 0.0F, 1.0F);
         this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(3, var12));
         var14.func_110329_a();
         var14.func_110330_b();
         var14.func_110323_b(-1.0F, 0.0F, 0.0F);
         this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(4, var12));
         var14.func_110329_a();
         var14.func_110330_b();
         var14.func_110323_b(1.0F, 0.0F, 0.0F);
         this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(5, var12));
         var14.func_110329_a();
      } else {
         this.func_110426_q(var1, var2, var3, var4);
      }

      return var6 + var8;
   }

   public boolean func_110429_c(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = this.field_110522_a.func_109357_g(var2, var3, var4);
      C_100872_azb var6 = C_100872_azb.field_110346_a;
      var6.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      var6.func_110334_a(1.0F, 1.0F, 1.0F);
      double var7 = 0.4000000059604645D;
      double var9 = 0.5D - var7;
      double var11 = 0.20000000298023224D;
      if(var5 == 1) {
         this.func_110415_a(var1, (double)var2 - var9, (double)var3 + var11, (double)var4, -var7, 0.0D);
      } else if(var5 == 2) {
         this.func_110415_a(var1, (double)var2 + var9, (double)var3 + var11, (double)var4, var7, 0.0D);
      } else if(var5 == 3) {
         this.func_110415_a(var1, (double)var2, (double)var3 + var11, (double)var4 - var9, 0.0D, -var7);
      } else if(var5 == 4) {
         this.func_110415_a(var1, (double)var2, (double)var3 + var11, (double)var4 + var9, 0.0D, var7);
      } else {
         this.func_110415_a(var1, (double)var2, (double)var3, (double)var4, 0.0D, 0.0D);
      }

      return true;
   }

   private boolean func_110447_w(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var6 = var5 & 3;
      int var7 = (var5 & 12) >> 2;
      this.func_110426_q(var1, var2, var3, var4);
      C_100872_azb var8 = C_100872_azb.field_110346_a;
      var8.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      var8.func_110334_a(1.0F, 1.0F, 1.0F);
      double var9 = -0.1875D;
      boolean var11 = ((C_100184_aii)var1).func_106304_e(this.field_110522_a, var2, var3, var4, var5);
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      double var18 = 0.0D;
      switch(var6) {
      case 0:
         var18 = -0.3125D;
         var14 = C_100184_aii.field_106310_a[var7];
         break;
      case 1:
         var16 = 0.3125D;
         var12 = -C_100184_aii.field_106310_a[var7];
         break;
      case 2:
         var18 = 0.3125D;
         var14 = -C_100184_aii.field_106310_a[var7];
         break;
      case 3:
         var16 = -0.3125D;
         var12 = C_100184_aii.field_106310_a[var7];
      }

      if(!var11) {
         this.func_110415_a(var1, (double)var2 + var12, (double)var3 + var9, (double)var4 + var14, 0.0D, 0.0D);
      } else {
         this.func_110403_a(17);
         byte var20 = 16;
         byte var21 = 16;
         float var22 = 2.0F;
         float var23 = 14.0F;
         float var24 = 7.0F;
         float var25 = 9.0F;
         switch(var6) {
         case 1:
         case 3:
            var22 = 7.0F;
            var23 = 9.0F;
            var24 = 2.0F;
            var25 = 14.0F;
         case 0:
         case 2:
         default:
            this.func_110442_a((double)(var22 / 16.0F + (float)var12), 0.125D, (double)(var24 / 16.0F + (float)var14), (double)(var23 / 16.0F + (float)var12), 0.25D, (double)(var25 / 16.0F + (float)var14));
            var8.func_110322_a((double)((float)var2 + var22 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var24 / 16.0F) + var14, (double)(((float)var20 + var22) / 256.0F), (double)(((float)var21 + var24) / 256.0F));
            var8.func_110322_a((double)((float)var2 + var22 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var25 / 16.0F) + var14, (double)(((float)var20 + var22) / 256.0F), (double)(((float)var21 + var25) / 256.0F));
            var8.func_110322_a((double)((float)var2 + var23 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var25 / 16.0F) + var14, (double)(((float)var20 + var23) / 256.0F), (double)(((float)var21 + var25) / 256.0F));
            var8.func_110322_a((double)((float)var2 + var23 / 16.0F) + var12, (double)((float)var3 + 0.25F), (double)((float)var4 + var24 / 16.0F) + var14, (double)(((float)var20 + var23) / 256.0F), (double)(((float)var21 + var24) / 256.0F));
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
            this.func_110434_a();
         }
      }

      var8.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      var8.func_110334_a(1.0F, 1.0F, 1.0F);
      this.func_110415_a(var1, (double)var2 + var16, (double)var3 + var9, (double)var4 + var18, 0.0D, 0.0D);
      int var51 = var1.func_106024_a(1);
      int var53 = (var51 & 15) << 4;
      int var52 = var51 & 240;
      double var55 = (double)((float)var53 / 256.0F);
      double var54 = (double)(((float)var53 + 15.99F) / 256.0F);
      double var27 = (double)((float)var52 / 256.0F);
      double var29 = (double)(((float)var52 + 15.99F) / 256.0F);
      double var31 = 0.125D;
      double var33 = (double)(var2 + 1);
      double var35 = (double)(var2 + 1);
      double var37 = (double)(var2 + 0);
      double var39 = (double)(var2 + 0);
      double var41 = (double)(var4 + 0);
      double var43 = (double)(var4 + 1);
      double var45 = (double)(var4 + 1);
      double var47 = (double)(var4 + 0);
      double var49 = (double)var3 + var31;
      if(var6 == 2) {
         var33 = var35 = (double)(var2 + 0);
         var37 = var39 = (double)(var2 + 1);
         var41 = var47 = (double)(var4 + 1);
         var43 = var45 = (double)(var4 + 0);
      } else if(var6 == 3) {
         var33 = var39 = (double)(var2 + 0);
         var35 = var37 = (double)(var2 + 1);
         var41 = var43 = (double)(var4 + 0);
         var45 = var47 = (double)(var4 + 1);
      } else if(var6 == 1) {
         var33 = var39 = (double)(var2 + 1);
         var35 = var37 = (double)(var2 + 0);
         var41 = var43 = (double)(var4 + 1);
         var45 = var47 = (double)(var4 + 0);
      }

      var8.func_110322_a(var39, var49, var47, var55, var27);
      var8.func_110322_a(var37, var49, var45, var55, var29);
      var8.func_110322_a(var35, var49, var43, var54, var29);
      var8.func_110322_a(var33, var49, var41, var54, var27);
      return true;
   }

   public void func_110433_d(C_100451_alf var1, int var2, int var3, int var4) {
      this.field_110514_f = true;
      this.func_110451_b(var1, var2, var3, var4, true);
      this.field_110514_f = false;
   }

   private boolean func_110451_b(C_100451_alf var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      boolean var7 = var5 || (var6 & 8) != 0;
      int var8 = C_100404_amn.func_106401_e(var6);
      if(var7) {
         switch(var8) {
         case 0:
            this.field_110524_n = 3;
            this.field_110526_o = 3;
            this.field_110554_p = 3;
            this.field_110552_q = 3;
            this.func_110442_a(0.0D, 0.25D, 0.0D, 1.0D, 1.0D, 1.0D);
            break;
         case 1:
            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);
            break;
         case 2:
            this.field_110554_p = 1;
            this.field_110552_q = 2;
            this.func_110442_a(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D);
            break;
         case 3:
            this.field_110554_p = 2;
            this.field_110552_q = 1;
            this.field_110550_r = 3;
            this.field_110548_s = 3;
            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D);
            break;
         case 4:
            this.field_110524_n = 1;
            this.field_110526_o = 2;
            this.field_110550_r = 2;
            this.field_110548_s = 1;
            this.func_110442_a(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
            break;
         case 5:
            this.field_110524_n = 2;
            this.field_110526_o = 1;
            this.field_110550_r = 1;
            this.field_110548_s = 2;
            this.func_110442_a(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D);
         }

         this.func_110426_q(var1, var2, var3, var4);
         this.field_110524_n = 0;
         this.field_110526_o = 0;
         this.field_110554_p = 0;
         this.field_110552_q = 0;
         this.field_110550_r = 0;
         this.field_110548_s = 0;
         this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      } else {
         switch(var8) {
         case 0:
            this.field_110524_n = 3;
            this.field_110526_o = 3;
            this.field_110554_p = 3;
            this.field_110552_q = 3;
         case 1:
         default:
            break;
         case 2:
            this.field_110554_p = 1;
            this.field_110552_q = 2;
            break;
         case 3:
            this.field_110554_p = 2;
            this.field_110552_q = 1;
            this.field_110550_r = 3;
            this.field_110548_s = 3;
            break;
         case 4:
            this.field_110524_n = 1;
            this.field_110526_o = 2;
            this.field_110550_r = 2;
            this.field_110548_s = 1;
            break;
         case 5:
            this.field_110524_n = 2;
            this.field_110526_o = 1;
            this.field_110550_r = 1;
            this.field_110548_s = 2;
         }

         this.func_110426_q(var1, var2, var3, var4);
         this.field_110524_n = 0;
         this.field_110526_o = 0;
         this.field_110554_p = 0;
         this.field_110552_q = 0;
         this.field_110550_r = 0;
         this.field_110548_s = 0;
      }

      return true;
   }

   private void func_110428_a(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if(this.field_110517_d >= 0) {
         var16 = this.field_110517_d;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      C_100872_azb var19 = C_100872_azb.field_110346_a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01D) / 256.0D;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01D) / 256.0D;
      var19.func_110334_a(var13, var13, var13);
      var19.func_110322_a(var1, var7, var9, var24, var22);
      var19.func_110322_a(var1, var5, var9, var20, var22);
      var19.func_110322_a(var3, var5, var11, var20, var26);
      var19.func_110322_a(var3, var7, var11, var24, var26);
   }

   private void func_110445_b(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if(this.field_110517_d >= 0) {
         var16 = this.field_110517_d;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      C_100872_azb var19 = C_100872_azb.field_110346_a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01D) / 256.0D;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01D) / 256.0D;
      var19.func_110334_a(var13, var13, var13);
      var19.func_110322_a(var1, var5, var11, var24, var22);
      var19.func_110322_a(var1, var5, var9, var20, var22);
      var19.func_110322_a(var3, var7, var9, var20, var26);
      var19.func_110322_a(var3, var7, var11, var24, var26);
   }

   private void func_110412_c(double var1, double var3, double var5, double var7, double var9, double var11, float var13, double var14) {
      int var16 = 108;
      if(this.field_110517_d >= 0) {
         var16 = this.field_110517_d;
      }

      int var17 = (var16 & 15) << 4;
      int var18 = var16 & 240;
      C_100872_azb var19 = C_100872_azb.field_110346_a;
      double var20 = (double)((float)(var17 + 0) / 256.0F);
      double var22 = (double)((float)(var18 + 0) / 256.0F);
      double var24 = ((double)var17 + var14 - 0.01D) / 256.0D;
      double var26 = ((double)((float)var18 + 4.0F) - 0.01D) / 256.0D;
      var19.func_110334_a(var13, var13, var13);
      var19.func_110322_a(var3, var5, var9, var24, var22);
      var19.func_110322_a(var1, var5, var9, var20, var22);
      var19.func_110322_a(var1, var7, var11, var20, var26);
      var19.func_110322_a(var3, var7, var11, var24, var26);
   }

   public void func_110406_a(C_100451_alf var1, int var2, int var3, int var4, boolean var5) {
      this.field_110514_f = true;
      this.func_110448_c(var1, var2, var3, var4, var5);
      this.field_110514_f = false;
   }

   private boolean func_110448_c(C_100451_alf var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var7 = C_100402_amo.func_106389_f(var6);
      float var11 = var1.func_106052_f(this.field_110522_a, var2, var3, var4);
      float var12 = var5?1.0F:0.5F;
      double var13 = var5?16.0D:8.0D;
      switch(var7) {
      case 0:
         this.field_110524_n = 3;
         this.field_110526_o = 3;
         this.field_110554_p = 3;
         this.field_110552_q = 3;
         this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110428_a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.8F, var13);
         this.func_110428_a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.8F, var13);
         this.func_110428_a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
         this.func_110428_a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.25F), (double)((float)var3 + 0.25F + var12), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         break;
      case 1:
         this.func_110442_a(0.0D, 0.75D, 0.0D, 1.0D, 1.0D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110428_a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.8F, var13);
         this.func_110428_a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.8F, var13);
         this.func_110428_a((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
         this.func_110428_a((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 - 0.25F + 1.0F - var12), (double)((float)var3 - 0.25F + 1.0F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         break;
      case 2:
         this.field_110554_p = 1;
         this.field_110552_q = 2;
         this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.25D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110445_b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.6F, var13);
         this.func_110445_b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.6F, var13);
         this.func_110445_b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11 * 0.5F, var13);
         this.func_110445_b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.25F), (double)((float)var4 + 0.25F + var12), var11, var13);
         break;
      case 3:
         this.field_110554_p = 2;
         this.field_110552_q = 1;
         this.field_110550_r = 3;
         this.field_110548_s = 3;
         this.func_110442_a(0.0D, 0.0D, 0.75D, 1.0D, 1.0D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110445_b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.6F, var13);
         this.func_110445_b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.6F, var13);
         this.func_110445_b((double)((float)var2 + 0.375F), (double)((float)var2 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11 * 0.5F, var13);
         this.func_110445_b((double)((float)var2 + 0.625F), (double)((float)var2 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 - 0.25F + 1.0F - var12), (double)((float)var4 - 0.25F + 1.0F), var11, var13);
         break;
      case 4:
         this.field_110524_n = 1;
         this.field_110526_o = 2;
         this.field_110550_r = 2;
         this.field_110548_s = 1;
         this.func_110442_a(0.0D, 0.0D, 0.0D, 0.25D, 1.0D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110412_c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.5F, var13);
         this.func_110412_c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11, var13);
         this.func_110412_c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         this.func_110412_c((double)((float)var2 + 0.25F), (double)((float)var2 + 0.25F + var12), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
         break;
      case 5:
         this.field_110524_n = 2;
         this.field_110526_o = 1;
         this.field_110550_r = 1;
         this.field_110548_s = 2;
         this.func_110442_a(0.75D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110412_c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.375F), var11 * 0.5F, var13);
         this.func_110412_c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.625F), var11, var13);
         this.func_110412_c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.375F), (double)((float)var3 + 0.625F), (double)((float)var4 + 0.375F), (double)((float)var4 + 0.375F), var11 * 0.6F, var13);
         this.func_110412_c((double)((float)var2 - 0.25F + 1.0F - var12), (double)((float)var2 - 0.25F + 1.0F), (double)((float)var3 + 0.625F), (double)((float)var3 + 0.375F), (double)((float)var4 + 0.625F), (double)((float)var4 + 0.625F), var11 * 0.6F, var13);
      }

      this.field_110524_n = 0;
      this.field_110526_o = 0;
      this.field_110554_p = 0;
      this.field_110552_q = 0;
      this.field_110550_r = 0;
      this.field_110548_s = 0;
      this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      return true;
   }

   public boolean func_110419_e(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      C_100872_azb var8 = C_100872_azb.field_110346_a;
      boolean var9 = this.field_110517_d >= 0;
      if(!var9) {
         this.field_110517_d = C_100451_alf.field_106119_z.field_106165_cl;
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if(var6 == 5) {
         this.func_110442_a((double)(0.5F - var11), 0.0D, (double)(0.5F - var10), (double)(0.5F + var11), (double)var12, (double)(0.5F + var10));
      } else if(var6 == 6) {
         this.func_110442_a((double)(0.5F - var10), 0.0D, (double)(0.5F - var11), (double)(0.5F + var10), (double)var12, (double)(0.5F + var11));
      } else if(var6 == 4) {
         this.func_110442_a((double)(0.5F - var11), (double)(0.5F - var10), (double)(1.0F - var12), (double)(0.5F + var11), (double)(0.5F + var10), 1.0D);
      } else if(var6 == 3) {
         this.func_110442_a((double)(0.5F - var11), (double)(0.5F - var10), 0.0D, (double)(0.5F + var11), (double)(0.5F + var10), (double)var12);
      } else if(var6 == 2) {
         this.func_110442_a((double)(1.0F - var12), (double)(0.5F - var10), (double)(0.5F - var11), 1.0D, (double)(0.5F + var10), (double)(0.5F + var11));
      } else if(var6 == 1) {
         this.func_110442_a(0.0D, (double)(0.5F - var10), (double)(0.5F - var11), (double)var12, (double)(0.5F + var10), (double)(0.5F + var11));
      } else if(var6 == 0) {
         this.func_110442_a((double)(0.5F - var10), (double)(1.0F - var12), (double)(0.5F - var11), (double)(0.5F + var10), 1.0D, (double)(0.5F + var11));
      } else if(var6 == 7) {
         this.func_110442_a((double)(0.5F - var11), (double)(1.0F - var12), (double)(0.5F - var10), (double)(0.5F + var11), 1.0D, (double)(0.5F + var10));
      }

      this.func_110426_q(var1, var2, var3, var4);
      if(!var9) {
         this.field_110517_d = -1;
      }

      var8.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var13 = 1.0F;
      if(C_100451_alf.field_106114_t[var1.field_106162_cm] > 0) {
         var13 = 1.0F;
      }

      var8.func_110334_a(var13, var13, var13);
      int var14 = var1.func_106024_a(0);
      if(this.field_110517_d >= 0) {
         var14 = this.field_110517_d;
      }

      int var15 = (var14 & 15) << 4;
      int var16 = var14 & 240;
      float var17 = (float)var15 / 256.0F;
      float var18 = ((float)var15 + 15.99F) / 256.0F;
      float var19 = (float)var16 / 256.0F;
      float var20 = ((float)var16 + 15.99F) / 256.0F;
      C_100387_amw[] var21 = new C_100387_amw[8];
      float var22 = 0.0625F;
      float var23 = 0.0625F;
      float var24 = 0.625F;
      var21[0] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var22), 0.0D, (double)(-var23));
      var21[1] = this.field_110522_a.func_109363_R().func_107878_a((double)var22, 0.0D, (double)(-var23));
      var21[2] = this.field_110522_a.func_109363_R().func_107878_a((double)var22, 0.0D, (double)var23);
      var21[3] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var22), 0.0D, (double)var23);
      var21[4] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var22), (double)var24, (double)(-var23));
      var21[5] = this.field_110522_a.func_109363_R().func_107878_a((double)var22, (double)var24, (double)(-var23));
      var21[6] = this.field_110522_a.func_109363_R().func_107878_a((double)var22, (double)var24, (double)var23);
      var21[7] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var22), (double)var24, (double)var23);

      for(int var25 = 0; var25 < 8; ++var25) {
         if(var7) {
            var21[var25].field_107870_e -= 0.0625D;
            var21[var25].func_107859_a(0.69813174F);
         } else {
            var21[var25].field_107870_e += 0.0625D;
            var21[var25].func_107859_a(-0.69813174F);
         }

         if(var6 == 0 || var6 == 7) {
            var21[var25].func_107867_c(3.1415927F);
         }

         if(var6 == 6 || var6 == 0) {
            var21[var25].func_107863_b(1.5707964F);
         }

         if(var6 > 0 && var6 < 5) {
            var21[var25].field_107869_d -= 0.375D;
            var21[var25].func_107859_a(1.5707964F);
            if(var6 == 4) {
               var21[var25].func_107863_b(0.0F);
            }

            if(var6 == 3) {
               var21[var25].func_107863_b(3.1415927F);
            }

            if(var6 == 2) {
               var21[var25].func_107863_b(1.5707964F);
            }

            if(var6 == 1) {
               var21[var25].func_107863_b(-1.5707964F);
            }

            var21[var25].field_107872_c += (double)var2 + 0.5D;
            var21[var25].field_107869_d += (double)((float)var3 + 0.5F);
            var21[var25].field_107870_e += (double)var4 + 0.5D;
         } else if(var6 != 0 && var6 != 7) {
            var21[var25].field_107872_c += (double)var2 + 0.5D;
            var21[var25].field_107869_d += (double)((float)var3 + 0.125F);
            var21[var25].field_107870_e += (double)var4 + 0.5D;
         } else {
            var21[var25].field_107872_c += (double)var2 + 0.5D;
            var21[var25].field_107869_d += (double)((float)var3 + 0.875F);
            var21[var25].field_107870_e += (double)var4 + 0.5D;
         }
      }

      C_100387_amw var30 = null;
      C_100387_amw var26 = null;
      C_100387_amw var27 = null;
      C_100387_amw var28 = null;

      for(int var29 = 0; var29 < 6; ++var29) {
         if(var29 == 0) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 8) - 0.01F) / 256.0F;
         } else if(var29 == 2) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 16) - 0.01F) / 256.0F;
         }

         if(var29 == 0) {
            var30 = var21[0];
            var26 = var21[1];
            var27 = var21[2];
            var28 = var21[3];
         } else if(var29 == 1) {
            var30 = var21[7];
            var26 = var21[6];
            var27 = var21[5];
            var28 = var21[4];
         } else if(var29 == 2) {
            var30 = var21[1];
            var26 = var21[0];
            var27 = var21[4];
            var28 = var21[5];
         } else if(var29 == 3) {
            var30 = var21[2];
            var26 = var21[1];
            var27 = var21[5];
            var28 = var21[6];
         } else if(var29 == 4) {
            var30 = var21[3];
            var26 = var21[2];
            var27 = var21[6];
            var28 = var21[7];
         } else if(var29 == 5) {
            var30 = var21[0];
            var26 = var21[3];
            var27 = var21[7];
            var28 = var21[4];
         }

         var8.func_110322_a(var30.field_107872_c, var30.field_107869_d, var30.field_107870_e, (double)var17, (double)var20);
         var8.func_110322_a(var26.field_107872_c, var26.field_107869_d, var26.field_107870_e, (double)var18, (double)var20);
         var8.func_110322_a(var27.field_107872_c, var27.field_107869_d, var27.field_107870_e, (double)var18, (double)var19);
         var8.func_110322_a(var28.field_107872_c, var28.field_107869_d, var28.field_107870_e, (double)var17, (double)var19);
      }

      return true;
   }

   public boolean func_110423_f(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var7 = var6 & 3;
      boolean var8 = (var6 & 4) == 4;
      boolean var9 = (var6 & 8) == 8;
      boolean var10 = !this.field_110522_a.func_109348_t(var2, var3 - 1, var4);
      boolean var11 = this.field_110517_d >= 0;
      if(!var11) {
         this.field_110517_d = C_100451_alf.field_106075_A.field_106165_cl;
      }

      float var12 = 0.25F;
      float var13 = 0.125F;
      float var14 = 0.125F;
      float var15 = 0.3F - var12;
      float var16 = 0.3F + var12;
      if(var7 == 2) {
         this.func_110442_a((double)(0.5F - var13), (double)var15, (double)(1.0F - var14), (double)(0.5F + var13), (double)var16, 1.0D);
      } else if(var7 == 0) {
         this.func_110442_a((double)(0.5F - var13), (double)var15, 0.0D, (double)(0.5F + var13), (double)var16, (double)var14);
      } else if(var7 == 1) {
         this.func_110442_a((double)(1.0F - var14), (double)var15, (double)(0.5F - var13), 1.0D, (double)var16, (double)(0.5F + var13));
      } else if(var7 == 3) {
         this.func_110442_a(0.0D, (double)var15, (double)(0.5F - var13), (double)var14, (double)var16, (double)(0.5F + var13));
      }

      this.func_110426_q(var1, var2, var3, var4);
      if(!var11) {
         this.field_110517_d = -1;
      }

      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var17 = 1.0F;
      if(C_100451_alf.field_106114_t[var1.field_106162_cm] > 0) {
         var17 = 1.0F;
      }

      var5.func_110334_a(var17, var17, var17);
      int var18 = var1.func_106024_a(0);
      if(this.field_110517_d >= 0) {
         var18 = this.field_110517_d;
      }

      int var19 = (var18 & 15) << 4;
      int var20 = var18 & 240;
      float var21 = (float)var19 / 256.0F;
      float var22 = ((float)var19 + 15.99F) / 256.0F;
      float var23 = (float)var20 / 256.0F;
      float var24 = ((float)var20 + 15.99F) / 256.0F;
      C_100387_amw[] var25 = new C_100387_amw[8];
      float var26 = 0.046875F;
      float var27 = 0.046875F;
      float var28 = 0.3125F;
      var25[0] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var26), 0.0D, (double)(-var27));
      var25[1] = this.field_110522_a.func_109363_R().func_107878_a((double)var26, 0.0D, (double)(-var27));
      var25[2] = this.field_110522_a.func_109363_R().func_107878_a((double)var26, 0.0D, (double)var27);
      var25[3] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var26), 0.0D, (double)var27);
      var25[4] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var26), (double)var28, (double)(-var27));
      var25[5] = this.field_110522_a.func_109363_R().func_107878_a((double)var26, (double)var28, (double)(-var27));
      var25[6] = this.field_110522_a.func_109363_R().func_107878_a((double)var26, (double)var28, (double)var27);
      var25[7] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var26), (double)var28, (double)var27);

      for(int var29 = 0; var29 < 8; ++var29) {
         var25[var29].field_107870_e += 0.0625D;
         if(var9) {
            var25[var29].func_107859_a(0.5235988F);
            var25[var29].field_107869_d -= 0.4375D;
         } else if(var8) {
            var25[var29].func_107859_a(0.08726647F);
            var25[var29].field_107869_d -= 0.4375D;
         } else {
            var25[var29].func_107859_a(-0.69813174F);
            var25[var29].field_107869_d -= 0.375D;
         }

         var25[var29].func_107859_a(1.5707964F);
         if(var7 == 2) {
            var25[var29].func_107863_b(0.0F);
         }

         if(var7 == 0) {
            var25[var29].func_107863_b(3.1415927F);
         }

         if(var7 == 1) {
            var25[var29].func_107863_b(1.5707964F);
         }

         if(var7 == 3) {
            var25[var29].func_107863_b(-1.5707964F);
         }

         var25[var29].field_107872_c += (double)var2 + 0.5D;
         var25[var29].field_107869_d += (double)((float)var3 + 0.3125F);
         var25[var29].field_107870_e += (double)var4 + 0.5D;
      }

      C_100387_amw var61 = null;
      C_100387_amw var30 = null;
      C_100387_amw var31 = null;
      C_100387_amw var32 = null;
      byte var33 = 7;
      byte var34 = 9;
      byte var35 = 9;
      byte var36 = 16;

      for(int var37 = 0; var37 < 6; ++var37) {
         if(var37 == 0) {
            var61 = var25[0];
            var30 = var25[1];
            var31 = var25[2];
            var32 = var25[3];
            var21 = (float)(var19 + var33) / 256.0F;
            var22 = (float)(var19 + var34) / 256.0F;
            var23 = (float)(var20 + var35) / 256.0F;
            var24 = (float)(var20 + var35 + 2) / 256.0F;
         } else if(var37 == 1) {
            var61 = var25[7];
            var30 = var25[6];
            var31 = var25[5];
            var32 = var25[4];
         } else if(var37 == 2) {
            var61 = var25[1];
            var30 = var25[0];
            var31 = var25[4];
            var32 = var25[5];
            var21 = (float)(var19 + var33) / 256.0F;
            var22 = (float)(var19 + var34) / 256.0F;
            var23 = (float)(var20 + var35) / 256.0F;
            var24 = (float)(var20 + var36) / 256.0F;
         } else if(var37 == 3) {
            var61 = var25[2];
            var30 = var25[1];
            var31 = var25[5];
            var32 = var25[6];
         } else if(var37 == 4) {
            var61 = var25[3];
            var30 = var25[2];
            var31 = var25[6];
            var32 = var25[7];
         } else if(var37 == 5) {
            var61 = var25[0];
            var30 = var25[3];
            var31 = var25[7];
            var32 = var25[4];
         }

         var5.func_110322_a(var61.field_107872_c, var61.field_107869_d, var61.field_107870_e, (double)var21, (double)var24);
         var5.func_110322_a(var30.field_107872_c, var30.field_107869_d, var30.field_107870_e, (double)var22, (double)var24);
         var5.func_110322_a(var31.field_107872_c, var31.field_107869_d, var31.field_107870_e, (double)var22, (double)var23);
         var5.func_110322_a(var32.field_107872_c, var32.field_107869_d, var32.field_107870_e, (double)var21, (double)var23);
      }

      float var62 = 0.09375F;
      float var38 = 0.09375F;
      float var39 = 0.03125F;
      var25[0] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var62), 0.0D, (double)(-var38));
      var25[1] = this.field_110522_a.func_109363_R().func_107878_a((double)var62, 0.0D, (double)(-var38));
      var25[2] = this.field_110522_a.func_109363_R().func_107878_a((double)var62, 0.0D, (double)var38);
      var25[3] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var62), 0.0D, (double)var38);
      var25[4] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var62), (double)var39, (double)(-var38));
      var25[5] = this.field_110522_a.func_109363_R().func_107878_a((double)var62, (double)var39, (double)(-var38));
      var25[6] = this.field_110522_a.func_109363_R().func_107878_a((double)var62, (double)var39, (double)var38);
      var25[7] = this.field_110522_a.func_109363_R().func_107878_a((double)(-var62), (double)var39, (double)var38);

      for(int var40 = 0; var40 < 8; ++var40) {
         var25[var40].field_107870_e += 0.21875D;
         if(var9) {
            var25[var40].field_107869_d -= 0.09375D;
            var25[var40].field_107870_e -= 0.1625D;
            var25[var40].func_107859_a(0.0F);
         } else if(var8) {
            var25[var40].field_107869_d += 0.015625D;
            var25[var40].field_107870_e -= 0.171875D;
            var25[var40].func_107859_a(0.17453294F);
         } else {
            var25[var40].func_107859_a(0.87266463F);
         }

         if(var7 == 2) {
            var25[var40].func_107863_b(0.0F);
         }

         if(var7 == 0) {
            var25[var40].func_107863_b(3.1415927F);
         }

         if(var7 == 1) {
            var25[var40].func_107863_b(1.5707964F);
         }

         if(var7 == 3) {
            var25[var40].func_107863_b(-1.5707964F);
         }

         var25[var40].field_107872_c += (double)var2 + 0.5D;
         var25[var40].field_107869_d += (double)((float)var3 + 0.3125F);
         var25[var40].field_107870_e += (double)var4 + 0.5D;
      }

      byte var63 = 5;
      byte var41 = 11;
      byte var42 = 3;
      byte var43 = 9;

      for(int var44 = 0; var44 < 6; ++var44) {
         if(var44 == 0) {
            var61 = var25[0];
            var30 = var25[1];
            var31 = var25[2];
            var32 = var25[3];
            var21 = (float)(var19 + var63) / 256.0F;
            var22 = (float)(var19 + var41) / 256.0F;
            var23 = (float)(var20 + var42) / 256.0F;
            var24 = (float)(var20 + var43) / 256.0F;
         } else if(var44 == 1) {
            var61 = var25[7];
            var30 = var25[6];
            var31 = var25[5];
            var32 = var25[4];
         } else if(var44 == 2) {
            var61 = var25[1];
            var30 = var25[0];
            var31 = var25[4];
            var32 = var25[5];
            var21 = (float)(var19 + var63) / 256.0F;
            var22 = (float)(var19 + var41) / 256.0F;
            var23 = (float)(var20 + var42) / 256.0F;
            var24 = (float)(var20 + var42 + 2) / 256.0F;
         } else if(var44 == 3) {
            var61 = var25[2];
            var30 = var25[1];
            var31 = var25[5];
            var32 = var25[6];
         } else if(var44 == 4) {
            var61 = var25[3];
            var30 = var25[2];
            var31 = var25[6];
            var32 = var25[7];
         } else if(var44 == 5) {
            var61 = var25[0];
            var30 = var25[3];
            var31 = var25[7];
            var32 = var25[4];
         }

         var5.func_110322_a(var61.field_107872_c, var61.field_107869_d, var61.field_107870_e, (double)var21, (double)var24);
         var5.func_110322_a(var30.field_107872_c, var30.field_107869_d, var30.field_107870_e, (double)var22, (double)var24);
         var5.func_110322_a(var31.field_107872_c, var31.field_107869_d, var31.field_107870_e, (double)var22, (double)var23);
         var5.func_110322_a(var32.field_107872_c, var32.field_107869_d, var32.field_107870_e, (double)var21, (double)var23);
      }

      if(var8) {
         double var64 = var25[0].field_107869_d;
         float var46 = 0.03125F;
         float var47 = 0.5F - var46 / 2.0F;
         float var48 = var47 + var46;
         int var49 = (C_100451_alf.field_106217_bX.field_106165_cl & 15) << 4;
         int var50 = C_100451_alf.field_106217_bX.field_106165_cl & 240;
         double var51 = (double)((float)var49 / 256.0F);
         double var53 = (double)((float)(var49 + 16) / 256.0F);
         double var55 = (double)((float)(var50 + (var8?2:0)) / 256.0F);
         double var57 = (double)((float)(var50 + (var8?4:2)) / 256.0F);
         double var59 = (double)(var10?3.5F:1.5F) / 16.0D;
         var17 = var1.func_106052_f(this.field_110522_a, var2, var3, var4) * 0.75F;
         var5.func_110334_a(var17, var17, var17);
         if(var7 == 2) {
            var5.func_110322_a((double)((float)var2 + var47), (double)var3 + var59, (double)var4 + 0.25D, var51, var55);
            var5.func_110322_a((double)((float)var2 + var48), (double)var3 + var59, (double)var4 + 0.25D, var51, var57);
            var5.func_110322_a((double)((float)var2 + var48), (double)var3 + var59, (double)var4, var53, var57);
            var5.func_110322_a((double)((float)var2 + var47), (double)var3 + var59, (double)var4, var53, var55);
            var5.func_110322_a((double)((float)var2 + var47), var64, (double)var4 + 0.5D, var51, var55);
            var5.func_110322_a((double)((float)var2 + var48), var64, (double)var4 + 0.5D, var51, var57);
            var5.func_110322_a((double)((float)var2 + var48), (double)var3 + var59, (double)var4 + 0.25D, var53, var57);
            var5.func_110322_a((double)((float)var2 + var47), (double)var3 + var59, (double)var4 + 0.25D, var53, var55);
         } else if(var7 == 0) {
            var5.func_110322_a((double)((float)var2 + var47), (double)var3 + var59, (double)var4 + 0.75D, var51, var55);
            var5.func_110322_a((double)((float)var2 + var48), (double)var3 + var59, (double)var4 + 0.75D, var51, var57);
            var5.func_110322_a((double)((float)var2 + var48), var64, (double)var4 + 0.5D, var53, var57);
            var5.func_110322_a((double)((float)var2 + var47), var64, (double)var4 + 0.5D, var53, var55);
            var5.func_110322_a((double)((float)var2 + var47), (double)var3 + var59, (double)(var4 + 1), var51, var55);
            var5.func_110322_a((double)((float)var2 + var48), (double)var3 + var59, (double)(var4 + 1), var51, var57);
            var5.func_110322_a((double)((float)var2 + var48), (double)var3 + var59, (double)var4 + 0.75D, var53, var57);
            var5.func_110322_a((double)((float)var2 + var47), (double)var3 + var59, (double)var4 + 0.75D, var53, var55);
         } else if(var7 == 1) {
            var5.func_110322_a((double)var2, (double)var3 + var59, (double)((float)var4 + var48), var51, var57);
            var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var48), var53, var57);
            var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var47), var53, var55);
            var5.func_110322_a((double)var2, (double)var3 + var59, (double)((float)var4 + var47), var51, var55);
            var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var48), var51, var57);
            var5.func_110322_a((double)var2 + 0.5D, var64, (double)((float)var4 + var48), var53, var57);
            var5.func_110322_a((double)var2 + 0.5D, var64, (double)((float)var4 + var47), var53, var55);
            var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var59, (double)((float)var4 + var47), var51, var55);
         } else {
            var5.func_110322_a((double)var2 + 0.5D, var64, (double)((float)var4 + var48), var51, var57);
            var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var48), var53, var57);
            var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var47), var53, var55);
            var5.func_110322_a((double)var2 + 0.5D, var64, (double)((float)var4 + var47), var51, var55);
            var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var48), var51, var57);
            var5.func_110322_a((double)(var2 + 1), (double)var3 + var59, (double)((float)var4 + var48), var53, var57);
            var5.func_110322_a((double)(var2 + 1), (double)var3 + var59, (double)((float)var4 + var47), var53, var55);
            var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var59, (double)((float)var4 + var47), var51, var55);
         }
      }

      return true;
   }

   public boolean func_110438_g(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = var1.func_106024_a(0);
      int var7 = this.field_110522_a.func_109357_g(var2, var3, var4);
      boolean var8 = (var7 & 4) == 4;
      boolean var9 = (var7 & 2) == 2;
      if(this.field_110517_d >= 0) {
         var6 = this.field_110517_d;
      }

      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var10 = var1.func_106052_f(this.field_110522_a, var2, var3, var4) * 0.75F;
      var5.func_110334_a(var10, var10, var10);
      int var11 = (var6 & 15) << 4;
      int var12 = var6 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)((float)(var11 + 16) / 256.0F);
      double var17 = (double)((float)(var12 + (var8?2:0)) / 256.0F);
      double var19 = (double)((float)(var12 + (var8?4:2)) / 256.0F);
      double var21 = (double)(var9?3.5F:1.5F) / 16.0D;
      boolean var23 = C_100433_alr.func_106408_a(this.field_110522_a, var2, var3, var4, var7, 1);
      boolean var24 = C_100433_alr.func_106408_a(this.field_110522_a, var2, var3, var4, var7, 3);
      boolean var25 = C_100433_alr.func_106408_a(this.field_110522_a, var2, var3, var4, var7, 2);
      boolean var26 = C_100433_alr.func_106408_a(this.field_110522_a, var2, var3, var4, var7, 0);
      float var27 = 0.03125F;
      float var28 = 0.5F - var27 / 2.0F;
      float var29 = var28 + var27;
      if(!var25 && !var24 && !var26 && !var23) {
         var25 = true;
         var26 = true;
      }

      if(var25) {
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.25D, var13, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.25D, var13, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4, var15, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4, var15, var17);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4, var15, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4, var15, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.25D, var13, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.25D, var13, var17);
      }

      if(var25 || var26 && !var24 && !var23) {
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.5D, var13, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.5D, var13, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.25D, var15, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.25D, var15, var17);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.25D, var15, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.25D, var15, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.5D, var13, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.5D, var13, var17);
      }

      if(var26 || var25 && !var24 && !var23) {
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.75D, var13, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.75D, var13, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.5D, var15, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.5D, var15, var17);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.5D, var15, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.5D, var15, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.75D, var13, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.75D, var13, var17);
      }

      if(var26) {
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)(var4 + 1), var13, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)(var4 + 1), var13, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.75D, var15, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.75D, var15, var17);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)var4 + 0.75D, var15, var17);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)var4 + 0.75D, var15, var19);
         var5.func_110322_a((double)((float)var2 + var29), (double)var3 + var21, (double)(var4 + 1), var13, var19);
         var5.func_110322_a((double)((float)var2 + var28), (double)var3 + var21, (double)(var4 + 1), var13, var17);
      }

      if(var23) {
         var5.func_110322_a((double)var2, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
      }

      if(var23 || var24 && !var25 && !var26) {
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2 + 0.25D, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
      }

      if(var24 || var23 && !var25 && !var26) {
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2 + 0.5D, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
      }

      if(var24) {
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
         var5.func_110322_a((double)(var2 + 1), (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)(var2 + 1), (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var28), var13, var17);
         var5.func_110322_a((double)(var2 + 1), (double)var3 + var21, (double)((float)var4 + var28), var15, var17);
         var5.func_110322_a((double)(var2 + 1), (double)var3 + var21, (double)((float)var4 + var29), var15, var19);
         var5.func_110322_a((double)var2 + 0.75D, (double)var3 + var21, (double)((float)var4 + var29), var13, var19);
      }

      return true;
   }

   public boolean func_110405_h(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = var1.func_106024_a(0);
      if(this.field_110517_d >= 0) {
         var6 = this.field_110517_d;
      }

      var5.func_110334_a(1.0F, 1.0F, 1.0F);
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      int var7 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      double var9 = (double)((float)var7 / 256.0F);
      double var11 = (double)(((float)var7 + 15.99F) / 256.0F);
      double var13 = (double)((float)var8 / 256.0F);
      double var15 = (double)(((float)var8 + 15.99F) / 256.0F);
      float var17 = 1.4F;
      double var20;
      double var22;
      double var24;
      double var26;
      double var28;
      double var30;
      double var32;
      if(!this.field_110522_a.func_109348_t(var2, var3 - 1, var4) && !C_100451_alf.field_106222_au.func_106356_d(this.field_110522_a, var2, var3 - 1, var4)) {
         float var36 = 0.2F;
         float var19 = 0.0625F;
         if((var2 + var3 + var4 & 1) == 1) {
            var9 = (double)((float)var7 / 256.0F);
            var11 = (double)(((float)var7 + 15.99F) / 256.0F);
            var13 = (double)((float)(var8 + 16) / 256.0F);
            var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
         }

         if((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            var20 = var11;
            var11 = var9;
            var9 = var20;
         }

         if(C_100451_alf.field_106222_au.func_106356_d(this.field_110522_a, var2 - 1, var3, var4)) {
            var5.func_110322_a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.func_110322_a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.func_110322_a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.func_110322_a((double)((float)var2 + var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
         }

         if(C_100451_alf.field_106222_au.func_106356_d(this.field_110522_a, var2 + 1, var3, var4)) {
            var5.func_110322_a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
            var5.func_110322_a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.func_110322_a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.func_110322_a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.func_110322_a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 1), var11, var13);
            var5.func_110322_a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1), var11, var15);
            var5.func_110322_a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.func_110322_a((double)((float)(var2 + 1) - var36), (double)((float)var3 + var17 + var19), (double)(var4 + 0), var9, var13);
         }

         if(C_100451_alf.field_106222_au.func_106356_d(this.field_110522_a, var2, var3, var4 - 1)) {
            var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var11, var13);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var11, var15);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var9, var13);
            var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var9, var13);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var9, var15);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 0), var11, var15);
            var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)var4 + var36), var11, var13);
         }

         if(C_100451_alf.field_106222_au.func_106356_d(this.field_110522_a, var2, var3, var4 + 1)) {
            var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var9, var13);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var9, var15);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var11, var15);
            var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var11, var13);
            var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var11, var13);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var11, var15);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 0) + var19), (double)(var4 + 1 - 0), var9, var15);
            var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17 + var19), (double)((float)(var4 + 1) - var36), var9, var13);
         }

         if(C_100451_alf.field_106222_au.func_106356_d(this.field_110522_a, var2, var3 + 1, var4)) {
            var20 = (double)var2 + 0.5D + 0.5D;
            var22 = (double)var2 + 0.5D - 0.5D;
            var24 = (double)var4 + 0.5D + 0.5D;
            var26 = (double)var4 + 0.5D - 0.5D;
            var28 = (double)var2 + 0.5D - 0.5D;
            var30 = (double)var2 + 0.5D + 0.5D;
            var32 = (double)var4 + 0.5D - 0.5D;
            double var34 = (double)var4 + 0.5D + 0.5D;
            var9 = (double)((float)var7 / 256.0F);
            var11 = (double)(((float)var7 + 15.99F) / 256.0F);
            var13 = (double)((float)var8 / 256.0F);
            var15 = (double)(((float)var8 + 15.99F) / 256.0F);
            ++var3;
            var17 = -0.2F;
            if((var2 + var3 + var4 & 1) == 0) {
               var5.func_110322_a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
               var5.func_110322_a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
               var5.func_110322_a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
               var5.func_110322_a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
               var9 = (double)((float)var7 / 256.0F);
               var11 = (double)(((float)var7 + 15.99F) / 256.0F);
               var13 = (double)((float)(var8 + 16) / 256.0F);
               var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
               var5.func_110322_a(var30, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
               var5.func_110322_a(var22, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
               var5.func_110322_a(var22, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
               var5.func_110322_a(var30, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
            } else {
               var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17), var34, var11, var13);
               var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), var26, var11, var15);
               var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), var26, var9, var15);
               var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17), var34, var9, var13);
               var9 = (double)((float)var7 / 256.0F);
               var11 = (double)(((float)var7 + 15.99F) / 256.0F);
               var13 = (double)((float)(var8 + 16) / 256.0F);
               var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
               var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
               var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
               var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
               var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
            }
         }
      } else {
         double var18 = (double)var2 + 0.5D + 0.2D;
         var20 = (double)var2 + 0.5D - 0.2D;
         var22 = (double)var4 + 0.5D + 0.2D;
         var24 = (double)var4 + 0.5D - 0.2D;
         var26 = (double)var2 + 0.5D - 0.3D;
         var28 = (double)var2 + 0.5D + 0.3D;
         var30 = (double)var4 + 0.5D - 0.3D;
         var32 = (double)var4 + 0.5D + 0.3D;
         var5.func_110322_a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
         var5.func_110322_a(var18, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
         var5.func_110322_a(var18, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.func_110322_a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
         var5.func_110322_a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
         var5.func_110322_a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
         var5.func_110322_a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.func_110322_a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
         var9 = (double)((float)var7 / 256.0F);
         var11 = (double)(((float)var7 + 15.99F) / 256.0F);
         var13 = (double)((float)(var8 + 16) / 256.0F);
         var15 = (double)(((float)var8 + 15.99F + 16.0F) / 256.0F);
         var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
         var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
         var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17), var30, var11, var13);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), var22, var11, var15);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), var22, var9, var15);
         var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17), var30, var9, var13);
         var18 = (double)var2 + 0.5D - 0.5D;
         var20 = (double)var2 + 0.5D + 0.5D;
         var22 = (double)var4 + 0.5D - 0.5D;
         var24 = (double)var4 + 0.5D + 0.5D;
         var26 = (double)var2 + 0.5D - 0.4D;
         var28 = (double)var2 + 0.5D + 0.4D;
         var30 = (double)var4 + 0.5D - 0.4D;
         var32 = (double)var4 + 0.5D + 0.4D;
         var5.func_110322_a(var26, (double)((float)var3 + var17), (double)(var4 + 0), var9, var13);
         var5.func_110322_a(var18, (double)(var3 + 0), (double)(var4 + 0), var9, var15);
         var5.func_110322_a(var18, (double)(var3 + 0), (double)(var4 + 1), var11, var15);
         var5.func_110322_a(var26, (double)((float)var3 + var17), (double)(var4 + 1), var11, var13);
         var5.func_110322_a(var28, (double)((float)var3 + var17), (double)(var4 + 1), var9, var13);
         var5.func_110322_a(var20, (double)(var3 + 0), (double)(var4 + 1), var9, var15);
         var5.func_110322_a(var20, (double)(var3 + 0), (double)(var4 + 0), var11, var15);
         var5.func_110322_a(var28, (double)((float)var3 + var17), (double)(var4 + 0), var11, var13);
         var9 = (double)((float)var7 / 256.0F);
         var11 = (double)(((float)var7 + 15.99F) / 256.0F);
         var13 = (double)((float)var8 / 256.0F);
         var15 = (double)(((float)var8 + 15.99F) / 256.0F);
         var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17), var32, var9, var13);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), var24, var9, var15);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), var24, var11, var15);
         var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17), var32, var11, var13);
         var5.func_110322_a((double)(var2 + 1), (double)((float)var3 + var17), var30, var9, var13);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), var22, var9, var15);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), var22, var11, var15);
         var5.func_110322_a((double)(var2 + 0), (double)((float)var3 + var17), var30, var11, var13);
      }

      return true;
   }

   public boolean func_110444_i(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var7 = var1.func_106029_a(1, var6);
      if(this.field_110517_d >= 0) {
         var7 = this.field_110517_d;
      }

      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var8 = 1.0F;
      float var9 = (float)var6 / 15.0F;
      float var10 = var9 * 0.6F + 0.4F;
      if(var6 == 0) {
         var10 = 0.3F;
      }

      float var11 = var9 * var9 * 0.7F - 0.5F;
      float var12 = var9 * var9 * 0.6F - 0.7F;
      if(var11 < 0.0F) {
         var11 = 0.0F;
      }

      if(var12 < 0.0F) {
         var12 = 0.0F;
      }

      var5.func_110334_a(var10, var11, var12);
      int var13 = (var7 & 15) << 4;
      int var14 = var7 & 240;
      double var15 = (double)((float)var13 / 256.0F);
      double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var19 = (double)((float)var14 / 256.0F);
      double var21 = (double)(((float)var14 + 15.99F) / 256.0F);
      boolean var29 = C_100484_akk.func_106462_f(this.field_110522_a, var2 - 1, var3, var4, 1) || !this.field_110522_a.func_109360_s(var2 - 1, var3, var4) && C_100484_akk.func_106462_f(this.field_110522_a, var2 - 1, var3 - 1, var4, -1);
      boolean var30 = C_100484_akk.func_106462_f(this.field_110522_a, var2 + 1, var3, var4, 3) || !this.field_110522_a.func_109360_s(var2 + 1, var3, var4) && C_100484_akk.func_106462_f(this.field_110522_a, var2 + 1, var3 - 1, var4, -1);
      boolean var31 = C_100484_akk.func_106462_f(this.field_110522_a, var2, var3, var4 - 1, 2) || !this.field_110522_a.func_109360_s(var2, var3, var4 - 1) && C_100484_akk.func_106462_f(this.field_110522_a, var2, var3 - 1, var4 - 1, -1);
      boolean var32 = C_100484_akk.func_106462_f(this.field_110522_a, var2, var3, var4 + 1, 0) || !this.field_110522_a.func_109360_s(var2, var3, var4 + 1) && C_100484_akk.func_106462_f(this.field_110522_a, var2, var3 - 1, var4 + 1, -1);
      if(!this.field_110522_a.func_109360_s(var2, var3 + 1, var4)) {
         if(this.field_110522_a.func_109360_s(var2 - 1, var3, var4) && C_100484_akk.func_106462_f(this.field_110522_a, var2 - 1, var3 + 1, var4, -1)) {
            var29 = true;
         }

         if(this.field_110522_a.func_109360_s(var2 + 1, var3, var4) && C_100484_akk.func_106462_f(this.field_110522_a, var2 + 1, var3 + 1, var4, -1)) {
            var30 = true;
         }

         if(this.field_110522_a.func_109360_s(var2, var3, var4 - 1) && C_100484_akk.func_106462_f(this.field_110522_a, var2, var3 + 1, var4 - 1, -1)) {
            var31 = true;
         }

         if(this.field_110522_a.func_109360_s(var2, var3, var4 + 1) && C_100484_akk.func_106462_f(this.field_110522_a, var2, var3 + 1, var4 + 1, -1)) {
            var32 = true;
         }
      }

      float var34 = (float)(var2 + 0);
      float var35 = (float)(var2 + 1);
      float var36 = (float)(var4 + 0);
      float var37 = (float)(var4 + 1);
      byte var38 = 0;
      if((var29 || var30) && !var31 && !var32) {
         var38 = 1;
      }

      if((var31 || var32) && !var30 && !var29) {
         var38 = 2;
      }

      if(var38 != 0) {
         var15 = (double)((float)(var13 + 16) / 256.0F);
         var17 = (double)(((float)(var13 + 16) + 15.99F) / 256.0F);
         var19 = (double)((float)var14 / 256.0F);
         var21 = (double)(((float)var14 + 15.99F) / 256.0F);
      }

      if(var38 == 0) {
         if(!var29) {
            var34 += 0.3125F;
         }

         if(!var29) {
            var15 += 0.01953125D;
         }

         if(!var30) {
            var35 -= 0.3125F;
         }

         if(!var30) {
            var17 -= 0.01953125D;
         }

         if(!var31) {
            var36 += 0.3125F;
         }

         if(!var31) {
            var19 += 0.01953125D;
         }

         if(!var32) {
            var37 -= 0.3125F;
         }

         if(!var32) {
            var21 -= 0.01953125D;
         }

         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21);
         var5.func_110334_a(var8, var8, var8);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21 + 0.0625D);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19 + 0.0625D);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19 + 0.0625D);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21 + 0.0625D);
      } else if(var38 == 1) {
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21);
         var5.func_110334_a(var8, var8, var8);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21 + 0.0625D);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var36, var17, var19 + 0.0625D);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19 + 0.0625D);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var37, var15, var21 + 0.0625D);
      } else if(var38 == 2) {
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var36, var15, var21);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var37, var17, var19);
         var5.func_110334_a(var8, var8, var8);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var37, var17, var21 + 0.0625D);
         var5.func_110322_a((double)var35, (double)var3 + 0.015625D, (double)var36, var15, var21 + 0.0625D);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var36, var15, var19 + 0.0625D);
         var5.func_110322_a((double)var34, (double)var3 + 0.015625D, (double)var37, var17, var19 + 0.0625D);
      }

      if(!this.field_110522_a.func_109360_s(var2, var3 + 1, var4)) {
         var15 = (double)((float)(var13 + 16) / 256.0F);
         var17 = (double)(((float)(var13 + 16) + 15.99F) / 256.0F);
         var19 = (double)((float)var14 / 256.0F);
         var21 = (double)(((float)var14 + 15.99F) / 256.0F);
         if(this.field_110522_a.func_109360_s(var2 - 1, var3, var4) && this.field_110522_a.func_109349_a(var2 - 1, var3 + 1, var4) == C_100451_alf.field_106203_ay.field_106162_cm) {
            var5.func_110334_a(var8 * var10, var8 * var11, var8 * var12);
            var5.func_110322_a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var19);
            var5.func_110322_a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var19);
            var5.func_110322_a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var21);
            var5.func_110322_a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var21);
            var5.func_110334_a(var8, var8, var8);
            var5.func_110322_a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var19 + 0.0625D);
            var5.func_110322_a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var19 + 0.0625D);
            var5.func_110322_a((double)var2 + 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var21 + 0.0625D);
            var5.func_110322_a((double)var2 + 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var21 + 0.0625D);
         }

         if(this.field_110522_a.func_109360_s(var2 + 1, var3, var4) && this.field_110522_a.func_109349_a(var2 + 1, var3 + 1, var4) == C_100451_alf.field_106203_ay.field_106162_cm) {
            var5.func_110334_a(var8 * var10, var8 * var11, var8 * var12);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var21);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var21);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var19);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var19);
            var5.func_110334_a(var8, var8, var8);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 1), var15, var21 + 0.0625D);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1), var17, var21 + 0.0625D);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 0), var17, var19 + 0.0625D);
            var5.func_110322_a((double)(var2 + 1) - 0.015625D, (double)(var3 + 0), (double)(var4 + 0), var15, var19 + 0.0625D);
         }

         if(this.field_110522_a.func_109360_s(var2, var3, var4 - 1) && this.field_110522_a.func_109349_a(var2, var3 + 1, var4 - 1) == C_100451_alf.field_106203_ay.field_106162_cm) {
            var5.func_110334_a(var8 * var10, var8 * var11, var8 * var12);
            var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var21);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var21);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var19);
            var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var19);
            var5.func_110334_a(var8, var8, var8);
            var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var21 + 0.0625D);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var21 + 0.0625D);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)var4 + 0.015625D, var17, var19 + 0.0625D);
            var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + 0.015625D, var15, var19 + 0.0625D);
         }

         if(this.field_110522_a.func_109360_s(var2, var3, var4 + 1) && this.field_110522_a.func_109349_a(var2, var3 + 1, var4 + 1) == C_100451_alf.field_106203_ay.field_106162_cm) {
            var5.func_110334_a(var8 * var10, var8 * var11, var8 * var12);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var19);
            var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var19);
            var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var21);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var21);
            var5.func_110334_a(var8, var8, var8);
            var5.func_110322_a((double)(var2 + 1), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var19 + 0.0625D);
            var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var19 + 0.0625D);
            var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - 0.015625D, var15, var21 + 0.0625D);
            var5.func_110322_a((double)(var2 + 0), (double)((float)(var3 + 1) + 0.021875F), (double)(var4 + 1) - 0.015625D, var17, var21 + 0.0625D);
         }
      }

      return true;
   }

   public boolean func_110401_a(C_100127_akg var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var7 = var1.func_106029_a(0, var6);
      if(this.field_110517_d >= 0) {
         var7 = this.field_110517_d;
      }

      if(var1.func_106263_p()) {
         var6 &= 7;
      }

      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      var5.func_110334_a(1.0F, 1.0F, 1.0F);
      int var8 = (var7 & 15) << 4;
      int var9 = var7 & 240;
      double var10 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var9 / 256.0F);
      double var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      double var18 = 0.0625D;
      double var20 = (double)(var2 + 1);
      double var22 = (double)(var2 + 1);
      double var24 = (double)(var2 + 0);
      double var26 = (double)(var2 + 0);
      double var28 = (double)(var4 + 0);
      double var30 = (double)(var4 + 1);
      double var32 = (double)(var4 + 1);
      double var34 = (double)(var4 + 0);
      double var36 = (double)var3 + var18;
      double var38 = (double)var3 + var18;
      double var40 = (double)var3 + var18;
      double var42 = (double)var3 + var18;
      if(var6 != 1 && var6 != 2 && var6 != 3 && var6 != 7) {
         if(var6 == 8) {
            var20 = var22 = (double)(var2 + 0);
            var24 = var26 = (double)(var2 + 1);
            var28 = var34 = (double)(var4 + 1);
            var30 = var32 = (double)(var4 + 0);
         } else if(var6 == 9) {
            var20 = var26 = (double)(var2 + 0);
            var22 = var24 = (double)(var2 + 1);
            var28 = var30 = (double)(var4 + 0);
            var32 = var34 = (double)(var4 + 1);
         }
      } else {
         var20 = var26 = (double)(var2 + 1);
         var22 = var24 = (double)(var2 + 0);
         var28 = var30 = (double)(var4 + 1);
         var32 = var34 = (double)(var4 + 0);
      }

      if(var6 != 2 && var6 != 4) {
         if(var6 == 3 || var6 == 5) {
            ++var38;
            ++var40;
         }
      } else {
         ++var36;
         ++var42;
      }

      var5.func_110322_a(var20, var36, var28, var12, var14);
      var5.func_110322_a(var22, var38, var30, var12, var16);
      var5.func_110322_a(var24, var40, var32, var10, var16);
      var5.func_110322_a(var26, var42, var34, var10, var14);
      var5.func_110322_a(var26, var42, var34, var10, var14);
      var5.func_110322_a(var24, var40, var32, var10, var16);
      var5.func_110322_a(var22, var38, var30, var12, var16);
      var5.func_110322_a(var20, var36, var28, var12, var14);
      return true;
   }

   public boolean func_110446_j(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = var1.func_106024_a(0);
      if(this.field_110517_d >= 0) {
         var6 = this.field_110517_d;
      }

      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var7 = 1.0F;
      var5.func_110334_a(var7, var7, var7);
      int var22 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      double var9 = (double)((float)var22 / 256.0F);
      double var11 = (double)(((float)var22 + 15.99F) / 256.0F);
      double var13 = (double)((float)var8 / 256.0F);
      double var15 = (double)(((float)var8 + 15.99F) / 256.0F);
      int var17 = this.field_110522_a.func_109357_g(var2, var3, var4);
      double var18 = 0.0D;
      double var20 = 0.05000000074505806D;
      if(var17 == 5) {
         var5.func_110322_a((double)var2 + var20, (double)(var3 + 1) + var18, (double)(var4 + 1) + var18, var9, var13);
         var5.func_110322_a((double)var2 + var20, (double)(var3 + 0) - var18, (double)(var4 + 1) + var18, var9, var15);
         var5.func_110322_a((double)var2 + var20, (double)(var3 + 0) - var18, (double)(var4 + 0) - var18, var11, var15);
         var5.func_110322_a((double)var2 + var20, (double)(var3 + 1) + var18, (double)(var4 + 0) - var18, var11, var13);
      }

      if(var17 == 4) {
         var5.func_110322_a((double)(var2 + 1) - var20, (double)(var3 + 0) - var18, (double)(var4 + 1) + var18, var11, var15);
         var5.func_110322_a((double)(var2 + 1) - var20, (double)(var3 + 1) + var18, (double)(var4 + 1) + var18, var11, var13);
         var5.func_110322_a((double)(var2 + 1) - var20, (double)(var3 + 1) + var18, (double)(var4 + 0) - var18, var9, var13);
         var5.func_110322_a((double)(var2 + 1) - var20, (double)(var3 + 0) - var18, (double)(var4 + 0) - var18, var9, var15);
      }

      if(var17 == 3) {
         var5.func_110322_a((double)(var2 + 1) + var18, (double)(var3 + 0) - var18, (double)var4 + var20, var11, var15);
         var5.func_110322_a((double)(var2 + 1) + var18, (double)(var3 + 1) + var18, (double)var4 + var20, var11, var13);
         var5.func_110322_a((double)(var2 + 0) - var18, (double)(var3 + 1) + var18, (double)var4 + var20, var9, var13);
         var5.func_110322_a((double)(var2 + 0) - var18, (double)(var3 + 0) - var18, (double)var4 + var20, var9, var15);
      }

      if(var17 == 2) {
         var5.func_110322_a((double)(var2 + 1) + var18, (double)(var3 + 1) + var18, (double)(var4 + 1) - var20, var9, var13);
         var5.func_110322_a((double)(var2 + 1) + var18, (double)(var3 + 0) - var18, (double)(var4 + 1) - var20, var9, var15);
         var5.func_110322_a((double)(var2 + 0) - var18, (double)(var3 + 0) - var18, (double)(var4 + 1) - var20, var11, var15);
         var5.func_110322_a((double)(var2 + 0) - var18, (double)(var3 + 1) + var18, (double)(var4 + 1) - var20, var11, var13);
      }

      return true;
   }

   public boolean func_110431_k(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = var1.func_106024_a(0);
      if(this.field_110517_d >= 0) {
         var6 = this.field_110517_d;
      }

      float var7 = 1.0F;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      int var8 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      var5.func_110334_a(var7 * var9, var7 * var10, var7 * var11);
      var8 = (var6 & 15) << 4;
      int var21 = var6 & 240;
      double var22 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var21 / 256.0F);
      double var16 = (double)(((float)var21 + 15.99F) / 256.0F);
      double var18 = 0.05000000074505806D;
      int var20 = this.field_110522_a.func_109357_g(var2, var3, var4);
      if((var20 & 2) != 0) {
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 1), var22, var14);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 1), var22, var16);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 0), var12, var14);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 0), (double)(var4 + 1), var22, var16);
         var5.func_110322_a((double)var2 + var18, (double)(var3 + 1), (double)(var4 + 1), var22, var14);
      }

      if((var20 & 8) != 0) {
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 0), var22, var14);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 0), var22, var16);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 0), var22, var16);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 0), var22, var14);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 1), (double)(var4 + 1), var12, var14);
         var5.func_110322_a((double)(var2 + 1) - var18, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
      }

      if((var20 & 4) != 0) {
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var18, var12, var16);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var18, var12, var14);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var18, var22, var14);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var18, var22, var16);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)var4 + var18, var22, var16);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 1), (double)var4 + var18, var22, var14);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 1), (double)var4 + var18, var12, var14);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)var4 + var18, var12, var16);
      }

      if((var20 & 1) != 0) {
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var18, var22, var14);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var18, var22, var16);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var18, var12, var16);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var18, var12, var14);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 1), (double)(var4 + 1) - var18, var12, var14);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 1) - var18, var12, var16);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 0), (double)(var4 + 1) - var18, var22, var16);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1) - var18, var22, var14);
      }

      if(this.field_110522_a.func_109360_s(var2, var3 + 1, var4)) {
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 1) - var18, (double)(var4 + 0), var22, var14);
         var5.func_110322_a((double)(var2 + 1), (double)(var3 + 1) - var18, (double)(var4 + 1), var22, var16);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 1) - var18, (double)(var4 + 1), var12, var16);
         var5.func_110322_a((double)(var2 + 0), (double)(var3 + 1) - var18, (double)(var4 + 0), var12, var14);
      }

      return true;
   }

   public boolean func_110469_a(C_100450_ale var1, int var2, int var3, int var4) {
      int var5 = this.field_110522_a.func_109361_N();
      C_100872_azb var6 = C_100872_azb.field_110346_a;
      var6.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.func_110334_a(var7 * var9, var7 * var10, var7 * var11);
      boolean var66 = false;
      boolean var69 = false;
      int var68;
      int var70;
      int var67;
      if(this.field_110517_d >= 0) {
         var67 = this.field_110517_d;
         var68 = this.field_110517_d;
      } else {
         var70 = this.field_110522_a.func_109357_g(var2, var3, var4);
         var67 = var1.func_106029_a(0, var70);
         var68 = var1.func_106435_p();
      }

      var70 = (var67 & 15) << 4;
      int var15 = var67 & 240;
      double var16 = (double)((float)var70 / 256.0F);
      double var18 = (double)(((float)var70 + 7.99F) / 256.0F);
      double var20 = (double)(((float)var70 + 15.99F) / 256.0F);
      double var22 = (double)((float)var15 / 256.0F);
      double var24 = (double)(((float)var15 + 15.99F) / 256.0F);
      int var26 = (var68 & 15) << 4;
      int var27 = var68 & 240;
      double var28 = (double)((float)(var26 + 7) / 256.0F);
      double var30 = (double)(((float)var26 + 8.99F) / 256.0F);
      double var32 = (double)((float)var27 / 256.0F);
      double var34 = (double)((float)(var27 + 8) / 256.0F);
      double var36 = (double)(((float)var27 + 15.99F) / 256.0F);
      double var38 = (double)var2;
      double var40 = (double)var2 + 0.5D;
      double var42 = (double)(var2 + 1);
      double var44 = (double)var4;
      double var46 = (double)var4 + 0.5D;
      double var48 = (double)(var4 + 1);
      double var50 = (double)var2 + 0.5D - 0.0625D;
      double var52 = (double)var2 + 0.5D + 0.0625D;
      double var54 = (double)var4 + 0.5D - 0.0625D;
      double var56 = (double)var4 + 0.5D + 0.0625D;
      boolean var58 = var1.func_106436_e(this.field_110522_a.func_109349_a(var2, var3, var4 - 1));
      boolean var59 = var1.func_106436_e(this.field_110522_a.func_109349_a(var2, var3, var4 + 1));
      boolean var60 = var1.func_106436_e(this.field_110522_a.func_109349_a(var2 - 1, var3, var4));
      boolean var61 = var1.func_106436_e(this.field_110522_a.func_109349_a(var2 + 1, var3, var4));
      boolean var62 = var1.func_105976_a(this.field_110522_a, var2, var3 + 1, var4, 1);
      boolean var63 = var1.func_105976_a(this.field_110522_a, var2, var3 - 1, var4, 0);
      if((!var60 || !var61) && (var60 || var61 || var58 || var59)) {
         if(var60 && !var61) {
            var6.func_110322_a(var38, (double)(var3 + 1), var46, var16, var22);
            var6.func_110322_a(var38, (double)(var3 + 0), var46, var16, var24);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var16, var22);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var16, var24);
            var6.func_110322_a(var38, (double)(var3 + 0), var46, var18, var24);
            var6.func_110322_a(var38, (double)(var3 + 1), var46, var18, var22);
            if(!var59 && !var58) {
               var6.func_110322_a(var40, (double)(var3 + 1), var56, var28, var32);
               var6.func_110322_a(var40, (double)(var3 + 0), var56, var28, var36);
               var6.func_110322_a(var40, (double)(var3 + 0), var54, var30, var36);
               var6.func_110322_a(var40, (double)(var3 + 1), var54, var30, var32);
               var6.func_110322_a(var40, (double)(var3 + 1), var54, var28, var32);
               var6.func_110322_a(var40, (double)(var3 + 0), var54, var28, var36);
               var6.func_110322_a(var40, (double)(var3 + 0), var56, var30, var36);
               var6.func_110322_a(var40, (double)(var3 + 1), var56, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2 - 1, var3 + 1, var4)) {
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
            }

            if(var63 || var3 > 1 && this.field_110522_a.func_109352_c(var2 - 1, var3 - 1, var4)) {
               var6.func_110322_a(var38, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var36);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var36);
               var6.func_110322_a(var38, (double)var3 - 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var38, (double)var3 - 0.01D, var56, var30, var36);
               var6.func_110322_a(var38, (double)var3 - 0.01D, var54, var28, var36);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var34);
            }
         } else if(!var60 && var61) {
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.func_110322_a(var42, (double)(var3 + 0), var46, var20, var24);
            var6.func_110322_a(var42, (double)(var3 + 1), var46, var20, var22);
            var6.func_110322_a(var42, (double)(var3 + 1), var46, var18, var22);
            var6.func_110322_a(var42, (double)(var3 + 0), var46, var18, var24);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var20, var24);
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var20, var22);
            if(!var59 && !var58) {
               var6.func_110322_a(var40, (double)(var3 + 1), var54, var28, var32);
               var6.func_110322_a(var40, (double)(var3 + 0), var54, var28, var36);
               var6.func_110322_a(var40, (double)(var3 + 0), var56, var30, var36);
               var6.func_110322_a(var40, (double)(var3 + 1), var56, var30, var32);
               var6.func_110322_a(var40, (double)(var3 + 1), var56, var28, var32);
               var6.func_110322_a(var40, (double)(var3 + 0), var56, var28, var36);
               var6.func_110322_a(var40, (double)(var3 + 0), var54, var30, var36);
               var6.func_110322_a(var40, (double)(var3 + 1), var54, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2 + 1, var3 + 1, var4)) {
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var32);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            }

            if(var63 || var3 > 1 && this.field_110522_a.func_109352_c(var2 + 1, var3 - 1, var4)) {
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var32);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var32);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var56, var30, var32);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var34);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var54, var28, var32);
            }
         }
      } else {
         var6.func_110322_a(var38, (double)(var3 + 1), var46, var16, var22);
         var6.func_110322_a(var38, (double)(var3 + 0), var46, var16, var24);
         var6.func_110322_a(var42, (double)(var3 + 0), var46, var20, var24);
         var6.func_110322_a(var42, (double)(var3 + 1), var46, var20, var22);
         var6.func_110322_a(var42, (double)(var3 + 1), var46, var16, var22);
         var6.func_110322_a(var42, (double)(var3 + 0), var46, var16, var24);
         var6.func_110322_a(var38, (double)(var3 + 0), var46, var20, var24);
         var6.func_110322_a(var38, (double)(var3 + 1), var46, var20, var22);
         if(var62) {
            var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var36);
            var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var32);
            var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var36);
            var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var36);
            var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var32);
            var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var36);
         } else {
            if(var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2 - 1, var3 + 1, var4)) {
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var56, var30, var36);
               var6.func_110322_a(var38, (double)(var3 + 1) + 0.01D, var54, var28, var36);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
            }

            if(var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2 + 1, var3 + 1, var4)) {
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var32);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var56, var30, var32);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)(var3 + 1) + 0.01D, var54, var28, var34);
               var6.func_110322_a(var42, (double)(var3 + 1) + 0.01D, var54, var28, var32);
            }
         }

         if(var63) {
            var6.func_110322_a(var38, (double)var3 - 0.01D, var56, var30, var36);
            var6.func_110322_a(var42, (double)var3 - 0.01D, var56, var30, var32);
            var6.func_110322_a(var42, (double)var3 - 0.01D, var54, var28, var32);
            var6.func_110322_a(var38, (double)var3 - 0.01D, var54, var28, var36);
            var6.func_110322_a(var42, (double)var3 - 0.01D, var56, var30, var36);
            var6.func_110322_a(var38, (double)var3 - 0.01D, var56, var30, var32);
            var6.func_110322_a(var38, (double)var3 - 0.01D, var54, var28, var32);
            var6.func_110322_a(var42, (double)var3 - 0.01D, var54, var28, var36);
         } else {
            if(var3 > 1 && this.field_110522_a.func_109352_c(var2 - 1, var3 - 1, var4)) {
               var6.func_110322_a(var38, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var36);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var36);
               var6.func_110322_a(var38, (double)var3 - 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var38, (double)var3 - 0.01D, var56, var30, var36);
               var6.func_110322_a(var38, (double)var3 - 0.01D, var54, var28, var36);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var34);
            }

            if(var3 > 1 && this.field_110522_a.func_109352_c(var2 + 1, var3 - 1, var4)) {
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var32);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var54, var28, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var32);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var56, var30, var32);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var56, var30, var34);
               var6.func_110322_a(var40, (double)var3 - 0.01D, var54, var28, var34);
               var6.func_110322_a(var42, (double)var3 - 0.01D, var54, var28, var32);
            }
         }
      }

      if((!var58 || !var59) && (var60 || var61 || var58 || var59)) {
         if(var58 && !var59) {
            var6.func_110322_a(var40, (double)(var3 + 1), var44, var16, var22);
            var6.func_110322_a(var40, (double)(var3 + 0), var44, var16, var24);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var16, var22);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var16, var24);
            var6.func_110322_a(var40, (double)(var3 + 0), var44, var18, var24);
            var6.func_110322_a(var40, (double)(var3 + 1), var44, var18, var22);
            if(!var61 && !var60) {
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var28, var32);
               var6.func_110322_a(var50, (double)(var3 + 0), var46, var28, var36);
               var6.func_110322_a(var52, (double)(var3 + 0), var46, var30, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var30, var32);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var28, var32);
               var6.func_110322_a(var52, (double)(var3 + 0), var46, var28, var36);
               var6.func_110322_a(var50, (double)(var3 + 0), var46, var30, var36);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2, var3 + 1, var4 - 1)) {
               var6.func_110322_a(var50, (double)(var3 + 1), var44, var30, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var30, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var28, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var44, var28, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var44, var30, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var44, var28, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var28, var32);
            }

            if(var63 || var3 > 1 && this.field_110522_a.func_109352_c(var2, var3 - 1, var4 - 1)) {
               var6.func_110322_a(var50, (double)var3, var44, var30, var32);
               var6.func_110322_a(var50, (double)var3, var46, var30, var34);
               var6.func_110322_a(var52, (double)var3, var46, var28, var34);
               var6.func_110322_a(var52, (double)var3, var44, var28, var32);
               var6.func_110322_a(var50, (double)var3, var46, var30, var32);
               var6.func_110322_a(var50, (double)var3, var44, var30, var34);
               var6.func_110322_a(var52, (double)var3, var44, var28, var34);
               var6.func_110322_a(var52, (double)var3, var46, var28, var32);
            }
         } else if(!var58 && var59) {
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var18, var22);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var18, var24);
            var6.func_110322_a(var40, (double)(var3 + 0), var48, var20, var24);
            var6.func_110322_a(var40, (double)(var3 + 1), var48, var20, var22);
            var6.func_110322_a(var40, (double)(var3 + 1), var48, var18, var22);
            var6.func_110322_a(var40, (double)(var3 + 0), var48, var18, var24);
            var6.func_110322_a(var40, (double)(var3 + 0), var46, var20, var24);
            var6.func_110322_a(var40, (double)(var3 + 1), var46, var20, var22);
            if(!var61 && !var60) {
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var28, var32);
               var6.func_110322_a(var52, (double)(var3 + 0), var46, var28, var36);
               var6.func_110322_a(var50, (double)(var3 + 0), var46, var30, var36);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var28, var32);
               var6.func_110322_a(var50, (double)(var3 + 0), var46, var28, var36);
               var6.func_110322_a(var52, (double)(var3 + 0), var46, var30, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var30, var32);
            }

            if(var62 || var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2, var3 + 1, var4 + 1)) {
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var28, var34);
               var6.func_110322_a(var50, (double)(var3 + 1), var48, var28, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var48, var30, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var30, var34);
               var6.func_110322_a(var50, (double)(var3 + 1), var48, var28, var34);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var28, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var30, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var48, var30, var34);
            }

            if(var63 || var3 > 1 && this.field_110522_a.func_109352_c(var2, var3 - 1, var4 + 1)) {
               var6.func_110322_a(var50, (double)var3, var46, var28, var34);
               var6.func_110322_a(var50, (double)var3, var48, var28, var36);
               var6.func_110322_a(var52, (double)var3, var48, var30, var36);
               var6.func_110322_a(var52, (double)var3, var46, var30, var34);
               var6.func_110322_a(var50, (double)var3, var48, var28, var34);
               var6.func_110322_a(var50, (double)var3, var46, var28, var36);
               var6.func_110322_a(var52, (double)var3, var46, var30, var36);
               var6.func_110322_a(var52, (double)var3, var48, var30, var34);
            }
         }
      } else {
         var6.func_110322_a(var40, (double)(var3 + 1), var48, var16, var22);
         var6.func_110322_a(var40, (double)(var3 + 0), var48, var16, var24);
         var6.func_110322_a(var40, (double)(var3 + 0), var44, var20, var24);
         var6.func_110322_a(var40, (double)(var3 + 1), var44, var20, var22);
         var6.func_110322_a(var40, (double)(var3 + 1), var44, var16, var22);
         var6.func_110322_a(var40, (double)(var3 + 0), var44, var16, var24);
         var6.func_110322_a(var40, (double)(var3 + 0), var48, var20, var24);
         var6.func_110322_a(var40, (double)(var3 + 1), var48, var20, var22);
         if(var62) {
            var6.func_110322_a(var52, (double)(var3 + 1), var48, var30, var36);
            var6.func_110322_a(var52, (double)(var3 + 1), var44, var30, var32);
            var6.func_110322_a(var50, (double)(var3 + 1), var44, var28, var32);
            var6.func_110322_a(var50, (double)(var3 + 1), var48, var28, var36);
            var6.func_110322_a(var52, (double)(var3 + 1), var44, var30, var36);
            var6.func_110322_a(var52, (double)(var3 + 1), var48, var30, var32);
            var6.func_110322_a(var50, (double)(var3 + 1), var48, var28, var32);
            var6.func_110322_a(var50, (double)(var3 + 1), var44, var28, var36);
         } else {
            if(var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2, var3 + 1, var4 - 1)) {
               var6.func_110322_a(var50, (double)(var3 + 1), var44, var30, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var30, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var28, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var44, var28, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var30, var32);
               var6.func_110322_a(var50, (double)(var3 + 1), var44, var30, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var44, var28, var34);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var28, var32);
            }

            if(var3 < var5 - 1 && this.field_110522_a.func_109352_c(var2, var3 + 1, var4 + 1)) {
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var28, var34);
               var6.func_110322_a(var50, (double)(var3 + 1), var48, var28, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var48, var30, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var30, var34);
               var6.func_110322_a(var50, (double)(var3 + 1), var48, var28, var34);
               var6.func_110322_a(var50, (double)(var3 + 1), var46, var28, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var46, var30, var36);
               var6.func_110322_a(var52, (double)(var3 + 1), var48, var30, var34);
            }
         }

         if(var63) {
            var6.func_110322_a(var52, (double)var3, var48, var30, var36);
            var6.func_110322_a(var52, (double)var3, var44, var30, var32);
            var6.func_110322_a(var50, (double)var3, var44, var28, var32);
            var6.func_110322_a(var50, (double)var3, var48, var28, var36);
            var6.func_110322_a(var52, (double)var3, var44, var30, var36);
            var6.func_110322_a(var52, (double)var3, var48, var30, var32);
            var6.func_110322_a(var50, (double)var3, var48, var28, var32);
            var6.func_110322_a(var50, (double)var3, var44, var28, var36);
         } else {
            if(var3 > 1 && this.field_110522_a.func_109352_c(var2, var3 - 1, var4 - 1)) {
               var6.func_110322_a(var50, (double)var3, var44, var30, var32);
               var6.func_110322_a(var50, (double)var3, var46, var30, var34);
               var6.func_110322_a(var52, (double)var3, var46, var28, var34);
               var6.func_110322_a(var52, (double)var3, var44, var28, var32);
               var6.func_110322_a(var50, (double)var3, var46, var30, var32);
               var6.func_110322_a(var50, (double)var3, var44, var30, var34);
               var6.func_110322_a(var52, (double)var3, var44, var28, var34);
               var6.func_110322_a(var52, (double)var3, var46, var28, var32);
            }

            if(var3 > 1 && this.field_110522_a.func_109352_c(var2, var3 - 1, var4 + 1)) {
               var6.func_110322_a(var50, (double)var3, var46, var28, var34);
               var6.func_110322_a(var50, (double)var3, var48, var28, var36);
               var6.func_110322_a(var52, (double)var3, var48, var30, var36);
               var6.func_110322_a(var52, (double)var3, var46, var30, var34);
               var6.func_110322_a(var50, (double)var3, var48, var28, var34);
               var6.func_110322_a(var50, (double)var3, var46, var28, var36);
               var6.func_110322_a(var52, (double)var3, var46, var30, var36);
               var6.func_110322_a(var52, (double)var3, var48, var30, var34);
            }
         }
      }

      return true;
   }

   public boolean func_110449_l(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var6 = 1.0F;
      int var7 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var8 = (float)(var7 >> 16 & 255) / 255.0F;
      float var9 = (float)(var7 >> 8 & 255) / 255.0F;
      float var10 = (float)(var7 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
         float var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
         float var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
         var8 = var11;
         var9 = var12;
         var10 = var13;
      }

      var5.func_110334_a(var6 * var8, var6 * var9, var6 * var10);
      double var19 = (double)var2;
      double var20 = (double)var3;
      double var15 = (double)var4;
      if(var1 == C_100451_alf.field_106244_aa) {
         long var17 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
         var17 = var17 * var17 * 42317861L + var17 * 11L;
         var19 += ((double)((float)(var17 >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D;
         var20 += ((double)((float)(var17 >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D;
         var15 += ((double)((float)(var17 >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D;
      }

      this.func_110450_a(var1, this.field_110522_a.func_109357_g(var2, var3, var4), var19, var20, var15, 1.0F);
      return true;
   }

   public boolean func_110463_m(C_100451_alf var1, int var2, int var3, int var4) {
      C_100468_akx var5 = (C_100468_akx)var1;
      C_100872_azb var6 = C_100872_azb.field_110346_a;
      var6.func_110328_c(var5.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var7 = 1.0F;
      int var8 = var5.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var9 = (float)(var8 >> 16 & 255) / 255.0F;
      float var10 = (float)(var8 >> 8 & 255) / 255.0F;
      float var11 = (float)(var8 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = var13;
         var11 = var14;
      }

      var6.func_110334_a(var7 * var9, var7 * var10, var7 * var11);
      var5.func_106007_a(this.field_110522_a, var2, var3, var4);
      int var15 = var5.func_106382_d(this.field_110522_a, var2, var3, var4);
      if(var15 < 0) {
         this.func_110455_a(var5, this.field_110522_a.func_109357_g(var2, var3, var4), this.field_110532_j, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      } else {
         this.func_110455_a(var5, this.field_110522_a.func_109357_g(var2, var3, var4), 0.5D, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
         this.func_110440_a(var5, this.field_110522_a.func_109357_g(var2, var3, var4), var15, this.field_110532_j, (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      }

      return true;
   }

   public boolean func_110408_n(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      var5.func_110334_a(1.0F, 1.0F, 1.0F);
      this.func_110443_a(var1, this.field_110522_a.func_109357_g(var2, var3, var4), (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   public void func_110415_a(C_100451_alf var1, double var2, double var4, double var6, double var8, double var10) {
      C_100872_azb var12 = C_100872_azb.field_110346_a;
      int var13 = var1.func_106024_a(0);
      if(this.field_110517_d >= 0) {
         var13 = this.field_110517_d;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      float var16 = (float)var14 / 256.0F;
      float var17 = ((float)var14 + 15.99F) / 256.0F;
      float var18 = (float)var15 / 256.0F;
      float var19 = ((float)var15 + 15.99F) / 256.0F;
      double var20 = (double)var16 + 0.02734375D;
      double var22 = (double)var18 + 0.0234375D;
      double var24 = (double)var16 + 0.03515625D;
      double var26 = (double)var18 + 0.03125D;
      var2 += 0.5D;
      var6 += 0.5D;
      double var28 = var2 - 0.5D;
      double var30 = var2 + 0.5D;
      double var32 = var6 - 0.5D;
      double var34 = var6 + 0.5D;
      double var36 = 0.0625D;
      double var38 = 0.625D;
      var12.func_110322_a(var2 + var8 * (1.0D - var38) - var36, var4 + var38, var6 + var10 * (1.0D - var38) - var36, var20, var22);
      var12.func_110322_a(var2 + var8 * (1.0D - var38) - var36, var4 + var38, var6 + var10 * (1.0D - var38) + var36, var20, var26);
      var12.func_110322_a(var2 + var8 * (1.0D - var38) + var36, var4 + var38, var6 + var10 * (1.0D - var38) + var36, var24, var26);
      var12.func_110322_a(var2 + var8 * (1.0D - var38) + var36, var4 + var38, var6 + var10 * (1.0D - var38) - var36, var24, var22);
      var12.func_110322_a(var2 - var36, var4 + 1.0D, var32, (double)var16, (double)var18);
      var12.func_110322_a(var2 - var36 + var8, var4 + 0.0D, var32 + var10, (double)var16, (double)var19);
      var12.func_110322_a(var2 - var36 + var8, var4 + 0.0D, var34 + var10, (double)var17, (double)var19);
      var12.func_110322_a(var2 - var36, var4 + 1.0D, var34, (double)var17, (double)var18);
      var12.func_110322_a(var2 + var36, var4 + 1.0D, var34, (double)var16, (double)var18);
      var12.func_110322_a(var2 + var8 + var36, var4 + 0.0D, var34 + var10, (double)var16, (double)var19);
      var12.func_110322_a(var2 + var8 + var36, var4 + 0.0D, var32 + var10, (double)var17, (double)var19);
      var12.func_110322_a(var2 + var36, var4 + 1.0D, var32, (double)var17, (double)var18);
      var12.func_110322_a(var28, var4 + 1.0D, var6 + var36, (double)var16, (double)var18);
      var12.func_110322_a(var28 + var8, var4 + 0.0D, var6 + var36 + var10, (double)var16, (double)var19);
      var12.func_110322_a(var30 + var8, var4 + 0.0D, var6 + var36 + var10, (double)var17, (double)var19);
      var12.func_110322_a(var30, var4 + 1.0D, var6 + var36, (double)var17, (double)var18);
      var12.func_110322_a(var30, var4 + 1.0D, var6 - var36, (double)var16, (double)var18);
      var12.func_110322_a(var30 + var8, var4 + 0.0D, var6 - var36 + var10, (double)var16, (double)var19);
      var12.func_110322_a(var28 + var8, var4 + 0.0D, var6 - var36 + var10, (double)var17, (double)var19);
      var12.func_110322_a(var28, var4 + 1.0D, var6 - var36, (double)var17, (double)var18);
   }

   public void func_110450_a(C_100451_alf var1, int var2, double var3, double var5, double var7, float var9) {
      C_100872_azb var10 = C_100872_azb.field_110346_a;
      int var11 = var1.func_106029_a(0, var2);
      if(this.field_110517_d >= 0) {
         var11 = this.field_110517_d;
      }

      int var12 = (var11 & 15) << 4;
      int var13 = var11 & 240;
      double var14 = (double)((float)var12 / 256.0F);
      double var16 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var18 = (double)((float)var13 / 256.0F);
      double var20 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var22 = 0.45D * (double)var9;
      double var24 = var3 + 0.5D - var22;
      double var26 = var3 + 0.5D + var22;
      double var28 = var7 + 0.5D - var22;
      double var30 = var7 + 0.5D + var22;
      var10.func_110322_a(var24, var5 + (double)var9, var28, var14, var18);
      var10.func_110322_a(var24, var5 + 0.0D, var28, var14, var20);
      var10.func_110322_a(var26, var5 + 0.0D, var30, var16, var20);
      var10.func_110322_a(var26, var5 + (double)var9, var30, var16, var18);
      var10.func_110322_a(var26, var5 + (double)var9, var30, var14, var18);
      var10.func_110322_a(var26, var5 + 0.0D, var30, var14, var20);
      var10.func_110322_a(var24, var5 + 0.0D, var28, var16, var20);
      var10.func_110322_a(var24, var5 + (double)var9, var28, var16, var18);
      var10.func_110322_a(var24, var5 + (double)var9, var30, var14, var18);
      var10.func_110322_a(var24, var5 + 0.0D, var30, var14, var20);
      var10.func_110322_a(var26, var5 + 0.0D, var28, var16, var20);
      var10.func_110322_a(var26, var5 + (double)var9, var28, var16, var18);
      var10.func_110322_a(var26, var5 + (double)var9, var28, var14, var18);
      var10.func_110322_a(var26, var5 + 0.0D, var28, var14, var20);
      var10.func_110322_a(var24, var5 + 0.0D, var30, var16, var20);
      var10.func_110322_a(var24, var5 + (double)var9, var30, var16, var18);
   }

   public void func_110455_a(C_100451_alf var1, int var2, double var3, double var5, double var7, double var9) {
      C_100872_azb var11 = C_100872_azb.field_110346_a;
      int var12 = var1.func_106029_a(0, var2);
      if(this.field_110517_d >= 0) {
         var12 = this.field_110517_d;
      }

      int var13 = (var12 & 15) << 4;
      int var14 = var12 & 240;
      double var15 = (double)((float)var13 / 256.0F);
      double var17 = (double)(((float)var13 + 15.99F) / 256.0F);
      double var19 = (double)((float)var14 / 256.0F);
      double var21 = ((double)var14 + 15.989999771118164D * var3) / 256.0D;
      double var23 = var5 + 0.5D - 0.44999998807907104D;
      double var25 = var5 + 0.5D + 0.44999998807907104D;
      double var27 = var9 + 0.5D - 0.44999998807907104D;
      double var29 = var9 + 0.5D + 0.44999998807907104D;
      var11.func_110322_a(var23, var7 + var3, var27, var15, var19);
      var11.func_110322_a(var23, var7 + 0.0D, var27, var15, var21);
      var11.func_110322_a(var25, var7 + 0.0D, var29, var17, var21);
      var11.func_110322_a(var25, var7 + var3, var29, var17, var19);
      var11.func_110322_a(var25, var7 + var3, var29, var15, var19);
      var11.func_110322_a(var25, var7 + 0.0D, var29, var15, var21);
      var11.func_110322_a(var23, var7 + 0.0D, var27, var17, var21);
      var11.func_110322_a(var23, var7 + var3, var27, var17, var19);
      var11.func_110322_a(var23, var7 + var3, var29, var15, var19);
      var11.func_110322_a(var23, var7 + 0.0D, var29, var15, var21);
      var11.func_110322_a(var25, var7 + 0.0D, var27, var17, var21);
      var11.func_110322_a(var25, var7 + var3, var27, var17, var19);
      var11.func_110322_a(var25, var7 + var3, var27, var15, var19);
      var11.func_110322_a(var25, var7 + 0.0D, var27, var15, var21);
      var11.func_110322_a(var23, var7 + 0.0D, var29, var17, var21);
      var11.func_110322_a(var23, var7 + var3, var29, var17, var19);
   }

   public boolean func_110467_o(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = var1.field_106165_cl;
      if(this.field_110517_d >= 0) {
         var6 = this.field_110517_d;
      }

      int var7 = (var6 & 15) << 4;
      int var8 = var6 & 240;
      float var9 = 0.015625F;
      double var10 = (double)((float)var7 / 256.0F);
      double var12 = (double)(((float)var7 + 15.99F) / 256.0F);
      double var14 = (double)((float)var8 / 256.0F);
      double var16 = (double)(((float)var8 + 15.99F) / 256.0F);
      long var18 = (long)(var2 * 3129871) ^ (long)var4 * 116129781L ^ (long)var3;
      var18 = var18 * var18 * 42317861L + var18 * 11L;
      int var20 = (int)(var18 >> 16 & 3L);
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      float var21 = (float)var2 + 0.5F;
      float var22 = (float)var4 + 0.5F;
      float var23 = (float)(var20 & 1) * 0.5F * (float)(1 - var20 / 2 % 2 * 2);
      float var24 = (float)(var20 + 1 & 1) * 0.5F * (float)(1 - (var20 + 1) / 2 % 2 * 2);
      var5.func_110326_d(var1.func_106039_o());
      var5.func_110322_a((double)(var21 + var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 + var24), var10, var14);
      var5.func_110322_a((double)(var21 + var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 + var24), var12, var14);
      var5.func_110322_a((double)(var21 - var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 - var24), var12, var16);
      var5.func_110322_a((double)(var21 - var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 - var24), var10, var16);
      var5.func_110326_d((var1.func_106039_o() & 16711422) >> 1);
      var5.func_110322_a((double)(var21 - var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 - var24), var10, var16);
      var5.func_110322_a((double)(var21 - var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 - var24), var12, var16);
      var5.func_110322_a((double)(var21 + var23 + var24), (double)((float)var3 + var9), (double)(var22 - var23 + var24), var12, var14);
      var5.func_110322_a((double)(var21 + var23 - var24), (double)((float)var3 + var9), (double)(var22 + var23 + var24), var10, var14);
      return true;
   }

   public void func_110440_a(C_100451_alf var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      C_100872_azb var12 = C_100872_azb.field_110346_a;
      int var13 = var1.func_106029_a(0, var2) + 16;
      if(this.field_110517_d >= 0) {
         var13 = this.field_110517_d;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      double var16 = (double)((float)var14 / 256.0F);
      double var18 = (double)(((float)var14 + 15.99F) / 256.0F);
      double var20 = (double)((float)var15 / 256.0F);
      double var22 = ((double)var15 + 15.989999771118164D * var4) / 256.0D;
      double var24 = var6 + 0.5D - 0.5D;
      double var26 = var6 + 0.5D + 0.5D;
      double var28 = var10 + 0.5D - 0.5D;
      double var30 = var10 + 0.5D + 0.5D;
      double var32 = var6 + 0.5D;
      double var34 = var10 + 0.5D;
      if((var3 + 1) / 2 % 2 == 1) {
         double var36 = var18;
         var18 = var16;
         var16 = var36;
      }

      if(var3 < 2) {
         var12.func_110322_a(var24, var8 + var4, var34, var16, var20);
         var12.func_110322_a(var24, var8 + 0.0D, var34, var16, var22);
         var12.func_110322_a(var26, var8 + 0.0D, var34, var18, var22);
         var12.func_110322_a(var26, var8 + var4, var34, var18, var20);
         var12.func_110322_a(var26, var8 + var4, var34, var18, var20);
         var12.func_110322_a(var26, var8 + 0.0D, var34, var18, var22);
         var12.func_110322_a(var24, var8 + 0.0D, var34, var16, var22);
         var12.func_110322_a(var24, var8 + var4, var34, var16, var20);
      } else {
         var12.func_110322_a(var32, var8 + var4, var30, var16, var20);
         var12.func_110322_a(var32, var8 + 0.0D, var30, var16, var22);
         var12.func_110322_a(var32, var8 + 0.0D, var28, var18, var22);
         var12.func_110322_a(var32, var8 + var4, var28, var18, var20);
         var12.func_110322_a(var32, var8 + var4, var28, var18, var20);
         var12.func_110322_a(var32, var8 + 0.0D, var28, var18, var22);
         var12.func_110322_a(var32, var8 + 0.0D, var30, var16, var22);
         var12.func_110322_a(var32, var8 + var4, var30, var16, var20);
      }

   }

   public void func_110443_a(C_100451_alf var1, int var2, double var3, double var5, double var7) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      int var10 = var1.func_106029_a(0, var2);
      if(this.field_110517_d >= 0) {
         var10 = this.field_110517_d;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + 0.5D - 0.25D;
      double var23 = var3 + 0.5D + 0.25D;
      double var25 = var7 + 0.5D - 0.5D;
      double var27 = var7 + 0.5D + 0.5D;
      var9.func_110322_a(var21, var5 + 1.0D, var25, var13, var17);
      var9.func_110322_a(var21, var5 + 0.0D, var25, var13, var19);
      var9.func_110322_a(var21, var5 + 0.0D, var27, var15, var19);
      var9.func_110322_a(var21, var5 + 1.0D, var27, var15, var17);
      var9.func_110322_a(var21, var5 + 1.0D, var27, var13, var17);
      var9.func_110322_a(var21, var5 + 0.0D, var27, var13, var19);
      var9.func_110322_a(var21, var5 + 0.0D, var25, var15, var19);
      var9.func_110322_a(var21, var5 + 1.0D, var25, var15, var17);
      var9.func_110322_a(var23, var5 + 1.0D, var27, var13, var17);
      var9.func_110322_a(var23, var5 + 0.0D, var27, var13, var19);
      var9.func_110322_a(var23, var5 + 0.0D, var25, var15, var19);
      var9.func_110322_a(var23, var5 + 1.0D, var25, var15, var17);
      var9.func_110322_a(var23, var5 + 1.0D, var25, var13, var17);
      var9.func_110322_a(var23, var5 + 0.0D, var25, var13, var19);
      var9.func_110322_a(var23, var5 + 0.0D, var27, var15, var19);
      var9.func_110322_a(var23, var5 + 1.0D, var27, var15, var17);
      var21 = var3 + 0.5D - 0.5D;
      var23 = var3 + 0.5D + 0.5D;
      var25 = var7 + 0.5D - 0.25D;
      var27 = var7 + 0.5D + 0.25D;
      var9.func_110322_a(var21, var5 + 1.0D, var25, var13, var17);
      var9.func_110322_a(var21, var5 + 0.0D, var25, var13, var19);
      var9.func_110322_a(var23, var5 + 0.0D, var25, var15, var19);
      var9.func_110322_a(var23, var5 + 1.0D, var25, var15, var17);
      var9.func_110322_a(var23, var5 + 1.0D, var25, var13, var17);
      var9.func_110322_a(var23, var5 + 0.0D, var25, var13, var19);
      var9.func_110322_a(var21, var5 + 0.0D, var25, var15, var19);
      var9.func_110322_a(var21, var5 + 1.0D, var25, var15, var17);
      var9.func_110322_a(var23, var5 + 1.0D, var27, var13, var17);
      var9.func_110322_a(var23, var5 + 0.0D, var27, var13, var19);
      var9.func_110322_a(var21, var5 + 0.0D, var27, var15, var19);
      var9.func_110322_a(var21, var5 + 1.0D, var27, var15, var17);
      var9.func_110322_a(var21, var5 + 1.0D, var27, var13, var17);
      var9.func_110322_a(var21, var5 + 0.0D, var27, var13, var19);
      var9.func_110322_a(var23, var5 + 0.0D, var27, var15, var19);
      var9.func_110322_a(var23, var5 + 1.0D, var27, var15, var17);
   }

   public boolean func_110452_p(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      int var6 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      boolean var10 = var1.func_105976_a(this.field_110522_a, var2, var3 + 1, var4, 1);
      boolean var11 = var1.func_105976_a(this.field_110522_a, var2, var3 - 1, var4, 0);
      boolean[] var12 = new boolean[]{var1.func_105976_a(this.field_110522_a, var2, var3, var4 - 1, 2), var1.func_105976_a(this.field_110522_a, var2, var3, var4 + 1, 3), var1.func_105976_a(this.field_110522_a, var2 - 1, var3, var4, 4), var1.func_105976_a(this.field_110522_a, var2 + 1, var3, var4, 5)};
      if(!var10 && !var11 && !var12[0] && !var12[1] && !var12[2] && !var12[3]) {
         return false;
      } else {
         boolean var13 = false;
         float var14 = 0.5F;
         float var15 = 1.0F;
         float var16 = 0.8F;
         float var17 = 0.6F;
         double var18 = 0.0D;
         double var20 = 1.0D;
         C_100664_afg var22 = var1.field_106204_cB;
         int var23 = this.field_110522_a.func_109357_g(var2, var3, var4);
         double var24 = (double)this.func_110459_a(var2, var3, var4, var22);
         double var26 = (double)this.func_110459_a(var2, var3, var4 + 1, var22);
         double var28 = (double)this.func_110459_a(var2 + 1, var3, var4 + 1, var22);
         double var30 = (double)this.func_110459_a(var2 + 1, var3, var4, var22);
         double var32 = 0.0010000000474974513D;
         int var34;
         int var37;
         if(this.field_110514_f || var10) {
            var13 = true;
            var34 = var1.func_106029_a(1, var23);
            float var35 = (float)C_100142_ajm.func_106273_a(this.field_110522_a, var2, var3, var4, var22);
            if(var35 > -999.0F) {
               var34 = var1.func_106029_a(2, var23);
            }

            var24 -= var32;
            var26 -= var32;
            var28 -= var32;
            var30 -= var32;
            int var36 = (var34 & 15) << 4;
            var37 = var34 & 240;
            double var38 = ((double)var36 + 8.0D) / 256.0D;
            double var40 = ((double)var37 + 8.0D) / 256.0D;
            if(var35 < -999.0F) {
               var35 = 0.0F;
            } else {
               var38 = (double)((float)(var36 + 16) / 256.0F);
               var40 = (double)((float)(var37 + 16) / 256.0F);
            }

            double var42 = (double)(C_100650_jv.func_108924_a(var35) * 8.0F) / 256.0D;
            double var44 = (double)(C_100650_jv.func_108928_b(var35) * 8.0F) / 256.0D;
            var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
            float var46 = 1.0F;
            var5.func_110334_a(var15 * var46 * var7, var15 * var46 * var8, var15 * var46 * var9);
            var5.func_110322_a((double)(var2 + 0), (double)var3 + var24, (double)(var4 + 0), var38 - var44 - var42, var40 - var44 + var42);
            var5.func_110322_a((double)(var2 + 0), (double)var3 + var26, (double)(var4 + 1), var38 - var44 + var42, var40 + var44 + var42);
            var5.func_110322_a((double)(var2 + 1), (double)var3 + var28, (double)(var4 + 1), var38 + var44 + var42, var40 + var44 - var42);
            var5.func_110322_a((double)(var2 + 1), (double)var3 + var30, (double)(var4 + 0), var38 + var44 - var42, var40 - var44 - var42);
         }

         if(this.field_110514_f || var11) {
            var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4));
            float var65 = 1.0F;
            var5.func_110334_a(var14 * var65, var14 * var65, var14 * var65);
            this.func_110437_a(var1, (double)var2, (double)var3 + var32, (double)var4, var1.func_106024_a(0));
            var13 = true;
         }

         for(var34 = 0; var34 < 4; ++var34) {
            int var64 = var2;
            var37 = var4;
            if(var34 == 0) {
               var37 = var4 - 1;
            }

            if(var34 == 1) {
               ++var37;
            }

            if(var34 == 2) {
               var64 = var2 - 1;
            }

            if(var34 == 3) {
               ++var64;
            }

            int var66 = var1.func_106029_a(var34 + 2, var23);
            int var39 = (var66 & 15) << 4;
            int var67 = var66 & 240;
            if(this.field_110514_f || var12[var34]) {
               double var43;
               double var41;
               double var47;
               double var45;
               double var51;
               double var49;
               if(var34 == 0) {
                  var41 = var24;
                  var43 = var30;
                  var45 = (double)var2;
                  var49 = (double)(var2 + 1);
                  var47 = (double)var4 + var32;
                  var51 = (double)var4 + var32;
               } else if(var34 == 1) {
                  var41 = var28;
                  var43 = var26;
                  var45 = (double)(var2 + 1);
                  var49 = (double)var2;
                  var47 = (double)(var4 + 1) - var32;
                  var51 = (double)(var4 + 1) - var32;
               } else if(var34 == 2) {
                  var41 = var26;
                  var43 = var24;
                  var45 = (double)var2 + var32;
                  var49 = (double)var2 + var32;
                  var47 = (double)(var4 + 1);
                  var51 = (double)var4;
               } else {
                  var41 = var30;
                  var43 = var28;
                  var45 = (double)(var2 + 1) - var32;
                  var49 = (double)(var2 + 1) - var32;
                  var47 = (double)var4;
                  var51 = (double)(var4 + 1);
               }

               var13 = true;
               double var53 = (double)((float)(var39 + 0) / 256.0F);
               double var55 = ((double)(var39 + 16) - 0.01D) / 256.0D;
               double var57 = ((double)var67 + (1.0D - var41) * 16.0D) / 256.0D;
               double var59 = ((double)var67 + (1.0D - var43) * 16.0D) / 256.0D;
               double var61 = ((double)(var67 + 16) - 0.01D) / 256.0D;
               var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var64, var3, var37));
               float var63 = 1.0F;
               if(var34 < 2) {
                  var63 *= var16;
               } else {
                  var63 *= var17;
               }

               var5.func_110334_a(var15 * var63 * var7, var15 * var63 * var8, var15 * var63 * var9);
               var5.func_110322_a(var45, (double)var3 + var41, var47, var53, var57);
               var5.func_110322_a(var49, (double)var3 + var43, var51, var55, var59);
               var5.func_110322_a(var49, (double)(var3 + 0), var51, var55, var61);
               var5.func_110322_a(var45, (double)(var3 + 0), var47, var53, var61);
            }
         }

         this.field_110538_i = var18;
         this.field_110532_j = var20;
         return var13;
      }
   }

   private float func_110459_a(int var1, int var2, int var3, C_100664_afg var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var1 - (var7 & 1);
         int var10 = var3 - (var7 >> 1 & 1);
         if(this.field_110522_a.func_109350_f(var8, var2 + 1, var10) == var4) {
            return 1.0F;
         }

         C_100664_afg var11 = this.field_110522_a.func_109350_f(var8, var2, var10);
         if(var11 == var4) {
            int var12 = this.field_110522_a.func_109357_g(var8, var2, var10);
            if(var12 >= 8 || var12 == 0) {
               var6 += C_100142_ajm.func_106269_d(var12) * 10.0F;
               var5 += 10;
            }

            var6 += C_100142_ajm.func_106269_d(var12);
            ++var5;
         } else if(!var11.func_108983_a()) {
            ++var6;
            ++var5;
         }
      }

      return 1.0F - var6 / (float)var5;
   }

   public void func_110461_a(C_100451_alf var1, C_100873_xe var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.5F;
      float var8 = 1.0F;
      float var9 = 0.8F;
      float var10 = 0.6F;
      C_100872_azb var11 = C_100872_azb.field_110346_a;
      var11.func_110330_b();
      var11.func_110328_c(var1.func_106050_e(var2, var3, var4, var5));
      float var12 = 1.0F;
      float var13 = 1.0F;
      if(var13 < var12) {
         var13 = var12;
      }

      var11.func_110334_a(var7 * var13, var7 * var13, var7 * var13);
      this.func_110437_a(var1, -0.5D, -0.5D, -0.5D, var1.func_106029_a(0, var6));
      var13 = 1.0F;
      if(var13 < var12) {
         var13 = var12;
      }

      var11.func_110334_a(var8 * var13, var8 * var13, var8 * var13);
      this.func_110425_b(var1, -0.5D, -0.5D, -0.5D, var1.func_106029_a(1, var6));
      var13 = 1.0F;
      if(var13 < var12) {
         var13 = var12;
      }

      var11.func_110334_a(var9 * var13, var9 * var13, var9 * var13);
      this.func_110464_c(var1, -0.5D, -0.5D, -0.5D, var1.func_106029_a(2, var6));
      var13 = 1.0F;
      if(var13 < var12) {
         var13 = var12;
      }

      var11.func_110334_a(var9 * var13, var9 * var13, var9 * var13);
      this.func_110404_d(var1, -0.5D, -0.5D, -0.5D, var1.func_106029_a(3, var6));
      var13 = 1.0F;
      if(var13 < var12) {
         var13 = var12;
      }

      var11.func_110334_a(var10 * var13, var10 * var13, var10 * var13);
      this.func_110462_e(var1, -0.5D, -0.5D, -0.5D, var1.func_106029_a(4, var6));
      var13 = 1.0F;
      if(var13 < var12) {
         var13 = var12;
      }

      var11.func_110334_a(var10 * var13, var10 * var13, var10 * var13);
      this.func_110454_f(var1, -0.5D, -0.5D, -0.5D, var1.func_106029_a(5, var6));
      var11.func_110329_a();
   }

   public boolean func_110426_q(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return Minecraft.func_105055_u() && C_100451_alf.field_106114_t[var1.field_106162_cm] == 0?this.func_110420_a(var1, var2, var3, var4, var6, var7, var8):this.func_110457_c(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean func_110427_r(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var6 = var5 & 12;
      if(var6 == 4) {
         this.field_110524_n = 1;
         this.field_110526_o = 1;
         this.field_110550_r = 1;
         this.field_110548_s = 1;
      } else if(var6 == 8) {
         this.field_110554_p = 1;
         this.field_110552_q = 1;
      }

      boolean var7 = this.func_110426_q(var1, var2, var3, var4);
      this.field_110554_p = 0;
      this.field_110524_n = 0;
      this.field_110526_o = 0;
      this.field_110552_q = 0;
      this.field_110550_r = 0;
      this.field_110548_s = 0;
      return var7;
   }

   public boolean func_110420_a(C_100451_alf var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.field_110546_t = true;
      boolean var8 = false;
      float var9 = this.field_110544_u;
      float var10 = this.field_110544_u;
      float var11 = this.field_110544_u;
      float var12 = this.field_110544_u;
      boolean var13 = true;
      boolean var14 = true;
      boolean var15 = true;
      boolean var16 = true;
      boolean var17 = true;
      boolean var18 = true;
      this.field_110544_u = var1.func_105991_j(this.field_110522_a, var2, var3, var4);
      this.field_110542_v = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4);
      this.field_110540_w = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4);
      this.field_110565_x = var1.func_105991_j(this.field_110522_a, var2, var3, var4 - 1);
      this.field_110563_y = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4);
      this.field_110561_z = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4);
      this.field_110474_A = var1.func_105991_j(this.field_110522_a, var2, var3, var4 + 1);
      int var19 = var1.func_106050_e(this.field_110522_a, var2, var3, var4);
      int var20 = var19;
      int var21 = var19;
      int var22 = var19;
      int var23 = var19;
      int var24 = var19;
      int var25 = var19;
      if(this.field_110538_i <= 0.0D) {
         var21 = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4);
      }

      if(this.field_110532_j >= 1.0D) {
         var24 = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4);
      }

      if(this.field_110515_g <= 0.0D) {
         var20 = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4);
      }

      if(this.field_110536_h >= 1.0D) {
         var23 = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4);
      }

      if(this.field_110534_k <= 0.0D) {
         var22 = var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1);
      }

      if(this.field_110528_l >= 1.0D) {
         var25 = var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1);
      }

      C_100872_azb var26 = C_100872_azb.field_110346_a;
      var26.func_110328_c(983055);
      this.field_110496_aL = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 + 1, var3 + 1, var4)];
      this.field_110481_aT = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 + 1, var3 - 1, var4)];
      this.field_110503_aP = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 + 1, var3, var4 + 1)];
      this.field_110477_aR = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 + 1, var3, var4 - 1)];
      this.field_110497_aM = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 - 1, var3 + 1, var4)];
      this.field_110487_aU = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 - 1, var3 - 1, var4)];
      this.field_110501_aO = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 - 1, var3, var4 - 1)];
      this.field_110479_aQ = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2 - 1, var3, var4 + 1)];
      this.field_110499_aN = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2, var3 + 1, var4 + 1)];
      this.field_110495_aK = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2, var3 + 1, var4 - 1)];
      this.field_110485_aV = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2, var3 - 1, var4 + 1)];
      this.field_110483_aS = C_100451_alf.field_106115_s[this.field_110522_a.func_109349_a(var2, var3 - 1, var4 - 1)];
      if(var1.field_106165_cl == 3) {
         var18 = false;
         var17 = false;
         var16 = false;
         var15 = false;
         var13 = false;
      }

      if(this.field_110517_d >= 0) {
         var18 = false;
         var17 = false;
         var16 = false;
         var15 = false;
         var13 = false;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3 - 1, var4, 0)) {
         if(this.field_110523_at > 0) {
            if(this.field_110538_i <= 0.0D) {
               --var3;
            }

            this.field_110557_aa = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110555_ac = var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110556_ad = var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110564_af = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4);
            this.field_110476_C = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110471_E = var1.func_105991_j(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110472_F = var1.func_105991_j(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110486_H = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4);
            if(!this.field_110483_aS && !this.field_110487_aU) {
               this.field_110475_B = this.field_110476_C;
               this.field_110513_Z = this.field_110557_aa;
            } else {
               this.field_110475_B = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4 - 1);
               this.field_110513_Z = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4 - 1);
            }

            if(!this.field_110485_aV && !this.field_110487_aU) {
               this.field_110470_D = this.field_110476_C;
               this.field_110558_ab = this.field_110557_aa;
            } else {
               this.field_110470_D = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4 + 1);
               this.field_110558_ab = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4 + 1);
            }

            if(!this.field_110483_aS && !this.field_110481_aT) {
               this.field_110473_G = this.field_110486_H;
               this.field_110562_ae = this.field_110564_af;
            } else {
               this.field_110473_G = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4 - 1);
               this.field_110562_ae = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4 - 1);
            }

            if(!this.field_110485_aV && !this.field_110481_aT) {
               this.field_110488_I = this.field_110486_H;
               this.field_110559_ag = this.field_110564_af;
            } else {
               this.field_110488_I = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4 + 1);
               this.field_110559_ag = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4 + 1);
            }

            if(this.field_110538_i <= 0.0D) {
               ++var3;
            }

            var9 = (this.field_110470_D + this.field_110476_C + this.field_110472_F + this.field_110540_w) / 4.0F;
            var12 = (this.field_110472_F + this.field_110540_w + this.field_110488_I + this.field_110486_H) / 4.0F;
            var11 = (this.field_110540_w + this.field_110471_E + this.field_110486_H + this.field_110473_G) / 4.0F;
            var10 = (this.field_110476_C + this.field_110475_B + this.field_110540_w + this.field_110471_E) / 4.0F;
            this.field_110537_au = this.func_110439_a(this.field_110558_ab, this.field_110557_aa, this.field_110556_ad, var21);
            this.field_110531_ax = this.func_110439_a(this.field_110556_ad, this.field_110559_ag, this.field_110564_af, var21);
            this.field_110533_aw = this.func_110439_a(this.field_110555_ac, this.field_110564_af, this.field_110562_ae, var21);
            this.field_110535_av = this.func_110439_a(this.field_110557_aa, this.field_110513_Z, this.field_110555_ac, var21);
         } else {
            var12 = this.field_110540_w;
            var11 = this.field_110540_w;
            var10 = this.field_110540_w;
            var9 = this.field_110540_w;
            this.field_110537_au = this.field_110535_av = this.field_110533_aw = this.field_110531_ax = this.field_110557_aa;
         }

         this.field_110518_ay = this.field_110516_az = this.field_110505_aA = this.field_110506_aB = (var13?var5:1.0F) * 0.5F;
         this.field_110507_aC = this.field_110508_aD = this.field_110509_aE = this.field_110510_aF = (var13?var6:1.0F) * 0.5F;
         this.field_110511_aG = this.field_110512_aH = this.field_110491_aI = this.field_110493_aJ = (var13?var7:1.0F) * 0.5F;
         this.field_110518_ay *= var9;
         this.field_110507_aC *= var9;
         this.field_110511_aG *= var9;
         this.field_110516_az *= var10;
         this.field_110508_aD *= var10;
         this.field_110512_aH *= var10;
         this.field_110505_aA *= var11;
         this.field_110509_aE *= var11;
         this.field_110491_aI *= var11;
         this.field_110506_aB *= var12;
         this.field_110510_aF *= var12;
         this.field_110493_aJ *= var12;
         this.func_110437_a(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 0));
         var8 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3 + 1, var4, 1)) {
         if(this.field_110523_at > 0) {
            if(this.field_110532_j >= 1.0D) {
               ++var3;
            }

            this.field_110543_ai = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110551_am = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4);
            this.field_110539_ak = var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110553_an = var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110490_K = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110484_O = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4);
            this.field_110480_M = var1.func_105991_j(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110500_P = var1.func_105991_j(this.field_110522_a, var2, var3, var4 + 1);
            if(!this.field_110495_aK && !this.field_110497_aM) {
               this.field_110489_J = this.field_110490_K;
               this.field_110560_ah = this.field_110543_ai;
            } else {
               this.field_110489_J = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4 - 1);
               this.field_110560_ah = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4 - 1);
            }

            if(!this.field_110495_aK && !this.field_110496_aL) {
               this.field_110482_N = this.field_110484_O;
               this.field_110541_al = this.field_110551_am;
            } else {
               this.field_110482_N = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4 - 1);
               this.field_110541_al = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4 - 1);
            }

            if(!this.field_110499_aN && !this.field_110497_aM) {
               this.field_110478_L = this.field_110490_K;
               this.field_110545_aj = this.field_110543_ai;
            } else {
               this.field_110478_L = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4 + 1);
               this.field_110545_aj = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4 + 1);
            }

            if(!this.field_110499_aN && !this.field_110496_aL) {
               this.field_110498_Q = this.field_110484_O;
               this.field_110547_ao = this.field_110551_am;
            } else {
               this.field_110498_Q = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4 + 1);
               this.field_110547_ao = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4 + 1);
            }

            if(this.field_110532_j >= 1.0D) {
               --var3;
            }

            var12 = (this.field_110478_L + this.field_110490_K + this.field_110500_P + this.field_110561_z) / 4.0F;
            var9 = (this.field_110500_P + this.field_110561_z + this.field_110498_Q + this.field_110484_O) / 4.0F;
            var10 = (this.field_110561_z + this.field_110480_M + this.field_110484_O + this.field_110482_N) / 4.0F;
            var11 = (this.field_110490_K + this.field_110489_J + this.field_110561_z + this.field_110480_M) / 4.0F;
            this.field_110531_ax = this.func_110439_a(this.field_110545_aj, this.field_110543_ai, this.field_110553_an, var24);
            this.field_110537_au = this.func_110439_a(this.field_110553_an, this.field_110547_ao, this.field_110551_am, var24);
            this.field_110535_av = this.func_110439_a(this.field_110539_ak, this.field_110551_am, this.field_110541_al, var24);
            this.field_110533_aw = this.func_110439_a(this.field_110543_ai, this.field_110560_ah, this.field_110539_ak, var24);
         } else {
            var12 = this.field_110561_z;
            var11 = this.field_110561_z;
            var10 = this.field_110561_z;
            var9 = this.field_110561_z;
            this.field_110537_au = this.field_110535_av = this.field_110533_aw = this.field_110531_ax = var24;
         }

         this.field_110518_ay = this.field_110516_az = this.field_110505_aA = this.field_110506_aB = var14?var5:1.0F;
         this.field_110507_aC = this.field_110508_aD = this.field_110509_aE = this.field_110510_aF = var14?var6:1.0F;
         this.field_110511_aG = this.field_110512_aH = this.field_110491_aI = this.field_110493_aJ = var14?var7:1.0F;
         this.field_110518_ay *= var9;
         this.field_110507_aC *= var9;
         this.field_110511_aG *= var9;
         this.field_110516_az *= var10;
         this.field_110508_aD *= var10;
         this.field_110512_aH *= var10;
         this.field_110505_aA *= var11;
         this.field_110509_aE *= var11;
         this.field_110491_aI *= var11;
         this.field_110506_aB *= var12;
         this.field_110510_aF *= var12;
         this.field_110493_aJ *= var12;
         this.func_110425_b(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 1));
         var8 = true;
      }

      int var27;
      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 - 1, 2)) {
         if(this.field_110523_at > 0) {
            if(this.field_110534_k <= 0.0D) {
               --var4;
            }

            this.field_110504_R = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110471_E = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110480_M = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4);
            this.field_110502_S = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4);
            this.field_110549_ap = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110555_ac = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110539_ak = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4);
            this.field_110529_aq = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4);
            if(!this.field_110501_aO && !this.field_110483_aS) {
               this.field_110475_B = this.field_110504_R;
               this.field_110513_Z = this.field_110549_ap;
            } else {
               this.field_110475_B = var1.func_105991_j(this.field_110522_a, var2 - 1, var3 - 1, var4);
               this.field_110513_Z = var1.func_106050_e(this.field_110522_a, var2 - 1, var3 - 1, var4);
            }

            if(!this.field_110501_aO && !this.field_110495_aK) {
               this.field_110489_J = this.field_110504_R;
               this.field_110560_ah = this.field_110549_ap;
            } else {
               this.field_110489_J = var1.func_105991_j(this.field_110522_a, var2 - 1, var3 + 1, var4);
               this.field_110560_ah = var1.func_106050_e(this.field_110522_a, var2 - 1, var3 + 1, var4);
            }

            if(!this.field_110477_aR && !this.field_110483_aS) {
               this.field_110473_G = this.field_110502_S;
               this.field_110562_ae = this.field_110529_aq;
            } else {
               this.field_110473_G = var1.func_105991_j(this.field_110522_a, var2 + 1, var3 - 1, var4);
               this.field_110562_ae = var1.func_106050_e(this.field_110522_a, var2 + 1, var3 - 1, var4);
            }

            if(!this.field_110477_aR && !this.field_110495_aK) {
               this.field_110482_N = this.field_110502_S;
               this.field_110541_al = this.field_110529_aq;
            } else {
               this.field_110482_N = var1.func_105991_j(this.field_110522_a, var2 + 1, var3 + 1, var4);
               this.field_110541_al = var1.func_106050_e(this.field_110522_a, var2 + 1, var3 + 1, var4);
            }

            if(this.field_110534_k <= 0.0D) {
               ++var4;
            }

            var9 = (this.field_110504_R + this.field_110489_J + this.field_110565_x + this.field_110480_M) / 4.0F;
            var10 = (this.field_110565_x + this.field_110480_M + this.field_110502_S + this.field_110482_N) / 4.0F;
            var11 = (this.field_110471_E + this.field_110565_x + this.field_110473_G + this.field_110502_S) / 4.0F;
            var12 = (this.field_110475_B + this.field_110504_R + this.field_110471_E + this.field_110565_x) / 4.0F;
            this.field_110537_au = this.func_110439_a(this.field_110549_ap, this.field_110560_ah, this.field_110539_ak, var22);
            this.field_110535_av = this.func_110439_a(this.field_110539_ak, this.field_110529_aq, this.field_110541_al, var22);
            this.field_110533_aw = this.func_110439_a(this.field_110555_ac, this.field_110562_ae, this.field_110529_aq, var22);
            this.field_110531_ax = this.func_110439_a(this.field_110513_Z, this.field_110549_ap, this.field_110555_ac, var22);
         } else {
            var12 = this.field_110565_x;
            var11 = this.field_110565_x;
            var10 = this.field_110565_x;
            var9 = this.field_110565_x;
            this.field_110537_au = this.field_110535_av = this.field_110533_aw = this.field_110531_ax = var22;
         }

         this.field_110518_ay = this.field_110516_az = this.field_110505_aA = this.field_110506_aB = (var15?var5:1.0F) * 0.8F;
         this.field_110507_aC = this.field_110508_aD = this.field_110509_aE = this.field_110510_aF = (var15?var6:1.0F) * 0.8F;
         this.field_110511_aG = this.field_110512_aH = this.field_110491_aI = this.field_110493_aJ = (var15?var7:1.0F) * 0.8F;
         this.field_110518_ay *= var9;
         this.field_110507_aC *= var9;
         this.field_110511_aG *= var9;
         this.field_110516_az *= var10;
         this.field_110508_aD *= var10;
         this.field_110512_aH *= var10;
         this.field_110505_aA *= var11;
         this.field_110509_aE *= var11;
         this.field_110491_aI *= var11;
         this.field_110506_aB *= var12;
         this.field_110510_aF *= var12;
         this.field_110493_aJ *= var12;
         var27 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 2);
         this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, var27);
         if(field_110520_b && var27 == 3 && this.field_110517_d < 0) {
            this.field_110518_ay *= var5;
            this.field_110516_az *= var5;
            this.field_110505_aA *= var5;
            this.field_110506_aB *= var5;
            this.field_110507_aC *= var6;
            this.field_110508_aD *= var6;
            this.field_110509_aE *= var6;
            this.field_110510_aF *= var6;
            this.field_110511_aG *= var7;
            this.field_110512_aH *= var7;
            this.field_110491_aI *= var7;
            this.field_110493_aJ *= var7;
            this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 + 1, 3)) {
         if(this.field_110523_at > 0) {
            if(this.field_110528_l >= 1.0D) {
               ++var4;
            }

            this.field_110494_T = var1.func_105991_j(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110492_U = var1.func_105991_j(this.field_110522_a, var2 + 1, var3, var4);
            this.field_110472_F = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110500_P = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4);
            this.field_110527_ar = var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4);
            this.field_110525_as = var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4);
            this.field_110556_ad = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110553_an = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4);
            if(!this.field_110479_aQ && !this.field_110485_aV) {
               this.field_110470_D = this.field_110494_T;
               this.field_110558_ab = this.field_110527_ar;
            } else {
               this.field_110470_D = var1.func_105991_j(this.field_110522_a, var2 - 1, var3 - 1, var4);
               this.field_110558_ab = var1.func_106050_e(this.field_110522_a, var2 - 1, var3 - 1, var4);
            }

            if(!this.field_110479_aQ && !this.field_110499_aN) {
               this.field_110478_L = this.field_110494_T;
               this.field_110545_aj = this.field_110527_ar;
            } else {
               this.field_110478_L = var1.func_105991_j(this.field_110522_a, var2 - 1, var3 + 1, var4);
               this.field_110545_aj = var1.func_106050_e(this.field_110522_a, var2 - 1, var3 + 1, var4);
            }

            if(!this.field_110503_aP && !this.field_110485_aV) {
               this.field_110488_I = this.field_110492_U;
               this.field_110559_ag = this.field_110525_as;
            } else {
               this.field_110488_I = var1.func_105991_j(this.field_110522_a, var2 + 1, var3 - 1, var4);
               this.field_110559_ag = var1.func_106050_e(this.field_110522_a, var2 + 1, var3 - 1, var4);
            }

            if(!this.field_110503_aP && !this.field_110499_aN) {
               this.field_110498_Q = this.field_110492_U;
               this.field_110547_ao = this.field_110525_as;
            } else {
               this.field_110498_Q = var1.func_105991_j(this.field_110522_a, var2 + 1, var3 + 1, var4);
               this.field_110547_ao = var1.func_106050_e(this.field_110522_a, var2 + 1, var3 + 1, var4);
            }

            if(this.field_110528_l >= 1.0D) {
               --var4;
            }

            var9 = (this.field_110494_T + this.field_110478_L + this.field_110474_A + this.field_110500_P) / 4.0F;
            var12 = (this.field_110474_A + this.field_110500_P + this.field_110492_U + this.field_110498_Q) / 4.0F;
            var11 = (this.field_110472_F + this.field_110474_A + this.field_110488_I + this.field_110492_U) / 4.0F;
            var10 = (this.field_110470_D + this.field_110494_T + this.field_110472_F + this.field_110474_A) / 4.0F;
            this.field_110537_au = this.func_110439_a(this.field_110527_ar, this.field_110545_aj, this.field_110553_an, var25);
            this.field_110531_ax = this.func_110439_a(this.field_110553_an, this.field_110525_as, this.field_110547_ao, var25);
            this.field_110533_aw = this.func_110439_a(this.field_110556_ad, this.field_110559_ag, this.field_110525_as, var25);
            this.field_110535_av = this.func_110439_a(this.field_110558_ab, this.field_110527_ar, this.field_110556_ad, var25);
         } else {
            var12 = this.field_110474_A;
            var11 = this.field_110474_A;
            var10 = this.field_110474_A;
            var9 = this.field_110474_A;
            this.field_110537_au = this.field_110535_av = this.field_110533_aw = this.field_110531_ax = var25;
         }

         this.field_110518_ay = this.field_110516_az = this.field_110505_aA = this.field_110506_aB = (var16?var5:1.0F) * 0.8F;
         this.field_110507_aC = this.field_110508_aD = this.field_110509_aE = this.field_110510_aF = (var16?var6:1.0F) * 0.8F;
         this.field_110511_aG = this.field_110512_aH = this.field_110491_aI = this.field_110493_aJ = (var16?var7:1.0F) * 0.8F;
         this.field_110518_ay *= var9;
         this.field_110507_aC *= var9;
         this.field_110511_aG *= var9;
         this.field_110516_az *= var10;
         this.field_110508_aD *= var10;
         this.field_110512_aH *= var10;
         this.field_110505_aA *= var11;
         this.field_110509_aE *= var11;
         this.field_110491_aI *= var11;
         this.field_110506_aB *= var12;
         this.field_110510_aF *= var12;
         this.field_110493_aJ *= var12;
         var27 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 3);
         this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 3));
         if(field_110520_b && var27 == 3 && this.field_110517_d < 0) {
            this.field_110518_ay *= var5;
            this.field_110516_az *= var5;
            this.field_110505_aA *= var5;
            this.field_110506_aB *= var5;
            this.field_110507_aC *= var6;
            this.field_110508_aD *= var6;
            this.field_110509_aE *= var6;
            this.field_110510_aF *= var6;
            this.field_110511_aG *= var7;
            this.field_110512_aH *= var7;
            this.field_110491_aI *= var7;
            this.field_110493_aJ *= var7;
            this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 - 1, var3, var4, 4)) {
         if(this.field_110523_at > 0) {
            if(this.field_110515_g <= 0.0D) {
               --var2;
            }

            this.field_110476_C = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110504_R = var1.func_105991_j(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110494_T = var1.func_105991_j(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110490_K = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4);
            this.field_110557_aa = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110549_ap = var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110527_ar = var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110543_ai = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4);
            if(!this.field_110501_aO && !this.field_110487_aU) {
               this.field_110475_B = this.field_110504_R;
               this.field_110513_Z = this.field_110549_ap;
            } else {
               this.field_110475_B = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4 - 1);
               this.field_110513_Z = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4 - 1);
            }

            if(!this.field_110479_aQ && !this.field_110487_aU) {
               this.field_110470_D = this.field_110494_T;
               this.field_110558_ab = this.field_110527_ar;
            } else {
               this.field_110470_D = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4 + 1);
               this.field_110558_ab = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4 + 1);
            }

            if(!this.field_110501_aO && !this.field_110497_aM) {
               this.field_110489_J = this.field_110504_R;
               this.field_110560_ah = this.field_110549_ap;
            } else {
               this.field_110489_J = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4 - 1);
               this.field_110560_ah = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4 - 1);
            }

            if(!this.field_110479_aQ && !this.field_110497_aM) {
               this.field_110478_L = this.field_110494_T;
               this.field_110545_aj = this.field_110527_ar;
            } else {
               this.field_110478_L = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4 + 1);
               this.field_110545_aj = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4 + 1);
            }

            if(this.field_110515_g <= 0.0D) {
               ++var2;
            }

            var12 = (this.field_110476_C + this.field_110470_D + this.field_110542_v + this.field_110494_T) / 4.0F;
            var9 = (this.field_110542_v + this.field_110494_T + this.field_110490_K + this.field_110478_L) / 4.0F;
            var10 = (this.field_110504_R + this.field_110542_v + this.field_110489_J + this.field_110490_K) / 4.0F;
            var11 = (this.field_110475_B + this.field_110476_C + this.field_110504_R + this.field_110542_v) / 4.0F;
            this.field_110531_ax = this.func_110439_a(this.field_110557_aa, this.field_110558_ab, this.field_110527_ar, var20);
            this.field_110537_au = this.func_110439_a(this.field_110527_ar, this.field_110543_ai, this.field_110545_aj, var20);
            this.field_110535_av = this.func_110439_a(this.field_110549_ap, this.field_110560_ah, this.field_110543_ai, var20);
            this.field_110533_aw = this.func_110439_a(this.field_110513_Z, this.field_110557_aa, this.field_110549_ap, var20);
         } else {
            var12 = this.field_110542_v;
            var11 = this.field_110542_v;
            var10 = this.field_110542_v;
            var9 = this.field_110542_v;
            this.field_110537_au = this.field_110535_av = this.field_110533_aw = this.field_110531_ax = var20;
         }

         this.field_110518_ay = this.field_110516_az = this.field_110505_aA = this.field_110506_aB = (var17?var5:1.0F) * 0.6F;
         this.field_110507_aC = this.field_110508_aD = this.field_110509_aE = this.field_110510_aF = (var17?var6:1.0F) * 0.6F;
         this.field_110511_aG = this.field_110512_aH = this.field_110491_aI = this.field_110493_aJ = (var17?var7:1.0F) * 0.6F;
         this.field_110518_ay *= var9;
         this.field_110507_aC *= var9;
         this.field_110511_aG *= var9;
         this.field_110516_az *= var10;
         this.field_110508_aD *= var10;
         this.field_110512_aH *= var10;
         this.field_110505_aA *= var11;
         this.field_110509_aE *= var11;
         this.field_110491_aI *= var11;
         this.field_110506_aB *= var12;
         this.field_110510_aF *= var12;
         this.field_110493_aJ *= var12;
         var27 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 4);
         this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, var27);
         if(field_110520_b && var27 == 3 && this.field_110517_d < 0) {
            this.field_110518_ay *= var5;
            this.field_110516_az *= var5;
            this.field_110505_aA *= var5;
            this.field_110506_aB *= var5;
            this.field_110507_aC *= var6;
            this.field_110508_aD *= var6;
            this.field_110509_aE *= var6;
            this.field_110510_aF *= var6;
            this.field_110511_aG *= var7;
            this.field_110512_aH *= var7;
            this.field_110491_aI *= var7;
            this.field_110493_aJ *= var7;
            this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 + 1, var3, var4, 5)) {
         if(this.field_110523_at > 0) {
            if(this.field_110536_h >= 1.0D) {
               ++var2;
            }

            this.field_110486_H = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110502_S = var1.func_105991_j(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110492_U = var1.func_105991_j(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110484_O = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4);
            this.field_110564_af = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4);
            this.field_110529_aq = var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1);
            this.field_110525_as = var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1);
            this.field_110551_am = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4);
            if(!this.field_110481_aT && !this.field_110477_aR) {
               this.field_110473_G = this.field_110502_S;
               this.field_110562_ae = this.field_110529_aq;
            } else {
               this.field_110473_G = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4 - 1);
               this.field_110562_ae = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4 - 1);
            }

            if(!this.field_110481_aT && !this.field_110503_aP) {
               this.field_110488_I = this.field_110492_U;
               this.field_110559_ag = this.field_110525_as;
            } else {
               this.field_110488_I = var1.func_105991_j(this.field_110522_a, var2, var3 - 1, var4 + 1);
               this.field_110559_ag = var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4 + 1);
            }

            if(!this.field_110496_aL && !this.field_110477_aR) {
               this.field_110482_N = this.field_110502_S;
               this.field_110541_al = this.field_110529_aq;
            } else {
               this.field_110482_N = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4 - 1);
               this.field_110541_al = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4 - 1);
            }

            if(!this.field_110496_aL && !this.field_110503_aP) {
               this.field_110498_Q = this.field_110492_U;
               this.field_110547_ao = this.field_110525_as;
            } else {
               this.field_110498_Q = var1.func_105991_j(this.field_110522_a, var2, var3 + 1, var4 + 1);
               this.field_110547_ao = var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4 + 1);
            }

            if(this.field_110536_h >= 1.0D) {
               --var2;
            }

            var9 = (this.field_110486_H + this.field_110488_I + this.field_110563_y + this.field_110492_U) / 4.0F;
            var12 = (this.field_110563_y + this.field_110492_U + this.field_110484_O + this.field_110498_Q) / 4.0F;
            var11 = (this.field_110502_S + this.field_110563_y + this.field_110482_N + this.field_110484_O) / 4.0F;
            var10 = (this.field_110473_G + this.field_110486_H + this.field_110502_S + this.field_110563_y) / 4.0F;
            this.field_110537_au = this.func_110439_a(this.field_110564_af, this.field_110559_ag, this.field_110525_as, var23);
            this.field_110531_ax = this.func_110439_a(this.field_110525_as, this.field_110551_am, this.field_110547_ao, var23);
            this.field_110533_aw = this.func_110439_a(this.field_110529_aq, this.field_110541_al, this.field_110551_am, var23);
            this.field_110535_av = this.func_110439_a(this.field_110562_ae, this.field_110564_af, this.field_110529_aq, var23);
         } else {
            var12 = this.field_110563_y;
            var11 = this.field_110563_y;
            var10 = this.field_110563_y;
            var9 = this.field_110563_y;
            this.field_110537_au = this.field_110535_av = this.field_110533_aw = this.field_110531_ax = var23;
         }

         this.field_110518_ay = this.field_110516_az = this.field_110505_aA = this.field_110506_aB = (var18?var5:1.0F) * 0.6F;
         this.field_110507_aC = this.field_110508_aD = this.field_110509_aE = this.field_110510_aF = (var18?var6:1.0F) * 0.6F;
         this.field_110511_aG = this.field_110512_aH = this.field_110491_aI = this.field_110493_aJ = (var18?var7:1.0F) * 0.6F;
         this.field_110518_ay *= var9;
         this.field_110507_aC *= var9;
         this.field_110511_aG *= var9;
         this.field_110516_az *= var10;
         this.field_110508_aD *= var10;
         this.field_110512_aH *= var10;
         this.field_110505_aA *= var11;
         this.field_110509_aE *= var11;
         this.field_110491_aI *= var11;
         this.field_110506_aB *= var12;
         this.field_110510_aF *= var12;
         this.field_110493_aJ *= var12;
         var27 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 5);
         this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, var27);
         if(field_110520_b && var27 == 3 && this.field_110517_d < 0) {
            this.field_110518_ay *= var5;
            this.field_110516_az *= var5;
            this.field_110505_aA *= var5;
            this.field_110506_aB *= var5;
            this.field_110507_aC *= var6;
            this.field_110508_aD *= var6;
            this.field_110509_aE *= var6;
            this.field_110510_aF *= var6;
            this.field_110511_aG *= var7;
            this.field_110512_aH *= var7;
            this.field_110491_aI *= var7;
            this.field_110493_aJ *= var7;
            this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var8 = true;
      }

      this.field_110546_t = false;
      return var8;
   }

   private int func_110439_a(int var1, int var2, int var3, int var4) {
      if(var1 == 0) {
         var1 = var4;
      }

      if(var2 == 0) {
         var2 = var4;
      }

      if(var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   public boolean func_110457_c(C_100451_alf var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      this.field_110546_t = false;
      C_100872_azb var8 = C_100872_azb.field_110346_a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var11 * var5;
      float var15 = var11 * var6;
      float var16 = var11 * var7;
      float var17 = var10;
      float var18 = var12;
      float var19 = var13;
      float var20 = var10;
      float var21 = var12;
      float var22 = var13;
      float var23 = var10;
      float var24 = var12;
      float var25 = var13;
      if(var1 != C_100451_alf.field_106121_x) {
         var17 = var10 * var5;
         var18 = var12 * var5;
         var19 = var13 * var5;
         var20 = var10 * var6;
         var21 = var12 * var6;
         var22 = var13 * var6;
         var23 = var10 * var7;
         var24 = var12 * var7;
         var25 = var13 * var7;
      }

      int var26 = var1.func_106050_e(this.field_110522_a, var2, var3, var4);
      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3 - 1, var4, 0)) {
         var8.func_110328_c(this.field_110538_i > 0.0D?var26:var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4));
         var8.func_110334_a(var17, var20, var23);
         this.func_110437_a(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 0));
         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3 + 1, var4, 1)) {
         var8.func_110328_c(this.field_110532_j < 1.0D?var26:var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4));
         var8.func_110334_a(var14, var15, var16);
         this.func_110425_b(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 1));
         var9 = true;
      }

      int var28;
      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 - 1, 2)) {
         var8.func_110328_c(this.field_110534_k > 0.0D?var26:var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1));
         var8.func_110334_a(var18, var21, var24);
         var28 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 2);
         this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, var28);
         if(field_110520_b && var28 == 3 && this.field_110517_d < 0) {
            var8.func_110334_a(var18 * var5, var21 * var6, var24 * var7);
            this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 + 1, 3)) {
         var8.func_110328_c(this.field_110528_l < 1.0D?var26:var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1));
         var8.func_110334_a(var18, var21, var24);
         var28 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 3);
         this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, var28);
         if(field_110520_b && var28 == 3 && this.field_110517_d < 0) {
            var8.func_110334_a(var18 * var5, var21 * var6, var24 * var7);
            this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 - 1, var3, var4, 4)) {
         var8.func_110328_c(this.field_110515_g > 0.0D?var26:var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4));
         var8.func_110334_a(var19, var22, var25);
         var28 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 4);
         this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, var28);
         if(field_110520_b && var28 == 3 && this.field_110517_d < 0) {
            var8.func_110334_a(var19 * var5, var22 * var6, var25 * var7);
            this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 + 1, var3, var4, 5)) {
         var8.func_110328_c(this.field_110536_h < 1.0D?var26:var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4));
         var8.func_110334_a(var19, var22, var25);
         var28 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 5);
         this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, var28);
         if(field_110520_b && var28 == 3 && this.field_110517_d < 0) {
            var8.func_110334_a(var19 * var5, var22 * var6, var25 * var7);
            this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, 38);
         }

         var9 = true;
      }

      return var9;
   }

   private boolean func_110413_a(C_100228_aic var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      var5.func_110328_c(var1.func_106050_e(this.field_110522_a, var2, var3, var4));
      var5.func_110334_a(1.0F, 1.0F, 1.0F);
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      int var7 = var1.func_106024_a(1);
      int var8 = C_100186_aij.func_106302_e(var6);
      int var9 = C_100228_aic.func_106312_c(var6);
      var7 = var7 + 2 - var9;
      int var10 = 4 + var9 * 2;
      int var11 = 5 + var9 * 2;
      int var12 = (var7 & 15) << 4;
      int var13 = var7 & 240;
      double var14 = 15.0D - (double)var10;
      double var16 = 15.0D;
      double var18 = 4.0D;
      double var20 = 4.0D + (double)var11;
      double var22 = ((double)var12 + var14) / 256.0D;
      double var24 = ((double)var12 + var16 - 0.01D) / 256.0D;
      double var26 = ((double)var13 + var18) / 256.0D;
      double var28 = ((double)var13 + var20 - 0.01D) / 256.0D;
      double var30 = 0.0D;
      double var32 = 0.0D;
      switch(var8) {
      case 0:
         var30 = 8.0D - (double)(var10 / 2);
         var32 = 15.0D - (double)var10;
         break;
      case 1:
         var30 = 1.0D;
         var32 = 8.0D - (double)(var10 / 2);
         break;
      case 2:
         var30 = 8.0D - (double)(var10 / 2);
         var32 = 1.0D;
         break;
      case 3:
         var30 = 15.0D - (double)var10;
         var32 = 8.0D - (double)(var10 / 2);
      }

      double var34 = (double)var2 + var30 / 16.0D;
      double var36 = (double)var2 + (var30 + (double)var10) / 16.0D;
      double var38 = (double)var3 + (12.0D - (double)var11) / 16.0D;
      double var40 = (double)var3 + 0.75D;
      double var42 = (double)var4 + var32 / 16.0D;
      double var44 = (double)var4 + (var32 + (double)var10) / 16.0D;
      var5.func_110322_a(var34, var38, var42, var22, var28);
      var5.func_110322_a(var34, var38, var44, var24, var28);
      var5.func_110322_a(var34, var40, var44, var24, var26);
      var5.func_110322_a(var34, var40, var42, var22, var26);
      var5.func_110322_a(var36, var38, var44, var22, var28);
      var5.func_110322_a(var36, var38, var42, var24, var28);
      var5.func_110322_a(var36, var40, var42, var24, var26);
      var5.func_110322_a(var36, var40, var44, var22, var26);
      var5.func_110322_a(var36, var38, var42, var22, var28);
      var5.func_110322_a(var34, var38, var42, var24, var28);
      var5.func_110322_a(var34, var40, var42, var24, var26);
      var5.func_110322_a(var36, var40, var42, var22, var26);
      var5.func_110322_a(var34, var38, var44, var22, var28);
      var5.func_110322_a(var36, var38, var44, var24, var28);
      var5.func_110322_a(var36, var40, var44, var24, var26);
      var5.func_110322_a(var34, var40, var44, var22, var26);
      int var46 = var10;
      if(var9 >= 2) {
         var46 = var10 - 1;
      }

      var22 = (double)((float)(var12 + 0) / 256.0F);
      var24 = ((double)(var12 + var46) - 0.01D) / 256.0D;
      var26 = (double)((float)(var13 + 0) / 256.0F);
      var28 = ((double)(var13 + var46) - 0.01D) / 256.0D;
      var5.func_110322_a(var34, var40, var44, var22, var28);
      var5.func_110322_a(var36, var40, var44, var24, var28);
      var5.func_110322_a(var36, var40, var42, var24, var26);
      var5.func_110322_a(var34, var40, var42, var22, var26);
      var5.func_110322_a(var34, var38, var42, var22, var26);
      var5.func_110322_a(var36, var38, var42, var24, var26);
      var5.func_110322_a(var36, var38, var44, var24, var28);
      var5.func_110322_a(var34, var38, var44, var22, var28);
      var22 = (double)((float)(var12 + 12) / 256.0F);
      var24 = ((double)(var12 + 16) - 0.01D) / 256.0D;
      var26 = (double)((float)(var13 + 0) / 256.0F);
      var28 = ((double)(var13 + 4) - 0.01D) / 256.0D;
      var30 = 8.0D;
      var32 = 0.0D;
      double var47;
      switch(var8) {
      case 0:
         var30 = 8.0D;
         var32 = 12.0D;
         var47 = var22;
         var22 = var24;
         var24 = var47;
         break;
      case 1:
         var30 = 0.0D;
         var32 = 8.0D;
         break;
      case 2:
         var30 = 8.0D;
         var32 = 0.0D;
         break;
      case 3:
         var30 = 12.0D;
         var32 = 8.0D;
         var47 = var22;
         var22 = var24;
         var24 = var47;
      }

      var34 = (double)var2 + var30 / 16.0D;
      var36 = (double)var2 + (var30 + 4.0D) / 16.0D;
      var38 = (double)var3 + 0.75D;
      var40 = (double)var3 + 1.0D;
      var42 = (double)var4 + var32 / 16.0D;
      var44 = (double)var4 + (var32 + 4.0D) / 16.0D;
      if(var8 != 2 && var8 != 0) {
         if(var8 == 1 || var8 == 3) {
            var5.func_110322_a(var36, var38, var42, var22, var28);
            var5.func_110322_a(var34, var38, var42, var24, var28);
            var5.func_110322_a(var34, var40, var42, var24, var26);
            var5.func_110322_a(var36, var40, var42, var22, var26);
            var5.func_110322_a(var34, var38, var42, var24, var28);
            var5.func_110322_a(var36, var38, var42, var22, var28);
            var5.func_110322_a(var36, var40, var42, var22, var26);
            var5.func_110322_a(var34, var40, var42, var24, var26);
         }
      } else {
         var5.func_110322_a(var34, var38, var42, var24, var28);
         var5.func_110322_a(var34, var38, var44, var22, var28);
         var5.func_110322_a(var34, var40, var44, var22, var26);
         var5.func_110322_a(var34, var40, var42, var24, var26);
         var5.func_110322_a(var34, var38, var44, var22, var28);
         var5.func_110322_a(var34, var38, var42, var24, var28);
         var5.func_110322_a(var34, var40, var42, var24, var26);
         var5.func_110322_a(var34, var40, var44, var22, var26);
      }

      return true;
   }

   private boolean func_110430_a(C_100261_ahp var1, int var2, int var3, int var4) {
      float var5 = 0.1875F;
      this.func_110403_a(C_100451_alf.field_106210_as.field_106165_cl);
      this.func_110442_a(0.125D, 0.0D, 0.125D, 0.875D, (double)var5, 0.875D);
      this.func_110426_q(var1, var2, var3, var4);
      this.func_110403_a(C_100451_alf.field_106091_P.field_106165_cl);
      this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      this.func_110426_q(var1, var2, var3, var4);
      this.func_110403_a(41);
      this.func_110442_a(0.1875D, (double)var5, 0.1875D, 0.8125D, 0.875D, 0.8125D);
      this.func_110426_q(var1, var2, var3, var4);
      this.func_110434_a();
      return true;
   }

   public boolean func_110456_s(C_100451_alf var1, int var2, int var3, int var4) {
      int var5 = var1.func_106069_b(this.field_110522_a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      if(C_100983_ayt.field_111279_a) {
         float var9 = (var6 * 30.0F + var7 * 59.0F + var8 * 11.0F) / 100.0F;
         float var10 = (var6 * 30.0F + var7 * 70.0F) / 100.0F;
         float var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
         var6 = var9;
         var7 = var10;
         var8 = var11;
      }

      return this.func_110417_d(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean func_110417_d(C_100451_alf var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      C_100872_azb var8 = C_100872_azb.field_110346_a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      int var28 = var1.func_106050_e(this.field_110522_a, var2, var3, var4);
      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3 - 1, var4, 0)) {
         var8.func_110328_c(this.field_110538_i > 0.0D?var28:var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4));
         var8.func_110334_a(var14, var18, var22);
         this.func_110437_a(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 0));
         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3 + 1, var4, 1)) {
         var8.func_110328_c(this.field_110532_j < 1.0D?var28:var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4));
         var8.func_110334_a(var15, var19, var23);
         this.func_110425_b(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 1));
         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 - 1, 2)) {
         var8.func_110328_c(this.field_110534_k > 0.0D?var28:var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1));
         var8.func_110334_a(var16, var20, var24);
         var8.func_110320_c(0.0F, 0.0F, var26);
         this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 2));
         var8.func_110320_c(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2, var3, var4 + 1, 3)) {
         var8.func_110328_c(this.field_110528_l < 1.0D?var28:var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1));
         var8.func_110334_a(var16, var20, var24);
         var8.func_110320_c(0.0F, 0.0F, -var26);
         this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 3));
         var8.func_110320_c(0.0F, 0.0F, var26);
         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 - 1, var3, var4, 4)) {
         var8.func_110328_c(this.field_110515_g > 0.0D?var28:var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4));
         var8.func_110334_a(var17, var21, var25);
         var8.func_110320_c(var26, 0.0F, 0.0F);
         this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 4));
         var8.func_110320_c(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if(this.field_110514_f || var1.func_105976_a(this.field_110522_a, var2 + 1, var3, var4, 5)) {
         var8.func_110328_c(this.field_110536_h < 1.0D?var28:var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4));
         var8.func_110334_a(var17, var21, var25);
         var8.func_110320_c(-var26, 0.0F, 0.0F);
         this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 5));
         var8.func_110320_c(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean func_110465_a(C_100206_ait var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      this.func_110442_a((double)var6, 0.0D, (double)var6, (double)var7, 1.0D, (double)var7);
      this.func_110426_q(var1, var2, var3, var4);
      var5 = true;
      boolean var8 = false;
      boolean var9 = false;
      if(var1.func_106355_d(this.field_110522_a, var2 - 1, var3, var4) || var1.func_106355_d(this.field_110522_a, var2 + 1, var3, var4)) {
         var8 = true;
      }

      if(var1.func_106355_d(this.field_110522_a, var2, var3, var4 - 1) || var1.func_106355_d(this.field_110522_a, var2, var3, var4 + 1)) {
         var9 = true;
      }

      boolean var10 = var1.func_106355_d(this.field_110522_a, var2 - 1, var3, var4);
      boolean var11 = var1.func_106355_d(this.field_110522_a, var2 + 1, var3, var4);
      boolean var12 = var1.func_106355_d(this.field_110522_a, var2, var3, var4 - 1);
      boolean var13 = var1.func_106355_d(this.field_110522_a, var2, var3, var4 + 1);
      if(!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var14 = 0.75F;
      float var15 = 0.9375F;
      float var16 = var10?0.0F:var6;
      float var17 = var11?1.0F:var7;
      float var18 = var12?0.0F:var6;
      float var19 = var13?1.0F:var7;
      if(var8) {
         this.func_110442_a((double)var16, (double)var14, (double)var6, (double)var17, (double)var15, (double)var7);
         this.func_110426_q(var1, var2, var3, var4);
         var5 = true;
      }

      if(var9) {
         this.func_110442_a((double)var6, (double)var14, (double)var18, (double)var7, (double)var15, (double)var19);
         this.func_110426_q(var1, var2, var3, var4);
         var5 = true;
      }

      var14 = 0.375F;
      var15 = 0.5625F;
      if(var8) {
         this.func_110442_a((double)var16, (double)var14, (double)var6, (double)var17, (double)var15, (double)var7);
         this.func_110426_q(var1, var2, var3, var4);
         var5 = true;
      }

      if(var9) {
         this.func_110442_a((double)var6, (double)var14, (double)var18, (double)var7, (double)var15, (double)var19);
         this.func_110426_q(var1, var2, var3, var4);
         var5 = true;
      }

      var1.func_106007_a(this.field_110522_a, var2, var3, var4);
      return var5;
   }

   public boolean func_110410_a(C_100431_alt var1, int var2, int var3, int var4) {
      boolean var5 = var1.func_106404_d(this.field_110522_a, var2 - 1, var3, var4);
      boolean var6 = var1.func_106404_d(this.field_110522_a, var2 + 1, var3, var4);
      boolean var7 = var1.func_106404_d(this.field_110522_a, var2, var3, var4 - 1);
      boolean var8 = var1.func_106404_d(this.field_110522_a, var2, var3, var4 + 1);
      boolean var9 = var7 && var8 && !var5 && !var6;
      boolean var10 = !var7 && !var8 && var5 && var6;
      boolean var11 = this.field_110522_a.func_109352_c(var2, var3 + 1, var4);
      if((var9 || var10) && var11) {
         if(var9) {
            this.func_110442_a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
         } else {
            this.func_110442_a(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
            this.func_110426_q(var1, var2, var3, var4);
         }
      } else {
         this.func_110442_a(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
         this.func_110426_q(var1, var2, var3, var4);
         if(var5) {
            this.func_110442_a(0.0D, 0.0D, 0.3125D, 0.25D, 0.8125D, 0.6875D);
            this.func_110426_q(var1, var2, var3, var4);
         }

         if(var6) {
            this.func_110442_a(0.75D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
            this.func_110426_q(var1, var2, var3, var4);
         }

         if(var7) {
            this.func_110442_a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 0.25D);
            this.func_110426_q(var1, var2, var3, var4);
         }

         if(var8) {
            this.func_110442_a(0.3125D, 0.0D, 0.75D, 0.6875D, 0.8125D, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
         }
      }

      var1.func_106007_a(this.field_110522_a, var2, var3, var4);
      return true;
   }

   public boolean func_110411_a(C_100194_ain var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = 0;

      for(int var7 = 0; var7 < 8; ++var7) {
         byte var8 = 0;
         byte var9 = 1;
         if(var7 == 0) {
            var8 = 2;
         }

         if(var7 == 1) {
            var8 = 3;
         }

         if(var7 == 2) {
            var8 = 4;
         }

         if(var7 == 3) {
            var8 = 5;
            var9 = 2;
         }

         if(var7 == 4) {
            var8 = 6;
            var9 = 3;
         }

         if(var7 == 5) {
            var8 = 7;
            var9 = 5;
         }

         if(var7 == 6) {
            var8 = 6;
            var9 = 2;
         }

         if(var7 == 7) {
            var8 = 3;
         }

         float var10 = (float)var8 / 16.0F;
         float var11 = 1.0F - (float)var6 / 16.0F;
         float var12 = 1.0F - (float)(var6 + var9) / 16.0F;
         var6 += var9;
         this.func_110442_a((double)(0.5F - var10), (double)var12, (double)(0.5F - var10), (double)(0.5F + var10), (double)var11, (double)(0.5F + var10));
         this.func_110426_q(var1, var2, var3, var4);
      }

      var5 = true;
      this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      return var5;
   }

   public boolean func_110422_a(C_100204_ais var1, int var2, int var3, int var4) {
      boolean var5 = true;
      int var6 = this.field_110522_a.func_109357_g(var2, var3, var4);
      boolean var7 = C_100204_ais.func_106311_c(var6);
      int var8 = C_100186_aij.func_106302_e(var6);
      float var9 = 0.375F;
      float var10 = 0.5625F;
      float var11 = 0.75F;
      float var12 = 0.9375F;
      float var13 = 0.3125F;
      float var14 = 1.0F;
      if((var8 == 2 || var8 == 0) && this.field_110522_a.func_109349_a(var2 - 1, var3, var4) == C_100451_alf.field_106170_ce.field_106162_cm && this.field_110522_a.func_109349_a(var2 + 1, var3, var4) == C_100451_alf.field_106170_ce.field_106162_cm || (var8 == 3 || var8 == 1) && this.field_110522_a.func_109349_a(var2, var3, var4 - 1) == C_100451_alf.field_106170_ce.field_106162_cm && this.field_110522_a.func_109349_a(var2, var3, var4 + 1) == C_100451_alf.field_106170_ce.field_106162_cm) {
         var9 -= 0.1875F;
         var10 -= 0.1875F;
         var11 -= 0.1875F;
         var12 -= 0.1875F;
         var13 -= 0.1875F;
         var14 -= 0.1875F;
      }

      float var15;
      float var17;
      float var16;
      float var18;
      if(var8 != 3 && var8 != 1) {
         var15 = 0.0F;
         var16 = 0.125F;
         var17 = 0.4375F;
         var18 = 0.5625F;
         this.func_110442_a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var15 = 0.875F;
         var16 = 1.0F;
         this.func_110442_a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
      } else {
         var15 = 0.4375F;
         var16 = 0.5625F;
         var17 = 0.0F;
         var18 = 0.125F;
         this.func_110442_a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var17 = 0.875F;
         var18 = 1.0F;
         this.func_110442_a((double)var15, (double)var13, (double)var17, (double)var16, (double)var14, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
      }

      if(var7) {
         if(var8 == 3) {
            this.func_110442_a(0.8125D, (double)var9, 0.0D, 0.9375D, (double)var12, 0.125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.8125D, (double)var9, 0.875D, 0.9375D, (double)var12, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.5625D, (double)var9, 0.0D, 0.8125D, (double)var10, 0.125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.5625D, (double)var9, 0.875D, 0.8125D, (double)var10, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.5625D, (double)var11, 0.0D, 0.8125D, (double)var12, 0.125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.5625D, (double)var11, 0.875D, 0.8125D, (double)var12, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
         } else if(var8 == 1) {
            this.func_110442_a(0.0625D, (double)var9, 0.0D, 0.1875D, (double)var12, 0.125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.0625D, (double)var9, 0.875D, 0.1875D, (double)var12, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.1875D, (double)var9, 0.0D, 0.4375D, (double)var10, 0.125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.1875D, (double)var9, 0.875D, 0.4375D, (double)var10, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.1875D, (double)var11, 0.0D, 0.4375D, (double)var12, 0.125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.1875D, (double)var11, 0.875D, 0.4375D, (double)var12, 1.0D);
            this.func_110426_q(var1, var2, var3, var4);
         } else if(var8 == 0) {
            this.func_110442_a(0.0D, (double)var9, 0.8125D, 0.125D, (double)var12, 0.9375D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.875D, (double)var9, 0.8125D, 1.0D, (double)var12, 0.9375D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.0D, (double)var9, 0.5625D, 0.125D, (double)var10, 0.8125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.875D, (double)var9, 0.5625D, 1.0D, (double)var10, 0.8125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.0D, (double)var11, 0.5625D, 0.125D, (double)var12, 0.8125D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.875D, (double)var11, 0.5625D, 1.0D, (double)var12, 0.8125D);
            this.func_110426_q(var1, var2, var3, var4);
         } else if(var8 == 2) {
            this.func_110442_a(0.0D, (double)var9, 0.0625D, 0.125D, (double)var12, 0.1875D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.875D, (double)var9, 0.0625D, 1.0D, (double)var12, 0.1875D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.0D, (double)var9, 0.1875D, 0.125D, (double)var10, 0.4375D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.875D, (double)var9, 0.1875D, 1.0D, (double)var10, 0.4375D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.0D, (double)var11, 0.1875D, 0.125D, (double)var12, 0.4375D);
            this.func_110426_q(var1, var2, var3, var4);
            this.func_110442_a(0.875D, (double)var11, 0.1875D, 1.0D, (double)var12, 0.4375D);
            this.func_110426_q(var1, var2, var3, var4);
         }
      } else if(var8 != 3 && var8 != 1) {
         var15 = 0.375F;
         var16 = 0.5F;
         var17 = 0.4375F;
         var18 = 0.5625F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var15 = 0.5F;
         var16 = 0.625F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var15 = 0.625F;
         var16 = 0.875F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110442_a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var15 = 0.125F;
         var16 = 0.375F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110442_a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
      } else {
         var15 = 0.4375F;
         var16 = 0.5625F;
         var17 = 0.375F;
         var18 = 0.5F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var17 = 0.5F;
         var18 = 0.625F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var17 = 0.625F;
         var18 = 0.875F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110442_a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         var17 = 0.125F;
         var18 = 0.375F;
         this.func_110442_a((double)var15, (double)var9, (double)var17, (double)var16, (double)var10, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
         this.func_110442_a((double)var15, (double)var11, (double)var17, (double)var16, (double)var12, (double)var18);
         this.func_110426_q(var1, var2, var3, var4);
      }

      this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      return var5;
   }

   public boolean func_110460_a(C_100463_akw var1, int var2, int var3, int var4) {
      var1.func_106440_d(this.field_110522_a, var2, var3, var4);
      this.func_110421_a(var1);
      this.func_110426_q(var1, var2, var3, var4);
      boolean var5 = var1.func_106441_g(this.field_110522_a, var2, var3, var4);
      this.func_110421_a(var1);
      this.func_110426_q(var1, var2, var3, var4);
      if(var5 && var1.func_106439_h(this.field_110522_a, var2, var3, var4)) {
         this.func_110421_a(var1);
         this.func_110426_q(var1, var2, var3, var4);
      }

      return true;
   }

   public boolean func_110416_t(C_100451_alf var1, int var2, int var3, int var4) {
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      boolean var6 = false;
      float var7 = 0.5F;
      float var8 = 1.0F;
      float var9 = 0.8F;
      float var10 = 0.6F;
      int var11 = var1.func_106050_e(this.field_110522_a, var2, var3, var4);
      var5.func_110328_c(this.field_110538_i > 0.0D?var11:var1.func_106050_e(this.field_110522_a, var2, var3 - 1, var4));
      var5.func_110334_a(var7, var7, var7);
      this.func_110437_a(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 0));
      var6 = true;
      var5.func_110328_c(this.field_110532_j < 1.0D?var11:var1.func_106050_e(this.field_110522_a, var2, var3 + 1, var4));
      var5.func_110334_a(var8, var8, var8);
      this.func_110425_b(var1, (double)var2, (double)var3, (double)var4, var1.func_105988_d(this.field_110522_a, var2, var3, var4, 1));
      var6 = true;
      var5.func_110328_c(this.field_110534_k > 0.0D?var11:var1.func_106050_e(this.field_110522_a, var2, var3, var4 - 1));
      var5.func_110334_a(var9, var9, var9);
      int var13 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 2);
      if(var13 < 0) {
         this.field_110519_e = true;
         var13 = -var13;
      }

      this.func_110464_c(var1, (double)var2, (double)var3, (double)var4, var13);
      var6 = true;
      this.field_110519_e = false;
      var5.func_110328_c(this.field_110528_l < 1.0D?var11:var1.func_106050_e(this.field_110522_a, var2, var3, var4 + 1));
      var5.func_110334_a(var9, var9, var9);
      var13 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 3);
      if(var13 < 0) {
         this.field_110519_e = true;
         var13 = -var13;
      }

      this.func_110404_d(var1, (double)var2, (double)var3, (double)var4, var13);
      var6 = true;
      this.field_110519_e = false;
      var5.func_110328_c(this.field_110515_g > 0.0D?var11:var1.func_106050_e(this.field_110522_a, var2 - 1, var3, var4));
      var5.func_110334_a(var10, var10, var10);
      var13 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 4);
      if(var13 < 0) {
         this.field_110519_e = true;
         var13 = -var13;
      }

      this.func_110462_e(var1, (double)var2, (double)var3, (double)var4, var13);
      var6 = true;
      this.field_110519_e = false;
      var5.func_110328_c(this.field_110536_h < 1.0D?var11:var1.func_106050_e(this.field_110522_a, var2 + 1, var3, var4));
      var5.func_110334_a(var10, var10, var10);
      var13 = var1.func_105988_d(this.field_110522_a, var2, var3, var4, 5);
      if(var13 < 0) {
         this.field_110519_e = true;
         var13 = -var13;
      }

      this.func_110454_f(var1, (double)var2, (double)var3, (double)var4, var13);
      var6 = true;
      this.field_110519_e = false;
      return var6;
   }

   public void func_110437_a(C_100451_alf var1, double var2, double var4, double var6, int var8) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      if(this.field_110517_d >= 0) {
         var8 = this.field_110517_d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + this.field_110515_g * 16.0D) / 256.0D;
      double var14 = ((double)var10 + this.field_110536_h * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)var11 + this.field_110534_k * 16.0D) / 256.0D;
      double var18 = ((double)var11 + this.field_110528_l * 16.0D - 0.01D) / 256.0D;
      if(this.field_110515_g < 0.0D || this.field_110536_h > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(this.field_110534_k < 0.0D || this.field_110528_l > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.field_110548_s == 2) {
         var12 = ((double)var10 + this.field_110534_k * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110536_h * 16.0D) / 256.0D;
         var14 = ((double)var10 + this.field_110528_l * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.field_110548_s == 1) {
         var12 = ((double)(var10 + 16) - this.field_110528_l * 16.0D) / 256.0D;
         var16 = ((double)var11 + this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110536_h * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.field_110548_s == 3) {
         var12 = ((double)(var10 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110536_h * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110528_l * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + this.field_110515_g;
      double var30 = var2 + this.field_110536_h;
      double var32 = var4 + this.field_110538_i;
      double var34 = var6 + this.field_110534_k;
      double var36 = var6 + this.field_110528_l;
      if(this.field_110546_t) {
         var9.func_110334_a(this.field_110518_ay, this.field_110507_aC, this.field_110511_aG);
         var9.func_110328_c(this.field_110537_au);
         var9.func_110322_a(var28, var32, var36, var22, var26);
         var9.func_110334_a(this.field_110516_az, this.field_110508_aD, this.field_110512_aH);
         var9.func_110328_c(this.field_110535_av);
         var9.func_110322_a(var28, var32, var34, var12, var16);
         var9.func_110334_a(this.field_110505_aA, this.field_110509_aE, this.field_110491_aI);
         var9.func_110328_c(this.field_110533_aw);
         var9.func_110322_a(var30, var32, var34, var20, var24);
         var9.func_110334_a(this.field_110506_aB, this.field_110510_aF, this.field_110493_aJ);
         var9.func_110328_c(this.field_110531_ax);
         var9.func_110322_a(var30, var32, var36, var14, var18);
      } else {
         var9.func_110322_a(var28, var32, var36, var22, var26);
         var9.func_110322_a(var28, var32, var34, var12, var16);
         var9.func_110322_a(var30, var32, var34, var20, var24);
         var9.func_110322_a(var30, var32, var36, var14, var18);
      }

   }

   public void func_110425_b(C_100451_alf var1, double var2, double var4, double var6, int var8) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      if(this.field_110517_d >= 0) {
         var8 = this.field_110517_d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + this.field_110515_g * 16.0D) / 256.0D;
      double var14 = ((double)var10 + this.field_110536_h * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)var11 + this.field_110534_k * 16.0D) / 256.0D;
      double var18 = ((double)var11 + this.field_110528_l * 16.0D - 0.01D) / 256.0D;
      if(this.field_110515_g < 0.0D || this.field_110536_h > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(this.field_110534_k < 0.0D || this.field_110528_l > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.field_110550_r == 1) {
         var12 = ((double)var10 + this.field_110534_k * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110536_h * 16.0D) / 256.0D;
         var14 = ((double)var10 + this.field_110528_l * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.field_110550_r == 2) {
         var12 = ((double)(var10 + 16) - this.field_110528_l * 16.0D) / 256.0D;
         var16 = ((double)var11 + this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110536_h * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.field_110550_r == 3) {
         var12 = ((double)(var10 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110536_h * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110528_l * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + this.field_110515_g;
      double var30 = var2 + this.field_110536_h;
      double var32 = var4 + this.field_110532_j;
      double var34 = var6 + this.field_110534_k;
      double var36 = var6 + this.field_110528_l;
      if(this.field_110546_t) {
         var9.func_110334_a(this.field_110518_ay, this.field_110507_aC, this.field_110511_aG);
         var9.func_110328_c(this.field_110537_au);
         var9.func_110322_a(var30, var32, var36, var14, var18);
         var9.func_110334_a(this.field_110516_az, this.field_110508_aD, this.field_110512_aH);
         var9.func_110328_c(this.field_110535_av);
         var9.func_110322_a(var30, var32, var34, var20, var24);
         var9.func_110334_a(this.field_110505_aA, this.field_110509_aE, this.field_110491_aI);
         var9.func_110328_c(this.field_110533_aw);
         var9.func_110322_a(var28, var32, var34, var12, var16);
         var9.func_110334_a(this.field_110506_aB, this.field_110510_aF, this.field_110493_aJ);
         var9.func_110328_c(this.field_110531_ax);
         var9.func_110322_a(var28, var32, var36, var22, var26);
      } else {
         var9.func_110322_a(var30, var32, var36, var14, var18);
         var9.func_110322_a(var30, var32, var34, var20, var24);
         var9.func_110322_a(var28, var32, var34, var12, var16);
         var9.func_110322_a(var28, var32, var36, var22, var26);
      }

   }

   public void func_110464_c(C_100451_alf var1, double var2, double var4, double var6, int var8) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      if(this.field_110517_d >= 0) {
         var8 = this.field_110517_d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + this.field_110515_g * 16.0D) / 256.0D;
      double var14 = ((double)var10 + this.field_110536_h * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - this.field_110532_j * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - this.field_110538_i * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.field_110519_e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(this.field_110515_g < 0.0D || this.field_110536_h > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(this.field_110538_i < 0.0D || this.field_110532_j > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.field_110524_n == 2) {
         var12 = ((double)var10 + this.field_110538_i * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)var10 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110536_h * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.field_110524_n == 1) {
         var12 = ((double)(var10 + 16) - this.field_110532_j * 16.0D) / 256.0D;
         var16 = ((double)var11 + this.field_110536_h * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110538_i * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110515_g * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.field_110524_n == 3) {
         var12 = ((double)(var10 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110536_h * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110538_i * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + this.field_110515_g;
      double var30 = var2 + this.field_110536_h;
      double var32 = var4 + this.field_110538_i;
      double var34 = var4 + this.field_110532_j;
      double var36 = var6 + this.field_110534_k;
      if(this.field_110546_t) {
         var9.func_110334_a(this.field_110518_ay, this.field_110507_aC, this.field_110511_aG);
         var9.func_110328_c(this.field_110537_au);
         var9.func_110322_a(var28, var34, var36, var20, var24);
         var9.func_110334_a(this.field_110516_az, this.field_110508_aD, this.field_110512_aH);
         var9.func_110328_c(this.field_110535_av);
         var9.func_110322_a(var30, var34, var36, var12, var16);
         var9.func_110334_a(this.field_110505_aA, this.field_110509_aE, this.field_110491_aI);
         var9.func_110328_c(this.field_110533_aw);
         var9.func_110322_a(var30, var32, var36, var22, var26);
         var9.func_110334_a(this.field_110506_aB, this.field_110510_aF, this.field_110493_aJ);
         var9.func_110328_c(this.field_110531_ax);
         var9.func_110322_a(var28, var32, var36, var14, var18);
      } else {
         var9.func_110322_a(var28, var34, var36, var20, var24);
         var9.func_110322_a(var30, var34, var36, var12, var16);
         var9.func_110322_a(var30, var32, var36, var22, var26);
         var9.func_110322_a(var28, var32, var36, var14, var18);
      }

   }

   public void func_110404_d(C_100451_alf var1, double var2, double var4, double var6, int var8) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      if(this.field_110517_d >= 0) {
         var8 = this.field_110517_d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + this.field_110515_g * 16.0D) / 256.0D;
      double var14 = ((double)var10 + this.field_110536_h * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - this.field_110532_j * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - this.field_110538_i * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.field_110519_e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(this.field_110515_g < 0.0D || this.field_110536_h > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(this.field_110538_i < 0.0D || this.field_110532_j > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.field_110526_o == 1) {
         var12 = ((double)var10 + this.field_110538_i * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)var10 + this.field_110532_j * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110536_h * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.field_110526_o == 2) {
         var12 = ((double)(var10 + 16) - this.field_110532_j * 16.0D) / 256.0D;
         var16 = ((double)var11 + this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110538_i * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110536_h * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.field_110526_o == 3) {
         var12 = ((double)(var10 + 16) - this.field_110515_g * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110536_h * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110538_i * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + this.field_110515_g;
      double var30 = var2 + this.field_110536_h;
      double var32 = var4 + this.field_110538_i;
      double var34 = var4 + this.field_110532_j;
      double var36 = var6 + this.field_110528_l;
      if(this.field_110546_t) {
         var9.func_110334_a(this.field_110518_ay, this.field_110507_aC, this.field_110511_aG);
         var9.func_110328_c(this.field_110537_au);
         var9.func_110322_a(var28, var34, var36, var12, var16);
         var9.func_110334_a(this.field_110516_az, this.field_110508_aD, this.field_110512_aH);
         var9.func_110328_c(this.field_110535_av);
         var9.func_110322_a(var28, var32, var36, var22, var26);
         var9.func_110334_a(this.field_110505_aA, this.field_110509_aE, this.field_110491_aI);
         var9.func_110328_c(this.field_110533_aw);
         var9.func_110322_a(var30, var32, var36, var14, var18);
         var9.func_110334_a(this.field_110506_aB, this.field_110510_aF, this.field_110493_aJ);
         var9.func_110328_c(this.field_110531_ax);
         var9.func_110322_a(var30, var34, var36, var20, var24);
      } else {
         var9.func_110322_a(var28, var34, var36, var12, var16);
         var9.func_110322_a(var28, var32, var36, var22, var26);
         var9.func_110322_a(var30, var32, var36, var14, var18);
         var9.func_110322_a(var30, var34, var36, var20, var24);
      }

   }

   public void func_110462_e(C_100451_alf var1, double var2, double var4, double var6, int var8) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      if(this.field_110517_d >= 0) {
         var8 = this.field_110517_d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + this.field_110534_k * 16.0D) / 256.0D;
      double var14 = ((double)var10 + this.field_110528_l * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - this.field_110532_j * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - this.field_110538_i * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.field_110519_e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(this.field_110534_k < 0.0D || this.field_110528_l > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(this.field_110538_i < 0.0D || this.field_110532_j > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.field_110552_q == 1) {
         var12 = ((double)var10 + this.field_110538_i * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110528_l * 16.0D) / 256.0D;
         var14 = ((double)var10 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.field_110552_q == 2) {
         var12 = ((double)(var10 + 16) - this.field_110532_j * 16.0D) / 256.0D;
         var16 = ((double)var11 + this.field_110534_k * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110538_i * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110528_l * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.field_110552_q == 3) {
         var12 = ((double)(var10 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110528_l * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110538_i * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + this.field_110515_g;
      double var30 = var4 + this.field_110538_i;
      double var32 = var4 + this.field_110532_j;
      double var34 = var6 + this.field_110534_k;
      double var36 = var6 + this.field_110528_l;
      if(this.field_110546_t) {
         var9.func_110334_a(this.field_110518_ay, this.field_110507_aC, this.field_110511_aG);
         var9.func_110328_c(this.field_110537_au);
         var9.func_110322_a(var28, var32, var36, var20, var24);
         var9.func_110334_a(this.field_110516_az, this.field_110508_aD, this.field_110512_aH);
         var9.func_110328_c(this.field_110535_av);
         var9.func_110322_a(var28, var32, var34, var12, var16);
         var9.func_110334_a(this.field_110505_aA, this.field_110509_aE, this.field_110491_aI);
         var9.func_110328_c(this.field_110533_aw);
         var9.func_110322_a(var28, var30, var34, var22, var26);
         var9.func_110334_a(this.field_110506_aB, this.field_110510_aF, this.field_110493_aJ);
         var9.func_110328_c(this.field_110531_ax);
         var9.func_110322_a(var28, var30, var36, var14, var18);
      } else {
         var9.func_110322_a(var28, var32, var36, var20, var24);
         var9.func_110322_a(var28, var32, var34, var12, var16);
         var9.func_110322_a(var28, var30, var34, var22, var26);
         var9.func_110322_a(var28, var30, var36, var14, var18);
      }

   }

   public void func_110454_f(C_100451_alf var1, double var2, double var4, double var6, int var8) {
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      if(this.field_110517_d >= 0) {
         var8 = this.field_110517_d;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + this.field_110534_k * 16.0D) / 256.0D;
      double var14 = ((double)var10 + this.field_110528_l * 16.0D - 0.01D) / 256.0D;
      double var16 = ((double)(var11 + 16) - this.field_110532_j * 16.0D) / 256.0D;
      double var18 = ((double)(var11 + 16) - this.field_110538_i * 16.0D - 0.01D) / 256.0D;
      double var20;
      if(this.field_110519_e) {
         var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if(this.field_110534_k < 0.0D || this.field_110528_l > 1.0D) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if(this.field_110538_i < 0.0D || this.field_110532_j > 1.0D) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      var20 = var14;
      double var22 = var12;
      double var24 = var16;
      double var26 = var18;
      if(this.field_110554_p == 2) {
         var12 = ((double)var10 + this.field_110538_i * 16.0D) / 256.0D;
         var16 = ((double)(var11 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var14 = ((double)var10 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)(var11 + 16) - this.field_110528_l * 16.0D) / 256.0D;
         var24 = var16;
         var26 = var18;
         var20 = var12;
         var22 = var14;
         var16 = var18;
         var18 = var24;
      } else if(this.field_110554_p == 1) {
         var12 = ((double)(var10 + 16) - this.field_110532_j * 16.0D) / 256.0D;
         var16 = ((double)var11 + this.field_110528_l * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110538_i * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110534_k * 16.0D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var12 = var14;
         var14 = var22;
         var24 = var18;
         var26 = var16;
      } else if(this.field_110554_p == 3) {
         var12 = ((double)(var10 + 16) - this.field_110534_k * 16.0D) / 256.0D;
         var14 = ((double)(var10 + 16) - this.field_110528_l * 16.0D - 0.01D) / 256.0D;
         var16 = ((double)var11 + this.field_110532_j * 16.0D) / 256.0D;
         var18 = ((double)var11 + this.field_110538_i * 16.0D - 0.01D) / 256.0D;
         var20 = var14;
         var22 = var12;
         var24 = var16;
         var26 = var18;
      }

      double var28 = var2 + this.field_110536_h;
      double var30 = var4 + this.field_110538_i;
      double var32 = var4 + this.field_110532_j;
      double var34 = var6 + this.field_110534_k;
      double var36 = var6 + this.field_110528_l;
      if(this.field_110546_t) {
         var9.func_110334_a(this.field_110518_ay, this.field_110507_aC, this.field_110511_aG);
         var9.func_110328_c(this.field_110537_au);
         var9.func_110322_a(var28, var30, var36, var22, var26);
         var9.func_110334_a(this.field_110516_az, this.field_110508_aD, this.field_110512_aH);
         var9.func_110328_c(this.field_110535_av);
         var9.func_110322_a(var28, var30, var34, var14, var18);
         var9.func_110334_a(this.field_110505_aA, this.field_110509_aE, this.field_110491_aI);
         var9.func_110328_c(this.field_110533_aw);
         var9.func_110322_a(var28, var32, var34, var20, var24);
         var9.func_110334_a(this.field_110506_aB, this.field_110510_aF, this.field_110493_aJ);
         var9.func_110328_c(this.field_110531_ax);
         var9.func_110322_a(var28, var32, var36, var12, var16);
      } else {
         var9.func_110322_a(var28, var30, var36, var22, var26);
         var9.func_110322_a(var28, var30, var34, var14, var18);
         var9.func_110322_a(var28, var32, var34, var20, var24);
         var9.func_110322_a(var28, var32, var36, var12, var16);
      }

   }

   public void func_110400_a(C_100451_alf var1, int var2, float var3) {
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      boolean var5 = var1.field_106162_cm == C_100451_alf.field_106121_x.field_106162_cm;
      int var6;
      float var7;
      float var8;
      float var9;
      if(this.field_110521_c) {
         var6 = var1.func_106025_g_(var2);
         if(var5) {
            var6 = 16777215;
         }

         var7 = (float)(var6 >> 16 & 255) / 255.0F;
         var8 = (float)(var6 >> 8 & 255) / 255.0F;
         var9 = (float)(var6 & 255) / 255.0F;
         GL11.glColor4f(var7 * var3, var8 * var3, var9 * var3, 1.0F);
      }

      var6 = var1.func_106013_d();
      this.func_110421_a(var1);
      int var14;
      if(var6 != 0 && var6 != 31 && var6 != 16 && var6 != 26) {
         if(var6 == 1) {
            var4.func_110330_b();
            var4.func_110323_b(0.0F, -1.0F, 0.0F);
            this.func_110450_a(var1, var2, -0.5D, -0.5D, -0.5D, 1.0F);
            var4.func_110329_a();
         } else if(var6 == 19) {
            var4.func_110330_b();
            var4.func_110323_b(0.0F, -1.0F, 0.0F);
            var1.func_106059_f();
            this.func_110455_a(var1, var2, this.field_110532_j, -0.5D, -0.5D, -0.5D);
            var4.func_110329_a();
         } else if(var6 == 23) {
            var4.func_110330_b();
            var4.func_110323_b(0.0F, -1.0F, 0.0F);
            var1.func_106059_f();
            var4.func_110329_a();
         } else if(var6 == 13) {
            var1.func_106059_f();
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var7 = 0.0625F;
            var4.func_110330_b();
            var4.func_110323_b(0.0F, -1.0F, 0.0F);
            this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(0));
            var4.func_110329_a();
            var4.func_110330_b();
            var4.func_110323_b(0.0F, 1.0F, 0.0F);
            this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(1));
            var4.func_110329_a();
            var4.func_110330_b();
            var4.func_110323_b(0.0F, 0.0F, -1.0F);
            var4.func_110320_c(0.0F, 0.0F, var7);
            this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(2));
            var4.func_110320_c(0.0F, 0.0F, -var7);
            var4.func_110329_a();
            var4.func_110330_b();
            var4.func_110323_b(0.0F, 0.0F, 1.0F);
            var4.func_110320_c(0.0F, 0.0F, -var7);
            this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(3));
            var4.func_110320_c(0.0F, 0.0F, var7);
            var4.func_110329_a();
            var4.func_110330_b();
            var4.func_110323_b(-1.0F, 0.0F, 0.0F);
            var4.func_110320_c(var7, 0.0F, 0.0F);
            this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(4));
            var4.func_110320_c(-var7, 0.0F, 0.0F);
            var4.func_110329_a();
            var4.func_110330_b();
            var4.func_110323_b(1.0F, 0.0F, 0.0F);
            var4.func_110320_c(-var7, 0.0F, 0.0F);
            this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(5));
            var4.func_110320_c(var7, 0.0F, 0.0F);
            var4.func_110329_a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if(var6 == 22) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            C_100970_ays.field_111169_a.func_111166_a(var1, var2, var3);
            GL11.glEnable('\u803a');
         } else if(var6 == 6) {
            var4.func_110330_b();
            var4.func_110323_b(0.0F, -1.0F, 0.0F);
            this.func_110443_a(var1, var2, -0.5D, -0.5D, -0.5D);
            var4.func_110329_a();
         } else if(var6 == 2) {
            var4.func_110330_b();
            var4.func_110323_b(0.0F, -1.0F, 0.0F);
            this.func_110415_a(var1, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D);
            var4.func_110329_a();
         } else if(var6 == 10) {
            for(var14 = 0; var14 < 2; ++var14) {
               if(var14 == 0) {
                  this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
               }

               if(var14 == 1) {
                  this.func_110442_a(0.0D, 0.0D, 0.5D, 1.0D, 0.5D, 1.0D);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.func_110330_b();
               var4.func_110323_b(0.0F, -1.0F, 0.0F);
               this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(0));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 1.0F, 0.0F);
               this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(1));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, -1.0F);
               this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, 1.0F);
               this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(3));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(-1.0F, 0.0F, 0.0F);
               this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(4));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(1.0F, 0.0F, 0.0F);
               this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(5));
               var4.func_110329_a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
         } else if(var6 == 27) {
            var14 = 0;
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var4.func_110330_b();

            for(int var15 = 0; var15 < 8; ++var15) {
               byte var16 = 0;
               byte var17 = 1;
               if(var15 == 0) {
                  var16 = 2;
               }

               if(var15 == 1) {
                  var16 = 3;
               }

               if(var15 == 2) {
                  var16 = 4;
               }

               if(var15 == 3) {
                  var16 = 5;
                  var17 = 2;
               }

               if(var15 == 4) {
                  var16 = 6;
                  var17 = 3;
               }

               if(var15 == 5) {
                  var16 = 7;
                  var17 = 5;
               }

               if(var15 == 6) {
                  var16 = 6;
                  var17 = 2;
               }

               if(var15 == 7) {
                  var16 = 3;
               }

               float var11 = (float)var16 / 16.0F;
               float var12 = 1.0F - (float)var14 / 16.0F;
               float var13 = 1.0F - (float)(var14 + var17) / 16.0F;
               var14 += var17;
               this.func_110442_a((double)(0.5F - var11), (double)var13, (double)(0.5F - var11), (double)(0.5F + var11), (double)var12, (double)(0.5F + var11));
               var4.func_110323_b(0.0F, -1.0F, 0.0F);
               this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(0));
               var4.func_110323_b(0.0F, 1.0F, 0.0F);
               this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(1));
               var4.func_110323_b(0.0F, 0.0F, -1.0F);
               this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(2));
               var4.func_110323_b(0.0F, 0.0F, 1.0F);
               this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(3));
               var4.func_110323_b(-1.0F, 0.0F, 0.0F);
               this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(4));
               var4.func_110323_b(1.0F, 0.0F, 0.0F);
               this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(5));
            }

            var4.func_110329_a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if(var6 == 11) {
            for(var14 = 0; var14 < 4; ++var14) {
               var8 = 0.125F;
               if(var14 == 0) {
                  this.func_110442_a((double)(0.5F - var8), 0.0D, 0.0D, (double)(0.5F + var8), 1.0D, (double)(var8 * 2.0F));
               }

               if(var14 == 1) {
                  this.func_110442_a((double)(0.5F - var8), 0.0D, (double)(1.0F - var8 * 2.0F), (double)(0.5F + var8), 1.0D, 1.0D);
               }

               var8 = 0.0625F;
               if(var14 == 2) {
                  this.func_110442_a((double)(0.5F - var8), (double)(1.0F - var8 * 3.0F), (double)(-var8 * 2.0F), (double)(0.5F + var8), (double)(1.0F - var8), (double)(1.0F + var8 * 2.0F));
               }

               if(var14 == 3) {
                  this.func_110442_a((double)(0.5F - var8), (double)(0.5F - var8 * 3.0F), (double)(-var8 * 2.0F), (double)(0.5F + var8), (double)(0.5F - var8), (double)(1.0F + var8 * 2.0F));
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.func_110330_b();
               var4.func_110323_b(0.0F, -1.0F, 0.0F);
               this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(0));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 1.0F, 0.0F);
               this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(1));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, -1.0F);
               this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, 1.0F);
               this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(3));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(-1.0F, 0.0F, 0.0F);
               this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(4));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(1.0F, 0.0F, 0.0F);
               this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(5));
               var4.func_110329_a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if(var6 == 21) {
            for(var14 = 0; var14 < 3; ++var14) {
               var8 = 0.0625F;
               if(var14 == 0) {
                  this.func_110442_a((double)(0.5F - var8), 0.30000001192092896D, 0.0D, (double)(0.5F + var8), 1.0D, (double)(var8 * 2.0F));
               }

               if(var14 == 1) {
                  this.func_110442_a((double)(0.5F - var8), 0.30000001192092896D, (double)(1.0F - var8 * 2.0F), (double)(0.5F + var8), 1.0D, 1.0D);
               }

               var8 = 0.0625F;
               if(var14 == 2) {
                  this.func_110442_a((double)(0.5F - var8), 0.5D, 0.0D, (double)(0.5F + var8), (double)(1.0F - var8), 1.0D);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.func_110330_b();
               var4.func_110323_b(0.0F, -1.0F, 0.0F);
               this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(0));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 1.0F, 0.0F);
               this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(1));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, -1.0F);
               this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, 1.0F);
               this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(3));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(-1.0F, 0.0F, 0.0F);
               this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(4));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(1.0F, 0.0F, 0.0F);
               this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106024_a(5));
               var4.func_110329_a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }
         } else if(var6 == 32) {
            for(var14 = 0; var14 < 2; ++var14) {
               if(var14 == 0) {
                  this.func_110442_a(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
               }

               if(var14 == 1) {
                  this.func_110442_a(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.func_110330_b();
               var4.func_110323_b(0.0F, -1.0F, 0.0F);
               this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(0, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 1.0F, 0.0F);
               this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(1, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, -1.0F);
               this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(2, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, 1.0F);
               this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(3, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(-1.0F, 0.0F, 0.0F);
               this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(4, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(1.0F, 0.0F, 0.0F);
               this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(5, var2));
               var4.func_110329_a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
         } else if(var6 == 35) {
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            this.func_110466_a((C_100259_aho)var1, 0, 0, 0, var2, true);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         } else if(var6 == 34) {
            for(var14 = 0; var14 < 3; ++var14) {
               if(var14 == 0) {
                  this.func_110442_a(0.125D, 0.0D, 0.125D, 0.875D, 0.1875D, 0.875D);
                  this.func_110403_a(C_100451_alf.field_106210_as.field_106165_cl);
               } else if(var14 == 1) {
                  this.func_110442_a(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
                  this.func_110403_a(41);
               } else if(var14 == 2) {
                  this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
                  this.func_110403_a(C_100451_alf.field_106091_P.field_106165_cl);
               }

               GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
               var4.func_110330_b();
               var4.func_110323_b(0.0F, -1.0F, 0.0F);
               this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(0, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 1.0F, 0.0F);
               this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(1, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, -1.0F);
               this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(2, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(0.0F, 0.0F, 1.0F);
               this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(3, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(-1.0F, 0.0F, 0.0F);
               this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(4, var2));
               var4.func_110329_a();
               var4.func_110330_b();
               var4.func_110323_b(1.0F, 0.0F, 0.0F);
               this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(5, var2));
               var4.func_110329_a();
               GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            }

            this.func_110442_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
            this.func_110434_a();
         }
      } else {
         if(var6 == 16) {
            var2 = 1;
         }

         var1.func_106059_f();
         this.func_110421_a(var1);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var4.func_110330_b();
         var4.func_110323_b(0.0F, -1.0F, 0.0F);
         this.func_110437_a(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(0, var2));
         var4.func_110329_a();
         if(var5 && this.field_110521_c) {
            var14 = var1.func_106025_g_(var2);
            var8 = (float)(var14 >> 16 & 255) / 255.0F;
            var9 = (float)(var14 >> 8 & 255) / 255.0F;
            float var10 = (float)(var14 & 255) / 255.0F;
            GL11.glColor4f(var8 * var3, var9 * var3, var10 * var3, 1.0F);
         }

         var4.func_110330_b();
         var4.func_110323_b(0.0F, 1.0F, 0.0F);
         this.func_110425_b(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(1, var2));
         var4.func_110329_a();
         if(var5 && this.field_110521_c) {
            GL11.glColor4f(var3, var3, var3, 1.0F);
         }

         var4.func_110330_b();
         var4.func_110323_b(0.0F, 0.0F, -1.0F);
         this.func_110464_c(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(2, var2));
         var4.func_110329_a();
         var4.func_110330_b();
         var4.func_110323_b(0.0F, 0.0F, 1.0F);
         this.func_110404_d(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(3, var2));
         var4.func_110329_a();
         var4.func_110330_b();
         var4.func_110323_b(-1.0F, 0.0F, 0.0F);
         this.func_110462_e(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(4, var2));
         var4.func_110329_a();
         var4.func_110330_b();
         var4.func_110323_b(1.0F, 0.0F, 0.0F);
         this.func_110454_f(var1, 0.0D, 0.0D, 0.0D, var1.func_106029_a(5, var2));
         var4.func_110329_a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }

   }

   public static boolean func_110435_b(int var0) {
      return var0 == 0?true:(var0 == 31?true:(var0 == 13?true:(var0 == 10?true:(var0 == 11?true:(var0 == 27?true:(var0 == 22?true:(var0 == 21?true:(var0 == 16?true:(var0 == 26?true:(var0 == 32?true:(var0 == 34?true:var0 == 35)))))))))));
   }

}
