
public class C_101051_rr extends C_101075_qy {

   private C_100891_wu field_111520_e;
   private C_101059_rq field_111518_f;
   private final C_100873_xe field_111519_g;


   public C_101051_rr(C_101092_qf var1, C_100891_wu var2, C_100873_xe var3) {
      this.field_111520_e = var2;
      this.field_111519_g = var3;
      this.field_111518_f = new C_101059_rq(var1.field_104828_d, var2);
      this.func_111493_a(new C_101048_rz(this.field_111518_f, 0, 36, 53));
      this.func_111493_a(new C_101048_rz(this.field_111518_f, 1, 62, 53));
      this.func_111493_a(new C_101052_rs(var1.field_104828_d, var2, this.field_111518_f, 2, 120, 53));

      int var4;
      for(var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            this.func_111493_a(new C_101048_rz(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.func_111493_a(new C_101048_rz(var1, var4, 8 + var4 * 18, 142));
      }

   }

   public C_101059_rq func_111517_d() {
      return this.field_111518_f;
   }

   public void func_111507_a(C_101070_re var1) {
      super.func_111507_a(var1);
   }

   public void func_111506_b() {
      super.func_111506_b();
   }

   public void func_111497_a(C_100716_kl var1) {
      this.field_111518_f.func_104787_g();
      super.func_111497_a(var1);
   }

   public void func_111516_b(int var1) {
      this.field_111518_f.func_104788_c(var1);
   }

   public void func_111498_b(int var1, int var2) {}

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111520_e.func_103580_m_() == var1;
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 == 2) {
            if(!this.func_111504_a(var5, 3, 39, true)) {
               return null;
            }

            var4.func_111457_a(var5, var3);
         } else if(var2 != 0 && var2 != 1) {
            if(var2 >= 3 && var2 < 30) {
               if(!this.func_111504_a(var5, 30, 39, false)) {
                  return null;
               }
            } else if(var2 >= 30 && var2 < 39 && !this.func_111504_a(var5, 3, 30, false)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 3, 39, false)) {
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

   public void func_111501_a(C_101095_qg var1) {
      super.func_111501_a(var1);
      this.field_111520_e.func_103583_a_((C_101095_qg)null);
      super.func_111501_a(var1);
      if(!this.field_111519_g.field_109557_J) {
         C_100994_tv var2 = this.field_111518_f.func_103001_a_(0);
         if(var2 != null) {
            var1.func_103767_c(var2);
         }

         var2 = this.field_111518_f.func_103001_a_(1);
         if(var2 != null) {
            var1.func_103767_c(var2);
         }

      }
   }
}
