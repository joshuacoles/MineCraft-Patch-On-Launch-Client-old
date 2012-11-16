
public class C_100913_axi extends C_100988_axw {

   public C_100913_axi(C_100873_xe var1, double var2, double var4, double var6, C_100992_tt var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.func_104599_a(var8.func_110787_b(0));
      this.field_104620_h = this.field_104621_i = this.field_104618_j = 1.0F;
      this.field_104610_g = C_100451_alf.field_106183_aX.field_106206_cA;
      this.field_104609_f /= 2.0F;
   }

   public C_100913_axi(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12, C_100992_tt var14) {
      this(var1, var2, var4, var6, var14);
      this.field_103215_w *= 0.10000000149011612D;
      this.field_103240_x *= 0.10000000149011612D;
      this.field_103238_y *= 0.10000000149011612D;
      this.field_103215_w += var8;
      this.field_103240_x += var10;
      this.field_103238_y += var12;
   }

   public int func_104602_b() {
      return 2;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)(this.func_104605_h() % 16) + this.field_104613_b / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = ((float)(this.func_104605_h() / 16) + this.field_104614_c / 4.0F) / 16.0F;
      float var11 = var10 + 0.015609375F;
      float var12 = 0.1F * this.field_104609_f;
      float var13 = (float)(this.field_103227_q + (this.field_103221_t - this.field_103227_q) * (double)var2 - field_104616_at);
      float var14 = (float)(this.field_103225_r + (this.field_103219_u - this.field_103225_r) * (double)var2 - field_104622_au);
      float var15 = (float)(this.field_103223_s + (this.field_103217_v - this.field_103223_s) * (double)var2 - field_104619_av);
      float var16 = 1.0F;
      var1.func_110334_a(var16 * this.field_104620_h, var16 * this.field_104621_i, var16 * this.field_104618_j);
      var1.func_110322_a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.func_110322_a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.func_110322_a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.func_110322_a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }
}
