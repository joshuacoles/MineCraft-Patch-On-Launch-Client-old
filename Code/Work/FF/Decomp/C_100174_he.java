import java.util.ArrayList;
import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100174_he extends C_100009_o {

   public String func_105212_c() {
      return "whitelist";
   }

   public int func_105221_a() {
      return 3;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.whitelist.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length >= 1) {
         if(var2[0].equals("on")) {
            C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105725_a(true);
            func_105226_a(var1, "commands.whitelist.enabled", new Object[0]);
            return;
         }

         if(var2[0].equals("off")) {
            C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105725_a(false);
            func_105226_a(var1, "commands.whitelist.disabled", new Object[0]);
            return;
         }

         if(var2[0].equals("list")) {
            var1.func_102910_a(var1.func_102908_a("commands.whitelist.list", new Object[]{Integer.valueOf(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105736_h().size()), Integer.valueOf(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105726_m().length)}));
            var1.func_102910_a(func_105218_a(C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105736_h().toArray(new String[0])));
            return;
         }

         if(var2[0].equals("add")) {
            if(var2.length < 2) {
               throw new C_100475_am("commands.whitelist.add.usage", new Object[0]);
            }

            C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105694_h(var2[1]);
            func_105226_a(var1, "commands.whitelist.add.success", new Object[]{var2[1]});
            return;
         }

         if(var2[0].equals("remove")) {
            if(var2.length < 2) {
               throw new C_100475_am("commands.whitelist.remove.usage", new Object[0]);
            }

            C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105706_i(var2[1]);
            func_105226_a(var1, "commands.whitelist.remove.success", new Object[]{var2[1]});
            return;
         }

         if(var2[0].equals("reload")) {
            C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105721_j();
            func_105226_a(var1, "commands.whitelist.reloaded", new Object[0]);
            return;
         }
      }

      throw new C_100475_am("commands.whitelist.usage", new Object[0]);
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      if(var2.length == 1) {
         return func_105225_a(var2, new String[]{"on", "off", "list", "add", "remove", "reload"});
      } else {
         if(var2.length == 2) {
            if(var2[0].equals("add")) {
               String[] var3 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105726_m();
               ArrayList var4 = new ArrayList();
               String var5 = var2[var2.length - 1];
               String[] var6 = var3;
               int var7 = var3.length;

               for(int var8 = 0; var8 < var7; ++var8) {
                  String var9 = var6[var8];
                  if(func_105215_a(var5, var9) && !C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105736_h().contains(var9)) {
                     var4.add(var9);
                  }
               }

               return var4;
            }

            if(var2[0].equals("remove")) {
               return func_105227_a(var2, C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105736_h());
            }
         }

         return null;
      }
   }
}
