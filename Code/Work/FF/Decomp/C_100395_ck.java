import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100395_ck extends C_100219_dx {

   public int field_106844_a;
   public int field_106843_b;


   public C_100395_ck() {}

   public C_100395_ck(int var1, int var2) {
      this.field_106844_a = var1;
      this.field_106843_b = var2;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106930_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106844_a = var1.readInt();
      this.field_106843_b = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106844_a);
      var1.writeByte(this.field_106843_b);
   }

   public int func_106552_a() {
      return 6;
   }

   public boolean func_106547_a_() {
      return true;
   }
}
