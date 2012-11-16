import java.util.Random;

public class C_100728_aew extends C_100723_afc {

   private int[] field_109289_d;
   public double field_109292_a;
   public double field_109290_b;
   public double field_109291_c;


   public C_100728_aew() {
      this(new Random());
   }

   public C_100728_aew(Random var1) {
      this.field_109289_d = new int[512];
      this.field_109292_a = var1.nextDouble() * 256.0D;
      this.field_109290_b = var1.nextDouble() * 256.0D;
      this.field_109291_c = var1.nextDouble() * 256.0D;

      int var2;
      for(var2 = 0; var2 < 256; this.field_109289_d[var2] = var2++) {
         ;
      }

      for(var2 = 0; var2 < 256; ++var2) {
         int var3 = var1.nextInt(256 - var2) + var2;
         int var4 = this.field_109289_d[var2];
         this.field_109289_d[var2] = this.field_109289_d[var3];
         this.field_109289_d[var3] = var4;
         this.field_109289_d[var2 + 256] = this.field_109289_d[var2];
      }

   }

   public final double func_109288_b(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public final double func_109286_a(int var1, double var2, double var4) {
      int var6 = var1 & 15;
      double var7 = (double)(1 - ((var6 & 8) >> 3)) * var2;
      double var9 = var6 < 4?0.0D:(var6 != 12 && var6 != 14?var4:var2);
      return ((var6 & 1) == 0?var7:-var7) + ((var6 & 2) == 0?var9:-var9);
   }

   public final double func_109287_a(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      double var9 = var8 < 8?var2:var4;
      double var11 = var8 < 4?var4:(var8 != 12 && var8 != 14?var6:var2);
      return ((var8 & 1) == 0?var9:-var9) + ((var8 & 2) == 0?var11:-var11);
   }

   public void func_109285_a(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17) {
      int var19;
      int var22;
      double var31;
      double var35;
      double var38;
      int var37;
      double var42;
      int var40;
      int var41;
      int var10001;
      int var77;
      if(var9 == 1) {
         boolean var66 = false;
         boolean var65 = false;
         boolean var21 = false;
         boolean var67 = false;
         double var72 = 0.0D;
         double var71 = 0.0D;
         var77 = 0;
         double var74 = 1.0D / var17;

         for(int var30 = 0; var30 < var8; ++var30) {
            var31 = var2 + (double)var30 * var11 + this.field_109292_a;
            int var78 = (int)var31;
            if(var31 < (double)var78) {
               --var78;
            }

            int var34 = var78 & 255;
            var31 -= (double)var78;
            var35 = var31 * var31 * var31 * (var31 * (var31 * 6.0D - 15.0D) + 10.0D);

            for(var37 = 0; var37 < var10; ++var37) {
               var38 = var6 + (double)var37 * var15 + this.field_109291_c;
               var40 = (int)var38;
               if(var38 < (double)var40) {
                  --var40;
               }

               var41 = var40 & 255;
               var38 -= (double)var40;
               var42 = var38 * var38 * var38 * (var38 * (var38 * 6.0D - 15.0D) + 10.0D);
               var19 = this.field_109289_d[var34] + 0;
               int var64 = this.field_109289_d[var19] + var41;
               int var69 = this.field_109289_d[var34 + 1] + 0;
               var22 = this.field_109289_d[var69] + var41;
               var72 = this.func_109288_b(var35, this.func_109286_a(this.field_109289_d[var64], var31, var38), this.func_109287_a(this.field_109289_d[var22], var31 - 1.0D, 0.0D, var38));
               var71 = this.func_109288_b(var35, this.func_109287_a(this.field_109289_d[var64 + 1], var31, 0.0D, var38 - 1.0D), this.func_109287_a(this.field_109289_d[var22 + 1], var31 - 1.0D, 0.0D, var38 - 1.0D));
               double var79 = this.func_109288_b(var42, var72, var71);
               var10001 = var77++;
               var1[var10001] += var79 * var74;
            }
         }

      } else {
         var19 = 0;
         double var20 = 1.0D / var17;
         var22 = -1;
         boolean var23 = false;
         boolean var24 = false;
         boolean var25 = false;
         boolean var26 = false;
         boolean var27 = false;
         boolean var28 = false;
         double var29 = 0.0D;
         var31 = 0.0D;
         double var33 = 0.0D;
         var35 = 0.0D;

         for(var37 = 0; var37 < var8; ++var37) {
            var38 = var2 + (double)var37 * var11 + this.field_109292_a;
            var40 = (int)var38;
            if(var38 < (double)var40) {
               --var40;
            }

            var41 = var40 & 255;
            var38 -= (double)var40;
            var42 = var38 * var38 * var38 * (var38 * (var38 * 6.0D - 15.0D) + 10.0D);

            for(int var44 = 0; var44 < var10; ++var44) {
               double var45 = var6 + (double)var44 * var15 + this.field_109291_c;
               int var47 = (int)var45;
               if(var45 < (double)var47) {
                  --var47;
               }

               int var48 = var47 & 255;
               var45 -= (double)var47;
               double var49 = var45 * var45 * var45 * (var45 * (var45 * 6.0D - 15.0D) + 10.0D);

               for(int var51 = 0; var51 < var9; ++var51) {
                  double var52 = var4 + (double)var51 * var13 + this.field_109290_b;
                  int var54 = (int)var52;
                  if(var52 < (double)var54) {
                     --var54;
                  }

                  int var55 = var54 & 255;
                  var52 -= (double)var54;
                  double var56 = var52 * var52 * var52 * (var52 * (var52 * 6.0D - 15.0D) + 10.0D);
                  if(var51 == 0 || var55 != var22) {
                     var22 = var55;
                     int var68 = this.field_109289_d[var41] + var55;
                     int var73 = this.field_109289_d[var68] + var48;
                     int var70 = this.field_109289_d[var68 + 1] + var48;
                     int var76 = this.field_109289_d[var41 + 1] + var55;
                     var77 = this.field_109289_d[var76] + var48;
                     int var75 = this.field_109289_d[var76 + 1] + var48;
                     var29 = this.func_109288_b(var42, this.func_109287_a(this.field_109289_d[var73], var38, var52, var45), this.func_109287_a(this.field_109289_d[var77], var38 - 1.0D, var52, var45));
                     var31 = this.func_109288_b(var42, this.func_109287_a(this.field_109289_d[var70], var38, var52 - 1.0D, var45), this.func_109287_a(this.field_109289_d[var75], var38 - 1.0D, var52 - 1.0D, var45));
                     var33 = this.func_109288_b(var42, this.func_109287_a(this.field_109289_d[var73 + 1], var38, var52, var45 - 1.0D), this.func_109287_a(this.field_109289_d[var77 + 1], var38 - 1.0D, var52, var45 - 1.0D));
                     var35 = this.func_109288_b(var42, this.func_109287_a(this.field_109289_d[var70 + 1], var38, var52 - 1.0D, var45 - 1.0D), this.func_109287_a(this.field_109289_d[var75 + 1], var38 - 1.0D, var52 - 1.0D, var45 - 1.0D));
                  }

                  double var58 = this.func_109288_b(var56, var29, var31);
                  double var60 = this.func_109288_b(var56, var33, var35);
                  double var62 = this.func_109288_b(var49, var58, var60);
                  var10001 = var19++;
                  var1[var10001] += var62 * var20;
               }
            }
         }

      }
   }
}
