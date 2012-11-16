
public class C_100541_oj extends C_100544_oh {

   public C_100541_oj(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/cow.png";
      this.func_103161_a(0.9F, 1.3F);
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(1, new C_100637_nd(this, 0.38F));
      this.field_103408_bn.func_108888_a(2, new C_100614_me(this, 0.2F));
      this.field_103408_bn.func_108888_a(3, new C_100507_nn(this, 0.25F, C_100992_tt.field_110821_T.field_110891_cf, false));
      this.field_103408_bn.func_108888_a(4, new C_100617_ml(this, 0.25F));
      this.field_103408_bn.func_108888_a(5, new C_100640_ng(this, 0.2F));
      this.field_103408_bn.func_108888_a(6, new C_100624_mr(this, C_101095_qg.class, 6.0F));
      this.field_103408_bn.func_108888_a(7, new C_100639_nf(this));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 10;
   }

   protected String func_103354_aW() {
      return "mob.cow.say";
   }

   protected String func_103387_aX() {
      return "mob.cow.hurt";
   }

   protected String func_103307_aY() {
      return "mob.cow.hurt";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.cow.step", 0.15F, 1.0F);
   }

   protected float func_103384_aV() {
      return 0.4F;
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110918_aF.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(3) + this.field_103232_aa.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110918_aF.field_110891_cf, 1);
      }

      var3 = this.field_103232_aa.nextInt(3) + 1 + this.field_103232_aa.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         if(this.func_103149_af()) {
            this.func_103111_b(C_100992_tt.field_110872_bj.field_110891_cf, 1);
         } else {
            this.func_103111_b(C_100992_tt.field_110879_bi.field_110891_cf, 1);
         }
      }

   }

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      if(var2 != null && var2.field_111397_c == C_100992_tt.field_110936_aw.field_110891_cf) {
         if(--var2.field_111398_a <= 0) {
            var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, new C_100994_tv(C_100992_tt.field_110919_aG));
         } else if(!var1.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110919_aG))) {
            var1.func_103767_c(new C_100994_tv(C_100992_tt.field_110919_aG.field_110891_cf, 1, 0));
         }

         return true;
      } else {
         return super.func_103134_c(var1);
      }
   }

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      return new C_100541_oj(this.field_103229_p);
   }
}
