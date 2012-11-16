import java.util.concurrent.Callable;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100148_fr implements Callable {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_106520_a;


   public C_100148_fr(C_101445_MinecraftServer var1) {
      this.field_106520_a = var1;
   }

   public String func_106519_a() {
      return this.field_106520_a.field_104985_b.field_108908_a?this.field_106520_a.field_104985_b.func_108903_c():"N/A (disabled)";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_106519_a();
   }
}
