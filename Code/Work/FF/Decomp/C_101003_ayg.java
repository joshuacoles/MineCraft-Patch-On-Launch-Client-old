
public class C_101003_ayg extends C_100988_axw {

   public C_101003_ayg(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.field_103232_aa.nextFloat() * 0.1F + 0.2F;
      this.field_104620_h = var14;
      this.field_104621_i = var14;
      this.field_104618_j = var14;
      this.func_104599_a(0);
      this.func_103161_a(0.02F, 0.02F);
      this.field_104609_f *= this.field_103232_aa.nextFloat() * 0.6F + 0.5F;
      this.field_103215_w *= 0.019999999552965164D;
      this.field_103240_x *= 0.019999999552965164D;
      this.field_103238_y *= 0.019999999552965164D;
      this.field_104612_e = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
      this.field_103196_Y = true;
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.99D;
      this.field_103240_x *= 0.99D;
      this.field_103238_y *= 0.99D;
      if(this.field_104612_e-- <= 0) {
         this.func_103121_x();
      }

   }
}
