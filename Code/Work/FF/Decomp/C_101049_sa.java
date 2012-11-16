
public class C_101049_sa extends C_101075_qy {

   private C_100420_amd field_111571_e;


   public C_101049_sa(C_100716_kl var1, C_100420_amd var2) {
      this.field_111571_e = var2;

      int var3;
      int var4;
      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 3; ++var4) {
            this.func_111493_a(new C_101048_rz(var2, var4 + var3 * 3, 62 + var4 * 18, 17 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 9; ++var4) {
            this.func_111493_a(new C_101048_rz(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.func_111493_a(new C_101048_rz(var1, var3, 8 + var3 * 18, 142));
      }

   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111571_e.func_103010_a(var1);
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 < 9) {
            if(!this.func_111504_a(var5, 9, 45, true)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 0, 9, false)) {
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
