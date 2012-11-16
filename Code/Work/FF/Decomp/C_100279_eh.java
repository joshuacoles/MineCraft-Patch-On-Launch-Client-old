import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100279_eh extends C_100219_dx {

   public int field_106731_a;
   public byte field_106730_b;


   public C_100279_eh() {}

   public C_100279_eh(int var1, byte var2) {
      this.field_106731_a = var1;
      this.field_106730_b = var2;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106731_a = var1.readInt();
      this.field_106730_b = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106731_a);
      var1.writeByte(this.field_106730_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106927_a(this);
   }

   public int func_106552_a() {
      return 5;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100279_eh var2 = (C_100279_eh)var1;
      return var2.field_106731_a == this.field_106731_a;
   }

   public boolean func_106547_a_() {
      return true;
   }
}
