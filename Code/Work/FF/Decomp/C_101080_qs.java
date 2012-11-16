
public class C_101080_qs extends C_101082_qq {

   public C_101080_qs(C_100873_xe var1) {
      super(var1);
   }

   public C_101080_qs(C_100873_xe var1, C_100595_ln var2) {
      super(var1, var2);
   }

   public C_101080_qs(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void func_104685_a(C_100383_amu var1) {
      if(var1.field_107835_g != null) {
         var1.field_107835_g.func_103085_a(C_100698_ks.func_109212_a(this, this.field_104692_c), 0);
      }

      for(int var2 = 0; var2 < 32; ++var2) {
         this.field_103229_p.func_109428_a("portal", this.field_103221_t, this.field_103219_u + this.field_103232_aa.nextDouble() * 2.0D, this.field_103217_v, this.field_103232_aa.nextGaussian(), 0.0D, this.field_103232_aa.nextGaussian());
      }

      if(!this.field_103229_p.field_109557_J) {
         if(this.field_104692_c != null && this.field_104692_c instanceof C_100762_ih) {
            C_100762_ih var3 = (C_100762_ih)this.field_104692_c;
            if(!var3.field_104518_a.field_107020_c && var3.field_103229_p == this.field_103229_p) {
               this.field_104692_c.func_103331_a(this.field_103221_t, this.field_103219_u, this.field_103217_v);
               this.field_104692_c.field_103194_S = 0.0F;
               this.field_104692_c.func_103085_a(C_100698_ks.field_109242_h, 5);
            }
         }

         this.func_103121_x();
      }

   }
}
