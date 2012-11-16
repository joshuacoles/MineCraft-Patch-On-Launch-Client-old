
public class C_101225_avr extends C_101227_avp {

   private float field_112190_i;


   public C_101225_avr() {
      super(12, 0.0F);
      this.field_112187_a = new C_101254_awp(this, 0, 0);
      this.field_112187_a.func_112203_a(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
      this.field_112187_a.func_112209_a(0.0F, 6.0F, -8.0F);
      this.field_112185_b = new C_101254_awp(this, 28, 8);
      this.field_112185_b.func_112203_a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
      this.field_112185_b.func_112209_a(0.0F, 5.0F, 2.0F);
   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      super.func_112025_a(var1, var2, var3, var4);
      this.field_112187_a.field_112213_d = 6.0F + ((C_100555_oo)var1).func_103541_j(var4) * 9.0F;
      this.field_112190_i = ((C_100555_oo)var1).func_103542_k(var4);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      this.field_112187_a.field_112211_f = this.field_112190_i;
   }
}
