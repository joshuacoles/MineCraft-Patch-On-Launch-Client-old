import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100238_dg extends C_100219_dx {

   public int field_106607_a = 0;


   public void func_106537_a(DataInputStream var1) {
      try {
         this.field_106607_a = var1.readByte();
      } catch (Throwable var3) {
         this.field_106607_a = 0;
      }

   }

   public void func_106544_a(DataOutputStream var1) {}

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106946_a(this);
   }

   public int func_106552_a() {
      return 0;
   }
}
