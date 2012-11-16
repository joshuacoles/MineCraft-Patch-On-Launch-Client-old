
public class C_100558_oq extends C_100548_os {

   public float field_103507_d = 0.0F;
   public float field_103508_e = 0.0F;
   public float field_103505_f = 0.0F;
   public float field_103506_g = 0.0F;
   public float field_103510_h = 0.0F;
   public float field_103511_i = 0.0F;
   public float field_103509_j = 0.0F;
   public float field_103514_bK = 0.0F;
   private float field_103512_bL = 0.0F;
   private float field_103513_bM = 0.0F;
   private float field_103517_bN = 0.0F;
   private float field_103518_bO = 0.0F;
   private float field_103515_bP = 0.0F;
   private float field_103516_bQ = 0.0F;


   public C_100558_oq(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/squid.png";
      this.func_103161_a(0.95F, 0.95F);
      this.field_103513_bM = 1.0F / (this.field_103232_aa.nextFloat() + 1.0F) * 0.2F;
   }

   public int func_103378_aS() {
      return 10;
   }

   protected String func_103354_aW() {
      return null;
   }

   protected String func_103387_aX() {
      return null;
   }

   protected String func_103307_aY() {
      return null;
   }

   protected float func_103384_aV() {
      return 0.4F;
   }

   protected int func_103377_aZ() {
      return 0;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(3 + var2) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.func_103140_a(new C_100994_tv(C_100992_tt.field_110904_aW, 1, 0), 0.0F);
      }

   }

   public boolean func_103144_H() {
      return this.field_103229_p.func_109512_a(this.field_103173_D.func_107895_b(0.0D, -0.6000000238418579D, 0.0D), C_100664_afg.field_109019_h, this);
   }

   public void func_103313_c() {
      super.func_103313_c();
      this.field_103508_e = this.field_103507_d;
      this.field_103506_g = this.field_103505_f;
      this.field_103511_i = this.field_103510_h;
      this.field_103514_bK = this.field_103509_j;
      this.field_103510_h += this.field_103513_bM;
      if(this.field_103510_h > 6.2831855F) {
         this.field_103510_h -= 6.2831855F;
         if(this.field_103232_aa.nextInt(10) == 0) {
            this.field_103513_bM = 1.0F / (this.field_103232_aa.nextFloat() + 1.0F) * 0.2F;
         }
      }

      if(this.func_103144_H()) {
         float var1;
         if(this.field_103510_h < 3.1415927F) {
            var1 = this.field_103510_h / 3.1415927F;
            this.field_103509_j = C_100650_jv.func_108924_a(var1 * var1 * 3.1415927F) * 3.1415927F * 0.25F;
            if((double)var1 > 0.75D) {
               this.field_103512_bL = 1.0F;
               this.field_103517_bN = 1.0F;
            } else {
               this.field_103517_bN *= 0.8F;
            }
         } else {
            this.field_103509_j = 0.0F;
            this.field_103512_bL *= 0.9F;
            this.field_103517_bN *= 0.99F;
         }

         if(!this.field_103229_p.field_109557_J) {
            this.field_103215_w = (double)(this.field_103518_bO * this.field_103512_bL);
            this.field_103240_x = (double)(this.field_103515_bP * this.field_103512_bL);
            this.field_103238_y = (double)(this.field_103516_bQ * this.field_103512_bL);
         }

         var1 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103238_y * this.field_103238_y);
         this.field_103469_aw += (-((float)Math.atan2(this.field_103215_w, this.field_103238_y)) * 180.0F / 3.1415927F - this.field_103469_aw) * 0.1F;
         this.field_103236_z = this.field_103469_aw;
         this.field_103505_f += 3.1415927F * this.field_103517_bN * 1.5F;
         this.field_103507_d += (-((float)Math.atan2((double)var1, this.field_103240_x)) * 180.0F / 3.1415927F - this.field_103507_d) * 0.1F;
      } else {
         this.field_103509_j = C_100650_jv.func_108927_e(C_100650_jv.func_108924_a(this.field_103510_h)) * 3.1415927F * 0.25F;
         if(!this.field_103229_p.field_109557_J) {
            this.field_103215_w = 0.0D;
            this.field_103240_x -= 0.08D;
            this.field_103240_x *= 0.9800000190734863D;
            this.field_103238_y = 0.0D;
         }

         this.field_103507_d = (float)((double)this.field_103507_d + (double)(-90.0F - this.field_103507_d) * 0.02D);
      }

   }

   public void func_103310_e(float var1, float var2) {
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
   }

   protected void func_103288_bk() {
      ++this.field_103487_bC;
      if(this.field_103487_bC > 100) {
         this.field_103518_bO = this.field_103515_bP = this.field_103516_bQ = 0.0F;
      } else if(this.field_103232_aa.nextInt(50) == 0 || !this.field_103231_ad || this.field_103518_bO == 0.0F && this.field_103515_bP == 0.0F && this.field_103516_bQ == 0.0F) {
         float var1 = this.field_103232_aa.nextFloat() * 3.1415927F * 2.0F;
         this.field_103518_bO = C_100650_jv.func_108928_b(var1) * 0.2F;
         this.field_103515_bP = -0.1F + this.field_103232_aa.nextFloat() * 0.2F;
         this.field_103516_bQ = C_100650_jv.func_108924_a(var1) * 0.2F;
      }

      this.func_103349_bh();
   }

   public boolean func_103380_bp() {
      return this.field_103219_u > 45.0D && this.field_103219_u < 63.0D && super.func_103380_bp();
   }
}
