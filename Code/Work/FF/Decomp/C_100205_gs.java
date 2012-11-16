import java.util.Arrays;
import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100205_gs extends C_100009_o {

   public List func_105207_b() {
      return Arrays.asList(new String[]{"w", "msg"});
   }

   public String func_105212_c() {
      return "tell";
   }

   public int func_105221_a() {
      return 0;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length < 2) {
         throw new C_100475_am("commands.message.usage", new Object[0]);
      } else {
         C_100762_ih var3 = func_105213_c(var1, var2[0]);
         if(var3 == null) {
            throw new C_100464_ak();
         } else if(var3 == var1) {
            throw new C_100464_ak("commands.message.sameTarget", new Object[0]);
         } else {
            String var4 = func_105217_a(var1, var2, 1, !(var1 instanceof C_101095_qg));
            var3.func_102910_a("§7§o" + var3.func_102908_a("commands.message.display.incoming", new Object[]{var1.func_102909_c_(), var4}));
            var1.func_102910_a("§7§o" + var1.func_102908_a("commands.message.display.outgoing", new Object[]{var3.func_102909_c_(), var4}));
         }
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A());
   }

   public boolean func_105209_a(int var1) {
      return var1 == 0;
   }
}
