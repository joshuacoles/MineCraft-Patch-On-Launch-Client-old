import java.io.DataInput;
import java.io.DataOutput;

public class C_100343_bk extends C_100331_bu {

   public double field_107505_a;


   public C_100343_bk(String var1) {
      super(var1);
   }

   public C_100343_bk(String var1, double var2) {
      super(var1);
      this.field_107505_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeDouble(this.field_107505_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107505_a = var1.readDouble();
   }

   public byte func_107483_a() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.field_107505_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100343_bk(this.func_107492_e(), this.field_107505_a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100343_bk var2 = (C_100343_bk)var1;
         return this.field_107505_a == var2.field_107505_a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.field_107505_a);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }
}
