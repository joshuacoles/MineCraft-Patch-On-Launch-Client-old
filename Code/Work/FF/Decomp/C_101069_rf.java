
public class C_101069_rf extends C_101075_qy {

   private C_100716_kl field_111558_e;
   private int field_111557_f;


   public C_101069_rf(C_100716_kl var1, C_100716_kl var2) {
      this.field_111558_e = var2;
      this.field_111557_f = var2.func_103003_k_() / 9;
      var2.func_103004_l_();
      int var3 = (this.field_111557_f - 4) * 18;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field_111557_f; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.func_111493_a(new C_101048_rz(var2, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.func_111493_a(new C_101048_rz(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 103 + var4 * 18 + var3));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.func_111493_a(new C_101048_rz(var1, var4, 8 + var4 * 18, 161 + var3));
      }

   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111558_e.func_103010_a(var1);
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 < this.field_111557_f * 9) {
            if(!this.func_111504_a(var5, this.field_111557_f * 9, this.field_111513_b.size(), true)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 0, this.field_111557_f * 9, false)) {
            return null;
         }

         if(var5.field_111398_a == 0) {
            var4.func_111447_c((C_100994_tv)null);
         } else {
            var4.func_111454_e();
         }
      }

      return var3;
   }

   public void func_111501_a(C_101095_qg var1) {
      super.func_111501_a(var1);
      this.field_111558_e.func_103009_f();
   }
}
