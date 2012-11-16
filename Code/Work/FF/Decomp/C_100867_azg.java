import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class C_100867_azg extends C_100838_azi {

   private static C_100867_azg field_110111_e = new C_100867_azg();
   private FloatBuffer field_110109_f = C_101209_aqk.func_112006_h(16);
   private FloatBuffer field_110110_g = C_101209_aqk.func_112006_h(16);
   private FloatBuffer field_110112_h = C_101209_aqk.func_112006_h(16);


   public static C_100838_azi func_110106_a() {
      field_110111_e.func_110108_b();
      return field_110111_e;
   }

   private void func_110107_a(float[][] var1, int var2) {
      float var3 = C_100650_jv.func_108913_c(var1[var2][0] * var1[var2][0] + var1[var2][1] * var1[var2][1] + var1[var2][2] * var1[var2][2]);
      var1[var2][0] /= var3;
      var1[var2][1] /= var3;
      var1[var2][2] /= var3;
      var1[var2][3] /= var3;
   }

   private void func_110108_b() {
      this.field_110109_f.clear();
      this.field_110110_g.clear();
      this.field_110112_h.clear();
      GL11.glGetFloat(2983, this.field_110109_f);
      GL11.glGetFloat(2982, this.field_110110_g);
      this.field_110109_f.flip().limit(16);
      this.field_110109_f.get(this.field_110103_b);
      this.field_110110_g.flip().limit(16);
      this.field_110110_g.get(this.field_110104_c);
      this.field_110102_d[0] = this.field_110104_c[0] * this.field_110103_b[0] + this.field_110104_c[1] * this.field_110103_b[4] + this.field_110104_c[2] * this.field_110103_b[8] + this.field_110104_c[3] * this.field_110103_b[12];
      this.field_110102_d[1] = this.field_110104_c[0] * this.field_110103_b[1] + this.field_110104_c[1] * this.field_110103_b[5] + this.field_110104_c[2] * this.field_110103_b[9] + this.field_110104_c[3] * this.field_110103_b[13];
      this.field_110102_d[2] = this.field_110104_c[0] * this.field_110103_b[2] + this.field_110104_c[1] * this.field_110103_b[6] + this.field_110104_c[2] * this.field_110103_b[10] + this.field_110104_c[3] * this.field_110103_b[14];
      this.field_110102_d[3] = this.field_110104_c[0] * this.field_110103_b[3] + this.field_110104_c[1] * this.field_110103_b[7] + this.field_110104_c[2] * this.field_110103_b[11] + this.field_110104_c[3] * this.field_110103_b[15];
      this.field_110102_d[4] = this.field_110104_c[4] * this.field_110103_b[0] + this.field_110104_c[5] * this.field_110103_b[4] + this.field_110104_c[6] * this.field_110103_b[8] + this.field_110104_c[7] * this.field_110103_b[12];
      this.field_110102_d[5] = this.field_110104_c[4] * this.field_110103_b[1] + this.field_110104_c[5] * this.field_110103_b[5] + this.field_110104_c[6] * this.field_110103_b[9] + this.field_110104_c[7] * this.field_110103_b[13];
      this.field_110102_d[6] = this.field_110104_c[4] * this.field_110103_b[2] + this.field_110104_c[5] * this.field_110103_b[6] + this.field_110104_c[6] * this.field_110103_b[10] + this.field_110104_c[7] * this.field_110103_b[14];
      this.field_110102_d[7] = this.field_110104_c[4] * this.field_110103_b[3] + this.field_110104_c[5] * this.field_110103_b[7] + this.field_110104_c[6] * this.field_110103_b[11] + this.field_110104_c[7] * this.field_110103_b[15];
      this.field_110102_d[8] = this.field_110104_c[8] * this.field_110103_b[0] + this.field_110104_c[9] * this.field_110103_b[4] + this.field_110104_c[10] * this.field_110103_b[8] + this.field_110104_c[11] * this.field_110103_b[12];
      this.field_110102_d[9] = this.field_110104_c[8] * this.field_110103_b[1] + this.field_110104_c[9] * this.field_110103_b[5] + this.field_110104_c[10] * this.field_110103_b[9] + this.field_110104_c[11] * this.field_110103_b[13];
      this.field_110102_d[10] = this.field_110104_c[8] * this.field_110103_b[2] + this.field_110104_c[9] * this.field_110103_b[6] + this.field_110104_c[10] * this.field_110103_b[10] + this.field_110104_c[11] * this.field_110103_b[14];
      this.field_110102_d[11] = this.field_110104_c[8] * this.field_110103_b[3] + this.field_110104_c[9] * this.field_110103_b[7] + this.field_110104_c[10] * this.field_110103_b[11] + this.field_110104_c[11] * this.field_110103_b[15];
      this.field_110102_d[12] = this.field_110104_c[12] * this.field_110103_b[0] + this.field_110104_c[13] * this.field_110103_b[4] + this.field_110104_c[14] * this.field_110103_b[8] + this.field_110104_c[15] * this.field_110103_b[12];
      this.field_110102_d[13] = this.field_110104_c[12] * this.field_110103_b[1] + this.field_110104_c[13] * this.field_110103_b[5] + this.field_110104_c[14] * this.field_110103_b[9] + this.field_110104_c[15] * this.field_110103_b[13];
      this.field_110102_d[14] = this.field_110104_c[12] * this.field_110103_b[2] + this.field_110104_c[13] * this.field_110103_b[6] + this.field_110104_c[14] * this.field_110103_b[10] + this.field_110104_c[15] * this.field_110103_b[14];
      this.field_110102_d[15] = this.field_110104_c[12] * this.field_110103_b[3] + this.field_110104_c[13] * this.field_110103_b[7] + this.field_110104_c[14] * this.field_110103_b[11] + this.field_110104_c[15] * this.field_110103_b[15];
      this.field_110105_a[0][0] = this.field_110102_d[3] - this.field_110102_d[0];
      this.field_110105_a[0][1] = this.field_110102_d[7] - this.field_110102_d[4];
      this.field_110105_a[0][2] = this.field_110102_d[11] - this.field_110102_d[8];
      this.field_110105_a[0][3] = this.field_110102_d[15] - this.field_110102_d[12];
      this.func_110107_a(this.field_110105_a, 0);
      this.field_110105_a[1][0] = this.field_110102_d[3] + this.field_110102_d[0];
      this.field_110105_a[1][1] = this.field_110102_d[7] + this.field_110102_d[4];
      this.field_110105_a[1][2] = this.field_110102_d[11] + this.field_110102_d[8];
      this.field_110105_a[1][3] = this.field_110102_d[15] + this.field_110102_d[12];
      this.func_110107_a(this.field_110105_a, 1);
      this.field_110105_a[2][0] = this.field_110102_d[3] + this.field_110102_d[1];
      this.field_110105_a[2][1] = this.field_110102_d[7] + this.field_110102_d[5];
      this.field_110105_a[2][2] = this.field_110102_d[11] + this.field_110102_d[9];
      this.field_110105_a[2][3] = this.field_110102_d[15] + this.field_110102_d[13];
      this.func_110107_a(this.field_110105_a, 2);
      this.field_110105_a[3][0] = this.field_110102_d[3] - this.field_110102_d[1];
      this.field_110105_a[3][1] = this.field_110102_d[7] - this.field_110102_d[5];
      this.field_110105_a[3][2] = this.field_110102_d[11] - this.field_110102_d[9];
      this.field_110105_a[3][3] = this.field_110102_d[15] - this.field_110102_d[13];
      this.func_110107_a(this.field_110105_a, 3);
      this.field_110105_a[4][0] = this.field_110102_d[3] - this.field_110102_d[2];
      this.field_110105_a[4][1] = this.field_110102_d[7] - this.field_110102_d[6];
      this.field_110105_a[4][2] = this.field_110102_d[11] - this.field_110102_d[10];
      this.field_110105_a[4][3] = this.field_110102_d[15] - this.field_110102_d[14];
      this.func_110107_a(this.field_110105_a, 4);
      this.field_110105_a[5][0] = this.field_110102_d[3] + this.field_110102_d[2];
      this.field_110105_a[5][1] = this.field_110102_d[7] + this.field_110102_d[6];
      this.field_110105_a[5][2] = this.field_110102_d[11] + this.field_110102_d[10];
      this.field_110105_a[5][3] = this.field_110102_d[15] + this.field_110102_d[14];
      this.func_110107_a(this.field_110105_a, 5);
   }

}
