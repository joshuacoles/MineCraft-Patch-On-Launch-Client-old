import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C_100154_ajx extends C_100438_alm {

   private boolean field_106432_a = false;
   private static Map field_106431_b = new HashMap();


   public int func_106029_a(int var1, int var2) {
      return var1 == 1?C_100451_alf.field_106203_ay.func_106029_a(var1, var2):super.func_106029_a(var1, var2);
   }

   private boolean func_106430_a(C_100873_xe var1, int var2, int var3, int var4, boolean var5) {
      if(!field_106431_b.containsKey(var1)) {
         field_106431_b.put(var1, new ArrayList());
      }

      if(var5) {
         ((List)field_106431_b.get(var1)).add(new C_100111_ajy(var2, var3, var4, var1.func_109463_E()));
      }

      int var6 = 0;
      Iterator var7 = ((List)field_106431_b.get(var1)).iterator();

      while(var7.hasNext()) {
         C_100111_ajy var8 = (C_100111_ajy)var7.next();
         if(var8.field_106472_a == var2 && var8.field_106470_b == var3 && var8.field_106471_c == var4) {
            ++var6;
            if(var6 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected C_100154_ajx(int var1, int var2, boolean var3) {
      super(var1, var2);
      this.field_106432_a = var3;
      this.func_105972_b(true);
      this.func_106034_a((C_101040_sq)null);
   }

   public int func_106000_r_() {
      return 2;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109357_g(var2, var3, var4) == 0) {
         super.func_106054_g(var1, var2, var3, var4);
      }

      if(this.field_106432_a) {
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
      }

   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field_106432_a) {
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
      }

   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(!this.field_106432_a) {
         return false;
      } else {
         int var6 = var1.func_109357_g(var2, var3, var4);
         return var6 == 5 && var5 == 1?false:(var6 == 3 && var5 == 3?false:(var6 == 4 && var5 == 2?false:(var6 == 1 && var5 == 5?false:var6 != 2 || var5 != 4)));
      }
   }

   private boolean func_106429_l(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      return var5 == 5 && var1.func_109437_l(var2, var3 - 1, var4, 0)?true:(var5 == 3 && var1.func_109437_l(var2, var3, var4 - 1, 2)?true:(var5 == 4 && var1.func_109437_l(var2, var3, var4 + 1, 3)?true:(var5 == 1 && var1.func_109437_l(var2 - 1, var3, var4, 4)?true:var5 == 2 && var1.func_109437_l(var2 + 1, var3, var4, 5))));
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      boolean var6 = this.func_106429_l(var1, var2, var3, var4);
      List var7 = (List)field_106431_b.get(var1);

      while(var7 != null && !var7.isEmpty() && var1.func_109463_E() - ((C_100111_ajy)var7.get(0)).field_106469_d > 60L) {
         var7.remove(0);
      }

      if(this.field_106432_a) {
         if(var6) {
            var1.func_109394_d(var2, var3, var4, C_100451_alf.field_106180_aS.field_106162_cm, var1.func_109357_g(var2, var3, var4));
            if(this.func_106430_a(var1, var2, var3, var4, true)) {
               var1.func_109476_a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.field_109577_u.nextFloat() - var1.field_109577_u.nextFloat()) * 0.8F);

               for(int var8 = 0; var8 < 5; ++var8) {
                  double var9 = (double)var2 + var5.nextDouble() * 0.6D + 0.2D;
                  double var11 = (double)var3 + var5.nextDouble() * 0.6D + 0.2D;
                  double var13 = (double)var4 + var5.nextDouble() * 0.6D + 0.2D;
                  var1.func_109428_a("smoke", var9, var11, var13, 0.0D, 0.0D, 0.0D);
               }
            }
         }
      } else if(!var6 && !this.func_106430_a(var1, var2, var3, var4, false)) {
         var1.func_109394_d(var2, var3, var4, C_100451_alf.field_106179_aT.field_106162_cm, var1.func_109357_g(var2, var3, var4));
      }

   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super.func_106017_a(var1, var2, var3, var4, var5);
      var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 == 0?this.func_106030_b(var1, var2, var3, var4, var5):false;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106179_aT.field_106162_cm;
   }

   public boolean func_106028_i() {
      return true;
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(this.field_106432_a) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         double var7 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var9 = (double)((float)var3 + 0.7F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var11 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
         double var13 = 0.2199999988079071D;
         double var15 = 0.27000001072883606D;
         if(var6 == 1) {
            var1.func_109428_a("reddust", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         } else if(var6 == 2) {
            var1.func_109428_a("reddust", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         } else if(var6 == 3) {
            var1.func_109428_a("reddust", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
         } else if(var6 == 4) {
            var1.func_109428_a("reddust", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
         } else {
            var1.func_109428_a("reddust", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100451_alf.field_106179_aT.field_106162_cm;
   }

}
