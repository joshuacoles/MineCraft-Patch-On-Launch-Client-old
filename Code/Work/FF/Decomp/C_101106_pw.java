import java.util.Calendar;

public class C_101106_pw extends C_101110_ps implements C_101104_pu {

   public C_101106_pw(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/skeleton.png";
      this.field_103489_bI = 0.25F;
      this.field_103408_bn.func_108888_a(1, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(2, new C_100643_nj(this));
      this.field_103408_bn.func_108888_a(3, new C_100618_mi(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(5, new C_100640_ng(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(6, new C_100624_mr(this, C_101095_qg.class, 8.0F));
      this.field_103408_bn.func_108888_a(6, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100501_nq(this, false));
      this.field_103409_bo.func_108888_a(2, new C_100499_nr(this, C_101095_qg.class, 16.0F, 0, true));
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(13, new Byte((byte)0));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 20;
   }

   protected String func_103354_aW() {
      return "mob.skeleton.say";
   }

   protected String func_103387_aX() {
      return "mob.skeleton.hurt";
   }

   protected String func_103307_aY() {
      return "mob.skeleton.death";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.skeleton.step", 0.15F, 1.0F);
   }

   public boolean func_103303_l(C_100730_lb var1) {
      if(super.func_103303_l(var1)) {
         if(this.func_103693_m() == 1 && var1 instanceof C_100595_ln) {
            ((C_100595_ln)var1).func_103389_d(new C_100692_kx(C_100690_kw.field_109179_v.field_109159_H, 200));
         }

         return true;
      } else {
         return false;
      }
   }

   public int func_103643_c(C_100730_lb var1) {
      if(this.func_103693_m() == 1) {
         C_100994_tv var2 = this.func_103328_bA();
         int var3 = 4;
         if(var2 != null) {
            var3 += var2.func_111350_a(this);
         }

         return var3;
      } else {
         return super.func_103643_c(var1);
      }
   }

   public C_100601_lp func_103366_bz() {
      return C_100601_lp.field_108818_b;
   }

   public void func_103313_c() {
      if(this.field_103229_p.func_109402_t() && !this.field_103229_p.field_109557_J) {
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

   public void func_103311_a(C_100698_ks var1) {
      super.func_103311_a(var1);
      if(var1.func_109207_f() instanceof C_101089_qi && var1.func_109210_g() instanceof C_101095_qg) {
         C_101095_qg var2 = (C_101095_qg)var1.func_109210_g();
         double var3 = var2.field_103221_t - this.field_103221_t;
         double var5 = var2.field_103217_v - this.field_103217_v;
         if(var3 * var3 + var5 * var5 >= 2500.0D) {
            var2.func_103761_a(C_100822_iy.field_110073_v);
         }
      }

   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110840_l.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3;
      int var4;
      if(this.func_103693_m() == 1) {
         var3 = this.field_103232_aa.nextInt(3 + var2) - 1;

         for(var4 = 0; var4 < var3; ++var4) {
            this.func_103111_b(C_100992_tt.field_110841_m.field_110891_cf, 1);
         }
      } else {
         var3 = this.field_103232_aa.nextInt(3 + var2);

         for(var4 = 0; var4 < var3; ++var4) {
            this.func_103111_b(C_100992_tt.field_110840_l.field_110891_cf, 1);
         }
      }

      var3 = this.field_103232_aa.nextInt(3 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110903_aX.field_110891_cf, 1);
      }

   }

   protected void func_103287_l(int var1) {
      if(this.func_103693_m() == 1) {
         this.func_103140_a(new C_100994_tv(C_100992_tt.field_110951_bQ.field_110891_cf, 1, 1), 0.0F);
      }

   }

   protected void func_103339_bB() {
      super.func_103339_bB();
      this.func_103060_b(0, new C_100994_tv(C_100992_tt.field_110843_k));
   }

   public String func_103129_O() {
      return this.func_103693_m() == 1?"/mob/skeleton_wither.png":super.func_103129_O();
   }

   public void func_103337_bD() {
      if(this.field_103229_p.field_109576_v instanceof C_101287_zs && this.func_103312_aA().nextInt(5) > 0) {
         this.field_103408_bn.func_108888_a(4, new C_100629_mu(this, C_101095_qg.class, this.field_103489_bI, false));
         this.func_103692_a(1);
         this.func_103060_b(0, new C_100994_tv(C_100992_tt.field_110847_v));
      } else {
         this.field_103408_bn.func_108888_a(4, new C_100641_nh(this, this.field_103489_bI, 60, 10.0F));
         this.func_103339_bB();
         this.func_103336_bC();
      }

      this.field_103404_bs = this.field_103232_aa.nextFloat() < field_103463_as[this.field_103229_p.field_109578_t];
      if(this.func_103374_p(4) == null) {
         Calendar var1 = this.field_103229_p.func_109388_S();
         if(var1.get(2) + 1 == 10 && var1.get(5) == 31 && this.field_103232_aa.nextFloat() < 0.25F) {
            this.func_103060_b(4, new C_100994_tv(this.field_103232_aa.nextFloat() < 0.1F?C_100451_alf.field_106144_bi:C_100451_alf.field_106148_bd));
            this.field_103410_bp[4] = 0.0F;
         }
      }

   }

   public void func_103677_d(C_100595_ln var1) {
      C_101089_qi var2 = new C_101089_qi(this.field_103229_p, this, var1, 1.6F, 12.0F);
      int var3 = C_100878_wh.func_110594_a(C_100904_wf.field_110636_t.field_110643_x, this.func_103328_bA());
      int var4 = C_100878_wh.func_110594_a(C_100904_wf.field_110635_u.field_110643_x, this.func_103328_bA());
      if(var3 > 0) {
         var2.func_104665_b(var2.func_104668_c() + (double)var3 * 0.5D + 0.5D);
      }

      if(var4 > 0) {
         var2.func_104666_a(var4);
      }

      if(C_100878_wh.func_110594_a(C_100904_wf.field_110634_v.field_110643_x, this.func_103328_bA()) > 0 || this.func_103693_m() == 1) {
         var2.func_103112_c(100);
      }

      this.field_103229_p.func_109412_a(this, "random.bow", 1.0F, 1.0F / (this.func_103312_aA().nextFloat() * 0.4F + 0.8F));
      this.field_103229_p.func_109513_d(var2);
   }

   public int func_103693_m() {
      return this.field_103234_ag.func_108842_a(13);
   }

   public void func_103692_a(int var1) {
      this.field_103234_ag.func_108851_b(13, Byte.valueOf((byte)var1));
      this.field_103239_af = var1 == 1;
      if(var1 == 1) {
         this.func_103161_a(0.72F, 2.16F);
      } else {
         this.func_103161_a(0.6F, 1.8F);
      }

   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      if(var1.func_107516_b("SkeletonType")) {
         byte var2 = var1.func_107524_c("SkeletonType");
         this.func_103692_a(var2);
      }

      if(this.func_103693_m() == 1) {
         this.field_103408_bn.func_108888_a(4, new C_100629_mu(this, C_101095_qg.class, this.field_103489_bI, false));
      } else {
         this.field_103408_bn.func_108888_a(4, new C_100641_nh(this, this.field_103489_bI, 60, 10.0F));
      }

   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107527_a("SkeletonType", (byte)this.func_103693_m());
   }
}
