import java.io.DataInput;
import java.io.DataOutput;

public class C_100327_bs extends C_100331_bu {

   public short field_107541_a;


   public C_100327_bs(String var1) {
      super(var1);
   }

   public C_100327_bs(String var1, short var2) {
      super(var1);
      this.field_107541_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeShort(this.field_107541_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107541_a = var1.readShort();
   }

   public byte func_107483_a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.field_107541_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100327_bs(this.func_107492_e(), this.field_107541_a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100327_bs var2 = (C_100327_bs)var1;
         return this.field_107541_a == var2.field_107541_a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_107541_a;
   }
}
