import java.util.Random;

public class C_100440_alk extends C_100451_alf {

   public C_100440_alk(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109024_t);
      this.func_106034_a(C_101040_sq.field_111415_d);
   }

   public int func_106024_a(int var1) {
      return var1 == 0?this.field_106165_cl + 2:(var1 == 1?this.field_106165_cl + 1:this.field_106165_cl);
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      if(var1.func_109425_z(var2, var3, var4)) {
         this.func_106020_c(var1, var2, var3, var4, 1);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && C_100451_alf.field_106118_p[var5].func_106028_i() && var1.func_109425_z(var2, var3, var4)) {
         this.func_106020_c(var1, var2, var3, var4, 1);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public int func_106063_a(Random var1) {
      return 1;
   }

   public void func_105999_k(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J) {
         C_100591_pi var5 = new C_100591_pi(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
         var5.field_103284_a = var1.field_109577_u.nextInt(var5.field_103284_a / 4) + var5.field_103284_a / 8;
         var1.func_109513_d(var5);
      }
   }

   public void func_106020_c(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         if((var5 & 1) == 1) {
            C_100591_pi var6 = new C_100591_pi(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
            var1.func_109513_d(var6);
            var1.func_109412_a(var6, "random.fuse", 1.0F, 1.0F);
         }

      }
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var5.func_103780_bP() != null && var5.func_103780_bP().field_111397_c == C_100992_tt.field_110845_i.field_110891_cf) {
         this.func_106020_c(var1, var2, var3, var4, 1);
         var1.func_109422_e(var2, var3, var4, 0);
         return true;
      } else {
         return super.func_106070_a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(var5 instanceof C_101089_qi && !var1.field_109557_J) {
         C_101089_qi var6 = (C_101089_qi)var5;
         if(var6.func_103149_af()) {
            this.func_106020_c(var1, var2, var3, var4, 1);
            var1.func_109422_e(var2, var3, var4, 0);
         }
      }

   }
}
