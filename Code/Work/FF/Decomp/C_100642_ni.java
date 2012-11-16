
public class C_100642_ni extends C_100621_mm {

   private C_100598_ls field_108216_a;
   private C_100529_oa field_108215_b;


   public C_100642_ni(C_100598_ls var1) {
      this.field_108216_a = var1;
   }

   public boolean func_108033_a() {
      if(this.field_108216_a.field_103229_p.func_109402_t()) {
         return false;
      } else {
         C_100531_ob var1 = this.field_108216_a.field_103229_p.field_109550_C.func_107279_a(C_100650_jv.func_108910_c(this.field_108216_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108216_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108216_a.field_103217_v), 16);
         if(var1 == null) {
            return false;
         } else {
            this.field_108215_b = var1.func_108633_b(C_100650_jv.func_108910_c(this.field_108216_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108216_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108216_a.field_103217_v));
            return this.field_108215_b == null?false:(double)this.field_108215_b.func_108590_c(C_100650_jv.func_108910_c(this.field_108216_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108216_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108216_a.field_103217_v)) < 2.25D;
         }
      }
   }

   public boolean func_108036_b() {
      return this.field_108216_a.field_103229_p.func_109402_t()?false:!this.field_108215_b.field_108597_g && this.field_108215_b.func_108588_a(C_100650_jv.func_108910_c(this.field_108216_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108216_a.field_103217_v));
   }

   public void func_108034_c() {
      this.field_108216_a.func_103383_ay().func_108298_b(false);
      this.field_108216_a.func_103383_ay().func_108290_c(false);
   }

   public void func_108029_d() {
      this.field_108216_a.func_103383_ay().func_108298_b(true);
      this.field_108216_a.func_103383_ay().func_108290_c(true);
      this.field_108215_b = null;
   }

   public void func_108031_e() {
      this.field_108215_b.func_108591_e();
   }
}
