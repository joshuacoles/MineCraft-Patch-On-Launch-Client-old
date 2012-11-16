import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100367_da extends C_100219_dx {

   public String field_106787_a;
   public int field_106785_b;
   public byte[] field_106786_c;


   public C_100367_da() {}

   public C_100367_da(String var1, byte[] var2) {
      this.field_106787_a = var1;
      this.field_106786_c = var2;
      if(var2 != null) {
         this.field_106785_b = var2.length;
         if(this.field_106785_b > 32767) {
            throw new IllegalArgumentException("Payload may not be larger than 32k");
         }
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106787_a = func_106551_a(var1, 20);
      this.field_106785_b = var1.readShort();
      if(this.field_106785_b > 0 && this.field_106785_b < 32767) {
         this.field_106786_c = new byte[this.field_106785_b];
         var1.readFully(this.field_106786_c);
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106787_a, var1);
      var1.writeShort((short)this.field_106785_b);
      if(this.field_106786_c != null) {
         var1.write(this.field_106786_c);
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106971_a(this);
   }

   public int func_106552_a() {
      return 2 + this.field_106787_a.length() * 2 + 2 + this.field_106785_b;
   }
}
