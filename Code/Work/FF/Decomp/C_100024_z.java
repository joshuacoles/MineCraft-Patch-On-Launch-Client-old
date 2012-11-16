import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100024_z extends C_100009_o {

   public String func_105212_c() {
      return "give";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.give.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length >= 2) {
         C_100762_ih var3 = func_105213_c(var1, var2[0]);
         int var4 = func_105214_a(var1, var2[1], 1);
         int var5 = 1;
         int var6 = 0;
         if(C_100992_tt.field_110834_e[var4] == null) {
            throw new C_100467_ai("commands.give.notFound", new Object[]{Integer.valueOf(var4)});
         } else {
            if(var2.length >= 3) {
               var5 = func_105216_a(var1, var2[2], 1, 64);
            }

            if(var2.length >= 4) {
               var6 = func_105228_a(var1, var2[3]);
            }

            C_100994_tv var7 = new C_100994_tv(var4, var5, var6);
            C_100576_pg var8 = var3.func_103767_c(var7);
            var8.field_103278_c = 0;
            func_105226_a(var1, "commands.give.success", new Object[]{C_100992_tt.field_110834_e[var4].func_110788_i(var7), Integer.valueOf(var4), Integer.valueOf(var5), var3.func_103139_an()});
         }
      } else {
         throw new C_100475_am("commands.give.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, this.func_105234_d()):null;
   }

   protected String[] func_105234_d() {
      return C_101445_MinecraftServer.func_104953_D().func_104890_A();
   }

   public boolean func_105209_a(int var1) {
      return var1 == 0;
   }
}
