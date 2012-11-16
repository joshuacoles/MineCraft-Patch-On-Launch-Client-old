
public class C_101257_awk {

   private C_101242_awa[] field_112244_h;
   private C_101226_avo[] field_112245_i;
   public final float field_112243_a;
   public final float field_112241_b;
   public final float field_112242_c;
   public final float field_112239_d;
   public final float field_112240_e;
   public final float field_112237_f;
   public String field_112238_g;


   public C_101257_awk(C_101254_awp var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.field_112243_a = var4;
      this.field_112241_b = var5;
      this.field_112242_c = var6;
      this.field_112239_d = var4 + (float)var7;
      this.field_112240_e = var5 + (float)var8;
      this.field_112237_f = var6 + (float)var9;
      this.field_112244_h = new C_101242_awa[8];
      this.field_112245_i = new C_101226_avo[6];
      float var11 = var4 + (float)var7;
      float var12 = var5 + (float)var8;
      float var13 = var6 + (float)var9;
      var4 -= var10;
      var5 -= var10;
      var6 -= var10;
      var11 += var10;
      var12 += var10;
      var13 += var10;
      if(var1.field_112225_i) {
         float var14 = var11;
         var11 = var4;
         var4 = var14;
      }

      C_101242_awa var26 = new C_101242_awa(var4, var5, var6, 0.0F, 0.0F);
      C_101242_awa var15 = new C_101242_awa(var11, var5, var6, 0.0F, 8.0F);
      C_101242_awa var16 = new C_101242_awa(var11, var12, var6, 8.0F, 8.0F);
      C_101242_awa var17 = new C_101242_awa(var4, var12, var6, 8.0F, 0.0F);
      C_101242_awa var18 = new C_101242_awa(var4, var5, var13, 0.0F, 0.0F);
      C_101242_awa var19 = new C_101242_awa(var11, var5, var13, 0.0F, 8.0F);
      C_101242_awa var20 = new C_101242_awa(var11, var12, var13, 8.0F, 8.0F);
      C_101242_awa var21 = new C_101242_awa(var4, var12, var13, 8.0F, 0.0F);
      this.field_112244_h[0] = var26;
      this.field_112244_h[1] = var15;
      this.field_112244_h[2] = var16;
      this.field_112244_h[3] = var17;
      this.field_112244_h[4] = var18;
      this.field_112244_h[5] = var19;
      this.field_112244_h[6] = var20;
      this.field_112244_h[7] = var21;
      this.field_112245_i[0] = new C_101226_avo(new C_101242_awa[]{var19, var15, var16, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.field_112217_a, var1.field_112215_b);
      this.field_112245_i[1] = new C_101226_avo(new C_101242_awa[]{var26, var18, var21, var17}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.field_112217_a, var1.field_112215_b);
      this.field_112245_i[2] = new C_101226_avo(new C_101242_awa[]{var19, var18, var26, var15}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.field_112217_a, var1.field_112215_b);
      this.field_112245_i[3] = new C_101226_avo(new C_101242_awa[]{var16, var17, var21, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.field_112217_a, var1.field_112215_b);
      this.field_112245_i[4] = new C_101226_avo(new C_101242_awa[]{var15, var26, var17, var16}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.field_112217_a, var1.field_112215_b);
      this.field_112245_i[5] = new C_101226_avo(new C_101242_awa[]{var18, var19, var20, var21}, var2 + var9 + var7 + var9, var3 + var9, var2 + var9 + var7 + var9 + var7, var3 + var9 + var8, var1.field_112217_a, var1.field_112215_b);
      if(var1.field_112225_i) {
         C_101226_avo[] var22 = this.field_112245_i;
         int var23 = var22.length;

         for(int var24 = 0; var24 < var23; ++var24) {
            C_101226_avo var25 = var22[var24];
            var25.func_112191_a();
         }
      }

   }

   public void func_112236_a(C_100872_azb var1, float var2) {
      C_101226_avo[] var3 = this.field_112245_i;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         C_101226_avo var6 = var3[var5];
         var6.func_112192_a(var1, var2);
      }

   }

   public C_101257_awk func_112235_a(String var1) {
      this.field_112238_g = var1;
      return this;
   }
}
