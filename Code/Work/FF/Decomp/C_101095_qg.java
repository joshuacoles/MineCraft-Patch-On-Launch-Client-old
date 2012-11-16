import java.util.Iterator;
import java.util.List;

public abstract class C_101095_qg extends C_100595_ln implements C_100020_s {

   public C_101092_qf field_103857_bK = new C_101092_qf(this);
   private C_101053_rt field_103845_a = new C_101053_rt();
   public C_101075_qy field_103855_bL;
   public C_101075_qy field_103856_bM;
   protected C_101077_qx field_103861_bN = new C_101077_qx();
   protected int field_103863_bO = 0;
   public byte field_103858_bP = 0;
   public int field_103859_bQ = 0;
   public float field_103849_bR;
   public float field_103848_bS;
   public String field_103847_bT;
   public String field_103842_cB;
   public int field_103846_bU = 0;
   public double field_103854_bV;
   public double field_103853_bW;
   public double field_103851_bX;
   public double field_103850_bY;
   public double field_103841_bZ;
   public double field_103835_ca;
   protected boolean field_103834_cb;
   public C_100013_k field_103870_cc;
   private int field_103843_b;
   public float field_103871_cd;
   public float field_103836_cC;
   public float field_103868_ce;
   private C_100013_k field_103844_c;
   private boolean field_103839_d;
   private C_100013_k field_103840_e;
   public C_101093_qe field_103869_cf = new C_101093_qe();
   public int field_103866_cg;
   public int field_103867_ch;
   public float field_103864_ci;
   private C_100994_tv field_103837_f;
   private int field_103838_g;
   protected float field_103865_cj = 0.1F;
   protected float field_103860_ck = 0.02F;
   private int field_103852_h = 0;
   public C_101090_ql field_103862_cl = null;


   public C_101095_qg(C_100873_xe var1) {
      super(var1);
      this.field_103855_bL = new C_101061_rn(this.field_103857_bK, !var1.field_109557_J, this);
      this.field_103856_bM = this.field_103855_bL;
      this.field_103181_M = 1.62F;
      C_100013_k var2 = var1.func_109381_G();
      this.func_103055_b((double)var2.field_105273_a + 0.5D, (double)(var2.field_105271_b + 1), (double)var2.field_105272_c + 0.5D, 0.0F, 0.0F);
      this.field_103435_aI = "humanoid";
      this.field_103450_aH = 180.0F;
      this.field_103230_ac = 20;
      this.field_103448_aF = "/mob/char.png";
   }

