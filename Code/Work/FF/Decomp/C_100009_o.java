import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public abstract class C_100009_o implements C_100022_q {

   private static C_100008_n field_105230_a = null;


   public int func_105221_a() {
      return 4;
   }

   public String func_105211_a(C_100020_s var1) {
      return "/" + this.func_105212_c();
   }

   public List func_105207_b() {
      return null;
   }

   public boolean func_105206_b(C_100020_s var1) {
      return var1.func_102912_a(this.func_105221_a(), this.func_105212_c());
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return null;
   }

   public static int func_105228_a(C_100020_s var0, String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         throw new C_100467_ai("commands.generic.num.invalid", new Object[]{var1});
      }
   }

   public static int func_105214_a(C_100020_s var0, String var1, int var2) {
      return func_105216_a(var0, var1, var2, Integer.MAX_VALUE);
   }

   public static int func_105216_a(C_100020_s var0, String var1, int var2, int var3) {
      int var4 = func_105228_a(var0, var1);
      if(var4 < var2) {
         throw new C_100467_ai("commands.generic.num.tooSmall", new Object[]{Integer.valueOf(var4), Integer.valueOf(var2)});
      } else if(var4 > var3) {
         throw new C_100467_ai("commands.generic.num.tooBig", new Object[]{Integer.valueOf(var4), Integer.valueOf(var3)});
      } else {
         return var4;
      }
   }

   public static double func_105229_b(C_100020_s var0, String var1) {
      try {
         return Double.parseDouble(var1);
      } catch (NumberFormatException var3) {
         throw new C_100467_ai("commands.generic.double.invalid", new Object[]{var1});
      }
   }

   public static C_100762_ih func_105224_c(C_100020_s var0) {
      if(var0 instanceof C_100762_ih) {
         return (C_100762_ih)var0;
      } else {
         throw new C_100464_ak("You must specify which player you wish to perform this action on.", new Object[0]);
      }
   }

   public static C_100762_ih func_105213_c(C_100020_s var0, String var1) {
      C_100762_ih var2 = C_100019_t.func_105297_a(var0, var1);
      if(var2 != null) {
         return var2;
      } else {
         var2 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105705_f(var1);
         if(var2 == null) {
            throw new C_100464_ak();
         } else {
            return var2;
         }
      }
   }

   public static String func_105222_a(C_100020_s var0, String[] var1, int var2) {
      return func_105217_a(var0, var1, var2, false);
   }

   public static String func_105217_a(C_100020_s var0, String[] var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = var2; var5 < var1.length; ++var5) {
         if(var5 > var2) {
            var4.append(" ");
         }

         String var6 = var1[var5];
         if(var3) {
            String var7 = C_100019_t.func_105292_b(var0, var6);
            if(var7 != null) {
               var6 = var7;
            } else if(C_100019_t.func_105289_b(var6)) {
               throw new C_100464_ak();
            }
         }

         var4.append(var6);
      }

      return var4.toString();
   }

   public static String func_105218_a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2].toString();
         if(var2 > 0) {
            if(var2 == var0.length - 1) {
               var1.append(" and ");
            } else {
               var1.append(", ");
            }
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static boolean func_105215_a(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   public static List func_105225_a(String[] var0, String ... var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = new ArrayList();
      String[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if(func_105215_a(var2, var7)) {
            var3.add(var7);
         }
      }

      return var3;
   }

   public static List func_105227_a(String[] var0, Iterable var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if(func_105215_a(var2, var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public boolean func_105209_a(int var1) {
      return false;
   }

   public static void func_105226_a(C_100020_s var0, String var1, Object ... var2) {
      func_105223_a(var0, 0, var1, var2);
   }

   public static void func_105223_a(C_100020_s var0, int var1, String var2, Object ... var3) {
      if(field_105230_a != null) {
         field_105230_a.func_105196_a(var0, var1, var2, var3);
      }

   }

   public static void func_105220_a(C_100008_n var0) {
      field_105230_a = var0;
   }

   public int func_105219_a(C_100022_q var1) {
      return this.func_105212_c().compareTo(var1.func_105212_c());
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.func_105219_a((C_100022_q)var1);
   }

}
