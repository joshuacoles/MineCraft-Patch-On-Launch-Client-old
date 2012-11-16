
public class C_100615_mf extends C_100621_mm {

   private final C_100595_ln field_108099_a;
   private final float field_108097_b;
   private float field_108098_c = 0.0F;
   private boolean field_108095_d = false;
   private int field_108096_e = 0;
   private int field_108094_f = 0;


   public C_100615_mf(C_100595_ln var1, float var2) {
      this.field_108099_a = var1;
      this.field_108097_b = var2;
      this.func_108030_a(7);
   }

   public void func_108034_c() {
      this.field_108098_c = 0.0F;
   }

   public void func_108029_d() {
      this.field_108095_d = false;
      this.field_108098_c = 0.0F;
   }

   public boolean func_108033_a() {
      return this.field_108099_a.func_103143_S() && this.field_108099_a.field_103206_n != null && this.field_108099_a.field_103206_n instanceof C_101095_qg && (this.field_108095_d || this.field_108099_a.func_103398_bF());
   }

   public void func_108031_e() {
      C_101095_qg var1 = (C_101095_qg)this.field_108099_a.field_103206_n;
      C_100598_ls var2 = (C_100598_ls)this.field_108099_a;
      float var3 = C_100650_jv.func_108920_g(var1.field_103236_z - this.field_108099_a.field_103236_z) * 0.5F;
      if(var3 > 5.0F) {
         var3 = 5.0F;
      }

      if(var3 < -5.0F) {
         var3 = -5.0F;
      }

      this.field_108099_a.field_103236_z = C_100650_jv.func_108920_g(this.field_108099_a.field_103236_z + var3);
      if(this.field_108098_c < this.field_108097_b) {
         this.field_108098_c += (this.field_108097_b - this.field_108098_c) * 0.01F;
      }

      if(this.field_108098_c > this.field_108097_b) {
         this.field_108098_c = this.field_108097_b;
      }

      int var4 = C_100650_jv.func_108910_c(this.field_108099_a.field_103221_t);
      int var5 = C_100650_jv.func_108910_c(this.field_108099_a.field_103219_u);
      int var6 = C_100650_jv.func_108910_c(this.field_108099_a.field_103217_v);
      float var7 = this.field_108098_c;
      if(this.field_108095_d) {
         if(this.field_108096_e++ > this.field_108094_f) {
            this.field_108095_d = false;
         }

         var7 += var7 * 1.15F * C_100650_jv.func_108924_a((float)this.field_108096_e / (float)this.field_108094_f * 3.1415927F);
      }

      float var8 = 0.91F;
      if(this.field_108099_a.field_103174_E) {
         var8 = 0.54600006F;
         int var9 = this.field_108099_a.field_103229_p.func_109349_a(C_100650_jv.func_108933_d((float)var4), C_100650_jv.func_108933_d((float)var5) - 1, C_100650_jv.func_108933_d((float)var6));
         if(var9 > 0) {
            var8 = C_100451_alf.field_106118_p[var9].field_106145_cC * 0.91F;
         }
      }

      float var21 = 0.16277136F / (var8 * var8 * var8);
      float var10 = C_100650_jv.func_108924_a(var2.field_103236_z * 3.1415927F / 180.0F);
      float var11 = C_100650_jv.func_108928_b(var2.field_103236_z * 3.1415927F / 180.0F);
      float var12 = var2.func_103373_aE() * var21;
      float var13 = Math.max(var7, 1.0F);
      var13 = var12 / var13;
      float var14 = var7 * var13;
      float var15 = -(var14 * var10);
      float var16 = var14 * var11;
      if(C_100650_jv.func_108927_e(var15) > C_100650_jv.func_108927_e(var16)) {
         if(var15 < 0.0F) {
            var15 -= this.field_108099_a.field_103182_N / 2.0F;
         }

         if(var15 > 0.0F) {
            var15 += this.field_108099_a.field_103182_N / 2.0F;
         }

         var16 = 0.0F;
      } else {
         var15 = 0.0F;
         if(var16 < 0.0F) {
            var16 -= this.field_108099_a.field_103182_N / 2.0F;
         }

         if(var16 > 0.0F) {
            var16 += this.field_108099_a.field_103182_N / 2.0F;
         }
      }

      int var17 = C_100650_jv.func_108910_c(this.field_108099_a.field_103221_t + (double)var15);
      int var18 = C_100650_jv.func_108910_c(this.field_108099_a.field_103217_v + (double)var16);
      C_100292_agi var19 = new C_100292_agi(C_100650_jv.func_108933_d(this.field_108099_a.field_103182_N + 1.0F), C_100650_jv.func_108933_d(this.field_108099_a.field_103183_O + var1.field_103183_O + 1.0F), C_100650_jv.func_108933_d(this.field_108099_a.field_103182_N + 1.0F));
      if((var4 != var17 || var6 != var18) && C_100280_agk.func_107246_a(this.field_108099_a, var17, var5, var18, var19, false, false, true) == 0 && C_100280_agk.func_107246_a(this.field_108099_a, var4, var5 + 1, var6, var19, false, false, true) == 1 && C_100280_agk.func_107246_a(this.field_108099_a, var17, var5 + 1, var18, var19, false, false, true) == 1) {
         var2.func_103293_ax().func_108870_a();
      }

      if(!var1.field_103869_cf.field_111597_d && this.field_108098_c >= this.field_108097_b * 0.5F && this.field_108099_a.func_103312_aA().nextFloat() < 0.0060F && !this.field_108095_d) {
         C_100994_tv var20 = var1.func_103328_bA();
         if(var20 != null && var20.field_111397_c == C_100992_tt.field_110931_bR.field_110891_cf) {
            var20.func_111363_a(1, var1);
            if(var20.field_111398_a == 0) {
               var1.field_103857_bK.field_104832_a[var1.field_103857_bK.field_104831_c] = new C_100994_tv(C_100992_tt.field_110897_aR);
            }
         }
      }

      this.field_108099_a.func_103310_e(0.0F, var7);
   }

   public boolean func_108093_f() {
      return this.field_108095_d;
   }

   public void func_108091_g() {
      this.field_108095_d = true;
      this.field_108096_e = 0;
      this.field_108094_f = this.field_108099_a.func_103312_aA().nextInt(841) + 140;
   }

   public boolean func_108092_h() {
      return !this.func_108093_f() && this.field_108098_c > this.field_108097_b * 0.3F;
   }
}
