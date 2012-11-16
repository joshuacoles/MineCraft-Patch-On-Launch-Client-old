
public class C_101043_sf extends C_100992_tt {

   public C_101043_sf(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111418_c);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 != 1) {
         return false;
      } else {
         ++var5;
         C_100255_ahq var11 = (C_100255_ahq)C_100451_alf.field_106089_V;
         int var12 = C_100650_jv.func_108910_c((double)(var2.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
         byte var13 = 0;
         byte var14 = 0;
         if(var12 == 0) {
            var14 = 1;
         }

         if(var12 == 1) {
            var13 = -1;
         }

         if(var12 == 2) {
            var14 = -1;
         }

         if(var12 == 3) {
            var13 = 1;
         }

         if(var2.func_103799_a(var4, var5, var6, var7, var1) && var2.func_103799_a(var4 + var13, var5, var6 + var14, var7, var1)) {
            if(var3.func_109352_c(var4, var5, var6) && var3.func_109352_c(var4 + var13, var5, var6 + var14) && var3.func_109348_t(var4, var5 - 1, var6) && var3.func_109348_t(var4 + var13, var5 - 1, var6 + var14)) {
               var3.func_109394_d(var4, var5, var6, var11.field_106162_cm, var12);
               if(var3.func_109349_a(var4, var5, var6) == var11.field_106162_cm) {
                  var3.func_109394_d(var4 + var13, var5, var6 + var14, var11.field_106162_cm, var12 + 8);
               }

               --var1.field_111398_a;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
