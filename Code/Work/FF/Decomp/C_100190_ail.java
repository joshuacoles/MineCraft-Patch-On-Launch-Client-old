import java.util.Random;

public class C_100190_ail extends C_100200_aiq {

   public static final C_100444_az field_106333_a = new C_100455_ar(new C_100457_aq());
   private Random field_106332_b = new Random();


   protected C_100190_ail(int var1) {
      super(var1, C_100664_afg.field_109009_e);
      this.field_106165_cl = 45;
      this.func_106034_a(C_101040_sq.field_111415_d);
   }

   public int func_106000_r_() {
      return 4;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106092_S.field_106162_cm;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      this.func_106330_l(var1, var2, var3, var4);
   }

   private void func_106330_l(C_100873_xe var1, int var2, int var3, int var4) {
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
         return var5 == var6?this.field_106165_cl + 1:this.field_106165_cl;
      }
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl + 17:(var1 == 0?this.field_106165_cl + 17:(var1 == 3?this.field_106165_cl + 1:this.field_106165_cl));
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         C_100420_amd var10 = (C_100420_amd)var1.func_109353_p(var2, var3, var4);
         if(var10 != null) {
            var5.func_103778_a(var10);
         }

         return true;
      }
   }

   private void func_106329_n(C_100873_xe var1, int var2, int var3, int var4) {
      C_100473_ap var5 = new C_100473_ap(var1, var2, var3, var4);
      C_100420_amd var6 = (C_100420_amd)var5.func_107934_j();
      if(var6 != null) {
         int var7 = var6.func_103011_i();
         if(var7 < 0) {
            var1.func_109448_f(1001, var2, var3, var4, 0);
         } else {
            C_100994_tv var8 = var6.func_103007_a(var7);
            C_100453_as var9 = (C_100453_as)field_106333_a.func_107926_a(var8.func_111365_b());
            if(var9 != C_100453_as.field_105945_a) {
               C_100994_tv var10 = var9.func_105944_a(var5, var8);
               var6.func_103006_a(var7, var10.field_111398_a == 0?null:var10);
            }
         }

      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && C_100451_alf.field_106118_p[var5].func_106028_i()) {
         boolean var6 = var1.func_109425_z(var2, var3, var4) || var1.func_109425_z(var2, var3 + 1, var4);
         if(var6) {
            var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
         }
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J && (var1.func_109425_z(var2, var3, var4) || var1.func_109425_z(var2, var3 + 1, var4))) {
         this.func_106329_n(var1, var2, var3, var4);
      }

   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100420_amd();
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
      C_100420_amd var7 = (C_100420_amd)var1.func_109353_p(var2, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.func_103003_k_(); ++var8) {
            C_100994_tv var9 = var7.func_103007_a(var8);
            if(var9 != null) {
               float var10 = this.field_106332_b.nextFloat() * 0.8F + 0.1F;
               float var11 = this.field_106332_b.nextFloat() * 0.8F + 0.1F;
               float var12 = this.field_106332_b.nextFloat() * 0.8F + 0.1F;

               while(var9.field_111398_a > 0) {
                  int var13 = this.field_106332_b.nextInt(21) + 10;
                  if(var13 > var9.field_111398_a) {
                     var13 = var9.field_111398_a;
                  }

                  var9.field_111398_a -= var13;
                  C_100576_pg var14 = new C_100576_pg(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new C_100994_tv(var9.field_111397_c, var13, var9.func_111367_j()));
                  if(var9.func_111339_o()) {
                     var14.field_103279_a.func_111349_d((C_100353_bh)var9.func_111352_p().func_107485_b());
                  }

                  float var15 = 0.05F;
                  var14.field_103215_w = (double)((float)this.field_106332_b.nextGaussian() * var15);
                  var14.field_103240_x = (double)((float)this.field_106332_b.nextGaussian() * var15 + 0.2F);
                  var14.field_103238_y = (double)((float)this.field_106332_b.nextGaussian() * var15);
                  var1.func_109513_d(var14);
               }
            }
         }
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public static C_100459_ax func_106331_a(C_100471_ao var0) {
      C_100462_au var1 = C_100462_au.func_107949_a(var0.func_107935_h());
      double var2 = var0.func_107930_a() + 0.6D * (double)var1.func_107948_c();
      double var4 = var0.func_107932_b();
      double var6 = var0.func_107931_c() + 0.6D * (double)var1.func_107947_e();
      return new C_100446_ay(var2, var4, var6);
   }

}
