import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100193_gi extends C_100009_o {

   public static final Pattern field_105249_a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");


   public String func_105212_c() {
      return "ban-ip";
   }

   public int func_105221_a() {
      return 3;
   }

   public boolean func_105206_b(C_100020_s var1) {
      return C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105727_f().func_106509_b() && super.func_105206_b(var1);
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.banip.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length >= 1 && var2[0].length() > 1) {
         Matcher var3 = field_105249_a.matcher(var2[0]);
         String var4 = null;
         if(var2.length >= 2) {
            var4 = func_105222_a(var1, var2, 1);
         }

         if(var3.matches()) {
            this.func_105248_a(var1, var2[0], var4);
         } else {
            C_100762_ih var5 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105705_f(var2[0]);
            if(var5 == null) {
               throw new C_100464_ak("commands.banip.invalid", new Object[0]);
            }

            this.func_105248_a(var1, var5.func_104502_q(), var4);
         }

      } else {
         throw new C_100475_am("commands.banip.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A()):null;
   }

   protected void func_105248_a(C_100020_s var1, String var2, String var3) {
      C_100275_fe var4 = new C_100275_fe(var2);
      var4.func_107217_a(var1.func_102909_c_());
      if(var3 != null) {
         var4.func_107218_b(var3);
      }

      C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105727_f().func_106503_a(var4);
      List var5 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105709_j(var2);
      String[] var6 = new String[var5.size()];
      int var7 = 0;

      C_100762_ih var9;
      for(Iterator var8 = var5.iterator(); var8.hasNext(); var6[var7++] = var9.func_103139_an()) {
         var9 = (C_100762_ih)var8.next();
         var9.field_104518_a.func_107010_c("You have been IP banned.");
      }

      if(var5.isEmpty()) {
         func_105226_a(var1, "commands.banip.success", new Object[]{var2});
      } else {
         func_105226_a(var1, "commands.banip.success.players", new Object[]{var2, func_105218_a(var6)});
      }

   }

}
