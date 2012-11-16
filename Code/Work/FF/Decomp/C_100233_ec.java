import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100233_ec extends C_100219_dx {

   public String field_106593_a;
   public boolean field_106591_b;
   public int field_106592_c;


   public C_100233_ec() {}

   public C_100233_ec(String var1, boolean var2, int var3) {
      this.field_106593_a = var1;
      this.field_106591_b = var2;
      this.field_106592_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106593_a = func_106551_a(var1, 16);
      this.field_106591_b = var1.readByte() != 0;
      this.field_106592_c = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106593_a, var1);
      var1.writeByte(this.field_106591_b?1:0);
      var1.writeShort(this.field_106592_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106931_a(this);
   }

   public int func_106552_a() {
      return this.field_106593_a.length() + 2 + 1 + 2;
   }
}
