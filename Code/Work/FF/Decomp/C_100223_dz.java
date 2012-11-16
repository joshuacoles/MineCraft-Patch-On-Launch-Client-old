import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100223_dz extends C_100219_dx {

   private boolean field_106583_a = false;
   private boolean field_106581_b = false;
   private boolean field_106582_c = false;
   private boolean field_106579_d = false;
   private float field_106580_e;
   private float field_106578_f;


   public C_100223_dz() {}

   public C_100223_dz(C_101093_qe var1) {
      this.func_106573_a(var1.field_111601_a);
      this.func_106569_b(var1.field_111599_b);
      this.func_106574_c(var1.field_111600_c);
      this.func_106577_d(var1.field_111597_d);
      this.func_106571_a(var1.func_111591_a());
      this.func_106575_b(var1.func_111592_b());
   }

   public void func_106537_a(DataInputStream var1) {
      byte var2 = var1.readByte();
      this.func_106573_a((var2 & 1) > 0);
      this.func_106569_b((var2 & 2) > 0);
      this.func_106574_c((var2 & 4) > 0);
      this.func_106577_d((var2 & 8) > 0);
      this.func_106571_a((float)var1.readByte() / 255.0F);
      this.func_106575_b((float)var1.readByte() / 255.0F);
   }

   public void func_106544_a(DataOutputStream var1) {
      byte var2 = 0;
      if(this.func_106572_d()) {
         var2 = (byte)(var2 | 1);
      }

      if(this.func_106570_f()) {
         var2 = (byte)(var2 | 2);
      }

      if(this.func_106568_g()) {
         var2 = (byte)(var2 | 4);
      }

      if(this.func_106566_h()) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeByte((int)(this.field_106580_e * 255.0F));
      var1.writeByte((int)(this.field_106578_f * 255.0F));
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106941_a(this);
   }

   public int func_106552_a() {
      return 2;
   }

   public boolean func_106572_d() {
      return this.field_106583_a;
   }

   public void func_106573_a(boolean var1) {
      this.field_106583_a = var1;
   }

   public boolean func_106570_f() {
      return this.field_106581_b;
   }

   public void func_106569_b(boolean var1) {
      this.field_106581_b = var1;
   }

   public boolean func_106568_g() {
      return this.field_106582_c;
   }

   public void func_106574_c(boolean var1) {
      this.field_106582_c = var1;
   }

   public boolean func_106566_h() {
      return this.field_106579_d;
   }

   public void func_106577_d(boolean var1) {
      this.field_106579_d = var1;
   }

   public float func_106567_i() {
      return this.field_106580_e;
   }

   public void func_106571_a(float var1) {
      this.field_106580_e = var1;
   }

   public float func_106576_j() {
      return this.field_106578_f;
   }

   public void func_106575_b(float var1) {
      this.field_106578_f = var1;
   }

   public boolean func_106548_e() {
      return true;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return true;
   }
}
