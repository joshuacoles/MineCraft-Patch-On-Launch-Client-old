
public class C_100608_mc extends C_100621_mm {

   private C_100546_ot field_108058_a;
   private C_101095_qg field_108056_b;
   private C_100873_xe field_108057_c;
   private float field_108054_d;
   private int field_108055_e;


   public C_100608_mc(C_100546_ot var1, float var2) {
      this.field_108058_a = var1;
      this.field_108057_c = var1.field_103229_p;
      this.field_108054_d = var2;
      this.func_108030_a(2);
   }

   public boolean func_108033_a() {
      this.field_108056_b = this.field_108057_c.func_109503_a(this.field_108058_a, (double)this.field_108054_d);
      return this.field_108056_b == null?false:this.func_108053_a(this.field_108056_b);
   }

   public boolean func_108036_b() {
      return !this.field_108056_b.func_103143_S()?false:(this.field_108058_a.func_103082_e(this.field_108056_b) > (double)(this.field_108054_d * this.field_108054_d)?false:this.field_108055_e > 0 && this.func_108053_a(this.field_108056_b));
   }

   public void func_108034_c() {
      this.field_108058_a.func_103568_j(true);
      this.field_108055_e = 40 + this.field_108058_a.func_103312_aA().nextInt(40);
   }

   public void func_108029_d() {
      this.field_108058_a.func_103568_j(false);
      this.field_108056_b = null;
   }

   public void func_108031_e() {
      this.field_108058_a.func_103289_av().func_108860_a(this.field_108056_b.field_103221_t, this.field_108056_b.field_103219_u + (double)this.field_108056_b.func_103102_e(), this.field_108056_b.field_103217_v, 10.0F, (float)this.field_108058_a.func_103290_bm());
      --this.field_108055_e;
   }

   private boolean func_108053_a(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      return var2 == null?false:(!this.field_108058_a.func_103552_m() && var2.field_111397_c == C_100992_tt.field_110903_aX.field_110891_cf?true:this.field_108058_a.func_103524_c(var2));
   }
}
