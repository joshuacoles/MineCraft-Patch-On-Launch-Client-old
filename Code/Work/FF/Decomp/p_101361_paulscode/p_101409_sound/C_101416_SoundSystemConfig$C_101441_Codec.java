package p_101361_paulscode.p_101409_sound;

import java.util.Locale;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;

class C_101416_SoundSystemConfig$C_101441_Codec {

   public String field_102549_extensionRegX = "";
   public Class field_102548_iCodecClass;


   public C_101416_SoundSystemConfig$C_101441_Codec(String var1, Class var2) {
      if(var1 != null && var1.length() > 0) {
         this.field_102549_extensionRegX = ".*";

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            String var3 = var1.substring(var4, var4 + 1);
            this.field_102549_extensionRegX = this.field_102549_extensionRegX + "[" + var3.toLowerCase(Locale.ENGLISH) + var3.toUpperCase(Locale.ENGLISH) + "]";
         }

         this.field_102549_extensionRegX = this.field_102549_extensionRegX + "$";
      }

      this.field_102548_iCodecClass = var2;
   }

   public C_101412_ICodec func_102547_getInstance() {
      if(this.field_102548_iCodecClass == null) {
         return null;
      } else {
         Object var1 = null;

         try {
            var1 = this.field_102548_iCodecClass.newInstance();
         } catch (InstantiationException var3) {
            this.func_102546_instantiationErrorMessage();
            return null;
         } catch (IllegalAccessException var4) {
            this.func_102546_instantiationErrorMessage();
            return null;
         } catch (ExceptionInInitializerError var5) {
            this.func_102546_instantiationErrorMessage();
            return null;
         } catch (SecurityException var6) {
            this.func_102546_instantiationErrorMessage();
            return null;
         }

         if(var1 == null) {
            this.func_102546_instantiationErrorMessage();
            return null;
         } else {
            return (C_101412_ICodec)var1;
         }
      }
   }

   private void func_102546_instantiationErrorMessage() {
      C_101416_SoundSystemConfig.func_102570_access$200("Unrecognized ICodec implementation in method \'getInstance\'.  Ensure that the implementing class has one public, parameterless constructor.");
   }
}
