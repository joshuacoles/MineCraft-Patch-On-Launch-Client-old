import java.util.Iterator;
import java.util.List;

public abstract class C_100544_oh extends C_100694_ky implements C_100696_kz {

   private int field_103527_d;
   private int field_103528_e = 0;


   public C_100544_oh(C_100873_xe var1) {
      super(var1);
   }

   protected void func_103314_bj() {
      if(this.func_103520_b() != 0) {
         this.field_103527_d = 0;
      }

      super.func_103314_bj();
   }

   public void func_103313_c() {
      super.func_103313_c();
      if(this.func_103520_b() != 0) {
         this.field_103527_d = 0;
      }

      if(this.field_103527_d > 0) {
         --this.field_103527_d;
         String var1 = "heart";
         if(this.field_103527_d % 10 == 0) {
            double var2 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var4 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var6 = this.field_103232_aa.nextGaussian() * 0.02D;
            this.field_103229_p.func_109428_a(var1, this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + 0.5D + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, var2, var4, var6);
         }
      } else {
         this.field_103528_e = 0;
      }

   }

   protected void func_103500_a(C_100730_lb var1, float var2) {
      if(var1 instanceof C_101095_qg) {
         if(var2 < 3.0F) {
            double var3 = var1.field_103221_t - this.field_103221_t;
            double var5 = var1.field_103217_v - this.field_103217_v;
            this.field_103236_z = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.field_103502_b = true;
         }

         C_101095_qg var7 = (C_101095_qg)var1;
         if(var7.func_103780_bP() == null || !this.func_103524_c(var7.func_103780_bP())) {
            this.field_103504_a_ = null;
         }
      } else if(var1 instanceof C_100544_oh) {
         C_100544_oh var8 = (C_100544_oh)var1;
         if(this.func_103520_b() > 0 && var8.func_103520_b() < 0) {
            if((double)var2 < 2.5D) {
               this.field_103502_b = true;
            }
         } else if(this.field_103527_d > 0 && var8.field_103527_d > 0) {
            if(var8.field_103504_a_ == null) {
               var8.field_103504_a_ = this;
            }

            if(var8.field_103504_a_ == this && (double)var2 < 3.5D) {
               ++var8.field_103527_d;
               ++this.field_103527_d;
               ++this.field_103528_e;
               if(this.field_103528_e % 4 == 0) {
                  this.field_103229_p.func_109428_a("heart", this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + 0.5D + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, 0.0D, 0.0D, 0.0D);
               }

               if(this.field_103528_e == 60) {
                  this.func_103523_c((C_100544_oh)var1);
               }
            } else {
               this.field_103528_e = 0;
            }
         } else {
            this.field_103528_e = 0;
            this.field_103504_a_ = null;
         }
      }

   }

   private void func_103523_c(C_100544_oh var1) {
      C_100544_oh var2 = this.func_103521_a(var1);
      if(var2 != null) {
         this.func_103519_a(6000);
         var1.func_103519_a(6000);
         this.field_103527_d = 0;
         this.field_103528_e = 0;
         this.field_103504_a_ = null;
         var1.field_103504_a_ = null;
         var1.field_103528_e = 0;
         var1.field_103527_d = 0;
         var2.func_103519_a(-24000);
         var2.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var6 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var8 = this.field_103232_aa.nextGaussian() * 0.02D;
            this.field_103229_p.func_109428_a("heart", this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + 0.5D + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, var4, var6, var8);
         }

         this.field_103229_p.func_109513_d(var2);
      }

   }

   public abstract C_100544_oh func_103521_a(C_100544_oh var1);

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      this.field_103503_c = 60;
      this.field_103504_a_ = null;
      this.field_103527_d = 0;
      return super.func_103085_a(var1, var2);
   }

   public float func_103499_a(int var1, int var2, int var3) {
      return this.field_103229_p.func_109349_a(var1, var2 - 1, var3) == C_100451_alf.field_106121_x.field_106162_cm?10.0F:this.field_103229_p.func_109354_o(var1, var2, var3) - 0.5F;
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("InLove", this.field_103527_d);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.field_103527_d = var1.func_107514_e("InLove");
   }

   protected C_100730_lb func_103492_j() {
      if(this.field_103503_c > 0) {
         return null;
      } else {
         float var1 = 8.0F;
         List var2;
         Iterator var3;
         C_100544_oh var4;
         if(this.field_103527_d > 0) {
            var2 = this.field_103229_p.func_109518_a(this.getClass(), this.field_103173_D.func_107895_b((double)var1, (double)var1, (double)var1));
            var3 = var2.iterator();

            while(var3.hasNext()) {
               var4 = (C_100544_oh)var3.next();
               if(var4 != this && var4.field_103527_d > 0) {
                  return var4;
               }
            }
         } else if(this.func_103520_b() == 0) {
            var2 = this.field_103229_p.func_109518_a(C_101095_qg.class, this.field_103173_D.func_107895_b((double)var1, (double)var1, (double)var1));
            var3 = var2.iterator();

            while(var3.hasNext()) {
               C_101095_qg var5 = (C_101095_qg)var3.next();
               if(var5.func_103780_bP() != null && this.func_103524_c(var5.func_103780_bP())) {
                  return var5;
               }
            }
         } else if(this.func_103520_b() > 0) {
            var2 = this.field_103229_p.func_109518_a(this.getClass(), this.field_103173_D.func_107895_b((double)var1, (double)var1, (double)var1));
            var3 = var2.iterator();

            while(var3.hasNext()) {
               var4 = (C_100544_oh)var3.next();
               if(var4 != this && var4.func_103520_b() < 0) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public boolean func_103380_bp() {
      int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var2 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      return this.field_103229_p.func_109349_a(var1, var2 - 1, var3) == C_100451_alf.field_106121_x.field_106162_cm && this.field_103229_p.func_109445_k(var1, var2, var3) > 8 && super.func_103380_bp();
   }

   public int func_103372_aM() {
      return 120;
   }

   protected boolean func_103302_bg() {
      return false;
   }

   protected int func_103299_a(C_101095_qg var1) {
      return 1 + this.field_103229_p.field_109577_u.nextInt(3);
   }

   public boolean func_103524_c(C_100994_tv var1) {
      return var1.field_111397_c == C_100992_tt.field_110821_T.field_110891_cf;
   }

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      if(var2 != null && this.func_103524_c(var2) && this.func_103520_b() == 0) {
         if(!var1.field_103869_cf.field_111597_d) {
            --var2.field_111398_a;
            if(var2.field_111398_a <= 0) {
               var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
            }
         }

         this.field_103527_d = 600;
         this.field_103504_a_ = null;

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var6 = this.field_103232_aa.nextGaussian() * 0.02D;
            double var8 = this.field_103232_aa.nextGaussian() * 0.02D;
            this.field_103229_p.func_109428_a("heart", this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + 0.5D + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, var4, var6, var8);
         }

         return true;
      } else {
         return super.func_103134_c(var1);
      }
   }

   public boolean func_103525_r() {
      return this.field_103527_d > 0;
   }

   public void func_103526_s() {
      this.field_103527_d = 0;
   }

   public boolean func_103522_b(C_100544_oh var1) {
      return var1 == this?false:(var1.getClass() != this.getClass()?false:this.func_103525_r() && var1.func_103525_r());
   }
}
