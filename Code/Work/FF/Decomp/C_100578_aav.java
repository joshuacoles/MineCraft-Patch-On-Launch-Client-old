import java.util.Random;

public class C_100578_aav extends C_100562_aan {

   private int field_108019_a;


   public C_100578_aav(int var1) {
      this.field_108019_a = var1;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      var3 -= 8;

      for(var5 -= 8; var4 > 5 && var1.func_109352_c(var3, var4, var5); --var4) {
         ;
      }

      if(var4 <= 4) {
         return false;
      } else {
         var4 -= 4;
         boolean[] var6 = new boolean[2048];
         int var7 = var2.nextInt(4) + 4;

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            double var9 = var2.nextDouble() * 6.0D + 3.0D;
            double var11 = var2.nextDouble() * 4.0D + 2.0D;
            double var13 = var2.nextDouble() * 6.0D + 3.0D;
            double var15 = var2.nextDouble() * (16.0D - var9 - 2.0D) + 1.0D + var9 / 2.0D;
            double var17 = var2.nextDouble() * (8.0D - var11 - 4.0D) + 2.0D + var11 / 2.0D;
            double var19 = var2.nextDouble() * (16.0D - var13 - 2.0D) + 1.0D + var13 / 2.0D;

            for(int var21 = 1; var21 < 15; ++var21) {
               for(int var22 = 1; var22 < 15; ++var22) {
                  for(int var23 = 1; var23 < 7; ++var23) {
                     double var24 = ((double)var21 - var15) / (var9 / 2.0D);
                     double var26 = ((double)var23 - var17) / (var11 / 2.0D);
                     double var28 = ((double)var22 - var19) / (var13 / 2.0D);
                     double var30 = var24 * var24 + var26 * var26 + var28 * var28;
                     if(var30 < 1.0D) {
                        var6[(var21 * 16 + var22) * 8 + var23] = true;
                     }
                  }
               }
            }
         }

         int var10;
         int var32;
         boolean var33;
         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 0; var10 < 8; ++var10) {
                  var33 = !var6[(var8 * 16 + var32) * 8 + var10] && (var8 < 15 && var6[((var8 + 1) * 16 + var32) * 8 + var10] || var8 > 0 && var6[((var8 - 1) * 16 + var32) * 8 + var10] || var32 < 15 && var6[(var8 * 16 + var32 + 1) * 8 + var10] || var32 > 0 && var6[(var8 * 16 + (var32 - 1)) * 8 + var10] || var10 < 7 && var6[(var8 * 16 + var32) * 8 + var10 + 1] || var10 > 0 && var6[(var8 * 16 + var32) * 8 + (var10 - 1)]);
                  if(var33) {
                     C_100664_afg var12 = var1.func_109350_f(var3 + var8, var4 + var10, var5 + var32);
                     if(var10 >= 4 && var12.func_108986_d()) {
                        return false;
                     }

                     if(var10 < 4 && !var12.func_108983_a() && var1.func_109349_a(var3 + var8, var4 + var10, var5 + var32) != this.field_108019_a) {
                        return false;
                     }
                  }
               }
            }
         }

         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 0; var10 < 8; ++var10) {
                  if(var6[(var8 * 16 + var32) * 8 + var10]) {
                     var1.func_109378_b(var3 + var8, var4 + var10, var5 + var32, var10 >= 4?0:this.field_108019_a);
                  }
               }
            }
         }

         for(var8 = 0; var8 < 16; ++var8) {
            for(var32 = 0; var32 < 16; ++var32) {
               for(var10 = 4; var10 < 8; ++var10) {
                  if(var6[(var8 * 16 + var32) * 8 + var10] && var1.func_109349_a(var3 + var8, var4 + var10 - 1, var5 + var32) == C_100451_alf.field_106120_y.field_106162_cm && var1.func_109375_b(C_100847_xq.field_110168_a, var3 + var8, var4 + var10, var5 + var32) > 0) {
                     C_101324_xz var35 = var1.func_109362_a(var3 + var8, var5 + var32);
                     if(var35.field_112473_A == C_100451_alf.field_106243_bB.field_106162_cm) {
                        var1.func_109378_b(var3 + var8, var4 + var10 - 1, var5 + var32, C_100451_alf.field_106243_bB.field_106162_cm);
                     } else {
                        var1.func_109378_b(var3 + var8, var4 + var10 - 1, var5 + var32, C_100451_alf.field_106121_x.field_106162_cm);
                     }
                  }
               }
            }
         }

         if(C_100451_alf.field_106118_p[this.field_108019_a].field_106204_cB == C_100664_afg.field_109020_i) {
            for(var8 = 0; var8 < 16; ++var8) {
               for(var32 = 0; var32 < 16; ++var32) {
                  for(var10 = 0; var10 < 8; ++var10) {
                     var33 = !var6[(var8 * 16 + var32) * 8 + var10] && (var8 < 15 && var6[((var8 + 1) * 16 + var32) * 8 + var10] || var8 > 0 && var6[((var8 - 1) * 16 + var32) * 8 + var10] || var32 < 15 && var6[(var8 * 16 + var32 + 1) * 8 + var10] || var32 > 0 && var6[(var8 * 16 + (var32 - 1)) * 8 + var10] || var10 < 7 && var6[(var8 * 16 + var32) * 8 + var10 + 1] || var10 > 0 && var6[(var8 * 16 + var32) * 8 + (var10 - 1)]);
                     if(var33 && (var10 < 4 || var2.nextInt(2) != 0) && var1.func_109350_f(var3 + var8, var4 + var10, var5 + var32).func_108983_a()) {
                        var1.func_109378_b(var3 + var8, var4 + var10, var5 + var32, C_100451_alf.field_106111_w.field_106162_cm);
                     }
                  }
               }
            }
         }

         if(C_100451_alf.field_106118_p[this.field_108019_a].field_106204_cB == C_100664_afg.field_109019_h) {
            for(var8 = 0; var8 < 16; ++var8) {
               for(var32 = 0; var32 < 16; ++var32) {
                  byte var34 = 4;
                  if(var1.func_109446_u(var3 + var8, var4 + var34, var5 + var32)) {
                     var1.func_109378_b(var3 + var8, var4 + var34, var5 + var32, C_100451_alf.field_106184_aW.field_106162_cm);
                  }
               }
            }
         }

         return true;
      }
   }
}
