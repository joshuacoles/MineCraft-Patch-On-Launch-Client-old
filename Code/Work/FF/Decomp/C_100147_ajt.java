import java.util.Random;

public class C_100147_ajt extends C_100253_aht {

   protected C_100147_ajt(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.2F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
      this.func_105972_b(true);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(25) == 0) {
         byte var6 = 4;
         int var7 = 5;

         int var8;
         int var9;
         int var10;
         for(var8 = var2 - var6; var8 <= var2 + var6; ++var8) {
            for(var9 = var4 - var6; var9 <= var4 + var6; ++var9) {
               for(var10 = var3 - 1; var10 <= var3 + 1; ++var10) {
                  if(var1.func_109349_a(var8, var10, var9) == this.field_106162_cm) {
                     --var7;
                     if(var7 <= 0) {
                        return;
                     }
                  }
               }
            }
         }

         var8 = var2 + var5.nextInt(3) - 1;
         var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
         var10 = var4 + var5.nextInt(3) - 1;

         for(int var11 = 0; var11 < 4; ++var11) {
            if(var1.func_109352_c(var8, var9, var10) && this.func_106001_d(var1, var8, var9, var10)) {
               var2 = var8;
               var3 = var9;
               var4 = var10;
            }

            var8 = var2 + var5.nextInt(3) - 1;
            var9 = var3 + var5.nextInt(2) - var5.nextInt(2);
            var10 = var4 + var5.nextInt(3) - 1;
         }

         if(var1.func_109352_c(var8, var9, var10) && this.func_106001_d(var1, var8, var9, var10)) {
            var1.func_109422_e(var8, var9, var10, this.field_106162_cm);
         }
      }

   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return super.func_106023_b(var1, var2, var3, var4) && this.func_106001_d(var1, var2, var3, var4);
   }

   protected boolean func_106376_d_(int var1) {
      return C_100451_alf.field_106117_q[var1];
   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      if(var3 >= 0 && var3 < 256) {
         int var5 = var1.func_109349_a(var2, var3 - 1, var4);
         return var5 == C_100451_alf.field_106243_bB.field_106162_cm || var1.func_109445_k(var2, var3, var4) < 13 && this.func_106376_d_(var5);
      } else {
         return false;
      }
   }

   public boolean func_106377_c(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      var1.func_109378_b(var2, var3, var4, 0);
      C_100580_aau var7 = null;
      if(this.field_106162_cm == C_100451_alf.field_106228_ai.field_106162_cm) {
         var7 = new C_100580_aau(0);
      } else if(this.field_106162_cm == C_100451_alf.field_106230_aj.field_106162_cm) {
         var7 = new C_100580_aau(1);
      }

      if(var7 != null && var7.func_107965_a(var1, var5, var2, var3, var4)) {
         return true;
      } else {
         var1.func_109526_c(var2, var3, var4, this.field_106162_cm, var6);
         return false;
      }
   }
}
