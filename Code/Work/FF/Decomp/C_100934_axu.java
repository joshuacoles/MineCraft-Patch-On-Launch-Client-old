
public class C_100934_axu extends C_100988_axw {

   private float field_104646_a;


   public C_100934_axu(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_103215_w *= 0.800000011920929D;
      this.field_103240_x *= 0.800000011920929D;
      this.field_103238_y *= 0.800000011920929D;
      this.field_103240_x = (double)(this.field_103232_aa.nextFloat() * 0.4F + 0.05F);
      this.field_104620_h = this.field_104621_i = this.field_104618_j = 1.0F;
      this.field_104609_f *= this.field_103232_aa.nextFloat() * 2.0F + 0.2F;
      this.field_104646_a = this.field_104609_f;
      this.field_104612_e = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.field_103196_Y = false;
      this.func_104599_a(49);
   }

   public int func_103125_b(float var1) {
      float var2 = ((float)this.field_104611_d + var1) / (float)this.field_104612_e;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.func_103125_b(var1);
      short var4 = 240;
      int var5 = var3 >> 16 & 255;
      return var4 | var5 << 16;
   }

   public float func_103057_c(float var1) {
      return 1.0F;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_104611_d + var2) / (float)this.field_104612_e;
      this.field_104609_f = this.field_104646_a * (1.0F - var8 * var8);
      super.func_104606_a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

      float var1 = (float)this.field_104611_d / (float)this.field_104612_e;
      if(this.field_103232_aa.nextFloat() > var1) {
         this.field_103229_p.func_109428_a("smoke", this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103215_w, this.field_103240_x, this.field_103238_y);
      }

      this.field_103240_x -= 0.03D;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.9990000128746033D;
      this.field_103240_x *= 0.9990000128746033D;
      this.field_103238_y *= 0.9990000128746033D;
      if(this.field_103174_E) {
         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
      }

   }
}
