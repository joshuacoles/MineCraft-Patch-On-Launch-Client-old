import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100209_gq extends C_100009_o {

   public String func_105212_c() {
      return "banlist";
   }

   public int func_105221_a() {
      return 3;
   }

   public boolean func_105206_b(C_100020_s var1) {
      return (C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105727_f().func_106509_b() || C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106509_b()) && super.func_105206_b(var1);
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.banlist.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length >= 1 && var2[0].equalsIgnoreCase("ips")) {
         var1.func_102910_a(var1.func_102908_a("commands.banlist.ips", new Object[]{Integer.valueOf(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105727_f().func_106511_c().size())}));
         var1.func_102910_a(func_105218_a(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105727_f().func_106511_c().keySet().toArray()));
      } else {
         var1.func_102910_a(var1.func_102908_a("commands.banlist.players", new Object[]{Integer.valueOf(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106511_c().size())}));
         var1.func_102910_a(func_105218_a(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106511_c().keySet().toArray()));
      }

   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, new String[]{"players", "ips"}):null;
   }
}
