
public class C_101219_auz extends C_101231_avl {

   public C_101254_awp[] field_112054_a = new C_101254_awp[5];


   public C_101219_auz() {
      this.field_112054_a[0] = new C_101254_awp(this, 0, 8);
      this.field_112054_a[1] = new C_101254_awp(this, 0, 0);
      this.field_112054_a[2] = new C_101254_awp(this, 0, 0);
      this.field_112054_a[3] = new C_101254_awp(this, 0, 0);
      this.field_112054_a[4] = new C_101254_awp(this, 0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.field_112054_a[0].func_112203_a((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
      this.field_112054_a[0].func_112209_a(0.0F, (float)var4, 0.0F);
      this.field_112054_a[1].func_112203_a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_112054_a[1].func_112209_a((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.field_112054_a[2].func_112203_a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_112054_a[2].func_112209_a((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.field_112054_a[3].func_112203_a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_112054_a[3].func_112209_a(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.field_112054_a[4].func_112203_a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_112054_a[4].func_112209_a(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.field_112054_a[0].field_112211_f = 1.5707964F;
      this.field_112054_a[1].field_112212_g = 4.712389F;
      this.field_112054_a[2].field_112212_g = 1.5707964F;
      this.field_112054_a[3].field_112212_g = 3.1415927F;
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      for(int var8 = 0; var8 < 5; ++var8) {
         this.field_112054_a[var8].func_112201_a(var7);
      }

   }
}
