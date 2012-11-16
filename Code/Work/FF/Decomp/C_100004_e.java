import java.util.concurrent.Callable;

class C_100004_e implements Callable {

   // $FF: synthetic field
   final C_100007_a field_105174_a;


   C_100004_e(C_100007_a var1) {
      this.field_105174_a = var1;
   }

   public String func_105173_a() {
      return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_105173_a();
   }
}
