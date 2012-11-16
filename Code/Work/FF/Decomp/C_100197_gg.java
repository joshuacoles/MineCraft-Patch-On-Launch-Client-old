import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_100197_gg {

   public static Logger field_106535_a = Logger.getLogger("Minecraft");
   private Properties field_106533_b = new Properties();
   private File field_106534_c;


   public C_100197_gg(File var1) {
      this.field_106534_c = var1;
      if(var1.exists()) {
         FileInputStream var2 = null;

         try {
            var2 = new FileInputStream(var1);
            this.field_106533_b.load(var2);
         } catch (Exception var12) {
            field_106535_a.log(Level.WARNING, "Failed to load " + var1, var12);
            this.func_106527_a();
         } finally {
            if(var2 != null) {
               try {
                  var2.close();
               } catch (IOException var11) {
                  ;
               }
            }

         }
      } else {
         field_106535_a.log(Level.WARNING, var1 + " does not exist");
         this.func_106527_a();
      }

   }

   public void func_106527_a() {
      field_106535_a.log(Level.INFO, "Generating new properties file");
      this.func_106529_b();
   }

   public void func_106529_b() {
      FileOutputStream var1 = null;

      try {
         var1 = new FileOutputStream(this.field_106534_c);
         this.field_106533_b.store(var1, "Minecraft server properties");
      } catch (Exception var11) {
         field_106535_a.log(Level.WARNING, "Failed to save " + this.field_106534_c, var11);
         this.func_106527_a();
      } finally {
         if(var1 != null) {
            try {
               var1.close();
            } catch (IOException var10) {
               ;
            }
         }

      }

   }

   public File func_106526_c() {
      return this.field_106534_c;
   }

   public String func_106532_a(String var1, String var2) {
      if(!this.field_106533_b.containsKey(var1)) {
         this.field_106533_b.setProperty(var1, var2);
         this.func_106529_b();
      }

      return this.field_106533_b.getProperty(var1, var2);
   }

   public int func_106530_a(String var1, int var2) {
      try {
         return Integer.parseInt(this.func_106532_a(var1, "" + var2));
      } catch (Exception var4) {
         this.field_106533_b.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public boolean func_106531_a(String var1, boolean var2) {
      try {
         return Boolean.parseBoolean(this.func_106532_a(var1, "" + var2));
      } catch (Exception var4) {
         this.field_106533_b.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public void func_106528_a(String var1, Object var2) {
      this.field_106533_b.setProperty(var1, "" + var2);
   }

}
