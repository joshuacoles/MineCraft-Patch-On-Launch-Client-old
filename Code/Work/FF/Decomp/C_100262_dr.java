import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100262_dr extends C_100258_dp {

   public C_100262_dr() {
      this.field_106666_g = true;
   }

   public C_100262_dr(int var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      super(var1);
      this.field_106669_b = var2;
      this.field_106670_c = var3;
      this.field_106667_d = var4;
      this.field_106668_e = var5;
      this.field_106665_f = var6;
      this.field_106666_g = true;
   }

   public void func_106537_a(DataInputStream var1) {
      super.func_106537_a(var1);
      this.field_106669_b = var1.readByte();
      this.field_106670_c = var1.readByte();
      this.field_106667_d = var1.readByte();
      this.field_106668_e = var1.readByte();
      this.field_106665_f = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      super.func_106544_a(var1);
      var1.writeByte(this.field_106669_b);
      var1.writeByte(this.field_106670_c);
      var1.writeByte(this.field_106667_d);
      var1.writeByte(this.field_106668_e);
      var1.writeByte(this.field_106665_f);
   }

   public int func_106552_a() {
      return 9;
   }
}
