
public class C_101007_tn extends C_100992_tt {

   public C_101007_tn(int var1) {
      super(var1);
      this.field_110888_cg = 1;
      this.func_110804_e(64);
      this.func_110802_a(C_101040_sq.field_111427_i);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         --var5;
      }

      if(var7 == 1) {
         ++var5;
      }

      if(var7 == 2) {
         --var6;
      }

      if(var7 == 3) {
         ++var6;
      }

      if(var7 == 4) {
         --var4;
      }

      if(var7 == 5) {
         ++var4;
      }

      if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.func_109349_a(var4, var5, var6);
         if(var11 == 0) {
            var3.func_109476_a((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, field_110833_d.nextFloat() * 0.4F + 0.8F);
            var3.func_109422_e(var4, var5, var6, C_100451_alf.field_106222_au.field_106162_cm);
         }

         var1.func_111363_a(1, var2);
         return true;
      }
   }
}
