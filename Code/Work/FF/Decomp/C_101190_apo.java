import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C_101190_apo extends C_101193_apr {

   private final Map field_107410_a;


   C_101190_apo(Map var1) {
      this.field_107410_a = new HashMap(var1);
   }

   public Map func_107399_d() {
      return new HashMap(this.field_107410_a);
   }

   public C_101188_apl func_107397_a() {
      return C_101188_apl.field_111925_a;
   }

   public String func_107400_c() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public List func_107395_b() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         C_101190_apo var2 = (C_101190_apo)var1;
         return this.field_107410_a.equals(var2.field_107410_a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field_107410_a.hashCode();
   }

   public String toString() {
      return "JsonObject fields:[" + this.field_107410_a + "]";
   }
}
