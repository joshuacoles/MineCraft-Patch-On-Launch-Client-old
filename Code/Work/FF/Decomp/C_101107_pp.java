
public class C_101107_pp extends C_100721_lk implements C_100587_pn {

   public int field_103639_b = 0;
   public double field_103640_c;
   public double field_103637_d;
   public double field_103638_e;
   private C_100730_lb field_103641_h = null;
   private int field_103642_i = 0;
   public int field_103635_f = 0;
   public int field_103636_g = 0;


   public C_101107_pp(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/ghast.png";
      this.func_103161_a(4.0F, 4.0F);
      this.field_103239_af = true;
      this.field_103421_bc = 5;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if("fireball".equals(var1.func_109219_l()) && var1.func_109210_g() instanceof C_101095_qg) {
         super.func_103085_a(var1, 1000);
         ((C_101095_qg)var1.func_109210_g()).func_103761_a(C_100822_iy.field_110081_y);
         return true;
      } else {
         return super.func_103085_a(var1, var2);
      }
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)0));
   }

   public int func_103378_aS() {
      return 10;
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      byte var1 = this.field_103234_ag.func_108842_a(16);
      this.field_103448_aF = var1 == 1?"/mob/ghast_fire.png":"/mob/ghast.png";
   }

   protected void func_103288_bk() {
      if(!this.field_103229_p.field_109557_J && this.field_103229_p.field_109578_t == 0) {
         this.func_103121_x();
      }

      this.func_103349_bh();
      this.field_103635_f = this.field_103636_g;
      double var1 = this.field_103640_c - this.field_103221_t;
      double var3 = this.field_103637_d - this.field_103219_u;
      double var5 = this.field_103638_e - this.field_103217_v;
      double var7 = var1 * var1 + var3 * var3 + var5 * var5;
      if(var7 < 1.0D || var7 > 3600.0D) {
         this.field_103640_c = this.field_103221_t + (double)((this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.field_103637_d = this.field_103219_u + (double)((this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.field_103638_e = this.field_103217_v + (double)((this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * 16.0F);
      }

      if(this.field_103639_b-- <= 0) {
         this.field_103639_b += this.field_103232_aa.nextInt(5) + 2;
         var7 = (double)C_100650_jv.func_108915_a(var7);
         if(this.func_103634_a(this.field_103640_c, this.field_103637_d, this.field_103638_e, var7)) {
            this.field_103215_w += var1 / var7 * 0.1D;
            this.field_103240_x += var3 / var7 * 0.1D;
            this.field_103238_y += var5 / var7 * 0.1D;
         } else {
            this.field_103640_c = this.field_103221_t;
            this.field_103637_d = this.field_103219_u;
            this.field_103638_e = this.field_103217_v;
         }
      }

      if(this.field_103641_h != null && this.field_103641_h.field_103180_L) {
         this.field_103641_h = null;
      }

      if(this.field_103641_h == null || this.field_103642_i-- <= 0) {
         this.field_103641_h = this.field_103229_p.func_109455_b(this, 100.0D);
         if(this.field_103641_h != null) {
            this.field_103642_i = 20;
         }
      }

      double var9 = 64.0D;
      if(this.field_103641_h != null && this.field_103641_h.func_103082_e(this) < var9 * var9) {
         double var11 = this.field_103641_h.field_103221_t - this.field_103221_t;
         double var13 = this.field_103641_h.field_103173_D.field_107915_b + (double)(this.field_103641_h.field_103183_O / 2.0F) - (this.field_103219_u + (double)(this.field_103183_O / 2.0F));
         double var15 = this.field_103641_h.field_103217_v - this.field_103217_v;
         this.field_103469_aw = this.field_103236_z = -((float)Math.atan2(var11, var15)) * 180.0F / 3.1415927F;
         if(this.func_103308_m(this.field_103641_h)) {
            if(this.field_103636_g == 10) {
               this.field_103229_p.func_109492_a((C_101095_qg)null, 1007, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
            }

            ++this.field_103636_g;
            if(this.field_103636_g == 20) {
               this.field_103229_p.func_109492_a((C_101095_qg)null, 1008, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
               C_101085_qm var17 = new C_101085_qm(this.field_103229_p, this, var11, var13, var15);
               double var18 = 4.0D;
               C_100387_amw var20 = this.func_103375_i(1.0F);
               var17.field_103221_t = this.field_103221_t + var20.field_107872_c * var18;
               var17.field_103219_u = this.field_103219_u + (double)(this.field_103183_O / 2.0F) + 0.5D;
               var17.field_103217_v = this.field_103217_v + var20.field_107870_e * var18;
               this.field_103229_p.func_109513_d(var17);
               this.field_103636_g = -40;
            }
         } else if(this.field_103636_g > 0) {
            --this.field_103636_g;
         }
      } else {
         this.field_103469_aw = this.field_103236_z = -((float)Math.atan2(this.field_103215_w, this.field_103238_y)) * 180.0F / 3.1415927F;
         if(this.field_103636_g > 0) {
            --this.field_103636_g;
         }
      }

      if(!this.field_103229_p.field_109557_J) {
         byte var21 = this.field_103234_ag.func_108842_a(16);
         byte var12 = (byte)(this.field_103636_g > 10?1:0);
         if(var21 != var12) {
            this.field_103234_ag.func_108851_b(16, Byte.valueOf(var12));
         }
      }

   }

   private boolean func_103634_a(double var1, double var3, double var5, double var7) {
      double var9 = (this.field_103640_c - this.field_103221_t) / var7;
      double var11 = (this.field_103637_d - this.field_103219_u) / var7;
      double var13 = (this.field_103638_e - this.field_103217_v) / var7;
      C_100412_amr var15 = this.field_103173_D.func_107900_c();

      for(int var16 = 1; (double)var16 < var7; ++var16) {
         var15.func_107899_d(var9, var11, var13);
         if(!this.field_103229_p.func_109508_a(this, var15).isEmpty()) {
            return false;
         }
      }

      return true;
   }

   protected String func_103354_aW() {
      return "mob.ghast.moan";
   }

   protected String func_103387_aX() {
      return "mob.ghast.scream";
   }

   protected String func_103307_aY() {
      return "mob.ghast.death";
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110813_M.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(2) + this.field_103232_aa.nextInt(1 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110870_bp.field_110891_cf, 1);
      }

      var3 = this.field_103232_aa.nextInt(3) + this.field_103232_aa.nextInt(1 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110813_M.field_110891_cf, 1);
      }

   }

   protected float func_103384_aV() {
      return 10.0F;
   }

   public boolean func_103380_bp() {
      return this.field_103232_aa.nextInt(20) == 0 && super.func_103380_bp() && this.field_103229_p.field_109578_t > 0;
   }

   public int func_103316_bs() {
      return 1;
   }
}
