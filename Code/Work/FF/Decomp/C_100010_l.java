
public class C_100010_l extends RuntimeException {

   private final C_100007_a field_105256_a;


   public C_100010_l(C_100007_a var1) {
      this.field_105256_a = var1;
   }

   public C_100007_a func_105255_a() {
      return this.field_105256_a;
   }

   public Throwable getCause() {
      return this.field_105256_a.func_105187_b();
   }

   public String getMessage() {
      return this.field_105256_a.func_105183_a();
   }
}
