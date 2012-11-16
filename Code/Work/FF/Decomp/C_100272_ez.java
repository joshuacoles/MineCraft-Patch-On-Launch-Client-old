import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100272_ez extends C_100219_dx {

   public int field_106704_a;
   public int field_106702_b;
   public int field_106703_c;
   public int field_106700_d;
   public int field_106701_e;
   public int field_106699_f;


   public C_100272_ez() {}

   public C_100272_ez(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_106704_a = var1;
      this.field_106702_b = var2;
      this.field_106703_c = var3;
      this.field_106700_d = var5;
      this.field_106701_e = var6;
      this.field_106699_f = var4;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106704_a = var1.readInt();
      this.field_106702_b = var1.readShort();
      this.field_106703_c = var1.readInt();
      this.field_106700_d = var1.read();
      this.field_106701_e = var1.read();
      this.field_106699_f = var1.readShort() & 4095;
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106704_a);
      var1.writeShort(this.field_106702_b);
      var1.writeInt(this.field_106703_c);
      var1.write(this.field_106700_d);
      var1.write(this.field_106701_e);
      var1.writeShort(this.field_106699_f & 4095);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106950_a(this);
   }

   public int func_106552_a() {
      return 14;
   }
}
