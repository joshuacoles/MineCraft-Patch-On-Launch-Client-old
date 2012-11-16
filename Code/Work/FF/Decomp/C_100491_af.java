import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100491_af extends C_100009_o {

   public String func_105212_c() {
      return "toggledownfall";
   }

   public int func_105221_a() {
      return 2;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      this.func_105254_d();
      func_105226_a(var1, "commands.downfall.success", new Object[0]);
   }

   protected void func_105254_d() {
      C_101445_MinecraftServer.func_104953_D().field_104986_c[0].func_109471_x();
      C_101445_MinecraftServer.func_104953_D().field_104986_c[0].func_109429_J().func_107138_a(true);
   }
}
