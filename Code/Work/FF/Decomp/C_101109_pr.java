
public class C_101109_pr extends C_101100_px {

   public C_101109_pr(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/lava.png";
      this.field_103239_af = true;
      this.field_103439_aM = 0.2F;
   }

   public boolean func_103380_bp() {
      return this.field_103229_p.field_109578_t > 0 && this.field_103229_p.func_109410_b(this.field_103173_D) && this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty() && !this.field_103229_p.func_109413_d(this.field_103173_D);
   }

   public int func_103350_aU() {
      return this.func_103624_p() * 3;
   }

   public int func_103125_b(float var1) {
      return 15728880;
   }

   public float func_103057_c(float var1) {
      return 1.0F;
   }

   protected String func_103623_h() {
      return "flame";
   }

   protected C_101100_px func_103626_i() {
      return new C_101109_pr(this.field_103229_p);
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110863_bx.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.func_103377_aZ();
      if(var3 > 0 && this.func_103624_p() > 1) {
         int var4 = this.field_103232_aa.nextInt(4) - 2;
         if(var2 > 0) {
            var4 += this.field_103232_aa.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.func_103111_b(var3, 1);
         }
      }

   }

   public boolean func_103149_af() {
      return false;
   }

   protected int func_103625_j() {
      return super.func_103625_j() * 4;
   }

   protected void func_103619_k() {
      this.field_103632_b *= 0.9F;
   }

   protected void func_103343_bf() {
      this.field_103240_x = (double)(0.42F + (float)this.func_103624_p() * 0.1F);
      this.field_103226_am = true;
   }

   protected void func_103124_a(float var1) {}

   protected boolean func_103629_l() {
      return true;
   }

   protected int func_103628_m() {
      return super.func_103628_m() + 2;
   }

   protected String func_103387_aX() {
      return "mob.slime." + (this.func_103624_p() > 1?"big":"small");
   }

   protected String func_103307_aY() {
      return "mob.slime." + (this.func_103624_p() > 1?"big":"small");
   }

   protected String func_103627_n() {
      return this.func_103624_p() > 1?"mob.magmacube.big":"mob.magmacube.small";
   }

   public boolean func_103115_J() {
      return false;
   }

   protected boolean func_103622_o() {
      return true;
   }
}
