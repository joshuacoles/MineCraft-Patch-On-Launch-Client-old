import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class C_100841_xr {

   private static HashMap field_110138_b = new HashMap();
   protected static final Class[] field_110139_a = new Class[]{C_101101_py.class, C_101097_qa.class, C_101106_pw.class};


   protected static C_100851_xw func_110133_a(C_100873_xe var0, int var1, int var2) {
      C_101272_za var3 = var0.func_109440_e(var1, var2);
      int var4 = var1 * 16 + var0.field_109577_u.nextInt(16);
      int var5 = var2 * 16 + var0.field_109577_u.nextInt(16);
      int var6 = var0.field_109577_u.nextInt(var3 == null?var0.func_109475_O():var3.func_112324_h() + 16 - 1);
      return new C_100851_xw(var4, var6, var5);
   }

   public static final int func_110137_a(C_100765_ie var0, boolean var1, boolean var2, boolean var3) {
      if(!var1 && !var2) {
         return 0;
      } else {
         field_110138_b.clear();

         int var4;
         int var7;
         for(var4 = 0; var4 < var0.field_109573_h.size(); ++var4) {
            C_101095_qg var5 = (C_101095_qg)var0.field_109573_h.get(var4);
            int var6 = C_100650_jv.func_108910_c(var5.field_103221_t / 16.0D);
            var7 = C_100650_jv.func_108910_c(var5.field_103217_v / 16.0D);
            byte var8 = 8;

            for(int var9 = -var8; var9 <= var8; ++var9) {
               for(int var10 = -var8; var10 <= var8; ++var10) {
                  boolean var11 = var9 == -var8 || var9 == var8 || var10 == -var8 || var10 == var8;
                  C_100858_wx var12 = new C_100858_wx(var9 + var6, var10 + var7);
                  if(!var11) {
                     field_110138_b.put(var12, Boolean.valueOf(false));
                  } else if(!field_110138_b.containsKey(var12)) {
                     field_110138_b.put(var12, Boolean.valueOf(true));
                  }
               }
            }
         }

         var4 = 0;
         C_100013_k var32 = var0.func_109381_G();
         C_100594_lo[] var33 = C_100594_lo.func_108770_values();
         var7 = var33.length;

         for(int var34 = 0; var34 < var7; ++var34) {
            C_100594_lo var35 = var33[var34];
            if((!var35.func_108769_d() || var2) && (var35.func_108769_d() || var1) && (!var35.func_108766_e() || var3) && var0.func_109474_a(var35.func_108768_a()) <= var35.func_108771_b() * field_110138_b.size() / 256) {
               Iterator var37 = field_110138_b.keySet().iterator();

               label110:
               while(var37.hasNext()) {
                  C_100858_wx var36 = (C_100858_wx)var37.next();
                  if(!((Boolean)field_110138_b.get(var36)).booleanValue()) {
                     C_100851_xw var38 = func_110133_a(var0, var36.field_110239_a, var36.field_110238_b);
                     int var13 = var38.field_110207_a;
                     int var14 = var38.field_110205_b;
                     int var15 = var38.field_110206_c;
                     if(!var0.func_109360_s(var13, var14, var15) && var0.func_109350_f(var13, var14, var15) == var35.func_108767_c()) {
                        int var16 = 0;
                        int var17 = 0;

                        while(var17 < 3) {
                           int var18 = var13;
                           int var19 = var14;
                           int var20 = var15;
                           byte var21 = 6;
                           C_101316_ya var22 = null;
                           int var23 = 0;

                           while(true) {
                              if(var23 < 4) {
                                 label103: {
                                    var18 += var0.field_109577_u.nextInt(var21) - var0.field_109577_u.nextInt(var21);
                                    var19 += var0.field_109577_u.nextInt(1) - var0.field_109577_u.nextInt(1);
                                    var20 += var0.field_109577_u.nextInt(var21) - var0.field_109577_u.nextInt(var21);
                                    if(func_110136_a(var35, var0, var18, var19, var20)) {
                                       float var24 = (float)var18 + 0.5F;
                                       float var25 = (float)var19;
                                       float var26 = (float)var20 + 0.5F;
                                       if(var0.func_109504_a((double)var24, (double)var25, (double)var26, 24.0D) == null) {
                                          float var27 = var24 - (float)var32.field_105273_a;
                                          float var28 = var25 - (float)var32.field_105271_b;
                                          float var29 = var26 - (float)var32.field_105272_c;
                                          float var30 = var27 * var27 + var28 * var28 + var29 * var29;
                                          if(var30 >= 576.0F) {
                                             if(var22 == null) {
                                                var22 = var0.func_109604_a(var35, var18, var19, var20);
                                                if(var22 == null) {
                                                   break label103;
                                                }
                                             }

                                             C_100595_ln var39;
                                             try {
                                                var39 = (C_100595_ln)var22.field_109103_b.getConstructor(new Class[]{C_100873_xe.class}).newInstance(new Object[]{var0});
                                             } catch (Exception var31) {
                                                var31.printStackTrace();
                                                return var4;
                                             }

                                             var39.func_103055_b((double)var24, (double)var25, (double)var26, var0.field_109577_u.nextFloat() * 360.0F, 0.0F);
                                             if(var39.func_103380_bp()) {
                                                ++var16;
                                                var0.func_109513_d(var39);
                                                func_110135_a(var39, var0, var24, var25, var26);
                                                if(var16 >= var39.func_103316_bs()) {
                                                   continue label110;
                                                }
                                             }

                                             var4 += var16;
                                          }
                                       }
                                    }

                                    ++var23;
                                    continue;
                                 }
                              }

                              ++var17;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var4;
      }
   }

   public static boolean func_110136_a(C_100594_lo var0, C_100873_xe var1, int var2, int var3, int var4) {
      if(var0.func_108767_c() == C_100664_afg.field_109019_h) {
         return var1.func_109350_f(var2, var3, var4).func_108986_d() && !var1.func_109360_s(var2, var3 + 1, var4);
      } else if(!var1.func_109348_t(var2, var3 - 1, var4)) {
         return false;
      } else {
         int var5 = var1.func_109349_a(var2, var3 - 1, var4);
         return var5 != C_100451_alf.field_106077_C.field_106162_cm && !var1.func_109360_s(var2, var3, var4) && !var1.func_109350_f(var2, var3, var4).func_108986_d() && !var1.func_109360_s(var2, var3 + 1, var4);
      }
   }

   private static void func_110135_a(C_100595_ln var0, C_100873_xe var1, float var2, float var3, float var4) {
      var0.func_103337_bD();
   }

   public static void func_110134_a(C_100873_xe var0, C_101324_xz var1, int var2, int var3, int var4, int var5, Random var6) {
      List var7 = var1.func_112460_a(C_100594_lo.field_108776_b);
      if(!var7.isEmpty()) {
         while(var6.nextFloat() < var1.func_112464_f()) {
            C_101316_ya var8 = (C_101316_ya)C_100676_kf.func_109113_a(var0.field_109577_u, var7);
            int var9 = var8.field_109104_c + var6.nextInt(1 + var8.field_109102_d - var8.field_109104_c);
            int var10 = var2 + var6.nextInt(var4);
            int var11 = var3 + var6.nextInt(var5);
            int var12 = var10;
            int var13 = var11;

            for(int var14 = 0; var14 < var9; ++var14) {
               boolean var15 = false;

               for(int var16 = 0; !var15 && var16 < 4; ++var16) {
                  int var17 = var0.func_109459_i(var10, var11);
                  if(func_110136_a(C_100594_lo.field_108776_b, var0, var10, var17, var11)) {
                     float var18 = (float)var10 + 0.5F;
                     float var19 = (float)var17;
                     float var20 = (float)var11 + 0.5F;

                     C_100595_ln var21;
                     try {
                        var21 = (C_100595_ln)var8.field_109103_b.getConstructor(new Class[]{C_100873_xe.class}).newInstance(new Object[]{var0});
                     } catch (Exception var23) {
                        var23.printStackTrace();
                        continue;
                     }

                     var21.func_103055_b((double)var18, (double)var19, (double)var20, var6.nextFloat() * 360.0F, 0.0F);
                     var0.func_109513_d(var21);
                     func_110135_a(var21, var0, var18, var19, var20);
                     var15 = true;
                  }

                  var10 += var6.nextInt(5) - var6.nextInt(5);

                  for(var11 += var6.nextInt(5) - var6.nextInt(5); var10 < var2 || var10 >= var2 + var4 || var11 < var3 || var11 >= var3 + var4; var11 = var13 + var6.nextInt(5) - var6.nextInt(5)) {
                     var10 = var12 + var6.nextInt(5) - var6.nextInt(5);
                  }
               }
            }
         }

      }
   }

}
