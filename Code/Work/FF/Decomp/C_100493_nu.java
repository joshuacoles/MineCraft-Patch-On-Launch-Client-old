
public class C_100493_nu extends C_100517_nw {

   C_100603_lv field_108249_a;
   C_100595_ln field_108248_b;


   public C_100493_nu(C_100603_lv var1) {
      super(var1, 32.0F, false);
      this.field_108249_a = var1;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(!this.field_108249_a.func_103552_m()) {
         return false;
      } else {
         C_100595_ln var1 = this.field_108249_a.func_103554_p();
         if(var1 == null) {
            return false;
         } else {
            this.field_108248_b = var1.func_103286_aB();
            return this.func_108227_a(this.field_108248_b, false);
         }
      }
   }

   public void func_108034_c() {
      this.field_108231_d.func_103347_b(this.field_108248_b);
      super.func_108034_c();
   }
}
