
public class C_100640_ng extends C_100621_mm {

   private C_100598_ls field_108206_a;
   private double field_108204_b;
   private double field_108205_c;
   private double field_108202_d;
   private float field_108203_e;


   public C_100640_ng(C_100598_ls var1, float var2) {
      this.field_108206_a = var1;
      this.field_108203_e = var2;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(this.field_108206_a.func_103334_aD() >= 100) {
         return false;
      } else if(this.field_108206_a.func_103312_aA().nextInt(120) != 0) {
         return false;
      } else {
         C_100387_amw var1 = C_100512_nz.func_108266_a(this.field_108206_a, 10, 7);
         if(var1 == null) {
            return false;
         } else {
            this.field_108204_b = var1.field_107872_c;
            this.field_108205_c = var1.field_107869_d;
            this.field_108202_d = var1.field_107870_e;
            return true;
         }
      }
   }

   public boolean func_108036_b() {
      return !this.field_108206_a.func_103383_ay().func_108300_f();
   }

   public void func_108034_c() {
      this.field_108206_a.func_103383_ay().func_108292_a(this.field_108204_b, this.field_108205_c, this.field_108202_d, this.field_108203_e);
   }
}
