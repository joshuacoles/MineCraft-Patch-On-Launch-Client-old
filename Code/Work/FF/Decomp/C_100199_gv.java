import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100199_gv extends C_100009_o {

   public String func_105212_c() {
      return "pardon";
   }

   public int func_105221_a() {
      return 3;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.unban.usage", new Object[0]);
   }

   public boolean func_105206_b(C_100020_s var1) {
      return C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106509_b() && super.func_105206_b(var1);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 0) {
         C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106508_b(var2[0]);
         func_105226_a(var1, "commands.unban.success", new Object[]{var2[0]});
      } else {
         throw new C_100475_am("commands.unban.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105227_a(var2, C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106511_c().keySet()):null;
   }
}
