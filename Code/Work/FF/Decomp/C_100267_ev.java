import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100267_ev extends C_100219_dx {

   public int field_106693_a;
   public int field_106692_b;


   public C_100267_ev() {}

   public C_100267_ev(int var1, int var2) {
      this.field_106693_a = var1;
      this.field_106692_b = var2;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106693_a = var1.readInt();
      this.field_106692_b = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106693_a);
      var1.writeInt(this.field_106692_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106988_a(this);
   }

   public int func_106552_a() {
      return 8;
   }
}
