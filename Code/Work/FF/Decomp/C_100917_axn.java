
public class C_100917_axn extends C_100988_axw {

   private float field_104629_a;
   private double field_104631_aw;
   private double field_104630_ax;
   private double field_104628_ay;


   public C_100917_axn(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_103215_w = var8;
      this.field_103240_x = var10;
      this.field_103238_y = var12;
      this.field_104631_aw = this.field_103221_t = var2;
      this.field_104630_ax = this.field_103219_u = var4;
      this.field_104628_ay = this.field_103217_v = var6;
      float var14 = this.field_103232_aa.nextFloat() * 0.6F + 0.4F;
      this.field_104629_a = this.field_104609_f = this.field_103232_aa.nextFloat() * 0.5F + 0.2F;
      this.field_104620_h = this.field_104621_i = this.field_104618_j = 1.0F * var14;
      this.field_104621_i *= 0.9F;
      this.field_104620_h *= 0.9F;
      this.field_104612_e = (int)(Math.random() * 10.0D) + 30;
      this.field_103196_Y = true;
      this.func_104599_a((int)(Math.random() * 26.0D + 1.0D + 224.0D));
   }

   public int func_103125_b(float var1) {
      int var2 = super.func_103125_b(var1);
      float var3 = (float)this.field_104611_d / (float)this.field_104612_e;
      var3 *= var3;
      var3 *= var3;
      int var4 = var2 & 255;
      int var5 = var2 >> 16 & 255;
      var5 += (int)(var3 * 15.0F * 16.0F);
      if(var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   public float func_103057_c(float var1) {
      float var2 = super.func_103057_c(var1);
      float var3 = (float)this.field_104611_d / (float)this.field_104612_e;
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      float var1 = (float)this.field_104611_d / (float)this.field_104612_e;
      var1 = 1.0F - var1;
      float var2 = 1.0F - var1;
      var2 *= var2;
      var2 *= var2;
      this.field_103221_t = this.field_104631_aw + this.field_103215_w * (double)var1;
      this.field_103219_u = this.field_104630_ax + this.field_103240_x * (double)var1 - (double)(var2 * 1.2F);
      this.field_103217_v = this.field_104628_ay + this.field_103238_y * (double)var1;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

   }
}
