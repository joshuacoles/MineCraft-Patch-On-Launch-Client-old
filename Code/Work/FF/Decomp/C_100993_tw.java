
public class C_100993_tw extends C_100945_uu {

   public C_100993_tw(int var1) {
      super(var1);
      this.func_110804_e(0);
      this.func_110800_a(true);
   }

   public int func_110748_a(int var1) {
      return var1 | 4;
   }

   public int func_110787_b(int var1) {
      return C_100451_alf.field_106080_N.func_106029_a(0, var1);
   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      int var3 = var1.func_111367_j();
      return (var3 & 1) == 1?C_100866_xa.func_110293_a():((var3 & 2) == 2?C_100866_xa.func_110296_b():C_100866_xa.func_110295_c());
   }

   public String func_110791_c_(C_100994_tv var1) {
      int var2 = var1.func_111367_j();
      if(var2 < 0 || var2 >= C_100135_aji.field_106425_a.length) {
         var2 = 0;
      }

      return super.func_110793_a() + "." + C_100135_aji.field_106425_a[var2];
   }
}
