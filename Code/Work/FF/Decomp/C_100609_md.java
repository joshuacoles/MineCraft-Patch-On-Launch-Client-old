
public class C_100609_md extends C_100612_mg {

   private int field_108077_i;
   private int field_108076_j = -1;


   public C_100609_md(C_100595_ln var1) {
      super(var1);
   }

   public boolean func_108033_a() {
      return !super.func_108033_a()?false:(!this.field_108074_a.field_103229_p.func_109389_K().func_110281_b("mobGriefing")?false:!this.field_108071_e.func_106320_a_(this.field_108074_a.field_103229_p, this.field_108072_b, this.field_108073_c, this.field_108070_d));
   }

   public void func_108034_c() {
      super.func_108034_c();
      this.field_108077_i = 0;
   }

   public boolean func_108036_b() {
      double var1 = this.field_108074_a.func_103146_e((double)this.field_108072_b, (double)this.field_108073_c, (double)this.field_108070_d);
      return this.field_108077_i <= 240 && !this.field_108071_e.func_106320_a_(this.field_108074_a.field_103229_p, this.field_108072_b, this.field_108073_c, this.field_108070_d) && var1 < 4.0D;
   }

   public void func_108029_d() {
      super.func_108029_d();
      this.field_108074_a.field_103229_p.func_109420_g(this.field_108074_a.field_103212_k, this.field_108072_b, this.field_108073_c, this.field_108070_d, -1);
   }

   public void func_108031_e() {
      super.func_108031_e();
      if(this.field_108074_a.func_103312_aA().nextInt(20) == 0) {
         this.field_108074_a.field_103229_p.func_109448_f(1010, this.field_108072_b, this.field_108073_c, this.field_108070_d, 0);
      }

      ++this.field_108077_i;
      int var1 = (int)((float)this.field_108077_i / 240.0F * 10.0F);
      if(var1 != this.field_108076_j) {
         this.field_108074_a.field_103229_p.func_109420_g(this.field_108074_a.field_103212_k, this.field_108072_b, this.field_108073_c, this.field_108070_d, var1);
         this.field_108076_j = var1;
      }

      if(this.field_108077_i == 240 && this.field_108074_a.field_103229_p.field_109578_t == 3) {
         this.field_108074_a.field_103229_p.func_109422_e(this.field_108072_b, this.field_108073_c, this.field_108070_d, 0);
         this.field_108074_a.field_103229_p.func_109448_f(1012, this.field_108072_b, this.field_108073_c, this.field_108070_d, 0);
         this.field_108074_a.field_103229_p.func_109448_f(2001, this.field_108072_b, this.field_108073_c, this.field_108070_d, this.field_108071_e.field_106162_cm);
      }

   }
}
