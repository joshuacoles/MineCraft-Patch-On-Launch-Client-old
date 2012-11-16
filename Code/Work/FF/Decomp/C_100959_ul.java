
public class C_100959_ul extends C_100992_tt {

   private int field_110992_a;
   private int field_110991_b;


   public C_100959_ul(int var1, int var2, int var3) {
      super(var1);
      this.field_110992_a = var2;
      this.field_110991_b = var3;
      this.func_110802_a(C_101040_sq.field_111422_l);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 != 1) {
         return false;
      } else if(var2.func_103799_a(var4, var5, var6, var7, var1) && var2.func_103799_a(var4, var5 + 1, var6, var7, var1)) {
         int var11 = var3.func_109349_a(var4, var5, var6);
         if(var11 == this.field_110991_b && var3.func_109352_c(var4, var5 + 1, var6)) {
            var3.func_109422_e(var4, var5 + 1, var6, this.field_110992_a);
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
