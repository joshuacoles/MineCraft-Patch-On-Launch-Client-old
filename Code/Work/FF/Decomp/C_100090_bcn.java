import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C_100090_bcn extends C_100083_bck {

   public C_100090_bcn(String var1, File var2) {
      super(var1, var2, var2.getName());
   }

   public InputStream func_105627_a(String var1) {
      try {
         File var2 = new File(this.field_105643_a, var1.substring(1));
         if(var2.exists()) {
            return new BufferedInputStream(new FileInputStream(var2));
         }
      } catch (IOException var3) {
         ;
      }

      return super.func_105627_a(var1);
   }
}
