import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100276_fb extends C_100219_dx {

   public int field_106713_a;
   public byte field_106711_b;
   public byte field_106712_c;
   public short field_106710_d;


   public C_100276_fb() {}

   public C_100276_fb(int var1, C_100692_kx var2) {
      this.field_106713_a = var1;
      this.field_106711_b = (byte)(var2.func_109197_a() & 255);
      this.field_106712_c = (byte)(var2.func_109192_c() & 255);
      this.field_106710_d = (short)var2.func_109193_b();
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106713_a = var1.readInt();
      this.field_106711_b = var1.readByte();
      this.field_106712_c = var1.readByte();
      this.field_106710_d = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106713_a);
      var1.writeByte(this.field_106711_b);
      var1.writeByte(this.field_106712_c);
      var1.writeShort(this.field_106710_d);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106945_a(this);
   }

   public int func_106552_a() {
      return 8;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100276_fb var2 = (C_100276_fb)var1;
      return var2.field_106713_a == this.field_106713_a && var2.field_106711_b == this.field_106711_b;
   }
}
