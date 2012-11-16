import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100266_eu extends C_100219_dx {

   public int field_106691_a;
   public int field_106689_b;
   public int field_106690_c;
   public String[] field_106688_d;


   public C_100266_eu() {
      this.field_106557_r = true;
   }

   public C_100266_eu(int var1, int var2, int var3, String[] var4) {
      this.field_106557_r = true;
      this.field_106691_a = var1;
      this.field_106689_b = var2;
      this.field_106690_c = var3;
      this.field_106688_d = new String[]{var4[0], var4[1], var4[2], var4[3]};
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106691_a = var1.readInt();
      this.field_106689_b = var1.readShort();
      this.field_106690_c = var1.readInt();
      this.field_106688_d = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.field_106688_d[var2] = func_106551_a(var1, 15);
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106691_a);
      var1.writeShort(this.field_106689_b);
      var1.writeInt(this.field_106690_c);

      for(int var2 = 0; var2 < 4; ++var2) {
         func_106543_a(this.field_106688_d[var2], var1);
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106968_a(this);
   }

   public int func_106552_a() {
      int var1 = 0;

      for(int var2 = 0; var2 < 4; ++var2) {
         var1 += this.field_106688_d[var2].length();
      }

      return var1;
   }
}
