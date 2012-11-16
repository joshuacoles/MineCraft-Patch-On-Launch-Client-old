import java.util.Random;

public class C_100225_aig extends C_100253_aht {

   protected C_100225_aig(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109015_l);
      float var3 = 0.4F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
   }

   protected boolean func_106376_d_(int var1) {
      return var1 == C_100451_alf.field_106082_H.field_106162_cm;
   }

   public int func_106029_a(int var1, int var2) {
      return this.field_106165_cl;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return -1;
   }

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      if(!var1.field_109557_J && var2.func_103780_bP() != null && var2.func_103780_bP().field_111397_c == C_100992_tt.field_110883_be.field_110891_cf) {
         var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
         this.func_106042_a(var1, var3, var4, var5, new C_100994_tv(C_100451_alf.field_106246_ab, 1, var6));
      } else {
         super.func_106026_a(var1, var2, var3, var4, var5, var6);
      }

   }
}
