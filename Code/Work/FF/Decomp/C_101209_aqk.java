import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class C_101209_aqk {

   private static final Map field_112008_a = new HashMap();
   private static final List field_112007_b = new ArrayList();


   public static synchronized int func_112003_a(int var0) {
      int var1 = GL11.glGenLists(var0);
      field_112008_a.put(Integer.valueOf(var1), Integer.valueOf(var0));
      return var1;
   }

   public static synchronized void func_112005_a(IntBuffer var0) {
      GL11.glGenTextures(var0);

      for(int var1 = var0.position(); var1 < var0.limit(); ++var1) {
         field_112007_b.add(Integer.valueOf(var0.get(var1)));
      }

   }

   public static synchronized void func_112000_b(int var0) {
      GL11.glDeleteLists(var0, ((Integer)field_112008_a.remove(Integer.valueOf(var0))).intValue());
   }

   public static synchronized void func_112002_a() {
      Iterator var0 = field_112008_a.entrySet().iterator();

      while(var0.hasNext()) {
         Entry var1 = (Entry)var0.next();
         GL11.glDeleteLists(((Integer)var1.getKey()).intValue(), ((Integer)var1.getValue()).intValue());
      }

      field_112008_a.clear();
      var0 = field_112007_b.iterator();

      while(var0.hasNext()) {
         int var2 = ((Integer)var0.next()).intValue();
         GL11.glDeleteTextures(var2);
      }

      field_112007_b.clear();
   }

   public static synchronized ByteBuffer func_112001_c(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer func_112004_f(int var0) {
      return func_112001_c(var0 << 2).asIntBuffer();
   }

   public static FloatBuffer func_112006_h(int var0) {
      return func_112001_c(var0 << 2).asFloatBuffer();
   }

}
