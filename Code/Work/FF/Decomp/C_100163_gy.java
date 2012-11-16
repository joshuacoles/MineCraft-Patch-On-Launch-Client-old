import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100163_gy extends C_100009_o {

   public String func_105212_c() {
      return "save-off";
   }

   public int func_105221_a() {
      return 4;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      C_101445_MinecraftServer var3 = C_101445_MinecraftServer.func_104953_D();

      for(int var4 = 0; var4 < var3.field_104986_c.length; ++var4) {
         if(var3.field_104986_c[var4] != null) {
            C_100765_ie var5 = var3.field_104986_c[var4];
            var5.field_109621_c = true;
         }
      }

      func_105226_a(var1, "commands.save.disabled", new Object[0]);
   }
}
