import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100283_ef extends C_100219_dx {

   public int field_106738_a;
   public byte field_106737_b;


   public C_100283_ef() {}

   public C_100283_ef(int var1, C_100692_kx var2) {
      this.field_106738_a = var1;
      this.field_106737_b = (byte)(var2.func_109197_a() & 255);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106738_a = var1.readInt();
      this.field_106737_b = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106738_a);
      var1.writeByte(this.field_106737_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106973_a(this);
   }

   public int func_106552_a() {
      return 5;
   }
}
