
public class C_100227_aid extends C_100200_aiq {

   public C_100227_aid(int var1) {
      super(var1, 184, C_100664_afg.field_109006_f);
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100423_amc();
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         boolean var6 = var1.func_109425_z(var2, var3, var4);
         int var7 = var1.func_109357_g(var2, var3, var4);
         boolean var8 = (var7 & 1) != 0;
         if(var6 && !var8) {
            C_100398_amm var9 = var1.func_109353_p(var2, var3, var4);
            if(var9 != null && var9 instanceof C_100423_amc) {
               ((C_100423_amc)var9).func_104856_a(var1);
            }

            var1.func_109441_d(var2, var3, var4, var7 | 1);
         } else if(!var6 && var8) {
            var1.func_109441_d(var2, var3, var4, var7 & -2);
         }
      }

   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      C_100423_amc var10 = (C_100423_amc)var1.func_109353_p(var2, var3, var4);
      if(var10 != null) {
         var5.func_103826_a(var10);
      }

      return true;
   }
}
