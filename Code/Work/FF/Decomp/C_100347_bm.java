import java.io.DataInput;
import java.io.DataOutput;

public class C_100347_bm extends C_100331_bu {

   public float field_107506_a;


   public C_100347_bm(String var1) {
      super(var1);
   }

   public C_100347_bm(String var1, float var2) {
      super(var1);
      this.field_107506_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeFloat(this.field_107506_a);
   }

   void func_107487_a(DataInput var1) {
      this.field_107506_a = var1.readFloat();
   }

   public byte func_107483_a() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.field_107506_a;
   }

   public C_100331_bu func_107485_b() {
      return new C_100347_bm(this.func_107492_e(), this.field_107506_a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100347_bm var2 = (C_100347_bm)var1;
         return this.field_107506_a == var2.field_107506_a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.field_107506_a);
   }
}
