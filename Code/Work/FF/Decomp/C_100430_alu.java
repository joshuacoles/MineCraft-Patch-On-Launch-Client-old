import java.util.List;

public class C_100430_alu extends C_100253_aht {

   protected C_100430_alu(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.5F;
      float var4 = 0.015625F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var4, 0.5F + var3);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public int func_106013_d() {
      return 23;
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      if(var7 == null || !(var7 instanceof C_100572_pe)) {
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100412_amr.func_107892_a().func_107844_a((double)var2 + this.field_106156_ct, (double)var3 + this.field_106155_cu, (double)var4 + this.field_106154_cv, (double)var2 + this.field_106153_cw, (double)var3 + this.field_106152_cx, (double)var4 + this.field_106151_cy);
   }

   public int func_106039_o() {
      return 2129968;
   }

   public int func_106025_g_(int var1) {
      return 2129968;
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      return 2129968;
   }

   protected boolean func_106376_d_(int var1) {
      return var1 == C_100451_alf.field_106072_E.field_106162_cm;
   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return var3 >= 0 && var3 < 256?var1.func_109350_f(var2, var3 - 1, var4) == C_100664_afg.field_109019_h && var1.func_109357_g(var2, var3 - 1, var4) == 0:false;
   }
}
