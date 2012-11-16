import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100762_ih extends C_101095_qg implements C_101070_re {

   private C_100361_be field_104530_cm = new C_100361_be("en_US");
   public C_100801_im field_104518_a;
   public C_101445_MinecraftServer field_104516_b;
   public C_100793_ii field_104517_c;
   public double field_104514_d;
   public double field_104515_e;
   public final List field_104512_f = new LinkedList();
   public final List field_104513_g = new LinkedList();
   private int field_104531_cn = -99999999;
   private int field_104528_co = -99999999;
   private boolean field_104529_cp = true;
   private int field_104526_cq = -99999999;
   private int field_104527_cr = 60;
   private int field_104525_cs = 0;
   private int field_104523_ct = 0;
   private boolean field_104521_cu = true;
   private int field_104520_cv = 0;
   public boolean field_104522_h;
   public int field_104524_i;
   public boolean field_104519_j = false;


   public C_100762_ih(C_101445_MinecraftServer var1, C_100873_xe var2, String var3, C_100793_ii var4) {
      super(var2);
      var4.field_109809_b = this;
      this.field_104517_c = var4;
      this.field_104525_cs = var1.func_104931_ad().func_105715_o();
      C_100013_k var5 = var2.func_109381_G();
      int var6 = var5.field_105273_a;
      int var7 = var5.field_105272_c;
      int var8 = var5.field_105271_b;
      if(!var2.field_109576_v.field_112394_f && var2.func_109429_J().func_107135_r() != C_100836_xn.field_110096_d) {
         int var9 = Math.max(5, var1.func_104886_ak() - 6);
         var6 += this.field_103232_aa.nextInt(var9 * 2) - var9;
         var7 += this.field_103232_aa.nextInt(var9 * 2) - var9;
         var8 = var2.func_109459_i(var6, var7);
      }

      this.func_103055_b((double)var6 + 0.5D, (double)var8, (double)var7 + 0.5D, 0.0F, 0.0F);
      this.field_104516_b = var1;
      this.field_103197_X = 0.0F;
      this.field_103847_bT = var3;
      this.field_103181_M = 0.0F;
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      if(var1.func_107516_b("playerGameType")) {
         this.field_104517_c.func_109795_a(C_100836_xn.func_110086_a(var1.func_107514_e("playerGameType")));
      }

   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("playerGameType", this.field_104517_c.func_109797_b().func_110090_a());
   }

   public void func_103804_a(int var1) {
      super.func_103804_a(var1);
      this.field_104526_cq = -1;
   }

   public void func_104508_d_() {
      this.field_103856_bM.func_111507_a(this);
   }

   protected void func_103786_e_() {
      this.field_103181_M = 0.0F;
   }

   public float func_103102_e() {
      return 1.62F;
   }

   public void func_103165_j_() {
      this.field_104517_c.func_109794_a();
      --this.field_104527_cr;
      this.field_103856_bM.func_111506_b();
      if(!this.field_104512_f.isEmpty()) {
         ArrayList var1 = new ArrayList();
         Iterator var2 = this.field_104512_f.iterator();
         ArrayList var3 = new ArrayList();

         while(var2.hasNext() && var1.size() < 5) {
            C_100858_wx var4 = (C_100858_wx)var2.next();
            var2.remove();
            if(var4 != null && this.field_103229_p.func_109461_e(var4.field_110239_a << 4, 0, var4.field_110238_b << 4)) {
               var1.add(this.field_103229_p.func_109440_e(var4.field_110239_a, var4.field_110238_b));
               var3.addAll(((C_100765_ie)this.field_103229_p).func_109613_b(var4.field_110239_a * 16, 0, var4.field_110238_b * 16, var4.field_110239_a * 16 + 16, 256, var4.field_110238_b * 16 + 16));
            }
         }

         if(!var1.isEmpty()) {
            this.field_104518_a.func_107009_b(new C_100250_dl(var1));
            Iterator var9 = var3.iterator();

            while(var9.hasNext()) {
               C_100398_amm var5 = (C_100398_amm)var9.next();
               this.func_104507_b(var5);
            }
         }
      }

      if(!this.field_104513_g.isEmpty()) {
         int var6 = Math.min(this.field_104513_g.size(), 127);
         int[] var7 = new int[var6];
         Iterator var8 = this.field_104513_g.iterator();
         int var10 = 0;

         while(var8.hasNext() && var10 < var6) {
            var7[var10++] = ((Integer)var8.next()).intValue();
            var8.remove();
         }

         this.field_104518_a.func_107009_b(new C_100285_ee(var7));
      }

   }

   public void func_104509_g() {
      super.func_103165_j_();

      for(int var1 = 0; var1 < this.field_103857_bK.func_103003_k_(); ++var1) {
         C_100994_tv var2 = this.field_103857_bK.func_103007_a(var1);
         if(var2 != null && C_100992_tt.field_110834_e[var2.field_111397_c].func_110796_f() && this.field_104518_a.func_107012_e() <= 5) {
            C_100219_dx var3 = ((C_101037_sp)C_100992_tt.field_110834_e[var2.field_111397_c]).func_111040_c(var2, this.field_103229_p, this);
            if(var3 != null) {
               this.field_104518_a.func_107009_b(var3);
            }
         }
      }

      if(this.func_103330_aT() != this.field_104531_cn || this.field_104528_co != this.field_103861_bN.func_111578_a() || this.field_103861_bN.func_111577_e() == 0.0F != this.field_104529_cp) {
         this.field_104518_a.func_107009_b(new C_100295_ep(this.func_103330_aT(), this.field_103861_bN.func_111578_a(), this.field_103861_bN.func_111577_e()));
         this.field_104531_cn = this.func_103330_aT();
         this.field_104528_co = this.field_103861_bN.func_111578_a();
         this.field_104529_cp = this.field_103861_bN.func_111577_e() == 0.0F;
      }

      if(this.field_103867_ch != this.field_104526_cq) {
         this.field_104526_cq = this.field_103867_ch;
         this.field_104518_a.func_107009_b(new C_100297_eo(this.field_103864_ci, this.field_103867_ch, this.field_103866_cg));
      }

   }

   public void func_103311_a(C_100698_ks var1) {
      this.field_104516_b.func_104931_ad().func_105733_a(new C_100392_cm(var1.func_109217_b(this)));
      if(!this.field_103229_p.func_109389_K().func_110281_b("keepInventory")) {
         this.field_103857_bK.func_104823_l();
      }

   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(this.field_104527_cr > 0) {
         return false;
      } else {
         if(!this.field_104516_b.func_104914_X() && var1 instanceof C_100700_kt) {
            C_100730_lb var3 = var1.func_109210_g();
            if(var3 instanceof C_101095_qg) {
               return false;
            }

            if(var3 instanceof C_101089_qi) {
               C_101089_qi var4 = (C_101089_qi)var3;
               if(var4.field_104675_c instanceof C_101095_qg) {
                  return false;
               }
            }
         }

         return super.func_103085_a(var1, var2);
      }
   }

   protected boolean func_103771_h() {
      return this.field_104516_b.func_104914_X();
   }

   public void func_103090_b(int var1) {
      if(this.field_103224_ap == 1 && var1 == 1) {
         this.func_103761_a(C_100822_iy.field_110056_C);
         this.field_103229_p.func_109383_e(this);
         this.field_104519_j = true;
         this.field_104518_a.func_107009_b(new C_100240_df(4, 0));
      } else {
         if(this.field_103224_ap == 1 && var1 == 0) {
            this.func_103761_a(C_100822_iy.field_110055_B);
            C_100013_k var2 = this.field_104516_b.func_104879_a(var1).func_109615_l();
            if(var2 != null) {
               this.field_104518_a.func_107013_a((double)var2.field_105273_a, (double)var2.field_105271_b, (double)var2.field_105272_c, 0.0F, 0.0F);
            }

            var1 = 1;
         } else {
            this.func_103761_a(C_100822_iy.field_110082_x);
         }

         this.field_104516_b.func_104931_ad().func_105716_a(this, var1);
         this.field_104526_cq = -1;
         this.field_104531_cn = -1;
         this.field_104528_co = -1;
      }

   }

   private void func_104507_b(C_100398_amm var1) {
      if(var1 != null) {
         C_100219_dx var2 = var1.func_102924_l();
         if(var2 != null) {
            this.field_104518_a.func_107009_b(var2);
         }
      }

   }

   public void func_103397_a(C_100730_lb var1, int var2) {
      super.func_103397_a(var1, var2);
      this.field_103856_bM.func_111506_b();
   }

   public C_101094_qh func_103781_a(int var1, int var2, int var3) {
      C_101094_qh var4 = super.func_103781_a(var1, var2, var3);
      if(var4 == C_101094_qh.field_111609_a) {
         C_100363_dc var5 = new C_100363_dc(this, 0, var1, var2, var3);
         this.func_104506_p().func_109617_p().func_109780_a(this, var5);
         this.field_104518_a.func_107013_a(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);
         this.field_104518_a.func_107009_b(var5);
      }

      return var4;
   }

   public void func_103766_a(boolean var1, boolean var2, boolean var3) {
      if(this.func_103369_bt()) {
         this.func_104506_p().func_109617_p().func_109786_b(this, new C_100401_cj(this, 3));
      }

      super.func_103766_a(var1, var2, var3);
      if(this.field_104518_a != null) {
         this.field_104518_a.func_107013_a(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);
      }

   }

   public void func_103064_a(C_100730_lb var1) {
      super.func_103064_a(var1);
      this.field_104518_a.func_107009_b(new C_100309_eq(this, this.field_103207_o));
      this.field_104518_a.func_107013_a(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);
   }

   protected void func_103120_a(double var1, boolean var3) {}

   public void func_104503_b(double var1, boolean var3) {
      super.func_103120_a(var1, var3);
   }

   private void func_104500_cd() {
      this.field_104520_cv = this.field_104520_cv % 100 + 1;
   }

   public void func_103825_b(int var1, int var2, int var3) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 1, "Crafting", 9));
      this.field_103856_bM = new C_101067_rh(this.field_103857_bK, this.field_103229_p, var1, var2, var3);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103770_c(int var1, int var2, int var3) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 4, "Enchanting", 9));
      this.field_103856_bM = new C_101066_ri(this.field_103857_bK, this.field_103229_p, var1, var2, var3);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103815_d(int var1, int var2, int var3) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 8, "Repairing", 9));
      this.field_103856_bM = new C_101054_ru(this.field_103857_bK, this.field_103229_p, var1, var2, var3, this);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103785_a(C_100716_kl var1) {
      if(this.field_103856_bM != this.field_103855_bL) {
         this.func_103808_i();
      }

      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 0, var1.func_103005_b(), var1.func_103003_k_()));
      this.field_103856_bM = new C_101069_rf(this.field_103857_bK, var1);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103810_a(C_100419_amg var1) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 2, var1.func_103005_b(), var1.func_103003_k_()));
      this.field_103856_bM = new C_101063_rl(this.field_103857_bK, var1);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103778_a(C_100420_amd var1) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 3, var1.func_103005_b(), var1.func_103003_k_()));
      this.field_103856_bM = new C_101049_sa(this.field_103857_bK, var1);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103801_a(C_100424_ama var1) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 5, var1.func_103005_b(), var1.func_103003_k_()));
      this.field_103856_bM = new C_101073_rb(this.field_103857_bK, var1);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103763_a(C_100425_alz var1) {
      this.func_104500_cd();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 7, var1.func_103005_b(), var1.func_103003_k_()));
      this.field_103856_bM = new C_101076_qz(this.field_103857_bK, var1);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
   }

   public void func_103823_a(C_100891_wu var1) {
      this.func_104500_cd();
      this.field_103856_bM = new C_101051_rr(this.field_103857_bK, var1, this.field_103229_p);
      this.field_103856_bM.field_111514_c = this.field_104520_cv;
      this.field_103856_bM.func_111507_a(this);
      C_101059_rq var2 = ((C_101051_rr)this.field_103856_bM).func_111517_d();
      this.field_104518_a.func_107009_b(new C_100374_cw(this.field_104520_cv, 6, var2.func_103005_b(), var2.func_103003_k_()));
      C_100859_ww var3 = var1.func_103584_b(this);
      if(var3 != null) {
         try {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DataOutputStream var5 = new DataOutputStream(var4);
            var5.writeInt(this.field_104520_cv);
            var3.func_110240_a(var5);
            this.field_104518_a.func_107009_b(new C_100367_da("MC|TrList", var4.toByteArray()));
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

   }

   public void func_103873_a(C_101075_qy var1, int var2, C_100994_tv var3) {
      if(!(var1.func_111503_a(var2) instanceof C_101058_ry)) {
         if(!this.field_104522_h) {
            this.field_104518_a.func_107009_b(new C_100371_cz(var1.field_111514_c, var2, var3));
         }
      }
   }

   public void func_104510_a(C_101075_qy var1) {
      this.func_103872_a(var1, var1.func_111499_a());
   }

   public void func_103872_a(C_101075_qy var1, List var2) {
      this.field_104518_a.func_107009_b(new C_100373_cx(var1.field_111514_c, var2));
      this.field_104518_a.func_107009_b(new C_100371_cz(-1, -1, this.field_103857_bK.func_104824_n()));
   }

   public void func_103874_a(C_101075_qy var1, int var2, int var3) {
      this.field_104518_a.func_107009_b(new C_100372_cy(var1.field_111514_c, var2, var3));
   }

   public void func_103808_i() {
      this.field_104518_a.func_107009_b(new C_100376_cv(this.field_103856_bM.field_111514_c));
      this.func_104497_k();
   }

   public void func_104504_j() {
      if(!this.field_104522_h) {
         this.field_104518_a.func_107009_b(new C_100371_cz(-1, -1, this.field_103857_bK.func_104824_n()));
      }
   }

   public void func_104497_k() {
      this.field_103856_bM.func_111501_a(this);
      this.field_103856_bM = this.field_103855_bL;
   }

   public void func_103813_a(C_100809_jc var1, int var2) {
      if(var1 != null) {
         if(!var1.field_109915_f) {
            while(var2 > 100) {
               this.field_104518_a.func_107009_b(new C_100395_ck(var1.field_109918_e, 100));
               var2 -= 100;
            }

            this.field_104518_a.func_107009_b(new C_100395_ck(var1.field_109918_e, var2));
         }

      }
   }

   public void func_104511_l() {
      if(this.field_103207_o != null) {
         this.func_103064_a(this.field_103207_o);
      }

      if(this.field_103206_n != null) {
         this.field_103206_n.func_103064_a(this);
      }

      if(this.field_103834_cb) {
         this.func_103766_a(true, false, false);
      }

   }

   public void func_104505_m() {
      this.field_104531_cn = -99999999;
   }

   public void func_103773_b(String var1) {
      C_100361_be var2 = C_100361_be.func_107654_a();
      String var3 = var2.func_107651_b(var1);
      this.field_104518_a.func_107009_b(new C_100392_cm(var3));
   }

   protected void func_103812_n() {
      this.field_104518_a.func_107009_b(new C_100236_dd(this.field_103212_k, (byte)9));
      super.func_103812_n();
   }

   public void func_103784_a(C_100994_tv var1, int var2) {
      super.func_103784_a(var1, var2);
      if(var1 != null && var1.func_111365_b() != null && var1.func_111365_b().func_110777_d_(var1) == C_100943_uw.field_111099_b) {
         this.func_104506_p().func_109617_p().func_109786_b(this, new C_100401_cj(this, 5));
      }

   }

   public void func_103760_a(C_101095_qg var1, boolean var2) {
      super.func_103760_a(var1, var2);
      this.field_104526_cq = -1;
      this.field_104531_cn = -1;
      this.field_104528_co = -1;
      this.field_104513_g.addAll(((C_100762_ih)var1).field_104513_g);
   }

   protected void func_103304_a(C_100692_kx var1) {
      super.func_103304_a(var1);
      this.field_104518_a.func_107009_b(new C_100276_fb(this.field_103212_k, var1));
   }

   protected void func_103297_b(C_100692_kx var1) {
      super.func_103297_b(var1);
      this.field_104518_a.func_107009_b(new C_100276_fb(this.field_103212_k, var1));
   }

   protected void func_103333_c(C_100692_kx var1) {
      super.func_103333_c(var1);
      this.field_104518_a.func_107009_b(new C_100283_ef(this.field_103212_k, var1));
   }

   public void func_103331_a(double var1, double var3, double var5) {
      this.field_104518_a.func_107013_a(var1, var3, var5, this.field_103236_z, this.field_103177_A);
   }

   public void func_103790_b(C_100730_lb var1) {
      this.func_104506_p().func_109617_p().func_109786_b(this, new C_100401_cj(var1, 6));
   }

   public void func_103807_c(C_100730_lb var1) {
      this.func_104506_p().func_109617_p().func_109786_b(this, new C_100401_cj(var1, 7));
   }

   public void func_103805_o() {
      if(this.field_104518_a != null) {
         this.field_104518_a.func_107009_b(new C_100223_dz(this.field_103869_cf));
      }
   }

   public C_100765_ie func_104506_p() {
      return (C_100765_ie)this.field_103229_p;
   }

   public void func_103796_a(C_100836_xn var1) {
      this.field_104517_c.func_109795_a(var1);
      this.field_104518_a.func_107009_b(new C_100240_df(3, var1.func_110090_a()));
   }

   public void func_102910_a(String var1) {
      this.field_104518_a.func_107009_b(new C_100392_cm(var1));
   }

   public boolean func_102912_a(int var1, String var2) {
      return "seed".equals(var2) && !this.field_104516_b.func_104948_T()?true:(!"tell".equals(var2) && !"help".equals(var2) && !"me".equals(var2)?this.field_104516_b.func_104931_ad().func_105690_e(this.field_103847_bT):true);
   }

   public String func_104502_q() {
      String var1 = this.field_104518_a.field_107019_b.func_107420_c().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      var1 = var1.substring(0, var1.indexOf(":"));
      return var1;
   }

   public void func_104498_a(C_100390_cp var1) {
      if(this.field_104530_cm.func_107652_b().containsKey(var1.func_106822_d())) {
         this.field_104530_cm.func_107656_a(var1.func_106822_d());
      }

      int var2 = 256 >> var1.func_106824_f();
      if(var2 > 3 && var2 < 15) {
         this.field_104525_cs = var2;
      }

      this.field_104523_ct = var1.func_106826_g();
      this.field_104521_cu = var1.func_106823_h();
      if(this.field_104516_b.func_104921_I() && this.field_104516_b.func_104919_H().equals(this.field_103847_bT)) {
         this.field_104516_b.func_104908_c(var1.func_106825_i());
      }

      this.func_103768_b(1, !var1.func_106827_j());
   }

   public C_100361_be func_103783_s() {
      return this.field_104530_cm;
   }

   public int func_104499_u() {
      return this.field_104523_ct;
   }

   public void func_104501_a(String var1, int var2) {
      String var3 = var1 + " " + var2;
      this.field_104518_a.func_107009_b(new C_100367_da("MC|TPack", var3.getBytes()));
   }

   public C_100013_k func_102911_b() {
      return new C_100013_k(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u + 0.5D), C_100650_jv.func_108910_c(this.field_103217_v));
   }
}
