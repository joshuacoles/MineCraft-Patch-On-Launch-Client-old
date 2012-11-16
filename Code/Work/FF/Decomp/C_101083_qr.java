
public class C_101083_qr extends C_101082_qq {

   public C_101083_qr(C_100873_xe var1) {
      super(var1);
   }

   public C_101083_qr(C_100873_xe var1, C_100595_ln var2) {
      super(var1, var2);
   }

   public C_101083_qr(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void func_104685_a(C_100383_amu var1) {
      if(var1.field_107835_g != null) {
         var1.field_107835_g.func_103085_a(C_100698_ks.func_109212_a(this, this.field_104692_c), 0);
      }

      if(!this.field_103229_p.field_109557_J && this.field_103232_aa.nextInt(8) == 0) {
         byte var2 = 1;
         if(this.field_103232_aa.nextInt(32) == 0) {
            var2 = 4;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            C_100540_oi var4 = new C_100540_oi(this.field_103229_p);
            var4.func_103519_a(-24000);
            var4.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, 0.0F);
            this.field_103229_p.func_109513_d(var4);
         }
      }

      for(int var5 = 0; var5 < 8; ++var5) {
         this.field_103229_p.func_109428_a("snowballpoof", this.field_103221_t, this.field_103219_u, this.field_103217_v, 0.0D, 0.0D, 0.0D);
      }

      if(!this.field_103229_p.field_109557_J) {
         this.func_103121_x();
      }

   }
}
