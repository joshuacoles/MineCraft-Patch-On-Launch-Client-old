
public class C_100585_pm extends C_101110_ps {

   private static boolean[] field_103735_d = new boolean[256];
   private int field_103736_e = 0;
   private int field_103734_f = 0;


   public C_100585_pm(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/enderman.png";
      this.field_103489_bI = 0.2F;
      this.func_103161_a(0.6F, 2.9F);
      this.field_103197_X = 1.0F;
   }

   public int func_103378_aS() {
      return 40;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Byte((byte)0));
      this.field_103234_ag.func_108841_a(17, new Byte((byte)0));
      this.field_103234_ag.func_108841_a(18, new Byte((byte)0));
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107532_a("carried", (short)this.func_103730_o());
      var1.func_107532_a("carriedData", (short)this.func_103729_p());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103726_a(var1.func_107517_d("carried"));
      this.func_103728_r(var1.func_107517_d("carriedData"));
   }

   protected C_100730_lb func_103492_j() {
      C_101095_qg var1 = this.field_103229_p.func_109455_b(this, 64.0D);
      if(var1 != null) {
         if(this.func_103731_d(var1)) {
            if(this.field_103734_f == 0) {
               this.field_103229_p.func_109412_a(var1, "mob.endermen.stare", 1.0F, 1.0F);
            }

            if(this.field_103734_f++ == 5) {
               this.field_103734_f = 0;
               this.func_103724_f(true);
               return var1;
            }
         } else {
            this.field_103734_f = 0;
         }
      }

      return null;
   }

   private boolean func_103731_d(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.field_104830_b[3];
      if(var2 != null && var2.field_111397_c == C_100451_alf.field_106148_bd.field_106162_cm) {
         return false;
      } else {
         C_100387_amw var3 = var1.func_103375_i(1.0F).func_107865_a();
         C_100387_amw var4 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t - var1.field_103221_t, this.field_103173_D.field_107915_b + (double)(this.field_103183_O / 2.0F) - (var1.field_103219_u + (double)var1.func_103102_e()), this.field_103217_v - var1.field_103217_v);
         double var5 = var4.func_107855_b();
         var4 = var4.func_107865_a();
         double var7 = var3.func_107857_b(var4);
         return var7 > 1.0D - 0.025D / var5?var1.func_103308_m(this):false;
      }
   }

   public void func_103313_c() {
      if(this.func_103073_G()) {
         this.func_103085_a(C_100698_ks.field_109232_e, 1);
      }

      this.field_103489_bI = this.field_103504_a_ != null?6.5F:0.3F;
      int var1;
      if(!this.field_103229_p.field_109557_J && this.field_103229_p.func_109389_K().func_110281_b("mobGriefing")) {
         int var2;
         int var3;
         int var4;
         if(this.func_103730_o() == 0) {
            if(this.field_103232_aa.nextInt(20) == 0) {
               var1 = C_100650_jv.func_108910_c(this.field_103221_t - 2.0D + this.field_103232_aa.nextDouble() * 4.0D);
               var2 = C_100650_jv.func_108910_c(this.field_103219_u + this.field_103232_aa.nextDouble() * 3.0D);
               var3 = C_100650_jv.func_108910_c(this.field_103217_v - 2.0D + this.field_103232_aa.nextDouble() * 4.0D);
               var4 = this.field_103229_p.func_109349_a(var1, var2, var3);
               if(field_103735_d[var4]) {
                  this.func_103726_a(this.field_103229_p.func_109349_a(var1, var2, var3));
                  this.func_103728_r(this.field_103229_p.func_109357_g(var1, var2, var3));
                  this.field_103229_p.func_109422_e(var1, var2, var3, 0);
               }
            }
         } else if(this.field_103232_aa.nextInt(2000) == 0) {
            var1 = C_100650_jv.func_108910_c(this.field_103221_t - 1.0D + this.field_103232_aa.nextDouble() * 2.0D);
            var2 = C_100650_jv.func_108910_c(this.field_103219_u + this.field_103232_aa.nextDouble() * 2.0D);
            var3 = C_100650_jv.func_108910_c(this.field_103217_v - 1.0D + this.field_103232_aa.nextDouble() * 2.0D);
            var4 = this.field_103229_p.func_109349_a(var1, var2, var3);
            int var5 = this.field_103229_p.func_109349_a(var1, var2 - 1, var3);
            if(var4 == 0 && var5 > 0 && C_100451_alf.field_106118_p[var5].func_105977_b()) {
               this.field_103229_p.func_109394_d(var1, var2, var3, this.func_103730_o(), this.func_103729_p());
               this.func_103726_a(0);
            }
         }
      }

      for(var1 = 0; var1 < 2; ++var1) {
         this.field_103229_p.func_109428_a("portal", this.field_103221_t + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N, this.field_103219_u + this.field_103232_aa.nextDouble() * (double)this.field_103183_O - 0.25D, this.field_103217_v + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N, (this.field_103232_aa.nextDouble() - 0.5D) * 2.0D, -this.field_103232_aa.nextDouble(), (this.field_103232_aa.nextDouble() - 0.5D) * 2.0D);
      }

      if(this.field_103229_p.func_109402_t() && !this.field_103229_p.field_109557_J) {
         float var6 = this.func_103057_c(1.0F);
         if(var6 > 0.5F && this.field_103229_p.func_109502_j(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) && this.field_103232_aa.nextFloat() * 30.0F < (var6 - 0.4F) * 2.0F) {
            this.field_103504_a_ = null;
            this.func_103724_f(false);
            this.func_103727_m();
         }
      }

      if(this.func_103073_G()) {
         this.field_103504_a_ = null;
         this.func_103724_f(false);
         this.func_103727_m();
      }

      this.field_103491_bG = false;
      if(this.field_103504_a_ != null) {
         this.func_103371_a(this.field_103504_a_, 100.0F, 100.0F);
      }

      if(!this.field_103229_p.field_109557_J && this.func_103143_S()) {
         if(this.field_103504_a_ != null) {
            if(this.field_103504_a_ instanceof C_101095_qg && this.func_103731_d((C_101095_qg)this.field_103504_a_)) {
               this.field_103484_bD = this.field_103485_bE = 0.0F;
               this.field_103489_bI = 0.0F;
               if(this.field_103504_a_.func_103082_e(this) < 16.0D) {
                  this.func_103727_m();
               }

               this.field_103736_e = 0;
            } else if(this.field_103504_a_.func_103082_e(this) > 256.0D && this.field_103736_e++ >= 30 && this.func_103733_o(this.field_103504_a_)) {
               this.field_103736_e = 0;
            }
         } else {
            this.func_103724_f(false);
            this.field_103736_e = 0;
         }
      }

      super.func_103313_c();
   }

   protected boolean func_103727_m() {
      double var1 = this.field_103221_t + (this.field_103232_aa.nextDouble() - 0.5D) * 64.0D;
      double var3 = this.field_103219_u + (double)(this.field_103232_aa.nextInt(64) - 32);
      double var5 = this.field_103217_v + (this.field_103232_aa.nextDouble() - 0.5D) * 64.0D;
      return this.func_103732_j(var1, var3, var5);
   }

   protected boolean func_103733_o(C_100730_lb var1) {
      C_100387_amw var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t - var1.field_103221_t, this.field_103173_D.field_107915_b + (double)(this.field_103183_O / 2.0F) - var1.field_103219_u + (double)var1.func_103102_e(), this.field_103217_v - var1.field_103217_v);
      var2 = var2.func_107865_a();
      double var3 = 16.0D;
      double var5 = this.field_103221_t + (this.field_103232_aa.nextDouble() - 0.5D) * 8.0D - var2.field_107872_c * var3;
      double var7 = this.field_103219_u + (double)(this.field_103232_aa.nextInt(16) - 8) - var2.field_107869_d * var3;
      double var9 = this.field_103217_v + (this.field_103232_aa.nextDouble() - 0.5D) * 8.0D - var2.field_107870_e * var3;
      return this.func_103732_j(var5, var7, var9);
   }

   protected boolean func_103732_j(double var1, double var3, double var5) {
      double var7 = this.field_103221_t;
      double var9 = this.field_103219_u;
      double var11 = this.field_103217_v;
      this.field_103221_t = var1;
      this.field_103219_u = var3;
      this.field_103217_v = var5;
      boolean var13 = false;
      int var14 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var15 = C_100650_jv.func_108910_c(this.field_103219_u);
      int var16 = C_100650_jv.func_108910_c(this.field_103217_v);
      int var18;
      if(this.field_103229_p.func_109461_e(var14, var15, var16)) {
         boolean var17 = false;

         while(!var17 && var15 > 0) {
            var18 = this.field_103229_p.func_109349_a(var14, var15 - 1, var16);
            if(var18 != 0 && C_100451_alf.field_106118_p[var18].field_106204_cB.func_108992_c()) {
               var17 = true;
            } else {
               --this.field_103219_u;
               --var15;
            }
         }

         if(var17) {
            this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
            if(this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty() && !this.field_103229_p.func_109413_d(this.field_103173_D)) {
               var13 = true;
            }
         }
      }

      if(!var13) {
         this.func_103163_b(var7, var9, var11);
         return false;
      } else {
         short var30 = 128;

         for(var18 = 0; var18 < var30; ++var18) {
            double var19 = (double)var18 / ((double)var30 - 1.0D);
            float var21 = (this.field_103232_aa.nextFloat() - 0.5F) * 0.2F;
            float var22 = (this.field_103232_aa.nextFloat() - 0.5F) * 0.2F;
            float var23 = (this.field_103232_aa.nextFloat() - 0.5F) * 0.2F;
            double var24 = var7 + (this.field_103221_t - var7) * var19 + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N * 2.0D;
            double var26 = var9 + (this.field_103219_u - var9) * var19 + this.field_103232_aa.nextDouble() * (double)this.field_103183_O;
            double var28 = var11 + (this.field_103217_v - var11) * var19 + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N * 2.0D;
            this.field_103229_p.func_109428_a("portal", var24, var26, var28, (double)var21, (double)var22, (double)var23);
         }

         this.field_103229_p.func_109476_a(var7, var9, var11, "mob.endermen.portal", 1.0F, 1.0F);
         this.field_103229_p.func_109412_a(this, "mob.endermen.portal", 1.0F, 1.0F);
         return true;
      }
   }

   protected String func_103354_aW() {
      return this.func_103725_q()?"mob.endermen.scream":"mob.endermen.idle";
   }

   protected String func_103387_aX() {
      return "mob.endermen.hit";
   }

   protected String func_103307_aY() {
      return "mob.endermen.death";
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110868_bn.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.func_103377_aZ();
      if(var3 > 0) {
         int var4 = this.field_103232_aa.nextInt(2 + var2);

         for(int var5 = 0; var5 < var4; ++var5) {
            this.func_103111_b(var3, 1);
         }
      }

   }

   public void func_103726_a(int var1) {
      this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var1 & 255)));
   }

   public int func_103730_o() {
      return this.field_103234_ag.func_108842_a(16);
   }

   public void func_103728_r(int var1) {
      this.field_103234_ag.func_108851_b(17, Byte.valueOf((byte)(var1 & 255)));
   }

   public int func_103729_p() {
      return this.field_103234_ag.func_108842_a(17);
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(var1 instanceof C_100702_ku) {
         for(int var3 = 0; var3 < 64; ++var3) {
            if(this.func_103727_m()) {
               return true;
            }
         }

         return false;
      } else {
         if(var1.func_109210_g() instanceof C_101095_qg) {
            this.func_103724_f(true);
         }

         return super.func_103085_a(var1, var2);
      }
   }

   public boolean func_103725_q() {
      return this.field_103234_ag.func_108842_a(18) > 0;
   }

   public void func_103724_f(boolean var1) {
      this.field_103234_ag.func_108851_b(18, Byte.valueOf((byte)(var1?1:0)));
   }

   public int func_103643_c(C_100730_lb var1) {
      return 7;
   }

   static {
      field_103735_d[C_100451_alf.field_106121_x.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106120_y.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106082_H.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106083_I.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106248_ag.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106250_ah.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106228_ai.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106230_aj.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106234_ap.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106175_aY.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106174_aZ.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106148_bd.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106131_bu.field_106162_cm] = true;
      field_103735_d[C_100451_alf.field_106243_bB.field_106162_cm] = true;
   }
}
