import java.util.concurrent.Callable;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100157_fq implements Callable {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_106524_a;


   public C_100157_fq(C_101445_MinecraftServer var1) {
      this.field_106524_a = var1;
   }

   public String func_106523_a() {
      String var1 = this.field_106524_a.func_104954_getServerModName();
      return !var1.equals("vanilla")?"Definitely; \'" + var1 + "\'":"Unknown (can\'t tell)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_106523_a();
   }
}
