import java.util.Random;

public class C_100509_abj extends C_100562_aan {

   private final int field_107982_a;
   private final boolean field_107980_b;
   private final int field_107981_c;
   private final int field_107979_d;


   public C_100509_abj(boolean var1) {
      this(var1, 4, 0, 0, false);
   }

   public C_100509_abj(boolean var1, int var2, int var3, int var4, boolean var5) {
      super(var1);
      this.field_107982_a = var2;
      this.field_107981_c = var3;
      this.field_107979_d = var4;
      this.field_107980_b = var5;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var6 = var2.nextInt(3) + this.field_107982_a;
      boolean var7 = true;
      if(var4 >= 1 && var4 + var6 + 1 <= 256) {
         int var8;
         byte var9;
         int var11;
         int var12;
         for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
            var9 = 1;
            if(var8 == var4) {
               var9 = 0;
            }

            if(var8 >= var4 + 1 + var6 - 2) {
               var9 = 2;
            }

            for(int var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
               for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                  if(var8 >= 0 && var8 < 256) {
                     var12 = var1.func_109349_a(var10, var8, var11);
                     if(var12 != 0 && var12 != C_100451_alf.field_106080_N.field_106162_cm && var12 != C_100451_alf.field_106121_x.field_106162_cm && var12 != C_100451_alf.field_106120_y.field_106162_cm && var12 != C_100451_alf.field_106079_M.field_106162_cm) {
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
               this.func_107967_a(var1, var3, var4 - 1, var5, C_100451_alf.field_106120_y.field_106162_cm);
               var9 = 3;
               byte var18 = 0;

               int var13;
               int var14;
               int var15;
               for(var11 = var4 - var9 + var6; var11 <= var4 + var6; ++var11) {
                  var12 = var11 - (var4 + var6);
                  var13 = var18 + 1 - var12 / 2;

                  for(var14 = var3 - var13; var14 <= var3 + var13; ++var14) {
                     var15 = var14 - var3;

                     for(int var16 = var5 - var13; var16 <= var5 + var13; ++var16) {
                        int var17 = var16 - var5;
                        if((Math.abs(var15) != var13 || Math.abs(var17) != var13 || var2.nextInt(2) != 0 && var12 != 0) && !C_100451_alf.field_106117_q[var1.func_109349_a(var14, var11, var16)]) {
                           this.func_107966_a(var1, var14, var11, var16, C_100451_alf.field_106080_N.field_106162_cm, this.field_107979_d);
                        }
                     }
                  }
               }

               for(var11 = 0; var11 < var6; ++var11) {
                  var12 = var1.func_109349_a(var3, var4 + var11, var5);
                  if(var12 == 0 || var12 == C_100451_alf.field_106080_N.field_106162_cm) {
                     this.func_107966_a(var1, var3, var4 + var11, var5, C_100451_alf.field_106079_M.field_106162_cm, this.field_107981_c);
                     if(this.field_107980_b && var11 > 0) {
                        if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 - 1, var4 + var11, var5)) {
                           this.func_107966_a(var1, var3 - 1, var4 + var11, var5, C_100451_alf.field_106128_bx.field_106162_cm, 8);
                        }

                        if(var2.nextInt(3) > 0 && var1.func_109352_c(var3 + 1, var4 + var11, var5)) {
                           this.func_107966_a(var1, var3 + 1, var4 + var11, var5, C_100451_alf.field_106128_bx.field_106162_cm, 2);
                        }

                        if(var2.nextInt(3) > 0 && var1.func_109352_c(var3, var4 + var11, var5 - 1)) {
                           this.func_107966_a(var1, var3, var4 + var11, var5 - 1, C_100451_alf.field_106128_bx.field_106162_cm, 1);
                        }

                        if(var2.nextInt(3) > 0 && var1.func_109352_c(var3, var4 + var11, var5 + 1)) {
                           this.func_107966_a(var1, var3, var4 + var11, var5 + 1, C_100451_alf.field_106128_bx.field_106162_cm, 4);
                        }
                     }
                  }
               }

               if(this.field_107980_b) {
                  for(var11 = var4 - 3 + var6; var11 <= var4 + var6; ++var11) {
                     var12 = var11 - (var4 + var6);
                     var13 = 2 - var12 / 2;

                     for(var14 = var3 - var13; var14 <= var3 + var13; ++var14) {
                        for(var15 = var5 - var13; var15 <= var5 + var13; ++var15) {
                           if(var1.func_109349_a(var14, var11, var15) == C_100451_alf.field_106080_N.field_106162_cm) {
                              if(var2.nextInt(4) == 0 && var1.func_109349_a(var14 - 1, var11, var15) == 0) {
                                 this.func_107978_b(var1, var14 - 1, var11, var15, 8);
                              }

                              if(var2.nextInt(4) == 0 && var1.func_109349_a(var14 + 1, var11, var15) == 0) {
                                 this.func_107978_b(var1, var14 + 1, var11, var15, 2);
                              }

                              if(var2.nextInt(4) == 0 && var1.func_109349_a(var14, var11, var15 - 1) == 0) {
                                 this.func_107978_b(var1, var14, var11, var15 - 1, 1);
                              }

                              if(var2.nextInt(4) == 0 && var1.func_109349_a(var14, var11, var15 + 1) == 0) {
                                 this.func_107978_b(var1, var14, var11, var15 + 1, 4);
                              }
                           }
                        }
                     }
                  }

                  if(var2.nextInt(5) == 0 && var6 > 5) {
                     for(var11 = 0; var11 < 2; ++var11) {
                        for(var12 = 0; var12 < 4; ++var12) {
                           if(var2.nextInt(4 - var11) == 0) {
                              var13 = var2.nextInt(3);
                              this.func_107966_a(var1, var3 + C_100015_i.field_105283_a[C_100015_i.field_105277_f[var12]], var4 + var6 - 5 + var11, var5 + C_100015_i.field_105281_b[C_100015_i.field_105277_f[var12]], C_100451_alf.field_106211_bS.field_106162_cm, var13 << 2 | var12);
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

   private void func_107978_b(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this.func_107966_a(var1, var2, var3, var4, C_100451_alf.field_106128_bx.field_106162_cm, var5);
      int var6 = 4;

      while(true) {
         --var3;
         if(var1.func_109349_a(var2, var3, var4) != 0 || var6 <= 0) {
            return;
         }

         this.func_107966_a(var1, var2, var3, var4, C_100451_alf.field_106128_bx.field_106162_cm, var5);
         --var6;
      }
   }
}
