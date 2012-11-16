import java.util.Random;

public class C_100575_aap extends C_100562_aan {

   private int field_108018_a;
   private int field_108017_b;


   public C_100575_aap(int var1, int var2) {
      this.field_108017_b = var1;
      this.field_108018_a = var2;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var15;
      for(boolean var6 = false; ((var15 = var1.func_109349_a(var3, var4, var5)) == 0 || var15 == C_100451_alf.field_106080_N.field_106162_cm) && var4 > 0; --var4) {
         ;
      }

      int var7 = var1.func_109349_a(var3, var4, var5);
      if(var7 == C_100451_alf.field_106120_y.field_106162_cm || var7 == C_100451_alf.field_106121_x.field_106162_cm) {
         ++var4;
         this.func_107966_a(var1, var3, var4, var5, C_100451_alf.field_106079_M.field_106162_cm, this.field_108017_b);

         for(int var8 = var4; var8 <= var4 + 2; ++var8) {
            int var9 = var8 - var4;
            int var10 = 2 - var9;

            for(int var11 = var3 - var10; var11 <= var3 + var10; ++var11) {
               int var12 = var11 - var3;

               for(int var13 = var5 - var10; var13 <= var5 + var10; ++var13) {
                  int var14 = var13 - var5;
                  if((Math.abs(var12) != var10 || Math.abs(var14) != var10 || var2.nextInt(2) != 0) && !C_100451_alf.field_106117_q[var1.func_109349_a(var11, var8, var13)]) {
                     this.func_107966_a(var1, var11, var8, var13, C_100451_alf.field_106080_N.field_106162_cm, this.field_108018_a);
                  }
               }
            }
         }
      }

      return true;
   }
}
