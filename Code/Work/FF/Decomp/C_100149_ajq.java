import java.util.Random;

public class C_100149_ajq extends C_100451_alf {

   protected C_100149_ajq(int var1) {
      super(var1, C_100664_afg.field_108998_A);
      this.field_106165_cl = 136;
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      return var1 != 1 && var1 != 0?136:137;
   }

   public int func_106024_a(int var1) {
      return var1 != 1 && var1 != 0?136:137;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110876_bf.field_110891_cf;
   }

   public int func_106063_a(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int func_106012_a(int var1, Random var2) {
      int var3 = this.func_106063_a(var2) + var2.nextInt(1 + var1);
      if(var3 > 9) {
         var3 = 9;
      }

      return var3;
   }
}
