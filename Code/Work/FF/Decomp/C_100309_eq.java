import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100309_eq extends C_100219_dx {

   public int field_106778_a;
   public int field_106777_b;


   public C_100309_eq() {}

   public C_100309_eq(C_100730_lb var1, C_100730_lb var2) {
      this.field_106778_a = var1.field_103212_k;
      this.field_106777_b = var2 != null?var2.field_103212_k:-1;
   }

   public int func_106552_a() {
      return 8;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106778_a = var1.readInt();
      this.field_106777_b = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106778_a);
      var1.writeInt(this.field_106777_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106934_a(this);
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100309_eq var2 = (C_100309_eq)var1;
      return var2.field_106778_a == this.field_106778_a;
   }
}
