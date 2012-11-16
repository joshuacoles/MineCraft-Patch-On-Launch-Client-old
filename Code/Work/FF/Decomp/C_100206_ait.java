
public class C_100206_ait extends C_100451_alf {

   public C_100206_ait(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109008_d);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public C_100206_ait(int var1, int var2, C_100664_afg var3) {
      super(var1, var2, var3);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      boolean var5 = this.func_106355_d(var1, var2, var3, var4 - 1);
      boolean var6 = this.func_106355_d(var1, var2, var3, var4 + 1);
      boolean var7 = this.func_106355_d(var1, var2 - 1, var3, var4);
      boolean var8 = this.func_106355_d(var1, var2 + 1, var3, var4);
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

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      boolean var5 = this.func_106355_d(var1, var2, var3, var4 - 1);
      boolean var6 = this.func_106355_d(var1, var2, var3, var4 + 1);
      boolean var7 = this.func_106355_d(var1, var2 - 1, var3, var4);
      boolean var8 = this.func_106355_d(var1, var2 + 1, var3, var4);
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

      this.func_106008_a(var9, 0.0F, var11, var10, 1.0F, var12);
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return false;
   }

   public int func_106013_d() {
      return 11;
   }

   public boolean func_106355_d(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3, var4);
      if(var5 != this.field_106162_cm && var5 != C_100451_alf.field_106127_by.field_106162_cm) {
         C_100451_alf var6 = C_100451_alf.field_106118_p[var5];
         return var6 != null && var6.field_106204_cB.func_108980_k() && var6.func_105977_b()?var6.field_106204_cB != C_100664_afg.field_108998_A:false;
      } else {
         return true;
      }
   }

   public static boolean func_106354_c(int var0) {
      return var0 == C_100451_alf.field_106147_bc.field_106162_cm || var0 == C_100451_alf.field_106241_bE.field_106162_cm;
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 != 1 && var5 != 0?true:super.func_105976_a(var1, var2, var3, var4, var5);
   }
}
