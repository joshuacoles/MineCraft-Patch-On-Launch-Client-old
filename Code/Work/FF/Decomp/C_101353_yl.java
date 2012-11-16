import java.util.Random;

public class C_101353_yl extends C_101324_xz {

   public C_101353_yl(int var1) {
      super(var1);
      this.field_112481_I.field_112581_z = 50;
      this.field_112481_I.field_112552_B = 25;
      this.field_112481_I.field_112551_A = 4;
      this.field_112482_J.add(new C_101316_ya(C_100535_om.class, 2, 1, 1));
      this.field_112483_K.add(new C_101316_ya(C_100540_oi.class, 10, 4, 4));
   }

   public C_100562_aan func_112447_a(Random var1) {
      return (C_100562_aan)(var1.nextInt(10) == 0?this.field_112486_P:(var1.nextInt(2) == 0?new C_100575_aap(3, 0):(var1.nextInt(3) == 0?new C_100588_aax(false, 10 + var1.nextInt(20), 3, 3):new C_100509_abj(false, 4 + var1.nextInt(7), 3, 3, true))));
   }

   public C_100562_aan func_112458_b(Random var1) {
      return var1.nextInt(4) == 0?new C_100508_abi(C_100451_alf.field_106244_aa.field_106162_cm, 2):new C_100508_abi(C_100451_alf.field_106244_aa.field_106162_cm, 1);
   }

   public void func_112456_a(C_100873_xe var1, Random var2, int var3, int var4) {
      super.func_112456_a(var1, var2, var3, var4);
      C_100510_abk var5 = new C_100510_abk();

      for(int var6 = 0; var6 < 50; ++var6) {
         int var7 = var3 + var2.nextInt(16) + 8;
         byte var8 = 64;
         int var9 = var4 + var2.nextInt(16) + 8;
         var5.func_107965_a(var1, var2, var7, var8, var9);
      }

   }
}
