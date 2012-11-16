import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100273_fa extends C_100219_dx {

   public int field_106709_a;
   public int field_106707_b;
   public int field_106708_c;
   public int field_106705_d;
   public int field_106706_e;


   public C_100273_fa() {
      this.field_106557_r = true;
   }

   public C_100273_fa(int var1, int var2, int var3, C_100873_xe var4) {
      this.field_106557_r = true;
      this.field_106709_a = var1;
      this.field_106707_b = var2;
      this.field_106708_c = var3;
      this.field_106705_d = var4.func_109349_a(var1, var2, var3);
      this.field_106706_e = var4.func_109357_g(var1, var2, var3);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106709_a = var1.readInt();
      this.field_106707_b = var1.read();
      this.field_106708_c = var1.readInt();
      this.field_106705_d = var1.readShort();
      this.field_106706_e = var1.read();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106709_a);
      var1.write(this.field_106707_b);
      var1.writeInt(this.field_106708_c);
      var1.writeShort(this.field_106705_d);
      var1.write(this.field_106706_e);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106951_a(this);
   }

   public int func_106552_a() {
      return 11;
   }
}
