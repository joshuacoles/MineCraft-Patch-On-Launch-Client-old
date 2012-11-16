
public class C_101067_rh extends C_101075_qy {

   public C_101068_rg field_111553_e = new C_101068_rg(this, 3, 3);
   public C_100716_kl field_111551_f = new C_101057_rx();
   private C_100873_xe field_111552_g;
   private int field_111555_h;
   private int field_111556_i;
   private int field_111554_j;


   public C_101067_rh(C_101092_qf var1, C_100873_xe var2, int var3, int var4, int var5) {
      this.field_111552_g = var2;
      this.field_111555_h = var3;
      this.field_111556_i = var4;
      this.field_111554_j = var5;
      this.func_111493_a(new C_101058_ry(var1.field_104828_d, this.field_111553_e, this.field_111551_f, 0, 124, 35));

      int var6;
      int var7;
      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 3; ++var7) {
            this.func_111493_a(new C_101048_rz(this.field_111553_e, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.func_111493_a(new C_101048_rz(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.func_111493_a(new C_101048_rz(var1, var6, 8 + var6 * 18, 142));
      }

      this.func_111497_a(this.field_111553_e);
   }

   public void func_111497_a(C_100716_kl var1) {
      this.field_111551_f.func_103006_a(0, C_100929_vq.func_110737_a().func_110740_a(this.field_111553_e, this.field_111552_g));
   }

   public void func_111501_a(C_101095_qg var1) {
      super.func_111501_a(var1);
      if(!this.field_111552_g.field_109557_J) {
         for(int var2 = 0; var2 < 9; ++var2) {
            C_100994_tv var3 = this.field_111553_e.func_103001_a_(var2);
            if(var3 != null) {
               var1.func_103767_c(var3);
            }
         }

      }
   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111552_g.func_109349_a(this.field_111555_h, this.field_111556_i, this.field_111554_j) != C_100451_alf.field_106194_aB.field_106162_cm?false:var1.func_103146_e((double)this.field_111555_h + 0.5D, (double)this.field_111556_i + 0.5D, (double)this.field_111554_j + 0.5D) <= 64.0D;
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 == 0) {
            if(!this.func_111504_a(var5, 10, 46, true)) {
               return null;
            }

            var4.func_111457_a(var5, var3);
         } else if(var2 >= 10 && var2 < 37) {
            if(!this.func_111504_a(var5, 37, 46, false)) {
               return null;
            }
         } else if(var2 >= 37 && var2 < 46) {
            if(!this.func_111504_a(var5, 10, 37, false)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 10, 46, false)) {
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
