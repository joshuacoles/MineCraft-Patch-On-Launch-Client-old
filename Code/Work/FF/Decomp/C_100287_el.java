import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class C_100287_el extends C_100219_dx {

   public int field_106742_a;
   private List field_106741_b;


   public C_100287_el() {}

   public C_100287_el(int var1, C_100605_lt var2, boolean var3) {
      this.field_106742_a = var1;
      if(var3) {
         this.field_106741_b = var2.func_108844_c();
      } else {
         this.field_106741_b = var2.func_108848_b();
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106742_a = var1.readInt();
      this.field_106741_b = C_100605_lt.func_108845_a(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106742_a);
      C_100605_lt.func_108838_a(this.field_106741_b, var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106962_a(this);
   }

   public int func_106552_a() {
      return 5;
   }

   public List func_106740_d() {
      return this.field_106741_b;
   }
}
