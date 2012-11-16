
public class C_100922_axo extends C_100988_axw {

   public C_100922_axo(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_103215_w = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.field_103240_x = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.field_103238_y = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.field_104620_h = this.field_104621_i = this.field_104618_j = this.field_103232_aa.nextFloat() * 0.3F + 0.7F;
      this.field_104609_f = this.field_103232_aa.nextFloat() * this.field_103232_aa.nextFloat() * 6.0F + 1.0F;
      this.field_104612_e = (int)(16.0D / ((double)this.field_103232_aa.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

      this.func_104599_a(7 - this.field_104611_d * 8 / this.field_104612_e);
      this.field_103240_x += 0.0040D;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.8999999761581421D;
      this.field_103240_x *= 0.8999999761581421D;
      this.field_103238_y *= 0.8999999761581421D;
      if(this.field_103174_E) {
         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
      }

   }
}
