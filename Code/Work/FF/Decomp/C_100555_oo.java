import java.util.Random;

public class C_100555_oo extends C_100544_oh {

   public static final float[][] field_103548_d = new float[][]{{1.0F, 1.0F, 1.0F}, {0.95F, 0.7F, 0.2F}, {0.9F, 0.5F, 0.85F}, {0.6F, 0.7F, 0.95F}, {0.9F, 0.9F, 0.2F}, {0.5F, 0.8F, 0.1F}, {0.95F, 0.7F, 0.8F}, {0.3F, 0.3F, 0.3F}, {0.6F, 0.6F, 0.6F}, {0.3F, 0.6F, 0.7F}, {0.7F, 0.4F, 0.9F}, {0.2F, 0.4F, 0.8F}, {0.5F, 0.4F, 0.3F}, {0.4F, 0.5F, 0.2F}, {0.8F, 0.3F, 0.3F}, {0.1F, 0.1F, 0.1F}};
   private int field_103549_e;
   private C_100613_mh field_103547_f = new C_100613_mh(this);


   public C_100555_oo(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/sheep.png";
      this.func_103161_a(0.9F, 1.3F);
      float var2 = 0.23F;
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(1, new C_100637_nd(this, 0.38F));
      this.field_103408_bn.func_108888_a(2, new C_100614_me(this, var2));
      this.field_103408_bn.func_108888_a(3, new C_100507_nn(this, 0.25F, C_100992_tt.field_110821_T.field_110891_cf, false));
      this.field_103408_bn.func_108888_a(4, new C_100617_ml(this, 0.25F));
      this.field_103408_bn.func_108888_a(5, this.field_103547_f);
      this.field_103408_bn.func_108888_a(6, new C_100640_ng(this, var2));
      this.field_103408_bn.func_108888_a(7, new C_100624_mr(this, C_101095_qg.class, 6.0F));
      this.field_103408_bn.func_108888_a(8, new C_100639_nf(this));
   }

   protected boolean func_103321_bb() {
      return true;
   }

   protected void func_103295_bi() {
      this.field_103549_e = this.field_103547_f.func_108080_f();
      super.func_103295_bi();
   }

   public void func_103313_c() {
      if(this.field_103229_p.field_109557_J) {
         this.field_103549_e = Math.max(0, this.field_103549_e - 1);
      }

      super.func_103313_c();
   }

   public int func_103378_aS() {
      return 8;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Byte((byte)0));
   }

   protected void func_103323_a(boolean var1, int var2) {
      if(!this.func_103543_n()) {
         this.func_103140_a(new C_100994_tv(C_100451_alf.field_106252_ae.field_106162_cm, 1, this.func_103546_m()), 0.0F);
      }

   }

   protected int func_103377_aZ() {
      return C_100451_alf.field_106252_ae.field_106162_cm;
   }

   public void func_103159_a(byte var1) {
      if(var1 == 10) {
         this.field_103549_e = 40;
      } else {
         super.func_103159_a(var1);
      }

   }

   public float func_103541_j(float var1) {
      return this.field_103549_e <= 0?0.0F:(this.field_103549_e >= 4 && this.field_103549_e <= 36?1.0F:(this.field_103549_e < 4?((float)this.field_103549_e - var1) / 4.0F:-((float)(this.field_103549_e - 40) - var1) / 4.0F));
   }

   public float func_103542_k(float var1) {
      if(this.field_103549_e > 4 && this.field_103549_e <= 36) {
         float var2 = ((float)(this.field_103549_e - 4) - var1) / 32.0F;
         return 0.62831855F + 0.21991149F * C_100650_jv.func_108924_a(var2 * 28.7F);
      } else {
         return this.field_103549_e > 0?0.62831855F:this.field_103177_A / 57.295776F;
      }
   }

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      if(var2 != null && var2.field_111397_c == C_100992_tt.field_110883_be.field_110891_cf && !this.func_103543_n() && !this.func_103357_h_()) {
         if(!this.field_103229_p.field_109557_J) {
            this.func_103540_f(true);
            int var3 = 1 + this.field_103232_aa.nextInt(3);

            for(int var4 = 0; var4 < var3; ++var4) {
               C_100576_pg var5 = this.func_103140_a(new C_100994_tv(C_100451_alf.field_106252_ae.field_106162_cm, 1, this.func_103546_m()), 1.0F);
               var5.field_103240_x += (double)(this.field_103232_aa.nextFloat() * 0.05F);
               var5.field_103215_w += (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.1F);
               var5.field_103238_y += (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.1F);
            }
         }

         var2.func_111363_a(1, var1);
         this.field_103229_p.func_109412_a(this, "mob.sheep.shear", 1.0F, 1.0F);
      }

      return super.func_103134_c(var1);
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107509_a("Sheared", this.func_103543_n());
      var1.func_107527_a("Color", (byte)this.func_103546_m());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103540_f(var1.func_107519_n("Sheared"));
      this.func_103544_r(var1.func_107524_c("Color"));
   }

   protected String func_103354_aW() {
      return "mob.sheep.say";
   }

   protected String func_103387_aX() {
      return "mob.sheep.say";
   }

   protected String func_103307_aY() {
      return "mob.sheep.say";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.sheep.step", 0.15F, 1.0F);
   }

   public int func_103546_m() {
      return this.field_103234_ag.func_108842_a(16) & 15;
   }

   public void func_103544_r(int var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & 240 | var1 & 15)));
   }

   public boolean func_103543_n() {
      return (this.field_103234_ag.func_108842_a(16) & 16) != 0;
   }

   public void func_103540_f(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 16)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -17)));
      }

   }

   public static int func_103545_a(Random var0) {
      int var1 = var0.nextInt(100);
      return var1 < 5?15:(var1 < 10?7:(var1 < 15?8:(var1 < 18?12:(var0.nextInt(500) == 0?6:0))));
   }

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      C_100555_oo var2 = (C_100555_oo)var1;
      C_100555_oo var3 = new C_100555_oo(this.field_103229_p);
      if(this.field_103232_aa.nextBoolean()) {
         var3.func_103544_r(this.func_103546_m());
      } else {
         var3.func_103544_r(var2.func_103546_m());
      }

      return var3;
   }

   public void func_103320_aG() {
      this.func_103540_f(false);
      if(this.func_103357_h_()) {
         int var1 = this.func_103520_b() + 1200;
         if(var1 > 0) {
            var1 = 0;
         }

         this.func_103519_a(var1);
      }

   }

   public void func_103337_bD() {
      this.func_103544_r(func_103545_a(this.field_103229_p.field_109577_u));
   }

}
