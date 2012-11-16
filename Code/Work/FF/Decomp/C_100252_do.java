import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100252_do extends C_100219_dx {

   public int field_106651_a = 0;
   public C_100845_xp field_106649_b;
   public boolean field_106650_c;
   public C_100836_xn field_106647_d;
   public int field_106648_e;
   public byte field_106645_f;
   public byte field_106646_g;
   public byte field_106652_h;


   public C_100252_do() {}

   public C_100252_do(int var1, C_100845_xp var2, C_100836_xn var3, boolean var4, int var5, int var6, int var7, int var8) {
      this.field_106651_a = var1;
      this.field_106649_b = var2;
      this.field_106648_e = var5;
      this.field_106645_f = (byte)var6;
      this.field_106647_d = var3;
      this.field_106646_g = (byte)var7;
      this.field_106652_h = (byte)var8;
      this.field_106650_c = var4;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106651_a = var1.readInt();
      String var2 = func_106551_a(var1, 16);
      this.field_106649_b = C_100845_xp.func_110145_a(var2);
      if(this.field_106649_b == null) {
         this.field_106649_b = C_100845_xp.field_110158_b;
      }

      byte var3 = var1.readByte();
      this.field_106650_c = (var3 & 8) == 8;
      int var4 = var3 & -9;
      this.field_106647_d = C_100836_xn.func_110086_a(var4);
      this.field_106648_e = var1.readByte();
      this.field_106645_f = var1.readByte();
      this.field_106646_g = var1.readByte();
      this.field_106652_h = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106651_a);
      func_106543_a(this.field_106649_b == null?"":this.field_106649_b.func_110148_a(), var1);
      int var2 = this.field_106647_d.func_110090_a();
      if(this.field_106650_c) {
         var2 |= 8;
      }

      var1.writeByte(var2);
      var1.writeByte(this.field_106648_e);
      var1.writeByte(this.field_106645_f);
      var1.writeByte(this.field_106646_g);
      var1.writeByte(this.field_106652_h);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106928_a(this);
   }

   public int func_106552_a() {
      int var1 = 0;
      if(this.field_106649_b != null) {
         var1 = this.field_106649_b.func_110148_a().length();
      }

      return 6 + 2 * var1 + 4 + 4 + 1 + 1 + 1;
   }
}
