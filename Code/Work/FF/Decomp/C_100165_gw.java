import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100165_gw extends C_100009_o {

   public String func_105212_c() {
      return "publish";
   }

   public int func_105221_a() {
      return 4;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      String var3 = C_101445_MinecraftServer.func_104953_D().func_104911_a(C_100836_xn.field_110098_b, false);
      if(var3 != null) {
         func_105226_a(var1, "commands.publish.started", new Object[]{var3});
      } else {
         func_105226_a(var1, "commands.publish.failed", new Object[0]);
      }

   }
}
