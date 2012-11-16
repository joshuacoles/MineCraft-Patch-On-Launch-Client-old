import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100248_dm extends C_100219_dx {

   public int field_106632_a;
   public int field_106630_b;
   public int field_106631_c;
   public int field_106628_d;
   public int field_106629_e;
   private boolean field_106627_f;


   public C_100248_dm() {}

   public C_100248_dm(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.field_106632_a = var1;
      this.field_106631_c = var2;
      this.field_106628_d = var3;
      this.field_106629_e = var4;
      this.field_106630_b = var5;
      this.field_106627_f = var6;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106632_a = var1.readInt();
      this.field_106631_c = var1.readInt();
      this.field_106628_d = var1.readByte() & 255;
      this.field_106629_e = var1.readInt();
      this.field_106630_b = var1.readInt();
      this.field_106627_f = var1.readBoolean();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106632_a);
      var1.writeInt(this.field_106631_c);
      var1.writeByte(this.field_106628_d & 255);
      var1.writeInt(this.field_106629_e);
      var1.writeInt(this.field_106630_b);
      var1.writeBoolean(this.field_106627_f);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106936_a(this);
   }

   public int func_106552_a() {
      return 21;
   }

   public boolean func_106626_d() {
      return this.field_106627_f;
   }
}
