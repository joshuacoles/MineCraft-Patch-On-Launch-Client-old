import java.util.Random;

public class C_100162_aiz extends C_100173_ajc {

   public C_100162_aiz(int var1, int var2) {
      super(var1, var2);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      if(var3 > 3) {
         var3 = 3;
      }

      return var2.nextInt(10 - var3 * 3) == 0?C_100992_tt.field_110952_ap.field_110891_cf:this.field_106162_cm;
   }
}
