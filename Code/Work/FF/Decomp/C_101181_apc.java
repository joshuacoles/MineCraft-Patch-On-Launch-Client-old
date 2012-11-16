
public final class C_101181_apc extends C_101176_apb {

   private static final C_100314_aog field_111894_a = new C_100326_aod();


   static C_101181_apc func_111893_a(C_101177_apa var0, Object[] var1, C_101193_apr var2) {
      return new C_101181_apc(var0, var1, var2);
   }

   private C_101181_apc(C_101177_apa var1, Object[] var2, C_101193_apr var3) {
      super(func_111892_b(var1, var2, var3));
   }

   private static String func_111892_b(C_101177_apa var0, Object[] var1, C_101193_apr var2) {
      return "Failed to find " + var0.field_111890_a.toString() + " at [" + C_101177_apa.func_111886_a(var0.field_111889_b) + "] while resolving [" + func_111891_a(var1) + "] in " + field_111894_a.func_107376_a(var2) + ".";
   }

   private static String func_111891_a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = true;
      Object[] var3 = var0;
      int var4 = var0.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = var3[var5];
         if(!var2) {
            var1.append(".");
         }

         var2 = false;
         if(var6 instanceof String) {
            var1.append("\"").append(var6).append("\"");
         } else {
            var1.append(var6);
         }
      }

      return var1.toString();
   }

}
