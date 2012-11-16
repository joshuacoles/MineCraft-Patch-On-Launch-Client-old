import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100407_ce extends C_100219_dx {

   public int field_106884_a;
   public int field_106882_b;
   public int field_106883_c;
   public int field_106880_d;
   public int field_106881_e;


   public C_100407_ce() {}

   public C_100407_ce(C_100730_lb var1) {
      this.field_106884_a = var1.field_103212_k;
      this.field_106882_b = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_106883_c = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106880_d = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      if(var1 instanceof C_100570_pd) {
         this.field_106881_e = 1;
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106884_a = var1.readInt();
      this.field_106881_e = var1.readByte();
      this.field_106882_b = var1.readInt();
      this.field_106883_c = var1.readInt();
      this.field_106880_d = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106884_a);
      var1.writeByte(this.field_106881_e);
      var1.writeInt(this.field_106882_b);
      var1.writeInt(this.field_106883_c);
      var1.writeInt(this.field_106880_d);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106969_a(this);
   }

   public int func_106552_a() {
      return 17;
   }
}
