import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100291_ej extends C_100219_dx {

   public int field_106745_a;


   public C_100291_ej() {}

   public C_100291_ej(int var1) {
      this.field_106745_a = var1;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106745_a = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeShort(this.field_106745_a);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106947_a(this);
   }

   public int func_106552_a() {
      return 2;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
