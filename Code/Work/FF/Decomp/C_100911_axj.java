
public class C_100911_axj extends C_100988_axw {

   public C_100911_axj(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_104620_h = 1.0F;
      this.field_104621_i = 1.0F;
      this.field_104618_j = 1.0F;
      this.func_104599_a(32);
      this.func_103161_a(0.02F, 0.02F);
      this.field_104609_f *= this.field_103232_aa.nextFloat() * 0.6F + 0.2F;
      this.field_103215_w = var8 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.field_103240_x = var10 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.field_103238_y = var12 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.field_104612_e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.field_103240_x += 0.0020D;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.8500000238418579D;
      this.field_103240_x *= 0.8500000238418579D;
      this.field_103238_y *= 0.8500000238418579D;
      if(this.field_103229_p.func_109350_f(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) != C_100664_afg.field_109019_h) {
         this.func_103121_x();
      }

      if(this.field_104612_e-- <= 0) {
         this.func_103121_x();
      }

   }
}
