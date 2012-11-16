
public class C_101092_qf implements C_100716_kl {

   public C_100994_tv[] field_104832_a = new C_100994_tv[36];
   public C_100994_tv[] field_104830_b = new C_100994_tv[4];
   public int field_104831_c = 0;
   private C_100994_tv field_104826_f;
   public C_101095_qg field_104828_d;
   private C_100994_tv field_104827_g;
   public boolean field_104829_e = false;


   public C_101092_qf(C_101095_qg var1) {
      this.field_104828_d = var1;
   }

   public C_100994_tv func_104808_g() {
      return this.field_104831_c < 9 && this.field_104831_c >= 0?this.field_104832_a[this.field_104831_c]:null;
   }

   public static int func_104817_h() {
      return 9;
   }

   private int func_104811_h(int var1) {
      for(int var2 = 0; var2 < this.field_104832_a.length; ++var2) {
         if(this.field_104832_a[var2] != null && this.field_104832_a[var2].field_111397_c == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int func_104820_d(int var1, int var2) {
      for(int var3 = 0; var3 < this.field_104832_a.length; ++var3) {
         if(this.field_104832_a[var3] != null && this.field_104832_a[var3].field_111397_c == var1 && this.field_104832_a[var3].func_111367_j() == var2) {
            return var3;
         }
      }

      return -1;
   }

   private int func_104821_d(C_100994_tv var1) {
      for(int var2 = 0; var2 < this.field_104832_a.length; ++var2) {
         if(this.field_104832_a[var2] != null && this.field_104832_a[var2].field_111397_c == var1.field_111397_c && this.field_104832_a[var2].func_111388_e() && this.field_104832_a[var2].field_111398_a < this.field_104832_a[var2].func_111380_d() && this.field_104832_a[var2].field_111398_a < this.func_103008_c() && (!this.field_104832_a[var2].func_111383_g() || this.field_104832_a[var2].func_111367_j() == var1.func_111367_j()) && C_100994_tv.func_111379_a(this.field_104832_a[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   public int func_104812_i() {
      for(int var1 = 0; var1 < this.field_104832_a.length; ++var1) {
         if(this.field_104832_a[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void func_104800_a(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = true;
      this.field_104826_f = this.func_104808_g();
      int var7;
      if(var3) {
         var7 = this.func_104820_d(var1, var2);
      } else {
         var7 = this.func_104811_h(var1);
      }

      if(var7 >= 0 && var7 < 9) {
         this.field_104831_c = var7;
      } else {
         if(var4 && var1 > 0) {
            int var6 = this.func_104812_i();
            if(var6 >= 0 && var6 < 9) {
               this.field_104831_c = var6;
            }

            this.func_104805_a(C_100992_tt.field_110834_e[var1], var2);
         }

      }
   }

   public void func_104818_c(int var1) {
      if(var1 > 0) {
         var1 = 1;
      }

      if(var1 < 0) {
         var1 = -1;
      }

      for(this.field_104831_c -= var1; this.field_104831_c < 0; this.field_104831_c += 9) {
         ;
      }

      while(this.field_104831_c >= 9) {
         this.field_104831_c -= 9;
      }

   }

   public int func_104810_b(int var1, int var2) {
      int var3 = 0;

      int var4;
      C_100994_tv var5;
      for(var4 = 0; var4 < this.field_104832_a.length; ++var4) {
         var5 = this.field_104832_a[var4];
         if(var5 != null && (var1 <= -1 || var5.field_111397_c == var1) && (var2 <= -1 || var5.func_111367_j() == var2)) {
            var3 += var5.field_111398_a;
            this.field_104832_a[var4] = null;
         }
      }

      for(var4 = 0; var4 < this.field_104830_b.length; ++var4) {
         var5 = this.field_104830_b[var4];
         if(var5 != null && (var1 <= -1 || var5.field_111397_c == var1) && (var2 <= -1 || var5.func_111367_j() == var2)) {
            var3 += var5.field_111398_a;
            this.field_104830_b[var4] = null;
         }
      }

      return var3;
   }

   public void func_104805_a(C_100992_tt var1, int var2) {
      if(var1 != null) {
         int var3 = this.func_104820_d(var1.field_110891_cf, var2);
         if(var3 >= 0) {
            this.field_104832_a[var3] = this.field_104832_a[this.field_104831_c];
         }

         if(this.field_104826_f != null && this.field_104826_f.func_111347_v() && this.func_104820_d(this.field_104826_f.field_111397_c, this.field_104826_f.func_111357_i()) == this.field_104831_c) {
            return;
         }

         this.field_104832_a[this.field_104831_c] = new C_100994_tv(C_100992_tt.field_110834_e[var1.field_110891_cf], 1, var2);
      }

   }

   private int func_104804_e(C_100994_tv var1) {
      int var2 = var1.field_111397_c;
      int var3 = var1.field_111398_a;
      int var4;
      if(var1.func_111380_d() == 1) {
         var4 = this.func_104812_i();
         if(var4 < 0) {
            return var3;
         } else {
            if(this.field_104832_a[var4] == null) {
               this.field_104832_a[var4] = C_100994_tv.func_111341_b(var1);
            }

            return 0;
         }
      } else {
         var4 = this.func_104821_d(var1);
         if(var4 < 0) {
            var4 = this.func_104812_i();
         }

         if(var4 < 0) {
            return var3;
         } else {
            if(this.field_104832_a[var4] == null) {
               this.field_104832_a[var4] = new C_100994_tv(var2, 0, var1.func_111367_j());
               if(var1.func_111339_o()) {
                  this.field_104832_a[var4].func_111349_d((C_100353_bh)var1.func_111352_p().func_107485_b());
               }
            }

            int var5 = var3;
            if(var3 > this.field_104832_a[var4].func_111380_d() - this.field_104832_a[var4].field_111398_a) {
               var5 = this.field_104832_a[var4].func_111380_d() - this.field_104832_a[var4].field_111398_a;
            }

            if(var5 > this.func_103008_c() - this.field_104832_a[var4].field_111398_a) {
               var5 = this.func_103008_c() - this.field_104832_a[var4].field_111398_a;
            }

            if(var5 == 0) {
               return var3;
            } else {
               var3 -= var5;
               this.field_104832_a[var4].field_111398_a += var5;
               this.field_104832_a[var4].field_111396_b = 5;
               return var3;
            }
         }
      }
   }

   public void func_104803_j() {
      for(int var1 = 0; var1 < this.field_104832_a.length; ++var1) {
         if(this.field_104832_a[var1] != null) {
            this.field_104832_a[var1].func_111338_a(this.field_104828_d.field_103229_p, this.field_104828_d, var1, this.field_104831_c == var1);
         }
      }

   }

   public boolean func_104802_d(int var1) {
      int var2 = this.func_104811_h(var1);
      if(var2 < 0) {
         return false;
      } else {
         if(--this.field_104832_a[var2].field_111398_a <= 0) {
            this.field_104832_a[var2] = null;
         }

         return true;
      }
   }

   public boolean func_104816_e(int var1) {
      int var2 = this.func_104811_h(var1);
      return var2 >= 0;
   }

   public boolean func_104809_a(C_100994_tv var1) {
      int var2;
      if(var1.func_111353_h()) {
         var2 = this.func_104812_i();
         if(var2 >= 0) {
            this.field_104832_a[var2] = C_100994_tv.func_111341_b(var1);
            this.field_104832_a[var2].field_111396_b = 5;
            var1.field_111398_a = 0;
            return true;
         } else if(this.field_104828_d.field_103869_cf.field_111597_d) {
            var1.field_111398_a = 0;
            return true;
         } else {
            return false;
         }
      } else {
         do {
            var2 = var1.field_111398_a;
            var1.field_111398_a = this.func_104804_e(var1);
         } while(var1.field_111398_a > 0 && var1.field_111398_a < var2);

         if(var1.field_111398_a == var2 && this.field_104828_d.field_103869_cf.field_111597_d) {
            var1.field_111398_a = 0;
            return true;
         } else {
            return var1.field_111398_a < var2;
         }
      }
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      C_100994_tv[] var3 = this.field_104832_a;
      if(var1 >= this.field_104832_a.length) {
         var3 = this.field_104830_b;
         var1 -= this.field_104832_a.length;
      }

      if(var3[var1] != null) {
         C_100994_tv var4;
         if(var3[var1].field_111398_a <= var2) {
            var4 = var3[var1];
            var3[var1] = null;
            return var4;
         } else {
            var4 = var3[var1].func_111342_a(var2);
            if(var3[var1].field_111398_a == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      C_100994_tv[] var2 = this.field_104832_a;
      if(var1 >= this.field_104832_a.length) {
         var2 = this.field_104830_b;
         var1 -= this.field_104832_a.length;
      }

      if(var2[var1] != null) {
         C_100994_tv var3 = var2[var1];
         var2[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      C_100994_tv[] var3 = this.field_104832_a;
      if(var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.field_104830_b;
      }

      var3[var1] = var2;
   }

   public float func_104825_a(C_100451_alf var1) {
      float var2 = 1.0F;
      if(this.field_104832_a[this.field_104831_c] != null) {
         var2 *= this.field_104832_a[this.field_104831_c].func_111369_a(var1);
      }

      return var2;
   }

   public C_100339_bp func_104822_a(C_100339_bp var1) {
      int var2;
      C_100353_bh var3;
      for(var2 = 0; var2 < this.field_104832_a.length; ++var2) {
         if(this.field_104832_a[var2] != null) {
            var3 = new C_100353_bh();
            var3.func_107527_a("Slot", (byte)var2);
            this.field_104832_a[var2].func_111344_b(var3);
            var1.func_107500_a(var3);
         }
      }

      for(var2 = 0; var2 < this.field_104830_b.length; ++var2) {
         if(this.field_104830_b[var2] != null) {
            var3 = new C_100353_bh();
            var3.func_107527_a("Slot", (byte)(var2 + 100));
            this.field_104830_b[var2].func_111344_b(var3);
            var1.func_107500_a(var3);
         }
      }

      return var1;
   }

   public void func_104813_b(C_100339_bp var1) {
      this.field_104832_a = new C_100994_tv[36];
      this.field_104830_b = new C_100994_tv[4];

      for(int var2 = 0; var2 < var1.func_107501_c(); ++var2) {
         C_100353_bh var3 = (C_100353_bh)var1.func_107498_b(var2);
         int var4 = var3.func_107524_c("Slot") & 255;
         C_100994_tv var5 = C_100994_tv.func_111376_a(var3);
         if(var5 != null) {
            if(var4 >= 0 && var4 < this.field_104832_a.length) {
               this.field_104832_a[var4] = var5;
            }

            if(var4 >= 100 && var4 < this.field_104830_b.length + 100) {
               this.field_104830_b[var4 - 100] = var5;
            }
         }
      }

   }

   public int func_103003_k_() {
      return this.field_104832_a.length + 4;
   }

   public C_100994_tv func_103007_a(int var1) {
      C_100994_tv[] var2 = this.field_104832_a;
      if(var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.field_104830_b;
      }

      return var2[var1];
   }

   public String func_103005_b() {
      return "container.inventory";
   }

   public int func_103008_c() {
      return 64;
   }

   public int func_104807_a(C_100730_lb var1) {
      C_100994_tv var2 = this.func_103007_a(this.field_104831_c);
      return var2 != null?var2.func_111350_a(var1):1;
   }

   public boolean func_104815_b(C_100451_alf var1) {
      if(var1.field_106204_cB.func_108991_l()) {
         return true;
      } else {
         C_100994_tv var2 = this.func_103007_a(this.field_104831_c);
         return var2 != null?var2.func_111385_b(var1):false;
      }
   }

   public C_100994_tv func_104798_f(int var1) {
      return this.field_104830_b[var1];
   }

   public int func_104819_k() {
      int var1 = 0;
      C_100994_tv[] var2 = this.field_104830_b;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100994_tv var5 = var2[var4];
         if(var5 != null && var5.func_111365_b() instanceof C_101042_sc) {
            int var6 = ((C_101042_sc)var5.func_111365_b()).field_111050_b;
            var1 += var6;
         }
      }

      return var1;
   }

   public void func_104814_g(int var1) {
      var1 /= 4;
      if(var1 < 1) {
         var1 = 1;
      }

      for(int var2 = 0; var2 < this.field_104830_b.length; ++var2) {
         if(this.field_104830_b[var2] != null && this.field_104830_b[var2].func_111365_b() instanceof C_101042_sc) {
            this.field_104830_b[var2].func_111363_a(var1, this.field_104828_d);
            if(this.field_104830_b[var2].field_111398_a == 0) {
               this.field_104830_b[var2] = null;
            }
         }
      }

   }

   public void func_104823_l() {
      int var1;
      for(var1 = 0; var1 < this.field_104832_a.length; ++var1) {
         if(this.field_104832_a[var1] != null) {
            this.field_104828_d.func_103828_a(this.field_104832_a[var1], true);
            this.field_104832_a[var1] = null;
         }
      }

      for(var1 = 0; var1 < this.field_104830_b.length; ++var1) {
         if(this.field_104830_b[var1] != null) {
            this.field_104828_d.func_103828_a(this.field_104830_b[var1], true);
            this.field_104830_b[var1] = null;
         }
      }

   }

   public void func_102922_d() {
      this.field_104829_e = true;
   }

   public void func_104801_b(C_100994_tv var1) {
      this.field_104827_g = var1;
   }

   public C_100994_tv func_104824_n() {
      return this.field_104827_g;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_104828_d.field_103180_L?false:var1.func_103082_e(this.field_104828_d) <= 64.0D;
   }

   public boolean func_104806_c(C_100994_tv var1) {
      C_100994_tv[] var2 = this.field_104830_b;
      int var3 = var2.length;

      int var4;
      C_100994_tv var5;
      for(var4 = 0; var4 < var3; ++var4) {
         var5 = var2[var4];
         if(var5 != null && var5.func_111351_a(var1)) {
            return true;
         }
      }

      var2 = this.field_104832_a;
      var3 = var2.length;

      for(var4 = 0; var4 < var3; ++var4) {
         var5 = var2[var4];
         if(var5 != null && var5.func_111351_a(var1)) {
            return true;
         }
      }

      return false;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}

   public void func_104799_b(C_101092_qf var1) {
      int var2;
      for(var2 = 0; var2 < this.field_104832_a.length; ++var2) {
         this.field_104832_a[var2] = C_100994_tv.func_111341_b(var1.field_104832_a[var2]);
      }

      for(var2 = 0; var2 < this.field_104830_b.length; ++var2) {
         this.field_104830_b[var2] = C_100994_tv.func_111341_b(var1.field_104830_b[var2]);
      }

   }
}
