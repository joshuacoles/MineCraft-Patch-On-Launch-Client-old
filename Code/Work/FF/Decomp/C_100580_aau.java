import java.util.Random;

public class C_100580_aau extends C_100562_aan {

   private int field_108020_a = -1;


   public C_100580_aau(int var1) {
      super(true);
      this.field_108020_a = var1;
   }

   public C_100580_aau() {
      super(false);
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(2);
      if(this.field_108020_a >= 0) {
         var6 = this.field_108020_a;
      }

      int var7 = var2.nextInt(3) + 4;
      boolean var8 = true;
      if(var4 >= 1 && var4 + var7 + 1 < 256) {
         int var9;
         int var11;
         int var12;
         int var13;
         for(var9 = var4; var9 <= var4 + 1 + var7; ++var9) {
            byte var10 = 3;
            if(var9 <= var4 + 3) {
               var10 = 0;
            }

            for(var11 = var3 - var10; var11 <= var3 + var10 && var8; ++var11) {
               for(var12 = var5 - var10; var12 <= var5 + var10 && var8; ++var12) {
                  if(var9 >= 0 && var9 < 256) {
                     var13 = var1.func_109349_a(var11, var9, var12);
                     if(var13 != 0 && var13 != C_100451_alf.field_106080_N.field_106162_cm) {
                        var8 = false;
                     }
                  } else {
                     var8 = false;
                  }
               }
            }
         }

         if(!var8) {
            return false;
         } else {
            var9 = var1.func_109349_a(var3, var4 - 1, var5);
            if(var9 != C_100451_alf.field_106120_y.field_106162_cm && var9 != C_100451_alf.field_106121_x.field_106162_cm && var9 != C_100451_alf.field_106243_bB.field_106162_cm) {
               return false;
            } else {
               int var16 = var4 + var7;
               if(var6 == 1) {
                  var16 = var4 + var7 - 3;
               }

               for(var11 = var16; var11 <= var4 + var7; ++var11) {
                  var12 = 1;
                  if(var11 < var4 + var7) {
                     ++var12;
                  }

                  if(var6 == 0) {
                     var12 = 3;
                  }

                  for(var13 = var3 - var12; var13 <= var3 + var12; ++var13) {
                     for(int var14 = var5 - var12; var14 <= var5 + var12; ++var14) {
                        int var15 = 5;
                        if(var13 == var3 - var12) {
                           --var15;
                        }

                        if(var13 == var3 + var12) {
                           ++var15;
                        }

                        if(var14 == var5 - var12) {
                           var15 -= 3;
                        }

                        if(var14 == var5 + var12) {
                           var15 += 3;
                        }

                        if(var6 == 0 || var11 < var4 + var7) {
                           if((var13 == var3 - var12 || var13 == var3 + var12) && (var14 == var5 - var12 || var14 == var5 + var12)) {
                              continue;
                           }

                           if(var13 == var3 - (var12 - 1) && var14 == var5 - var12) {
                              var15 = 1;
                           }

                           if(var13 == var3 - var12 && var14 == var5 - (var12 - 1)) {
                              var15 = 1;
                           }

                           if(var13 == var3 + (var12 - 1) && var14 == var5 - var12) {
                              var15 = 3;
                           }

                           if(var13 == var3 + var12 && var14 == var5 - (var12 - 1)) {
                              var15 = 3;
                           }

                           if(var13 == var3 - (var12 - 1) && var14 == var5 + var12) {
                              var15 = 7;
                           }

                           if(var13 == var3 - var12 && var14 == var5 + (var12 - 1)) {
                              var15 = 7;
                           }

                           if(var13 == var3 + (var12 - 1) && var14 == var5 + var12) {
                              var15 = 9;
                           }

                           if(var13 == var3 + var12 && var14 == var5 + (var12 - 1)) {
                              var15 = 9;
                           }
                        }

                        if(var15 == 5 && var11 < var4 + var7) {
                           var15 = 0;
                        }

                        if((var15 != 0 || var4 >= var4 + var7 - 1) && !C_100451_alf.field_106117_q[var1.func_109349_a(var13, var11, var14)]) {
                           this.func_107966_a(var1, var13, var11, var14, C_100451_alf.field_106136_bq.field_106162_cm + var6, var15);
                        }
                     }
                  }
               }

               for(var11 = 0; var11 < var7; ++var11) {
                  var12 = var1.func_109349_a(var3, var4 + var11, var5);
                  if(!C_100451_alf.field_106117_q[var12]) {
                     this.func_107966_a(var1, var3, var4 + var11, var5, C_100451_alf.field_106136_bq.field_106162_cm + var6, 10);
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }
}
