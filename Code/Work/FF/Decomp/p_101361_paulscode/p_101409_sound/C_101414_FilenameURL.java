package p_101361_paulscode.p_101409_sound;

import java.net.URL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;

public class C_101414_FilenameURL {

   private C_101420_SoundSystemLogger field_102512_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   private String field_102513_filename = null;
   private URL field_102514_url = null;


   public C_101414_FilenameURL(URL var1, String var2) {
      this.field_102513_filename = var2;
      this.field_102514_url = var1;
   }

   public C_101414_FilenameURL(String var1) {
      this.field_102513_filename = var1;
      this.field_102514_url = null;
   }

   public String func_102509_getFilename() {
      return this.field_102513_filename;
   }

   public URL func_102508_getURL() {
      if(this.field_102514_url == null) {
         if(this.field_102513_filename.matches(C_101416_SoundSystemConfig.field_102612_PREFIX_URL)) {
            try {
               this.field_102514_url = new URL(this.field_102513_filename);
            } catch (Exception var2) {
               this.func_102510_errorMessage("Unable to access online URL in method \'getURL\'");
               this.func_102511_printStackTrace(var2);
               return null;
            }
         } else {
            this.field_102514_url = this.getClass().getClassLoader().getResource(C_101416_SoundSystemConfig.func_102556_getSoundFilesPackage() + this.field_102513_filename);
         }
      }

      return this.field_102514_url;
   }

   private void func_102510_errorMessage(String var1) {
      this.field_102512_logger.func_102649_errorMessage("MidiChannel", var1, 0);
   }

   private void func_102511_printStackTrace(Exception var1) {
      this.field_102512_logger.func_102650_printStackTrace(var1, 1);
   }
}
