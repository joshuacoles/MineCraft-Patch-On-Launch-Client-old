import java.util.Random;

public class C_101245_zz extends C_100550_aaa {

   protected void func_108349_a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10) {
      this.func_108350_a(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.field_108344_b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void func_108350_a(long var1, int var3, int var4, byte[] var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var19 = (double)(var3 * 16 + 8);
      double var21 = (double)(var4 * 16 + 8);
      float var23 = 0.0F;
      float var24 = 0.0F;
      Random var25 = new Random(var1);
      if(var16 <= 0) {
         int var26 = this.field_108346_a * 16 - 16;
         var16 = var26 - var25.nextInt(var26 / 4);
      }

      boolean var54 = false;
      if(var15 == -1) {
         var15 = var16 / 2;
         var54 = true;
      }

      int var27 = var25.nextInt(var16 / 2) + var16 / 4;

      for(boolean var28 = var25.nextInt(6) == 0; var15 < var16; ++var15) {
         double var29 = 1.5D + (double)(C_100650_jv.func_108924_a((float)var15 * 3.1415927F / (float)var16) * var12 * 1.0F);
         double var31 = var29 * var17;
         float var33 = C_100650_jv.func_108928_b(var14);
         float var34 = C_100650_jv.func_108924_a(var14);
         var6 += (double)(C_100650_jv.func_108928_b(var13) * var33);
         var8 += (double)var34;
         var10 += (double)(C_100650_jv.func_108924_a(var13) * var33);
         if(var28) {
            var14 *= 0.92F;
         } else {
            var14 *= 0.7F;
         }

         var14 += var24 * 0.1F;
         var13 += var23 * 0.1F;
         var24 *= 0.9F;
         var23 *= 0.75F;
         var24 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 2.0F;
         var23 += (var25.nextFloat() - var25.nextFloat()) * var25.nextFloat() * 4.0F;
         if(!var54 && var15 == var27 && var12 > 1.0F && var16 > 0) {
            this.func_108350_a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            this.func_108350_a(var25.nextLong(), var3, var4, var5, var6, var8, var10, var25.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            return;
         }

         if(var54 || var25.nextInt(4) != 0) {
            double var35 = var6 - var19;
            double var37 = var10 - var21;
            double var39 = (double)(var16 - var15);
            double var41 = (double)(var12 + 2.0F + 16.0F);
            if(var35 * var35 + var37 * var37 - var39 * var39 > var41 * var41) {
               return;
            }

            if(var6 >= var19 - 16.0D - var29 * 2.0D && var10 >= var21 - 16.0D - var29 * 2.0D && var6 <= var19 + 16.0D + var29 * 2.0D && var10 <= var21 + 16.0D + var29 * 2.0D) {
               int var55 = C_100650_jv.func_108910_c(var6 - var29) - var3 * 16 - 1;
               int var36 = C_100650_jv.func_108910_c(var6 + var29) - var3 * 16 + 1;
               int var57 = C_100650_jv.func_108910_c(var8 - var31) - 1;
               int var38 = C_100650_jv.func_108910_c(var8 + var31) + 1;
               int var56 = C_100650_jv.func_108910_c(var10 - var29) - var4 * 16 - 1;
               int var40 = C_100650_jv.func_108910_c(var10 + var29) - var4 * 16 + 1;
               if(var55 < 0) {
                  var55 = 0;
               }

               if(var36 > 16) {
                  var36 = 16;
               }

               if(var57 < 1) {
                  var57 = 1;
               }

               if(var38 > 120) {
                  var38 = 120;
               }

               if(var56 < 0) {
                  var56 = 0;
               }

               if(var40 > 16) {
                  var40 = 16;
               }

               boolean var58 = false;

               int var42;
               int var45;
               for(var42 = var55; !var58 && var42 < var36; ++var42) {
                  for(int var43 = var56; !var58 && var43 < var40; ++var43) {
                     for(int var44 = var38 + 1; !var58 && var44 >= var57 - 1; --var44) {
                        var45 = (var42 * 16 + var43) * 128 + var44;
                        if(var44 >= 0 && var44 < 128) {
                           if(var5[var45] == C_100451_alf.field_106071_D.field_106162_cm || var5[var45] == C_100451_alf.field_106072_E.field_106162_cm) {
                              var58 = true;
                           }

                           if(var44 != var57 - 1 && var42 != var55 && var42 != var36 - 1 && var43 != var56 && var43 != var40 - 1) {
                              var44 = var57;
                           }
                        }
                     }
                  }
               }

               if(!var58) {
                  for(var42 = var55; var42 < var36; ++var42) {
                     double var59 = ((double)(var42 + var3 * 16) + 0.5D - var6) / var29;

                     for(var45 = var56; var45 < var40; ++var45) {
                        double var46 = ((double)(var45 + var4 * 16) + 0.5D - var10) / var29;
                        int var48 = (var42 * 16 + var45) * 128 + var38;
                        boolean var49 = false;
                        if(var59 * var59 + var46 * var46 < 1.0D) {
                           for(int var50 = var38 - 1; var50 >= var57; --var50) {
                              double var51 = ((double)var50 + 0.5D - var8) / var31;
                              if(var51 > -0.7D && var59 * var59 + var51 * var51 + var46 * var46 < 1.0D) {
                                 byte var53 = var5[var48];
                                 if(var53 == C_100451_alf.field_106121_x.field_106162_cm) {
                                    var49 = true;
                                 }

                                 if(var53 == C_100451_alf.field_106111_w.field_106162_cm || var53 == C_100451_alf.field_106120_y.field_106162_cm || var53 == C_100451_alf.field_106121_x.field_106162_cm) {
                                    if(var50 < 10) {
                                       var5[var48] = (byte)C_100451_alf.field_106073_F.field_106162_cm;
                                    } else {
                                       var5[var48] = 0;
                                       if(var49 && var5[var48 - 1] == C_100451_alf.field_106120_y.field_106162_cm) {
                                          var5[var48 - 1] = this.field_108345_c.func_109362_a(var42 + var3 * 16, var45 + var4 * 16).field_112473_A;
                                       }
                                    }
                                 }
                              }

                              --var48;
                           }
                        }
                     }
                  }

                  if(var54) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void func_108343_a(C_100873_xe var1, int var2, int var3, int var4, int var5, byte[] var6) {
      int var7 = this.field_108344_b.nextInt(this.field_108344_b.nextInt(this.field_108344_b.nextInt(40) + 1) + 1);
      if(this.field_108344_b.nextInt(15) != 0) {
         var7 = 0;
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         double var9 = (double)(var2 * 16 + this.field_108344_b.nextInt(16));
         double var11 = (double)this.field_108344_b.nextInt(this.field_108344_b.nextInt(120) + 8);
         double var13 = (double)(var3 * 16 + this.field_108344_b.nextInt(16));
         int var15 = 1;
         if(this.field_108344_b.nextInt(4) == 0) {
            this.func_108349_a(this.field_108344_b.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 += this.field_108344_b.nextInt(4);
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            float var17 = this.field_108344_b.nextFloat() * 3.1415927F * 2.0F;
            float var18 = (this.field_108344_b.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.field_108344_b.nextFloat() * 2.0F + this.field_108344_b.nextFloat();
            if(this.field_108344_b.nextInt(10) == 0) {
               var19 *= this.field_108344_b.nextFloat() * this.field_108344_b.nextFloat() * 3.0F + 1.0F;
            }

            this.func_108350_a(this.field_108344_b.nextLong(), var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0D);
         }
      }

   }
}
