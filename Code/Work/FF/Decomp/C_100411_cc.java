import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100411_cc extends C_100219_dx {

   public int field_106899_a;
   public int field_106897_b;
   public int field_106898_c;
   public int field_106895_d;
   public int field_106896_e;
   public int field_106893_f;
   public int field_106894_g;
   public int field_106900_h;
   public int field_106901_i;


   public C_100411_cc() {}

   public C_100411_cc(C_100730_lb var1, int var2) {
      this(var1, var2, 0);
   }

   public C_100411_cc(C_100730_lb var1, int var2, int var3) {
      this.field_106899_a = var1.field_103212_k;
      this.field_106897_b = C_100650_jv.func_108910_c(var1.field_103221_t * 32.0D);
      this.field_106898_c = C_100650_jv.func_108910_c(var1.field_103219_u * 32.0D);
      this.field_106895_d = C_100650_jv.func_108910_c(var1.field_103217_v * 32.0D);
      this.field_106900_h = var2;
      this.field_106901_i = var3;
      if(var3 > 0) {
         double var4 = var1.field_103215_w;
         double var6 = var1.field_103240_x;
         double var8 = var1.field_103238_y;
         double var10 = 3.9D;
         if(var4 < -var10) {
            var4 = -var10;
         }

         if(var6 < -var10) {
            var6 = -var10;
         }

         if(var8 < -var10) {
            var8 = -var10;
         }

         if(var4 > var10) {
            var4 = var10;
         }

         if(var6 > var10) {
            var6 = var10;
         }

         if(var8 > var10) {
            var8 = var10;
         }

         this.field_106896_e = (int)(var4 * 8000.0D);
         this.field_106893_f = (int)(var6 * 8000.0D);
         this.field_106894_g = (int)(var8 * 8000.0D);
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106899_a = var1.readInt();
      this.field_106900_h = var1.readByte();
      this.field_106897_b = var1.readInt();
      this.field_106898_c = var1.readInt();
      this.field_106895_d = var1.readInt();
      this.field_106901_i = var1.readInt();
      if(this.field_106901_i > 0) {
         this.field_106896_e = var1.readShort();
         this.field_106893_f = var1.readShort();
         this.field_106894_g = var1.readShort();
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106899_a);
      var1.writeByte(this.field_106900_h);
      var1.writeInt(this.field_106897_b);
      var1.writeInt(this.field_106898_c);
      var1.writeInt(this.field_106895_d);
      var1.writeInt(this.field_106901_i);
      if(this.field_106901_i > 0) {
         var1.writeShort(this.field_106896_e);
         var1.writeShort(this.field_106893_f);
         var1.writeShort(this.field_106894_g);
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106976_a(this);
   }

   public int func_106552_a() {
      return 21 + this.field_106901_i > 0?6:0;
   }
}
