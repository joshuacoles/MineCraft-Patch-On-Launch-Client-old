import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100026_x extends C_100009_o {

   public String func_105212_c() {
      return "gamemode";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.gamemode.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length > 0) {
         C_100836_xn var3 = this.func_105237_d(var1, var2[0]);
         C_100762_ih var4 = var2.length >= 2?func_105213_c(var1, var2[1]):func_105224_c(var1);
         var4.func_103796_a(var3);
         String var5 = C_100359_bd.func_107638_a("gameMode." + var3.func_110091_b());
         if(var4 != var1) {
            func_105223_a(var1, 1, "commands.gamemode.success.other", new Object[]{var4.func_103139_an(), var5});
         } else {
            func_105223_a(var1, 1, "commands.gamemode.success.self", new Object[]{var5});
         }

      } else {
         throw new C_100475_am("commands.gamemode.usage", new Object[0]);
      }
   }

   protected C_100836_xn func_105237_d(C_100020_s var1, String var2) {
      return !var2.equalsIgnoreCase(C_100836_xn.field_110098_b.func_110091_b()) && !var2.equalsIgnoreCase("s")?(!var2.equalsIgnoreCase(C_100836_xn.field_110099_c.func_110091_b()) && !var2.equalsIgnoreCase("c")?(!var2.equalsIgnoreCase(C_100836_xn.field_110096_d.func_110091_b()) && !var2.equalsIgnoreCase("a")?C_100840_xm.func_110113_a(func_105216_a(var1, var2, 0, C_100836_xn.func_110088_values().length - 2)):C_100836_xn.field_110096_d):C_100836_xn.field_110099_c):C_100836_xn.field_110098_b;
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, new String[]{"survival", "creative", "adventure"}):(var2.length == 2?func_105225_a(var2, this.func_105236_d()):null);
   }

   protected String[] func_105236_d() {
      return C_101445_MinecraftServer.func_104953_D().func_104890_A();
   }

   public boolean func_105209_a(int var1) {
      return var1 == 1;
   }
}
