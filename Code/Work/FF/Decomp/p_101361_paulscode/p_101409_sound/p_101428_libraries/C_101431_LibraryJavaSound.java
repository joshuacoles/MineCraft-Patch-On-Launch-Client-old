package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import p_101361_paulscode.p_101409_sound.C_101411_SoundSystemException;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.C_101425_SoundSystem;
import p_101361_paulscode.p_101409_sound.C_101426_Library;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound$C_101437_Exception;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound$C_101438_MixerRanking;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101432_SourceJavaSound;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101434_ChannelJavaSound;

public class C_101431_LibraryJavaSound extends C_101426_Library {

   private static final boolean field_102231_GET = false;
   private static final boolean field_102232_SET = true;
   private static final int field_102233_XXX = 0;
   private final int field_102236_maxClipSize = 1048576;
   private static Mixer field_102226_myMixer = null;
   private static C_101431_LibraryJavaSound$C_101438_MixerRanking field_102228_myMixerRanking = null;
   private static C_101431_LibraryJavaSound field_102237_instance = null;
   private static int field_102234_minSampleRate = 4000;
   private static int field_102227_maxSampleRate = '\ubb80';
   private static int field_102235_lineCount = 32;
   private static boolean field_102238_useGainControl = true;
   private static boolean field_102230_usePanControl = true;
   private static boolean field_102229_useSampleRateControl = true;


   public C_101431_LibraryJavaSound() {
      field_102237_instance = this;
   }

   public void func_102118_init() {
      C_101431_LibraryJavaSound$C_101438_MixerRanking var1 = null;
      if(field_102226_myMixer == null) {
         Info[] var2 = AudioSystem.getMixerInfo();
         int var3 = var2.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Info var5 = var2[var4];
            if(var5.getName().equals("Java Sound Audio Engine")) {
               var1 = new C_101431_LibraryJavaSound$C_101438_MixerRanking();

               try {
                  var1.func_102254_rank(var5);
               } catch (C_101431_LibraryJavaSound$C_101437_Exception var10) {
                  break;
               }

               if(var1.field_102267_rank >= 14) {
                  field_102226_myMixer = AudioSystem.getMixer(var5);
                  func_102225_mixerRanking(true, var1);
               }
               break;
            }
         }

         if(field_102226_myMixer == null) {
            C_101431_LibraryJavaSound$C_101438_MixerRanking var11 = var1;
            Info[] var12 = AudioSystem.getMixerInfo();
            var4 = var12.length;

            for(int var13 = 0; var13 < var4; ++var13) {
               Info var6 = var12[var13];
               var1 = new C_101431_LibraryJavaSound$C_101438_MixerRanking();

               try {
                  var1.func_102254_rank(var6);
               } catch (C_101431_LibraryJavaSound$C_101437_Exception var9) {
                  ;
               }

               if(var11 == null || var1.field_102267_rank > var11.field_102267_rank) {
                  var11 = var1;
               }
            }

            if(var11 == null) {
               throw new C_101431_LibraryJavaSound$C_101437_Exception("No useable mixers found!", new C_101431_LibraryJavaSound$C_101438_MixerRanking());
            }

            try {
               field_102226_myMixer = AudioSystem.getMixer(var11.field_102270_mixerInfo);
               func_102225_mixerRanking(true, var11);
            } catch (Exception var8) {
               throw new C_101431_LibraryJavaSound$C_101437_Exception("No useable mixers available!", new C_101431_LibraryJavaSound$C_101438_MixerRanking());
            }
         }
      }

