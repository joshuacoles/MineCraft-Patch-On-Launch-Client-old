
public class C_100636_nc extends C_100612_mg {

   boolean field_108079_i;
   int field_108078_j;


   public C_100636_nc(C_100595_ln var1, boolean var2) {
      super(var1);
      this.field_108074_a = var1;
      this.field_108079_i = var2;
   }

   public boolean func_108036_b() {
      return this.field_108079_i && this.field_108078_j > 0 && super.func_108036_b();
   }

   public void func_108034_c() {
      this.field_108078_j = 20;
      this.field_108071_e.func_106323_a(this.field_108074_a.field_103229_p, this.field_108072_b, this.field_108073_c, this.field_108070_d, true);
   }

   public void func_108029_d() {
      if(this.field_108079_i) {
         this.field_108071_e.func_106323_a(this.field_108074_a.field_103229_p, this.field_108072_b, this.field_108073_c, this.field_108070_d, false);
      }

   }

   public void func_108031_e() {
      --this.field_108078_j;
      super.func_108031_e();
   }
}
