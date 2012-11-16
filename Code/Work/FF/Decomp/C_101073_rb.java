import java.util.Iterator;

public class C_101073_rb extends C_101075_qy {

   private C_100424_ama field_111561_e;
   private final C_101048_rz field_111559_f;
   private int field_111560_g = 0;


   public C_101073_rb(C_101092_qf var1, C_100424_ama var2) {
      this.field_111561_e = var2;
      this.func_111493_a(new C_101071_rd(var1.field_104828_d, var2, 0, 56, 46));
      this.func_111493_a(new C_101071_rd(var1.field_104828_d, var2, 1, 79, 53));
      this.func_111493_a(new C_101071_rd(var1.field_104828_d, var2, 2, 102, 46));
      this.field_111559_f = this.func_111493_a(new C_101072_rc(this, var2, 3, 79, 17));

      int var3;
      for(var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.func_111493_a(new C_101048_rz(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.func_111493_a(new C_101048_rz(var1, var3, 8 + var3 * 18, 142));
      }

   }

   public void func_111507_a(C_101070_re var1) {
      super.func_111507_a(var1);
      var1.func_103874_a(this, 0, this.field_111561_e.func_103031_x_());
   }

   public void func_111506_b() {
      super.func_111506_b();
      Iterator var1 = this.field_111511_d.iterator();

      while(var1.hasNext()) {
         C_101070_re var2 = (C_101070_re)var1.next();
         if(this.field_111560_g != this.field_111561_e.func_103031_x_()) {
            var2.func_103874_a(this, 0, this.field_111561_e.func_103031_x_());
         }
      }

      this.field_111560_g = this.field_111561_e.func_103031_x_();
   }

   public void func_111498_b(int var1, int var2) {
      if(var1 == 0) {
         this.field_111561_e.func_103030_c(var2);
      }

   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111561_e.func_103010_a(var1);
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if((var2 < 0 || var2 > 2) && var2 != 3) {
            if(!this.field_111559_f.func_111453_d() && this.field_111559_f.func_111458_a(var5)) {
               if(!this.func_111504_a(var5, 3, 4, false)) {
                  return null;
               }
            } else if(C_101071_rd.func_111482_a_(var3)) {
               if(!this.func_111504_a(var5, 0, 3, false)) {
                  return null;
               }
            } else if(var2 >= 4 && var2 < 31) {
               if(!this.func_111504_a(var5, 31, 40, false)) {
                  return null;
               }
            } else if(var2 >= 31 && var2 < 40) {
               if(!this.func_111504_a(var5, 4, 31, false)) {
                  return null;
               }
            } else if(!this.func_111504_a(var5, 4, 40, false)) {
               return null;
            }
         } else {
            if(!this.func_111504_a(var5, 4, 40, true)) {
               return null;
            }

            var4.func_111457_a(var5, var3);
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
