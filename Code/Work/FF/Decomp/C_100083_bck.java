import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public abstract class C_100083_bck implements C_100087_bco {

   private final String field_105640_e;
   private final String field_105637_f;
   protected final File field_105643_a;
   protected String field_105641_b;
   protected String field_105642_c;
   protected BufferedImage field_105639_d;
   private int field_105638_g;


   protected C_100083_bck(String var1, String var2) {
      this(var1, (File)null, var2);
   }

   protected C_100083_bck(String var1, File var2, String var3) {
      this.field_105638_g = -1;
      this.field_105640_e = var1;
      this.field_105637_f = var3;
      this.field_105643_a = var2;
      this.func_105634_g();
      this.func_105635_a();
   }

   private static String func_105636_b(String var0) {
      if(var0 != null && var0.length() > 34) {
         var0 = var0.substring(0, 34);
      }

      return var0;
   }

   private void func_105634_g() {
      InputStream var1 = null;

      try {
         var1 = this.func_105627_a("/pack.png");
         this.field_105639_d = ImageIO.read(var1);
      } catch (IOException var11) {
         ;
      } finally {
         try {
            var1.close();
         } catch (IOException var10) {
            ;
         }

      }

   }

   protected void func_105635_a() {
      InputStream var1 = null;
      BufferedReader var2 = null;

      try {
         var1 = this.func_105627_a("/pack.txt");
         var2 = new BufferedReader(new InputStreamReader(var1));
         this.field_105641_b = func_105636_b(var2.readLine());
         this.field_105642_c = func_105636_b(var2.readLine());
      } catch (IOException var12) {
         ;
      } finally {
         try {
            var2.close();
            var1.close();
         } catch (IOException var11) {
            ;
         }

      }

   }

   public void func_105630_a(C_100874_azc var1) {
      if(this.field_105639_d != null && this.field_105638_g != -1) {
         var1.func_110370_a(this.field_105638_g);
      }

   }

   public void func_105633_b(C_100874_azc var1) {
      if(this.field_105639_d != null) {
         if(this.field_105638_g == -1) {
            this.field_105638_g = var1.func_110383_a(this.field_105639_d);
         }

         var1.func_110368_b(this.field_105638_g);
      } else {
         GL11.glBindTexture(3553, var1.func_110367_b("/gui/unknown_pack.png"));
      }

   }

   public InputStream func_105627_a(String var1) {
      return C_100087_bco.class.getResourceAsStream(var1);
   }

   public String func_105629_b() {
      return this.field_105640_e;
   }

   public String func_105632_c() {
      return this.field_105637_f;
   }

   public String func_105626_d() {
      return this.field_105641_b;
   }

   public String func_105631_e() {
      return this.field_105642_c;
   }

   public int func_105628_f() {
      return 16;
   }
}
