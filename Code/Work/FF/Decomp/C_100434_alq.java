import java.util.Random;

public class C_100434_alq extends C_100451_alf {

   public C_100434_alq(int var1) {
      super(var1, 172, C_100664_afg.field_109027_q);
      this.func_106034_a(C_101040_sq.field_111415_d);
      this.func_105972_b(true);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 29;
   }

   public int func_106000_r_() {
      return 10;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return var5 == 2 && var1.func_109360_s(var2, var3, var4 + 1)?true:(var5 == 3 && var1.func_109360_s(var2, var3, var4 - 1)?true:(var5 == 4 && var1.func_109360_s(var2 + 1, var3, var4)?true:var5 == 5 && var1.func_109360_s(var2 - 1, var3, var4)));
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109360_s(var2 - 1, var3, var4)?true:(var1.func_109360_s(var2 + 1, var3, var4)?true:(var1.func_109360_s(var2, var3, var4 - 1)?true:var1.func_109360_s(var2, var3, var4 + 1)));
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      byte var9 = 0;
      if(var5 == 2 && var1.func_109447_b(var2, var3, var4 + 1, true)) {
         var9 = 2;
      }

      if(var5 == 3 && var1.func_109447_b(var2, var3, var4 - 1, true)) {
         var9 = 0;
      }

      if(var5 == 4 && var1.func_109447_b(var2 + 1, var3, var4, true)) {
         var9 = 1;
      }

      if(var5 == 5 && var1.func_109447_b(var2 - 1, var3, var4, true)) {
         var9 = 3;
      }

      this.func_106412_a(var1, var2, var3, var4, this.field_106162_cm, var9, false, -1, 0);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var5 != this.field_106162_cm) {
         if(this.func_106413_l(var1, var2, var3, var4)) {
            int var6 = var1.func_109357_g(var2, var3, var4);
            int var7 = var6 & 3;
            boolean var8 = false;
            if(!var1.func_109360_s(var2 - 1, var3, var4) && var7 == 3) {
               var8 = true;
            }

            if(!var1.func_109360_s(var2 + 1, var3, var4) && var7 == 1) {
               var8 = true;
            }

            if(!var1.func_109360_s(var2, var3, var4 - 1) && var7 == 0) {
               var8 = true;
            }

            if(!var1.func_109360_s(var2, var3, var4 + 1) && var7 == 2) {
               var8 = true;
            }

            if(var8) {
               this.func_106035_c(var1, var2, var3, var4, var6, 0);
               var1.func_109422_e(var2, var3, var4, 0);
            }
         }

      }
   }

   public void func_106412_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9) {
      int var10 = var6 & 3;
      boolean var11 = (var6 & 4) == 4;
      boolean var12 = (var6 & 8) == 8;
      boolean var13 = var5 == C_100451_alf.field_106219_bW.field_106162_cm;
      boolean var14 = false;
      boolean var15 = !var1.func_109348_t(var2, var3 - 1, var4);
      int var16 = C_100015_i.field_105283_a[var10];
      int var17 = C_100015_i.field_105281_b[var10];
      int var18 = 0;
      int[] var19 = new int[42];

      int var21;
      int var20;
      int var23;
      int var22;
      int var24;
      for(var20 = 1; var20 < 42; ++var20) {
         var21 = var2 + var16 * var20;
         var22 = var4 + var17 * var20;
         var23 = var1.func_109349_a(var21, var3, var22);
         if(var23 == C_100451_alf.field_106219_bW.field_106162_cm) {
            var24 = var1.func_109357_g(var21, var3, var22);
            if((var24 & 3) == C_100015_i.field_105277_f[var10]) {
               var18 = var20;
            }
            break;
         }

         if(var23 != C_100451_alf.field_106217_bX.field_106162_cm && var20 != var8) {
            var19[var20] = -1;
            var13 = false;
         } else {
            var24 = var20 == var8?var9:var1.func_109357_g(var21, var3, var22);
            boolean var25 = (var24 & 8) != 8;
            boolean var26 = (var24 & 1) == 1;
            boolean var27 = (var24 & 2) == 2;
            var13 &= var27 == var15;
            var14 |= var25 && var26;
            var19[var20] = var24;
            if(var20 == var8) {
               var1.func_109398_a(var2, var3, var4, var5, this.func_106000_r_());
               var13 &= var25;
            }
         }
      }

      var13 &= var18 > 1;
      var14 &= var13;
      var20 = (var13?4:0) | (var14?8:0);
      var6 = var10 | var20;
      if(var18 > 0) {
         var21 = var2 + var16 * var18;
         var22 = var4 + var17 * var18;
         var23 = C_100015_i.field_105277_f[var10];
         var1.func_109488_c(var21, var3, var22, var23 | var20);
         this.func_106414_d(var1, var21, var3, var22, var23);
         this.func_106411_a(var1, var21, var3, var22, var13, var14, var11, var12);
      }

      this.func_106411_a(var1, var2, var3, var4, var13, var14, var11, var12);
      if(var5 > 0) {
         var1.func_109488_c(var2, var3, var4, var6);
         if(var7) {
            this.func_106414_d(var1, var2, var3, var4, var10);
         }
      }

      if(var11 != var13) {
         for(var21 = 1; var21 < var18; ++var21) {
            var22 = var2 + var16 * var21;
            var23 = var4 + var17 * var21;
            var24 = var19[var21];
            if(var24 >= 0) {
               if(var13) {
                  var24 |= 4;
               } else {
                  var24 &= -5;
               }

               var1.func_109488_c(var22, var3, var23, var24);
            }
         }
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      this.func_106412_a(var1, var2, var3, var4, this.field_106162_cm, var1.func_109357_g(var2, var3, var4), true, -1, 0);
   }

   private void func_106411_a(C_100873_xe var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if(var6 && !var8) {
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.6F);
      } else if(!var6 && var8) {
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.5F);
      } else if(var5 && !var7) {
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.click", 0.4F, 0.7F);
      } else if(!var5 && var7) {
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.1D, (double)var4 + 0.5D, "random.bowhit", 0.4F, 1.2F / (var1.field_109577_u.nextFloat() * 0.2F + 0.9F));
      }

   }

   private void func_106414_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
      if(var5 == 3) {
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
      } else if(var5 == 1) {
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
      } else if(var5 == 0) {
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
      } else if(var5 == 2) {
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
      }

   }

   private boolean func_106413_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106023_b(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4) & 3;
      float var6 = 0.1875F;
      if(var5 == 3) {
         this.func_106008_a(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 1) {
         this.func_106008_a(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 0) {
         this.func_106008_a(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if(var5 == 2) {
         this.func_106008_a(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      }

   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = (var6 & 4) == 4;
      boolean var8 = (var6 & 8) == 8;
      if(var7 || var8) {
         this.func_106412_a(var1, var2, var3, var4, 0, var6, false, -1, 0);
      }

      if(var8) {
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         int var9 = var6 & 3;
         if(var9 == 3) {
            var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         } else if(var9 == 1) {
            var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         } else if(var9 == 0) {
            var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         } else if(var9 == 2) {
            var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         }
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return (var1.func_109357_g(var2, var3, var4) & 8) == 8;
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      if((var6 & 8) != 8) {
         return false;
      } else {
         int var7 = var6 & 3;
         return var7 == 2 && var5 == 2?true:(var7 == 0 && var5 == 3?true:(var7 == 1 && var5 == 4?true:var7 == 3 && var5 == 5));
      }
   }

   public boolean func_106028_i() {
      return true;
   }
}
