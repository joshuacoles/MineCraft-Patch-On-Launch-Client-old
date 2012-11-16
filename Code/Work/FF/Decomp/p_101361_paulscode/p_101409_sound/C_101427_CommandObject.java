package p_101361_paulscode.p_101409_sound;


public class C_101427_CommandObject {

   public static final int field_102882_INITIALIZE = 1;
   public static final int field_102894_LOAD_SOUND = 2;
   public static final int field_102868_LOAD_DATA = 3;
   public static final int field_102861_UNLOAD_SOUND = 4;
   public static final int field_102858_QUEUE_SOUND = 5;
   public static final int field_102889_DEQUEUE_SOUND = 6;
   public static final int field_102862_FADE_OUT = 7;
   public static final int field_102904_FADE_OUT_IN = 8;
   public static final int field_102864_CHECK_FADE_VOLUMES = 9;
   public static final int field_102876_NEW_SOURCE = 10;
   public static final int field_102902_RAW_DATA_STREAM = 11;
   public static final int field_102895_QUICK_PLAY = 12;
   public static final int field_102897_SET_POSITION = 13;
   public static final int field_102896_SET_VOLUME = 14;
   public static final int field_102870_SET_PITCH = 15;
   public static final int field_102877_SET_PRIORITY = 16;
   public static final int field_102883_SET_LOOPING = 17;
   public static final int field_102880_SET_ATTENUATION = 18;
   public static final int field_102859_SET_DIST_OR_ROLL = 19;
   public static final int field_102874_CHANGE_DOPPLER_FACTOR = 20;
   public static final int field_102887_CHANGE_DOPPLER_VELOCITY = 21;
   public static final int field_102898_SET_VELOCITY = 22;
   public static final int field_102901_SET_LISTENER_VELOCITY = 23;
   public static final int field_102900_PLAY = 24;
   public static final int field_102873_FEED_RAW_AUDIO_DATA = 25;
   public static final int field_102893_PAUSE = 26;
   public static final int field_102885_STOP = 27;
   public static final int field_102871_REWIND = 28;
   public static final int field_102863_FLUSH = 29;
   public static final int field_102878_CULL = 30;
   public static final int field_102884_ACTIVATE = 31;
   public static final int field_102865_SET_TEMPORARY = 32;
   public static final int field_102891_REMOVE_SOURCE = 33;
   public static final int field_102879_MOVE_LISTENER = 34;
   public static final int field_102869_SET_LISTENER_POSITION = 35;
   public static final int field_102875_TURN_LISTENER = 36;
   public static final int field_102888_SET_LISTENER_ANGLE = 37;
   public static final int field_102867_SET_LISTENER_ORIENTATION = 38;
   public static final int field_102872_SET_MASTER_VOLUME = 39;
   public static final int field_102892_NEW_LIBRARY = 40;
   public byte[] field_102860_buffer;
   public int[] field_102899_intArgs;
   public float[] field_102903_floatArgs;
   public long[] field_102890_longArgs;
   public boolean[] field_102886_boolArgs;
   public String[] field_102857_stringArgs;
   public Class[] field_102866_classArgs;
   public Object[] field_102856_objectArgs;
   public int field_102881_Command;


   public C_101427_CommandObject(int var1) {
      this.field_102881_Command = var1;
   }

   public C_101427_CommandObject(int var1, int var2) {
      this.field_102881_Command = var1;
      this.field_102899_intArgs = new int[1];
      this.field_102899_intArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, Class var2) {
      this.field_102881_Command = var1;
      this.field_102866_classArgs = new Class[1];
      this.field_102866_classArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, float var2) {
      this.field_102881_Command = var1;
      this.field_102903_floatArgs = new float[1];
      this.field_102903_floatArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, String var2) {
      this.field_102881_Command = var1;
      this.field_102857_stringArgs = new String[1];
      this.field_102857_stringArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, Object var2) {
      this.field_102881_Command = var1;
      this.field_102856_objectArgs = new Object[1];
      this.field_102856_objectArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, String var2, Object var3) {
      this.field_102881_Command = var1;
      this.field_102857_stringArgs = new String[1];
      this.field_102857_stringArgs[0] = var2;
      this.field_102856_objectArgs = new Object[1];
      this.field_102856_objectArgs[0] = var3;
   }

   public C_101427_CommandObject(int var1, String var2, byte[] var3) {
      this.field_102881_Command = var1;
      this.field_102857_stringArgs = new String[1];
      this.field_102857_stringArgs[0] = var2;
      this.field_102860_buffer = var3;
   }

   public C_101427_CommandObject(int var1, String var2, Object var3, long var4) {
      this.field_102881_Command = var1;
      this.field_102857_stringArgs = new String[1];
      this.field_102857_stringArgs[0] = var2;
      this.field_102856_objectArgs = new Object[1];
      this.field_102856_objectArgs[0] = var3;
      this.field_102890_longArgs = new long[1];
      this.field_102890_longArgs[0] = var4;
   }

   public C_101427_CommandObject(int var1, String var2, Object var3, long var4, long var6) {
      this.field_102881_Command = var1;
      this.field_102857_stringArgs = new String[1];
      this.field_102857_stringArgs[0] = var2;
      this.field_102856_objectArgs = new Object[1];
      this.field_102856_objectArgs[0] = var3;
      this.field_102890_longArgs = new long[2];
      this.field_102890_longArgs[0] = var4;
      this.field_102890_longArgs[1] = var6;
   }

