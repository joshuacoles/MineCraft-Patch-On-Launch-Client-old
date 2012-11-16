import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100187_gl extends C_100009_o {

   public String func_105212_c() {
      return "clear";
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.clear.usage", new Object[0]);
   }

   public int func_105221_a() {
      return 2;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      C_100762_ih var3 = var2.length == 0?func_105224_c(var1):func_105213_c(var1, var2[0]);
      int var4 = var2.length >= 2?func_105214_a(var1, var2[1], 1):-1;
      int var5 = var2.length >= 3?func_105214_a(var1, var2[2], 0):-1;
      int var6 = var3.field_103857_bK.func_104810_b(var4, var5);
      var3.field_103855_bL.func_111506_b();
      func_105226_a(var1, "commands.clear.success", new Object[]{var3.func_103139_an(), Integer.valueOf(var6)});
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length == 1?func_105225_a(var2, this.func_105247_d()):null;
   }

   protected String[] func_105247_d() {
      return C_101445_MinecraftServer.func_104953_D().func_104890_A();
   }

   public boolean func_105209_a(int var1) {
      return var1 == 0;
   }
}
