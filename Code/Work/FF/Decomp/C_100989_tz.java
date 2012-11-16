
public class C_100989_tz extends C_100992_tt {

   public int field_111003_a;


   public C_100989_tz(int var1, int var2) {
      super(var1);
      this.field_110888_cg = 1;
      this.field_111003_a = var2;
      this.func_110802_a(C_101040_sq.field_111416_e);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var3.func_109349_a(var4, var5, var6);
      if(C_100127_akg.func_106259_d(var11)) {
         if(!var3.field_109557_J) {
            var3.func_109513_d(new C_100590_ph(var3, (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_111003_a));
         }

         --var1.field_111398_a;
         return true;
      } else {
         return false;
      }
   }
}
