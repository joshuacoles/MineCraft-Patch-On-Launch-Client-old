import java.util.Map;

final class C_101183_api extends C_101196_apu {

   // $FF: synthetic field
   final C_101194_aps field_107365_a;


   C_101183_api(C_101194_aps var1) {
      this.field_107365_a = var1;
   }

   public boolean func_107363_a(Map var1) {
      return var1.containsKey(this.field_107365_a);
   }

   public String func_107356_a() {
      return "\"" + this.field_107365_a.func_107400_c() + "\"";
   }

   public C_101168_aou func_107364_b(Map var1) {
      return (C_101168_aou)var1.get(this.field_107365_a);
   }

   public String toString() {
      return "a field called [\"" + this.field_107365_a.func_107400_c() + "\"]";
   }

   // $FF: synthetic method
   public Object func_107359_c(Object var1) {
      return this.func_107364_b((Map)var1);
   }
}
