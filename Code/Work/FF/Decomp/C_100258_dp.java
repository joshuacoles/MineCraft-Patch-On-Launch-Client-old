import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100258_dp extends C_100219_dx {

   public int field_106671_a;
   public byte field_106669_b;
   public byte field_106670_c;
   public byte field_106667_d;
   public byte field_106668_e;
   public byte field_106665_f;
   public boolean field_106666_g = false;


   public C_100258_dp() {}

   public C_100258_dp(int var1) {
      this.field_106671_a = var1;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106671_a = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106671_a);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106965_a(this);
   }

   public int func_106552_a() {
      return 4;
   }

   public String toString() {
      return "Entity_" + super.toString();
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100258_dp var2 = (C_100258_dp)var1;
      return var2.field_106671_a == this.field_106671_a;
   }
}
