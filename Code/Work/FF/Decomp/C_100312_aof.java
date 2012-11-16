
final class C_100312_aof {

   private final String field_107374_a;


   C_100312_aof(String var1) {
      this.field_107374_a = var1.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
   }

   public String toString() {
      return this.field_107374_a;
   }
}
