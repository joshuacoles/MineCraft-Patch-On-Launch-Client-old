import java.util.Iterator;
import java.util.List;

public class C_100568_oy extends C_100595_ln implements C_100551_ou, C_100549_ov {

   public double field_103663_a;
   public double field_103661_b;
   public double field_103662_c;
   public double[][] field_103659_d = new double[64][3];
   public int field_103660_e = -1;
   public C_100565_ow[] field_103657_f;
   public C_100565_ow field_103658_g;
   public C_100565_ow field_103668_h;
   public C_100565_ow field_103669_i;
   public C_100565_ow field_103667_j;
   public C_100565_ow field_103672_bK;
   public C_100565_ow field_103670_bL;
   public C_100565_ow field_103671_bM;
   public float field_103675_bN = 0.0F;
   public float field_103676_bO = 0.0F;
   public boolean field_103673_bP = false;
   public boolean field_103674_bQ = false;
   private C_100730_lb field_103664_bT;
   public int field_103666_bR = 0;
   public C_100563_ox field_103665_bS = null;


   public C_100568_oy(C_100873_xe var1) {
      super(var1);
      this.field_103657_f = new C_100565_ow[]{this.field_103658_g = new C_100565_ow(this, "head", 6.0F, 6.0F), this.field_103668_h = new C_100565_ow(this, "body", 8.0F, 8.0F), this.field_103669_i = new C_100565_ow(this, "tail", 4.0F, 4.0F), this.field_103667_j = new C_100565_ow(this, "tail", 4.0F, 4.0F), this.field_103672_bK = new C_100565_ow(this, "tail", 4.0F, 4.0F), this.field_103670_bL = new C_100565_ow(this, "wing", 4.0F, 4.0F), this.field_103671_bM = new C_100565_ow(this, "wing", 4.0F, 4.0F)};
      this.func_103298_j(this.func_103378_aS());
      this.field_103448_aF = "/mob/enderdragon/ender.png";
      this.func_103161_a(16.0F, 8.0F);
      this.field_103196_Y = true;
      this.field_103239_af = true;
      this.field_103661_b = 100.0D;
      this.field_103216_al = true;
   }

