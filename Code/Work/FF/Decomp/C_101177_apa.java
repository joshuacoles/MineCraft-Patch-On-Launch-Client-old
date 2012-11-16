import java.util.LinkedList;
import java.util.List;

public final class C_101177_apa extends C_101176_apb {

   final C_100311_aoi field_111890_a;
   final List field_111889_b;


   static C_101176_apb func_111885_a(C_100311_aoi var0) {
      return new C_101177_apa(var0, new LinkedList());
   }

   static C_101176_apb func_111887_a(C_101177_apa var0, C_101179_ape var1) {
      LinkedList var2 = new LinkedList(var0.field_111889_b);
      var2.add(var1);
      return new C_101177_apa(var0.field_111890_a, var2);
   }

   static C_101176_apb func_111888_b(C_101177_apa var0, C_101179_ape var1) {
      LinkedList var2 = new LinkedList();
      var2.add(var1);
      return new C_101177_apa(var0.field_111890_a, var2);
   }

   private C_101177_apa(C_100311_aoi var1, List var2) {
      super("Failed to match any JSON node at [" + func_111886_a(var2) + "]");
      this.field_111890_a = var1;
      this.field_111889_b = var2;
   }

   static String func_111886_a(List var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = var0.size() - 1; var2 >= 0; --var2) {
         var1.append(((C_101179_ape)var0.get(var2)).func_111906_a());
         if(var2 != 0) {
            var1.append(".");
         }
      }

      return var1.toString();
   }

   public String toString() {
      return "JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=" + this.field_111890_a + ", failPath=" + this.field_111889_b + '}';
   }
}
