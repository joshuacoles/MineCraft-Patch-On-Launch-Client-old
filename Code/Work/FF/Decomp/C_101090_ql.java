import java.util.Iterator;
import java.util.List;

public class C_101090_ql extends C_100730_lb {

   private int field_104711_d;
   private int field_104713_e;
   private int field_104708_f;
   private int field_104709_g;
   private boolean field_104723_h;
   public int field_104716_a;
   public C_101095_qg field_104714_b;
   private int field_104724_i;
   private int field_104720_j;
   private int field_104718_as;
   public C_100730_lb field_104715_c;
   private int field_104717_at;
   private double field_104725_au;
   private double field_104722_av;
   private double field_104721_aw;
   private double field_104719_ax;
   private double field_104712_ay;
   private double field_104710_az;
   private double field_104726_aA;
   private double field_104727_aB;


   public C_101090_ql(C_100873_xe var1) {
      super(var1);
      this.field_104711_d = -1;
      this.field_104713_e = -1;
      this.field_104708_f = -1;
      this.field_104709_g = 0;
      this.field_104723_h = false;
      this.field_104716_a = 0;
      this.field_104720_j = 0;
      this.field_104718_as = 0;
      this.field_104715_c = null;
      this.func_103161_a(0.25F, 0.25F);
      this.field_103216_al = true;
   }

   public C_101090_ql(C_100873_xe var1, double var2, double var4, double var6, C_101095_qg var8) {
      this(var1);
      this.func_103163_b(var2, var4, var6);
      this.field_103216_al = true;
      this.field_104714_b = var8;
      var8.field_103862_cl = this;
   }

