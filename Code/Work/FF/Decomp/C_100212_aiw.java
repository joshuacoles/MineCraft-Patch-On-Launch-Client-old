import java.util.Random;

public class C_100212_aiw extends C_100200_aiq {

   private Random field_106338_a = new Random();
   private final boolean field_106336_b;
   private static boolean field_106337_c = false;


   protected C_100212_aiw(int var1, boolean var2) {
      super(var1, C_100664_afg.field_109009_e);
      this.field_106336_b = var2;
      this.field_106165_cl = 45;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106197_aE.field_106162_cm;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      this.func_106334_l(var1, var2, var3, var4);
   }

   private void func_106334_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J) {
         int var5 = var1.func_109349_a(var2, var3, var4 - 1);
         int var6 = var1.func_109349_a(var2, var3, var4 + 1);
         int var7 = var1.func_109349_a(var2 - 1, var3, var4);
         int var8 = var1.func_109349_a(var2 + 1, var3, var4);
         byte var9 = 3;
         if(C_100451_alf.field_106117_q[var5] && !C_100451_alf.field_106117_q[var6]) {
            var9 = 3;
         }

         if(C_100451_alf.field_106117_q[var6] && !C_100451_alf.field_106117_q[var5]) {
            var9 = 2;
         }

         if(C_100451_alf.field_106117_q[var7] && !C_100451_alf.field_106117_q[var8]) {
            var9 = 5;
         }

         if(C_100451_alf.field_106117_q[var8] && !C_100451_alf.field_106117_q[var7]) {
            var9 = 4;
         }

         var1.func_109488_c(var2, var3, var4, var9);
      }
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.field_106165_cl + 17;
      } else if(var5 == 0) {
         return this.field_106165_cl + 17;
      } else {
         int var6 = var1.func_109357_g(var2, var3, var4);
         return var5 != var6?this.field_106165_cl:(this.field_106336_b?this.field_106165_cl + 16:this.field_106165_cl - 1);
      }
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(this.field_106336_b) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         float var7 = (float)var2 + 0.5F;
         float var8 = (float)var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = (float)var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if(var6 == 4) {
            var1.func_109428_a("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.func_109428_a("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 5) {
            var1.func_109428_a("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.func_109428_a("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 2) {
            var1.func_109428_a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            var1.func_109428_a("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 3) {
            var1.func_109428_a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            var1.func_109428_a("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl + 17:(var1 == 0?this.field_106165_cl + 17:(var1 == 3?this.field_106165_cl - 1:this.field_106165_cl));
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         C_100419_amg var10 = (C_100419_amg)var1.func_109353_p(var2, var3, var4);
         if(var10 != null) {
            var5.func_103810_a(var10);
         }

         return true;
      }
   }

   public static void func_106335_a(boolean var0, C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      C_100398_amm var6 = var1.func_109353_p(var2, var3, var4);
      field_106337_c = true;
      if(var0) {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106198_aF.field_106162_cm);
      } else {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106197_aE.field_106162_cm);
      }

      field_106337_c = false;
      var1.func_109488_c(var2, var3, var4, var5);
      if(var6 != null) {
         var6.func_102929_s();
         var1.func_109543_a(var2, var3, var4, var6);
      }

   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100419_amg();
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
      if(var6 == 0) {
         var1.func_109488_c(var2, var3, var4, 2);
      }

      if(var6 == 1) {
         var1.func_109488_c(var2, var3, var4, 5);
      }

      if(var6 == 2) {
         var1.func_109488_c(var2, var3, var4, 3);
      }

      if(var6 == 3) {
         var1.func_109488_c(var2, var3, var4, 4);
      }

   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if(!field_106337_c) {
         C_100419_amg var7 = (C_100419_amg)var1.func_109353_p(var2, var3, var4);
         if(var7 != null) {
            for(int var8 = 0; var8 < var7.func_103003_k_(); ++var8) {
               C_100994_tv var9 = var7.func_103007_a(var8);
               if(var9 != null) {
                  float var10 = this.field_106338_a.nextFloat() * 0.8F + 0.1F;
                  float var11 = this.field_106338_a.nextFloat() * 0.8F + 0.1F;
                  float var12 = this.field_106338_a.nextFloat() * 0.8F + 0.1F;

                  while(var9.field_111398_a > 0) {
                     int var13 = this.field_106338_a.nextInt(21) + 10;
                     if(var13 > var9.field_111398_a) {
                        var13 = var9.field_111398_a;
                     }

                     var9.field_111398_a -= var13;
                     C_100576_pg var14 = new C_100576_pg(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new C_100994_tv(var9.field_111397_c, var13, var9.func_111367_j()));
                     if(var9.func_111339_o()) {
                        var14.field_103279_a.func_111349_d((C_100353_bh)var9.func_111352_p().func_107485_b());
                     }

                     float var15 = 0.05F;
                     var14.field_103215_w = (double)((float)this.field_106338_a.nextGaussian() * var15);
                     var14.field_103240_x = (double)((float)this.field_106338_a.nextGaussian() * var15 + 0.2F);
                     var14.field_103238_y = (double)((float)this.field_106338_a.nextGaussian() * var15);
                     var1.func_109513_d(var14);
                  }
               }
            }
         }
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

}
