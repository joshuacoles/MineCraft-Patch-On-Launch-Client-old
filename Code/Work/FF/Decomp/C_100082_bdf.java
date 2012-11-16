import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GLContext;

public class C_100082_bdf {

   public static int field_105625_a;
   public static int field_105623_b;
   private static boolean field_105624_c = false;


   public static void func_105621_a() {
      field_105624_c = GLContext.getCapabilities().GL_ARB_multitexture && !GLContext.getCapabilities().OpenGL13;
      if(field_105624_c) {
         field_105625_a = '\u84c0';
         field_105623_b = '\u84c1';
      } else {
         field_105625_a = '\u84c0';
         field_105623_b = '\u84c1';
      }

   }

   public static void func_105620_a(int var0) {
      if(field_105624_c) {
         ARBMultitexture.glActiveTextureARB(var0);
      } else {
         GL13.glActiveTexture(var0);
      }

   }

   public static void func_105619_b(int var0) {
      if(field_105624_c) {
         ARBMultitexture.glClientActiveTextureARB(var0);
      } else {
         GL13.glClientActiveTexture(var0);
      }

   }

   public static void func_105622_a(int var0, float var1, float var2) {
      if(field_105624_c) {
         ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
      } else {
         GL13.glMultiTexCoord2f(var0, var1, var2);
      }

   }

}
