import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100380_ct extends C_100219_dx {

   public int field_106808_a;
   public int field_106807_b;


   public C_100380_ct() {}

   public C_100380_ct(int var1, int var2) {
      this.field_106808_a = var1;
      this.field_106807_b = var2;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106948_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106808_a = var1.readByte();
      this.field_106807_b = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106808_a);
      var1.writeByte(this.field_106807_b);
   }

   public int func_106552_a() {
      return 2;
   }
}
