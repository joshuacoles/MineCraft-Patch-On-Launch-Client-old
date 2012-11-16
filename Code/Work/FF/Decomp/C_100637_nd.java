
public class C_100637_nd extends C_100621_mm {

   private C_100598_ls field_108193_a;
   private float field_108191_b;
   private double field_108192_c;
   private double field_108189_d;
   private double field_108190_e;


   public C_100637_nd(C_100598_ls var1, float var2) {
      this.field_108193_a = var1;
      this.field_108191_b = var2;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(this.field_108193_a.func_103286_aB() == null) {
         return false;
      } else {
         C_100387_amw var1 = C_100512_nz.func_108266_a(this.field_108193_a, 5, 4);
         if(var1 == null) {
            return false;
         } else {
            this.field_108192_c = var1.field_107872_c;
            this.field_108189_d = var1.field_107869_d;
            this.field_108190_e = var1.field_107870_e;
            return true;
         }
      }
   }

   public void func_108034_c() {
      this.field_108193_a.func_103383_ay().func_108292_a(this.field_108192_c, this.field_108189_d, this.field_108190_e, this.field_108191_b);
   }

   public boolean func_108036_b() {
      return !this.field_108193_a.func_103383_ay().func_108300_f();
   }
}
