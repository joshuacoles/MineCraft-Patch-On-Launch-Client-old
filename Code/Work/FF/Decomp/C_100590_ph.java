import java.util.List;

public class C_100590_ph extends C_100730_lb implements C_100716_kl {

   private C_100994_tv[] field_104756_d;
   private int field_104758_e;
   private boolean field_104753_f;
   public int field_104761_a;
   public double field_104759_b;
   public double field_104760_c;
   private final C_100195_gh field_104754_g;
   private boolean field_104768_h;
   private static final int[][][] field_104769_i = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int field_104765_j;
   private double field_104763_as;
   private double field_104762_at;
   private double field_104770_au;
   private double field_104767_av;
   private double field_104766_aw;
   private double field_104764_ax;
   private double field_104757_ay;
   private double field_104755_az;


   public C_100590_ph(C_100873_xe var1) {
      super(var1);
      this.field_104756_d = new C_100994_tv[36];
      this.field_104758_e = 0;
      this.field_104753_f = false;
      this.field_104768_h = true;
      this.field_103211_m = true;
      this.func_103161_a(0.98F, 0.7F);
      this.field_103181_M = this.field_103183_O / 2.0F;
      this.field_104754_g = var1 != null?var1.func_109385_a(this):null;
   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected void func_103141_a() {
      this.field_103234_ag.func_108841_a(16, new Byte((byte)0));
      this.field_103234_ag.func_108841_a(17, new Integer(0));
      this.field_103234_ag.func_108841_a(18, new Integer(1));
      this.field_103234_ag.func_108841_a(19, new Integer(0));
   }

   public C_100412_amr func_103104_g(C_100730_lb var1) {
      return var1.field_103173_D;
   }

   public C_100412_amr func_103088_E() {
      return null;
   }

   public boolean func_103160_M() {
      return true;
   }

   public C_100590_ph(C_100873_xe var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.func_103163_b(var2, var4 + (double)this.field_103181_M, var6);
      this.field_103215_w = 0.0D;
      this.field_103240_x = 0.0D;
      this.field_103238_y = 0.0D;
      this.field_103227_q = var2;
      this.field_103225_r = var4;
      this.field_103223_s = var6;
      this.field_104761_a = var8;
   }

   public double func_103097_X() {
      return (double)this.field_103183_O * 0.0D - 0.30000001192092896D;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(!this.field_103229_p.field_109557_J && !this.field_103180_L) {
         this.func_104749_i(-this.func_104748_k());
         this.func_104751_h(10);
         this.func_103065_K();
         this.func_104747_g(this.func_104745_i() + var2 * 10);
         if(var1.func_109210_g() instanceof C_101095_qg && ((C_101095_qg)var1.func_109210_g()).field_103869_cf.field_111597_d) {
            this.func_104747_g(100);
         }

         if(this.func_104745_i() > 40) {
            if(this.field_103206_n != null) {
               this.field_103206_n.func_103064_a(this);
            }

            this.func_103121_x();
            this.func_103075_a(C_100992_tt.field_110921_az.field_110891_cf, 1, 0.0F);
            if(this.field_104761_a == 1) {
               C_100590_ph var3 = this;

               for(int var4 = 0; var4 < var3.func_103003_k_(); ++var4) {
                  C_100994_tv var5 = var3.func_103007_a(var4);
                  if(var5 != null) {
                     float var6 = this.field_103232_aa.nextFloat() * 0.8F + 0.1F;
                     float var7 = this.field_103232_aa.nextFloat() * 0.8F + 0.1F;
                     float var8 = this.field_103232_aa.nextFloat() * 0.8F + 0.1F;

                     while(var5.field_111398_a > 0) {
                        int var9 = this.field_103232_aa.nextInt(21) + 10;
                        if(var9 > var5.field_111398_a) {
                           var9 = var5.field_111398_a;
                        }

                        var5.field_111398_a -= var9;
                        C_100576_pg var10 = new C_100576_pg(this.field_103229_p, this.field_103221_t + (double)var6, this.field_103219_u + (double)var7, this.field_103217_v + (double)var8, new C_100994_tv(var5.field_111397_c, var9, var5.func_111367_j()));
                        float var11 = 0.05F;
                        var10.field_103215_w = (double)((float)this.field_103232_aa.nextGaussian() * var11);
                        var10.field_103240_x = (double)((float)this.field_103232_aa.nextGaussian() * var11 + 0.2F);
                        var10.field_103238_y = (double)((float)this.field_103232_aa.nextGaussian() * var11);
                        this.field_103229_p.func_109513_d(var10);
                     }
                  }
               }

               this.func_103075_a(C_100451_alf.field_106216_ax.field_106162_cm, 1, 0.0F);
            } else if(this.field_104761_a == 2) {
               this.func_103075_a(C_100451_alf.field_106197_aE.field_106162_cm, 1, 0.0F);
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public void func_103116_ac() {
      this.func_104749_i(-this.func_104748_k());
      this.func_104751_h(10);
      this.func_104747_g(this.func_104745_i() + this.func_104745_i() * 10);
   }

   public boolean func_103123_L() {
      return !this.field_103180_L;
   }

   public void func_103121_x() {
      if(this.field_104768_h) {
         for(int var1 = 0; var1 < this.func_103003_k_(); ++var1) {
            C_100994_tv var2 = this.func_103007_a(var1);
            if(var2 != null) {
               float var3 = this.field_103232_aa.nextFloat() * 0.8F + 0.1F;
               float var4 = this.field_103232_aa.nextFloat() * 0.8F + 0.1F;
               float var5 = this.field_103232_aa.nextFloat() * 0.8F + 0.1F;

               while(var2.field_111398_a > 0) {
                  int var6 = this.field_103232_aa.nextInt(21) + 10;
                  if(var6 > var2.field_111398_a) {
                     var6 = var2.field_111398_a;
                  }

                  var2.field_111398_a -= var6;
                  C_100576_pg var7 = new C_100576_pg(this.field_103229_p, this.field_103221_t + (double)var3, this.field_103219_u + (double)var4, this.field_103217_v + (double)var5, new C_100994_tv(var2.field_111397_c, var6, var2.func_111367_j()));
                  if(var2.func_111339_o()) {
                     var7.field_103279_a.func_111349_d((C_100353_bh)var2.func_111352_p().func_107485_b());
                  }

                  float var8 = 0.05F;
                  var7.field_103215_w = (double)((float)this.field_103232_aa.nextGaussian() * var8);
                  var7.field_103240_x = (double)((float)this.field_103232_aa.nextGaussian() * var8 + 0.2F);
                  var7.field_103238_y = (double)((float)this.field_103232_aa.nextGaussian() * var8);
                  this.field_103229_p.func_109513_d(var7);
               }
            }
         }
      }

      super.func_103121_x();
      if(this.field_104754_g != null) {
         this.field_104754_g.func_105928_a();
      }

   }

   public void func_103090_b(int var1) {
      this.field_104768_h = false;
      super.func_103090_b(var1);
   }

   public void func_103165_j_() {
      if(this.field_104754_g != null) {
         this.field_104754_g.func_105928_a();
      }

      if(this.func_104750_j() > 0) {
         this.func_104751_h(this.func_104750_j() - 1);
      }

      if(this.func_104745_i() > 0) {
         this.func_104747_g(this.func_104745_i() - 1);
      }

      if(this.field_103219_u < -64.0D) {
         this.func_103131_C();
      }

      if(this.func_104744_h() && this.field_103232_aa.nextInt(4) == 0) {
         this.field_103229_p.func_109428_a("largesmoke", this.field_103221_t, this.field_103219_u + 0.8D, this.field_103217_v, 0.0D, 0.0D, 0.0D);
      }

      if(this.field_103229_p.field_109557_J) {
         if(this.field_104765_j > 0) {
            double var45 = this.field_103221_t + (this.field_104763_as - this.field_103221_t) / (double)this.field_104765_j;
            double var46 = this.field_103219_u + (this.field_104762_at - this.field_103219_u) / (double)this.field_104765_j;
            double var5 = this.field_103217_v + (this.field_104770_au - this.field_103217_v) / (double)this.field_104765_j;
            double var7 = C_100650_jv.func_108918_g(this.field_104767_av - (double)this.field_103236_z);
            this.field_103236_z = (float)((double)this.field_103236_z + var7 / (double)this.field_104765_j);
            this.field_103177_A = (float)((double)this.field_103177_A + (this.field_104766_aw - (double)this.field_103177_A) / (double)this.field_104765_j);
            --this.field_104765_j;
            this.func_103163_b(var45, var46, var5);
            this.func_103158_b(this.field_103236_z, this.field_103177_A);
         } else {
            this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
            this.func_103158_b(this.field_103236_z, this.field_103177_A);
         }

      } else {
         this.field_103227_q = this.field_103221_t;
         this.field_103225_r = this.field_103219_u;
         this.field_103223_s = this.field_103217_v;
         this.field_103240_x -= 0.03999999910593033D;
         int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
         int var2 = C_100650_jv.func_108910_c(this.field_103219_u);
         int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
         if(C_100127_akg.func_106258_e_(this.field_103229_p, var1, var2 - 1, var3)) {
            --var2;
         }

         double var4 = 0.4D;
         double var6 = 0.0078125D;
         int var8 = this.field_103229_p.func_109349_a(var1, var2, var3);
         if(C_100127_akg.func_106259_d(var8)) {
            C_100387_amw var9 = this.func_104743_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
            int var10 = this.field_103229_p.func_109357_g(var1, var2, var3);
            this.field_103219_u = (double)var2;
            boolean var11 = false;
            boolean var12 = false;
            if(var8 == C_100451_alf.field_106088_W.field_106162_cm) {
               var11 = (var10 & 8) != 0;
               var12 = !var11;
            }

            if(((C_100127_akg)C_100451_alf.field_106118_p[var8]).func_106263_p()) {
               var10 &= 7;
            }

            if(var10 >= 2 && var10 <= 5) {
               this.field_103219_u = (double)(var2 + 1);
            }

            if(var10 == 2) {
               this.field_103215_w -= var6;
            }

            if(var10 == 3) {
               this.field_103215_w += var6;
            }

            if(var10 == 4) {
               this.field_103238_y += var6;
            }

            if(var10 == 5) {
               this.field_103238_y -= var6;
            }

            int[][] var13 = field_104769_i[var10];
            double var14 = (double)(var13[1][0] - var13[0][0]);
            double var16 = (double)(var13[1][2] - var13[0][2]);
            double var18 = Math.sqrt(var14 * var14 + var16 * var16);
            double var20 = this.field_103215_w * var14 + this.field_103238_y * var16;
            if(var20 < 0.0D) {
               var14 = -var14;
               var16 = -var16;
            }

            double var22 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
            this.field_103215_w = var22 * var14 / var18;
            this.field_103238_y = var22 * var16 / var18;
            double var24;
            double var26;
            if(this.field_103206_n != null) {
               var24 = this.field_103206_n.field_103215_w * this.field_103206_n.field_103215_w + this.field_103206_n.field_103238_y * this.field_103206_n.field_103238_y;
               var26 = this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y;
               if(var24 > 1.0E-4D && var26 < 0.01D) {
                  this.field_103215_w += this.field_103206_n.field_103215_w * 0.1D;
                  this.field_103238_y += this.field_103206_n.field_103238_y * 0.1D;
                  var12 = false;
               }
            }

            if(var12) {
               var24 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
               if(var24 < 0.03D) {
                  this.field_103215_w *= 0.0D;
                  this.field_103240_x *= 0.0D;
                  this.field_103238_y *= 0.0D;
               } else {
                  this.field_103215_w *= 0.5D;
                  this.field_103240_x *= 0.0D;
                  this.field_103238_y *= 0.5D;
               }
            }

            var24 = 0.0D;
            var26 = (double)var1 + 0.5D + (double)var13[0][0] * 0.5D;
            double var28 = (double)var3 + 0.5D + (double)var13[0][2] * 0.5D;
            double var30 = (double)var1 + 0.5D + (double)var13[1][0] * 0.5D;
            double var32 = (double)var3 + 0.5D + (double)var13[1][2] * 0.5D;
            var14 = var30 - var26;
            var16 = var32 - var28;
            double var34;
            double var36;
            if(var14 == 0.0D) {
               this.field_103221_t = (double)var1 + 0.5D;
               var24 = this.field_103217_v - (double)var3;
            } else if(var16 == 0.0D) {
               this.field_103217_v = (double)var3 + 0.5D;
               var24 = this.field_103221_t - (double)var1;
            } else {
               var34 = this.field_103221_t - var26;
               var36 = this.field_103217_v - var28;
               var24 = (var34 * var14 + var36 * var16) * 2.0D;
            }

            this.field_103221_t = var26 + var14 * var24;
            this.field_103217_v = var28 + var16 * var24;
            this.func_103163_b(this.field_103221_t, this.field_103219_u + (double)this.field_103181_M, this.field_103217_v);
            var34 = this.field_103215_w;
            var36 = this.field_103238_y;
            if(this.field_103206_n != null) {
               var34 *= 0.75D;
               var36 *= 0.75D;
            }

            if(var34 < -var4) {
               var34 = -var4;
            }

            if(var34 > var4) {
               var34 = var4;
            }

            if(var36 < -var4) {
               var36 = -var4;
            }

            if(var36 > var4) {
               var36 = var4;
            }

            this.func_103145_d(var34, 0.0D, var36);
            if(var13[0][1] != 0 && C_100650_jv.func_108910_c(this.field_103221_t) - var1 == var13[0][0] && C_100650_jv.func_108910_c(this.field_103217_v) - var3 == var13[0][2]) {
               this.func_103163_b(this.field_103221_t, this.field_103219_u + (double)var13[0][1], this.field_103217_v);
            } else if(var13[1][1] != 0 && C_100650_jv.func_108910_c(this.field_103221_t) - var1 == var13[1][0] && C_100650_jv.func_108910_c(this.field_103217_v) - var3 == var13[1][2]) {
               this.func_103163_b(this.field_103221_t, this.field_103219_u + (double)var13[1][1], this.field_103217_v);
            }

            if(this.field_103206_n != null) {
               this.field_103215_w *= 0.996999979019165D;
               this.field_103240_x *= 0.0D;
               this.field_103238_y *= 0.996999979019165D;
            } else {
               if(this.field_104761_a == 2) {
                  double var38 = this.field_104759_b * this.field_104759_b + this.field_104760_c * this.field_104760_c;
                  if(var38 > 1.0E-4D) {
                     var38 = (double)C_100650_jv.func_108915_a(var38);
                     this.field_104759_b /= var38;
                     this.field_104760_c /= var38;
                     double var40 = 0.04D;
                     this.field_103215_w *= 0.800000011920929D;
                     this.field_103240_x *= 0.0D;
                     this.field_103238_y *= 0.800000011920929D;
                     this.field_103215_w += this.field_104759_b * var40;
                     this.field_103238_y += this.field_104760_c * var40;
                  } else {
                     this.field_103215_w *= 0.8999999761581421D;
                     this.field_103240_x *= 0.0D;
                     this.field_103238_y *= 0.8999999761581421D;
                  }
               }

               this.field_103215_w *= 0.9599999785423279D;
               this.field_103240_x *= 0.0D;
               this.field_103238_y *= 0.9599999785423279D;
            }

            C_100387_amw var52 = this.func_104743_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
            if(var52 != null && var9 != null) {
               double var39 = (var9.field_107869_d - var52.field_107869_d) * 0.05D;
               var22 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
               if(var22 > 0.0D) {
                  this.field_103215_w = this.field_103215_w / var22 * (var22 + var39);
                  this.field_103238_y = this.field_103238_y / var22 * (var22 + var39);
               }

               this.func_103163_b(this.field_103221_t, var52.field_107869_d, this.field_103217_v);
            }

            int var51 = C_100650_jv.func_108910_c(this.field_103221_t);
            int var53 = C_100650_jv.func_108910_c(this.field_103217_v);
            if(var51 != var1 || var53 != var3) {
               var22 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
               this.field_103215_w = var22 * (double)(var51 - var1);
               this.field_103238_y = var22 * (double)(var53 - var3);
            }

            double var41;
            if(this.field_104761_a == 2) {
               var41 = this.field_104759_b * this.field_104759_b + this.field_104760_c * this.field_104760_c;
               if(var41 > 1.0E-4D && this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y > 0.0010D) {
                  var41 = (double)C_100650_jv.func_108915_a(var41);
                  this.field_104759_b /= var41;
                  this.field_104760_c /= var41;
                  if(this.field_104759_b * this.field_103215_w + this.field_104760_c * this.field_103238_y < 0.0D) {
                     this.field_104759_b = 0.0D;
                     this.field_104760_c = 0.0D;
                  } else {
                     this.field_104759_b = this.field_103215_w;
                     this.field_104760_c = this.field_103238_y;
                  }
               }
            }

            if(var11) {
               var41 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
               if(var41 > 0.01D) {
                  double var43 = 0.06D;
                  this.field_103215_w += this.field_103215_w / var41 * var43;
                  this.field_103238_y += this.field_103238_y / var41 * var43;
               } else if(var10 == 1) {
                  if(this.field_103229_p.func_109360_s(var1 - 1, var2, var3)) {
                     this.field_103215_w = 0.02D;
                  } else if(this.field_103229_p.func_109360_s(var1 + 1, var2, var3)) {
                     this.field_103215_w = -0.02D;
                  }
               } else if(var10 == 0) {
                  if(this.field_103229_p.func_109360_s(var1, var2, var3 - 1)) {
                     this.field_103238_y = 0.02D;
                  } else if(this.field_103229_p.func_109360_s(var1, var2, var3 + 1)) {
                     this.field_103238_y = -0.02D;
                  }
               }
            }
         } else {
            if(this.field_103215_w < -var4) {
               this.field_103215_w = -var4;
            }

            if(this.field_103215_w > var4) {
               this.field_103215_w = var4;
            }

            if(this.field_103238_y < -var4) {
               this.field_103238_y = -var4;
            }

            if(this.field_103238_y > var4) {
               this.field_103238_y = var4;
            }

            if(this.field_103174_E) {
               this.field_103215_w *= 0.5D;
               this.field_103240_x *= 0.5D;
               this.field_103238_y *= 0.5D;
            }

            this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
            if(!this.field_103174_E) {
               this.field_103215_w *= 0.949999988079071D;
               this.field_103240_x *= 0.949999988079071D;
               this.field_103238_y *= 0.949999988079071D;
            }
         }

         this.func_103063_D();
         this.field_103177_A = 0.0F;
         double var47 = this.field_103227_q - this.field_103221_t;
         double var48 = this.field_103223_s - this.field_103217_v;
         if(var47 * var47 + var48 * var48 > 0.0010D) {
            this.field_103236_z = (float)(Math.atan2(var48, var47) * 180.0D / 3.141592653589793D);
            if(this.field_104753_f) {
               this.field_103236_z += 180.0F;
            }
         }

         double var49 = (double)C_100650_jv.func_108920_g(this.field_103236_z - this.field_103178_B);
         if(var49 < -170.0D || var49 >= 170.0D) {
            this.field_103236_z += 180.0F;
            this.field_104753_f = !this.field_104753_f;
         }

         this.func_103158_b(this.field_103236_z, this.field_103177_A);
         List var15 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107895_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
         if(var15 != null && !var15.isEmpty()) {
            for(int var50 = 0; var50 < var15.size(); ++var50) {
               C_100730_lb var17 = (C_100730_lb)var15.get(var50);
               if(var17 != this.field_103206_n && var17.func_103160_M() && var17 instanceof C_100590_ph) {
                  var17.func_103093_f(this);
               }
            }
         }

         if(this.field_103206_n != null && this.field_103206_n.field_103180_L) {
            if(this.field_103206_n.field_103207_o == this) {
               this.field_103206_n.field_103207_o = null;
            }

            this.field_103206_n = null;
         }

         if(this.field_104758_e > 0) {
            --this.field_104758_e;
         }

         if(this.field_104758_e <= 0) {
            this.field_104759_b = this.field_104760_c = 0.0D;
         }

         this.func_104746_e(this.field_104758_e > 0);
      }
   }

   public C_100387_amw func_104752_a(double var1, double var3, double var5, double var7) {
      int var9 = C_100650_jv.func_108910_c(var1);
      int var10 = C_100650_jv.func_108910_c(var3);
      int var11 = C_100650_jv.func_108910_c(var5);
      if(C_100127_akg.func_106258_e_(this.field_103229_p, var9, var10 - 1, var11)) {
         --var10;
      }

      int var12 = this.field_103229_p.func_109349_a(var9, var10, var11);
      if(!C_100127_akg.func_106259_d(var12)) {
         return null;
      } else {
         int var13 = this.field_103229_p.func_109357_g(var9, var10, var11);
         if(((C_100127_akg)C_100451_alf.field_106118_p[var12]).func_106263_p()) {
            var13 &= 7;
         }

         var3 = (double)var10;
         if(var13 >= 2 && var13 <= 5) {
            var3 = (double)(var10 + 1);
         }

         int[][] var14 = field_104769_i[var13];
         double var15 = (double)(var14[1][0] - var14[0][0]);
         double var17 = (double)(var14[1][2] - var14[0][2]);
         double var19 = Math.sqrt(var15 * var15 + var17 * var17);
         var15 /= var19;
         var17 /= var19;
         var1 += var15 * var7;
         var5 += var17 * var7;
         if(var14[0][1] != 0 && C_100650_jv.func_108910_c(var1) - var9 == var14[0][0] && C_100650_jv.func_108910_c(var5) - var11 == var14[0][2]) {
            var3 += (double)var14[0][1];
         } else if(var14[1][1] != 0 && C_100650_jv.func_108910_c(var1) - var9 == var14[1][0] && C_100650_jv.func_108910_c(var5) - var11 == var14[1][2]) {
            var3 += (double)var14[1][1];
         }

         return this.func_104743_a(var1, var3, var5);
      }
   }

   public C_100387_amw func_104743_a(double var1, double var3, double var5) {
      int var7 = C_100650_jv.func_108910_c(var1);
      int var8 = C_100650_jv.func_108910_c(var3);
      int var9 = C_100650_jv.func_108910_c(var5);
      if(C_100127_akg.func_106258_e_(this.field_103229_p, var7, var8 - 1, var9)) {
         --var8;
      }

      int var10 = this.field_103229_p.func_109349_a(var7, var8, var9);
      if(C_100127_akg.func_106259_d(var10)) {
         int var11 = this.field_103229_p.func_109357_g(var7, var8, var9);
         var3 = (double)var8;
         if(((C_100127_akg)C_100451_alf.field_106118_p[var10]).func_106263_p()) {
            var11 &= 7;
         }

         if(var11 >= 2 && var11 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var12 = field_104769_i[var11];
         double var13 = 0.0D;
         double var15 = (double)var7 + 0.5D + (double)var12[0][0] * 0.5D;
         double var17 = (double)var8 + 0.5D + (double)var12[0][1] * 0.5D;
         double var19 = (double)var9 + 0.5D + (double)var12[0][2] * 0.5D;
         double var21 = (double)var7 + 0.5D + (double)var12[1][0] * 0.5D;
         double var23 = (double)var8 + 0.5D + (double)var12[1][1] * 0.5D;
         double var25 = (double)var9 + 0.5D + (double)var12[1][2] * 0.5D;
         double var27 = var21 - var15;
         double var29 = (var23 - var17) * 2.0D;
         double var31 = var25 - var19;
         if(var27 == 0.0D) {
            var1 = (double)var7 + 0.5D;
            var13 = var5 - (double)var9;
         } else if(var31 == 0.0D) {
            var5 = (double)var9 + 0.5D;
            var13 = var1 - (double)var7;
         } else {
            double var33 = var1 - var15;
            double var35 = var5 - var19;
            var13 = (var33 * var27 + var35 * var31) * 2.0D;
         }

         var1 = var15 + var27 * var13;
         var3 = var17 + var29 * var13;
         var5 = var19 + var31 * var13;
         if(var29 < 0.0D) {
            ++var3;
         }

         if(var29 > 0.0D) {
            var3 += 0.5D;
         }

         return this.field_103229_p.func_109363_R().func_107878_a(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void func_103078_b(C_100353_bh var1) {
      var1.func_107520_a("Type", this.field_104761_a);
      if(this.field_104761_a == 2) {
         var1.func_107535_a("PushX", this.field_104759_b);
         var1.func_107535_a("PushZ", this.field_104760_c);
         var1.func_107532_a("Fuel", (short)this.field_104758_e);
      } else if(this.field_104761_a == 1) {
         C_100339_bp var2 = new C_100339_bp();

         for(int var3 = 0; var3 < this.field_104756_d.length; ++var3) {
            if(this.field_104756_d[var3] != null) {
               C_100353_bh var4 = new C_100353_bh();
               var4.func_107527_a("Slot", (byte)var3);
               this.field_104756_d[var3].func_111344_b(var4);
               var2.func_107500_a(var4);
            }
         }

         var1.func_107530_a("Items", var2);
      }

   }

   protected void func_103110_a(C_100353_bh var1) {
      this.field_104761_a = var1.func_107514_e("Type");
      if(this.field_104761_a == 2) {
         this.field_104759_b = var1.func_107522_h("PushX");
         this.field_104760_c = var1.func_107522_h("PushZ");
         this.field_104758_e = var1.func_107517_d("Fuel");
      } else if(this.field_104761_a == 1) {
         C_100339_bp var2 = var1.func_107513_m("Items");
         this.field_104756_d = new C_100994_tv[this.func_103003_k_()];

         for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
            C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
            int var5 = var4.func_107524_c("Slot") & 255;
            if(var5 >= 0 && var5 < this.field_104756_d.length) {
               this.field_104756_d[var5] = C_100994_tv.func_111376_a(var4);
            }
         }
      }

   }

   public float func_103109_R() {
      return 0.0F;
   }

   public void func_103093_f(C_100730_lb var1) {
      if(!this.field_103229_p.field_109557_J) {
         if(var1 != this.field_103206_n) {
            if(var1 instanceof C_100595_ln && !(var1 instanceof C_101095_qg) && !(var1 instanceof C_100557_or) && this.field_104761_a == 0 && this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y > 0.01D && this.field_103206_n == null && var1.field_103207_o == null) {
               var1.func_103064_a(this);
            }

            double var2 = var1.field_103221_t - this.field_103221_t;
            double var4 = var1.field_103217_v - this.field_103217_v;
            double var6 = var2 * var2 + var4 * var4;
            if(var6 >= 9.999999747378752E-5D) {
               var6 = (double)C_100650_jv.func_108915_a(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0D / var6;
               if(var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.10000000149011612D;
               var4 *= 0.10000000149011612D;
               var2 *= (double)(1.0F - this.field_103198_Z);
               var4 *= (double)(1.0F - this.field_103198_Z);
               var2 *= 0.5D;
               var4 *= 0.5D;
               if(var1 instanceof C_100590_ph) {
                  double var10 = var1.field_103221_t - this.field_103221_t;
                  double var12 = var1.field_103217_v - this.field_103217_v;
                  C_100387_amw var14 = this.field_103229_p.func_109363_R().func_107878_a(var10, 0.0D, var12).func_107865_a();
                  C_100387_amw var15 = this.field_103229_p.func_109363_R().func_107878_a((double)C_100650_jv.func_108928_b(this.field_103236_z * 3.1415927F / 180.0F), 0.0D, (double)C_100650_jv.func_108924_a(this.field_103236_z * 3.1415927F / 180.0F)).func_107865_a();
                  double var16 = Math.abs(var14.func_107857_b(var15));
                  if(var16 < 0.800000011920929D) {
                     return;
                  }

                  double var18 = var1.field_103215_w + this.field_103215_w;
                  double var20 = var1.field_103238_y + this.field_103238_y;
                  if(((C_100590_ph)var1).field_104761_a == 2 && this.field_104761_a != 2) {
                     this.field_103215_w *= 0.20000000298023224D;
                     this.field_103238_y *= 0.20000000298023224D;
                     this.func_103071_g(var1.field_103215_w - var2, 0.0D, var1.field_103238_y - var4);
                     var1.field_103215_w *= 0.949999988079071D;
                     var1.field_103238_y *= 0.949999988079071D;
                  } else if(((C_100590_ph)var1).field_104761_a != 2 && this.field_104761_a == 2) {
                     var1.field_103215_w *= 0.20000000298023224D;
                     var1.field_103238_y *= 0.20000000298023224D;
                     var1.func_103071_g(this.field_103215_w + var2, 0.0D, this.field_103238_y + var4);
                     this.field_103215_w *= 0.949999988079071D;
                     this.field_103238_y *= 0.949999988079071D;
                  } else {
                     var18 /= 2.0D;
                     var20 /= 2.0D;
                     this.field_103215_w *= 0.20000000298023224D;
                     this.field_103238_y *= 0.20000000298023224D;
                     this.func_103071_g(var18 - var2, 0.0D, var20 - var4);
                     var1.field_103215_w *= 0.20000000298023224D;
                     var1.field_103238_y *= 0.20000000298023224D;
                     var1.func_103071_g(var18 + var2, 0.0D, var20 + var4);
                  }
               } else {
                  this.func_103071_g(-var2, 0.0D, -var4);
                  var1.func_103071_g(var2 / 4.0D, 0.0D, var4 / 4.0D);
               }
            }

         }
      }
   }

   public int func_103003_k_() {
      return 27;
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_104756_d[var1];
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_104756_d[var1] != null) {
         C_100994_tv var3;
         if(this.field_104756_d[var1].field_111398_a <= var2) {
            var3 = this.field_104756_d[var1];
            this.field_104756_d[var1] = null;
            return var3;
         } else {
            var3 = this.field_104756_d[var1].func_111342_a(var2);
            if(this.field_104756_d[var1].field_111398_a == 0) {
               this.field_104756_d[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_104756_d[var1] != null) {
         C_100994_tv var2 = this.field_104756_d[var1];
         this.field_104756_d[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_104756_d[var1] = var2;
      if(var2 != null && var2.field_111398_a > this.func_103008_c()) {
         var2.field_111398_a = this.func_103008_c();
      }

   }

   public String func_103005_b() {
      return "container.minecart";
   }

   public int func_103008_c() {
      return 64;
   }

   public void func_102922_d() {}

   public boolean func_103134_c(C_101095_qg var1) {
      if(this.field_104761_a == 0) {
         if(this.field_103206_n != null && this.field_103206_n instanceof C_101095_qg && this.field_103206_n != var1) {
            return true;
         }

         if(!this.field_103229_p.field_109557_J) {
            var1.func_103064_a(this);
         }
      } else if(this.field_104761_a == 1) {
         if(!this.field_103229_p.field_109557_J) {
            var1.func_103785_a(this);
         }
      } else if(this.field_104761_a == 2) {
         C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
         if(var2 != null && var2.field_111397_c == C_100992_tt.field_110841_m.field_110891_cf) {
            if(--var2.field_111398_a == 0) {
               var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
            }

            this.field_104758_e += 3600;
         }

         this.field_104759_b = this.field_103221_t - var1.field_103221_t;
         this.field_104760_c = this.field_103217_v - var1.field_103217_v;
      }

      return true;
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.field_104763_as = var1;
      this.field_104762_at = var3;
      this.field_104770_au = var5;
      this.field_104767_av = (double)var7;
      this.field_104766_aw = (double)var8;
      this.field_104765_j = var9 + 2;
      this.field_103215_w = this.field_104764_ax;
      this.field_103240_x = this.field_104757_ay;
      this.field_103238_y = this.field_104755_az;
   }

   public void func_103061_h(double var1, double var3, double var5) {
      this.field_104764_ax = this.field_103215_w = var1;
      this.field_104757_ay = this.field_103240_x = var3;
      this.field_104755_az = this.field_103238_y = var5;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_103180_L?false:var1.func_103082_e(this) <= 64.0D;
   }

   protected boolean func_104744_h() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   protected void func_104746_e(boolean var1) {
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(this.field_103234_ag.func_108842_a(16) | 1)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(this.field_103234_ag.func_108842_a(16) & -2)));
      }

   }

   public void func_103004_l_() {}

   public void func_103009_f() {}

   public void func_104747_g(int var1) {
      this.field_103234_ag.func_108851_b(19, Integer.valueOf(var1));
   }

   public int func_104745_i() {
      return this.field_103234_ag.func_108837_c(19);
   }

   public void func_104751_h(int var1) {
      this.field_103234_ag.func_108851_b(17, Integer.valueOf(var1));
   }

   public int func_104750_j() {
      return this.field_103234_ag.func_108837_c(17);
   }

   public void func_104749_i(int var1) {
      this.field_103234_ag.func_108851_b(18, Integer.valueOf(var1));
   }

   public int func_104748_k() {
      return this.field_103234_ag.func_108837_c(18);
   }

}
