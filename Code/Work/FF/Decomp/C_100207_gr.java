import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100207_gr extends C_100009_o {

   public String func_105212_c() {
      return "list";
   }

   public int func_105221_a() {
      return 0;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      var1.func_102910_a(var1.func_102908_a("commands.players.list", new Object[]{Integer.valueOf(C_101445_MinecraftServer.func_104953_D().func_104960_y()), Integer.valueOf(C_101445_MinecraftServer.func_104953_D().func_104885_z())}));
      var1.func_102910_a(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105717_c());
   }
}
