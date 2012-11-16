import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100392_cm extends C_100219_dx {

   public static int field_106837_a = 119;
   public String field_106835_b;
   private boolean field_106836_c;


   public C_100392_cm() {
      this.field_106836_c = true;
   }

   public C_100392_cm(String var1) {
      this(var1, true);
   }

   public C_100392_cm(String var1, boolean var2) {
      this.field_106836_c = true;
      if(var1.length() > field_106837_a) {
         var1 = var1.substring(0, field_106837_a);
      }

      this.field_106835_b = var1;
      this.field_106836_c = var2;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106835_b = func_106551_a(var1, field_106837_a);
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106835_b, var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106943_a(this);
   }

   public int func_106552_a() {
      return 2 + this.field_106835_b.length() * 2;
   }

   public boolean func_106834_d() {
      return this.field_106836_c;
   }

   public boolean func_106547_a_() {
      return !this.field_106835_b.startsWith("/");
   }

}
