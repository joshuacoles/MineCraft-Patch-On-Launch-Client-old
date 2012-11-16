import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class C_101121_arh {

   private static final DateFormat field_111635_a = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
   private static IntBuffer field_111633_b;
   private static int[] field_111634_c;


   public static String func_111631_a(File var0, int var1, int var2) {
      return func_111632_a(var0, (String)null, var1, var2);
   }

   public static String func_111632_a(File var0, String var1, int var2, int var3) {
      try {
         File var4 = new File(var0, "screenshots");
         var4.mkdir();
         int var5 = var2 * var3;
         if(field_111633_b == null || field_111633_b.capacity() < var5) {
            field_111633_b = BufferUtils.createIntBuffer(var5);
            field_111634_c = new int[var5];
         }

         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
         field_111633_b.clear();
         GL11.glReadPixels(0, 0, var2, var3, '\u80e1', '\u8367', field_111633_b);
         field_111633_b.get(field_111634_c);
         func_111629_a(field_111634_c, var2, var3);
         BufferedImage var6 = new BufferedImage(var2, var3, 1);
         var6.setRGB(0, 0, var2, var3, field_111634_c, 0, var2);
         File var7;
         if(var1 == null) {
            var7 = func_111630_a(var4);
         } else {
            var7 = new File(var4, var1);
         }

         ImageIO.write(var6, "png", var7);
         return "Saved screenshot as " + var7.getName();
      } catch (Exception var8) {
         var8.printStackTrace();
         return "Failed to save: " + var8;
      }
   }

   private static File func_111630_a(File var0) {
      String var2 = field_111635_a.format(new Date()).toString();
      int var3 = 1;

      while(true) {
         File var1 = new File(var0, var2 + (var3 == 1?"":"_" + var3) + ".png");
         if(!var1.exists()) {
            return var1;
         }

         ++var3;
      }
   }

   private static void func_111629_a(int[] var0, int var1, int var2) {
      int[] var3 = new int[var1];
      int var4 = var2 / 2;

      for(int var5 = 0; var5 < var4; ++var5) {
         System.arraycopy(var0, var5 * var1, var3, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var5) * var1, var0, var5 * var1, var1);
         System.arraycopy(var3, 0, var0, (var2 - 1 - var5) * var1, var1);
      }

   }

}
