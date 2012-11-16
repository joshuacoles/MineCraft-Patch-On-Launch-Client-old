
public class C_101101_py extends C_101110_ps {

   public C_101101_py(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/spider.png";
      this.func_103161_a(1.4F, 0.9F);
      this.field_103489_bI = 0.8F;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Byte((byte)0));
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(!this.field_103229_p.field_109557_J) {
         this.func_103753_f(this.field_103175_F);
      }

   }

   public int func_103378_aS() {
      return 16;
   }

   public double func_103097_X() {
      return (double)this.field_103183_O * 0.75D - 0.5D;
   }

   protected C_100730_lb func_103492_j() {
      float var1 = this.func_103057_c(1.0F);
      if(var1 < 0.5F) {
         double var2 = 16.0D;
         return this.field_103229_p.func_109455_b(this, var2);
      } else {
         return null;
      }
   }

   protected String func_103354_aW() {
      return "mob.spider.say";
   }

   protected String func_103387_aX() {
      return "mob.spider.say";
   }

   protected String func_103307_aY() {
      return "mob.spider.death";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.spider.step", 0.15F, 1.0F);
   }

   protected void func_103500_a(C_100730_lb var1, float var2) {
      float var3 = this.func_103057_c(1.0F);
      if(var3 > 0.5F && this.field_103232_aa.nextInt(100) == 0) {
         this.field_103504_a_ = null;
      } else {
         if(var2 > 2.0F && var2 < 6.0F && this.field_103232_aa.nextInt(10) == 0) {
            if(this.field_103174_E) {
               double var4 = var1.field_103221_t - this.field_103221_t;
               double var6 = var1.field_103217_v - this.field_103217_v;
               float var8 = C_100650_jv.func_108915_a(var4 * var4 + var6 * var6);
               this.field_103215_w = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.field_103215_w * 0.20000000298023224D;
               this.field_103238_y = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.field_103238_y * 0.20000000298023224D;
               this.field_103240_x = 0.4000000059604645D;
            }
         } else {
            super.func_103500_a(var1, var2);
         }

      }
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110819_K.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      super.func_103323_a(var1, var2);
      if(var1 && (this.field_103232_aa.nextInt(3) == 0 || this.field_103232_aa.nextInt(1 + var2) > 0)) {
         this.func_103111_b(C_100992_tt.field_110866_bu.field_110891_cf, 1);
      }

   }

   public boolean func_103327_g_() {
      return this.func_103754_o();
   }

   public void func_103157_am() {}

   public float func_103755_m() {
      return 1.0F;
   }

   public C_100601_lp func_103366_bz() {
      return C_100601_lp.field_108819_c;
   }

   public boolean func_103352_e(C_100692_kx var1) {
      return var1.func_109197_a() == C_100690_kw.field_109180_u.field_109159_H?false:super.func_103352_e(var1);
   }

   public boolean func_103754_o() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   public void func_103753_f(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.field_103234_ag.func_108851_b(16, Byte.valueOf(var2));
   }

   public void func_103337_bD() {
      if(this.field_103229_p.field_109577_u.nextInt(100) == 0) {
         C_101106_pw var1 = new C_101106_pw(this.field_103229_p);
         var1.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, 0.0F);
         var1.func_103337_bD();
         this.field_103229_p.func_109513_d(var1);
         var1.func_103064_a(this);
      }

   }
}
