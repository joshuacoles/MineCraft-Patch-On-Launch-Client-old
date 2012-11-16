
public class C_101047_si extends C_100992_tt {

   public C_101047_si(int var1) {
      super(var1);
      this.field_110888_cg = 1;
      this.func_110804_e(384);
      this.func_110802_a(C_101040_sq.field_111424_j);
   }

   public void func_110778_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3, int var4) {
      boolean var5 = var3.field_103869_cf.field_111597_d || C_100878_wh.func_110594_a(C_100904_wf.field_110633_w.field_110643_x, var1) > 0;
      if(var5 || var3.field_103857_bK.func_104816_e(C_100992_tt.field_110840_l.field_110891_cf)) {
         int var6 = this.func_110769_a(var1) - var4;
         float var7 = (float)var6 / 20.0F;
         var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;
         if((double)var7 < 0.1D) {
            return;
         }

         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         C_101089_qi var8 = new C_101089_qi(var2, var3, var7 * 2.0F);
         if(var7 == 1.0F) {
            var8.func_104667_e(true);
         }

         int var9 = C_100878_wh.func_110594_a(C_100904_wf.field_110636_t.field_110643_x, var1);
         if(var9 > 0) {
            var8.func_104665_b(var8.func_104668_c() + (double)var9 * 0.5D + 0.5D);
         }

         int var10 = C_100878_wh.func_110594_a(C_100904_wf.field_110635_u.field_110643_x, var1);
         if(var10 > 0) {
            var8.func_104666_a(var10);
         }

         if(C_100878_wh.func_110594_a(C_100904_wf.field_110634_v.field_110643_x, var1) > 0) {
            var8.func_103112_c(100);
         }

         var1.func_111363_a(1, var3);
         var2.func_109412_a(var3, "random.bow", 1.0F, 1.0F / (field_110833_d.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);
         if(var5) {
            var8.field_104676_a = 2;
         } else {
            var3.field_103857_bK.func_104802_d(C_100992_tt.field_110840_l.field_110891_cf);
         }

         if(!var2.field_109557_J) {
            var2.func_109513_d(var8);
         }
      }

   }

   public C_100994_tv func_110792_b(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      return var1;
   }

   public int func_110769_a(C_100994_tv var1) {
      return 72000;
   }

   public C_100943_uw func_110777_d_(C_100994_tv var1) {
      return C_100943_uw.field_111098_e;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      if(var3.field_103869_cf.field_111597_d || var3.field_103857_bK.func_104816_e(C_100992_tt.field_110840_l.field_110891_cf)) {
         var3.func_103784_a(var1, this.func_110769_a(var1));
      }

      return var1;
   }

   public int func_110768_c() {
      return 1;
   }
}
