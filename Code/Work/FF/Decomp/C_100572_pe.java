import java.util.Iterator;
import java.util.List;

public class C_100572_pe extends C_100730_lb {

   private boolean field_103258_a;
   private double field_103256_b;
   private int field_103257_c;
   private double field_103254_d;
   private double field_103255_e;
   private double field_103252_f;
   private double field_103253_g;
   private double field_103261_h;
   private double field_103262_i;
   private double field_103260_j;
   private double field_103259_as;


   public C_100572_pe(C_100873_xe var1) {
      super(var1);
      this.field_103258_a = true;
      this.field_103256_b = 0.07D;
      this.field_103211_m = true;
      this.func_103161_a(1.5F, 0.6F);
      this.field_103181_M = this.field_103183_O / 2.0F;
   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected void func_103141_a() {
      this.field_103234_ag.func_108841_a(17, new Integer(0));
      this.field_103234_ag.func_108841_a(18, new Integer(1));
      this.field_103234_ag.func_108841_a(19, new Integer(0));
   }

   public C_100412_amr func_103104_g(C_100730_lb var1) {
      return var1.field_103173_D;
   }

   public C_100412_amr func_103088_E() {
      return this.field_103173_D;
   }

   public boolean func_103160_M() {
      return true;
   }

   public C_100572_pe(C_100873_xe var1, double var2, double var4, double var6) {
      this(var1);
      this.func_103163_b(var2, var4 + (double)this.field_103181_M, var6);
      this.field_103215_w = 0.0D;
      this.field_103240_x = 0.0D;
      this.field_103238_y = 0.0D;
      this.field_103227_q = var2;
      this.field_103225_r = var4;
      this.field_103223_s = var6;
   }

   public double func_103097_X() {
      return (double)this.field_103183_O * 0.0D - 0.30000001192092896D;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(!this.field_103229_p.field_109557_J && !this.field_103180_L) {
         this.func_103250_h(-this.func_103249_h());
         this.func_103248_g(10);
         this.func_103246_a(this.func_103245_d() + var2 * 10);
         this.func_103065_K();
         if(var1.func_109210_g() instanceof C_101095_qg && ((C_101095_qg)var1.func_109210_g()).field_103869_cf.field_111597_d) {
            this.func_103246_a(100);
         }

         if(this.func_103245_d() > 40) {
            if(this.field_103206_n != null) {
               this.field_103206_n.func_103064_a(this);
            }

            this.func_103075_a(C_100992_tt.field_110917_aE.field_110891_cf, 1, 0.0F);
            this.func_103121_x();
         }

         return true;
      } else {
         return true;
      }
   }

   public void func_103116_ac() {
      this.func_103250_h(-this.func_103249_h());
      this.func_103248_g(10);
      this.func_103246_a(this.func_103245_d() * 11);
   }

   public boolean func_103123_L() {
      return !this.field_103180_L;
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      if(this.field_103258_a) {
         this.field_103257_c = var9 + 5;
      } else {
         double var10 = var1 - this.field_103221_t;
         double var12 = var3 - this.field_103219_u;
         double var14 = var5 - this.field_103217_v;
         double var16 = var10 * var10 + var12 * var12 + var14 * var14;
         if(var16 <= 1.0D) {
            return;
         }

         this.field_103257_c = 3;
      }

      this.field_103254_d = var1;
      this.field_103255_e = var3;
      this.field_103252_f = var5;
      this.field_103253_g = (double)var7;
      this.field_103261_h = (double)var8;
      this.field_103215_w = this.field_103262_i;
      this.field_103240_x = this.field_103260_j;
      this.field_103238_y = this.field_103259_as;
   }

   public void func_103061_h(double var1, double var3, double var5) {
      this.field_103262_i = this.field_103215_w = var1;
      this.field_103260_j = this.field_103240_x = var3;
      this.field_103259_as = this.field_103238_y = var5;
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.func_103251_g() > 0) {
         this.func_103248_g(this.func_103251_g() - 1);
      }

      if(this.func_103245_d() > 0) {
         this.func_103246_a(this.func_103245_d() - 1);
      }

      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.field_103173_D.field_107915_b + (this.field_103173_D.field_107914_e - this.field_103173_D.field_107915_b) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.field_103173_D.field_107915_b + (this.field_103173_D.field_107914_e - this.field_103173_D.field_107915_b) * (double)(var4 + 1) / (double)var1 - 0.125D;
         C_100412_amr var9 = C_100412_amr.func_107892_a().func_107844_a(this.field_103173_D.field_107917_a, var5, this.field_103173_D.field_107916_c, this.field_103173_D.field_107913_d, var7, this.field_103173_D.field_107911_f);
         if(this.field_103229_p.func_109443_b(var9, C_100664_afg.field_109019_h)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var24 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
      double var6;
      double var8;
      if(var24 > 0.26249999999999996D) {
         var6 = Math.cos((double)this.field_103236_z * 3.141592653589793D / 180.0D);
         var8 = Math.sin((double)this.field_103236_z * 3.141592653589793D / 180.0D);

         for(int var10 = 0; (double)var10 < 1.0D + var24 * 60.0D; ++var10) {
            double var11 = (double)(this.field_103232_aa.nextFloat() * 2.0F - 1.0F);
            double var13 = (double)(this.field_103232_aa.nextInt(2) * 2 - 1) * 0.7D;
            double var15;
            double var17;
            if(this.field_103232_aa.nextBoolean()) {
               var15 = this.field_103221_t - var6 * var11 * 0.8D + var8 * var13;
               var17 = this.field_103217_v - var8 * var11 * 0.8D - var6 * var13;
               this.field_103229_p.func_109428_a("splash", var15, this.field_103219_u - 0.125D, var17, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            } else {
               var15 = this.field_103221_t + var6 + var8 * var11 * 0.7D;
               var17 = this.field_103217_v + var8 - var6 * var11 * 0.7D;
               this.field_103229_p.func_109428_a("splash", var15, this.field_103219_u - 0.125D, var17, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }
         }
      }

      double var12;
      double var26;
      if(this.field_103229_p.field_109557_J && this.field_103258_a) {
         if(this.field_103257_c > 0) {
            var6 = this.field_103221_t + (this.field_103254_d - this.field_103221_t) / (double)this.field_103257_c;
            var8 = this.field_103219_u + (this.field_103255_e - this.field_103219_u) / (double)this.field_103257_c;
            var26 = this.field_103217_v + (this.field_103252_f - this.field_103217_v) / (double)this.field_103257_c;
            var12 = C_100650_jv.func_108918_g(this.field_103253_g - (double)this.field_103236_z);
            this.field_103236_z = (float)((double)this.field_103236_z + var12 / (double)this.field_103257_c);
            this.field_103177_A = (float)((double)this.field_103177_A + (this.field_103261_h - (double)this.field_103177_A) / (double)this.field_103257_c);
            --this.field_103257_c;
            this.func_103163_b(var6, var8, var26);
            this.func_103158_b(this.field_103236_z, this.field_103177_A);
         } else {
            var6 = this.field_103221_t + this.field_103215_w;
            var8 = this.field_103219_u + this.field_103240_x;
            var26 = this.field_103217_v + this.field_103238_y;
            this.func_103163_b(var6, var8, var26);
            if(this.field_103174_E) {
               this.field_103215_w *= 0.5D;
               this.field_103240_x *= 0.5D;
               this.field_103238_y *= 0.5D;
            }

            this.field_103215_w *= 0.9900000095367432D;
            this.field_103240_x *= 0.949999988079071D;
            this.field_103238_y *= 0.9900000095367432D;
         }

      } else {
         if(var2 < 1.0D) {
            var6 = var2 * 2.0D - 1.0D;
            this.field_103240_x += 0.03999999910593033D * var6;
         } else {
            if(this.field_103240_x < 0.0D) {
               this.field_103240_x /= 2.0D;
            }

            this.field_103240_x += 0.007000000216066837D;
         }

         if(this.field_103206_n != null) {
            this.field_103215_w += this.field_103206_n.field_103215_w * this.field_103256_b;
            this.field_103238_y += this.field_103206_n.field_103238_y * this.field_103256_b;
         }

         var6 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
         if(var6 > 0.35D) {
            var8 = 0.35D / var6;
            this.field_103215_w *= var8;
            this.field_103238_y *= var8;
            var6 = 0.35D;
         }

         if(var6 > var24 && this.field_103256_b < 0.35D) {
            this.field_103256_b += (0.35D - this.field_103256_b) / 35.0D;
            if(this.field_103256_b > 0.35D) {
               this.field_103256_b = 0.35D;
            }
         } else {
            this.field_103256_b -= (this.field_103256_b - 0.07D) / 35.0D;
            if(this.field_103256_b < 0.07D) {
               this.field_103256_b = 0.07D;
            }
         }

         if(this.field_103174_E) {
            this.field_103215_w *= 0.5D;
            this.field_103240_x *= 0.5D;
            this.field_103238_y *= 0.5D;
         }

         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         if(this.field_103175_F && var24 > 0.2D) {
            if(!this.field_103229_p.field_109557_J) {
               this.func_103121_x();

               int var25;
               for(var25 = 0; var25 < 3; ++var25) {
                  this.func_103075_a(C_100451_alf.field_106075_A.field_106162_cm, 1, 0.0F);
               }

               for(var25 = 0; var25 < 2; ++var25) {
                  this.func_103075_a(C_100992_tt.field_110805_D.field_110891_cf, 1, 0.0F);
               }
            }
         } else {
            this.field_103215_w *= 0.9900000095367432D;
            this.field_103240_x *= 0.949999988079071D;
            this.field_103238_y *= 0.9900000095367432D;
         }

         this.field_103177_A = 0.0F;
         var8 = (double)this.field_103236_z;
         var26 = this.field_103227_q - this.field_103221_t;
         var12 = this.field_103223_s - this.field_103217_v;
         if(var26 * var26 + var12 * var12 > 0.0010D) {
            var8 = (double)((float)(Math.atan2(var12, var26) * 180.0D / 3.141592653589793D));
         }

         double var14 = C_100650_jv.func_108918_g(var8 - (double)this.field_103236_z);
         if(var14 > 20.0D) {
            var14 = 20.0D;
         }

         if(var14 < -20.0D) {
            var14 = -20.0D;
         }

         this.field_103236_z = (float)((double)this.field_103236_z + var14);
         this.func_103158_b(this.field_103236_z, this.field_103177_A);
         if(!this.field_103229_p.field_109557_J) {
            List var16 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107895_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
            if(var16 != null && !var16.isEmpty()) {
               Iterator var28 = var16.iterator();

               while(var28.hasNext()) {
                  C_100730_lb var18 = (C_100730_lb)var28.next();
                  if(var18 != this.field_103206_n && var18.func_103160_M() && var18 instanceof C_100572_pe) {
                     var18.func_103093_f(this);
                  }
               }
            }

            for(int var27 = 0; var27 < 4; ++var27) {
               int var29 = C_100650_jv.func_108910_c(this.field_103221_t + ((double)(var27 % 2) - 0.5D) * 0.8D);
               int var19 = C_100650_jv.func_108910_c(this.field_103217_v + ((double)(var27 / 2) - 0.5D) * 0.8D);

               for(int var20 = 0; var20 < 2; ++var20) {
                  int var21 = C_100650_jv.func_108910_c(this.field_103219_u) + var20;
                  int var22 = this.field_103229_p.func_109349_a(var29, var21, var19);
                  int var23 = this.field_103229_p.func_109357_g(var29, var21, var19);
                  if(var22 == C_100451_alf.field_106181_aV.field_106162_cm) {
                     this.field_103229_p.func_109422_e(var29, var21, var19, 0);
                  } else if(var22 == C_100451_alf.field_106245_bC.field_106162_cm) {
                     C_100451_alf.field_106245_bC.func_105998_a(this.field_103229_p, var29, var21, var19, var23, 0.3F, 0);
                     this.field_103229_p.func_109422_e(var29, var21, var19, 0);
                  }
               }
            }

            if(this.field_103206_n != null && this.field_103206_n.field_103180_L) {
               this.field_103206_n = null;
            }

         }
      }
   }

   public void func_103098_V() {
      if(this.field_103206_n != null) {
         double var1 = Math.cos((double)this.field_103236_z * 3.141592653589793D / 180.0D) * 0.4D;
         double var3 = Math.sin((double)this.field_103236_z * 3.141592653589793D / 180.0D) * 0.4D;
         this.field_103206_n.func_103163_b(this.field_103221_t + var1, this.field_103219_u + this.func_103097_X() + this.field_103206_n.func_103083_W(), this.field_103217_v + var3);
      }
   }

   protected void func_103078_b(C_100353_bh var1) {}

   protected void func_103110_a(C_100353_bh var1) {}

   public float func_103109_R() {
      return 0.0F;
   }

   public boolean func_103134_c(C_101095_qg var1) {
      if(this.field_103206_n != null && this.field_103206_n instanceof C_101095_qg && this.field_103206_n != var1) {
         return true;
      } else {
         if(!this.field_103229_p.field_109557_J) {
            var1.func_103064_a(this);
         }

         return true;
      }
   }

   public void func_103246_a(int var1) {
      this.field_103234_ag.func_108851_b(19, Integer.valueOf(var1));
   }

   public int func_103245_d() {
      return this.field_103234_ag.func_108837_c(19);
   }

   public void func_103248_g(int var1) {
      this.field_103234_ag.func_108851_b(17, Integer.valueOf(var1));
   }

   public int func_103251_g() {
      return this.field_103234_ag.func_108837_c(17);
   }

   public void func_103250_h(int var1) {
      this.field_103234_ag.func_108851_b(18, Integer.valueOf(var1));
   }

   public int func_103249_h() {
      return this.field_103234_ag.func_108837_c(18);
   }

   public void func_103247_e(boolean var1) {
      this.field_103258_a = var1;
   }
}
