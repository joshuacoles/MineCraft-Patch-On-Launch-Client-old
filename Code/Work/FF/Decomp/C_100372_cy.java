import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100372_cy extends C_100219_dx {

   public int field_106793_a;
   public int field_106791_b;
   public int field_106792_c;


   public C_100372_cy() {}

   public C_100372_cy(int var1, int var2, int var3) {
      this.field_106793_a = var1;
      this.field_106791_b = var2;
      this.field_106792_c = var3;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106963_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106793_a = var1.readByte();
      this.field_106791_b = var1.readShort();
      this.field_106792_c = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106793_a);
      var1.writeShort(this.field_106791_b);
      var1.writeShort(this.field_106792_c);
   }

   public int func_106552_a() {
      return 5;
   }
}
