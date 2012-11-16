
public abstract class C_100721_lk extends C_100595_ln {

   public C_100721_lk(C_100873_xe var1) {
      super(var1);
   }

   protected void func_103124_a(float var1) {}

   protected void func_103120_a(double var1, boolean var3) {}

   public void func_103310_e(float var1, float var2) {
      if(this.func_103144_H()) {
         this.func_103118_a(var1, var2, 0.02F);
         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         this.field_103215_w *= 0.800000011920929D;
         this.field_103240_x *= 0.800000011920929D;
         this.field_103238_y *= 0.800000011920929D;
      } else if(this.func_103115_J()) {
         this.func_103118_a(var1, var2, 0.02F);
         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         this.field_103215_w *= 0.5D;
         this.field_103240_x *= 0.5D;
         this.field_103238_y *= 0.5D;
      } else {
         float var3 = 0.91F;
         if(this.field_103174_E) {
            var3 = 0.54600006F;
            int var4 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b) - 1, C_100650_jv.func_108910_c(this.field_103217_v));
            if(var4 > 0) {
               var3 = C_100451_alf.field_106118_p[var4].field_106145_cC * 0.91F;
            }
         }

         float var8 = 0.16277136F / (var3 * var3 * var3);
         this.func_103118_a(var1, var2, this.field_103174_E?0.1F * var8:0.02F);
         var3 = 0.91F;
         if(this.field_103174_E) {
            var3 = 0.54600006F;
            int var5 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b) - 1, C_100650_jv.func_108910_c(this.field_103217_v));
            if(var5 > 0) {
               var3 = C_100451_alf.field_106118_p[var5].field_106145_cC * 0.91F;
            }
         }

         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         this.field_103215_w *= (double)var3;
         this.field_103240_x *= (double)var3;
         this.field_103238_y *= (double)var3;
      }

      this.field_103416_bf = this.field_103417_bg;
      double var10 = this.field_103221_t - this.field_103227_q;
      double var9 = this.field_103217_v - this.field_103223_s;
      float var7 = C_100650_jv.func_108915_a(var10 * var10 + var9 * var9) * 4.0F;
      if(var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.field_103417_bg += (var7 - this.field_103417_bg) * 0.4F;
      this.field_103418_bh += this.field_103417_bg;
   }

   public boolean func_103327_g_() {
      return false;
   }
}
