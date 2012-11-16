import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class C_101187_apm extends C_101168_aou {

   private static final Pattern field_107407_a = Pattern.compile("(-?)(0|([1-9]([0-9]*)))(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?");
   private final String field_107406_b;


   C_101187_apm(String var1) {
      if(var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonNumber with a null value.");
      } else if(!field_107407_a.matcher(var1).matches()) {
         throw new IllegalArgumentException("Attempt to construct a JsonNumber with a String [" + var1 + "] that does not match the JSON number specification.");
      } else {
         this.field_107406_b = var1;
      }
   }

   public C_101188_apl func_107397_a() {
      return C_101188_apl.field_111921_d;
   }

   public String func_107400_c() {
      return this.field_107406_b;
   }

   public Map func_107399_d() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List func_107395_b() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         C_101187_apm var2 = (C_101187_apm)var1;
         return this.field_107406_b.equals(var2.field_107406_b);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field_107406_b.hashCode();
   }

   public String toString() {
      return "JsonNumberNode value:[" + this.field_107406_b + "]";
   }

}
