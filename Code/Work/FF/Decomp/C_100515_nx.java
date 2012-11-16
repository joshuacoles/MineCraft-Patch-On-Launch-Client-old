
public class C_100515_nx {

   private C_100595_ln field_108316_a;
   private C_100873_xe field_108314_b;
   private C_100278_agj field_108315_c;
   private float field_108312_d;
   private float field_108313_e;
   private boolean field_108310_f = false;
   private int field_108311_g;
   private int field_108321_h;
   private C_100387_amw field_108322_i = C_100387_amw.func_107858_a(0.0D, 0.0D, 0.0D);
   private boolean field_108319_j = true;
   private boolean field_108320_k = false;
   private boolean field_108317_l = false;
   private boolean field_108318_m = false;


   public C_100515_nx(C_100595_ln var1, C_100873_xe var2, float var3) {
      this.field_108316_a = var1;
      this.field_108314_b = var2;
      this.field_108313_e = var3;
   }

   public void func_108291_a(boolean var1) {
      this.field_108317_l = var1;
   }

   public boolean func_108287_a() {
      return this.field_108317_l;
   }

   public void func_108298_b(boolean var1) {
      this.field_108320_k = var1;
   }

   public void func_108290_c(boolean var1) {
      this.field_108319_j = var1;
   }

   public boolean func_108308_c() {
      return this.field_108320_k;
   }

   public void func_108305_d(boolean var1) {
      this.field_108310_f = var1;
   }

   public void func_108289_a(float var1) {
      this.field_108312_d = var1;
   }

   public void func_108297_e(boolean var1) {
      this.field_108318_m = var1;
   }

   public C_100278_agj func_108284_a(double var1, double var3, double var5) {
      return !this.func_108285_k()?null:this.field_108314_b.func_109495_a(this.field_108316_a, C_100650_jv.func_108910_c(var1), (int)var3, C_100650_jv.func_108910_c(var5), this.field_108313_e, this.field_108319_j, this.field_108320_k, this.field_108317_l, this.field_108318_m);
   }

   public boolean func_108292_a(double var1, double var3, double var5, float var7) {
      C_100278_agj var8 = this.func_108284_a((double)C_100650_jv.func_108910_c(var1), (double)((int)var3), (double)C_100650_jv.func_108910_c(var5));
      return this.func_108294_a(var8, var7);
   }

   public C_100278_agj func_108306_a(C_100595_ln var1) {
      return !this.func_108285_k()?null:this.field_108314_b.func_109487_a(this.field_108316_a, var1, this.field_108313_e, this.field_108319_j, this.field_108320_k, this.field_108317_l, this.field_108318_m);
   }

   public boolean func_108295_a(C_100595_ln var1, float var2) {
      C_100278_agj var3 = this.func_108306_a(var1);
      return var3 != null?this.func_108294_a(var3, var2):false;
   }

   public boolean func_108294_a(C_100278_agj var1, float var2) {
      if(var1 == null) {
         this.field_108315_c = null;
         return false;
      } else {
         if(!var1.func_107228_a(this.field_108315_c)) {
            this.field_108315_c = var1;
         }

         if(this.field_108310_f) {
            this.func_108288_m();
         }

         if(this.field_108315_c.func_107232_d() == 0) {
            return false;
         } else {
            this.field_108312_d = var2;
            C_100387_amw var3 = this.func_108293_i();
            this.field_108321_h = this.field_108311_g;
            this.field_108322_i.field_107872_c = var3.field_107872_c;
            this.field_108322_i.field_107869_d = var3.field_107869_d;
            this.field_108322_i.field_107870_e = var3.field_107870_e;
            return true;
         }
      }
   }

   public C_100278_agj func_108296_d() {
      return this.field_108315_c;
   }

   public void func_108302_e() {
      ++this.field_108311_g;
      if(!this.func_108300_f()) {
         if(this.func_108285_k()) {
            this.func_108309_h();
         }

         if(!this.func_108300_f()) {
            C_100387_amw var1 = this.field_108315_c.func_107237_a(this.field_108316_a);
            if(var1 != null) {
               this.field_108316_a.func_103305_aw().func_108878_a(var1.field_107872_c, var1.field_107869_d, var1.field_107870_e, this.field_108312_d);
            }
         }
      }
   }

