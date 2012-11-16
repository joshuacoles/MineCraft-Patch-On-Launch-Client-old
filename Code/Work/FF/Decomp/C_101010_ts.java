
public class C_101010_ts extends C_100992_tt {

   protected C_100991_tu field_111023_a;


   public C_101010_ts(int var1, C_100991_tu var2) {
      super(var1);
      this.field_111023_a = var2;
      this.field_110888_cg = 1;
      this.func_110804_e(var2.func_111321_a());
      this.func_110802_a(C_101040_sq.field_111427_i);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.func_109349_a(var4, var5, var6);
         int var12 = var3.func_109349_a(var4, var5 + 1, var6);
         if((var7 == 0 || var12 != 0 || var11 != C_100451_alf.field_106121_x.field_106162_cm) && var11 != C_100451_alf.field_106120_y.field_106162_cm) {
            return false;
         } else {
            C_100451_alf var13 = C_100451_alf.field_106196_aD;
            var3.func_109476_a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var13.field_106150_cz.func_107922_e(), (var13.field_106150_cz.func_107921_c() + 1.0F) / 2.0F, var13.field_106150_cz.func_107918_d() * 0.8F);
            if(var3.field_109557_J) {
               return true;
            } else {
               var3.func_109422_e(var4, var5, var6, var13.field_106162_cm);
               var1.func_111363_a(1, var2);
               return true;
            }
         }
      }
   }

   public boolean func_110763_n_() {
      return true;
   }

   public String func_111022_g() {
      return this.field_111023_a.toString();
   }
}
