
public class C_100644_nk extends C_100621_mm {

   private C_100603_lv field_108220_a;
   private boolean field_108219_b = false;


   public C_100644_nk(C_100603_lv var1) {
      this.field_108220_a = var1;
      this.func_108030_a(5);
   }

   public boolean func_108033_a() {
      if(!this.field_108220_a.func_103552_m()) {
         return false;
      } else if(this.field_108220_a.func_103144_H()) {
         return false;
      } else if(!this.field_108220_a.field_103174_E) {
         return false;
      } else {
         C_100595_ln var1 = this.field_108220_a.func_103554_p();
         return var1 == null?true:(this.field_108220_a.func_103082_e(var1) < 144.0D && var1.func_103286_aB() != null?false:this.field_108219_b);
      }
   }

   public void func_108034_c() {
      this.field_108220_a.func_103383_ay().func_108299_g();
      this.field_108220_a.func_103557_h(true);
   }

   public void func_108029_d() {
      this.field_108220_a.func_103557_h(false);
   }

   public void func_108218_a(boolean var1) {
      this.field_108219_b = var1;
   }
}
