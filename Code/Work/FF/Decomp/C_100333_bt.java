import java.io.DataInput;
import java.io.DataOutput;

public class C_100333_bt extends C_100331_bu {

   public String field_107495_a;


   public C_100333_bt(String var1) {
      super(var1);
   }

   public C_100333_bt(String var1, String var2) {
      super(var1);
      this.field_107495_a = var2;
      if(var2 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void func_107484_a(DataOutput var1) {
      var1.writeUTF(this.field_107495_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107495_a = var1.readUTF();
   }

   public byte func_107483_a() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.field_107495_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100333_bt(this.func_107492_e(), this.field_107495_a);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         C_100333_bt var2 = (C_100333_bt)var1;
         return this.field_107495_a == null && var2.field_107495_a == null || this.field_107495_a != null && this.field_107495_a.equals(var2.field_107495_a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_107495_a.hashCode();
   }
}
