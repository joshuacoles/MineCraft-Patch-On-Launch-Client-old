import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100271_ey extends C_100219_dx {

   public int field_106698_a;
   public int field_106696_b;
   public int field_106697_c;
   public int field_106694_d;
   public C_100353_bh field_106695_e;


   public C_100271_ey() {
      this.field_106557_r = true;
   }

   public C_100271_ey(int var1, int var2, int var3, int var4, C_100353_bh var5) {
      this.field_106557_r = true;
      this.field_106698_a = var1;
      this.field_106696_b = var2;
      this.field_106697_c = var3;
      this.field_106694_d = var4;
      this.field_106695_e = var5;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106698_a = var1.readInt();
      this.field_106696_b = var1.readShort();
      this.field_106697_c = var1.readInt();
      this.field_106694_d = var1.readByte();
      this.field_106695_e = func_106536_d(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106698_a);
      var1.writeShort(this.field_106696_b);
      var1.writeInt(this.field_106697_c);
      var1.writeByte((byte)this.field_106694_d);
      func_106554_a(this.field_106695_e, var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106974_a(this);
   }

   public int func_106552_a() {
      return 25;
   }
}
