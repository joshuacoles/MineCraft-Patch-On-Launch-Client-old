import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100217_dw extends C_100214_dt {

   public C_100217_dw() {
      this.field_106915_i = true;
   }

   public C_100217_dw(float var1, float var2, boolean var3) {
      this.field_106910_e = var1;
      this.field_106907_f = var2;
      this.field_106908_g = var3;
      this.field_106915_i = true;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106910_e = var1.readFloat();
      this.field_106907_f = var1.readFloat();
      super.func_106537_a(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeFloat(this.field_106910_e);
      var1.writeFloat(this.field_106907_f);
      super.func_106544_a(var1);
   }

   public int func_106552_a() {
      return 9;
   }
}
