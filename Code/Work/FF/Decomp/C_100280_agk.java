
public class C_100280_agk {

   private C_100837_xo field_107259_a;
   private C_100290_agh field_107257_b = new C_100290_agh();
   private C_100661_jq field_107258_c = new C_100661_jq();
   private C_100292_agi[] field_107255_d = new C_100292_agi[32];
   private boolean field_107256_e;
   private boolean field_107253_f;
   private boolean field_107254_g;
   private boolean field_107260_h;


   public C_100280_agk(C_100837_xo var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field_107259_a = var1;
      this.field_107256_e = var2;
      this.field_107253_f = var3;
      this.field_107254_g = var4;
      this.field_107260_h = var5;
   }

   public C_100278_agj func_107251_a(C_100730_lb var1, C_100730_lb var2, float var3) {
      return this.func_107252_a(var1, var2.field_103221_t, var2.field_103173_D.field_107915_b, var2.field_103217_v, var3);
   }

   public C_100278_agj func_107244_a(C_100730_lb var1, int var2, int var3, int var4, float var5) {
      return this.func_107252_a(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   private C_100278_agj func_107252_a(C_100730_lb var1, double var2, double var4, double var6, float var8) {
      this.field_107257_b.func_107330_a();
      this.field_107258_c.func_109044_c();
      boolean var9 = this.field_107254_g;
      int var10 = C_100650_jv.func_108910_c(var1.field_103173_D.field_107915_b + 0.5D);
      if(this.field_107260_h && var1.func_103144_H()) {
         var10 = (int)var1.field_103173_D.field_107915_b;

         for(int var11 = this.field_107259_a.func_109349_a(C_100650_jv.func_108910_c(var1.field_103221_t), var10, C_100650_jv.func_108910_c(var1.field_103217_v)); var11 == C_100451_alf.field_106071_D.field_106162_cm || var11 == C_100451_alf.field_106072_E.field_106162_cm; var11 = this.field_107259_a.func_109349_a(C_100650_jv.func_108910_c(var1.field_103221_t), var10, C_100650_jv.func_108910_c(var1.field_103217_v))) {
            ++var10;
         }

         var9 = this.field_107254_g;
         this.field_107254_g = false;
      } else {
         var10 = C_100650_jv.func_108910_c(var1.field_103173_D.field_107915_b + 0.5D);
      }

      C_100292_agi var15 = this.func_107245_a(C_100650_jv.func_108910_c(var1.field_103173_D.field_107917_a), var10, C_100650_jv.func_108910_c(var1.field_103173_D.field_107916_c));
      C_100292_agi var12 = this.func_107245_a(C_100650_jv.func_108910_c(var2 - (double)(var1.field_103182_N / 2.0F)), C_100650_jv.func_108910_c(var4), C_100650_jv.func_108910_c(var6 - (double)(var1.field_103182_N / 2.0F)));
      C_100292_agi var13 = new C_100292_agi(C_100650_jv.func_108933_d(var1.field_103182_N + 1.0F), C_100650_jv.func_108933_d(var1.field_103183_O + 1.0F), C_100650_jv.func_108933_d(var1.field_103182_N + 1.0F));
      C_100278_agj var14 = this.func_107249_a(var1, var15, var12, var13, var8);
      this.field_107254_g = var9;
      return var14;
   }

   private C_100278_agj func_107249_a(C_100730_lb var1, C_100292_agi var2, C_100292_agi var3, C_100292_agi var4, float var5) {
      var2.field_107343_e = 0.0F;
      var2.field_107340_f = var2.func_107338_b(var3);
      var2.field_107341_g = var2.field_107340_f;
      this.field_107257_b.func_107330_a();
      this.field_107257_b.func_107331_a(var2);
      C_100292_agi var6 = var2;

      while(!this.field_107257_b.func_107327_e()) {
         C_100292_agi var7 = this.field_107257_b.func_107333_c();
         if(var7.equals(var3)) {
            return this.func_107248_a(var2, var3);
         }

         if(var7.func_107338_b(var3) < var6.func_107338_b(var3)) {
            var6 = var7;
         }

         var7.field_107349_i = true;
         int var8 = this.func_107243_b(var1, var7, var4, var3, var5);

         for(int var9 = 0; var9 < var8; ++var9) {
            C_100292_agi var10 = this.field_107255_d[var9];
            float var11 = var7.field_107343_e + var7.func_107338_b(var10);
            if(!var10.func_107337_a() || var11 < var10.field_107343_e) {
               var10.field_107348_h = var7;
               var10.field_107343_e = var11;
               var10.field_107340_f = var10.func_107338_b(var3);
               if(var10.func_107337_a()) {
                  this.field_107257_b.func_107332_a(var10, var10.field_107343_e + var10.field_107340_f);
               } else {
                  var10.field_107341_g = var10.field_107343_e + var10.field_107340_f;
                  this.field_107257_b.func_107331_a(var10);
               }
            }
         }
      }

      if(var6 == var2) {
         return null;
      } else {
         return this.func_107248_a(var2, var6);
      }
   }

   private int func_107243_b(C_100730_lb var1, C_100292_agi var2, C_100292_agi var3, C_100292_agi var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if(this.func_107247_a(var1, var2.field_107346_a, var2.field_107344_b + 1, var2.field_107345_c, var3) == 1) {
         var7 = 1;
      }

      C_100292_agi var8 = this.func_107250_a(var1, var2.field_107346_a, var2.field_107344_b, var2.field_107345_c + 1, var3, var7);
      C_100292_agi var9 = this.func_107250_a(var1, var2.field_107346_a - 1, var2.field_107344_b, var2.field_107345_c, var3, var7);
      C_100292_agi var10 = this.func_107250_a(var1, var2.field_107346_a + 1, var2.field_107344_b, var2.field_107345_c, var3, var7);
      C_100292_agi var11 = this.func_107250_a(var1, var2.field_107346_a, var2.field_107344_b, var2.field_107345_c - 1, var3, var7);
      if(var8 != null && !var8.field_107349_i && var8.func_107339_a(var4) < var5) {
         this.field_107255_d[var6++] = var8;
      }

      if(var9 != null && !var9.field_107349_i && var9.func_107339_a(var4) < var5) {
         this.field_107255_d[var6++] = var9;
      }

      if(var10 != null && !var10.field_107349_i && var10.func_107339_a(var4) < var5) {
         this.field_107255_d[var6++] = var10;
      }

      if(var11 != null && !var11.field_107349_i && var11.func_107339_a(var4) < var5) {
         this.field_107255_d[var6++] = var11;
      }

      return var6;
   }

   private C_100292_agi func_107250_a(C_100730_lb var1, int var2, int var3, int var4, C_100292_agi var5, int var6) {
      C_100292_agi var7 = null;
      int var8 = this.func_107247_a(var1, var2, var3, var4, var5);
      if(var8 == 2) {
         return this.func_107245_a(var2, var3, var4);
      } else {
         if(var8 == 1) {
            var7 = this.func_107245_a(var2, var3, var4);
         }

         if(var7 == null && var6 > 0 && var8 != -3 && var8 != -4 && this.func_107247_a(var1, var2, var3 + var6, var4, var5) == 1) {
            var7 = this.func_107245_a(var2, var3 + var6, var4);
            var3 += var6;
         }

         if(var7 != null) {
            int var9 = 0;
            int var10 = 0;

            while(var3 > 0) {
               var10 = this.func_107247_a(var1, var2, var3 - 1, var4, var5);
               if(this.field_107254_g && var10 == -1) {
                  return null;
               }

               if(var10 != 1) {
                  break;
               }

               if(var9++ >= var1.func_103070_as()) {
                  return null;
               }

               --var3;
               if(var3 > 0) {
                  var7 = this.func_107245_a(var2, var3, var4);
               }
            }

            if(var10 == -2) {
               return null;
            }
         }

         return var7;
      }
   }

   private final C_100292_agi func_107245_a(int var1, int var2, int var3) {
      int var4 = C_100292_agi.func_107336_a(var1, var2, var3);
      C_100292_agi var5 = (C_100292_agi)this.field_107258_c.func_109038_a(var4);
      if(var5 == null) {
         var5 = new C_100292_agi(var1, var2, var3);
         this.field_107258_c.func_109035_a(var4, var5);
      }

      return var5;
   }

   public int func_107247_a(C_100730_lb var1, int var2, int var3, int var4, C_100292_agi var5) {
      return func_107246_a(var1, var2, var3, var4, var5, this.field_107254_g, this.field_107253_f, this.field_107256_e);
   }

   public static int func_107246_a(C_100730_lb var0, int var1, int var2, int var3, C_100292_agi var4, boolean var5, boolean var6, boolean var7) {
      boolean var8 = false;

      for(int var9 = var1; var9 < var1 + var4.field_107346_a; ++var9) {
         for(int var10 = var2; var10 < var2 + var4.field_107344_b; ++var10) {
            for(int var11 = var3; var11 < var3 + var4.field_107345_c; ++var11) {
               int var12 = var0.field_103229_p.func_109349_a(var9, var10, var11);
               if(var12 > 0) {
                  if(var12 == C_100451_alf.field_106133_bn.field_106162_cm) {
                     var8 = true;
                  } else if(var12 != C_100451_alf.field_106071_D.field_106162_cm && var12 != C_100451_alf.field_106072_E.field_106162_cm) {
                     if(!var7 && var12 == C_100451_alf.field_106200_aH.field_106162_cm) {
                        return 0;
                     }
                  } else {
                     if(var5) {
                        return -1;
                     }

                     var8 = true;
                  }

                  C_100451_alf var13 = C_100451_alf.field_106118_p[var12];
                  if(!var13.func_105982_c(var0.field_103229_p, var9, var10, var11) && (!var6 || var12 != C_100451_alf.field_106200_aH.field_106162_cm)) {
                     if(var12 == C_100451_alf.field_106147_bc.field_106162_cm || var12 == C_100451_alf.field_106127_by.field_106162_cm || var12 == C_100451_alf.field_106170_ce.field_106162_cm) {
                        return -3;
                     }

                     if(var12 == C_100451_alf.field_106133_bn.field_106162_cm) {
                        return -4;
                     }

                     C_100664_afg var14 = var13.field_106204_cB;
                     if(var14 != C_100664_afg.field_109020_i) {
                        return 0;
                     }

                     if(!var0.func_103115_J()) {
                        return -2;
                     }
                  }
               }
            }
         }
      }

      return var8?2:1;
   }

   private C_100278_agj func_107248_a(C_100292_agi var1, C_100292_agi var2) {
      int var3 = 1;

      C_100292_agi var4;
      for(var4 = var2; var4.field_107348_h != null; var4 = var4.field_107348_h) {
         ++var3;
      }

      C_100292_agi[] var5 = new C_100292_agi[var3];
      var4 = var2;
      --var3;

      for(var5[var3] = var2; var4.field_107348_h != null; var5[var3] = var4) {
         var4 = var4.field_107348_h;
         --var3;
      }

      return new C_100278_agj(var5);
   }
}
