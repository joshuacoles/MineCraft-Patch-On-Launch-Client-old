
public class C_100980_uo extends C_100992_tt {

   public C_100980_uo(int var1) {
      super(var1);
      this.field_110888_cg = 16;
      this.func_110802_a(C_101040_sq.field_111418_c);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         return false;
      } else if(!var3.func_109350_f(var4, var5, var6).func_108983_a()) {
         return false;
      } else {
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
         } else if(!C_100451_alf.field_106199_aG.func_106023_b(var3, var4, var5, var6)) {
            return false;
         } else {
            if(var7 == 1) {
               int var11 = C_100650_jv.func_108910_c((double)((var2.field_103236_z + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
               var3.func_109394_d(var4, var5, var6, C_100451_alf.field_106199_aG.field_106162_cm, var11);
            } else {
               var3.func_109394_d(var4, var5, var6, C_100451_alf.field_106188_aL.field_106162_cm, var7);
            }

            --var1.field_111398_a;
            C_100414_amj var12 = (C_100414_amj)var3.func_109353_p(var4, var5, var6);
            if(var12 != null) {
               var2.func_103826_a(var12);
            }

            return true;
         }
      }
   }
}
