import java.util.List;
import java.util.Random;

public class C_100428_alw extends C_100169_aja {

   public static final String[] field_106292_a = new String[]{"oak", "spruce", "birch", "jungle"};


   public C_100428_alw(int var1, boolean var2) {
      super(var1, var2, C_100664_afg.field_109008_d);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      switch(var2 & 7) {
      case 1:
         return 198;
      case 2:
         return 214;
      case 3:
         return 199;
      default:
         return 4;
      }
   }

   public int func_106024_a(int var1) {
      return this.func_106029_a(var1, 0);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106213_bR.field_106162_cm;
   }

   protected C_100994_tv func_106044_f_(int var1) {
      return new C_100994_tv(C_100451_alf.field_106213_bR.field_106162_cm, 2, var1 & 7);
   }

   public String func_106289_d(int var1) {
      if(var1 < 0 || var1 >= field_106292_a.length) {
         var1 = 0;
      }

      return super.func_106057_a() + "." + field_106292_a[var1];
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      if(var1 != C_100451_alf.field_106233_bQ.field_106162_cm) {
         for(int var4 = 0; var4 < 4; ++var4) {
            var3.add(new C_100994_tv(var1, 1, var4));
         }

      }
   }

}
