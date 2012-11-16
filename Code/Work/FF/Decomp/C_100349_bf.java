import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class C_100349_bf extends C_100331_bu {

   public byte[] field_107507_a;


   public C_100349_bf(String var1) {
      super(var1);
   }

   public C_100349_bf(String var1, byte[] var2) {
      super(var1);
      this.field_107507_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeInt(this.field_107507_a.length);
      var1.write(this.field_107507_a);
   }

   void func_107487_a(DataInput var1) {
      int var2 = var1.readInt();
      this.field_107507_a = new byte[var2];
      var1.readFully(this.field_107507_a);
   }

   public byte func_107483_a() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.field_107507_a.length + " bytes]";
   }

   public C_100331_bu func_107485_b() {
      byte[] var1 = new byte[this.field_107507_a.length];
      System.arraycopy(this.field_107507_a, 0, var1, 0, this.field_107507_a.length);
      return new C_100349_bf(this.func_107492_e(), var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1)?Arrays.equals(this.field_107507_a, ((C_100349_bf)var1).field_107507_a):false;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.field_107507_a);
   }
}