   private void func_108309_h() {
      C_100387_amw var1 = this.func_108293_i();
      int var2 = this.field_108315_c.func_107232_d();

      for(int var3 = this.field_108315_c.func_107231_e(); var3 < this.field_108315_c.func_107232_d(); ++var3) {
         if(this.field_108315_c.func_107235_a(var3).field_107344_b != (int)var1.field_107869_d) {
            var2 = var3;
            break;
         }
      }

      float var8 = this.field_108316_a.field_103182_N * this.field_108316_a.field_103182_N;

      int var4;
      for(var4 = this.field_108315_c.func_107231_e(); var4 < var2; ++var4) {
         if(var1.func_107860_e(this.field_108315_c.func_107238_a(this.field_108316_a, var4)) < (double)var8) {
            this.field_108315_c.func_107230_c(var4 + 1);
         }
      }

      var4 = C_100650_jv.func_108921_f(this.field_108316_a.field_103182_N);
      int var5 = (int)this.field_108316_a.field_103183_O + 1;
      int var6 = var4;

      for(int var7 = var2 - 1; var7 >= this.field_108315_c.func_107231_e(); --var7) {
         if(this.func_108303_a(var1, this.field_108315_c.func_107238_a(this.field_108316_a, var7), var4, var5, var6)) {
            this.field_108315_c.func_107230_c(var7);
            break;
         }
      }

      if(this.field_108311_g - this.field_108321_h > 100) {
         if(var1.func_107860_e(this.field_108322_i) < 2.25D) {
            this.func_108299_g();
         }

         this.field_108321_h = this.field_108311_g;
         this.field_108322_i.field_107872_c = var1.field_107872_c;
         this.field_108322_i.field_107869_d = var1.field_107869_d;
         this.field_108322_i.field_107870_e = var1.field_107870_e;
      }

   }

   public boolean func_108300_f() {
      return this.field_108315_c == null || this.field_108315_c.func_107239_b();
   }

   public void func_108299_g() {
      this.field_108315_c = null;
   }

   private C_100387_amw func_108293_i() {
      return this.field_108314_b.func_109363_R().func_107878_a(this.field_108316_a.field_103221_t, (double)this.func_108304_j(), this.field_108316_a.field_103217_v);
   }

   private int func_108304_j() {
      if(this.field_108316_a.func_103144_H() && this.field_108318_m) {
         int var1 = (int)this.field_108316_a.field_103173_D.field_107915_b;
         int var2 = this.field_108314_b.func_109349_a(C_100650_jv.func_108910_c(this.field_108316_a.field_103221_t), var1, C_100650_jv.func_108910_c(this.field_108316_a.field_103217_v));
         int var3 = 0;

         do {
            if(var2 != C_100451_alf.field_106071_D.field_106162_cm && var2 != C_100451_alf.field_106072_E.field_106162_cm) {
               return var1;
            }

            ++var1;
            var2 = this.field_108314_b.func_109349_a(C_100650_jv.func_108910_c(this.field_108316_a.field_103221_t), var1, C_100650_jv.func_108910_c(this.field_108316_a.field_103217_v));
            ++var3;
         } while(var3 <= 16);

         return (int)this.field_108316_a.field_103173_D.field_107915_b;
      } else {
         return (int)(this.field_108316_a.field_103173_D.field_107915_b + 0.5D);
      }
   }

   private boolean func_108285_k() {
      return this.field_108316_a.field_103174_E || this.field_108318_m && this.func_108307_l();
   }

   private boolean func_108307_l() {
      return this.field_108316_a.func_103144_H() || this.field_108316_a.func_103115_J();
   }

   private void func_108288_m() {
      if(!this.field_108314_b.func_109502_j(C_100650_jv.func_108910_c(this.field_108316_a.field_103221_t), (int)(this.field_108316_a.field_103173_D.field_107915_b + 0.5D), C_100650_jv.func_108910_c(this.field_108316_a.field_103217_v))) {
         for(int var1 = 0; var1 < this.field_108315_c.func_107232_d(); ++var1) {
            C_100292_agi var2 = this.field_108315_c.func_107235_a(var1);
            if(this.field_108314_b.func_109502_j(var2.field_107346_a, var2.field_107344_b, var2.field_107345_c)) {
               this.field_108315_c.func_107229_b(var1 - 1);
               return;
            }
         }

      }
   }

