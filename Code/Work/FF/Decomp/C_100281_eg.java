import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100281_eg extends C_100219_dx {

   public int field_106736_a;
   public int field_106734_b;
   public int field_106735_c;
   public C_100836_xn field_106732_d;
   public C_100845_xp field_106733_e;


   public C_100281_eg() {}

   public C_100281_eg(int var1, byte var2, C_100845_xp var3, int var4, C_100836_xn var5) {
      this.field_106736_a = var1;
      this.field_106734_b = var2;
      this.field_106735_c = var4;
      this.field_106732_d = var5;
      this.field_106733_e = var3;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106938_a(this);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106736_a = var1.readInt();
      this.field_106734_b = var1.readByte();
      this.field_106732_d = C_100836_xn.func_110086_a(var1.readByte());
      this.field_106735_c = var1.readShort();
      String var2 = func_106551_a(var1, 16);
      this.field_106733_e = C_100845_xp.func_110145_a(var2);
      if(this.field_106733_e == null) {
         this.field_106733_e = C_100845_xp.field_110158_b;
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106736_a);
      var1.writeByte(this.field_106734_b);
      var1.writeByte(this.field_106732_d.func_110090_a());
      var1.writeShort(this.field_106735_c);
      func_106543_a(this.field_106733_e.func_110148_a(), var1);
   }

   public int func_106552_a() {
      return 8 + (this.field_106733_e == null?0:this.field_106733_e.func_110148_a().length());
   }
}
