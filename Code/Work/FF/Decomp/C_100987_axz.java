
public class C_100987_axz extends C_100988_axw {

   private float field_104656_a;
   private double field_104658_aw;
   private double field_104657_ax;
   private double field_104655_ay;


   public C_100987_axz(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_103215_w = var8;
      this.field_103240_x = var10;
      this.field_103238_y = var12;
      this.field_104658_aw = this.field_103221_t = var2;
      this.field_104657_ax = this.field_103219_u = var4;
      this.field_104655_ay = this.field_103217_v = var6;
      float var14 = this.field_103232_aa.nextFloat() * 0.6F + 0.4F;
      this.field_104656_a = this.field_104609_f = this.field_103232_aa.nextFloat() * 0.2F + 0.5F;
      this.field_104620_h = this.field_104621_i = this.field_104618_j = 1.0F * var14;
      this.field_104621_i *= 0.3F;
      this.field_104620_h *= 0.9F;
      this.field_104612_e = (int)(Math.random() * 10.0D) + 40;
      this.field_103196_Y = true;
      this.func_104599_a((int)(Math.random() * 8.0D));
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_104611_d + var2) / (float)this.field_104612_e;
      var8 = 1.0F - var8;
      var8 *= var8;
      var8 = 1.0F - var8;
      this.field_104609_f = this.field_104656_a * var8;
      super.func_104606_a(var1, var2, var3, var4, var5, var6, var7);
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
      var3 = var3 * var3 * var3 * var3;
      return var2 * (1.0F - var3) + var3;
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      float var1 = (float)this.field_104611_d / (float)this.field_104612_e;
      float var2 = var1;
      var1 = -var1 + var1 * var1 * 2.0F;
      var1 = 1.0F - var1;
      this.field_103221_t = this.field_104658_aw + this.field_103215_w * (double)var1;
      this.field_103219_u = this.field_104657_ax + this.field_103240_x * (double)var1 + (double)(1.0F - var2);
      this.field_103217_v = this.field_104655_ay + this.field_103238_y * (double)var1;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

   }
}
