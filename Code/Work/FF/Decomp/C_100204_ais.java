
public class C_100204_ais extends C_100186_aij {

   public C_100204_ais(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109008_d);
      this.func_106034_a(C_101040_sq.field_111415_d);
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return !var1.func_109350_f(var2, var3 - 1, var4).func_108983_a()?false:super.func_106023_b(var1, var2, var3, var4);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      return func_106311_c(var5)?null:(var5 != 2 && var5 != 0?C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + 0.375F), (double)var3, (double)var4, (double)((float)var2 + 0.625F), (double)((float)var3 + 1.5F), (double)(var4 + 1)):C_100412_amr.func_107892_a().func_107844_a((double)var2, (double)var3, (double)((float)var4 + 0.375F), (double)(var2 + 1), (double)((float)var3 + 1.5F), (double)((float)var4 + 0.625F)));
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = func_106302_e(var1.func_109357_g(var2, var3, var4));
      if(var5 != 2 && var5 != 0) {
         this.func_106008_a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
      }

   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return func_106311_c(var1.func_109357_g(var2, var3, var4));
   }

   public int func_106013_d() {
      return 21;
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = (C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3) % 4;
      var1.func_109488_c(var2, var3, var4, var6);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.func_109357_g(var2, var3, var4);
      if(func_106311_c(var10)) {
         var1.func_109488_c(var2, var3, var4, var10 & -5);
      } else {
         int var11 = (C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3) % 4;
         int var12 = func_106302_e(var10);
         if(var12 == (var11 + 2) % 4) {
            var10 = var11;
         }

         var1.func_109488_c(var2, var3, var4, var10 | 4);
      }

      var1.func_109492_a(var5, 1003, var2, var3, var4, 0);
      return true;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         boolean var7 = var1.func_109425_z(var2, var3, var4);
         if(var7 || var5 > 0 && C_100451_alf.field_106118_p[var5].func_106028_i() || var5 == 0) {
            if(var7 && !func_106311_c(var6)) {
               var1.func_109488_c(var2, var3, var4, var6 | 4);
               var1.func_109492_a((C_101095_qg)null, 1003, var2, var3, var4, 0);
            } else if(!var7 && func_106311_c(var6)) {
               var1.func_109488_c(var2, var3, var4, var6 & -5);
               var1.func_109492_a((C_101095_qg)null, 1003, var2, var3, var4, 0);
            }
         }

      }
   }

   public static boolean func_106311_c(int var0) {
      return (var0 & 4) != 0;
   }
}
