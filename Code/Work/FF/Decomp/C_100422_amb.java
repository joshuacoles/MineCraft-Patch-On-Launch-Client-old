
public class C_100422_amb extends C_100398_amm implements C_100716_kl {

   private C_100994_tv[] field_103025_i = new C_100994_tv[36];
   public boolean field_103022_a = false;
   public C_100422_amb field_103020_b;
   public C_100422_amb field_103021_c;
   public C_100422_amb field_103018_d;
   public C_100422_amb field_103019_e;
   public float field_103016_f;
   public float field_103017_g;
   public int field_103024_h;
   private int field_103023_j;


   public int func_103003_k_() {
      return 27;
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_103025_i[var1];
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_103025_i[var1] != null) {
         C_100994_tv var3;
         if(this.field_103025_i[var1].field_111398_a <= var2) {
            var3 = this.field_103025_i[var1];
            this.field_103025_i[var1] = null;
            this.func_102922_d();
            return var3;
         } else {
            var3 = this.field_103025_i[var1].func_111342_a(var2);
            if(this.field_103025_i[var1].field_111398_a == 0) {
               this.field_103025_i[var1] = null;
            }

            this.func_102922_d();
            return var3;
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_103025_i[var1] != null) {
         C_100994_tv var2 = this.field_103025_i[var1];
         this.field_103025_i[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_103025_i[var1] = var2;
      if(var2 != null && var2.field_111398_a > this.func_103008_c()) {
         var2.field_111398_a = this.func_103008_c();
      }

      this.func_102922_d();
   }

   public String func_103005_b() {
      return "container.chest";
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      C_100339_bp var2 = var1.func_107513_m("Items");
      this.field_103025_i = new C_100994_tv[this.func_103003_k_()];

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         int var5 = var4.func_107524_c("Slot") & 255;
         if(var5 >= 0 && var5 < this.field_103025_i.length) {
            this.field_103025_i[var5] = C_100994_tv.func_111376_a(var4);
         }
      }

   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      C_100339_bp var2 = new C_100339_bp();

      for(int var3 = 0; var3 < this.field_103025_i.length; ++var3) {
         if(this.field_103025_i[var3] != null) {
            C_100353_bh var4 = new C_100353_bh();
            var4.func_107527_a("Slot", (byte)var3);
            this.field_103025_i[var3].func_111344_b(var4);
            var2.func_107500_a(var4);
         }
      }

      var1.func_107530_a("Items", var2);
   }

   public int func_103008_c() {
      return 64;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n) != this?false:var1.func_103146_e((double)this.field_102938_l + 0.5D, (double)this.field_102939_m + 0.5D, (double)this.field_102936_n + 0.5D) <= 64.0D;
   }

   public void func_102931_h() {
      super.func_102931_h();
      this.field_103022_a = false;
   }

   public void func_103015_i() {
      if(!this.field_103022_a) {
         this.field_103022_a = true;
         this.field_103020_b = null;
         this.field_103021_c = null;
         this.field_103018_d = null;
         this.field_103019_e = null;
         if(this.field_102940_k.func_109349_a(this.field_102938_l - 1, this.field_102939_m, this.field_102936_n) == C_100451_alf.field_106216_ax.field_106162_cm) {
            this.field_103018_d = (C_100422_amb)this.field_102940_k.func_109353_p(this.field_102938_l - 1, this.field_102939_m, this.field_102936_n);
         }

         if(this.field_102940_k.func_109349_a(this.field_102938_l + 1, this.field_102939_m, this.field_102936_n) == C_100451_alf.field_106216_ax.field_106162_cm) {
            this.field_103021_c = (C_100422_amb)this.field_102940_k.func_109353_p(this.field_102938_l + 1, this.field_102939_m, this.field_102936_n);
         }

         if(this.field_102940_k.func_109349_a(this.field_102938_l, this.field_102939_m, this.field_102936_n - 1) == C_100451_alf.field_106216_ax.field_106162_cm) {
            this.field_103020_b = (C_100422_amb)this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n - 1);
         }

         if(this.field_102940_k.func_109349_a(this.field_102938_l, this.field_102939_m, this.field_102936_n + 1) == C_100451_alf.field_106216_ax.field_106162_cm) {
            this.field_103019_e = (C_100422_amb)this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n + 1);
         }

         if(this.field_103020_b != null) {
            this.field_103020_b.func_102931_h();
         }

         if(this.field_103019_e != null) {
            this.field_103019_e.func_102931_h();
         }

         if(this.field_103021_c != null) {
            this.field_103021_c.func_102931_h();
         }

         if(this.field_103018_d != null) {
            this.field_103018_d.func_102931_h();
         }

      }
   }

   public void func_102921_g() {
      super.func_102921_g();
      this.func_103015_i();
      if(++this.field_103023_j % 20 * 4 == 0) {
         ;
      }

      this.field_103017_g = this.field_103016_f;
      float var1 = 0.1F;
      double var4;
      if(this.field_103024_h > 0 && this.field_103016_f == 0.0F && this.field_103020_b == null && this.field_103018_d == null) {
         double var2 = (double)this.field_102938_l + 0.5D;
         var4 = (double)this.field_102936_n + 0.5D;
         if(this.field_103019_e != null) {
            var4 += 0.5D;
         }

         if(this.field_103021_c != null) {
            var2 += 0.5D;
         }

         this.field_102940_k.func_109476_a(var2, (double)this.field_102939_m + 0.5D, var4, "random.chestopen", 0.5F, this.field_102940_k.field_109577_u.nextFloat() * 0.1F + 0.9F);
      }

      if(this.field_103024_h == 0 && this.field_103016_f > 0.0F || this.field_103024_h > 0 && this.field_103016_f < 1.0F) {
         float var8 = this.field_103016_f;
         if(this.field_103024_h > 0) {
            this.field_103016_f += var1;
         } else {
            this.field_103016_f -= var1;
         }

         if(this.field_103016_f > 1.0F) {
            this.field_103016_f = 1.0F;
         }

         float var3 = 0.5F;
         if(this.field_103016_f < var3 && var8 >= var3 && this.field_103020_b == null && this.field_103018_d == null) {
            var4 = (double)this.field_102938_l + 0.5D;
            double var6 = (double)this.field_102936_n + 0.5D;
            if(this.field_103019_e != null) {
               var6 += 0.5D;
            }

            if(this.field_103021_c != null) {
               var4 += 0.5D;
            }

            this.field_102940_k.func_109476_a(var4, (double)this.field_102939_m + 0.5D, var6, "random.chestclosed", 0.5F, this.field_102940_k.field_109577_u.nextFloat() * 0.1F + 0.9F);
         }

         if(this.field_103016_f < 0.0F) {
            this.field_103016_f = 0.0F;
         }
      }

   }

   public void func_102918_b(int var1, int var2) {
      if(var1 == 1) {
         this.field_103024_h = var2;
      }

   }

   public void func_103004_l_() {
      ++this.field_103024_h;
      this.field_102940_k.func_109467_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, C_100451_alf.field_106216_ax.field_106162_cm, 1, this.field_103024_h);
   }

   public void func_103009_f() {
      --this.field_103024_h;
      this.field_102940_k.func_109467_c(this.field_102938_l, this.field_102939_m, this.field_102936_n, C_100451_alf.field_106216_ax.field_106162_cm, 1, this.field_103024_h);
   }

   public void func_102920_w_() {
      this.func_102931_h();
      this.func_103015_i();
      super.func_102920_w_();
   }
}
