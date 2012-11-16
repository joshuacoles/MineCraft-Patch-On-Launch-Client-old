package p_101361_paulscode.p_101409_sound;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.ListIterator;
import p_101361_paulscode.p_101409_sound.C_101411_SoundSystemException;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig$1;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig$C_101441_Codec;
import p_101361_paulscode.p_101409_sound.C_101417_IStreamListener;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101426_Library;

public class C_101416_SoundSystemConfig {

   public static final Object field_102624_THREAD_SYNC = new Object();
   public static final int field_102616_TYPE_NORMAL = 0;
   public static final int field_102623_TYPE_STREAMING = 1;
   public static final int field_102620_ATTENUATION_NONE = 0;
   public static final int field_102627_ATTENUATION_ROLLOFF = 1;
   public static final int field_102605_ATTENUATION_LINEAR = 2;
   public static String field_102608_EXTENSION_MIDI = ".*[mM][iI][dD][iI]?$";
   public static String field_102612_PREFIX_URL = "^[hH][tT][tT][pP]://.*";
   private static C_101420_SoundSystemLogger field_102611_logger = null;
   private static LinkedList field_102602_libraries;
   private static LinkedList field_102625_codecs = null;
   private static LinkedList field_102622_streamListeners = null;
   private static final Object field_102609_streamListenersLock = new Object();
   private static int field_102613_numberNormalChannels = 28;
   private static int field_102617_numberStreamingChannels = 4;
   private static float field_102629_masterGain = 1.0F;
   private static int field_102619_defaultAttenuationModel = 1;
   private static float field_102618_defaultRolloffFactor = 0.03F;
   private static float field_102630_dopplerFactor = 0.0F;
   private static float field_102603_dopplerVelocity = 1.0F;
   private static float field_102610_defaultFadeDistance = 1000.0F;
   private static String field_102628_soundFilesPackage = "Sounds/";
   private static int field_102626_streamingBufferSize = 131072;
   private static int field_102621_numberStreamingBuffers = 3;
   private static boolean field_102614_streamQueueFormatsMatch = false;
   private static int field_102607_maxFileSize = 268435456;
   private static int field_102615_fileChunkSize = 1048576;
   private static boolean field_102606_midiCodec = false;
   private static String field_102604_overrideMIDISynthesizer = "";


   public static void func_102584_addLibrary(Class var0) {
      if(var0 == null) {
         throw new C_101411_SoundSystemException("Parameter null in method \'addLibrary\'", 2);
      } else if(!C_101426_Library.class.isAssignableFrom(var0)) {
         throw new C_101411_SoundSystemException("The specified class does not extend class \'Library\' in method \'addLibrary\'");
      } else {
         if(field_102602_libraries == null) {
            field_102602_libraries = new LinkedList();
         }

         if(!field_102602_libraries.contains(var0)) {
            field_102602_libraries.add(var0);
         }

      }
   }

   public static void func_102571_removeLibrary(Class var0) {
      if(field_102602_libraries != null && var0 != null) {
         field_102602_libraries.remove(var0);
      }
   }

   public static LinkedList func_102573_getLibraries() {
      return field_102602_libraries;
   }

   public static boolean func_102577_libraryCompatible(Class var0) {
      if(var0 == null) {
         func_102590_errorMessage("Parameter \'libraryClass\' null in method\'librayCompatible\'");
         return false;
      } else if(!C_101426_Library.class.isAssignableFrom(var0)) {
         func_102590_errorMessage("The specified class does not extend class \'Library\' in method \'libraryCompatible\'");
         return false;
      } else {
         Object var1 = func_102562_runMethod(var0, "libraryCompatible", new Class[0], new Object[0]);
         if(var1 == null) {
            func_102590_errorMessage("Method \'Library.libraryCompatible\' returned \'null\' in method \'libraryCompatible\'");
            return false;
         } else {
            return ((Boolean)var1).booleanValue();
         }
      }
   }

