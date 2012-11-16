import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100229_ea extends C_100219_dx {

   public int field_106588_a;
   public int field_106586_b;
   public int field_106587_c;
   public int field_106584_d;
   public int field_106585_e;


   public C_100229_ea() {}

   public C_100229_ea(int var1, int var2, int var3, int var4, int var5) {
      this.field_106585_e = var1;
      this.field_106588_a = var2;
      this.field_106586_b = var3;
      this.field_106587_c = var4;
      this.field_106584_d = var5;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106585_e = var1.read();
      this.field_106588_a = var1.readInt();
      this.field_106586_b = var1.read();
      this.field_106587_c = var1.readInt();
      this.field_106584_d = var1.read();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.write(this.field_106585_e);
      var1.writeInt(this.field_106588_a);
      var1.write(this.field_106586_b);
      var1.writeInt(this.field_106587_c);
      var1.write(this.field_106584_d);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106984_a(this);
   }

   public int func_106552_a() {
      return 11;
   }
}
