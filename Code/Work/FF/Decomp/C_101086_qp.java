
public class C_101086_qp extends C_101082_qq {

   public C_101086_qp(C_100873_xe var1) {
      super(var1);
   }

   public C_101086_qp(C_100873_xe var1, C_100595_ln var2) {
      super(var1, var2);
   }

   public C_101086_qp(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void func_104685_a(C_100383_amu var1) {
      if(var1.field_107835_g != null) {
         byte var2 = 0;
         if(var1.field_107835_g instanceof C_100592_pj) {
            var2 = 3;
         }

         var1.field_107835_g.func_103085_a(C_100698_ks.func_109212_a(this, this.field_104692_c), var2);
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.field_103229_p.func_109428_a("snowballpoof", this.field_103221_t, this.field_103219_u, this.field_103217_v, 0.0D, 0.0D, 0.0D);
      }

      if(!this.field_103229_p.field_109557_J) {
         this.func_103121_x();
      }

   }
}
