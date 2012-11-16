
public class C_100037_bbf extends C_100061_bae {

   private C_101235_avh field_105423_o;
   private C_101241_awd field_105421_p;
   protected C_101235_avh field_105426_k;
   protected C_101235_avh field_105424_l;
   protected C_101235_avh field_105425_m;
   protected C_101235_avh field_105422_n;
   private int field_105420_q = 1;


   public C_100037_bbf() {
      super(new C_101260_awh(), 0.5F, 1.0F);
      this.field_105423_o = this.field_105412_a;
      this.field_105421_p = new C_101241_awd();
   }

   protected void func_105408_b() {
      this.field_105411_g = new C_101260_awh(1.0F, true);
      this.field_105414_h = new C_101260_awh(0.5F, true);
      this.field_105426_k = this.field_105411_g;
      this.field_105424_l = this.field_105414_h;
      this.field_105425_m = new C_101241_awd(1.0F, 0.0F, true);
      this.field_105422_n = new C_101241_awd(0.5F, 0.0F, true);
   }

   protected int func_105419_a(C_101097_qa var1, int var2, float var3) {
      this.func_105417_a(var1);
      return super.func_105375_a(var1, var2, var3);
   }

   public void func_105416_a(C_101097_qa var1, double var2, double var4, double var6, float var8, float var9) {
      this.func_105417_a(var1);
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected void func_105415_a(C_101097_qa var1, float var2) {
      this.func_105417_a(var1);
      super.func_105372_c(var1, var2);
   }

   private void func_105417_a(C_101097_qa var1) {
      if(var1.func_103746_m()) {
         if(this.field_105420_q != this.field_105421_p.func_112105_a()) {
            this.field_105421_p = new C_101241_awd();
            this.field_105420_q = this.field_105421_p.func_112105_a();
            this.field_105425_m = new C_101241_awd(1.0F, 0.0F, true);
            this.field_105422_n = new C_101241_awd(0.5F, 0.0F, true);
         }

         this.field_105380_i = this.field_105421_p;
         this.field_105411_g = this.field_105425_m;
         this.field_105414_h = this.field_105422_n;
      } else {
         this.field_105380_i = this.field_105423_o;
         this.field_105411_g = this.field_105426_k;
         this.field_105414_h = this.field_105424_l;
      }

      this.field_105412_a = (C_101235_avh)this.field_105380_i;
   }

   protected void func_105418_a(C_101097_qa var1, float var2, float var3, float var4) {
      if(var1.func_103745_o()) {
         var3 += (float)(Math.cos((double)var1.field_103233_ab * 3.25D) * 3.141592653589793D * 0.25D);
      }

      super.func_105365_a(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   protected void func_105372_c(C_100595_ln var1, float var2) {
      this.func_105415_a((C_101097_qa)var1, var2);
   }
}
