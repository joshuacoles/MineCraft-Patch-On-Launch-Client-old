import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public abstract class C_100730_lb {

   private static int field_103203_b = 0;
   public int field_103212_k;
   public double field_103209_l;
   public boolean field_103211_m;
   public C_100730_lb field_103206_n;
   public C_100730_lb field_103207_o;
   public C_100873_xe field_103229_p;
   public double field_103227_q;
   public double field_103225_r;
   public double field_103223_s;
   public double field_103221_t;
   public double field_103219_u;
   public double field_103217_v;
   public double field_103215_w;
   public double field_103240_x;
   public double field_103238_y;
   public float field_103236_z;
   public float field_103177_A;
   public float field_103178_B;
   public float field_103179_C;
   public final C_100412_amr field_103173_D;
   public boolean field_103174_E;
   public boolean field_103175_F;
   public boolean field_103176_G;
   public boolean field_103184_H;
   public boolean field_103185_I;
   protected boolean field_103186_J;
   public boolean field_103187_K;
   public boolean field_103180_L;
   public float field_103181_M;
   public float field_103182_N;
   public float field_103183_O;
   public float field_103193_P;
   public float field_103192_Q;
   public float field_103195_R;
   public float field_103194_S;
   private int field_103205_c;
   public double field_103189_T;
   public double field_103188_U;
   public double field_103191_V;
   public float field_103190_W;
   public float field_103197_X;
   public boolean field_103196_Y;
   public float field_103198_Z;
   protected Random field_103232_aa;
   public int field_103233_ab;
   public int field_103230_ac;
   private int field_103201_d;
   protected boolean field_103231_ad;
   public int field_103237_ae;
   private boolean field_103202_e;
   public String field_103172_cw;
   public String field_103171_cx;
   protected boolean field_103239_af;
   protected C_100605_lt field_103234_ag;
   private double field_103199_f;
   private double field_103200_g;
   public boolean field_103235_ah;
   public int field_103218_ai;
   public int field_103220_aj;
   public int field_103214_ak;
   public int field_103170_cy;
   public int field_103169_cz;
   public int field_103204_cA;
   public boolean field_103216_al;
   public boolean field_103226_am;
   public int field_103228_an;
   protected boolean field_103222_ao;
   private int field_103213_h;
   public int field_103224_ap;
   protected int field_103210_aq;
   public C_100725_ld field_103208_ar;


   public C_100730_lb(C_100873_xe var1) {
      this.field_103212_k = field_103203_b++;
      this.field_103209_l = 1.0D;
      this.field_103211_m = false;
      this.field_103173_D = C_100412_amr.func_107894_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.field_103174_E = false;
      this.field_103184_H = false;
      this.field_103185_I = false;
      this.field_103187_K = true;
      this.field_103180_L = false;
      this.field_103181_M = 0.0F;
      this.field_103182_N = 0.6F;
      this.field_103183_O = 1.8F;
      this.field_103193_P = 0.0F;
      this.field_103192_Q = 0.0F;
      this.field_103195_R = 0.0F;
      this.field_103194_S = 0.0F;
      this.field_103205_c = 1;
      this.field_103190_W = 0.0F;
      this.field_103197_X = 0.0F;
      this.field_103196_Y = false;
      this.field_103198_Z = 0.0F;
      this.field_103232_aa = new Random();
      this.field_103233_ab = 0;
      this.field_103230_ac = 1;
      this.field_103201_d = 0;
      this.field_103231_ad = false;
      this.field_103237_ae = 0;
      this.field_103202_e = true;
      this.field_103239_af = false;
      this.field_103234_ag = new C_100605_lt();
      this.field_103235_ah = false;
      this.field_103210_aq = 0;
      this.field_103208_ar = C_100725_ld.field_109303_b;
      this.field_103229_p = var1;
      this.func_103163_b(0.0D, 0.0D, 0.0D);
      if(var1 != null) {
         this.field_103224_ap = var1.field_109576_v.field_112401_h;
      }

      this.field_103234_ag.func_108841_a(0, Byte.valueOf((byte)0));
      this.field_103234_ag.func_108841_a(1, Short.valueOf((short)300));
      this.func_103141_a();
   }

   protected abstract void func_103141_a();

   public C_100605_lt func_103087_v() {
      return this.field_103234_ag;
   }

   public boolean equals(Object var1) {
      return var1 instanceof C_100730_lb?((C_100730_lb)var1).field_103212_k == this.field_103212_k:false;
   }

   public int hashCode() {
      return this.field_103212_k;
   }

   protected void func_103128_w() {
      if(this.field_103229_p != null) {
         while(this.field_103219_u > 0.0D) {
            this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
            if(this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty()) {
               break;
            }

            ++this.field_103219_u;
         }

         this.field_103215_w = this.field_103240_x = this.field_103238_y = 0.0D;
         this.field_103177_A = 0.0F;
      }
   }

   public void func_103121_x() {
      this.field_103180_L = true;
   }

   protected void func_103161_a(float var1, float var2) {
      this.field_103182_N = var1;
      this.field_103183_O = var2;
      float var3 = var1 % 2.0F;
      if((double)var3 < 0.375D) {
         this.field_103208_ar = C_100725_ld.field_109305_a;
      } else if((double)var3 < 0.75D) {
         this.field_103208_ar = C_100725_ld.field_109303_b;
      } else if((double)var3 < 1.0D) {
         this.field_103208_ar = C_100725_ld.field_109304_c;
      } else if((double)var3 < 1.375D) {
         this.field_103208_ar = C_100725_ld.field_109301_d;
      } else if((double)var3 < 1.75D) {
         this.field_103208_ar = C_100725_ld.field_109302_e;
      } else {
         this.field_103208_ar = C_100725_ld.field_109299_f;
      }

   }

   protected void func_103158_b(float var1, float var2) {
      this.field_103236_z = var1 % 360.0F;
      this.field_103177_A = var2 % 360.0F;
   }

   public void func_103163_b(double var1, double var3, double var5) {
      this.field_103221_t = var1;
      this.field_103219_u = var3;
      this.field_103217_v = var5;
      float var7 = this.field_103182_N / 2.0F;
      float var8 = this.field_103183_O;
      this.field_103173_D.func_107907_b(var1 - (double)var7, var3 - (double)this.field_103181_M + (double)this.field_103190_W, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.field_103181_M + (double)this.field_103190_W + (double)var8, var5 + (double)var7);
   }

   public void func_103137_c(float var1, float var2) {
      float var3 = this.field_103177_A;
      float var4 = this.field_103236_z;
      this.field_103236_z = (float)((double)this.field_103236_z + (double)var1 * 0.15D);
      this.field_103177_A = (float)((double)this.field_103177_A - (double)var2 * 0.15D);
      if(this.field_103177_A < -90.0F) {
         this.field_103177_A = -90.0F;
      }

      if(this.field_103177_A > 90.0F) {
         this.field_103177_A = 90.0F;
      }

      this.field_103179_C += this.field_103177_A - var3;
      this.field_103178_B += this.field_103236_z - var4;
   }

   public void func_103165_j_() {
      this.func_103162_y();
   }

   public void func_103162_y() {
      this.field_103229_p.field_109545_E.func_108901_a("entityBaseTick");
      if(this.field_103207_o != null && this.field_103207_o.field_103180_L) {
         this.field_103207_o = null;
      }

      ++this.field_103233_ab;
      this.field_103193_P = this.field_103192_Q;
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.field_103179_C = this.field_103177_A;
      this.field_103178_B = this.field_103236_z;
      int var2;
      if(!this.field_103229_p.field_109557_J && this.field_103229_p instanceof C_100765_ie) {
         C_101445_MinecraftServer var1 = ((C_100765_ie)this.field_103229_p).func_109611_o();
         var2 = this.func_103086_z();
         if(this.field_103222_ao) {
            if(var1.func_104936_s()) {
               if(this.field_103207_o == null && this.field_103213_h++ >= var2) {
                  this.field_103213_h = var2;
                  this.field_103228_an = this.func_103103_ab();
                  byte var3;
                  if(this.field_103229_p.field_109576_v.field_112401_h == -1) {
                     var3 = 0;
                  } else {
                     var3 = -1;
                  }

                  this.func_103090_b(var3);
               }

               this.field_103222_ao = false;
            }
         } else {
            if(this.field_103213_h > 0) {
               this.field_103213_h -= 4;
            }

            if(this.field_103213_h < 0) {
               this.field_103213_h = 0;
            }
         }

         if(this.field_103228_an > 0) {
            --this.field_103228_an;
         }
      }

      int var9;
      if(this.func_103147_ai() && !this.func_103144_H()) {
         int var6 = C_100650_jv.func_108910_c(this.field_103221_t);
         var2 = C_100650_jv.func_108910_c(this.field_103219_u - 0.20000000298023224D - (double)this.field_103181_M);
         var9 = C_100650_jv.func_108910_c(this.field_103217_v);
         int var4 = this.field_103229_p.func_109349_a(var6, var2, var9);
         if(var4 > 0) {
            this.field_103229_p.func_109428_a("tilecrack_" + var4, this.field_103221_t + ((double)this.field_103232_aa.nextFloat() - 0.5D) * (double)this.field_103182_N, this.field_103173_D.field_107915_b + 0.1D, this.field_103217_v + ((double)this.field_103232_aa.nextFloat() - 0.5D) * (double)this.field_103182_N, -this.field_103215_w * 4.0D, 1.5D, -this.field_103238_y * 4.0D);
         }
      }

      if(this.func_103126_I()) {
         if(!this.field_103231_ad && !this.field_103202_e) {
            float var7 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w * 0.20000000298023224D + this.field_103240_x * this.field_103240_x + this.field_103238_y * this.field_103238_y * 0.20000000298023224D) * 0.2F;
            if(var7 > 1.0F) {
               var7 = 1.0F;
            }

            this.field_103229_p.func_109412_a(this, "liquid.splash", var7, 1.0F + (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.4F);
            float var8 = (float)C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);

            float var5;
            float var10;
            for(var9 = 0; (float)var9 < 1.0F + this.field_103182_N * 20.0F; ++var9) {
               var10 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
               var5 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
               this.field_103229_p.func_109428_a("bubble", this.field_103221_t + (double)var10, (double)(var8 + 1.0F), this.field_103217_v + (double)var5, this.field_103215_w, this.field_103240_x - (double)(this.field_103232_aa.nextFloat() * 0.2F), this.field_103238_y);
            }

            for(var9 = 0; (float)var9 < 1.0F + this.field_103182_N * 20.0F; ++var9) {
               var10 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
               var5 = (this.field_103232_aa.nextFloat() * 2.0F - 1.0F) * this.field_103182_N;
               this.field_103229_p.func_109428_a("splash", this.field_103221_t + (double)var10, (double)(var8 + 1.0F), this.field_103217_v + (double)var5, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }
         }

         this.field_103194_S = 0.0F;
         this.field_103231_ad = true;
         this.field_103201_d = 0;
      } else {
         this.field_103231_ad = false;
      }

      if(this.field_103229_p.field_109557_J) {
         this.field_103201_d = 0;
      } else if(this.field_103201_d > 0) {
         if(this.field_103239_af) {
            this.field_103201_d -= 4;
            if(this.field_103201_d < 0) {
               this.field_103201_d = 0;
            }
         } else {
            if(this.field_103201_d % 20 == 0) {
               this.func_103085_a(C_100698_ks.field_109233_b, 1);
            }

            --this.field_103201_d;
         }
      }

      if(this.func_103115_J()) {
         this.func_103100_A();
         this.field_103194_S *= 0.5F;
      }

      if(this.field_103219_u < -64.0D) {
         this.func_103131_C();
      }

      if(!this.field_103229_p.field_109557_J) {
         this.func_103107_a(0, this.field_103201_d > 0);
         this.func_103107_a(2, this.field_103207_o != null);
      }

      this.field_103202_e = false;
      this.field_103229_p.field_109545_E.func_108900_b();
   }

   public int func_103086_z() {
      return 0;
   }

   protected void func_103100_A() {
      if(!this.field_103239_af) {
         this.func_103085_a(C_100698_ks.field_109234_c, 4);
         this.func_103112_c(15);
      }

   }

   public void func_103112_c(int var1) {
      int var2 = var1 * 20;
      if(this.field_103201_d < var2) {
         this.field_103201_d = var2;
      }

   }

   public void func_103122_B() {
      this.field_103201_d = 0;
   }

   protected void func_103131_C() {
      this.func_103121_x();
   }

   public boolean func_103091_c(double var1, double var3, double var5) {
      C_100412_amr var7 = this.field_103173_D.func_107891_c(var1, var3, var5);
      List var8 = this.field_103229_p.func_109508_a(this, var7);
      return !var8.isEmpty()?false:!this.field_103229_p.func_109413_d(var7);
   }

   public void func_103145_d(double var1, double var3, double var5) {
      if(this.field_103196_Y) {
         this.field_103173_D.func_107899_d(var1, var3, var5);
         this.field_103221_t = (this.field_103173_D.field_107917_a + this.field_103173_D.field_107913_d) / 2.0D;
         this.field_103219_u = this.field_103173_D.field_107915_b + (double)this.field_103181_M - (double)this.field_103190_W;
         this.field_103217_v = (this.field_103173_D.field_107916_c + this.field_103173_D.field_107911_f) / 2.0D;
      } else {
         this.field_103229_p.field_109545_E.func_108901_a("move");
         this.field_103190_W *= 0.4F;
         double var7 = this.field_103221_t;
         double var9 = this.field_103219_u;
         double var11 = this.field_103217_v;
         if(this.field_103186_J) {
            this.field_103186_J = false;
            var1 *= 0.25D;
            var3 *= 0.05000000074505806D;
            var5 *= 0.25D;
            this.field_103215_w = 0.0D;
            this.field_103240_x = 0.0D;
            this.field_103238_y = 0.0D;
         }

         double var13 = var1;
         double var15 = var3;
         double var17 = var5;
         C_100412_amr var19 = this.field_103173_D.func_107900_c();
         boolean var20 = this.field_103174_E && this.func_103168_ah() && this instanceof C_101095_qg;
         if(var20) {
            double var21;
            for(var21 = 0.05D; var1 != 0.0D && this.field_103229_p.func_109508_a(this, this.field_103173_D.func_107891_c(var1, -1.0D, 0.0D)).isEmpty(); var13 = var1) {
               if(var1 < var21 && var1 >= -var21) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var21;
               } else {
                  var1 += var21;
               }
            }

            for(; var5 != 0.0D && this.field_103229_p.func_109508_a(this, this.field_103173_D.func_107891_c(0.0D, -1.0D, var5)).isEmpty(); var17 = var5) {
               if(var5 < var21 && var5 >= -var21) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var21;
               } else {
                  var5 += var21;
               }
            }

            while(var1 != 0.0D && var5 != 0.0D && this.field_103229_p.func_109508_a(this, this.field_103173_D.func_107891_c(var1, -1.0D, var5)).isEmpty()) {
               if(var1 < var21 && var1 >= -var21) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var21;
               } else {
                  var1 += var21;
               }

               if(var5 < var21 && var5 >= -var21) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var21;
               } else {
                  var5 += var21;
               }

               var13 = var1;
               var17 = var5;
            }
         }

         List var36 = this.field_103229_p.func_109508_a(this, this.field_103173_D.func_107903_a(var1, var3, var5));

         C_100412_amr var23;
         for(Iterator var22 = var36.iterator(); var22.hasNext(); var3 = var23.func_107904_b(this.field_103173_D, var3)) {
            var23 = (C_100412_amr)var22.next();
         }

         this.field_103173_D.func_107899_d(0.0D, var3, 0.0D);
         if(!this.field_103187_K && var15 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var34 = this.field_103174_E || var15 != var3 && var15 < 0.0D;

         C_100412_amr var24;
         Iterator var35;
         for(var35 = var36.iterator(); var35.hasNext(); var1 = var24.func_107897_a(this.field_103173_D, var1)) {
            var24 = (C_100412_amr)var35.next();
         }

         this.field_103173_D.func_107899_d(var1, 0.0D, 0.0D);
         if(!this.field_103187_K && var13 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var35 = var36.iterator(); var35.hasNext(); var5 = var24.func_107905_c(this.field_103173_D, var5)) {
            var24 = (C_100412_amr)var35.next();
         }

         this.field_103173_D.func_107899_d(0.0D, 0.0D, var5);
         if(!this.field_103187_K && var17 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var25;
         double var27;
         double var37;
         if(this.field_103197_X > 0.0F && var34 && (var20 || this.field_103190_W < 0.05F) && (var13 != var1 || var17 != var5)) {
            var37 = var1;
            var25 = var3;
            var27 = var5;
            var1 = var13;
            var3 = (double)this.field_103197_X;
            var5 = var17;
            C_100412_amr var29 = this.field_103173_D.func_107900_c();
            this.field_103173_D.func_107909_c(var19);
            var36 = this.field_103229_p.func_109508_a(this, this.field_103173_D.func_107903_a(var13, var3, var17));

            C_100412_amr var31;
            Iterator var30;
            for(var30 = var36.iterator(); var30.hasNext(); var3 = var31.func_107904_b(this.field_103173_D, var3)) {
               var31 = (C_100412_amr)var30.next();
            }

            this.field_103173_D.func_107899_d(0.0D, var3, 0.0D);
            if(!this.field_103187_K && var15 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var30 = var36.iterator(); var30.hasNext(); var1 = var31.func_107897_a(this.field_103173_D, var1)) {
               var31 = (C_100412_amr)var30.next();
            }

            this.field_103173_D.func_107899_d(var1, 0.0D, 0.0D);
            if(!this.field_103187_K && var13 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var30 = var36.iterator(); var30.hasNext(); var5 = var31.func_107905_c(this.field_103173_D, var5)) {
               var31 = (C_100412_amr)var30.next();
            }

            this.field_103173_D.func_107899_d(0.0D, 0.0D, var5);
            if(!this.field_103187_K && var17 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if(!this.field_103187_K && var15 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            } else {
               var3 = (double)(-this.field_103197_X);

               for(var30 = var36.iterator(); var30.hasNext(); var3 = var31.func_107904_b(this.field_103173_D, var3)) {
                  var31 = (C_100412_amr)var30.next();
               }

               this.field_103173_D.func_107899_d(0.0D, var3, 0.0D);
            }

            if(var37 * var37 + var27 * var27 >= var1 * var1 + var5 * var5) {
               var1 = var37;
               var3 = var25;
               var5 = var27;
               this.field_103173_D.func_107909_c(var29);
            } else {
               double var38 = this.field_103173_D.field_107915_b - (double)((int)this.field_103173_D.field_107915_b);
               if(var38 > 0.0D) {
                  this.field_103190_W = (float)((double)this.field_103190_W + var38 + 0.01D);
               }
            }
         }

         this.field_103229_p.field_109545_E.func_108900_b();
         this.field_103229_p.field_109545_E.func_108901_a("rest");
         this.field_103221_t = (this.field_103173_D.field_107917_a + this.field_103173_D.field_107913_d) / 2.0D;
         this.field_103219_u = this.field_103173_D.field_107915_b + (double)this.field_103181_M - (double)this.field_103190_W;
         this.field_103217_v = (this.field_103173_D.field_107916_c + this.field_103173_D.field_107911_f) / 2.0D;
         this.field_103175_F = var13 != var1 || var17 != var5;
         this.field_103176_G = var15 != var3;
         this.field_103174_E = var15 != var3 && var15 < 0.0D;
         this.field_103184_H = this.field_103175_F || this.field_103176_G;
         this.func_103120_a(var3, this.field_103174_E);
         if(var13 != var1) {
            this.field_103215_w = 0.0D;
         }

         if(var15 != var3) {
            this.field_103240_x = 0.0D;
         }

         if(var17 != var5) {
            this.field_103238_y = 0.0D;
         }

         var37 = this.field_103221_t - var7;
         var25 = this.field_103219_u - var9;
         var27 = this.field_103217_v - var11;
         if(this.func_103092_f_() && !var20 && this.field_103207_o == null) {
            int var39 = C_100650_jv.func_108910_c(this.field_103221_t);
            int var42 = C_100650_jv.func_108910_c(this.field_103219_u - 0.20000000298023224D - (double)this.field_103181_M);
            int var41 = C_100650_jv.func_108910_c(this.field_103217_v);
            int var32 = this.field_103229_p.func_109349_a(var39, var42, var41);
            if(var32 == 0 && this.field_103229_p.func_109349_a(var39, var42 - 1, var41) == C_100451_alf.field_106147_bc.field_106162_cm) {
               var32 = this.field_103229_p.func_109349_a(var39, var42 - 1, var41);
            }

            if(var32 != C_100451_alf.field_106185_aI.field_106162_cm) {
               var25 = 0.0D;
            }

            this.field_103192_Q = (float)((double)this.field_103192_Q + (double)C_100650_jv.func_108915_a(var37 * var37 + var27 * var27) * 0.6D);
            this.field_103195_R = (float)((double)this.field_103195_R + (double)C_100650_jv.func_108915_a(var37 * var37 + var25 * var25 + var27 * var27) * 0.6D);
            if(this.field_103195_R > (float)this.field_103205_c && var32 > 0) {
               this.field_103205_c = (int)this.field_103195_R + 1;
               if(this.func_103144_H()) {
                  float var33 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w * 0.20000000298023224D + this.field_103240_x * this.field_103240_x + this.field_103238_y * this.field_103238_y * 0.20000000298023224D) * 0.35F;
                  if(var33 > 1.0F) {
                     var33 = 1.0F;
                  }

                  this.field_103229_p.func_109412_a(this, "liquid.swim", var33, 1.0F + (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.4F);
               }

               this.func_103089_a(var39, var42, var41, var32);
               C_100451_alf.field_106118_p[var32].func_105990_b(this.field_103229_p, var39, var42, var41, this);
            }
         }

         this.func_103063_D();
         boolean var40 = this.func_103073_G();
         if(this.field_103229_p.func_109403_e(this.field_103173_D.func_107910_e(0.0010D, 0.0010D, 0.0010D))) {
            this.func_103059_d(1);
            if(!var40) {
               ++this.field_103201_d;
               if(this.field_103201_d == 0) {
                  this.func_103112_c(8);
               }
            }
         } else if(this.field_103201_d <= 0) {
            this.field_103201_d = -this.field_103230_ac;
         }

         if(var40 && this.field_103201_d > 0) {
            this.field_103229_p.func_109412_a(this, "random.fizz", 0.7F, 1.6F + (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.4F);
            this.field_103201_d = -this.field_103230_ac;
         }

         this.field_103229_p.field_109545_E.func_108900_b();
      }
   }

   protected void func_103063_D() {
      int var1 = C_100650_jv.func_108910_c(this.field_103173_D.field_107917_a + 0.0010D);
      int var2 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b + 0.0010D);
      int var3 = C_100650_jv.func_108910_c(this.field_103173_D.field_107916_c + 0.0010D);
      int var4 = C_100650_jv.func_108910_c(this.field_103173_D.field_107913_d - 0.0010D);
      int var5 = C_100650_jv.func_108910_c(this.field_103173_D.field_107914_e - 0.0010D);
      int var6 = C_100650_jv.func_108910_c(this.field_103173_D.field_107911_f - 0.0010D);
      if(this.field_103229_p.func_109480_d(var1, var2, var3, var4, var5, var6)) {
         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var2; var8 <= var5; ++var8) {
               for(int var9 = var3; var9 <= var6; ++var9) {
                  int var10 = this.field_103229_p.func_109349_a(var7, var8, var9);
                  if(var10 > 0) {
                     C_100451_alf.field_106118_p[var10].func_106011_a(this.field_103229_p, var7, var8, var9, this);
                  }
               }
            }
         }
      }

   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      C_100445_alj var5 = C_100451_alf.field_106118_p[var4].field_106150_cz;
      if(this.field_103229_p.func_109349_a(var1, var2 + 1, var3) == C_100451_alf.field_106181_aV.field_106162_cm) {
         var5 = C_100451_alf.field_106181_aV.field_106150_cz;
         this.field_103229_p.func_109412_a(this, var5.func_107922_e(), var5.func_107921_c() * 0.15F, var5.func_107918_d());
      } else if(!C_100451_alf.field_106118_p[var4].field_106204_cB.func_108986_d()) {
         this.field_103229_p.func_109412_a(this, var5.func_107922_e(), var5.func_107921_c() * 0.15F, var5.func_107918_d());
      }

   }

   protected boolean func_103092_f_() {
      return true;
   }

   protected void func_103120_a(double var1, boolean var3) {
      if(var3) {
         if(this.field_103194_S > 0.0F) {
            this.func_103124_a(this.field_103194_S);
            this.field_103194_S = 0.0F;
         }
      } else if(var1 < 0.0D) {
         this.field_103194_S = (float)((double)this.field_103194_S - var1);
      }

   }

   public C_100412_amr func_103088_E() {
      return null;
   }

   protected void func_103059_d(int var1) {
      if(!this.field_103239_af) {
         this.func_103085_a(C_100698_ks.field_109235_a, var1);
      }

   }

   public final boolean func_103101_F() {
      return this.field_103239_af;
   }

   protected void func_103124_a(float var1) {
      if(this.field_103206_n != null) {
         this.field_103206_n.func_103124_a(var1);
      }

   }

   public boolean func_103073_G() {
      return this.field_103231_ad || this.field_103229_p.func_109515_B(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
   }

   public boolean func_103144_H() {
      return this.field_103231_ad;
   }

   public boolean func_103126_I() {
      return this.field_103229_p.func_109512_a(this.field_103173_D.func_107895_b(0.0D, -0.4000000059604645D, 0.0D).func_107910_e(0.0010D, 0.0010D, 0.0010D), C_100664_afg.field_109019_h, this);
   }

   public boolean func_103132_a(C_100664_afg var1) {
      double var2 = this.field_103219_u + (double)this.func_103102_e();
      int var4 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var5 = C_100650_jv.func_108933_d((float)C_100650_jv.func_108910_c(var2));
      int var6 = C_100650_jv.func_108910_c(this.field_103217_v);
      int var7 = this.field_103229_p.func_109349_a(var4, var5, var6);
      if(var7 != 0 && C_100451_alf.field_106118_p[var7].field_106204_cB == var1) {
         float var8 = C_100142_ajm.func_106269_d(this.field_103229_p.func_109357_g(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   public float func_103102_e() {
      return 0.0F;
   }

   public boolean func_103115_J() {
      return this.field_103229_p.func_109529_a(this.field_103173_D.func_107895_b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), C_100664_afg.field_109020_i);
   }

   public void func_103118_a(float var1, float var2, float var3) {
      float var4 = var1 * var1 + var2 * var2;
      if(var4 >= 1.0E-4F) {
         var4 = C_100650_jv.func_108913_c(var4);
         if(var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = C_100650_jv.func_108924_a(this.field_103236_z * 3.1415927F / 180.0F);
         float var6 = C_100650_jv.func_108928_b(this.field_103236_z * 3.1415927F / 180.0F);
         this.field_103215_w += (double)(var1 * var6 - var2 * var5);
         this.field_103238_y += (double)(var2 * var6 + var1 * var5);
      }
   }

   public int func_103125_b(float var1) {
      int var2 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      if(this.field_103229_p.func_109461_e(var2, 0, var3)) {
         double var4 = (this.field_103173_D.field_107914_e - this.field_103173_D.field_107915_b) * 0.66D;
         int var6 = C_100650_jv.func_108910_c(this.field_103219_u - (double)this.field_103181_M + var4);
         return this.field_103229_p.func_109355_i(var2, var6, var3, 0);
      } else {
         return 0;
      }
   }

   public float func_103057_c(float var1) {
      int var2 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      if(this.field_103229_p.func_109461_e(var2, 0, var3)) {
         double var4 = (this.field_103173_D.field_107914_e - this.field_103173_D.field_107915_b) * 0.66D;
         int var6 = C_100650_jv.func_108910_c(this.field_103219_u - (double)this.field_103181_M + var4);
         return this.field_103229_p.func_109354_o(var2, var6, var3);
      } else {
         return 0.0F;
      }
   }

   public void func_103094_a(C_100873_xe var1) {
      this.field_103229_p = var1;
   }

   public void func_103135_a(double var1, double var3, double var5, float var7, float var8) {
      this.field_103227_q = this.field_103221_t = var1;
      this.field_103225_r = this.field_103219_u = var3;
      this.field_103223_s = this.field_103217_v = var5;
      this.field_103178_B = this.field_103236_z = var7;
      this.field_103179_C = this.field_103177_A = var8;
      this.field_103190_W = 0.0F;
      double var9 = (double)(this.field_103178_B - var7);
      if(var9 < -180.0D) {
         this.field_103178_B += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.field_103178_B -= 360.0F;
      }

      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.func_103158_b(var7, var8);
   }

   public void func_103055_b(double var1, double var3, double var5, float var7, float var8) {
      this.field_103189_T = this.field_103227_q = this.field_103221_t = var1;
      this.field_103188_U = this.field_103225_r = this.field_103219_u = var3 + (double)this.field_103181_M;
      this.field_103191_V = this.field_103223_s = this.field_103217_v = var5;
      this.field_103236_z = var7;
      this.field_103177_A = var8;
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
   }

   public float func_103056_d(C_100730_lb var1) {
      float var2 = (float)(this.field_103221_t - var1.field_103221_t);
      float var3 = (float)(this.field_103219_u - var1.field_103219_u);
      float var4 = (float)(this.field_103217_v - var1.field_103217_v);
      return C_100650_jv.func_108913_c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double func_103146_e(double var1, double var3, double var5) {
      double var7 = this.field_103221_t - var1;
      double var9 = this.field_103219_u - var3;
      double var11 = this.field_103217_v - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double func_103053_f(double var1, double var3, double var5) {
      double var7 = this.field_103221_t - var1;
      double var9 = this.field_103219_u - var3;
      double var11 = this.field_103217_v - var5;
      return (double)C_100650_jv.func_108915_a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double func_103082_e(C_100730_lb var1) {
      double var2 = this.field_103221_t - var1.field_103221_t;
      double var4 = this.field_103219_u - var1.field_103219_u;
      double var6 = this.field_103217_v - var1.field_103217_v;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void func_103096_b_(C_101095_qg var1) {}

   public void func_103093_f(C_100730_lb var1) {
      if(var1.field_103206_n != this && var1.field_103207_o != this) {
         double var2 = var1.field_103221_t - this.field_103221_t;
         double var4 = var1.field_103217_v - this.field_103217_v;
         double var6 = C_100650_jv.func_108925_a(var2, var4);
         if(var6 >= 0.009999999776482582D) {
            var6 = (double)C_100650_jv.func_108915_a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.field_103198_Z);
            var4 *= (double)(1.0F - this.field_103198_Z);
            this.func_103071_g(-var2, 0.0D, -var4);
            var1.func_103071_g(var2, 0.0D, var4);
         }

      }
   }

   public void func_103071_g(double var1, double var3, double var5) {
      this.field_103215_w += var1;
      this.field_103240_x += var3;
      this.field_103238_y += var5;
      this.field_103226_am = true;
   }

   protected void func_103065_K() {
      this.field_103185_I = true;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      this.func_103065_K();
      return false;
   }

   public boolean func_103123_L() {
      return false;
   }

   public boolean func_103160_M() {
      return false;
   }

   public void func_103133_c(C_100730_lb var1, int var2) {}

   public boolean func_103062_a(C_100387_amw var1) {
      double var2 = this.field_103221_t - var1.field_107872_c;
      double var4 = this.field_103219_u - var1.field_107869_d;
      double var6 = this.field_103217_v - var1.field_107870_e;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.func_103167_a(var8);
   }

   public boolean func_103167_a(double var1) {
      double var3 = this.field_103173_D.func_107896_b();
      var3 *= 64.0D * this.field_103209_l;
      return var1 < var3 * var3;
   }

   public String func_103129_O() {
      return null;
   }

   public boolean func_103074_c(C_100353_bh var1) {
      String var2 = this.func_103069_Q();
      if(!this.field_103180_L && var2 != null) {
         var1.func_107533_a("id", var2);
         this.func_103130_d(var1);
         return true;
      } else {
         return false;
      }
   }

   public void func_103130_d(C_100353_bh var1) {
      var1.func_107530_a("Pos", this.func_103153_a(new double[]{this.field_103221_t, this.field_103219_u + (double)this.field_103190_W, this.field_103217_v}));
      var1.func_107530_a("Motion", this.func_103153_a(new double[]{this.field_103215_w, this.field_103240_x, this.field_103238_y}));
      var1.func_107530_a("Rotation", this.func_103066_a(new float[]{this.field_103236_z, this.field_103177_A}));
      var1.func_107529_a("FallDistance", this.field_103194_S);
      var1.func_107532_a("Fire", (short)this.field_103201_d);
      var1.func_107532_a("Air", (short)this.func_103081_al());
      var1.func_107509_a("OnGround", this.field_103174_E);
      var1.func_107520_a("Dimension", this.field_103224_ap);
      this.func_103078_b(var1);
   }

   public void func_103077_e(C_100353_bh var1) {
      C_100339_bp var2 = var1.func_107513_m("Pos");
      C_100339_bp var3 = var1.func_107513_m("Motion");
      C_100339_bp var4 = var1.func_107513_m("Rotation");
      this.field_103215_w = ((C_100343_bk)var3.func_107498_b(0)).field_107505_a;
      this.field_103240_x = ((C_100343_bk)var3.func_107498_b(1)).field_107505_a;
      this.field_103238_y = ((C_100343_bk)var3.func_107498_b(2)).field_107505_a;
      if(Math.abs(this.field_103215_w) > 10.0D) {
         this.field_103215_w = 0.0D;
      }

      if(Math.abs(this.field_103240_x) > 10.0D) {
         this.field_103240_x = 0.0D;
      }

      if(Math.abs(this.field_103238_y) > 10.0D) {
         this.field_103238_y = 0.0D;
      }

      this.field_103227_q = this.field_103189_T = this.field_103221_t = ((C_100343_bk)var2.func_107498_b(0)).field_107505_a;
      this.field_103225_r = this.field_103188_U = this.field_103219_u = ((C_100343_bk)var2.func_107498_b(1)).field_107505_a;
      this.field_103223_s = this.field_103191_V = this.field_103217_v = ((C_100343_bk)var2.func_107498_b(2)).field_107505_a;
      this.field_103178_B = this.field_103236_z = ((C_100347_bm)var4.func_107498_b(0)).field_107506_a;
      this.field_103179_C = this.field_103177_A = ((C_100347_bm)var4.func_107498_b(1)).field_107506_a;
      this.field_103194_S = var1.func_107512_g("FallDistance");
      this.field_103201_d = var1.func_107517_d("Fire");
      this.func_103138_f(var1.func_107517_d("Air"));
      this.field_103174_E = var1.func_107519_n("OnGround");
      this.field_103224_ap = var1.func_107514_e("Dimension");
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.func_103158_b(this.field_103236_z, this.field_103177_A);
      this.func_103110_a(var1);
   }

   protected final String func_103069_Q() {
      return C_100727_lf.func_109313_b(this);
   }

   protected abstract void func_103110_a(C_100353_bh var1);

   protected abstract void func_103078_b(C_100353_bh var1);

   protected C_100339_bp func_103153_a(double ... var1) {
      C_100339_bp var2 = new C_100339_bp();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.func_107500_a(new C_100343_bk((String)null, var6));
      }

      return var2;
   }

   protected C_100339_bp func_103066_a(float ... var1) {
      C_100339_bp var2 = new C_100339_bp();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.func_107500_a(new C_100347_bm((String)null, var6));
      }

      return var2;
   }

   public float func_103109_R() {
      return this.field_103183_O / 2.0F;
   }

   public C_100576_pg func_103111_b(int var1, int var2) {
      return this.func_103075_a(var1, var2, 0.0F);
   }

   public C_100576_pg func_103075_a(int var1, int var2, float var3) {
      return this.func_103140_a(new C_100994_tv(var1, var2, 0), var3);
   }

   public C_100576_pg func_103140_a(C_100994_tv var1, float var2) {
      C_100576_pg var3 = new C_100576_pg(this.field_103229_p, this.field_103221_t, this.field_103219_u + (double)var2, this.field_103217_v, var1);
      var3.field_103278_c = 10;
      this.field_103229_p.func_109513_d(var3);
      return var3;
   }

   public boolean func_103143_S() {
      return !this.field_103180_L;
   }

   public boolean func_103150_T() {
      for(int var1 = 0; var1 < 8; ++var1) {
         float var2 = ((float)((var1 >> 0) % 2) - 0.5F) * this.field_103182_N * 0.8F;
         float var3 = ((float)((var1 >> 1) % 2) - 0.5F) * 0.1F;
         float var4 = ((float)((var1 >> 2) % 2) - 0.5F) * this.field_103182_N * 0.8F;
         int var5 = C_100650_jv.func_108910_c(this.field_103221_t + (double)var2);
         int var6 = C_100650_jv.func_108910_c(this.field_103219_u + (double)this.func_103102_e() + (double)var3);
         int var7 = C_100650_jv.func_108910_c(this.field_103217_v + (double)var4);
         if(this.field_103229_p.func_109360_s(var5, var6, var7)) {
            return true;
         }
      }

      return false;
   }

   public boolean func_103134_c(C_101095_qg var1) {
      return false;
   }

   public C_100412_amr func_103104_g(C_100730_lb var1) {
      return null;
   }

   public void func_103156_U() {
      if(this.field_103207_o.field_103180_L) {
         this.field_103207_o = null;
      } else {
         this.field_103215_w = 0.0D;
         this.field_103240_x = 0.0D;
         this.field_103238_y = 0.0D;
         this.func_103165_j_();
         if(this.field_103207_o != null) {
            this.field_103207_o.func_103098_V();
            this.field_103200_g += (double)(this.field_103207_o.field_103236_z - this.field_103207_o.field_103178_B);

            for(this.field_103199_f += (double)(this.field_103207_o.field_103177_A - this.field_103207_o.field_103179_C); this.field_103200_g >= 180.0D; this.field_103200_g -= 360.0D) {
               ;
            }

            while(this.field_103200_g < -180.0D) {
               this.field_103200_g += 360.0D;
            }

            while(this.field_103199_f >= 180.0D) {
               this.field_103199_f -= 360.0D;
            }

            while(this.field_103199_f < -180.0D) {
               this.field_103199_f += 360.0D;
            }

            double var1 = this.field_103200_g * 0.5D;
            double var3 = this.field_103199_f * 0.5D;
            float var5 = 10.0F;
            if(var1 > (double)var5) {
               var1 = (double)var5;
            }

            if(var1 < (double)(-var5)) {
               var1 = (double)(-var5);
            }

            if(var3 > (double)var5) {
               var3 = (double)var5;
            }

            if(var3 < (double)(-var5)) {
               var3 = (double)(-var5);
            }

            this.field_103200_g -= var1;
            this.field_103199_f -= var3;
            this.field_103236_z = (float)((double)this.field_103236_z + var1);
            this.field_103177_A = (float)((double)this.field_103177_A + var3);
         }
      }
   }

   public void func_103098_V() {
      if(!(this.field_103206_n instanceof C_101095_qg) || !((C_101095_qg)this.field_103206_n).func_103806_bS()) {
         this.field_103206_n.field_103189_T = this.field_103189_T;
         this.field_103206_n.field_103188_U = this.field_103188_U + this.func_103097_X() + this.field_103206_n.func_103083_W();
         this.field_103206_n.field_103191_V = this.field_103191_V;
      }

      this.field_103206_n.func_103163_b(this.field_103221_t, this.field_103219_u + this.func_103097_X() + this.field_103206_n.func_103083_W(), this.field_103217_v);
   }

   public double func_103083_W() {
      return (double)this.field_103181_M;
   }

   public double func_103097_X() {
      return (double)this.field_103183_O * 0.75D;
   }

   public void func_103064_a(C_100730_lb var1) {
      this.field_103199_f = 0.0D;
      this.field_103200_g = 0.0D;
      if(var1 == null) {
         if(this.field_103207_o != null) {
            this.func_103055_b(this.field_103207_o.field_103221_t, this.field_103207_o.field_103173_D.field_107915_b + (double)this.field_103207_o.field_103183_O, this.field_103207_o.field_103217_v, this.field_103236_z, this.field_103177_A);
            this.field_103207_o.field_103206_n = null;
         }

         this.field_103207_o = null;
      } else if(this.field_103207_o == var1) {
         this.func_103068_h(var1);
         this.field_103207_o.field_103206_n = null;
         this.field_103207_o = null;
      } else {
         if(this.field_103207_o != null) {
            this.field_103207_o.field_103206_n = null;
         }

         if(var1.field_103206_n != null) {
            var1.field_103206_n.field_103207_o = null;
         }

         this.field_103207_o = var1;
         var1.field_103206_n = this;
      }
   }

   public void func_103068_h(C_100730_lb var1) {
      double var3 = var1.field_103221_t;
      double var5 = var1.field_103173_D.field_107915_b + (double)var1.field_103183_O;
      double var7 = var1.field_103217_v;

      for(double var9 = -1.5D; var9 < 2.0D; ++var9) {
         for(double var11 = -1.5D; var11 < 2.0D; ++var11) {
            if(var9 != 0.0D || var11 != 0.0D) {
               int var13 = (int)(this.field_103221_t + var9);
               int var14 = (int)(this.field_103217_v + var11);
               C_100412_amr var2 = this.field_103173_D.func_107891_c(var9, 1.0D, var11);
               if(this.field_103229_p.func_109399_a(var2).isEmpty()) {
                  if(this.field_103229_p.func_109348_t(var13, (int)this.field_103219_u, var14)) {
                     this.func_103055_b(this.field_103221_t + var9, this.field_103219_u + 1.0D, this.field_103217_v + var11, this.field_103236_z, this.field_103177_A);
                     return;
                  }

                  if(this.field_103229_p.func_109348_t(var13, (int)this.field_103219_u - 1, var14) || this.field_103229_p.func_109350_f(var13, (int)this.field_103219_u - 1, var14) == C_100664_afg.field_109019_h) {
                     var3 = this.field_103221_t + var9;
                     var5 = this.field_103219_u + 1.0D;
                     var7 = this.field_103217_v + var11;
                  }
               }
            }
         }
      }

      this.func_103055_b(var3, var5, var7, this.field_103236_z, this.field_103177_A);
   }

   public void func_103114_a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.func_103163_b(var1, var3, var5);
      this.func_103158_b(var7, var8);
      List var10 = this.field_103229_p.func_109508_a(this, this.field_103173_D.func_107910_e(0.03125D, 0.0D, 0.03125D));
      if(!var10.isEmpty()) {
         double var11 = 0.0D;
         Iterator var13 = var10.iterator();

         while(var13.hasNext()) {
            C_100412_amr var14 = (C_100412_amr)var13.next();
            if(var14.field_107914_e > var11) {
               var11 = var14.field_107914_e;
            }
         }

         var3 += var11 - this.field_103173_D.field_107915_b;
         this.func_103163_b(var1, var3, var5);
      }

   }

   public float func_103166_Y() {
      return 0.1F;
   }

   public C_100387_amw func_103148_Z() {
      return null;
   }

   public void func_103119_aa() {
      if(this.field_103228_an > 0) {
         this.field_103228_an = this.func_103103_ab();
      } else {
         double var1 = this.field_103227_q - this.field_103221_t;
         double var3 = this.field_103223_s - this.field_103217_v;
         if(!this.field_103229_p.field_109557_J && !this.field_103222_ao) {
            this.field_103210_aq = C_100015_i.func_105276_a(var1, var3);
         }

         this.field_103222_ao = true;
      }
   }

   public int func_103103_ab() {
      return 500;
   }

   public void func_103061_h(double var1, double var3, double var5) {
      this.field_103215_w = var1;
      this.field_103240_x = var3;
      this.field_103238_y = var5;
   }

   public void func_103159_a(byte var1) {}

   public void func_103116_ac() {}

   public void func_103072_ad() {}

   public C_100994_tv[] func_103127_ae() {
      return null;
   }

   public void func_103060_b(int var1, C_100994_tv var2) {}

   public boolean func_103149_af() {
      return this.field_103201_d > 0 || this.func_103136_e(0);
   }

   public boolean func_103108_ag() {
      return this.field_103207_o != null || this.func_103136_e(2);
   }

   public boolean func_103168_ah() {
      return this.func_103136_e(1);
   }

   public void func_103151_a(boolean var1) {
      this.func_103107_a(1, var1);
   }

   public boolean func_103147_ai() {
      return this.func_103136_e(3);
   }

   public void func_103080_b(boolean var1) {
      this.func_103107_a(3, var1);
   }

   public boolean func_103164_aj() {
      return this.func_103136_e(5);
   }

   public void func_103067_c(boolean var1) {
      this.func_103107_a(5, var1);
   }

   public boolean func_103152_ak() {
      return this.func_103136_e(4);
   }

   public void func_103117_d(boolean var1) {
      this.func_103107_a(4, var1);
   }

   protected boolean func_103136_e(int var1) {
      return (this.field_103234_ag.func_108842_a(0) & 1 << var1) != 0;
   }

   protected void func_103107_a(int var1, boolean var2) {
      byte var3 = this.field_103234_ag.func_108842_a(0);
      if(var2) {
         this.field_103234_ag.func_108851_b(0, Byte.valueOf((byte)(var3 | 1 << var1)));
      } else {
         this.field_103234_ag.func_108851_b(0, Byte.valueOf((byte)(var3 & ~(1 << var1))));
      }

   }

   public int func_103081_al() {
      return this.field_103234_ag.func_108854_b(1);
   }

   public void func_103138_f(int var1) {
      this.field_103234_ag.func_108851_b(1, Short.valueOf((short)var1));
   }

   public void func_103155_a(C_100570_pd var1) {
      this.func_103059_d(5);
      ++this.field_103201_d;
      if(this.field_103201_d == 0) {
         this.func_103112_c(8);
      }

   }

   public void func_103079_a(C_100595_ln var1) {}

   protected boolean func_103105_i(double var1, double var3, double var5) {
      int var7 = C_100650_jv.func_108910_c(var1);
      int var8 = C_100650_jv.func_108910_c(var3);
      int var9 = C_100650_jv.func_108910_c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      if(this.field_103229_p.func_109360_s(var7, var8, var9)) {
         boolean var16 = !this.field_103229_p.func_109360_s(var7 - 1, var8, var9);
         boolean var17 = !this.field_103229_p.func_109360_s(var7 + 1, var8, var9);
         boolean var18 = !this.field_103229_p.func_109360_s(var7, var8 - 1, var9);
         boolean var19 = !this.field_103229_p.func_109360_s(var7, var8 + 1, var9);
         boolean var20 = !this.field_103229_p.func_109360_s(var7, var8, var9 - 1);
         boolean var21 = !this.field_103229_p.func_109360_s(var7, var8, var9 + 1);
         byte var22 = -1;
         double var23 = 9999.0D;
         if(var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if(var17 && 1.0D - var10 < var23) {
            var23 = 1.0D - var10;
            var22 = 1;
         }

         if(var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if(var19 && 1.0D - var12 < var23) {
            var23 = 1.0D - var12;
            var22 = 3;
         }

         if(var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if(var21 && 1.0D - var14 < var23) {
            var23 = 1.0D - var14;
            var22 = 5;
         }

         float var25 = this.field_103232_aa.nextFloat() * 0.2F + 0.1F;
         if(var22 == 0) {
            this.field_103215_w = (double)(-var25);
         }

         if(var22 == 1) {
            this.field_103215_w = (double)var25;
         }

         if(var22 == 2) {
            this.field_103240_x = (double)(-var25);
         }

         if(var22 == 3) {
            this.field_103240_x = (double)var25;
         }

         if(var22 == 4) {
            this.field_103238_y = (double)(-var25);
         }

         if(var22 == 5) {
            this.field_103238_y = (double)var25;
         }

         return true;
      } else {
         return false;
      }
   }

   public void func_103157_am() {
      this.field_103186_J = true;
      this.field_103194_S = 0.0F;
   }

   public String func_103139_an() {
      String var1 = C_100727_lf.func_109313_b(this);
      if(var1 == null) {
         var1 = "generic";
      }

      return C_100359_bd.func_107638_a("entity." + var1 + ".name");
   }

   public C_100730_lb[] func_103142_ao() {
      return null;
   }

   public boolean func_103113_i(C_100730_lb var1) {
      return this == var1;
   }

   public float func_103054_ap() {
      return 0.0F;
   }

   public void func_103084_d(float var1) {}

   public boolean func_103099_aq() {
      return true;
   }

   public String toString() {
      return String.format("%s[\'%s\'/%d, l=\'%s\', x=%.2f, y=%.2f, z=%.2f]", new Object[]{this.getClass().getSimpleName(), this.func_103139_an(), Integer.valueOf(this.field_103212_k), this.field_103229_p == null?"~NULL~":this.field_103229_p.func_109429_J().func_107131_k(), Double.valueOf(this.field_103221_t), Double.valueOf(this.field_103219_u), Double.valueOf(this.field_103217_v)});
   }

   public void func_103154_j(C_100730_lb var1) {
      this.func_103055_b(var1.field_103221_t, var1.field_103219_u, var1.field_103217_v, var1.field_103236_z, var1.field_103177_A);
   }

   public void func_103095_a(C_100730_lb var1, boolean var2) {
      C_100353_bh var3 = new C_100353_bh();
      var1.func_103130_d(var3);
      this.func_103077_e(var3);
      this.field_103228_an = var1.field_103228_an;
      this.field_103210_aq = var1.field_103210_aq;
   }

   public void func_103090_b(int var1) {
      if(!this.field_103229_p.field_109557_J && !this.field_103180_L) {
         C_101445_MinecraftServer var2 = C_101445_MinecraftServer.func_104953_D();
         int var3 = this.field_103224_ap;
         C_100765_ie var4 = var2.func_104879_a(var3);
         C_100765_ie var5 = var2.func_104879_a(var1);
         this.field_103224_ap = var1;
         this.field_103229_p.func_109383_e(this);
         this.field_103180_L = false;
         var2.func_104931_ad().func_105704_a(this, var3, var4, var5);
         C_100730_lb var6 = C_100727_lf.func_109316_a(C_100727_lf.func_109313_b(this), var5);
         if(var6 != null) {
            var6.func_103095_a(this, true);
            var5.func_109513_d(var6);
         }

         this.field_103180_L = true;
         var4.func_109609_i();
         var5.func_109609_i();
      }
   }

   public float func_103058_a(C_100857_wz var1, C_100451_alf var2, int var3, int var4, int var5) {
      return var2.func_105981_a(this);
   }

   public int func_103070_as() {
      return 3;
   }

   public int func_103106_at() {
      return this.field_103210_aq;
   }

   public boolean func_103076_au() {
      return false;
   }

}
