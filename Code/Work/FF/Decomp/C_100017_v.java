import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100017_v extends C_100009_o {

   public String func_105212_c() {
      return "xp";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.xp.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length <= 0) {
         throw new C_100475_am("commands.xp.usage", new Object[0]);
      } else {
         String var4 = var2[0];
         boolean var5 = var4.endsWith("l") || var4.endsWith("L");
         if(var5 && var4.length() > 1) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         int var6 = func_105228_a(var1, var4);
         boolean var7 = var6 < 0;
         if(var7) {
            var6 *= -1;
         }

         C_100762_ih var3;
         if(var2.length > 1) {
            var3 = func_105213_c(var1, var2[1]);
         } else {
            var3 = func_105224_c(var1);
         }

         if(var5) {
            if(var7) {
               var3.func_103804_a(-var6);
               func_105226_a(var1, "commands.xp.success.negative.levels", new Object[]{Integer.valueOf(var6), var3.func_103139_an()});
            } else {
               var3.func_103804_a(var6);
               func_105226_a(var1, "commands.xp.success.levels", new Object[]{Integer.valueOf(var6), var3.func_103139_an()});
            }
         } else {
            if(var7) {
               throw new C_100475_am("commands.xp.failure.widthdrawXp", new Object[0]);
            }

            var3.func_103777_t(var6);
            func_105226_a(var1, "commands.xp.success", new Object[]{Integer.valueOf(var6), var3.func_103139_an()});
         }

      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 2?func_105225_a(var2, this.func_105233_d()):null;
   }

   protected String[] func_105233_d() {
      return C_101445_MinecraftServer.func_104953_D().func_104890_A();
   }

   public boolean func_105209_a(int var1) {
      return var1 == 1;
   }
}
