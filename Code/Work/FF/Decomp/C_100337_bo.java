import java.io.DataInput;
import java.io.DataOutput;

public class C_100337_bo extends C_100331_bu {

   public int field_107497_a;


   public C_100337_bo(String var1) {
      super(var1);
   }

   public C_100337_bo(String var1, int var2) {
      super(var1);
      this.field_107497_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeInt(this.field_107497_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107497_a = var1.readInt();
   }

   public byte func_107483_a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.field_107497_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100337_bo(this.func_107492_e(), this.field_107497_a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100337_bo var2 = (C_100337_bo)var1;
         return this.field_107497_a == var2.field_107497_a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_107497_a;
   }
}
