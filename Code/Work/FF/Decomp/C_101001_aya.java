
public class C_101001_aya extends C_100988_axw {

   float field_104661_a;


   public C_101001_aya(C_100873_xe var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      this(var1, var2, var4, var6, 1.0F, var8, var9, var10);
   }

   public C_101001_aya(C_100873_xe var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_103215_w *= 0.10000000149011612D;
      this.field_103240_x *= 0.10000000149011612D;
      this.field_103238_y *= 0.10000000149011612D;
      if(var9 == 0.0F) {
         var9 = 1.0F;
      }

      float var12 = (float)Math.random() * 0.4F + 0.6F;
      this.field_104620_h = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var9 * var12;
      this.field_104621_i = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var10 * var12;
      this.field_104618_j = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var11 * var12;
      this.field_104609_f *= 0.75F;
      this.field_104609_f *= var8;
      this.field_104661_a = this.field_104609_f;
      this.field_104612_e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.field_104612_e = (int)((float)this.field_104612_e * var8);
      this.field_103196_Y = false;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.field_104611_d + var2) / (float)this.field_104612_e * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.field_104609_f = this.field_104661_a * var8;
      super.func_104606_a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

      this.func_104599_a(7 - this.field_104611_d * 8 / this.field_104612_e);
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      if(this.field_103219_u == this.field_103225_r) {
         this.field_103215_w *= 1.1D;
         this.field_103238_y *= 1.1D;
      }

      this.field_103215_w *= 0.9599999785423279D;
      this.field_103240_x *= 0.9599999785423279D;
      this.field_103238_y *= 0.9599999785423279D;
      if(this.field_103174_E) {
         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
      }

   }
}
