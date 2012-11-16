import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100285_ee extends C_100219_dx {

   public int[] field_106739_a;


   public C_100285_ee() {}

   public C_100285_ee(int ... var1) {
      this.field_106739_a = var1;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106739_a = new int[var1.readByte()];

      for(int var2 = 0; var2 < this.field_106739_a.length; ++var2) {
         this.field_106739_a[var2] = var1.readInt();
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106739_a.length);

      for(int var2 = 0; var2 < this.field_106739_a.length; ++var2) {
         var1.writeInt(this.field_106739_a[var2]);
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106919_a(this);
   }

   public int func_106552_a() {
      return 1 + this.field_106739_a.length * 4;
   }
}