   public static String func_102589_getLibraryTitle(Class var0) {
      if(var0 == null) {
         func_102590_errorMessage("Parameter \'libraryClass\' null in method\'getLibrayTitle\'");
         return null;
      } else if(!C_101426_Library.class.isAssignableFrom(var0)) {
         func_102590_errorMessage("The specified class does not extend class \'Library\' in method \'getLibraryTitle\'");
         return null;
      } else {
         Object var1 = func_102562_runMethod(var0, "getTitle", new Class[0], new Object[0]);
         if(var1 == null) {
            func_102590_errorMessage("Method \'Library.getTitle\' returned \'null\' in method \'getLibraryTitle\'");
            return null;
         } else {
            return (String)var1;
         }
      }
   }

   public static String func_102553_getLibraryDescription(Class var0) {
      if(var0 == null) {
         func_102590_errorMessage("Parameter \'libraryClass\' null in method\'getLibrayDescription\'");
         return null;
      } else if(!C_101426_Library.class.isAssignableFrom(var0)) {
         func_102590_errorMessage("The specified class does not extend class \'Library\' in method \'getLibraryDescription\'");
         return null;
      } else {
         Object var1 = func_102562_runMethod(var0, "getDescription", new Class[0], new Object[0]);
         if(var1 == null) {
            func_102590_errorMessage("Method \'Library.getDescription\' returned \'null\' in method \'getLibraryDescription\'");
            return null;
         } else {
            return (String)var1;
         }
      }
   }

   public static boolean func_102580_reverseByteOrder(Class var0) {
      if(var0 == null) {
         func_102590_errorMessage("Parameter \'libraryClass\' null in method\'reverseByteOrder\'");
         return false;
      } else if(!C_101426_Library.class.isAssignableFrom(var0)) {
         func_102590_errorMessage("The specified class does not extend class \'Library\' in method \'reverseByteOrder\'");
         return false;
      } else {
         Object var1 = func_102562_runMethod(var0, "reversByteOrder", new Class[0], new Object[0]);
         if(var1 == null) {
            func_102590_errorMessage("Method \'Library.reverseByteOrder\' returned \'null\' in method \'getLibraryDescription\'");
            return false;
         } else {
            return ((Boolean)var1).booleanValue();
         }
      }
   }

   public static void func_102569_setLogger(C_101420_SoundSystemLogger var0) {
      field_102611_logger = var0;
   }

   public static C_101420_SoundSystemLogger func_102576_getLogger() {
      return field_102611_logger;
   }

   public static synchronized void func_102564_setNumberNormalChannels(int var0) {
      field_102613_numberNormalChannels = var0;
   }

   public static synchronized int func_102552_getNumberNormalChannels() {
      return field_102613_numberNormalChannels;
   }

   public static synchronized void func_102565_setNumberStreamingChannels(int var0) {
      field_102617_numberStreamingChannels = var0;
   }

   public static synchronized int func_102598_getNumberStreamingChannels() {
      return field_102617_numberStreamingChannels;
   }

   public static synchronized void func_102559_setMasterGain(float var0) {
      field_102629_masterGain = var0;
   }

   public static synchronized float func_102597_getMasterGain() {
      return field_102629_masterGain;
   }

   public static synchronized void func_102579_setDefaultAttenuation(int var0) {
      field_102619_defaultAttenuationModel = var0;
   }

   public static synchronized int func_102560_getDefaultAttenuation() {
      return field_102619_defaultAttenuationModel;
   }

   public static synchronized void func_102558_setDefaultRolloff(float var0) {
      field_102618_defaultRolloffFactor = var0;
   }

   public static synchronized float func_102582_getDopplerFactor() {
      return field_102630_dopplerFactor;
   }

   public static synchronized void func_102591_setDopplerFactor(float var0) {
      field_102630_dopplerFactor = var0;
   }

   public static synchronized float func_102563_getDopplerVelocity() {
      return field_102603_dopplerVelocity;
   }

   public static synchronized void func_102583_setDopplerVelocity(float var0) {
      field_102603_dopplerVelocity = var0;
   }

