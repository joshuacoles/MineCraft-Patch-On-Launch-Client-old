
public class C_101062_rm extends C_101048_rz {

   private C_101095_qg field_111480_a;
   private int field_111479_b;


   public C_101062_rm(C_101095_qg var1, C_100716_kl var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field_111480_a = var1;
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return false;
   }

   public C_100994_tv func_111445_a(int var1) {
      if(this.func_111453_d()) {
         this.field_111479_b += Math.min(var1, this.func_111446_c().field_111398_a);
      }

      return super.func_111445_a(var1);
   }

   public void func_111452_a(C_101095_qg var1, C_100994_tv var2) {
      this.func_111449_b(var2);
      super.func_111452_a(var1, var2);
   }

   protected void func_111448_a(C_100994_tv var1, int var2) {
      this.field_111479_b += var2;
      this.func_111449_b(var1);
   }

   protected void func_111449_b(C_100994_tv var1) {
      var1.func_111366_a(this.field_111480_a.field_103229_p, this.field_111480_a, this.field_111479_b);
      if(!this.field_111480_a.field_103229_p.field_109557_J) {
         int var2 = this.field_111479_b;
         float var3 = C_100908_vm.func_110691_a().func_110693_c(var1.field_111397_c);
         int var4;
         if(var3 == 0.0F) {
            var2 = 0;
         } else if(var3 < 1.0F) {
            var4 = C_100650_jv.func_108933_d((float)var2 * var3);
            if(var4 < C_100650_jv.func_108921_f((float)var2 * var3) && (float)Math.random() < (float)var2 * var3 - (float)var4) {
               ++var4;
            }

            var2 = var4;
         }

         while(var2 > 0) {
            var4 = C_100722_lj.func_104589_a(var2);
            var2 -= var4;
            this.field_111480_a.field_103229_p.func_109513_d(new C_100722_lj(this.field_111480_a.field_103229_p, this.field_111480_a.field_103221_t, this.field_111480_a.field_103219_u + 0.5D, this.field_111480_a.field_103217_v + 0.5D, var4));
         }
      }

      this.field_111479_b = 0;
      if(var1.field_111397_c == C_100992_tt.field_110839_o.field_110891_cf) {
         this.field_111480_a.func_103813_a(C_100822_iy.field_110069_k, 1);
      }

      if(var1.field_111397_c == C_100992_tt.field_110901_aV.field_110891_cf) {
         this.field_111480_a.func_103813_a(C_100822_iy.field_110079_p, 1);
      }

   }
}
