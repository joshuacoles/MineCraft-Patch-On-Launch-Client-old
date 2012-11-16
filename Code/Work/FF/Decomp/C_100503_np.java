
public class C_100503_np extends C_100517_nw {

   C_100557_or field_108245_a;
   C_100595_ln field_108244_b;


   public C_100503_np(C_100557_or var1) {
      super(var1, 16.0F, false, true);
      this.field_108245_a = var1;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      C_100531_ob var1 = this.field_108245_a.func_103681_m();
      if(var1 == null) {
         return false;
      } else {
         this.field_108244_b = var1.func_108607_b(this.field_108245_a);
         if(!this.func_108227_a(this.field_108244_b, false)) {
            if(this.field_108231_d.func_103312_aA().nextInt(20) == 0) {
               this.field_108244_b = var1.func_108612_c(this.field_108245_a);
               return this.func_108227_a(this.field_108244_b, false);
            } else {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   public void func_108034_c() {
      this.field_108245_a.func_103347_b(this.field_108244_b);
      super.func_108034_c();
   }
}
