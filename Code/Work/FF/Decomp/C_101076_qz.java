
public class C_101076_qz extends C_101075_qy {

   private C_100425_alz field_111565_e;
   private final C_101074_ra field_111563_f;
   private int field_111564_g;
   private int field_111566_h;
   private int field_111567_i;


   public C_101076_qz(C_101092_qf var1, C_100425_alz var2) {
      this.field_111565_e = var2;
      this.func_111493_a(this.field_111563_f = new C_101074_ra(this, var2, 0, 136, 110));
      byte var3 = 36;
      short var4 = 137;

      int var5;
      for(var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 9; ++var6) {
            this.func_111493_a(new C_101048_rz(var1, var6 + var5 * 9 + 9, var3 + var6 * 18, var4 + var5 * 18));
         }
      }

      for(var5 = 0; var5 < 9; ++var5) {
         this.func_111493_a(new C_101048_rz(var1, var5, var3 + var5 * 18, 58 + var4));
      }

      this.field_111564_g = var2.func_103042_k();
      this.field_111566_h = var2.func_103038_i();
      this.field_111567_i = var2.func_103044_j();
   }

   public void func_111507_a(C_101070_re var1) {
      super.func_111507_a(var1);
      var1.func_103874_a(this, 0, this.field_111564_g);
      var1.func_103874_a(this, 1, this.field_111566_h);
      var1.func_103874_a(this, 2, this.field_111567_i);
   }

   public void func_111506_b() {
      super.func_111506_b();
   }

   public void func_111498_b(int var1, int var2) {
      if(var1 == 0) {
         this.field_111565_e.func_103041_c(var2);
      }

      if(var1 == 1) {
         this.field_111565_e.func_103040_d(var2);
      }

      if(var1 == 2) {
         this.field_111565_e.func_103039_e(var2);
      }

   }

   public C_100425_alz func_111562_d() {
      return this.field_111565_e;
   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111565_e.func_103010_a(var1);
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 == 0) {
            if(!this.func_111504_a(var5, 1, 37, true)) {
               return null;
            }

            var4.func_111457_a(var5, var3);
         } else if(!this.field_111563_f.func_111453_d() && this.field_111563_f.func_111458_a(var5) && var5.field_111398_a == 1) {
            if(!this.func_111504_a(var5, 0, 1, false)) {
               return null;
            }
         } else if(var2 >= 1 && var2 < 28) {
            if(!this.func_111504_a(var5, 28, 37, false)) {
               return null;
            }
         } else if(var2 >= 28 && var2 < 37) {
            if(!this.func_111504_a(var5, 1, 28, false)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 1, 37, false)) {
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
