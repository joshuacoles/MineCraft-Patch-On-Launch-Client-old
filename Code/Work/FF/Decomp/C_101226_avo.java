
public class C_101226_avo {

   public C_101242_awa[] field_112195_a;
   public int field_112193_b;
   private boolean field_112194_c;


   public C_101226_avo(C_101242_awa[] var1) {
      this.field_112193_b = 0;
      this.field_112194_c = false;
      this.field_112195_a = var1;
      this.field_112193_b = var1.length;
   }

   public C_101226_avo(C_101242_awa[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].func_112196_a((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].func_112196_a((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].func_112196_a((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].func_112196_a((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public void func_112191_a() {
      C_101242_awa[] var1 = new C_101242_awa[this.field_112195_a.length];

      for(int var2 = 0; var2 < this.field_112195_a.length; ++var2) {
         var1[var2] = this.field_112195_a[this.field_112195_a.length - var2 - 1];
      }

      this.field_112195_a = var1;
   }

   public void func_112192_a(C_100872_azb var1, float var2) {
      C_100387_amw var3 = this.field_112195_a[1].field_112199_a.func_107854_a(this.field_112195_a[0].field_112199_a);
      C_100387_amw var4 = this.field_112195_a[1].field_112199_a.func_107854_a(this.field_112195_a[2].field_112199_a);
      C_100387_amw var5 = var4.func_107852_c(var3).func_107865_a();
      var1.func_110330_b();
      if(this.field_112194_c) {
         var1.func_110323_b(-((float)var5.field_107872_c), -((float)var5.field_107869_d), -((float)var5.field_107870_e));
      } else {
         var1.func_110323_b((float)var5.field_107872_c, (float)var5.field_107869_d, (float)var5.field_107870_e);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         C_101242_awa var7 = this.field_112195_a[var6];
         var1.func_110322_a((double)((float)var7.field_112199_a.field_107872_c * var2), (double)((float)var7.field_112199_a.field_107869_d * var2), (double)((float)var7.field_112199_a.field_107870_e * var2), (double)var7.field_112197_b, (double)var7.field_112198_c);
      }

      var1.func_110329_a();
   }
}
