import java.util.List;
import java.util.Random;

public class C_100482_akp extends C_100253_aht {

   public static final String[] field_106388_a = new String[]{"oak", "spruce", "birch", "jungle"};


   protected C_100482_akp(int var1, int var2) {
      super(var1, var2);
      float var3 = 0.4F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         super.func_105996_b(var1, var2, var3, var4, var5);
         if(var1.func_109523_l(var2, var3 + 1, var4) >= 9 && var5.nextInt(7) == 0) {
            int var6 = var1.func_109357_g(var2, var3, var4);
            if((var6 & 8) == 0) {
               var1.func_109488_c(var2, var3, var4, var6 | 8);
            } else {
               this.func_106386_c(var1, var2, var3, var4, var5);
            }
         }

      }
   }

   public int func_106029_a(int var1, int var2) {
      var2 &= 3;
      return var2 == 1?63:(var2 == 2?79:(var2 == 3?30:super.func_106029_a(var1, var2)));
   }

   public void func_106386_c(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.func_109357_g(var2, var3, var4) & 3;
      Object var7 = null;
      int var8 = 0;
      int var9 = 0;
      boolean var10 = false;
      if(var6 == 1) {
         var7 = new C_100504_abg(true);
      } else if(var6 == 2) {
         var7 = new C_100554_aag(true);
      } else if(var6 == 3) {
         for(var8 = 0; var8 >= -1; --var8) {
            for(var9 = 0; var9 >= -1; --var9) {
               if(this.func_106387_d(var1, var2 + var8, var3, var4 + var9, 3) && this.func_106387_d(var1, var2 + var8 + 1, var3, var4 + var9, 3) && this.func_106387_d(var1, var2 + var8, var3, var4 + var9 + 1, 3) && this.func_106387_d(var1, var2 + var8 + 1, var3, var4 + var9 + 1, 3)) {
                  var7 = new C_100588_aax(true, 10 + var5.nextInt(20), 3, 3);
                  var10 = true;
                  break;
               }
            }

            if(var7 != null) {
               break;
            }
         }

         if(var7 == null) {
            var9 = 0;
            var8 = 0;
            var7 = new C_100509_abj(true, 4 + var5.nextInt(7), 3, 3, false);
         }
      } else {
         var7 = new C_100509_abj(true);
         if(var5.nextInt(10) == 0) {
            var7 = new C_100552_aaf(true);
         }
      }

      if(var10) {
         var1.func_109378_b(var2 + var8, var3, var4 + var9, 0);
         var1.func_109378_b(var2 + var8 + 1, var3, var4 + var9, 0);
         var1.func_109378_b(var2 + var8, var3, var4 + var9 + 1, 0);
         var1.func_109378_b(var2 + var8 + 1, var3, var4 + var9 + 1, 0);
      } else {
         var1.func_109378_b(var2, var3, var4, 0);
      }

      if(!((C_100562_aan)var7).func_107965_a(var1, var5, var2 + var8, var3, var4 + var9)) {
         if(var10) {
            var1.func_109526_c(var2 + var8, var3, var4 + var9, this.field_106162_cm, var6);
            var1.func_109526_c(var2 + var8 + 1, var3, var4 + var9, this.field_106162_cm, var6);
            var1.func_109526_c(var2 + var8, var3, var4 + var9 + 1, this.field_106162_cm, var6);
            var1.func_109526_c(var2 + var8 + 1, var3, var4 + var9 + 1, this.field_106162_cm, var6);
         } else {
            var1.func_109526_c(var2, var3, var4, this.field_106162_cm, var6);
         }
      }

   }

   public boolean func_106387_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return var1.func_109349_a(var2, var3, var4) == this.field_106162_cm && (var1.func_109357_g(var2, var3, var4) & 3) == var5;
   }

   public int func_106004_b(int var1) {
      return var1 & 3;
   }

   public void func_105987_a(int var1, C_101040_sq var2, List var3) {
      var3.add(new C_100994_tv(var1, 1, 0));
      var3.add(new C_100994_tv(var1, 1, 1));
      var3.add(new C_100994_tv(var1, 1, 2));
      var3.add(new C_100994_tv(var1, 1, 3));
   }

}
