
public class C_101081_qt extends C_101082_qq {

   public C_101081_qt(C_100873_xe var1) {
      super(var1);
   }

   public C_101081_qt(C_100873_xe var1, C_100595_ln var2) {
      super(var1, var2);
   }

   public C_101081_qt(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected float func_104684_g() {
      return 0.07F;
   }

   protected float func_104686_c() {
      return 0.7F;
   }

   protected float func_104683_d() {
      return -20.0F;
   }

   protected void func_104685_a(C_100383_amu var1) {
      if(!this.field_103229_p.field_109557_J) {
         this.field_103229_p.func_109448_f(2002, (int)Math.round(this.field_103221_t), (int)Math.round(this.field_103219_u), (int)Math.round(this.field_103217_v), 0);
         int var2 = 3 + this.field_103229_p.field_109577_u.nextInt(5) + this.field_103229_p.field_109577_u.nextInt(5);

         while(var2 > 0) {
            int var3 = C_100722_lj.func_104589_a(var2);
            var2 -= var3;
            this.field_103229_p.func_109513_d(new C_100722_lj(this.field_103229_p, this.field_103221_t, this.field_103219_u, this.field_103217_v, var3));
         }

         this.func_103121_x();
      }

   }
}
