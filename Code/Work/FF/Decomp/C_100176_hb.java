import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100176_hb extends C_100009_o {

   public String func_105212_c() {
      return "spawnpoint";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.spawnpoint.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      C_100762_ih var3 = var2.length == 0?func_105224_c(var1):func_105213_c(var1, var2[0]);
      if(var2.length == 4) {
         if(var3.field_103229_p != null) {
            byte var4 = 1;
            int var5 = 30000000;
            int var10 = var4 + 1;
            int var6 = func_105216_a(var1, var2[var4], -var5, var5);
            int var7 = func_105216_a(var1, var2[var10++], 0, 256);
            int var8 = func_105216_a(var1, var2[var10++], -var5, var5);
            var3.func_103831_a(new C_100013_k(var6, var7, var8), true);
            func_105226_a(var1, "commands.spawnpoint.success", new Object[]{var3.func_103139_an(), Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8)});
         }
      } else {
         if(var2.length > 1) {
            throw new C_100475_am("commands.spawnpoint.usage", new Object[0]);
         }

         C_100013_k var11 = var3.func_102911_b();
         var3.func_103831_a(var11, true);
         func_105226_a(var1, "commands.spawnpoint.success", new Object[]{var3.func_103139_an(), Integer.valueOf(var11.field_105273_a), Integer.valueOf(var11.field_105271_b), Integer.valueOf(var11.field_105272_c)});
      }

   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length != 1 && var2.length != 2?null:func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A());
   }

   public boolean func_105209_a(int var1) {
      return var1 == 0;
   }
}
