import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100405_ch extends C_100219_dx {

   public int field_106879_a;
   public int field_106877_b;
   public int field_106878_c;
   public int field_106875_d;
   public int field_106876_e;
   public String field_106874_f;


   public C_100405_ch() {}

   public C_100405_ch(C_100600_lq var1) {
      this.field_106879_a = var1.field_103212_k;
      this.field_106877_b = var1.field_104579_b;
      this.field_106878_c = var1.field_104580_c;
      this.field_106875_d = var1.field_104577_d;
      this.field_106876_e = var1.field_104581_a;
      this.field_106874_f = var1.field_104587_e.field_108788_B;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106879_a = var1.readInt();
      this.field_106874_f = func_106551_a(var1, C_100599_lr.field_108787_A);
      this.field_106877_b = var1.readInt();
      this.field_106878_c = var1.readInt();
      this.field_106875_d = var1.readInt();
      this.field_106876_e = var1.readInt();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106879_a);
      func_106543_a(this.field_106874_f, var1);
      var1.writeInt(this.field_106877_b);
      var1.writeInt(this.field_106878_c);
      var1.writeInt(this.field_106875_d);
      var1.writeInt(this.field_106876_e);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106952_a(this);
   }

   public int func_106552_a() {
      return 24;
   }
}
