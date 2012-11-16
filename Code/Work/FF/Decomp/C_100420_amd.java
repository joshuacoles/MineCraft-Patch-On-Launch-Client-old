import java.util.Random;

public class C_100420_amd extends C_100398_amm implements C_100716_kl {

   private C_100994_tv[] field_103014_a = new C_100994_tv[9];
   private Random field_103013_b = new Random();


   public int func_103003_k_() {
      return 9;
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_103014_a[var1];
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_103014_a[var1] != null) {
         C_100994_tv var3;
         if(this.field_103014_a[var1].field_111398_a <= var2) {
            var3 = this.field_103014_a[var1];
            this.field_103014_a[var1] = null;
            this.func_102922_d();
            return var3;
         } else {
            var3 = this.field_103014_a[var1].func_111342_a(var2);
            if(this.field_103014_a[var1].field_111398_a == 0) {
               this.field_103014_a[var1] = null;
            }

            this.func_102922_d();
            return var3;
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_103014_a[var1] != null) {
         C_100994_tv var2 = this.field_103014_a[var1];
         this.field_103014_a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public int func_103011_i() {
      int var1 = -1;
      int var2 = 1;

      for(int var3 = 0; var3 < this.field_103014_a.length; ++var3) {
         if(this.field_103014_a[var3] != null && this.field_103013_b.nextInt(var2++) == 0) {
            var1 = var3;
         }
      }

      return var1;
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_103014_a[var1] = var2;
      if(var2 != null && var2.field_111398_a > this.func_103008_c()) {
         var2.field_111398_a = this.func_103008_c();
      }

      this.func_102922_d();
   }

   public int func_103012_a(C_100994_tv var1) {
      for(int var2 = 0; var2 < this.field_103014_a.length; ++var2) {
         if(this.field_103014_a[var2] == null || this.field_103014_a[var2].field_111397_c == 0) {
            this.field_103014_a[var2] = var1;
            return var2;
         }
      }

      return -1;
   }

   public String func_103005_b() {
      return "container.dispenser";
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      C_100339_bp var2 = var1.func_107513_m("Items");
      this.field_103014_a = new C_100994_tv[this.func_103003_k_()];

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         int var5 = var4.func_107524_c("Slot") & 255;
         if(var5 >= 0 && var5 < this.field_103014_a.length) {
            this.field_103014_a[var5] = C_100994_tv.func_111376_a(var4);
         }
      }

   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      C_100339_bp var2 = new C_100339_bp();

      for(int var3 = 0; var3 < this.field_103014_a.length; ++var3) {
         if(this.field_103014_a[var3] != null) {
            C_100353_bh var4 = new C_100353_bh();
            var4.func_107527_a("Slot", (byte)var3);
            this.field_103014_a[var3].func_111344_b(var4);
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

   public void func_103004_l_() {}

   public void func_103009_f() {}
}
