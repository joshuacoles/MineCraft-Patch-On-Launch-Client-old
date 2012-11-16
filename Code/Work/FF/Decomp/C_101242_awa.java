
public class C_101242_awa {

   public C_100387_amw field_112199_a;
   public float field_112197_b;
   public float field_112198_c;


   public C_101242_awa(float var1, float var2, float var3, float var4, float var5) {
      this(C_100387_amw.func_107858_a((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public C_101242_awa func_112196_a(float var1, float var2) {
      return new C_101242_awa(this, var1, var2);
   }

   public C_101242_awa(C_101242_awa var1, float var2, float var3) {
      this.field_112199_a = var1.field_112199_a;
      this.field_112197_b = var2;
      this.field_112198_c = var3;
   }

   public C_101242_awa(C_100387_amw var1, float var2, float var3) {
      this.field_112199_a = var1;
      this.field_112197_b = var2;
      this.field_112198_c = var3;
   }
}
