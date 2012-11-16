import java.util.List;
import java.util.Map;

public final class C_101194_aps extends C_101168_aou implements Comparable {

   private final String field_107409_a;


   C_101194_aps(String var1) {
      if(var1 == null) {
         throw new NullPointerException("Attempt to construct a JsonString with a null value.");
      } else {
         this.field_107409_a = var1;
      }
   }

   public C_101188_apl func_107397_a() {
      return C_101188_apl.field_111924_c;
   }

   public String func_107400_c() {
      return this.field_107409_a;
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
         C_101194_aps var2 = (C_101194_aps)var1;
         return this.field_107409_a.equals(var2.field_107409_a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field_107409_a.hashCode();
   }

   public String toString() {
      return "JsonStringNode value:[" + this.field_107409_a + "]";
   }

   public int func_107408_a(C_101194_aps var1) {
      return this.field_107409_a.compareTo(var1.field_107409_a);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.func_107408_a((C_101194_aps)var1);
   }
}
