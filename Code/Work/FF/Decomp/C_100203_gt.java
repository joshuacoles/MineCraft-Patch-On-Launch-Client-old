import java.util.ArrayList;
import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100203_gt extends C_100009_o {

   public String func_105212_c() {
      return "op";
   }

   public int func_105221_a() {
      return 3;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.op.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 0) {
         C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105710_b(var2[0]);
         func_105226_a(var1, "commands.op.success", new Object[]{var2[0]});
      } else {
         throw new C_100475_am("commands.op.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      if(var2.length == 1) {
         String var3 = var2[var2.length - 1];
         ArrayList var4 = new ArrayList();
         String[] var5 = C_101445_MinecraftServer.func_104953_D().func_104890_A();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            if(!C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105690_e(var8) && func_105215_a(var3, var8)) {
               var4.add(var8);
            }
         }

         return var4;
      } else {
         return null;
      }
   }
}
