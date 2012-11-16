import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100211_gp extends C_100009_o {

   public String func_105212_c() {
      return "kick";
   }

   public int func_105221_a() {
      return 3;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.kick.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length > 0 && var2[0].length() > 1) {
         C_100762_ih var3 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105705_f(var2[0]);
         String var4 = "Kicked by an operator.";
         boolean var5 = false;
         if(var3 == null) {
            throw new C_100464_ak();
         } else {
            if(var2.length >= 2) {
               var4 = func_105222_a(var1, var2, 1);
               var5 = true;
            }

            var3.field_104518_a.func_107010_c(var4);
            if(var5) {
               func_105226_a(var1, "commands.kick.success.reason", new Object[]{var3.func_103139_an(), var4});
            } else {
               func_105226_a(var1, "commands.kick.success", new Object[]{var3.func_103139_an()});
            }

         }
      } else {
         throw new C_100475_am("commands.kick.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length >= 1?func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A()):null;
   }
}
