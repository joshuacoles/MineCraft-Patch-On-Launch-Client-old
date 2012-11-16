import java.util.List;
import java.util.Random;

public class C_100182_aih extends C_100127_akg {

   public C_100182_aih(int var1, int var2) {
      super(var1, var2, true);
      this.func_105972_b(true);
   }

   public int func_106000_r_() {
      return 20;
   }

   public boolean func_106028_i() {
      return true;
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         if((var6 & 8) == 0) {
            this.func_106265_d(var1, var2, var3, var4, var6);
         }
      }
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         if((var6 & 8) != 0) {
            this.func_106265_d(var1, var2, var3, var4, var6);
         }
      }
   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return (var1.func_109357_g(var2, var3, var4) & 8) != 0;
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return (var1.func_109357_g(var2, var3, var4) & 8) == 0?false:var5 == 1;
   }

   private void func_106265_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      boolean var6 = (var5 & 8) != 0;
      boolean var7 = false;
      float var8 = 0.125F;
      List var9 = var1.func_109518_a(C_100590_ph.class, C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var8), (double)var3, (double)((float)var4 + var8), (double)((float)(var2 + 1) - var8), (double)((float)(var3 + 1) - var8), (double)((float)(var4 + 1) - var8)));
      if(!var9.isEmpty()) {
         var7 = true;
      }

      if(var7 && !var6) {
         var1.func_109488_c(var2, var3, var4, var5 | 8);
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
      }

      if(!var7 && var6) {
         var1.func_109488_c(var2, var3, var4, var5 & 7);
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
      }

      if(var7) {
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
      }

   }
}
