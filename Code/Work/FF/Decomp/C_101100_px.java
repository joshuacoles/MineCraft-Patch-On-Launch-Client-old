
public class C_101100_px extends C_100595_ln implements C_100587_pn {

   public float field_103632_b;
   public float field_103633_c;
   public float field_103630_d;
   private int field_103631_e = 0;


   public C_101100_px(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/slime.png";
      int var2 = 1 << this.field_103232_aa.nextInt(3);
      this.field_103181_M = 0.0F;
      this.field_103631_e = this.field_103232_aa.nextInt(20) + 10;
      this.func_103620_a(var2);
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Byte((byte)1));
   }

   public void func_103620_a(int var1) {
      this.field_103234_ag.func_108851_b(16, new Byte((byte)var1));
      this.func_103161_a(0.6F * (float)var1, 0.6F * (float)var1);
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.func_103298_j(this.func_103378_aS());
      this.field_103421_bc = var1;
   }

   public int func_103378_aS() {
      int var1 = this.func_103624_p();
      return var1 * var1;
   }

   public int func_103624_p() {
      return this.field_103234_ag.func_108842_a(16);
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("Size", this.func_103624_p() - 1);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103620_a(var1.func_107514_e("Size") + 1);
   }

   protected String func_103623_h() {
      return "slime";
   }

   protected String func_103627_n() {
      return "mob.slime." + (this.func_103624_p() > 1?"big":"small");
   }

   public void func_103165_j_() {
      if(!this.field_103229_p.field_109557_J && this.field_103229_p.field_109578_t == 0 && this.func_103624_p() > 0) {
         this.field_103180_L = true;
      }

      this.field_103633_c += (this.field_103632_b - this.field_103633_c) * 0.5F;
      this.field_103630_d = this.field_103633_c;
      boolean var1 = this.field_103174_E;
      super.func_103165_j_();
      if(this.field_103174_E && !var1) {
         int var2 = this.func_103624_p();

         for(int var3 = 0; var3 < var2 * 8; ++var3) {
            float var4 = this.field_103232_aa.nextFloat() * 3.1415927F * 2.0F;
            float var5 = this.field_103232_aa.nextFloat() * 0.5F + 0.5F;
            float var6 = C_100650_jv.func_108924_a(var4) * (float)var2 * 0.5F * var5;
            float var7 = C_100650_jv.func_108928_b(var4) * (float)var2 * 0.5F * var5;
            this.field_103229_p.func_109428_a(this.func_103623_h(), this.field_103221_t + (double)var6, this.field_103173_D.field_107915_b, this.field_103217_v + (double)var7, 0.0D, 0.0D, 0.0D);
         }

         if(this.func_103622_o()) {
            this.field_103229_p.func_109412_a(this, this.func_103627_n(), this.func_103384_aV(), ((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.field_103632_b = -0.5F;
      } else if(!this.field_103174_E && var1) {
         this.field_103632_b = 1.0F;
      }

      this.func_103619_k();
   }

   protected void func_103288_bk() {
      this.func_103349_bh();
      C_101095_qg var1 = this.field_103229_p.func_109455_b(this, 16.0D);
      if(var1 != null) {
         this.func_103371_a(var1, 10.0F, 20.0F);
      }

      if(this.field_103174_E && this.field_103631_e-- <= 0) {
         this.field_103631_e = this.func_103625_j();
         if(var1 != null) {
            this.field_103631_e /= 3;
         }

         this.field_103491_bG = true;
         if(this.func_103621_q()) {
            this.field_103229_p.func_109412_a(this, this.func_103627_n(), this.func_103384_aV(), ((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.field_103484_bD = 1.0F - this.field_103232_aa.nextFloat() * 2.0F;
         this.field_103485_bE = (float)(1 * this.func_103624_p());
      } else {
         this.field_103491_bG = false;
         if(this.field_103174_E) {
            this.field_103484_bD = this.field_103485_bE = 0.0F;
         }
      }

   }

   protected void func_103619_k() {
      this.field_103632_b *= 0.6F;
   }

   protected int func_103625_j() {
      return this.field_103232_aa.nextInt(20) + 10;
   }

   protected C_101100_px func_103626_i() {
      return new C_101100_px(this.field_103229_p);
   }

   public void func_103121_x() {
      int var1 = this.func_103624_p();
      if(!this.field_103229_p.field_109557_J && var1 > 1 && this.func_103330_aT() <= 0) {
         int var2 = 2 + this.field_103232_aa.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            C_101100_px var6 = this.func_103626_i();
            var6.func_103620_a(var1 / 2);
            var6.func_103055_b(this.field_103221_t + (double)var4, this.field_103219_u + 0.5D, this.field_103217_v + (double)var5, this.field_103232_aa.nextFloat() * 360.0F, 0.0F);
            this.field_103229_p.func_109513_d(var6);
         }
      }

      super.func_103121_x();
   }

   public void func_103096_b_(C_101095_qg var1) {
      if(this.func_103629_l()) {
         int var2 = this.func_103624_p();
         if(this.func_103308_m(var1) && this.func_103082_e(var1) < 0.6D * (double)var2 * 0.6D * (double)var2 && var1.func_103085_a(C_100698_ks.func_109218_a(this), this.func_103628_m())) {
            this.field_103229_p.func_109412_a(this, "mob.attack", 1.0F, (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   protected boolean func_103629_l() {
      return this.func_103624_p() > 1;
   }

   protected int func_103628_m() {
      return this.func_103624_p();
   }

   protected String func_103387_aX() {
      return "mob.slime." + (this.func_103624_p() > 1?"big":"small");
   }

   protected String func_103307_aY() {
      return "mob.slime." + (this.func_103624_p() > 1?"big":"small");
   }

   protected int func_103377_aZ() {
      return this.func_103624_p() == 1?C_100992_tt.field_110909_aM.field_110891_cf:0;
   }

   public boolean func_103380_bp() {
      C_101272_za var1 = this.field_103229_p.func_109377_d(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103217_v));
      if(this.field_103229_p.func_109429_J().func_107143_u() == C_100845_xp.field_110159_c && this.field_103232_aa.nextInt(4) != 1) {
         return false;
      } else {
         if(this.func_103624_p() == 1 || this.field_103229_p.field_109578_t > 0) {
            if(this.field_103229_p.func_109362_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103217_v)) == C_101324_xz.field_112502_h && this.field_103219_u > 50.0D && this.field_103219_u < 70.0D && this.field_103229_p.func_109523_l(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) <= this.field_103232_aa.nextInt(8)) {
               return super.func_103380_bp();
            }

            if(this.field_103232_aa.nextInt(10) == 0 && var1.func_112318_a(987234911L).nextInt(10) == 0 && this.field_103219_u < 40.0D) {
               return super.func_103380_bp();
            }
         }

         return false;
      }
   }

   protected float func_103384_aV() {
      return 0.4F * (float)this.func_103624_p();
   }

   public int func_103290_bm() {
      return 0;
   }

   protected boolean func_103621_q() {
      return this.func_103624_p() > 0;
   }

   protected boolean func_103622_o() {
      return this.func_103624_p() > 2;
   }
}