   public int func_103378_aS() {
      return 200;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Integer(this.func_103378_aS()));
   }

   public double[] func_103652_a(int var1, float var2) {
      if(this.field_103428_aQ <= 0) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.field_103660_e - var1 * 1 & 63;
      int var4 = this.field_103660_e - var1 * 1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.field_103659_d[var3][0];
      double var8 = C_100650_jv.func_108918_g(this.field_103659_d[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.field_103659_d[var3][1];
      var8 = this.field_103659_d[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.field_103659_d[var3][2] + (this.field_103659_d[var4][2] - this.field_103659_d[var3][2]) * (double)var2;
      return var5;
   }

   public void func_103313_c() {
      float var1;
      float var2;
      if(!this.field_103229_p.field_109557_J) {
         this.field_103234_ag.func_108851_b(16, Integer.valueOf(this.field_103428_aQ));
      } else {
         var1 = C_100650_jv.func_108928_b(this.field_103676_bO * 3.1415927F * 2.0F);
         var2 = C_100650_jv.func_108928_b(this.field_103675_bN * 3.1415927F * 2.0F);
         if(var2 <= -0.3F && var1 >= -0.3F) {
            this.field_103229_p.func_109541_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, "mob.enderdragon.wings", 5.0F, 0.8F + this.field_103232_aa.nextFloat() * 0.3F);
         }
      }

      this.field_103675_bN = this.field_103676_bO;
      float var3;
      if(this.field_103428_aQ <= 0) {
         var1 = (this.field_103232_aa.nextFloat() - 0.5F) * 8.0F;
         var2 = (this.field_103232_aa.nextFloat() - 0.5F) * 4.0F;
         var3 = (this.field_103232_aa.nextFloat() - 0.5F) * 8.0F;
         this.field_103229_p.func_109428_a("largeexplode", this.field_103221_t + (double)var1, this.field_103219_u + 2.0D + (double)var2, this.field_103217_v + (double)var3, 0.0D, 0.0D, 0.0D);
      } else {
         this.func_103656_h();
         var1 = 0.2F / (C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y) * 10.0F + 1.0F);
         var1 *= (float)Math.pow(2.0D, this.field_103240_x);
         if(this.field_103674_bQ) {
            this.field_103676_bO += var1 * 0.5F;
         } else {
            this.field_103676_bO += var1;
         }

         this.field_103236_z = C_100650_jv.func_108920_g(this.field_103236_z);
         if(this.field_103660_e < 0) {
            for(int var25 = 0; var25 < this.field_103659_d.length; ++var25) {
               this.field_103659_d[var25][0] = (double)this.field_103236_z;
               this.field_103659_d[var25][1] = this.field_103219_u;
            }
         }

         if(++this.field_103660_e == this.field_103659_d.length) {
            this.field_103660_e = 0;
         }

         this.field_103659_d[this.field_103660_e][0] = (double)this.field_103236_z;
         this.field_103659_d[this.field_103660_e][1] = this.field_103219_u;
         double var4;
         double var6;
         double var8;
         double var26;
         float var33;
         if(this.field_103229_p.field_109557_J) {
            if(this.field_103406_bu > 0) {
               var26 = this.field_103221_t + (this.field_103401_bv - this.field_103221_t) / (double)this.field_103406_bu;
               var4 = this.field_103219_u + (this.field_103400_bw - this.field_103219_u) / (double)this.field_103406_bu;
               var6 = this.field_103217_v + (this.field_103403_bx - this.field_103217_v) / (double)this.field_103406_bu;
               var8 = C_100650_jv.func_108918_g(this.field_103402_by - (double)this.field_103236_z);
               this.field_103236_z = (float)((double)this.field_103236_z + var8 / (double)this.field_103406_bu);
               this.field_103177_A = (float)((double)this.field_103177_A + (this.field_103399_bz - (double)this.field_103177_A) / (double)this.field_103406_bu);
               --this.field_103406_bu;
               this.func_103163_b(var26, var4, var6);
               this.func_103158_b(this.field_103236_z, this.field_103177_A);
            }
         } else {
            var26 = this.field_103663_a - this.field_103221_t;
            var4 = this.field_103661_b - this.field_103219_u;
            var6 = this.field_103662_c - this.field_103217_v;
            var8 = var26 * var26 + var4 * var4 + var6 * var6;
            if(this.field_103664_bT != null) {
               this.field_103663_a = this.field_103664_bT.field_103221_t;
               this.field_103662_c = this.field_103664_bT.field_103217_v;
               double var10 = this.field_103663_a - this.field_103221_t;
               double var12 = this.field_103662_c - this.field_103217_v;
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               double var16 = 0.4000000059604645D + var14 / 80.0D - 1.0D;
               if(var16 > 10.0D) {
                  var16 = 10.0D;
               }

               this.field_103661_b = this.field_103664_bT.field_103173_D.field_107915_b + var16;
            } else {
               this.field_103663_a += this.field_103232_aa.nextGaussian() * 2.0D;
               this.field_103662_c += this.field_103232_aa.nextGaussian() * 2.0D;
            }

            if(this.field_103673_bP || var8 < 100.0D || var8 > 22500.0D || this.field_103175_F || this.field_103176_G) {
               this.func_103653_i();
            }

            var4 /= (double)C_100650_jv.func_108915_a(var26 * var26 + var6 * var6);
            var33 = 0.6F;
            if(var4 < (double)(-var33)) {
               var4 = (double)(-var33);
            }

            if(var4 > (double)var33) {
               var4 = (double)var33;
            }

            this.field_103240_x += var4 * 0.10000000149011612D;
            this.field_103236_z = C_100650_jv.func_108920_g(this.field_103236_z);
            double var11 = 180.0D - Math.atan2(var26, var6) * 180.0D / 3.1415927410125732D;
            double var13 = C_100650_jv.func_108918_g(var11 - (double)this.field_103236_z);
            if(var13 > 50.0D) {
               var13 = 50.0D;
            }

            if(var13 < -50.0D) {
               var13 = -50.0D;
            }

            C_100387_amw var15 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103663_a - this.field_103221_t, this.field_103661_b - this.field_103219_u, this.field_103662_c - this.field_103217_v).func_107865_a();
            C_100387_amw var40 = this.field_103229_p.func_109363_R().func_107878_a((double)C_100650_jv.func_108924_a(this.field_103236_z * 3.1415927F / 180.0F), this.field_103240_x, (double)(-C_100650_jv.func_108928_b(this.field_103236_z * 3.1415927F / 180.0F))).func_107865_a();
            float var17 = (float)(var40.func_107857_b(var15) + 0.5D) / 1.5F;
            if(var17 < 0.0F) {
               var17 = 0.0F;
            }

            this.field_103490_bF *= 0.8F;
            float var18 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y) * 1.0F + 1.0F;
            double var19 = Math.sqrt(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y) * 1.0D + 1.0D;
            if(var19 > 40.0D) {
               var19 = 40.0D;
            }

            this.field_103490_bF = (float)((double)this.field_103490_bF + var13 * (0.699999988079071D / var19 / (double)var18));
            this.field_103236_z += this.field_103490_bF * 0.1F;
            float var21 = (float)(2.0D / (var19 + 1.0D));
            float var22 = 0.06F;
            this.func_103118_a(0.0F, -1.0F, var22 * (var17 * var21 + (1.0F - var21)));
            if(this.field_103674_bQ) {
               this.func_103145_d(this.field_103215_w * 0.800000011920929D, this.field_103240_x * 0.800000011920929D, this.field_103238_y * 0.800000011920929D);
            } else {
               this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }

            C_100387_amw var23 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103215_w, this.field_103240_x, this.field_103238_y).func_107865_a();
            float var24 = (float)(var23.func_107857_b(var40) + 1.0D) / 2.0F;
            var24 = 0.8F + 0.15F * var24;
            this.field_103215_w *= (double)var24;
            this.field_103238_y *= (double)var24;
            this.field_103240_x *= 0.9100000262260437D;
         }

         this.field_103469_aw = this.field_103236_z;
         this.field_103658_g.field_103182_N = this.field_103658_g.field_103183_O = 3.0F;
         this.field_103669_i.field_103182_N = this.field_103669_i.field_103183_O = 2.0F;
         this.field_103667_j.field_103182_N = this.field_103667_j.field_103183_O = 2.0F;
         this.field_103672_bK.field_103182_N = this.field_103672_bK.field_103183_O = 2.0F;
         this.field_103668_h.field_103183_O = 3.0F;
         this.field_103668_h.field_103182_N = 5.0F;
         this.field_103670_bL.field_103183_O = 2.0F;
         this.field_103670_bL.field_103182_N = 4.0F;
         this.field_103671_bM.field_103183_O = 3.0F;
         this.field_103671_bM.field_103182_N = 4.0F;
         var2 = (float)(this.func_103652_a(5, 1.0F)[1] - this.func_103652_a(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
         var3 = C_100650_jv.func_108928_b(var2);
         float var28 = -C_100650_jv.func_108924_a(var2);
         float var5 = this.field_103236_z * 3.1415927F / 180.0F;
         float var27 = C_100650_jv.func_108924_a(var5);
         float var7 = C_100650_jv.func_108928_b(var5);
         this.field_103668_h.func_103165_j_();
         this.field_103668_h.func_103055_b(this.field_103221_t + (double)(var27 * 0.5F), this.field_103219_u, this.field_103217_v - (double)(var7 * 0.5F), 0.0F, 0.0F);
         this.field_103670_bL.func_103165_j_();
         this.field_103670_bL.func_103055_b(this.field_103221_t + (double)(var7 * 4.5F), this.field_103219_u + 2.0D, this.field_103217_v + (double)(var27 * 4.5F), 0.0F, 0.0F);
         this.field_103671_bM.func_103165_j_();
         this.field_103671_bM.func_103055_b(this.field_103221_t - (double)(var7 * 4.5F), this.field_103219_u + 2.0D, this.field_103217_v - (double)(var27 * 4.5F), 0.0F, 0.0F);
         if(!this.field_103229_p.field_109557_J && this.field_103432_aU == 0) {
            this.func_103648_a(this.field_103229_p.func_109449_b(this, this.field_103670_bL.field_103173_D.func_107895_b(4.0D, 2.0D, 4.0D).func_107899_d(0.0D, -2.0D, 0.0D)));
            this.func_103648_a(this.field_103229_p.func_109449_b(this, this.field_103671_bM.field_103173_D.func_107895_b(4.0D, 2.0D, 4.0D).func_107899_d(0.0D, -2.0D, 0.0D)));
            this.func_103650_b(this.field_103229_p.func_109449_b(this, this.field_103658_g.field_103173_D.func_107895_b(1.0D, 1.0D, 1.0D)));
         }

         double[] var29 = this.func_103652_a(5, 1.0F);
         double[] var9 = this.func_103652_a(0, 1.0F);
         var33 = C_100650_jv.func_108924_a(this.field_103236_z * 3.1415927F / 180.0F - this.field_103490_bF * 0.01F);
         float var32 = C_100650_jv.func_108928_b(this.field_103236_z * 3.1415927F / 180.0F - this.field_103490_bF * 0.01F);
         this.field_103658_g.func_103165_j_();
         this.field_103658_g.func_103055_b(this.field_103221_t + (double)(var33 * 5.5F * var3), this.field_103219_u + (var9[1] - var29[1]) * 1.0D + (double)(var28 * 5.5F), this.field_103217_v - (double)(var32 * 5.5F * var3), 0.0F, 0.0F);

         for(int var30 = 0; var30 < 3; ++var30) {
            C_100565_ow var31 = null;
            if(var30 == 0) {
               var31 = this.field_103669_i;
            }

            if(var30 == 1) {
               var31 = this.field_103667_j;
            }

            if(var30 == 2) {
               var31 = this.field_103672_bK;
            }

            double[] var35 = this.func_103652_a(12 + var30 * 2, 1.0F);
            float var34 = this.field_103236_z * 3.1415927F / 180.0F + this.func_103651_b(var35[0] - var29[0]) * 3.1415927F / 180.0F * 1.0F;
            float var38 = C_100650_jv.func_108924_a(var34);
            float var37 = C_100650_jv.func_108928_b(var34);
            float var36 = 1.5F;
            float var39 = (float)(var30 + 1) * 2.0F;
            var31.func_103165_j_();
            var31.func_103055_b(this.field_103221_t - (double)((var27 * var36 + var38 * var39) * var3), this.field_103219_u + (var35[1] - var29[1]) * 1.0D - (double)((var39 + var36) * var28) + 1.5D, this.field_103217_v + (double)((var7 * var36 + var37 * var39) * var3), 0.0F, 0.0F);
         }

         if(!this.field_103229_p.field_109557_J) {
            this.field_103674_bQ = this.func_103649_a(this.field_103658_g.field_103173_D) | this.func_103649_a(this.field_103668_h.field_103173_D);
         }

      }
   }

   private void func_103656_h() {
      if(this.field_103665_bS != null) {
         if(this.field_103665_bS.field_103180_L) {
            if(!this.field_103229_p.field_109557_J) {
               this.func_103646_a(this.field_103658_g, C_100698_ks.field_109241_k, 10);
            }

            this.field_103665_bS = null;
         } else if(this.field_103233_ab % 10 == 0 && this.field_103428_aQ < this.func_103378_aS()) {
            ++this.field_103428_aQ;
         }
      }

      if(this.field_103232_aa.nextInt(10) == 0) {
         float var1 = 32.0F;
         List var2 = this.field_103229_p.func_109518_a(C_100563_ox.class, this.field_103173_D.func_107895_b((double)var1, (double)var1, (double)var1));
         C_100563_ox var3 = null;
         double var4 = Double.MAX_VALUE;
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            C_100563_ox var7 = (C_100563_ox)var6.next();
            double var8 = var7.func_103082_e(this);
            if(var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }

         this.field_103665_bS = var3;
      }

   }

   private void func_103648_a(List var1) {
      double var2 = (this.field_103668_h.field_103173_D.field_107917_a + this.field_103668_h.field_103173_D.field_107913_d) / 2.0D;
      double var4 = (this.field_103668_h.field_103173_D.field_107916_c + this.field_103668_h.field_103173_D.field_107911_f) / 2.0D;
      Iterator var6 = var1.iterator();

      while(var6.hasNext()) {
         C_100730_lb var7 = (C_100730_lb)var6.next();
         if(var7 instanceof C_100595_ln) {
            double var8 = var7.field_103221_t - var2;
            double var10 = var7.field_103217_v - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.func_103071_g(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
         }
      }

   }

   private void func_103650_b(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         C_100730_lb var3 = (C_100730_lb)var2.next();
         if(var3 instanceof C_100595_ln) {
            var3.func_103085_a(C_100698_ks.func_109218_a(this), 10);
         }
      }

   }

   private void func_103653_i() {
      this.field_103673_bP = false;
      if(this.field_103232_aa.nextInt(2) == 0 && !this.field_103229_p.field_109573_h.isEmpty()) {
         this.field_103664_bT = (C_100730_lb)this.field_103229_p.field_109573_h.get(this.field_103232_aa.nextInt(this.field_103229_p.field_109573_h.size()));
      } else {
         boolean var1 = false;

         do {
            this.field_103663_a = 0.0D;
            this.field_103661_b = (double)(70.0F + this.field_103232_aa.nextFloat() * 50.0F);
            this.field_103662_c = 0.0D;
            this.field_103663_a += (double)(this.field_103232_aa.nextFloat() * 120.0F - 60.0F);
            this.field_103662_c += (double)(this.field_103232_aa.nextFloat() * 120.0F - 60.0F);
            double var2 = this.field_103221_t - this.field_103663_a;
            double var4 = this.field_103219_u - this.field_103661_b;
            double var6 = this.field_103217_v - this.field_103662_c;
            var1 = var2 * var2 + var4 * var4 + var6 * var6 > 100.0D;
         } while(!var1);

         this.field_103664_bT = null;
      }

   }

   private float func_103651_b(double var1) {
      return (float)C_100650_jv.func_108918_g(var1);
   }

   private boolean func_103649_a(C_100412_amr var1) {
      int var2 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var3 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var4 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var5 = C_100650_jv.func_108910_c(var1.field_107913_d);
      int var6 = C_100650_jv.func_108910_c(var1.field_107914_e);
      int var7 = C_100650_jv.func_108910_c(var1.field_107911_f);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               int var13 = this.field_103229_p.func_109349_a(var10, var11, var12);
               if(var13 != 0) {
                  if(var13 != C_100451_alf.field_106210_as.field_106162_cm && var13 != C_100451_alf.field_106225_bM.field_106162_cm && var13 != C_100451_alf.field_106077_C.field_106162_cm) {
                     var9 = true;
                     this.field_103229_p.func_109422_e(var10, var11, var12, 0);
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if(var9) {
         double var16 = var1.field_107917_a + (var1.field_107913_d - var1.field_107917_a) * (double)this.field_103232_aa.nextFloat();
         double var17 = var1.field_107915_b + (var1.field_107914_e - var1.field_107915_b) * (double)this.field_103232_aa.nextFloat();
         double var14 = var1.field_107916_c + (var1.field_107911_f - var1.field_107916_c) * (double)this.field_103232_aa.nextFloat();
         this.field_103229_p.func_109428_a("largeexplode", var16, var17, var14, 0.0D, 0.0D, 0.0D);
      }

      return var8;
   }

   public boolean func_103646_a(C_100565_ow var1, C_100698_ks var2, int var3) {
      if(var1 != this.field_103658_g) {
         var3 = var3 / 4 + 1;
      }

      float var4 = this.field_103236_z * 3.1415927F / 180.0F;
      float var5 = C_100650_jv.func_108924_a(var4);
      float var6 = C_100650_jv.func_108928_b(var4);
      this.field_103663_a = this.field_103221_t + (double)(var5 * 5.0F) + (double)((this.field_103232_aa.nextFloat() - 0.5F) * 2.0F);
      this.field_103661_b = this.field_103219_u + (double)(this.field_103232_aa.nextFloat() * 3.0F) + 1.0D;
      this.field_103662_c = this.field_103217_v - (double)(var6 * 5.0F) + (double)((this.field_103232_aa.nextFloat() - 0.5F) * 2.0F);
      this.field_103664_bT = null;
      if(var2.func_109210_g() instanceof C_101095_qg || var2 == C_100698_ks.field_109241_k) {
         this.func_103654_e(var2, var3);
      }

      return true;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      return false;
   }

   protected boolean func_103654_e(C_100698_ks var1, int var2) {
      return super.func_103085_a(var1, var2);
   }

   protected void func_103341_aO() {
      ++this.field_103666_bR;
      if(this.field_103666_bR >= 180 && this.field_103666_bR <= 200) {
         float var1 = (this.field_103232_aa.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.field_103232_aa.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.field_103232_aa.nextFloat() - 0.5F) * 8.0F;
         this.field_103229_p.func_109428_a("hugeexplosion", this.field_103221_t + (double)var1, this.field_103219_u + 2.0D + (double)var2, this.field_103217_v + (double)var3, 0.0D, 0.0D, 0.0D);
      }

      int var4;
      int var5;
      if(!this.field_103229_p.field_109557_J) {
         if(this.field_103666_bR > 150 && this.field_103666_bR % 5 == 0) {
            var4 = 1000;

            while(var4 > 0) {
               var5 = C_100722_lj.func_104589_a(var4);
               var4 -= var5;
               this.field_103229_p.func_109513_d(new C_100722_lj(this.field_103229_p, this.field_103221_t, this.field_103219_u, this.field_103217_v, var5));
            }
         }

         if(this.field_103666_bR == 1) {
            this.field_103229_p.func_109493_e(1018, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
         }
      }

      this.func_103145_d(0.0D, 0.10000000149011612D, 0.0D);
      this.field_103469_aw = this.field_103236_z += 20.0F;
      if(this.field_103666_bR == 200 && !this.field_103229_p.field_109557_J) {
         var4 = 2000;

         while(var4 > 0) {
            var5 = C_100722_lj.func_104589_a(var4);
            var4 -= var5;
            this.field_103229_p.func_109513_d(new C_100722_lj(this.field_103229_p, this.field_103221_t, this.field_103219_u, this.field_103217_v, var5));
         }

         this.func_103655_c(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103217_v));
         this.func_103121_x();
      }

   }

   private void func_103655_c(int var1, int var2) {
      byte var3 = 64;
      C_100447_alc.field_106347_a = true;
      byte var4 = 4;

      for(int var5 = var3 - 1; var5 <= var3 + 32; ++var5) {
         for(int var6 = var1 - var4; var6 <= var1 + var4; ++var6) {
            for(int var7 = var2 - var4; var7 <= var2 + var4; ++var7) {
               double var8 = (double)(var6 - var1);
               double var10 = (double)(var7 - var2);
               double var12 = var8 * var8 + var10 * var10;
               if(var12 <= ((double)var4 - 0.5D) * ((double)var4 - 0.5D)) {
                  if(var5 < var3) {
                     if(var12 <= ((double)(var4 - 1) - 0.5D) * ((double)(var4 - 1) - 0.5D)) {
                        this.field_103229_p.func_109422_e(var6, var5, var7, C_100451_alf.field_106077_C.field_106162_cm);
                     }
                  } else if(var5 > var3) {
                     this.field_103229_p.func_109422_e(var6, var5, var7, 0);
                  } else if(var12 > ((double)(var4 - 1) - 0.5D) * ((double)(var4 - 1) - 0.5D)) {
                     this.field_103229_p.func_109422_e(var6, var5, var7, C_100451_alf.field_106077_C.field_106162_cm);
                  } else {
                     this.field_103229_p.func_109422_e(var6, var5, var7, C_100451_alf.field_106229_bK.field_106162_cm);
                  }
               }
            }
         }
      }

      this.field_103229_p.func_109422_e(var1, var3 + 0, var2, C_100451_alf.field_106077_C.field_106162_cm);
      this.field_103229_p.func_109422_e(var1, var3 + 1, var2, C_100451_alf.field_106077_C.field_106162_cm);
      this.field_103229_p.func_109422_e(var1, var3 + 2, var2, C_100451_alf.field_106077_C.field_106162_cm);
      this.field_103229_p.func_109422_e(var1 - 1, var3 + 2, var2, C_100451_alf.field_106208_at.field_106162_cm);
      this.field_103229_p.func_109422_e(var1 + 1, var3 + 2, var2, C_100451_alf.field_106208_at.field_106162_cm);
      this.field_103229_p.func_109422_e(var1, var3 + 2, var2 - 1, C_100451_alf.field_106208_at.field_106162_cm);
      this.field_103229_p.func_109422_e(var1, var3 + 2, var2 + 1, C_100451_alf.field_106208_at.field_106162_cm);
      this.field_103229_p.func_109422_e(var1, var3 + 3, var2, C_100451_alf.field_106077_C.field_106162_cm);
      this.field_103229_p.func_109422_e(var1, var3 + 4, var2, C_100451_alf.field_106235_bN.field_106162_cm);
      C_100447_alc.field_106347_a = false;
   }

   protected void func_103349_bh() {}

   public C_100730_lb[] func_103142_ao() {
      return this.field_103657_f;
   }

   public boolean func_103123_L() {
      return false;
   }

   public int func_103645_b() {
      return this.field_103234_ag.func_108837_c(16);
   }

   public C_100873_xe func_103647_d() {
      return this.field_103229_p;
   }

   protected String func_103354_aW() {
      return "mob.enderdragon.growl";
   }

   protected String func_103387_aX() {
      return "mob.enderdragon.hit";
   }

   protected float func_103384_aV() {
      return 5.0F;
   }
}
