
public abstract class C_101110_ps extends C_100598_ls implements C_100587_pn {

   public C_101110_ps(C_100873_xe var1) {
      super(var1);
      this.field_103421_bc = 5;
   }

   public void func_103313_c() {
      this.func_103361_bl();
      float var1 = this.func_103057_c(1.0F);
      if(var1 > 0.5F) {
         this.field_103487_bC += 2;
      }

      super.func_103313_c();
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(!this.field_103229_p.field_109557_J && this.field_103229_p.field_109578_t == 0) {
         this.func_103121_x();
      }

   }

   protected C_100730_lb func_103492_j() {
      C_101095_qg var1 = this.field_103229_p.func_109455_b(this, 16.0D);
      return var1 != null && this.func_103308_m(var1)?var1:null;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(super.func_103085_a(var1, var2)) {
         C_100730_lb var3 = var1.func_109210_g();
         if(this.field_103206_n != var3 && this.field_103207_o != var3) {
            if(var3 != this) {
               this.field_103504_a_ = var3;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean func_103303_l(C_100730_lb var1) {
      int var2 = this.func_103643_c(var1);
      if(this.func_103300_a(C_100690_kw.field_109164_g)) {
         var2 += 3 << this.func_103390_b(C_100690_kw.field_109164_g).func_109192_c();
      }

      if(this.func_103300_a(C_100690_kw.field_109181_t)) {
         var2 -= 2 << this.func_103390_b(C_100690_kw.field_109181_t).func_109192_c();
      }

      int var3 = 0;
      if(var1 instanceof C_100595_ln) {
         var2 += C_100878_wh.func_110592_a(this, (C_100595_ln)var1);
         var3 += C_100878_wh.func_110588_b(this, (C_100595_ln)var1);
      }

      boolean var4 = var1.func_103085_a(C_100698_ks.func_109218_a(this), var2);
      if(var4) {
         if(var3 > 0) {
            var1.func_103071_g((double)(-C_100650_jv.func_108924_a(this.field_103236_z * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(C_100650_jv.func_108928_b(this.field_103236_z * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
            this.field_103215_w *= 0.6D;
            this.field_103238_y *= 0.6D;
         }

         int var5 = C_100878_wh.func_110581_c(this, (C_100595_ln)var1);
         if(var5 > 0) {
            var1.func_103112_c(var5 * 4);
         }
      }

      return var4;
   }

   protected void func_103500_a(C_100730_lb var1, float var2) {
      if(this.field_103425_aY <= 0 && var2 < 2.0F && var1.field_103173_D.field_107914_e > this.field_103173_D.field_107915_b && var1.field_103173_D.field_107915_b < this.field_103173_D.field_107914_e) {
         this.field_103425_aY = 20;
         this.func_103303_l(var1);
      }

   }

   public float func_103499_a(int var1, int var2, int var3) {
      return 0.5F - this.field_103229_p.func_109354_o(var1, var2, var3);
   }

   protected boolean func_103644_i_() {
      int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var2 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      if(this.field_103229_p.func_109375_b(C_100847_xq.field_110168_a, var1, var2, var3) > this.field_103232_aa.nextInt(32)) {
         return false;
      } else {
         int var4 = this.field_103229_p.func_109523_l(var1, var2, var3);
         if(this.field_103229_p.func_109473_L()) {
            int var5 = this.field_103229_p.field_109571_j;
            this.field_103229_p.field_109571_j = 10;
            var4 = this.field_103229_p.func_109523_l(var1, var2, var3);
            this.field_103229_p.field_109571_j = var5;
         }

         return var4 <= this.field_103232_aa.nextInt(8);
      }
   }

   public boolean func_103380_bp() {
      return this.func_103644_i_() && super.func_103380_bp();
   }

   public int func_103643_c(C_100730_lb var1) {
      return 2;
   }
}
