import java.util.Iterator;
import java.util.List;

public abstract class C_101091_qk extends C_100730_lb {

   private int field_104733_e = -1;
   private int field_104730_f = -1;
   private int field_104731_g = -1;
   private int field_104739_h = 0;
   private boolean field_104740_i = false;
   public C_100595_ln field_104736_a;
   private int field_104738_j;
   private int field_104737_as = 0;
   public double field_104734_b;
   public double field_104735_c;
   public double field_104732_d;


   public C_101091_qk(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(1.0F, 1.0F);
   }

   protected void func_103141_a() {}

   public boolean func_103167_a(double var1) {
      double var3 = this.field_103173_D.func_107896_b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public C_101091_qk(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.func_103161_a(1.0F, 1.0F);
      this.func_103055_b(var2, var4, var6, this.field_103236_z, this.field_103177_A);
      this.func_103163_b(var2, var4, var6);
      double var14 = (double)C_100650_jv.func_108915_a(var8 * var8 + var10 * var10 + var12 * var12);
      this.field_104734_b = var8 / var14 * 0.1D;
      this.field_104735_c = var10 / var14 * 0.1D;
      this.field_104732_d = var12 / var14 * 0.1D;
   }

   public C_101091_qk(C_100873_xe var1, C_100595_ln var2, double var3, double var5, double var7) {
      super(var1);
      this.field_104736_a = var2;
      this.func_103161_a(1.0F, 1.0F);
      this.func_103055_b(var2.field_103221_t, var2.field_103219_u, var2.field_103217_v, var2.field_103236_z, var2.field_103177_A);
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.field_103181_M = 0.0F;
      this.field_103215_w = this.field_103240_x = this.field_103238_y = 0.0D;
      var3 += this.field_103232_aa.nextGaussian() * 0.4D;
      var5 += this.field_103232_aa.nextGaussian() * 0.4D;
      var7 += this.field_103232_aa.nextGaussian() * 0.4D;
      double var9 = (double)C_100650_jv.func_108915_a(var3 * var3 + var5 * var5 + var7 * var7);
      this.field_104734_b = var3 / var9 * 0.1D;
      this.field_104735_c = var5 / var9 * 0.1D;
      this.field_104732_d = var7 / var9 * 0.1D;
   }

   public void func_103165_j_() {
      if(!this.field_103229_p.field_109557_J && (this.field_104736_a != null && this.field_104736_a.field_103180_L || !this.field_103229_p.func_109461_e((int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v))) {
         this.func_103121_x();
      } else {
         super.func_103165_j_();
         this.func_103112_c(1);
         if(this.field_104740_i) {
            int var1 = this.field_103229_p.func_109349_a(this.field_104733_e, this.field_104730_f, this.field_104731_g);
            if(var1 == this.field_104739_h) {
               ++this.field_104738_j;
               if(this.field_104738_j == 600) {
                  this.func_103121_x();
               }

               return;
            }

            this.field_104740_i = false;
            this.field_103215_w *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_103240_x *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_103238_y *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
            this.field_104738_j = 0;
            this.field_104737_as = 0;
         } else {
            ++this.field_104737_as;
         }

         C_100387_amw var15 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         C_100387_amw var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
         C_100383_amu var3 = this.field_103229_p.func_109522_a(var15, var2);
         var15 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
         if(var3 != null) {
            var2 = this.field_103229_p.func_109363_R().func_107878_a(var3.field_107834_f.field_107872_c, var3.field_107834_f.field_107869_d, var3.field_107834_f.field_107870_e);
         }

         C_100730_lb var4 = null;
         List var5 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107903_a(this.field_103215_w, this.field_103240_x, this.field_103238_y).func_107895_b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;
         Iterator var8 = var5.iterator();

         while(var8.hasNext()) {
            C_100730_lb var9 = (C_100730_lb)var8.next();
            if(var9.func_103123_L() && (!var9.func_103113_i(this.field_104736_a) || this.field_104737_as >= 25)) {
               float var10 = 0.3F;
               C_100412_amr var11 = var9.field_103173_D.func_107895_b((double)var10, (double)var10, (double)var10);
               C_100383_amu var12 = var11.func_107902_a(var15, var2);
               if(var12 != null) {
                  double var13 = var15.func_107853_d(var12.field_107834_f);
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
            this.func_104728_a(var3);
         }

         this.field_103221_t += this.field_103215_w;
         this.field_103219_u += this.field_103240_x;
         this.field_103217_v += this.field_103238_y;
         float var16 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
         this.field_103236_z = (float)(Math.atan2(this.field_103238_y, this.field_103215_w) * 180.0D / 3.1415927410125732D) + 90.0F;

         for(this.field_103177_A = (float)(Math.atan2((double)var16, this.field_103240_x) * 180.0D / 3.1415927410125732D) - 90.0F; this.field_103177_A - this.field_103179_C < -180.0F; this.field_103179_C -= 360.0F) {
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
         float var17 = this.func_104729_c();
         if(this.func_103144_H()) {
            for(int var19 = 0; var19 < 4; ++var19) {
               float var18 = 0.25F;
               this.field_103229_p.func_109428_a("bubble", this.field_103221_t - this.field_103215_w * (double)var18, this.field_103219_u - this.field_103240_x * (double)var18, this.field_103217_v - this.field_103238_y * (double)var18, this.field_103215_w, this.field_103240_x, this.field_103238_y);
            }

            var17 = 0.8F;
         }

         this.field_103215_w += this.field_104734_b;
         this.field_103240_x += this.field_104735_c;
         this.field_103238_y += this.field_104732_d;
         this.field_103215_w *= (double)var17;
         this.field_103240_x *= (double)var17;
         this.field_103238_y *= (double)var17;
         this.field_103229_p.func_109428_a("smoke", this.field_103221_t, this.field_103219_u + 0.5D, this.field_103217_v, 0.0D, 0.0D, 0.0D);
         this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      }
   }

   protected float func_104729_c() {
      return 0.95F;
   }

   protected abstract void func_104728_a(C_100383_amu var1);

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("xTile", (short)this.field_104733_e);
      var1.func_107532_a("yTile", (short)this.field_104730_f);
      var1.func_107532_a("zTile", (short)this.field_104731_g);
      var1.func_107527_a("inTile", (byte)this.field_104739_h);
      var1.func_107527_a("inGround", (byte)(this.field_104740_i?1:0));
      var1.func_107530_a("direction", this.func_103153_a(new double[]{this.field_103215_w, this.field_103240_x, this.field_103238_y}));
   }

   public void func_103110_a(C_100353_bh var1) {
      this.field_104733_e = var1.func_107517_d("xTile");
      this.field_104730_f = var1.func_107517_d("yTile");
      this.field_104731_g = var1.func_107517_d("zTile");
      this.field_104739_h = var1.func_107524_c("inTile") & 255;
      this.field_104740_i = var1.func_107524_c("inGround") == 1;
      if(var1.func_107516_b("direction")) {
         C_100339_bp var2 = var1.func_107513_m("direction");
         this.field_103215_w = ((C_100343_bk)var2.func_107498_b(0)).field_107505_a;
         this.field_103240_x = ((C_100343_bk)var2.func_107498_b(1)).field_107505_a;
         this.field_103238_y = ((C_100343_bk)var2.func_107498_b(2)).field_107505_a;
      } else {
         this.func_103121_x();
      }

   }

   public boolean func_103123_L() {
      return true;
   }

   public float func_103166_Y() {
      return 1.0F;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      this.func_103065_K();
      if(var1.func_109210_g() != null) {
         C_100387_amw var3 = var1.func_109210_g().func_103148_Z();
         if(var3 != null) {
            this.field_103215_w = var3.field_107872_c;
            this.field_103240_x = var3.field_107869_d;
            this.field_103238_y = var3.field_107870_e;
            this.field_104734_b = this.field_103215_w * 0.1D;
            this.field_104735_c = this.field_103240_x * 0.1D;
            this.field_104732_d = this.field_103238_y * 0.1D;
         }

         if(var1.func_109210_g() instanceof C_100595_ln) {
            this.field_104736_a = (C_100595_ln)var1.func_109210_g();
         }

         return true;
      } else {
         return false;
      }
   }

   public float func_103109_R() {
      return 0.0F;
   }

   public float func_103057_c(float var1) {
      return 1.0F;
   }

   public int func_103125_b(float var1) {
      return 15728880;
   }
}
