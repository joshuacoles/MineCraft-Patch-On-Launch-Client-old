
public class C_101012_tq extends C_100992_tt {

   private final Class field_111025_a;


   public C_101012_tq(int var1, Class var2) {
      super(var1);
      this.field_111025_a = var2;
      this.func_110802_a(C_101040_sq.field_111418_c);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         return false;
      } else if(var7 == 1) {
         return false;
      } else {
         int var11 = C_100015_i.field_105280_e[var7];
         C_100597_ll var12 = this.func_111024_a(var3, var4, var5, var6, var11);
         if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
            return false;
         } else {
            if(var12 != null && var12.func_104573_c()) {
               if(!var3.field_109557_J) {
                  var3.func_109513_d(var12);
               }

               --var1.field_111398_a;
            }

            return true;
         }
      }
   }

   private C_100597_ll func_111024_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return (C_100597_ll)(this.field_111025_a == C_100600_lq.class?new C_100600_lq(var1, var2, var3, var4, var5):(this.field_111025_a == C_100596_lm.class?new C_100596_lm(var1, var2, var3, var4, var5):null));
   }
}
