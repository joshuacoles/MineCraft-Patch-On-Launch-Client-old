import java.util.Random;

public class C_100573_aaq extends C_100562_aan {

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < 64; ++var6) {
         int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var8 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.func_109352_c(var7, var8, var9) && var1.func_109349_a(var7, var8 - 1, var9) == C_100451_alf.field_106149_be.field_106162_cm) {
            var1.func_109422_e(var7, var8, var9, C_100451_alf.field_106222_au.field_106162_cm);
         }
      }

      return true;
   }
}
