import java.util.Iterator;
import java.util.List;

public abstract class C_101082_qq extends C_100730_lb implements C_101084_qn {

   private int field_104689_d = -1;
   private int field_104690_e = -1;
   private int field_104687_f = -1;
   private int field_104688_g = 0;
   protected boolean field_104693_a = false;
   public int field_104691_b = 0;
   protected C_100595_ln field_104692_c;
   private int field_104694_h;
   private int field_104695_i = 0;


   public C_101082_qq(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.25F, 0.25F);
   }

   protected void func_103141_a() {}

   public boolean func_103167_a(double var1) {
      double var3 = this.field_103173_D.func_107896_b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public C_101082_qq(C_100873_xe var1, C_100595_ln var2) {
      super(var1);
      this.field_104692_c = var2;
      this.func_103161_a(0.25F, 0.25F);
      this.func_103055_b(var2.field_103221_t, var2.field_103219_u + (double)var2.func_103102_e(), var2.field_103217_v, var2.field_103236_z, var2.field_103177_A);
      this.field_103221_t -= (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * 0.16F);
      this.field_103219_u -= 0.10000000149011612D;
      this.field_103217_v -= (double)(C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * 0.16F);
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      this.field_103181_M = 0.0F;
      float var3 = 0.4F;
      this.field_103215_w = (double)(-C_100650_jv.func_108924_a(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F) * var3);
      this.field_103238_y = (double)(C_100650_jv.func_108928_b(this.field_103236_z / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(this.field_103177_A / 180.0F * 3.1415927F) * var3);
      this.field_103240_x = (double)(-C_100650_jv.func_108924_a((this.field_103177_A + this.func_104683_d()) / 180.0F * 3.1415927F) * var3);
      this.func_104664_c(this.field_103215_w, this.field_103240_x, this.field_103238_y, this.func_104686_c(), 1.0F);
   }

   public C_101082_qq(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1);
      this.field_104694_h = 0;
      this.func_103161_a(0.25F, 0.25F);
      this.func_103163_b(var2, var4, var6);
      this.field_103181_M = 0.0F;
   }

   protected float func_104686_c() {
      return 1.5F;
   }

   protected float func_104683_d() {
      return 0.0F;
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
      this.field_104694_h = 0;
   }

   public void func_103061_h(double var1, double var3, double var5) {
      this.field_103215_w = var1;
      this.field_103240_x = var3;
      this.field_103238_y = var5;
      if(this.field_103179_C == 0.0F && this.field_103178_B == 0.0F) {
         float var7 = C_100650_jv.func_108915_a(var1 * var1 + var5 * var5);
         this.field_103178_B = this.field_103236_z = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
         this.field_103179_C = this.field_103177_A = (float)(Math.atan2(var3, (double)var7) * 180.0D / 3.1415927410125732D);
      }

   }

   public void func_103165_j_() {
      this.field_103189_T = this.field_103221_t;
      this.field_103188_U = this.field_103219_u;
      this.field_103191_V = this.field_103217_v;
      super.func_103165_j_();
      if(this.field_104691_b > 0) {
         --this.field_104691_b;
      }

      if(this.field_104693_a) {
         int var1 = this.field_103229_p.func_109349_a(this.field_104689_d, this.field_104690_e, this.field_104687_f);
         if(var1 == this.field_104688_g) {
            ++this.field_104694_h;
            if(this.field_104694_h == 1200) {
               this.func_103121_x();
            }

            return;
         }

         this.field_104693_a = false;
         this.field_103215_w *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
         this.field_103240_x *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
         this.field_103238_y *= (double)(this.field_103232_aa.nextFloat() * 0.2F);
         this.field_104694_h = 0;
         this.field_104695_i = 0;
      } else {
         ++this.field_104695_i;
      }

      C_100387_amw var15 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      C_100387_amw var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
      C_100383_amu var3 = this.field_103229_p.func_109522_a(var15, var2);
      var15 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
      var2 = this.field_103229_p.func_109363_R().func_107878_a(this.field_103221_t + this.field_103215_w, this.field_103219_u + this.field_103240_x, this.field_103217_v + this.field_103238_y);
      if(var3 != null) {
         var2 = this.field_103229_p.func_109363_R().func_107878_a(var3.field_107834_f.field_107872_c, var3.field_107834_f.field_107869_d, var3.field_107834_f.field_107870_e);
      }

      if(!this.field_103229_p.field_109557_J) {
         C_100730_lb var4 = null;
         List var5 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107903_a(this.field_103215_w, this.field_103240_x, this.field_103238_y).func_107895_b(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;
         Iterator var8 = var5.iterator();

         while(var8.hasNext()) {
            C_100730_lb var9 = (C_100730_lb)var8.next();
            if(var9.func_103123_L() && (var9 != this.field_104692_c || this.field_104695_i >= 5)) {
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
      }

      if(var3 != null) {
         if(var3.field_107840_a == C_100389_amv.field_107877_a && this.field_103229_p.func_109349_a(var3.field_107838_b, var3.field_107839_c, var3.field_107836_d) == C_100451_alf.field_106143_bh.field_106162_cm) {
            this.func_103119_aa();
         } else {
            this.func_104685_a(var3);
         }
      }

      this.field_103221_t += this.field_103215_w;
      this.field_103219_u += this.field_103240_x;
      this.field_103217_v += this.field_103238_y;
      float var16 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
      this.field_103236_z = (float)(Math.atan2(this.field_103215_w, this.field_103238_y) * 180.0D / 3.1415927410125732D);

      for(this.field_103177_A = (float)(Math.atan2(this.field_103240_x, (double)var16) * 180.0D / 3.1415927410125732D); this.field_103177_A - this.field_103179_C < -180.0F; this.field_103179_C -= 360.0F) {
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
      float var17 = 0.99F;
      float var18 = this.func_104684_g();
      if(this.func_103144_H()) {
         for(int var7 = 0; var7 < 4; ++var7) {
            float var19 = 0.25F;
            this.field_103229_p.func_109428_a("bubble", this.field_103221_t - this.field_103215_w * (double)var19, this.field_103219_u - this.field_103240_x * (double)var19, this.field_103217_v - this.field_103238_y * (double)var19, this.field_103215_w, this.field_103240_x, this.field_103238_y);
         }

         var17 = 0.8F;
      }

      this.field_103215_w *= (double)var17;
      this.field_103240_x *= (double)var17;
      this.field_103238_y *= (double)var17;
      this.field_103240_x -= (double)var18;
      this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
   }

   protected float func_104684_g() {
      return 0.03F;
   }

   protected abstract void func_104685_a(C_100383_amu var1);

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("xTile", (short)this.field_104689_d);
      var1.func_107532_a("yTile", (short)this.field_104690_e);
      var1.func_107532_a("zTile", (short)this.field_104687_f);
      var1.func_107527_a("inTile", (byte)this.field_104688_g);
      var1.func_107527_a("shake", (byte)this.field_104691_b);
      var1.func_107527_a("inGround", (byte)(this.field_104693_a?1:0));
   }

   public void func_103110_a(C_100353_bh var1) {
      this.field_104689_d = var1.func_107517_d("xTile");
      this.field_104690_e = var1.func_107517_d("yTile");
      this.field_104687_f = var1.func_107517_d("zTile");
      this.field_104688_g = var1.func_107524_c("inTile") & 255;
      this.field_104691_b = var1.func_107524_c("shake") & 255;
      this.field_104693_a = var1.func_107524_c("inGround") == 1;
   }

   public float func_103109_R() {
      return 0.0F;
   }
}
