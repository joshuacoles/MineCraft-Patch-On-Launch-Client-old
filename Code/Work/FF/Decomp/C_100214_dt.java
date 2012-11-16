import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100214_dt extends C_100219_dx {

   public double field_106913_a;
   public double field_106911_b;
   public double field_106912_c;
   public double field_106909_d;
   public float field_106910_e;
   public float field_106907_f;
   public boolean field_106908_g;
   public boolean field_106914_h;
   public boolean field_106915_i;


   public C_100214_dt() {}

   public C_100214_dt(boolean var1) {
      this.field_106908_g = var1;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106987_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106908_g = var1.read() != 0;
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.write(this.field_106908_g?1:0);
   }

   public int func_106552_a() {
      return 1;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
