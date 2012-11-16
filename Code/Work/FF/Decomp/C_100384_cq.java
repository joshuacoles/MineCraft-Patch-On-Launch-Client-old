import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100384_cq extends C_100219_dx {

   private int field_106817_a;
   private String field_106815_b;
   private String field_106816_c;
   private int field_106814_d;


   public C_100384_cq() {}

   public C_100384_cq(int var1, String var2, String var3, int var4) {
      this.field_106817_a = var1;
      this.field_106815_b = var2;
      this.field_106816_c = var3;
      this.field_106814_d = var4;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106817_a = var1.readByte();
      this.field_106815_b = func_106551_a(var1, 16);
      this.field_106816_c = func_106551_a(var1, 255);
      this.field_106814_d = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106817_a);
      func_106543_a(this.field_106815_b, var1);
      func_106543_a(this.field_106816_c, var1);
      var1.writeInt(this.field_106814_d);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106923_a(this);
   }

   public int func_106552_a() {
      return 3 + 2 * this.field_106815_b.length();
   }

   public int func_106812_d() {
      return this.field_106817_a;
   }

   public String func_106813_f() {
      return this.field_106815_b;
   }
}
