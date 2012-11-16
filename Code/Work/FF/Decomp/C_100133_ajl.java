import java.util.Random;

public class C_100133_ajl extends C_100451_alf {

   public C_100133_ajl(int var1, int var2, C_100664_afg var3) {
      super(var1, var2, var3);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106012_a(int var1, Random var2) {
      return C_100650_jv.func_108923_a(this.func_106063_a(var2) + var2.nextInt(var1 + 1), 1, 4);
   }

   public int func_106063_a(Random var1) {
      return 2 + var1.nextInt(3);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110899_aT.field_110891_cf;
   }
}
