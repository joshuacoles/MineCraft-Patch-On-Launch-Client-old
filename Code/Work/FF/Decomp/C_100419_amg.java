
public class C_100419_amg extends C_100398_amm implements C_100716_kl {

   private C_100994_tv[] field_104840_d = new C_100994_tv[3];
   public int field_104843_a = 0;
   public int field_104841_b = 0;
   public int field_104842_c = 0;


   public int func_103003_k_() {
      return this.field_104840_d.length;
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_104840_d[var1];
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_104840_d[var1] != null) {
         C_100994_tv var3;
         if(this.field_104840_d[var1].field_111398_a <= var2) {
            var3 = this.field_104840_d[var1];
            this.field_104840_d[var1] = null;
            return var3;
         } else {
            var3 = this.field_104840_d[var1].func_111342_a(var2);
            if(this.field_104840_d[var1].field_111398_a == 0) {
               this.field_104840_d[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_104840_d[var1] != null) {
         C_100994_tv var2 = this.field_104840_d[var1];
         this.field_104840_d[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_104840_d[var1] = var2;
      if(var2 != null && var2.field_111398_a > this.func_103008_c()) {
         var2.field_111398_a = this.func_103008_c();
      }

   }

   public String func_103005_b() {
      return "container.furnace";
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      C_100339_bp var2 = var1.func_107513_m("Items");
      this.field_104840_d = new C_100994_tv[this.func_103003_k_()];

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         byte var5 = var4.func_107524_c("Slot");
         if(var5 >= 0 && var5 < this.field_104840_d.length) {
            this.field_104840_d[var5] = C_100994_tv.func_111376_a(var4);
         }
      }

      this.field_104843_a = var1.func_107517_d("BurnTime");
      this.field_104842_c = var1.func_107517_d("CookTime");
      this.field_104841_b = func_104837_a(this.field_104840_d[1]);
   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107532_a("BurnTime", (short)this.field_104843_a);
      var1.func_107532_a("CookTime", (short)this.field_104842_c);
      C_100339_bp var2 = new C_100339_bp();

      for(int var3 = 0; var3 < this.field_104840_d.length; ++var3) {
         if(this.field_104840_d[var3] != null) {
            C_100353_bh var4 = new C_100353_bh();
            var4.func_107527_a("Slot", (byte)var3);
            this.field_104840_d[var3].func_111344_b(var4);
            var2.func_107500_a(var4);
         }
      }

      var1.func_107530_a("Items", var2);
   }

   public int func_103008_c() {
      return 64;
   }

   public int func_104833_c(int var1) {
      return this.field_104842_c * var1 / 200;
   }

   public int func_104839_d(int var1) {
      if(this.field_104841_b == 0) {
         this.field_104841_b = 200;
      }

      return this.field_104843_a * var1 / this.field_104841_b;
   }

   public boolean func_104836_i() {
      return this.field_104843_a > 0;
   }

   public void func_102921_g() {
      boolean var1 = this.field_104843_a > 0;
      boolean var2 = false;
      if(this.field_104843_a > 0) {
         --this.field_104843_a;
      }

      if(!this.field_102940_k.field_109557_J) {
         if(this.field_104843_a == 0 && this.func_104835_t()) {
            this.field_104841_b = this.field_104843_a = func_104837_a(this.field_104840_d[1]);
            if(this.field_104843_a > 0) {
               var2 = true;
               if(this.field_104840_d[1] != null) {
                  --this.field_104840_d[1].field_111398_a;
                  if(this.field_104840_d[1].field_111398_a == 0) {
                     C_100992_tt var3 = this.field_104840_d[1].func_111365_b().func_110789_r();
                     this.field_104840_d[1] = var3 != null?new C_100994_tv(var3):null;
                  }
               }
            }
         }

         if(this.func_104836_i() && this.func_104835_t()) {
            ++this.field_104842_c;
            if(this.field_104842_c == 200) {
               this.field_104842_c = 0;
               this.func_104834_k();
               var2 = true;
            }
         } else {
            this.field_104842_c = 0;
         }

         if(var1 != this.field_104843_a > 0) {
            var2 = true;
            C_100212_aiw.func_106335_a(this.field_104843_a > 0, this.field_102940_k, this.field_102938_l, this.field_102939_m, this.field_102936_n);
         }
      }

      if(var2) {
         this.func_102922_d();
      }

   }

   private boolean func_104835_t() {
      if(this.field_104840_d[0] == null) {
         return false;
      } else {
         C_100994_tv var1 = C_100908_vm.func_110691_a().func_110692_b(this.field_104840_d[0].func_111365_b().field_110891_cf);
         return var1 == null?false:(this.field_104840_d[2] == null?true:(!this.field_104840_d[2].func_111351_a(var1)?false:(this.field_104840_d[2].field_111398_a < this.func_103008_c() && this.field_104840_d[2].field_111398_a < this.field_104840_d[2].func_111380_d()?true:this.field_104840_d[2].field_111398_a < var1.func_111380_d())));
      }
   }

   public void func_104834_k() {
      if(this.func_104835_t()) {
         C_100994_tv var1 = C_100908_vm.func_110691_a().func_110692_b(this.field_104840_d[0].func_111365_b().field_110891_cf);
         if(this.field_104840_d[2] == null) {
            this.field_104840_d[2] = var1.func_111360_l();
         } else if(this.field_104840_d[2].field_111397_c == var1.field_111397_c) {
            ++this.field_104840_d[2].field_111398_a;
         }

         --this.field_104840_d[0].field_111398_a;
         if(this.field_104840_d[0].field_111398_a <= 0) {
            this.field_104840_d[0] = null;
         }

      }
   }

   public static int func_104837_a(C_100994_tv var0) {
      if(var0 == null) {
         return 0;
      } else {
         int var1 = var0.func_111365_b().field_110891_cf;
         C_100992_tt var2 = var0.func_111365_b();
         if(var1 < 256 && C_100451_alf.field_106118_p[var1] != null) {
            C_100451_alf var3 = C_100451_alf.field_106118_p[var1];
            if(var3 == C_100451_alf.field_106213_bR) {
               return 150;
            }

            if(var3.field_106204_cB == C_100664_afg.field_109008_d) {
               return 300;
            }
         }

         return var2 instanceof C_101017_td && ((C_101017_td)var2).func_111030_g().equals("WOOD")?200:(var2 instanceof C_100939_uy && ((C_100939_uy)var2).func_110973_h().equals("WOOD")?200:(var2 instanceof C_101010_ts && ((C_101010_ts)var2).func_111022_g().equals("WOOD")?200:(var1 == C_100992_tt.field_110805_D.field_110891_cf?100:(var1 == C_100992_tt.field_110841_m.field_110891_cf?1600:(var1 == C_100992_tt.field_110923_ay.field_110891_cf?20000:(var1 == C_100451_alf.field_106076_B.field_106162_cm?100:(var1 == C_100992_tt.field_110869_bo.field_110891_cf?2400:0)))))));
      }
   }

   public static boolean func_104838_b(C_100994_tv var0) {
      return func_104837_a(var0) > 0;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n) != this?false:var1.func_103146_e((double)this.field_102938_l + 0.5D, (double)this.field_102939_m + 0.5D, (double)this.field_102936_n + 0.5D) <= 64.0D;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}
}
