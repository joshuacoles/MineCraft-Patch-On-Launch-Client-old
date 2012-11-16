import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class C_100805_io {

   private ByteArrayOutputStream field_109980_a;
   private DataOutputStream field_109979_b;


   public C_100805_io(int var1) {
      this.field_109980_a = new ByteArrayOutputStream(var1);
      this.field_109979_b = new DataOutputStream(this.field_109980_a);
   }

   public void func_109976_a(byte[] var1) {
      this.field_109979_b.write(var1, 0, var1.length);
   }

   public void func_109977_a(String var1) {
      this.field_109979_b.writeBytes(var1);
      this.field_109979_b.write(0);
   }

   public void func_109973_a(int var1) {
      this.field_109979_b.write(var1);
   }

   public void func_109974_a(short var1) {
      this.field_109979_b.writeShort(Short.reverseBytes(var1));
   }

   public byte[] func_109978_a() {
      return this.field_109980_a.toByteArray();
   }

   public void func_109975_b() {
      this.field_109980_a.reset();
   }
}
