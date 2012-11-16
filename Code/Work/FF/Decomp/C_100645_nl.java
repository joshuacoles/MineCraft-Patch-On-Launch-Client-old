
public class C_100645_nl extends C_100621_mm {

   C_100583_pl field_108222_a;
   C_100595_ln field_108221_b;


   public C_100645_nl(C_100583_pl var1) {
      this.field_108222_a = var1;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      C_100595_ln var1 = this.field_108222_a.func_103335_aF();
      return this.field_108222_a.func_103719_o() > 0 || var1 != null && this.field_108222_a.func_103082_e(var1) < 9.0D;
   }

   public void func_108034_c() {
      this.field_108222_a.func_103383_ay().func_108299_g();
      this.field_108221_b = this.field_108222_a.func_103335_aF();
   }

   public void func_108029_d() {
      this.field_108221_b = null;
   }

   public void func_108031_e() {
      if(this.field_108221_b == null) {
         this.field_108222_a.func_103716_a(-1);
      } else if(this.field_108222_a.func_103082_e(this.field_108221_b) > 49.0D) {
         this.field_108222_a.func_103716_a(-1);
      } else if(!this.field_108222_a.func_103292_az().func_108280_a(this.field_108221_b)) {
         this.field_108222_a.func_103716_a(-1);
      } else {
         this.field_108222_a.func_103716_a(1);
      }
   }
}
