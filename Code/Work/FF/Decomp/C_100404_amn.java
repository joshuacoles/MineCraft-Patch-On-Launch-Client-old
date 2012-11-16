import java.util.List;

public class C_100404_amn extends C_100451_alf {

   private boolean field_106402_a;


   public C_100404_amn(int var1, int var2, boolean var3) {
      super(var1, var2, C_100664_afg.field_108996_F);
      this.field_106402_a = var3;
      this.func_106014_a(field_106109_h);
      this.func_106006_c(0.5F);
      this.func_106034_a(C_101040_sq.field_111415_d);
   }

   public int func_106394_p() {
      return this.field_106402_a?106:107;
   }

   public int func_106029_a(int var1, int var2) {
      int var3 = func_106401_e(var2);
      return var3 > 5?this.field_106165_cl:(var1 == var3?(!func_106398_f(var2) && this.field_106156_ct <= 0.0D && this.field_106155_cu <= 0.0D && this.field_106154_cv <= 0.0D && this.field_106153_cw >= 1.0D && this.field_106152_cx >= 1.0D && this.field_106151_cy >= 1.0D?this.field_106165_cl:110):(var1 == C_100012_j.field_105266_a[var3]?109:108));
   }

   public int func_106013_d() {
      return 16;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = func_106400_b(var1, var2, var3, var4, (C_101095_qg)var5);
      var1.func_109488_c(var2, var3, var4, var6);
      if(!var1.field_109557_J) {
         this.func_106397_l(var1, var2, var3, var4);
      }

   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         this.func_106397_l(var1, var2, var3, var4);
      }

   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J && var1.func_109353_p(var2, var3, var4) == null) {
         this.func_106397_l(var1, var2, var3, var4);
      }

   }

   private void func_106397_l(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      int var6 = func_106401_e(var5);
      if(var6 != 7) {
         boolean var7 = this.func_106399_d(var1, var2, var3, var4, var6);
         if(var7 && !func_106398_f(var5)) {
            if(func_106396_h(var1, var2, var3, var4, var6)) {
               var1.func_109467_c(var2, var3, var4, this.field_106162_cm, 0, var6);
            }
         } else if(!var7 && func_106398_f(var5)) {
            var1.func_109467_c(var2, var3, var4, this.field_106162_cm, 1, var6);
         }

      }
   }

   private boolean func_106399_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var1.func_109437_l(var2, var3 - 1, var4, 0)?true:(var5 != 1 && var1.func_109437_l(var2, var3 + 1, var4, 1)?true:(var5 != 2 && var1.func_109437_l(var2, var3, var4 - 1, 2)?true:(var5 != 3 && var1.func_109437_l(var2, var3, var4 + 1, 3)?true:(var5 != 5 && var1.func_109437_l(var2 + 1, var3, var4, 5)?true:(var5 != 4 && var1.func_109437_l(var2 - 1, var3, var4, 4)?true:(var1.func_109437_l(var2, var3, var4, 0)?true:(var1.func_109437_l(var2, var3 + 2, var4, 1)?true:(var1.func_109437_l(var2, var3 + 1, var4 - 1, 2)?true:(var1.func_109437_l(var2, var3 + 1, var4 + 1, 3)?true:(var1.func_109437_l(var2 - 1, var3 + 1, var4, 4)?true:var1.func_109437_l(var2 + 1, var3 + 1, var4, 5)))))))))));
   }

   public void func_105980_b(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 == 0) {
         var1.func_109441_d(var2, var3, var4, var6 | 8);
      } else {
         var1.func_109441_d(var2, var3, var4, var6);
      }

      if(var5 == 0) {
         if(this.func_106395_i(var1, var2, var3, var4, var6)) {
            var1.func_109488_c(var2, var3, var4, var6 | 8);
            var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.out", 0.5F, var1.field_109577_u.nextFloat() * 0.25F + 0.6F);
         } else {
            var1.func_109441_d(var2, var3, var4, var6);
         }
      } else if(var5 == 1) {
         C_100398_amm var7 = var1.func_109353_p(var2 + C_100012_j.field_105264_b[var6], var3 + C_100012_j.field_105265_c[var6], var4 + C_100012_j.field_105262_d[var6]);
         if(var7 instanceof C_100406_amq) {
            ((C_100406_amq)var7).func_102947_f();
         }

         var1.func_109526_c(var2, var3, var4, C_100451_alf.field_106254_af.field_106162_cm, var6);
         var1.func_109543_a(var2, var3, var4, C_100408_amp.func_106346_a(this.field_106162_cm, var6, var6, false, true));
         if(this.field_106402_a) {
            int var8 = var2 + C_100012_j.field_105264_b[var6] * 2;
            int var9 = var3 + C_100012_j.field_105265_c[var6] * 2;
            int var10 = var4 + C_100012_j.field_105262_d[var6] * 2;
            int var11 = var1.func_109349_a(var8, var9, var10);
            int var12 = var1.func_109357_g(var8, var9, var10);
            boolean var13 = false;
            if(var11 == C_100451_alf.field_106254_af.field_106162_cm) {
               C_100398_amm var14 = var1.func_109353_p(var8, var9, var10);
               if(var14 instanceof C_100406_amq) {
                  C_100406_amq var15 = (C_100406_amq)var14;
                  if(var15.func_102945_c() == var6 && var15.func_102950_b()) {
                     var15.func_102947_f();
                     var11 = var15.func_102949_a();
                     var12 = var15.func_102919_p();
                     var13 = true;
                  }
               }
            }

            if(!var13 && var11 > 0 && func_106393_a(var11, var1, var8, var9, var10, false) && (C_100451_alf.field_106118_p[var11].func_106058_q_() == 0 || var11 == C_100451_alf.field_106240_ac.field_106162_cm || var11 == C_100451_alf.field_106094_Y.field_106162_cm)) {
               var2 += C_100012_j.field_105264_b[var6];
               var3 += C_100012_j.field_105265_c[var6];
               var4 += C_100012_j.field_105262_d[var6];
               var1.func_109526_c(var2, var3, var4, C_100451_alf.field_106254_af.field_106162_cm, var12);
               var1.func_109543_a(var2, var3, var4, C_100408_amp.func_106346_a(var11, var12, var6, false, false));
               var1.func_109422_e(var8, var9, var10, 0);
            } else if(!var13) {
               var1.func_109422_e(var2 + C_100012_j.field_105264_b[var6], var3 + C_100012_j.field_105265_c[var6], var4 + C_100012_j.field_105262_d[var6], 0);
            }
         } else {
            var1.func_109422_e(var2 + C_100012_j.field_105264_b[var6], var3 + C_100012_j.field_105265_c[var6], var4 + C_100012_j.field_105262_d[var6], 0);
         }

         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.in", 0.5F, var1.field_109577_u.nextFloat() * 0.15F + 0.6F);
      }

   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      if(func_106398_f(var5)) {
         switch(func_106401_e(var5)) {
         case 0:
            this.func_106008_a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 1:
            this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
            break;
         case 2:
            this.func_106008_a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
            break;
         case 4:
            this.func_106008_a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.func_106008_a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }
      } else {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void func_106059_f() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106021_e(var1, var2, var3, var4);
   }

   public boolean func_105977_b() {
      return false;
   }

   public static int func_106401_e(int var0) {
      return var0 & 7;
   }

   public static boolean func_106398_f(int var0) {
      return (var0 & 8) != 0;
   }

   public static int func_106400_b(C_100873_xe var0, int var1, int var2, int var3, C_101095_qg var4) {
      if(C_100650_jv.func_108927_e((float)var4.field_103221_t - (float)var1) < 2.0F && C_100650_jv.func_108927_e((float)var4.field_103217_v - (float)var3) < 2.0F) {
         double var5 = var4.field_103219_u + 1.82D - (double)var4.field_103181_M;
         if(var5 - (double)var2 > 2.0D) {
            return 1;
         }

         if((double)var2 - var5 > 0.0D) {
            return 0;
         }
      }

      int var7 = C_100650_jv.func_108910_c((double)(var4.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
      return var7 == 0?2:(var7 == 1?5:(var7 == 2?3:(var7 == 3?4:0)));
   }

   private static boolean func_106393_a(int var0, C_100873_xe var1, int var2, int var3, int var4, boolean var5) {
      if(var0 == C_100451_alf.field_106210_as.field_106162_cm) {
         return false;
      } else {
         if(var0 != C_100451_alf.field_106240_ac.field_106162_cm && var0 != C_100451_alf.field_106094_Y.field_106162_cm) {
            if(C_100451_alf.field_106118_p[var0].func_106018_m(var1, var2, var3, var4) == -1.0F) {
               return false;
            }

            if(C_100451_alf.field_106118_p[var0].func_106058_q_() == 2) {
               return false;
            }

            if(!var5 && C_100451_alf.field_106118_p[var0].func_106058_q_() == 1) {
               return false;
            }
         } else if(func_106398_f(var1.func_109357_g(var2, var3, var4))) {
            return false;
         }

         return !(C_100451_alf.field_106118_p[var0] instanceof C_100200_aiq);
      }
   }

   private static boolean func_106396_h(C_100873_xe var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 + C_100012_j.field_105264_b[var4];
      int var6 = var2 + C_100012_j.field_105265_c[var4];
      int var7 = var3 + C_100012_j.field_105262_d[var4];
      int var8 = 0;

      while(true) {
         if(var8 < 13) {
            if(var6 <= 0 || var6 >= 255) {
               return false;
            }

            int var9 = var0.func_109349_a(var5, var6, var7);
            if(var9 != 0) {
               if(!func_106393_a(var9, var0, var5, var6, var7, true)) {
                  return false;
               }

               if(C_100451_alf.field_106118_p[var9].func_106058_q_() != 1) {
                  if(var8 == 12) {
                     return false;
                  }

                  var5 += C_100012_j.field_105264_b[var4];
                  var6 += C_100012_j.field_105265_c[var4];
                  var7 += C_100012_j.field_105262_d[var4];
                  ++var8;
                  continue;
               }
            }
         }

         return true;
      }
   }

   private boolean func_106395_i(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 + C_100012_j.field_105264_b[var5];
      int var7 = var3 + C_100012_j.field_105265_c[var5];
      int var8 = var4 + C_100012_j.field_105262_d[var5];
      int var9 = 0;

      while(true) {
         int var10;
         if(var9 < 13) {
            if(var7 <= 0 || var7 >= 255) {
               return false;
            }

            var10 = var1.func_109349_a(var6, var7, var8);
            if(var10 != 0) {
               if(!func_106393_a(var10, var1, var6, var7, var8, true)) {
                  return false;
               }

               if(C_100451_alf.field_106118_p[var10].func_106058_q_() != 1) {
                  if(var9 == 12) {
                     return false;
                  }

                  var6 += C_100012_j.field_105264_b[var5];
                  var7 += C_100012_j.field_105265_c[var5];
                  var8 += C_100012_j.field_105262_d[var5];
                  ++var9;
                  continue;
               }

               C_100451_alf.field_106118_p[var10].func_106035_c(var1, var6, var7, var8, var1.func_109357_g(var6, var7, var8), 0);
               var1.func_109422_e(var6, var7, var8, 0);
            }
         }

         while(var6 != var2 || var7 != var3 || var8 != var4) {
            var9 = var6 - C_100012_j.field_105264_b[var5];
            var10 = var7 - C_100012_j.field_105265_c[var5];
            int var11 = var8 - C_100012_j.field_105262_d[var5];
            int var12 = var1.func_109349_a(var9, var10, var11);
            int var13 = var1.func_109357_g(var9, var10, var11);
            if(var12 == this.field_106162_cm && var9 == var2 && var10 == var3 && var11 == var4) {
               var1.func_109497_a(var6, var7, var8, C_100451_alf.field_106254_af.field_106162_cm, var5 | (this.field_106402_a?8:0), false);
               var1.func_109543_a(var6, var7, var8, C_100408_amp.func_106346_a(C_100451_alf.field_106242_ad.field_106162_cm, var5 | (this.field_106402_a?8:0), var5, true, false));
            } else {
               var1.func_109497_a(var6, var7, var8, C_100451_alf.field_106254_af.field_106162_cm, var13, false);
               var1.func_109543_a(var6, var7, var8, C_100408_amp.func_106346_a(var12, var13, var5, true, false));
            }

            var6 = var9;
            var7 = var10;
            var8 = var11;
         }

         return true;
      }
   }
}
