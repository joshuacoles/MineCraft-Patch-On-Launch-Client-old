
public class C_100635_nb extends C_100621_mm {

   private C_100557_or field_108188_a;
   private C_101098_qd field_108186_b;
   private int field_108187_c;


   public C_100635_nb(C_100557_or var1) {
      this.field_108188_a = var1;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      if(!this.field_108188_a.field_103229_p.func_109402_t()) {
         return false;
      } else if(this.field_108188_a.func_103312_aA().nextInt(8000) != 0) {
         return false;
      } else {
         this.field_108186_b = (C_101098_qd)this.field_108188_a.field_103229_p.func_109406_a(C_101098_qd.class, this.field_108188_a.field_103173_D.func_107895_b(6.0D, 2.0D, 6.0D), this.field_108188_a);
         return this.field_108186_b != null;
      }
   }

   public boolean func_108036_b() {
      return this.field_108187_c > 0;
   }

   public void func_108034_c() {
      this.field_108187_c = 400;
      this.field_108188_a.func_103678_f(true);
   }

   public void func_108029_d() {
      this.field_108188_a.func_103678_f(false);
      this.field_108186_b = null;
   }

   public void func_108031_e() {
      this.field_108188_a.func_103289_av().func_108861_a(this.field_108186_b, 30.0F, 30.0F);
      --this.field_108187_c;
   }
}
