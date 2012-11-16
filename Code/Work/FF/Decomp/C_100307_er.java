import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100307_er extends C_100219_dx {

   public int field_106776_a;
   public int field_106774_b;
   public int field_106775_c;


   public C_100307_er() {}

   public C_100307_er(int var1, int var2, int var3) {
      this.field_106776_a = var1;
      this.field_106774_b = var2;
      this.field_106775_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106776_a = var1.readInt();
      this.field_106774_b = var1.readInt();
      this.field_106775_c = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106776_a);
      var1.writeInt(this.field_106774_b);
      var1.writeInt(this.field_106775_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106980_a(this);
   }

   public int func_106552_a() {
      return 12;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }

   public boolean func_106547_a_() {
      return false;
   }
}