   public static synchronized float func_102600_getDefaultRolloff() {
      return field_102618_defaultRolloffFactor;
   }

   public static synchronized void func_102587_setDefaultFadeDistance(float var0) {
      field_102610_defaultFadeDistance = var0;
   }

   public static synchronized float func_102586_getDefaultFadeDistance() {
      return field_102610_defaultFadeDistance;
   }

   public static synchronized void func_102557_setSoundFilesPackage(String var0) {
      field_102628_soundFilesPackage = var0;
   }

   public static synchronized String func_102556_getSoundFilesPackage() {
      return field_102628_soundFilesPackage;
   }

   public static synchronized void func_102575_setStreamingBufferSize(int var0) {
      field_102626_streamingBufferSize = var0;
   }

   public static synchronized int func_102566_getStreamingBufferSize() {
      return field_102626_streamingBufferSize;
   }

   public static synchronized void func_102596_setNumberStreamingBuffers(int var0) {
      field_102621_numberStreamingBuffers = var0;
   }

   public static synchronized int func_102574_getNumberStreamingBuffers() {
      return field_102621_numberStreamingBuffers;
   }

   public static synchronized void func_102593_setStreamQueueFormatsMatch(boolean var0) {
      field_102614_streamQueueFormatsMatch = var0;
   }

   public static synchronized boolean func_102572_getStreamQueueFormatsMatch() {
      return field_102614_streamQueueFormatsMatch;
   }

   public static synchronized void func_102588_setMaxFileSize(int var0) {
      field_102607_maxFileSize = var0;
   }

   public static synchronized int func_102554_getMaxFileSize() {
      return field_102607_maxFileSize;
   }

   public static synchronized void func_102581_setFileChunkSize(int var0) {
      field_102615_fileChunkSize = var0;
   }

   public static synchronized int func_102585_getFileChunkSize() {
      return field_102615_fileChunkSize;
   }

   public static synchronized String func_102594_getOverrideMIDISynthesizer() {
      return field_102604_overrideMIDISynthesizer;
   }

   public static synchronized void func_102599_setOverrideMIDISynthesizer(String var0) {
      field_102604_overrideMIDISynthesizer = var0;
   }

   public static synchronized void func_102601_setCodec(String var0, Class var1) {
      if(var0 == null) {
         throw new C_101411_SoundSystemException("Parameter \'extension\' null in method \'setCodec\'.", 2);
      } else if(var1 == null) {
         throw new C_101411_SoundSystemException("Parameter \'iCodecClass\' null in method \'setCodec\'.", 2);
      } else if(!C_101412_ICodec.class.isAssignableFrom(var1)) {
         throw new C_101411_SoundSystemException("The specified class does not implement interface \'ICodec\' in method \'setCodec\'", 3);
      } else {
         if(field_102625_codecs == null) {
            field_102625_codecs = new LinkedList();
         }

         ListIterator var2 = field_102625_codecs.listIterator();

         while(var2.hasNext()) {
            C_101416_SoundSystemConfig$C_101441_Codec var3 = (C_101416_SoundSystemConfig$C_101441_Codec)var2.next();
            if(var0.matches(var3.field_102549_extensionRegX)) {
               var2.remove();
            }
         }

         field_102625_codecs.add(new C_101416_SoundSystemConfig$C_101441_Codec(var0, var1));
         if(var0.matches(field_102608_EXTENSION_MIDI)) {
            field_102606_midiCodec = true;
         }

      }
   }

   public static synchronized C_101412_ICodec func_102578_getCodec(String var0) {
      if(field_102625_codecs == null) {
         return null;
      } else {
         ListIterator var1 = field_102625_codecs.listIterator();

         C_101416_SoundSystemConfig$C_101441_Codec var2;
         do {
            if(!var1.hasNext()) {
               return null;
            }

            var2 = (C_101416_SoundSystemConfig$C_101441_Codec)var1.next();
         } while(!var0.matches(var2.field_102549_extensionRegX));

         return var2.func_102547_getInstance();
      }
   }

