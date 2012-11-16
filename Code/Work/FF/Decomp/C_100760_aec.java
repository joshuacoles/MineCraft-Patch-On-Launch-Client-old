import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class C_100760_aec {

   public static ArrayList func_109696_a(Random var0, int var1) {
      ArrayList var2 = new ArrayList();
      var2.add(new C_100719_aeh(C_100715_aej.class, 4, C_100650_jv.func_108929_a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new C_100719_aeh(C_100695_ael.class, 20, C_100650_jv.func_108929_a(var0, 0 + var1, 1 + var1)));
      var2.add(new C_100719_aeh(C_100711_aed.class, 20, C_100650_jv.func_108929_a(var0, 0 + var1, 2 + var1)));
      var2.add(new C_100719_aeh(C_100713_aek.class, 3, C_100650_jv.func_108929_a(var0, 2 + var1, 5 + var1 * 3)));
      var2.add(new C_100719_aeh(C_100717_aei.class, 15, C_100650_jv.func_108929_a(var0, 0 + var1, 2 + var1)));
      var2.add(new C_100719_aeh(C_100709_aee.class, 3, C_100650_jv.func_108929_a(var0, 1 + var1, 4 + var1)));
      var2.add(new C_100719_aeh(C_100707_aef.class, 3, C_100650_jv.func_108929_a(var0, 2 + var1, 4 + var1 * 2)));
      var2.add(new C_100719_aeh(C_100693_aem.class, 15, C_100650_jv.func_108929_a(var0, 0, 1 + var1)));
      var2.add(new C_100719_aeh(C_100703_aep.class, 8, C_100650_jv.func_108929_a(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         if(((C_100719_aeh)var3.next()).field_109281_d == 0) {
            var3.remove();
         }
      }

      return var2;
   }

   private static int func_109689_a(List var0) {
      boolean var1 = false;
      int var2 = 0;

      C_100719_aeh var4;
      for(Iterator var3 = var0.iterator(); var3.hasNext(); var2 += var4.field_109282_b) {
         var4 = (C_100719_aeh)var3.next();
         if(var4.field_109281_d > 0 && var4.field_109283_c < var4.field_109281_d) {
            var1 = true;
         }
      }

      return var1?var2:-1;
   }

   private static C_100701_aeq func_109690_a(C_100691_aen var0, C_100719_aeh var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      Class var9 = var1.field_109284_a;
      Object var10 = null;
      if(var9 == C_100715_aej.class) {
         var10 = C_100715_aej.func_108460_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100695_ael.class) {
         var10 = C_100695_ael.func_108424_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100711_aed.class) {
         var10 = C_100711_aed.func_108454_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100713_aek.class) {
         var10 = C_100713_aek.func_108456_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100717_aei.class) {
         var10 = C_100717_aei.func_108463_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100709_aee.class) {
         var10 = C_100709_aee.func_108448_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100707_aef.class) {
         var10 = C_100707_aef.func_108442_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100693_aem.class) {
         var10 = C_100693_aem.func_108420_a(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var9 == C_100703_aep.class) {
         var10 = C_100703_aep.func_108438_a(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return (C_100701_aeq)var10;
   }

   private static C_100701_aeq func_109693_c(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = func_109689_a(var0.field_108434_h);
      if(var8 <= 0) {
         return null;
      } else {
         int var9 = 0;

         while(var9 < 5) {
            ++var9;
            int var10 = var2.nextInt(var8);
            Iterator var11 = var0.field_108434_h.iterator();

            while(var11.hasNext()) {
               C_100719_aeh var12 = (C_100719_aeh)var11.next();
               var10 -= var12.field_109282_b;
               if(var10 < 0) {
                  if(!var12.func_109279_a(var7) || var12 == var0.field_108429_d && var0.field_108434_h.size() > 1) {
                     break;
                  }

                  C_100701_aeq var13 = func_109690_a(var0, var12, var1, var2, var3, var4, var5, var6, var7);
                  if(var13 != null) {
                     ++var12.field_109283_c;
                     var0.field_108429_d = var12;
                     if(!var12.func_109280_a()) {
                        var0.field_108434_h.remove(var12);
                     }

                     return var13;
                  }
               }
            }
         }

         C_100516_abo var14 = C_100705_aeg.func_108440_a(var0, var1, var2, var3, var4, var5, var6);
         if(var14 != null) {
            return new C_100705_aeg(var0, var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static C_100767_adx func_109694_d(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.func_108381_b().field_108341_a) <= 112 && Math.abs(var5 - var0.func_108381_b().field_108340_c) <= 112) {
         C_100701_aeq var8 = func_109693_c(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            int var9 = (var8.field_108404_e.field_108341_a + var8.field_108404_e.field_108337_d) / 2;
            int var10 = (var8.field_108404_e.field_108340_c + var8.field_108404_e.field_108336_f) / 2;
            int var11 = var8.field_108404_e.field_108337_d - var8.field_108404_e.field_108341_a;
            int var12 = var8.field_108404_e.field_108336_f - var8.field_108404_e.field_108340_c;
            int var13 = var11 > var12?var11:var12;
            if(var0.func_108428_d().func_112525_a(var9, var10, var13 / 2 + 4, C_100756_aea.field_108364_e)) {
               var1.add(var8);
               var0.field_108435_i.add(var8);
               return var8;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static C_100767_adx func_109692_e(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 3 + var0.field_108431_c) {
         return null;
      } else if(Math.abs(var3 - var0.func_108381_b().field_108341_a) <= 112 && Math.abs(var5 - var0.func_108381_b().field_108340_c) <= 112) {
         C_100516_abo var8 = C_100689_aeo.func_108436_a(var0, var1, var2, var3, var4, var5, var6);
         if(var8 != null && var8.field_108339_b > 10) {
            C_100689_aeo var9 = new C_100689_aeo(var0, var7, var2, var8, var6);
            int var10 = (var9.field_108404_e.field_108341_a + var9.field_108404_e.field_108337_d) / 2;
            int var11 = (var9.field_108404_e.field_108340_c + var9.field_108404_e.field_108336_f) / 2;
            int var12 = var9.field_108404_e.field_108337_d - var9.field_108404_e.field_108341_a;
            int var13 = var9.field_108404_e.field_108336_f - var9.field_108404_e.field_108340_c;
            int var14 = var12 > var13?var12:var13;
            if(var0.func_108428_d().func_112525_a(var10, var11, var14 / 2 + 4, C_100756_aea.field_108364_e)) {
               var1.add(var9);
               var0.field_108433_j.add(var9);
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static C_100767_adx func_109691_a(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return func_109694_d(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static C_100767_adx func_109695_b(C_100691_aen var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return func_109692_e(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