   public C_101090_ql(C_100873_xe var1, C_101095_qg var2) {
      super(var1);
      this.field_104711_d = -1;
      this.field_104713_e = -1;
      this.field_104708_f = -1;
      this.field_104709_g = 0;
      this.field_104723_h = false;
      this.field_104716_a = 0;
      this.field_104720_j = 0;
      this.field_104718_as = 0;
      this.field_104715_c = null;
      this.field_103216_al = true;
      this.field_104714_b = var2;
      this.field_104714_b.field_103862_cl = this;
      this.func_103161_a(0.25F, 0.25F);
      this.func_103055_b(var2.field_103221_t, var2.field_103219_u + 1.62D - (double)var2.field_103181_M, var2.field_103217_v, var2.field_103236_z, var2.field_103177_A);
      this.field_103221_t -= (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * 0.16F);
      this.field_103219_u -= 0.10000000149011612D;
      this.field_103217_v -= (double)(C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * 0.16F);
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.field_103181_M = 0.0F;
      float var3 = 0.4F;
      this.field_103215_w = (double)(-C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F) * var3);
      this.field_103238_y = (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F) * var3);
      this.field_103240_x = (double)(-C_100650_jv.func_108924_a(this.field_103177_A / 180.0F * 3.1415927F) * var3);
      this.func_104707_c(this.field_103215_w, this.field_103240_x, this.field_103238_y, 1.5F, 1.0F);
   }

   protected void func_103141_a() {}

   public boolean func_103167_a(double var1) {
      double var3 = this.field_103173_D.func_107896_b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public void func_104707_c(double var1, double var3, double var5, float var7, float var8) {
      float var9 = C_100650_jv.func_108915_a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.field_103232_aa.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.field_103232_aa.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.field_103232_aa.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.field_103215_w = var1;
      this.field_103240_x = var3;
      this.field_103238_y = var5;
      float var10 = C_100650_jv.func_108915_a(var1 * var1 + var5 * var5);
      this.field_103178_B = this.field_103236_z = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.field_103179_C = this.field_103177_A = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.field_104724_i = 0;
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_104725_au = var1;
      this.field_104722_av = var3;
      this.field_104721_aw = var5;
      this.field_104719_ax = (double)var7;
      this.field_104712_ay = (double)var8;
      this.field_104717_at = var9;
      this.field_103215_w = this.field_104710_az;
      this.field_103240_x = this.field_104726_aA;
      this.field_103238_y = this.field_104727_aB;
   }

   public void func_103061_h(double var1, double var3, double var5) {
      this.field_104710_az = this.field_103215_w = var1;
      this.field_104726_aA = this.field_103240_x = var3;
      this.field_104727_aB = this.field_103238_y = var5;
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.field_104717_at > 0) {
         double var21 = this.field_103221_t + (this.field_104725_au - this.field_103221_t) / (double)this.field_104717_at;
         double var22 = this.field_103219_u + (this.field_104722_av - this.field_103219_u) / (double)this.field_104717_at;
         double var23 = this.field_103217_v + (this.field_104721_aw - this.field_103217_v) / (double)this.field_104717_at;
         double var7 = C_100650_jv.func_108918_g(this.field_104719_ax - (double)this.field_103236_z);
         this.field_103236_z = (float)((double)this.field_103236_z + var7 / (double)this.field_104717_at);
         this.field_103177_A = (float)((double)this.field_103177_A + (this.field_104712_ay - (double)this.field_103177_A) / (double)this.field_104717_at);
         --this.field_104717_at;
         this.func_103163_b(var21, var22, var23);
         this.func_103158_b(this.field_103236_z, this.field_103177_A);
      } else {
         if(!this.field_103229_p.field_109557_J) {
            C_100994_tv var1 = this.field_104714_b.func_103780_bP();
            if(this.field_104714_b.field_103180_L || !this.field_104714_b.func_103143_S() || var1 == null || var1.func_111365_b() != C_100992_tt.field_110897_aR || this.func_103082_e(this.field_104714_b) > 1024.0D) {
               this.func_103121_x();
               this.field_104714_b.field_103862_cl = null;
               return;
            }

            if(this.field_104715_c != null) {
               if(!this.field_104715_c.field_103180_L) {
                  this.field_103221_t = this.field_104715_c.field_103221_t;
                  this.field_103219_u = this.field_104715_c.field_103173_D.field_107915_b + (double)this.field_104715_c.field_103183_O * 0.8D;
                  this.field_103217_v = this.field_104715_c.field_103217_v;
                  return;
               }

               this.field_104715_c = null;
            }
         }

         if(this.field_104716_a > 0) {
            --this.field_104716_a;
         }

         if(this.field_104723_h) {
            int var19 = this.field_103229_p.func_109349_a(this.field_104711_d, this.field_104713_e, this.field_104708_f);
            if(var19 == this.field_104709_g) {
               ++this.field_104724_i;
               if(this.field_104724_i == 1200) {
                  this.func_103121_x();
               }

               return;
            }

            this.field_104723_h = false;
            this.field_103215_w *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_103240_x *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_103238_y *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_104724_i = 0;
            this.field_104720_j = 0;
         } else {
            ++this.field_104720_j;
         }

         C_100387_amw var20 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         C_100387_amw var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
         C_100383_amu var3 = this.field_103229_p.func_109522_a(var20, var2);
         var20 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
         if(var3 != null) {
            var2 = this.field_103229_p.func_109363_R().func_107878_a(var3.field_107834_f.field_107872_c, var3.field_107834_f.field_107869_d, var3.field_107834_f.field_107870_e);
         }

         C_100730_lb var4 = null;
         List var5 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107903_a(this.field_103215_w, this.field_103240_x, this.field_103238_y).func_107895_b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;
         Iterator var8 = var5.iterator();

         double var13;
         while(var8.hasNext()) {
            C_100730_lb var9 = (C_100730_lb)var8.next();
            if(var9.func_103123_L() && (var9 != this.field_104714_b || this.field_104720_j >= 5)) {
               float var10 = 0.3F;
               C_100412_amr var11 = var9.field_103173_D.func_107895_b((double)var10, (double)var10, (double)var10);
               C_100383_amu var12 = var11.func_107902_a(var20, var2);
               if(var12 != null) {
                  var13 = var20.func_107853_d(var12.field_107834_f);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new C_100383_amu(var4);
         }

         if(var3 != null) {
            if(var3.field_107835_g != null) {
               if(var3.field_107835_g.func_103085_a(C_100698_ks.func_109212_a(this, this.field_104714_b), 0)) {
                  this.field_104715_c = var3.field_107835_g;
               }
            } else {
               this.field_104723_h = true;
            }
         }

         if(!this.field_104723_h) {
            this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
            float var24 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
            this.field_103236_z = (float)(Math.atan2(this.field_103215_w, this.field_103238_y) * 180.0D / 3.1415927410125732D);

            for(this.field_103177_A = (float)(Math.atan2(this.field_103240_x, (double)var24) * 180.0D / 3.1415927410125732D); this.field_103177_A - this.field_103179_C < -180.0F; this.field_103179_C -= 360.0F) {
               ;
            }

            while(this.field_103177_A - this.field_103179_C >= 180.0F) {
               this.field_103179_C += 360.0F;
            }

            while(this.field_103236_z - this.field_103178_B < -180.0F) {
               this.field_103178_B -= 360.0F;
            }

            while(this.field_103236_z - this.field_103178_B >= 180.0F) {
               this.field_103178_B += 360.0F;
            }

            this.field_103177_A = this.field_103179_C + (this.field_103177_A - this.field_103179_C) * 0.2F;
            this.field_103236_z = this.field_103178_B + (this.field_103236_z - this.field_103178_B) * 0.2F;
            float var25 = 0.92F;
            if(this.field_103174_E || this.field_103175_F) {
               var25 = 0.5F;
            }

            byte var27 = 5;
            double var26 = 0.0D;

            for(int var29 = 0; var29 < var27; ++var29) {
               double var14 = this.field_103173_D.field_107915_b + (this.field_103173_D.field_107914_e - this.field_103173_D.field_107915_b) * (double)(var29 + 0) / (double)var27 - 0.125D + 0.125D;
               double var16 = this.field_103173_D.field_107915_b + (this.field_103173_D.field_107914_e - this.field_103173_D.field_107915_b) * (double)(var29 + 1) / (double)var27 - 0.125D + 0.125D;
               C_100412_amr var18 = C_100412_amr.func_107892_a().func_107844_a(this.field_103173_D.field_107917_a, var14, this.field_103173_D.field_107916_c, this.field_103173_D.field_107913_d, var16, this.field_103173_D.field_107911_f);
               if(this.field_103229_p.func_109443_b(var18, C_100664_afg.field_109019_h)) {
                  var26 += 1.0D / (double)var27;
               }
            }

            if(var26 > 0.0D) {
               if(this.field_104718_as > 0) {
                  --this.field_104718_as;
               } else {
                  short var28 = 500;
                  if(this.field_103229_p.func_109515_B(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u) + 1, C_100650_jv.func_108910_c(this.field_103217_v))) {
                     var28 = 300;
                  }

                  if(this.field_103232_aa.nextInt(var28) == 0) {
                     this.field_104718_as = this.field_103232_aa.nextInt(30) + 10;
                     this.field_103240_x -= 0.20000000298023224D;
                     this.field_103229_p.func_109412_a(this, "random.splash", 0.25F, 1.0F + (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.4F);
                     float var30 = (float)C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);

                     int var15;
                     float var17;
                     float var31;
                     for(var15 = 0; (float)var15 < 1.0F + this.field_103182_N * 20.0F; ++var15) {
                        var31 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
                        var17 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
                        this.field_103229_p.func_109428_a("bubble", this.field_103221_t + (double)var31, (double)(var30 + 1.0F), this.field_103217_v + (double)var17, this.field_103215_w, this.field_103240_x - (double)(this.field_103232_aa.nextFloat() * 0.2F), this.field_103238_y);
                     }

                     for(var15 = 0; (float)var15 < 1.0F + this.field_103182_N * 20.0F; ++var15) {
                        var31 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
                        var17 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
                        this.field_103229_p.func_109428_a("splash", this.field_103221_t + (double)var31, (double)(var30 + 1.0F), this.field_103217_v + (double)var17, this.field_103215_w, this.field_103240_x, this.field_103238_y);
                     }
                  }
               }
            }

            if(this.field_104718_as > 0) {
               this.field_103240_x -= (double)(this.field_103232_aa.nextFloat() * this.field_103232_aa.nextFloat() * this.field_103232_aa.nextFloat()) * 0.2D;
            }

            var13 = var26 * 2.0D - 1.0D;
            this.field_103240_x += 0.03999999910593033D * var13;
            if(var26 > 0.0D) {
               var25 = (float)((double)var25 * 0.9D);
               this.field_103240_x *= 0.8D;
            }

            this.field_103215_w *= (double)var25;
            this.field_103240_x *= (double)var25;
            this.field_103238_y *= (double)var25;
            this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         }
      }
   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("xTile", (short)this.field_104711_d);
      var1.func_107532_a("yTile", (short)this.field_104713_e);
      var1.func_107532_a("zTile", (short)this.field_104708_f);
      var1.func_107527_a("inTile", (byte)this.field_104709_g);
      var1.func_107527_a("shake", (byte)this.field_104716_a);
      var1.func_107527_a("inGround", (byte)(this.field_104723_h?1:0));
   }

   public void func_103110_a(C_100353_bh var1) {
      this.field_104711_d = var1.func_107517_d("xTile");
      this.field_104713_e = var1.func_107517_d("yTile");
      this.field_104708_f = var1.func_107517_d("zTile");
      this.field_104709_g = var1.func_107524_c("inTile") & 255;
      this.field_104716_a = var1.func_107524_c("shake") & 255;
      this.field_104723_h = var1.func_107524_c("inGround") == 1;
   }

   public float func_103109_R() {
      return 0.0F;
   }

   public int func_104706_c() {
      if(this.field_103229_p.field_109557_J) {
         return 0;
      } else {
         byte var1 = 0;
         if(this.field_104715_c != null) {
            double var2 = this.field_104714_b.field_103221_t - this.field_103221_t;
            double var4 = this.field_104714_b.field_103219_u - this.field_103219_u;
            double var6 = this.field_104714_b.field_103217_v - this.field_103217_v;
            double var8 = (double)C_100650_jv.func_108915_a(var2 * var2 + var4 * var4 + var6 * var6);
            double var10 = 0.1D;
            this.field_104715_c.field_103215_w += var2 * var10;
            this.field_104715_c.field_103240_x += var4 * var10 + (double)C_100650_jv.func_108915_a(var8) * 0.08D;
            this.field_104715_c.field_103238_y += var6 * var10;
            var1 = 3;
         } else if(this.field_104718_as > 0) {
            C_100576_pg var13 = new C_100576_pg(this.field_103229_p, this.field_103221_t, this.field_103219_u, this.field_103217_v, new C_100994_tv(C_100992_tt.field_110902_aU));
            double var3 = this.field_104714_b.field_103221_t - this.field_103221_t;
            double var5 = this.field_104714_b.field_103219_u - this.field_103219_u;
            double var7 = this.field_104714_b.field_103217_v - this.field_103217_v;
            double var9 = (double)C_100650_jv.func_108915_a(var3 * var3 + var5 * var5 + var7 * var7);
            double var11 = 0.1D;
            var13.field_103215_w = var3 * var11;
            var13.field_103240_x = var5 * var11 + (double)C_100650_jv.func_108915_a(var9) * 0.08D;
            var13.field_103238_y = var7 * var11;
            this.field_103229_p.func_109513_d(var13);
            this.field_104714_b.func_103813_a(C_100818_jh.field_110019_B, 1);
            this.field_104714_b.field_103229_p.func_109513_d(new C_100722_lj(this.field_104714_b.field_103229_p, this.field_104714_b.field_103221_t, this.field_104714_b.field_103219_u + 0.5D, this.field_104714_b.field_103217_v + 0.5D, this.field_103232_aa.nextInt(3) + 1));
            var1 = 1;
         }

         if(this.field_104723_h) {
            var1 = 2;
         }

         this.func_103121_x();
         this.field_104714_b.field_103862_cl = null;
         return var1;
      }
   }

   public void func_103121_x() {
      super.func_103121_x();
      if(this.field_104714_b != null) {
         this.field_104714_b.field_103862_cl = null;
      }

   }
}
