package p_101361_paulscode.p_101409_sound;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101411_SoundSystemException;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101419_ListenerData;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101421_CommandThread;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.C_101424_MidiChannel;
import p_101361_paulscode.p_101409_sound.C_101426_Library;
import p_101361_paulscode.p_101409_sound.C_101427_CommandObject;

public class C_101425_SoundSystem {

   private static final boolean field_102848_GET = false;
   private static final boolean field_102849_SET = true;
   private static final boolean field_102850_XXX = false;
   protected C_101420_SoundSystemLogger field_102852_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   protected C_101426_Library field_102846_soundLibrary;
   protected List field_102847_commandQueue;
   private List field_102844_sourcePlayList;
   protected C_101421_CommandThread field_102851_commandThread;
   public Random field_102843_randomNumberGenerator;
   protected String field_102853_className = "SoundSystem";
   private static Class field_102855_currentLibrary = null;
   private static boolean field_102845_initialized = false;
   private static C_101411_SoundSystemException field_102854_lastException = null;


   public C_101425_SoundSystem() {
      if(this.field_102852_logger == null) {
         this.field_102852_logger = new C_101420_SoundSystemLogger();
         C_101416_SoundSystemConfig.func_102569_setLogger(this.field_102852_logger);
      }

      this.func_102818_linkDefaultLibrariesAndCodecs();
      LinkedList var1 = C_101416_SoundSystemConfig.func_102573_getLibraries();
      if(var1 != null) {
         ListIterator var2 = var1.listIterator();

         while(var2.hasNext()) {
            Class var3 = (Class)var2.next();

            try {
               this.func_102828_init(var3);
               return;
            } catch (C_101411_SoundSystemException var6) {
               this.field_102852_logger.func_102652_printExceptionMessage(var6, 1);
            }
         }
      }

      try {
         this.func_102828_init(C_101426_Library.class);
      } catch (C_101411_SoundSystemException var5) {
         this.field_102852_logger.func_102652_printExceptionMessage(var5, 1);
      }
   }

   public C_101425_SoundSystem(Class var1) {
      if(this.field_102852_logger == null) {
         this.field_102852_logger = new C_101420_SoundSystemLogger();
         C_101416_SoundSystemConfig.func_102569_setLogger(this.field_102852_logger);
      }

      this.func_102818_linkDefaultLibrariesAndCodecs();
      this.func_102828_init(var1);
   }

   protected void func_102818_linkDefaultLibrariesAndCodecs() {}

   protected void func_102828_init(Class var1) {
      this.func_102727_message("", 0);
      this.func_102727_message("Starting up " + this.field_102853_className + "...", 0);
      this.field_102843_randomNumberGenerator = new Random();
      this.field_102847_commandQueue = new LinkedList();
      this.field_102844_sourcePlayList = new LinkedList();
      this.field_102851_commandThread = new C_101421_CommandThread(this);
      this.field_102851_commandThread.start();
      func_102757_snooze(200L);
      this.func_102725_newLibrary(var1);
      this.func_102727_message("", 0);
   }

   public void func_102746_cleanup() {
      boolean var1 = false;
      this.func_102727_message("", 0);
      this.func_102727_message(this.field_102853_className + " shutting down...", 0);

      try {
         this.field_102851_commandThread.func_102520_kill();
         this.field_102851_commandThread.interrupt();
      } catch (Exception var6) {
         var1 = true;
      }

      if(!var1) {
         for(int var2 = 0; var2 < 50 && this.field_102851_commandThread.func_102522_alive(); ++var2) {
            func_102757_snooze(100L);
         }
      }

      if(var1 || this.field_102851_commandThread.func_102522_alive()) {
         this.func_102821_errorMessage("Command thread did not die!", 0);
         this.func_102727_message("Ignoring errors... continuing clean-up.", 0);
      }

      func_102758_initialized(true, false);
      func_102726_currentLibrary(true, (Class)null);

      try {
         if(this.field_102846_soundLibrary != null) {
            this.field_102846_soundLibrary.func_102138_cleanup();
         }
      } catch (Exception var5) {
         this.func_102821_errorMessage("Problem during Library.cleanup()!", 0);
         this.func_102727_message("Ignoring errors... continuing clean-up.", 0);
      }

      try {
         if(this.field_102847_commandQueue != null) {
            this.field_102847_commandQueue.clear();
         }
      } catch (Exception var4) {
         this.func_102821_errorMessage("Unable to clear the command queue!", 0);
         this.func_102727_message("Ignoring errors... continuing clean-up.", 0);
      }

      try {
         if(this.field_102844_sourcePlayList != null) {
            this.field_102844_sourcePlayList.clear();
         }
      } catch (Exception var3) {
         this.func_102821_errorMessage("Unable to clear the source management list!", 0);
         this.func_102727_message("Ignoring errors... continuing clean-up.", 0);
      }

      this.field_102843_randomNumberGenerator = null;
      this.field_102846_soundLibrary = null;
      this.field_102847_commandQueue = null;
      this.field_102844_sourcePlayList = null;
      this.field_102851_commandThread = null;
      this.func_102826_importantMessage("Author: Paul Lamb, www.paulscode.com", 1);
      this.func_102727_message("", 0);
   }

