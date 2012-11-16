import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class C_101098_qd extends C_100694_ky implements C_101099_qc, C_100891_wu {

   private int field_103607_e;
   private boolean field_103604_f;
   private boolean field_103605_g;
   C_100531_ob field_103606_d;
   private C_101095_qg field_103609_h;
   private C_100859_ww field_103610_i;
   private int field_103608_j;
   private boolean field_103613_bK;
   private int field_103611_bL;
   private String field_103612_bM;
   private boolean field_103616_bN;
   private float field_103617_bO;
   private static final Map field_103614_bP = new HashMap();
   private static final Map field_103615_bQ = new HashMap();


   public C_101098_qd(C_100873_xe var1) {
      this(var1, 0);
   }

   public C_101098_qd(C_100873_xe var1, int var2) {
      super(var1);
      this.field_103607_e = 0;
      this.field_103604_f = false;
      this.field_103605_g = false;
      this.field_103606_d = null;
      this.func_103601_r(var2);
      this.field_103448_aF = "/mob/villager/villager.png";
      this.field_103489_bI = 0.5F;
      this.func_103383_ay().func_108298_b(true);
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(1, new C_100611_mb(this, C_101097_qa.class, 8.0F, 0.3F, 0.35F));
      this.field_103408_bn.func_108888_a(1, new C_100505_no(this));
      this.field_103408_bn.func_108888_a(1, new C_100627_ms(this));
      this.field_103408_bn.func_108888_a(2, new C_100628_mv(this));
      this.field_103408_bn.func_108888_a(3, new C_100642_ni(this));
      this.field_103408_bn.func_108888_a(4, new C_100636_nc(this, true));
      this.field_103408_bn.func_108888_a(5, new C_100630_mx(this, 0.3F));
      this.field_103408_bn.func_108888_a(6, new C_100626_mt(this));
      this.field_103408_bn.func_108888_a(7, new C_100646_nm(this));
      this.field_103408_bn.func_108888_a(8, new C_100638_ne(this, 0.32F));
      this.field_103408_bn.func_108888_a(9, new C_100622_mp(this, C_101095_qg.class, 3.0F, 1.0F));
      this.field_103408_bn.func_108888_a(9, new C_100622_mp(this, C_101098_qd.class, 5.0F, 0.02F));
      this.field_103408_bn.func_108888_a(9, new C_100640_ng(this, 0.3F));
      this.field_103408_bn.func_108888_a(10, new C_100624_mr(this, C_100595_ln.class, 8.0F));
   }

   public boolean func_103321_bb() {
      return true;
   }

   protected void func_103314_bj() {
      if(--this.field_103607_e <= 0) {
         this.field_103229_p.field_109550_C.func_107273_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
         this.field_103607_e = 70 + this.field_103232_aa.nextInt(50);
         this.field_103606_d = this.field_103229_p.field_109550_C.func_107279_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v), 32);
         if(this.field_103606_d == null) {
            this.func_103360_aK();
         } else {
            C_100013_k var1 = this.field_103606_d.func_108609_a();
            this.func_103285_b(var1.field_105273_a, var1.field_105271_b, var1.field_105272_c, (int)((float)this.field_103606_d.func_108616_b() * 0.6F));
            if(this.field_103616_bN) {
               this.field_103616_bN = false;
               this.field_103606_d.func_108606_b(5);
            }
         }
      }

      if(!this.func_103598_p() && this.field_103608_j > 0) {
         --this.field_103608_j;
         if(this.field_103608_j <= 0) {
            if(this.field_103613_bK) {
               if(this.field_103610_i.size() > 1) {
                  Iterator var3 = this.field_103610_i.iterator();

                  while(var3.hasNext()) {
                     C_100892_wv var2 = (C_100892_wv)var3.next();
                     if(var2.func_110661_g()) {
                        var2.func_110656_a(this.field_103232_aa.nextInt(6) + this.field_103232_aa.nextInt(6) + 2);
                     }
                  }
               }

               this.func_103602_s(1);
               this.field_103613_bK = false;
               if(this.field_103606_d != null && this.field_103612_bM != null) {
                  this.field_103229_p.func_109464_a(this, (byte)14);
                  this.field_103606_d.func_108625_a(this.field_103612_bM, 1);
               }
            }

            this.func_103389_d(new C_100692_kx(C_100690_kw.field_109172_l.field_109159_H, 200, 0));
         }
      }

      super.func_103314_bj();
   }

   public boolean func_103134_c(C_101095_qg var1) {
      if(this.func_103143_S() && !this.func_103598_p() && !this.func_103357_h_()) {
         if(!this.field_103229_p.field_109557_J) {
            this.func_103583_a_(var1);
            var1.func_103823_a(this);
         }

         return true;
      } else {
         return super.func_103134_c(var1);
      }
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Integer.valueOf(0));
   }

   public int func_103378_aS() {
      return 20;
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("Profession", this.func_103603_m());
      var1.func_107520_a("Riches", this.field_103611_bL);
      if(this.field_103610_i != null) {
         var1.func_107538_a("Offers", this.field_103610_i.func_110243_a());
      }

   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103601_r(var1.func_107514_e("Profession"));
      this.field_103611_bL = var1.func_107514_e("Riches");
      if(var1.func_107516_b("Offers")) {
         C_100353_bh var2 = var1.func_107521_l("Offers");
         this.field_103610_i = new C_100859_ww(var2);
      }

   }

   public String func_103129_O() {
      switch(this.func_103603_m()) {
      case 0:
         return "/mob/villager/farmer.png";
      case 1:
         return "/mob/villager/librarian.png";
      case 2:
         return "/mob/villager/priest.png";
      case 3:
         return "/mob/villager/smith.png";
      case 4:
         return "/mob/villager/butcher.png";
      default:
         return super.func_103129_O();
      }
   }

   protected boolean func_103302_bg() {
      return false;
   }

   protected String func_103354_aW() {
      return "mob.villager.default";
   }

   protected String func_103387_aX() {
      return "mob.villager.defaulthurt";
   }

   protected String func_103307_aY() {
      return "mob.villager.defaultdeath";
   }

   public void func_103601_r(int var1) {
      this.field_103234_ag.func_108851_b(16, Integer.valueOf(var1));
   }

   public int func_103603_m() {
      return this.field_103234_ag.func_108837_c(16);
   }

   public boolean func_103600_n() {
      return this.field_103604_f;
   }

   public void func_103589_f(boolean var1) {
      this.field_103604_f = var1;
   }

   public void func_103591_g(boolean var1) {
      this.field_103605_g = var1;
   }

   public boolean func_103592_o() {
      return this.field_103605_g;
   }

   public void func_103376_c(C_100595_ln var1) {
      super.func_103376_c(var1);
      if(this.field_103606_d != null && var1 != null) {
         this.field_103606_d.func_108630_a(var1);
         if(var1 instanceof C_101095_qg) {
            byte var2 = -1;
            if(this.func_103357_h_()) {
               var2 = -3;
            }

            this.field_103606_d.func_108625_a(((C_101095_qg)var1).func_102909_c_(), var2);
            if(this.func_103143_S()) {
               this.field_103229_p.func_109464_a(this, (byte)13);
            }
         }
      }

   }

   public void func_103311_a(C_100698_ks var1) {
      if(this.field_103606_d != null) {
         C_100730_lb var2 = var1.func_109210_g();
         if(var2 != null) {
            if(var2 instanceof C_101095_qg) {
               this.field_103606_d.func_108625_a(((C_101095_qg)var2).func_102909_c_(), -2);
            } else if(var2 instanceof C_100587_pn) {
               this.field_103606_d.func_108636_h();
            }
         } else if(var2 == null) {
            C_101095_qg var3 = this.field_103229_p.func_109503_a(this, 16.0D);
            if(var3 != null) {
               this.field_103606_d.func_108636_h();
            }
         }
      }

      super.func_103311_a(var1);
   }

   public void func_103583_a_(C_101095_qg var1) {
      this.field_103609_h = var1;
   }

   public C_101095_qg func_103580_m_() {
      return this.field_103609_h;
   }

   public boolean func_103598_p() {
      return this.field_103609_h != null;
   }

   public void func_103582_a(C_100892_wv var1) {
      var1.func_110664_f();
      if(var1.func_110658_a((C_100892_wv)this.field_103610_i.get(this.field_103610_i.size() - 1))) {
         this.field_103608_j = 40;
         this.field_103613_bK = true;
         if(this.field_103609_h != null) {
            this.field_103612_bM = this.field_103609_h.func_102909_c_();
         } else {
            this.field_103612_bM = null;
         }
      }

      if(var1.func_110665_a().field_111397_c == C_100992_tt.field_110965_bH.field_110891_cf) {
         this.field_103611_bL += var1.func_110665_a().field_111398_a;
      }

   }

   public C_100859_ww func_103584_b(C_101095_qg var1) {
      if(this.field_103610_i == null) {
         this.func_103602_s(1);
      }

      return this.field_103610_i;
   }

   private float func_103595_j(float var1) {
      float var2 = var1 + this.field_103617_bO;
      return var2 > 0.9F?0.9F - (var2 - 0.9F):var2;
   }

   private void func_103602_s(int var1) {
      if(this.field_103610_i != null) {
         this.field_103617_bO = C_100650_jv.func_108913_c((float)this.field_103610_i.size()) * 0.2F;
      } else {
         this.field_103617_bO = 0.0F;
      }

      C_100859_ww var2;
      var2 = new C_100859_ww();
      label48:
      switch(this.func_103603_m()) {
      case 0:
         func_103599_a(var2, C_100992_tt.field_110821_T.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.9F));
         func_103599_a(var2, C_100451_alf.field_106252_ae.field_106162_cm, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103599_a(var2, C_100992_tt.field_110873_bk.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103599_a(var2, C_100992_tt.field_110901_aV.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.4F));
         func_103590_b(var2, C_100992_tt.field_110820_U.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.9F));
         func_103590_b(var2, C_100992_tt.field_110876_bf.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110842_j.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110881_bc.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110883_be.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110845_i.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110874_bl.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110840_l.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         if(this.field_103232_aa.nextFloat() < this.func_103595_j(0.5F)) {
            var2.add(new C_100892_wv(new C_100994_tv(C_100451_alf.field_106083_I, 10), new C_100994_tv(C_100992_tt.field_110965_bH), new C_100994_tv(C_100992_tt.field_110952_ap.field_110891_cf, 4 + this.field_103232_aa.nextInt(2), 0)));
         }
         break;
      case 1:
         func_103599_a(var2, C_100992_tt.field_110907_aK.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.8F));
         func_103599_a(var2, C_100992_tt.field_110908_aL.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.8F));
         func_103599_a(var2, C_100992_tt.field_110971_bG.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100451_alf.field_106214_aq.field_106162_cm, this.field_103232_aa, this.func_103595_j(0.8F));
         func_103590_b(var2, C_100451_alf.field_106091_P.field_106162_cm, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110898_aQ.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110900_aS.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         break;
      case 2:
         func_103590_b(var2, C_100992_tt.field_110896_bA.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110957_bD.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110915_aC.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.4F));
         func_103590_b(var2, C_100451_alf.field_106142_bg.field_106162_cm, this.field_103232_aa, this.func_103595_j(0.3F));
         int[] var3 = new int[]{C_100992_tt.field_110852_q.field_110891_cf, C_100992_tt.field_110854_z.field_110891_cf, C_100992_tt.field_110970_ae.field_110891_cf, C_100992_tt.field_110946_ai.field_110891_cf, C_100992_tt.field_110844_h.field_110891_cf, C_100992_tt.field_110811_C.field_110891_cf, C_100992_tt.field_110832_g.field_110891_cf, C_100992_tt.field_110810_B.field_110891_cf};
         int[] var4 = var3;
         int var5 = var3.length;
         int var6 = 0;

         while(true) {
            if(var6 >= var5) {
               break label48;
            }

            int var7 = var4[var6];
            if(this.field_103232_aa.nextFloat() < this.func_103595_j(0.05F)) {
               var2.add(new C_100892_wv(new C_100994_tv(var7, 1, 0), new C_100994_tv(C_100992_tt.field_110965_bH, 2 + this.field_103232_aa.nextInt(3), 0), C_100878_wh.func_110597_a(this.field_103232_aa, new C_100994_tv(var7, 1, 0), 5 + this.field_103232_aa.nextInt(15))));
            }

            ++var6;
         }
      case 3:
         func_103599_a(var2, C_100992_tt.field_110841_m.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.7F));
         func_103599_a(var2, C_100992_tt.field_110839_o.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103599_a(var2, C_100992_tt.field_110853_p.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103599_a(var2, C_100992_tt.field_110838_n.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103590_b(var2, C_100992_tt.field_110852_q.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103590_b(var2, C_100992_tt.field_110854_z.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103590_b(var2, C_100992_tt.field_110844_h.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110811_C.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110832_g.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103590_b(var2, C_100992_tt.field_110810_B.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103590_b(var2, C_100992_tt.field_110831_f.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110809_A.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110825_P.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110824_Q.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110966_ag.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110942_ak.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110960_ad.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110968_ah.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110970_ae.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110946_ai.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110972_af.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110948_aj.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.2F));
         func_103590_b(var2, C_100992_tt.field_110958_ac.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.1F));
         func_103590_b(var2, C_100992_tt.field_110830_Z.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.1F));
         func_103590_b(var2, C_100992_tt.field_110962_aa.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.1F));
         func_103590_b(var2, C_100992_tt.field_110964_ab.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.1F));
         break;
      case 4:
         func_103599_a(var2, C_100992_tt.field_110841_m.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.7F));
         func_103599_a(var2, C_100992_tt.field_110932_aq.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103599_a(var2, C_100992_tt.field_110879_bi.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.5F));
         func_103590_b(var2, C_100992_tt.field_110913_aA.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.1F));
         func_103590_b(var2, C_100992_tt.field_110822_W.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110828_Y.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110823_V.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110829_X.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110930_ar.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
         func_103590_b(var2, C_100992_tt.field_110872_bj.field_110891_cf, this.field_103232_aa, this.func_103595_j(0.3F));
      }

      if(var2.isEmpty()) {
         func_103599_a(var2, C_100992_tt.field_110853_p.field_110891_cf, this.field_103232_aa, 1.0F);
      }

      Collections.shuffle(var2);
      if(this.field_103610_i == null) {
         this.field_103610_i = new C_100859_ww();
      }

      for(int var8 = 0; var8 < var1 && var8 < var2.size(); ++var8) {
         this.field_103610_i.func_110244_a((C_100892_wv)var2.get(var8));
      }

   }

   public void func_103581_a(C_100859_ww var1) {}

   private static void func_103599_a(C_100859_ww var0, int var1, Random var2, float var3) {
      if(var2.nextFloat() < var3) {
         var0.add(new C_100892_wv(func_103588_a(var1, var2), C_100992_tt.field_110965_bH));
      }

   }

   private static C_100994_tv func_103588_a(int var0, Random var1) {
      return new C_100994_tv(var0, func_103597_b(var0, var1), 0);
   }

   private static int func_103597_b(int var0, Random var1) {
      C_100678_ke var2 = (C_100678_ke)field_103614_bP.get(Integer.valueOf(var0));
      return var2 == null?1:(((Integer)var2.func_109118_a()).intValue() >= ((Integer)var2.func_109117_b()).intValue()?((Integer)var2.func_109118_a()).intValue():((Integer)var2.func_109118_a()).intValue() + var1.nextInt(((Integer)var2.func_109117_b()).intValue() - ((Integer)var2.func_109118_a()).intValue()));
   }

   private static void func_103590_b(C_100859_ww var0, int var1, Random var2, float var3) {
      if(var2.nextFloat() < var3) {
         int var4 = func_103596_c(var1, var2);
         C_100994_tv var5;
         C_100994_tv var6;
         if(var4 < 0) {
            var5 = new C_100994_tv(C_100992_tt.field_110965_bH.field_110891_cf, 1, 0);
            var6 = new C_100994_tv(var1, -var4, 0);
         } else {
            var5 = new C_100994_tv(C_100992_tt.field_110965_bH.field_110891_cf, var4, 0);
            var6 = new C_100994_tv(var1, 1, 0);
         }

         var0.add(new C_100892_wv(var5, var6));
      }

   }

   private static int func_103596_c(int var0, Random var1) {
      C_100678_ke var2 = (C_100678_ke)field_103615_bQ.get(Integer.valueOf(var0));
      return var2 == null?1:(((Integer)var2.func_109118_a()).intValue() >= ((Integer)var2.func_109117_b()).intValue()?((Integer)var2.func_109118_a()).intValue():((Integer)var2.func_109118_a()).intValue() + var1.nextInt(((Integer)var2.func_109117_b()).intValue() - ((Integer)var2.func_109118_a()).intValue()));
   }

   public void func_103159_a(byte var1) {
      if(var1 == 12) {
         this.func_103594_a("heart");
      } else if(var1 == 13) {
         this.func_103594_a("angryVillager");
      } else if(var1 == 14) {
         this.func_103594_a("happyVillager");
      } else {
         super.func_103159_a(var1);
      }

   }

   private void func_103594_a(String var1) {
      for(int var2 = 0; var2 < 5; ++var2) {
         double var3 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var5 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var7 = this.field_103232_aa.nextGaussian() * 0.02D;
         this.field_103229_p.func_109428_a(var1, this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + 1.0D + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, var3, var5, var7);
      }

   }

   public void func_103337_bD() {
      this.func_103601_r(this.field_103229_p.field_109577_u.nextInt(5));
   }

   public void func_103593_q() {
      this.field_103616_bN = true;
   }

   static {
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110841_m.field_110891_cf), new C_100678_ke(Integer.valueOf(16), Integer.valueOf(24)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110839_o.field_110891_cf), new C_100678_ke(Integer.valueOf(8), Integer.valueOf(10)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110853_p.field_110891_cf), new C_100678_ke(Integer.valueOf(8), Integer.valueOf(10)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110838_n.field_110891_cf), new C_100678_ke(Integer.valueOf(4), Integer.valueOf(6)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110907_aK.field_110891_cf), new C_100678_ke(Integer.valueOf(24), Integer.valueOf(36)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110908_aL.field_110891_cf), new C_100678_ke(Integer.valueOf(11), Integer.valueOf(13)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110971_bG.field_110891_cf), new C_100678_ke(Integer.valueOf(1), Integer.valueOf(1)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110868_bn.field_110891_cf), new C_100678_ke(Integer.valueOf(3), Integer.valueOf(4)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110896_bA.field_110891_cf), new C_100678_ke(Integer.valueOf(2), Integer.valueOf(3)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110932_aq.field_110891_cf), new C_100678_ke(Integer.valueOf(14), Integer.valueOf(18)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110879_bi.field_110891_cf), new C_100678_ke(Integer.valueOf(14), Integer.valueOf(18)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110873_bk.field_110891_cf), new C_100678_ke(Integer.valueOf(14), Integer.valueOf(18)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110901_aV.field_110891_cf), new C_100678_ke(Integer.valueOf(9), Integer.valueOf(13)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110826_S.field_110891_cf), new C_100678_ke(Integer.valueOf(34), Integer.valueOf(48)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110878_bh.field_110891_cf), new C_100678_ke(Integer.valueOf(30), Integer.valueOf(38)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110877_bg.field_110891_cf), new C_100678_ke(Integer.valueOf(30), Integer.valueOf(38)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110821_T.field_110891_cf), new C_100678_ke(Integer.valueOf(18), Integer.valueOf(22)));
      field_103614_bP.put(Integer.valueOf(C_100451_alf.field_106252_ae.field_106162_cm), new C_100678_ke(Integer.valueOf(14), Integer.valueOf(22)));
      field_103614_bP.put(Integer.valueOf(C_100992_tt.field_110875_bm.field_110891_cf), new C_100678_ke(Integer.valueOf(36), Integer.valueOf(64)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110845_i.field_110891_cf), new C_100678_ke(Integer.valueOf(3), Integer.valueOf(4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110883_be.field_110891_cf), new C_100678_ke(Integer.valueOf(3), Integer.valueOf(4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110852_q.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(11)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110854_z.field_110891_cf), new C_100678_ke(Integer.valueOf(12), Integer.valueOf(14)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110844_h.field_110891_cf), new C_100678_ke(Integer.valueOf(6), Integer.valueOf(8)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110811_C.field_110891_cf), new C_100678_ke(Integer.valueOf(9), Integer.valueOf(12)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110832_g.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(9)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110810_B.field_110891_cf), new C_100678_ke(Integer.valueOf(10), Integer.valueOf(12)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110831_f.field_110891_cf), new C_100678_ke(Integer.valueOf(4), Integer.valueOf(6)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110809_A.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(8)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110825_P.field_110891_cf), new C_100678_ke(Integer.valueOf(4), Integer.valueOf(6)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110824_Q.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(8)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110966_ag.field_110891_cf), new C_100678_ke(Integer.valueOf(4), Integer.valueOf(6)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110942_ak.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(8)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110960_ad.field_110891_cf), new C_100678_ke(Integer.valueOf(4), Integer.valueOf(6)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110968_ah.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(8)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110970_ae.field_110891_cf), new C_100678_ke(Integer.valueOf(10), Integer.valueOf(14)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110946_ai.field_110891_cf), new C_100678_ke(Integer.valueOf(16), Integer.valueOf(19)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110972_af.field_110891_cf), new C_100678_ke(Integer.valueOf(8), Integer.valueOf(10)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110948_aj.field_110891_cf), new C_100678_ke(Integer.valueOf(11), Integer.valueOf(14)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110958_ac.field_110891_cf), new C_100678_ke(Integer.valueOf(5), Integer.valueOf(7)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110830_Z.field_110891_cf), new C_100678_ke(Integer.valueOf(5), Integer.valueOf(7)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110962_aa.field_110891_cf), new C_100678_ke(Integer.valueOf(11), Integer.valueOf(15)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110964_ab.field_110891_cf), new C_100678_ke(Integer.valueOf(9), Integer.valueOf(11)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110820_U.field_110891_cf), new C_100678_ke(Integer.valueOf(-4), Integer.valueOf(-2)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110876_bf.field_110891_cf), new C_100678_ke(Integer.valueOf(-8), Integer.valueOf(-4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110842_j.field_110891_cf), new C_100678_ke(Integer.valueOf(-8), Integer.valueOf(-4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110881_bc.field_110891_cf), new C_100678_ke(Integer.valueOf(-10), Integer.valueOf(-7)));
      field_103615_bQ.put(Integer.valueOf(C_100451_alf.field_106091_P.field_106162_cm), new C_100678_ke(Integer.valueOf(-5), Integer.valueOf(-3)));
      field_103615_bQ.put(Integer.valueOf(C_100451_alf.field_106214_aq.field_106162_cm), new C_100678_ke(Integer.valueOf(3), Integer.valueOf(4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110822_W.field_110891_cf), new C_100678_ke(Integer.valueOf(4), Integer.valueOf(5)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110828_Y.field_110891_cf), new C_100678_ke(Integer.valueOf(2), Integer.valueOf(4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110823_V.field_110891_cf), new C_100678_ke(Integer.valueOf(2), Integer.valueOf(4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110829_X.field_110891_cf), new C_100678_ke(Integer.valueOf(2), Integer.valueOf(4)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110913_aA.field_110891_cf), new C_100678_ke(Integer.valueOf(6), Integer.valueOf(8)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110957_bD.field_110891_cf), new C_100678_ke(Integer.valueOf(-4), Integer.valueOf(-1)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110915_aC.field_110891_cf), new C_100678_ke(Integer.valueOf(-4), Integer.valueOf(-1)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110898_aQ.field_110891_cf), new C_100678_ke(Integer.valueOf(10), Integer.valueOf(12)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110900_aS.field_110891_cf), new C_100678_ke(Integer.valueOf(10), Integer.valueOf(12)));
      field_103615_bQ.put(Integer.valueOf(C_100451_alf.field_106142_bg.field_106162_cm), new C_100678_ke(Integer.valueOf(-3), Integer.valueOf(-1)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110930_ar.field_110891_cf), new C_100678_ke(Integer.valueOf(-7), Integer.valueOf(-5)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110872_bj.field_110891_cf), new C_100678_ke(Integer.valueOf(-7), Integer.valueOf(-5)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110874_bl.field_110891_cf), new C_100678_ke(Integer.valueOf(-8), Integer.valueOf(-6)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110896_bA.field_110891_cf), new C_100678_ke(Integer.valueOf(7), Integer.valueOf(11)));
      field_103615_bQ.put(Integer.valueOf(C_100992_tt.field_110840_l.field_110891_cf), new C_100678_ke(Integer.valueOf(-12), Integer.valueOf(-8)));
   }
}
