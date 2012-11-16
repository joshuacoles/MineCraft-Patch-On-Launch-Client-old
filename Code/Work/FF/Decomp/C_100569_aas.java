import java.util.Random;

public class C_100569_aas extends C_100562_aan {

   private int field_108016_a;


   public C_100569_aas(int var1) {
      this.field_108016_a = var1;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      if(var1.func_109349_a(var3, var4 + 1, var5) != C_100451_alf.field_106149_be.field_106162_cm) {
         return false;
      } else if(var1.func_109349_a(var3, var4, var5) != 0 && var1.func_109349_a(var3, var4, var5) != C_100451_alf.field_106149_be.field_106162_cm) {
         return false;
      } else {
         int var6 = 0;
         if(var1.func_109349_a(var3 - 1, var4, var5) == C_100451_alf.field_106149_be.field_106162_cm) {
            ++var6;
         }

         if(var1.func_109349_a(var3 + 1, var4, var5) == C_100451_alf.field_106149_be.field_106162_cm) {
            ++var6;
         }

         if(var1.func_109349_a(var3, var4, var5 - 1) == C_100451_alf.field_106149_be.field_106162_cm) {
            ++var6;
         }

         if(var1.func_109349_a(var3, var4, var5 + 1) == C_100451_alf.field_106149_be.field_106162_cm) {
            ++var6;
         }

         if(var1.func_109349_a(var3, var4 - 1, var5) == C_100451_alf.field_106149_be.field_106162_cm) {
            ++var6;
         }

         int var7 = 0;
         if(var1.func_109352_c(var3 - 1, var4, var5)) {
            ++var7;
         }

         if(var1.func_109352_c(var3 + 1, var4, var5)) {
            ++var7;
         }

         if(var1.func_109352_c(var3, var4, var5 - 1)) {
            ++var7;
         }

         if(var1.func_109352_c(var3, var4, var5 + 1)) {
            ++var7;
         }

         if(var1.func_109352_c(var3, var4 - 1, var5)) {
            ++var7;
         }

         if(var6 == 4 && var7 == 1) {
            var1.func_109422_e(var3, var4, var5, this.field_108016_a);
            var1.field_109562_d = true;
            C_100451_alf.field_106118_p[this.field_108016_a].func_105996_b(var1, var3, var4, var5, var2);
            var1.field_109562_d = false;
         }

         return true;
      }
   }
}