   public static boolean func_102561_midiCodec() {
      return field_102606_midiCodec;
   }

   public static void func_102567_addStreamListener(C_101417_IStreamListener var0) {
      Object var1 = field_102609_streamListenersLock;
      synchronized(field_102609_streamListenersLock) {
         if(field_102622_streamListeners == null) {
            field_102622_streamListeners = new LinkedList();
         }

         if(!field_102622_streamListeners.contains(var0)) {
            field_102622_streamListeners.add(var0);
         }

      }
   }

   public static void func_102568_removeStreamListener(C_101417_IStreamListener var0) {
      Object var1 = field_102609_streamListenersLock;
      synchronized(field_102609_streamListenersLock) {
         if(field_102622_streamListeners == null) {
            field_102622_streamListeners = new LinkedList();
         }

         if(field_102622_streamListeners.contains(var0)) {
            field_102622_streamListeners.remove(var0);
         }

      }
   }

   public static void func_102555_notifyEOS(String var0, int var1) {
      Object var2 = field_102609_streamListenersLock;
      synchronized(field_102609_streamListenersLock) {
         if(field_102622_streamListeners == null) {
            return;
         }
      }

      (new C_101416_SoundSystemConfig$1(var0, var1)).start();
   }

   private static void func_102590_errorMessage(String var0) {
      if(field_102611_logger != null) {
         field_102611_logger.func_102649_errorMessage("SoundSystemConfig", var0, 0);
      }

   }

   private static Object func_102562_runMethod(Class var0, String var1, Class[] var2, Object[] var3) {
      Method var4 = null;

      try {
         var4 = var0.getMethod(var1, var2);
      } catch (NoSuchMethodException var12) {
         func_102590_errorMessage("NoSuchMethodException thrown when attempting to call method \'" + var1 + "\' in " + "method \'runMethod\'");
         return null;
      } catch (SecurityException var13) {
         func_102590_errorMessage("Access denied when attempting to call method \'" + var1 + "\' in method \'runMethod\'");
         return null;
      } catch (NullPointerException var14) {
         func_102590_errorMessage("NullPointerException thrown when attempting to call method \'" + var1 + "\' in " + "method \'runMethod\'");
         return null;
      }

      if(var4 == null) {
         func_102590_errorMessage("Method \'" + var1 + "\' not found for the class " + "specified in method \'runMethod\'");
         return null;
      } else {
         Object var5 = null;

         try {
            var5 = var4.invoke((Object)null, var3);
            return var5;
         } catch (IllegalAccessException var7) {
            func_102590_errorMessage("IllegalAccessException thrown when attempting to invoke method \'" + var1 + "\' in " + "method \'runMethod\'");
            return null;
         } catch (IllegalArgumentException var8) {
            func_102590_errorMessage("IllegalArgumentException thrown when attempting to invoke method \'" + var1 + "\' in " + "method \'runMethod\'");
            return null;
         } catch (InvocationTargetException var9) {
            func_102590_errorMessage("InvocationTargetException thrown while attempting to invoke method \'Library.getTitle\' in method \'getLibraryTitle\'");
            return null;
         } catch (NullPointerException var10) {
            func_102590_errorMessage("NullPointerException thrown when attempting to invoke method \'" + var1 + "\' in " + "method \'runMethod\'");
            return null;
         } catch (ExceptionInInitializerError var11) {
            func_102590_errorMessage("ExceptionInInitializerError thrown when attempting to invoke method \'" + var1 + "\' in " + "method \'runMethod\'");
            return null;
         }
      }
   }

   // $FF: synthetic method
   static Object func_102592_access$000() {
      return field_102609_streamListenersLock;
   }

   // $FF: synthetic method
   static LinkedList func_102595_access$100() {
      return field_102622_streamListeners;
   }

   // $FF: synthetic method
   static void func_102570_access$200(String var0) {
      func_102590_errorMessage(var0);
   }

}
