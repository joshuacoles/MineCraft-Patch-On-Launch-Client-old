
public class C_101016_te extends C_100992_tt {

   private C_100664_afg field_111029_a;


   public C_101016_te(int var1, C_100664_afg var2) {
      super(var1);
      this.field_111029_a = var2;
      this.field_110888_cg = 1;
      this.func_110802_a(C_101040_sq.field_111415_d);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 != 1) {
         return false;
      } else {
         ++var5;
         C_100451_alf var11;
         if(this.field_111029_a == C_100664_afg.field_109008_d) {
            var11 = C_100451_alf.field_106200_aH;
         } else {
            var11 = C_100451_alf.field_106191_aO;
         }

         if(var2.func_103799_a(var4, var5, var6, var7, var1) && var2.func_103799_a(var4, var5 + 1, var6, var7, var1)) {
            if(!var11.func_106023_b(var3, var4, var5, var6)) {
               return false;
            } else {
               int var12 = C_100650_jv.func_108910_c((double)((var2.field_103236_z + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
               func_111028_a(var3, var4, var5, var6, var12, var11);
               --var1.field_111398_a;
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public static void func_111028_a(C_100873_xe var0, int var1, int var2, int var3, int var4, C_100451_alf var5) {
      byte var6 = 0;
      byte var7 = 0;
      if(var4 == 0) {
         var7 = 1;
      }

      if(var4 == 1) {
         var6 = -1;
      }

      if(var4 == 2) {
         var7 = -1;
      }

      if(var4 == 3) {
         var6 = 1;
      }

      int var8 = (var0.func_109360_s(var1 - var6, var2, var3 - var7)?1:0) + (var0.func_109360_s(var1 - var6, var2 + 1, var3 - var7)?1:0);
      int var9 = (var0.func_109360_s(var1 + var6, var2, var3 + var7)?1:0) + (var0.func_109360_s(var1 + var6, var2 + 1, var3 + var7)?1:0);
      boolean var10 = var0.func_109349_a(var1 - var6, var2, var3 - var7) == var5.field_106162_cm || var0.func_109349_a(var1 - var6, var2 + 1, var3 - var7) == var5.field_106162_cm;
      boolean var11 = var0.func_109349_a(var1 + var6, var2, var3 + var7) == var5.field_106162_cm || var0.func_109349_a(var1 + var6, var2 + 1, var3 + var7) == var5.field_106162_cm;
      boolean var12 = false;
      if(var10 && !var11) {
         var12 = true;
      } else if(var9 > var8) {
         var12 = true;
      }

      var0.field_109579_s = true;
      var0.func_109394_d(var1, var2, var3, var5.field_106162_cm, var4);
      var0.func_109394_d(var1, var2 + 1, var3, var5.field_106162_cm, 8 | (var12?1:0));
      var0.field_109579_s = false;
      var0.func_109460_h(var1, var2, var3, var5.field_106162_cm);
      var0.func_109460_h(var1, var2 + 1, var3, var5.field_106162_cm);
   }
}
