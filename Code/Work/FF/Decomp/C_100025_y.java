import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100025_y extends C_100009_o {

   public String func_105212_c() {
      return "gamerule";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.gamerule.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      String var6;
      if(var2.length == 2) {
         var6 = var2[0];
         String var7 = var2[1];
         C_100864_xb var8 = this.func_105235_d();
         if(var8.func_110279_e(var6)) {
            var8.func_110278_b(var6, var7);
            func_105226_a(var1, "commands.gamerule.success", new Object[0]);
         } else {
            func_105226_a(var1, "commands.gamerule.norule", new Object[]{var6});
         }

      } else if(var2.length == 1) {
         var6 = var2[0];
         C_100864_xb var4 = this.func_105235_d();
         if(var4.func_110279_e(var6)) {
            String var5 = var4.func_110283_a(var6);
            var1.func_102910_a(var6 + " = " + var5);
         } else {
            func_105226_a(var1, "commands.gamerule.norule", new Object[]{var6});
         }

      } else if(var2.length == 0) {
         C_100864_xb var3 = this.func_105235_d();
         var1.func_102910_a(func_105218_a(var3.func_110277_b()));
      } else {
         throw new C_100475_am("commands.gamerule.usage", new Object[0]);
      }
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, this.func_105235_d().func_110277_b()):(var2.length == 2?func_105225_a(var2, new String[]{"true", "false"}):null);
   }

   private C_100864_xb func_105235_d() {
      return C_101445_MinecraftServer.func_104953_D().func_104879_a(0).func_109389_K();
   }
}
