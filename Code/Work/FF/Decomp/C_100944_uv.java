
public class C_100944_uv extends C_100992_tt {

   private int field_110977_a;


   public C_100944_uv(int var1, C_100451_alf var2) {
      super(var1);
      this.field_110977_a = var2.field_106162_cm;
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.func_109349_a(var4, var5, var6);
      if(var11 == C_100451_alf.field_106181_aV.field_106162_cm) {
         var7 = 1;
      } else if(var11 != C_100451_alf.field_106128_bx.field_106162_cm && var11 != C_100451_alf.field_106244_aa.field_106162_cm && var11 != C_100451_alf.field_106246_ab.field_106162_cm) {
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
      }

      if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else if(var1.field_111398_a == 0) {
         return false;
      } else {
         if(var3.func_109501_a(this.field_110977_a, var4, var5, var6, false, var7, (C_100730_lb)null)) {
            C_100451_alf var12 = C_100451_alf.field_106118_p[this.field_110977_a];
            if(var3.func_109422_e(var4, var5, var6, this.field_110977_a)) {
               if(var3.func_109349_a(var4, var5, var6) == this.field_110977_a) {
                  C_100451_alf.field_106118_p[this.field_110977_a].func_106065_a(var3, var4, var5, var6, var7, var8, var9, var10);
                  C_100451_alf.field_106118_p[this.field_110977_a].func_106047_a(var3, var4, var5, var6, var2);
               }

               var3.func_109476_a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var12.field_106150_cz.func_107920_b(), (var12.field_106150_cz.func_107921_c() + 1.0F) / 2.0F, var12.field_106150_cz.func_107918_d() * 0.8F);
               --var1.field_111398_a;
            }
         }

         return true;
      }
   }
}
