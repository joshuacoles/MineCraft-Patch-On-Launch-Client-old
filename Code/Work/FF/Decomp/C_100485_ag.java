import java.util.List;
import java.util.Random;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100485_ag extends C_100009_o {

   public String func_105212_c() {
      return "weather";
   }

   public int func_105221_a() {
      return 2;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length < 1) {
         throw new C_100475_am("commands.weather.usage", new Object[0]);
      } else {
         int var3 = (300 + (new Random()).nextInt(600)) * 20;
         if(var2.length >= 2) {
            var3 = func_105216_a(var1, var2[1], 1, 1000000) * 20;
         }

         C_100765_ie var4 = C_101445_MinecraftServer.func_104953_D().field_104986_c[0];
         C_100269_agv var5 = var4.func_109429_J();
         var5.func_107153_g(var3);
         var5.func_107160_f(var3);
         if("clear".equalsIgnoreCase(var2[0])) {
            var5.func_107155_b(false);
            var5.func_107138_a(false);
            func_105226_a(var1, "commands.weather.clear", new Object[0]);
         } else if("rain".equalsIgnoreCase(var2[0])) {
            var5.func_107155_b(true);
            var5.func_107138_a(false);
            func_105226_a(var1, "commands.weather.rain", new Object[0]);
         } else if("thunder".equalsIgnoreCase(var2[0])) {
            var5.func_107155_b(true);
            var5.func_107138_a(true);
            func_105226_a(var1, "commands.weather.thunder", new Object[0]);
         }

      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, new String[]{"clear", "rain", "thunder"}):null;
   }
}
