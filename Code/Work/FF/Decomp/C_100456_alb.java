import java.util.List;
import java.util.Random;

public class C_100456_alb extends C_100253_aht {

   protected C_100456_alb(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109015_l);
      float var3 = 0.4F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
   }

   public int func_106029_a(int var1, int var2) {
      return var2 == 1?this.field_106165_cl:(var2 == 2?this.field_106165_cl + 16 + 1:(var2 == 0?this.field_106165_cl + 16:this.field_106165_cl));
   }

   public int func_106039_o() {
      double var1 = 0.5D;
      double var3 = 1.0D;
      return C_100875_xd.func_110398_a(var1, var3);
   }

   public int func_106025_g_(int var1) {
      return var1 == 0?16777215:C_100866_xa.func_110295_c();
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      return var5 == 0?16777215:var1.func_109362_a(var2, var4).func_112461_k();
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return var2.nextInt(8) == 0?C_100992_tt.field_110826_S.field_110891_cf:-1;
   }

   public int func_106012_a(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      if(!var1.field_109557_J && var2.func_103780_bP() != null && var2.func_103780_bP().field_111397_c == C_100992_tt.field_110883_be.field_110891_cf) {
         var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
         this.func_106042_a(var1, var3, var4, var5, new C_100994_tv(C_100451_alf.field_106244_aa, 1, var6));
      } else {
         super.func_106026_a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int func_106019_h(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109357_g(var2, var3, var4);
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      for(int var4 = 1; var4 < 3; ++var4) {
         var3.add(new C_100994_tv(var1, 1, var4));
      }

   }
}
