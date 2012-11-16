package p_101361_paulscode.p_101409_sound;

import p_101361_paulscode.p_101409_sound.C_101418_SimpleThread;
import p_101361_paulscode.p_101409_sound.C_101424_MidiChannel;
import p_101361_paulscode.p_101409_sound.C_101424_MidiChannel$1;

class C_101424_MidiChannel$C_101442_FadeThread extends C_101418_SimpleThread {

   // $FF: synthetic field
   final C_101424_MidiChannel field_102537_this$0;


   private C_101424_MidiChannel$C_101442_FadeThread(C_101424_MidiChannel var1) {
      this.field_102537_this$0 = var1;
   }

   public void run() {
      while(!this.func_102515_dying()) {
         if(this.field_102537_this$0.field_102719_fadeOutGain == -1.0F && this.field_102537_this$0.field_102718_fadeInGain == 1.0F) {
            this.func_102523_snooze(3600000L);
         }

         C_101424_MidiChannel.func_102697_access$100(this.field_102537_this$0);
         this.func_102523_snooze(50L);
      }

      this.func_102519_cleanup();
   }

   // $FF: synthetic method
   C_101424_MidiChannel$C_101442_FadeThread(C_101424_MidiChannel var1, C_101424_MidiChannel$1 var2) {
      this(var1);
   }
}
