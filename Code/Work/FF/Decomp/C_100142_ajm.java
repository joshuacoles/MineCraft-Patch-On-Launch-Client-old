import java.util.Random;

public abstract class C_100142_ajm extends C_100451_alf {

   protected C_100142_ajm(int var1, C_100664_afg var2) {
      super(var1, (var2 == C_100664_afg.field_109020_i?14:12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      this.func_106008_a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.func_105972_b(true);
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return this.field_106204_cB != C_100664_afg.field_109020_i;
   }

   public int func_106039_o() {
      return 16777215;
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      if(this.field_106204_cB != C_100664_afg.field_109019_h) {
         return 16777215;
      } else {
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;

         for(int var8 = -1; var8 <= 1; ++var8) {
            for(int var9 = -1; var9 <= 1; ++var9) {
               int var10 = var1.func_109362_a(var2 + var9, var4 + var8).field_112480_H;
               var5 += (var10 & 16711680) >> 16;
               var6 += (var10 & '\uff00') >> 8;
               var7 += var10 & 255;
            }
         }

         return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
      }
   }

   public static float func_106269_d(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      return (float)(var0 + 1) / 9.0F;
   }

   public int func_106024_a(int var1) {
      return var1 != 0 && var1 != 1?this.field_106165_cl + 1:this.field_106165_cl;
   }

   protected int func_106268_f_(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109350_f(var2, var3, var4) == this.field_106204_cB?var1.func_109357_g(var2, var3, var4):-1;
   }

   protected int func_106271_d(C_100837_xo var1, int var2, int var3, int var4) {
      if(var1.func_109350_f(var2, var3, var4) != this.field_106204_cB) {
         return -1;
      } else {
         int var5 = var1.func_109357_g(var2, var3, var4);
         if(var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_106010_a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean func_106061_a_(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      C_100664_afg var6 = var1.func_109350_f(var2, var3, var4);
      return var6 == this.field_106204_cB?false:(var5 == 1?true:(var6 == C_100664_afg.field_109022_v?false:super.func_106061_a_(var1, var2, var3, var4, var5)));
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      C_100664_afg var6 = var1.func_109350_f(var2, var3, var4);
      return var6 == this.field_106204_cB?false:(var5 == 1?true:(var6 == C_100664_afg.field_109022_v?false:super.func_105976_a(var1, var2, var3, var4, var5)));
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public int func_106013_d() {
      return 4;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return 0;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   private C_100387_amw func_106270_g(C_100837_xo var1, int var2, int var3, int var4) {
      C_100387_amw var5 = var1.func_109363_R().func_107878_a(0.0D, 0.0D, 0.0D);
      int var6 = this.func_106271_d(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if(var7 == 0) {
            var8 = var2 - 1;
         }

         if(var7 == 1) {
            var10 = var4 - 1;
         }

         if(var7 == 2) {
            ++var8;
         }

         if(var7 == 3) {
            ++var10;
         }

         int var11 = this.func_106271_d(var1, var8, var3, var10);
         int var12;
         if(var11 < 0) {
            if(!var1.func_109350_f(var8, var3, var10).func_108992_c()) {
               var11 = this.func_106271_d(var1, var8, var3 - 1, var10);
               if(var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.func_107856_c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if(var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.func_107856_c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if(var1.func_109357_g(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if(var13 || this.func_106061_a_(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.func_106061_a_(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if(var13) {
            var5 = var5.func_107865_a().func_107856_c(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.func_107865_a();
      return var5;
   }

   public void func_106051_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5, C_100387_amw var6) {
      C_100387_amw var7 = this.func_106270_g(var1, var2, var3, var4);
      var6.field_107872_c += var7.field_107872_c;
      var6.field_107869_d += var7.field_107869_d;
      var6.field_107870_e += var7.field_107870_e;
   }

   public int func_106000_r_() {
      return this.field_106204_cB == C_100664_afg.field_109019_h?5:(this.field_106204_cB == C_100664_afg.field_109020_i?30:0);
   }

   public int func_106050_e(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109355_i(var2, var3, var4, 0);
      int var6 = var1.func_109355_i(var2, var3 + 1, var4, 0);
      int var7 = var5 & 255;
      int var8 = var6 & 255;
      int var9 = var5 >> 16 & 255;
      int var10 = var6 >> 16 & 255;
      return (var7 > var8?var7:var8) | (var9 > var10?var9:var10) << 16;
   }

   public float func_106052_f(C_100837_xo var1, int var2, int var3, int var4) {
      float var5 = var1.func_109354_o(var2, var3, var4);
      float var6 = var1.func_109354_o(var2, var3 + 1, var4);
      return var5 > var6?var5:var6;
   }

   public int func_106055_n() {
      return this.field_106204_cB == C_100664_afg.field_109019_h?1:0;
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6;
      if(this.field_106204_cB == C_100664_afg.field_109019_h) {
         if(var5.nextInt(10) == 0) {
            var6 = var1.func_109357_g(var2, var3, var4);
            if(var6 <= 0 || var6 >= 8) {
               var1.func_109428_a("suspended", (double)((float)var2 + var5.nextFloat()), (double)((float)var3 + var5.nextFloat()), (double)((float)var4 + var5.nextFloat()), 0.0D, 0.0D, 0.0D);
            }
         }

         for(var6 = 0; var6 < 0; ++var6) {
            int var7 = var5.nextInt(4);
            int var8 = var2;
            int var9 = var4;
            if(var7 == 0) {
               var8 = var2 - 1;
            }

            if(var7 == 1) {
               ++var8;
            }

            if(var7 == 2) {
               var9 = var4 - 1;
            }

            if(var7 == 3) {
               ++var9;
            }

            if(var1.func_109350_f(var8, var3, var9) == C_100664_afg.field_109012_a && (var1.func_109350_f(var8, var3 - 1, var9).func_108992_c() || var1.func_109350_f(var8, var3 - 1, var9).func_108986_d())) {
               float var10 = 0.0625F;
               double var11 = (double)((float)var2 + var5.nextFloat());
               double var13 = (double)((float)var3 + var5.nextFloat());
               double var15 = (double)((float)var4 + var5.nextFloat());
               if(var7 == 0) {
                  var11 = (double)((float)var2 - var10);
               }

               if(var7 == 1) {
                  var11 = (double)((float)(var2 + 1) + var10);
               }

               if(var7 == 2) {
                  var15 = (double)((float)var4 - var10);
               }

               if(var7 == 3) {
                  var15 = (double)((float)(var4 + 1) + var10);
               }

               double var17 = 0.0D;
               double var19 = 0.0D;
               if(var7 == 0) {
                  var17 = (double)(-var10);
               }

               if(var7 == 1) {
                  var17 = (double)var10;
               }

               if(var7 == 2) {
                  var19 = (double)(-var10);
               }

               if(var7 == 3) {
                  var19 = (double)var10;
               }

               var1.func_109428_a("splash", var11, var13, var15, var17, 0.0D, var19);
            }
         }
      }

      if(this.field_106204_cB == C_100664_afg.field_109019_h && var5.nextInt(64) == 0) {
         var6 = var1.func_109357_g(var2, var3, var4);
         if(var6 > 0 && var6 < 8) {
            var1.func_109541_b((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      double var21;
      double var23;
      double var22;
      if(this.field_106204_cB == C_100664_afg.field_109020_i && var1.func_109350_f(var2, var3 + 1, var4) == C_100664_afg.field_109012_a && !var1.func_109356_r(var2, var3 + 1, var4)) {
         if(var5.nextInt(100) == 0) {
            var21 = (double)((float)var2 + var5.nextFloat());
            var22 = (double)var3 + this.field_106152_cx;
            var23 = (double)((float)var4 + var5.nextFloat());
            var1.func_109428_a("lava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
            var1.func_109541_b(var21, var22, var23, "liquid.lavapop", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F);
         }

         if(var5.nextInt(200) == 0) {
            var1.func_109541_b((double)var2, (double)var3, (double)var4, "liquid.lava", 0.2F + var5.nextFloat() * 0.2F, 0.9F + var5.nextFloat() * 0.15F);
         }
      }

      if(var5.nextInt(10) == 0 && var1.func_109348_t(var2, var3 - 1, var4) && !var1.func_109350_f(var2, var3 - 2, var4).func_108992_c()) {
         var21 = (double)((float)var2 + var5.nextFloat());
         var22 = (double)var3 - 1.05D;
         var23 = (double)((float)var4 + var5.nextFloat());
         if(this.field_106204_cB == C_100664_afg.field_109019_h) {
            var1.func_109428_a("dripWater", var21, var22, var23, 0.0D, 0.0D, 0.0D);
         } else {
            var1.func_109428_a("dripLava", var21, var22, var23, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public static double func_106273_a(C_100837_xo var0, int var1, int var2, int var3, C_100664_afg var4) {
      C_100387_amw var5 = null;
      if(var4 == C_100664_afg.field_109019_h) {
         var5 = ((C_100142_ajm)C_100451_alf.field_106071_D).func_106270_g(var0, var1, var2, var3);
      }

      if(var4 == C_100664_afg.field_109020_i) {
         var5 = ((C_100142_ajm)C_100451_alf.field_106073_F).func_106270_g(var0, var1, var2, var3);
      }

      return var5.field_107872_c == 0.0D && var5.field_107870_e == 0.0D?-1000.0D:Math.atan2(var5.field_107870_e, var5.field_107872_c) - 1.5707963267948966D;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106272_l(var1, var2, var3, var4);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this.func_106272_l(var1, var2, var3, var4);
   }

   private void func_106272_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
         if(this.field_106204_cB == C_100664_afg.field_109020_i) {
            boolean var5 = false;
            if(var5 || var1.func_109350_f(var2, var3, var4 - 1) == C_100664_afg.field_109019_h) {
               var5 = true;
            }

            if(var5 || var1.func_109350_f(var2, var3, var4 + 1) == C_100664_afg.field_109019_h) {
               var5 = true;
            }

            if(var5 || var1.func_109350_f(var2 - 1, var3, var4) == C_100664_afg.field_109019_h) {
               var5 = true;
            }

            if(var5 || var1.func_109350_f(var2 + 1, var3, var4) == C_100664_afg.field_109019_h) {
               var5 = true;
            }

            if(var5 || var1.func_109350_f(var2, var3 + 1, var4) == C_100664_afg.field_109019_h) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.func_109357_g(var2, var3, var4);
               if(var6 == 0) {
                  var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106210_as.field_106162_cm);
               } else if(var6 <= 4) {
                  var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106119_z.field_106162_cm);
               }

               this.func_106274_j(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void func_106274_j(C_100873_xe var1, int var2, int var3, int var4) {
      var1.func_109476_a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.field_109577_u.nextFloat() - var1.field_109577_u.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.func_109428_a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
