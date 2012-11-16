import java.util.Calendar;

public class C_101097_qa extends C_101110_ps {

   private int field_103749_d = 0;


   public C_101097_qa(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/zombie.png";
      this.field_103489_bI = 0.23F;
      this.func_103383_ay().func_108298_b(true);
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(1, new C_100609_md(this));
      this.field_103408_bn.func_108888_a(2, new C_100629_mu(this, C_101095_qg.class, this.field_103489_bI, false));
      this.field_103408_bn.func_108888_a(3, new C_100629_mu(this, C_101098_qd.class, this.field_103489_bI, true));
      this.field_103408_bn.func_108888_a(4, new C_100630_mx(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(5, new C_100631_mw(this, this.field_103489_bI, false));
      this.field_103408_bn.func_108888_a(6, new C_100640_ng(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(7, new C_100624_mr(this, C_101095_qg.class, 8.0F));
      this.field_103408_bn.func_108888_a(7, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100501_nq(this, false));
      this.field_103409_bo.func_108888_a(2, new C_100499_nr(this, C_101095_qg.class, 16.0F, 0, true));
      this.field_103409_bo.func_108888_a(2, new C_100499_nr(this, C_101098_qd.class, 16.0F, 0, false));
   }

   public float func_103353_by() {
      return super.func_103353_by() * (this.func_103357_h_()?1.5F:1.0F);
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.func_103087_v().func_108841_a(12, Byte.valueOf((byte)0));
      this.func_103087_v().func_108841_a(13, Byte.valueOf((byte)0));
      this.func_103087_v().func_108841_a(14, Byte.valueOf((byte)0));
   }

   public String func_103129_O() {
      return this.func_103746_m()?"/mob/zombie_villager.png":"/mob/zombie.png";
   }

   public int func_103378_aS() {
      return 20;
   }

   public int func_103350_aU() {
      int var1 = super.func_103350_aU() + 2;
      if(var1 > 20) {
         var1 = 20;
      }

      return var1;
   }

   protected boolean func_103321_bb() {
      return true;
   }

   public boolean func_103357_h_() {
      return this.func_103087_v().func_108842_a(12) == 1;
   }

   public void func_103742_f(boolean var1) {
      this.func_103087_v().func_108851_b(12, Byte.valueOf((byte)1));
   }

   public boolean func_103746_m() {
      return this.func_103087_v().func_108842_a(13) == 1;
   }

   public void func_103744_g(boolean var1) {
      this.func_103087_v().func_108851_b(13, Byte.valueOf((byte)(var1?1:0)));
   }

   public void func_103313_c() {
      if(this.field_103229_p.func_109402_t() && !this.field_103229_p.field_109557_J && !this.func_103357_h_()) {
         float var1 = this.func_103057_c(1.0F);
         if(var1 > 0.5F && this.field_103232_aa.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && this.field_103229_p.func_109502_j(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v))) {
            boolean var2 = true;
            C_100994_tv var3 = this.func_103374_p(4);
            if(var3 != null) {
               if(var3.func_111387_f()) {
                  var3.func_111371_b(var3.func_111357_i() + this.field_103232_aa.nextInt(2));
                  if(var3.func_111357_i() >= var3.func_111364_k()) {
                     this.func_103296_a(var3);
                     this.func_103060_b(4, (C_100994_tv)null);
                  }
               }

               var2 = false;
            }

            if(var2) {
               this.func_103112_c(8);
            }
         }
      }

      super.func_103313_c();
   }

   public void func_103165_j_() {
      if(!this.field_103229_p.field_109557_J && this.func_103745_o()) {
         int var1 = this.func_103748_q();
         this.field_103749_d -= var1;
         if(this.field_103749_d <= 0) {
            this.func_103747_p();
         }
      }

      super.func_103165_j_();
   }

   public int func_103643_c(C_100730_lb var1) {
      C_100994_tv var2 = this.func_103328_bA();
      int var3 = 4;
      if(var2 != null) {
         var3 += var2.func_111350_a(this);
      }

      return var3;
   }

   protected String func_103354_aW() {
      return "mob.zombie.say";
   }

   protected String func_103387_aX() {
      return "mob.zombie.hurt";
   }

   protected String func_103307_aY() {
      return "mob.zombie.death";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.zombie.step", 0.15F, 1.0F);
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110875_bm.field_110891_cf;
   }

   public C_100601_lp func_103366_bz() {
      return C_100601_lp.field_108818_b;
   }

   protected void func_103287_l(int var1) {
      switch(this.field_103232_aa.nextInt(3)) {
      case 0:
         this.func_103111_b(C_100992_tt.field_110839_o.field_110891_cf, 1);
         break;
      case 1:
         this.func_103111_b(C_100992_tt.field_110947_bK.field_110891_cf, 1);
         break;
      case 2:
         this.func_103111_b(C_100992_tt.field_110941_bL.field_110891_cf, 1);
      }

   }

   protected void func_103339_bB() {
      super.func_103339_bB();
      if(this.field_103232_aa.nextFloat() < (this.field_103229_p.field_109578_t == 3?0.05F:0.01F)) {
         int var1 = this.field_103232_aa.nextInt(3);
         if(var1 == 0) {
            this.func_103060_b(0, new C_100994_tv(C_100992_tt.field_110852_q));
         } else {
            this.func_103060_b(0, new C_100994_tv(C_100992_tt.field_110831_f));
         }
      }

   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      if(this.func_103357_h_()) {
         var1.func_107509_a("IsBaby", true);
      }

      if(this.func_103746_m()) {
         var1.func_107509_a("IsVillager", true);
      }

      var1.func_107520_a("ConversionTime", this.func_103745_o()?this.field_103749_d:-1);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      if(var1.func_107519_n("IsBaby")) {
         this.func_103742_f(true);
      }

      if(var1.func_107519_n("IsVillager")) {
         this.func_103744_g(true);
      }

      if(var1.func_107516_b("ConversionTime") && var1.func_107514_e("ConversionTime") > -1) {
         this.func_103743_a(var1.func_107514_e("ConversionTime"));
      }

   }

   public void func_103079_a(C_100595_ln var1) {
      super.func_103079_a(var1);
      if(this.field_103229_p.field_109578_t >= 2 && var1 instanceof C_101098_qd) {
         if(this.field_103229_p.field_109578_t == 2 && this.field_103232_aa.nextBoolean()) {
            return;
         }

         C_101097_qa var2 = new C_101097_qa(this.field_103229_p);
         var2.func_103154_j(var1);
         this.field_103229_p.func_109383_e(var1);
         var2.func_103337_bD();
         var2.func_103744_g(true);
         if(var1.func_103357_h_()) {
            var2.func_103742_f(true);
         }

         this.field_103229_p.func_109513_d(var2);
         this.field_103229_p.func_109492_a((C_101095_qg)null, 1016, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
      }

   }

   public void func_103337_bD() {
      this.field_103404_bs = this.field_103232_aa.nextFloat() < field_103463_as[this.field_103229_p.field_109578_t];
      if(this.field_103229_p.field_109577_u.nextFloat() < 0.05F) {
         this.func_103744_g(true);
      }

      this.func_103339_bB();
      this.func_103336_bC();
      if(this.func_103374_p(4) == null) {
         Calendar var1 = this.field_103229_p.func_109388_S();
         if(var1.get(2) + 1 == 10 && var1.get(5) == 31 && this.field_103232_aa.nextFloat() < 0.25F) {
            this.func_103060_b(4, new C_100994_tv(this.field_103232_aa.nextFloat() < 0.1F?C_100451_alf.field_106144_bi:C_100451_alf.field_106148_bd));
            this.field_103410_bp[4] = 0.0F;
         }
      }

   }

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.func_103780_bP();
      if(var2 != null && var2.func_111365_b() == C_100992_tt.field_110926_at && var2.func_111367_j() == 0 && this.func_103746_m() && this.func_103300_a(C_100690_kw.field_109181_t)) {
         if(!var1.field_103869_cf.field_111597_d) {
            --var2.field_111398_a;
         }

         if(var2.field_111398_a <= 0) {
            var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
         }

         if(!this.field_103229_p.field_109557_J) {
            this.func_103743_a(this.field_103232_aa.nextInt(2401) + 3600);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void func_103743_a(int var1) {
      this.field_103749_d = var1;
      this.func_103087_v().func_108851_b(14, Byte.valueOf((byte)1));
      this.func_103396_o(C_100690_kw.field_109181_t.field_109159_H);
      this.func_103389_d(new C_100692_kx(C_100690_kw.field_109164_g.field_109159_H, var1, Math.min(this.field_103229_p.field_109578_t - 1, 0)));
      this.field_103229_p.func_109464_a(this, (byte)16);
   }

   public void func_103159_a(byte var1) {
      if(var1 == 16) {
         this.field_103229_p.func_109541_b(this.field_103221_t + 0.5D, this.field_103219_u + 0.5D, this.field_103217_v + 0.5D, "mob.zombie.remedy", 1.0F + this.field_103232_aa.nextFloat(), this.field_103232_aa.nextFloat() * 0.7F + 0.3F);
      } else {
         super.func_103159_a(var1);
      }

   }

   public boolean func_103745_o() {
      return this.func_103087_v().func_108842_a(14) == 1;
   }

   protected void func_103747_p() {
      C_101098_qd var1 = new C_101098_qd(this.field_103229_p);
      var1.func_103154_j(this);
      var1.func_103337_bD();
      var1.func_103593_q();
      if(this.func_103357_h_()) {
         var1.func_103519_a(-24000);
      }

      this.field_103229_p.func_109383_e(this);
      this.field_103229_p.func_109513_d(var1);
      var1.func_103389_d(new C_100692_kx(C_100690_kw.field_109175_k.field_109159_H, 200, 0));
      this.field_103229_p.func_109492_a((C_101095_qg)null, 1017, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
   }

   protected int func_103748_q() {
      int var1 = 1;
      if(this.field_103232_aa.nextFloat() < 0.01F) {
         int var2 = 0;

         for(int var3 = (int)this.field_103221_t - 4; var3 < (int)this.field_103221_t + 4 && var2 < 14; ++var3) {
            for(int var4 = (int)this.field_103219_u - 4; var4 < (int)this.field_103219_u + 4 && var2 < 14; ++var4) {
               for(int var5 = (int)this.field_103217_v - 4; var5 < (int)this.field_103217_v + 4 && var2 < 14; ++var5) {
                  int var6 = this.field_103229_p.func_109349_a(var3, var4, var5);
                  if(var6 == C_100451_alf.field_106129_bs.field_106162_cm || var6 == C_100451_alf.field_106089_V.field_106162_cm) {
                     if(this.field_103232_aa.nextFloat() < 0.3F) {
                        ++var1;
                     }

                     ++var2;
                  }
               }
            }
         }
      }

      return var1;
   }
}
