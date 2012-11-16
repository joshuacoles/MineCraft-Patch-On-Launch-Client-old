import java.util.Iterator;
import java.util.List;

public class C_101089_qi extends C_100730_lb implements C_101084_qn {

   private int field_104672_d = -1;
   private int field_104673_e = -1;
   private int field_104670_f = -1;
   private int field_104671_g = 0;
   private int field_104680_h = 0;
   private boolean field_104681_i = false;
   public int field_104676_a = 0;
   public int field_104674_b = 0;
   public C_100730_lb field_104675_c;
   private int field_104679_j;
   private int field_104678_as = 0;
   private double field_104677_at = 2.0D;
   private int field_104682_au;


   public C_101089_qi(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.5F, 0.5F);
   }

   public C_101089_qi(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1);
      this.func_103161_a(0.5F, 0.5F);
      this.func_103163_b(var2, var4, var6);
      this.field_103181_M = 0.0F;
   }

   public C_101089_qi(C_100873_xe var1, C_100595_ln var2, C_100595_ln var3, float var4, float var5) {
      super(var1);
      this.field_104675_c = var2;
      if(var2 instanceof C_101095_qg) {
         this.field_104676_a = 1;
      }

      this.field_103219_u = var2.field_103219_u + (double)var2.func_103102_e() - 0.10000000149011612D;
      double var6 = var3.field_103221_t - var2.field_103221_t;
      double var8 = var3.field_103219_u + (double)var3.func_103102_e() - 0.699999988079071D - this.field_103219_u;
      double var10 = var3.field_103217_v - var2.field_103217_v;
      double var12 = (double)C_100650_jv.func_108915_a(var6 * var6 + var10 * var10);
      if(var12 >= 1.0E-7D) {
         float var14 = (float)(Math.atan2(var10, var6) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var15 = (float)(-(Math.atan2(var8, var12) * 180.0D / 3.1415927410125732D));
         double var16 = var6 / var12;
         double var18 = var10 / var12;
         this.func_103055_b(var2.field_103221_t + var16, this.field_103219_u, var2.field_103217_v + var18, var14, var15);
         this.field_103181_M = 0.0F;
         float var20 = (float)var12 * 0.2F;
         this.func_104664_c(var6, var8 + (double)var20, var10, var4, var5);
      }
   }

   public C_101089_qi(C_100873_xe var1, C_100595_ln var2, float var3) {
      super(var1);
      this.field_104675_c = var2;
      if(var2 instanceof C_101095_qg) {
         this.field_104676_a = 1;
      }

      this.func_103161_a(0.5F, 0.5F);
      this.func_103055_b(var2.field_103221_t, var2.field_103219_u + (double)var2.func_103102_e(), var2.field_103217_v, var2.field_103236_z, var2.field_103177_A);
      this.field_103221_t -= (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * 0.16F);
      this.field_103219_u -= 0.10000000149011612D;
      this.field_103217_v -= (double)(C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * 0.16F);
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.field_103181_M = 0.0F;
      this.field_103215_w = (double)(-C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F));
      this.field_103238_y = (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F));
      this.field_103240_x = (double)(-C_100650_jv.func_108924_a(this.field_103177_A / 180.0F * 3.1415927F));
      this.func_104664_c(this.field_103215_w, this.field_103240_x, this.field_103238_y, var3 * 1.5F, 1.0F);
   }

   protected void func_103141_a() {
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)0));
   }

   public void func_104664_c(double var1, double var3, double var5, float var7, float var8) {
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
      this.field_104679_j = 0;
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.func_103163_b(var1, var3, var5);
      this.func_103158_b(var7, var8);
   }

   public void func_103061_h(double var1, double var3, double var5) {
      this.field_103215_w = var1;
      this.field_103240_x = var3;
      this.field_103238_y = var5;
      if(this.field_103179_C == 0.0F && this.field_103178_B == 0.0F) {
         float var7 = C_100650_jv.func_108915_a(var1 * var1 + var5 * var5);
         this.field_103178_B = this.field_103236_z = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.field_103179_C = this.field_103177_A = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
         this.field_103179_C = this.field_103177_A;
         this.field_103178_B = this.field_103236_z;
         this.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);
         this.field_104679_j = 0;
      }

   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.field_103179_C == 0.0F && this.field_103178_B == 0.0F) {
         float var1 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
         this.field_103178_B = this.field_103236_z = (float)(Math.atan2(this.field_103215_w, this.field_103238_y) * 180.0D / 3.1415927410125732D);
         this.field_103179_C = this.field_103177_A = (float)(Math.atan2(this.field_103240_x, (double)var1) * 180.0D / 3.1415927410125732D);
      }

      int var16 = this.field_103229_p.func_109349_a(this.field_104672_d, this.field_104673_e, this.field_104670_f);
      if(var16 > 0) {
         C_100451_alf.field_106118_p[var16].func_106007_a(this.field_103229_p, this.field_104672_d, this.field_104673_e, this.field_104670_f);
         C_100412_amr var2 = C_100451_alf.field_106118_p[var16].func_106021_e(this.field_103229_p, this.field_104672_d, this.field_104673_e, this.field_104670_f);
         if(var2 != null && var2.func_107901_a(this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v))) {
            this.field_104681_i = true;
         }
      }

      if(this.field_104674_b > 0) {
         --this.field_104674_b;
      }

      if(this.field_104681_i) {
         int var18 = this.field_103229_p.func_109349_a(this.field_104672_d, this.field_104673_e, this.field_104670_f);
         int var19 = this.field_103229_p.func_109357_g(this.field_104672_d, this.field_104673_e, this.field_104670_f);
         if(var18 == this.field_104671_g && var19 == this.field_104680_h) {
            ++this.field_104679_j;
            if(this.field_104679_j == 1200) {
               this.func_103121_x();
            }

         } else {
            this.field_104681_i = false;
            this.field_103215_w *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_103240_x *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_103238_y *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_104679_j = 0;
            this.field_104678_as = 0;
         }
      } else {
         ++this.field_104678_as;
         C_100387_amw var17 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         C_100387_amw var3 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
         C_100383_amu var4 = this.field_103229_p.func_109439_a(var17, var3, false, true);
         var17 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         var3 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
         if(var4 != null) {
            var3 = this.field_103229_p.func_109363_R().func_107878_a(var4.field_107834_f.field_107872_c, var4.field_107834_f.field_107869_d, var4.field_107834_f.field_107870_e);
         }

         C_100730_lb var5 = null;
         List var6 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107903_a(this.field_103215_w, this.field_103240_x, this.field_103238_y).func_107895_b(1.0D, 1.0D, 1.0D));
         double var7 = 0.0D;
         Iterator var9 = var6.iterator();

         float var11;
         while(var9.hasNext()) {
            C_100730_lb var10 = (C_100730_lb)var9.next();
            if(var10.func_103123_L() && (var10 != this.field_104675_c || this.field_104678_as >= 5)) {
               var11 = 0.3F;
               C_100412_amr var12 = var10.field_103173_D.func_107895_b((double)var11, (double)var11, (double)var11);
               C_100383_amu var13 = var12.func_107902_a(var17, var3);
               if(var13 != null) {
                  double var14 = var17.func_107853_d(var13.field_107834_f);
                  if(var14 < var7 || var7 == 0.0D) {
                     var5 = var10;
                     var7 = var14;
                  }
               }
            }
         }

         if(var5 != null) {
            var4 = new C_100383_amu(var5);
         }

         float var20;
         if(var4 != null) {
            if(var4.field_107835_g != null) {
               var20 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103240_x * this.field_103240_x + this.field_103238_y * this.field_103238_y);
               int var24 = C_100650_jv.func_108934_f((double)var20 * this.field_104677_at);
               if(this.func_104669_d()) {
                  var24 += this.field_103232_aa.nextInt(var24 / 2 + 2);
               }

               C_100698_ks var22 = null;
               if(this.field_104675_c == null) {
                  var22 = C_100698_ks.func_109216_a(this, this);
               } else {
                  var22 = C_100698_ks.func_109216_a(this, this.field_104675_c);
               }

               if(this.func_103149_af()) {
                  var4.field_107835_g.func_103112_c(5);
               }

               if(var4.field_107835_g.func_103085_a(var22, var24)) {
                  if(var4.field_107835_g instanceof C_100595_ln) {
                     ++((C_100595_ln)var4.field_107835_g).field_103413_bk;
                     if(this.field_104682_au > 0) {
                        float var25 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
                        if(var25 > 0.0F) {
                           var4.field_107835_g.func_103071_g(this.field_103215_w * (double)this.field_104682_au * 0.6000000238418579D / (double)var25, 0.1D, this.field_103238_y * (double)this.field_104682_au * 0.6000000238418579D / (double)var25);
                        }
                     }
                  }

                  this.field_103229_p.func_109412_a(this, "random.bowhit", 1.0F, 1.2F / (this.field_103232_aa.nextFloat() * 0.2F + 0.9F));
                  this.func_103121_x();
               } else {
                  this.field_103215_w *= -0.10000000149011612D;
                  this.field_103240_x *= -0.10000000149011612D;
                  this.field_103238_y *= -0.10000000149011612D;
                  this.field_103236_z += 180.0F;
                  this.field_103178_B += 180.0F;
                  this.field_104678_as = 0;
               }
            } else {
               this.field_104672_d = var4.field_107838_b;
               this.field_104673_e = var4.field_107839_c;
               this.field_104670_f = var4.field_107836_d;
               this.field_104671_g = this.field_103229_p.func_109349_a(this.field_104672_d, this.field_104673_e, this.field_104670_f);
               this.field_104680_h = this.field_103229_p.func_109357_g(this.field_104672_d, this.field_104673_e, this.field_104670_f);
               this.field_103215_w = (double)((float)(var4.field_107834_f.field_107872_c - this.field_103221_t));
               this.field_103240_x = (double)((float)(var4.field_107834_f.field_107869_d - this.field_103219_u));
               this.field_103238_y = (double)((float)(var4.field_107834_f.field_107870_e - this.field_103217_v));
               var20 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103240_x * this.field_103240_x + this.field_103238_y * this.field_103238_y);
               this.field_103221_t -= this.field_103215_w / (double)var20 * 0.05000000074505806D;
               this.field_103219_u -= this.field_103240_x / (double)var20 * 0.05000000074505806D;
               this.field_103217_v -= this.field_103238_y / (double)var20 * 0.05000000074505806D;
               this.field_103229_p.func_109412_a(this, "random.bowhit", 1.0F, 1.2F / (this.field_103232_aa.nextFloat() * 0.2F + 0.9F));
               this.field_104681_i = true;
               this.field_104674_b = 7;
               this.func_104667_e(false);
            }
         }

         if(this.func_104669_d()) {
            for(int var21 = 0; var21 < 4; ++var21) {
               this.field_103229_p.func_109428_a("crit", this.field_103221_t + this.field_103215_w * (double)var21 / 4.0D, this.field_103219_u + this.field_103240_x * (double)var21 / 4.0D, this.field_103217_v + this.field_103238_y * (double)var21 / 4.0D, -this.field_103215_w, -this.field_103240_x + 0.2D, -this.field_103238_y);
            }
         }

         this.field_103221_t += this.field_103215_w;
         this.field_103219_u += this.field_103240_x;
         this.field_103217_v += this.field_103238_y;
         var20 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
         this.field_103236_z = (float)(Math.atan2(this.field_103215_w, this.field_103238_y) * 180.0D / 3.1415927410125732D);

         for(this.field_103177_A = (float)(Math.atan2(this.field_103240_x, (double)var20) * 180.0D / 3.1415927410125732D); this.field_103177_A - this.field_103179_C < -180.0F; this.field_103179_C -= 360.0F) {
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
         float var23 = 0.99F;
         var11 = 0.05F;
         if(this.func_103144_H()) {
            for(int var26 = 0; var26 < 4; ++var26) {
               float var27 = 0.25F;
               this.field_103229_p.func_109428_a("bubble", this.field_103221_t - this.field_103215_w * (double)var27, this.field_103219_u - this.field_103240_x * (double)var27, this.field_103217_v - this.field_103238_y * (double)var27, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }

            var23 = 0.8F;
         }

         this.field_103215_w *= (double)var23;
         this.field_103240_x *= (double)var23;
         this.field_103238_y *= (double)var23;
         this.field_103240_x -= (double)var11;
         this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         this.func_103063_D();
      }
   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("xTile", (short)this.field_104672_d);
      var1.func_107532_a("yTile", (short)this.field_104673_e);
      var1.func_107532_a("zTile", (short)this.field_104670_f);
      var1.func_107527_a("inTile", (byte)this.field_104671_g);
      var1.func_107527_a("inData", (byte)this.field_104680_h);
      var1.func_107527_a("shake", (byte)this.field_104674_b);
      var1.func_107527_a("inGround", (byte)(this.field_104681_i?1:0));
      var1.func_107527_a("pickup", (byte)this.field_104676_a);
      var1.func_107535_a("damage", this.field_104677_at);
   }

   public void func_103110_a(C_100353_bh var1) {
      this.field_104672_d = var1.func_107517_d("xTile");
      this.field_104673_e = var1.func_107517_d("yTile");
      this.field_104670_f = var1.func_107517_d("zTile");
      this.field_104671_g = var1.func_107524_c("inTile") & 255;
      this.field_104680_h = var1.func_107524_c("inData") & 255;
      this.field_104674_b = var1.func_107524_c("shake") & 255;
      this.field_104681_i = var1.func_107524_c("inGround") == 1;
      if(var1.func_107516_b("damage")) {
         this.field_104677_at = var1.func_107522_h("damage");
      }

      if(var1.func_107516_b("pickup")) {
         this.field_104676_a = var1.func_107524_c("pickup");
      } else if(var1.func_107516_b("player")) {
         this.field_104676_a = var1.func_107519_n("player")?1:0;
      }

   }

   public void func_103096_b_(C_101095_qg var1) {
      if(!this.field_103229_p.field_109557_J && this.field_104681_i && this.field_104674_b <= 0) {
         boolean var2 = this.field_104676_a == 1 || this.field_104676_a == 2 && var1.field_103869_cf.field_111597_d;
         if(this.field_104676_a == 1 && !var1.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110840_l, 1))) {
            var2 = false;
         }

         if(var2) {
            this.field_103229_p.func_109412_a(this, "random.pop", 0.2F, ((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.func_103397_a(this, 1);
            this.func_103121_x();
         }

      }
   }

   protected boolean func_103092_f_() {
      return false;
   }

   public float func_103109_R() {
      return 0.0F;
   }

   public void func_104665_b(double var1) {
      this.field_104677_at = var1;
   }

   public double func_104668_c() {
      return this.field_104677_at;
   }

   public void func_104666_a(int var1) {
      this.field_104682_au = var1;
   }

   public boolean func_103099_aq() {
      return false;
   }

   public void func_104667_e(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public boolean func_104669_d() {
      byte var1 = this.field_103234_ag.func_108842_a(16);
      return (var1 & 1) != 0;
   }
}
