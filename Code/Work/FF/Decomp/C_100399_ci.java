import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class C_100399_ci extends C_100219_dx {

   public int field_106854_a;
   public String field_106852_b;
   public int field_106853_c;
   public int field_106850_d;
   public int field_106851_e;
   public byte field_106848_f;
   public byte field_106849_g;
   public int field_106856_h;
   private C_100605_lt field_106857_i;
   private List field_106855_j;


   public C_100399_ci() {}

   public C_100399_ci(C_101095_qg var1) {
      this.field_106854_a = var1.field_103212_k;
      this.field_106852_b = var1.field_103847_bT;
      this.field_106853_c = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_106850_d = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106851_e = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      this.field_106848_f = (byte)((int)(var1.field_103236_z * 256.0F / 360.0F));
      this.field_106849_g = (byte)((int)(var1.field_103177_A * 256.0F / 360.0F));
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      this.field_106856_h = var2 == null?0:var2.field_111397_c;
      this.field_106857_i = var1.func_103087_v();
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106854_a = var1.readInt();
      this.field_106852_b = func_106551_a(var1, 16);
      this.field_106853_c = var1.readInt();
      this.field_106850_d = var1.readInt();
      this.field_106851_e = var1.readInt();
      this.field_106848_f = var1.readByte();
      this.field_106849_g = var1.readByte();
      this.field_106856_h = var1.readShort();
      this.field_106855_j = C_100605_lt.func_108845_a(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106854_a);
      func_106543_a(this.field_106852_b, var1);
      var1.writeInt(this.field_106853_c);
      var1.writeInt(this.field_106850_d);
      var1.writeInt(this.field_106851_e);
      var1.writeByte(this.field_106848_f);
      var1.writeByte(this.field_106849_g);
      var1.writeShort(this.field_106856_h);
      this.field_106857_i.func_108847_a(var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106966_a(this);
   }

   public int func_106552_a() {
      return 28;
   }

   public List func_106847_c() {
      if(this.field_106855_j == null) {
         this.field_106855_j = this.field_106857_i.func_108844_c();
      }

      return this.field_106855_j;
   }
}
