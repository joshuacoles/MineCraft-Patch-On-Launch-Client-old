import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100295_ep extends C_100219_dx {

   public int field_106754_a;
   public int field_106752_b;
   public float field_106753_c;


   public C_100295_ep() {}

   public C_100295_ep(int var1, int var2, float var3) {
      this.field_106754_a = var1;
      this.field_106752_b = var2;
      this.field_106753_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106754_a = var1.readShort();
      this.field_106752_b = var1.readShort();
      this.field_106753_c = var1.readFloat();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeShort(this.field_106754_a);
      var1.writeShort(this.field_106752_b);
      var1.writeFloat(this.field_106753_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106981_a(this);
   }

   public int func_106552_a() {
      return 8;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
