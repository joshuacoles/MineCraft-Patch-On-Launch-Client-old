import java.util.Random;

public class C_100508_abi extends C_100562_aan {

   private int field_107977_a;
   private int field_107976_b;


   public C_100508_abi(int var1, int var2) {
      this.field_107977_a = var1;
      this.field_107976_b = var2;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var11;
      for(boolean var6 = false; ((var11 = var1.func_109349_a(var3, var4, var5)) == 0 || var11 == C_100451_alf.field_106080_N.field_106162_cm) && var4 > 0; --var4) {
         ;
      }

      for(int var7 = 0; var7 < 128; ++var7) {
         int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
         int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
         int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
         if(var1.func_109352_c(var8, var9, var10) && C_100451_alf.field_106118_p[this.field_107977_a].func_106001_d(var1, var8, var9, var10)) {
            var1.func_109526_c(var8, var9, var10, this.field_107977_a, this.field_107976_b);
         }
      }

      return true;
   }
}