      this.func_102147_setMasterVolume(1.0F);
      this.func_102123_message("JavaSound initialized.");
      super.func_102118_init();
   }

   public static boolean func_102210_libraryCompatible() {
      Info[] var0 = AudioSystem.getMixerInfo();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         Info var3 = var0[var2];
         if(var3.getName().equals("Java Sound Audio Engine")) {
            return true;
         }
      }

      return false;
   }

   protected C_101413_Channel func_102120_createChannel(int var1) {
      return new C_101434_ChannelJavaSound(var1, field_102226_myMixer);
   }

   public void func_102138_cleanup() {
      super.func_102138_cleanup();
      field_102237_instance = null;
      field_102226_myMixer = null;
      field_102228_myMixerRanking = null;
   }

   public boolean func_102185_loadSound(C_101414_FilenameURL var1) {
      if(this.field_102194_bufferMap == null) {
         this.field_102194_bufferMap = new HashMap();
         this.func_102125_importantMessage("Buffer Map was null in method \'loadSound\'");
      }

      if(this.func_102160_errorCheck(var1 == null, "Filename/URL not specified in method \'loadSound\'")) {
         return false;
      } else if(this.field_102194_bufferMap.get(var1.func_102509_getFilename()) != null) {
         return true;
      } else {
         C_101412_ICodec var2 = C_101416_SoundSystemConfig.func_102578_getCodec(var1.func_102509_getFilename());
         if(this.func_102160_errorCheck(var2 == null, "No codec found for file \'" + var1.func_102509_getFilename() + "\' in method \'loadSound\'")) {
            return false;
         } else {
            URL var3 = var1.func_102508_getURL();
            if(this.func_102160_errorCheck(var3 == null, "Unable to open file \'" + var1.func_102509_getFilename() + "\' in method \'loadSound\'")) {
               return false;
            } else {
               var2.func_102439_initialize(var3);
               C_101422_SoundBuffer var4 = var2.func_102440_readAll();
               var2.func_102437_cleanup();
               var2 = null;
               if(var4 != null) {
                  this.field_102194_bufferMap.put(var1.func_102509_getFilename(), var4);
               } else {
                  this.func_102165_errorMessage("Sound buffer null in method \'loadSound\'");
               }

               return true;
            }
         }
      }
   }

   public boolean func_102155_loadSound(C_101422_SoundBuffer var1, String var2) {
      if(this.field_102194_bufferMap == null) {
         this.field_102194_bufferMap = new HashMap();
         this.func_102125_importantMessage("Buffer Map was null in method \'loadSound\'");
      }

      if(this.func_102160_errorCheck(var2 == null, "Identifier not specified in method \'loadSound\'")) {
         return false;
      } else if(this.field_102194_bufferMap.get(var2) != null) {
         return true;
      } else {
         if(var1 != null) {
            this.field_102194_bufferMap.put(var2, var1);
         } else {
            this.func_102165_errorMessage("Sound buffer null in method \'loadSound\'");
         }

         return true;
      }
   }

   public void func_102147_setMasterVolume(float var1) {
      super.func_102147_setMasterVolume(var1);
      Set var2 = this.field_102197_sourceMap.keySet();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var4);
         if(var5 != null) {
            var5.func_102291_positionChanged();
         }
      }

   }

   public void func_102124_newSource(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10) {
      C_101422_SoundBuffer var11 = null;
      if(!var2) {
         var11 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var11 == null && !this.func_102185_loadSound(var5)) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.func_102509_getFilename());
            return;
         }

         var11 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var11 == null) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.func_102509_getFilename());
            return;
         }
      }

      if(!var2 && var11 != null) {
         var11.func_102654_trimData(1048576);
      }

      this.field_102197_sourceMap.put(var4, new C_101432_SourceJavaSound(this.field_102196_listener, var1, var2, var3, var4, var5, var11, var6, var7, var8, var9, var10, false));
   }

   public void func_102146_rawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.field_102197_sourceMap.put(var3, new C_101432_SourceJavaSound(this.field_102196_listener, var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void func_102149_quickPlay(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10, boolean var11) {
      C_101422_SoundBuffer var12 = null;
      if(!var2) {
         var12 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var12 == null && !this.func_102185_loadSound(var5)) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because an error occurred while loading " + var5.func_102509_getFilename());
            return;
         }

         var12 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.func_102509_getFilename());
         if(var12 == null) {
            this.func_102165_errorMessage("Source \'" + var4 + "\' was not created " + "because audio data was not found for " + var5.func_102509_getFilename());
            return;
         }
      }

      if(!var2 && var12 != null) {
         var12.func_102654_trimData(1048576);
      }

      this.field_102197_sourceMap.put(var4, new C_101432_SourceJavaSound(this.field_102196_listener, var1, var2, var3, var4, var5, var12, var6, var7, var8, var9, var10, var11));
   }

   public void func_102186_copySources(HashMap var1) {
      if(var1 != null) {
         Set var2 = var1.keySet();
         Iterator var3 = var2.iterator();
         if(this.field_102194_bufferMap == null) {
            this.field_102194_bufferMap = new HashMap();
            this.func_102125_importantMessage("Buffer Map was null in method \'copySources\'");
         }

         this.field_102197_sourceMap.clear();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            C_101423_Source var5 = (C_101423_Source)var1.get(var4);
            if(var5 != null) {
               C_101422_SoundBuffer var6 = null;
               if(!var5.field_102335_toStream) {
                  this.func_102185_loadSound(var5.field_102347_filenameURL);
                  var6 = (C_101422_SoundBuffer)this.field_102194_bufferMap.get(var5.field_102347_filenameURL.func_102509_getFilename());
               }

               if(!var5.field_102335_toStream && var6 != null) {
                  var6.func_102654_trimData(1048576);
               }

               if(var5.field_102335_toStream || var6 != null) {
                  this.field_102197_sourceMap.put(var4, new C_101432_SourceJavaSound(this.field_102196_listener, var5, var6));
               }
            }
         }

      }
   }

   public void func_102161_setListenerVelocity(float var1, float var2, float var3) {
      super.func_102161_setListenerVelocity(var1, var2, var3);
      this.func_102131_listenerMoved();
   }

   public void func_102156_dopplerChanged() {
      super.func_102156_dopplerChanged();
      this.func_102131_listenerMoved();
   }

   public static Mixer func_102219_getMixer() {
      return func_102223_mixer(false, (Mixer)null);
   }

   public static void func_102200_setMixer(Mixer var0) {
      func_102223_mixer(true, var0);
      C_101411_SoundSystemException var1 = C_101425_SoundSystem.func_102815_getLastException();
      C_101425_SoundSystem.func_102744_setException((C_101411_SoundSystemException)null);
      if(var1 != null) {
         throw var1;
      }
   }

   private static synchronized Mixer func_102223_mixer(boolean var0, Mixer var1) {
      if(var0) {
         if(var1 == null) {
            return field_102226_myMixer;
         }

         C_101431_LibraryJavaSound$C_101438_MixerRanking var2 = new C_101431_LibraryJavaSound$C_101438_MixerRanking();

         try {
            var2.func_102254_rank(var1.getMixerInfo());
         } catch (C_101431_LibraryJavaSound$C_101437_Exception var5) {
            C_101416_SoundSystemConfig.func_102576_getLogger().func_102650_printStackTrace(var5, 1);
            C_101425_SoundSystem.func_102744_setException(var5);
         }

         field_102226_myMixer = var1;
         func_102225_mixerRanking(true, var2);
         if(field_102237_instance != null) {
            ListIterator var4 = field_102237_instance.field_102192_normalChannels.listIterator();
            C_101425_SoundSystem.func_102744_setException((C_101411_SoundSystemException)null);

            C_101434_ChannelJavaSound var3;
            while(var4.hasNext()) {
               var3 = (C_101434_ChannelJavaSound)var4.next();
               var3.func_102407_newMixer(var1);
            }

            var4 = field_102237_instance.field_102189_streamingChannels.listIterator();

            while(var4.hasNext()) {
               var3 = (C_101434_ChannelJavaSound)var4.next();
               var3.func_102407_newMixer(var1);
            }
         }
      }

      return field_102226_myMixer;
   }

   public static C_101431_LibraryJavaSound$C_101438_MixerRanking func_102211_getMixerRanking() {
      return func_102225_mixerRanking(false, (C_101431_LibraryJavaSound$C_101438_MixerRanking)null);
   }

   private static synchronized C_101431_LibraryJavaSound$C_101438_MixerRanking func_102225_mixerRanking(boolean var0, C_101431_LibraryJavaSound$C_101438_MixerRanking var1) {
      if(var0) {
         field_102228_myMixerRanking = var1;
      }

      return field_102228_myMixerRanking;
   }

   public static void func_102201_setMinSampleRate(int var0) {
      func_102215_minSampleRate(true, var0);
   }

   private static synchronized int func_102215_minSampleRate(boolean var0, int var1) {
      if(var0) {
         field_102234_minSampleRate = var1;
      }

      return field_102234_minSampleRate;
   }

   public static void func_102224_setMaxSampleRate(int var0) {
      func_102221_maxSampleRate(true, var0);
   }

   private static synchronized int func_102221_maxSampleRate(boolean var0, int var1) {
      if(var0) {
         field_102227_maxSampleRate = var1;
      }

      return field_102227_maxSampleRate;
   }

   public static void func_102214_setLineCount(int var0) {
      func_102216_lineCount(true, var0);
   }

   private static synchronized int func_102216_lineCount(boolean var0, int var1) {
      if(var0) {
         field_102235_lineCount = var1;
      }

      return field_102235_lineCount;
   }

   public static void func_102203_useGainControl(boolean var0) {
      func_102213_useGainControl(true, var0);
   }

   private static synchronized boolean func_102213_useGainControl(boolean var0, boolean var1) {
      if(var0) {
         field_102238_useGainControl = var1;
      }

      return field_102238_useGainControl;
   }

   public static void func_102206_usePanControl(boolean var0) {
      func_102218_usePanControl(true, var0);
   }

   private static synchronized boolean func_102218_usePanControl(boolean var0, boolean var1) {
      if(var0) {
         field_102230_usePanControl = var1;
      }

      return field_102230_usePanControl;
   }

   public static void func_102222_useSampleRateControl(boolean var0) {
      func_102207_useSampleRateControl(true, var0);
   }

   private static synchronized boolean func_102207_useSampleRateControl(boolean var0, boolean var1) {
      if(var0) {
         field_102229_useSampleRateControl = var1;
      }

      return field_102229_useSampleRateControl;
   }

   public static String func_102208_getTitle() {
      return "Java Sound";
   }

   public static String func_102212_getDescription() {
      return "The Java Sound API.  For more information, see http://java.sun.com/products/java-media/sound/";
   }

   public String func_102180_getClassName() {
      return "LibraryJavaSound";
   }

   // $FF: synthetic method
   static int func_102202_access$000(boolean var0, int var1) {
      return func_102215_minSampleRate(var0, var1);
   }

   // $FF: synthetic method
   static int func_102209_access$100(boolean var0, int var1) {
      return func_102221_maxSampleRate(var0, var1);
   }

   // $FF: synthetic method
   static int func_102217_access$200(boolean var0, int var1) {
      return func_102216_lineCount(var0, var1);
   }

   // $FF: synthetic method
   static boolean func_102220_access$300(boolean var0, boolean var1) {
      return func_102213_useGainControl(var0, var1);
   }

   // $FF: synthetic method
   static boolean func_102205_access$400(boolean var0, boolean var1) {
      return func_102218_usePanControl(var0, var1);
   }

   // $FF: synthetic method
   static boolean func_102204_access$500(boolean var0, boolean var1) {
      return func_102207_useSampleRateControl(var0, var1);
   }

}
