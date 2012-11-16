
public class C_101077_qx {

   private int field_111588_a = 20;
   private float field_111586_b = 5.0F;
   private float field_111587_c;
   private int field_111584_d = 0;
   private int field_111585_e = 20;


   public void func_111583_a(int var1, float var2) {
      this.field_111588_a = Math.min(var1 + this.field_111588_a, 20);
      this.field_111586_b = Math.min(this.field_111586_b + (float)var1 * var2 * 2.0F, (float)this.field_111588_a);
   }

   public void func_111574_a(C_101006_to var1) {
      this.func_111583_a(var1.func_111010_g(), var1.func_111007_h());
   }

   public void func_111573_a(C_101095_qg var1) {
      int var2 = var1.field_103229_p.field_109578_t;
      this.field_111585_e = this.field_111588_a;
      if(this.field_111587_c > 4.0F) {
         this.field_111587_c -= 4.0F;
         if(this.field_111586_b > 0.0F) {
            this.field_111586_b = Math.max(this.field_111586_b - 1.0F, 0.0F);
         } else if(var2 > 0) {
            this.field_111588_a = Math.max(this.field_111588_a - 1, 0);
         }
      }

      if(this.field_111588_a >= 18 && var1.func_103827_ca()) {
         ++this.field_111584_d;
         if(this.field_111584_d >= 80) {
            var1.func_103392_i(1);
            this.field_111584_d = 0;
         }
      } else if(this.field_111588_a <= 0) {
         ++this.field_111584_d;
         if(this.field_111584_d >= 80) {
            if(var1.func_103330_aT() > 10 || var2 >= 3 || var1.func_103330_aT() > 1 && var2 >= 2) {
               var1.func_103085_a(C_100698_ks.field_109229_f, 1);
            }

            this.field_111584_d = 0;
         }
      } else {
         this.field_111584_d = 0;
      }

   }

   public void func_111572_a(C_100353_bh var1) {
      if(var1.func_107516_b("foodLevel")) {
         this.field_111588_a = var1.func_107514_e("foodLevel");
         this.field_111584_d = var1.func_107514_e("foodTickTimer");
         this.field_111586_b = var1.func_107512_g("foodSaturationLevel");
         this.field_111587_c = var1.func_107512_g("foodExhaustionLevel");
      }

   }

   public void func_111581_b(C_100353_bh var1) {
      var1.func_107520_a("foodLevel", this.field_111588_a);
      var1.func_107520_a("foodTickTimer", this.field_111584_d);
      var1.func_107529_a("foodSaturationLevel", this.field_111586_b);
      var1.func_107529_a("foodExhaustionLevel", this.field_111587_c);
   }

   public int func_111578_a() {
      return this.field_111588_a;
   }

   public int func_111580_b() {
      return this.field_111585_e;
   }

   public boolean func_111582_c() {
      return this.field_111588_a < 20;
   }

   public void func_111575_a(float var1) {
      this.field_111587_c = Math.min(this.field_111587_c + var1, 40.0F);
   }

   public float func_111577_e() {
      return this.field_111586_b;
   }

   public void func_111576_a(int var1) {
      this.field_111588_a = var1;
   }

   public void func_111579_b(float var1) {
      this.field_111586_b = var1;
   }
}
