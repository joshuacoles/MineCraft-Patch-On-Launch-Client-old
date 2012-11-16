import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class C_101210_aqj {

   private static FloatBuffer field_112016_a = C_101209_aqk.func_112006_h(16);
   private static final C_100387_amw field_112014_b = C_100387_amw.func_107858_a(0.20000000298023224D, 1.0D, -0.699999988079071D).func_107865_a();
   private static final C_100387_amw field_112015_c = C_100387_amw.func_107858_a(-0.20000000298023224D, 1.0D, 0.699999988079071D).func_107865_a();


   public static void func_112010_a() {
      GL11.glDisable(2896);
      GL11.glDisable(16384);
      GL11.glDisable(16385);
      GL11.glDisable(2903);
   }

   public static void func_112011_b() {
      GL11.glEnable(2896);
      GL11.glEnable(16384);
      GL11.glEnable(16385);
      GL11.glEnable(2903);
      GL11.glColorMaterial(1032, 5634);
      float var0 = 0.4F;
      float var1 = 0.6F;
      float var2 = 0.0F;
      GL11.glLight(16384, 4611, func_112009_a(field_112014_b.field_107872_c, field_112014_b.field_107869_d, field_112014_b.field_107870_e, 0.0D));
      GL11.glLight(16384, 4609, func_112013_a(var1, var1, var1, 1.0F));
      GL11.glLight(16384, 4608, func_112013_a(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16384, 4610, func_112013_a(var2, var2, var2, 1.0F));
      GL11.glLight(16385, 4611, func_112009_a(field_112015_c.field_107872_c, field_112015_c.field_107869_d, field_112015_c.field_107870_e, 0.0D));
      GL11.glLight(16385, 4609, func_112013_a(var1, var1, var1, 1.0F));
      GL11.glLight(16385, 4608, func_112013_a(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16385, 4610, func_112013_a(var2, var2, var2, 1.0F));
      GL11.glShadeModel(7424);
      GL11.glLightModel(2899, func_112013_a(var0, var0, var0, 1.0F));
   }

   private static FloatBuffer func_112009_a(double var0, double var2, double var4, double var6) {
      return func_112013_a((float)var0, (float)var2, (float)var4, (float)var6);
   }

   private static FloatBuffer func_112013_a(float var0, float var1, float var2, float var3) {
      field_112016_a.clear();
      field_112016_a.put(var0).put(var1).put(var2).put(var3);
      field_112016_a.flip();
      return field_112016_a;
   }

   public static void func_112012_c() {
      GL11.glPushMatrix();
      GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(165.0F, 1.0F, 0.0F, 0.0F);
      func_112011_b();
      GL11.glPopMatrix();
   }

}
