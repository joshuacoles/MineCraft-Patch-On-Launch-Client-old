import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100216_dv extends C_100214_dt {

   public C_100216_dv() {
      this.field_106915_i = true;
      this.field_106914_h = true;
   }

   public C_100216_dv(double var1, double var3, double var5, double var7, float var9, float var10, boolean var11) {
      this.field_106913_a = var1;
      this.field_106911_b = var3;
      this.field_106909_d = var5;
      this.field_106912_c = var7;
      this.field_106910_e = var9;
      this.field_106907_f = var10;
      this.field_106908_g = var11;
      this.field_106915_i = true;
      this.field_106914_h = true;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106913_a = var1.readDouble();
      this.field_106911_b = var1.readDouble();
      this.field_106909_d = var1.readDouble();
      this.field_106912_c = var1.readDouble();
      this.field_106910_e = var1.readFloat();
      this.field_106907_f = var1.readFloat();
      super.func_106537_a(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeDouble(this.field_106913_a);
      var1.writeDouble(this.field_106911_b);
      var1.writeDouble(this.field_106909_d);
      var1.writeDouble(this.field_106912_c);
      var1.writeFloat(this.field_106910_e);
      var1.writeFloat(this.field_106907_f);
      super.func_106544_a(var1);
   }

   public int func_106552_a() {
      return 41;
   }
}
