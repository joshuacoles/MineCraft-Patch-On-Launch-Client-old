import java.util.Iterator;

public class C_101063_rl extends C_101075_qy {

   private C_100419_amg field_111541_e;
   private int field_111539_f = 0;
   private int field_111540_g = 0;
   private int field_111542_h = 0;


   public C_101063_rl(C_101092_qf var1, C_100419_amg var2) {
      this.field_111541_e = var2;
      this.func_111493_a(new C_101048_rz(var2, 0, 56, 17));
      this.func_111493_a(new C_101048_rz(var2, 1, 56, 53));
      this.func_111493_a(new C_101062_rm(var1.field_104828_d, var2, 2, 116, 35));

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
      var1.func_103874_a(this, 0, this.field_111541_e.field_104842_c);
      var1.func_103874_a(this, 1, this.field_111541_e.field_104843_a);
      var1.func_103874_a(this, 2, this.field_111541_e.field_104841_b);
   }

   public void func_111506_b() {
      super.func_111506_b();
      Iterator var1 = this.field_111511_d.iterator();

      while(var1.hasNext()) {
         C_101070_re var2 = (C_101070_re)var1.next();
         if(this.field_111539_f != this.field_111541_e.field_104842_c) {
            var2.func_103874_a(this, 0, this.field_111541_e.field_104842_c);
         }

         if(this.field_111540_g != this.field_111541_e.field_104843_a) {
            var2.func_103874_a(this, 1, this.field_111541_e.field_104843_a);
         }

         if(this.field_111542_h != this.field_111541_e.field_104841_b) {
            var2.func_103874_a(this, 2, this.field_111541_e.field_104841_b);
         }
      }

      this.field_111539_f = this.field_111541_e.field_104842_c;
      this.field_111540_g = this.field_111541_e.field_104843_a;
      this.field_111542_h = this.field_111541_e.field_104841_b;
   }

   public void func_111498_b(int var1, int var2) {
      if(var1 == 0) {
         this.field_111541_e.field_104842_c = var2;
      }

      if(var1 == 1) {
         this.field_111541_e.field_104843_a = var2;
      }

      if(var1 == 2) {
         this.field_111541_e.field_104841_b = var2;
      }

   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111541_e.func_103010_a(var1);
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
         } else if(var2 != 1 && var2 != 0) {
            if(C_100908_vm.func_110691_a().func_110692_b(var5.func_111365_b().field_110891_cf) != null) {
               if(!this.func_111504_a(var5, 0, 1, false)) {
                  return null;
               }
            } else if(C_100419_amg.func_104838_b(var5)) {
               if(!this.func_111504_a(var5, 1, 2, false)) {
                  return null;
               }
            } else if(var2 >= 3 && var2 < 30) {
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
}
