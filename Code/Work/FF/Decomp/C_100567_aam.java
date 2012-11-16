import java.util.Random;

public class C_100567_aam extends C_100562_aan {

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      while(var1.func_109352_c(var3, var4, var5) && var4 > 2) {
         --var4;
      }

      int var6 = var1.func_109349_a(var3, var4, var5);
      if(var6 != C_100451_alf.field_106082_H.field_106162_cm) {
         return false;
      } else {
         int var7;
         int var8;
         for(var7 = -2; var7 <= 2; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               if(var1.func_109352_c(var3 + var7, var4 - 1, var5 + var8) && var1.func_109352_c(var3 + var7, var4 - 2, var5 + var8)) {
                  return false;
               }
            }
         }

         for(var7 = -1; var7 <= 0; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               for(int var9 = -2; var9 <= 2; ++var9) {
                  var1.func_109378_b(var3 + var8, var4 + var7, var5 + var9, C_100451_alf.field_106087_T.field_106162_cm);
               }
            }
         }

         var1.func_109378_b(var3, var4, var5, C_100451_alf.field_106071_D.field_106162_cm);
         var1.func_109378_b(var3 - 1, var4, var5, C_100451_alf.field_106071_D.field_106162_cm);
         var1.func_109378_b(var3 + 1, var4, var5, C_100451_alf.field_106071_D.field_106162_cm);
         var1.func_109378_b(var3, var4, var5 - 1, C_100451_alf.field_106071_D.field_106162_cm);
         var1.func_109378_b(var3, var4, var5 + 1, C_100451_alf.field_106071_D.field_106162_cm);

         for(var7 = -2; var7 <= 2; ++var7) {
            for(var8 = -2; var8 <= 2; ++var8) {
               if(var7 == -2 || var7 == 2 || var8 == -2 || var8 == 2) {
                  var1.func_109378_b(var3 + var7, var4 + 1, var5 + var8, C_100451_alf.field_106087_T.field_106162_cm);
               }
            }
         }

         var1.func_109526_c(var3 + 2, var4 + 1, var5, C_100451_alf.field_106238_an.field_106162_cm, 1);
         var1.func_109526_c(var3 - 2, var4 + 1, var5, C_100451_alf.field_106238_an.field_106162_cm, 1);
         var1.func_109526_c(var3, var4 + 1, var5 + 2, C_100451_alf.field_106238_an.field_106162_cm, 1);
         var1.func_109526_c(var3, var4 + 1, var5 - 2, C_100451_alf.field_106238_an.field_106162_cm, 1);

         for(var7 = -1; var7 <= 1; ++var7) {
            for(var8 = -1; var8 <= 1; ++var8) {
               if(var7 == 0 && var8 == 0) {
                  var1.func_109378_b(var3 + var7, var4 + 4, var5 + var8, C_100451_alf.field_106087_T.field_106162_cm);
               } else {
                  var1.func_109526_c(var3 + var7, var4 + 4, var5 + var8, C_100451_alf.field_106238_an.field_106162_cm, 1);
               }
            }
         }

         for(var7 = 1; var7 <= 3; ++var7) {
            var1.func_109378_b(var3 - 1, var4 + var7, var5 - 1, C_100451_alf.field_106087_T.field_106162_cm);
            var1.func_109378_b(var3 - 1, var4 + var7, var5 + 1, C_100451_alf.field_106087_T.field_106162_cm);
            var1.func_109378_b(var3 + 1, var4 + var7, var5 - 1, C_100451_alf.field_106087_T.field_106162_cm);
            var1.func_109378_b(var3 + 1, var4 + var7, var5 + 1, C_100451_alf.field_106087_T.field_106162_cm);
         }

         return true;
      }
   }
}
