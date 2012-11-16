import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100244_dh extends C_100219_dx {

   public int field_106614_a;
   public int field_106612_b;
   public int field_106613_c;


   public C_100244_dh() {}

   public C_100244_dh(int var1, int var2, int var3) {
      this.field_106614_a = var1;
      this.field_106612_b = var2;
      this.field_106613_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106614_a = var1.readInt();
      this.field_106612_b = var1.readInt();
      this.field_106613_c = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106614_a);
      var1.writeInt(this.field_106612_b);
      var1.writeByte(this.field_106613_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106932_a(this);
   }

   public int func_106552_a() {
      return 9;
   }
}
