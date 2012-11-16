import java.io.DataInputStream;
import java.io.DataOutputStream;

public class C_100254_dn extends C_100219_dx {

   private String field_106664_a;
   private int field_106662_b;
   private int field_106663_c = Integer.MAX_VALUE;
   private int field_106660_d;
   private float field_106661_e;
   private int field_106659_f;


   public C_100254_dn() {}

   public C_100254_dn(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_106664_a = var1;
      this.field_106662_b = (int)(var2 * 8.0D);
      this.field_106663_c = (int)(var4 * 8.0D);
      this.field_106660_d = (int)(var6 * 8.0D);
      this.field_106661_e = var8;
      this.field_106659_f = (int)(var9 * 63.0F);
      if(this.field_106659_f < 0) {
         this.field_106659_f = 0;
      }

      if(this.field_106659_f > 255) {
         this.field_106659_f = 255;
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106664_a = func_106551_a(var1, 32);
      this.field_106662_b = var1.readInt();
      this.field_106663_c = var1.readInt();
      this.field_106660_d = var1.readInt();
      this.field_106661_e = var1.readFloat();
      this.field_106659_f = var1.readUnsignedByte();
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106664_a, var1);
      var1.writeInt(this.field_106662_b);
      var1.writeInt(this.field_106663_c);
      var1.writeInt(this.field_106660_d);
      var1.writeFloat(this.field_106661_e);
      var1.writeByte(this.field_106659_f);
   }

   public String func_106655_d() {
      return this.field_106664_a;
   }

   public double func_106657_f() {
      return (double)((float)this.field_106662_b / 8.0F);
   }

   public double func_106653_g() {
      return (double)((float)this.field_106663_c / 8.0F);
   }

   public double func_106654_h() {
      return (double)((float)this.field_106660_d / 8.0F);
   }

   public float func_106656_i() {
      return this.field_106661_e;
   }

   public float func_106658_j() {
      return (float)this.field_106659_f / 63.0F;
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106970_a(this);
   }

   public int func_106552_a() {
      return 24;
   }
}
