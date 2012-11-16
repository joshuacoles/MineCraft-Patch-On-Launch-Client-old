import java.util.Arrays;

public final class C_101178_apf {

   public static C_101179_ape func_111899_a(Object ... var0) {
      return func_111903_a(var0, new C_101179_ape(new C_101185_apg()));
   }

   public static C_101179_ape func_111900_b(Object ... var0) {
      return func_111903_a(var0, new C_101179_ape(new C_101189_apk()));
   }

   public static C_101179_ape func_111901_c(Object ... var0) {
      return func_111903_a(var0, new C_101179_ape(new C_101184_aph()));
   }

   public static C_101179_ape func_111904_a(String var0) {
      return func_111898_a(C_101180_apd.func_111917_a(var0));
   }

   public static C_101179_ape func_111898_a(C_101194_aps var0) {
      return new C_101179_ape(new C_101183_api(var0));
   }

   public static C_101179_ape func_111895_b(String var0) {
      return func_111901_c(new Object[0]).func_111905_a(func_111904_a(var0));
   }

   public static C_101179_ape func_111897_a(int var0) {
      return new C_101179_ape(new C_101182_apj(var0));
   }

   public static C_101179_ape func_111896_b(int var0) {
      return func_111900_b(new Object[0]).func_111905_a(func_111897_a(var0));
   }

   private static C_101179_ape func_111903_a(Object[] var0, C_101179_ape var1) {
      C_101179_ape var2 = var1;

      for(int var3 = var0.length - 1; var3 >= 0; --var3) {
         if(var0[var3] instanceof Integer) {
            var2 = func_111902_a(func_111896_b(((Integer)var0[var3]).intValue()), var2);
         } else {
            if(!(var0[var3] instanceof String)) {
               throw new IllegalArgumentException("Element [" + var0[var3] + "] of path elements" + " [" + Arrays.toString(var0) + "] was of illegal type [" + var0[var3].getClass().getCanonicalName() + "]; only Integer and String are valid.");
            }

            var2 = func_111902_a(func_111895_b((String)var0[var3]), var2);
         }
      }

      return var2;
   }

   private static C_101179_ape func_111902_a(C_101179_ape var0, C_101179_ape var1) {
      return new C_101179_ape(new C_100310_aoh(var0, var1));
   }
}
