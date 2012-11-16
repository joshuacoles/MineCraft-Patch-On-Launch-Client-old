package p_101361_paulscode.p_101409_sound;

import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101418_SimpleThread;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101425_SoundSystem;
import p_101361_paulscode.p_101409_sound.C_101427_CommandObject;

public class C_101421_CommandThread extends C_101418_SimpleThread {

   protected C_101420_SoundSystemLogger field_102535_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   private C_101425_SoundSystem field_102534_soundSystem;
   protected String field_102536_className = "CommandThread";


   public C_101421_CommandThread(C_101425_SoundSystem var1) {
      this.field_102534_soundSystem = var1;
   }

   protected void func_102519_cleanup() {
      this.func_102520_kill();
      this.field_102535_logger = null;
      this.field_102534_soundSystem = null;
      super.func_102519_cleanup();
   }

   public void run() {
      long var1 = System.currentTimeMillis();
      if(this.field_102534_soundSystem == null) {
         this.func_102530_errorMessage("SoundSystem was null in method run().", 0);
         this.func_102519_cleanup();
      } else {
         this.func_102523_snooze(3600000L);

         while(!this.func_102515_dying()) {
            this.field_102534_soundSystem.func_102827_ManageSources();
            this.field_102534_soundSystem.func_102795_CommandQueue((C_101427_CommandObject)null);
            long var3 = System.currentTimeMillis();
            if(!this.func_102515_dying() && var3 - var1 > 10000L) {
               var1 = var3;
               this.field_102534_soundSystem.func_102773_removeTemporarySources();
            }

            if(!this.func_102515_dying()) {
               this.func_102523_snooze(3600000L);
            }
         }

         this.func_102519_cleanup();
      }
   }

   protected void func_102531_message(String var1, int var2) {
      this.field_102535_logger.func_102651_message(var1, var2);
   }

   protected void func_102533_importantMessage(String var1, int var2) {
      this.field_102535_logger.func_102653_importantMessage(var1, var2);
   }

   protected boolean func_102532_errorCheck(boolean var1, String var2) {
      return this.field_102535_logger.func_102648_errorCheck(var1, this.field_102536_className, var2, 0);
   }

   protected void func_102530_errorMessage(String var1, int var2) {
      this.field_102535_logger.func_102649_errorMessage(this.field_102536_className, var1, var2);
   }
}
