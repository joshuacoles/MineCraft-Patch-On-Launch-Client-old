import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100019_t {

   private static final Pattern field_105300_a = Pattern.compile("^@([parf])(?:\\[([\\w=,-]*)\\])?$");
   private static final Pattern field_105298_b = Pattern.compile("\\G(-?\\w*)(?:$|,)");
   private static final Pattern field_105299_c = Pattern.compile("\\G(\\w{1,2})=(-?\\w+)(?:$|,)");


   public static C_100762_ih func_105297_a(C_100020_s var0, String var1) {
      C_100762_ih[] var2 = func_105296_c(var0, var1);
      return var2 != null && var2.length == 1?var2[0]:null;
   }

   public static String func_105292_b(C_100020_s var0, String var1) {
      C_100762_ih[] var2 = func_105296_c(var0, var1);
      if(var2 != null && var2.length != 0) {
         String[] var3 = new String[var2.length];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = var2[var4].func_103139_an();
         }

         return C_100009_o.func_105218_a(var3);
      } else {
         return null;
      }
   }

   public static C_100762_ih[] func_105296_c(C_100020_s var0, String var1) {
      Matcher var2 = field_105300_a.matcher(var1);
      if(var2.matches()) {
         Map var3 = func_105291_h(var2.group(2));
         String var4 = var2.group(1);
         int var5 = func_105295_c(var4);
         int var6 = func_105290_d(var4);
         int var7 = func_105286_f(var4);
         int var8 = func_105287_e(var4);
         int var9 = func_105293_g(var4);
         int var10 = C_100836_xn.field_110100_a.func_110090_a();
         C_100013_k var11 = var0.func_102911_b();
         if(var3.containsKey("rm")) {
            var5 = C_100650_jv.func_108926_a((String)var3.get("rm"), var5);
         }

         if(var3.containsKey("r")) {
            var6 = C_100650_jv.func_108926_a((String)var3.get("r"), var6);
         }

         if(var3.containsKey("lm")) {
            var7 = C_100650_jv.func_108926_a((String)var3.get("lm"), var7);
         }

         if(var3.containsKey("l")) {
            var8 = C_100650_jv.func_108926_a((String)var3.get("l"), var8);
         }

         if(var3.containsKey("x")) {
            var11.field_105273_a = C_100650_jv.func_108926_a((String)var3.get("x"), var11.field_105273_a);
         }

         if(var3.containsKey("y")) {
            var11.field_105271_b = C_100650_jv.func_108926_a((String)var3.get("y"), var11.field_105271_b);
         }

         if(var3.containsKey("z")) {
            var11.field_105272_c = C_100650_jv.func_108926_a((String)var3.get("z"), var11.field_105272_c);
         }

         if(var3.containsKey("m")) {
            var10 = C_100650_jv.func_108926_a((String)var3.get("m"), var10);
         }

         if(var3.containsKey("c")) {
            var9 = C_100650_jv.func_108926_a((String)var3.get("c"), var9);
         }

         List var12;
         if(!var4.equals("p") && !var4.equals("a")) {
            if(!var4.equals("r")) {
               return null;
            } else {
               var12 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105732_a(var11, var5, var6, 0, var10, var7, var8);
               Collections.shuffle(var12);
               var12 = var12.subList(0, Math.min(var9, var12.size()));
               return var12 != null && !var12.isEmpty()?(C_100762_ih[])var12.toArray(new C_100762_ih[0]):new C_100762_ih[0];
            }
         } else {
            var12 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105732_a(var11, var5, var6, var9, var10, var7, var8);
            return var12 != null && !var12.isEmpty()?(C_100762_ih[])var12.toArray(new C_100762_ih[0]):new C_100762_ih[0];
         }
      } else {
         return null;
      }
   }

   public static boolean func_105288_a(String var0) {
      Matcher var1 = field_105300_a.matcher(var0);
      if(var1.matches()) {
         Map var2 = func_105291_h(var1.group(2));
         String var3 = var1.group(1);
         int var4 = func_105293_g(var3);
         if(var2.containsKey("c")) {
            var4 = C_100650_jv.func_108926_a((String)var2.get("c"), var4);
         }

         return var4 != 1;
      } else {
         return false;
      }
   }

   public static boolean func_105294_a(String var0, String var1) {
      Matcher var2 = field_105300_a.matcher(var0);
      if(!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(1);
         return var1 == null || var1.equals(var3);
      }
   }

   public static boolean func_105289_b(String var0) {
      return func_105294_a(var0, (String)null);
   }

   private static final int func_105295_c(String var0) {
      return 0;
   }

   private static final int func_105290_d(String var0) {
      return 0;
   }

   private static final int func_105287_e(String var0) {
      return Integer.MAX_VALUE;
   }

   private static final int func_105286_f(String var0) {
      return 0;
   }

   private static final int func_105293_g(String var0) {
      return var0.equals("a")?0:1;
   }

   private static Map func_105291_h(String var0) {
      HashMap var1 = new HashMap();
      if(var0 == null) {
         return var1;
      } else {
         Matcher var2 = field_105298_b.matcher(var0);
         int var3 = 0;

         int var4;
         for(var4 = -1; var2.find(); var4 = var2.end()) {
            String var5 = null;
            switch(var3++) {
            case 0:
               var5 = "x";
               break;
            case 1:
               var5 = "y";
               break;
            case 2:
               var5 = "z";
               break;
            case 3:
               var5 = "r";
            }

            if(var5 != null && var2.group(1).length() > 0) {
               var1.put(var5, var2.group(1));
            }
         }

         if(var4 < var0.length()) {
            var2 = field_105299_c.matcher(var4 == -1?var0:var0.substring(var4));

            while(var2.find()) {
               var1.put(var2.group(1), var2.group(2));
            }
         }

         return var1;
      }
   }

}
