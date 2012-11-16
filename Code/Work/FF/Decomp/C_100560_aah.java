import java.util.Random;

public class C_100560_aah extends C_100562_aan {

   private final C_100673_kh[] field_108013_a;
   private final int field_108012_b;


   public C_100560_aah(C_100673_kh[] var1, int var2) {
      this.field_108013_a = var1;
      this.field_108012_b = var2;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var12;
      for(boolean var6 = false; ((var12 = var1.func_109349_a(var3, var4, var5)) == 0 || var12 == C_100451_alf.field_106080_N.field_106162_cm) && var4 > 1; --var4) {
         ;
      }

      if(var4 < 1) {
         return false;
      } else {
         ++var4;

         for(int var7 = 0; var7 < 4; ++var7) {
            int var8 = var3 + var2.nextInt(4) - var2.nextInt(4);
            int var9 = var4 + var2.nextInt(3) - var2.nextInt(3);
            int var10 = var5 + var2.nextInt(4) - var2.nextInt(4);
            if(var1.func_109352_c(var8, var9, var10) && var1.func_109348_t(var8, var9 - 1, var10)) {
               var1.func_109422_e(var8, var9, var10, C_100451_alf.field_106216_ax.field_106162_cm);
               C_100422_amb var11 = (C_100422_amb)var1.func_109353_p(var8, var9, var10);
               if(var11 != null && var11 != null) {
                  C_100673_kh.func_109105_a(var2, this.field_108013_a, var11, this.field_108012_b);
               }

               if(var1.func_109352_c(var8 - 1, var9, var10) && var1.func_109348_t(var8 - 1, var9 - 1, var10)) {
                  var1.func_109422_e(var8 - 1, var9, var10, C_100451_alf.field_106208_at.field_106162_cm);
               }

               if(var1.func_109352_c(var8 + 1, var9, var10) && var1.func_109348_t(var8 - 1, var9 - 1, var10)) {
                  var1.func_109422_e(var8 + 1, var9, var10, C_100451_alf.field_106208_at.field_106162_cm);
               }

               if(var1.func_109352_c(var8, var9, var10 - 1) && var1.func_109348_t(var8 - 1, var9 - 1, var10)) {
                  var1.func_109422_e(var8, var9, var10 - 1, C_100451_alf.field_106208_at.field_106162_cm);
               }

               if(var1.func_109352_c(var8, var9, var10 + 1) && var1.func_109348_t(var8 - 1, var9 - 1, var10)) {
                  var1.func_109422_e(var8, var9, var10 + 1, C_100451_alf.field_106208_at.field_106162_cm);
               }

               return true;
            }
         }

         return false;
      }
   }
}
