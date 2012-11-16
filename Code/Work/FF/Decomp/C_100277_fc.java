import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100277_fc extends C_100219_dx {

   private int field_106728_a;
   private int field_106726_b;
   private int field_106727_c;
   private int field_106724_d;
   private C_100994_tv field_106725_e;
   private float field_106722_f;
   private float field_106723_g;
   private float field_106729_h;


   public C_100277_fc() {}

   public C_100277_fc(int var1, int var2, int var3, int var4, C_100994_tv var5, float var6, float var7, float var8) {
      this.field_106728_a = var1;
      this.field_106726_b = var2;
      this.field_106727_c = var3;
      this.field_106724_d = var4;
      this.field_106725_e = var5;
      this.field_106722_f = var6;
      this.field_106723_g = var7;
      this.field_106729_h = var8;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106728_a = var1.readInt();
      this.field_106726_b = var1.read();
      this.field_106727_c = var1.readInt();
      this.field_106724_d = var1.read();
      this.field_106725_e = func_106540_c(var1);
      this.field_106722_f = (float)var1.read() / 16.0F;
      this.field_106723_g = (float)var1.read() / 16.0F;
      this.field_106729_h = (float)var1.read() / 16.0F;
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106728_a);
      var1.write(this.field_106726_b);
      var1.writeInt(this.field_106727_c);
      var1.write(this.field_106724_d);
      func_106555_a(this.field_106725_e, var1);
      var1.write((int)(this.field_106722_f * 16.0F));
      var1.write((int)(this.field_106723_g * 16.0F));
      var1.write((int)(this.field_106729_h * 16.0F));
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106953_a(this);
   }

   public int func_106552_a() {
      return 19;
   }

   public int func_106717_d() {
      return this.field_106728_a;
   }

   public int func_106716_f() {
      return this.field_106726_b;
   }

   public int func_106720_g() {
      return this.field_106727_c;
   }

   public int func_106715_h() {
      return this.field_106724_d;
   }

   public C_100994_tv func_106714_i() {
      return this.field_106725_e;
   }

   public float func_106719_j() {
      return this.field_106722_f;
   }

   public float func_106718_l() {
      return this.field_106723_g;
   }

   public float func_106721_m() {
      return this.field_106729_h;
   }
}
