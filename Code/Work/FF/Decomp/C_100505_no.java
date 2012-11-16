
public class C_100505_no extends C_100621_mm {

   private C_101098_qd field_108038_a;


   public C_100505_no(C_101098_qd var1) {
      this.field_108038_a = var1;
      this.func_108030_a(5);
   }

   public boolean func_108033_a() {
      if(!this.field_108038_a.func_103143_S()) {
         return false;
      } else if(this.field_108038_a.func_103144_H()) {
         return false;
      } else if(!this.field_108038_a.field_103174_E) {
         return false;
      } else if(this.field_108038_a.field_103185_I) {
         return false;
      } else {
         C_101095_qg var1 = this.field_108038_a.func_103580_m_();
         return var1 == null?false:(this.field_108038_a.func_103082_e(var1) > 16.0D?false:var1.field_103856_bM instanceof C_101075_qy);
      }
   }

   public void func_108034_c() {
      this.field_108038_a.func_103383_ay().func_108299_g();
   }

   public void func_108029_d() {
      this.field_108038_a.func_103583_a_((C_101095_qg)null);
   }
}
