package p_101361_paulscode.p_101409_sound;


public class C_101411_SoundSystemException extends Exception {

   public static final int field_102099_ERROR_NONE = 0;
   public static final int field_102105_UNKNOWN_ERROR = 1;
   public static final int field_102101_NULL_PARAMETER = 2;
   public static final int field_102100_CLASS_TYPE_MISMATCH = 3;
   public static final int field_102104_LIBRARY_NULL = 4;
   public static final int field_102102_LIBRARY_TYPE = 5;
   private int field_102103_myType = 1;


   public C_101411_SoundSystemException(String var1) {
      super(var1);
   }

   public C_101411_SoundSystemException(String var1, int var2) {
      super(var1);
      this.field_102103_myType = var2;
   }

   public int func_102098_getType() {
      return this.field_102103_myType;
   }
}
