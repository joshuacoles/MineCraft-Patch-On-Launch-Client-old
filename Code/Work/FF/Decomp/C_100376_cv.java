import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100376_cv extends C_100219_dx {

   public int field_106800_a;


   public C_100376_cv() {}

   public C_100376_cv(int var1) {
      this.field_106800_a = var1;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106935_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106800_a = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106800_a);
   }

   public int func_106552_a() {
      return 1;
   }
}
