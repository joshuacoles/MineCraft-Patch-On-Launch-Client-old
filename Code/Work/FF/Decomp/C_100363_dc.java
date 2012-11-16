import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100363_dc extends C_100219_dx {

   public int field_106783_a;
   public int field_106781_b;
   public int field_106782_c;
   public int field_106779_d;
   public int field_106780_e;


   public C_100363_dc() {}

   public C_100363_dc(C_100730_lb var1, int var2, int var3, int var4, int var5) {
      this.field_106780_e = var2;
      this.field_106781_b = var3;
      this.field_106782_c = var4;
      this.field_106779_d = var5;
      this.field_106783_a = var1.field_103212_k;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106783_a = var1.readInt();
      this.field_106780_e = var1.readByte();
      this.field_106781_b = var1.readInt();
      this.field_106782_c = var1.readByte();
      this.field_106779_d = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106783_a);
      var1.writeByte(this.field_106780_e);
      var1.writeInt(this.field_106781_b);
      var1.writeByte(this.field_106782_c);
      var1.writeInt(this.field_106779_d);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106926_a(this);
   }

   public int func_106552_a() {
      return 14;
   }
}
