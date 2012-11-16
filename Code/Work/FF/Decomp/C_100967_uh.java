
public class C_100967_uh extends C_100992_tt {

   public C_100967_uh(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111415_d);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.func_109349_a(var4, var5, var6) != C_100451_alf.field_106181_aV.field_106162_cm) {
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

         if(!var3.func_109352_c(var4, var5, var6)) {
            return false;
         }
      }

      if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         if(C_100451_alf.field_106203_ay.func_106023_b(var3, var4, var5, var6)) {
            --var1.field_111398_a;
            var3.func_109422_e(var4, var5, var6, C_100451_alf.field_106203_ay.field_106162_cm);
         }

         return true;
      }
   }
}
