
public class C_100593_pk extends C_101101_py {

   public C_100593_pk(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/cavespider.png";
      this.func_103161_a(0.7F, 0.5F);
   }

   public int func_103378_aS() {
      return 12;
   }

   public float func_103755_m() {
      return 0.7F;
   }

   public boolean func_103303_l(C_100730_lb var1) {
      if(super.func_103303_l(var1)) {
         if(var1 instanceof C_100595_ln) {
            byte var2 = 0;
            if(this.field_103229_p.field_109578_t > 1) {
               if(this.field_103229_p.field_109578_t == 2) {
                  var2 = 7;
               } else if(this.field_103229_p.field_109578_t == 3) {
                  var2 = 15;
               }
            }

            if(var2 > 0) {
               ((C_100595_ln)var1).func_103389_d(new C_100692_kx(C_100690_kw.field_109180_u.field_109159_H, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void func_103337_bD() {}
}
