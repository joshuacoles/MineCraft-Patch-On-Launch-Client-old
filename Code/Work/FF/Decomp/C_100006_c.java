import java.util.concurrent.Callable;

class C_100006_c implements Callable {

   // $FF: synthetic field
   final C_100007_a field_105178_a;


   C_100006_c(C_100007_a var1) {
      this.field_105178_a = var1;
   }

   public String func_105177_a() {
      return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_105177_a();
   }
}
