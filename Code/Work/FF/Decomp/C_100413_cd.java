import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100413_cd extends C_100219_dx {

   public int field_106906_a;
   public int field_106904_b;
   public int field_106905_c;
   public int field_106902_d;
   public int field_106903_e;


   public C_100413_cd() {}

   public C_100413_cd(C_100722_lj var1) {
      this.field_106906_a = var1.field_103212_k;
      this.field_106904_b = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_106905_c = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106902_d = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      this.field_106903_e = var1.func_104590_c();
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106906_a = var1.readInt();
      this.field_106904_b = var1.readInt();
      this.field_106905_c = var1.readInt();
      this.field_106902_d = var1.readInt();
      this.field_106903_e = var1.readShort();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106906_a);
      var1.writeInt(this.field_106904_b);
      var1.writeInt(this.field_106905_c);
      var1.writeInt(this.field_106902_d);
      var1.writeShort(this.field_106903_e);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106959_a(this);
   }

   public int func_106552_a() {
      return 18;
   }
}
