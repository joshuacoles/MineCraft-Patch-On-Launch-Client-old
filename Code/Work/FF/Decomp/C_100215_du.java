import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100215_du extends C_100214_dt {

   public C_100215_du() {
      this.field_106914_h = true;
   }

   public C_100215_du(double var1, double var3, double var5, double var7, boolean var9) {
      this.field_106913_a = var1;
      this.field_106911_b = var3;
      this.field_106909_d = var5;
      this.field_106912_c = var7;
      this.field_106908_g = var9;
      this.field_106914_h = true;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106913_a = var1.readDouble();
      this.field_106911_b = var1.readDouble();
      this.field_106909_d = var1.readDouble();
      this.field_106912_c = var1.readDouble();
      super.func_106537_a(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeDouble(this.field_106913_a);
      var1.writeDouble(this.field_106911_b);
      var1.writeDouble(this.field_106909_d);
      var1.writeDouble(this.field_106912_c);
      super.func_106544_a(var1);
   }

   public int func_106552_a() {
      return 33;
   }
}
