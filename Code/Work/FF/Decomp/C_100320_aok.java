import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class C_100320_aok extends C_101193_apr {

   private final List field_107412_a;


   C_100320_aok(Iterable var1) {
      this.field_107412_a = func_107411_a(var1);
   }

   public C_101188_apl func_107397_a() {
      return C_101188_apl.field_111923_b;
   }

   public List func_107395_b() {
      return new ArrayList(this.field_107412_a);
   }

   public String func_107400_c() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map func_107399_d() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         C_100320_aok var2 = (C_100320_aok)var1;
         return this.field_107412_a.equals(var2.field_107412_a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field_107412_a.hashCode();
   }

   public String toString() {
      return "JsonArray elements:[" + this.field_107412_a + "]";
   }

   private static List func_107411_a(Iterable var0) {
      return new C_100316_aol(var0);
   }
}
