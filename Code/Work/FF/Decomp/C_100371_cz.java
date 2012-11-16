import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100371_cz extends C_100219_dx {

   public int field_106790_a;
   public int field_106788_b;
   public C_100994_tv field_106789_c;


   public C_100371_cz() {}

   public C_100371_cz(int var1, int var2, C_100994_tv var3) {
      this.field_106790_a = var1;
      this.field_106788_b = var2;
      this.field_106789_c = var3 == null?var3:var3.func_111360_l();
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106949_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106790_a = var1.readByte();
      this.field_106788_b = var1.readShort();
      this.field_106789_c = func_106540_c(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106790_a);
      var1.writeShort(this.field_106788_b);
      func_106555_a(this.field_106789_c, var1);
   }

   public int func_106552_a() {
      return 8;
   }
}
