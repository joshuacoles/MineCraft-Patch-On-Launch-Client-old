import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100185_gm extends C_100009_o {

   public String func_105212_c() {
      return "deop";
   }

   public int func_105221_a() {
      return 3;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.deop.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 0) {
         C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105693_c(var2[0]);
         func_105226_a(var1, "commands.deop.success", new Object[]{var2[0]});
      } else {
         throw new C_100475_am("commands.deop.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105227_a(var2, C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105728_i()):null;
   }
}
