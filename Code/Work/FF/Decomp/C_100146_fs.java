import java.util.concurrent.Callable;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100146_fs implements Callable {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_106518_a;


   public C_100146_fs(C_101445_MinecraftServer var1) {
      this.field_106518_a = var1;
   }

   public String func_106517_a() {
      int var1 = this.field_106518_a.field_104986_c[0].func_109363_R().func_107883_c();
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      int var4 = this.field_106518_a.field_104986_c[0].func_109363_R().func_107880_d();
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      return var1 + " (" + var2 + " bytes; " + var3 + " MB) allocated, " + var4 + " (" + var5 + " bytes; " + var6 + " MB) used";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_106517_a();
   }
}
