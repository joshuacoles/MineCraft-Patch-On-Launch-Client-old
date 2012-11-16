import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class C_100809_jc {

   public final int field_109918_e;
   private final String field_109921_a;
   public boolean field_109915_f;
   public String field_109916_g;
   private final C_100814_jg field_109919_b;
   private static NumberFormat field_109920_c = NumberFormat.getIntegerInstance(Locale.US);
   public static C_100814_jg field_109923_h = new C_100813_jd();
   private static DecimalFormat field_109917_d = new DecimalFormat("########0.00");
   public static C_100814_jg field_109924_i = new C_100812_je();
   public static C_100814_jg field_109922_j = new C_100815_jf();


   public C_100809_jc(int var1, String var2, C_100814_jg var3) {
      this.field_109915_f = false;
      this.field_109918_e = var1;
      this.field_109921_a = var2;
      this.field_109919_b = var3;
   }

   public C_100809_jc(int var1, String var2) {
      this(var1, var2, field_109923_h);
   }

   public C_100809_jc func_109914_h() {
      this.field_109915_f = true;
      return this;
   }

   public C_100809_jc func_109909_g() {
      if(C_100818_jh.field_110028_a.containsKey(Integer.valueOf(this.field_109918_e))) {
         throw new RuntimeException("Duplicate stat id: \"" + ((C_100809_jc)C_100818_jh.field_110028_a.get(Integer.valueOf(this.field_109918_e))).field_109921_a + "\" and \"" + this.field_109921_a + "\" at id " + this.field_109918_e);
      } else {
         C_100818_jh.field_110026_b.add(this);
         C_100818_jh.field_110028_a.put(Integer.valueOf(this.field_109918_e), this);
         this.field_109916_g = C_100817_ji.func_110001_a(this.field_109918_e);
         return this;
      }
   }

   public boolean func_109910_d() {
      return false;
   }

   public String func_109911_a(int var1) {
      return this.field_109919_b.func_110000_a(var1);
   }

   public String func_109913_i() {
      return this.field_109921_a;
   }

   public String toString() {
      return C_100359_bd.func_107638_a(this.field_109921_a);
   }

   // $FF: synthetic method
   static NumberFormat func_109908_j() {
      return field_109920_c;
   }

   // $FF: synthetic method
   static DecimalFormat func_109912_k() {
      return field_109917_d;
   }

}
