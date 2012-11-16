import java.util.concurrent.Callable;

class C_100948_axb implements Callable {

   // $FF: synthetic field
   final C_100942_awz field_111136_a;


   C_100948_axb(C_100942_awz var1) {
      this.field_111136_a = var1;
   }

   public String func_111135_a() {
      return C_100942_awz.func_109589_b(this.field_111136_a).size() + " total; " + C_100942_awz.func_109589_b(this.field_111136_a).toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_111135_a();
   }
}
