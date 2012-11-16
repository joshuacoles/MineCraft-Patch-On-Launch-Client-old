import java.util.concurrent.Callable;

class C_100355_bi implements Callable {

   // $FF: synthetic field
   final String field_107632_a;
   // $FF: synthetic field
   final C_100353_bh field_107631_b;


   C_100355_bi(C_100353_bh var1, String var2) {
      this.field_107631_b = var1;
      this.field_107632_a = var2;
   }

   public String func_107630_a() {
      return C_100331_bu.field_107493_b[((C_100331_bu)C_100353_bh.func_107536_a(this.field_107631_b).get(this.field_107632_a)).func_107483_a()];
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_107630_a();
   }
}
