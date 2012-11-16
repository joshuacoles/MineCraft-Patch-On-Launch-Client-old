import java.io.DataInput;
import java.io.DataOutput;

public class C_100341_bq extends C_100331_bu {

   public long field_107504_a;


   public C_100341_bq(String var1) {
      super(var1);
   }

   public C_100341_bq(String var1, long var2) {
      super(var1);
      this.field_107504_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeLong(this.field_107504_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107504_a = var1.readLong();
   }

   public byte func_107483_a() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.field_107504_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100341_bq(this.func_107492_e(), this.field_107504_a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100341_bq var2 = (C_100341_bq)var1;
         return this.field_107504_a == var2.field_107504_a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ (int)(this.field_107504_a ^ this.field_107504_a >>> 32);
   }
}
