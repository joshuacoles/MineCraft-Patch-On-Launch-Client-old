import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class C_100810_adb {

   private static final C_100738_adk[] field_109997_b = new C_100738_adk[]{new C_100738_adk(C_100773_ads.class, 40, 0), new C_100738_adk(C_100741_adm.class, 5, 5), new C_100738_adk(C_100748_adi.class, 20, 0), new C_100738_adk(C_100740_adn.class, 20, 0), new C_100738_adk(C_100733_ado.class, 10, 6), new C_100738_adk(C_100774_adt.class, 5, 5), new C_100738_adk(C_100735_adq.class, 5, 5), new C_100738_adk(C_100742_adh.class, 5, 4), new C_100738_adk(C_100752_adf.class, 5, 4), new C_100751_adc(C_100746_adj.class, 10, 2), new C_100750_add(C_100736_adl.class, 20, 1)};
   private static List field_109998_c;
   private static Class field_109995_d;
   static int field_109999_a = 0;
   private static final C_100732_adp field_109996_e = new C_100732_adp((C_100751_adc)null);


   public static void func_109989_a() {
      field_109998_c = new ArrayList();
      C_100738_adk[] var0 = field_109997_b;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         C_100738_adk var3 = var0[var2];
         var3.field_109346_c = 0;
         field_109998_c.add(var3);
      }

      field_109995_d = null;
   }

   private static boolean func_109994_c() {
      boolean var0 = false;
      field_109999_a = 0;

      C_100738_adk var2;
      for(Iterator var1 = field_109998_c.iterator(); var1.hasNext(); field_109999_a += var2.field_109345_b) {
         var2 = (C_100738_adk)var1.next();
         if(var2.field_109344_d > 0 && var2.field_109346_c < var2.field_109344_d) {
            var0 = true;
         }
      }

      return var0;
   }

   private static C_100775_adu func_109993_a(Class var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Object var8 = null;
      if(var0 == C_100773_ads.class) {
         var8 = C_100773_ads.func_108503_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100741_adm.class) {
         var8 = C_100741_adm.func_108483_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100748_adi.class) {
         var8 = C_100748_adi.func_108497_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100740_adn.class) {
         var8 = C_100740_adn.func_108497_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100733_ado.class) {
         var8 = C_100733_ado.func_108471_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100774_adt.class) {
         var8 = C_100774_adt.func_108507_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100735_adq.class) {
         var8 = C_100735_adq.func_108475_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100742_adh.class) {
         var8 = C_100742_adh.func_108485_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100752_adf.class) {
         var8 = C_100752_adf.func_108499_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100746_adj.class) {
         var8 = C_100746_adj.func_108493_a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == C_100736_adl.class) {
         var8 = C_100736_adl.func_108481_a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (C_100775_adu)var8;
   }

   private static C_100775_adu func_109992_b(C_100734_adr var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(!func_109994_c()) {
         return null;
      } else {
         if(field_109995_d != null) {
            C_100775_adu var8 = func_109993_a(field_109995_d, var1, var2, var3, var4, var5, var6, var7);
            field_109995_d = null;
            if(var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while(var13 < 5) {
            ++var13;
            int var9 = var2.nextInt(field_109999_a);
            Iterator var10 = field_109998_c.iterator();

            while(var10.hasNext()) {
               C_100738_adk var11 = (C_100738_adk)var10.next();
               var9 -= var11.field_109345_b;
               if(var9 < 0) {
                  if(!var11.func_109342_a(var7) || var11 == var0.field_108480_a) {
                     break;
                  }

                  C_100775_adu var12 = func_109993_a(var11.field_109347_a, var1, var2, var3, var4, var5, var6, var7);
                  if(var12 != null) {
                     ++var11.field_109346_c;
                     var0.field_108480_a = var11;
                     if(!var11.func_109343_a()) {
                        field_109998_c.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         C_100516_abo var14 = C_100744_adg.func_108491_a(var1, var2, var3, var4, var5, var6);
         if(var14 != null && var14.field_108339_b > 1) {
            return new C_100744_adg(var7, var2, var14, var6);
         } else {
            return null;
         }
      }
   }

   private static C_100767_adx func_109990_c(C_100734_adr var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.func_108381_b().field_108341_a) <= 112 && Math.abs(var5 - var0.func_108381_b().field_108340_c) <= 112) {
         C_100775_adu var8 = func_109992_b(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if(var8 != null) {
            var1.add(var8);
            var0.field_108479_c.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static C_100767_adx func_109987_a(C_100734_adr var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return func_109990_c(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static Class func_109991_a(Class var0) {
      field_109995_d = var0;
      return var0;
   }

   // $FF: synthetic method
   static C_100732_adp func_109988_b() {
      return field_109996_e;
   }

}
