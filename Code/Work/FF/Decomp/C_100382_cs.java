import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100382_cs extends C_100219_dx {

   public int field_106811_a;
   public short field_106809_b;
   public boolean field_106810_c;


   public C_100382_cs() {}

   public C_100382_cs(int var1, short var2, boolean var3) {
      this.field_106811_a = var1;
      this.field_106809_b = var2;
      this.field_106810_c = var3;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106920_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106811_a = var1.readByte();
      this.field_106809_b = var1.readShort();
      this.field_106810_c = var1.readByte() != 0;
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106811_a);
      var1.writeShort(this.field_106809_b);
      var1.writeByte(this.field_106810_c?1:0);
   }

   public int func_106552_a() {
      return 4;
   }
}
