import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100265_ex extends C_100219_dx {

   private int field_106687_a;
   private int field_106685_b;
   private int field_106686_c;
   private int field_106683_d;
   private int field_106684_e;


   public C_100265_ex() {}

   public C_100265_ex(int var1, int var2, int var3, int var4, int var5) {
      this.field_106687_a = var1;
      this.field_106685_b = var2;
      this.field_106686_c = var3;
      this.field_106683_d = var4;
      this.field_106684_e = var5;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106687_a = var1.readInt();
      this.field_106685_b = var1.readInt();
      this.field_106686_c = var1.readInt();
      this.field_106683_d = var1.readInt();
      this.field_106684_e = var1.read();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106687_a);
      var1.writeInt(this.field_106685_b);
      var1.writeInt(this.field_106686_c);
      var1.writeInt(this.field_106683_d);
      var1.write(this.field_106684_e);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106939_a(this);
   }

   public int func_106552_a() {
      return 13;
   }

   public int func_106680_d() {
      return this.field_106687_a;
   }

   public int func_106679_f() {
      return this.field_106685_b;
   }

   public int func_106682_g() {
      return this.field_106686_c;
   }

   public int func_106678_h() {
      return this.field_106683_d;
   }

   public int func_106681_i() {
      return this.field_106684_e;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      C_100265_ex var2 = (C_100265_ex)var1;
      return var2.field_106687_a == this.field_106687_a;
   }
}
