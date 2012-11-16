import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100409_cf extends C_100219_dx {

   public int field_106891_a;
   public int field_106889_b;
   public int field_106890_c;
   public int field_106887_d;
   public byte field_106888_e;
   public byte field_106885_f;
   public byte field_106886_g;
   public C_100994_tv field_106892_h;


   public C_100409_cf() {}

   public C_100409_cf(C_100576_pg var1) {
      this.field_106891_a = var1.field_103212_k;
      this.field_106892_h = var1.field_103279_a.func_111360_l();
      this.field_106889_b = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_106890_c = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106887_d = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      this.field_106888_e = (byte)((int)(var1.field_103215_w * 128.0D));
      this.field_106885_f = (byte)((int)(var1.field_103240_x * 128.0D));
      this.field_106886_g = (byte)((int)(var1.field_103238_y * 128.0D));
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106891_a = var1.readInt();
      this.field_106892_h = func_106540_c(var1);
      this.field_106889_b = var1.readInt();
      this.field_106890_c = var1.readInt();
      this.field_106887_d = var1.readInt();
      this.field_106888_e = var1.readByte();
      this.field_106885_f = var1.readByte();
      this.field_106886_g = var1.readByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106891_a);
      func_106555_a(this.field_106892_h, var1);
      var1.writeInt(this.field_106889_b);
      var1.writeInt(this.field_106890_c);
      var1.writeInt(this.field_106887_d);
      var1.writeByte(this.field_106888_e);
      var1.writeByte(this.field_106885_f);
      var1.writeByte(this.field_106886_g);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106961_a(this);
   }

   public int func_106552_a() {
      return 24;
   }
}
