import java.util.Random;

public class C_100500_abe extends C_100562_aan {

   private int field_107973_a;


   public C_100500_abe(int var1) {
      this.field_107973_a = var1;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      if(var1.func_109352_c(var3, var4, var5) && var1.func_109349_a(var3, var4 - 1, var5) == this.field_107973_a) {
         int var6 = var2.nextInt(32) + 6;
         int var7 = var2.nextInt(4) + 1;

         int var8;
         int var9;
         int var10;
         int var11;
         for(var8 = var3 - var7; var8 <= var3 + var7; ++var8) {
            for(var9 = var5 - var7; var9 <= var5 + var7; ++var9) {
               var10 = var8 - var3;
               var11 = var9 - var5;
               if(var10 * var10 + var11 * var11 <= var7 * var7 + 1 && var1.func_109349_a(var8, var4 - 1, var9) != this.field_107973_a) {
                  return false;
               }
            }
         }

         for(var8 = var4; var8 < var4 + var6 && var8 < 128; ++var8) {
            for(var9 = var3 - var7; var9 <= var3 + var7; ++var9) {
               for(var10 = var5 - var7; var10 <= var5 + var7; ++var10) {
                  var11 = var9 - var3;
                  int var12 = var10 - var5;
                  if(var11 * var11 + var12 * var12 <= var7 * var7 + 1) {
                     var1.func_109422_e(var9, var8, var10, C_100451_alf.field_106210_as.field_106162_cm);
                  }
               }
            }
         }

         C_100563_ox var13 = new C_100563_ox(var1);
         var13.func_103055_b((double)((float)var3 + 0.5F), (double)(var4 + var6), (double)((float)var5 + 0.5F), var2.nextFloat() * 360.0F, 0.0F);
         var1.func_109513_d(var13);
         var1.func_109422_e(var3, var4 + var6, var5, C_100451_alf.field_106077_C.field_106162_cm);
         return true;
      } else {
         return false;
      }
   }
}
