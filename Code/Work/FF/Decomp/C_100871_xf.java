import java.util.concurrent.Callable;

class C_100871_xf implements Callable {

   // $FF: synthetic field
   final C_100873_xe field_110316_a;


   C_100871_xf(C_100873_xe var1) {
      this.field_110316_a = var1;
   }

   public String func_110315_a() {
      return this.field_110316_a.field_109563_e.size() + " total; " + this.field_110316_a.field_109563_e.toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_110315_a();
   }
}
