import java.util.List;

public class C_100470_aks extends C_100451_alf {

   public static final String[] field_106454_a = new String[]{"default", "mossy", "cracked", "chiseled"};


   public C_100470_aks(int var1) {
      super(var1, 54, C_100664_afg.field_109009_e);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      switch(var2) {
      case 1:
         return 100;
      case 2:
         return 101;
      case 3:
         return 213;
      default:
         return 54;
      }
   }

   public int func_106004_b(int var1) {
      return var1;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      for(int var4 = 0; var4 < 4; ++var4) {
         var3.add(new C_100994_tv(var1, 1, var4));
      }

   }

}
