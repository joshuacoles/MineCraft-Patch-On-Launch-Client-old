
public class C_101087_qo extends C_101091_qk {

   public C_101087_qo(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.3125F, 0.3125F);
   }

   public C_101087_qo(C_100873_xe var1, C_100595_ln var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.func_103161_a(0.3125F, 0.3125F);
   }

   public C_101087_qo(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.func_103161_a(0.3125F, 0.3125F);
   }

   protected void func_104728_a(C_100383_amu var1) {
      if(!this.field_103229_p.field_109557_J) {
         if(var1.field_107835_g != null) {
            if(!var1.field_107835_g.func_103101_F() && var1.field_107835_g.func_103085_a(C_100698_ks.func_109213_a(this, this.field_104736_a), 5)) {
               var1.field_107835_g.func_103112_c(5);
            }
         } else {
            int var2 = var1.field_107838_b;
            int var3 = var1.field_107839_c;
            int var4 = var1.field_107836_d;
            switch(var1.field_107837_e) {
            case 0:
               --var3;
               break;
            case 1:
               ++var3;
               break;
            case 2:
               --var4;
               break;
            case 3:
               ++var4;
               break;
            case 4:
               --var2;
               break;
            case 5:
               ++var2;
            }

            if(this.field_103229_p.func_109352_c(var2, var3, var4)) {
               this.field_103229_p.func_109422_e(var2, var3, var4, C_100451_alf.field_106222_au.field_106162_cm);
            }
         }

         this.func_103121_x();
      }

   }

   public boolean func_103123_L() {
      return false;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      return false;
   }
}
