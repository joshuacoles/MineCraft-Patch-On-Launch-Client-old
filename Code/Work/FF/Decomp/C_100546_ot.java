
public class C_100546_ot extends C_100603_lv {

   private float field_103576_e;
   private float field_103574_f;
   private boolean field_103575_g;
   private boolean field_103578_h;
   private float field_103579_i;
   private float field_103577_j;


   public C_100546_ot(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/wolf.png";
      this.func_103161_a(0.6F, 0.8F);
      this.field_103489_bI = 0.3F;
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(1, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(2, this.field_103559_d);
      this.field_103408_bn.func_108888_a(3, new C_100625_mq(this, 0.4F));
      this.field_103408_bn.func_108888_a(4, new C_100629_mu(this, this.field_103489_bI, true));
      this.field_103408_bn.func_108888_a(5, new C_100616_mk(this, this.field_103489_bI, 10.0F, 2.0F));
      this.field_103408_bn.func_108888_a(6, new C_100614_me(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(7, new C_100640_ng(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(8, new C_100608_mc(this, 8.0F));
      this.field_103408_bn.func_108888_a(9, new C_100624_mr(this, C_101095_qg.class, 8.0F));
      this.field_103408_bn.func_108888_a(9, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100493_nu(this));
      this.field_103409_bo.func_108888_a(2, new C_100519_nv(this));
      this.field_103409_bo.func_108888_a(3, new C_100501_nq(this, true));
      this.field_103409_bo.func_108888_a(4, new C_100495_nt(this, C_100555_oo.class, 16.0F, 200, false));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public void func_103347_b(C_100595_ln var1) {
      super.func_103347_b(var1);
      if(var1 instanceof C_101095_qg) {
         this.func_103570_i(true);
      }

   }

   protected void func_103314_bj() {
      this.field_103234_ag.func_108851_b(18, Integer.valueOf(this.func_103330_aT()));
   }

   public int func_103378_aS() {
      return this.func_103552_m()?20:8;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(18, new Integer(this.func_103330_aT()));
      this.field_103234_ag.func_108841_a(19, new Byte((byte)0));
      this.field_103234_ag.func_108841_a(20, new Byte((byte)C_100230_aib.func_106367_e_(1)));
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.wolf.step", 0.15F, 1.0F);
   }

   public String func_103129_O() {
      return this.func_103552_m()?"/mob/wolf_tame.png":(this.func_103565_bG()?"/mob/wolf_angry.png":super.func_103129_O());
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107509_a("Angry", this.func_103565_bG());
      var1.func_107527_a("CollarColor", (byte)this.func_103573_bH());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103570_i(var1.func_107519_n("Angry"));
      if(var1.func_107516_b("CollarColor")) {
         this.func_103569_r(var1.func_107524_c("CollarColor"));
      }

   }

   protected boolean func_103302_bg() {
      return this.func_103565_bG();
   }

   protected String func_103354_aW() {
      return this.func_103565_bG()?"mob.wolf.growl":(this.field_103232_aa.nextInt(3) == 0?(this.func_103552_m() && this.field_103234_ag.func_108837_c(18) < 10?"mob.wolf.whine":"mob.wolf.panting"):"mob.wolf.bark");
   }

   protected String func_103387_aX() {
      return "mob.wolf.hurt";
   }

   protected String func_103307_aY() {
      return "mob.wolf.death";
   }

   protected float func_103384_aV() {
      return 0.4F;
   }

   protected int func_103377_aZ() {
      return -1;
   }

   public void func_103313_c() {
      super.func_103313_c();
      if(!this.field_103229_p.field_109557_J && this.field_103575_g && !this.field_103578_h && !this.func_103494_k() && this.field_103174_E) {
         this.field_103578_h = true;
         this.field_103579_i = 0.0F;
         this.field_103577_j = 0.0F;
         this.field_103229_p.func_109464_a(this, (byte)8);
      }

   }

   public void func_103165_j_() {
      super.func_103165_j_();
      this.field_103574_f = this.field_103576_e;
      if(this.func_103571_bI()) {
         this.field_103576_e += (1.0F - this.field_103576_e) * 0.4F;
      } else {
         this.field_103576_e += (0.0F - this.field_103576_e) * 0.4F;
      }

      if(this.func_103571_bI()) {
         this.field_103478_bJ = 10;
      }

      if(this.func_103073_G()) {
         this.field_103575_g = true;
         this.field_103578_h = false;
         this.field_103579_i = 0.0F;
         this.field_103577_j = 0.0F;
      } else if((this.field_103575_g || this.field_103578_h) && this.field_103578_h) {
         if(this.field_103579_i == 0.0F) {
            this.field_103229_p.func_109412_a(this, "mob.wolf.shake", this.func_103384_aV(), (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F);
         }

         this.field_103577_j = this.field_103579_i;
         this.field_103579_i += 0.05F;
         if(this.field_103577_j >= 2.0F) {
            this.field_103575_g = false;
            this.field_103578_h = false;
            this.field_103577_j = 0.0F;
            this.field_103579_i = 0.0F;
         }

         if(this.field_103579_i > 0.4F) {
            float var1 = (float)this.field_103173_D.field_107915_b;
            int var2 = (int)(C_100650_jv.func_108924_a((this.field_103579_i - 0.4F) * 3.1415927F) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N * 0.5F;
               float var5 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N * 0.5F;
               this.field_103229_p.func_109428_a("splash", this.field_103221_t + (double)var4, (double)(var1 + 0.8F), this.field_103217_v + (double)var5, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }
         }
      }

   }

   public boolean func_103567_t() {
      return this.field_103575_g;
   }

   public float func_103564_j(float var1) {
      return 0.75F + (this.field_103577_j + (this.field_103579_i - this.field_103577_j) * var1) / 2.0F * 0.25F;
   }

   public float func_103572_f(float var1, float var2) {
      float var3 = (this.field_103577_j + (this.field_103579_i - this.field_103577_j) * var1 + var2) / 1.8F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      } else if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return C_100650_jv.func_108924_a(var3 * 3.1415927F) * C_100650_jv.func_108924_a(var3 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
   }

   public float func_103566_k(float var1) {
      return (this.field_103574_f + (this.field_103576_e - this.field_103574_f) * var1) * 0.15F * 3.1415927F;
   }

   public float func_103102_e() {
      return this.field_103183_O * 0.8F;
   }

   public int func_103290_bm() {
      return this.func_103553_n()?20:super.func_103290_bm();
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      C_100730_lb var3 = var1.func_109210_g();
      this.field_103559_d.func_108218_a(false);
      if(var3 != null && !(var3 instanceof C_101095_qg) && !(var3 instanceof C_101089_qi)) {
         var2 = (var2 + 1) / 2;
      }

      return super.func_103085_a(var1, var2);
   }

   public boolean func_103303_l(C_100730_lb var1) {
      int var2 = this.func_103552_m()?4:2;
      return var1.func_103085_a(C_100698_ks.func_109218_a(this), var2);
   }

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      if(this.func_103552_m()) {
         if(var2 != null) {
            if(C_100992_tt.field_110834_e[var2.field_111397_c] instanceof C_101006_to) {
               C_101006_to var3 = (C_101006_to)C_100992_tt.field_110834_e[var2.field_111397_c];
               if(var3.func_111009_i() && this.field_103234_ag.func_108837_c(18) < 20) {
                  if(!var1.field_103869_cf.field_111597_d) {
                     --var2.field_111398_a;
                  }

                  this.func_103392_i(var3.func_111010_g());
                  if(var2.field_111398_a <= 0) {
                     var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
                  }

                  return true;
               }
            } else if(var2.field_111397_c == C_100992_tt.field_110904_aW.field_110891_cf) {
               int var4 = C_100230_aib.func_106367_e_(var2.func_111367_j());
               if(var4 != this.func_103573_bH()) {
                  this.func_103569_r(var4);
                  if(!var1.field_103869_cf.field_111597_d && var2.field_111398_a-- <= 0) {
                     var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
                  }

                  return true;
               }
            }
         }

         if(var1.field_103847_bT.equalsIgnoreCase(this.func_103556_o()) && !this.field_103229_p.field_109557_J && !this.func_103524_c(var2)) {
            this.field_103559_d.func_108218_a(!this.func_103553_n());
            this.field_103491_bG = false;
            this.func_103495_a((C_100278_agj)null);
         }
      } else if(var2 != null && var2.field_111397_c == C_100992_tt.field_110903_aX.field_110891_cf && !this.func_103565_bG()) {
         if(!var1.field_103869_cf.field_111597_d) {
            --var2.field_111398_a;
         }

         if(var2.field_111398_a <= 0) {
            var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
         }

         if(!this.field_103229_p.field_109557_J) {
            if(this.field_103232_aa.nextInt(3) == 0) {
               this.func_103551_g(true);
               this.func_103495_a((C_100278_agj)null);
               this.func_103347_b((C_100595_ln)null);
               this.field_103559_d.func_108218_a(true);
               this.func_103298_j(20);
               this.func_103555_a(var1.field_103847_bT);
               this.func_103550_f(true);
               this.field_103229_p.func_109464_a(this, (byte)7);
            } else {
               this.func_103550_f(false);
               this.field_103229_p.func_109464_a(this, (byte)6);
            }
         }

         return true;
      }

      return super.func_103134_c(var1);
   }

   public void func_103159_a(byte var1) {
      if(var1 == 8) {
         this.field_103578_h = true;
         this.field_103579_i = 0.0F;
         this.field_103577_j = 0.0F;
      } else {
         super.func_103159_a(var1);
      }

   }

   public float func_103563_u() {
      return this.func_103565_bG()?1.5393804F:(this.func_103552_m()?(0.55F - (float)(20 - this.field_103234_ag.func_108837_c(18)) * 0.02F) * 3.1415927F:0.62831855F);
   }

   public boolean func_103524_c(C_100994_tv var1) {
      return var1 == null?false:(!(C_100992_tt.field_110834_e[var1.field_111397_c] instanceof C_101006_to)?false:((C_101006_to)C_100992_tt.field_110834_e[var1.field_111397_c]).func_111009_i());
   }

   public int func_103316_bs() {
      return 8;
   }

   public boolean func_103565_bG() {
      return (this.field_103234_ag.func_108842_a(16) & 2) != 0;
   }

   public void func_103570_i(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 2)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -3)));
      }

   }

   public int func_103573_bH() {
      return this.field_103234_ag.func_108842_a(20) & 15;
   }

   public void func_103569_r(int var1) {
      this.field_103234_ag.func_108851_b(20, Byte.valueOf((byte)(var1 & 15)));
   }

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      C_100546_ot var2 = new C_100546_ot(this.field_103229_p);
      var2.func_103555_a(this.func_103556_o());
      var2.func_103551_g(true);
      return var2;
   }

   public void func_103568_j(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(19);
      if(var1) {
         this.field_103234_ag.func_108851_b(19, Byte.valueOf((byte)1));
      } else {
         this.field_103234_ag.func_108851_b(19, Byte.valueOf((byte)0));
      }

   }

   public boolean func_103522_b(C_100544_oh var1) {
      if(var1 == this) {
         return false;
      } else if(!this.func_103552_m()) {
         return false;
      } else if(!(var1 instanceof C_100546_ot)) {
         return false;
      } else {
         C_100546_ot var2 = (C_100546_ot)var1;
         return !var2.func_103552_m()?false:(var2.func_103553_n()?false:this.func_103525_r() && var2.func_103525_r());
      }
   }

   public boolean func_103571_bI() {
      return this.field_103234_ag.func_108842_a(19) == 1;
   }
}
