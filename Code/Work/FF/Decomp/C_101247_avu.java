
public class C_101247_avu extends C_101231_avl {

   public C_101254_awp field_112143_a;


   public C_101247_avu() {
      this(0, 35, 64, 64);
   }

   public C_101247_avu(int var1, int var2, int var3, int var4) {
      this.field_112029_t = var3;
      this.field_112028_u = var4;
      this.field_112143_a = new C_101254_awp(this, var1, var2);
      this.field_112143_a.func_112203_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      this.field_112143_a.func_112209_a(0.0F, 0.0F, 0.0F);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112143_a.func_112201_a(var7);
   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      super.func_112024_a(var1, var2, var3, var4, var5, var6, var7);
      this.field_112143_a.field_112212_g = var4 / 57.295776F;
      this.field_112143_a.field_112211_f = var5 / 57.295776F;
   }
}
