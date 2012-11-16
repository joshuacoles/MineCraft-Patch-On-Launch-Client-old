import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100299_en extends C_100219_dx {

   public int field_106761_a;
   public int field_106759_b;
   private C_100994_tv field_106760_c;


   public C_100299_en() {}

   public C_100299_en(int var1, int var2, C_100994_tv var3) {
      this.field_106761_a = var1;
      this.field_106759_b = var2;
      this.field_106760_c = var3 == null?null:var3.func_111360_l();
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106761_a = var1.readInt();
      this.field_106759_b = var1.readShort();
      this.field_106760_c = func_106540_c(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106761_a);
      var1.writeShort(this.field_106759_b);
      func_106555_a(this.field_106760_c, var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106964_a(this);
   }

   public int func_106552_a() {
      return 8;
   }

   public C_100994_tv func_106758_d() {
      return this.field_106760_c;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100299_en var2 = (C_100299_en)var1;
      return var2.field_106761_a == this.field_106761_a && var2.field_106759_b == this.field_106759_b;
   }
}
