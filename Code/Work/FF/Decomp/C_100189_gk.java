import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100189_gk extends C_100009_o {

   public String func_105212_c() {
      return "say";
   }

   public int func_105221_a() {
      return 1;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.say.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length > 0 && var2[0].length() > 0) {
         String var3 = func_105217_a(var1, var2, 0, true);
         C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105733_a(new C_100392_cm(String.format("[%s] %s", new Object[]{var1.func_102909_c_(), var3})));
      } else {
         throw new C_100475_am("commands.say.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length >= 1?func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A()):null;
   }
}
