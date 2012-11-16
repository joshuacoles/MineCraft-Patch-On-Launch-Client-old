import java.util.Random;

public class C_100173_ajc extends C_100451_alf {

   public static boolean field_106298_c = false;


   public C_100173_ajc(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109028_p);
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public C_100173_ajc(int var1, int var2, C_100664_afg var3) {
      super(var1, var2, var3);
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         this.func_106295_l(var1, var2, var3, var4);
      }

   }

   private void func_106295_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(func_106296_a_(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var8 = 32;
         if(!field_106298_c && var1.func_109480_d(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
            if(!var1.field_109557_J) {
               C_100574_pf var9 = new C_100574_pf(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.field_106162_cm, var1.func_109357_g(var2, var3, var4));
               this.func_106294_a(var9);
               var1.func_109513_d(var9);
            }
         } else {
            var1.func_109422_e(var2, var3, var4, 0);

            while(func_106296_a_(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if(var3 > 0) {
               var1.func_109422_e(var2, var3, var4, this.field_106162_cm);
            }
         }
      }

   }

   protected void func_106294_a(C_100574_pf var1) {}

   public int func_106000_r_() {
      return 3;
   }

   public static boolean func_106296_a_(C_100873_xe var0, int var1, int var2, int var3) {
      int var4 = var0.func_109349_a(var1, var2, var3);
      if(var4 == 0) {
         return true;
      } else if(var4 == C_100451_alf.field_106222_au.field_106162_cm) {
         return true;
      } else {
         C_100664_afg var5 = C_100451_alf.field_106118_p[var4].field_106204_cB;
         return var5 == C_100664_afg.field_109019_h?true:var5 == C_100664_afg.field_109020_i;
      }
   }

   public void func_106297_a_(C_100873_xe var1, int var2, int var3, int var4, int var5) {}

}
