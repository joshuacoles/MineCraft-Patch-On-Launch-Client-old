import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class C_100676_kf {

   public static int func_109115_a(Collection var0) {
      int var1 = 0;

      C_100675_kg var3;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var1 += var3.field_109099_a) {
         var3 = (C_100675_kg)var2.next();
      }

      return var1;
   }

   public static C_100675_kg func_109111_a(Random var0, Collection var1, int var2) {
      if(var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         Iterator var4 = var1.iterator();

         C_100675_kg var5;
         do {
            if(!var4.hasNext()) {
               return null;
            }

            var5 = (C_100675_kg)var4.next();
            var3 -= var5.field_109099_a;
         } while(var3 >= 0);

         return var5;
      }
   }

   public static C_100675_kg func_109113_a(Random var0, Collection var1) {
      return func_109111_a(var0, var1, func_109115_a(var1));
   }

   public static int func_109116_a(C_100675_kg[] var0) {
      int var1 = 0;
      C_100675_kg[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100675_kg var5 = var2[var4];
         var1 += var5.field_109099_a;
      }

      return var1;
   }

   public static C_100675_kg func_109112_a(Random var0, C_100675_kg[] var1, int var2) {
      if(var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         C_100675_kg[] var4 = var1;
         int var5 = var1.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            C_100675_kg var7 = var4[var6];
            var3 -= var7.field_109099_a;
            if(var3 < 0) {
               return var7;
            }
         }

         return null;
      }
   }

   public static C_100675_kg func_109114_a(Random var0, C_100675_kg[] var1) {
      return func_109112_a(var0, var1, func_109116_a(var1));
   }
}
