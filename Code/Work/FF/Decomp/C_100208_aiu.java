import java.util.Random;

public class C_100208_aiu extends C_100451_alf {

   private int[] field_106363_a = new int[256];
   private int[] field_106362_b = new int[256];


   protected C_100208_aiu(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109014_o);
      this.func_105972_b(true);
   }

   public void func_105973_t_() {
      this.func_106358_a(C_100451_alf.field_106075_A.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106233_bQ.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106213_bR.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106147_bc.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106218_aw.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106123_ca.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106202_bZ.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106122_cb.field_106162_cm, 5, 20);
      this.func_106358_a(C_100451_alf.field_106079_M.field_106162_cm, 5, 5);
      this.func_106358_a(C_100451_alf.field_106080_N.field_106162_cm, 30, 60);
      this.func_106358_a(C_100451_alf.field_106214_aq.field_106162_cm, 30, 20);
      this.func_106358_a(C_100451_alf.field_106234_ap.field_106162_cm, 15, 100);
      this.func_106358_a(C_100451_alf.field_106244_aa.field_106162_cm, 60, 100);
      this.func_106358_a(C_100451_alf.field_106252_ae.field_106162_cm, 30, 60);
      this.func_106358_a(C_100451_alf.field_106128_bx.field_106162_cm, 15, 100);
   }

   private void func_106358_a(int var1, int var2, int var3) {
      this.field_106363_a[var1] = var2;
      this.field_106362_b[var1] = var3;
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
      return 3;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public int func_106000_r_() {
      return 30;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var1.func_109389_K().func_110281_b("doFireTick")) {
         boolean var6 = var1.func_109349_a(var2, var3 - 1, var4) == C_100451_alf.field_106149_be.field_106162_cm;
         if(var1.field_109576_v instanceof C_101291_zu && var1.func_109349_a(var2, var3 - 1, var4) == C_100451_alf.field_106077_C.field_106162_cm) {
            var6 = true;
         }

         if(!this.func_106023_b(var1, var2, var3, var4)) {
            var1.func_109422_e(var2, var3, var4, 0);
         }

         if(!var6 && var1.func_109531_M() && (var1.func_109515_B(var2, var3, var4) || var1.func_109515_B(var2 - 1, var3, var4) || var1.func_109515_B(var2 + 1, var3, var4) || var1.func_109515_B(var2, var3, var4 - 1) || var1.func_109515_B(var2, var3, var4 + 1))) {
            var1.func_109422_e(var2, var3, var4, 0);
         } else {
            int var7 = var1.func_109357_g(var2, var3, var4);
            if(var7 < 15) {
               var1.func_109441_d(var2, var3, var4, var7 + var5.nextInt(3) / 2);
            }

            var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_() + var5.nextInt(10));
            if(!var6 && !this.func_106359_l(var1, var2, var3, var4)) {
               if(!var1.func_109348_t(var2, var3 - 1, var4) || var7 > 3) {
                  var1.func_109422_e(var2, var3, var4, 0);
               }

            } else if(!var6 && !this.func_106356_d(var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
               var1.func_109422_e(var2, var3, var4, 0);
            } else {
               boolean var8 = var1.func_109524_C(var2, var3, var4);
               byte var9 = 0;
               if(var8) {
                  var9 = -50;
               }

               this.func_106361_a(var1, var2 + 1, var3, var4, 300 + var9, var5, var7);
               this.func_106361_a(var1, var2 - 1, var3, var4, 300 + var9, var5, var7);
               this.func_106361_a(var1, var2, var3 - 1, var4, 250 + var9, var5, var7);
               this.func_106361_a(var1, var2, var3 + 1, var4, 250 + var9, var5, var7);
               this.func_106361_a(var1, var2, var3, var4 - 1, 300 + var9, var5, var7);
               this.func_106361_a(var1, var2, var3, var4 + 1, 300 + var9, var5, var7);

               for(int var10 = var2 - 1; var10 <= var2 + 1; ++var10) {
                  for(int var11 = var4 - 1; var11 <= var4 + 1; ++var11) {
                     for(int var12 = var3 - 1; var12 <= var3 + 4; ++var12) {
                        if(var10 != var2 || var12 != var3 || var11 != var4) {
                           int var13 = 100;
                           if(var12 > var3 + 1) {
                              var13 += (var12 - (var3 + 1)) * 100;
                           }

                           int var14 = this.func_106360_n(var1, var10, var12, var11);
                           if(var14 > 0) {
                              int var15 = (var14 + 40 + var1.field_109578_t * 7) / (var7 + 30);
                              if(var8) {
                                 var15 /= 2;
                              }

                              if(var15 > 0 && var5.nextInt(var13) <= var15 && (!var1.func_109531_M() || !var1.func_109515_B(var10, var12, var11)) && !var1.func_109515_B(var10 - 1, var12, var4) && !var1.func_109515_B(var10 + 1, var12, var11) && !var1.func_109515_B(var10, var12, var11 - 1) && !var1.func_109515_B(var10, var12, var11 + 1)) {
                                 int var16 = var7 + var5.nextInt(5) / 4;
                                 if(var16 > 15) {
                                    var16 = 15;
                                 }

                                 var1.func_109394_d(var10, var12, var11, this.field_106162_cm, var16);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public boolean func_106067_l() {
      return false;
   }

   private void func_106361_a(C_100873_xe var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      int var8 = this.field_106362_b[var1.func_109349_a(var2, var3, var4)];
      if(var6.nextInt(var5) < var8) {
         boolean var9 = var1.func_109349_a(var2, var3, var4) == C_100451_alf.field_106234_ap.field_106162_cm;
         if(var6.nextInt(var7 + 10) < 5 && !var1.func_109515_B(var2, var3, var4)) {
            int var10 = var7 + var6.nextInt(5) / 4;
            if(var10 > 15) {
               var10 = 15;
            }

            var1.func_109394_d(var2, var3, var4, this.field_106162_cm, var10);
         } else {
            var1.func_109422_e(var2, var3, var4, 0);
         }

         if(var9) {
            C_100451_alf.field_106234_ap.func_106020_c(var1, var2, var3, var4, 1);
         }
      }

   }

   private boolean func_106359_l(C_100873_xe var1, int var2, int var3, int var4) {
      return this.func_106356_d(var1, var2 + 1, var3, var4)?true:(this.func_106356_d(var1, var2 - 1, var3, var4)?true:(this.func_106356_d(var1, var2, var3 - 1, var4)?true:(this.func_106356_d(var1, var2, var3 + 1, var4)?true:(this.func_106356_d(var1, var2, var3, var4 - 1)?true:this.func_106356_d(var1, var2, var3, var4 + 1)))));
   }

   private int func_106360_n(C_100873_xe var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if(!var1.func_109352_c(var2, var3, var4)) {
         return 0;
      } else {
         int var6 = this.func_106357_d(var1, var2 + 1, var3, var4, var5);
         var6 = this.func_106357_d(var1, var2 - 1, var3, var4, var6);
         var6 = this.func_106357_d(var1, var2, var3 - 1, var4, var6);
         var6 = this.func_106357_d(var1, var2, var3 + 1, var4, var6);
         var6 = this.func_106357_d(var1, var2, var3, var4 - 1, var6);
         var6 = this.func_106357_d(var1, var2, var3, var4 + 1, var6);
         return var6;
      }
   }

   public boolean func_106049_m() {
      return false;
   }

   public boolean func_106356_d(C_100837_xo var1, int var2, int var3, int var4) {
      return this.field_106363_a[var1.func_109349_a(var2, var3, var4)] > 0;
   }

   public int func_106357_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = this.field_106363_a[var1.func_109349_a(var2, var3, var4)];
      return var6 > var5?var6:var5;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109348_t(var2, var3 - 1, var4) || this.func_106359_l(var1, var2, var3, var4);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.func_109348_t(var2, var3 - 1, var4) && !this.func_106359_l(var1, var2, var3, var4)) {
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.field_109576_v.field_112401_h > 0 || var1.func_109349_a(var2, var3 - 1, var4) != C_100451_alf.field_106210_as.field_106162_cm || !C_100451_alf.field_106143_bh.func_106288_i_(var1, var2, var3, var4)) {
         if(!var1.func_109348_t(var2, var3 - 1, var4) && !this.func_106359_l(var1, var2, var3, var4)) {
            var1.func_109422_e(var2, var3, var4, 0);
         } else {
            var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_() + var1.field_109577_u.nextInt(10));
         }
      }
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(24) == 0) {
         var1.func_109541_b((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
      }

      int var6;
      float var7;
      float var8;
      float var9;
      if(!var1.func_109348_t(var2, var3 - 1, var4) && !C_100451_alf.field_106222_au.func_106356_d(var1, var2, var3 - 1, var4)) {
         if(C_100451_alf.field_106222_au.func_106356_d(var1, var2 - 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.func_109428_a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(C_100451_alf.field_106222_au.func_106356_d(var1, var2 + 1, var3, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)(var2 + 1) - var5.nextFloat() * 0.1F;
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat();
               var1.func_109428_a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(C_100451_alf.field_106222_au.func_106356_d(var1, var2, var3, var4 - 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)var4 + var5.nextFloat() * 0.1F;
               var1.func_109428_a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(C_100451_alf.field_106222_au.func_106356_d(var1, var2, var3, var4 + 1)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)var3 + var5.nextFloat();
               var9 = (float)(var4 + 1) - var5.nextFloat() * 0.1F;
               var1.func_109428_a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }

         if(C_100451_alf.field_106222_au.func_106356_d(var1, var2, var3 + 1, var4)) {
            for(var6 = 0; var6 < 2; ++var6) {
               var7 = (float)var2 + var5.nextFloat();
               var8 = (float)(var3 + 1) - var5.nextFloat() * 0.1F;
               var9 = (float)var4 + var5.nextFloat();
               var1.func_109428_a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
            }
         }
      } else {
         for(var6 = 0; var6 < 3; ++var6) {
            var7 = (float)var2 + var5.nextFloat();
            var8 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
            var9 = (float)var4 + var5.nextFloat();
            var1.func_109428_a("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
         }
      }

   }
}
