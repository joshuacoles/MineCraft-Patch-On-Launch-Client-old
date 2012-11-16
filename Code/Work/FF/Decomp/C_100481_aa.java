import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100481_aa extends C_100009_o {

   public String func_105212_c() {
      return "help";
   }

   public int func_105221_a() {
      return 0;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.help.usage", new Object[0]);
   }

   public List func_105207_b() {
      return Arrays.asList(new String[]{"?"});
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      List var3 = this.func_105250_d(var1);
      byte var4 = 7;
      int var5 = var3.size() / var4;
      boolean var6 = false;

      C_100022_q var9;
      int var11;
      try {
         var11 = var2.length == 0?0:func_105216_a(var1, var2[0], 1, var5 + 1) - 1;
      } catch (C_100467_ai var10) {
         Map var8 = this.func_105251_d();
         var9 = (C_100022_q)var8.get(var2[0]);
         if(var9 != null) {
            throw new C_100475_am(var9.func_105211_a(var1), new Object[0]);
         }

         throw new C_100465_al();
      }

      int var7 = Math.min((var11 + 1) * var4, var3.size());
      var1.func_102910_a("§2" + var1.func_102908_a("commands.help.header", new Object[]{Integer.valueOf(var11 + 1), Integer.valueOf(var5 + 1)}));

      for(int var12 = var11 * var4; var12 < var7; ++var12) {
         var9 = (C_100022_q)var3.get(var12);
         var1.func_102910_a(var9.func_105211_a(var1));
      }

      if(var11 == 0 && var1 instanceof C_101095_qg) {
         var1.func_102910_a("§a" + var1.func_102908_a("commands.help.footer", new Object[0]));
      }

   }

   protected List func_105250_d(C_100020_s var1) {
      List var2 = C_101445_MinecraftServer.func_104953_D().func_104888_E().func_105200_a(var1);
      Collections.sort(var2);
      return var2;
   }

   protected Map func_105251_d() {
      return C_101445_MinecraftServer.func_104953_D().func_104888_E().func_105198_a();
   }
}