   private boolean func_108303_a(C_100387_amw var1, C_100387_amw var2, int var3, int var4, int var5) {
      int var6 = C_100650_jv.func_108910_c(var1.field_107872_c);
      int var7 = C_100650_jv.func_108910_c(var1.field_107870_e);
      double var8 = var2.field_107872_c - var1.field_107872_c;
      double var10 = var2.field_107870_e - var1.field_107870_e;
      double var12 = var8 * var8 + var10 * var10;
      if(var12 < 1.0E-8D) {
         return false;
      } else {
         double var14 = 1.0D / Math.sqrt(var12);
         var8 *= var14;
         var10 *= var14;
         var3 += 2;
         var5 += 2;
         if(!this.func_108301_a(var6, (int)var1.field_107869_d, var7, var3, var4, var5, var1, var8, var10)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var16 = 1.0D / Math.abs(var8);
            double var18 = 1.0D / Math.abs(var10);
            double var20 = (double)(var6 * 1) - var1.field_107872_c;
            double var22 = (double)(var7 * 1) - var1.field_107870_e;
            if(var8 >= 0.0D) {
               ++var20;
            }

            if(var10 >= 0.0D) {
               ++var22;
            }

            var20 /= var8;
            var22 /= var10;
            int var24 = var8 < 0.0D?-1:1;
            int var25 = var10 < 0.0D?-1:1;
            int var26 = C_100650_jv.func_108910_c(var2.field_107872_c);
            int var27 = C_100650_jv.func_108910_c(var2.field_107870_e);
            int var28 = var26 - var6;
            int var29 = var27 - var7;

            do {
               if(var28 * var24 <= 0 && var29 * var25 <= 0) {
                  return true;
               }

               if(var20 < var22) {
                  var20 += var16;
                  var6 += var24;
                  var28 = var26 - var6;
               } else {
                  var22 += var18;
                  var7 += var25;
                  var29 = var27 - var7;
               }
            } while(this.func_108301_a(var6, (int)var1.field_107869_d, var7, var3, var4, var5, var1, var8, var10));

            return false;
         }
      }
   }

   private boolean func_108301_a(int var1, int var2, int var3, int var4, int var5, int var6, C_100387_amw var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if(!this.func_108286_b(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for(int var14 = var12; var14 < var12 + var4; ++var14) {
            for(int var15 = var13; var15 < var13 + var6; ++var15) {
               double var16 = (double)var14 + 0.5D - var7.field_107872_c;
               double var18 = (double)var15 + 0.5D - var7.field_107870_e;
               if(var16 * var8 + var18 * var10 >= 0.0D) {
                  int var20 = this.field_108314_b.func_109349_a(var14, var2 - 1, var15);
                  if(var20 <= 0) {
                     return false;
                  }

                  C_100664_afg var21 = C_100451_alf.field_106118_p[var20].field_106204_cB;
                  if(var21 == C_100664_afg.field_109019_h && !this.field_108316_a.func_103144_H()) {
                     return false;
                  }

                  if(var21 == C_100664_afg.field_109020_i) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private boolean func_108286_b(int var1, int var2, int var3, int var4, int var5, int var6, C_100387_amw var7, double var8, double var10) {
      for(int var12 = var1; var12 < var1 + var4; ++var12) {
         for(int var13 = var2; var13 < var2 + var5; ++var13) {
            for(int var14 = var3; var14 < var3 + var6; ++var14) {
               double var15 = (double)var12 + 0.5D - var7.field_107872_c;
               double var17 = (double)var14 + 0.5D - var7.field_107870_e;
               if(var15 * var8 + var17 * var10 >= 0.0D) {
                  int var19 = this.field_108314_b.func_109349_a(var12, var13, var14);
                  if(var19 > 0 && !C_100451_alf.field_106118_p[var19].func_105982_c(this.field_108314_b, var12, var13, var14)) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }
}
