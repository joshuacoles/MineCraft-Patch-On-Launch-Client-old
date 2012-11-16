
public class C_100630_mx extends C_100621_mm {

   private C_100598_ls field_108155_a;
   private double field_108153_b;
   private double field_108154_c;
   private double field_108151_d;
   private float field_108152_e;


   public C_100630_mx(C_100598_ls var1, float var2) {
      this.field_108155_a = var1;
      this.field_108152_e = var2;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(this.field_108155_a.func_103342_aH()) {
         return false;
      } else {
         C_100013_k var1 = this.field_108155_a.func_103359_aI();
         C_100387_amw var2 = C_100512_nz.func_108268_a(this.field_108155_a, 16, 7, this.field_108155_a.field_103229_p.func_109363_R().func_107878_a((double)var1.field_105273_a, (double)var1.field_105271_b, (double)var1.field_105272_c));
         if(var2 == null) {
            return false;
         } else {
            this.field_108153_b = var2.field_107872_c;
            this.field_108154_c = var2.field_107869_d;
            this.field_108151_d = var2.field_107870_e;
            return true;
         }
      }
   }

   public boolean func_108036_b() {
      return !this.field_108155_a.func_103383_ay().func_108300_f();
   }

   public void func_108034_c() {
      this.field_108155_a.func_103383_ay().func_108292_a(this.field_108153_b, this.field_108154_c, this.field_108151_d, this.field_108152_e);
   }
}
