
public class C_100557_or extends C_100538_ok {

   private int field_103687_e = 0;
   C_100531_ob field_103686_d = null;
   private int field_103684_f;
   private int field_103685_g;


   public C_100557_or(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/villager_golem.png";
      this.func_103161_a(1.4F, 2.9F);
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(1, new C_100629_mu(this, 0.25F, true));
      this.field_103408_bn.func_108888_a(2, new C_100633_my(this, 0.22F, 32.0F));
      this.field_103408_bn.func_108888_a(3, new C_100631_mw(this, 0.16F, true));
      this.field_103408_bn.func_108888_a(4, new C_100630_mx(this, 0.16F));
      this.field_103408_bn.func_108888_a(5, new C_100635_nb(this));
      this.field_103408_bn.func_108888_a(6, new C_100640_ng(this, 0.16F));
      this.field_103408_bn.func_108888_a(7, new C_100624_mr(this, C_101095_qg.class, 6.0F));
      this.field_103408_bn.func_108888_a(8, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100503_np(this));
      this.field_103409_bo.func_108888_a(2, new C_100501_nq(this, false));
      this.field_103409_bo.func_108888_a(3, new C_100499_nr(this, C_100595_ln.class, 16.0F, 0, false, true, C_100587_pn.field_103618_a));
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)0));
   }

   public boolean func_103321_bb() {
      return true;
   }

   protected void func_103314_bj() {
      if(--this.field_103687_e <= 0) {
         this.field_103687_e = 70 + this.field_103232_aa.nextInt(50);
         this.field_103686_d = this.field_103229_p.field_109550_C.func_107279_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v), 32);
         if(this.field_103686_d == null) {
            this.func_103360_aK();
         } else {
            C_100013_k var1 = this.field_103686_d.func_108609_a();
            this.func_103285_b(var1.field_105273_a, var1.field_105271_b, var1.field_105272_c, (int)((float)this.field_103686_d.func_108616_b() * 0.6F));
         }
      }

      super.func_103314_bj();
   }

   public int func_103378_aS() {
      return 100;
   }

   protected int func_103332_g(int var1) {
      return var1;
   }

   protected void func_103395_n(C_100730_lb var1) {
      if(var1 instanceof C_100587_pn && this.func_103312_aA().nextInt(20) == 0) {
         this.func_103347_b((C_100595_ln)var1);
      }

      super.func_103395_n(var1);
   }

   public void func_103313_c() {
      super.func_103313_c();
      if(this.field_103684_f > 0) {
         --this.field_103684_f;
      }

      if(this.field_103685_g > 0) {
         --this.field_103685_g;
      }

      if(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y > 2.500000277905201E-7D && this.field_103232_aa.nextInt(5) == 0) {
         int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
         int var2 = C_100650_jv.func_108910_c(this.field_103219_u - 0.20000000298023224D - (double)this.field_103181_M);
         int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
         int var4 = this.field_103229_p.func_109349_a(var1, var2, var3);
         if(var4 > 0) {
            this.field_103229_p.func_109428_a("tilecrack_" + var4, this.field_103221_t + ((double)this.field_103232_aa.nextFloat() - 0.5D) * (double)this.field_103182_N, this.field_103173_D.field_107915_b + 0.1D, this.field_103217_v + ((double)this.field_103232_aa.nextFloat() - 0.5D) * (double)this.field_103182_N, 4.0D * ((double)this.field_103232_aa.nextFloat() - 0.5D), 0.5D, ((double)this.field_103232_aa.nextFloat() - 0.5D) * 4.0D);
         }
      }

   }

   public boolean func_103386_a(Class var1) {
      return this.func_103682_p() && C_101095_qg.class.isAssignableFrom(var1)?false:super.func_103386_a(var1);
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107509_a("PlayerCreated", this.func_103682_p());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103679_g(var1.func_107519_n("PlayerCreated"));
   }

   public boolean func_103303_l(C_100730_lb var1) {
      this.field_103684_f = 10;
      this.field_103229_p.func_109464_a(this, (byte)4);
      boolean var2 = var1.func_103085_a(C_100698_ks.func_109218_a(this), 7 + this.field_103232_aa.nextInt(15));
      if(var2) {
         var1.field_103240_x += 0.4000000059604645D;
      }

      this.field_103229_p.func_109412_a(this, "mob.irongolem.throw", 1.0F, 1.0F);
      return var2;
   }

   public void func_103159_a(byte var1) {
      if(var1 == 4) {
         this.field_103684_f = 10;
         this.field_103229_p.func_109412_a(this, "mob.irongolem.throw", 1.0F, 1.0F);
      } else if(var1 == 11) {
         this.field_103685_g = 400;
      } else {
         super.func_103159_a(var1);
      }

   }

   public C_100531_ob func_103681_m() {
      return this.field_103686_d;
   }

   public int func_103683_n() {
      return this.field_103684_f;
   }

   public void func_103678_f(boolean var1) {
      this.field_103685_g = var1?400:0;
      this.field_103229_p.func_109464_a(this, (byte)11);
   }

   protected String func_103354_aW() {
      return "none";
   }

   protected String func_103387_aX() {
      return "mob.irongolem.hit";
   }

   protected String func_103307_aY() {
      return "mob.irongolem.death";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.irongolem.walk", 1.0F, 1.0F);
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(3);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100451_alf.field_106250_ah.field_106162_cm, 1);
      }

      var4 = 3 + this.field_103232_aa.nextInt(3);

      for(int var5 = 0; var5 < var4; ++var5) {
         this.func_103111_b(C_100992_tt.field_110839_o.field_110891_cf, 1);
      }

   }

   public int func_103680_o() {
      return this.field_103685_g;
   }

   public boolean func_103682_p() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   public void func_103679_g(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public void func_103311_a(C_100698_ks var1) {
      if(!this.func_103682_p() && this.field_103419_bi != null && this.field_103686_d != null) {
         this.field_103686_d.func_108625_a(this.field_103419_bi.func_102909_c_(), -5);
      }

      super.func_103311_a(var1);
   }
}
