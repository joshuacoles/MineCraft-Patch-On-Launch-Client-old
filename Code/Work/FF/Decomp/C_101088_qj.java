
public class C_101088_qj extends C_100730_lb {

   public int field_104705_a = 0;
   private double field_104703_b;
   private double field_104704_c;
   private double field_104701_d;
   private int field_104702_e;
   private boolean field_104700_f;


   public C_101088_qj(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.25F, 0.25F);
   }

   protected void func_103141_a() {}

   public boolean func_103167_a(double var1) {
      double var3 = this.field_103173_D.func_107896_b() * 4.0D;
      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public C_101088_qj(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1);
      this.field_104702_e = 0;
      this.func_103161_a(0.25F, 0.25F);
      this.func_103163_b(var2, var4, var6);
      this.field_103181_M = 0.0F;
   }

   public void func_104699_a(double var1, int var3, double var4) {
      double var6 = var1 - this.field_103221_t;
      double var8 = var4 - this.field_103217_v;
      float var10 = C_100650_jv.func_108915_a(var6 * var6 + var8 * var8);
      if(var10 > 12.0F) {
         this.field_104703_b = this.field_103221_t + var6 / (double)var10 * 12.0D;
         this.field_104701_d = this.field_103217_v + var8 / (double)var10 * 12.0D;
         this.field_104704_c = this.field_103219_u + 8.0D;
      } else {
         this.field_104703_b = var1;
         this.field_104704_c = (double)var3;
         this.field_104701_d = var4;
      }

      this.field_104702_e = 0;
      this.field_104700_f = this.field_103232_aa.nextInt(5) > 0;
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
      this.field_103221_t += this.field_103215_w;
      this.field_103219_u += this.field_103240_x;
      this.field_103217_v += this.field_103238_y;
      float var1 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
      this.field_103236_z = (float)(Math.atan2(this.field_103215_w, this.field_103238_y) * 180.0D / 3.1415927410125732D);

      for(this.field_103177_A = (float)(Math.atan2(this.field_103240_x, (double)var1) * 180.0D / 3.1415927410125732D); this.field_103177_A - this.field_103179_C < -180.0F; this.field_103179_C -= 360.0F) {
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
      if(!this.field_103229_p.field_109557_J) {
         double var2 = this.field_104703_b - this.field_103221_t;
         double var4 = this.field_104701_d - this.field_103217_v;
         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
         float var7 = (float)Math.atan2(var4, var2);
         double var8 = (double)var1 + (double)(var6 - var1) * 0.0025D;
         if(var6 < 1.0F) {
            var8 *= 0.8D;
            this.field_103240_x *= 0.8D;
         }

         this.field_103215_w = Math.cos((double)var7) * var8;
         this.field_103238_y = Math.sin((double)var7) * var8;
         if(this.field_103219_u < this.field_104704_c) {
            this.field_103240_x += (1.0D - this.field_103240_x) * 0.014999999664723873D;
         } else {
            this.field_103240_x += (-1.0D - this.field_103240_x) * 0.014999999664723873D;
         }
      }

      float var10 = 0.25F;
      if(this.func_103144_H()) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.field_103229_p.func_109428_a("bubble", this.field_103221_t - this.field_103215_w * (double)var10, this.field_103219_u - this.field_103240_x * (double)var10, this.field_103217_v - this.field_103238_y * (double)var10, this.field_103215_w, this.field_103240_x, this.field_103238_y);
         }
      } else {
         this.field_103229_p.func_109428_a("portal", this.field_103221_t - this.field_103215_w * (double)var10 + this.field_103232_aa.nextDouble() * 0.6D - 0.3D, this.field_103219_u - this.field_103240_x * (double)var10 - 0.5D, this.field_103217_v - this.field_103238_y * (double)var10 + this.field_103232_aa.nextDouble() * 0.6D - 0.3D, this.field_103215_w, this.field_103240_x, this.field_103238_y);
      }

      if(!this.field_103229_p.field_109557_J) {
         this.func_103163_b(this.field_103221_t, this.field_103219_u, this.field_103217_v);
         ++this.field_104702_e;
         if(this.field_104702_e > 80 && !this.field_103229_p.field_109557_J) {
            this.func_103121_x();
            if(this.field_104700_f) {
               this.field_103229_p.func_109513_d(new C_100576_pg(this.field_103229_p, this.field_103221_t, this.field_103219_u, this.field_103217_v, new C_100994_tv(C_100992_tt.field_110896_bA)));
            } else {
               this.field_103229_p.func_109448_f(2003, (int)Math.round(this.field_103221_t), (int)Math.round(this.field_103219_u), (int)Math.round(this.field_103217_v), 0);
            }
         }
      }

   }

   public void func_103078_b(C_100353_bh var1) {}

   public void func_103110_a(C_100353_bh var1) {}

   public float func_103109_R() {
      return 0.0F;
   }

   public float func_103057_c(float var1) {
      return 1.0F;
   }

   public int func_103125_b(float var1) {
      return 15728880;
   }

   public boolean func_103099_aq() {
      return false;
   }
}
