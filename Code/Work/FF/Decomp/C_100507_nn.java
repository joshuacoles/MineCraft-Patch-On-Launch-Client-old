
public class C_100507_nn extends C_100621_mm {

   private C_100598_ls field_108046_a;
   private float field_108044_b;
   private double field_108045_c;
   private double field_108042_d;
   private double field_108043_e;
   private double field_108040_f;
   private double field_108041_g;
   private C_101095_qg field_108051_h;
   private int field_108052_i = 0;
   private boolean field_108049_j;
   private int field_108050_k;
   private boolean field_108047_l;
   private boolean field_108048_m;


   public C_100507_nn(C_100598_ls var1, float var2, int var3, boolean var4) {
      this.field_108046_a = var1;
      this.field_108044_b = var2;
      this.field_108050_k = var3;
      this.field_108047_l = var4;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      if(this.field_108052_i > 0) {
         --this.field_108052_i;
         return false;
      } else {
         this.field_108051_h = this.field_108046_a.field_103229_p.func_109503_a(this.field_108046_a, 10.0D);
         if(this.field_108051_h == null) {
            return false;
         } else {
            C_100994_tv var1 = this.field_108051_h.func_103780_bP();
            return var1 == null?false:var1.field_111397_c == this.field_108050_k;
         }
      }
   }

   public boolean func_108036_b() {
      if(this.field_108047_l) {
         if(this.field_108046_a.func_103082_e(this.field_108051_h) < 36.0D) {
            if(this.field_108051_h.func_103146_e(this.field_108045_c, this.field_108042_d, this.field_108043_e) > 0.010000000000000002D) {
               return false;
            }

            if(Math.abs((double)this.field_108051_h.field_103177_A - this.field_108040_f) > 5.0D || Math.abs((double)this.field_108051_h.field_103236_z - this.field_108041_g) > 5.0D) {
               return false;
            }
         } else {
            this.field_108045_c = this.field_108051_h.field_103221_t;
            this.field_108042_d = this.field_108051_h.field_103219_u;
            this.field_108043_e = this.field_108051_h.field_103217_v;
         }

         this.field_108040_f = (double)this.field_108051_h.field_103177_A;
         this.field_108041_g = (double)this.field_108051_h.field_103236_z;
      }

      return this.func_108033_a();
   }

   public void func_108034_c() {
      this.field_108045_c = this.field_108051_h.field_103221_t;
      this.field_108042_d = this.field_108051_h.field_103219_u;
      this.field_108043_e = this.field_108051_h.field_103217_v;
      this.field_108049_j = true;
      this.field_108048_m = this.field_108046_a.func_103383_ay().func_108287_a();
      this.field_108046_a.func_103383_ay().func_108291_a(false);
   }

   public void func_108029_d() {
      this.field_108051_h = null;
      this.field_108046_a.func_103383_ay().func_108299_g();
      this.field_108052_i = 100;
      this.field_108049_j = false;
      this.field_108046_a.func_103383_ay().func_108291_a(this.field_108048_m);
   }

   public void func_108031_e() {
      this.field_108046_a.func_103289_av().func_108861_a(this.field_108051_h, 30.0F, (float)this.field_108046_a.func_103290_bm());
      if(this.field_108046_a.func_103082_e(this.field_108051_h) < 6.25D) {
         this.field_108046_a.func_103383_ay().func_108299_g();
      } else {
         this.field_108046_a.func_103383_ay().func_108295_a(this.field_108051_h, this.field_108044_b);
      }

   }

   public boolean func_108039_f() {
      return this.field_108049_j;
   }
}
