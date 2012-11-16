import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C_100878_wh {

   private static final Random field_110601_a = new Random();
   private static final C_100882_wl field_110599_b = new C_100882_wl((C_100879_wi)null);
   private static final C_100881_wk field_110600_c = new C_100881_wk((C_100879_wi)null);


   public static int func_110594_a(int var0, C_100994_tv var1) {
      if(var1 == null) {
         return 0;
      } else {
         C_100339_bp var2 = var1.func_111384_q();
         if(var2 == null) {
            return 0;
         } else {
            for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
               short var4 = ((C_100353_bh)var2.func_107498_b(var3)).func_107517_d("id");
               short var5 = ((C_100353_bh)var2.func_107498_b(var3)).func_107517_d("lvl");
               if(var4 == var0) {
                  return var5;
               }
            }

            return 0;
         }
      }
   }

   public static Map func_110589_a(C_100994_tv var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      C_100339_bp var2 = var0.func_111384_q();
      if(var2 != null) {
         for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
            short var4 = ((C_100353_bh)var2.func_107498_b(var3)).func_107517_d("id");
            short var5 = ((C_100353_bh)var2.func_107498_b(var3)).func_107517_d("lvl");
            var1.put(Integer.valueOf(var4), Integer.valueOf(var5));
         }
      }

      return var1;
   }

   public static void func_110590_a(Map var0, C_100994_tv var1) {
      C_100339_bp var2 = new C_100339_bp();
      Iterator var3 = var0.keySet().iterator();

      while(var3.hasNext()) {
         int var4 = ((Integer)var3.next()).intValue();
         C_100353_bh var5 = new C_100353_bh();
         var5.func_107532_a("id", (short)var4);
         var5.func_107532_a("lvl", (short)((Integer)var0.get(Integer.valueOf(var4))).intValue());
         var2.func_107500_a(var5);
      }

      if(var2.func_107501_c() > 0) {
         var1.func_111359_a("ench", var2);
      } else if(var1.func_111339_o()) {
         var1.func_111352_p().func_107528_o("ench");
      }

   }

   private static int func_110585_a(int var0, C_100994_tv[] var1) {
      int var2 = 0;
      C_100994_tv[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         C_100994_tv var6 = var3[var5];
         int var7 = func_110594_a(var0, var6);
         if(var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   private static void func_110587_a(C_100880_wj var0, C_100994_tv var1) {
      if(var1 != null) {
         C_100339_bp var2 = var1.func_111384_q();
         if(var2 != null) {
            for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
               short var4 = ((C_100353_bh)var2.func_107498_b(var3)).func_107517_d("id");
               short var5 = ((C_100353_bh)var2.func_107498_b(var3)).func_107517_d("lvl");
               if(C_100904_wf.field_110622_b[var4] != null) {
                  var0.func_110602_a(C_100904_wf.field_110622_b[var4], var5);
               }
            }

         }
      }
   }

   private static void func_110579_a(C_100880_wj var0, C_100994_tv[] var1) {
      C_100994_tv[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100994_tv var5 = var2[var4];
         func_110587_a(var0, var5);
      }

   }

   public static int func_110598_a(C_100994_tv[] var0, C_100698_ks var1) {
      field_110599_b.field_110606_a = 0;
      field_110599_b.field_110605_b = var1;
      func_110579_a(field_110599_b, var0);
      if(field_110599_b.field_110606_a > 25) {
         field_110599_b.field_110606_a = 25;
      }

      return (field_110599_b.field_110606_a + 1 >> 1) + field_110601_a.nextInt((field_110599_b.field_110606_a >> 1) + 1);
   }

   public static int func_110592_a(C_100595_ln var0, C_100595_ln var1) {
      field_110600_c.field_110604_a = 0;
      field_110600_c.field_110603_b = var1;
      func_110587_a(field_110600_c, var0.func_103328_bA());
      return field_110600_c.field_110604_a > 0?1 + field_110601_a.nextInt(field_110600_c.field_110604_a):0;
   }

   public static int func_110588_b(C_100595_ln var0, C_100595_ln var1) {
      return func_110594_a(C_100904_wf.field_110628_m.field_110643_x, var0.func_103328_bA());
   }

   public static int func_110581_c(C_100595_ln var0, C_100595_ln var1) {
      return func_110594_a(C_100904_wf.field_110625_n.field_110643_x, var0.func_103328_bA());
   }

   public static int func_110591_a(C_100595_ln var0) {
      return func_110585_a(C_100904_wf.field_110631_h.field_110643_x, var0.func_103127_ae());
   }

   public static int func_110595_b(C_100595_ln var0) {
      return func_110594_a(C_100904_wf.field_110640_p.field_110643_x, var0.func_103328_bA());
   }

   public static int func_110596_c(C_100595_ln var0) {
      return func_110594_a(C_100904_wf.field_110638_r.field_110643_x, var0.func_103328_bA());
   }

   public static boolean func_110583_d(C_100595_ln var0) {
      return func_110594_a(C_100904_wf.field_110639_q.field_110643_x, var0.func_103328_bA()) > 0;
   }

   public static int func_110580_e(C_100595_ln var0) {
      return func_110594_a(C_100904_wf.field_110637_s.field_110643_x, var0.func_103328_bA());
   }

   public static int func_110586_f(C_100595_ln var0) {
      return func_110594_a(C_100904_wf.field_110626_o.field_110643_x, var0.func_103328_bA());
   }

   public static boolean func_110593_g(C_100595_ln var0) {
      return func_110585_a(C_100904_wf.field_110632_i.field_110643_x, var0.func_103127_ae()) > 0;
   }

   public static int func_110582_a(Random var0, int var1, int var2, C_100994_tv var3) {
      C_100992_tt var4 = var3.func_111365_b();
      int var5 = var4.func_110768_c();
      if(var5 <= 0) {
         return 0;
      } else {
         if(var2 > 15) {
            var2 = 15;
         }

         int var6 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         return var1 == 0?Math.max(var6 / 3, 1):(var1 == 1?var6 * 2 / 3 + 1:Math.max(var6, var2 * 2));
      }
   }

   public static C_100994_tv func_110597_a(Random var0, C_100994_tv var1, int var2) {
      List var3 = func_110578_b(var0, var1, var2);
      if(var3 != null) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            C_100883_wm var5 = (C_100883_wm)var4.next();
            var1.func_111392_a(var5.field_109100_b, var5.field_109101_c);
         }
      }

      return var1;
   }

   public static List func_110578_b(Random var0, C_100994_tv var1, int var2) {
      C_100992_tt var3 = var1.func_111365_b();
      int var4 = var3.func_110768_c();
      if(var4 <= 0) {
         return null;
      } else {
         var4 /= 2;
         var4 = 1 + var0.nextInt((var4 >> 1) + 1) + var0.nextInt((var4 >> 1) + 1);
         int var5 = var4 + var2;
         float var6 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         int var7 = (int)((float)var5 * (1.0F + var6) + 0.5F);
         if(var7 < 1) {
            var7 = 1;
         }

         ArrayList var8 = null;
         Map var9 = func_110584_b(var7, var1);
         if(var9 != null && !var9.isEmpty()) {
            C_100883_wm var10 = (C_100883_wm)C_100676_kf.func_109113_a(var0, var9.values());
            if(var10 != null) {
               var8 = new ArrayList();
               var8.add(var10);

               for(int var11 = var7; var0.nextInt(50) <= var11; var11 >>= 1) {
                  Iterator var12 = var9.keySet().iterator();

                  while(var12.hasNext()) {
                     Integer var13 = (Integer)var12.next();
                     boolean var14 = true;
                     Iterator var15 = var8.iterator();

                     while(true) {
                        if(var15.hasNext()) {
                           C_100883_wm var16 = (C_100883_wm)var15.next();
                           if(var16.field_109100_b.func_110615_a(C_100904_wf.field_110622_b[var13.intValue()])) {
                              continue;
                           }

                           var14 = false;
                        }

                        if(!var14) {
                           var12.remove();
                        }
                        break;
                     }
                  }

                  if(!var9.isEmpty()) {
                     C_100883_wm var17 = (C_100883_wm)C_100676_kf.func_109113_a(var0, var9.values());
                     var8.add(var17);
                  }
               }
            }
         }

         return var8;
      }
   }

   public static Map func_110584_b(int var0, C_100994_tv var1) {
      C_100992_tt var2 = var1.func_111365_b();
      HashMap var3 = null;
      C_100904_wf[] var4 = C_100904_wf.field_110622_b;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         C_100904_wf var7 = var4[var6];
         if(var7 != null && var7.field_110642_y.func_110566_a(var2)) {
            for(int var8 = var7.func_110609_d(); var8 <= var7.func_110617_b(); ++var8) {
               if(var0 >= var7.func_110612_a(var8) && var0 <= var7.func_110608_b(var8)) {
                  if(var3 == null) {
                     var3 = new HashMap();
                  }

                  var3.put(Integer.valueOf(var7.field_110643_x), new C_100883_wm(var7, var8));
               }
            }
         }
      }

      return var3;
   }

}
