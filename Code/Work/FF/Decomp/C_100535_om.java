
public class C_100535_om extends C_100603_lv {

   private C_100507_nn field_103562_e;


   public C_100535_om(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/ozelot.png";
      this.func_103161_a(0.6F, 0.8F);
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(1, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(2, this.field_103559_d);
      this.field_103408_bn.func_108888_a(3, this.field_103562_e = new C_100507_nn(this, 0.18F, C_100992_tt.field_110902_aU.field_110891_cf, true));
      this.field_103408_bn.func_108888_a(4, new C_100611_mb(this, C_101095_qg.class, 16.0F, 0.23F, 0.4F));
      this.field_103408_bn.func_108888_a(5, new C_100616_mk(this, 0.3F, 10.0F, 5.0F));
      this.field_103408_bn.func_108888_a(6, new C_100634_na(this, 0.4F));
      this.field_103408_bn.func_108888_a(7, new C_100625_mq(this, 0.3F));
      this.field_103408_bn.func_108888_a(8, new C_100632_mz(this));
      this.field_103408_bn.func_108888_a(9, new C_100614_me(this, 0.23F));
      this.field_103408_bn.func_108888_a(10, new C_100640_ng(this, 0.23F));
      this.field_103408_bn.func_108888_a(11, new C_100624_mr(this, C_101095_qg.class, 10.0F));
      this.field_103409_bo.func_108888_a(1, new C_100495_nt(this, C_100540_oi.class, 14.0F, 750, false));
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(18, Byte.valueOf((byte)0));
   }

   public void func_103314_bj() {
      if(this.func_103305_aw().func_108876_a()) {
         float var1 = this.func_103305_aw().func_108874_b();
         if(var1 == 0.18F) {
            this.func_103151_a(true);
            this.func_103080_b(false);
         } else if(var1 == 0.4F) {
            this.func_103151_a(false);
            this.func_103080_b(true);
         } else {
            this.func_103151_a(false);
            this.func_103080_b(false);
         }
      } else {
         this.func_103151_a(false);
         this.func_103080_b(false);
      }

   }

   protected boolean func_103302_bg() {
      return !this.func_103552_m();
   }

   public String func_103129_O() {
      switch(this.func_103560_t()) {
      case 0:
         return "/mob/ozelot.png";
      case 1:
         return "/mob/cat_black.png";
      case 2:
         return "/mob/cat_red.png";
      case 3:
         return "/mob/cat_siamese.png";
      default:
         return super.func_103129_O();
      }
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 10;
   }

   protected void func_103124_a(float var1) {}

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("CatType", this.func_103560_t());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103561_r(var1.func_107514_e("CatType"));
   }

   protected String func_103354_aW() {
      return this.func_103552_m()?(this.func_103525_r()?"mob.cat.purr":(this.field_103232_aa.nextInt(4) == 0?"mob.cat.purreow":"mob.cat.meow")):"";
   }

   protected String func_103387_aX() {
      return "mob.cat.hitt";
   }

   protected String func_103307_aY() {
      return "mob.cat.hitt";
   }

   protected float func_103384_aV() {
      return 0.4F;
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110918_aF.field_110891_cf;
   }

   public boolean func_103303_l(C_100730_lb var1) {
      return var1.func_103085_a(C_100698_ks.func_109218_a(this), 3);
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      this.field_103559_d.func_108218_a(false);
      return super.func_103085_a(var1, var2);
   }

   protected void func_103323_a(boolean var1, int var2) {}

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      if(this.func_103552_m()) {
         if(var1.field_103847_bT.equalsIgnoreCase(this.func_103556_o()) && !this.field_103229_p.field_109557_J && !this.func_103524_c(var2)) {
            this.field_103559_d.func_108218_a(!this.func_103553_n());
         }
      } else if(this.field_103562_e.func_108039_f() && var2 != null && var2.field_111397_c == C_100992_tt.field_110902_aU.field_110891_cf && var1.func_103082_e(this) < 9.0D) {
         if(!var1.field_103869_cf.field_111597_d) {
            --var2.field_111398_a;
         }

         if(var2.field_111398_a <= 0) {
            var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
         }

         if(!this.field_103229_p.field_109557_J) {
            if(this.field_103232_aa.nextInt(3) == 0) {
               this.func_103551_g(true);
               this.func_103561_r(1 + this.field_103229_p.field_109577_u.nextInt(3));
               this.func_103555_a(var1.field_103847_bT);
               this.func_103550_f(true);
               this.field_103559_d.func_108218_a(true);
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

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      C_100535_om var2 = new C_100535_om(this.field_103229_p);
      if(this.func_103552_m()) {
         var2.func_103555_a(this.func_103556_o());
         var2.func_103551_g(true);
         var2.func_103561_r(this.func_103560_t());
      }

      return var2;
   }

   public boolean func_103524_c(C_100994_tv var1) {
      return var1 != null && var1.field_111397_c == C_100992_tt.field_110902_aU.field_110891_cf;
   }

   public boolean func_103522_b(C_100544_oh var1) {
      if(var1 == this) {
         return false;
      } else if(!this.func_103552_m()) {
         return false;
      } else if(!(var1 instanceof C_100535_om)) {
         return false;
      } else {
         C_100535_om var2 = (C_100535_om)var1;
         return !var2.func_103552_m()?false:this.func_103525_r() && var2.func_103525_r();
      }
   }

   public int func_103560_t() {
      return this.field_103234_ag.func_108842_a(18);
   }

   public void func_103561_r(int var1) {
      this.field_103234_ag.func_108851_b(18, Byte.valueOf((byte)var1));
   }

   public boolean func_103380_bp() {
      if(this.field_103229_p.field_109577_u.nextInt(3) == 0) {
         return false;
      } else {
         if(this.field_103229_p.func_109410_b(this.field_103173_D) && this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty() && !this.field_103229_p.func_109413_d(this.field_103173_D)) {
            int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
            int var2 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);
            int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
            if(var2 < 63) {
               return false;
            }

            int var4 = this.field_103229_p.func_109349_a(var1, var2 - 1, var3);
            if(var4 == C_100451_alf.field_106121_x.field_106162_cm || var4 == C_100451_alf.field_106080_N.field_106162_cm) {
               return true;
            }
         }

         return false;
      }
   }

   public String func_103139_an() {
      return this.func_103552_m()?"entity.Cat.name":super.func_103139_an();
   }

   public void func_103337_bD() {
      if(this.field_103229_p.field_109577_u.nextInt(7) == 0) {
         for(int var1 = 0; var1 < 2; ++var1) {
            C_100535_om var2 = new C_100535_om(this.field_103229_p);
            var2.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, 0.0F);
            var2.func_103519_a(-24000);
            this.field_103229_p.func_109513_d(var2);
         }
      }

   }
}
