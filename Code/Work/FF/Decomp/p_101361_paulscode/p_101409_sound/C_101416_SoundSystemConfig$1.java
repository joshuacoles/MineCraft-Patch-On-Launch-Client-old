package p_101361_paulscode.p_101409_sound;

import java.util.ListIterator;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101417_IStreamListener;

final class C_101416_SoundSystemConfig$1 extends Thread {

   // $FF: synthetic field
   final String field_102550_val$srcName;
   // $FF: synthetic field
   final int field_102551_val$qSize;


   C_101416_SoundSystemConfig$1(String var1, int var2) {
      this.field_102550_val$srcName = var1;
      this.field_102551_val$qSize = var2;
   }

   public void run() {
      synchronized(C_101416_SoundSystemConfig.func_102592_access$000()) {
         if(C_101416_SoundSystemConfig.func_102595_access$100() != null) {
            ListIterator var2 = C_101416_SoundSystemConfig.func_102595_access$100().listIterator();

            while(var2.hasNext()) {
               C_101417_IStreamListener var3 = (C_101417_IStreamListener)var2.next();
               if(var3 == null) {
                  var2.remove();
               } else {
                  var3.func_102631_endOfStream(this.field_102550_val$srcName, this.field_102551_val$qSize);
               }
            }

         }
      }
   }
}
