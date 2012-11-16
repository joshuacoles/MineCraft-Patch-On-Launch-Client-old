import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100236_dd extends C_100219_dx {

   public int field_106606_a;
   public byte field_106605_b;


   public C_100236_dd() {}

   public C_100236_dd(int var1, byte var2) {
      this.field_106606_a = var1;
      this.field_106605_b = var2;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106606_a = var1.readInt();
      this.field_106605_b = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106606_a);
      var1.writeByte(this.field_106605_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106937_a(this);
   }

   public int func_106552_a() {
      return 5;
   }
}
