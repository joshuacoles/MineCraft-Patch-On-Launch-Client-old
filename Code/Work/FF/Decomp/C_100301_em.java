import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100301_em extends C_100219_dx {

   public int field_106765_a;
   public int field_106763_b;
   public int field_106764_c;
   public int field_106762_d;


   public C_100301_em() {}

   public C_100301_em(C_100730_lb var1) {
      this(var1.field_103212_k, var1.field_103215_w, var1.field_103240_x, var1.field_103238_y);
   }

   public C_100301_em(int var1, double var2, double var4, double var6) {
      this.field_106765_a = var1;
      double var8 = 3.9D;
      if(var2 < -var8) {
         var2 = -var8;
      }

      if(var4 < -var8) {
         var4 = -var8;
      }

      if(var6 < -var8) {
         var6 = -var8;
      }

      if(var2 > var8) {
         var2 = var8;
      }

      if(var4 > var8) {
         var4 = var8;
      }

      if(var6 > var8) {
         var6 = var8;
      }

      this.field_106763_b = (int)(var2 * 8000.0D);
      this.field_106764_c = (int)(var4 * 8000.0D);
      this.field_106762_d = (int)(var6 * 8000.0D);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106765_a = var1.readInt();
      this.field_106763_b = var1.readShort();
      this.field_106764_c = var1.readShort();
      this.field_106762_d = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106765_a);
      var1.writeShort(this.field_106763_b);
      var1.writeShort(this.field_106764_c);
      var1.writeShort(this.field_106762_d);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106972_a(this);
   }

   public int func_106552_a() {
      return 10;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100301_em var2 = (C_100301_em)var1;
      return var2.field_106765_a == this.field_106765_a;
   }
}
