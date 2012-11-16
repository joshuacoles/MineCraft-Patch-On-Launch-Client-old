import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class C_100947_vb {

   public static final String field_111125_a = null;
   public static final String field_111123_b;
   public static final String field_111124_c = "+0-1-2-3&4-4+13";
   public static final String field_111121_d;
   public static final String field_111122_e;
   public static final String field_111119_f;
   public static final String field_111120_g;
   public static final String field_111132_h;
   public static final String field_111133_i;
   public static final String field_111130_j;
   public static final String field_111131_k;
   public static final String field_111128_l;
   private static final HashMap field_111129_m = new HashMap();
   private static final HashMap field_111126_n = new HashMap();
   private static final HashMap field_111127_o;
   private static final String[] field_111134_p;


   public static boolean func_111115_a(int var0, int var1) {
      return (var0 & 1 << var1) != 0;
   }

   private static int func_111111_c(int var0, int var1) {
      return func_111115_a(var0, var1)?1:0;
   }

   private static int func_111117_d(int var0, int var1) {
      return func_111115_a(var0, var1)?0:1;
   }

   public static int func_111110_a(int var0) {
      return func_111109_a(var0, 5, 4, 3, 2, 1);
   }

   public static int func_111112_a(Collection var0) {
      int var1 = 3694022;
      if(var0 != null && !var0.isEmpty()) {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = 0.0F;
         float var5 = 0.0F;
         Iterator var6 = var0.iterator();

         while(var6.hasNext()) {
            C_100692_kx var7 = (C_100692_kx)var6.next();
            int var8 = C_100690_kw.field_109169_a[var7.func_109197_a()].func_109142_j();

            for(int var9 = 0; var9 <= var7.func_109192_c(); ++var9) {
               var2 += (float)(var8 >> 16 & 255) / 255.0F;
               var3 += (float)(var8 >> 8 & 255) / 255.0F;
               var4 += (float)(var8 >> 0 & 255) / 255.0F;
               ++var5;
            }
         }

         var2 = var2 / var5 * 255.0F;
         var3 = var3 / var5 * 255.0F;
         var4 = var4 / var5 * 255.0F;
         return (int)var2 << 16 | (int)var3 << 8 | (int)var4;
      } else {
         return var1;
      }
   }

   public static boolean func_111104_b(Collection var0) {
      Iterator var1 = var0.iterator();

      C_100692_kx var2;
      do {
         if(!var1.hasNext()) {
            return true;
         }

         var2 = (C_100692_kx)var1.next();
      } while(var2.func_109196_e());

      return false;
   }

   public static int func_111116_a(int var0, boolean var1) {
      if(!var1) {
         if(field_111127_o.containsKey(Integer.valueOf(var0))) {
            return ((Integer)field_111127_o.get(Integer.valueOf(var0))).intValue();
         } else {
            int var2 = func_111112_a(func_111118_b(var0, false));
            field_111127_o.put(Integer.valueOf(var0), Integer.valueOf(var2));
            return var2;
         }
      } else {
         return func_111112_a(func_111118_b(var0, var1));
      }
   }

   public static String func_111106_c(int var0) {
      int var1 = func_111110_a(var0);
      return field_111134_p[var1];
   }

   private static int func_111105_a(boolean var0, boolean var1, boolean var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var0) {
         var7 = func_111117_d(var6, var4);
      } else if(var3 != -1) {
         if(var3 == 0 && func_111108_h(var6) == var4) {
            var7 = 1;
         } else if(var3 == 1 && func_111108_h(var6) > var4) {
            var7 = 1;
         } else if(var3 == 2 && func_111108_h(var6) < var4) {
            var7 = 1;
         }
      } else {
         var7 = func_111111_c(var6, var4);
      }

      if(var1) {
         var7 *= var5;
      }

      if(var2) {
         var7 *= -1;
      }

      return var7;
   }

   private static int func_111108_h(int var0) {
      int var1;
      for(var1 = 0; var0 > 0; ++var1) {
         var0 &= var0 - 1;
      }

      return var1;
   }

   private static int func_111113_a(String var0, int var1, int var2, int var3) {
      if(var1 < var0.length() && var2 >= 0 && var1 < var2) {
         int var4 = var0.indexOf(124, var1);
         int var5;
         int var17;
         if(var4 >= 0 && var4 < var2) {
            var5 = func_111113_a(var0, var1, var4 - 1, var3);
            if(var5 > 0) {
               return var5;
            } else {
               var17 = func_111113_a(var0, var4 + 1, var2, var3);
               return var17 > 0?var17:0;
            }
         } else {
            var5 = var0.indexOf(38, var1);
            if(var5 >= 0 && var5 < var2) {
               var17 = func_111113_a(var0, var1, var5 - 1, var3);
               if(var17 <= 0) {
                  return 0;
               } else {
                  int var18 = func_111113_a(var0, var5 + 1, var2, var3);
                  return var18 <= 0?0:(var17 > var18?var17:var18);
               }
            } else {
               boolean var6 = false;
               boolean var7 = false;
               boolean var8 = false;
               boolean var9 = false;
               boolean var10 = false;
               byte var11 = -1;
               int var12 = 0;
               int var13 = 0;
               int var14 = 0;

               for(int var15 = var1; var15 < var2; ++var15) {
                  char var16 = var0.charAt(var15);
                  if(var16 >= 48 && var16 <= 57) {
                     if(var6) {
                        var13 = var16 - 48;
                        var7 = true;
                     } else {
                        var12 *= 10;
                        var12 += var16 - 48;
                        var8 = true;
                     }
                  } else if(var16 == 42) {
                     var6 = true;
                  } else if(var16 == 33) {
                     if(var8) {
                        var14 += func_111105_a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }

                     var9 = true;
                  } else if(var16 == 45) {
                     if(var8) {
                        var14 += func_111105_a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }

                     var10 = true;
                  } else if(var16 != 61 && var16 != 60 && var16 != 62) {
                     if(var16 == 43 && var8) {
                        var14 += func_111105_a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }
                  } else {
                     if(var8) {
                        var14 += func_111105_a(var9, var7, var10, var11, var12, var13, var3);
                        var9 = false;
                        var10 = false;
                        var6 = false;
                        var7 = false;
                        var8 = false;
                        var13 = 0;
                        var12 = 0;
                        var11 = -1;
                     }

                     if(var16 == 61) {
                        var11 = 0;
                     } else if(var16 == 60) {
                        var11 = 2;
                     } else if(var16 == 62) {
                        var11 = 1;
                     }
                  }
               }

               if(var8) {
                  var14 += func_111105_a(var9, var7, var10, var11, var12, var13, var3);
               }

               return var14;
            }
         }
      } else {
         return 0;
      }
   }

   public static List func_111118_b(int var0, boolean var1) {
      ArrayList var2 = null;
      C_100690_kw[] var3 = C_100690_kw.field_109169_a;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         C_100690_kw var6 = var3[var5];
         if(var6 != null && (!var6.func_109137_i() || var1)) {
            String var7 = (String)field_111129_m.get(Integer.valueOf(var6.func_109138_c()));
            if(var7 != null) {
               int var8 = func_111113_a(var7, 0, var7.length(), var0);
               if(var8 > 0) {
                  int var9 = 0;
                  String var10 = (String)field_111126_n.get(Integer.valueOf(var6.func_109138_c()));
                  if(var10 != null) {
                     var9 = func_111113_a(var10, 0, var10.length(), var0);
                     if(var9 < 0) {
                        var9 = 0;
                     }
                  }

                  if(var6.func_109148_b()) {
                     var8 = 1;
                  } else {
                     var8 = 1200 * (var8 * 3 + (var8 - 1) * 2);
                     var8 >>= var9;
                     var8 = (int)Math.round((double)var8 * var6.func_109133_g());
                     if((var0 & 16384) != 0) {
                        var8 = (int)Math.round((double)var8 * 0.75D + 0.5D);
                     }
                  }

                  if(var2 == null) {
                     var2 = new ArrayList();
                  }

                  C_100692_kx var11 = new C_100692_kx(var6.func_109138_c(), var8, var9);
                  if((var0 & 16384) != 0) {
                     var11.func_109198_a(true);
                  }

                  var2.add(var11);
               }
            }
         }
      }

      return var2;
   }

   private static int func_111107_a(int var0, int var1, boolean var2, boolean var3, boolean var4) {
      if(var4) {
         if(!func_111115_a(var0, var1)) {
            return 0;
         }
      } else if(var2) {
         var0 &= ~(1 << var1);
      } else if(var3) {
         if((var0 & 1 << var1) == 0) {
            var0 |= 1 << var1;
         } else {
            var0 &= ~(1 << var1);
         }
      } else {
         var0 |= 1 << var1;
      }

      return var0;
   }

   public static int func_111114_a(int var0, String var1) {
      byte var2 = 0;
      int var3 = var1.length();
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;

      for(int var9 = var2; var9 < var3; ++var9) {
         char var10 = var1.charAt(var9);
         if(var10 >= 48 && var10 <= 57) {
            var8 *= 10;
            var8 += var10 - 48;
            var4 = true;
         } else if(var10 == 33) {
            if(var4) {
               var0 = func_111107_a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }

            var5 = true;
         } else if(var10 == 45) {
            if(var4) {
               var0 = func_111107_a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }

            var6 = true;
         } else if(var10 == 43) {
            if(var4) {
               var0 = func_111107_a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }
         } else if(var10 == 38) {
            if(var4) {
               var0 = func_111107_a(var0, var8, var6, var5, var7);
               var7 = false;
               var5 = false;
               var6 = false;
               var4 = false;
               var8 = 0;
            }

            var7 = true;
         }
      }

      if(var4) {
         var0 = func_111107_a(var0, var8, var6, var5, var7);
      }

      return var0 & 32767;
   }

   public static int func_111109_a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (func_111115_a(var0, var1)?16:0) | (func_111115_a(var0, var2)?8:0) | (func_111115_a(var0, var3)?4:0) | (func_111115_a(var0, var4)?2:0) | (func_111115_a(var0, var5)?1:0);
   }

   static {
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109172_l.func_109138_c()), "0 & !1 & !2 & !3 & 0+6");
      field_111123_b = "-0+1-2-3&4-4+13";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109168_c.func_109138_c()), "!0 & 1 & !2 & !3 & 1+6");
      field_111132_h = "+0+1-2-3&4-4+13";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109170_n.func_109138_c()), "0 & 1 & !2 & !3 & 0+6");
      field_111119_f = "+0-1+2-3&4-4+13";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109176_h.func_109138_c()), "0 & !1 & 2 & !3");
      field_111121_d = "-0-1+2-3&4-4+13";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109180_u.func_109138_c()), "!0 & !1 & 2 & !3 & 2+6");
      field_111122_e = "-0+3-4+13";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109181_t.func_109138_c()), "!0 & !1 & !2 & 3 & 3+6");
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109177_i.func_109138_c()), "!0 & !1 & 2 & 3");
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109165_d.func_109138_c()), "!0 & 1 & !2 & 3 & 3+6");
      field_111120_g = "+0-1-2+3&4-4+13";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109164_g.func_109138_c()), "0 & !1 & !2 & 3 & 3+6");
      field_111128_l = "-0+1+2-3+13&4-4";
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109183_r.func_109138_c()), "!0 & 1 & 2 & !3 & 2+6");
      field_111129_m.put(Integer.valueOf(C_100690_kw.field_109185_p.func_109138_c()), "!0 & 1 & 2 & 3 & 2+6");
      field_111130_j = "+5-6-7";
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109168_c.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109166_e.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109164_g.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109172_l.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109177_i.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109176_h.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109173_m.func_109138_c()), "5");
      field_111126_n.put(Integer.valueOf(C_100690_kw.field_109180_u.func_109138_c()), "5");
      field_111133_i = "-5+6-7";
      field_111131_k = "+14&13-13";
      field_111127_o = new HashMap();
      field_111134_p = new String[]{"potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky"};
   }
}
