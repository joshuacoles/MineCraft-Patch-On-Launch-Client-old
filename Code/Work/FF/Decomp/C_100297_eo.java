import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100297_eo extends C_100219_dx {

   public float field_106757_a;
   public int field_106755_b;
   public int field_106756_c;


   public C_100297_eo() {}

   public C_100297_eo(float var1, int var2, int var3) {
      this.field_106757_a = var1;
      this.field_106755_b = var2;
      this.field_106756_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106757_a = var1.readFloat();
      this.field_106756_c = var1.readShort();
      this.field_106755_b = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeFloat(this.field_106757_a);
      var1.writeShort(this.field_106756_c);
      var1.writeShort(this.field_106755_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106983_a(this);
   }

   public int func_106552_a() {
      return 4;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
