import java.util.Random;

public class C_100498_abd extends C_100562_aan {

   private int field_107972_a;
   private int field_107971_b;


   public C_100498_abd(int var1, int var2) {
      this.field_107972_a = var2;
      this.field_107971_b = var1;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      if(var1.func_109350_f(var3, var4, var5) != C_100664_afg.field_109019_h) {
         return false;
      } else {
         int var6 = var2.nextInt(this.field_107971_b - 2) + 2;
         byte var7 = 2;

         for(int var8 = var3 - var6; var8 <= var3 + var6; ++var8) {
            for(int var9 = var5 - var6; var9 <= var5 + var6; ++var9) {
               int var10 = var8 - var3;
               int var11 = var9 - var5;
               if(var10 * var10 + var11 * var11 <= var6 * var6) {
                  for(int var12 = var4 - var7; var12 <= var4 + var7; ++var12) {
                     int var13 = var1.func_109349_a(var8, var12, var9);
                     if(var13 == C_100451_alf.field_106120_y.field_106162_cm || var13 == C_100451_alf.field_106121_x.field_106162_cm) {
                        var1.func_109378_b(var8, var12, var9, this.field_107972_a);
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
