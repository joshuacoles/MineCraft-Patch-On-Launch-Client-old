
public class C_101217_avb extends C_101231_avl {

   public C_101254_awp field_112046_a = (new C_101254_awp(this, 0, 0)).func_112204_b(64, 64);
   public C_101254_awp field_112044_b;
   public C_101254_awp field_112045_c;


   public C_101217_avb() {
      this.field_112046_a.func_112203_a(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.field_112046_a.field_112216_c = 1.0F;
      this.field_112046_a.field_112213_d = 7.0F;
      this.field_112046_a.field_112214_e = 15.0F;
      this.field_112045_c = (new C_101254_awp(this, 0, 0)).func_112204_b(64, 64);
      this.field_112045_c.func_112203_a(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.field_112045_c.field_112216_c = 8.0F;
      this.field_112045_c.field_112213_d = 7.0F;
      this.field_112045_c.field_112214_e = 15.0F;
      this.field_112044_b = (new C_101254_awp(this, 0, 19)).func_112204_b(64, 64);
      this.field_112044_b.func_112203_a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.field_112044_b.field_112216_c = 1.0F;
      this.field_112044_b.field_112213_d = 6.0F;
      this.field_112044_b.field_112214_e = 1.0F;
   }

   public void func_112043_a() {
      this.field_112045_c.field_112211_f = this.field_112046_a.field_112211_f;
      this.field_112046_a.func_112201_a(0.0625F);
      this.field_112045_c.func_112201_a(0.0625F);
      this.field_112044_b.func_112201_a(0.0625F);
   }
}
