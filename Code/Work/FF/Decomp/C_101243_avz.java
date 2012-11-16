
public class C_101243_avz extends C_101231_avl {

   C_101254_awp field_112131_a;
   C_101254_awp[] field_112130_b = new C_101254_awp[8];


   public C_101243_avz() {
      byte var1 = -16;
      this.field_112131_a = new C_101254_awp(this, 0, 0);
      this.field_112131_a.func_112205_a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      this.field_112131_a.field_112213_d += (float)(24 + var1);

      for(int var2 = 0; var2 < this.field_112130_b.length; ++var2) {
         this.field_112130_b[var2] = new C_101254_awp(this, 48, 0);
         double var3 = (double)var2 * 3.141592653589793D * 2.0D / (double)this.field_112130_b.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.field_112130_b[var2].func_112205_a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.field_112130_b[var2].field_112216_c = var5;
         this.field_112130_b[var2].field_112214_e = var6;
         this.field_112130_b[var2].field_112213_d = (float)(31 + var1);
         var3 = (double)var2 * 3.141592653589793D * -2.0D / (double)this.field_112130_b.length + 1.5707963267948966D;
         this.field_112130_b[var2].field_112212_g = (float)var3;
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      C_101254_awp[] var8 = this.field_112130_b;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         C_101254_awp var11 = var8[var10];
         var11.field_112211_f = var3;
      }

   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112131_a.func_112201_a(var7);
      C_101254_awp[] var8 = this.field_112130_b;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         C_101254_awp var11 = var8[var10];
         var11.func_112201_a(var7);
      }

   }
}
