import java.util.Random;

public class C_100138_ajo extends C_100142_ajm {

   protected C_100138_ajo(int var1, C_100664_afg var2) {
      super(var1, var2);
      this.func_105972_b(false);
      if(var2 == C_100664_afg.field_109020_i) {
         this.func_105972_b(true);
      }

   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return this.field_106204_cB != C_100664_afg.field_109020_i;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super.func_106017_a(var1, var2, var3, var4, var5);
      if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
         this.func_106275_l(var1, var2, var3, var4);
      }

   }

   private void func_106275_l(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      var1.field_109579_s = true;
      var1.func_109526_c(var2, var3, var4, this.field_106162_cm - 1, var5);
      var1.func_109511_e(var2, var3, var4, var2, var3, var4);
      var1.func_109398_a(var2, var3, var4, this.field_106162_cm - 1, this.func_106000_r_());
      var1.field_109579_s = false;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(this.field_106204_cB == C_100664_afg.field_109020_i) {
         int var6 = var5.nextInt(3);

         int var7;
         int var8;
         for(var7 = 0; var7 < var6; ++var7) {
            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            var8 = var1.func_109349_a(var2, var3, var4);
            if(var8 == 0) {
               if(this.func_106276_n(var1, var2 - 1, var3, var4) || this.func_106276_n(var1, var2 + 1, var3, var4) || this.func_106276_n(var1, var2, var3, var4 - 1) || this.func_106276_n(var1, var2, var3, var4 + 1) || this.func_106276_n(var1, var2, var3 - 1, var4) || this.func_106276_n(var1, var2, var3 + 1, var4)) {
                  var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106222_au.field_106162_cm);
                  return;
               }
            } else if(C_100451_alf.field_106118_p[var8].field_106204_cB.func_108992_c()) {
               return;
            }
         }

         if(var6 == 0) {
            var7 = var2;
            var8 = var4;

            for(int var9 = 0; var9 < 3; ++var9) {
               var2 = var7 + var5.nextInt(3) - 1;
               var4 = var8 + var5.nextInt(3) - 1;
               if(var1.func_109352_c(var2, var3 + 1, var4) && this.func_106276_n(var1, var2, var3, var4)) {
                  var1.func_109422_e(var2, var3 + 1, var4, C_100451_alf.field_106222_au.field_106162_cm);
               }
            }
         }
      }

   }

   private boolean func_106276_n(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109350_f(var2, var3, var4).func_108979_h();
   }
}
