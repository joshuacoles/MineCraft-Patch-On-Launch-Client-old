
public class C_100537_on extends C_100544_oh {

   private final C_100615_mf field_103532_d;


   public C_100537_on(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/pig.png";
      this.func_103161_a(0.9F, 0.9F);
      this.func_103383_ay().func_108291_a(true);
      float var2 = 0.25F;
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(1, new C_100637_nd(this, 0.38F));
      this.field_103408_bn.func_108888_a(2, this.field_103532_d = new C_100615_mf(this, 0.34F));
      this.field_103408_bn.func_108888_a(3, new C_100614_me(this, var2));
      this.field_103408_bn.func_108888_a(4, new C_100507_nn(this, 0.3F, C_100992_tt.field_110931_bR.field_110891_cf, false));
      this.field_103408_bn.func_108888_a(4, new C_100507_nn(this, 0.3F, C_100992_tt.field_110947_bK.field_110891_cf, false));
      this.field_103408_bn.func_108888_a(5, new C_100617_ml(this, 0.28F));
      this.field_103408_bn.func_108888_a(6, new C_100640_ng(this, var2));
      this.field_103408_bn.func_108888_a(7, new C_100624_mr(this, C_101095_qg.class, 6.0F));
      this.field_103408_bn.func_108888_a(8, new C_100639_nf(this));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 10;
   }

   protected void func_103295_bi() {
      super.func_103295_bi();
   }

   public boolean func_103398_bF() {
      C_100994_tv var1 = ((C_101095_qg)this.field_103206_n).func_103328_bA();
      return var1 != null && var1.field_111397_c == C_100992_tt.field_110931_bR.field_110891_cf;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)0));
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107509_a("Saddle", this.func_103531_m());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103530_f(var1.func_107519_n("Saddle"));
   }

   protected String func_103354_aW() {
      return "mob.pig.say";
   }

   protected String func_103387_aX() {
      return "mob.pig.say";
   }

   protected String func_103307_aY() {
      return "mob.pig.death";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.pig.step", 0.15F, 1.0F);
   }

   public boolean func_103134_c(C_101095_qg var1) {
      if(super.func_103134_c(var1)) {
         return true;
      } else if(this.func_103531_m() && !this.field_103229_p.field_109557_J && (this.field_103206_n == null || this.field_103206_n == var1)) {
         var1.func_103064_a(this);
         return true;
      } else {
         return false;
      }
   }

   protected int func_103377_aZ() {
      return this.func_103149_af()?C_100992_tt.field_110930_ar.field_110891_cf:C_100992_tt.field_110932_aq.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(3) + 1 + this.field_103232_aa.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         if(this.func_103149_af()) {
            this.func_103111_b(C_100992_tt.field_110930_ar.field_110891_cf, 1);
         } else {
            this.func_103111_b(C_100992_tt.field_110932_aq.field_110891_cf, 1);
         }
      }

      if(this.func_103531_m()) {
         this.func_103111_b(C_100992_tt.field_110913_aA.field_110891_cf, 1);
      }

   }

   public boolean func_103531_m() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   public void func_103530_f(boolean var1) {
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)1));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)0));
      }

   }

   public void func_103155_a(C_100570_pd var1) {
      if(!this.field_103229_p.field_109557_J) {
         C_101103_pt var2 = new C_101103_pt(this.field_103229_p);
         var2.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);
         this.field_103229_p.func_109513_d(var2);
         this.func_103121_x();
      }
   }

   protected void func_103124_a(float var1) {
      super.func_103124_a(var1);
      if(var1 > 5.0F && this.field_103206_n instanceof C_101095_qg) {
         ((C_101095_qg)this.field_103206_n).func_103761_a(C_100822_iy.field_110074_u);
      }

   }

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      return new C_100537_on(this.field_103229_p);
   }

   public boolean func_103524_c(C_100994_tv var1) {
      return var1 != null && var1.field_111397_c == C_100992_tt.field_110947_bK.field_110891_cf;
   }

   public C_100615_mf func_103529_n() {
      return this.field_103532_d;
   }
}
