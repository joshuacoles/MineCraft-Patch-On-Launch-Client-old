import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100365_db extends C_100219_dx {

   public String field_106784_a;


   public C_100365_db() {}

   public C_100365_db(String var1) {
      this.field_106784_a = var1;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106784_a = func_106551_a(var1, 256);
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106784_a, var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106978_a(this);
   }

   public int func_106552_a() {
      return this.field_106784_a.length();
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
