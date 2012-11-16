import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100489_ae extends C_100009_o {

   public String func_105212_c() {
      return "time";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.time.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length > 1) {
         int var3;
         if(var2[0].equals("set")) {
            if(var2[1].equals("day")) {
               var3 = 0;
            } else if(var2[1].equals("night")) {
               var3 = 12500;
            } else {
               var3 = func_105214_a(var1, var2[1], 0);
            }

            this.func_105252_a(var1, var3);
            func_105226_a(var1, "commands.time.set", new Object[]{Integer.valueOf(var3)});
            return;
         }

         if(var2[0].equals("add")) {
            var3 = func_105214_a(var1, var2[1], 0);
            this.func_105253_b(var1, var3);
            func_105226_a(var1, "commands.time.added", new Object[]{Integer.valueOf(var3)});
            return;
         }
      }

      throw new C_100475_am("commands.time.usage", new Object[0]);
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, new String[]{"set", "add"}):(var2.length == 2 && var2[0].equals("set")?func_105225_a(var2, new String[]{"day", "night"}):null);
   }

   protected void func_105252_a(C_100020_s var1, int var2) {
      for(int var3 = 0; var3 < C_101445_MinecraftServer.func_104953_D().field_104986_c.length; ++var3) {
         C_101445_MinecraftServer.func_104953_D().field_104986_c[var3].func_109436_b((long)var2);
      }

   }

   protected void func_105253_b(C_100020_s var1, int var2) {
      for(int var3 = 0; var3 < C_101445_MinecraftServer.func_104953_D().field_104986_c.length; ++var3) {
         C_100765_ie var4 = C_101445_MinecraftServer.func_104953_D().field_104986_c[var3];
         var4.func_109436_b(var4.func_109433_F() + (long)var2);
      }

   }
}