   public C_101427_CommandObject(int var1, String var2, String var3) {
      this.field_102881_Command = var1;
      this.field_102857_stringArgs = new String[2];
      this.field_102857_stringArgs[0] = var2;
      this.field_102857_stringArgs[1] = var3;
   }

   public C_101427_CommandObject(int var1, String var2, int var3) {
      this.field_102881_Command = var1;
      this.field_102899_intArgs = new int[1];
      this.field_102857_stringArgs = new String[1];
      this.field_102899_intArgs[0] = var3;
      this.field_102857_stringArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, String var2, float var3) {
      this.field_102881_Command = var1;
      this.field_102903_floatArgs = new float[1];
      this.field_102857_stringArgs = new String[1];
      this.field_102903_floatArgs[0] = var3;
      this.field_102857_stringArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, String var2, boolean var3) {
      this.field_102881_Command = var1;
      this.field_102886_boolArgs = new boolean[1];
      this.field_102857_stringArgs = new String[1];
      this.field_102886_boolArgs[0] = var3;
      this.field_102857_stringArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, float var2, float var3, float var4) {
      this.field_102881_Command = var1;
      this.field_102903_floatArgs = new float[3];
      this.field_102903_floatArgs[0] = var2;
      this.field_102903_floatArgs[1] = var3;
      this.field_102903_floatArgs[2] = var4;
   }

   public C_101427_CommandObject(int var1, String var2, float var3, float var4, float var5) {
      this.field_102881_Command = var1;
      this.field_102903_floatArgs = new float[3];
      this.field_102857_stringArgs = new String[1];
      this.field_102903_floatArgs[0] = var3;
      this.field_102903_floatArgs[1] = var4;
      this.field_102903_floatArgs[2] = var5;
      this.field_102857_stringArgs[0] = var2;
   }

   public C_101427_CommandObject(int var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.field_102881_Command = var1;
      this.field_102903_floatArgs = new float[6];
      this.field_102903_floatArgs[0] = var2;
      this.field_102903_floatArgs[1] = var3;
      this.field_102903_floatArgs[2] = var4;
      this.field_102903_floatArgs[3] = var5;
      this.field_102903_floatArgs[4] = var6;
      this.field_102903_floatArgs[5] = var7;
   }

   public C_101427_CommandObject(int var1, boolean var2, boolean var3, boolean var4, String var5, Object var6, float var7, float var8, float var9, int var10, float var11) {
      this.field_102881_Command = var1;
      this.field_102899_intArgs = new int[1];
      this.field_102903_floatArgs = new float[4];
      this.field_102886_boolArgs = new boolean[3];
      this.field_102857_stringArgs = new String[1];
      this.field_102856_objectArgs = new Object[1];
      this.field_102899_intArgs[0] = var10;
      this.field_102903_floatArgs[0] = var7;
      this.field_102903_floatArgs[1] = var8;
      this.field_102903_floatArgs[2] = var9;
      this.field_102903_floatArgs[3] = var11;
      this.field_102886_boolArgs[0] = var2;
      this.field_102886_boolArgs[1] = var3;
      this.field_102886_boolArgs[2] = var4;
      this.field_102857_stringArgs[0] = var5;
      this.field_102856_objectArgs[0] = var6;
   }

   public C_101427_CommandObject(int var1, boolean var2, boolean var3, boolean var4, String var5, Object var6, float var7, float var8, float var9, int var10, float var11, boolean var12) {
      this.field_102881_Command = var1;
      this.field_102899_intArgs = new int[1];
      this.field_102903_floatArgs = new float[4];
      this.field_102886_boolArgs = new boolean[4];
      this.field_102857_stringArgs = new String[1];
      this.field_102856_objectArgs = new Object[1];
      this.field_102899_intArgs[0] = var10;
      this.field_102903_floatArgs[0] = var7;
      this.field_102903_floatArgs[1] = var8;
      this.field_102903_floatArgs[2] = var9;
      this.field_102903_floatArgs[3] = var11;
      this.field_102886_boolArgs[0] = var2;
      this.field_102886_boolArgs[1] = var3;
      this.field_102886_boolArgs[2] = var4;
      this.field_102886_boolArgs[3] = var12;
      this.field_102857_stringArgs[0] = var5;
      this.field_102856_objectArgs[0] = var6;
   }

   public C_101427_CommandObject(int var1, Object var2, boolean var3, String var4, float var5, float var6, float var7, int var8, float var9) {
      this.field_102881_Command = var1;
      this.field_102899_intArgs = new int[1];
      this.field_102903_floatArgs = new float[4];
      this.field_102886_boolArgs = new boolean[1];
      this.field_102857_stringArgs = new String[1];
      this.field_102856_objectArgs = new Object[1];
      this.field_102899_intArgs[0] = var8;
      this.field_102903_floatArgs[0] = var5;
      this.field_102903_floatArgs[1] = var6;
      this.field_102903_floatArgs[2] = var7;
      this.field_102903_floatArgs[3] = var9;
      this.field_102886_boolArgs[0] = var3;
      this.field_102857_stringArgs[0] = var4;
      this.field_102856_objectArgs[0] = var2;
   }
}
