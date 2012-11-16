import java.util.ArrayList;
import java.util.List;

class C_101348_aue extends C_101075_qy {

   public List field_111570_e = new ArrayList();


   public C_101348_aue(C_101095_qg var1) {
      C_101092_qf var2 = var1.field_103857_bK;

      int var3;
      for(var3 = 0; var3 < 5; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.func_111493_a(new C_101048_rz(C_101346_aud.func_104463_h(), var3 * 9 + var4, 9 + var4 * 18, 18 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.func_111493_a(new C_101048_rz(var2, var3, 9 + var3 * 18, 112));
      }

      this.func_111568_a(0.0F);
   }

   public boolean func_111489_c(C_101095_qg var1) {
      return true;
   }

   public void func_111568_a(float var1) {
      int var2 = this.field_111570_e.size() / 9 - 5 + 1;
      int var3 = (int)((double)(var1 * (float)var2) + 0.5D);
      if(var3 < 0) {
         var3 = 0;
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            int var6 = var5 + (var4 + var3) * 9;
            if(var6 >= 0 && var6 < this.field_111570_e.size()) {
               C_101346_aud.func_104463_h().func_103006_a(var5 + var4 * 9, (C_100994_tv)this.field_111570_e.get(var6));
            } else {
               C_101346_aud.func_104463_h().func_103006_a(var5 + var4 * 9, (C_100994_tv)null);
            }
         }
      }

   }

   public boolean func_111569_d() {
      return this.field_111570_e.size() > 45;
   }

   protected void func_111494_a(int var1, int var2, boolean var3, C_101095_qg var4) {}

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      if(var2 >= this.field_111513_b.size() - 9 && var2 < this.field_111513_b.size()) {
         C_101048_rz var3 = (C_101048_rz)this.field_111513_b.get(var2);
         if(var3 != null && var3.func_111453_d()) {
            var3.func_111447_c((C_100994_tv)null);
         }
      }

      return null;
   }
}
