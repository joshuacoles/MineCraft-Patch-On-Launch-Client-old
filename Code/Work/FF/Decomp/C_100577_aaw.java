import java.util.Random;

public class C_100577_aaw extends C_100562_aan {

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      if(!var1.func_109352_c(var3, var4, var5)) {
         return false;
      } else if(var1.func_109349_a(var3, var4 + 1, var5) != C_100451_alf.field_106149_be.field_106162_cm) {
         return false;
      } else {
         var1.func_109422_e(var3, var4, var5, C_100451_alf.field_106142_bg.field_106162_cm);

         for(int var6 = 0; var6 < 1500; ++var6) {
            int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var8 = var4 - var2.nextInt(12);
            int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var1.func_109349_a(var7, var8, var9) == 0) {
               int var10 = 0;

               for(int var11 = 0; var11 < 6; ++var11) {
                  int var12 = 0;
                  if(var11 == 0) {
                     var12 = var1.func_109349_a(var7 - 1, var8, var9);
                  }

                  if(var11 == 1) {
                     var12 = var1.func_109349_a(var7 + 1, var8, var9);
                  }

                  if(var11 == 2) {
                     var12 = var1.func_109349_a(var7, var8 - 1, var9);
                  }

                  if(var11 == 3) {
                     var12 = var1.func_109349_a(var7, var8 + 1, var9);
                  }

                  if(var11 == 4) {
                     var12 = var1.func_109349_a(var7, var8, var9 - 1);
                  }

                  if(var11 == 5) {
                     var12 = var1.func_109349_a(var7, var8, var9 + 1);
                  }

                  if(var12 == C_100451_alf.field_106142_bg.field_106162_cm) {
                     ++var10;
                  }
               }

               if(var10 == 1) {
                  var1.func_109422_e(var7, var8, var9, C_100451_alf.field_106142_bg.field_106162_cm);
               }
            }
         }

         return true;
      }
   }
}
