import java.util.List;

public class C_100424_ama extends C_100398_amm implements C_100716_kl {

   private C_100994_tv[] field_103035_a = new C_100994_tv[4];
   private int field_103033_b;
   private int field_103034_c;
   private int field_103032_d;


   public String func_103005_b() {
      return "container.brewing";
   }

   public int func_103003_k_() {
      return this.field_103035_a.length;
   }

   public void func_102921_g() {
      if(this.field_103033_b > 0) {
         --this.field_103033_b;
         if(this.field_103033_b == 0) {
            this.func_103026_t();
            this.func_102922_d();
         } else if(!this.func_103028_k()) {
            this.field_103033_b = 0;
            this.func_102922_d();
         } else if(this.field_103032_d != this.field_103035_a[3].field_111397_c) {
            this.field_103033_b = 0;
            this.func_102922_d();
         }
      } else if(this.func_103028_k()) {
         this.field_103033_b = 400;
         this.field_103032_d = this.field_103035_a[3].field_111397_c;
      }

      int var1 = this.func_103029_i();
      if(var1 != this.field_103034_c) {
         this.field_103034_c = var1;
         this.field_102940_k.func_109488_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, var1);
      }

      super.func_102921_g();
   }

   public int func_103031_x_() {
      return this.field_103033_b;
   }

   private boolean func_103028_k() {
      if(this.field_103035_a[3] != null && this.field_103035_a[3].field_111398_a > 0) {
         C_100994_tv var1 = this.field_103035_a[3];
         if(!C_100992_tt.field_110834_e[var1.field_111397_c].func_110754_v()) {
            return false;
         } else {
            boolean var2 = false;

            for(int var3 = 0; var3 < 3; ++var3) {
               if(this.field_103035_a[var3] != null && this.field_103035_a[var3].field_111397_c == C_100992_tt.field_110864_bs.field_110891_cf) {
                  int var4 = this.field_103035_a[var3].func_111367_j();
                  int var5 = this.func_103027_b(var4, var1);
                  if(!C_100961_ue.func_110994_g(var4) && C_100961_ue.func_110994_g(var5)) {
                     var2 = true;
                     break;
                  }

                  List var6 = C_100992_tt.field_110864_bs.func_110997_f(var4);
                  List var7 = C_100992_tt.field_110864_bs.func_110997_f(var5);
                  if((var4 <= 0 || var6 != var7) && (var6 == null || !var6.equals(var7) && var7 != null) && var4 != var5) {
                     var2 = true;
                     break;
                  }
               }
            }

            return var2;
         }
      } else {
         return false;
      }
   }

   private void func_103026_t() {
      if(this.func_103028_k()) {
         C_100994_tv var1 = this.field_103035_a[3];

         for(int var2 = 0; var2 < 3; ++var2) {
            if(this.field_103035_a[var2] != null && this.field_103035_a[var2].field_111397_c == C_100992_tt.field_110864_bs.field_110891_cf) {
               int var3 = this.field_103035_a[var2].func_111367_j();
               int var4 = this.func_103027_b(var3, var1);
               List var5 = C_100992_tt.field_110864_bs.func_110997_f(var3);
               List var6 = C_100992_tt.field_110864_bs.func_110997_f(var4);
               if((var3 <= 0 || var5 != var6) && (var5 == null || !var5.equals(var6) && var6 != null)) {
                  if(var3 != var4) {
                     this.field_103035_a[var2].func_111371_b(var4);
                  }
               } else if(!C_100961_ue.func_110994_g(var3) && C_100961_ue.func_110994_g(var4)) {
                  this.field_103035_a[var2].func_111371_b(var4);
               }
            }
         }

         if(C_100992_tt.field_110834_e[var1.field_111397_c].func_110776_s()) {
            this.field_103035_a[3] = new C_100994_tv(C_100992_tt.field_110834_e[var1.field_111397_c].func_110789_r());
         } else {
            --this.field_103035_a[3].field_111398_a;
            if(this.field_103035_a[3].field_111398_a <= 0) {
               this.field_103035_a[3] = null;
            }
         }

      }
   }

   private int func_103027_b(int var1, C_100994_tv var2) {
      return var2 == null?var1:(C_100992_tt.field_110834_e[var2.field_111397_c].func_110754_v()?C_100947_vb.func_111114_a(var1, C_100992_tt.field_110834_e[var2.field_111397_c].func_110749_u()):var1);
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      C_100339_bp var2 = var1.func_107513_m("Items");
      this.field_103035_a = new C_100994_tv[this.func_103003_k_()];

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         byte var5 = var4.func_107524_c("Slot");
         if(var5 >= 0 && var5 < this.field_103035_a.length) {
            this.field_103035_a[var5] = C_100994_tv.func_111376_a(var4);
         }
      }

      this.field_103033_b = var1.func_107517_d("BrewTime");
   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107532_a("BrewTime", (short)this.field_103033_b);
      C_100339_bp var2 = new C_100339_bp();

      for(int var3 = 0; var3 < this.field_103035_a.length; ++var3) {
         if(this.field_103035_a[var3] != null) {
            C_100353_bh var4 = new C_100353_bh();
            var4.func_107527_a("Slot", (byte)var3);
            this.field_103035_a[var3].func_111344_b(var4);
            var2.func_107500_a(var4);
         }
      }

      var1.func_107530_a("Items", var2);
   }

   public C_100994_tv func_103007_a(int var1) {
      return var1 >= 0 && var1 < this.field_103035_a.length?this.field_103035_a[var1]:null;
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_103035_a.length) {
         C_100994_tv var3 = this.field_103035_a[var1];
         this.field_103035_a[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(var1 >= 0 && var1 < this.field_103035_a.length) {
         C_100994_tv var2 = this.field_103035_a[var1];
         this.field_103035_a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      if(var1 >= 0 && var1 < this.field_103035_a.length) {
         this.field_103035_a[var1] = var2;
      }

   }

   public int func_103008_c() {
      return 1;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n) != this?false:var1.func_103146_e((double)this.field_102938_l + 0.5D, (double)this.field_102939_m + 0.5D, (double)this.field_102936_n + 0.5D) <= 64.0D;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}

   public void func_103030_c(int var1) {
      this.field_103033_b = var1;
   }

   public int func_103029_i() {
      int var1 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         if(this.field_103035_a[var2] != null) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }
}
