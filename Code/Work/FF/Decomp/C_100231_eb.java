import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100231_eb extends C_100219_dx {

   public int field_106590_a;
   public int field_106589_b;


   public C_100231_eb() {}

   public C_100231_eb(C_100730_lb var1, int var2) {
      this.field_106590_a = var1.field_103212_k;
      this.field_106589_b = var2;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106590_a = var1.readInt();
      this.field_106589_b = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106590_a);
      var1.writeByte(this.field_106589_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106929_a(this);
   }

   public int func_106552_a() {
      return 5;
   }
}
