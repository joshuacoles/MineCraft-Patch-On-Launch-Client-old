package p_101361_paulscode.p_101409_sound.p_101428_libraries;

import p_101361_paulscode.p_101409_sound.C_101411_SoundSystemException;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101431_LibraryJavaSound$C_101438_MixerRanking;

public class C_101431_LibraryJavaSound$C_101437_Exception extends C_101411_SoundSystemException {

   public static final int field_102107_MIXER_PROBLEM = 101;
   public static C_101431_LibraryJavaSound$C_101438_MixerRanking field_102106_mixerRanking = null;


   public C_101431_LibraryJavaSound$C_101437_Exception(String var1) {
      super(var1);
   }

   public C_101431_LibraryJavaSound$C_101437_Exception(String var1, int var2) {
      super(var1, var2);
   }

   public C_101431_LibraryJavaSound$C_101437_Exception(String var1, C_101431_LibraryJavaSound$C_101438_MixerRanking var2) {
      super(var1, 101);
      field_102106_mixerRanking = var2;
   }

}
