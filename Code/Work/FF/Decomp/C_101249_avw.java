
public class C_101249_avw extends C_101231_avl {

   C_101254_awp field_112152_a;
   C_101254_awp field_112150_b;
   C_101254_awp field_112151_c;
   C_101254_awp field_112149_d;


   public C_101249_avw(int var1) {
      this.field_112152_a = new C_101254_awp(this, 0, var1);
      this.field_112152_a.func_112205_a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
      if(var1 > 0) {
         this.field_112152_a = new C_101254_awp(this, 0, var1);
         this.field_112152_a.func_112205_a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
         this.field_112150_b = new C_101254_awp(this, 32, 0);
         this.field_112150_b.func_112205_a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
         this.field_112151_c = new C_101254_awp(this, 32, 4);
         this.field_112151_c.func_112205_a(1.25F, 18.0F, -3.5F, 2, 2, 2);
         this.field_112149_d = new C_101254_awp(this, 32, 8);
         this.field_112149_d.func_112205_a(0.0F, 21.0F, -3.5F, 1, 1, 1);
      }

   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112152_a.func_112201_a(var7);
      if(this.field_112150_b != null) {
         this.field_112150_b.func_112201_a(var7);
         this.field_112151_c.func_112201_a(var7);
         this.field_112149_d.func_112201_a(var7);
      }

   }
}
