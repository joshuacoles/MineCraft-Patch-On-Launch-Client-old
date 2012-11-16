import java.util.List;
import java.util.Random;

public class C_100458_akz extends C_100169_aja {

   public static final String[] field_106293_a = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick"};


   public C_100458_akz(int var1, boolean var2) {
      super(var1, var2, C_100664_afg.field_109009_e);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      int var3 = var2 & 7;
      return var3 == 0?(var1 <= 1?6:5):(var3 == 1?(var1 == 0?208:(var1 == 1?176:192)):(var3 == 2?4:(var3 == 3?16:(var3 == 4?C_100451_alf.field_106232_ao.field_106165_cl:(var3 == 5?C_100451_alf.field_106135_bp.field_106165_cl:6)))));
   }

   public int func_106024_a(int var1) {
      return this.func_106029_a(var1, 0);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106238_an.field_106162_cm;
   }

   protected C_100994_tv func_106044_f_(int var1) {
      return new C_100994_tv(C_100451_alf.field_106238_an.field_106162_cm, 2, var1 & 7);
   }

   public String func_106289_d(int var1) {
      if(var1 < 0 || var1 >= field_106293_a.length) {
         var1 = 0;
      }

      return super.func_106057_a() + "." + field_106293_a[var1];
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      if(var1 != C_100451_alf.field_106236_am.field_106162_cm) {
         for(int var4 = 0; var4 < 6; ++var4) {
            if(var4 != 2) {
               var3.add(new C_100994_tv(var1, 1, var4));
            }
         }

      }
   }

}
