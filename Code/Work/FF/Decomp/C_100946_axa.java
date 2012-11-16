import java.util.concurrent.Callable;

class C_100946_axa implements Callable {

   // $FF: synthetic field
   final C_100942_awz field_111103_a;


   C_100946_axa(C_100942_awz var1) {
      this.field_111103_a = var1;
   }

   public String func_111102_a() {
      return C_100942_awz.func_109590_a(this.field_111103_a).size() + " total; " + C_100942_awz.func_109590_a(this.field_111103_a).toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_111102_a();
   }
}
