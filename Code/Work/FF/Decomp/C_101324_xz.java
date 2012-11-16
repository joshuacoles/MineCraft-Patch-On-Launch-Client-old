import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class C_101324_xz {

   public static final C_101324_xz[] field_112495_a = new C_101324_xz[256];
   public static final C_101324_xz field_112493_b = (new C_101349_yn(0)).func_112466_b(112).func_112448_a("Ocean").func_112450_b(-1.0F, 0.4F);
   public static final C_101324_xz field_112494_c = (new C_101347_yo(1)).func_112466_b(9286496).func_112448_a("Plains").func_112463_a(0.8F, 0.4F);
   public static final C_101324_xz field_112491_d = (new C_101312_yf(2)).func_112466_b(16421912).func_112448_a("Desert").func_112453_m().func_112463_a(2.0F, 0.0F).func_112450_b(0.1F, 0.2F);
   public static final C_101324_xz field_112492_e = (new C_101309_yg(3)).func_112466_b(6316128).func_112448_a("Extreme Hills").func_112450_b(0.3F, 1.5F).func_112463_a(0.2F, 0.3F);
   public static final C_101324_xz field_112489_f = (new C_101359_yi(4)).func_112466_b(353825).func_112448_a("Forest").func_112449_a(5159473).func_112463_a(0.7F, 0.8F);
   public static final C_101324_xz field_112490_g = (new C_101340_ys(5)).func_112466_b(747097).func_112448_a("Taiga").func_112449_a(5159473).func_112455_b().func_112463_a(0.05F, 0.8F).func_112450_b(0.1F, 0.4F);
   public static final C_101324_xz field_112502_h = (new C_101342_yr(6)).func_112466_b(522674).func_112448_a("Swampland").func_112449_a(9154376).func_112450_b(-0.2F, 0.1F).func_112463_a(0.8F, 0.9F);
   public static final C_101324_xz field_112503_i = (new C_101344_yq(7)).func_112466_b(255).func_112448_a("River").func_112450_b(-0.5F, 0.0F);
   public static final C_101324_xz field_112500_j = (new C_101357_yj(8)).func_112466_b(16711680).func_112448_a("Hell").func_112453_m().func_112463_a(2.0F, 0.0F);
   public static final C_101324_xz field_112501_k = (new C_101338_yt(9)).func_112466_b(8421631).func_112448_a("Sky").func_112453_m();
   public static final C_101324_xz field_112498_l = (new C_101349_yn(10)).func_112466_b(9474208).func_112448_a("FrozenOcean").func_112455_b().func_112450_b(-1.0F, 0.5F).func_112463_a(0.0F, 0.5F);
   public static final C_101324_xz field_112499_m = (new C_101344_yq(11)).func_112466_b(10526975).func_112448_a("FrozenRiver").func_112455_b().func_112450_b(-0.5F, 0.0F).func_112463_a(0.0F, 0.5F);
   public static final C_101324_xz field_112496_n = (new C_101355_yk(12)).func_112466_b(16777215).func_112448_a("Ice Plains").func_112455_b().func_112463_a(0.0F, 0.5F);
   public static final C_101324_xz field_112497_o = (new C_101355_yk(13)).func_112466_b(10526880).func_112448_a("Ice Mountains").func_112455_b().func_112450_b(0.3F, 1.3F).func_112463_a(0.0F, 0.5F);
   public static final C_101324_xz field_112511_p = (new C_101351_ym(14)).func_112466_b(16711935).func_112448_a("MushroomIsland").func_112463_a(0.9F, 1.0F).func_112450_b(0.2F, 1.0F);
   public static final C_101324_xz field_112510_q = (new C_101351_ym(15)).func_112466_b(10486015).func_112448_a("MushroomIslandShore").func_112463_a(0.9F, 1.0F).func_112450_b(-1.0F, 0.1F);
   public static final C_101324_xz field_112509_r = (new C_101329_xy(16)).func_112466_b(16440917).func_112448_a("Beach").func_112463_a(0.8F, 0.4F).func_112450_b(0.0F, 0.1F);
   public static final C_101324_xz field_112508_s = (new C_101312_yf(17)).func_112466_b(13786898).func_112448_a("DesertHills").func_112453_m().func_112463_a(2.0F, 0.0F).func_112450_b(0.3F, 0.8F);
   public static final C_101324_xz field_112507_t = (new C_101359_yi(18)).func_112466_b(2250012).func_112448_a("ForestHills").func_112449_a(5159473).func_112463_a(0.7F, 0.8F).func_112450_b(0.3F, 0.7F);
   public static final C_101324_xz field_112506_u = (new C_101340_ys(19)).func_112466_b(1456435).func_112448_a("TaigaHills").func_112455_b().func_112449_a(5159473).func_112463_a(0.05F, 0.8F).func_112450_b(0.3F, 0.8F);
   public static final C_101324_xz field_112505_v = (new C_101309_yg(20)).func_112466_b(7501978).func_112448_a("Extreme Hills Edge").func_112450_b(0.2F, 0.8F).func_112463_a(0.2F, 0.3F);
   public static final C_101324_xz field_112504_w = (new C_101353_yl(21)).func_112466_b(5470985).func_112448_a("Jungle").func_112449_a(5470985).func_112463_a(1.2F, 0.9F).func_112450_b(0.2F, 0.4F);
   public static final C_101324_xz field_112514_x = (new C_101353_yl(22)).func_112466_b(2900485).func_112448_a("JungleHills").func_112449_a(5470985).func_112463_a(1.2F, 0.9F).func_112450_b(1.8F, 0.5F);
   public String field_112513_y;
   public int field_112512_z;
   public byte field_112473_A;
   public byte field_112474_B;
   public int field_112475_C;
   public float field_112469_D;
   public float field_112470_E;
   public float field_112471_F;
   public float field_112472_G;
   public int field_112480_H;
   public C_101315_yd field_112481_I;
   protected List field_112482_J;
   protected List field_112483_K;
   protected List field_112476_L;
   protected List field_112477_M;
   private boolean field_112487_S;
   private boolean field_112484_T;
   public final int field_112478_N;
   protected C_100509_abj field_112479_O;
   protected C_100552_aaf field_112486_P;
   protected C_100554_aag field_112485_Q;
   protected C_100506_abh field_112488_R;


   protected C_101324_xz(int var1) {
      this.field_112473_A = (byte)C_100451_alf.field_106121_x.field_106162_cm;
      this.field_112474_B = (byte)C_100451_alf.field_106120_y.field_106162_cm;
      this.field_112475_C = 5169201;
      this.field_112469_D = 0.1F;
      this.field_112470_E = 0.3F;
      this.field_112471_F = 0.5F;
      this.field_112472_G = 0.5F;
      this.field_112480_H = 16777215;
      this.field_112482_J = new ArrayList();
      this.field_112483_K = new ArrayList();
      this.field_112476_L = new ArrayList();
      this.field_112477_M = new ArrayList();
      this.field_112484_T = true;
      this.field_112479_O = new C_100509_abj(false);
      this.field_112486_P = new C_100552_aaf(false);
      this.field_112485_Q = new C_100554_aag(false);
      this.field_112488_R = new C_100506_abh();
      this.field_112478_N = var1;
      field_112495_a[var1] = this;
      this.field_112481_I = this.func_112454_a();
      this.field_112483_K.add(new C_101316_ya(C_100555_oo.class, 12, 4, 4));
      this.field_112483_K.add(new C_101316_ya(C_100537_on.class, 10, 4, 4));
      this.field_112483_K.add(new C_101316_ya(C_100540_oi.class, 10, 4, 4));
      this.field_112483_K.add(new C_101316_ya(C_100541_oj.class, 8, 4, 4));
      this.field_112482_J.add(new C_101316_ya(C_101101_py.class, 10, 4, 4));
      this.field_112482_J.add(new C_101316_ya(C_101097_qa.class, 10, 4, 4));
      this.field_112482_J.add(new C_101316_ya(C_101106_pw.class, 10, 4, 4));
      this.field_112482_J.add(new C_101316_ya(C_100583_pl.class, 10, 4, 4));
      this.field_112482_J.add(new C_101316_ya(C_101100_px.class, 10, 4, 4));
      this.field_112482_J.add(new C_101316_ya(C_100585_pm.class, 1, 1, 4));
      this.field_112476_L.add(new C_101316_ya(C_100558_oq.class, 10, 4, 4));
      this.field_112477_M.add(new C_101316_ya(C_100543_og.class, 10, 8, 8));
   }

   protected C_101315_yd func_112454_a() {
      return new C_101315_yd(this);
   }

   private C_101324_xz func_112463_a(float var1, float var2) {
      if(var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.field_112471_F = var1;
         this.field_112472_G = var2;
         return this;
      }
   }

   private C_101324_xz func_112450_b(float var1, float var2) {
      this.field_112469_D = var1;
      this.field_112470_E = var2;
      return this;
   }

   private C_101324_xz func_112453_m() {
      this.field_112484_T = false;
      return this;
   }

   public C_100562_aan func_112447_a(Random var1) {
      return (C_100562_aan)(var1.nextInt(10) == 0?this.field_112486_P:this.field_112479_O);
   }

   public C_100562_aan func_112458_b(Random var1) {
      return new C_100508_abi(C_100451_alf.field_106244_aa.field_106162_cm, 1);
   }

   protected C_101324_xz func_112455_b() {
      this.field_112487_S = true;
      return this;
   }

   protected C_101324_xz func_112448_a(String var1) {
      this.field_112513_y = var1;
      return this;
   }

   protected C_101324_xz func_112449_a(int var1) {
      this.field_112475_C = var1;
      return this;
   }

   protected C_101324_xz func_112466_b(int var1) {
      this.field_112512_z = var1;
      return this;
   }

   public int func_112452_a(float var1) {
      var1 /= 3.0F;
      if(var1 < -1.0F) {
         var1 = -1.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return Color.getHSBColor(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F).getRGB();
   }

   public List func_112460_a(C_100594_lo var1) {
      return var1 == C_100594_lo.field_108778_a?this.field_112482_J:(var1 == C_100594_lo.field_108776_b?this.field_112483_K:(var1 == C_100594_lo.field_108774_d?this.field_112476_L:(var1 == C_100594_lo.field_108777_c?this.field_112477_M:null)));
   }

   public boolean func_112468_c() {
      return this.field_112487_S;
   }

   public boolean func_112462_d() {
      return this.field_112487_S?false:this.field_112484_T;
   }

   public boolean func_112459_e() {
      return this.field_112472_G > 0.85F;
   }

   public float func_112464_f() {
      return 0.1F;
   }

   public final int func_112467_g() {
      return (int)(this.field_112472_G * 65536.0F);
   }

   public final int func_112457_h() {
      return (int)(this.field_112471_F * 65536.0F);
   }

   public final float func_112451_i() {
      return this.field_112472_G;
   }

   public final float func_112465_j() {
      return this.field_112471_F;
   }

   public void func_112456_a(C_100873_xe var1, Random var2, int var3, int var4) {
      this.field_112481_I.func_112542_a(var1, var2, var3, var4);
   }

   public int func_112461_k() {
      double var1 = (double)C_100650_jv.func_108914_a(this.func_112465_j(), 0.0F, 1.0F);
      double var3 = (double)C_100650_jv.func_108914_a(this.func_112451_i(), 0.0F, 1.0F);
      return C_100875_xd.func_110398_a(var1, var3);
   }

   public int func_112446_l() {
      double var1 = (double)C_100650_jv.func_108914_a(this.func_112465_j(), 0.0F, 1.0F);
      double var3 = (double)C_100650_jv.func_108914_a(this.func_112451_i(), 0.0F, 1.0F);
      return C_100866_xa.func_110297_a(var1, var3);
   }

}
