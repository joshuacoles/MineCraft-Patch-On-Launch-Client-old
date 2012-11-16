import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100242_di extends C_100219_dx {

   public int field_106611_a;


   public C_100242_di() {}

   public C_100242_di(int var1) {
      this.field_106611_a = var1;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106960_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106611_a = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106611_a);
   }

   public int func_106552_a() {
      return 4;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }

   public boolean func_106547_a_() {
      return true;
   }
}
