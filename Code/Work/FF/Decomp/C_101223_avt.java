
public class C_101223_avt extends C_101231_avl {

   private C_101254_awp[] field_112072_a = new C_101254_awp[7];
   private C_101254_awp[] field_112070_b;
   private float[] field_112071_c = new float[7];
   private static final int[][] field_112068_d = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] field_112069_e = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};


   public C_101223_avt() {
      float var1 = -3.5F;

      for(int var2 = 0; var2 < this.field_112072_a.length; ++var2) {
         this.field_112072_a[var2] = new C_101254_awp(this, field_112069_e[var2][0], field_112069_e[var2][1]);
         this.field_112072_a[var2].func_112205_a((float)field_112068_d[var2][0] * -0.5F, 0.0F, (float)field_112068_d[var2][2] * -0.5F, field_112068_d[var2][0], field_112068_d[var2][1], field_112068_d[var2][2]);
         this.field_112072_a[var2].func_112209_a(0.0F, (float)(24 - field_112068_d[var2][1]), var1);
         this.field_112071_c[var2] = var1;
         if(var2 < this.field_112072_a.length - 1) {
            var1 += (float)(field_112068_d[var2][2] + field_112068_d[var2 + 1][2]) * 0.5F;
         }
      }

      this.field_112070_b = new C_101254_awp[3];
      this.field_112070_b[0] = new C_101254_awp(this, 20, 0);
      this.field_112070_b[0].func_112205_a(-5.0F, 0.0F, (float)field_112068_d[2][2] * -0.5F, 10, 8, field_112068_d[2][2]);
      this.field_112070_b[0].func_112209_a(0.0F, 16.0F, this.field_112071_c[2]);
      this.field_112070_b[1] = new C_101254_awp(this, 20, 11);
      this.field_112070_b[1].func_112205_a(-3.0F, 0.0F, (float)field_112068_d[4][2] * -0.5F, 6, 4, field_112068_d[4][2]);
      this.field_112070_b[1].func_112209_a(0.0F, 20.0F, this.field_112071_c[4]);
      this.field_112070_b[2] = new C_101254_awp(this, 20, 18);
      this.field_112070_b[2].func_112205_a(-3.0F, 0.0F, (float)field_112068_d[4][2] * -0.5F, 6, 5, field_112068_d[1][2]);
      this.field_112070_b[2].func_112209_a(0.0F, 19.0F, this.field_112071_c[1]);
   }

   public void func_112027_a(C_100730_lb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.func_112024_a(var2, var3, var4, var5, var6, var7, var1);
      C_101254_awp[] var8 = this.field_112072_a;
      int var9 = var8.length;

      int var10;
      C_101254_awp var11;
      for(var10 = 0; var10 < var9; ++var10) {
         var11 = var8[var10];
         var11.func_112201_a(var7);
      }

      var8 = this.field_112070_b;
      var9 = var8.length;

      for(var10 = 0; var10 < var9; ++var10) {
         var11 = var8[var10];
         var11.func_112201_a(var7);
      }

   }

   public void func_112024_a(float var1, float var2, float var3, float var4, float var5, float var6, C_100730_lb var7) {
      for(int var8 = 0; var8 < this.field_112072_a.length; ++var8) {
         this.field_112072_a[var8].field_112212_g = C_100650_jv.func_108928_b(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (float)(1 + Math.abs(var8 - 2));
         this.field_112072_a[var8].field_112216_c = C_100650_jv.func_108924_a(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * (float)Math.abs(var8 - 2);
      }

      this.field_112070_b[0].field_112212_g = this.field_112072_a[2].field_112212_g;
      this.field_112070_b[1].field_112212_g = this.field_112072_a[4].field_112212_g;
      this.field_112070_b[1].field_112216_c = this.field_112072_a[4].field_112216_c;
      this.field_112070_b[2].field_112212_g = this.field_112072_a[1].field_112212_g;
      this.field_112070_b[2].field_112216_c = this.field_112072_a[1].field_112216_c;
   }

}
