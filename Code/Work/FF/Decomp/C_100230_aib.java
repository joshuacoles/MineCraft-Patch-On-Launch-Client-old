import java.util.List;

public class C_100230_aib extends C_100451_alf {

   public C_100230_aib() {
      super(35, 64, C_100664_afg.field_109013_n);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      if(var2 == 0) {
         return this.field_106165_cl;
      } else {
         var2 = ~(var2 & 15);
         return 113 + ((var2 & 8) >> 3) + (var2 & 7) * 16;
      }
   }

   public int func_106004_b(int var1) {
      return var1;
   }

   public static int func_106367_e_(int var0) {
      return ~var0 & 15;
   }

   public static int func_106368_d(int var0) {
      return ~var0 & 15;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      for(int var4 = 0; var4 < 16; ++var4) {
         var3.add(new C_100994_tv(var1, 1, var4));
      }

   }
}
