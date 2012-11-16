
public abstract class C_100598_ls extends C_100595_ln {

   private C_100278_agj field_103501_d;
   protected C_100730_lb field_103504_a_;
   protected boolean field_103502_b = false;
   protected int field_103503_c = 0;


   public C_100598_ls(C_100873_xe var1) {
      super(var1);
   }

   protected boolean func_103493_h() {
      return false;
   }

   protected void func_103288_bk() {
      this.field_103229_p.field_109545_E.func_108901_a("ai");
      if(this.field_103503_c > 0) {
         --this.field_103503_c;
      }

      this.field_103502_b = this.func_103493_h();
      float var1 = 16.0F;
      if(this.field_103504_a_ == null) {
         this.field_103504_a_ = this.func_103492_j();
         if(this.field_103504_a_ != null) {
            this.field_103501_d = this.field_103229_p.func_109487_a(this, this.field_103504_a_, var1, true, false, false, true);
         }
      } else if(this.field_103504_a_.func_103143_S()) {
         float var2 = this.field_103504_a_.func_103056_d(this);
         if(this.func_103308_m(this.field_103504_a_)) {
            this.func_103500_a(this.field_103504_a_, var2);
         }
      } else {
         this.field_103504_a_ = null;
      }

      this.field_103229_p.field_109545_E.func_108900_b();
      if(!this.field_103502_b && this.field_103504_a_ != null && (this.field_103501_d == null || this.field_103232_aa.nextInt(20) == 0)) {
         this.field_103501_d = this.field_103229_p.func_109487_a(this, this.field_103504_a_, var1, true, false, false, true);
      } else if(!this.field_103502_b && (this.field_103501_d == null && this.field_103232_aa.nextInt(180) == 0 || this.field_103232_aa.nextInt(120) == 0 || this.field_103503_c > 0) && this.field_103487_bC < 100) {
         this.func_103496_i();
      }

      int var21 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b + 0.5D);
      boolean var3 = this.func_103144_H();
      boolean var4 = this.func_103115_J();
      this.field_103177_A = 0.0F;
      if(this.field_103501_d != null && this.field_103232_aa.nextInt(100) != 0) {
         this.field_103229_p.field_109545_E.func_108901_a("followpath");
         C_100387_amw var5 = this.field_103501_d.func_107237_a(this);
         double var6 = (double)(this.field_103182_N * 2.0F);

         while(var5 != null && var5.func_107866_d(this.field_103221_t, var5.field_107869_d, this.field_103217_v) < var6 * var6) {
            this.field_103501_d.func_107233_a();
            if(this.field_103501_d.func_107239_b()) {
               var5 = null;
               this.field_103501_d = null;
            } else {
               var5 = this.field_103501_d.func_107237_a(this);
            }
         }

         this.field_103491_bG = false;
         if(var5 != null) {
            double var8 = var5.field_107872_c - this.field_103221_t;
            double var10 = var5.field_107870_e - this.field_103217_v;
            double var12 = var5.field_107869_d - (double)var21;
            float var14 = (float)(Math.atan2(var10, var8) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = C_100650_jv.func_108920_g(var14 - this.field_103236_z);
            this.field_103485_bE = this.field_103489_bI;
            if(var15 > 30.0F) {
               var15 = 30.0F;
            }

            if(var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.field_103236_z += var15;
            if(this.field_103502_b && this.field_103504_a_ != null) {
               double var16 = this.field_103504_a_.field_103221_t - this.field_103221_t;
               double var18 = this.field_103504_a_.field_103217_v - this.field_103217_v;
               float var20 = this.field_103236_z;
               this.field_103236_z = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.field_103236_z + 90.0F) * 3.1415927F / 180.0F;
               this.field_103484_bD = -C_100650_jv.func_108924_a(var15) * this.field_103485_bE * 1.0F;
               this.field_103485_bE = C_100650_jv.func_108928_b(var15) * this.field_103485_bE * 1.0F;
            }

            if(var12 > 0.0D) {
               this.field_103491_bG = true;
            }
         }

         if(this.field_103504_a_ != null) {
            this.func_103371_a(this.field_103504_a_, 30.0F, 30.0F);
         }

         if(this.field_103175_F && !this.func_103494_k()) {
            this.field_103491_bG = true;
         }

         if(this.field_103232_aa.nextFloat() < 0.8F && (var3 || var4)) {
            this.field_103491_bG = true;
         }

         this.field_103229_p.field_109545_E.func_108900_b();
      } else {
         super.func_103288_bk();
         this.field_103501_d = null;
      }
   }

   protected void func_103496_i() {
      this.field_103229_p.field_109545_E.func_108901_a("stroll");
      boolean var1 = false;
      int var2 = -1;
      int var3 = -1;
      int var4 = -1;
      float var5 = -99999.0F;

      for(int var6 = 0; var6 < 10; ++var6) {
         int var7 = C_100650_jv.func_108910_c(this.field_103221_t + (double)this.field_103232_aa.nextInt(13) - 6.0D);
         int var8 = C_100650_jv.func_108910_c(this.field_103219_u + (double)this.field_103232_aa.nextInt(7) - 3.0D);
         int var9 = C_100650_jv.func_108910_c(this.field_103217_v + (double)this.field_103232_aa.nextInt(13) - 6.0D);
         float var10 = this.func_103499_a(var7, var8, var9);
         if(var10 > var5) {
            var5 = var10;
            var2 = var7;
            var3 = var8;
            var4 = var9;
            var1 = true;
         }
      }

      if(var1) {
         this.field_103501_d = this.field_103229_p.func_109495_a(this, var2, var3, var4, 10.0F, true, false, false, true);
      }

      this.field_103229_p.field_109545_E.func_108900_b();
   }

   protected void func_103500_a(C_100730_lb var1, float var2) {}

   public float func_103499_a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected C_100730_lb func_103492_j() {
      return null;
   }

   public boolean func_103380_bp() {
      int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var2 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      return super.func_103380_bp() && this.func_103499_a(var1, var2, var3) >= 0.0F;
   }

   public boolean func_103494_k() {
      return this.field_103501_d != null;
   }

   public void func_103495_a(C_100278_agj var1) {
      this.field_103501_d = var1;
   }

   public C_100730_lb func_103498_l() {
      return this.field_103504_a_;
   }

   public void func_103497_b(C_100730_lb var1) {
      this.field_103504_a_ = var1;
   }

   public float func_103353_by() {
      float var1 = super.func_103353_by();
      if(this.field_103503_c > 0 && !this.func_103321_bb()) {
         var1 *= 2.0F;
      }

      return var1;
   }
}
