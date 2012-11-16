import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100386_cr extends C_100219_dx {

   public short field_106820_a;
   public short field_106818_b;
   public byte[] field_106819_c;


   public C_100386_cr() {
      this.field_106557_r = true;
   }

   public C_100386_cr(short var1, short var2, byte[] var3) {
      this.field_106557_r = true;
      this.field_106820_a = var1;
      this.field_106818_b = var2;
      this.field_106819_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106820_a = var1.readShort();
      this.field_106818_b = var1.readShort();
      this.field_106819_c = new byte[var1.readByte() & 255];
      var1.readFully(this.field_106819_c);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeShort(this.field_106820_a);
      var1.writeShort(this.field_106818_b);
      var1.writeByte(this.field_106819_c.length);
      var1.write(this.field_106819_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106921_a(this);
   }

   public int func_106552_a() {
      return 4 + this.field_106819_c.length;
   }
}
