import java.util.List;

public class C_100965_ug extends C_100992_tt {

   public final String field_111000_a;


   protected C_100965_ug(int var1, String var2) {
      super(var1);
      this.field_111000_a = var2;
      this.field_110888_cg = 1;
      this.func_110802_a(C_101040_sq.field_111413_f);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var3.func_109349_a(var4, var5, var6) == C_100451_alf.field_106146_bb.field_106162_cm && var3.func_109357_g(var4, var5, var6) == 0) {
         if(var3.field_109557_J) {
            return true;
         } else {
            ((C_100125_aki)C_100451_alf.field_106146_bb).func_106328_d(var3, var4, var5, var6, this.field_110891_cf);
            var3.func_109492_a((C_101095_qg)null, 1005, var4, var5, var6, this.field_110891_cf);
            --var1.field_111398_a;
            return true;
         }
      } else {
         return false;
      }
   }

   public void func_110784_a(C_100994_tv var1, C_101095_qg var2, List var3, boolean var4) {
      var3.add("C418 - " + this.field_111000_a);
   }

   public C_100963_uf func_110794_e(C_100994_tv var1) {
      return C_100963_uf.field_111164_c;
   }
}
