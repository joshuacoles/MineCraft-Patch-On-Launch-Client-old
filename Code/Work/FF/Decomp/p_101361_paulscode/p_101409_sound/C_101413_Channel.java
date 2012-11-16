package p_101361_paulscode.p_101409_sound;

import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.C_101426_Library;

public class C_101413_Channel {

   protected Class field_102405_libraryType = C_101426_Library.class;
   public int field_102403_channelType;
   private C_101420_SoundSystemLogger field_102404_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   public C_101423_Source field_102406_attachedSource = null;
   public int field_102402_buffersUnqueued = 0;


   public C_101413_Channel(int var1) {
      this.field_102403_channelType = var1;
   }

   public void func_102384_cleanup() {
      this.field_102404_logger = null;
   }

   public boolean func_102398_preLoadBuffers(LinkedList var1) {
      return true;
   }

   public boolean func_102381_queueBuffer(byte[] var1) {
      return false;
   }

   public int func_102385_feedRawAudioData(byte[] var1) {
      return 1;
   }

   public int func_102401_buffersProcessed() {
      return 0;
   }

   public float func_102394_millisecondsPlayed() {
      return -1.0F;
   }

   public boolean func_102396_processBuffer() {
      return false;
   }

   public void func_102382_setAudioFormat(AudioFormat var1) {}

   public void func_102388_flush() {}

   public void func_102395_close() {}

   public void func_102391_play() {}

   public void func_102400_pause() {}

   public void func_102390_stop() {}

   public void func_102383_rewind() {}

   public boolean func_102392_playing() {
      return false;
   }

   public String func_102393_getClassName() {
      String var1 = C_101416_SoundSystemConfig.func_102589_getLibraryTitle(this.field_102405_libraryType);
      return var1.equals("No Sound")?"Channel":"Channel" + var1;
   }

   protected void func_102387_message(String var1) {
      this.field_102404_logger.func_102651_message(var1, 0);
   }

   protected void func_102389_importantMessage(String var1) {
      this.field_102404_logger.func_102653_importantMessage(var1, 0);
   }

   protected boolean func_102386_errorCheck(boolean var1, String var2) {
      return this.field_102404_logger.func_102648_errorCheck(var1, this.func_102393_getClassName(), var2, 0);
   }

   protected void func_102397_errorMessage(String var1) {
      this.field_102404_logger.func_102649_errorMessage(this.func_102393_getClassName(), var1, 0);
   }

   protected void func_102399_printStackTrace(Exception var1) {
      this.field_102404_logger.func_102650_printStackTrace(var1, 1);
   }
}
