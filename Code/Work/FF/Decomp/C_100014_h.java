import java.util.concurrent.Callable;

class C_100014_h implements Callable {

   // $FF: synthetic field
   final C_100007_a field_105275_a;


   C_100014_h(C_100007_a var1) {
      this.field_105275_a = var1;
   }

   public String func_105274_a() {
      int var1 = C_100412_amr.func_107892_a().func_107845_c();
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      int var4 = C_100412_amr.func_107892_a().func_107841_d();
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      return var1 + " (" + var2 + " bytes; " + var3 + " MB) allocated, " + var4 + " (" + var5 + " bytes; " + var6 + " MB) used";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_105274_a();
   }
}
