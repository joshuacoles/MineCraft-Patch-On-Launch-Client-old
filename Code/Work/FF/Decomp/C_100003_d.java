import java.util.concurrent.Callable;

class C_100003_d implements Callable {

   // $FF: synthetic field
   final C_100007_a field_105172_a;


   C_100003_d(C_100007_a var1) {
      this.field_105172_a = var1;
   }

   public String func_105171_a() {
      return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_105171_a();
   }
}
