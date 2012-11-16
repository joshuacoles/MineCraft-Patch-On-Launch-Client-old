import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100166_gx extends C_100009_o {

   public String func_105212_c() {
      return "save-all";
   }

   public int func_105221_a() {
      return 4;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      C_101445_MinecraftServer var3 = C_101445_MinecraftServer.func_104953_D();
      var1.func_102910_a(var1.func_102908_a("commands.save.start", new Object[0]));
      if(var3.func_104931_ad() != null) {
         var3.func_104931_ad().func_105735_g();
      }

      try {
         for(int var4 = 0; var4 < var3.field_104986_c.length; ++var4) {
            if(var3.field_104986_c[var4] != null) {
               C_100765_ie var5 = var3.field_104986_c[var4];
               boolean var6 = var5.field_109621_c;
               var5.field_109621_c = false;
               var5.func_109605_a(true, (C_100683_ka)null);
               var5.field_109621_c = var6;
            }
         }
      } catch (C_100829_xj var7) {
         func_105226_a(var1, "commands.save.failed", new Object[]{var7.getMessage()});
         return;
      }

      func_105226_a(var1, "commands.save.success", new Object[0]);
   }
}
