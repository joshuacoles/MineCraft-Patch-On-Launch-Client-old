import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100305_es extends C_100219_dx {

   public long field_106773_a;
   public long field_106772_b;


   public C_100305_es() {}

   public C_100305_es(long var1, long var3) {
      this.field_106773_a = var1;
      this.field_106772_b = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106773_a = var1.readLong();
      this.field_106772_b = var1.readLong();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeLong(this.field_106773_a);
      var1.writeLong(this.field_106772_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106954_a(this);
   }

   public int func_106552_a() {
      return 16;
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
