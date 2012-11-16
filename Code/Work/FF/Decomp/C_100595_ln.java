import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class C_100595_ln extends C_100730_lb {

   private static final float[] field_103457_b = new float[]{0.0F, 0.0F, 0.0050F, 0.01F};
   private static final float[] field_103459_c = new float[]{0.0F, 0.0F, 0.05F, 0.1F};
   private static final float[] field_103453_d = new float[]{0.0F, 0.0F, 0.0050F, 0.02F};
   public static final float[] field_103463_as = new float[]{0.0F, 0.01F, 0.07F, 0.2F};
   public int field_103461_at = 20;
   public float field_103475_au;
   public float field_103472_av;
   public float field_103469_aw = 0.0F;
   public float field_103467_ax = 0.0F;
   public float field_103455_ay = 0.0F;
   public float field_103454_az = 0.0F;
   protected float field_103443_aA;
   protected float field_103444_aB;
   protected float field_103445_aC;
   protected float field_103446_aD;
   protected boolean field_103447_aE = true;
   protected String field_103448_aF = "/mob/char.png";
   protected boolean field_103449_aG = true;
   protected float field_103450_aH = 0.0F;
   protected String field_103435_aI = null;
   protected float field_103436_aJ = 1.0F;
   protected int field_103437_aK = 0;
   protected float field_103438_aL = 0.0F;
   public float field_103439_aM = 0.1F;
   public float field_103440_aN = 0.02F;
   public float field_103441_aO;
   public float field_103442_aP;
   protected int field_103428_aQ = this.func_103378_aS();
   public int field_103427_aR;
   protected int field_103430_aS;
   public int field_103429_aT;
   public int field_103432_aU;
   public int field_103431_aV;
   public float field_103434_aW = 0.0F;
   public int field_103433_aX = 0;
   public int field_103425_aY = 0;
   public float field_103424_aZ;
   public float field_103458_ba;
   protected boolean field_103420_bb = false;
   protected int field_103421_bc;
   public int field_103422_bd = -1;
   public float field_103423_be = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
   public float field_103416_bf;
   public float field_103417_bg;
   public float field_103418_bh;
   protected C_101095_qg field_103419_bi = null;
   protected int field_103412_bj = 0;
   private C_100595_ln field_103456_e = null;
   private int field_103451_f = 0;
   private C_100595_ln field_103452_g = null;
   public int field_103413_bk = 0;
   public int field_103414_bl = 0;
   protected HashMap field_103415_bm = new HashMap();
   private boolean field_103471_h = true;
   private int field_103474_i;
   private C_100606_lz field_103466_j;
   private C_100610_ma field_103479_bK;
   private C_100607_ly field_103476_bL;
   private C_100602_lw field_103477_bM;
   private C_100515_nx field_103482_bN;
   protected final C_100620_mn field_103408_bn;
   protected final C_100620_mn field_103409_bo;
   private C_100595_ln field_103483_bO;
   private C_100514_ny field_103480_bP;
   private float field_103481_bQ;
   private C_100013_k field_103465_bR = new C_100013_k(0, 0, 0);
   private float field_103464_bS = -1.0F;
   private C_100994_tv[] field_103462_bT = new C_100994_tv[5];
   protected float[] field_103410_bp = new float[5];
   private C_100994_tv[] field_103460_bU = new C_100994_tv[5];
   public boolean field_103411_bq = false;
   public int field_103405_br = 0;
   protected boolean field_103404_bs = false;
   private boolean field_103473_bV = false;
   protected boolean field_103407_bt = false;
   protected int field_103406_bu;
   protected double field_103401_bv;
   protected double field_103400_bw;
   protected double field_103403_bx;
   protected double field_103402_by;
   protected double field_103399_bz;
   float field_103426_bA = 0.0F;
   protected int field_103486_bB = 0;
   protected int field_103487_bC = 0;
   protected float field_103484_bD;
   protected float field_103485_bE;
   protected float field_103490_bF;
   protected boolean field_103491_bG = false;
   protected float field_103488_bH = 0.0F;
   protected float field_103489_bI = 0.7F;
   private int field_103470_bW = 0;
   private C_100730_lb field_103468_bX;
   protected int field_103478_bJ = 0;


   public C_100595_ln(C_100873_xe var1) {
      super(var1);
      this.field_103211_m = true;
      this.field_103408_bn = new C_100620_mn(var1 != null && var1.field_109545_E != null?var1.field_109545_E:null);
      this.field_103409_bo = new C_100620_mn(var1 != null && var1.field_109545_E != null?var1.field_109545_E:null);
      this.field_103466_j = new C_100606_lz(this);
      this.field_103479_bK = new C_100610_ma(this);
      this.field_103476_bL = new C_100607_ly(this);
      this.field_103477_bM = new C_100602_lw(this);
      this.field_103482_bN = new C_100515_nx(this, var1, 16.0F);
      this.field_103480_bP = new C_100514_ny(this);
      this.field_103472_av = (float)(Math.random() + 1.0D) * 0.01F;
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.field_103475_au = (float)Math.random() * 12398.0F;
      this.field_103236_z = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.field_103455_ay = this.field_103236_z;

      for(int var2 = 0; var2 < this.field_103410_bp.length; ++var2) {
         this.field_103410_bp[var2] = 0.05F;
      }

      this.field_103197_X = 0.5F;
   }

   public C_100606_lz func_103289_av() {
      return this.field_103466_j;
   }

   public C_100610_ma func_103305_aw() {
      return this.field_103479_bK;
   }

   public C_100607_ly func_103293_ax() {
      return this.field_103476_bL;
   }

   public C_100515_nx func_103383_ay() {
      return this.field_103482_bN;
   }

   public C_100514_ny func_103292_az() {
      return this.field_103480_bP;
   }

   public Random func_103312_aA() {
      return this.field_103232_aa;
   }

   public C_100595_ln func_103286_aB() {
      return this.field_103456_e;
   }

   public C_100595_ln func_103326_aC() {
      return this.field_103452_g;
   }

   public void func_103364_k(C_100730_lb var1) {
      if(var1 instanceof C_100595_ln) {
         this.field_103452_g = (C_100595_ln)var1;
      }

   }

   public int func_103334_aD() {
      return this.field_103487_bC;
   }

   public float func_103054_ap() {
      return this.field_103455_ay;
   }

   public void func_103084_d(float var1) {
      this.field_103455_ay = var1;
   }

   public float func_103373_aE() {
      return this.field_103481_bQ;
   }

   public void func_103365_e(float var1) {
      this.field_103481_bQ = var1;
      this.func_103362_f(var1);
   }

   public boolean func_103303_l(C_100730_lb var1) {
      this.func_103364_k(var1);
      return false;
   }

   public C_100595_ln func_103335_aF() {
      return this.field_103483_bO;
   }

   public void func_103347_b(C_100595_ln var1) {
      this.field_103483_bO = var1;
   }

   public boolean func_103386_a(Class var1) {
      return C_100583_pl.class != var1 && C_101107_pp.class != var1;
   }

   public void func_103320_aG() {}

   protected void func_103120_a(double var1, boolean var3) {
      if(var3 && this.field_103194_S > 0.0F) {
         int var4 = C_100650_jv.func_108910_c(this.field_103221_t);
         int var5 = C_100650_jv.func_108910_c(this.field_103219_u - 0.20000000298023224D - (double)this.field_103181_M);
         int var6 = C_100650_jv.func_108910_c(this.field_103217_v);
         int var7 = this.field_103229_p.func_109349_a(var4, var5, var6);
         if(var7 == 0 && this.field_103229_p.func_109349_a(var4, var5 - 1, var6) == C_100451_alf.field_106147_bc.field_106162_cm) {
            var7 = this.field_103229_p.func_109349_a(var4, var5 - 1, var6);
         }

         if(var7 > 0) {
            C_100451_alf.field_106118_p[var7].func_105978_a(this.field_103229_p, var4, var5, var6, this, this.field_103194_S);
         }
      }

      super.func_103120_a(var1, var3);
   }

   public boolean func_103342_aH() {
      return this.func_103340_e(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
   }

   public boolean func_103340_e(int var1, int var2, int var3) {
      return this.field_103464_bS == -1.0F?true:this.field_103465_bR.func_105268_e(var1, var2, var3) < this.field_103464_bS * this.field_103464_bS;
   }

   public void func_103285_b(int var1, int var2, int var3, int var4) {
      this.field_103465_bR.func_105270_b(var1, var2, var3);
      this.field_103464_bS = (float)var4;
   }

   public C_100013_k func_103359_aI() {
      return this.field_103465_bR;
   }

   public float func_103345_aJ() {
      return this.field_103464_bS;
   }

   public void func_103360_aK() {
      this.field_103464_bS = -1.0F;
   }

   public boolean func_103319_aL() {
      return this.field_103464_bS != -1.0F;
   }

   public void func_103376_c(C_100595_ln var1) {
      this.field_103456_e = var1;
      this.field_103451_f = this.field_103456_e != null?60:0;
   }

   protected void func_103141_a() {
      this.field_103234_ag.func_108841_a(8, Integer.valueOf(this.field_103474_i));
      this.field_103234_ag.func_108841_a(9, Byte.valueOf((byte)0));
   }

   public boolean func_103308_m(C_100730_lb var1) {
      return this.field_103229_p.func_109522_a(this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u + (double)this.func_103102_e(), this.field_103217_v), this.field_103229_p.func_109363_R().func_107878_a(var1.field_103221_t, var1.field_103219_u + (double)var1.func_103102_e(), var1.field_103217_v)) == null;
   }

   public String func_103129_O() {
      return this.field_103448_aF;
   }

   public boolean func_103123_L() {
      return !this.field_103180_L;
   }

   public boolean func_103160_M() {
      return !this.field_103180_L;
   }

   public float func_103102_e() {
      return this.field_103183_O * 0.85F;
   }

   public int func_103372_aM() {
      return 80;
   }

   public void func_103294_aN() {
      String var1 = this.func_103354_aW();
      if(var1 != null) {
         this.field_103229_p.func_109412_a(this, var1, this.func_103384_aV(), this.func_103394_h());
      }

   }

   public void func_103162_y() {
      this.field_103441_aO = this.field_103442_aP;
      super.func_103162_y();
      this.field_103229_p.field_109545_E.func_108901_a("mobBaseTick");
      if(this.func_103143_S() && this.field_103232_aa.nextInt(1000) < this.field_103429_aT++) {
         this.field_103429_aT = -this.func_103372_aM();
         this.func_103294_aN();
      }

      if(this.func_103143_S() && this.func_103150_T()) {
         this.func_103085_a(C_100698_ks.field_109231_d, 1);
      }

      if(this.func_103101_F() || this.field_103229_p.field_109557_J) {
         this.func_103122_B();
      }

      if(this.func_103143_S() && this.func_103132_a(C_100664_afg.field_109019_h) && !this.func_103393_ba() && !this.field_103415_bm.containsKey(Integer.valueOf(C_100690_kw.field_109171_o.field_109159_H))) {
         this.func_103138_f(this.func_103332_g(this.func_103081_al()));
         if(this.func_103081_al() == -20) {
            this.func_103138_f(0);

            for(int var1 = 0; var1 < 8; ++var1) {
               float var2 = this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat();
               float var3 = this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat();
               float var4 = this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat();
               this.field_103229_p.func_109428_a("bubble", this.field_103221_t + (double)var2, this.field_103219_u + (double)var3, this.field_103217_v + (double)var4, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }

            this.func_103085_a(C_100698_ks.field_109232_e, 2);
         }

         this.func_103122_B();
      } else {
         this.func_103138_f(300);
      }

      this.field_103424_aZ = this.field_103458_ba;
      if(this.field_103425_aY > 0) {
         --this.field_103425_aY;
      }

      if(this.field_103432_aU > 0) {
         --this.field_103432_aU;
      }

      if(this.field_103237_ae > 0) {
         --this.field_103237_ae;
      }

      if(this.field_103428_aQ <= 0) {
         this.func_103341_aO();
      }

      if(this.field_103412_bj > 0) {
         --this.field_103412_bj;
      } else {
         this.field_103419_bi = null;
      }

      if(this.field_103452_g != null && !this.field_103452_g.func_103143_S()) {
         this.field_103452_g = null;
      }

      if(this.field_103456_e != null) {
         if(!this.field_103456_e.func_103143_S()) {
            this.func_103376_c((C_100595_ln)null);
         } else if(this.field_103451_f > 0) {
            --this.field_103451_f;
         } else {
            this.func_103376_c((C_100595_ln)null);
         }
      }

      this.func_103358_bu();
      this.field_103446_aD = this.field_103445_aC;
      this.field_103467_ax = this.field_103469_aw;
      this.field_103454_az = this.field_103455_ay;
      this.field_103178_B = this.field_103236_z;
      this.field_103179_C = this.field_103177_A;
      this.field_103229_p.field_109545_E.func_108900_b();
   }

   protected void func_103341_aO() {
      ++this.field_103433_aX;
      if(this.field_103433_aX == 20) {
         int var1;
         if(!this.field_103229_p.field_109557_J && (this.field_103412_bj > 0 || this.func_103385_aP()) && !this.func_103357_h_()) {
            var1 = this.func_103299_a(this.field_103419_bi);

            while(var1 > 0) {
               int var2 = C_100722_lj.func_104589_a(var1);
               var1 -= var2;
               this.field_103229_p.func_109513_d(new C_100722_lj(this.field_103229_p, this.field_103221_t, this.field_103219_u, this.field_103217_v, var2));
            }
         }

         this.func_103121_x();

         for(var1 = 0; var1 < 20; ++var1) {
            double var8 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var4 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var6 = this.field_103232_aa.nextGaussian() * 0.02D;
            this.field_103229_p.func_109428_a("explode", this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, var8, var4, var6);
         }
      }

   }

   protected int func_103332_g(int var1) {
      int var2 = C_100878_wh.func_110591_a(this);
      return var2 > 0 && this.field_103232_aa.nextInt(var2 + 1) > 0?var1:var1 - 1;
   }

   protected int func_103299_a(C_101095_qg var1) {
      return this.field_103421_bc;
   }

   protected boolean func_103385_aP() {
      return false;
   }

   public void func_103382_aQ() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var4 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var6 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var8 = 10.0D;
         this.field_103229_p.func_109428_a("explode", this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N - var2 * var8, this.field_103219_u + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O) - var4 * var8, this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N - var6 * var8, var2, var4, var6);
      }

   }

   public void func_103156_U() {
      super.func_103156_U();
      this.field_103443_aA = this.field_103444_aB;
      this.field_103444_aB = 0.0F;
      this.field_103194_S = 0.0F;
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_103181_M = 0.0F;
      this.field_103401_bv = var1;
      this.field_103400_bw = var3;
      this.field_103403_bx = var5;
      this.field_103402_by = (double)var7;
      this.field_103399_bz = (double)var8;
      this.field_103406_bu = var9;
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(!this.field_103229_p.field_109557_J) {
         for(int var1 = 0; var1 < 5; ++var1) {
            C_100994_tv var2 = this.func_103374_p(var1);
            if(!C_100994_tv.func_111340_b(var2, this.field_103460_bU[var1])) {
               ((C_100765_ie)this.field_103229_p).func_109617_p().func_109780_a(this, new C_100299_en(this.field_103212_k, var1, var2));
               this.field_103460_bU[var1] = var2 == null?null:var2.func_111360_l();
            }
         }
      }

      if(this.field_103413_bk > 0) {
         if(this.field_103414_bl <= 0) {
            this.field_103414_bl = 60;
         }

         --this.field_103414_bl;
         if(this.field_103414_bl <= 0) {
            --this.field_103413_bk;
         }
      }

      this.func_103313_c();
      double var12 = this.field_103221_t - this.field_103227_q;
      double var3 = this.field_103217_v - this.field_103223_s;
      float var5 = (float)(var12 * var12 + var3 * var3);
      float var6 = this.field_103469_aw;
      float var7 = 0.0F;
      this.field_103443_aA = this.field_103444_aB;
      float var8 = 0.0F;
      if(var5 > 0.0025000002F) {
         var8 = 1.0F;
         var7 = (float)Math.sqrt((double)var5) * 3.0F;
         var6 = (float)Math.atan2(var3, var12) * 180.0F / 3.1415927F - 90.0F;
      }

      if(this.field_103442_aP > 0.0F) {
         var6 = this.field_103236_z;
      }

      if(!this.field_103174_E) {
         var8 = 0.0F;
      }

      this.field_103444_aB += (var8 - this.field_103444_aB) * 0.3F;
      this.field_103229_p.field_109545_E.func_108901_a("headTurn");
      if(this.func_103321_bb()) {
         this.field_103477_bM.func_108821_a();
      } else {
         float var9 = C_100650_jv.func_108920_g(var6 - this.field_103469_aw);
         this.field_103469_aw += var9 * 0.3F;
         float var10 = C_100650_jv.func_108920_g(this.field_103236_z - this.field_103469_aw);
         boolean var11 = var10 < -90.0F || var10 >= 90.0F;
         if(var10 < -75.0F) {
            var10 = -75.0F;
         }

         if(var10 >= 75.0F) {
            var10 = 75.0F;
         }

         this.field_103469_aw = this.field_103236_z - var10;
         if(var10 * var10 > 2500.0F) {
            this.field_103469_aw += var10 * 0.2F;
         }

         if(var11) {
            var7 *= -1.0F;
         }
      }

      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("rangeChecks");

      while(this.field_103236_z - this.field_103178_B < -180.0F) {
         this.field_103178_B -= 360.0F;
      }

      while(this.field_103236_z - this.field_103178_B >= 180.0F) {
         this.field_103178_B += 360.0F;
      }

      while(this.field_103469_aw - this.field_103467_ax < -180.0F) {
         this.field_103467_ax -= 360.0F;
      }

      while(this.field_103469_aw - this.field_103467_ax >= 180.0F) {
         this.field_103467_ax += 360.0F;
      }

      while(this.field_103177_A - this.field_103179_C < -180.0F) {
         this.field_103179_C -= 360.0F;
      }

      while(this.field_103177_A - this.field_103179_C >= 180.0F) {
         this.field_103179_C += 360.0F;
      }

      while(this.field_103455_ay - this.field_103454_az < -180.0F) {
         this.field_103454_az -= 360.0F;
      }

      while(this.field_103455_ay - this.field_103454_az >= 180.0F) {
         this.field_103454_az += 360.0F;
      }

      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103445_aC += var7;
   }

   public void func_103392_i(int var1) {
      if(this.field_103428_aQ > 0) {
         this.field_103428_aQ += var1;
         if(this.field_103428_aQ > this.func_103378_aS()) {
            this.field_103428_aQ = this.func_103378_aS();
         }

         this.field_103237_ae = this.field_103461_at / 2;
      }
   }

   public abstract int func_103378_aS();

   public int func_103330_aT() {
      return this.field_103428_aQ;
   }

   public void func_103298_j(int var1) {
      this.field_103428_aQ = var1;
      if(var1 > this.func_103378_aS()) {
         var1 = this.func_103378_aS();
      }

   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(this.field_103229_p.field_109557_J) {
         return false;
      } else {
         this.field_103487_bC = 0;
         if(this.field_103428_aQ <= 0) {
            return false;
         } else if(var1.func_109209_k() && this.func_103300_a(C_100690_kw.field_109170_n)) {
            return false;
         } else {
            if((var1 == C_100698_ks.field_109237_o || var1 == C_100698_ks.field_109251_p) && this.func_103374_p(4) != null) {
               var2 = (int)((float)var2 * 0.55F);
            }

            this.field_103417_bg = 1.5F;
            boolean var3 = true;
            if((float)this.field_103237_ae > (float)this.field_103461_at / 2.0F) {
               if(var2 <= this.field_103486_bB) {
                  return false;
               }

               this.func_103363_d(var1, var2 - this.field_103486_bB);
               this.field_103486_bB = var2;
               var3 = false;
            } else {
               this.field_103486_bB = var2;
               this.field_103427_aR = this.field_103428_aQ;
               this.field_103237_ae = this.field_103461_at;
               this.func_103363_d(var1, var2);
               this.field_103432_aU = this.field_103431_aV = 10;
            }

            this.field_103434_aW = 0.0F;
            C_100730_lb var4 = var1.func_109210_g();
            if(var4 != null) {
               if(var4 instanceof C_100595_ln) {
                  this.func_103376_c((C_100595_ln)var4);
               }

               if(var4 instanceof C_101095_qg) {
                  this.field_103412_bj = 60;
                  this.field_103419_bi = (C_101095_qg)var4;
               } else if(var4 instanceof C_100546_ot) {
                  C_100546_ot var5 = (C_100546_ot)var4;
                  if(var5.func_103552_m()) {
                     this.field_103412_bj = 60;
                     this.field_103419_bi = null;
                  }
               }
            }

            if(var3) {
               this.field_103229_p.func_109464_a(this, (byte)2);
               if(var1 != C_100698_ks.field_109232_e && var1 != C_100698_ks.field_109238_l) {
                  this.func_103065_K();
               }

               if(var4 != null) {
                  double var9 = var4.field_103221_t - this.field_103221_t;

                  double var7;
                  for(var7 = var4.field_103217_v - this.field_103217_v; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D) {
                     var9 = (Math.random() - Math.random()) * 0.01D;
                  }

                  this.field_103434_aW = (float)(Math.atan2(var7, var9) * 180.0D / 3.1415927410125732D) - this.field_103236_z;
                  this.func_103368_a(var4, var2, var9, var7);
               } else {
                  this.field_103434_aW = (float)((int)(Math.random() * 2.0D) * 180);
               }
            }

            if(this.field_103428_aQ <= 0) {
               if(var3) {
                  this.field_103229_p.func_109412_a(this, this.func_103307_aY(), this.func_103384_aV(), this.func_103394_h());
               }

               this.func_103311_a(var1);
            } else if(var3) {
               this.field_103229_p.func_109412_a(this, this.func_103387_aX(), this.func_103384_aV(), this.func_103394_h());
            }

            return true;
         }
      }
   }

   private float func_103394_h() {
      return this.func_103357_h_()?(this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.5F:(this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F;
   }

   public void func_103116_ac() {
      this.field_103432_aU = this.field_103431_aV = 10;
      this.field_103434_aW = 0.0F;
   }

   public int func_103350_aU() {
      int var1 = 0;
      C_100994_tv[] var2 = this.func_103127_ae();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100994_tv var5 = var2[var4];
         if(var5 != null && var5.func_111365_b() instanceof C_101042_sc) {
            int var6 = ((C_101042_sc)var5.func_111365_b()).field_111050_b;
            var1 += var6;
         }
      }

      return var1;
   }

   protected void func_103379_k(int var1) {}

   protected int func_103306_b(C_100698_ks var1, int var2) {
      if(!var1.func_109228_c()) {
         int var3 = 25 - this.func_103350_aU();
         int var4 = var2 * var3 + this.field_103430_aS;
         this.func_103379_k(var2);
         var2 = var4 / 25;
         this.field_103430_aS = var4 % 25;
      }

      return var2;
   }

   protected int func_103351_c(C_100698_ks var1, int var2) {
      if(this.func_103300_a(C_100690_kw.field_109173_m)) {
         int var3 = (this.func_103390_b(C_100690_kw.field_109173_m).func_109192_c() + 1) * 5;
         int var4 = 25 - var3;
         int var5 = var2 * var4 + this.field_103430_aS;
         var2 = var5 / 25;
         this.field_103430_aS = var5 % 25;
      }

      return var2;
   }

   protected void func_103363_d(C_100698_ks var1, int var2) {
      if(!this.field_103407_bt) {
         var2 = this.func_103306_b(var1, var2);
         var2 = this.func_103351_c(var1, var2);
         this.field_103428_aQ -= var2;
      }
   }

   protected float func_103384_aV() {
      return 1.0F;
   }

   protected String func_103354_aW() {
      return null;
   }

   protected String func_103387_aX() {
      return "damage.hit";
   }

   protected String func_103307_aY() {
      return "damage.hit";
   }

   public void func_103368_a(C_100730_lb var1, int var2, double var3, double var5) {
      this.field_103226_am = true;
      float var7 = C_100650_jv.func_108915_a(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.field_103215_w /= 2.0D;
      this.field_103240_x /= 2.0D;
      this.field_103238_y /= 2.0D;
      this.field_103215_w -= var3 / (double)var7 * (double)var8;
      this.field_103240_x += (double)var8;
      this.field_103238_y -= var5 / (double)var7 * (double)var8;
      if(this.field_103240_x > 0.4000000059604645D) {
         this.field_103240_x = 0.4000000059604645D;
      }

   }

   public void func_103311_a(C_100698_ks var1) {
      C_100730_lb var2 = var1.func_109210_g();
      if(this.field_103437_aK >= 0 && var2 != null) {
         var2.func_103133_c(this, this.field_103437_aK);
      }

      if(var2 != null) {
         var2.func_103079_a(this);
      }

      this.field_103420_bb = true;
      if(!this.field_103229_p.field_109557_J) {
         int var3 = 0;
         if(var2 instanceof C_101095_qg) {
            var3 = C_100878_wh.func_110586_f((C_100595_ln)var2);
         }

         if(!this.func_103357_h_() && this.field_103229_p.func_109389_K().func_110281_b("doMobLoot")) {
            this.func_103323_a(this.field_103412_bj > 0, var3);
            this.func_103329_b(this.field_103412_bj > 0, var3);
            if(this.field_103412_bj > 0) {
               int var4 = this.field_103232_aa.nextInt(200) - var3;
               if(var4 < 5) {
                  this.func_103287_l(var4 <= 0?1:0);
               }
            }
         }
      }

      this.field_103229_p.func_109464_a(this, (byte)3);
   }

   protected void func_103287_l(int var1) {}

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.func_103377_aZ();
      if(var3 > 0) {
         int var4 = this.field_103232_aa.nextInt(3);
         if(var2 > 0) {
            var4 += this.field_103232_aa.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.func_103111_b(var3, 1);
         }
      }

   }

   protected int func_103377_aZ() {
      return 0;
   }

   protected void func_103124_a(float var1) {
      super.func_103124_a(var1);
      int var2 = C_100650_jv.func_108921_f(var1 - 3.0F);
      if(var2 > 0) {
         if(var2 > 4) {
            this.field_103229_p.func_109412_a(this, "damage.fallbig", 1.0F, 1.0F);
         } else {
            this.field_103229_p.func_109412_a(this, "damage.fallsmall", 1.0F, 1.0F);
         }

         this.func_103085_a(C_100698_ks.field_109242_h, var2);
         int var3 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u - 0.20000000298023224D - (double)this.field_103181_M), C_100650_jv.func_108910_c(this.field_103217_v));
         if(var3 > 0) {
            C_100445_alj var4 = C_100451_alf.field_106118_p[var3].field_106150_cz;
            this.field_103229_p.func_109412_a(this, var4.func_107922_e(), var4.func_107921_c() * 0.5F, var4.func_107918_d() * 0.75F);
         }
      }

   }

   public void func_103310_e(float var1, float var2) {
      double var9;
      if(this.func_103144_H() && (!(this instanceof C_101095_qg) || !((C_101095_qg)this).field_103869_cf.field_111599_b)) {
         var9 = this.field_103219_u;
         this.func_103118_a(var1, var2, this.func_103321_bb()?0.04F:0.02F);
         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         this.field_103215_w *= 0.800000011920929D;
         this.field_103240_x *= 0.800000011920929D;
         this.field_103238_y *= 0.800000011920929D;
         this.field_103240_x -= 0.02D;
         if(this.field_103175_F && this.func_103091_c(this.field_103215_w, this.field_103240_x + 0.6000000238418579D - this.field_103219_u + var9, this.field_103238_y)) {
            this.field_103240_x = 0.30000001192092896D;
         }
      } else if(this.func_103115_J() && (!(this instanceof C_101095_qg) || !((C_101095_qg)this).field_103869_cf.field_111599_b)) {
         var9 = this.field_103219_u;
         this.func_103118_a(var1, var2, 0.02F);
         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         this.field_103215_w *= 0.5D;
         this.field_103240_x *= 0.5D;
         this.field_103238_y *= 0.5D;
         this.field_103240_x -= 0.02D;
         if(this.field_103175_F && this.func_103091_c(this.field_103215_w, this.field_103240_x + 0.6000000238418579D - this.field_103219_u + var9, this.field_103238_y)) {
            this.field_103240_x = 0.30000001192092896D;
         }
      } else {
         float var3 = 0.91F;
         if(this.field_103174_E) {
            var3 = 0.54600006F;
            int var4 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b) - 1, C_100650_jv.func_108910_c(this.field_103217_v));
            if(var4 > 0) {
               var3 = C_100451_alf.field_106118_p[var4].field_106145_cC * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var3 * var3 * var3);
         float var5;
         if(this.field_103174_E) {
            if(this.func_103321_bb()) {
               var5 = this.func_103373_aE();
            } else {
               var5 = this.field_103439_aM;
            }

            var5 *= var8;
         } else {
            var5 = this.field_103440_aN;
         }

         this.func_103118_a(var1, var2, var5);
         var3 = 0.91F;
         if(this.field_103174_E) {
            var3 = 0.54600006F;
            int var6 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b) - 1, C_100650_jv.func_108910_c(this.field_103217_v));
            if(var6 > 0) {
               var3 = C_100451_alf.field_106118_p[var6].field_106145_cC * 0.91F;
            }
         }

         if(this.func_103327_g_()) {
            float var10 = 0.15F;
            if(this.field_103215_w < (double)(-var10)) {
               this.field_103215_w = (double)(-var10);
            }

            if(this.field_103215_w > (double)var10) {
               this.field_103215_w = (double)var10;
            }

            if(this.field_103238_y < (double)(-var10)) {
               this.field_103238_y = (double)(-var10);
            }

            if(this.field_103238_y > (double)var10) {
               this.field_103238_y = (double)var10;
            }

            this.field_103194_S = 0.0F;
            if(this.field_103240_x < -0.15D) {
               this.field_103240_x = -0.15D;
            }

            boolean var7 = this.func_103168_ah() && this instanceof C_101095_qg;
            if(var7 && this.field_103240_x < 0.0D) {
               this.field_103240_x = 0.0D;
            }
         }

         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         if(this.field_103175_F && this.func_103327_g_()) {
            this.field_103240_x = 0.2D;
         }

         this.field_103240_x -= 0.08D;
         this.field_103240_x *= 0.9800000190734863D;
         this.field_103215_w *= (double)var3;
         this.field_103238_y *= (double)var3;
      }

      this.field_103416_bf = this.field_103417_bg;
      var9 = this.field_103221_t - this.field_103227_q;
      double var12 = this.field_103217_v - this.field_103223_s;
      float var11 = C_100650_jv.func_108915_a(var9 * var9 + var12 * var12) * 4.0F;
      if(var11 > 1.0F) {
         var11 = 1.0F;
      }

      this.field_103417_bg += (var11 - this.field_103417_bg) * 0.4F;
      this.field_103418_bh += this.field_103417_bg;
   }

   public boolean func_103327_g_() {
      int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var2 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      int var4 = this.field_103229_p.func_109349_a(var1, var2, var3);
      return var4 == C_100451_alf.field_106185_aI.field_106162_cm || var4 == C_100451_alf.field_106128_bx.field_106162_cm;
   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("Health", (short)this.field_103428_aQ);
      var1.func_107532_a("HurtTime", (short)this.field_103432_aU);
      var1.func_107532_a("DeathTime", (short)this.field_103433_aX);
      var1.func_107532_a("AttackTime", (short)this.field_103425_aY);
      var1.func_107509_a("CanPickUpLoot", this.field_103404_bs);
      var1.func_107509_a("PersistenceRequired", this.field_103473_bV);
      var1.func_107509_a("Invulnerable", this.field_103407_bt);
      C_100339_bp var2 = new C_100339_bp();

      for(int var3 = 0; var3 < this.field_103462_bT.length; ++var3) {
         C_100353_bh var4 = new C_100353_bh();
         if(this.field_103462_bT[var3] != null) {
            this.field_103462_bT[var3].func_111344_b(var4);
         }

         var2.func_107500_a(var4);
      }

      var1.func_107530_a("Equipment", var2);
      C_100339_bp var6;
      if(!this.field_103415_bm.isEmpty()) {
         var6 = new C_100339_bp();
         Iterator var7 = this.field_103415_bm.values().iterator();

         while(var7.hasNext()) {
            C_100692_kx var5 = (C_100692_kx)var7.next();
            var6.func_107500_a(var5.func_109200_a(new C_100353_bh()));
         }

         var1.func_107530_a("ActiveEffects", var6);
      }

      var6 = new C_100339_bp();

      for(int var8 = 0; var8 < this.field_103410_bp.length; ++var8) {
         var6.func_107500_a(new C_100347_bm(var8 + "", this.field_103410_bp[var8]));
      }

      var1.func_107530_a("DropChances", var6);
   }

   public void func_103110_a(C_100353_bh var1) {
      if(this.field_103428_aQ < -32768) {
         this.field_103428_aQ = -32768;
      }

      this.field_103428_aQ = var1.func_107517_d("Health");
      if(!var1.func_107516_b("Health")) {
         this.field_103428_aQ = this.func_103378_aS();
      }

      this.field_103432_aU = var1.func_107517_d("HurtTime");
      this.field_103433_aX = var1.func_107517_d("DeathTime");
      this.field_103425_aY = var1.func_107517_d("AttackTime");
      this.field_103404_bs = var1.func_107519_n("CanPickUpLoot");
      this.field_103473_bV = var1.func_107519_n("PersistenceRequired");
      this.field_103407_bt = var1.func_107519_n("Invulnerable");
      C_100339_bp var2;
      int var3;
      if(var1.func_107516_b("Equipment")) {
         var2 = var1.func_107513_m("Equipment");

         for(var3 = 0; var3 < this.field_103462_bT.length; ++var3) {
            this.field_103462_bT[var3] = C_100994_tv.func_111376_a((C_100353_bh)var2.func_107498_b(var3));
         }
      }

      if(var1.func_107516_b("ActiveEffects")) {
         var2 = var1.func_107513_m("ActiveEffects");

         for(var3 = 0; var3 < var2.func_107501_c(); ++var3) {
            C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
            C_100692_kx var5 = C_100692_kx.func_109195_b(var4);
            this.field_103415_bm.put(Integer.valueOf(var5.func_109197_a()), var5);
         }
      }

      if(var1.func_107516_b("DropChances")) {
         var2 = var1.func_107513_m("DropChances");

         for(var3 = 0; var3 < var2.func_107501_c(); ++var3) {
            this.field_103410_bp[var3] = ((C_100347_bm)var2.func_107498_b(var3)).field_107506_a;
         }
      }

   }

   public boolean func_103143_S() {
      return !this.field_103180_L && this.field_103428_aQ > 0;
   }

   public boolean func_103393_ba() {
      return false;
   }

   public void func_103362_f(float var1) {
      this.field_103485_bE = var1;
   }

   public void func_103356_e(boolean var1) {
      this.field_103491_bG = var1;
   }

   public void func_103313_c() {
      if(this.field_103470_bW > 0) {
         --this.field_103470_bW;
      }

      if(this.field_103406_bu > 0) {
         double var1 = this.field_103221_t + (this.field_103401_bv - this.field_103221_t) / (double)this.field_103406_bu;
         double var3 = this.field_103219_u + (this.field_103400_bw - this.field_103219_u) / (double)this.field_103406_bu;
         double var5 = this.field_103217_v + (this.field_103403_bx - this.field_103217_v) / (double)this.field_103406_bu;
         double var7 = C_100650_jv.func_108918_g(this.field_103402_by - (double)this.field_103236_z);
         this.field_103236_z = (float)((double)this.field_103236_z + var7 / (double)this.field_103406_bu);
         this.field_103177_A = (float)((double)this.field_103177_A + (this.field_103399_bz - (double)this.field_103177_A) / (double)this.field_103406_bu);
         --this.field_103406_bu;
         this.func_103163_b(var1, var3, var5);
         this.func_103158_b(this.field_103236_z, this.field_103177_A);
      }

      if(Math.abs(this.field_103215_w) < 0.0050D) {
         this.field_103215_w = 0.0D;
      }

      if(Math.abs(this.field_103240_x) < 0.0050D) {
         this.field_103240_x = 0.0D;
      }

      if(Math.abs(this.field_103238_y) < 0.0050D) {
         this.field_103238_y = 0.0D;
      }

      this.field_103229_p.field_109545_E.func_108901_a("ai");
      if(this.func_103322_bd()) {
         this.field_103491_bG = false;
         this.field_103484_bD = 0.0F;
         this.field_103485_bE = 0.0F;
         this.field_103490_bF = 0.0F;
      } else if(this.func_103315_bc()) {
         if(this.func_103321_bb()) {
            this.field_103229_p.field_109545_E.func_108901_a("newAi");
            this.func_103295_bi();
            this.field_103229_p.field_109545_E.func_108900_b();
         } else {
            this.field_103229_p.field_109545_E.func_108901_a("oldAi");
            this.func_103288_bk();
            this.field_103229_p.field_109545_E.func_108900_b();
            this.field_103455_ay = this.field_103236_z;
         }
      }

      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("jump");
      if(this.field_103491_bG) {
         if(!this.func_103144_H() && !this.func_103115_J()) {
            if(this.field_103174_E && this.field_103470_bW == 0) {
               this.func_103343_bf();
               this.field_103470_bW = 10;
            }
         } else {
            this.field_103240_x += 0.03999999910593033D;
         }
      } else {
         this.field_103470_bW = 0;
      }

      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("travel");
      this.field_103484_bD *= 0.98F;
      this.field_103485_bE *= 0.98F;
      this.field_103490_bF *= 0.9F;
      float var11 = this.field_103439_aM;
      this.field_103439_aM *= this.func_103353_by();
      this.func_103310_e(this.field_103484_bD, this.field_103485_bE);
      this.field_103439_aM = var11;
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("push");
      List var2;
      Iterator var12;
      if(!this.field_103229_p.field_109557_J) {
         var2 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107895_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var2 != null && !var2.isEmpty()) {
            var12 = var2.iterator();

            while(var12.hasNext()) {
               C_100730_lb var4 = (C_100730_lb)var12.next();
               if(var4.func_103160_M()) {
                  this.func_103395_n(var4);
               }
            }
         }
      }

      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("looting");
      if(!this.field_103229_p.field_109557_J && this.field_103404_bs && this.field_103229_p.func_109389_K().func_110281_b("mobGriefing")) {
         var2 = this.field_103229_p.func_109518_a(C_100576_pg.class, this.field_103173_D.func_107895_b(1.0D, 0.0D, 1.0D));
         var12 = var2.iterator();

         while(var12.hasNext()) {
            C_100576_pg var13 = (C_100576_pg)var12.next();
            if(!var13.field_103180_L && var13.field_103279_a != null) {
               C_100994_tv var14 = var13.field_103279_a;
               int var6 = func_103338_b(var14);
               if(var6 > -1) {
                  boolean var15 = true;
                  C_100994_tv var8 = this.func_103374_p(var6);
                  if(var8 != null) {
                     if(var6 == 0) {
                        if(var14.func_111365_b() instanceof C_100939_uy && !(var8.func_111365_b() instanceof C_100939_uy)) {
                           var15 = true;
                        } else if(var14.func_111365_b() instanceof C_100939_uy && var8.func_111365_b() instanceof C_100939_uy) {
                           C_100939_uy var9 = (C_100939_uy)var14.func_111365_b();
                           C_100939_uy var10 = (C_100939_uy)var8.func_111365_b();
                           if(var9.func_110974_g() == var10.func_110974_g()) {
                              var15 = var14.func_111367_j() > var8.func_111367_j() || var14.func_111339_o() && !var8.func_111339_o();
                           } else {
                              var15 = var9.func_110974_g() > var10.func_110974_g();
                           }
                        } else {
                           var15 = false;
                        }
                     } else if(var14.func_111365_b() instanceof C_101042_sc && !(var8.func_111365_b() instanceof C_101042_sc)) {
                        var15 = true;
                     } else if(var14.func_111365_b() instanceof C_101042_sc && var8.func_111365_b() instanceof C_101042_sc) {
                        C_101042_sc var16 = (C_101042_sc)var14.func_111365_b();
                        C_101042_sc var17 = (C_101042_sc)var8.func_111365_b();
                        if(var16.field_111050_b == var17.field_111050_b) {
                           var15 = var14.func_111367_j() > var8.func_111367_j() || var14.func_111339_o() && !var8.func_111339_o();
                        } else {
                           var15 = var16.field_111050_b > var17.field_111050_b;
                        }
                     } else {
                        var15 = false;
                     }
                  }

                  if(var15) {
                     if(var8 != null && this.field_103232_aa.nextFloat() - 0.1F < this.field_103410_bp[var6]) {
                        this.func_103140_a(var8, 0.0F);
                     }

                     this.func_103060_b(var6, var14);
                     this.field_103410_bp[var6] = 2.0F;
                     this.field_103473_bV = true;
                     this.func_103397_a(var13, 1);
                     var13.func_103121_x();
                  }
               }
            }
         }
      }

      this.field_103229_p.field_109545_E.func_108900_b();
   }

   protected void func_103395_n(C_100730_lb var1) {
      var1.func_103093_f(this);
   }

   protected boolean func_103321_bb() {
      return false;
   }

   protected boolean func_103315_bc() {
      return !this.field_103229_p.field_109557_J;
   }

   protected boolean func_103322_bd() {
      return this.field_103428_aQ <= 0;
   }

   public boolean func_103325_be() {
      return false;
   }

   protected void func_103343_bf() {
      this.field_103240_x = 0.41999998688697815D;
      if(this.func_103300_a(C_100690_kw.field_109174_j)) {
         this.field_103240_x += (double)((float)(this.func_103390_b(C_100690_kw.field_109174_j).func_109192_c() + 1) * 0.1F);
      }

      if(this.func_103147_ai()) {
         float var1 = this.field_103236_z * 0.017453292F;
         this.field_103215_w -= (double)(C_100650_jv.func_108924_a(var1) * 0.2F);
         this.field_103238_y += (double)(C_100650_jv.func_108928_b(var1) * 0.2F);
      }

      this.field_103226_am = true;
   }

   protected boolean func_103302_bg() {
      return true;
   }

   protected void func_103349_bh() {
      if(!this.field_103473_bV) {
         C_101095_qg var1 = this.field_103229_p.func_109503_a(this, -1.0D);
         if(var1 != null) {
            double var2 = var1.field_103221_t - this.field_103221_t;
            double var4 = var1.field_103219_u - this.field_103219_u;
            double var6 = var1.field_103217_v - this.field_103217_v;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if(this.func_103302_bg() && var8 > 16384.0D) {
               this.func_103121_x();
            }

            if(this.field_103487_bC > 600 && this.field_103232_aa.nextInt(800) == 0 && var8 > 1024.0D && this.func_103302_bg()) {
               this.func_103121_x();
            } else if(var8 < 1024.0D) {
               this.field_103487_bC = 0;
            }
         }

      }
   }

   protected void func_103295_bi() {
      ++this.field_103487_bC;
      this.field_103229_p.field_109545_E.func_108901_a("checkDespawn");
      this.func_103349_bh();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("sensing");
      this.field_103480_bP.func_108279_a();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("targetSelector");
      this.field_103409_bo.func_108887_a();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("goalSelector");
      this.field_103408_bn.func_108887_a();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("navigation");
      this.field_103482_bN.func_108302_e();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("mob tick");
      this.func_103314_bj();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108901_a("controls");
      this.field_103229_p.field_109545_E.func_108901_a("move");
      this.field_103479_bK.func_108877_c();
      this.field_103229_p.field_109545_E.func_108899_c("look");
      this.field_103466_j.func_108859_a();
      this.field_103229_p.field_109545_E.func_108899_c("jump");
      this.field_103476_bL.func_108871_b();
      this.field_103229_p.field_109545_E.func_108900_b();
      this.field_103229_p.field_109545_E.func_108900_b();
   }

   protected void func_103314_bj() {}

   protected void func_103288_bk() {
      ++this.field_103487_bC;
      this.func_103349_bh();
      this.field_103484_bD = 0.0F;
      this.field_103485_bE = 0.0F;
      float var1 = 8.0F;
      if(this.field_103232_aa.nextFloat() < 0.02F) {
         C_101095_qg var2 = this.field_103229_p.func_109503_a(this, (double)var1);
         if(var2 != null) {
            this.field_103468_bX = var2;
            this.field_103478_bJ = 10 + this.field_103232_aa.nextInt(20);
         } else {
            this.field_103490_bF = (this.field_103232_aa.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if(this.field_103468_bX != null) {
         this.func_103371_a(this.field_103468_bX, 10.0F, (float)this.func_103290_bm());
         if(this.field_103478_bJ-- <= 0 || this.field_103468_bX.field_103180_L || this.field_103468_bX.func_103082_e(this) > (double)(var1 * var1)) {
            this.field_103468_bX = null;
         }
      } else {
         if(this.field_103232_aa.nextFloat() < 0.05F) {
            this.field_103490_bF = (this.field_103232_aa.nextFloat() - 0.5F) * 20.0F;
         }

         this.field_103236_z += this.field_103490_bF;
         this.field_103177_A = this.field_103488_bH;
      }

      boolean var4 = this.func_103144_H();
      boolean var3 = this.func_103115_J();
      if(var4 || var3) {
         this.field_103491_bG = this.field_103232_aa.nextFloat() < 0.8F;
      }

   }

   protected void func_103361_bl() {
      int var1 = this.func_103355_i();
      if(this.field_103411_bq) {
         ++this.field_103405_br;
         if(this.field_103405_br >= var1) {
            this.field_103405_br = 0;
            this.field_103411_bq = false;
         }
      } else {
         this.field_103405_br = 0;
      }

      this.field_103442_aP = (float)this.field_103405_br / (float)var1;
   }

   public int func_103290_bm() {
      return 40;
   }

   public void func_103371_a(C_100730_lb var1, float var2, float var3) {
      double var4 = var1.field_103221_t - this.field_103221_t;
      double var8 = var1.field_103217_v - this.field_103217_v;
      double var6;
      if(var1 instanceof C_100595_ln) {
         C_100595_ln var10 = (C_100595_ln)var1;
         var6 = this.field_103219_u + (double)this.func_103102_e() - (var10.field_103219_u + (double)var10.func_103102_e());
      } else {
         var6 = (var1.field_103173_D.field_107915_b + var1.field_103173_D.field_107914_e) / 2.0D - (this.field_103219_u + (double)this.func_103102_e());
      }

      double var14 = (double)C_100650_jv.func_108915_a(var4 * var4 + var8 * var8);
      float var12 = (float)(Math.atan2(var8, var4) * 180.0D / 3.1415927410125732D) - 90.0F;
      float var13 = (float)(-(Math.atan2(var6, var14) * 180.0D / 3.1415927410125732D));
      this.field_103177_A = -this.func_103370_b(this.field_103177_A, var13, var3);
      this.field_103236_z = this.func_103370_b(this.field_103236_z, var12, var2);
   }

   private float func_103370_b(float var1, float var2, float var3) {
      float var4 = C_100650_jv.func_108920_g(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean func_103380_bp() {
      return this.field_103229_p.func_109410_b(this.field_103173_D) && this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty() && !this.field_103229_p.func_109413_d(this.field_103173_D);
   }

   protected void func_103131_C() {
      this.func_103085_a(C_100698_ks.field_109243_i, 4);
   }

   public float func_103381_g(float var1) {
      float var2 = this.field_103442_aP - this.field_103441_aO;
      if(var2 < 0.0F) {
         ++var2;
      }

      return this.field_103441_aO + var2 * var1;
   }

   public C_100387_amw func_103348_h(float var1) {
      if(var1 == 1.0F) {
         return this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      } else {
         double var2 = this.field_103227_q + (this.field_103221_t - this.field_103227_q) * (double)var1;
         double var4 = this.field_103225_r + (this.field_103219_u - this.field_103225_r) * (double)var1;
         double var6 = this.field_103223_s + (this.field_103217_v - this.field_103223_s) * (double)var1;
         return this.field_103229_p.func_109363_R().func_107878_a(var2, var4, var6);
      }
   }

   public C_100387_amw func_103148_Z() {
      return this.func_103375_i(1.0F);
   }

   public C_100387_amw func_103375_i(float var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      if(var1 == 1.0F) {
         var2 = C_100650_jv.func_108928_b(-this.field_103236_z * 0.017453292F - 3.1415927F);
         var3 = C_100650_jv.func_108924_a(-this.field_103236_z * 0.017453292F - 3.1415927F);
         var4 = -C_100650_jv.func_108928_b(-this.field_103177_A * 0.017453292F);
         var5 = C_100650_jv.func_108924_a(-this.field_103177_A * 0.017453292F);
         return this.field_103229_p.func_109363_R().func_107878_a((double)(var3 * var4), (double)var5, (double)(var2 * var4));
      } else {
         var2 = this.field_103179_C + (this.field_103177_A - this.field_103179_C) * var1;
         var3 = this.field_103178_B + (this.field_103236_z - this.field_103178_B) * var1;
         var4 = C_100650_jv.func_108928_b(-var3 * 0.017453292F - 3.1415927F);
         var5 = C_100650_jv.func_108924_a(-var3 * 0.017453292F - 3.1415927F);
         float var6 = -C_100650_jv.func_108928_b(-var2 * 0.017453292F);
         float var7 = C_100650_jv.func_108924_a(-var2 * 0.017453292F);
         return this.field_103229_p.func_109363_R().func_107878_a((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public float func_103309_bq() {
      return 1.0F;
   }

   public C_100383_amu func_103367_a(double var1, float var3) {
      C_100387_amw var4 = this.func_103348_h(var3);
      C_100387_amw var5 = this.func_103375_i(var3);
      C_100387_amw var6 = var4.func_107856_c(var5.field_107872_c * var1, var5.field_107869_d * var1, var5.field_107870_e * var1);
      return this.field_103229_p.func_109522_a(var4, var6);
   }

   public int func_103316_bs() {
      return 4;
   }

   public void func_103159_a(byte var1) {
      if(var1 == 2) {
         this.field_103417_bg = 1.5F;
         this.field_103237_ae = this.field_103461_at;
         this.field_103432_aU = this.field_103431_aV = 10;
         this.field_103434_aW = 0.0F;
         this.field_103229_p.func_109412_a(this, this.func_103387_aX(), this.func_103384_aV(), (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F);
         this.func_103085_a(C_100698_ks.field_109240_j, 0);
      } else if(var1 == 3) {
         this.field_103229_p.func_109412_a(this, this.func_103307_aY(), this.func_103384_aV(), (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F);
         this.field_103428_aQ = 0;
         this.func_103311_a(C_100698_ks.field_109240_j);
      } else {
         super.func_103159_a(var1);
      }

   }

   public boolean func_103369_bt() {
      return false;
   }

   public int func_103324_b(C_100994_tv var1, int var2) {
      return var1.func_111362_c();
   }

   protected void func_103358_bu() {
      Iterator var1 = this.field_103415_bm.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         C_100692_kx var3 = (C_100692_kx)this.field_103415_bm.get(var2);
         if(!var3.func_109191_a(this) && !this.field_103229_p.field_109557_J) {
            var1.remove();
            this.func_103333_c(var3);
         }
      }

      int var11;
      if(this.field_103471_h) {
         if(!this.field_103229_p.field_109557_J) {
            if(this.field_103415_bm.isEmpty()) {
               this.field_103234_ag.func_108851_b(9, Byte.valueOf((byte)0));
               this.field_103234_ag.func_108851_b(8, Integer.valueOf(0));
               this.func_103067_c(false);
            } else {
               var11 = C_100947_vb.func_111112_a(this.field_103415_bm.values());
               this.field_103234_ag.func_108851_b(9, Byte.valueOf((byte)(C_100947_vb.func_111104_b(this.field_103415_bm.values())?1:0)));
               this.field_103234_ag.func_108851_b(8, Integer.valueOf(var11));
               this.func_103067_c(this.func_103344_m(C_100690_kw.field_109185_p.field_109159_H));
            }
         }

         this.field_103471_h = false;
      }

      var11 = this.field_103234_ag.func_108837_c(8);
      boolean var12 = this.field_103234_ag.func_108842_a(9) > 0;
      if(var11 > 0) {
         boolean var4 = false;
         if(!this.func_103164_aj()) {
            var4 = this.field_103232_aa.nextBoolean();
         } else {
            var4 = this.field_103232_aa.nextInt(15) == 0;
         }

         if(var12) {
            var4 &= this.field_103232_aa.nextInt(5) == 0;
         }

         if(var4 && var11 > 0) {
            double var5 = (double)(var11 >> 16 & 255) / 255.0D;
            double var7 = (double)(var11 >> 8 & 255) / 255.0D;
            double var9 = (double)(var11 >> 0 & 255) / 255.0D;
            this.field_103229_p.func_109428_a(var12?"mobSpellAmbient":"mobSpell", this.field_103221_t + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N, this.field_103219_u + this.field_103232_aa.nextDouble() * (double)this.field_103183_O - (double)this.field_103181_M, this.field_103217_v + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N, var5, var7, var9);
         }
      }

   }

   public void func_103391_bv() {
      Iterator var1 = this.field_103415_bm.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         C_100692_kx var3 = (C_100692_kx)this.field_103415_bm.get(var2);
         if(!this.field_103229_p.field_109557_J) {
            var1.remove();
            this.func_103333_c(var3);
         }
      }

   }

   public Collection func_103291_bw() {
      return this.field_103415_bm.values();
   }

   public boolean func_103344_m(int var1) {
      return this.field_103415_bm.containsKey(Integer.valueOf(var1));
   }

   public boolean func_103300_a(C_100690_kw var1) {
      return this.field_103415_bm.containsKey(Integer.valueOf(var1.field_109159_H));
   }

   public C_100692_kx func_103390_b(C_100690_kw var1) {
      return (C_100692_kx)this.field_103415_bm.get(Integer.valueOf(var1.field_109159_H));
   }

   public void func_103389_d(C_100692_kx var1) {
      if(this.func_103352_e(var1)) {
         if(this.field_103415_bm.containsKey(Integer.valueOf(var1.func_109197_a()))) {
            ((C_100692_kx)this.field_103415_bm.get(Integer.valueOf(var1.func_109197_a()))).func_109190_a(var1);
            this.func_103297_b((C_100692_kx)this.field_103415_bm.get(Integer.valueOf(var1.func_109197_a())));
         } else {
            this.field_103415_bm.put(Integer.valueOf(var1.func_109197_a()), var1);
            this.func_103304_a(var1);
         }

      }
   }

   public boolean func_103352_e(C_100692_kx var1) {
      if(this.func_103366_bz() == C_100601_lp.field_108818_b) {
         int var2 = var1.func_109197_a();
         if(var2 == C_100690_kw.field_109172_l.field_109159_H || var2 == C_100690_kw.field_109180_u.field_109159_H) {
            return false;
         }
      }

      return true;
   }

   public boolean func_103388_bx() {
      return this.func_103366_bz() == C_100601_lp.field_108818_b;
   }

   public void func_103318_n(int var1) {
      this.field_103415_bm.remove(Integer.valueOf(var1));
   }

   public void func_103396_o(int var1) {
      C_100692_kx var2 = (C_100692_kx)this.field_103415_bm.remove(Integer.valueOf(var1));
      if(var2 != null) {
         this.func_103333_c(var2);
      }

   }

   protected void func_103304_a(C_100692_kx var1) {
      this.field_103471_h = true;
   }

   protected void func_103297_b(C_100692_kx var1) {
      this.field_103471_h = true;
   }

   protected void func_103333_c(C_100692_kx var1) {
      this.field_103471_h = true;
   }

   public float func_103353_by() {
      float var1 = 1.0F;
      if(this.func_103300_a(C_100690_kw.field_109168_c)) {
         var1 *= 1.0F + 0.2F * (float)(this.func_103390_b(C_100690_kw.field_109168_c).func_109192_c() + 1);
      }

      if(this.func_103300_a(C_100690_kw.field_109165_d)) {
         var1 *= 1.0F - 0.15F * (float)(this.func_103390_b(C_100690_kw.field_109165_d).func_109192_c() + 1);
      }

      return var1;
   }

   public void func_103331_a(double var1, double var3, double var5) {
      this.func_103055_b(var1, var3, var5, this.field_103236_z, this.field_103177_A);
   }

   public boolean func_103357_h_() {
      return false;
   }

   public C_100601_lp func_103366_bz() {
      return C_100601_lp.field_108820_a;
   }

   public void func_103296_a(C_100994_tv var1) {
      this.field_103229_p.func_109412_a(this, "random.break", 0.8F, 0.8F + this.field_103229_p.field_109577_u.nextFloat() * 0.4F);

      for(int var2 = 0; var2 < 5; ++var2) {
         C_100387_amw var3 = this.field_103229_p.func_109363_R().func_107878_a(((double)this.field_103232_aa.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var3.func_107859_a(-this.field_103177_A * 3.1415927F / 180.0F);
         var3.func_107863_b(-this.field_103236_z * 3.1415927F / 180.0F);
         C_100387_amw var4 = this.field_103229_p.func_109363_R().func_107878_a(((double)this.field_103232_aa.nextFloat() - 0.5D) * 0.3D, (double)(-this.field_103232_aa.nextFloat()) * 0.6D - 0.3D, 0.6D);
         var4.func_107859_a(-this.field_103177_A * 3.1415927F / 180.0F);
         var4.func_107863_b(-this.field_103236_z * 3.1415927F / 180.0F);
         var4 = var4.func_107856_c(this.field_103221_t, this.field_103219_u + (double)this.func_103102_e(), this.field_103217_v);
         this.field_103229_p.func_109428_a("iconcrack_" + var1.func_111365_b().field_110891_cf, var4.field_107872_c, var4.field_107869_d, var4.field_107870_e, var3.field_107872_c, var3.field_107869_d + 0.05D, var3.field_107870_e);
      }

   }

   public int func_103070_as() {
      if(this.func_103335_aF() == null) {
         return 3;
      } else {
         int var1 = (int)((float)this.field_103428_aQ - (float)this.func_103378_aS() * 0.33F);
         var1 -= (3 - this.field_103229_p.field_109578_t) * 4;
         if(var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   public C_100994_tv func_103328_bA() {
      return this.field_103462_bT[0];
   }

   public C_100994_tv func_103374_p(int var1) {
      return this.field_103462_bT[var1];
   }

   public C_100994_tv func_103346_q(int var1) {
      return this.field_103462_bT[var1 + 1];
   }

   public void func_103060_b(int var1, C_100994_tv var2) {
      this.field_103462_bT[var1] = var2;
   }

   public C_100994_tv[] func_103127_ae() {
      return this.field_103462_bT;
   }

   protected void func_103329_b(boolean var1, int var2) {
      for(int var3 = 0; var3 < this.func_103127_ae().length; ++var3) {
         C_100994_tv var4 = this.func_103374_p(var3);
         boolean var5 = this.field_103410_bp[var3] > 1.0F;
         if(var4 != null && (var1 || var5) && this.field_103232_aa.nextFloat() - (float)var2 * 0.01F < this.field_103410_bp[var3]) {
            if(!var5 && var4.func_111387_f()) {
               int var6 = Math.max(var4.func_111364_k() - 25, 1);
               int var7 = var4.func_111364_k() - this.field_103232_aa.nextInt(this.field_103232_aa.nextInt(var6) + 1);
               if(var7 > var6) {
                  var7 = var6;
               }

               if(var7 < 1) {
                  var7 = 1;
               }

               var4.func_111371_b(var7);
            }

            this.func_103140_a(var4, 0.0F);
         }
      }

   }

   protected void func_103339_bB() {
      if(this.field_103232_aa.nextFloat() < field_103453_d[this.field_103229_p.field_109578_t]) {
         int var1 = this.field_103232_aa.nextInt(2);
         float var2 = this.field_103229_p.field_109578_t == 3?0.1F:0.25F;
         if(this.field_103232_aa.nextFloat() < 0.07F) {
            ++var1;
         }

         if(this.field_103232_aa.nextFloat() < 0.07F) {
            ++var1;
         }

         if(this.field_103232_aa.nextFloat() < 0.07F) {
            ++var1;
         }

         for(int var3 = 3; var3 >= 0; --var3) {
            C_100994_tv var4 = this.func_103346_q(var3);
            if(var3 < 3 && this.field_103232_aa.nextFloat() < var2) {
               break;
            }

            if(var4 == null) {
               C_100992_tt var5 = func_103317_a(var3 + 1, var1);
               if(var5 != null) {
                  this.func_103060_b(var3 + 1, new C_100994_tv(var5));
               }
            }
         }
      }

   }

   public void func_103397_a(C_100730_lb var1, int var2) {
      if(!var1.field_103180_L && !this.field_103229_p.field_109557_J) {
         C_100768_hz var3 = ((C_100765_ie)this.field_103229_p).func_109617_p();
         if(var1 instanceof C_100576_pg) {
            var3.func_109780_a(var1, new C_100267_ev(var1.field_103212_k, this.field_103212_k));
         }

         if(var1 instanceof C_101089_qi) {
            var3.func_109780_a(var1, new C_100267_ev(var1.field_103212_k, this.field_103212_k));
         }

         if(var1 instanceof C_100722_lj) {
            var3.func_109780_a(var1, new C_100267_ev(var1.field_103212_k, this.field_103212_k));
         }
      }

   }

   public static int func_103338_b(C_100994_tv var0) {
      if(var0.field_111397_c != C_100451_alf.field_106148_bd.field_106162_cm && var0.field_111397_c != C_100992_tt.field_110951_bQ.field_110891_cf) {
         if(var0.func_111365_b() instanceof C_101042_sc) {
            switch(((C_101042_sc)var0.func_111365_b()).field_111054_a) {
            case 0:
               return 4;
            case 1:
               return 3;
            case 2:
               return 2;
            case 3:
               return 1;
            }
         }

         return 0;
      } else {
         return 4;
      }
   }

   public static C_100992_tt func_103317_a(int var0, int var1) {
      switch(var0) {
      case 4:
         if(var1 == 0) {
            return C_100992_tt.field_110823_V;
         } else if(var1 == 1) {
            return C_100992_tt.field_110944_al;
         } else if(var1 == 2) {
            return C_100992_tt.field_110830_Z;
         } else if(var1 == 3) {
            return C_100992_tt.field_110960_ad;
         } else if(var1 == 4) {
            return C_100992_tt.field_110968_ah;
         }
      case 3:
         if(var1 == 0) {
            return C_100992_tt.field_110822_W;
         } else if(var1 == 1) {
            return C_100992_tt.field_110954_am;
         } else if(var1 == 2) {
            return C_100992_tt.field_110962_aa;
         } else if(var1 == 3) {
            return C_100992_tt.field_110970_ae;
         } else if(var1 == 4) {
            return C_100992_tt.field_110946_ai;
         }
      case 2:
         if(var1 == 0) {
            return C_100992_tt.field_110829_X;
         } else if(var1 == 1) {
            return C_100992_tt.field_110956_an;
         } else if(var1 == 2) {
            return C_100992_tt.field_110964_ab;
         } else if(var1 == 3) {
            return C_100992_tt.field_110972_af;
         } else if(var1 == 4) {
            return C_100992_tt.field_110948_aj;
         }
      case 1:
         if(var1 == 0) {
            return C_100992_tt.field_110828_Y;
         } else if(var1 == 1) {
            return C_100992_tt.field_110950_ao;
         } else if(var1 == 2) {
            return C_100992_tt.field_110958_ac;
         } else if(var1 == 3) {
            return C_100992_tt.field_110966_ag;
         } else if(var1 == 4) {
            return C_100992_tt.field_110942_ak;
         }
      default:
         return null;
      }
   }

   protected void func_103336_bC() {
      if(this.func_103328_bA() != null && this.field_103232_aa.nextFloat() < field_103457_b[this.field_103229_p.field_109578_t]) {
         C_100878_wh.func_110597_a(this.field_103232_aa, this.func_103328_bA(), 5);
      }

      for(int var1 = 0; var1 < 4; ++var1) {
         C_100994_tv var2 = this.func_103346_q(var1);
         if(var2 != null && this.field_103232_aa.nextFloat() < field_103459_c[this.field_103229_p.field_109578_t]) {
            C_100878_wh.func_110597_a(this.field_103232_aa, var2, 5);
         }
      }

   }

   public void func_103337_bD() {}

   private int func_103355_i() {
      return this.func_103300_a(C_100690_kw.field_109166_e)?6 - (1 + this.func_103390_b(C_100690_kw.field_109166_e).func_109192_c()) * 1:(this.func_103300_a(C_100690_kw.field_109163_f)?6 + (1 + this.func_103390_b(C_100690_kw.field_109163_f).func_109192_c()) * 2:6);
   }

   public void func_103301_bE() {
      if(!this.field_103411_bq || this.field_103405_br >= this.func_103355_i() / 2 || this.field_103405_br < 0) {
         this.field_103405_br = -1;
         this.field_103411_bq = true;
         if(this.field_103229_p instanceof C_100765_ie) {
            ((C_100765_ie)this.field_103229_p).func_109617_p().func_109780_a(this, new C_100401_cj(this, 1));
         }
      }

   }

   public boolean func_103398_bF() {
      return false;
   }

}
