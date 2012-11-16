import java.io.ByteArrayOutputStream;

class C_101307_zl extends ByteArrayOutputStream {

   private int field_112443_b;
   private int field_112444_c;
   // $FF: synthetic field
   final C_101301_zk field_112445_a;


   public C_101307_zl(C_101301_zk var1, int var2, int var3) {
      super(8096);
      this.field_112445_a = var1;
      this.field_112443_b = var2;
      this.field_112444_c = var3;
   }

   public void close() {
      this.field_112445_a.func_112410_a(this.field_112443_b, this.field_112444_c, this.buf, this.count);
   }
}
