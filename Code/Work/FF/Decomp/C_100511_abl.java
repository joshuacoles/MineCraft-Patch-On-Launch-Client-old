import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class C_100511_abl {

   private final List field_108264_a = new ArrayList();
   private final Map field_108262_b = new HashMap();
   private int field_108263_c = 0;


   public int func_108258_a() {
      return this.field_108263_c;
   }

   public void func_108257_a(int var1) {
      this.field_108263_c = var1;
   }

   public Map func_108253_b() {
      return this.field_108262_b;
   }

   public List func_108259_c() {
      return this.field_108264_a;
   }

   public void func_108254_d() {
      int var1 = 0;

      C_100513_abm var3;
      for(Iterator var2 = this.field_108264_a.iterator(); var2.hasNext(); var1 += var3.func_108271_a()) {
         var3 = (C_100513_abm)var2.next();
         var3.func_108274_d(var1);
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(2);
      var1.append(";");

      int var2;
      for(var2 = 0; var2 < this.field_108264_a.size(); ++var2) {
         if(var2 > 0) {
            var1.append(",");
         }

         var1.append(((C_100513_abm)this.field_108264_a.get(var2)).toString());
      }

      var1.append(";");
      var1.append(this.field_108263_c);
      if(!this.field_108262_b.isEmpty()) {
         var1.append(";");
         var2 = 0;
         Iterator var3 = this.field_108262_b.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            if(var2++ > 0) {
               var1.append(",");
            }

            var1.append(((String)var4.getKey()).toLowerCase());
            Map var5 = (Map)var4.getValue();
            if(!var5.isEmpty()) {
               var1.append("(");
               int var6 = 0;
               Iterator var7 = var5.entrySet().iterator();

               while(var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  if(var6++ > 0) {
                     var1.append(" ");
                  }

                  var1.append((String)var8.getKey());
                  var1.append("=");
                  var1.append((String)var8.getValue());
               }

               var1.append(")");
            }
         }
      }

      return var1.toString();
   }

   private static C_100513_abm func_108256_a(String var0, int var1) {
      String[] var2 = var0.split("x", 2);
      int var3 = 1;
      int var5 = 0;
      if(var2.length == 2) {
         try {
            var3 = Integer.parseInt(var2[0]);
            if(var1 + var3 >= 256) {
               var3 = 256 - var1;
            }

            if(var3 < 0) {
               var3 = 0;
            }
         } catch (Throwable var7) {
            return null;
         }
      }

      int var4;
      try {
         String var6 = var2[var2.length - 1];
         var2 = var6.split(":", 2);
         var4 = Integer.parseInt(var2[0]);
         if(var2.length > 1) {
            var5 = Integer.parseInt(var2[1]);
         }

         if(C_100451_alf.field_106118_p[var4] == null) {
            var4 = 0;
            var5 = 0;
         }

         if(var5 < 0 || var5 > 15) {
            var5 = 0;
         }
      } catch (Throwable var8) {
         return null;
      }

      C_100513_abm var9 = new C_100513_abm(var3, var4, var5);
      var9.func_108274_d(var1);
      return var9;
   }

   private static List func_108260_b(String var0) {
      if(var0 != null && var0.length() >= 1) {
         ArrayList var1 = new ArrayList();
         String[] var2 = var0.split(",");
         int var3 = 0;
         String[] var4 = var2;
         int var5 = var2.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            C_100513_abm var8 = func_108256_a(var7, var3);
            if(var8 == null) {
               return null;
            }

            var1.add(var8);
            var3 += var8.func_108271_a();
         }

         return var1;
      } else {
         return null;
      }
   }

   public static C_100511_abl func_108261_a(String var0) {
      if(var0 == null) {
         return func_108255_e();
      } else {
         String[] var1 = var0.split(";", -1);
         int var2 = var1.length == 1?0:C_100650_jv.func_108926_a(var1[0], 0);
         if(var2 >= 0 && var2 <= 2) {
            C_100511_abl var3 = new C_100511_abl();
            int var4 = var1.length == 1?0:1;
            List var5 = func_108260_b(var1[var4++]);
            if(var5 != null && !var5.isEmpty()) {
               var3.func_108259_c().addAll(var5);
               var3.func_108254_d();
               int var6 = C_101324_xz.field_112494_c.field_112478_N;
               if(var2 > 0 && var1.length > var4) {
                  var6 = C_100650_jv.func_108926_a(var1[var4++], var6);
               }

               var3.func_108257_a(var6);
               if(var2 > 0 && var1.length > var4) {
                  String[] var7 = var1[var4++].toLowerCase().split(",");
                  String[] var8 = var7;
                  int var9 = var7.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     String var11 = var8[var10];
                     String[] var12 = var11.split("\\(", 2);
                     HashMap var13 = new HashMap();
                     if(var12[0].length() > 0) {
                        var3.func_108253_b().put(var12[0], var13);
                        if(var12.length > 1 && var12[1].endsWith(")") && var12[1].length() > 1) {
                           String[] var14 = var12[1].substring(0, var12[1].length() - 1).split(" ");

                           for(int var15 = 0; var15 < var14.length; ++var15) {
                              String[] var16 = var14[var15].split("=", 2);
                              if(var16.length == 2) {
                                 var13.put(var16[0], var16[1]);
                              }
                           }
                        }
                     }
                  }
               } else {
                  var3.func_108253_b().put("village", new HashMap());
               }

               return var3;
            } else {
               return func_108255_e();
            }
         } else {
            return func_108255_e();
         }
      }
   }

   public static C_100511_abl func_108255_e() {
      C_100511_abl var0 = new C_100511_abl();
      var0.func_108257_a(C_101324_xz.field_112494_c.field_112478_N);
      var0.func_108259_c().add(new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm));
      var0.func_108259_c().add(new C_100513_abm(2, C_100451_alf.field_106120_y.field_106162_cm));
      var0.func_108259_c().add(new C_100513_abm(1, C_100451_alf.field_106121_x.field_106162_cm));
      var0.func_108254_d();
      var0.func_108253_b().put("village", new HashMap());
      return var0;
   }
}
