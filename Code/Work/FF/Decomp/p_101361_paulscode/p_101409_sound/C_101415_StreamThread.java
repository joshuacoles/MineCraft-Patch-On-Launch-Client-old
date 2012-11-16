package p_101361_paulscode.p_101409_sound;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101418_SimpleThread;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101423_Source;

public class C_101415_StreamThread extends C_101418_SimpleThread {

   private C_101420_SoundSystemLogger field_102544_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   private List field_102543_streamingSources = new LinkedList();
   private final Object field_102545_listLock = new Object();


   protected void func_102519_cleanup() {
      this.func_102520_kill();
      super.func_102519_cleanup();
   }

   public void run() {
      this.func_102523_snooze(3600000L);

      while(!this.func_102515_dying()) {
         while(!this.func_102515_dying() && !this.field_102543_streamingSources.isEmpty()) {
            Object var3 = this.field_102545_listLock;
            synchronized(this.field_102545_listLock) {
               ListIterator var1 = this.field_102543_streamingSources.listIterator();

               while(!this.func_102515_dying() && var1.hasNext()) {
                  C_101423_Source var2 = (C_101423_Source)var1.next();
                  if(var2 == null) {
                     var1.remove();
                  } else if(var2.func_102303_stopped()) {
                     if(!var2.field_102333_rawDataStream) {
                        var1.remove();
                     }
                  } else if(var2.func_102309_active()) {
                     if(!var2.func_102321_paused()) {
                        var2.func_102280_checkFadeOut();
                        if(!var2.func_102313_stream() && !var2.field_102333_rawDataStream && (var2.field_102359_channel == null || !var2.field_102359_channel.func_102396_processBuffer())) {
                           if(var2.field_102343_nextCodec == null) {
                              var2.func_102288_readBuffersFromNextSoundInSequence();
                           }

                           if(var2.field_102349_toLoop) {
                              if(!var2.func_102299_playing()) {
                                 C_101416_SoundSystemConfig.func_102555_notifyEOS(var2.field_102330_sourcename, var2.func_102278_getSoundSequenceQueueSize());
                                 if(var2.func_102280_checkFadeOut()) {
                                    var2.field_102327_preLoad = true;
                                 } else {
                                    var2.func_102318_incrementSoundSequence();
                                    var2.field_102327_preLoad = true;
                                 }
                              }
                           } else if(!var2.func_102299_playing()) {
                              C_101416_SoundSystemConfig.func_102555_notifyEOS(var2.field_102330_sourcename, var2.func_102278_getSoundSequenceQueueSize());
                              if(!var2.func_102280_checkFadeOut()) {
                                 if(var2.func_102318_incrementSoundSequence()) {
                                    var2.field_102327_preLoad = true;
                                 } else {
                                    var1.remove();
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     if(var2.field_102349_toLoop || var2.field_102333_rawDataStream) {
                        var2.field_102342_toPlay = true;
                     }

                     var1.remove();
                  }
               }
            }

            if(!this.func_102515_dying() && !this.field_102543_streamingSources.isEmpty()) {
               this.func_102523_snooze(20L);
            }
         }

         if(!this.func_102515_dying() && this.field_102543_streamingSources.isEmpty()) {
            this.func_102523_snooze(3600000L);
         }
      }

      this.func_102519_cleanup();
   }

   public void func_102539_watch(C_101423_Source var1) {
      if(var1 != null) {
         if(!this.field_102543_streamingSources.contains(var1)) {
            Object var4 = this.field_102545_listLock;
            synchronized(this.field_102545_listLock) {
               ListIterator var2 = this.field_102543_streamingSources.listIterator();

               while(var2.hasNext()) {
                  C_101423_Source var3 = (C_101423_Source)var2.next();
                  if(var3 == null) {
                     var2.remove();
                  } else if(var1.field_102359_channel == var3.field_102359_channel) {
                     var3.func_102295_stop();
                     var2.remove();
                  }
               }

               this.field_102543_streamingSources.add(var1);
            }
         }
      }
   }

   private void func_102542_message(String var1) {
      this.field_102544_logger.func_102651_message(var1, 0);
   }

   private void func_102538_importantMessage(String var1) {
      this.field_102544_logger.func_102653_importantMessage(var1, 0);
   }

   private boolean func_102541_errorCheck(boolean var1, String var2) {
      return this.field_102544_logger.func_102648_errorCheck(var1, "StreamThread", var2, 0);
   }

   private void func_102540_errorMessage(String var1) {
      this.field_102544_logger.func_102649_errorMessage("StreamThread", var1, 0);
   }
}
