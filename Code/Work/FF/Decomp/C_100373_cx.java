import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class C_100373_cx extends C_100219_dx {

   public int field_106795_a;
   public C_100994_tv[] field_106794_b;


   public C_100373_cx() {}

   public C_100373_cx(int var1, List var2) {
      this.field_106795_a = var1;
      this.field_106794_b = new C_100994_tv[var2.size()];

      for(int var3 = 0; var3 < this.field_106794_b.length; ++var3) {
         C_100994_tv var4 = (C_100994_tv)var2.get(var3);
         this.field_106794_b[var3] = var4 == null?null:var4.func_111360_l();
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106795_a = var1.readByte();
      short var2 = var1.readShort();
      this.field_106794_b = new C_100994_tv[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field_106794_b[var3] = func_106540_c(var1);
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106795_a);
      var1.writeShort(this.field_106794_b.length);
      C_100994_tv[] var2 = this.field_106794_b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100994_tv var5 = var2[var4];
         func_106555_a(var5, var1);
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106967_a(this);
   }

   public int func_106552_a() {
      return 3 + this.field_106794_b.length * 5;
   }
}