   public void func_102789_interruptCommandThread() {
      if(this.field_102851_commandThread == null) {
         this.func_102821_errorMessage("Command Thread null in method \'interruptCommandThread\'", 0);
      } else {
         this.field_102851_commandThread.interrupt();
      }
   }

   public void func_102811_loadSound(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(2, new C_101414_FilenameURL(var1)));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102756_loadSound(URL var1, String var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(2, new C_101414_FilenameURL(var1, var2)));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102733_loadSound(byte[] var1, AudioFormat var2, String var3) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(3, var3, new C_101422_SoundBuffer(var1, var2)));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102830_unloadSound(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(4, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102764_queueSound(String var1, String var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(5, var1, new C_101414_FilenameURL(var2)));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102761_queueSound(String var1, URL var2, String var3) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(5, var1, new C_101414_FilenameURL(var2, var3)));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102823_dequeueSound(String var1, String var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(6, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102801_fadeOut(String var1, String var2, long var3) {
      C_101414_FilenameURL var5 = null;
      if(var2 != null) {
         var5 = new C_101414_FilenameURL(var2);
      }

      this.func_102795_CommandQueue(new C_101427_CommandObject(7, var1, var5, var3));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102750_fadeOut(String var1, URL var2, String var3, long var4) {
      C_101414_FilenameURL var6 = null;
      if(var2 != null && var3 != null) {
         var6 = new C_101414_FilenameURL(var2, var3);
      }

      this.func_102795_CommandQueue(new C_101427_CommandObject(7, var1, var6, var4));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102802_fadeOutIn(String var1, String var2, long var3, long var5) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(8, var1, new C_101414_FilenameURL(var2), var3, var5));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102794_fadeOutIn(String var1, URL var2, String var3, long var4, long var6) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(8, var1, new C_101414_FilenameURL(var2, var3), var4, var6));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102787_checkFadeVolumes() {
      this.func_102795_CommandQueue(new C_101427_CommandObject(9));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102803_backgroundMusic(String var1, String var2, boolean var3) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(12, true, true, var3, var1, new C_101414_FilenameURL(var2), 0.0F, 0.0F, 0.0F, 0, 0.0F, false));
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102742_backgroundMusic(String var1, URL var2, String var3, boolean var4) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(12, true, true, var4, var1, new C_101414_FilenameURL(var2, var3), 0.0F, 0.0F, 0.0F, 0, 0.0F, false));
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102838_newSource(boolean var1, String var2, String var3, boolean var4, float var5, float var6, float var7, int var8, float var9) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(10, var1, false, var4, var2, new C_101414_FilenameURL(var3), var5, var6, var7, var8, var9));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102793_newSource(boolean var1, String var2, URL var3, String var4, boolean var5, float var6, float var7, float var8, int var9, float var10) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(10, var1, false, var5, var2, new C_101414_FilenameURL(var3, var4), var6, var7, var8, var9, var10));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102753_newStreamingSource(boolean var1, String var2, String var3, boolean var4, float var5, float var6, float var7, int var8, float var9) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(10, var1, true, var4, var2, new C_101414_FilenameURL(var3), var5, var6, var7, var8, var9));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102785_newStreamingSource(boolean var1, String var2, URL var3, String var4, boolean var5, float var6, float var7, float var8, int var9, float var10) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(10, var1, true, var5, var2, new C_101414_FilenameURL(var3, var4), var6, var7, var8, var9, var10));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102798_rawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(11, var1, var2, var3, var4, var5, var6, var7, var8));
      this.field_102851_commandThread.interrupt();
   }

   public String func_102835_quickPlay(boolean var1, String var2, boolean var3, float var4, float var5, float var6, int var7, float var8) {
      String var9 = "Source_" + this.field_102843_randomNumberGenerator.nextInt() + "_" + this.field_102843_randomNumberGenerator.nextInt();
      this.func_102795_CommandQueue(new C_101427_CommandObject(12, var1, false, var3, var9, new C_101414_FilenameURL(var2), var4, var5, var6, var7, var8, true));
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var9));
      this.field_102851_commandThread.interrupt();
      return var9;
   }

   public String func_102839_quickPlay(boolean var1, URL var2, String var3, boolean var4, float var5, float var6, float var7, int var8, float var9) {
      String var10 = "Source_" + this.field_102843_randomNumberGenerator.nextInt() + "_" + this.field_102843_randomNumberGenerator.nextInt();
      this.func_102795_CommandQueue(new C_101427_CommandObject(12, var1, false, var4, var10, new C_101414_FilenameURL(var2, var3), var5, var6, var7, var8, var9, true));
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var10));
      this.field_102851_commandThread.interrupt();
      return var10;
   }

   public String func_102786_quickStream(boolean var1, String var2, boolean var3, float var4, float var5, float var6, int var7, float var8) {
      String var9 = "Source_" + this.field_102843_randomNumberGenerator.nextInt() + "_" + this.field_102843_randomNumberGenerator.nextInt();
      this.func_102795_CommandQueue(new C_101427_CommandObject(12, var1, true, var3, var9, new C_101414_FilenameURL(var2), var4, var5, var6, var7, var8, true));
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var9));
      this.field_102851_commandThread.interrupt();
      return var9;
   }

   public String func_102739_quickStream(boolean var1, URL var2, String var3, boolean var4, float var5, float var6, float var7, int var8, float var9) {
      String var10 = "Source_" + this.field_102843_randomNumberGenerator.nextInt() + "_" + this.field_102843_randomNumberGenerator.nextInt();
      this.func_102795_CommandQueue(new C_101427_CommandObject(12, var1, true, var4, var10, new C_101414_FilenameURL(var2, var3), var5, var6, var7, var8, var9, true));
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var10));
      this.field_102851_commandThread.interrupt();
      return var10;
   }

   public void func_102782_setPosition(String var1, float var2, float var3, float var4) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(13, var1, var2, var3, var4));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102816_setVolume(String var1, float var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(14, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public float func_102804_getVolume(String var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         return this.field_102846_soundLibrary != null?this.field_102846_soundLibrary.func_102151_getVolume(var1):0.0F;
      }
   }

   public void func_102765_setPitch(String var1, float var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(15, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public float func_102769_getPitch(String var1) {
      return this.field_102846_soundLibrary != null?this.field_102846_soundLibrary.func_102172_getPitch(var1):1.0F;
   }

   public void func_102771_setPriority(String var1, boolean var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(16, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102732_setLooping(String var1, boolean var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(17, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102797_setAttenuation(String var1, int var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(18, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102837_setDistOrRoll(String var1, float var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(19, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102806_changeDopplerFactor(float var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(20, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102775_changeDopplerVelocity(float var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(21, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102740_setVelocity(String var1, float var2, float var3, float var4) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(22, var1, var2, var3, var4));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102763_setListenerVelocity(float var1, float var2, float var3) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(23, var1, var2, var3));
      this.field_102851_commandThread.interrupt();
   }

   public float func_102759_millisecondsPlayed(String var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         return this.field_102846_soundLibrary.func_102154_millisecondsPlayed(var1);
      }
   }

   public void func_102774_feedRawAudioData(String var1, byte[] var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(25, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102813_play(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(24, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102745_pause(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(26, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102751_stop(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(27, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102779_rewind(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(28, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102749_flush(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(29, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102812_cull(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(30, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102780_activate(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(31, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102824_setTemporary(String var1, boolean var2) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(32, var1, var2));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102831_removeSource(String var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(33, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102842_moveListener(float var1, float var2, float var3) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(34, var1, var2, var3));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102747_setListenerPosition(float var1, float var2, float var3) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(35, var1, var2, var3));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102723_turnListener(float var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(36, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102776_setListenerAngle(float var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(37, var1));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102833_setListenerOrientation(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(38, var1, var2, var3, var4, var5, var6));
      this.field_102851_commandThread.interrupt();
   }

   public void func_102752_setMasterVolume(float var1) {
      this.func_102795_CommandQueue(new C_101427_CommandObject(39, var1));
      this.field_102851_commandThread.interrupt();
   }

   public float func_102777_getMasterVolume() {
      return C_101416_SoundSystemConfig.func_102597_getMasterGain();
   }

   public C_101419_ListenerData func_102735_getListenerData() {
      Object var1 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         return this.field_102846_soundLibrary.func_102129_getListenerData();
      }
   }

   public boolean func_102820_switchLibrary(Class var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         func_102758_initialized(true, false);
         HashMap var3 = null;
         C_101419_ListenerData var4 = null;
         boolean var5 = false;
         C_101424_MidiChannel var6 = null;
         C_101414_FilenameURL var7 = null;
         String var8 = "";
         boolean var9 = true;
         if(this.field_102846_soundLibrary != null) {
            func_102726_currentLibrary(true, (Class)null);
            var3 = this.func_102788_copySources(this.field_102846_soundLibrary.func_102153_getSources());
            var4 = this.field_102846_soundLibrary.func_102129_getListenerData();
            var6 = this.field_102846_soundLibrary.func_102126_getMidiChannel();
            if(var6 != null) {
               var5 = true;
               var9 = var6.func_102675_getLooping();
               var8 = var6.func_102684_getSourcename();
               var7 = var6.func_102660_getFilenameURL();
            }

            this.field_102846_soundLibrary.func_102138_cleanup();
            this.field_102846_soundLibrary = null;
         }

         this.func_102727_message("", 0);
         this.func_102727_message("Switching to " + C_101416_SoundSystemConfig.func_102589_getLibraryTitle(var1), 0);
         this.func_102727_message("(" + C_101416_SoundSystemConfig.func_102553_getLibraryDescription(var1) + ")", 1);

         try {
            this.field_102846_soundLibrary = (C_101426_Library)var1.newInstance();
         } catch (InstantiationException var13) {
            this.func_102821_errorMessage("The specified library did not load properly", 1);
         } catch (IllegalAccessException var14) {
            this.func_102821_errorMessage("The specified library did not load properly", 1);
         } catch (ExceptionInInitializerError var15) {
            this.func_102821_errorMessage("The specified library did not load properly", 1);
         } catch (SecurityException var16) {
            this.func_102821_errorMessage("The specified library did not load properly", 1);
         }

         if(this.func_102738_errorCheck(this.field_102846_soundLibrary == null, "Library null after initialization in method \'switchLibrary\'", 1)) {
            C_101411_SoundSystemException var10 = new C_101411_SoundSystemException(this.field_102853_className + " did not load properly.  " + "Library was null after initialization.", 4);
            func_102766_lastException(true, var10);
            func_102758_initialized(true, true);
            throw var10;
         } else {
            try {
               this.field_102846_soundLibrary.func_102118_init();
            } catch (C_101411_SoundSystemException var12) {
               func_102766_lastException(true, var12);
               func_102758_initialized(true, true);
               throw var12;
            }

            this.field_102846_soundLibrary.func_102150_setListenerData(var4);
            if(var5) {
               if(var6 != null) {
                  var6.func_102683_cleanup();
               }

               var6 = new C_101424_MidiChannel(var9, var8, var7);
               this.field_102846_soundLibrary.func_102179_setMidiChannel(var6);
            }

            this.field_102846_soundLibrary.func_102186_copySources(var3);
            this.func_102727_message("", 0);
            func_102766_lastException(true, (C_101411_SoundSystemException)null);
            func_102758_initialized(true, true);
            return true;
         }
      }
   }

   public boolean func_102725_newLibrary(Class var1) {
      func_102758_initialized(true, false);
      this.func_102795_CommandQueue(new C_101427_CommandObject(40, var1));
      this.field_102851_commandThread.interrupt();

      for(int var2 = 0; !func_102758_initialized(false, false) && var2 < 100; ++var2) {
         func_102757_snooze(400L);
         this.field_102851_commandThread.interrupt();
      }

      C_101411_SoundSystemException var3;
      if(!func_102758_initialized(false, false)) {
         var3 = new C_101411_SoundSystemException(this.field_102853_className + " did not load after 30 seconds.", 4);
         func_102766_lastException(true, var3);
         throw var3;
      } else {
         var3 = func_102766_lastException(false, (C_101411_SoundSystemException)null);
         if(var3 != null) {
            throw var3;
         } else {
            return true;
         }
      }
   }

   private void func_102817_CommandNewLibrary(Class var1) {
      func_102758_initialized(true, false);
      String var2 = "Initializing ";
      if(this.field_102846_soundLibrary != null) {
         func_102726_currentLibrary(true, (Class)null);
         var2 = "Switching to ";
         this.field_102846_soundLibrary.func_102138_cleanup();
         this.field_102846_soundLibrary = null;
      }

      this.func_102727_message(var2 + C_101416_SoundSystemConfig.func_102589_getLibraryTitle(var1), 0);
      this.func_102727_message("(" + C_101416_SoundSystemConfig.func_102553_getLibraryDescription(var1) + ")", 1);

      try {
         this.field_102846_soundLibrary = (C_101426_Library)var1.newInstance();
      } catch (InstantiationException var6) {
         this.func_102821_errorMessage("The specified library did not load properly", 1);
      } catch (IllegalAccessException var7) {
         this.func_102821_errorMessage("The specified library did not load properly", 1);
      } catch (ExceptionInInitializerError var8) {
         this.func_102821_errorMessage("The specified library did not load properly", 1);
      } catch (SecurityException var9) {
         this.func_102821_errorMessage("The specified library did not load properly", 1);
      }

      if(this.func_102738_errorCheck(this.field_102846_soundLibrary == null, "Library null after initialization in method \'newLibrary\'", 1)) {
         func_102766_lastException(true, new C_101411_SoundSystemException(this.field_102853_className + " did not load properly.  " + "Library was null after initialization.", 4));
         this.func_102826_importantMessage("Switching to silent mode", 1);

         try {
            this.field_102846_soundLibrary = new C_101426_Library();
         } catch (C_101411_SoundSystemException var5) {
            func_102766_lastException(true, new C_101411_SoundSystemException("Silent mode did not load properly.  Library was null after initialization.", 4));
            func_102758_initialized(true, true);
            return;
         }
      }

      try {
         this.field_102846_soundLibrary.func_102118_init();
      } catch (C_101411_SoundSystemException var4) {
         func_102766_lastException(true, var4);
         func_102758_initialized(true, true);
         return;
      }

      func_102766_lastException(true, (C_101411_SoundSystemException)null);
      func_102758_initialized(true, true);
   }

   private void func_102799_CommandInitialize() {
      try {
         if(this.func_102738_errorCheck(this.field_102846_soundLibrary == null, "Library null after initialization in method \'CommandInitialize\'", 1)) {
            C_101411_SoundSystemException var1 = new C_101411_SoundSystemException(this.field_102853_className + " did not load properly.  " + "Library was null after initialization.", 4);
            func_102766_lastException(true, var1);
            throw var1;
         }

         this.field_102846_soundLibrary.func_102118_init();
      } catch (C_101411_SoundSystemException var2) {
         func_102766_lastException(true, var2);
         func_102758_initialized(true, true);
      }

   }

   private void func_102834_CommandLoadSound(C_101414_FilenameURL var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102185_loadSound(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandLoadSound\'", 0);
      }

   }

   private void func_102790_CommandLoadSound(C_101422_SoundBuffer var1, String var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102155_loadSound(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandLoadSound\'", 0);
      }

   }

   private void func_102741_CommandUnloadSound(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102171_unloadSound(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandLoadSound\'", 0);
      }

   }

   private void func_102807_CommandQueueSound(String var1, C_101414_FilenameURL var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102168_queueSound(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandQueueSound\'", 0);
      }

   }

   private void func_102736_CommandDequeueSound(String var1, String var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102163_dequeueSound(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandDequeueSound\'", 0);
      }

   }

   private void func_102772_CommandFadeOut(String var1, C_101414_FilenameURL var2, long var3) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102135_fadeOut(var1, var2, var3);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandFadeOut\'", 0);
      }

   }

   private void func_102731_CommandFadeOutIn(String var1, C_101414_FilenameURL var2, long var3, long var5) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102140_fadeOutIn(var1, var2, var3, var5);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandFadeOutIn\'", 0);
      }

   }

   private void func_102754_CommandCheckFadeVolumes() {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102130_checkFadeVolumes();
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandCheckFadeVolumes\'", 0);
      }

   }

   private void func_102791_CommandNewSource(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10) {
      if(this.field_102846_soundLibrary != null) {
         if(var5.func_102509_getFilename().matches(C_101416_SoundSystemConfig.field_102608_EXTENSION_MIDI) && !C_101416_SoundSystemConfig.func_102561_midiCodec()) {
            this.field_102846_soundLibrary.func_102143_loadMidi(var3, var4, var5);
         } else {
            this.field_102846_soundLibrary.func_102124_newSource(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandNewSource\'", 0);
      }

   }

   private void func_102743_CommandRawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102146_rawDataStream(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandRawDataStream\'", 0);
      }

   }

   private void func_102836_CommandQuickPlay(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10, boolean var11) {
      if(this.field_102846_soundLibrary != null) {
         if(var5.func_102509_getFilename().matches(C_101416_SoundSystemConfig.field_102608_EXTENSION_MIDI) && !C_101416_SoundSystemConfig.func_102561_midiCodec()) {
            this.field_102846_soundLibrary.func_102143_loadMidi(var3, var4, var5);
         } else {
            this.field_102846_soundLibrary.func_102149_quickPlay(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
         }
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandQuickPlay\'", 0);
      }

   }

   private void func_102728_CommandSetPosition(String var1, float var2, float var3, float var4) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102122_setPosition(var1, var2, var3, var4);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandMoveSource\'", 0);
      }

   }

   private void func_102755_CommandSetVolume(String var1, float var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102159_setVolume(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetVolume\'", 0);
      }

   }

   private void func_102814_CommandSetPitch(String var1, float var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102162_setPitch(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetPitch\'", 0);
      }

   }

   private void func_102792_CommandSetPriority(String var1, boolean var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102173_setPriority(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetPriority\'", 0);
      }

   }

   private void func_102778_CommandSetLooping(String var1, boolean var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102127_setLooping(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetLooping\'", 0);
      }

   }

   private void func_102767_CommandSetAttenuation(String var1, int var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102142_setAttenuation(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetAttenuation\'", 0);
      }

   }

   private void func_102832_CommandSetDistOrRoll(String var1, float var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102181_setDistOrRoll(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetDistOrRoll\'", 0);
      }

   }

   private void func_102809_CommandChangeDopplerFactor(float var1) {
      if(this.field_102846_soundLibrary != null) {
         C_101416_SoundSystemConfig.func_102591_setDopplerFactor(var1);
         this.field_102846_soundLibrary.func_102156_dopplerChanged();
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetDopplerFactor\'", 0);
      }

   }

   private void func_102800_CommandChangeDopplerVelocity(float var1) {
      if(this.field_102846_soundLibrary != null) {
         C_101416_SoundSystemConfig.func_102583_setDopplerVelocity(var1);
         this.field_102846_soundLibrary.func_102156_dopplerChanged();
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetDopplerFactor\'", 0);
      }

   }

   private void func_102829_CommandSetVelocity(String var1, float var2, float var3, float var4) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102133_setVelocity(var1, var2, var3, var4);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandVelocity\'", 0);
      }

   }

   private void func_102841_CommandSetListenerVelocity(float var1, float var2, float var3) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102161_setListenerVelocity(var1, var2, var3);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetListenerVelocity\'", 0);
      }

   }

   private void func_102730_CommandPlay(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102158_play(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandPlay\'", 0);
      }

   }

   private void func_102724_CommandFeedRawAudioData(String var1, byte[] var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102169_feedRawAudioData(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandFeedRawAudioData\'", 0);
      }

   }

   private void func_102805_CommandPause(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102137_pause(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandPause\'", 0);
      }

   }

   private void func_102748_CommandStop(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102144_stop(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandStop\'", 0);
      }

   }

   private void func_102784_CommandRewind(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102119_rewind(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandRewind\'", 0);
      }

   }

   private void func_102825_CommandFlush(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102141_flush(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandFlush\'", 0);
      }

   }

   private void func_102808_CommandSetTemporary(String var1, boolean var2) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102167_setTemporary(var1, var2);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetActive\'", 0);
      }

   }

   private void func_102840_CommandRemoveSource(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102174_removeSource(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandRemoveSource\'", 0);
      }

   }

   private void func_102737_CommandMoveListener(float var1, float var2, float var3) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102183_moveListener(var1, var2, var3);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandMoveListener\'", 0);
      }

   }

   private void func_102819_CommandSetListenerPosition(float var1, float var2, float var3) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102139_setListenerPosition(var1, var2, var3);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetListenerPosition\'", 0);
      }

   }

   private void func_102729_CommandTurnListener(float var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102116_turnListener(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandTurnListener\'", 0);
      }

   }

   private void func_102760_CommandSetListenerAngle(float var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102117_setListenerAngle(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetListenerAngle\'", 0);
      }

   }

   private void func_102770_CommandSetListenerOrientation(float var1, float var2, float var3, float var4, float var5, float var6) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102177_setListenerOrientation(var1, var2, var3, var4, var5, var6);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetListenerOrientation\'", 0);
      }

   }

   private void func_102783_CommandCull(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102157_cull(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandCull\'", 0);
      }

   }

   private void func_102781_CommandActivate(String var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102121_activate(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandActivate\'", 0);
      }

   }

   private void func_102762_CommandSetMasterVolume(float var1) {
      if(this.field_102846_soundLibrary != null) {
         this.field_102846_soundLibrary.func_102147_setMasterVolume(var1);
      } else {
         this.func_102821_errorMessage("Variable \'soundLibrary\' null in method \'CommandSetMasterVolume\'", 0);
      }

   }

   protected void func_102827_ManageSources() {}

   public boolean func_102795_CommandQueue(C_101427_CommandObject var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(var1 != null) {
            if(this.field_102847_commandQueue == null) {
               return false;
            } else {
               this.field_102847_commandQueue.add(var1);
               return true;
            }
         } else {
            boolean var3 = false;

            C_101427_CommandObject var4;
            while(this.field_102847_commandQueue != null && this.field_102847_commandQueue.size() > 0) {
               var4 = (C_101427_CommandObject)this.field_102847_commandQueue.remove(0);
               if(var4 != null) {
                  switch(var4.field_102881_Command) {
                  case 1:
                     this.func_102799_CommandInitialize();
                     break;
                  case 2:
                     this.func_102834_CommandLoadSound((C_101414_FilenameURL)var4.field_102856_objectArgs[0]);
                     break;
                  case 3:
                     this.func_102790_CommandLoadSound((C_101422_SoundBuffer)var4.field_102856_objectArgs[0], var4.field_102857_stringArgs[0]);
                     break;
                  case 4:
                     this.func_102741_CommandUnloadSound(var4.field_102857_stringArgs[0]);
                     break;
                  case 5:
                     this.func_102807_CommandQueueSound(var4.field_102857_stringArgs[0], (C_101414_FilenameURL)var4.field_102856_objectArgs[0]);
                     break;
                  case 6:
                     this.func_102736_CommandDequeueSound(var4.field_102857_stringArgs[0], var4.field_102857_stringArgs[1]);
                     break;
                  case 7:
                     this.func_102772_CommandFadeOut(var4.field_102857_stringArgs[0], (C_101414_FilenameURL)var4.field_102856_objectArgs[0], var4.field_102890_longArgs[0]);
                     break;
                  case 8:
                     this.func_102731_CommandFadeOutIn(var4.field_102857_stringArgs[0], (C_101414_FilenameURL)var4.field_102856_objectArgs[0], var4.field_102890_longArgs[0], var4.field_102890_longArgs[1]);
                     break;
                  case 9:
                     this.func_102754_CommandCheckFadeVolumes();
                     break;
                  case 10:
                     this.func_102791_CommandNewSource(var4.field_102886_boolArgs[0], var4.field_102886_boolArgs[1], var4.field_102886_boolArgs[2], var4.field_102857_stringArgs[0], (C_101414_FilenameURL)var4.field_102856_objectArgs[0], var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2], var4.field_102899_intArgs[0], var4.field_102903_floatArgs[3]);
                     break;
                  case 11:
                     this.func_102743_CommandRawDataStream((AudioFormat)var4.field_102856_objectArgs[0], var4.field_102886_boolArgs[0], var4.field_102857_stringArgs[0], var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2], var4.field_102899_intArgs[0], var4.field_102903_floatArgs[3]);
                     break;
                  case 12:
                     this.func_102836_CommandQuickPlay(var4.field_102886_boolArgs[0], var4.field_102886_boolArgs[1], var4.field_102886_boolArgs[2], var4.field_102857_stringArgs[0], (C_101414_FilenameURL)var4.field_102856_objectArgs[0], var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2], var4.field_102899_intArgs[0], var4.field_102903_floatArgs[3], var4.field_102886_boolArgs[3]);
                     break;
                  case 13:
                     this.func_102728_CommandSetPosition(var4.field_102857_stringArgs[0], var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2]);
                     break;
                  case 14:
                     this.func_102755_CommandSetVolume(var4.field_102857_stringArgs[0], var4.field_102903_floatArgs[0]);
                     break;
                  case 15:
                     this.func_102814_CommandSetPitch(var4.field_102857_stringArgs[0], var4.field_102903_floatArgs[0]);
                     break;
                  case 16:
                     this.func_102792_CommandSetPriority(var4.field_102857_stringArgs[0], var4.field_102886_boolArgs[0]);
                     break;
                  case 17:
                     this.func_102778_CommandSetLooping(var4.field_102857_stringArgs[0], var4.field_102886_boolArgs[0]);
                     break;
                  case 18:
                     this.func_102767_CommandSetAttenuation(var4.field_102857_stringArgs[0], var4.field_102899_intArgs[0]);
                     break;
                  case 19:
                     this.func_102832_CommandSetDistOrRoll(var4.field_102857_stringArgs[0], var4.field_102903_floatArgs[0]);
                     break;
                  case 20:
                     this.func_102809_CommandChangeDopplerFactor(var4.field_102903_floatArgs[0]);
                     break;
                  case 21:
                     this.func_102800_CommandChangeDopplerVelocity(var4.field_102903_floatArgs[0]);
                     break;
                  case 22:
                     this.func_102829_CommandSetVelocity(var4.field_102857_stringArgs[0], var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2]);
                     break;
                  case 23:
                     this.func_102841_CommandSetListenerVelocity(var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2]);
                     break;
                  case 24:
                     this.field_102844_sourcePlayList.add(var4);
                     break;
                  case 25:
                     this.field_102844_sourcePlayList.add(var4);
                     break;
                  case 26:
                     this.func_102805_CommandPause(var4.field_102857_stringArgs[0]);
                     break;
                  case 27:
                     this.func_102748_CommandStop(var4.field_102857_stringArgs[0]);
                     break;
                  case 28:
                     this.func_102784_CommandRewind(var4.field_102857_stringArgs[0]);
                     break;
                  case 29:
                     this.func_102825_CommandFlush(var4.field_102857_stringArgs[0]);
                     break;
                  case 30:
                     this.func_102783_CommandCull(var4.field_102857_stringArgs[0]);
                     break;
                  case 31:
                     var3 = true;
                     this.func_102781_CommandActivate(var4.field_102857_stringArgs[0]);
                     break;
                  case 32:
                     this.func_102808_CommandSetTemporary(var4.field_102857_stringArgs[0], var4.field_102886_boolArgs[0]);
                     break;
                  case 33:
                     this.func_102840_CommandRemoveSource(var4.field_102857_stringArgs[0]);
                     break;
                  case 34:
                     this.func_102737_CommandMoveListener(var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2]);
                     break;
                  case 35:
                     this.func_102819_CommandSetListenerPosition(var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2]);
                     break;
                  case 36:
                     this.func_102729_CommandTurnListener(var4.field_102903_floatArgs[0]);
                     break;
                  case 37:
                     this.func_102760_CommandSetListenerAngle(var4.field_102903_floatArgs[0]);
                     break;
                  case 38:
                     this.func_102770_CommandSetListenerOrientation(var4.field_102903_floatArgs[0], var4.field_102903_floatArgs[1], var4.field_102903_floatArgs[2], var4.field_102903_floatArgs[3], var4.field_102903_floatArgs[4], var4.field_102903_floatArgs[5]);
                     break;
                  case 39:
                     this.func_102762_CommandSetMasterVolume(var4.field_102903_floatArgs[0]);
                     break;
                  case 40:
                     this.func_102817_CommandNewLibrary(var4.field_102866_classArgs[0]);
                  }
               }
            }

            if(var3) {
               this.field_102846_soundLibrary.func_102134_replaySources();
            }

            while(this.field_102844_sourcePlayList != null && this.field_102844_sourcePlayList.size() > 0) {
               var4 = (C_101427_CommandObject)this.field_102844_sourcePlayList.remove(0);
               if(var4 != null) {
                  switch(var4.field_102881_Command) {
                  case 24:
                     this.func_102730_CommandPlay(var4.field_102857_stringArgs[0]);
                     break;
                  case 25:
                     this.func_102724_CommandFeedRawAudioData(var4.field_102857_stringArgs[0], var4.field_102860_buffer);
                  }
               }
            }

            return this.field_102847_commandQueue != null && this.field_102847_commandQueue.size() > 0;
         }
      }
   }

   public void func_102773_removeTemporarySources() {
      Object var1 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(this.field_102846_soundLibrary != null) {
            this.field_102846_soundLibrary.func_102178_removeTemporarySources();
         }

      }
   }

   public boolean func_102822_playing(String var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(this.field_102846_soundLibrary == null) {
            return false;
         } else {
            C_101423_Source var3 = (C_101423_Source)this.field_102846_soundLibrary.func_102153_getSources().get(var1);
            return var3 == null?false:var3.func_102299_playing();
         }
      }
   }

   public boolean func_102734_playing() {
      Object var1 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(this.field_102846_soundLibrary == null) {
            return false;
         } else {
            HashMap var2 = this.field_102846_soundLibrary.func_102153_getSources();
            if(var2 == null) {
               return false;
            } else {
               Set var3 = var2.keySet();
               Iterator var4 = var3.iterator();

               C_101423_Source var6;
               do {
                  if(!var4.hasNext()) {
                     return false;
                  }

                  String var5 = (String)var4.next();
                  var6 = (C_101423_Source)var2.get(var5);
               } while(var6 == null || !var6.func_102299_playing());

               return true;
            }
         }
      }
   }

   private HashMap func_102788_copySources(HashMap var1) {
      Set var2 = var1.keySet();
      Iterator var3 = var2.iterator();
      HashMap var6 = new HashMap();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         C_101423_Source var5 = (C_101423_Source)var1.get(var4);
         if(var5 != null) {
            var6.put(var4, new C_101423_Source(var5, (C_101422_SoundBuffer)null));
         }
      }

      return var6;
   }

   public static boolean func_102810_libraryCompatible(Class var0) {
      C_101420_SoundSystemLogger var1 = C_101416_SoundSystemConfig.func_102576_getLogger();
      if(var1 == null) {
         var1 = new C_101420_SoundSystemLogger();
         C_101416_SoundSystemConfig.func_102569_setLogger(var1);
      }

      var1.func_102651_message("", 0);
      var1.func_102651_message("Checking if " + C_101416_SoundSystemConfig.func_102589_getLibraryTitle(var0) + " is compatible...", 0);
      boolean var2 = C_101416_SoundSystemConfig.func_102577_libraryCompatible(var0);
      if(var2) {
         var1.func_102651_message("...yes", 1);
      } else {
         var1.func_102651_message("...no", 1);
      }

      return var2;
   }

   public static Class func_102796_currentLibrary() {
      return func_102726_currentLibrary(false, (Class)null);
   }

   public static boolean func_102768_initialized() {
      return func_102758_initialized(false, false);
   }

   public static C_101411_SoundSystemException func_102815_getLastException() {
      return func_102766_lastException(false, (C_101411_SoundSystemException)null);
   }

   public static void func_102744_setException(C_101411_SoundSystemException var0) {
      func_102766_lastException(true, var0);
   }

   private static boolean func_102758_initialized(boolean var0, boolean var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(var0) {
            field_102845_initialized = var1;
         }

         return field_102845_initialized;
      }
   }

   private static Class func_102726_currentLibrary(boolean var0, Class var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(var0) {
            field_102855_currentLibrary = var1;
         }

         return field_102855_currentLibrary;
      }
   }

   private static C_101411_SoundSystemException func_102766_lastException(boolean var0, C_101411_SoundSystemException var1) {
      Object var2 = C_101416_SoundSystemConfig.field_102624_THREAD_SYNC;
      synchronized(C_101416_SoundSystemConfig.field_102624_THREAD_SYNC) {
         if(var0) {
            field_102854_lastException = var1;
         }

         return field_102854_lastException;
      }
   }

   protected static void func_102757_snooze(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   protected void func_102727_message(String var1, int var2) {
      this.field_102852_logger.func_102651_message(var1, var2);
   }

   protected void func_102826_importantMessage(String var1, int var2) {
      this.field_102852_logger.func_102653_importantMessage(var1, var2);
   }

   protected boolean func_102738_errorCheck(boolean var1, String var2, int var3) {
      return this.field_102852_logger.func_102648_errorCheck(var1, this.field_102853_className, var2, var3);
   }

   protected void func_102821_errorMessage(String var1, int var2) {
      this.field_102852_logger.func_102649_errorMessage(this.field_102853_className, var1, var2);
   }

}
