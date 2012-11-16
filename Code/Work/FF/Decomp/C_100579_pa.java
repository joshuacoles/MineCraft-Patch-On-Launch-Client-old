import java.util.List;

public class C_100579_pa extends C_101110_ps implements C_100551_ou, C_101104_pu {

   private float[] field_103710_d = new float[2];
   private float[] field_103712_e = new float[2];
   private float[] field_103708_f = new float[2];
   private float[] field_103709_g = new float[2];
   private int[] field_103714_h = new int[2];
   private int[] field_103715_i = new int[2];
   private int field_103713_j;
   private static final C_100720_li field_103711_bK = new C_100581_pb();


   public C_100579_pa(C_100873_xe var1) {
      super(var1);
      this.func_103298_j(this.func_103378_aS());
      this.field_103448_aF = "/mob/wither.png";
      this.func_103161_a(0.9F, 4.0F);
      this.field_103239_af = true;
      this.field_103489_bI = 0.6F;
      this.func_103383_ay().func_108297_e(true);
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(2, new C_100641_nh(this, this.field_103489_bI, 40, 20.0F));
      this.field_103408_bn.func_108888_a(5, new C_100640_ng(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(6, new C_100624_mr(this, C_101095_qg.class, 8.0F));
      this.field_103408_bn.func_108888_a(7, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100501_nq(this, false));
      this.field_103409_bo.func_108888_a(2, new C_100499_nr(this, C_100595_ln.class, 30.0F, 0, false, false, field_103711_bK));
      this.field_103421_bc = 50;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Integer(100));
      this.field_103234_ag.func_108841_a(17, new Integer(0));
      this.field_103234_ag.func_108841_a(18, new Integer(0));
      this.field_103234_ag.func_108841_a(19, new Integer(0));
      this.field_103234_ag.func_108841_a(20, new Integer(0));
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("Invul", this.func_103703_n());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103707_s(var1.func_107514_e("Invul"));
      this.field_103234_ag.func_108851_b(16, Integer.valueOf(this.field_103428_aQ));
   }

   public float func_103109_R() {
      return this.field_103183_O / 8.0F;
   }

   protected String func_103354_aW() {
      return "mob.wither.idle";
   }

   protected String func_103387_aX() {
      return "mob.wither.hurt";
   }

   protected String func_103307_aY() {
      return "mob.wither.death";
   }

   public String func_103129_O() {
      int var1 = this.func_103703_n();
      return var1 > 0 && (var1 > 80 || var1 / 5 % 2 != 1)?"/mob/wither_invul.png":"/mob/wither.png";
   }

   public void func_103313_c() {
      if(!this.field_103229_p.field_109557_J) {
         this.field_103234_ag.func_108851_b(16, Integer.valueOf(this.field_103428_aQ));
      }

      this.field_103240_x *= 0.6000000238418579D;
      double var4;
      double var6;
      double var8;
      if(!this.field_103229_p.field_109557_J && this.func_103694_t(0) > 0) {
         C_100730_lb var1 = this.field_103229_p.func_109451_a(this.func_103694_t(0));
         if(var1 != null) {
            if(this.field_103219_u < var1.field_103219_u || !this.func_103696_o() && this.field_103219_u < var1.field_103219_u + 5.0D) {
               if(this.field_103240_x < 0.0D) {
                  this.field_103240_x = 0.0D;
               }

               this.field_103240_x += (0.5D - this.field_103240_x) * 0.6000000238418579D;
            }

            double var2 = var1.field_103221_t - this.field_103221_t;
            var4 = var1.field_103217_v - this.field_103217_v;
            var6 = var2 * var2 + var4 * var4;
            if(var6 > 9.0D) {
               var8 = (double)C_100650_jv.func_108915_a(var6);
               this.field_103215_w += (var2 / var8 * 0.5D - this.field_103215_w) * 0.6000000238418579D;
               this.field_103238_y += (var4 / var8 * 0.5D - this.field_103238_y) * 0.6000000238418579D;
            }
         }
      }

      if(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y > 0.05000000074505806D) {
         this.field_103236_z = (float)Math.atan2(this.field_103238_y, this.field_103215_w) * 57.295776F - 90.0F;
      }

      super.func_103313_c();

      int var20;
      for(var20 = 0; var20 < 2; ++var20) {
         this.field_103709_g[var20] = this.field_103712_e[var20];
         this.field_103708_f[var20] = this.field_103710_d[var20];
      }

      int var21;
      for(var20 = 0; var20 < 2; ++var20) {
         var21 = this.func_103694_t(var20 + 1);
         C_100730_lb var3 = null;
         if(var21 > 0) {
            var3 = this.field_103229_p.func_109451_a(var21);
         }

         if(var3 != null) {
            var4 = this.func_103705_u(var20 + 1);
            var6 = this.func_103699_v(var20 + 1);
            var8 = this.func_103704_w(var20 + 1);
            double var10 = var3.field_103221_t - var4;
            double var12 = var3.field_103219_u + (double)var3.func_103102_e() - var6;
            double var14 = var3.field_103217_v - var8;
            double var16 = (double)C_100650_jv.func_108915_a(var10 * var10 + var14 * var14);
            float var18 = (float)(Math.atan2(var14, var10) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var19 = (float)(-(Math.atan2(var12, var16) * 180.0D / 3.1415927410125732D));
            this.field_103710_d[var20] = this.func_103695_b(this.field_103710_d[var20], var19, 40.0F);
            this.field_103712_e[var20] = this.func_103695_b(this.field_103712_e[var20], var18, 10.0F);
         } else {
            this.field_103712_e[var20] = this.func_103695_b(this.field_103712_e[var20], this.field_103469_aw, 10.0F);
         }
      }

      boolean var22 = this.func_103696_o();

      for(var21 = 0; var21 < 3; ++var21) {
         double var23 = this.func_103705_u(var21);
         double var5 = this.func_103699_v(var21);
         double var7 = this.func_103704_w(var21);
         this.field_103229_p.func_109428_a("smoke", var23 + this.field_103232_aa.nextGaussian() * 0.30000001192092896D, var5 + this.field_103232_aa.nextGaussian() * 0.30000001192092896D, var7 + this.field_103232_aa.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
         if(var22 && this.field_103229_p.field_109577_u.nextInt(4) == 0) {
            this.field_103229_p.func_109428_a("mobSpell", var23 + this.field_103232_aa.nextGaussian() * 0.30000001192092896D, var5 + this.field_103232_aa.nextGaussian() * 0.30000001192092896D, var7 + this.field_103232_aa.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
         }
      }

      if(this.func_103703_n() > 0) {
         for(var21 = 0; var21 < 3; ++var21) {
            this.field_103229_p.func_109428_a("mobSpell", this.field_103221_t + this.field_103232_aa.nextGaussian() * 1.0D, this.field_103219_u + (double)(this.field_103232_aa.nextFloat() * 3.3F), this.field_103217_v + this.field_103232_aa.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
         }
      }

   }

   protected void func_103295_bi() {
      int var1;
      if(this.func_103703_n() > 0) {
         var1 = this.func_103703_n() - 1;
         if(var1 <= 0) {
            this.field_103229_p.func_109405_a(this, this.field_103221_t, this.field_103219_u + (double)this.func_103102_e(), this.field_103217_v, 7.0F, false, this.field_103229_p.func_109389_K().func_110281_b("mobGriefing"));
            this.field_103229_p.func_109493_e(1013, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
         }

         this.func_103707_s(var1);
         if(this.field_103233_ab % 10 == 0) {
            this.func_103392_i(10);
         }

      } else {
         super.func_103295_bi();

         int var13;
         for(var1 = 1; var1 < 3; ++var1) {
            if(this.field_103233_ab >= this.field_103714_h[var1 - 1]) {
               this.field_103714_h[var1 - 1] = this.field_103233_ab + 10 + this.field_103232_aa.nextInt(10);
               if(this.field_103229_p.field_109578_t >= 2) {
                  int var10001 = var1 - 1;
                  int var10003 = this.field_103715_i[var1 - 1];
                  this.field_103715_i[var10001] = this.field_103715_i[var1 - 1] + 1;
                  if(var10003 > 15) {
                     float var2 = 10.0F;
                     float var3 = 5.0F;
                     double var4 = C_100650_jv.func_108931_a(this.field_103232_aa, this.field_103221_t - (double)var2, this.field_103221_t + (double)var2);
                     double var6 = C_100650_jv.func_108931_a(this.field_103232_aa, this.field_103219_u - (double)var3, this.field_103219_u + (double)var3);
                     double var8 = C_100650_jv.func_108931_a(this.field_103232_aa, this.field_103217_v - (double)var2, this.field_103217_v + (double)var2);
                     this.func_103700_a(var1 + 1, var4, var6, var8, true);
                     this.field_103715_i[var1 - 1] = 0;
                  }
               }

               var13 = this.func_103694_t(var1);
               if(var13 > 0) {
                  C_100730_lb var15 = this.field_103229_p.func_109451_a(var13);
                  if(var15 != null && var15.func_103143_S() && this.func_103082_e(var15) <= 900.0D && this.func_103308_m(var15)) {
                     this.func_103706_a(var1 + 1, (C_100595_ln)var15);
                     this.field_103714_h[var1 - 1] = this.field_103233_ab + 40 + this.field_103232_aa.nextInt(20);
                     this.field_103715_i[var1 - 1] = 0;
                  } else {
                     this.func_103702_c(var1, 0);
                  }
               } else {
                  List var14 = this.field_103229_p.func_109456_a(C_100595_ln.class, this.field_103173_D.func_107895_b(20.0D, 8.0D, 20.0D), field_103711_bK);

                  for(int var17 = 0; var17 < 10 && !var14.isEmpty(); ++var17) {
                     C_100595_ln var5 = (C_100595_ln)var14.get(this.field_103232_aa.nextInt(var14.size()));
                     if(var5 != this && var5.func_103143_S() && this.func_103308_m(var5)) {
                        if(var5 instanceof C_101095_qg) {
                           if(!((C_101095_qg)var5).field_103869_cf.field_111601_a) {
                              this.func_103702_c(var1, var5.field_103212_k);
                           }
                        } else {
                           this.func_103702_c(var1, var5.field_103212_k);
                        }
                        break;
                     }

                     var14.remove(var5);
                  }
               }
            }
         }

         if(this.func_103335_aF() != null) {
            this.func_103702_c(0, this.func_103335_aF().field_103212_k);
         } else {
            this.func_103702_c(0, 0);
         }

         if(this.field_103713_j > 0) {
            --this.field_103713_j;
            if(this.field_103713_j == 0 && this.field_103229_p.func_109389_K().func_110281_b("mobGriefing")) {
               var1 = C_100650_jv.func_108910_c(this.field_103219_u);
               var13 = C_100650_jv.func_108910_c(this.field_103221_t);
               int var16 = C_100650_jv.func_108910_c(this.field_103217_v);
               boolean var19 = false;

               for(int var18 = -1; var18 <= 1; ++var18) {
                  for(int var20 = -1; var20 <= 1; ++var20) {
                     for(int var7 = 0; var7 <= 3; ++var7) {
                        int var21 = var13 + var18;
                        int var9 = var1 + var7;
                        int var10 = var16 + var20;
                        int var11 = this.field_103229_p.func_109349_a(var21, var9, var10);
                        if(var11 > 0 && var11 != C_100451_alf.field_106077_C.field_106162_cm) {
                           int var12 = this.field_103229_p.func_109357_g(var21, var9, var10);
                           this.field_103229_p.func_109448_f(2001, var21, var9, var10, var11 + (var12 << 12));
                           C_100451_alf.field_106118_p[var11].func_106035_c(this.field_103229_p, var21, var9, var10, var12, 0);
                           this.field_103229_p.func_109422_e(var21, var9, var10, 0);
                           var19 = true;
                        }
                     }
                  }
               }

               if(var19) {
                  this.field_103229_p.func_109492_a((C_101095_qg)null, 1012, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
               }
            }
         }

         if(this.field_103233_ab % 20 == 0) {
            this.func_103392_i(1);
         }

      }
   }

   public void func_103697_m() {
      this.func_103707_s(220);
      this.func_103298_j(this.func_103378_aS() / 3);
   }

   public void func_103157_am() {}

   public int func_103350_aU() {
      return 4;
   }

   private double func_103705_u(int var1) {
      if(var1 <= 0) {
         return this.field_103221_t;
      } else {
         float var2 = (this.field_103469_aw + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = C_100650_jv.func_108928_b(var2);
         return this.field_103221_t + (double)var3 * 1.3D;
      }
   }

   private double func_103699_v(int var1) {
      return var1 <= 0?this.field_103219_u + 3.0D:this.field_103219_u + 2.2D;
   }

   private double func_103704_w(int var1) {
      if(var1 <= 0) {
         return this.field_103217_v;
      } else {
         float var2 = (this.field_103469_aw + (float)(180 * (var1 - 1))) / 180.0F * 3.1415927F;
         float var3 = C_100650_jv.func_108924_a(var2);
         return this.field_103217_v + (double)var3 * 1.3D;
      }
   }

   private float func_103695_b(float var1, float var2, float var3) {
      float var4 = C_100650_jv.func_108920_g(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   private void func_103706_a(int var1, C_100595_ln var2) {
      this.func_103700_a(var1, var2.field_103221_t, var2.field_103219_u + (double)var2.func_103102_e() * 0.5D, var2.field_103217_v, var1 == 0 && this.field_103232_aa.nextFloat() < 0.0010F);
   }

   private void func_103700_a(int var1, double var2, double var4, double var6, boolean var8) {
      this.field_103229_p.func_109492_a((C_101095_qg)null, 1014, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
      double var9 = this.func_103705_u(var1);
      double var11 = this.func_103699_v(var1);
      double var13 = this.func_103704_w(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      C_101079_qv var21 = new C_101079_qv(this.field_103229_p, this, var15, var17, var19);
      if(var8) {
         var21.func_104742_e(true);
      }

      var21.field_103219_u = var11;
      var21.field_103221_t = var9;
      var21.field_103217_v = var13;
      this.field_103229_p.func_109513_d(var21);
   }

   public void func_103677_d(C_100595_ln var1) {
      this.func_103706_a(0, var1);
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(var1 == C_100698_ks.field_109232_e) {
         return false;
      } else if(this.func_103703_n() > 0) {
         return false;
      } else {
         C_100730_lb var3;
         if(this.func_103696_o()) {
            var3 = var1.func_109207_f();
            if(var3 instanceof C_101089_qi) {
               return false;
            }
         }

         var3 = var1.func_109210_g();
         if(var3 != null && !(var3 instanceof C_101095_qg) && var3 instanceof C_100595_ln && ((C_100595_ln)var3).func_103366_bz() == this.func_103366_bz()) {
            return false;
         } else {
            if(this.field_103713_j <= 0) {
               this.field_103713_j = 20;
            }

            for(int var4 = 0; var4 < this.field_103715_i.length; ++var4) {
               this.field_103715_i[var4] += 3;
            }

            return super.func_103085_a(var1, var2);
         }
      }
   }

   protected void func_103323_a(boolean var1, int var2) {
      this.func_103111_b(C_100992_tt.field_110929_bS.field_110891_cf, 1);
   }

   protected void func_103349_bh() {
      this.field_103487_bC = 0;
   }

   public int func_103125_b(float var1) {
      return 15728880;
   }

   public boolean func_103123_L() {
      return !this.field_103180_L;
   }

   public int func_103645_b() {
      return this.field_103234_ag.func_108837_c(16);
   }

   protected void func_103124_a(float var1) {}

   public void func_103389_d(C_100692_kx var1) {}

   protected boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 300;
   }

   public float func_103698_a(int var1) {
      return this.field_103712_e[var1];
   }

   public float func_103701_r(int var1) {
      return this.field_103710_d[var1];
   }

   public int func_103703_n() {
      return this.field_103234_ag.func_108837_c(20);
   }

   public void func_103707_s(int var1) {
      this.field_103234_ag.func_108851_b(20, Integer.valueOf(var1));
   }

   public int func_103694_t(int var1) {
      return this.field_103234_ag.func_108837_c(17 + var1);
   }

   public void func_103702_c(int var1, int var2) {
      this.field_103234_ag.func_108851_b(17 + var1, Integer.valueOf(var2));
   }

   public boolean func_103696_o() {
      return this.func_103645_b() <= this.func_103378_aS() / 2;
   }

   public C_100601_lp func_103366_bz() {
      return C_100601_lp.field_108818_b;
   }

}
