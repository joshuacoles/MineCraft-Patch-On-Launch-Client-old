
public class C_100956_ayj extends C_100988_axw {

   public C_100956_ayj(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_103215_w *= 0.30000001192092896D;
      this.field_103240_x = (double)((float)Math.random() * 0.2F + 0.1F);
      this.field_103238_y *= 0.30000001192092896D;
      this.field_104620_h = 1.0F;
      this.field_104621_i = 1.0F;
      this.field_104618_j = 1.0F;
      this.func_104599_a(19 + this.field_103232_aa.nextInt(4));
      this.func_103161_a(0.01F, 0.01F);
      this.field_104610_g = 0.06F;
      this.field_104612_e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.field_103240_x -= (double)this.field_104610_g;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.9800000190734863D;
      this.field_103240_x *= 0.9800000190734863D;
      this.field_103238_y *= 0.9800000190734863D;
      if(this.field_104612_e-- <= 0) {
         this.func_103121_x();
      }

      if(this.field_103174_E) {
         if(Math.random() < 0.5D) {
            this.func_103121_x();
         }

         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
      }

      C_100664_afg var1 = this.field_103229_p.func_109350_f(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v));
      if(var1.func_108986_d() || var1.func_108983_a()) {
         double var2 = (double)((float)(C_100650_jv.func_108910_c(this.field_103219_u) + 1) - C_100142_ajm.func_106269_d(this.field_103229_p.func_109357_g(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v))));
         if(this.field_103219_u < var2) {
            this.func_103121_x();
         }
      }

   }
}
