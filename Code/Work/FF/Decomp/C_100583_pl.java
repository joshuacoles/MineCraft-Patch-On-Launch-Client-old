
public class C_100583_pl extends C_101110_ps {

   private int field_103722_d;
   private int field_103723_e;
   private int field_103720_f = 30;
   private int field_103721_g = 3;


   public C_100583_pl(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/creeper.png";
      this.field_103408_bn.func_108888_a(1, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(2, new C_100645_nl(this));
      this.field_103408_bn.func_108888_a(3, new C_100611_mb(this, C_100535_om.class, 6.0F, 0.25F, 0.3F));
      this.field_103408_bn.func_108888_a(4, new C_100629_mu(this, 0.25F, false));
      this.field_103408_bn.func_108888_a(5, new C_100640_ng(this, 0.2F));
      this.field_103408_bn.func_108888_a(6, new C_100624_mr(this, C_101095_qg.class, 8.0F));
      this.field_103408_bn.func_108888_a(6, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100499_nr(this, C_101095_qg.class, 16.0F, 0, true));
      this.field_103409_bo.func_108888_a(2, new C_100501_nq(this, false));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103070_as() {
      return this.func_103335_aF() == null?3:3 + (this.field_103428_aQ - 1);
   }

   protected void func_103124_a(float var1) {
      super.func_103124_a(var1);
      this.field_103723_e = (int)((float)this.field_103723_e + var1 * 1.5F);
      if(this.field_103723_e > this.field_103720_f - 5) {
         this.field_103723_e = this.field_103720_f - 5;
      }

   }

   public int func_103378_aS() {
      return 20;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)-1));
      this.field_103234_ag.func_108841_a(17, Byte.valueOf((byte)0));
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      if(this.field_103234_ag.func_108842_a(17) == 1) {
         var1.func_107509_a("powered", true);
      }

      var1.func_107532_a("Fuse", (short)this.field_103720_f);
      var1.func_107527_a("ExplosionRadius", (byte)this.field_103721_g);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.field_103234_ag.func_108851_b(17, Byte.valueOf((byte)(var1.func_107519_n("powered")?1:0)));
      if(var1.func_107516_b("Fuse")) {
         this.field_103720_f = var1.func_107517_d("Fuse");
      }

      if(var1.func_107516_b("ExplosionRadius")) {
         this.field_103721_g = var1.func_107524_c("ExplosionRadius");
      }

   }

   public void func_103165_j_() {
      if(this.func_103143_S()) {
         this.field_103722_d = this.field_103723_e;
         int var1 = this.func_103719_o();
         if(var1 > 0 && this.field_103723_e == 0) {
            this.field_103229_p.func_109412_a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.field_103723_e += var1;
         if(this.field_103723_e < 0) {
            this.field_103723_e = 0;
         }

         if(this.field_103723_e >= this.field_103720_f) {
            this.field_103723_e = this.field_103720_f;
            if(!this.field_103229_p.field_109557_J) {
               boolean var2 = this.field_103229_p.func_109389_K().func_110281_b("mobGriefing");
               if(this.func_103717_m()) {
                  this.field_103229_p.func_109466_a(this, this.field_103221_t, this.field_103219_u, this.field_103217_v, (float)(this.field_103721_g * 2), var2);
               } else {
                  this.field_103229_p.func_109466_a(this, this.field_103221_t, this.field_103219_u, this.field_103217_v, (float)this.field_103721_g, var2);
               }

               this.func_103121_x();
            }
         }
      }

      super.func_103165_j_();
   }

   protected String func_103387_aX() {
      return "mob.creeper.say";
   }

   protected String func_103307_aY() {
      return "mob.creeper.death";
   }

   public void func_103311_a(C_100698_ks var1) {
      super.func_103311_a(var1);
      if(var1.func_109210_g() instanceof C_101106_pw) {
         this.func_103111_b(C_100992_tt.field_110925_bU.field_110891_cf + this.field_103232_aa.nextInt(10), 1);
      }

   }

   public boolean func_103303_l(C_100730_lb var1) {
      return true;
   }

   public boolean func_103717_m() {
      return this.field_103234_ag.func_108842_a(17) == 1;
   }

   public float func_103718_j(float var1) {
      return ((float)this.field_103722_d + (float)(this.field_103723_e - this.field_103722_d) * var1) / (float)(this.field_103720_f - 2);
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110813_M.field_110891_cf;
   }

   public int func_103719_o() {
      return this.field_103234_ag.func_108842_a(16);
   }

   public void func_103716_a(int var1) {
      this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)var1));
   }

   public void func_103155_a(C_100570_pd var1) {
      super.func_103155_a(var1);
      this.field_103234_ag.func_108851_b(17, Byte.valueOf((byte)1));
   }
}
