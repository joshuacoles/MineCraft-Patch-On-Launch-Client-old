import java.util.Random;

abstract class C_100819_acx extends C_100767_adx {

   protected final int field_108540_a;
   protected final int field_108538_b;
   protected final int field_108539_c;
   protected int field_108537_d = -1;


   protected C_100819_acx(Random var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(0);
      this.field_108540_a = var5;
      this.field_108538_b = var6;
      this.field_108539_c = var7;
      this.field_108402_f = var1.nextInt(4);
      switch(this.field_108402_f) {
      case 0:
      case 2:
         this.field_108404_e = new C_100516_abo(var2, var3, var4, var2 + var5 - 1, var3 + var6 - 1, var4 + var7 - 1);
         break;
      default:
         this.field_108404_e = new C_100516_abo(var2, var3, var4, var2 + var7 - 1, var3 + var6 - 1, var4 + var5 - 1);
      }

   }

   protected boolean func_108536_a(C_100873_xe var1, C_100516_abo var2, int var3) {
      if(this.field_108537_d >= 0) {
         return true;
      } else {
         int var4 = 0;
         int var5 = 0;

         for(int var6 = this.field_108404_e.field_108340_c; var6 <= this.field_108404_e.field_108336_f; ++var6) {
            for(int var7 = this.field_108404_e.field_108341_a; var7 <= this.field_108404_e.field_108337_d; ++var7) {
               if(var2.func_108334_b(var7, 64, var6)) {
                  var4 += Math.max(var1.func_109459_i(var7, var6), var1.field_109576_v.func_112376_i());
                  ++var5;
               }
            }
         }

         if(var5 == 0) {
            return false;
         } else {
            this.field_108537_d = var4 / var5;
            this.field_108404_e.func_108331_a(0, this.field_108537_d - this.field_108404_e.field_108339_b + var3, 0);
            return true;
         }
      }
   }
}
