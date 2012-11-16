import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100240_df extends C_100219_dx {

   public static final String[] field_106610_a = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
   public int field_106608_b;
   public int field_106609_c;


   public C_100240_df() {}

   public C_100240_df(int var1, int var2) {
      this.field_106608_b = var1;
      this.field_106609_c = var2;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106608_b = var1.readByte();
      this.field_106609_c = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeByte(this.field_106608_b);
      var1.writeByte(this.field_106609_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106940_a(this);
   }

   public int func_106552_a() {
      return 2;
   }

}
