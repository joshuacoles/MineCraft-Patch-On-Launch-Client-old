import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100374_cw extends C_100219_dx {

   public int field_106799_a;
   public int field_106797_b;
   public String field_106798_c;
   public int field_106796_d;


   public C_100374_cw() {}

   public C_100374_cw(int var1, int var2, String var3, int var4) {
      this.field_106799_a = var1;
      this.field_106797_b = var2;
      this.field_106798_c = var3;
      this.field_106796_d = var4;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106917_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106799_a = var1.readByte() & 255;
      this.field_106797_b = var1.readByte() & 255;
      this.field_106798_c = func_106551_a(var1, 32);
      this.field_106796_d = var1.readByte() & 255;
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106799_a & 255);
      var1.writeByte(this.field_106797_b & 255);
      func_106543_a(this.field_106798_c, var1);
      var1.writeByte(this.field_106796_d & 255);
   }

   public int func_106552_a() {
      return 3 + this.field_106798_c.length();
   }
}
