import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100397_cl extends C_100219_dx {

   private String field_106846_a;


   public C_100397_cl() {}

   public C_100397_cl(String var1) {
      this.field_106846_a = var1;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106846_a = func_106551_a(var1, C_100392_cm.field_106837_a);
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106846_a, var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106977_a(this);
   }

   public int func_106552_a() {
      return 2 + this.field_106846_a.length() * 2;
   }

   public String func_106845_d() {
      return this.field_106846_a;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
