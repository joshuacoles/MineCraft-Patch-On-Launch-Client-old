import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100018_u extends C_100026_x {

   public String func_105212_c() {
      return "defaultgamemode";
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.defaultgamemode.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length > 0) {
         C_100836_xn var3 = this.func_105237_d(var1, var2[0]);
         this.func_105238_a(var3);
         String var4 = C_100359_bd.func_107638_a("gameMode." + var3.func_110091_b());
         func_105226_a(var1, "commands.defaultgamemode.success", new Object[]{var4});
      } else {
         throw new C_100475_am("commands.defaultgamemode.usage", new Object[0]);
      }
   }

   protected void func_105238_a(C_100836_xn var1) {
      C_101445_MinecraftServer.func_104953_D().func_104902_a(var1);
   }
}
