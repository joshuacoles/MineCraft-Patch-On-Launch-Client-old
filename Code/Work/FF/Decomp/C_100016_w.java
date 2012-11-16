import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100016_w extends C_100009_o {

   private static final String[] field_105232_a = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};


   public String func_105212_c() {
      return "difficulty";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.difficulty.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length > 0) {
         int var3 = this.func_105231_d(var1, var2[0]);
         C_101445_MinecraftServer.func_104953_D().func_104908_c(var3);
         String var4 = C_100359_bd.func_107638_a(field_105232_a[var3]);
         func_105223_a(var1, 1, "commands.difficulty.success", new Object[]{var4});
      } else {
         throw new C_100475_am("commands.difficulty.usage", new Object[0]);
      }
   }

   protected int func_105231_d(C_100020_s var1, String var2) {
      return !var2.equalsIgnoreCase("peaceful") && !var2.equalsIgnoreCase("p")?(!var2.equalsIgnoreCase("easy") && !var2.equalsIgnoreCase("e")?(!var2.equalsIgnoreCase("normal") && !var2.equalsIgnoreCase("n")?(!var2.equalsIgnoreCase("hard") && !var2.equalsIgnoreCase("h")?func_105216_a(var1, var2, 0, 3):3):2):1):0;
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, new String[]{"peaceful", "easy", "normal", "hard"}):null;
   }

}
