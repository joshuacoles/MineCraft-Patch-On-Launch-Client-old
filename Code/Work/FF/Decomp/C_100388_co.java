import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100388_co extends C_100219_dx {

   public int field_106821_a;


   public C_100388_co() {}

   public C_100388_co(int var1) {
      this.field_106821_a = var1;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106821_a = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106821_a & 255);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106925_a(this);
   }

   public int func_106552_a() {
      return 1;
   }
}
