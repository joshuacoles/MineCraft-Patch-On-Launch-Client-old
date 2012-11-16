import java.util.Random;

public class C_100510_abk extends C_100562_aan {

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      int var6 = var3;

      for(int var7 = var5; var4 < 128; ++var4) {
         if(var1.func_109352_c(var3, var4, var5)) {
            for(int var8 = 2; var8 <= 5; ++var8) {
               if(C_100451_alf.field_106128_bx.func_106038_b_(var1, var3, var4, var5, var8)) {
                  var1.func_109526_c(var3, var4, var5, C_100451_alf.field_106128_bx.field_106162_cm, 1 << C_100015_i.field_105280_e[C_100012_j.field_105266_a[var8]]);
                  break;
               }
            }
         } else {
            var3 = var6 + var2.nextInt(4) - var2.nextInt(4);
            var5 = var7 + var2.nextInt(4) - var2.nextInt(4);
         }
      }

      return true;
   }
}
