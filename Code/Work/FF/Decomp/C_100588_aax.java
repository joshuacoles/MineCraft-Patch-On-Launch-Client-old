import java.util.Random;

public class C_100588_aax extends C_100562_aan {

   private final int field_108028_a;
   private final int field_108026_b;
   private final int field_108027_c;


   public C_100588_aax(boolean var1, int var2, int var3, int var4) {
      super(var1);
      this.field_108028_a = var2;
      this.field_108026_b = var3;
      this.field_108027_c = var4;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + this.field_108028_a;
      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var8;
         int var10;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            byte var9 = 2;
            if(var8 == var4) {
               var9 = 1;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 256) {
                     var12 = var1.func_109349_a(var10, var8, var11);
                     if(var12 != 0 && var12 != C_100451_alf.field_106080_N.field_106162_cm && var12 != C_100451_alf.field_106121_x.field_106162_cm && var12 != C_100451_alf.field_106120_y.field_106162_cm && var12 != C_100451_alf.field_106079_M.field_106162_cm && var12 != C_100451_alf.field_106076_B.field_106162_cm) {
                        var7 = false;
                     }
                  } else {
                     var7 = false;
                  }
               }
            }
         }

         if(!var7) {
            return false;
         } else {
            var8 = var1.func_109349_a(var3, var4 - 1, var5);
            if((var8 == C_100451_alf.field_106121_x.field_106162_cm || var8 == C_100451_alf.field_106120_y.field_106162_cm) && var4 < 256 - var6 - 1) {
               var1.func_109378_b(var3, var4 - 1, var5, C_100451_alf.field_106120_y.field_106162_cm);
               var1.func_109378_b(var3 + 1, var4 - 1, var5, C_100451_alf.field_106120_y.field_106162_cm);
               var1.func_109378_b(var3, var4 - 1, var5 + 1, C_100451_alf.field_106120_y.field_106162_cm);
               var1.func_109378_b(var3 + 1, var4 - 1, var5 + 1, C_100451_alf.field_106120_y.field_106162_cm);
               this.func_108025_a(var1, var3, var5, var4 + var6, 2, var2);

               for(int var14 = var4 + var6 - 2 - var2.nextInt(4); var14 > var4 + var6 / 2; var14 -= 2 + var2.nextInt(4)) {
                  float var15 = var2.nextFloat() * 3.1415927F * 2.0F;
                  var11 = var3 + (int)(0.5F + C_100650_jv.func_108928_b(var15) * 4.0F);
                  var12 = var5 + (int)(0.5F + C_100650_jv.func_108924_a(var15) * 4.0F);
                  this.func_108025_a(var1, var11, var12, var14, 0, var2);

                  for(int var13 = 0; var13 < 5; ++var13) {
                     var11 = var3 + (int)(1.5F + C_100650_jv.func_108928_b(var15) * (float)var13);
                     var12 = var5 + (int)(1.5F + C_100650_jv.func_108924_a(var15) * (float)var13);
                     this.func_107966_a(var1, var11, var14 - 3 + var13 / 2, var12, C_100451_alf.field_106079_M.field_106162_cm, this.field_108026_b);
                  }
               }

               for(var10 = 0; var10 < var6; ++var10) {
                  var11 = var1.func_109349_a(var3, var4 + var10, var5);
                  if(var11 == 0 || var11 == C_100451_alf.field_106080_N.field_106162_cm) {
                     this.func_107966_a(var1, var3, var4 + var10, var5, C_100451_alf.field_106079_M.field_106162_cm, this.field_108026_b);
                     if(var10 > 0) {
                        if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 - 1, var4 + var10, var5)) {
                           this.func_107966_a(var1, var3 - 1, var4 + var10, var5, C_100451_alf.field_106128_bx.field_106162_cm, 8);
                        }

                        if(var2.nextInt(3) > 0 && var1.func_109352_c(var3, var4 + var10, var5 - 1)) {
                           this.func_107966_a(var1, var3, var4 + var10, var5 - 1, C_100451_alf.field_106128_bx.field_106162_cm, 1);
                        }
                     }
                  }

                  if(var10 < var6 - 1) {
                     var11 = var1.func_109349_a(var3 + 1, var4 + var10, var5);
                     if(var11 == 0 || var11 == C_100451_alf.field_106080_N.field_106162_cm) {
                        this.func_107966_a(var1, var3 + 1, var4 + var10, var5, C_100451_alf.field_106079_M.field_106162_cm, this.field_108026_b);
                        if(var10 > 0) {
                           if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 + 2, var4 + var10, var5)) {
                              this.func_107966_a(var1, var3 + 2, var4 + var10, var5, C_100451_alf.field_106128_bx.field_106162_cm, 2);
                           }

                           if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 + 1, var4 + var10, var5 - 1)) {
                              this.func_107966_a(var1, var3 + 1, var4 + var10, var5 - 1, C_100451_alf.field_106128_bx.field_106162_cm, 1);
                           }
                        }
                     }

                     var11 = var1.func_109349_a(var3 + 1, var4 + var10, var5 + 1);
                     if(var11 == 0 || var11 == C_100451_alf.field_106080_N.field_106162_cm) {
                        this.func_107966_a(var1, var3 + 1, var4 + var10, var5 + 1, C_100451_alf.field_106079_M.field_106162_cm, this.field_108026_b);
                        if(var10 > 0) {
                           if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 + 2, var4 + var10, var5 + 1)) {
                              this.func_107966_a(var1, var3 + 2, var4 + var10, var5 + 1, C_100451_alf.field_106128_bx.field_106162_cm, 2);
                           }

                           if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 + 1, var4 + var10, var5 + 2)) {
                              this.func_107966_a(var1, var3 + 1, var4 + var10, var5 + 2, C_100451_alf.field_106128_bx.field_106162_cm, 4);
                           }
                        }
                     }

                     var11 = var1.func_109349_a(var3, var4 + var10, var5 + 1);
                     if(var11 == 0 || var11 == C_100451_alf.field_106080_N.field_106162_cm) {
                        this.func_107966_a(var1, var3, var4 + var10, var5 + 1, C_100451_alf.field_106079_M.field_106162_cm, this.field_108026_b);
                        if(var10 > 0) {
                           if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 - 1, var4 + var10, var5 + 1)) {
                              this.func_107966_a(var1, var3 - 1, var4 + var10, var5 + 1, C_100451_alf.field_106128_bx.field_106162_cm, 8);
                           }

                           if(var2.nextInt(3) > 0 && var1.func_109352_c(var3, var4 + var10, var5 + 2)) {
                              this.func_107966_a(var1, var3, var4 + var10, var5 + 2, C_100451_alf.field_106128_bx.field_106162_cm, 4);
                           }
                        }
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void func_108025_a(C_100873_xe var1, int var2, int var3, int var4, int var5, Random var6) {
      byte var7 = 2;

      for(int var8 = var4 - var7; var8 <= var4; ++var8) {
         int var9 = var8 - var4;
         int var10 = var5 + 1 - var9;

         for(int var11 = var2 - var10; var11 <= var2 + var10 + 1; ++var11) {
            int var12 = var11 - var2;

            for(int var13 = var3 - var10; var13 <= var3 + var10 + 1; ++var13) {
               int var14 = var13 - var3;
               if((var12 >= 0 || var14 >= 0 || var12 * var12 + var14 * var14 <= var10 * var10) && (var12 <= 0 && var14 <= 0 || var12 * var12 + var14 * var14 <= (var10 + 1) * (var10 + 1)) && (var6.nextInt(4) != 0 || var12 * var12 + var14 * var14 <= (var10 - 1) * (var10 - 1)) && !C_100451_alf.field_106117_q[var1.func_109349_a(var11, var8, var13)]) {
                  this.func_107966_a(var1, var11, var8, var13, C_100451_alf.field_106080_N.field_106162_cm, this.field_108027_c);
               }
            }
         }
      }

   }
}
