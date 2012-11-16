import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class C_100403_cg extends C_100219_dx {

   public int field_106867_a;
   public int field_106865_b;
   public int field_106866_c;
   public int field_106863_d;
   public int field_106864_e;
   public int field_106861_f;
   public int field_106862_g;
   public int field_106870_h;
   public byte field_106871_i;
   public byte field_106868_j;
   public byte field_106869_k;
   private C_100605_lt field_106873_s;
   private List field_106872_t;


   public C_100403_cg() {}

   public C_100403_cg(C_100595_ln var1) {
      this.field_106867_a = var1.field_103212_k;
      this.field_106865_b = (byte)C_100727_lf.func_109315_a(var1);
      this.field_106866_c = var1.field_103208_ar.func_109298_a(var1.field_103221_t);
      this.field_106863_d = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106864_e = var1.field_103208_ar.func_109298_a(var1.field_103217_v);
      this.field_106871_i = (byte)((int)(var1.field_103236_z * 256.0F / 360.0F));
      this.field_106868_j = (byte)((int)(var1.field_103177_A * 256.0F / 360.0F));
      this.field_106869_k = (byte)((int)(var1.field_103455_ay * 256.0F / 360.0F));
      double var2 = 3.9D;
      double var4 = var1.field_103215_w;
      double var6 = var1.field_103240_x;
      double var8 = var1.field_103238_y;
      if(var4 < -var2) {
         var4 = -var2;
      }

      if(var6 < -var2) {
         var6 = -var2;
      }

      if(var8 < -var2) {
         var8 = -var2;
      }

      if(var4 > var2) {
         var4 = var2;
      }

      if(var6 > var2) {
         var6 = var2;
      }

      if(var8 > var2) {
         var8 = var2;
      }

      this.field_106861_f = (int)(var4 * 8000.0D);
      this.field_106862_g = (int)(var6 * 8000.0D);
      this.field_106870_h = (int)(var8 * 8000.0D);
      this.field_106873_s = var1.func_103087_v();
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106867_a = var1.readInt();
      this.field_106865_b = var1.readByte() & 255;
      this.field_106866_c = var1.readInt();
      this.field_106863_d = var1.readInt();
      this.field_106864_e = var1.readInt();
      this.field_106871_i = var1.readByte();
      this.field_106868_j = var1.readByte();
      this.field_106869_k = var1.readByte();
      this.field_106861_f = var1.readShort();
      this.field_106862_g = var1.readShort();
      this.field_106870_h = var1.readShort();
      this.field_106872_t = C_100605_lt.func_108845_a(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106867_a);
      var1.writeByte(this.field_106865_b & 255);
      var1.writeInt(this.field_106866_c);
      var1.writeInt(this.field_106863_d);
      var1.writeInt(this.field_106864_e);
      var1.writeByte(this.field_106871_i);
      var1.writeByte(this.field_106868_j);
      var1.writeByte(this.field_106869_k);
      var1.writeShort(this.field_106861_f);
      var1.writeShort(this.field_106862_g);
      var1.writeShort(this.field_106870_h);
      this.field_106873_s.func_108847_a(var1);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106922_a(this);
   }

   public int func_106552_a() {
      return 26;
   }

   public List func_106860_c() {
      if(this.field_106872_t == null) {
         this.field_106872_t = this.field_106873_s.func_108844_c();
      }

      return this.field_106872_t;
   }
}
