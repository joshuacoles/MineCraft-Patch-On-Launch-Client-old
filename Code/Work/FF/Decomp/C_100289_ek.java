import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100289_ek extends C_100219_dx {

   public int field_106744_a;
   public C_100994_tv field_106743_b;


   public C_100289_ek() {}

   public C_100289_ek(int var1, C_100994_tv var2) {
      this.field_106744_a = var1;
      this.field_106743_b = var2;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106942_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106744_a = var1.readShort();
      this.field_106743_b = func_106540_c(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeShort(this.field_106744_a);
      func_106555_a(this.field_106743_b, var1);
   }

   public int func_106552_a() {
      return 8;
   }
}
