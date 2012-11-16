import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class C_100023_p implements C_100021_r {

   private final Map field_105205_a = new HashMap();
   private final Set field_105204_b = new HashSet();


   public void func_105197_a(C_100020_s var1, String var2) {
      if(var2.startsWith("/")) {
         var2 = var2.substring(1);
      }

      String[] var3 = var2.split(" ");
      String var4 = var3[0];
      var3 = func_105202_a(var3);
      C_100022_q var5 = (C_100022_q)this.field_105205_a.get(var4);
      int var6 = this.func_105203_a(var5, var3);

      try {
         if(var5 == null) {
            throw new C_100465_al();
         }

         if(var5.func_105206_b(var1)) {
            if(var6 > -1) {
               C_100762_ih[] var7 = C_100019_t.func_105296_c(var1, var3[var6]);
               String var8 = var3[var6];
               C_100762_ih[] var9 = var7;
               int var10 = var7.length;

               for(int var11 = 0; var11 < var10; ++var11) {
                  C_100762_ih var12 = var9[var11];
                  var3[var6] = var12.func_103139_an();

                  try {
                     var5.func_105210_b(var1, var3);
                  } catch (C_100464_ak var14) {
                     var1.func_102910_a("§c" + var1.func_102908_a(var14.getMessage(), var14.func_107963_a()));
                  }
               }

               var3[var6] = var8;
            } else {
               var5.func_105210_b(var1, var3);
            }
         } else {
            var1.func_102910_a("§cYou do not have permission to use this command.");
         }
      } catch (C_100475_am var15) {
         var1.func_102910_a("§c" + var1.func_102908_a("commands.generic.usage", new Object[]{var1.func_102908_a(var15.getMessage(), var15.func_107963_a())}));
      } catch (C_100487_ah var16) {
         var1.func_102910_a("§c" + var1.func_102908_a(var16.getMessage(), var16.func_107963_a()));
      } catch (Throwable var17) {
         var1.func_102910_a("§c" + var1.func_102908_a("commands.generic.exception", new Object[0]));
         var17.printStackTrace();
      }

   }

   public C_100022_q func_105201_a(C_100022_q var1) {
      List var2 = var1.func_105207_b();
      this.field_105205_a.put(var1.func_105212_c(), var1);
      this.field_105204_b.add(var1);
      if(var2 != null) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            C_100022_q var5 = (C_100022_q)this.field_105205_a.get(var4);
            if(var5 == null || !var5.func_105212_c().equals(var4)) {
               this.field_105205_a.put(var4, var1);
            }
         }
      }

      return var1;
   }

   private static String[] func_105202_a(String[] var0) {
      String[] var1 = new String[var0.length - 1];

      for(int var2 = 1; var2 < var0.length; ++var2) {
         var1[var2 - 1] = var0[var2];
      }

      return var1;
   }

   public List func_105199_b(C_100020_s var1, String var2) {
      String[] var3 = var2.split(" ", -1);
      String var4 = var3[0];
      if(var3.length == 1) {
         ArrayList var8 = new ArrayList();
         Iterator var6 = this.field_105205_a.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            if(C_100009_o.func_105215_a(var4, (String)var7.getKey()) && ((C_100022_q)var7.getValue()).func_105206_b(var1)) {
               var8.add(var7.getKey());
            }
         }

         return var8;
      } else {
         if(var3.length > 1) {
            C_100022_q var5 = (C_100022_q)this.field_105205_a.get(var4);
            if(var5 != null) {
               return var5.func_105208_a(var1, func_105202_a(var3));
            }
         }

         return null;
      }
   }

   public List func_105200_a(C_100020_s var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.field_105204_b.iterator();

      while(var3.hasNext()) {
         C_100022_q var4 = (C_100022_q)var3.next();
         if(var4.func_105206_b(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public Map func_105198_a() {
      return this.field_105205_a;
   }

   private int func_105203_a(C_100022_q var1, String[] var2) {
      if(var1 == null) {
         return -1;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if(var1.func_105209_a(var3) && C_100019_t.func_105288_a(var2[var3])) {
               return var3;
            }
         }

         return -1;
      }
   }
}
