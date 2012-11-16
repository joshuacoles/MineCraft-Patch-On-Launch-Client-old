import java.util.List;

public class C_100477_ako extends C_100451_alf {

   public static final String[] field_106455_a = new String[]{"default", "chiseled", "smooth"};


   public C_100477_ako(int var1) {
      super(var1, 192, C_100664_afg.field_109009_e);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      return var1 != 1 && (var1 != 0 || var2 != 1 && var2 != 2)?(var1 == 0?208:(var2 == 1?229:(var2 == 2?230:192))):176;
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl - 16:(var1 == 0?this.field_106165_cl + 16:this.field_106165_cl);
   }

   public int func_106004_b(int var1) {
      return var1;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
      var3.add(new C_100994_tv(var1, 1, 2));
   }

}
