
public class C_100107_bcv implements C_100195_gh {

   private final C_100105_bcx field_105935_a;
   private final C_100590_ph field_105933_b;
   private final C_100966_aym field_105934_c;
   private boolean field_105931_d = false;
   private boolean field_105932_e = false;
   private boolean field_105929_f = false;
   private boolean field_105930_g = false;
   private float field_105938_h = 0.0F;
   private float field_105939_i = 0.0F;
   private float field_105936_j = 0.0F;
   private double field_105937_k = 0.0D;


   public C_100107_bcv(C_100105_bcx var1, C_100590_ph var2, C_100966_aym var3) {
      this.field_105935_a = var1;
      this.field_105933_b = var2;
      this.field_105934_c = var3;
   }

   public void func_105928_a() {
      boolean var1 = false;
      boolean var2 = this.field_105931_d;
      boolean var3 = this.field_105932_e;
      boolean var4 = this.field_105929_f;
      float var5 = this.field_105939_i;
      float var6 = this.field_105938_h;
      float var7 = this.field_105936_j;
      double var8 = this.field_105937_k;
      this.field_105931_d = this.field_105934_c != null && this.field_105933_b.field_103206_n == this.field_105934_c;
      this.field_105932_e = this.field_105933_b.field_103180_L;
      this.field_105937_k = (double)C_100650_jv.func_108915_a(this.field_105933_b.field_103215_w * this.field_105933_b.field_103215_w + this.field_105933_b.field_103238_y * this.field_105933_b.field_103238_y);
      this.field_105929_f = this.field_105937_k >= 0.01D;
      if(var2 && !this.field_105931_d) {
         this.field_105935_a.func_105909_c(this.field_105934_c);
      }

      if(this.field_105932_e || !this.field_105930_g && this.field_105939_i == 0.0F && this.field_105936_j == 0.0F) {
         if(!var3) {
            this.field_105935_a.func_105909_c(this.field_105933_b);
            if(var2 || this.field_105931_d) {
               this.field_105935_a.func_105909_c(this.field_105934_c);
            }
         }

         this.field_105930_g = true;
         if(this.field_105932_e) {
            return;
         }
      }

      if(!this.field_105935_a.func_105897_b(this.field_105933_b) && this.field_105939_i > 0.0F) {
         this.field_105935_a.func_105899_a("minecart.base", this.field_105933_b, this.field_105939_i, this.field_105938_h, false);
         this.field_105930_g = false;
         var1 = true;
      }

      if(this.field_105931_d && !this.field_105935_a.func_105897_b(this.field_105934_c) && this.field_105936_j > 0.0F) {
         this.field_105935_a.func_105899_a("minecart.inside", this.field_105934_c, this.field_105936_j, 1.0F, true);
         this.field_105930_g = false;
         var1 = true;
      }

      if(this.field_105929_f) {
         if(this.field_105938_h < 1.0F) {
            this.field_105938_h += 0.0025F;
         }

         if(this.field_105938_h > 1.0F) {
            this.field_105938_h = 1.0F;
         }

         float var10 = C_100650_jv.func_108914_a((float)this.field_105937_k, 0.0F, 4.0F) / 4.0F;
         this.field_105936_j = 0.0F + var10 * 0.75F;
         var10 = C_100650_jv.func_108914_a(var10 * 2.0F, 0.0F, 1.0F);
         this.field_105939_i = 0.0F + var10 * 0.7F;
      } else if(var4) {
         this.field_105939_i = 0.0F;
         this.field_105938_h = 0.0F;
         this.field_105936_j = 0.0F;
      }

      if(!this.field_105930_g) {
         if(this.field_105938_h != var6) {
            this.field_105935_a.func_105907_b(this.field_105933_b, this.field_105938_h);
         }

         if(this.field_105939_i != var5) {
            this.field_105935_a.func_105903_a(this.field_105933_b, this.field_105939_i);
         }

         if(this.field_105936_j != var7) {
            this.field_105935_a.func_105903_a(this.field_105934_c, this.field_105936_j);
         }
      }

      if(!var1) {
         this.field_105935_a.func_105910_a(this.field_105933_b);
         if(this.field_105931_d) {
            this.field_105935_a.func_105912_a(this.field_105934_c, this.field_105933_b);
         }
      }

   }
}