   public int func_103378_aS() {
      return 20;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)0));
      this.field_103234_ag.func_108841_a(17, Byte.valueOf((byte)0));
   }

   public C_100994_tv func_103811_bG() {
      return this.field_103837_f;
   }

   public int func_103803_bH() {
      return this.field_103838_g;
   }

   public boolean func_103833_bI() {
      return this.field_103837_f != null;
   }

   public int func_103820_bJ() {
      return this.func_103833_bI()?this.field_103837_f.func_111391_m() - this.field_103838_g:0;
   }

   public void func_103829_bK() {
      if(this.field_103837_f != null) {
         this.field_103837_f.func_111346_b(this.field_103229_p, this, this.field_103838_g);
      }

      this.func_103824_bL();
   }

   public void func_103824_bL() {
      this.field_103837_f = null;
      this.field_103838_g = 0;
      if(!this.field_103229_p.field_109557_J) {
         this.func_103117_d(false);
      }

   }

   public boolean func_103325_be() {
      return this.func_103833_bI() && C_100992_tt.field_110834_e[this.field_103837_f.field_111397_c].func_110777_d_(this.field_103837_f) == C_100943_uw.field_111097_d;
   }

   public void func_103165_j_() {
      if(this.field_103837_f != null) {
         C_100994_tv var1 = this.field_103857_bK.func_104808_g();
         if(var1 == this.field_103837_f) {
            if(this.field_103838_g <= 25 && this.field_103838_g % 4 == 0) {
               this.func_103793_c(var1, 5);
            }

            if(--this.field_103838_g == 0 && !this.field_103229_p.field_109557_J) {
               this.func_103812_n();
            }
         } else {
            this.func_103824_bL();
         }
      }

      if(this.field_103846_bU > 0) {
         --this.field_103846_bU;
      }

      if(this.func_103369_bt()) {
         ++this.field_103843_b;
         if(this.field_103843_b > 100) {
            this.field_103843_b = 100;
         }

         if(!this.field_103229_p.field_109557_J) {
            if(!this.func_103822_j()) {
               this.func_103766_a(true, true, false);
            } else if(this.field_103229_p.func_109402_t()) {
               this.func_103766_a(false, true, true);
            }
         }
      } else if(this.field_103843_b > 0) {
         ++this.field_103843_b;
         if(this.field_103843_b >= 110) {
            this.field_103843_b = 0;
         }
      }

      super.func_103165_j_();
      if(!this.field_103229_p.field_109557_J && this.field_103856_bM != null && !this.field_103856_bM.func_111489_c(this)) {
         this.func_103808_i();
         this.field_103856_bM = this.field_103855_bL;
      }

      if(this.func_103149_af() && this.field_103869_cf.field_111601_a) {
         this.func_103122_B();
      }

      this.field_103854_bV = this.field_103850_bY;
      this.field_103853_bW = this.field_103841_bZ;
      this.field_103851_bX = this.field_103835_ca;
      double var9 = this.field_103221_t - this.field_103850_bY;
      double var3 = this.field_103219_u - this.field_103841_bZ;
      double var5 = this.field_103217_v - this.field_103835_ca;
      double var7 = 10.0D;
      if(var9 > var7) {
         this.field_103854_bV = this.field_103850_bY = this.field_103221_t;
      }

      if(var5 > var7) {
         this.field_103851_bX = this.field_103835_ca = this.field_103217_v;
      }

      if(var3 > var7) {
         this.field_103853_bW = this.field_103841_bZ = this.field_103219_u;
      }

      if(var9 < -var7) {
         this.field_103854_bV = this.field_103850_bY = this.field_103221_t;
      }

      if(var5 < -var7) {
         this.field_103851_bX = this.field_103835_ca = this.field_103217_v;
      }

      if(var3 < -var7) {
         this.field_103853_bW = this.field_103841_bZ = this.field_103219_u;
      }

      this.field_103850_bY += var9 * 0.25D;
      this.field_103835_ca += var5 * 0.25D;
      this.field_103841_bZ += var3 * 0.25D;
      this.func_103813_a(C_100818_jh.field_110034_k, 1);
      if(this.field_103207_o == null) {
         this.field_103840_e = null;
      }

      if(!this.field_103229_p.field_109557_J) {
         this.field_103861_bN.func_111573_a(this);
      }

   }

   public int func_103086_z() {
      return this.field_103869_cf.field_111601_a?0:80;
   }

   public int func_103103_ab() {
      return 10;
   }

   protected void func_103793_c(C_100994_tv var1, int var2) {
      if(var1.func_111348_n() == C_100943_uw.field_111100_c) {
         this.field_103229_p.func_109412_a(this, "random.drink", 0.5F, this.field_103229_p.field_109577_u.nextFloat() * 0.1F + 0.9F);
      }

      if(var1.func_111348_n() == C_100943_uw.field_111099_b) {
         for(int var3 = 0; var3 < var2; ++var3) {
            C_100387_amw var4 = this.field_103229_p.func_109363_R().func_107878_a(((double)this.field_103232_aa.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            var4.func_107859_a(-this.field_103177_A * 3.1415927F / 180.0F);
            var4.func_107863_b(-this.field_103236_z * 3.1415927F / 180.0F);
            C_100387_amw var5 = this.field_103229_p.func_109363_R().func_107878_a(((double)this.field_103232_aa.nextFloat() - 0.5D) * 0.3D, (double)(-this.field_103232_aa.nextFloat()) * 0.6D - 0.3D, 0.6D);
            var5.func_107859_a(-this.field_103177_A * 3.1415927F / 180.0F);
            var5.func_107863_b(-this.field_103236_z * 3.1415927F / 180.0F);
            var5 = var5.func_107856_c(this.field_103221_t, this.field_103219_u + (double)this.func_103102_e(), this.field_103217_v);
            this.field_103229_p.func_109428_a("iconcrack_" + var1.func_111365_b().field_110891_cf, var5.field_107872_c, var5.field_107869_d, var5.field_107870_e, var4.field_107872_c, var4.field_107869_d + 0.05D, var4.field_107870_e);
         }

         this.field_103229_p.func_109412_a(this, "random.eat", 0.5F + 0.5F * (float)this.field_103232_aa.nextInt(2), (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected void func_103812_n() {
      if(this.field_103837_f != null) {
         this.func_103793_c(this.field_103837_f, 16);
         int var1 = this.field_103837_f.field_111398_a;
         C_100994_tv var2 = this.field_103837_f.func_111373_b(this.field_103229_p, this);
         if(var2 != this.field_103837_f || var2 != null && var2.field_111398_a != var1) {
            this.field_103857_bK.field_104832_a[this.field_103857_bK.field_104831_c] = var2;
            if(var2.field_111398_a == 0) {
               this.field_103857_bK.field_104832_a[this.field_103857_bK.field_104831_c] = null;
            }
         }

         this.func_103824_bL();
      }

   }

   public void func_103159_a(byte var1) {
      if(var1 == 9) {
         this.func_103812_n();
      } else {
         super.func_103159_a(var1);
      }

   }

   protected boolean func_103322_bd() {
      return this.func_103330_aT() <= 0 || this.func_103369_bt();
   }

   protected void func_103808_i() {
      this.field_103856_bM = this.field_103855_bL;
   }

   public void func_103156_U() {
      double var1 = this.field_103221_t;
      double var3 = this.field_103219_u;
      double var5 = this.field_103217_v;
      float var7 = this.field_103236_z;
      float var8 = this.field_103177_A;
      super.func_103156_U();
      this.field_103849_bR = this.field_103848_bS;
      this.field_103848_bS = 0.0F;
      this.func_103782_k(this.field_103221_t - var1, this.field_103219_u - var3, this.field_103217_v - var5);
      if(this.field_103207_o instanceof C_100537_on) {
         this.field_103177_A = var8;
         this.field_103236_z = var7;
         this.field_103469_aw = ((C_100537_on)this.field_103207_o).field_103469_aw;
      }

   }

   public void func_103128_w() {
      this.field_103181_M = 1.62F;
      this.func_103161_a(0.6F, 1.8F);
      super.func_103128_w();
      this.func_103298_j(this.func_103378_aS());
      this.field_103433_aX = 0;
   }

   protected void func_103288_bk() {
      this.func_103361_bl();
   }

   public void func_103313_c() {
      if(this.field_103863_bO > 0) {
         --this.field_103863_bO;
      }

      if(this.field_103229_p.field_109578_t == 0 && this.func_103330_aT() < this.func_103378_aS() && this.field_103233_ab % 20 * 12 == 0) {
         this.func_103392_i(1);
      }

      this.field_103857_bK.func_104803_j();
      this.field_103849_bR = this.field_103848_bS;
      super.func_103313_c();
      this.field_103439_aM = this.field_103869_cf.func_111592_b();
      this.field_103440_aN = this.field_103860_ck;
      if(this.func_103147_ai()) {
         this.field_103439_aM = (float)((double)this.field_103439_aM + (double)this.field_103869_cf.func_111592_b() * 0.3D);
         this.field_103440_aN = (float)((double)this.field_103440_aN + (double)this.field_103860_ck * 0.3D);
      }

      float var1 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
      float var2 = (float)Math.atan(-this.field_103240_x * 0.20000000298023224D) * 15.0F;
      if(var1 > 0.1F) {
         var1 = 0.1F;
      }

      if(!this.field_103174_E || this.func_103330_aT() <= 0) {
         var1 = 0.0F;
      }

      if(this.field_103174_E || this.func_103330_aT() <= 0) {
         var2 = 0.0F;
      }

      this.field_103848_bS += (var1 - this.field_103848_bS) * 0.4F;
      this.field_103458_ba += (var2 - this.field_103458_ba) * 0.8F;
      if(this.func_103330_aT() > 0) {
         List var3 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107895_b(1.0D, 0.0D, 1.0D));
         if(var3 != null) {
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               C_100730_lb var5 = (C_100730_lb)var4.next();
               if(!var5.field_103180_L) {
                  this.func_103789_q(var5);
               }
            }
         }
      }

   }

   private void func_103789_q(C_100730_lb var1) {
      var1.func_103096_b_(this);
   }

   public int func_103776_bM() {
      return this.field_103859_bQ;
   }

   public void func_103311_a(C_100698_ks var1) {
      super.func_103311_a(var1);
      this.func_103161_a(0.2F, 0.2F);
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.field_103240_x = 0.10000000149011612D;
      if(this.field_103847_bT.equals("Notch")) {
         this.func_103828_a(new C_100994_tv(C_100992_tt.field_110842_j, 1), true);
      }

      if(!this.field_103229_p.func_109389_K().func_110281_b("keepInventory")) {
         this.field_103857_bK.func_104823_l();
      }

      if(var1 != null) {
         this.field_103215_w = (double)(-C_100650_jv.func_108928_b((this.field_103434_aW + this.field_103236_z) * 3.1415927F / 180.0F) * 0.1F);
         this.field_103238_y = (double)(-C_100650_jv.func_108924_a((this.field_103434_aW + this.field_103236_z) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.field_103215_w = this.field_103238_y = 0.0D;
      }

      this.field_103181_M = 0.1F;
      this.func_103813_a(C_100818_jh.field_110046_y, 1);
   }

   public void func_103133_c(C_100730_lb var1, int var2) {
      this.field_103859_bQ += var2;
      if(var1 instanceof C_101095_qg) {
         this.func_103813_a(C_100818_jh.field_110018_A, 1);
      } else {
         this.func_103813_a(C_100818_jh.field_110045_z, 1);
      }

   }

   public C_100576_pg func_103830_bN() {
      return this.func_103828_a(this.field_103857_bK.func_103002_a(this.field_103857_bK.field_104831_c, 1), false);
   }

   public C_100576_pg func_103767_c(C_100994_tv var1) {
      return this.func_103828_a(var1, false);
   }

   public C_100576_pg func_103828_a(C_100994_tv var1, boolean var2) {
      if(var1 == null) {
         return null;
      } else {
         C_100576_pg var3 = new C_100576_pg(this.field_103229_p, this.field_103221_t, this.field_103219_u - 0.30000001192092896D + (double)this.func_103102_e(), this.field_103217_v, var1);
         var3.field_103278_c = 40;
         float var4 = 0.1F;
         float var5;
         if(var2) {
            var5 = this.field_103232_aa.nextFloat() * 0.5F;
            float var6 = this.field_103232_aa.nextFloat() * 3.1415927F * 2.0F;
            var3.field_103215_w = (double)(-C_100650_jv.func_108924_a(var6) * var5);
            var3.field_103238_y = (double)(C_100650_jv.func_108928_b(var6) * var5);
            var3.field_103240_x = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.field_103215_w = (double)(-C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F) * var4);
            var3.field_103238_y = (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F) * var4);
            var3.field_103240_x = (double)(-C_100650_jv.func_108924_a(this.field_103177_A / 180.0F * 3.1415927F) * var4 + 0.1F);
            var4 = 0.02F;
            var5 = this.field_103232_aa.nextFloat() * 3.1415927F * 2.0F;
            var4 *= this.field_103232_aa.nextFloat();
            var3.field_103215_w += Math.cos((double)var5) * (double)var4;
            var3.field_103240_x += (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.1F);
            var3.field_103238_y += Math.sin((double)var5) * (double)var4;
         }

         this.func_103762_a(var3);
         this.func_103813_a(C_100818_jh.field_110038_v, 1);
         return var3;
      }
   }

   protected void func_103762_a(C_100576_pg var1) {
      this.field_103229_p.func_109513_d(var1);
   }

   public float func_103779_a(C_100451_alf var1) {
      float var2 = this.field_103857_bK.func_104825_a(var1);
      int var3 = C_100878_wh.func_110595_b(this);
      if(var3 > 0 && this.field_103857_bK.func_104815_b(var1)) {
         var2 += (float)(var3 * var3 + 1);
      }

      if(this.func_103300_a(C_100690_kw.field_109166_e)) {
         var2 *= 1.0F + (float)(this.func_103390_b(C_100690_kw.field_109166_e).func_109192_c() + 1) * 0.2F;
      }

      if(this.func_103300_a(C_100690_kw.field_109163_f)) {
         var2 *= 1.0F - (float)(this.func_103390_b(C_100690_kw.field_109163_f).func_109192_c() + 1) * 0.2F;
      }

      if(this.func_103132_a(C_100664_afg.field_109019_h) && !C_100878_wh.func_110593_g(this)) {
         var2 /= 5.0F;
      }

      if(!this.field_103174_E) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean func_103798_b(C_100451_alf var1) {
      return this.field_103857_bK.func_104815_b(var1);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      C_100339_bp var2 = var1.func_107513_m("Inventory");
      this.field_103857_bK.func_104813_b(var2);
      this.field_103834_cb = var1.func_107519_n("Sleeping");
      this.field_103843_b = var1.func_107517_d("SleepTimer");
      this.field_103864_ci = var1.func_107512_g("XpP");
      this.field_103866_cg = var1.func_107514_e("XpLevel");
      this.field_103867_ch = var1.func_107514_e("XpTotal");
      if(this.field_103834_cb) {
         this.field_103870_cc = new C_100013_k(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
         this.func_103766_a(true, true, false);
      }

      if(var1.func_107516_b("SpawnX") && var1.func_107516_b("SpawnY") && var1.func_107516_b("SpawnZ")) {
         this.field_103844_c = new C_100013_k(var1.func_107514_e("SpawnX"), var1.func_107514_e("SpawnY"), var1.func_107514_e("SpawnZ"));
         this.field_103839_d = var1.func_107519_n("SpawnForced");
      }

      this.field_103861_bN.func_111572_a(var1);
      this.field_103869_cf.func_111594_b(var1);
      if(var1.func_107516_b("EnderItems")) {
         C_100339_bp var3 = var1.func_107513_m("EnderItems");
         this.field_103845_a.func_104777_a(var3);
      }

   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107530_a("Inventory", this.field_103857_bK.func_104822_a(new C_100339_bp()));
      var1.func_107509_a("Sleeping", this.field_103834_cb);
      var1.func_107532_a("SleepTimer", (short)this.field_103843_b);
      var1.func_107529_a("XpP", this.field_103864_ci);
      var1.func_107520_a("XpLevel", this.field_103866_cg);
      var1.func_107520_a("XpTotal", this.field_103867_ch);
      if(this.field_103844_c != null) {
         var1.func_107520_a("SpawnX", this.field_103844_c.field_105273_a);
         var1.func_107520_a("SpawnY", this.field_103844_c.field_105271_b);
         var1.func_107520_a("SpawnZ", this.field_103844_c.field_105272_c);
         var1.func_107509_a("SpawnForced", this.field_103839_d);
      }

      this.field_103861_bN.func_111581_b(var1);
      this.field_103869_cf.func_111589_a(var1);
      var1.func_107530_a("EnderItems", this.field_103845_a.func_104775_g());
   }

   public void func_103785_a(C_100716_kl var1) {}

   public void func_103770_c(int var1, int var2, int var3) {}

   public void func_103815_d(int var1, int var2, int var3) {}

   public void func_103825_b(int var1, int var2, int var3) {}

   public float func_103102_e() {
      return 0.12F;
   }

   protected void func_103786_e_() {
      this.field_103181_M = 1.62F;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(this.field_103869_cf.field_111601_a && !var1.func_109220_e()) {
         return false;
      } else {
         this.field_103487_bC = 0;
         if(this.func_103330_aT() <= 0) {
            return false;
         } else {
            if(this.func_103369_bt() && !this.field_103229_p.field_109557_J) {
               this.func_103766_a(true, true, false);
            }

            if(var1.func_109214_n()) {
               if(this.field_103229_p.field_109578_t == 0) {
                  var2 = 0;
               }

               if(this.field_103229_p.field_109578_t == 1) {
                  var2 = var2 / 2 + 1;
               }

               if(this.field_103229_p.field_109578_t == 3) {
                  var2 = var2 * 3 / 2;
               }
            }

            if(var2 == 0) {
               return false;
            } else {
               C_100730_lb var3 = var1.func_109210_g();
               if(var3 instanceof C_101089_qi && ((C_101089_qi)var3).field_104675_c != null) {
                  var3 = ((C_101089_qi)var3).field_104675_c;
               }

               if(var3 instanceof C_100595_ln) {
                  this.func_103788_a((C_100595_ln)var3, false);
               }

               this.func_103813_a(C_100818_jh.field_110047_x, var2);
               return super.func_103085_a(var1, var2);
            }
         }
      }
   }

   protected int func_103351_c(C_100698_ks var1, int var2) {
      int var3 = super.func_103351_c(var1, var2);
      if(var3 <= 0) {
         return 0;
      } else {
         int var4 = C_100878_wh.func_110598_a(this.field_103857_bK.field_104830_b, var1);
         if(var4 > 20) {
            var4 = 20;
         }

         if(var4 > 0 && var4 <= 20) {
            int var5 = 25 - var4;
            int var6 = var3 * var5 + this.field_103430_aS;
            var3 = var6 / 25;
            this.field_103430_aS = var6 % 25;
         }

         return var3;
      }
   }

   protected boolean func_103771_h() {
      return false;
   }

   protected void func_103788_a(C_100595_ln var1, boolean var2) {
      if(!(var1 instanceof C_100583_pl) && !(var1 instanceof C_101107_pp)) {
         if(var1 instanceof C_100546_ot) {
            C_100546_ot var3 = (C_100546_ot)var1;
            if(var3.func_103552_m() && this.field_103847_bT.equals(var3.func_103556_o())) {
               return;
            }
         }

         if(!(var1 instanceof C_101095_qg) || this.func_103771_h()) {
            List var6 = this.field_103229_p.func_109518_a(C_100546_ot.class, C_100412_amr.func_107892_a().func_107844_a(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103221_t + 1.0D, this.field_103219_u + 1.0D, this.field_103217_v + 1.0D).func_107895_b(16.0D, 4.0D, 16.0D));
            Iterator var4 = var6.iterator();

            while(var4.hasNext()) {
               C_100546_ot var5 = (C_100546_ot)var4.next();
               if(var5.func_103552_m() && var5.func_103498_l() == null && this.field_103847_bT.equals(var5.func_103556_o()) && (!var2 || !var5.func_103553_n())) {
                  var5.func_103557_h(false);
                  var5.func_103497_b(var1);
               }
            }

         }
      }
   }

   protected void func_103379_k(int var1) {
      this.field_103857_bK.func_104814_g(var1);
   }

   public int func_103350_aU() {
      return this.field_103857_bK.func_104819_k();
   }

   public float func_103814_bO() {
      int var1 = 0;
      C_100994_tv[] var2 = this.field_103857_bK.field_104830_b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100994_tv var5 = var2[var4];
         if(var5 != null) {
            ++var1;
         }
      }

      return (float)var1 / (float)this.field_103857_bK.field_104830_b.length;
   }

   protected void func_103363_d(C_100698_ks var1, int var2) {
      if(!this.field_103407_bt) {
         if(!var1.func_109228_c() && this.func_103325_be()) {
            var2 = 1 + var2 >> 1;
         }

         var2 = this.func_103306_b(var1, var2);
         var2 = this.func_103351_c(var1, var2);
         this.func_103792_j(var1.func_109206_d());
         this.field_103428_aQ -= var2;
      }
   }

   public void func_103810_a(C_100419_amg var1) {}

   public void func_103778_a(C_100420_amd var1) {}

   public void func_103826_a(C_100398_amm var1) {}

   public void func_103801_a(C_100424_ama var1) {}

   public void func_103763_a(C_100425_alz var1) {}

   public void func_103823_a(C_100891_wu var1) {}

   public void func_103800_d(C_100994_tv var1) {}

   public boolean func_103794_o(C_100730_lb var1) {
      if(var1.func_103134_c(this)) {
         return true;
      } else {
         C_100994_tv var2 = this.func_103780_bP();
         if(var2 != null && var1 instanceof C_100595_ln) {
            if(this.field_103869_cf.field_111597_d) {
               var2 = var2.func_111360_l();
            }

            if(var2.func_111361_a((C_100595_ln)var1)) {
               if(var2.field_111398_a <= 0 && !this.field_103869_cf.field_111597_d) {
                  this.func_103774_bQ();
               }

               return true;
            }
         }

         return false;
      }
   }

   public C_100994_tv func_103780_bP() {
      return this.field_103857_bK.func_104808_g();
   }

   public void func_103774_bQ() {
      this.field_103857_bK.func_103006_a(this.field_103857_bK.field_104831_c, (C_100994_tv)null);
   }

   public double func_103083_W() {
      return (double)(this.field_103181_M - 0.5F);
   }

   public void func_103775_p(C_100730_lb var1) {
      if(var1.func_103099_aq()) {
         int var2 = this.field_103857_bK.func_104807_a(var1);
         if(this.func_103300_a(C_100690_kw.field_109164_g)) {
            var2 += 3 << this.func_103390_b(C_100690_kw.field_109164_g).func_109192_c();
         }

         if(this.func_103300_a(C_100690_kw.field_109181_t)) {
            var2 -= 2 << this.func_103390_b(C_100690_kw.field_109181_t).func_109192_c();
         }

         int var3 = 0;
         int var4 = 0;
         if(var1 instanceof C_100595_ln) {
            var4 = C_100878_wh.func_110592_a(this, (C_100595_ln)var1);
            var3 += C_100878_wh.func_110588_b(this, (C_100595_ln)var1);
         }

         if(this.func_103147_ai()) {
            ++var3;
         }

         if(var2 > 0 || var4 > 0) {
            boolean var5 = this.field_103194_S > 0.0F && !this.field_103174_E && !this.func_103327_g_() && !this.func_103144_H() && !this.func_103300_a(C_100690_kw.field_109184_q) && this.field_103207_o == null && var1 instanceof C_100595_ln;
            if(var5) {
               var2 += this.field_103232_aa.nextInt(var2 / 2 + 2);
            }

            var2 += var4;
            boolean var6 = var1.func_103085_a(C_100698_ks.func_109223_a(this), var2);
            if(var6) {
               if(var3 > 0) {
                  var1.func_103071_g((double)(-C_100650_jv.func_108924_a(this.field_103236_z * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(C_100650_jv.func_108928_b(this.field_103236_z * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
                  this.field_103215_w *= 0.6D;
                  this.field_103238_y *= 0.6D;
                  this.func_103080_b(false);
               }

               if(var5) {
                  this.func_103790_b(var1);
               }

               if(var4 > 0) {
                  this.func_103807_c(var1);
               }

               if(var2 >= 18) {
                  this.func_103761_a(C_100822_iy.field_110052_E);
               }

               this.func_103364_k(var1);
            }

            C_100994_tv var7 = this.func_103780_bP();
            if(var7 != null && var1 instanceof C_100595_ln) {
               var7.func_111368_a((C_100595_ln)var1, this);
               if(var7.field_111398_a <= 0) {
                  this.func_103774_bQ();
               }
            }

            if(var1 instanceof C_100595_ln) {
               if(var1.func_103143_S()) {
                  this.func_103788_a((C_100595_ln)var1, true);
               }

               this.func_103813_a(C_100818_jh.field_110037_w, var2);
               int var8 = C_100878_wh.func_110581_c(this, (C_100595_ln)var1);
               if(var8 > 0 && var6) {
                  var1.func_103112_c(var8 * 4);
               }
            }

            this.func_103792_j(0.3F);
         }

      }
   }

   public void func_103790_b(C_100730_lb var1) {}

   public void func_103807_c(C_100730_lb var1) {}

   public void func_103791_bR() {}

   public void func_103121_x() {
      super.func_103121_x();
      this.field_103855_bL.func_111501_a(this);
      if(this.field_103856_bM != null) {
         this.field_103856_bM.func_111501_a(this);
      }

   }

   public boolean func_103150_T() {
      return !this.field_103834_cb && super.func_103150_T();
   }

   public boolean func_103806_bS() {
      return false;
   }

   public C_101094_qh func_103781_a(int var1, int var2, int var3) {
      if(!this.field_103229_p.field_109557_J) {
         if(this.func_103369_bt() || !this.func_103143_S()) {
            return C_101094_qh.field_111606_e;
         }

         if(!this.field_103229_p.field_109576_v.func_112390_d()) {
            return C_101094_qh.field_111607_b;
         }

         if(this.field_103229_p.func_109402_t()) {
            return C_101094_qh.field_111608_c;
         }

         if(Math.abs(this.field_103221_t - (double)var1) > 3.0D || Math.abs(this.field_103219_u - (double)var2) > 2.0D || Math.abs(this.field_103217_v - (double)var3) > 3.0D) {
            return C_101094_qh.field_111605_d;
         }

         double var4 = 8.0D;
         double var6 = 5.0D;
         List var8 = this.field_103229_p.func_109518_a(C_101110_ps.class, C_100412_amr.func_107892_a().func_107844_a((double)var1 - var4, (double)var2 - var6, (double)var3 - var4, (double)var1 + var4, (double)var2 + var6, (double)var3 + var4));
         if(!var8.isEmpty()) {
            return C_101094_qh.field_111603_f;
         }
      }

      this.func_103161_a(0.2F, 0.2F);
      this.field_103181_M = 0.2F;
      if(this.field_103229_p.func_109461_e(var1, var2, var3)) {
         int var9 = this.field_103229_p.func_109357_g(var1, var2, var3);
         int var5 = C_100255_ahq.func_106302_e(var9);
         float var10 = 0.5F;
         float var7 = 0.5F;
         switch(var5) {
         case 0:
            var7 = 0.9F;
            break;
         case 1:
            var10 = 0.1F;
            break;
         case 2:
            var7 = 0.1F;
            break;
         case 3:
            var10 = 0.9F;
         }

         this.func_103765_u(var5);
         this.func_103163_b((double)((float)var1 + var10), (double)((float)var2 + 0.9375F), (double)((float)var3 + var7));
      } else {
         this.func_103163_b((double)((float)var1 + 0.5F), (double)((float)var2 + 0.9375F), (double)((float)var3 + 0.5F));
      }

      this.field_103834_cb = true;
      this.field_103843_b = 0;
      this.field_103870_cc = new C_100013_k(var1, var2, var3);
      this.field_103215_w = this.field_103238_y = this.field_103240_x = 0.0D;
      if(!this.field_103229_p.field_109557_J) {
         this.field_103229_p.func_109416_c();
      }

      return C_101094_qh.field_111609_a;
   }

   private void func_103765_u(int var1) {
      this.field_103871_cd = 0.0F;
      this.field_103868_ce = 0.0F;
      switch(var1) {
      case 0:
         this.field_103868_ce = -1.8F;
         break;
      case 1:
         this.field_103871_cd = 1.8F;
         break;
      case 2:
         this.field_103868_ce = 1.8F;
         break;
      case 3:
         this.field_103871_cd = -1.8F;
      }

   }

   public void func_103766_a(boolean var1, boolean var2, boolean var3) {
      this.func_103161_a(0.6F, 1.8F);
      this.func_103786_e_();
      C_100013_k var4 = this.field_103870_cc;
      C_100013_k var5 = this.field_103870_cc;
      if(var4 != null && this.field_103229_p.func_109349_a(var4.field_105273_a, var4.field_105271_b, var4.field_105272_c) == C_100451_alf.field_106089_V.field_106162_cm) {
         C_100255_ahq.func_106316_a(this.field_103229_p, var4.field_105273_a, var4.field_105271_b, var4.field_105272_c, false);
         var5 = C_100255_ahq.func_106317_b(this.field_103229_p, var4.field_105273_a, var4.field_105271_b, var4.field_105272_c, 0);
         if(var5 == null) {
            var5 = new C_100013_k(var4.field_105273_a, var4.field_105271_b + 1, var4.field_105272_c);
         }

         this.func_103163_b((double)((float)var5.field_105273_a + 0.5F), (double)((float)var5.field_105271_b + this.field_103181_M + 0.1F), (double)((float)var5.field_105272_c + 0.5F));
      }

      this.field_103834_cb = false;
      if(!this.field_103229_p.field_109557_J && var2) {
         this.field_103229_p.func_109416_c();
      }

      if(var1) {
         this.field_103843_b = 0;
      } else {
         this.field_103843_b = 100;
      }

      if(var3) {
         this.func_103831_a(this.field_103870_cc, false);
      }

   }

   private boolean func_103822_j() {
      return this.field_103229_p.func_109349_a(this.field_103870_cc.field_105273_a, this.field_103870_cc.field_105271_b, this.field_103870_cc.field_105272_c) == C_100451_alf.field_106089_V.field_106162_cm;
   }

   public static C_100013_k func_103809_a(C_100873_xe var0, C_100013_k var1, boolean var2) {
      C_101331_yx var3 = var0.func_109479_H();
      var3.func_108660_c(var1.field_105273_a - 3 >> 4, var1.field_105272_c - 3 >> 4);
      var3.func_108660_c(var1.field_105273_a + 3 >> 4, var1.field_105272_c - 3 >> 4);
      var3.func_108660_c(var1.field_105273_a - 3 >> 4, var1.field_105272_c + 3 >> 4);
      var3.func_108660_c(var1.field_105273_a + 3 >> 4, var1.field_105272_c + 3 >> 4);
      if(var0.func_109349_a(var1.field_105273_a, var1.field_105271_b, var1.field_105272_c) != C_100451_alf.field_106089_V.field_106162_cm) {
         return var2 && var0.func_109352_c(var1.field_105273_a, var1.field_105271_b, var1.field_105272_c) && var0.func_109352_c(var1.field_105273_a, var1.field_105271_b + 1, var1.field_105272_c)?var1:null;
      } else {
         C_100013_k var4 = C_100255_ahq.func_106317_b(var0, var1.field_105273_a, var1.field_105271_b, var1.field_105272_c, 0);
         return var4;
      }
   }

   public float func_103772_bT() {
      if(this.field_103870_cc != null) {
         int var1 = this.field_103229_p.func_109357_g(this.field_103870_cc.field_105273_a, this.field_103870_cc.field_105271_b, this.field_103870_cc.field_105272_c);
         int var2 = C_100255_ahq.func_106302_e(var1);
         switch(var2) {
         case 0:
            return 90.0F;
         case 1:
            return 0.0F;
         case 2:
            return 270.0F;
         case 3:
            return 180.0F;
         }
      }

      return 0.0F;
   }

   public boolean func_103369_bt() {
      return this.field_103834_cb;
   }

   public boolean func_103795_bU() {
      return this.field_103834_cb && this.field_103843_b >= 100;
   }

   public int func_103787_bV() {
      return this.field_103843_b;
   }

   protected boolean func_103797_s(int var1) {
      return (this.field_103234_ag.func_108842_a(16) & 1 << var1) != 0;
   }

   protected void func_103768_b(int var1, boolean var2) {
      byte var3 = this.field_103234_ag.func_108842_a(16);
      if(var2) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var3 | 1 << var1)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var3 & ~(1 << var1))));
      }

   }

   public void func_103773_b(String var1) {}

   public C_100013_k func_103802_bW() {
      return this.field_103844_c;
   }

   public boolean func_103817_bX() {
      return this.field_103839_d;
   }

   public void func_103831_a(C_100013_k var1, boolean var2) {
      if(var1 != null) {
         this.field_103844_c = new C_100013_k(var1);
         this.field_103839_d = var2;
      } else {
         this.field_103844_c = null;
         this.field_103839_d = false;
      }

   }

   public void func_103761_a(C_100809_jc var1) {
      this.func_103813_a(var1, 1);
   }

   public void func_103813_a(C_100809_jc var1, int var2) {}

   protected void func_103343_bf() {
      super.func_103343_bf();
      this.func_103813_a(C_100818_jh.field_110039_u, 1);
      if(this.func_103147_ai()) {
         this.func_103792_j(0.8F);
      } else {
         this.func_103792_j(0.2F);
      }

   }

   public void func_103310_e(float var1, float var2) {
      double var3 = this.field_103221_t;
      double var5 = this.field_103219_u;
      double var7 = this.field_103217_v;
      if(this.field_103869_cf.field_111599_b && this.field_103207_o == null) {
         double var9 = this.field_103240_x;
         float var11 = this.field_103440_aN;
         this.field_103440_aN = this.field_103869_cf.func_111591_a();
         super.func_103310_e(var1, var2);
         this.field_103240_x = var9 * 0.6D;
         this.field_103440_aN = var11;
      } else {
         super.func_103310_e(var1, var2);
      }

      this.func_103769_j(this.field_103221_t - var3, this.field_103219_u - var5, this.field_103217_v - var7);
   }

   public void func_103769_j(double var1, double var3, double var5) {
      if(this.field_103207_o == null) {
         int var7;
         if(this.func_103132_a(C_100664_afg.field_109019_h)) {
            var7 = Math.round(C_100650_jv.func_108915_a(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.func_103813_a(C_100818_jh.field_110043_q, var7);
               this.func_103792_j(0.015F * (float)var7 * 0.01F);
            }
         } else if(this.func_103144_H()) {
            var7 = Math.round(C_100650_jv.func_108915_a(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.func_103813_a(C_100818_jh.field_110032_m, var7);
               this.func_103792_j(0.015F * (float)var7 * 0.01F);
            }
         } else if(this.func_103327_g_()) {
            if(var3 > 0.0D) {
               this.func_103813_a(C_100818_jh.field_110030_o, (int)Math.round(var3 * 100.0D));
            }
         } else if(this.field_103174_E) {
            var7 = Math.round(C_100650_jv.func_108915_a(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 0) {
               this.func_103813_a(C_100818_jh.field_110031_l, var7);
               if(this.func_103147_ai()) {
                  this.func_103792_j(0.099999994F * (float)var7 * 0.01F);
               } else {
                  this.func_103792_j(0.01F * (float)var7 * 0.01F);
               }
            }
         } else {
            var7 = Math.round(C_100650_jv.func_108915_a(var1 * var1 + var5 * var5) * 100.0F);
            if(var7 > 25) {
               this.func_103813_a(C_100818_jh.field_110044_p, var7);
            }
         }

      }
   }

   private void func_103782_k(double var1, double var3, double var5) {
      if(this.field_103207_o != null) {
         int var7 = Math.round(C_100650_jv.func_108915_a(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if(var7 > 0) {
            if(this.field_103207_o instanceof C_100590_ph) {
               this.func_103813_a(C_100818_jh.field_110042_r, var7);
               if(this.field_103840_e == null) {
                  this.field_103840_e = new C_100013_k(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
               } else if((double)this.field_103840_e.func_105268_e(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) >= 1000000.0D) {
                  this.func_103813_a(C_100822_iy.field_110078_q, 1);
               }
            } else if(this.field_103207_o instanceof C_100572_pe) {
               this.func_103813_a(C_100818_jh.field_110041_s, var7);
            } else if(this.field_103207_o instanceof C_100537_on) {
               this.func_103813_a(C_100818_jh.field_110040_t, var7);
            }
         }
      }

   }

   protected void func_103124_a(float var1) {
      if(!this.field_103869_cf.field_111600_c) {
         if(var1 >= 2.0F) {
            this.func_103813_a(C_100818_jh.field_110029_n, (int)Math.round((double)var1 * 100.0D));
         }

         super.func_103124_a(var1);
      }
   }

   public void func_103079_a(C_100595_ln var1) {
      if(var1 instanceof C_100587_pn) {
         this.func_103761_a(C_100822_iy.field_110076_s);
      }

   }

   public int func_103324_b(C_100994_tv var1, int var2) {
      int var3 = super.func_103324_b(var1, var2);
      if(var1.field_111397_c == C_100992_tt.field_110897_aR.field_110891_cf && this.field_103862_cl != null) {
         var3 = var1.func_111362_c() + 16;
      } else {
         if(var1.func_111365_b().func_110758_b()) {
            return var1.func_111365_b().func_110751_a(var1.func_111367_j(), var2);
         }

         if(this.field_103837_f != null && var1.field_111397_c == C_100992_tt.field_110843_k.field_110891_cf) {
            int var4 = var1.func_111391_m() - this.field_103838_g;
            if(var4 >= 18) {
               return 133;
            }

            if(var4 > 13) {
               return 117;
            }

            if(var4 > 0) {
               return 101;
            }
         }
      }

      return var3;
   }

   public C_100994_tv func_103346_q(int var1) {
      return this.field_103857_bK.func_104798_f(var1);
   }

   protected void func_103339_bB() {}

   protected void func_103336_bC() {}

   public void func_103777_t(int var1) {
      this.field_103859_bQ += var1;
      int var2 = Integer.MAX_VALUE - this.field_103867_ch;
      if(var1 > var2) {
         var1 = var2;
      }

      this.field_103864_ci += (float)var1 / (float)this.func_103816_bY();

      for(this.field_103867_ch += var1; this.field_103864_ci >= 1.0F; this.field_103864_ci /= (float)this.func_103816_bY()) {
         this.field_103864_ci = (this.field_103864_ci - 1.0F) * (float)this.func_103816_bY();
         this.func_103804_a(1);
      }

   }

   public void func_103804_a(int var1) {
      this.field_103866_cg += var1;
      if(this.field_103866_cg < 0) {
         this.field_103866_cg = 0;
      }

      if(var1 > 0 && this.field_103866_cg % 5 == 0 && (float)this.field_103852_h < (float)this.field_103233_ab - 100.0F) {
         float var2 = this.field_103866_cg > 30?1.0F:(float)this.field_103866_cg / 30.0F;
         this.field_103229_p.func_109412_a(this, "random.levelup", var2 * 0.75F, 1.0F);
         this.field_103852_h = this.field_103233_ab;
      }

   }

   public int func_103816_bY() {
      return this.field_103866_cg >= 30?62 + (this.field_103866_cg - 30) * 7:(this.field_103866_cg >= 15?17 + (this.field_103866_cg - 15) * 3:17);
   }

   public void func_103792_j(float var1) {
      if(!this.field_103869_cf.field_111601_a) {
         if(!this.field_103229_p.field_109557_J) {
            this.field_103861_bN.func_111575_a(var1);
         }

      }
   }

   public C_101077_qx func_103819_bZ() {
      return this.field_103861_bN;
   }

   public boolean func_103821_f(boolean var1) {
      return (var1 || this.field_103861_bN.func_111582_c()) && !this.field_103869_cf.field_111601_a;
   }

   public boolean func_103827_ca() {
      return this.func_103330_aT() > 0 && this.func_103330_aT() < this.func_103378_aS();
   }

   public void func_103784_a(C_100994_tv var1, int var2) {
      if(var1 != this.field_103837_f) {
         this.field_103837_f = var1;
         this.field_103838_g = var2;
         if(!this.field_103229_p.field_109557_J) {
            this.func_103117_d(true);
         }

      }
   }

   public boolean func_103818_f(int var1, int var2, int var3) {
      if(this.field_103869_cf.field_111598_e) {
         return true;
      } else {
         int var4 = this.field_103229_p.func_109349_a(var1, var2, var3);
         if(var4 > 0 && this.func_103780_bP() != null) {
            C_100451_alf var5 = C_100451_alf.field_106118_p[var4];
            C_100994_tv var6 = this.func_103780_bP();
            if(var6.func_111385_b(var5) || var6.func_111369_a(var5) > 1.0F) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean func_103799_a(int var1, int var2, int var3, int var4, C_100994_tv var5) {
      return this.field_103869_cf.field_111598_e?true:(var5 != null?var5.func_111345_x():false);
   }

   protected int func_103299_a(C_101095_qg var1) {
      if(this.field_103229_p.func_109389_K().func_110281_b("keepInventory")) {
         return 0;
      } else {
         int var2 = this.field_103866_cg * 7;
         return var2 > 100?100:var2;
      }
   }

   protected boolean func_103385_aP() {
      return true;
   }

   public String func_103139_an() {
      return this.field_103847_bT;
   }

   public void func_103760_a(C_101095_qg var1, boolean var2) {
      if(var2) {
         this.field_103857_bK.func_104799_b(var1.field_103857_bK);
         this.field_103428_aQ = var1.field_103428_aQ;
         this.field_103861_bN = var1.field_103861_bN;
         this.field_103866_cg = var1.field_103866_cg;
         this.field_103867_ch = var1.field_103867_ch;
         this.field_103864_ci = var1.field_103864_ci;
         this.field_103859_bQ = var1.field_103859_bQ;
         this.field_103210_aq = var1.field_103210_aq;
      } else if(this.field_103229_p.func_109389_K().func_110281_b("keepInventory")) {
         this.field_103857_bK.func_104799_b(var1.field_103857_bK);
         this.field_103866_cg = var1.field_103866_cg;
         this.field_103867_ch = var1.field_103867_ch;
         this.field_103864_ci = var1.field_103864_ci;
         this.field_103859_bQ = var1.field_103859_bQ;
      }

      this.field_103845_a = var1.field_103845_a;
   }

   protected boolean func_103092_f_() {
      return !this.field_103869_cf.field_111599_b;
   }

   public void func_103805_o() {}

   public void func_103796_a(C_100836_xn var1) {}

   public String func_102909_c_() {
      return this.field_103847_bT;
   }

   public C_100361_be func_103783_s() {
      return C_100361_be.func_107654_a();
   }

   public String func_102908_a(String var1, Object ... var2) {
      return this.func_103783_s().func_107649_a(var1, var2);
   }

   public C_101053_rt func_103832_cb() {
      return this.field_103845_a;
   }

   public C_100994_tv func_103374_p(int var1) {
      return var1 == 0?this.field_103857_bK.func_104808_g():this.field_103857_bK.field_104830_b[var1 - 1];
   }

   public C_100994_tv func_103328_bA() {
      return this.field_103857_bK.func_104808_g();
   }

   public void func_103060_b(int var1, C_100994_tv var2) {
      this.field_103857_bK.field_104830_b[var1] = var2;
   }

   public C_100994_tv[] func_103127_ae() {
      return this.field_103857_bK.field_104830_b;
   }

   public boolean func_103764_cc() {
      return this.func_103797_s(1);
   }
}
