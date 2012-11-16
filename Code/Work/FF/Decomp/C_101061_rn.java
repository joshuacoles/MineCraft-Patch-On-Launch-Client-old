
public class C_101061_rn extends C_101075_qy {

   public C_101068_rg field_111537_e = new C_101068_rg(this, 2, 2);
   public C_100716_kl field_111535_f = new C_101057_rx();
   public boolean field_111536_g = false;
   private final C_101095_qg field_111538_h;


   public C_101061_rn(C_101092_qf var1, boolean var2, C_101095_qg var3) {
      this.field_111536_g = var2;
      this.field_111538_h = var3;
      this.func_111493_a(new C_101058_ry(var1.field_104828_d, this.field_111537_e, this.field_111535_f, 0, 144, 36));

      int var4;
      int var5;
      for(var4 = 0; var4 < 2; ++var4) {
         for(var5 = 0; var5 < 2; ++var5) {
            this.func_111493_a(new C_101048_rz(this.field_111537_e, var5 + var4 * 2, 88 + var5 * 18, 26 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 4; ++var4) {
         this.func_111493_a(new C_101060_ro(this, var1, var1.func_103003_k_() - 1 - var4, 8, 8 + var4 * 18, var4));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.func_111493_a(new C_101048_rz(var1, var5 + (var4 + 1) * 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.func_111493_a(new C_101048_rz(var1, var4, 8 + var4 * 18, 142));
      }

      this.func_111497_a(this.field_111537_e);
   }

   public void func_111497_a(C_100716_kl var1) {
      this.field_111535_f.func_103006_a(0, C_100929_vq.func_110737_a().func_110740_a(this.field_111537_e, this.field_111538_h.field_103229_p));
   }

   public void func_111501_a(C_101095_qg var1) {
      super.func_111501_a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         C_100994_tv var3 = this.field_111537_e.func_103001_a_(var2);
         if(var3 != null) {
            var1.func_103767_c(var3);
         }
      }

      this.field_111535_f.func_103006_a(0, (C_100994_tv)null);
   }

   public boolean func_111489_c(C_101095_qg var1) {
      return true;
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 == 0) {
            if(!this.func_111504_a(var5, 9, 45, true)) {
               return null;
            }

            var4.func_111457_a(var5, var3);
         } else if(var2 >= 1 && var2 < 5) {
            if(!this.func_111504_a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var2 >= 5 && var2 < 9) {
            if(!this.func_111504_a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var3.func_111365_b() instanceof C_101042_sc && !((C_101048_rz)this.field_111513_b.get(5 + ((C_101042_sc)var3.func_111365_b()).field_111054_a)).func_111453_d()) {
            int var6 = 5 + ((C_101042_sc)var3.func_111365_b()).field_111054_a;
            if(!this.func_111504_a(var5, var6, var6 + 1, false)) {
               return null;
            }
         } else if(var2 >= 9 && var2 < 36) {
            if(!this.func_111504_a(var5, 36, 45, false)) {
               return null;
            }
         } else if(var2 >= 36 && var2 < 45) {
            if(!this.func_111504_a(var5, 9, 36, false)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 9, 45, false)) {
            return null;
         }

         if(var5.field_111398_a == 0) {
            var4.func_111447_c((C_100994_tv)null);
         } else {
            var4.func_111454_e();
         }

         if(var5.field_111398_a == var3.field_111398_a) {
            return null;
         }

         var4.func_111452_a(var1, var5);
      }

      return var3;
   }
}
