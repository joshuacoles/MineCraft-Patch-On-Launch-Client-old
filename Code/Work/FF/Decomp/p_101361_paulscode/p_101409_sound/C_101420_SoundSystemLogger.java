package p_101361_paulscode.p_101409_sound;


public class C_101420_SoundSystemLogger {

   public void func_102651_message(String var1, int var2) {
      String var4 = "";

      for(int var5 = 0; var5 < var2; ++var5) {
         var4 = var4 + "    ";
      }

      String var3 = var4 + var1;
      System.out.println(var3);
   }

   public void func_102653_importantMessage(String var1, int var2) {
      String var4 = "";

      for(int var5 = 0; var5 < var2; ++var5) {
         var4 = var4 + "    ";
      }

      String var3 = var4 + var1;
      System.out.println(var3);
   }

   public boolean func_102648_errorCheck(boolean var1, String var2, String var3, int var4) {
      if(var1) {
         this.func_102649_errorMessage(var2, var3, var4);
      }

      return var1;
   }

   public void func_102649_errorMessage(String var1, String var2, int var3) {
      String var6 = "";

      for(int var7 = 0; var7 < var3; ++var7) {
         var6 = var6 + "    ";
      }

      String var4 = var6 + "Error in class \'" + var1 + "\'";
      String var5 = "    " + var6 + var2;
      System.out.println(var4);
      System.out.println(var5);
   }

   public void func_102650_printStackTrace(Exception var1, int var2) {
      this.func_102652_printExceptionMessage(var1, var2);
      this.func_102653_importantMessage("STACK TRACE:", var2);
      if(var1 != null) {
         StackTraceElement[] var3 = var1.getStackTrace();
         if(var3 != null) {
            for(int var5 = 0; var5 < var3.length; ++var5) {
               StackTraceElement var4 = var3[var5];
               if(var4 != null) {
                  this.func_102651_message(var4.toString(), var2 + 1);
               }
            }

         }
      }
   }

   public void func_102652_printExceptionMessage(Exception var1, int var2) {
      this.func_102653_importantMessage("ERROR MESSAGE:", var2);
      if(var1.getMessage() == null) {
         this.func_102651_message("(none)", var2 + 1);
      } else {
         this.func_102651_message(var1.getMessage(), var2 + 1);
      }

   }
}
