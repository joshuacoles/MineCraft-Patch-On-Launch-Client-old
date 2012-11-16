import java.util.List;
import java.util.Map;

final class C_101165_aon extends C_101168_aou {

   static final C_101165_aon field_107405_a = new C_101165_aon(C_101188_apl.field_111920_g);
   static final C_101165_aon field_107403_b = new C_101165_aon(C_101188_apl.field_111922_e);
   static final C_101165_aon field_107404_c = new C_101165_aon(C_101188_apl.field_111919_f);
   private final C_101188_apl field_107402_d;


   private C_101165_aon(C_101188_apl var1) {
      this.field_107402_d = var1;
   }

   public C_101188_apl func_107397_a() {
      return this.field_107402_d;
   }

   public String func_107400_c() {
      throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
   }

   public Map func_107399_d() {
      throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
   }

   public List func_107395_b() {
      throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
   }

}
