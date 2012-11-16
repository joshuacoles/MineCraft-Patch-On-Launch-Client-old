import java.util.concurrent.Callable;

class C_100869_xg implements Callable {

   // $FF: synthetic field
   final C_100873_xe field_110300_a;


   C_100869_xg(C_100873_xe var1) {
      this.field_110300_a = var1;
   }

   public String func_110299_a() {
      return this.field_110300_a.field_109573_h.size() + " total; " + this.field_110300_a.field_109573_h.toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_110299_a();
   }
}
