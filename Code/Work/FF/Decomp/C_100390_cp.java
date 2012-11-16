import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100390_cp extends C_100219_dx {

   private String field_106833_a;
   private int field_106831_b;
   private int field_106832_c;
   private boolean field_106829_d;
   private int field_106830_e;
   private boolean field_106828_f;


   public C_100390_cp() {}

   public C_100390_cp(String var1, int var2, int var3, boolean var4, int var5, boolean var6) {
      this.field_106833_a = var1;
      this.field_106831_b = var2;
      this.field_106832_c = var3;
      this.field_106829_d = var4;
      this.field_106830_e = var5;
      this.field_106828_f = var6;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106833_a = func_106551_a(var1, 7);
      this.field_106831_b = var1.readByte();
      byte var2 = var1.readByte();
      this.field_106832_c = var2 & 7;
      this.field_106829_d = (var2 & 8) == 8;
      this.field_106830_e = var1.readByte();
      this.field_106828_f = var1.readBoolean();
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106833_a, var1);
      var1.writeByte(this.field_106831_b);
      var1.writeByte(this.field_106832_c | (this.field_106829_d?1:0) << 3);
      var1.writeByte(this.field_106830_e);
      var1.writeBoolean(this.field_106828_f);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106918_a(this);
   }

   public int func_106552_a() {
      return 7;
   }

   public String func_106822_d() {
      return this.field_106833_a;
   }

   public int func_106824_f() {
      return this.field_106831_b;
   }

   public int func_106826_g() {
      return this.field_106832_c;
   }

   public boolean func_106823_h() {
      return this.field_106829_d;
   }

   public int func_106825_i() {
      return this.field_106830_e;
   }

   public boolean func_106827_j() {
      return this.field_106828_f;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
