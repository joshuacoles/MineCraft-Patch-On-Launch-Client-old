import java.util.concurrent.Callable;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100152_ft implements Callable {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_106522_a;


   public C_100152_ft(C_101445_MinecraftServer var1) {
      this.field_106522_a = var1;
   }

   public String func_106521_a() {
      return C_101445_MinecraftServer.func_104945_a(this.field_106522_a).func_105714_k() + " / " + C_101445_MinecraftServer.func_104945_a(this.field_106522_a).func_105691_l() + "; " + C_101445_MinecraftServer.func_104945_a(this.field_106522_a).field_105743_b;
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_106521_a();
   }
}
