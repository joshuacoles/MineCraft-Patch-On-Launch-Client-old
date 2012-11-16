import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class C_101203_aqb {

   public static float field_111975_a = 0.0F;
   public static float field_111973_b = 0.0F;
   public static float field_111974_c = 0.0F;
   private static IntBuffer field_111980_i = C_101209_aqk.func_112004_f(16);
   private static FloatBuffer field_111977_j = C_101209_aqk.func_112006_h(16);
   private static FloatBuffer field_111978_k = C_101209_aqk.func_112006_h(16);
   private static FloatBuffer field_111976_l = C_101209_aqk.func_112006_h(3);
   public static float field_111971_d;
   public static float field_111972_e;
   public static float field_111969_f;
   public static float field_111970_g;
   public static float field_111979_h;


   public static void func_111966_a(C_101095_qg var0, boolean var1) {
      GL11.glGetFloat(2982, field_111977_j);
      GL11.glGetFloat(2983, field_111978_k);
      GL11.glGetInteger(2978, field_111980_i);
      float var2 = (float)((field_111980_i.get(0) + field_111980_i.get(2)) / 2);
      float var3 = (float)((field_111980_i.get(1) + field_111980_i.get(3)) / 2);
      GLU.gluUnProject(var2, var3, 0.0F, field_111977_j, field_111978_k, field_111980_i, field_111976_l);
      field_111975_a = field_111976_l.get(0);
      field_111973_b = field_111976_l.get(1);
      field_111974_c = field_111976_l.get(2);
      int var4 = var1?1:0;
      float var5 = var0.field_103177_A;
      float var6 = var0.field_103236_z;
      field_111971_d = C_100650_jv.func_108928_b(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      field_111969_f = C_100650_jv.func_108924_a(var6 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      field_111970_g = -field_111969_f * C_100650_jv.func_108924_a(var5 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      field_111979_h = field_111971_d * C_100650_jv.func_108924_a(var5 * 3.1415927F / 180.0F) * (float)(1 - var4 * 2);
      field_111972_e = C_100650_jv.func_108928_b(var5 * 3.1415927F / 180.0F);
   }

   public static C_100387_amw func_111967_b(C_100595_ln var0, double var1) {
      double var3 = var0.field_103227_q + (var0.field_103221_t - var0.field_103227_q) * var1;
      double var5 = var0.field_103225_r + (var0.field_103219_u - var0.field_103225_r) * var1 + (double)var0.func_103102_e();
      double var7 = var0.field_103223_s + (var0.field_103217_v - var0.field_103223_s) * var1;
      double var9 = var3 + (double)(field_111975_a * 1.0F);
      double var11 = var5 + (double)(field_111973_b * 1.0F);
      double var13 = var7 + (double)(field_111974_c * 1.0F);
      return var0.field_103229_p.func_109363_R().func_107878_a(var9, var11, var13);
   }

   public static int func_111968_a(C_100873_xe var0, C_100595_ln var1, float var2) {
      C_100387_amw var3 = func_111967_b(var1, (double)var2);
      C_100851_xw var4 = new C_100851_xw(var3);
      int var5 = var0.func_109349_a(var4.field_110207_a, var4.field_110205_b, var4.field_110206_c);
      if(var5 != 0 && C_100451_alf.field_106118_p[var5].field_106204_cB.func_108986_d()) {
         float var6 = C_100142_ajm.func_106269_d(var0.func_109357_g(var4.field_110207_a, var4.field_110205_b, var4.field_110206_c)) - 0.11111111F;
         float var7 = (float)(var4.field_110205_b + 1) - var6;
         if(var3.field_107869_d >= (double)var7) {
            var5 = var0.func_109349_a(var4.field_110207_a, var4.field_110205_b + 1, var4.field_110206_c);
         }
      }

      return var5;
   }

}
