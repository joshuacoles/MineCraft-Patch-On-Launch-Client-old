import java.util.concurrent.Callable;

class C_100342_bj implements Callable {

   // $FF: synthetic field
   final int field_107582_a;
   // $FF: synthetic field
   final C_100353_bh field_107581_b;


   C_100342_bj(C_100353_bh var1, int var2) {
      this.field_107581_b = var1;
      this.field_107582_a = var2;
   }

   public String func_107580_a() {
      return C_100331_bu.field_107493_b[this.field_107582_a];
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_107580_a();
   }
}
