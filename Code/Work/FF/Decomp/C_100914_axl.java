
public class C_100914_axl extends C_100988_axw {

   float field_104623_a;


   public C_100914_axl(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   public C_100914_axl(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_103215_w *= 0.10000000149011612D;
      this.field_103240_x *= 0.10000000149011612D;
      this.field_103238_y *= 0.10000000149011612D;
      this.field_103215_w += var8 * 0.4D;
      this.field_103240_x += var10 * 0.4D;
      this.field_103238_y += var12 * 0.4D;
      this.field_104620_h = this.field_104621_i = this.field_104618_j = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
      this.field_104609_f *= 0.75F;
      this.field_104609_f *= var14;
      this.field_104623_a = this.field_104609_f;
      this.field_104612_e = (int)(6.0D / (Math.random() * 0.8D + 0.6D));
      this.field_104612_e = (int)((float)this.field_104612_e * var14);
      this.field_103196_Y = false;
      this.func_104599_a(65);
      this.func_103165_j_();
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_104611_d + var2) / (float)this.field_104612_e * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.field_104609_f = this.field_104623_a * var8;
      super.func_104606_a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_104621_i = (float)((double)this.field_104621_i * 0.96D);
      this.field_104618_j = (float)((double)this.field_104618_j * 0.9D);
      this.field_103215_w *= 0.699999988079071D;
      this.field_103240_x *= 0.699999988079071D;
      this.field_103238_y *= 0.699999988079071D;
      this.field_103240_x -= 0.019999999552965164D;
      if(this.field_103174_E) {
         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
      }

   }
}
