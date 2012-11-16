import java.util.List;

public class C_100431_alt extends C_100451_alf {

   public static final String[] field_106405_a = new String[]{"normal", "mossy"};


   public C_100431_alt(int var1, C_100451_alf var2) {
      super(var1, var2.field_106165_cl, var2.field_106204_cB);
      this.func_106006_c(var2.field_106163_cn);
      this.func_106064_b(var2.field_106160_co / 3.0F);
      this.func_106014_a(var2.field_106150_cz);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      return var2 == 1?C_100451_alf.field_106212_ar.field_106165_cl:super.func_106024_a(var1);
   }

   public int func_106013_d() {
      return 32;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      boolean var5 = this.func_106404_d(var1, var2, var3, var4 - 1);
      boolean var6 = this.func_106404_d(var1, var2, var3, var4 + 1);
      boolean var7 = this.func_106404_d(var1, var2 - 1, var3, var4);
      boolean var8 = this.func_106404_d(var1, var2 + 1, var3, var4);
      float var9 = 0.25F;
      float var10 = 0.75F;
      float var11 = 0.25F;
      float var12 = 0.75F;
      float var13 = 1.0F;
      if(var5) {
         var11 = 0.0F;
      }

      if(var6) {
         var12 = 1.0F;
      }

      if(var7) {
         var9 = 0.0F;
      }

      if(var8) {
         var10 = 1.0F;
      }

      if(var5 && var6 && !var7 && !var8) {
         var13 = 0.8125F;
         var9 = 0.3125F;
         var10 = 0.6875F;
      } else if(!var5 && !var6 && var7 && var8) {
         var13 = 0.8125F;
         var11 = 0.3125F;
         var12 = 0.6875F;
      }

      this.func_106008_a(var9, 0.0F, var11, var10, var13, var12);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      boolean var5 = this.func_106404_d(var1, var2, var3, var4 - 1);
      boolean var6 = this.func_106404_d(var1, var2, var3, var4 + 1);
      boolean var7 = this.func_106404_d(var1, var2 - 1, var3, var4);
      boolean var8 = this.func_106404_d(var1, var2 + 1, var3, var4);
      float var9 = 0.375F;
      float var10 = 0.625F;
      float var11 = 0.375F;
      float var12 = 0.625F;
      if(var5) {
         var11 = 0.0F;
      }

      if(var6) {
         var12 = 1.0F;
      }

      if(var7) {
         var9 = 0.0F;
      }

      if(var8) {
         var10 = 1.0F;
      }

      return C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var9), (double)var3, (double)((float)var4 + var11), (double)((float)var2 + var10), (double)((float)var3 + 1.5F), (double)((float)var4 + var12));
   }

   public boolean func_106404_d(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3, var4);
      if(var5 != this.field_106162_cm && var5 != C_100451_alf.field_106127_by.field_106162_cm) {
         C_100451_alf var6 = C_100451_alf.field_106118_p[var5];
         return var6 != null && var6.field_106204_cB.func_108980_k() && var6.func_105977_b()?var6.field_106204_cB != C_100664_afg.field_108998_A:false;
      } else {
         return true;
      }
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
   }

   public int func_106004_b(int var1) {
      return var1;
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 == 0?super.func_105976_a(var1, var2, var3, var4, var5):true;
   }

}
