import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100191_gj extends C_100009_o {

   public String func_105212_c() {
      return "ban";
   }

   public int func_105221_a() {
      return 3;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.ban.usage", new Object[0]);
   }

   public boolean func_105206_b(C_100020_s var1) {
      return C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106509_b() && super.func_105206_b(var1);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length >= 1 && var2[0].length() > 0) {
         C_100762_ih var3 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105705_f(var2[0]);
         C_100275_fe var4 = new C_100275_fe(var2[0]);
         var4.func_107217_a(var1.func_102909_c_());
         if(var2.length >= 2) {
            var4.func_107218_b(func_105222_a(var1, var2, 1));
         }

         C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105719_e().func_106503_a(var4);
         if(var3 != null) {
            var3.field_104518_a.func_107010_c("You are banned from this server.");
         }

         func_105226_a(var1, "commands.ban.success", new Object[]{var2[0]});
      } else {
         throw new C_100475_am("commands.ban.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length >= 1?func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A()):null;
   }
}
