
public class C_101233_avj extends C_101231_avl {

   C_101254_awp[] field_112085_a = new C_101254_awp[8];
   C_101254_awp field_112084_b;


   public C_101233_avj() {
      for(int var1 = 0; var1 < this.field_112085_a.length; ++var1) {
         byte var2 = 0;
         int var3 = var1;
         if(var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if(var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         this.field_112085_a[var1] = new C_101254_awp(this, var2, var3);
         this.field_112085_a[var1].func_112205_a(-4.0F, (float)(16 + var1), -4.0F, 8, 1, 8);
      }

      this.field_112084_b = new C_101254_awp(this, 0, 16);
      this.field_112084_b.func_112205_a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
   }

   public int func_112083_a() {
      return 5;
   }

   public void func_112025_a(C_100595_ln var1, float var2, float var3, float var4) {
      C_101109_pr var5 = (C_101109_pr)var1;
      float var6 = var5.field_103630_d + (var5.field_103633_c - var5.field_103630_d) * var4;
      if(var6 < 0.0F) {
         var6 = 0.0F;
      }

      for(int var7 = 0; var7 < this.field_112085_a.length; ++var7) {
         this.field_112085_a[var7].field_112213_d = (float)(-(4 - var7)) * var6 * 1.7F;
      }

   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      this.field_112084_b.func_112201_a(var7);
      C_101254_awp[] var8 = this.field_112085_a;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         C_101254_awp var11 = var8[var10];
         var11.func_112201_a(var7);
      }

   }
}
