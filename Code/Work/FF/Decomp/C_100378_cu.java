import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100378_cu extends C_100219_dx {

   public int field_106806_a;
   public int field_106804_b;
   public int field_106805_c;
   public short field_106802_d;
   public C_100994_tv field_106803_e;
   public int field_106801_f;


   public C_100378_cu() {}

   public C_100378_cu(int var1, int var2, int var3, int var4, C_100994_tv var5, short var6) {
      this.field_106806_a = var1;
      this.field_106804_b = var2;
      this.field_106805_c = var3;
      this.field_106803_e = var5;
      this.field_106802_d = var6;
      this.field_106801_f = var4;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106979_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106806_a = var1.readByte();
      this.field_106804_b = var1.readShort();
      this.field_106805_c = var1.readByte();
      this.field_106802_d = var1.readShort();
      this.field_106801_f = var1.readByte();
      this.field_106803_e = func_106540_c(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106806_a);
      var1.writeShort(this.field_106804_b);
      var1.writeByte(this.field_106805_c);
      var1.writeShort(this.field_106802_d);
      var1.writeByte(this.field_106801_f);
      func_106555_a(this.field_106803_e, var1);
   }

   public int func_106552_a() {
      return 11;
   }
}
