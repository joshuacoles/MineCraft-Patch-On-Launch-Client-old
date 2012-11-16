import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class C_100089_bcm extends C_100083_bck {

   private ZipFile field_105645_e;


   public C_100089_bcm(String var1, File var2) {
      super(var1, var2, var2.getName());
   }

   public void func_105630_a(C_100874_azc var1) {
      super.func_105630_a(var1);

      try {
         if(this.field_105645_e != null) {
            this.field_105645_e.close();
         }
      } catch (IOException var3) {
         ;
      }

      this.field_105645_e = null;
   }

   public InputStream func_105627_a(String var1) {
      this.func_105644_g();

      try {
         ZipEntry var2 = this.field_105645_e.getEntry(var1.substring(1));
         if(var2 != null) {
            return this.field_105645_e.getInputStream(var2);
         }
      } catch (Exception var3) {
         ;
      }

      return super.func_105627_a(var1);
   }

   private void func_105644_g() {
      if(this.field_105645_e == null) {
         try {
            this.field_105645_e = new ZipFile(this.field_105643_a);
         } catch (IOException var2) {
            ;
         }

      }
   }
}
