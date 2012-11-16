
public class C_101002_ayf extends C_100988_axw {

   public C_101002_ayf(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125D, var6, var8, var10, var12);
      this.field_104620_h = 0.4F;
      this.field_104621_i = 0.4F;
      this.field_104618_j = 0.7F;
      this.func_104599_a(0);
      this.func_103161_a(0.01F, 0.01F);
      this.field_104609_f *= this.field_103232_aa.nextFloat() * 0.6F + 0.2F;
      this.field_103215_w = var8 * 0.0D;
      this.field_103240_x = var10 * 0.0D;
      this.field_103238_y = var12 * 0.0D;
      this.field_104612_e = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      if(this.field_103229_p.func_109350_f(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) != C_100664_afg.field_109019_h) {
         this.func_103121_x();
      }

      if(this.field_104612_e-- <= 0) {
         this.func_103121_x();
      }

   }
}
