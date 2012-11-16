import java.io.DataInput;
import java.io.DataOutput;

public class C_100351_bg extends C_100331_bu {

   public byte field_107508_a;


   public C_100351_bg(String var1) {
      super(var1);
   }

   public C_100351_bg(String var1, byte var2) {
      super(var1);
      this.field_107508_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeByte(this.field_107508_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107508_a = var1.readByte();
   }

   public byte func_107483_a() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.field_107508_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100351_bg(this.func_107492_e(), this.field_107508_a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100351_bg var2 = (C_100351_bg)var1;
         return this.field_107508_a == var2.field_107508_a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_107508_a;
   }
}
