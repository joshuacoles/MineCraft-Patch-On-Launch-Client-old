import java.util.List;

public class C_100427_alx extends C_100451_alf {

   public static final String[] field_106403_a = new String[]{"oak", "spruce", "birch", "jungle"};


   public C_100427_alx(int var1) {
      super(var1, 4, C_100664_afg.field_109008_d);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      switch(var2) {
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

   public int func_106004_b(int var1) {
      return var1;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
      var3.add(new C_100994_tv(var1, 1, 2));
      var3.add(new C_100994_tv(var1, 1, 3));
   }

}
