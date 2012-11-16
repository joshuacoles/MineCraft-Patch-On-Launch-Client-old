import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100263_ew extends C_100219_dx {

   public int field_106677_a;
   public int field_106675_b;
   public int field_106676_c;
   public int field_106673_d;
   public byte field_106674_e;
   public byte field_106672_f;


   public C_100263_ew() {}

   public C_100263_ew(C_100730_lb var1) {
      this.field_106677_a = var1.field_103212_k;
      this.field_106675_b = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_106676_c = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106673_d = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      this.field_106674_e = (byte)((int)(var1.field_103236_z * 256.0F / 360.0F));
      this.field_106672_f = (byte)((int)(var1.field_103177_A * 256.0F / 360.0F));
   }

   public C_100263_ew(int var1, int var2, int var3, int var4, byte var5, byte var6) {
      this.field_106677_a = var1;
      this.field_106675_b = var2;
      this.field_106676_c = var3;
      this.field_106673_d = var4;
      this.field_106674_e = var5;
      this.field_106672_f = var6;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106677_a = var1.readInt();
      this.field_106675_b = var1.readInt();
      this.field_106676_c = var1.readInt();
      this.field_106673_d = var1.readInt();
      this.field_106674_e = (byte)var1.read();
      this.field_106672_f = (byte)var1.read();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106677_a);
      var1.writeInt(this.field_106675_b);
      var1.writeInt(this.field_106676_c);
      var1.writeInt(this.field_106673_d);
      var1.write(this.field_106674_e);
      var1.write(this.field_106672_f);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106955_a(this);
   }

   public int func_106552_a() {
      return 34;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100263_ew var2 = (C_100263_ew)var1;
      return var2.field_106677_a == this.field_106677_a;
   }
}
