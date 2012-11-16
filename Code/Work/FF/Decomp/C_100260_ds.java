import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100260_ds extends C_100258_dp {

   public C_100260_ds() {
      this.field_106666_g = true;
   }

   public C_100260_ds(int var1, byte var2, byte var3) {
      super(var1);
      this.field_106668_e = var2;
      this.field_106665_f = var3;
      this.field_106666_g = true;
   }

   public void func_106537_a(DataInputStream var1) {
      super.func_106537_a(var1);
      this.field_106668_e = var1.readByte();
      this.field_106665_f = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      super.func_106544_a(var1);
      var1.writeByte(this.field_106668_e);
      var1.writeByte(this.field_106665_f);
   }

   public int func_106552_a() {
      return 6;
   }
}
