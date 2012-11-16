import java.util.List;

final class C_101182_apj extends C_101196_apu {

   // $FF: synthetic field
   final int field_107362_a;


   C_101182_apj(int var1) {
      this.field_107362_a = var1;
   }

   public boolean func_107361_a(List var1) {
      return var1.size() > this.field_107362_a;
   }

   public String func_107356_a() {
      return Integer.toString(this.field_107362_a);
   }

   public C_101168_aou func_107360_b(List var1) {
      return (C_101168_aou)var1.get(this.field_107362_a);
   }

   public String toString() {
      return "an element at index [" + this.field_107362_a + "]";
   }

   // $FF: synthetic method
   public Object func_107359_c(Object var1) {
      return this.func_107360_b((List)var1);
   }
}
