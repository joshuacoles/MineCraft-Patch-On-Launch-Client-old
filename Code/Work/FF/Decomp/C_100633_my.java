
public class C_100633_my extends C_100621_mm {

   private C_100598_ls field_108175_a;
   private C_100595_ln field_108173_b;
   private double field_108174_c;
   private double field_108171_d;
   private double field_108172_e;
   private float field_108169_f;
   private float field_108170_g;


   public C_100633_my(C_100598_ls var1, float var2, float var3) {
      this.field_108175_a = var1;
      this.field_108169_f = var2;
      this.field_108170_g = var3;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      this.field_108173_b = this.field_108175_a.func_103335_aF();
      if(this.field_108173_b == null) {
         return false;
      } else if(this.field_108173_b.func_103082_e(this.field_108175_a) > (double)(this.field_108170_g * this.field_108170_g)) {
         return false;
      } else {
         C_100387_amw var1 = C_100512_nz.func_108268_a(this.field_108175_a, 16, 7, this.field_108175_a.field_103229_p.func_109363_R().func_107878_a(this.field_108173_b.field_103221_t, this.field_108173_b.field_103219_u, this.field_108173_b.field_103217_v));
         if(var1 == null) {
            return false;
         } else {
            this.field_108174_c = var1.field_107872_c;
            this.field_108171_d = var1.field_107869_d;
            this.field_108172_e = var1.field_107870_e;
            return true;
         }
      }
   }

   public boolean func_108036_b() {
      return !this.field_108175_a.func_103383_ay().func_108300_f() && this.field_108173_b.func_103143_S() && this.field_108173_b.func_103082_e(this.field_108175_a) < (double)(this.field_108170_g * this.field_108170_g);
   }

   public void func_108029_d() {
      this.field_108173_b = null;
   }

   public void func_108034_c() {
      this.field_108175_a.func_103383_ay().func_108292_a(this.field_108174_c, this.field_108171_d, this.field_108172_e, this.field_108169_f);
   }
}
