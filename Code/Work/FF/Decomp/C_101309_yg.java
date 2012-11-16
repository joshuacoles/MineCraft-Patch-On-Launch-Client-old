import java.util.Random;

public class C_101309_yg extends C_101324_xz {

   private C_100562_aan field_112515_S;


   protected C_101309_yg(int var1) {
      super(var1);
      this.field_112515_S = new C_100584_aaz(C_100451_alf.field_106134_bo.field_106162_cm, 8);
   }

   public void func_112456_a(C_100873_xe var1, Random var2, int var3, int var4) {
      super.func_112456_a(var1, var2, var3, var4);
      int var5 = 3 + var2.nextInt(6);

      int var6;
      int var7;
      int var8;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var3 + var2.nextInt(16);
         var8 = var2.nextInt(28) + 4;
         int var9 = var4 + var2.nextInt(16);
         int var10 = var1.func_109349_a(var7, var8, var9);
         if(var10 == C_100451_alf.field_106111_w.field_106162_cm) {
            var1.func_109378_b(var7, var8, var9, C_100451_alf.field_106207_bU.field_106162_cm);
         }
      }

      for(var5 = 0; var5 < 7; ++var5) {
         var6 = var3 + var2.nextInt(16);
         var7 = var2.nextInt(64);
         var8 = var4 + var2.nextInt(16);
         this.field_112515_S.func_107965_a(var1, var2, var6, var7, var8);
      }

   }
}
